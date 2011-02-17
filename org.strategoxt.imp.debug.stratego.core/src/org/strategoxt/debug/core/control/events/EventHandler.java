package org.strategoxt.debug.core.control.events;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.control.EventProfiler;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;

import com.sun.jdi.StackFrame;

public abstract class EventHandler {
	

	
	public static String S_ENTER = "s_enter";
	public static String S_EXIT = "s_exit";
	public static String R_ENTER = "r_enter";
	public static String R_EXIT = "r_exit";
	public static String S_STEP = "s_step";
	public static String S_VAR = "s_var";

	
	
	private IEventInfoExtractor extractor = null;
	
	public EventHandler(IEventInfoExtractor extractor)
	{
		this.extractor = extractor;
	}
	
	public IEventInfoExtractor getIEventInfoExtractor() {
		return extractor;
	}
	
	public String getFilename()
	{
		return this.getIEventInfoExtractor().getFilename();
	}
	
	public IStrategoTerm getGiven()
	{
		return this.getIEventInfoExtractor().getGiven();
	}

	public LocationInfo getLocationInfo()
	{
		return this.getIEventInfoExtractor().getLocationInfo();
	}
	
	public String getName()
	{
		return this.getIEventInfoExtractor().getName();
	}
	
	public StackFrame getStackFrame()
	{
		return this.getIEventInfoExtractor().getStackFrame();
	}
	
	public String getVarname()
	{
		return this.getIEventInfoExtractor().getVarname();
	}

