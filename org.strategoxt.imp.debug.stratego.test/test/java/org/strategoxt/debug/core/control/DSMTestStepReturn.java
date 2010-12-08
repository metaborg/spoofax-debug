package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.table.EventTable;

public class DSMTestStepReturn extends AbstractDSMTest {

	public static void main(String[] args) {
		DSMTestStepReturn dsm = new DSMTestStepReturn();
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

		vmMonitor.addAction(VMMonitorTestImpl2.STEP_RETURN);
		// perform a STEP_RETURN, will hit s-exit of execute
		// 37, 3
		//  execute:
		//	  	input -> output
		//	  	with
		//	  	  output := <match-comments> input
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "execute", "s-var", 40, 6, 40, 38));
		
		
		
		
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
		// suspend at breakpoint, do a STEP_RETURN but hit another breakpoint before the active strategy could exit
		// the step should be cancelled
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


		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		lineNumber = 48;
		startTokenPosition = 8;
		eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);

		vmMonitor.addAction(VMMonitorTestImpl2.STEP_RETURN);
		// perform a STEP_RETURN, will hit breakpoint on line 48
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 48, 6, 48, 40)); // match-comments[localvar.str]@(48,6) 48,40


		
		
		
		
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
		System.out.println("EXIT");
	}
}
