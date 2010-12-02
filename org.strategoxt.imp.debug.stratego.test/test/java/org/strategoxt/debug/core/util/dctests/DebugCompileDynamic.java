package org.strategoxt.debug.core.util.dctests;

import java.io.IOException;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;

public class DebugCompileDynamic {

	public static void main(String[] args) {
		//testDebugCompileLocalVar();
		testDebugCompileDynamic();
	}
	
	public static void testDebugCompileDynamic() {
		String baseInputPath = "src/stratego/dynamic";
		String strategoFile = "localvar.str";

		String projectName = "dynamic";
		DebugCompiler debugCompiler = new DebugCompiler(StrategoFileManager.WORKING_DIR);
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		String binBase = null;
		boolean compileSucces = false;
		try {
			String strategoSourceBasedir = StrategoFileManager.BASE + "/" + baseInputPath;
			binBase = debugCompiler.debugCompile(strategoSourceBasedir, strategoFile, projectName);
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
