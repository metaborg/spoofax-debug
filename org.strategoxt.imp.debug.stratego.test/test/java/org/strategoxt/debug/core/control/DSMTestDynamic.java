package org.strategoxt.debug.core.control;

import java.util.List;
import java.util.Map.Entry;

import junit.framework.Assert;

import org.StrategoFileManager;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyStepBreakPoint;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.table.EventEntry;
import org.strategoxt.debug.core.util.table.EventTable;

public class DSMTestDynamic {

	public static void main(String[] args) {
		DSMTestDynamic test = new DSMTestDynamic();
		test.testStepBreakPoint();
	}
	
	@org.junit.Test
	public void testStepBreakPoint()
	{
		String projectName = "dynamic";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings(StrategoFileManager.WORKING_DIR, projectName);
		
		//String binBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/class";
		//String strategoBase = DebugCompilerTest.WORKING_DIR + "/" + projectName + "/stratego";
		
		String input = StrategoFileManager.BASE + "/src/stratego/dynamic/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "dynamic.dynamic";
		String mainArgs = mainClass + " " + argsForMainClass;
		String cp = /*strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + */ debugSessionSettings.getClassDirectory(); // was binBase
		String classpath = cp;
		
		VMMonitorTestImpl1 vmMonitor = new VMMonitorTestImpl1();
		DebugSessionManager dsm = new DebugSessionManager(debugSessionSettings, vmMonitor);
		vmMonitor.setDSM(dsm);
		
		//String location = debugSessionSettings.getStrategoDirectory() + "/" + projectName + ".table";
		//EventTable eventTable = EventTable.readEventTable(location);
		EventTable eventTable = dsm.getEventSpecManager().getEventTable();
		Assert.assertEquals(57, eventTable.size());
		
		// 78, 8
		// ; c := <find-comment-by-name(|name)> c*
		// right after a definition of a local rule
		// in rule "find-comment-match"
		List<EventEntry> entries = eventTable.getEventEntries(78, 8, "s-step");
		Assert.assertEquals(1, entries.size());
		
		BreakPoint bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 78);
		dsm.getEventSpecManager().add(bp);

		
		// 89, 6
		// ; comment := (<debug(!"stuff:"); first> c-filtered*) //  <+ !Comment(name, "created!!")
		// current active rule calls a dynamic strategy
		// in rule "find-comment-by-name"
		entries = eventTable.getEventEntries(89, 6, "s-step");
		Assert.assertEquals(1, entries.size());
		
		bp = null;
		bp = new StrategyStepBreakPoint(entries.get(0).getStrategyName(), 89);
		dsm.getEventSpecManager().add(bp);

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
		VMStateTester vmStateTester = new VMStateTester();
		vmStateTester.addName("find-comment-match");
		vmStateTester.addName("find-comment-by-name");
		vmStateTester.addName("find-comment-match");
		vmStateTester.addName("find-comment-by-name");
		vmMonitor.setVMStateTester(vmStateTester);
		

		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs, classpath);
	}
	
	/**
	 * classPath contains the binary files of the compiled strj program
	 * @param mainArgs
	 * @param classpath
	 */
	public static DebugSessionManager start(DebugSessionManager manager, String mainArgs, String classpath)
	{
		manager.initVM(mainArgs, classpath);
		//manager.initVM(mainArgs);
		manager.setupEventListeners();
		manager.redirectOutput();
		manager.runVM();		
		return manager;
	}
	
	
	class VMMonitorTestImpl1 implements VMMonitor {

		private DebugSessionManager debugSessionManager;
		private VMStateTester vmStateTester;
		
		public VMMonitorTestImpl1() {

		}
		
		public void setVMStateTester(VMStateTester vmStateTester) {
			this.vmStateTester = vmStateTester;
		}

		public void setDSM(DebugSessionManager dsm)
		{
			this.debugSessionManager = dsm;
		}
		
		public void stateChanged(StrategoState state) {
			//System.out.println("state changed");
			String name = state.currentFrame().getName();
			boolean expected = vmStateTester.isNextHit(name);
			System.out.println("expected: " + expected);
			String message = "Hit " + name + ", but expected to hit " + vmStateTester.currentHit();
			Assert.assertTrue(message, expected);
			String termString = state.currentFrame().getCurrentTerm().toString();
			System.out.println("current: " + termString);
			for ( Entry<String, IStrategoTerm> entry : state.currentFrame().getVariables().entrySet() )
			{
				System.out.println("variable entry " + entry.getKey() + " # " + entry.getValue());
			}
			this.debugSessionManager.resumeVM();
		}

		public void vmEvent(String event) {
			System.out.println("vmEvent: " + event);
			if ("VMDEATH".equals(event))
			{
				// vm terminated
				if (this.vmStateTester.hasNextHit())
				{
					Assert.fail("VM has terminated but there are still some expected hits left...");
				}
			}
		}
		
	}


}
