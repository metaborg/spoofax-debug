package org.strategoxt.debug.core.control;

import java.util.List;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.RuleEnterBreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyEnterBreakPoint;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.table.EventEntry;
import org.strategoxt.debug.core.util.table.EventTable;

public class DebugSessionManagerTest extends AbstractDSMTest {
	
	public static void main(String[] args) {
		runLocalVar();
	}
	
	public static void runLocalVar()
	{
		DebugSessionManagerTest dsmt = new DebugSessionManagerTest();
		//dsmt.testDSM1();
		//dsmt.testDSM2();
		//dsmt.testBreakpointLookup();
		dsmt.testStepBreakPoint();
	}
	
	// stratego program should already be compiled
	@org.junit.Test
	public void testDSM1()
	{
		String projectName = "localvar";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(StrategoFileManager.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2();
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		vmStateTester.addStrategoState("find-comment-match");
		vmStateTester.addStrategoState("find-comment-match");
		vmMonitor.setVMStateTester(vmStateTester);
		
		// create a breakpoint
		BreakPoint bp = null;
		bp = new RuleEnterBreakPoint("localvar.str", "find-comment-match", -1, -1); // should hit "find-comment-by-name" two times
		dsm.getEventSpecManager().add(bp);
		
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
	}
	
	// stratego program should already be compiled
	@org.junit.Test
	public void testDSM2()
	{
		String projectName = "localvar";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(StrategoFileManager.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2();
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		vmStateTester.addStrategoState("find-comment-match");
		vmStateTester.addStrategoState("first");
		vmStateTester.addStrategoState("find-comment-match");
		vmStateTester.addStrategoState("first");
		vmMonitor.setVMStateTester(vmStateTester);
		
		// create a breakpoint
		BreakPoint bp = null;
		bp = new RuleEnterBreakPoint("localvar.str", "find-comment-match", -1, -1); // should hit "find-comment-by-name" two times
		dsm.getEventSpecManager().add(bp);
		bp = new StrategyEnterBreakPoint("localvar.str", "first", -1, -1); // should hit two times
		dsm.getEventSpecManager().add(bp);
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
	}
	
	@org.junit.Test
	public void testStepBreakPoint()
	{
		String projectName = "localvar";
		String strategoFilename = "localvar.str";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(StrategoFileManager.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2();
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(51, eventTable.size());
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		int lineNumber = 47;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);

		
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		lineNumber = 48;
		startTokenPosition = 8;
		eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		lineNumber = 49;
		startTokenPosition = 8;
		eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
	
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		vmStateTester.addStrategoState("match-comments");
		vmStateTester.addStrategoState("match-comments");
		vmStateTester.addStrategoState("match-comments");
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
	}
	
	@org.junit.Test
	public void testStepVarBreakPoint()
	{
		String projectName = "localvar";
		String strategoFilename = "localvar.str";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(StrategoFileManager.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2();
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(46, eventTable.size());
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		int lineNumber = 47;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);

		
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		lineNumber = 48;
		startTokenPosition = 8;
		eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);

		
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		lineNumber = 49;
		startTokenPosition = 8;
		eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);

		
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		vmStateTester.addStrategoState("match-comments");
		vmStateTester.addStrategoState("match-comments"); // value f* should be set
		vmStateTester.addStrategoState("match-comments"); // value c* should be set
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
	}
	
	@org.junit.Test
	public void testBreakpointLookup()
	{
		String projectName = "localvar";
		String strategoFilename = "localvar.str";
		// TODO: project should be compiled with debug info!
		
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(StrategoFileManager.WORKING_DIR, projectName);
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2();
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(46, eventTable.size());
		
		// find-comment-match s-enter is at 71,7
		List<EventEntry> entries = eventTable.getEventEntries(strategoFilename, 71, 7);
		Assert.assertEquals(2, entries.size()); // r-enter/r-exit
		EventEntry rEnter = null; // only use the r-enter
		for(EventEntry e : entries)
		{
			if ("r-enter".equals(e.getEventType()))
			{
				rEnter = e;
			}
		}
		Assert.assertEquals("find-comment-match", rEnter.getStrategyName());
		// found the "find-comment-match" rule in the table

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		vmStateTester.addStrategoState("find-comment-match");
		vmStateTester.addStrategoState("find-comment-match");
		vmMonitor.setVMStateTester(vmStateTester);
		
		// create a breakpoint
		BreakPoint bp = null;
		bp = new RuleEnterBreakPoint("localvar.str", rEnter.getStrategyName(), -1, -1); // should hit "find-comment-by-name" two times
		dsm.getEventSpecManager().add(bp);
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
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
