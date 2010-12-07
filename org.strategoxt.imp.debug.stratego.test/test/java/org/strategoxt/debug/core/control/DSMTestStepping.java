package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.table.EventTable;

public class DSMTestStepping extends AbstractDSMTest {

	public static void main(String[] args) {
		DSMTestStepping dsm = new DSMTestStepping();
		dsm.testStepping();
	}
	
	public void testStepping()
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

		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.TopStackFrame);
		
		// 47, 8
		// f* := <find-functions> definitions* // find functions
		// in rule "match-comments"
		int lineNumber = 47;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(createState("localvar.str", "match-comments", 47, 4, 47, 39)); // match-comments[localvar.str]@(47,4)47 39

		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 48, 8
		// c* := <find-comments> definitions* // find comments
		// in rule "match-comments"
		lineNumber = 48;
		startTokenPosition = 8;
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(createState("localvar.str", "match-comments", 48, 6, 48, 40)); // match-comments[localvar.str]@(48,6) 48,40
		
		vmMonitor.addAction(VMMonitorTestImpl2.STEP_OVER);
		// perform a STEP_OVER, will hit
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		// in rule "match-comments"
		lineNumber = 49;
		startTokenPosition = 8;
		eventType = "s-step";
		//this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		vmStateTester.addStrategoState(createState("localvar.str", "match-comments", 49, 6, 49, 37)); // match-comments[localvar.str]@(49,6) 49 37
	
		

		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
	}
	
	/**
	 * Filename points to the stratego file name.
	 * Name points to the strategy or rule name.
	 * The four integers, startLineNum, startTokenPos, endLineNum, endTokenPos are used to create a LocationInfo object that points
	 * to the current active statement.
	 * @param filename
	 * @param name
	 * @param startLineNum
	 * @param startTokenPos
	 * @param endLineNum
	 * @param endTokenPos
	 * @return
	 */
	private StrategoState createState(String filename, String name, int startLineNum, int startTokenPos, int endLineNum,
			int endTokenPos)
	{
		StrategoState state = new StrategoState();
		LocationInfo currentLocationInfo = new LocationInfo(startLineNum, startTokenPos, endLineNum, endTokenPos);
		IStrategoTerm current = null;
		StrategoStackFrame frame = new StrategoStackFrame(filename, name, null, current);
		frame.setCurrentLocationInfo(currentLocationInfo);
		state.pushFrame(frame);
		return state;
	}
}
