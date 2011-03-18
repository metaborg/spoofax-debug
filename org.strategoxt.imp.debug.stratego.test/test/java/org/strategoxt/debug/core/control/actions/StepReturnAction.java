package org.strategoxt.debug.core.control.actions;

import org.strategoxt.debug.core.control.DebugSessionManager;

public class StepReturnAction extends IAction {

	@Override
	public void execute(DebugSessionManager dsm) {
		dsm.stepReturn();
	}

}
