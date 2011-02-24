package org;

import java.io.File;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

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
}
