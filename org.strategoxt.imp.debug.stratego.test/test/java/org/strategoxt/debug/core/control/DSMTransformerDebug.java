package org.strategoxt.debug.core.control;

import java.io.File;
import java.io.IOException;

import org.StrategoFileManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class DSMTransformerDebug extends AbstractDSMTest {

	// stratego program should already be compiled
	@org.junit.Test
	public void testDSM2()
	{
		// run the transformer with debug info
		String projectName = "transformer_debug";
		createDebugSessionSettings(projectName);
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/localvar.str"; // program that will be debug transformed
		String output = StrategoFileManager.WORKING_DIR + "/transformer_test_debug1";
		String argsForMainClass = "-i " + input + " --gen-dir " + output; // + " --output-rtree";
		String mainClass = "transformer_debug.transformer_debug";
		String mainArgs = mainClass + " " + argsForMainClass;
		
		String transformerProject = "../org.strategoxt.imp.debug.stratego.transformer";
		File f = new File(transformerProject);
		try {
			//System.out.println("INPUT: " + f.getCanonicalPath());
			transformerProject = f.getCanonicalPath(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		IPath transformerPath = new Path(transformerProject);
		IPath strategoTransformerJavaJarPath = transformerPath.append("include").append("stratego-transformer-java.jar");
		// the transformer requires the external strategies defined in stratego-transformer-java.jar
		this.addToClasspath(strategoTransformerJavaJarPath);

		
		DebugSessionManager dsm = createDebugSessionManager();
		
		/*
		// TODO: test breakpoints
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		vmStateTester.addStrategoState("find-comment-match");
		vmStateTester.addStrategoState("find-comment-match");
		vmMonitor.setVMStateTester(vmStateTester);
		
		// create a breakpoint
		BreakPoint bp = null;
		bp = new RuleEnterBreakPoint("localvar.str", "find-comment-match", -1, -1); // should hit "find-comment-by-name" two times
		dsm.getEventSpecManager().add(bp);
		*/
		
		System.out.println("RUN");
		// start the debug session
		//String connectorType = "LAUNCH";
		//String connectorType = "LISTEN";
		//String connectorType = "ATTACH"; // attach to VM that is suspended
		start(dsm, mainArgs);
	}
}
