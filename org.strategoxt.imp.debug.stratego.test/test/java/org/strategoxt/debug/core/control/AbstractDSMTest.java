package org.strategoxt.debug.core.control;

import java.util.ArrayList;
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
	public DebugSessionManager start(DebugSessionManager manager, String mainArgs, String classpath)
	{
		manager.initVM(manager.getDebugSessionSettings(), mainArgs, classpath);
		manager.setupEventListeners();
		manager.redirectOutput();
		manager.runVM();
		// runVM waits for the threads to end
		// check if any Exceptions were thrown
		checkThreadFailures();
		return manager;
	}
	
	private List<Throwable> exceptions = new ArrayList<Throwable>();
	
	public void caughtThrowableInThread(Throwable e)
	{
		System.out.println("Caught Throwable in thread:");
		e.printStackTrace();
		//Assert.fail("Caught Throwable in thread");
		exceptions.add(e);
	}
	
	private void checkThreadFailures()
	{
		if (this.exceptions != null && this.exceptions.size() > 0)
		{
			Assert.fail("One of the treads threw an Exception...");
		}
	}
}
