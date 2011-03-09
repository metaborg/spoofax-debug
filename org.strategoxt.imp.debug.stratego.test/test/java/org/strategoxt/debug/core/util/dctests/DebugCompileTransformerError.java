package org.strategoxt.debug.core.util.dctests;

import java.io.File;
import java.io.IOException;

import org.StrategoFileManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.junit.Test;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;

/**
 * Test insufficient command line parameters..
 * 
 * @author rlindeman
 *
 */
public class DebugCompileTransformerError extends AbstractDebugCompileTest {

	public static void main(String[] args) {
		DebugCompileTransformerError t = new DebugCompileTransformerError();
		t.testDebugCompileTransformerError();
	}
	
	@Test
	public void testDebugCompileTransformerError() {
		// TODO Auto-generated method stub
		String baseInputPath = "trans";
		IPath strategoFilePath = new Path("stratego-transformer.str");

		String transformerProject = "../org.strategoxt.imp.debug.stratego.transformer";
		File f = new File(transformerProject);
		try {
			//System.out.println("INPUT: " + f.getCanonicalPath());
			transformerProject = f.getCanonicalPath(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		IPath strategoSourceBasedir = new Path(transformerProject).append(baseInputPath);
		
		String projectName = "transformer_error";
		DebugCompiler debugCompiler = new DebugCompiler();
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		
		String[] compileTimeExtraArguments = new String[]
		                                          {
				"-I", transformerProject
				, "-la", "strc"
		                                          };
		
		debugSessionSettings.setCompileTimeExtraArguments(compileTimeExtraArguments);
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		IPath binBase = null;
		boolean compileSucces = false;
		try {
			binBase = debugCompiler.runCompile(debugSessionSettings);
			compileSucces = true;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue("Debug compiling failed!", compileSucces);
		Assert.assertNotNull("Bin output directory should be set!", binBase);
		
		// should have no output
		//checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/localvar/localvar.str"; // program that will be debug transformed
			//String output = StrategoFileManager.WORKING_DIR + "/transformer_test_1";
			String argsForMainClass = "-i " + input;// + " -o " + output;
			String mainClass = "transformer_error.transformer_error";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String cp = debugSessionSettings.getRunClasspath();
			String classpath = cp;
			System.out.println("ARGS: " + mainArgs);
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
	}
}
