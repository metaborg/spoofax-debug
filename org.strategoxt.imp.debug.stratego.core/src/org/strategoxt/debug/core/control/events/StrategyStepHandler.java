package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyStepBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;

public class StrategyStepHandler extends EventHandler {

	public StrategyStepHandler(ValueExtractor extractor) {
		super(extractor);
	}

	@Override
	protected BreakPoint createBreakPoint() {
		String name = this.getName(); // the name of the strategy
		String filename = this.getFilename(); // the filename of the stratego file in which we want to set a breakpoint
		LocationInfo locationInfo = getLocationInfo();
		StrategyStepBreakPoint b = new StrategyStepBreakPoint(filename, name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		return b;
	}

	@Override
	public String getEventType() {
		return EventHandler.S_STEP;
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
		// the current term on the frame should now be
		//h.getGiven();
		
		// perform smart set
		if (strategoState.currentFrame().getCurrentTerm() == this.getGiven())
		{
			// the same, do not set
			// same reference
		}
		else if (strategoState.currentFrame().getCurrentTerm().equals(this.getGiven()))
		{
			// the same, do not set
			// same value
		}
		else
		{
			strategoState.currentFrame().setCurrentTerm(this.getGiven());
		}
		super.processDebugEvent(strategoState); // update current location info
	}
	
}
