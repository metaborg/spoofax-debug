package org.strategoxt.debug.core.control;

import java.util.ArrayList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.control.events.EventHandler;
import org.strategoxt.debug.core.control.events.EventHandlerFactory;
import org.strategoxt.debug.core.control.events.RuleExitHandler;
import org.strategoxt.debug.core.control.events.StrategyExitHandler;
import org.strategoxt.debug.core.control.events.ValueExtractor;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.StrategoTermBuilder;

import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.InvalidTypeException;
import com.sun.jdi.InvocationException;
import com.sun.jdi.Method;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.Value;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.ExceptionEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;
import com.sun.jdi.event.ModificationWatchpointEvent;
import com.sun.jdi.event.StepEvent;
import com.sun.jdi.event.ThreadDeathEvent;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.StepRequest;

/**
 * This class keeps context on events in one thread.
 */
public class ThreadEventHandler {

	final ThreadReference thread;

	// share stratego state across threads
	private StrategoState strategoState = null;
	
	/**
	 * If this attribute is set, we need to pop the StackFrame of this EventHandler before handling a new DebugEvent.
	 */
	private EventHandler pendingExit = null;
	
	public ThreadEventHandler(ThreadReference thread, StrategoState strategoState) {
		this.thread = thread;
		this.strategoState = strategoState;
	}

	/*
	private void enterStrategoStackFrame(EventHandler h) {
		StrategoStackFrame frame = new StrategoStackFrame(h.getFilename(), h.getName(), h.getLocationInfo(), h.getGiven());
		this.strategoState.pushFrame(frame);
	}
	*/

	/**
	 * Remove the current StrategoStackFrame
	 */
	private void exitStrategoStackFrame(EventHandler h) {
		if (h != null)
		{
			int level = this.strategoState.getCurrentFrameLevel();
			StrategoStackFrame frame = new StrategoStackFrame(level, h.getFilename(), h.getName(), h.getLocationInfo(), h.getGiven());
			this.strategoState.popFrame(frame);
		}
		else
		{
			this.strategoState.popFrame();
		}
	}
	
	/**
	 * If we have a pending exit
	 */
	private void executePendingExit()
	{
		if (this.pendingExit != null)
		{
			// the EventHandler contains references to the StackFrame,however, the StackFrame is invalidated because the thread was resumed
			exitStrategoStackFrame(null);
			this.pendingExit = null;
		}
	}

	protected boolean breakpointEvent(BreakpointEvent event, EventSpecManager eventSpecManager)
	{
		executePendingExit();
		
		boolean suspendThread = false;
		String eventType = (String) event.request().getProperty("event-type");
		ValueExtractor extractor = new ValueExtractor(event);

		EventHandler h = EventHandlerFactory.createEventHandler(extractor, eventType);
		if (h.isEnter())
		{
			// current stack frame should be pushed, this is done in processDebugEvent
		}
		h.processDebugEvent(this.strategoState);
		
		suspendThread = h.shouldSuspend(this.strategoState, eventSpecManager);
		// if the thread will be suspended, update the Dynamic Rules. But first get it from the vm while it is suspended

		if (suspendThread)
		{
			String[] dynamicRuleNames = getDynamicRuleNames(h);
			if (dynamicRuleNames != null) {
				this.strategoState.currentFrame().setDynamicRuleNames(dynamicRuleNames);
			} else {
				// TODO: fetching dynamic rules failed
			}
			this.strategoState.setSuspended(true);
		}

		if (h.isExit())
		{
			if (suspendThread) {
				// do not pop the current stack frame here
				// an exit breakpoint could also set the vm in the suspended state and then we will still need to access the current stack.
				
				// save the EventHandler as pending exit, pop the StackFrame at the next debug event
				this.pendingExit = h;
			} else {
				// thread will not be suspend at an exit
				// so we can just pop the current StackFrame
				this.exitStrategoStackFrame(h);
			}
		}
		return suspendThread;
	}

