package org.strategoxt.debug.core.control;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.strategoxt.debug.core.control.events.EventHandler;
import org.strategoxt.debug.core.control.events.RuleEnterHandler;
import org.strategoxt.debug.core.control.events.RuleExitHandler;
import org.strategoxt.debug.core.control.events.StrategyEnterHandler;
import org.strategoxt.debug.core.control.events.StrategyExitHandler;
import org.strategoxt.debug.core.control.events.StrategyStepHandler;
import org.strategoxt.debug.core.control.events.StrategyVarHandler;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;

import com.sun.jdi.Field;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.Value;
import com.sun.jdi.event.ExceptionEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.ModificationWatchpointEvent;
import com.sun.jdi.event.StepEvent;
import com.sun.jdi.event.ThreadDeathEvent;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.StepRequest;

public class ThreadEventHandler {
	/**
	 * This class keeps context on events in one thread.
	 */

	final ThreadReference thread;
	final String baseIndent = "";
	StringBuffer indent;
	
	private PrintWriter writer;

	// share stratego state across threads
	private StrategoState strategoState = null;
	
	public ThreadEventHandler(ThreadReference thread, StrategoState strategoState) {
		this.thread = thread;
		this.strategoState = strategoState;
		indent = new StringBuffer(baseIndent);
		initWriter();
		
		println("====== " + thread.name() + " ======");
		
	}
	
	private void initWriter()
	{
		String filename = "thread-"+thread.name()+".txt";
		try {
			writer = new PrintWriter(new File(filename));
			writer.println("Start thread");
			writer.flush();
			System.out.println("Created: " + filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	private void println(String str) {
		writer.print(indent);
		writer.println(str);
		writer.flush();
	}

	/*
	private void enterStrategoStackFrame(EventHandler h) {
		StrategoStackFrame frame = new StrategoStackFrame(h.getFilename(), h.getName(), h.getLocationInfo(), h.getGiven());
		this.strategoState.pushFrame(frame);
	}
	*/

	private void exitStrategoStackFrame(EventHandler h) {
		if (h != null)
		{
			StrategoStackFrame frame = new StrategoStackFrame(h.getFilename(), h.getName(), h.getLocationInfo(), h.getGiven());
			this.strategoState.popFrame(frame);
		}
		else
		{
			this.strategoState.popFrame();
		}
	}


	/**
	 * Returns true if the thread should stay suspended.
	 * Returns false if the thread may resume.
	 * @param event
	 * @return
	 */
	protected boolean methodEntryEvent(MethodEntryEvent event, EventSpecManager eventSpecManager) {
		boolean suspendThread = false;
		String eventType = (String) event.request().getProperty("event-type");
		//System.out.println(eventType);
		
		String methodName = event.method().name();
		String declaringType = event.method().declaringType().name();

		
		if ("<clinit>".equals(methodName) || "<init>".equals(methodName))
		{
			// ignore these...
			return suspendThread;
		}
		
		//System.out.println(methodName + "  --------------------  " + declaringType);
		println(methodName + "  --  " + declaringType);

		
		EventHandler h = null;
		if (EventHandler.R_ENTER.equals(eventType))
		{
			h = new RuleEnterHandler(event);
		}
		else if (EventHandler.R_EXIT.equals(eventType))
		{
			h = new RuleExitHandler(event);
		}
		else if (EventHandler.S_ENTER.equals(eventType))
		{
			h = new StrategyEnterHandler(event);
		}
		else if (EventHandler.S_EXIT.equals(eventType))
		{
			h = new StrategyExitHandler(event);
		}
		else if (EventHandler.S_STEP.equals(eventType))
		{
			h = new StrategyStepHandler(event);
		}
		else if (EventHandler.S_VAR.equals(eventType))
		{
			h = new StrategyVarHandler(event);
		}
		
		if (h != null)
		{
			if (h.isEnter())
			{
				// current event is an enter event, push a new StackFrame on the stack
				//this.enterStrategoStackFrame(h);				
			}
			try {
				h.processDebugEvent(this.strategoState);
				suspendThread = h.shouldSuspend(eventSpecManager);
				
				LocationInfo locationInfo = h.getLocationInfo();
				//this.strategoState.setLocationInfo(locationInfo); // LocationInfo should be set on the current Frame
				this.strategoState.currentFrame().setCurrentLocationInfo(locationInfo);
			} catch(Exception e)
			{
				System.err.println("Event handle threw an Exception: " + e.getMessage());
				e.printStackTrace();
			}
			
			if (!h.isEnter())
			{
				// do not pop the current stack frame here
				// an exit breakpoint could also set the vm in the suspended state and then we will still need to access the current stack.
				// Pop the frame in the method exit event, because no one can need it after the method has exited
				//this.exitStrategoStackFrame(h);	
				

				// the current term on the frame should now be
				//h.getGiven();
				//this.strategoState.currentFrame().setCurrentTerm(h.getGiven());
			}
		}
		//System.out.println("Method entry - EXIT");
		return suspendThread;
	}

	void methodExitEvent(MethodExitEvent event) {
		String eventType = (String) event.request().getProperty("event-type");
		//System.out.println(eventType);
		
		String methodName = event.method().name();
		//String declaringType = event.method().declaringType().name();

		
		if ("<clinit>".equals(methodName) || "<init>".equals(methodName))
		{
			// ignore these...
			return;
		}
		
		EventHandler h = null;
		if (EventHandler.R_ENTER.equals(eventType))
		{
			//h = new RuleEnterHandler(event);
		}
		else if (EventHandler.R_EXIT.equals(eventType))
		{
			//h = new RuleExitHandler(event);
			this.exitStrategoStackFrame(h);
		}
		else if (EventHandler.S_ENTER.equals(eventType))
		{
			//h = new StrategyEnterHandler(event);
		}
		else if (EventHandler.S_EXIT.equals(eventType))
		{
			//h = new StrategyExitHandler(event);
			this.exitStrategoStackFrame(h);
		}
	}

	void fieldWatchEvent(ModificationWatchpointEvent event) {
		Field field = event.field();
		Value value = event.valueToBe();
		println("    " + field.name() + " = " + value);
	}

	void exceptionEvent(ExceptionEvent event) {
		println("Exception: " + event.exception() + " catch: "
				+ event.catchLocation());

		// Step to the catch
		EventRequestManager mgr = event.virtualMachine().eventRequestManager();
		StepRequest req = mgr.createStepRequest(thread, StepRequest.STEP_MIN,
				StepRequest.STEP_INTO);
		req.addCountFilter(1); // next step only
		req.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		req.enable();
	}

	// Step to exception catch
	void stepEvent(StepEvent event) {
		// Adjust call depth
		int cnt = 0;
		indent = new StringBuffer(baseIndent);
		try {
			cnt = thread.frameCount();
		} catch (IncompatibleThreadStateException exc) {
		}
		while (cnt-- > 0) {
			indent.append("| ");
		}

		EventRequestManager mgr = event.virtualMachine().eventRequestManager();
		mgr.deleteEventRequest(event.request());
	}

	void threadDeathEvent(ThreadDeathEvent event) {
		indent = new StringBuffer(baseIndent);
		println("====== " + thread.name() + " end ======");
	}

}
