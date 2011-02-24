package org.strategoxt.debug.core.eventspec;

import java.util.List;

import org.strategoxt.debug.core.control.events.EventHandler;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.FileUtil;
import org.strategoxt.debug.core.util.table.EventTable;
import org.strategoxt.debug.core.util.table.LineLengthTable;

public class EventSpecManager {

	/**
	 * Used to convert position in the textfile to debug breakpoints. for example, a position can correspond to a s-step or a s-enter.
	 */
	private EventTable eventTable = null;
	
	private LineLengthTable lineLengthTable = null;
	
	private DebugSessionSettings debugSessionSettings = null;
	
	// a list of active breakpoints
	private EventSpecList eventSpecList = null;

	public EventSpecManager(DebugSessionSettings debugSessionSettings) {
		eventSpecList = new EventSpecList();
		this.debugSessionSettings = debugSessionSettings;
		initializeTable();
	}
	
	/**
	 * Initializes the EventTable and the LineLengthTable
	 */
	private void initializeTable()
	{
		String extensionT = "table";
		List<String> matches = FileUtil.getFilesWithExtension(this.debugSessionSettings.getStrategoDirectory().toFile(), extensionT);
		// TODO: use the first match as we only support one file
		if (matches.size() > 0)
		{
			String location = this.debugSessionSettings.getStrategoDirectory() + "/" + matches.get(0);
			//String location ="/tmp/localvar_str/stratego/localvar.table";
			this.eventTable = EventTable.readEventTable(location);
		}
		
		String extensionO = "offset";
		matches = FileUtil.getFilesWithExtension(this.debugSessionSettings.getStrategoDirectory().toFile(), extensionO);
		// TODO: use the first match as we only support one file
		if (matches.size() > 0)
		{
			String location = this.debugSessionSettings.getStrategoDirectory() + "/" + matches.get(0);
			//String location ="/tmp/localvar_str/stratego/localvar.table";
			this.lineLengthTable = LineLengthTable.readLineLengthTable(location);
		}
	}

	/**
	 * Returns true if the given RuleBreakPoint should suspend the vm.
	 * @param ruleBreakPoint
	 * @return
	 */
	public boolean match(BreakPoint b) {
		boolean match = false;
		if (this.eventSpecList.contains(b))
		{
			// the given breakpoint matches one of the defined breakpoints
			match = true;
		}
		return match;
	}

	public void add(BreakPoint bp) {
		this.eventSpecList.add(bp);
	}
	
	public boolean remove(BreakPoint bp)
	{
		return this.eventSpecList.remove(bp);
	}
	
	// StackFrame in which the step was started
	private StrategoStackFrame stepFrame = null;
	
	// what was the level of the StrategoStackFrame when the step command was issued
	// 0-based
	private int stepFrameLevel = -1;
	
	// true if stepOver is active
	private boolean isStepOverActive = false;
	private boolean isStepReturnActive = false;
	private boolean isStepIntoActive = false;

	public StrategoStackFrame getStepFrame()
	{
		return this.stepFrame;
	}
	
	public int getStepFrameLevel()
	{
		return this.stepFrameLevel;
	}
	
	public boolean isStepReturnActive()
	{
		return this.isStepReturnActive;
	}

	public boolean isStepOverActive()
	{
		return this.isStepOverActive;
	}
	
	public boolean isStepIntoActive()
	{
		return this.isStepIntoActive;
	}
	
	public void setStepOver(StrategoState state)
	{
		if (state.currentFrame().getEventType().equals(EventHandler.S_EXIT)
				|| state.currentFrame().getEventType().equals(EventHandler.R_EXIT))
		{
			// can we step over an s-exit or r-exit?
			// we should suspend at the next s-step in the parent Frame of the current Frame
			int parentIndex = state.size() - 2;
			if (parentIndex < 0)
			{
				// no parent index
				// we are at the exit of the main strategy!
				log("At exit of top level strategy, just continue..");
				return;
			}
			stepFrame = state.get(parentIndex);
			stepFrameLevel = parentIndex;
			isStepOverActive = true;
		}
		else
		{
			stepFrame = state.currentFrame();
			stepFrameLevel = state.size() - 1;
			isStepOverActive = true;
		}
		
		state.setStepping(true);
	}
	
	
	public void setStepInto(StrategoState state)
	{
		if (state.currentFrame().getEventType().equals(EventHandler.S_STEP))
		{
			// we can only step into a strategy or rule
			stepFrame = state.currentFrame();
			stepFrameLevel = state.getCurrentFrameLevel();
			isStepIntoActive = true;
		}
		else
		{
			// current stackframe is suspend at a s-exit/r-exit/s-enter/r-enter
			// just treat it as an step over
			log("Cannot step into " + state.currentFrame().getEventType() + ", just do a step over...");
			setStepOver(state);
		}
		state.setStepping(true);
	}
	
	public void setStepReturn(StrategoState state)
	{
		if (state.getCurrentFrameLevel() == 0)
		{
			// we are at the main strategy, cannot step return
			log("Cannot step return in top level strategy, just continue...");
			return;
		}
		stepFrame = state.currentFrame();
		stepFrameLevel = state.getCurrentFrameLevel();
		isStepReturnActive = true;
		
		state.setStepping(true);
	}

	public void resetStep(StrategoState state)
	{
		this.stepFrame = null;
		this.stepFrameLevel = -1;
		this.isStepOverActive = false;
		this.isStepIntoActive = false;
		this.isStepReturnActive = false;
		state.setStepping(false);
	}
	
	public EventTable getEventTable()
	{
		return this.eventTable;
	}
	
	public LineLengthTable getLineLengthTable()
	{
		return this.lineLengthTable;
	}
	
	private void log(String message){
		System.out.println(message);
	}

}
