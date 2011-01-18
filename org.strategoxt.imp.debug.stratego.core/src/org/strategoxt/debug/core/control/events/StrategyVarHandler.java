package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.model.StrategoState;

public class StrategyVarHandler extends EventHandler {

	public StrategyVarHandler(ValueExtractor extractor) {
		super(extractor);
	}
	
	
	@Override
	protected BreakPoint createBreakPoint() {
		return null;
	}
	
	@Override
	public String getEventType() {
		return EventHandler.S_VAR;
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
		
		String varname = this.getVarname();
		//System.out.println("localvar: " + varname);
		// add the variable assignment to the currentStackFrame
		strategoState.currentFrame().addVariable(varname, this.getGiven());
		super.processDebugEvent(strategoState); // update current location info
	}
}
