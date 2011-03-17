package org.strategoxt.debug.core.control;

import static org.junit.Assert.*;
import junit.framework.Assert;

import org.StrategoFileManager;
import org.junit.Test;
import org.strategoxt.debug.core.eventspec.EnterBreakPoint;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;
import org.strategoxt.debug.core.util.table.EventTable;

public class DSMTestSetInput extends AbstractDSMTest {

	@Test
	public void testSetInput() throws Exception {
		// launch the setinput.str
		// suspend on the first s-enter or r-enter
		// set the current term
		// continue
		
		String projectName = "setinput";
		String strategoFilename = "setinput.str";
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		checkProjectExists(debugSessionSettings);
		
		String input = StrategoFileManager.BASE + "/src/stratego/setinput/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "setinput.setinput";
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
		// Assert.assertEquals(6, eventTable.size()); // TODO: find values

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.TopStackFrame);
		//VMStateTester vmStateTester = null; // TODO: test states...
		
		String filename = "";
		String name = "";
		int lineNumber = -1;
		int startTokenPosition = -1;
		EnterBreakPoint bp = new EnterBreakPoint(filename, name, lineNumber, startTokenPosition);
		dsm.getEventSpecManager().add(bp);
		
		String term;
		term = "[\"setinput\",\"-i\",\"/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/src/stratego/setinput/run.input\"]";
		vmStateTester.addStrategoState(VMStateTester.createState("setinput.str", "main", "s-enter", 26, 2, 26, 91, term)); // match-comments[localvar.str]@(47,4)47 39

		// TODO: implement change current term action
		String action = VMMonitorTestImpl2.CHANGE + "\"theNewCurrentTerm\"";
		vmMonitor.addAction(action);
		
		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		
		term = "\"theNewCurrentTerm\"";
		vmStateTester.addStrategoState(VMStateTester.createState("setinput.str", "main", "s-step", 26, 9, 26, 28, term)); // match-comments[localvar.str]@(47,4)47 39

		vmMonitor.addAction(VMMonitorTestImpl2.RESUME);
		
		// run
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
		System.out.println("EXIT");
	}
}
