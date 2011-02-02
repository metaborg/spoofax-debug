/*
 * @(#)EventThread.java	1.6 05/11/17
 *
 * Copyright 2006 Sun Microsystems, Inc. All rights reserved.
 * SUN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
/*
 * Copyright (c) 1997-2001 by Sun Microsystems, Inc. All Rights Reserved.
 * 
 * Sun grants you ("Licensee") a non-exclusive, royalty free, license to use,
 * modify and redistribute this software in source and binary code form,
 * provided that i) this copyright notice and license appear on all copies of
 * the software; and ii) Licensee does not utilize the software in a manner
 * which is disparaging to Sun.
 * 
 * This software is provided "AS IS," without a warranty of any kind. ALL
 * EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND WARRANTIES, INCLUDING ANY
 * IMPLIED WARRANTY OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE OR
 * NON-INFRINGEMENT, ARE HEREBY EXCLUDED. SUN AND ITS LICENSORS SHALL NOT BE
 * LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF USING, MODIFYING
 * OR DISTRIBUTING THE SOFTWARE OR ITS DERIVATIVES. IN NO EVENT WILL SUN OR ITS
 * LICENSORS BE LIABLE FOR ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT,
 * INDIRECT, SPECIAL, CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER
 * CAUSED AND REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF
 * OR INABILITY TO USE SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 * 
 * This software is not designed or intended for use in on-line control of
 * aircraft, air traffic, aircraft navigation or aircraft communications; or in
 * the design, construction, operation or maintenance of any nuclear
 * facility. Licensee represents and warrants that it will not use or
 * redistribute the Software for such purposes.
 */

package org.strategoxt.debug.core.control;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.strategoxt.debug.core.control.events.EventHandler;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.DebugEventRequestInstaller;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_r_enter_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_r_exit_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_s_enter_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_s_exit_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_s_step_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_s_var_0_5;

import com.sun.jdi.ClassType;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.VMDisconnectedException;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.ClassPrepareEvent;
import com.sun.jdi.event.Event;
import com.sun.jdi.event.EventIterator;
import com.sun.jdi.event.EventQueue;
import com.sun.jdi.event.EventSet;
import com.sun.jdi.event.ExceptionEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.ModificationWatchpointEvent;
import com.sun.jdi.event.StepEvent;
import com.sun.jdi.event.ThreadDeathEvent;
import com.sun.jdi.event.VMDeathEvent;
import com.sun.jdi.event.VMDisconnectEvent;
import com.sun.jdi.event.VMStartEvent;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;

/**
 * This class processes incoming JDI events and displays them
 * 
 * @version @(#) EventThread.java 1.6 05/11/17 13:07:51
 * @author Robert Field
 */
public class EventThread extends Thread {


	
	private final VirtualMachine vm; // Running VM
	private final String[] excludes; // Packages to exclude

	private boolean connected = false; // Connected to VM
	private boolean vmDied = false; // VMDeath occurred

	// Maps ThreadReference to ThreadTrace instances
	private Map<ThreadReference, ThreadEventHandler> traceMap = new HashMap<ThreadReference, ThreadEventHandler>();

	// keeps track of all event specifications (e.g. breakpoints)
	private EventSpecManager eventSpecManager = null;
	
	// changes to the vm are reported to the monitor (e.g. a thread was suspended because a breakpoint was hit)
	private VMMonitor vmMonitor = null;
	
	// returns the current state of the running stratego program
	// e.g. current linenumber
	private StrategoState strategoState = null;
	
	EventThread(VirtualMachine vm, String[] excludes, EventSpecManager eventSpecManager, VMMonitor vmMonitor) {
		super("event-handler");
		if (vm != null)
		{
			// we are connected to a vm
			this.connected = true;
		}
		this.vm = vm;
		this.excludes = excludes;
		this.eventSpecManager = eventSpecManager;
		this.vmMonitor = vmMonitor;
		this.strategoState = new StrategoState();
	}

	/**
	 * Run the event handling thread. As long as we are connected, get event
	 * sets off the queue and dispatch the events within them.
	 */
	public void run() {
		EventQueue queue = vm.eventQueue();
		while (connected) {
			try {
				EventSet eventSet = queue.remove();
				boolean suspendThread = false;
				
				EventIterator it = eventSet.eventIterator();
				while (it.hasNext()) {
					suspendThread = handleEvent(it.nextEvent());
				}
				if (!suspendThread)
				{
					eventSet.resume();
				} else if (eventSet.suspendPolicy() == EventRequest.SUSPEND_ALL) {
					if (vmMonitor != null)
					{
						vmMonitor.stateChanged(this.getStrategoState());
					}
					// no more active threads
					log("All threads suspended");
					log("");
					// all threads are suspended
                    //setCurrentThread(eventSet);
                    //notifier.vmInterrupted();
                }
				else
				{
					if (vmMonitor != null)
					{
						vmMonitor.stateChanged(this.getStrategoState());
					}
					// not all threads are suspended
					log("Not all threads are suspended");
					List<ThreadReference> refs = vm.allThreads();
					for(ThreadReference r : refs)
					{
						log(r.name() + " " + r.status() + " " + r.isSuspended());
					}
				}
			} catch (InterruptedException exc) {
				// Ignore
			} catch (VMDisconnectedException discExc) {
				handleDisconnectedException();
				break;
			}
		}
	}

