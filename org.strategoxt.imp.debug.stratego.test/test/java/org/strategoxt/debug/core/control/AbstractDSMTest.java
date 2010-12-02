package org.strategoxt.debug.core.control;

import java.util.List;

import junit.framework.Assert;

import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyStepBreakPoint;
import org.strategoxt.debug.core.util.table.EventEntry;
import org.strategoxt.debug.core.util.table.EventTable;

public abstract class AbstractDSMTest {

	
	protected void addBP(DebugSessionManager dsm, String filename, int lineNumber, int startTokenPosition, String eventType)
	{
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		List<EventEntry> entries = eventTable.getEventEntries(filename, lineNumber, startTokenPosition, eventType);
		Assert.assertEquals(1, entries.size());
		
		// a breakpoint may be placed at any place in the LocationInfo that is defined by a statement
		// lineNumber and startTokenPosition should lie in the selection defined by LocationInfo
		// use these to lookup the actual LocationInfo used by the breakpoint
		EventEntry match = entries.get(0);
		BreakPoint bp = null;
		bp = new StrategyStepBreakPoint(filename, match.getStrategyName(), match.getLocationInfo().getStart_line_num(), match.getLocationInfo().getStart_token_pos());
		dsm.getEventSpecManager().add(bp);
	}
	
	/**
	 * classPath contains the binary files of the compiled strj program
	 * @param mainArgs
	 * @param classpath
	 */
	public static DebugSessionManager start(DebugSessionManager manager, String mainArgs, String classpath)
	{
		manager.initVM(mainArgs, classpath);
		//manager.initVM(mainArgs);
		manager.setupEventListeners();
		manager.redirectOutput();
		manager.runVM();		
		return manager;
	}
}
