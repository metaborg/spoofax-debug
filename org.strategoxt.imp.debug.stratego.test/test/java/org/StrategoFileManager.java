package org;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.strategoxt.eclipse.ant.StrategoJarAntPropertyProvider;

public class StrategoFileManager {
	
	/**
	 * Points to the project in the workspace containing the stratego sources.
	 */
	public static final IPath BASE = getBase();

	
	public static final IPath WORKING_DIR = getAbsoluteWorkingDirPath();
	
	private static final String _WORKING = "working";
	
	//private static final String _WD = 
	
	public static IPath getAbsoluteWorkingDirPath()
	{
		File f = new File(_WORKING);
		IPath path = new Path(f.getAbsolutePath());
		return path;
	}
	
	public static IPath getBase()
	{
		File f = new File(_WORKING);
		String abs = f.getAbsolutePath();
		File w = new File(abs);
		String parent = w.getParent();
		System.out.println("P:" + parent);
		IPath path = new Path(parent);
		return path;
	}
	
	/**
	 * Returns the location of the strategoxt.jar (it should be in the org.strategoxt.strj plugin somewhere)
	 * @return
	 */
	public static String getStrategoXTJar()
	{
		System.out.println(Platform.isRunning());
		if (Platform.isRunning())
		{
			String strategoxtJar = StrategoJarAntPropertyProvider.getStrategoJarPath();
			return strategoxtJar;
		}
		String result = org.strategoxt.stratego_lib.Main.class.getProtectionDomain().getCodeSource().getLocation().getFile();
		/*
		if (Platform.getOS().equals(Platform.OS_WIN32)) {
			// FIXME: proper paths on Windows
			result = result.substring(1);
		}*/
		if (!result.endsWith(".jar")) { // ensure correct jar at development time
			String result2 = result + "/../strategoxt.jar";
			if (new File(result2).exists()) return result2;
			result2 = result + "/java/strategoxt.jar";
			if (new File(result2).exists()) return result2;
		}
		return result;
	}
}
