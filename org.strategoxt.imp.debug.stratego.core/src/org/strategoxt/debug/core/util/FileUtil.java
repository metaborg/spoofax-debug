package org.strategoxt.debug.core.util;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {

	/**
	 * Given a directory, delete the directory and all its contents in one go.
	 * @param sFilePath
	 * @return
	 */
	public static boolean deleteFile(String sFilePath)
	{
	  File oFile = new File(sFilePath);
	  if(oFile.isDirectory())
	  {
	    File[] aFiles = oFile.listFiles();
	    for(File oFileCur: aFiles)
	    {
	       deleteFile(oFileCur.getAbsolutePath());
	    }
	  }
	  return oFile.delete();
	}

	public static List<String> getFilesWithExtension(String basePath, final String extension) {
		
		List<String> matches = new ArrayList<String>();

		File oFile = new File(basePath);
		if (oFile.isDirectory()) {
			// get all files with the matching extension
			FileFilter filter = new FileFilter() {
				
				public boolean accept(File pathname) {
					String suffix = "." + extension;
					if (pathname.isFile() && pathname.getName().endsWith(suffix)){
						return true;
					}
					return false;
				}
			};
			File[] fs = oFile.listFiles(filter);
			for(File f : fs)
			{
				matches.add(f.getName());
			}
		}
		return matches;
	}
	

}
