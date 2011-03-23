package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.control.actions.ActionFactory;
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
		createDebugSessionSettings(projectName);
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;

		DebugSessionManager dsm = createDebugSessionManager();
		
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
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", "s-step", 47, 4, 47, 39, term)); // match-comments[localvar.str]@(47,4)47 39

		vmMonitor.addAction(ActionFactory.STEP_RETURN);
		// perform a STEP_RETURN, will hit s-exit of execute
		// 37, 3
		//  execute:
		//	  	input -> output
		//	  	with
		//	  	  output := <match-comments> input
		term = "[(Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Comment(\"fname\",\"laalalalalalalalalal\")),(Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Comment(\"new\",\"created!!\"))]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "execute", "s-var", 37, 3, 40, 38, term));
		
		
		
		
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs);
		System.out.println("EXIT");
	}
	
	@org.junit.Test
	public void testStepping2()
	{
		// suspend at breakpoint, do a STEP_RETURN but hit another breakpoint before the active strategy could exit
		// the step should be cancelled
		String projectName = "localvar";
		String strategoFilename = "localvar.str";
		createDebugSessionSettings(projectName);
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;

		DebugSessionManager dsm = createDebugSessionManager();
		
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
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", "s-step", 47, 4, 47, 39, term)); // match-comments[localvar.str]@(47,4)47 39


		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		lineNumber = 48;
		startTokenPosition = 8;
		eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);

		vmMonitor.addAction(ActionFactory.STEP_RETURN);
		// perform a STEP_RETURN, will hit breakpoint on line 48
		term = "[Function(\"fname\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")]),Function(\"nocomment\",[Assign(\"var_foo\",Add(Number(2),Number(7))),Print(\"var_foo\")])]";
		vmStateTester.addStrategoState(VMStateTester.createState("localvar.str", "match-comments", eventType, 48, 6, 48, 40, term)); // match-comments[localvar.str]@(48,6) 48,40


		
		
		
		
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs);
		System.out.println("EXIT");
	}
}
