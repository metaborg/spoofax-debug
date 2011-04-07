package org.strategoxt.debug.core.control.events;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdi.TimeoutException;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.imp.debug.stratego.runtime.strategies.HybridInterpreterDebugRuntime;

import com.sun.jdi.ClassNotLoadedException;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.InvalidTypeException;
import com.sun.jdi.InvocationException;
import com.sun.jdi.Method;
import com.sun.jdi.ObjectReference;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.Value;

public class InterpreterLoadedHandler extends EventHandler {

	public InterpreterLoadedHandler(IEventInfoExtractor extractor, EventSpecManager eventSpecManager) {
		super(extractor, eventSpecManager);
	}

	@Override
	protected BreakPoint createBreakPoint(StrategoState currentState) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getEventType() {
		return EventHandler.INTERPRETER_LOADED;
	}

	@Override
	public boolean isEnter() {
		return false;
	}

	@Override
	public boolean isExit() {
		return false;
	}
	
	@Override
	public void processDebugEvent(StrategoState strategoState) {
		//super.processDebugEvent(strategoState);
		// TODO: we may want to change the current term before calling the strategy
		if (this.getEventSpecManager().getInputTerm() != null)
		{
			// change the input term
			ObjectReference ref = this.getStackFrame().thisObject(); // get the stackframe
			// check if it is an HybridInterpreter
			if (ref != null)
			{
				// HybridInterpreter.public boolean invoke(String name)
				@SuppressWarnings("unchecked")
				List<Method> methods = ref.referenceType().methodsByName(HybridInterpreterDebugRuntime.SET_CURRENT_TERM);
				Method method = null;
				// should be only one method!
				method = methods.get(0);
				// invoke takes a String as argument
				List<Value> arguments = new ArrayList<Value>();
				Value arg = this.getStackFrame().thread().virtualMachine().mirrorOf(this.getEventSpecManager().getInputTerm());
				arguments.add(arg);
				
				Value output = null; // TODO: output will be true when the set current term was successful
				try {
					output = this.getStackFrame().thisObject().invokeMethod(this.getStackFrame().thread(), method, arguments, ThreadReference.INVOKE_SINGLE_THREADED);
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
				System.out.println("SET_CURRENT_TERM succes? " + output);
			}
			// call setCurrent() method
		}
	}

}
