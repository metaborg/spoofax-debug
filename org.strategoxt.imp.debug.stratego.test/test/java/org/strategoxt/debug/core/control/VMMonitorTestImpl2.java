package org.strategoxt.debug.core.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import junit.framework.Assert;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.model.StrategoState;

public class VMMonitorTestImpl2 implements VMMonitor {
	
	public final static String STEP_INTO = "STEP_INTO";
	public final static String STEP_OVER = "STEP_OVER";
	public final static String STEP_RETURN = "STEP_RETURN";
	public final static String RESUME = "RESUME";
	public final static String TERMINATE = "TERMINATE";
	
	private DebugSessionManager debugSessionManager;
	private VMStateTester vmStateTester;
	
	private AbstractDSMTest callback = null;
	
	// list contains String encoded actions: e.g. RESUME, STEP
	// This action should be performed after a state change, if no actions are in the list left, do a RESUME
	private List<String> afterStateChangeActions = null;
	private int actionIndex = -1;
	
	public VMMonitorTestImpl2(AbstractDSMTest callback) {
		this.callback = callback;
	}
	
	public void setVMStateTester(VMStateTester vmStateTester) {
		this.vmStateTester = vmStateTester;
	}

	public void setDSM(DebugSessionManager dsm)
	{
		this.debugSessionManager = dsm;
	}
	
	private void caughtThrowable(Throwable e)
	{
		if (this.callback != null)
		{
			callback.caughtThrowableInThread(e);
		}
	}
	
	public void stateChanged(StrategoState state) {
		System.out.println("state changed");
		// catch any exception
		boolean stateMismatch = false; // true if the current state does not match the expected state
		try
		{
			if (vmStateTester.hasNext())
			{
				vmStateTester.next();
				boolean expected = vmStateTester.compareState(state);
				String message = "State #" + vmStateTester.getIndex()+ ": Hit " + state.currentFrame() + ", but expected to hit " + vmStateTester.current().currentFrame();
				Assert.assertTrue(message, expected);
				System.out.println("current: " + state.currentFrame().getCurrentTerm());
				for ( Entry<String, IStrategoTerm> entry : state.currentFrame().getVariables().entrySet() )
				{
					System.out.println("variable entry " + entry.getKey() + " # " + entry.getValue());
				}
			}
			else
			{
				String message = "State changed but we did not except anymore state changes...";
				Assert.fail(message);
			}
			
		} catch(Exception e)
		{
			caughtThrowable(e);
			stateMismatch = true;
		} catch (AssertionError e)
		{
			caughtThrowable(e);
			stateMismatch = true;
		}
		if (!stateMismatch)
		{
			nextAction();
		}
		else
		{
			// test failed, stop VM
			performAction(TERMINATE);
		}
	}

	public void vmEvent(String event) {
		System.out.println("vmEvent: " + event);
		if ("VMDEATH".equals(event))
		{
			// vm terminated, TODO: last state should be a StrategoExitedState
			if (this.vmStateTester.hasNext())
			{
				Assert.fail("VM has terminated but there are still some expected hits left...");
			}
		}
	}
	
	public void addAction(String action)
	{
		if (this.afterStateChangeActions == null)
		{
			this.afterStateChangeActions = new ArrayList<String>();
		}
		this.afterStateChangeActions.add(action);
	}
	
	/**
	 * Performs the given action on the Stratego VM.
	 * @param action
	 */
	private void performAction(String action)
	{
		if (RESUME.equals(action))
		{
			this.debugSessionManager.resumeVM();
		}
		else if (STEP_INTO.equals(action))
		{
			this.debugSessionManager.stepInto();
		}
		else if (STEP_OVER.equals(action))
		{
			this.debugSessionManager.stepOver();
		}
		else if (STEP_RETURN.equals(action))
		{
			this.debugSessionManager.stepReturn();
		}
		else if (TERMINATE.equals(action))
		{
			this.debugSessionManager.terminateVM();
		}
		else
		{
			// action unknown, just do a resume
			this.debugSessionManager.resumeVM();
		}
	}
	
	/**
	 * Determines the next action in the list and performs the action.
	 */
	private void nextAction()
	{
		actionIndex++;
		if (afterStateChangeActions != null && actionIndex < afterStateChangeActions.size())
		{
			String action = afterStateChangeActions.get(actionIndex);
			performAction(action);
		}
		else
		{
			// no actions left, just do a resume
			this.debugSessionManager.resumeVM();
		}
	}
}
