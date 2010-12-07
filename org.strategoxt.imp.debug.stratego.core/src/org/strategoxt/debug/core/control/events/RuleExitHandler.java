package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.RuleExitBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;

import com.sun.jdi.event.MethodEntryEvent;

public class RuleExitHandler extends EventHandler {

	public RuleExitHandler(MethodEntryEvent event) {
		super(event);
	}

	@Override
	protected BreakPoint createBreakPoint() {
		String name = this.getName(); // the name of the rule
		String filename = this.getFilename(); // the filename of the stratego file in which we want to set a breakpoint
		LocationInfo locationInfo = getLocationInfo();
		RuleExitBreakPoint b = new RuleExitBreakPoint(filename, name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		return b;
	}

	@Override
	public String getEventType() {
		return EventHandler.R_EXIT;
	}

	@Override
	public boolean isEnter() {
		return false;
	}
	
	
	@Override
	public void processDebugEvent(StrategoState strategoState) {
		super.processDebugEvent(strategoState);
		// do not pop the current stack frame here
		// an exit breakpoint could also set the vm in the suspended state and then we will still need to access the current stack.
		// Pop the frame in the method exit event, because no one can need it after the method has exited
		//this.exitStrategoStackFrame(h);	
		

		// the current term on the frame should now be
		//h.getGiven();
		strategoState.currentFrame().setCurrentTerm(this.getGiven());
	}
	


}
