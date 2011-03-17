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

public class DebugCompileSetInput extends AbstractDebugCompileTest {

	
	private String baseInputPathString = null;
	private String strategoFilePathString = null;
	private String projectName = null;
	private String mainClass = null;
	private boolean checkOutput = true;
	private boolean runJava = true;
	
	@Test
	public void testDebugCompileSetInput() throws Exception {
		// compile the setinput.str
		
		this.baseInputPathString = "src/stratego/setinput"; // folder
		this.strategoFilePathString = "setinput.str"; // relative to folder
		this.projectName = "setinput";
		this.mainClass = "setinput.setinput";
		checkOutput = false;
		runJava = false;
		compileHelper();
	}
	
	private DebugSessionSettings debugSessionSettings = null;
	
	private void compileHelper()
	{
		IPath strategoFilePath = new Path(this.strategoFilePathString);
		IPath strategoSourceBasedir = StrategoFileManager.BASE.append(this.baseInputPathString);

		debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		
		boolean compileSucces = doCompile();
		
		if (checkOutput)
		{
			checkOutput(debugSessionSettings);
		}

		// run .class
		if (runJava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/" + this.baseInputPathString + "/run.input";
			String argsForMainClass = "-i " + input;
			//String mainClass = "dynamic.dynamic"; // TODO: java files cannot contain "-", the name may be converted
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String cp = debugSessionSettings.getRunClasspath();
			String classpath = cp;
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
	}
	
	private boolean doCompile()
	{
		DebugCompiler debugCompiler = new DebugCompiler();
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
		return compileSucces;
	}
	
}