	private String[] getDynamicRuleNames(EventHandler h)
	{
		Method method = null;
		List<Value> arguments = new ArrayList<Value>();
		// java method "getDRKeySet" calls a stratego strategy and returns a list of strings for each dynamic rule
		List<Method> methods = h.getStackFrame().thisObject().referenceType().methodsByName("getDRKeySet");
		// should be only one method!
		method = methods.get(0);
		arguments.add(h.getContextValue());
		
		// the stratego program is suspended
		//System.out.println("suspend");
		Value output = null;
		try {
			output = h.getStackFrame().thisObject().invokeMethod(thread, method, arguments, ThreadReference.INVOKE_SINGLE_THREADED);
		} catch (InvalidTypeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotLoadedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IncompatibleThreadStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Value output = thread.invokeMethod(thread, method, arguments, ThreadReference.INVOKE_SINGLE_THREADED);
		if (output == null)
		{
			return null;
		}
		//System.out.println(output.toString());
		StrategoTermBuilder builder = new StrategoTermBuilder();
		IStrategoTerm term = builder.buildIStrategoTerm(output); // instance of org.strategoxt.lang.terms.StrategoList(id=1193)
		//System.out.println(term.toString());
		String[] dynamicRuleNames = builder.convertToStringArray(term);
		
		return dynamicRuleNames;
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
		
		if ("<clinit>".equals(methodName) || "<init>".equals(methodName))
		{
			// ignore these...
			return suspendThread;
		}
		
		EventHandler h = null;
		ValueExtractor extractor = new ValueExtractor(event);
		h = EventHandlerFactory.createEventHandler(extractor, eventType);
		
		if (h != null)
		{
			if (h.isEnter())
			{
				// current event is an enter event, push a new StackFrame on the stack
				//this.enterStrategoStackFrame(h);				
			}
			try {
				h.processDebugEvent(this.strategoState);
				
				suspendThread = h.shouldSuspend(this.strategoState, eventSpecManager);
				// if the thread will be suspended, update the Dynamic Rules. But first get it from the vm while it is suspended



				if (suspendThread)
				{
					String[] dynamicRuleNames = getDynamicRuleNames(h);
					if (dynamicRuleNames != null) {
						this.strategoState.currentFrame().setDynamicRuleNames(dynamicRuleNames);
					} else {
						// TODO: fetching dynamic rules failed
					}
					this.strategoState.setSuspended(true);
				}
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
		ValueExtractor extractor = new ValueExtractor(event);
		if (EventHandler.R_ENTER.equals(eventType))
		{
			//h = new RuleEnterHandler(event);
		}
		else if (EventHandler.R_EXIT.equals(eventType))
		{
			h = new RuleExitHandler(extractor);
			this.exitStrategoStackFrame(h);
		}
		else if (EventHandler.S_ENTER.equals(eventType))
		{
			//h = new StrategyEnterHandler(event);
		}
		else if (EventHandler.S_EXIT.equals(eventType))
		{
			h = new StrategyExitHandler(extractor);
			this.exitStrategoStackFrame(h);
		}
	}

	void fieldWatchEvent(ModificationWatchpointEvent event) {
		//Field field = event.field();
		//Value value = event.valueToBe();
		// field changed value
	}

	void exceptionEvent(ExceptionEvent event) {
		// event.exception() at event.catchLocation()
		//System.out.println(event.exception());
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
		EventRequestManager mgr = event.virtualMachine().eventRequestManager();
		mgr.deleteEventRequest(event.request());
	}

	/**
	 * Death occurs before termination
	 * @param event
	 */
	void threadDeathEvent(ThreadDeathEvent event) {
		// thread death event
		if (this.strategoState != null && this.strategoState.getCurrentFrameLevel() > -1)
		{
			System.out.println("A thread death occured, but the StrategoState has some StackFrame left...");
		}
		else
		{
			System.out.println("Thread death...");
		}

	}
	
	public StrategoState getStrategoState()
	{
		return this.strategoState;
	}

}
