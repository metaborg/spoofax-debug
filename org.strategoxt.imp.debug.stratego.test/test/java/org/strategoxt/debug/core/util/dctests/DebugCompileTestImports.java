package org.strategoxt.debug.core.util.dctests;

import java.io.IOException;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;

public class DebugCompileTestImports {

	public static void main(String[] args) {
		testDebugCompileTestImports();
	}

	public static void testDebugCompileTestImports()
	{
		String baseInputPath = "src/stratego/testimports";
		String strategoFilePath = "localvar.str";
		String strategoSourceBasedir = StrategoFileManager.BASE + "/" + baseInputPath;

		String projectName = "testimports";
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
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		boolean runjava = true;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/testimports/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "testimports.testimports";
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