	/**
	 * Returns true if the thread should stay suspended.
	 * Returns false if the thread should resume
	 * <ul>
	 * <li>If we hit a breakpoint we should always suspend and cancel all stepping.</li>
	 * <li>If we are doing a step over we suspend<ul><li> 
	 * 		at the next s-step,s-exit,r-exit that is in the same StackFrame</li><li>
	 * 		or in the first s-step,s-exit,r-exit in a parent StackFrame (we stepped over the last statement)</li></ul></li>
	 * <li>If we are doing a step into we should suspend<ul><li> 
	 * 		at the first s-enter or s-exit that is in a child StackFrame </li><li>
	 * 		or at the first s-step,s-exit,r-exit that is in the current StackFrame (current statement cannot be stepping into) </li><li>
	 * 		or at the first s-step,s-exit,r-exit that is in the parent StackFrame (doing a step into at an s-exit,r-exit)</li></ul></li>
	 * <li>If we are doing a step return we should suspend<ul><li> 
	 * 		at the first s-step,s-exit,r-exit in the parent StackFrame</li></ul></li>
	 * </ul>
	 * @return
	 */
	public boolean shouldSuspend(StrategoState currentState, EventSpecManager eventSpecManager){
		String markName = "SS_" + this.getEventType();
		EventProfiler.instance.startMark(markName);
		
		BreakPoint bp = createBreakPoint(currentState);
		
		EventProfiler.instance.subMark(markName, "SUSPEND-1");
		
		boolean isBreakPointHit = eventSpecManager.match(bp);

		EventProfiler.instance.subMark(markName, "SUSPEND-2");
        // if we should step
		// stop at the first s-step that is in the same StackFrame
		boolean shouldSuspend = false;
		if (isBreakPointHit){
			// we hit a break point
			// if stepping is active it should be cancelled
			if (eventSpecManager.isStepOverActive() || eventSpecManager.isStepIntoActive() || eventSpecManager.isStepReturnActive())
			{
				eventSpecManager.resetStep(currentState);
			}
			shouldSuspend = true;
		}
		else if (eventSpecManager.isStepOverActive())
		{
			// if level is the same
			if (eventSpecManager.getStepFrameLevel() == currentState.getCurrentFrameLevel())
			{
				// rule/strategy location are the same
				boolean sameLocation = eventSpecManager.getStepFrame().getLocationInfo().equals(currentState.currentFrame().getLocationInfo());
				boolean sameFilename = eventSpecManager.getStepFrame().getFilename().equals(currentState.currentFrame().getFilename());
				boolean sameName = eventSpecManager.getStepFrame().getName().equals(currentState.currentFrame().getName());
				if (sameLocation && sameFilename && sameName)
				{
					// we hit the next debug event
					if (this.getEventType().equals(EventHandler.S_STEP))
					{
						// we hit the next s-step
						shouldSuspend = true;
						eventSpecManager.resetStep(currentState); // reset step
					}
					// S_VAR we can ignore
					// S_ENTER/R_ENTER should never happen is the same StackFrame
					// S_EXIT/R_EXIT can happen
					else if (this.getEventType().equals(EventHandler.S_EXIT) || this.getEventType().equals(EventHandler.R_EXIT))
					{
						// we have hit the s-exit/r-exit of the frame in which the step occured.
						shouldSuspend = true;
						eventSpecManager.resetStep(currentState); // reset step
					}
				}
			}
			else if (eventSpecManager.getStepFrameLevel() > currentState.getCurrentFrameLevel()
					&& (this.getEventType().equals(EventHandler.S_EXIT)
							|| this.getEventType().equals(EventHandler.R_EXIT)
							|| this.getEventType().equals(EventHandler.S_ENTER)
							|| this.getEventType().equals(EventHandler.R_ENTER)
							|| this.getEventType().equals(EventHandler.S_STEP)))
			{
				// what if the current stackframe level is smaller that the stepFrameLevel? We must have missed an r-exit/s-exit
				// stop at the first s-step, s-exit, s-enter, r-exit, r-enter (s-var is ingnored)
				log("Missed step over curLevel="+currentState.getCurrentFrameLevel() + " stepOverInLevel="+eventSpecManager.getStepFrameLevel());
				shouldSuspend = true;
				eventSpecManager.resetStep(currentState); // reset step
				
			}
		} else if (eventSpecManager.isStepIntoActive())
		{
			// an new debug event was fired, this should be an s-enter or r-enter as we can only step into strategies or rules that are debuggable
			// if the event is s-step we just did a normal step over, cancel the stepinto event and just resume
			
			// level of the current stackframe should equal (stepFrameLevel+1)
			// and we should have stopped at a s-enter/r-enter
			int stepIntoFrameLevel = eventSpecManager.getStepFrameLevel() + 1; 
			// TODO: does the stacklevel really matter, or is it suffice to say currentState.getCurrentFrameLevel() > eventSpecManager.getStepFrameLevel()
			// maybe the step into strategy has no debug information but it calls another strategy which does have step into information....?
			if (stepIntoFrameLevel == currentState.getCurrentFrameLevel() && 
					(this.getEventType().equals(EventHandler.S_ENTER)
					|| this.getEventType().equals(EventHandler.R_ENTER))
					)
			{
				shouldSuspend = true;
				eventSpecManager.resetStep(currentState); // reset step
			}
			else if (this.getEventType().equals(EventHandler.S_ENTER)
					||  this.getEventType().equals(EventHandler.R_ENTER)
					||  this.getEventType().equals(EventHandler.R_EXIT)
					|| this.getEventType().equals(EventHandler.S_EXIT)
					|| this.getEventType().equals(EventHandler.S_STEP))
			{

				// could not do a s-enter, we just did an s-exit/r-exit or s-step
				// just treat it as an s-step
				shouldSuspend = true;
				eventSpecManager.resetStep(currentState); // reset step
			}
		}
		else if (eventSpecManager.isStepReturnActive())
		{
			// suspend if we get an event of the parent StackFrame of getStepFrame
			// stepIntoFrameLevel - 1 = getCurrentFrameLevel()
			int parentFrameLevel = eventSpecManager.getStepFrameLevel() - 1;
			if (parentFrameLevel == currentState.getCurrentFrameLevel())
			{
				// it does not matter what the eventType is of the fired debug event as long as it isn't an s-var
				if (!this.getEventType().equals(EventHandler.S_VAR))
				{
					shouldSuspend = true;
					eventSpecManager.resetStep(currentState); // reset step
				}
			}
			else if (currentState.getCurrentFrameLevel() < parentFrameLevel)
			{
				// the direct parent frame did not have any debug information, but stop at the first
				// debug event in one of the parent frames (ignore s-var events)
				if (!this.getEventType().equals(EventHandler.S_VAR))
				{
					shouldSuspend = true;
					eventSpecManager.resetStep(currentState); // reset step
				}
			}
		}

		EventProfiler.instance.subMark(markName, "SUSPEND-3");
		// TODO assert
		if (shouldSuspend && currentState.isStepping())
		{
			// the program suspends but we are still stepping
			// TODO: this should never occur...
			log("The program suspended but we are still stepping!");
			
		}

        return shouldSuspend; // if break point exists suspend thread
	}
	
	/**
	 * Override this method when some stuff needs to be done if this DebugEvent occurs.
	 * Always call super to update the location info..
	 * @param strategoState 
	 */
	public void processDebugEvent(StrategoState strategoState) 
	{
		// update the current location
		String markName = "SUPERPDE_" + this.getEventType();
		EventProfiler.instance.startMark(markName);
		
		LocationInfo locationInfo = this.getLocationInfo();
		
		EventProfiler.instance.subMark(markName, "D-1");
		
		strategoState.currentFrame().setCurrentLocationInfo(locationInfo, this.getEventType());
		
		EventProfiler.instance.subMark(markName, "D-2");
		
	}
	
	protected abstract BreakPoint createBreakPoint(StrategoState currentState);

	public abstract String getEventType();

	public abstract boolean isEnter();
	
	public abstract boolean isExit();
	
	protected void log(String message)
	{
		System.out.println(message);
	}
}
