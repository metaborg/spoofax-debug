package org.strategoxt.debug.core.util.dctests;

import java.io.IOException;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;

public class DebugCompileTestImports {

	public static void main(String[] args) {
		testDebugCompileTestImports();
	}

	public static void testDebugCompileTestImports()
	{
		//String inputBase = StrategoFileManager.BASE;
		String inputFilePath = "src/stratego/testimports/localvar.str";
		//String strategoFilePath = inputBase + "/" + inputFilename;
		String projectName = "testimports";
		DebugCompiler debugCompiler = new DebugCompiler(StrategoFileManager.WORKING_DIR);
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		String binBase = null;
		boolean compileSucces = false;
		try {
			binBase = debugCompiler.debugCompile(StrategoFileManager.BASE, inputFilePath, projectName);
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
			String input = StrategoFileManager.BASE + "/src/stratego/dynamic/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "dynamic.dynamic";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String strategoxtjar = DebugSessionSettings.strategoxtjar;
			String libstrategodebuglib = DebugSessionSettings.libstrategodebuglib;
			String strjdebugruntime = DebugSessionSettings.strjdebugruntime;
			
			String cp = strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + binBase;
			String classpath = cp;
			org.strategoxt.debug.core.util.Runner.run(projectName, mainArgs, classpath);
		}
	}
}
