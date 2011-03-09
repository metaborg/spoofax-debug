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

public class DebugCompileLocalVar extends AbstractDebugCompileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DebugCompileLocalVar t = new DebugCompileLocalVar();
		//t.testDebugCompileLocalVar();
		t.testDebugCompileLocalVarOutputRtree();
	}
	
	@Test
	public void testDebugCompileLocalVar() {
		String baseInputPath = "src/stratego/localvar";
		IPath strategoFilePath = new Path("localvar.str");
		IPath strategoSourceBasedir = StrategoFileManager.BASE.append(baseInputPath);
		String projectName = "localvar";
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
		
		debugCompiler.getDebugCompileProgress().printStats();
		checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "localvar.localvar";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String cp = debugSessionSettings.getRunClasspath();
			String classpath = cp;
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
	}
	
	
	/**
	 * Output rtree instead of str files
	 */
	@Test
	public void testDebugCompileLocalVarOutputRtree() {
		String baseInputPath = "src/stratego/localvar";
		IPath strategoFilePath = new Path("localvar.str");
		IPath strategoSourceBasedir = StrategoFileManager.BASE.append(baseInputPath);

		String projectName = "localvar_rtree";
		DebugCompiler debugCompiler = new DebugCompiler();
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		String[] generateStrategoExtraArguments = new String[] {"--output-rtree"};
		debugSessionSettings.setGenerateStrategoExtraArguments(generateStrategoExtraArguments );
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		IPath binBase = null;
		boolean compileSucces = false;
		try {
			// strj -i /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/localvar_rtree/stratego/localvar.rtree -o /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/localvar_rtree/java/localvar_rtree/localvar_rtree.java -I /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/../org.strategoxt.imp.debug.stratego.core/lib -p localvar_rtree --clean -la org.strategoxt.imp.debug.stratego.runtime.trans
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
		
		debugCompiler.getDebugCompileProgress().printStats();
		checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "localvar_rtree.localvar_rtree";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String cp = debugSessionSettings.getRunClasspath();
			String classpath = cp;
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
	}
	
	
	@Test
	public void testRunCompileLocalVar() {
		String baseInputPath = "src/stratego/localvar";
		IPath strategoFilePath = new Path("localvar.str");
		IPath strategoSourceBasedir = StrategoFileManager.BASE.append(baseInputPath);

		String projectName = "localvar_run";
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
		
		debugCompiler.getDebugCompileProgress().printStats();
		//checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "localvar_run.localvar_run";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String cp = debugSessionSettings.getRunClasspath();
			String classpath = cp;
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
	}
	
}
