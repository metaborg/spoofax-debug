package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyExitBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;

import com.sun.jdi.event.MethodEntryEvent;

public class StrategyExitHandler extends EventHandler {

	public StrategyExitHandler(MethodEntryEvent event) {
		super(event);
	}

	@Override
	protected BreakPoint createBreakPoint() {
		String name = this.getName(); // the name of the strategy
		LocationInfo locationInfo = getLocationInfo();
		StrategyExitBreakPoint b = new StrategyExitBreakPoint(name, locationInfo.getStart_line_num());
		return b;
	}

	@Override
	protected String getEventType() {
		return "Strategy Exit";
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
