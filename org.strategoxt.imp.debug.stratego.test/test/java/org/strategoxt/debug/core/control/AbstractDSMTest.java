package org.strategoxt.debug.core.control;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.spoofax.terms.StringTermReader;
import org.spoofax.terms.TermFactory;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyStepBreakPoint;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;
import org.strategoxt.debug.core.util.table.EventEntry;
import org.strategoxt.debug.core.util.table.EventTable;
import org.strategoxt.imp.debug.stratego.runtime.ClasspathHandler;

public abstract class AbstractDSMTest {

	protected TermFactory termFactory = new TermFactory();
	protected StringTermReader termReader = new StringTermReader(termFactory);
	
	/**
	 * Although we won't compile in DSM testcases, the settings will hold some important paths. 
	 */
	protected DebugSessionSettings debugSessionSettings = null;
	
	/**
	 * Project name is the name of the folder that is the base directory that contains the necessary files.
	 * @param projectName
	 */
	protected void createDebugSessionSettings(String projectName)
	{
		// Although we won't compile in DSM testcases we still construct the settings some we can query the object for some paths..
		this.debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		this.debugSessionSettings.setTableDirectory(debugSessionSettings.getStrategoDirectory());
		checkProjectExists(debugSessionSettings);
	}
	
	protected VMMonitorTestImpl2 vmMonitor = null;
	
	protected DebugSessionManager createDebugSessionManager() {
		this.vmMonitor = new VMMonitorTestImpl2(this);
		DebugSessionManager dsm = new DebugSessionManager(vmMonitor);
		vmMonitor.setDSM(dsm);

		Assert.assertNotNull(this.debugSessionSettings);
		dsm.getEventSpecManager().initializeTable(this.debugSessionSettings.getTableDirectory());
		return dsm;
	}
	
	
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
	public DebugSessionManager start(DebugSessionManager manager, String mainArgs, String connectorType)
	{
		// set the application binary directory on the classpath
		// any applications requiring additional jars should already be set on the classpath using addToClasspath
		this.addToClasspath(debugSessionSettings.getClassDirectory());
		// set strategoxt.jar on the classpath
		String strategoXTJar = StrategoFileManager.getStrategoXTJar();
		this.addToClasspath(new Path(strategoXTJar));
		// set runtime jars on the classpath
		this.addToClasspath(ClasspathHandler.getClasspathEntries());
		
		Assert.assertNotNull(debugSessionSettings);
		Assert.assertNotNull(classpaths);
		
		IPath tableDirectory = this.debugSessionSettings.getTableDirectory();
		Assert.assertNotNull(tableDirectory);
		
		long start = System.currentTimeMillis();
		manager.initVM(mainArgs, classpaths, tableDirectory, connectorType);
		manager.setupEventListeners();
		manager.redirectOutput();
		manager.runVM();
		// runVM waits for the threads to end
		long end = System.currentTimeMillis();
		// check if any Exceptions were thrown
		checkThreadFailures();
		long duration = end - start;
		System.out.println("DURATION: " + duration);
		return manager;
	}
	
	private List<IPath> classpaths = new ArrayList<IPath>();
	
	/**
	 * Path can point to a folder or a jar.
	 * @param path
	 */
	protected void addToClasspath(IPath path)
	{
		classpaths.add(path);
	}
	
	/**
	 * Adds multiple paths to the classpath.
	 * @param path
	 */
	protected void addToClasspath(Collection<IPath> path)
	{
		classpaths.addAll(path);
	}
	
	public DebugSessionManager start(DebugSessionManager manager, String mainArgs)
	{
		return this.start(manager, mainArgs, "LAUNCH");
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
	
	protected void checkProjectExists(DebugSessionSettings debugSessionSettings)
	{
		File f = debugSessionSettings.getProjectDirectory().toFile();
		Assert.assertTrue("Directory does not exist.\nRun DebugCompiler TestSuite.", f.exists());
		Assert.assertTrue("Not a directory or does not exist.\nRun DebugCompiler TestSuite.", f.isDirectory());
	}
}
