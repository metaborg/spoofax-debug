package org.strategoxt.debug.core.control;

import org.StrategoFileManager;

public class DSMLocalvarDebug extends AbstractDSMTest {

	// stratego program should already be compiled
	@org.junit.Test
	public void testDSM1()
	{
		String projectName = "localvar";
		createDebugSessionSettings(projectName);

		String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		String argsForMainClass = "-i " + input;
		String mainClass = "localvar.localvar";
		String mainArgs = mainClass + " " + argsForMainClass;
		
		DebugSessionManager dsm = createDebugSessionManager();		
	
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs);
	}
}
