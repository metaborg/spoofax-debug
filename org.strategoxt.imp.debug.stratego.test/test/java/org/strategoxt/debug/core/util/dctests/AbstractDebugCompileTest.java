package org.strategoxt.debug.core.util.dctests;

import static org.junit.Assert.fail;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.other.FileTest;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.FileUtil;

public class AbstractDebugCompileTest {

	public static void checkOutput(DebugSessionSettings debugSessionSettings)
	{
		DebugSessionSettings expected = new DebugSessionSettings("test/expected", debugSessionSettings.getProjectName());
		
		String extensionT = "table";
		List<String> matches = FileUtil.getFilesWithExtension(debugSessionSettings.getStrategoDirectory(), extensionT);
		// TODO: use the first match as we only support one file
		if (matches.size() > 0)
		{
			String location = debugSessionSettings.getStrategoDirectory() + "/" + matches.get(0);
			System.out.println(location);
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
			System.out.println(location);
			File fActual = new File(location);
			File fExpected = new File(expected.getStrategoDirectory() + "/" + matches.get(0));
			FileTest.assertFiles(fExpected, fActual);
		}
		
		// list generated str files
		
		File oFile = new File(debugSessionSettings.getStrategoDirectory());
		List<File> strFiles = new ArrayList<File>();
		if (oFile.isDirectory()) {
			File[] aFiles = oFile.listFiles();
			for (File oFileCur : aFiles) {
				if (oFileCur.getName().endsWith(".str") && oFileCur.isFile())
				{
					strFiles.add(oFileCur);
				}
			}
		}
		if (strFiles.size() == 0)
		{
			fail("No generated files");
		}
		// loop over all generated files
		int prefixLength = debugSessionSettings.getStrategoDirectory().length();
		for(File strFile : strFiles)
		{
			// strip the stratego directory and prepend it with the directory the generated files are in
			String relativeFile = strFile.getAbsolutePath().substring(prefixLength);
			System.out.println(relativeFile);
			
			String expectedFile = expected.getStrategoDirectory() + relativeFile;
			File fExpected = new File(expectedFile);
			FileTest.assertFiles(fExpected, strFile);
		}
	}
}
