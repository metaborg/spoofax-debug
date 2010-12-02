package org.strategoxt.debug.core.util.dctests;

import java.io.IOException;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;

public class DebugCompilerTest {
	
	public static void main(String[] args) {
		testDebugCompileLocalVarDebug();
	}
	

	
	public static void testDebugCompileLocalVarDebug() {
		String baseInputPath = "src/stratego/localvardebug";
		String strategoFile = "localvar.str";

		String projectName = "localvardebug";
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
			String input = StrategoFileManager.BASE + "/src/stratego/localvardebug/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "localvardebug.localvardebug";
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
