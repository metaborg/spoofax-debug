package org.strategoxt.debug.core.control;

import org.strategoxt.debug.core.model.StrategoState;

public class VMMonitorTestImpl implements VMMonitor {

	public void stateChanged(StrategoState state) {
		// TODO Auto-generated method stub
		System.out.println("state changed");
	}

	public void vmEvent(String event) {
		// TODO Auto-generated method stub
		System.out.println("vmEvent: " + event);
	}

}