	protected StrategoState getStrategoState() {
		return this.strategoState;
	}

	/**
	 * Create the desired event requests, and enable them so that we will get
	 * events.
	 * 
	 * @param watchFields
	 *            Do we want to watch assignments to fields
	 */
	void setEventRequests(boolean watchFields) {
		DebugEventRequestInstaller.installDebugEventRequests(this.vm, watchFields, this.excludes);
	}



	/**
	 * Returns the ThreadEventHandler instance for the specified thread, creating one
	 * if needed.
	 */
	private ThreadEventHandler getThreadEventHandler(ThreadReference thread) {
		ThreadEventHandler handler = (ThreadEventHandler) traceMap.get(thread);
		if (handler == null) {
			handler = new ThreadEventHandler(thread, this.strategoState); // share the state across threads because we only have one Stratego Program Thread
			traceMap.put(thread, handler);
		}
		return handler;
	}
	
	/**
	 * Stratego programs runs single threaded so there should only be one ThreadEventHandler.
	 * @return
	 */
	protected ThreadEventHandler getMainThreadHandler()
	{
		if (this.traceMap.keySet().size() > 1)
		{
			// TODO: more than one stratego thread
			return null;
		}
		else
		{
			ThreadReference mainRef = this.traceMap.keySet().iterator().next(); // get the first ThreadReference
			return this.getThreadEventHandler(mainRef);
		}
	}

	/**
	 * Dispatch incoming events
	 * 
	 * Returns true if the thread should stay suspended (we hit a breakpoint!)
	 * Returns false if the thread should resume
	 */
	private boolean handleEvent(Event event) {
		//System.out.println("Event " + event);
		if (event instanceof ExceptionEvent) {
			return exceptionEvent((ExceptionEvent) event);
		} else if (event instanceof ModificationWatchpointEvent) {
			return fieldWatchEvent((ModificationWatchpointEvent) event);
		} else if (event instanceof MethodEntryEvent) {
			return methodEntryEvent((MethodEntryEvent) event);
		} else if (event instanceof MethodExitEvent) {
			return methodExitEvent((MethodExitEvent) event);
		} else if (event instanceof StepEvent) {
			return stepEvent((StepEvent) event);
		} else if (event instanceof ThreadDeathEvent) {
			return threadDeathEvent((ThreadDeathEvent) event);
		} else if (event instanceof ClassPrepareEvent) {
			return classPrepareEvent((ClassPrepareEvent) event);
		} else if (event instanceof VMStartEvent) {
			return vmStartEvent((VMStartEvent) event);
		} else if (event instanceof VMDeathEvent) {
			return vmDeathEvent((VMDeathEvent) event);
		} else if (event instanceof VMDisconnectEvent) {
			return vmDisconnectEvent((VMDisconnectEvent) event);
		} else if (event instanceof BreakpointEvent) {
			// TODO: instead of the MethodEntry/Exit events which are _VERY_ time consuming!!
			return breakpointEvent((BreakpointEvent) event);
		} else {
			throw new Error("Unexpected event type");
		}
		
		//System.out.println("handleEvent - EXIT");
	}

	/***
	 * A VMDisconnectedException has happened while dealing with another event.
	 * We need to flush the event queue, dealing only with exit events (VMDeath,
	 * VMDisconnect) so that we terminate correctly.
	 */
	synchronized void handleDisconnectedException() {
		EventQueue queue = vm.eventQueue();
		while (connected) {
			try {
				EventSet eventSet = queue.remove();
				EventIterator iter = eventSet.eventIterator();
				while (iter.hasNext()) {
					Event event = iter.nextEvent();
					if (event instanceof VMDeathEvent) {
						vmDeathEvent((VMDeathEvent) event);
					} else if (event instanceof VMDisconnectEvent) {
						vmDisconnectEvent((VMDisconnectEvent) event);
					}
				}
				eventSet.resume(); // Resume the VM
			} catch (InterruptedException exc) {
				// ignore
			}
		}
	}

	private boolean vmStartEvent(VMStartEvent event) {
		log("-------------------------------- VM started");
		sendVMMonitorEvent("VMSTARTED");
		return false; // resume thread
	}

	// Forward event for thread specific processing
	private boolean methodEntryEvent(MethodEntryEvent event) {
		boolean suspendThread = getThreadEventHandler(event.thread()).methodEntryEvent(event, eventSpecManager);
		return suspendThread; // resume thread
	}

	// Forward event for thread specific processing
	private boolean methodExitEvent(MethodExitEvent event) {
		getThreadEventHandler(event.thread()).methodExitEvent(event);
		return false; // resume thread
	}

	// Forward event for thread specific processing
	private boolean stepEvent(StepEvent event) {
		getThreadEventHandler(event.thread()).stepEvent(event);
		return false; // resume thread
	}

