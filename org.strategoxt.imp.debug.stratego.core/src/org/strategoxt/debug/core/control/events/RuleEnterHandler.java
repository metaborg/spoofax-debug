package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.RuleEnterBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;

import com.sun.jdi.event.MethodEntryEvent;

public class RuleEnterHandler extends EventHandler {

	public RuleEnterHandler(MethodEntryEvent event) {
		super(event);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected BreakPoint createBreakPoint() {
		String name = this.getName(); // the name of the rule
		String filename = this.getFilename(); // the filename of the stratego file in which we want to set a breakpoint
		LocationInfo locationInfo = getLocationInfo();
		RuleEnterBreakPoint b = new RuleEnterBreakPoint(filename, name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		return b;
	}

	@Override
	protected String getEventType() {
		return "Rule Enter";
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
