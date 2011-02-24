package org.strategoxt.debug.core.control;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;
import org.strategoxt.debug.core.util.table.EventTable;

public class DSMTestDynamic extends AbstractDSMTest {

	public static void main(String[] args) {
		DSMTestDynamic test = new DSMTestDynamic();
		test.testStepBreakPoint();
	}
	
	@org.junit.Test
	public void testStepBreakPoint()
	{
		String projectName = "dynamic";
		String strategoFilename = "localvar.str";
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		checkProjectExists(debugSessionSettings);
		
		String input = StrategoFileManager.BASE + "/src/stratego/dynamic/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "dynamic.dynamic";
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
		Assert.assertEquals(82, eventTable.size());
		
		// 78, 8
		// ; c := <find-comment-by-name(|name)> c*
		// right after a definition of a local rule
		// in rule "find-comment-match"
		// only the dynamic rule "get-current-name" should be available at the first suspend
		// at the second suspend, also "baz-rule" will be available
		int lineNumber = 78;
		int startTokenPosition = 8;
		String eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		
		// 93, 6
		// ; comment := (<debug(!"stuff:"); first> c-filtered*) //  <+ !Comment(name, "created!!")
		// current active rule calls a dynamic strategy
		// in rule "find-comment-by-name"
		// will show 2 dynamic rules: "get-current-name" and "baz-rule"
		lineNumber = 93;
		startTokenPosition = 6;
		eventType = "s-step";
		this.addBP(dsm, strategoFilename, lineNumber, startTokenPosition, eventType);
		
		// TODO: test set breakpoint on dynamic rule
		/*
		// 49, 8
		// out := <match-f-and-c> (f*, c*)
		entries = eventTable.getEventEntries(49, 8, "s-step");
		Assert.assertEquals(1, entries.size());
		
		bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 49);
		dsm.getEventSpecManager().add(bp);
		*/
		
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		String term = null;
		term = "\"fname\"";
		vmStateTester.addStrategoState("find-comment-match", termReader.parseFromString(term));
		term = "[Comment(\"fname\",\"laalalalalalalalalal\")]";
		vmStateTester.addStrategoState("find-comment-by-name", termReader.parseFromString(term));
		term = "\"nocomment\"";
		vmStateTester.addStrategoState("find-comment-match", termReader.parseFromString(term));
		term = "[]";
		vmStateTester.addStrategoState("find-comment-by-name", termReader.parseFromString(term));
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
	}
	



}