	// Forward event for thread specific processing
	private boolean fieldWatchEvent(ModificationWatchpointEvent event) {
		getThreadEventHandler(event.thread()).fieldWatchEvent(event);
		return false; // resume thread
	}

	private boolean threadDeathEvent(ThreadDeathEvent event) {
		ThreadEventHandler trace = (ThreadEventHandler) traceMap.get(event.thread());
		if (trace != null) { // only want threads we care about
			trace.threadDeathEvent(event); // Forward event
		}
		return false; // resume thread
	}

	/**
	 * A new class has been loaded. Set watchpoints on each of its fields
	 */
	private boolean classPrepareEvent(ClassPrepareEvent event) {
		EventRequestManager mgr = vm.eventRequestManager();

		String name = event.referenceType().name();
		//System.out.println(name);
		// if the name matches on of the predefined strategies implemented in java (e.g.: s-enter, s-step) we should add a breakpoint
		if (java_s_enter_0_4.getFullClassName().equals(name))
		{
            if (event.referenceType() instanceof ClassType) {
            	ClassType clazz = (ClassType) event.referenceType();
            	int l = java_s_enter_0_4.breakpointLinenumber;
            	DebugEventRequestInstaller.createBreakpointEntryRequest(mgr, clazz, l, EventHandler.S_ENTER);
            }
		} else if (java_s_exit_0_4.getFullClassName().equals(name))
		{
            if (event.referenceType() instanceof ClassType) {
            	ClassType clazz = (ClassType) event.referenceType();
            	int l = java_s_exit_0_4.breakpointLinenumber;
            	DebugEventRequestInstaller.createBreakpointEntryRequest(mgr, clazz, l, EventHandler.S_EXIT);
            }
		} else if (java_s_step_0_4.getFullClassName().equals(name))
		{
            if (event.referenceType() instanceof ClassType) {
            	ClassType clazz = (ClassType) event.referenceType();
            	int l = java_s_step_0_4.breakpointLinenumber;
            	DebugEventRequestInstaller.createBreakpointEntryRequest(mgr, clazz, l, EventHandler.S_STEP);
            }
		} else if (java_s_var_0_5.getFullClassName().equals(name))
		{
			if (event.referenceType() instanceof ClassType) {
				ClassType clazz = (ClassType) event.referenceType();
            	int l = java_s_var_0_5.breakpointLinenumber;
            	DebugEventRequestInstaller.createBreakpointEntryRequest(mgr, clazz, l, EventHandler.S_VAR);
			}
		}  else if (java_r_enter_0_4.getFullClassName().equals(name))
		{
			if (event.referenceType() instanceof ClassType) {
				ClassType clazz = (ClassType) event.referenceType();
            	int l = java_r_enter_0_4.breakpointLinenumber;
            	DebugEventRequestInstaller.createBreakpointEntryRequest(mgr, clazz, l, EventHandler.R_ENTER);
			}
		} else if (java_r_exit_0_4.getFullClassName().equals(name))
		{
			if (event.referenceType() instanceof ClassType) {
				ClassType clazz = (ClassType) event.referenceType();
            	int l = java_r_exit_0_4.breakpointLinenumber;
            	DebugEventRequestInstaller.createBreakpointEntryRequest(mgr, clazz, l, EventHandler.R_EXIT);
			}
		}
		
		// TODO: if watchFields is true
		/*
		List<Field> fields = event.referenceType().visibleFields();
		for (Iterator<Field> it = fields.iterator(); it.hasNext();) {
			Field field = (Field) it.next();
			ModificationWatchpointRequest req = mgr
					.createModificationWatchpointRequest(field);
			for (int i = 0; i < excludes.length; ++i) {
				req.addClassExclusionFilter(excludes[i]);
			}
			req.setSuspendPolicy(EventRequest.SUSPEND_NONE);
			req.enable();
		}*/
		return false; // resume thread
	}

	private boolean exceptionEvent(ExceptionEvent event) {
		//System.out.println("EXCEPTION: " + event.exception().toString());
		ThreadEventHandler trace = (ThreadEventHandler) traceMap.get(event.thread());
		if (trace != null) { // only want threads we care about
			trace.exceptionEvent(event); // Forward event
		}
		return false; // resume thread
	}

	public boolean vmDeathEvent(VMDeathEvent event) {
		vmDied = true;
		sendVMMonitorEvent("VMDEATH");
		return false; // resume thread
	}

	public boolean vmDisconnectEvent(VMDisconnectEvent event) {
		connected = false;
		if (!vmDied) {
			// The application has been disconnected
			sendVMMonitorEvent("VMDISCONNECT");
		}
		return false; // resume thread
	}
	
	public boolean breakpointEvent(BreakpointEvent event)
	{
		boolean suspendThread = getThreadEventHandler(event.thread()).breakpointEvent(event, eventSpecManager);
		return suspendThread;
	}
	
	public boolean getVMDied()
	{
		return this.vmDied;
	}
	
	public boolean getConnected()
	{
		return this.connected;
	}
	
	private void sendVMMonitorEvent(String event)
	{
		if (vmMonitor != null)
		{
			vmMonitor.vmEvent(event);
		}
	}
	
	private void log(String message)
	{
		System.out.println(message);
	}

}
