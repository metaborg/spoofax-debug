package org.strategoxt.debug.core.eventspec;

import java.util.List;

import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.FileUtil;
import org.strategoxt.debug.core.util.table.EventTable;

public class EventSpecManager {

	private EventTable eventTable = null;
	
	// true if the thread stopped in a rule/strategy and the stepNextEnter command was issued.
	// stepNextEnter means that if the rule/strategy in the current frame calls another user-defined rule/strategy that will fire a s-enter or r-enter
	private boolean stepNextEnter = false;
	
	private DebugSessionSettings debugSessionSettings = null;
	
	// a list of active breakpoints
	private EventSpecList eventSpecList = null;

	public EventSpecManager(DebugSessionSettings debugSessionSettings) {
		eventSpecList = new EventSpecList();
		this.debugSessionSettings = debugSessionSettings;
		initializeTable();
	}
	
	private void initializeTable()
	{
		String extension = "table";
		List<String> matches = FileUtil.getFilesWithExtension(this.debugSessionSettings.getStrategoDirectory(), extension);
		// TODO: use the first match as we only support one file
		if (matches.size() > 0)
		{
			String location = this.debugSessionSettings.getStrategoDirectory() + "/" + matches.get(0);
			//String location ="/tmp/localvar_str/stratego/localvar.table";
			this.eventTable = EventTable.readEventTable(location);
		}
		
	}

	/**
	 * Returns true if the given RuleBreakPoint should suspend the vm.
	 * @param ruleBreakPoint
	 * @return
	 */
	public boolean match(BreakPoint b) {
		boolean match = false;
		if (stepNextEnter)
		{
			match = true;
			// reset the stepNextEnter
			stepNextEnter = false;
		}
		else if (this.eventSpecList.contains(b))
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

	public void setStepNextEnter() {
		this.stepNextEnter = true;
		
	}
	
	public EventTable getEventTable()
	{
		return this.eventTable;
	}

}
