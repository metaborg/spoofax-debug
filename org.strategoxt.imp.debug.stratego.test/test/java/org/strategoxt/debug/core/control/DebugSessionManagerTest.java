package org.strategoxt.debug.core.control;

import java.util.List;
import java.util.Map.Entry;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.DebugCompilerTest;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.RuleEnterBreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyEnterBreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyStepBreakPoint;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.table.EventEntry;
import org.strategoxt.debug.core.util.table.EventTable;

public class DebugSessionManagerTest {

	
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
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(DebugCompilerTest.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl1 vmMonitor = new VMMonitorTestImpl1();
		DebugSessionManager dsm = this.setUp(debugSessionSettings, mainArgs, classpath, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester();
		vmStateTester.addName("find-comment-match");
		vmStateTester.addName("find-comment-match");
		vmMonitor.setVMStateTester(vmStateTester);
		
		// create a breakpoint
		BreakPoint bp = null;
		bp = new RuleEnterBreakPoint("find-comment-match", -1); // should hit "find-comment-by-name" two times
		dsm.getEventSpecManager().add(bp);
		System.out.println("RUN");
	}
	
	// stratego program should already be compiled
	@org.junit.Test
	public void testDSM2()
	{
		String projectName = "localvar";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(DebugCompilerTest.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl1 vmMonitor = new VMMonitorTestImpl1();
		DebugSessionManager dsm = this.setUp(debugSessionSettings, mainArgs, classpath, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester();
		vmStateTester.addName("find-comment-match");
		vmStateTester.addName("first");
		vmStateTester.addName("find-comment-match");
		vmStateTester.addName("first");
		vmMonitor.setVMStateTester(vmStateTester);
		
		// create a breakpoint
		BreakPoint bp = null;
		bp = new RuleEnterBreakPoint("find-comment-match", -1); // should hit "find-comment-by-name" two times
		dsm.getEventSpecManager().add(bp);
		bp = new StrategyEnterBreakPoint("first", -1); // should hit two times
		dsm.getEventSpecManager().add(bp);
		System.out.println("RUN");
	}
	
	@org.junit.Test
	public void testStepBreakPoint()
	{
		String projectName = "localvar";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(DebugCompilerTest.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl1 vmMonitor = new VMMonitorTestImpl1();
		DebugSessionManager dsm = this.setUp(debugSessionSettings, mainArgs, classpath, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(46, eventTable.size());
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		List<EventEntry> entries = eventTable.getEventEntries(47, 8, "s-step");
		Assert.assertEquals(1, entries.size());
		
		BreakPoint bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 47);
		dsm.getEventSpecManager().add(bp);

		
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		entries = eventTable.getEventEntries(48, 8, "s-step");
		Assert.assertEquals(1, entries.size());
		
		bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 48);
		dsm.getEventSpecManager().add(bp);

		
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		entries = eventTable.getEventEntries(49, 8, "s-step");
		Assert.assertEquals(1, entries.size());
		
		bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 49);
		dsm.getEventSpecManager().add(bp);

		
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester();
		vmStateTester.addName("match-comments");
		vmStateTester.addName("match-comments");
		vmStateTester.addName("match-comments");
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
	}
	
	@org.junit.Test
	public void testStepVarBreakPoint()
	{
		String projectName = "localvar";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(DebugCompilerTest.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl1 vmMonitor = new VMMonitorTestImpl1();
		DebugSessionManager dsm = this.setUp(debugSessionSettings, mainArgs, classpath, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(46, eventTable.size());
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		List<EventEntry> entries = eventTable.getEventEntries(47, 8, "s-step");
		Assert.assertEquals(1, entries.size());
		
		BreakPoint bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 47);
		dsm.getEventSpecManager().add(bp);

		
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		entries = eventTable.getEventEntries(48, 8, "s-step");
		Assert.assertEquals(1, entries.size());
		
		bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 48);
		dsm.getEventSpecManager().add(bp);

		
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		entries = eventTable.getEventEntries(49, 8, "s-step");
		Assert.assertEquals(1, entries.size());
		
		bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 49);
		dsm.getEventSpecManager().add(bp);

		
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester();
		vmStateTester.addName("match-comments");
		vmStateTester.addName("match-comments"); // value f* should be set
		vmStateTester.addName("match-comments"); // value c* should be set
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
	}
	
	@org.junit.Test
	public void testBreakpointLookup()
	{
		String projectName = "localvar";
		// TODO: project should be compiled with debug info!
		
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(DebugCompilerTest.WORKING_DIR, projectName);
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/strategies/terms/test2.prog";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl1 vmMonitor = new VMMonitorTestImpl1();
		DebugSessionManager dsm = this.setUp(debugSessionSettings, mainArgs, classpath, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(46, eventTable.size());
		
		// find-comment-match s-enter is at 71,7
		List<EventEntry> entries = eventTable.getEventEntries(71, 7);
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
		VMStateTester vmStateTester = new VMStateTester();
		vmStateTester.addName("find-comment-match");
		vmStateTester.addName("find-comment-match");
		vmMonitor.setVMStateTester(vmStateTester);
		
		// create a breakpoint
		BreakPoint bp = null;
		bp = new RuleEnterBreakPoint(rEnter.getStrategyName(), -1); // should hit "find-comment-by-name" two times
		dsm.getEventSpecManager().add(bp);
		System.out.println("RUN");
	}
	
	/**
	 * classPath contains the binary files of the compiled strj program
	 * @param mainArgs
	 * @param classpath
	 */
	public DebugSessionManager setUp(DebugSessionSettings debugSessionSettings, String mainArgs, String classpath, VMMonitor vmMonitor)
	{
		DebugSessionManager manager = new DebugSessionManager(debugSessionSettings, vmMonitor);
		manager.initVM(mainArgs, classpath);
		//manager.initVM(mainArgs);
		manager.setupEventListeners();
		manager.redirectOutput();
		return manager;
		//manager.runVM();		
	}

	
	class VMMonitorTestImpl1 implements VMMonitor {

		private DebugSessionManager debugSessionManager;
		private VMStateTester vmStateTester;
		
		public VMMonitorTestImpl1() {

		}
		
		public void setVMStateTester(VMStateTester vmStateTester) {
			// TODO Auto-generated method stub
			this.vmStateTester = vmStateTester;
		}

		public void setDSM(DebugSessionManager dsm)
		{
			this.debugSessionManager = dsm;
		}
		
		public void stateChanged(StrategoState state) {
			// TODO Auto-generated method stub
			//System.out.println("state changed");
			String name = state.currentFrame().getName();
			boolean expected = vmStateTester.isNextHit(name);
			System.out.println("expected: " + expected);
			String message = "Hit " + name + ", but expected to hit " + vmStateTester.currentHit();
			Assert.assertTrue(message, expected);
			String termString = state.currentFrame().getCurrentTerm().toString();
			System.out.println("current: " + termString);
			for ( Entry<String, IStrategoTerm> entry : state.currentFrame().getVariables().entrySet() )
			{
				System.out.println("variable entry " + entry.getKey() + " # " + entry.getValue());
			}
			this.debugSessionManager.resumeVM();
		}

		public void vmEvent(String event) {
			// TODO Auto-generated method stub
			//System.out.println("vmEvent: " + event);
			if ("VMDEATH".equals(event))
			{
				// vm terminated
				if (this.vmStateTester.hasNextHit())
				{
					Assert.fail("VM has terminated but there are still some expected hits left...");
				}
			}
		}
		
	}
}
