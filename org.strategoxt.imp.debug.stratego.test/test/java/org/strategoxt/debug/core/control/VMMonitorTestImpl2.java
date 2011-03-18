package org.strategoxt.debug.core.control;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import junit.framework.Assert;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.control.actions.ActionFactory;
import org.strategoxt.debug.core.control.actions.IAction;
import org.strategoxt.debug.core.model.StrategoState;

public class VMMonitorTestImpl2 implements VMMonitor {
	
	private DebugSessionManager debugSessionManager = null;
	private VMStateTester vmStateTester = null;
	
	private AbstractDSMTest callback = null;
	
	// list contains IAction objects
	// This action should be performed after a state change, if no actions are in the list left, do a RESUME
	private List<IAction> afterStateChangeActions = null;
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
	
	/**
	 * An asser failed in a thread, report it to the main thread
	 * @param message
	 */
	private void reportAssertFailure(String message)
	{
		if (this.callback != null)
		{
			callback.reportAssertFailure(message);
		}
	}
	
	public void stateChanged(StrategoState state) {
		System.out.println("state changed");
		// catch any exception
		boolean stateMismatch = false; // true if the current state does not match the expected state
		if (vmStateTester != null)
		{
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
					String message = "State changed but we did not expect anymore state changes...";
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
		}
		if (!stateMismatch)
		{
			nextAction();
		}
		else
		{
			// test failed, stop VM
			this.debugSessionManager.terminateVM();
		}
	}

	public void vmEvent(String event) {
		System.out.println("vmEvent: " + event);
		if ("VMDEATH".equals(event))
		{
			// vm terminated, TODO: last state should be a StrategoExitedState
			if (this.vmStateTester != null && this.vmStateTester.hasNext())
			{
				String message = "VM has terminated but there are still some expected hits left..."; 
				//Assert.fail(message);
				this.reportAssertFailure(message);
			}
		}
	}
	
	public void addAction(String actionName)
	{
		IAction action = ActionFactory.createAction(actionName);
		getAfterStateChangeActions().add(action);
	}
	
	public void addAction(IAction action)
	{
		getAfterStateChangeActions().add(action);
	}
	
	private List<IAction> getAfterStateChangeActions()
	{
		if (this.afterStateChangeActions == null)
		{
			this.afterStateChangeActions = new ArrayList<IAction>();
		}
		return this.afterStateChangeActions;
	}
	
	/**
	 * Determines the next action in the list and performs the action.
	 */
	private void nextAction()
	{
		actionIndex++;
		if (afterStateChangeActions != null && actionIndex < afterStateChangeActions.size())
		{
			IAction action = afterStateChangeActions.get(actionIndex);
			action.execute(this.debugSessionManager);
			if (action.fireNext())
			{
				this.nextAction();
			}
		}
		else
		{
			// no actions left, just do a resume
			this.debugSessionManager.resumeVM();
		}
	}
}
