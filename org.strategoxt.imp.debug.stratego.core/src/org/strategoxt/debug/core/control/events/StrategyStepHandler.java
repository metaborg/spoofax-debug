package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyStepBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;

import com.sun.jdi.event.MethodEntryEvent;

public class StrategyStepHandler extends EventHandler {

	public StrategyStepHandler(MethodEntryEvent event) {
		super(event);
	}

	@Override
	protected BreakPoint createBreakPoint() {
		String name = this.getName(); // the name of the strategy
		LocationInfo locationInfo = getLocationInfo();
		StrategyStepBreakPoint b = new StrategyStepBreakPoint(name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		return b;
	}

	@Override
	protected String getEventType() {
		return "Strategy Step";
	}

	@Override
	public boolean isEnter() {
		return false;
	}
	

	
	@Override
	public void processDebugEvent(StrategoState strategoState) {
		super.processDebugEvent(strategoState);
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
	}
	
}
