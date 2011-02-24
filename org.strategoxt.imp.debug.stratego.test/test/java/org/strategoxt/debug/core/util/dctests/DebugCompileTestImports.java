package org.strategoxt.debug.core.util.dctests;

import java.io.IOException;

import org.StrategoFileManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.junit.Test;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;

public class DebugCompileTestImports extends AbstractDebugCompileTest {

	public static void main(String[] args) {
		DebugCompileTestImports t = new DebugCompileTestImports();
		t.testDebugCompileTestImports();
	}

	@Test
	public void testDebugCompileTestImports()
	{
		String baseInputPath = "src/stratego/testimports";
		IPath strategoFilePath = new Path("localvar.str");
		IPath strategoSourceBasedir = StrategoFileManager.BASE.append(baseInputPath);

		String projectName = "testimports";
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
		
		checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/testimports/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "testimports.testimports";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String strategoxtjar = debugSessionSettings.getStrategoxtJar().toOSString();
			String libstrategodebuglib = debugSessionSettings.getStrategoDebugRuntimeJar().toOSString();
			String strjdebugruntime = debugSessionSettings.getStrategoDebugRuntimeJavaJar().toOSString();
			
			String cp = strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + binBase;
			String classpath = cp;
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
	}
}
