package org.strategoxt.debug.core.control;

import java.util.Map.Entry;

import junit.framework.Assert;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.model.StrategoState;

public class VMMonitorTestImpl2 implements VMMonitor {
	
	private DebugSessionManager debugSessionManager;
	private VMStateTester vmStateTester;
	
	public VMMonitorTestImpl2() {

	}
	
	public void setVMStateTester(VMStateTester vmStateTester) {
		this.vmStateTester = vmStateTester;
	}

	public void setDSM(DebugSessionManager dsm)
	{
		this.debugSessionManager = dsm;
	}
	
	public void stateChanged(StrategoState state) {
		//System.out.println("state changed");
		String name = state.currentFrame().getName();
		boolean expected = vmStateTester.isNextHit(name);
		System.out.println("expected: " + expected);
		String message = "Hit " + name + ", but expected to hit " + vmStateTester.currentHit();
		Assert.assertTrue(message, expected);
		String termString = state.currentFrame().getCurrentTerm().toString();
		System.out.println("current: " + termString);
		for ( Entry<String, IStrategoTerm> entry : state.currentFrame().getVariables().entrySet() )
		{
			System.out.println("variable entry " + entry.getKey() + " # " + entry.getValue());
		}
		this.debugSessionManager.resumeVM();
	}

	public void vmEvent(String event) {
		System.out.println("vmEvent: " + event);
		if ("VMDEATH".equals(event))
		{
			// vm terminated
			if (this.vmStateTester.hasNextHit())
			{
				Assert.fail("VM has terminated but there are still some expected hits left...");
			}
		}
	}
}
