package org.strategoxt.debug.core.control.events;

public class EventHandlerFactory {
	
	public static EventHandler createEventHandler(ValueExtractor extractor, String eventType)
	{
		EventHandler h = null;
		if (EventHandler.R_ENTER.equals(eventType))
		{
			h = new RuleEnterHandler(extractor);
		}
		else if (EventHandler.R_EXIT.equals(eventType))
		{
			h = new RuleExitHandler(extractor);
		}
		else if (EventHandler.S_ENTER.equals(eventType))
		{
			h = new StrategyEnterHandler(extractor);
		}
		else if (EventHandler.S_EXIT.equals(eventType))
		{
			h = new StrategyExitHandler(extractor);
		}
		else if (EventHandler.S_STEP.equals(eventType))
		{
			h = new StrategyStepHandler(extractor);
		}
		else if (EventHandler.S_VAR.equals(eventType))
		{
			h = new StrategyVarHandler(extractor);
		}
		return h;
	}

}
