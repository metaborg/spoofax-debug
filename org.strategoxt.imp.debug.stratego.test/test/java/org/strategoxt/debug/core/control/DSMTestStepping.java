package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.control.actions.ActionFactory;
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
		checkProjectExists(debugSessionSettings);
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory().toOSString(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2(this);
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertNotNull("EventTable is not initialized, check if the table file exists. ", eventTable);
		Assert.assertEquals(74, eventTable.size());

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.TopStackFrame);
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		int lineNumber = 47;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		String term = null;
		term = "Program(\"progname\",[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\"),Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])])";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 47, 4, 47, 39, term)); // match-comments[localvar.str]@(47,4)47 39

		vmMonitor.addAction(ActionFactory.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		term = "[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\"),Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 47, 11, 47, 25, term)); // match-comments[localvar.str]@(48,6) 48,40
		
		vmMonitor.addAction(ActionFactory.STEP_OVER);
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		term = "[Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 48, 6, 48, 40, term)); // match-comments[localvar.str]@(49,6) 49 37
	
		

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
		checkProjectExists(debugSessionSettings);
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory().toOSString(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2(this);
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertNotNull("EventTable is not initialized, check if the table file exists. ", eventTable);
		Assert.assertEquals(74, eventTable.size());

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.TopStackFrame);
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		int lineNumber = 47;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		String term = null;
		term = "Program(\"progname\",[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\"),Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])])";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 47, 4, 47, 39, term)); // match-comments[localvar.str]@(47,4)47 39

		vmMonitor.addAction(ActionFactory.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		lineNumber = 48;
		startTokenPosition = 8;
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		term = "[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\"),Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 47, 11, 47, 25, term)); // match-comments[localvar.str]@(48,6) 48,40
		
		vmMonitor.addAction(ActionFactory.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		// in rule "match-comments"
		lineNumber = 49;
		startTokenPosition = 8;
		eventType = "s-step";
		term = "[Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 48, 6, 48, 40, term)); // match-comments[localvar.str]@(49,6) 49 37
	
		vmMonitor.addAction(ActionFactory.STEP_OVER);
		term = "[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\"),Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 48, 13, 48, 26, term)); // match-comments[localvar.str]@(49,6) 49 37
		
		vmMonitor.addAction(ActionFactory.STEP_OVER);
		term = "[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\")]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 49, 6, 49, 37, term)); // match-comments[localvar.str]@(49,6) 49 37
		
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
		checkProjectExists(debugSessionSettings);
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory().toOSString(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2(this);
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertNotNull("EventTable is not initialized, check if the table file exists. ", eventTable);
		Assert.assertEquals(74, eventTable.size());

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
		
		String term = null;
		term = "Program(\"progname\",[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\"),Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])])";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", "s-step", 47, 4, 47, 39, term));
		
		vmMonitor.addAction(ActionFactory.STEP_OVER);
		// perform a STEP_OVER, should hit
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		// but we placed a breakpoint in find-functions. VM will suspend at 55,4
		term = "[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\"),Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", "s-step", 47, 11, 47, 25, term));
		
		vmMonitor.addAction(ActionFactory.STEP_OVER);
		// next s-step is (s-step(| "localvar.str", "match-comments", LocationInfo("48", "6", "48", "40"))
		// for call ; c* := <s-step(| "localvar.str", "match-comments", LocationInfo("48", "13", "48", "26")); find-comments> definitions*

		// but a breakpoint was placed in "find-functions"
		term = "[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\"),Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "find-functions", "s-step", 55, 4, 55, 54, term));
		

		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
		System.out.println("EXIT");
	}
	

}
