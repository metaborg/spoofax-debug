package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.eventspec.EventSpecManager;

public class EventHandlerFactory {
	
	public static EventHandler createEventHandler(String eventType, IEventInfoExtractor extractor, EventSpecManager eventSpecManager)
	{
		EventHandler h = null;
		if (EventHandler.R_ENTER.equals(eventType))
		{
			h = new RuleEnterHandler(extractor, eventSpecManager);
		}
		else if (EventHandler.R_EXIT.equals(eventType))
		{
			h = new RuleExitHandler(extractor, eventSpecManager);
		}
		else if (EventHandler.S_ENTER.equals(eventType))
		{
			h = new StrategyEnterHandler(extractor, eventSpecManager);
		}
		else if (EventHandler.S_EXIT.equals(eventType))
		{
			h = new StrategyExitHandler(extractor, eventSpecManager);
		}
		else if (EventHandler.S_STEP.equals(eventType))
		{
			h = new StrategyStepHandler(extractor, eventSpecManager);
		}
		else if (EventHandler.S_VAR.equals(eventType))
		{
			h = new StrategyVarHandler(extractor, eventSpecManager);
		}
		else if (EventHandler.INTERPRETER_LOADED.equals(eventType))
		{
			h = new InterpreterLoadedHandler(extractor, eventSpecManager);
		}
		return h;
	}

}
