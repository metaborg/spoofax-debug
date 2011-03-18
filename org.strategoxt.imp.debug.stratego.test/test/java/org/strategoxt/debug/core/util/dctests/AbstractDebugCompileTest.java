package org.strategoxt.debug.core.util.dctests;

import static org.junit.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.StrategoFileManager;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.junit.Before;
import org.other.FileTest;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;
import org.strategoxt.debug.core.util.FileUtil;

public class AbstractDebugCompileTest {

	protected void checkOutput(DebugSessionSettings debugSessionSettings)
	{
		DebugSessionSettings expected = new DebugSessionSettings(new Path("test/expected"), debugSessionSettings.getProjectName());
		
		String extensionT = "table";
		List<String> matches = FileUtil.getFilesWithExtension(debugSessionSettings.getStrategoDirectory(), extensionT);
		// TODO: use the first match as we only support one file
		if (matches.size() > 0)
		{
			String location = debugSessionSettings.getStrategoDirectory() + "/" + matches.get(0);
			//System.out.println(location);
			File fActual = new File(location);
			File fExpected = new File(expected.getStrategoDirectory() + "/" + matches.get(0));
			FileTest.assertFiles(fExpected, fActual);
		}
		
		String extensionO = "offset";
		matches = FileUtil.getFilesWithExtension(debugSessionSettings.getStrategoDirectory(), extensionO);
		// TODO: use the first match as we only support one file
		if (matches.size() > 0)
		{
			String location = debugSessionSettings.getStrategoDirectory() + "/" + matches.get(0);
			//System.out.println(location);
			File fActual = new File(location);
			File fExpected = new File(expected.getStrategoDirectory() + "/" + matches.get(0));
			FileTest.assertFiles(fExpected, fActual);
		}
		
		// list generated str files
		
		List<File> generatedStrFiles = getStrategoFiles(debugSessionSettings);
		List<File> expectedStrFiles = getStrategoFiles(expected);

		
		// count expected files

		
		if (generatedStrFiles.size() == 0)
		{
			fail("No generated files");
		}

		Assert.assertEquals("The number of generated files should match the number of expected files", expectedStrFiles.size(), generatedStrFiles.size());
		
		// loop over all generated files
		int prefixLength = debugSessionSettings.getStrategoDirectory().toOSString().length();
		for(File strFile : generatedStrFiles)
		{
			// strip the stratego directory and prepend it with the directory the expected files are in
			String relativeFile = strFile.getAbsolutePath().substring(prefixLength);
			//System.out.println(relativeFile);
			
			String expectedFile = expected.getStrategoDirectory() + relativeFile;
			File fExpected = new File(expectedFile);
			FileTest.assertFiles(fExpected, strFile);
		}
	}
	
	private List<File> getStrategoFiles(DebugSessionSettings debugSessionSettings)
	{
		File oFile = debugSessionSettings.getStrategoDirectory().toFile();
		List<File> strFiles = new ArrayList<File>();
		if (oFile.isDirectory()) {
			File[] aFiles = oFile.listFiles();
			for (File oFileCur : aFiles) {
				if (oFileCur.getName().endsWith(".str") && oFileCur.isFile())
				{
					strFiles.add(oFileCur);
				} else if (oFileCur.getName().endsWith(".rtree") && oFileCur.isFile())
				{
					strFiles.add(oFileCur);
				}
			}
		}
		return strFiles;
	}
	
	protected String baseInputPathString = null;
	protected String strategoFilePathString = null;
	protected String projectName = null;
	protected String mainClass = null;
	protected boolean checkOutput = true;
	protected boolean runJava = true;
	protected boolean debugCompile = true;
	protected String[] generateStrategoExtraArguments = null;
	protected boolean shouldFail = false;
	
	/**
	 * DebugSessionSettings will be created by the test
	 */
	private DebugSessionSettings debugSessionSettings = null;
	
	@Before
	public void setUp() {
		// reset all values
		baseInputPathString = null;
		strategoFilePathString = null;
		projectName = null;
		mainClass = null;
		checkOutput = true;
		runJava = true;
		debugCompile = true;
		generateStrategoExtraArguments = null;
		debugSessionSettings = null;
		shouldFail = false;
	}
	
	protected void compileHelper()
	{
		IPath strategoFilePath = new Path(this.strategoFilePathString);
		IPath strategoSourceBasedir = StrategoFileManager.BASE.append(this.baseInputPathString);

		debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		
		if (generateStrategoExtraArguments != null)
		{
			debugSessionSettings.setGenerateStrategoExtraArguments(generateStrategoExtraArguments);
		}
		
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
	
	protected boolean doCompile()
	{
		DebugCompiler debugCompiler = new DebugCompiler();
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		IPath binBase = null;
		boolean compileSucces = false;
		try {
			if (debugCompile)
			{
				binBase = debugCompiler.debugCompile(debugSessionSettings);
			}
			else
			{
				binBase = debugCompiler.runCompile(debugSessionSettings);
			}
			compileSucces = true;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (shouldFail)
		{
			// compiling should fail!
			Assert.assertFalse("Debug compiling should have failed!", compileSucces);
		} else {
			Assert.assertTrue("Debug compiling failed!", compileSucces);
			Assert.assertNotNull("Bin output directory should be set!", binBase);
		}
		
		// debugCompiler.getDebugCompileProgress().printStats();
		return compileSucces;
	}
}
