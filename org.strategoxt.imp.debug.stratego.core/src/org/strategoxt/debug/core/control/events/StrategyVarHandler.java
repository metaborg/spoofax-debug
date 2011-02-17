package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.control.EventProfiler;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.model.StrategoState;

public class StrategyVarHandler extends EventHandler {

	public StrategyVarHandler(IEventInfoExtractor extractor) {
		super(extractor);
	}
	
	
	@Override
	protected BreakPoint createBreakPoint(StrategoState currentState) {
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
		
		String markName = "PDE_" + this.getEventType();
		EventProfiler.instance.startMark(markName);
		
		String varname = this.getVarname();
		
		EventProfiler.instance.subMark(markName, "P-1");
		
		//System.out.println("localvar: " + varname);
		// add the variable assignment to the currentStackFrame
		
		strategoState.currentFrame().addVariable(varname, this.getGiven());
		
		EventProfiler.instance.subMark(markName, "P-2");
		
		super.processDebugEvent(strategoState); // update current location info
		
		EventProfiler.instance.subMark(markName, "P-SUPER");

	}
}
