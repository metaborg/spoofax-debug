package org.strategoxt.debug.core.util;

public class DebugSessionSettings {

	private String projectName;
	
	/**
	 * directory without the project name.
	 * Should not end with a slash
	 */
	private String workingDirectory;
	
	public DebugSessionSettings(String workingDirectory, String projectName){
		this.workingDirectory = workingDirectory;
		this.projectName = projectName;
	}
	
	public static String CLASS_DIR_NAME = "class";
	public static String STRATEGO_DIR_NAME = "stratego";
	public static String JAVA_DIR_NAME = "java";
	
	// generated using working directory and the project name
	private String classDirectory = null;
	private String strategoDirectory = null;
	private String javaDirectory = null;
	
	public String getClassDirectory()
	{
		if (classDirectory == null)
		{
			classDirectory = workingDirectory + "/" + projectName + "/" + CLASS_DIR_NAME;
		}
		return classDirectory;
	}
	
	public String getStrategoDirectory()
	{
		if (strategoDirectory == null)
		{
			strategoDirectory = workingDirectory + "/" + projectName + "/" + STRATEGO_DIR_NAME;
		}
		return strategoDirectory;
	}
	
	public String getJavaDirectory()
	{
		if (javaDirectory == null)
		{
			javaDirectory = workingDirectory + "/" + projectName + "/" + JAVA_DIR_NAME;
		}
		return javaDirectory;
	}
	
	public String getProjectName()
	{
		return this.projectName;
	}
	
	private String strategoSourceBasedir = null;
	private String strategoFilePath = null;
	
	
	
	
	public String getStrategoSourceBasedir() {
		return strategoSourceBasedir;
	}

	public void setStrategoSourceBasedir(String strategoSourceBasedir) {
		this.strategoSourceBasedir = strategoSourceBasedir;
	}

	public String getStrategoFilePath() {
		return strategoFilePath;
	}

	public void setStrategoFilePath(String strategoFilePath) {
		this.strategoFilePath = strategoFilePath;
	}

	public void setJarLibraryDirectory(String directory)
	{
		if (directory.endsWith("/"))
		{
			directory = directory.substring(0, directory.length()-1);
		}
		String strategoxt_jar = directory + "/strategoxt.jar";
		String stratego_debug_runtime_jar = directory + "/stratego-debug-runtime.jar";
		String stratego_debug_runtime_java_jar = directory + "/stratego-debug-runtime-java.jar";
		
		this.strategoxtJar = strategoxt_jar;
		this.strategoDebugRuntimeJar = stratego_debug_runtime_jar;
		this.strategoDebugRuntimeJavaJar = stratego_debug_runtime_java_jar;

		this.strategoDebugLibraryDirectory = directory; // rtree
	}
	
	//private static String root = "/home/rlindeman/Documents/TU/webdsl/spoofax-imp/source";
	//public static String strategoxtjar = root+"/org.strategoxt.imp.debug.stratego.transformer/utils/strategoxt.jar";
	//public static String libstrategodebuglib = root + "/org.strategoxt.imp.debug.stratego.runtime/include/stratego-debug-runtime.jar";
	//public static String strjdebugruntime = root + "/org.strategoxt.imp.debug.stratego.runtime/include/stratego-debug-runtime-java.jar";
	//public static String strategodebuglib_rtree_file = root + "/org.strategoxt.imp.debug.stratego.runtime/str-lib/strategodebuglib.rtree";
	
	//public static String strategodebuglib_rtree_dir = root + "/org.strategoxt.imp.debug.stratego.runtime/str-lib";
	
	private String strategoDebugLibraryDirectory = null;
	
	/**
	 * returns a path to the directory that contains strategodebuglib.rtree.
	 * 
	 * See /org.strategoxt.imp.debug.stratego.runtime/str-lib how to generate this file.
	 * @return
	 */
	public String getStrategoDebugLibraryDirectory()
	{
		return this.strategoDebugLibraryDirectory;
	}
	
	private String strategoxtJar = null;
	
	/**
	 * Returns a path to the strategoxt.jar
	 * @return
	 */
	public String getStrategoxtJar()
	{
		return this.strategoxtJar;
	}
	
	private String strategoDebugRuntimeJar = null;
	
	/**
	 * Returns a path to stratego-debug-runtime.jar
	 * @return
	 */
	public String getStrategoDebugRuntimeJar()
	{
		return this.strategoDebugRuntimeJar;
	}
	
	private String strategoDebugRuntimeJavaJar = null;
	
	/**
	 * Returns a path to stratego-debug-runtime-java.jar
	 * @return
	 */
	public String getStrategoDebugRuntimeJavaJar()
	{
		return this.strategoDebugRuntimeJavaJar;
	}
	
}
