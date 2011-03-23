package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.table.EventTable;

public class DSMTestImports extends AbstractDSMTest {

	public static void main(String[] args) {
		DSMTestImports test = new DSMTestImports();
		test.testStepBreakPoint();
	}
	
	@org.junit.Test
	public void testStepBreakPoint()
	{
		String projectName = "testimports";
		String localvarFilename = "localvar.str";
		String utilsFilename = "localmod/util/utils.str";
		
		createDebugSessionSettings(projectName);
		
		String input = StrategoFileManager.BASE + "/src/stratego/testimports/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "testimports.testimports";
		String mainArgs = mainClass + " " + argsForMainClass;
		
		DebugSessionManager dsm = createDebugSessionManager();
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertNotNull("EventTable is not initialized, check if the table file exists. ", eventTable);
		Assert.assertEquals(69, eventTable.size());
		
		// localvar.str # match-comments # 31, 8
		// ; out := <match-f-and-c> (f*, c*)
		int lineNumber = 31;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, localvarFilename, lineNumber, startTokenPosition, eventType);
		
		// localmod/util/utils.str # first # 12, 4
		// debug(!"first: ") ;
		lineNumber = 12;
		startTokenPosition = 4;
		eventType = "s-step";
		this.addBP(dsm, utilsFilename, lineNumber, startTokenPosition, eventType);
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		String term = null;
		term ="[Comment(\"fname\",\"laalalalalalalalalal\"),Comment(\"this\",\"this text\"),Comment(\"that\",\"that text\")]";
		vmStateTester.addStrategoState("match-comments", termReader.parseFromString(term));
		term = "[Comment(\"fname\",\"laalalalalalalalalal\")]";
		vmStateTester.addStrategoState("first", termReader.parseFromString(term));
		term = "[]";
		vmStateTester.addStrategoState("first", termReader.parseFromString(term));
		vmMonitor.setVMStateTester(vmStateTester);
		
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs);
	}
}
