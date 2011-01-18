package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyEnterBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;

public class StrategyEnterHandler extends EventHandler {

	public StrategyEnterHandler(ValueExtractor extractor)
	{
		super(extractor);
	}
	
	@Override
	protected BreakPoint createBreakPoint() {
		String name = this.getName(); // the name of the strategy
		String filename = this.getFilename(); // the filename of the stratego file in which we want to set a breakpoint
		LocationInfo locationInfo = getLocationInfo();
		StrategyEnterBreakPoint b = new StrategyEnterBreakPoint(filename, name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		return b;
	}

	@Override
	public String getEventType() {
		// TODO Auto-generated method stub
		return EventHandler.S_ENTER;
	}

	@Override
	public boolean isEnter() {
		return true;
	}
	
	@Override
	public boolean isExit() {
		return false;
	}

	@Override
	public void processDebugEvent(StrategoState strategoState) {
		// current event is an enter event, push a new StackFrame on the stack
		int level = strategoState.getCurrentFrameLevel() + 1;
		StrategoStackFrame frame = new StrategoStackFrame(level, this.getFilename(), this.getName(), this.getLocationInfo(), this.getGiven());
		strategoState.pushFrame(frame);
		super.processDebugEvent(strategoState); // update current location info
	}
}
