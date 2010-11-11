package org.strategoxt.debug.core.control;

import org.strategoxt.debug.core.model.StrategoState;

public interface VMMonitor {

	public void stateChanged(StrategoState state);
	
	public void vmEvent(String event);
}
