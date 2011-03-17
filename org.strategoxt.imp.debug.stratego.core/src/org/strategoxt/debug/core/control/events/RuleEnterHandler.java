package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.control.EventProfiler;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.RuleEnterBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;

public class RuleEnterHandler extends EventHandler {

	public RuleEnterHandler(IEventInfoExtractor extractor) {
		super(extractor);
	}
	
	@Override
	protected BreakPoint createBreakPoint(StrategoState currentState) {
		String name = this.getName(); // the name of the rule
		String filename = this.getFilename(); // the filename of the stratego file in which we want to set a breakpoint
		LocationInfo locationInfo = getLocationInfo();
		RuleEnterBreakPoint b = new RuleEnterBreakPoint(filename, name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		b.setVirtual(false);
		return b;
	}

	@Override
	public String getEventType() {
		return EventHandler.R_ENTER;
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
		String markName = "PDE_" + this.getEventType();
		EventProfiler.instance.startMark(markName);
		
		int level = strategoState.getCurrentFrameLevel() + 1;

		EventProfiler.instance.subMark(markName, "P-1");

		StrategoStackFrame frame = new StrategoStackFrame(level, this.getFilename(), this.getName(), this.getLocationInfo(), this.getGiven());
		
		EventProfiler.instance.subMark(markName, "P-2");
		
		strategoState.pushFrame(frame);

		EventProfiler.instance.subMark(markName, "P-3");
		
		super.processDebugEvent(strategoState); // update current location info

		EventProfiler.instance.subMark(markName, "P-SUPER");

	}

}
