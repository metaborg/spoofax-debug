package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.eventspec.FailBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;

public class StrategyFailHandler extends EventHandler {

	public StrategyFailHandler(IEventInfoExtractor extractor, EventSpecManager eventSpecManager) {
		super(extractor, eventSpecManager);
	}
	
	@Override
	protected BreakPoint createBreakPoint(StrategoState currentState) {
		String name = this.getName(); // the name of the strategy
		String filename = this.getFilename(); // the filename of the stratego file in which we want to set a breakpoint
		LocationInfo locationInfo = getLocationInfo();
		
		FailBreakPoint b = new FailBreakPoint(filename, name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		b.setVirtual(false);
		return b;
	}
	
	@Override
	public String getEventType() {
		return EventHandler.S_FAIL;
	}

	@Override
	public boolean isEnter() {
		return true;
	}
	
	@Override
	public boolean isExit() {
		return false;
	}
}
