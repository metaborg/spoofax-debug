package org;

import java.io.File;

public class StrategoFileManager {
	
	/**
	 * Points to the project in the workspace containing the stratego sources.
	 */
	public static final String BASE = getBase();

	
	public static final String WORKING_DIR = getAbsoluteWorkingDirPath();
	
	private static final String _WORKING = "working";
	
	//private static final String _WD = 
	
	public static String getAbsoluteWorkingDirPath()
	{
		File f = new File(_WORKING);
		return f.getAbsolutePath();
	}
	
	public static String getBase()
	{
		File f = new File(_WORKING);
		String abs = f.getAbsolutePath();
		File w = new File(abs);
		String parent = w.getParent();
		System.out.println("P:" + parent);
		return parent;
	}
}
