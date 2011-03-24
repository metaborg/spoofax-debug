package org.strategoxt.debug.core.control;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdi.TimeoutException;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.ParseError;
import org.spoofax.terms.StringTermReader;
import org.spoofax.terms.TermFactory;
import org.strategoxt.debug.core.control.events.EventHandler;
import org.strategoxt.debug.core.control.events.EventHandlerFactory;
import org.strategoxt.debug.core.control.events.EventInfoStringExtractor;
import org.strategoxt.debug.core.control.events.IEventInfoExtractor;
import org.strategoxt.debug.core.control.events.RuleExitHandler;
import org.strategoxt.debug.core.control.events.StrategyExitHandler;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.StrategoTermBuilder;
import org.strategoxt.imp.debug.stratego.runtime.strategies.DebugCallStrategy;

import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.InvalidTypeException;
import com.sun.jdi.InvocationException;
import com.sun.jdi.Method;
import com.sun.jdi.StackFrame;
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
			/*
			int level = this.strategoState.getCurrentFrameLevel();
			StrategoStackFrame frame = new StrategoStackFrame(level, h.getFilename(), h.getName(), h.getLocationInfo(), h.getGiven());
			this.strategoState.popFrame(frame);
			*/
			// TODO: optimize: just pop the frame
			this.strategoState.popFrame();
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
	
	private IEventInfoExtractor extractor = null;
	
	protected boolean breakpointEvent(BreakpointEvent event, EventSpecManager eventSpecManager)
	{
		executePendingExit();
		long start = System.nanoTime(); // profile internal
		boolean suspendThread = false;
		String eventType = (String) event.request().getProperty("event-type");
		this.extractor = new EventInfoStringExtractor(event);
		long extractorEnd = System.nanoTime();
		EventHandler h = EventHandlerFactory.createEventHandler(extractor, eventType);
		if (h.isEnter())
		{
			// current stack frame should be pushed, this is done in processDebugEvent
			
			// record the enter time
			EventProfiler.instance.enter(extractor.getName());
		}
		long processStart = System.nanoTime();
		h.processDebugEvent(this.strategoState);
		long processEnd = System.nanoTime();
		suspendThread = h.shouldSuspend(this.strategoState, eventSpecManager);
		// if the thread will be suspended, update the Dynamic Rules. But first get it from the vm while it is suspended
		long suspendCheckEnd = System.nanoTime();
		if (suspendThread)
		{
			System.out.println("suspend");
			// FIXME: get current term
			System.out.println(this.strategoState.currentFrame().getCurrentTerm());
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
			// record the exit time
			EventProfiler.instance.exit(extractor.getName());
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
		
		long end = System.nanoTime(); // profile internal
		EventProfiler.instance.internalProfile(eventType, start-start, extractorEnd-start, processStart-extractorEnd, processEnd-processStart, suspendCheckEnd-processEnd, end-suspendCheckEnd);
		return suspendThread;
	}
	
	/**
	 * Returns true if the value can be parsed to an IStrategoTerm.
	 * @param expression
	 * @return
	 */
	public boolean verifyValue(String expression)
	{
		// can the expressionbe converted to an IStrategoTerm
		StringTermReader termReader = EventInfoStringExtractor.termReader;
		IStrategoTerm term = null;
		try {
			term = termReader.parseFromString(expression);
		}
		catch(ParseError error)
		{
			// RuntimeException
		}
		return term != null;
	}
	
	@SuppressWarnings("unchecked")
	public void setCurrentTerm(String term)
	{
		StackFrame fr = null;
		try {
			fr = thread.frame(0); // get current frame
		} catch (IncompatibleThreadStateException e) {
			e.printStackTrace(); // thread should be suspended
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace(); // invalid index
		}
		if (fr == null)
		{
			System.out.println("Could not get thread!");
		}
		List<Method> methodsC = fr.thisObject().referenceType().methodsByName(DebugCallStrategy.SETCURRENTTERM);
		Method mCurrent = methodsC.get(0);
		Value outputCurrent = null; // will be a string representation of an IStrategoTerm, IStrategoList, containing the names of the active dynamic rules
		try {
			Value arg = thread.virtualMachine().mirrorOf(term);
			List<Value> argumentsC = new ArrayList<Value>();
			argumentsC.add(arg);
			outputCurrent = fr.thisObject().invokeMethod(thread, mCurrent, argumentsC, ThreadReference.INVOKE_SINGLE_THREADED);
			this.extractor.updateContents();
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
		System.out.println(outputCurrent);
		IStrategoTerm t = this.extractor.getGiven();
		//System.out.println("BEFORE: " + this.strategoState.currentFrame().getCurrentTerm());
		this.strategoState.currentFrame().setCurrentTerm(t);
		//System.out.println("AFTER: " + this.strategoState.currentFrame().getCurrentTerm());
	}

	@SuppressWarnings("unchecked")
	private String[] getDynamicRuleNames(EventHandler h)
	{
		Method method = null;
		List<Value> arguments = new ArrayList<Value>();
		
		// java method "getDRKeySetString" calls a stratego strategy and returns a list of strings for each dynamic rule
		List<Method> methods = h.getStackFrame().thisObject().referenceType().methodsByName(DebugCallStrategy.GETDRKEYSETSTRING);
		// should be only one method!
		method = methods.get(0);
		
		// the stratego program is suspended
		//System.out.println("suspend");
		Value output = null; // will be a string representation of an IStrategoTerm, IStrategoList, containing the names of the active dynamic rules
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
		} catch (TimeoutException e) {
			// TODO: what happened in the debuggee?
			// something took too long....
			e.printStackTrace();
		}
		//Value output = thread.invokeMethod(thread, method, arguments, ThreadReference.INVOKE_SINGLE_THREADED);
		if (output == null)
		{
			return new String[0];
		}
		StrategoTermBuilder builder = new StrategoTermBuilder();
		String s = builder.buildString(output); // instance of String

		TermFactory f = new TermFactory();
		StringTermReader r = new StringTermReader(f);
		IStrategoTerm term = r.parseFromString(s); // IStrategoList
		//System.out.println(output.toString());
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
		IEventInfoExtractor extractor = new EventInfoStringExtractor(event);
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
		IEventInfoExtractor extractor = new EventInfoStringExtractor(event);
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
		com.sun.jdi.ObjectReference ref = event.exception();
		com.sun.jdi.ReferenceType refType =ref.referenceType();
		for(Object obj : refType.allFields())
		{
			//System.out.println(obj.toString());
		}
		com.sun.jdi.Field field1 = refType.fieldByName("stackTrace");
		com.sun.jdi.Field field2 = refType.fieldByName("detailMessage");
		//com.sun.jdi.Value val1 = refType.getValue(field1);
		//com.sun.jdi.Value val2 = refType.getValue(field2);
		//System.out.println(val1.toString());
		//System.out.println(val2.toString());
		
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
			// TODO: when the main stragey is an io-wrap call, the s-exit of the main strategy will never be reached because io-wrap will call exit
			System.out.println("A thread death occured, but the StrategoState has some StackFrame left...");
		}
		else
		{
			System.out.println("Thread death...");
		}
		// profile statistics
		EventProfiler.instance.write();

	}
	
	public StrategoState getStrategoState()
	{
		return this.strategoState;
	}

}
