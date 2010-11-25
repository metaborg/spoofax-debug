package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyEnterBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;

import com.sun.jdi.event.MethodEntryEvent;

public class StrategyEnterHandler extends EventHandler {

	public StrategyEnterHandler(MethodEntryEvent event)
	{
		super(event);
	}
	
	@Override
	protected BreakPoint createBreakPoint() {
		String name = this.getName(); // the name of the strategy
		LocationInfo locationInfo = getLocationInfo();
		StrategyEnterBreakPoint b = new StrategyEnterBreakPoint(name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		return b;
	}

	@Override
	protected String getEventType() {
		// TODO Auto-generated method stub
		return "Strategy Enter";
	}

	@Override
	public boolean isEnter() {
		return true;
	}

	@Override
	public void processDebugEvent(StrategoState strategoState) {
		super.processDebugEvent(strategoState);
		// current event is an enter event, push a new StackFrame on the stack
		StrategoStackFrame frame = new StrategoStackFrame(this.getFilename(), this.getName(), this.getLocationInfo(), this.getGiven());
		strategoState.pushFrame(frame);
	}
}
