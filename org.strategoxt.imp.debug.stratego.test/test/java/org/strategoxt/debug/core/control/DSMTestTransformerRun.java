package org.strategoxt.debug.core.control;

import java.io.File;
import java.io.IOException;

import org.StrategoFileManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class DSMTestTransformerRun extends AbstractDSMTest {

	// stratego program should already be compiled
	@org.junit.Test
	public void testDSM1()
	{
		// run the transformer without debug info
		String projectName = "transformer_run";
		createDebugSessionSettings(projectName);
		
		String input = StrategoFileManager.BASE + "/src/stratego/localvar/localvar.str"; // program that will be debug transformed
		String output = StrategoFileManager.WORKING_DIR + "/transformer_test_run1";
		String argsForMainClass = "-i " + input + " --gen-dir " + output; // + " --output-rtree";
		String mainClass = "transformer_run.transformer_run";
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
		
		System.out.println("RUN");
		// start the debug session
		//String connectorType = "LAUNCH";
		//String connectorType = "LISTEN";
		//String connectorType = "ATTACH"; // attach to VM that is suspended
		start(dsm, mainArgs);
	}
}
