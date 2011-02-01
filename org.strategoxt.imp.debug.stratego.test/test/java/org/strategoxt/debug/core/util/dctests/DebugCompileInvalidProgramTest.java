package org.strategoxt.debug.core.util.dctests;

import java.io.IOException;

import org.StrategoFileManager;
import org.junit.Assert;
import org.junit.Test;
import org.strategoxt.debug.core.util.DebugCompileException;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;

public class DebugCompileInvalidProgramTest extends AbstractDebugCompileTest {

	public static void main(String[] args) {
		DebugCompileInvalidProgramTest t = new DebugCompileInvalidProgramTest();
		t.testCompileInvalidProgram();
	}
	
	@Test
	public void testCompileInvalidProgram()
	{
		String baseInputPath = "src/stratego/invalid-program";
		String strategoFilePath = "program.str";
		String strategoSourceBasedir = StrategoFileManager.BASE + "/" + baseInputPath;

		String projectName = "invalidprogram1";
		DebugCompiler debugCompiler = new DebugCompiler(StrategoFileManager.WORKING_DIR);
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		String binBase = null;
		boolean compileSucces = false;
		try {
			binBase = debugCompiler.debugCompile(debugSessionSettings);
			compileSucces = true;
			Assert.fail("Debug compiling the invalid program should fail!");
		} catch (IOException e) {
			Assert.fail("Should throw a DebugCompileException!");
			e.printStackTrace();
		} catch (DebugCompileException e)
		{
			e.printStackTrace();
		} catch (Exception e) {
			Assert.fail("Should throw a DebugCompileException!");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/invalid-program/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "invalidprogram1.invalidprogram1";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String strategoxtjar = debugSessionSettings.getStrategoxtJar();
			String libstrategodebuglib = debugSessionSettings.getStrategoDebugRuntimeJar();
			String strjdebugruntime = debugSessionSettings.getStrategoDebugRuntimeJavaJar();
			
			String cp = strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + binBase;
			String classpath = cp;
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
		
	}
}
