package org.strategoxt.debug.core.util;

import java.io.File;

public class DebugSessionSettingsFactory {

	public static DebugSessionSettings createTest(String workingDirectory, String projectName)
	{
		DebugSessionSettings settings = new DebugSessionSettings(workingDirectory, projectName);
		File f = new File("../org.strategoxt.imp.debug.stratego.core/lib");
		settings.setJarLibraryDirectory(f.getAbsolutePath());
		return settings;
	}
	
	public static DebugSessionSettings create(String workingDirectory, String projectName)
	{
		DebugSessionSettings settings = new DebugSessionSettings(workingDirectory, projectName);
		return settings;
	}

}
