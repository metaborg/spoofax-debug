package org.strategoxt.debug.core.eventspec;

import java.io.File;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.strategoxt.debug.core.control.events.EventHandler;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.FileUtil;
import org.strategoxt.debug.core.util.table.EventTable;
import org.strategoxt.debug.core.util.table.OffsetTable;
import org.strategoxt.imp.debug.stratego.transformer.strategies.ffl_util.LineLengthTable;

public class EventSpecManager {

	/**
	 * Used to convert position in the textfile to debug breakpoints. for example, a position can correspond to a s-step or a s-enter.
	 */
	private EventTable eventTable = null;
	
	private LineLengthTable lineLengthTable = null;
	
	//private DebugSessionSettings debugSessionSettings = null;
	/**
	 * A path to the directory that contains the offset and table files.
	 * Offset is used to convert a linenumber + token_line_offset (relative to the line) to a token_file_offset (relative to the start of the file).
	 * Table is used to find a breakpoint that is applicable to the given linenumber +token_line_offset. 
	 */
	//private IPath tableDirectory = null;
	
	// a list of active breakpoints
	private EventSpecList eventSpecList = null;

	public EventSpecManager() {
		eventSpecList = new EventSpecList();
	}
	
	/**
	 * Initializes the EventTable and the LineLengthTable
	 */
	public void initializeTable(IPath tableDirectory)
	{
		if (tableDirectory == null)
		{
			System.err.println("No table directory...");
			return;
		}
		String extensionT = "table";
		List<String> matches = FileUtil.getFilesWithExtension(tableDirectory.toFile(), extensionT);
		// TODO: use the first match as we only support one file
		if (matches.size() > 0)
		{
			File location = tableDirectory.append(matches.get(0)).toFile();
			//String location ="/tmp/localvar_str/stratego/localvar.table";
			this.eventTable = EventTable.readEventTable(location);
		}
		
		String extensionO = "offset";
		matches = FileUtil.getFilesWithExtension(tableDirectory.toFile(), extensionO);
		// TODO: use the first match as we only support one file
		if (matches.size() > 0)
		{
			File location = tableDirectory.append(matches.get(0)).toFile();
			//String location ="/tmp/localvar_str/stratego/localvar.table";
			this.lineLengthTable = LineLengthTable.readLineLengthTable(location);
		}
	}

	/**
	 * Returns true if the given BreakPoint should suspend the vm.
	 * BreakPoint current should not be a virtual breakpoint (should not contain wildcards).
	 * @param current
	 * @return
	 */
	public boolean match(BreakPoint current) {
		if (current == null)
		{
			return false;
		}
		else if (current.isVirtual())
		{
			// The current breakpoint cannot be virtual.
			return false;
		}
		for(BreakPoint definedBreakPoint : this.eventSpecList.getBreakPoints())
		{
			// defined breakpoint may have wildcards
			boolean isMatch = definedBreakPoint.match(current);
			if (isMatch)
			{
				return true;
			}
		}
		return false;
	}

	public void add(BreakPoint bp) {
		this.eventSpecList.add(bp);
	}
	
	public boolean remove(BreakPoint bp)
	{
		return this.eventSpecList.remove(bp);
	}
	
	/**
	 * Removes all breakpoints.
	 */
	public void clear()
	{
		this.eventSpecList.clear();
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
	
	private LineLengthTable getLineLengthTable()
	{
		return this.lineLengthTable;
	}
	
	private OffsetTable offsetTable = null;
	
	public OffsetTable getOffsetTable(){
		if (this.offsetTable == null)
		{
			this.offsetTable = new OffsetTable(getLineLengthTable());
		}
		return this.offsetTable;
	}
	
	private void log(String message){
		System.out.println(message);
	}

}
