package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.table.EventTable;

public class DSMTestStepInto extends AbstractDSMTest {

	public static void main(String[] args) {
		DSMTestStepInto dsm = new DSMTestStepInto();
		//dsm.testStepping1();
		dsm.testStepping2();
		//dsm.testStepping3();
	}
	
	@org.junit.Test
	public void testStepping1()
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
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", "s-step", 47, 4, 47, 39)); // match-comments[localvar.str]@(47,4)47 39

		vmMonitor.addAction(VMMonitorTestImpl2.STEP_INTO);
		// perform a STEP_INTO, will hit
		// 52, 3
		//find-functions:
		//	definition* -> functions*
		//	with
		//		functions* := <filter(?Function(_,_))> definition*
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "find-functions", "s-enter", 52, 2, 55, 54));
	
		
		
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
		// perform a step_into when the current statement cannot be stepped into
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
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2(this);
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(51, eventTable.size());

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.TopStackFrame);
		
		// 55, 6
		// functions* := <filter(?Function(_,_))> definition*
		// in rule "find-functions"
		int lineNumber = 55;
		int startTokenPosition = 6;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "find-functions", "s-step", 55, 4, 55, 54)); // find-functions[localvar.str]@(55,4,55,54)

		vmMonitor.addAction(VMMonitorTestImpl2.STEP_INTO);
		// perform a STEP_INTO, but current statement cannot be stepped into
		
		
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
		System.out.println("EXIT");
	}
}