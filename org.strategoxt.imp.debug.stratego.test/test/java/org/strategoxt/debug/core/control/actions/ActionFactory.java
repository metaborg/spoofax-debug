package org.strategoxt.debug.core.control.actions;

public class ActionFactory {

	
	public final static String STEP_INTO = "STEP_INTO";
	public final static String STEP_OVER = "STEP_OVER";
	public final static String STEP_RETURN = "STEP_RETURN";
	public final static String RESUME = "RESUME";
	public final static String TERMINATE = "TERMINATE";
	public final static String CHANGE = "CHANGE:";
	
	public static IAction createAction(String actionName)
	{
		if (RESUME.equals(actionName))
		{
			return new ResumeAction();
		}
		else if (STEP_INTO.equals(actionName))
		{
			return new StepIntoAction();
		}
		else if (STEP_OVER.equals(actionName))
		{
			return new StepOverAction();
		}
		else if (STEP_RETURN.equals(actionName))
		{
			return new StepReturnAction();
		}
		else if (TERMINATE.equals(actionName))
		{
			return new TerminateAction();
		}
		else if (actionName.startsWith(CHANGE))
		{
			String term = actionName.substring(CHANGE.length());
			return new ChangeTermAction(term);
		}
		else
		{
			return null;
		}
	}
}
