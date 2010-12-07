package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugSessionSettings;
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
		
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(StrategoFileManager.WORKING_DIR, projectName);
		
		String input = StrategoFileManager.BASE + "/src/stratego/testimports/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "testimports.testimports";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl2 vmMonitor = new VMMonitorTestImpl2();
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(48, eventTable.size());
		
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
		vmStateTester.addStrategoState("match-comments");
		vmStateTester.addStrategoState("first");
		vmStateTester.addStrategoState("first");
		vmMonitor.setVMStateTester(vmStateTester);
		
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
	}
}
