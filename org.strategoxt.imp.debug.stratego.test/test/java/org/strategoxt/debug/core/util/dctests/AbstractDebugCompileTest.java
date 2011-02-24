package org.strategoxt.debug.core.util.dctests;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Path;
import org.junit.Assert;
import org.other.FileTest;
import org.strategoxt.debug.core.util.DebugSessionSettings;
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
}
