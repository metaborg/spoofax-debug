package org.strategoxt.debug.core.util;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

public class DebugSessionSettingsFactory {

	public static DebugSessionSettings createTest(IPath workingDirectory, String projectName)
	{
		DebugSessionSettings settings = new DebugSessionSettings(workingDirectory, projectName);
		
		File f = new File("../org.strategoxt.imp.debug.stratego.core/lib");
		settings.setJarLibraryDirectory(new Path(f.getAbsolutePath())); // need for the rtree file
		
		java.util.List<IPath> entries = org.strategoxt.imp.debug.stratego.runtime.ClasspathHandler.getClasspathEntries();
		settings.setRuntimeJars(entries);
		
		return settings;
	}
	
	public static DebugSessionSettings create(IPath workingDirectory, String projectName)
	{
		DebugSessionSettings settings = new DebugSessionSettings(workingDirectory, projectName);
		// find the path to the runtime and the transformer classpath
		
		java.util.List<IPath> entries = org.strategoxt.imp.debug.stratego.runtime.ClasspathHandler.getClasspathEntries();
		settings.setRuntimeJars(entries);
		
		return settings;
	}

}
