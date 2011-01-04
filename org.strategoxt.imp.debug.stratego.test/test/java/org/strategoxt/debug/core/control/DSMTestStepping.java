package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;
import org.strategoxt.debug.core.util.table.EventTable;

public class DSMTestStepping extends AbstractDSMTest {

	public static void main(String[] args) {
		DSMTestStepping dsm = new DSMTestStepping();
		dsm.testStepping1();
		dsm.testStepping2();
		dsm.testStepping3();
	}
	
	@org.junit.Test
	public void testStepping1()
	{
		String projectName = "localvar";
		String strategoFilename = "localvar.str";
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2(this);
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(51, eventTable.size());

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.TopStackFrame);
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		int lineNumber = 47;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 47, 4, 47, 39)); // match-comments[localvar.str]@(47,4)47 39

		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		lineNumber = 48;
		startTokenPosition = 8;
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 48, 6, 48, 40)); // match-comments[localvar.str]@(48,6) 48,40
		
		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		// in rule "match-comments"
		lineNumber = 49;
		startTokenPosition = 8;
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 49, 6, 49, 37)); // match-comments[localvar.str]@(49,6) 49 37
	
		

		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
		System.out.println("EXIT");
	}
	
	@org.junit.Test
	public void testStepping2()
	{
		// step over at the last statement in a rule or strategy
		String projectName = "localvar";
		String strategoFilename = "localvar.str";
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2(this);
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(51, eventTable.size());

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.TopStackFrame);
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		int lineNumber = 47;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 47, 4, 47, 39)); // match-comments[localvar.str]@(47,4)47 39

		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		lineNumber = 48;
		startTokenPosition = 8;
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 48, 6, 48, 40)); // match-comments[localvar.str]@(48,6) 48,40
		
		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		// in rule "match-comments"
		lineNumber = 49;
		startTokenPosition = 8;
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 49, 6, 49, 37)); // match-comments[localvar.str]@(49,6) 49 37
	
		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// perform a STEP_OVER, no s-steps left, stop at s-exit
		//match-comments[localvar.str]@(43,2) 49 37
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 43, 2, 49, 37)); // match-comments[localvar.str]@(49,6) 49 37
		
		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// hit s-exit of match-comments, perform a STEP_OVER
		// should suspend at execute, execute is the caller of match-comments, will suspend at the s-exit of execute
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "execute", eventType, 37, 3, 40, 38)); // match-comments[localvar.str]@(49,6) 49 37
		
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
		System.out.println("EXIT");
	}
	
	@org.junit.Test
	public void testStepping3()
	{
		// step over a statement in a rule, but hit a breakpoint while stepping
		// step should be cancelled
		
		String projectName = "localvar";
		String strategoFilename = "localvar.str";
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2(this);
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(51, eventTable.size());

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.TopStackFrame);
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		int lineNumber = 47;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		
		
		// add a breakpoint in strategy that we are going to step over, the step should be cancelled
		lineNumber = 55;
		startTokenPosition = 6;
		// 			functions* := <filter(?Function(_,_))> definition*
		// in "find-functions"
		eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		
		
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", "s-step", 47, 4, 47, 39)); // match-comments[localvar.str]@(47,4)47 39
		
		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// perform a STEP_OVER, should hit
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		// but we placed a breakpoint in find-functions. VM will suspend at 55,4
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "find-functions", "s-step", 55, 4, 55, 54)); // match-comments[localvar.str]@(48,6) 48,40
		


		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
		System.out.println("EXIT");
	}
	

}
