package org.strategoxt.debug.core.control.actions;

import org.strategoxt.debug.core.control.DebugSessionManager;

public abstract class IAction {

	public abstract void execute(DebugSessionManager dsm);
	
	public boolean fireNext()
	{
		return false;
	}
}
