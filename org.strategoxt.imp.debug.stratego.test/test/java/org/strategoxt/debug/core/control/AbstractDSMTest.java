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
	 * Start a DebugSession using the given main arguments and classpath.
	 * Use the connectorType to specify how the VM will be launched and connected to the debugger.
	 * @param manager
	 * @param mainArgs
	 * @param classpath
	 * @return
	 */
	public DebugSessionManager start(DebugSessionManager manager, String mainArgs, String classpath, String connectorType)
	{
		manager.initVM(manager.getDebugSessionSettings(), mainArgs, classpath, connectorType);
		manager.setupEventListeners();
		manager.redirectOutput();
		manager.runVM();
		// runVM waits for the threads to end
		// check if any Exceptions were thrown
		checkThreadFailures();
		return manager;
	}
	
	/**
	 * classPath contains the binary files of the compiled strj program
	 * @param mainArgs
	 * @param classpath
	 */
	public DebugSessionManager start(DebugSessionManager manager, String mainArgs, String classpath)
	{
		// Default use the sun launch
		return this.start(manager, mainArgs, classpath, "LAUNCH");
		/*
		manager.initVM(manager.getDebugSessionSettings(), mainArgs, classpath);
		manager.setupEventListeners();
		manager.redirectOutput();
		manager.runVM();
		// runVM waits for the threads to end
		// check if any Exceptions were thrown
		checkThreadFailures();
		return manager;
		*/
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
			String messages = "One of the treads threw an Exception: ";
			for(Throwable e : this.exceptions)
			{
				//System.out.println(e.getMessage());
				messages += "\n" + e.getMessage();
			}
			Assert.fail(messages);
		}
		
		if (this.failMessages != null && this.failMessages.size() > 0)
		{
			String messages = "Assertion failed: ";
			for(String message : this.failMessages)
			{
				//System.out.println("FAILED: " + message);
				messages += "\n" + message;
			}
			Assert.fail(messages);
		}
	}

	private List<String> failMessages = new ArrayList<String>();
	
	/**
	 * Child threads report their assertion failures via this method.
	 * @param message
	 */
	public void reportAssertFailure(String message)
	{
		//Assert.fail(message);
		this.failMessages.add(message);
	}
}
