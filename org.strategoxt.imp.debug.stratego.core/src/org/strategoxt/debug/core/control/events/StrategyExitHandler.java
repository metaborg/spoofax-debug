package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.control.EventProfiler;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyExitBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;

public class StrategyExitHandler extends EventHandler {

	public StrategyExitHandler(ValueExtractor extractor) {
		super(extractor);
	}

	@Override
	protected BreakPoint createBreakPoint(StrategoState currentState) {
		//String name = this.getName(); // the name of the strategy
		String name = currentState.currentFrame().getName(); // OPTIMIZE
		
		//String filename = this.getFilename(); // the filename of the stratego file in which we want to set a breakpoint
		String filename = currentState.currentFrame().getFilename(); // OPTIMIZE
		
		LocationInfo locationInfo = getLocationInfo();
		StrategyExitBreakPoint b = new StrategyExitBreakPoint(filename, name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		return b;
	}

	@Override
	public String getEventType() {
		return EventHandler.S_EXIT;
	}

	@Override
	public boolean isEnter() {
		return false;
	}
	
	@Override
	public boolean isExit() {
		return true;
	}
	
	@Override
	public void processDebugEvent(StrategoState strategoState) {
		// do not pop the current stack frame here
		// an exit breakpoint could also set the vm in the suspended state and then we will still need to access the current stack.
		// Pop the frame in the method exit event, because no one can need it after the method has exited
		//this.exitStrategoStackFrame(h);	
		

		// the current term on the frame should now be
		//h.getGiven();
		String markName = "PDE_" + this.getEventType();
		EventProfiler.instance.startMark(markName);
		
		strategoState.currentFrame().setCurrentTerm(this.getGiven());

		EventProfiler.instance.subMark(markName, "P-1");
		
		super.processDebugEvent(strategoState); // update current location info
		
		EventProfiler.instance.subMark(markName, "P-SUPER");

	}
}
