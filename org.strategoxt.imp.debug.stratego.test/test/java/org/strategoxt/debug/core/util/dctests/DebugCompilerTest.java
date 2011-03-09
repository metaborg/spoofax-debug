package org.strategoxt.debug.core.util.dctests;

import java.io.IOException;

import org.StrategoFileManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.junit.Test;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;

public class DebugCompilerTest extends AbstractDebugCompileTest {
	
	public static void main(String[] args) {
		DebugCompilerTest t = new DebugCompilerTest();
		t.testDebugCompileLocalVarDebug();
	}
	

	@Test
	public void testDebugCompileLocalVarDebug() {
		String baseInputPath = "src/stratego/localvardebug";
		IPath strategoFilePath = new Path("localvar.str");
		IPath strategoSourceBasedir = StrategoFileManager.BASE.append(baseInputPath);

		String projectName = "localvardebug";


		DebugCompiler debugCompiler = new DebugCompiler();
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		IPath binBase = null;
		boolean compileSucces = false;
		try {
			binBase = debugCompiler.debugCompile(debugSessionSettings);
			compileSucces = true;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue("Debug compiling failed!", compileSucces);
		Assert.assertNotNull("Bin output directory should be set!", binBase);
		
		checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/localvardebug/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "localvardebug.localvardebug";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String cp = debugSessionSettings.getRunClasspath();
			String classpath = cp;
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
	}


}
