package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.model.StrategoState;

import com.sun.jdi.event.MethodEntryEvent;

public class StrategyVarHandler extends EventHandler {

	public StrategyVarHandler(MethodEntryEvent event) {
		super(event);
	}
	
	
	@Override
	protected BreakPoint createBreakPoint() {
		return null;
	}
	
	@Override
	protected String getEventType() {
		return EventHandler.S_VAR;
	}

	@Override
	public boolean isEnter() {
		return false;
	}
	
	@Override
	public void processDebugEvent(StrategoState strategoState) {
		super.processDebugEvent(strategoState);
		
		String varname = this.getVarname();
		//System.out.println("localvar: " + varname);
		// add the variable assignment to the currentStackFrame
		strategoState.currentFrame().addVariable(varname, this.getGiven());
	}
}
