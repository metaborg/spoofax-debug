package org.strategoxt.debug.core.util;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class DebugSessionSettingsFactory {

	public static DebugSessionSettings createTest(IPath workingDirectory, String projectName)
	{
		DebugSessionSettings settings = new DebugSessionSettings(workingDirectory, projectName);
		File f = new File("../org.strategoxt.imp.debug.stratego.core/lib");
		settings.setJarLibraryDirectory(new Path(f.getAbsolutePath()));
		return settings;
	}
	
	public static DebugSessionSettings create(IPath workingDirectory, String projectName)
	{
		DebugSessionSettings settings = new DebugSessionSettings(workingDirectory, projectName);
		return settings;
	}

}
