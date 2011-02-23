package org.strategoxt.debug.core.util.dctests;

import java.io.IOException;

import org.StrategoFileManager;
import org.junit.Test;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;

public class DebugCompileDynamic extends AbstractDebugCompileTest {

	public static void main(String[] args) {
		//testDebugCompileLocalVar();
		DebugCompileDynamic t = new DebugCompileDynamic();
		t.testDebugCompileDynamic();
	}
	
	@Test
	public void testDebugCompileDynamic() {
		String baseInputPath = "src/stratego/dynamic";
		String strategoFilePath = "localvar.str";
		String strategoSourceBasedir = StrategoFileManager.BASE + "/" + baseInputPath;

		String projectName = "dynamic";
		DebugCompiler debugCompiler = new DebugCompiler();
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
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/dynamic/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "dynamic.dynamic";
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
