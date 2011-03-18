package org.strategoxt.debug.core.control.actions;

import org.strategoxt.debug.core.control.DebugSessionManager;

public class ChangeTermAction extends IAction {

	private String term = null;
	
	public ChangeTermAction(String term)
	{
		this.term = term;
	}
	
	@Override
	public void execute(DebugSessionManager dsm) {
		dsm.changeCurrentTerm(term);
	}
	
	@Override
	public boolean fireNext() {
		return true;
	}

}
