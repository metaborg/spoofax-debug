package org.strategoxt.debug.core.util;

import java.io.File;
import java.io.FileNotFoundException;


public class DebugSessionSettings {
	
	public final static String STRATEGOXT_JAR = "strategoxt.jar";
	public final static String STRATEGO_DEBUG_RUNTIME_JAR = "stratego-debug-runtime.jar";
	public final static String STRATEGO_DEBUG_RUNTIME_JAVA_JAR = "stratego-debug-runtime-java.jar";
	public final static String STRATEGODEBUGLIB_RTREE = "strategodebuglib.rtree";
	
	private String projectName;
	
	/**
	 * directory without the project name.
	 * Should not end with a slash
	 */
	private String workingDirectory;
	
	public DebugSessionSettings(String workingDirectory, String projectName){
		// TODO: validate project name
		this.workingDirectory = workingDirectory;
		this.projectName = projectName;
	}
	
	/**
	 * The class directory
	 */
	public static String CLASS_DIR_NAME = "class";
	
	/**
	 * The stratego directory
	 */
	public static String STRATEGO_DIR_NAME = "stratego";
	
	/**
	 * The java directory
	 */
	public static String JAVA_DIR_NAME = "java";
	
	// generated using working directory and the project name
	private String classDirectory = null;
	private String strategoDirectory = null;
	private String javaDirectory = null;
	
	/**
	 * Returns the directory that contains the generated java class files.
	 * @return
	 */
	public String getClassDirectory()
	{
		if (classDirectory == null)
		{
			classDirectory = getWorkingDirectory() + "/" + getProjectName() + "/" + CLASS_DIR_NAME;
		}
		return classDirectory;
	}
	
	/**
	 * Returns the directory that contains the stratego files with debug information.
	 * @return
	 */
	public String getStrategoDirectory()
	{
		if (strategoDirectory == null)
		{
			strategoDirectory = getWorkingDirectory() + "/" + getProjectName() + "/" + STRATEGO_DIR_NAME;
		}
		return strategoDirectory;
	}
	
	/**
	 * Returns the directory that contains the generated java files.
	 * @return
	 */
	public String getJavaDirectory()
	{
		if (javaDirectory == null)
		{
			javaDirectory = getWorkingDirectory() + "/" + getProjectName() + "/" + JAVA_DIR_NAME;
		}
		return javaDirectory;
	}
	
	/**
	 * Returns the working directory
	 * @return
	 */
	public String getWorkingDirectory()
	{
		return this.workingDirectory;
	}
	
	/**
	 * Returns the project name.
	 * @return
	 */
	public String getProjectName()
	{
		return this.projectName;
	}
	
	public String getProjectDirectory()
	{
		return this.getWorkingDirectory() + "/" + getProjectName();
	}
	
	private String strategoSourceBasedir = null;
	private String strategoFilePath = null;
	
	
	
	/**
	 * Returns the directory that is the base-dir containing the source of the stratego program.
	 * @return
	 */
	public String getStrategoSourceBasedir() {
		return strategoSourceBasedir;
	}

	public void setStrategoSourceBasedir(String strategoSourceBasedir) {
		this.strategoSourceBasedir = strategoSourceBasedir;
	}

	/**
	 * File location of the stratego program main entry point. The location is relative to the strategoSourceBasedir.
	 * @return
	 */
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
		String strategoxt_jar = directory + "/" + STRATEGOXT_JAR;
		String stratego_debug_runtime_jar = directory + "/"+ STRATEGO_DEBUG_RUNTIME_JAR;
		String stratego_debug_runtime_java_jar = directory + "/" + STRATEGO_DEBUG_RUNTIME_JAVA_JAR;
		
		this.strategoxtJar = strategoxt_jar;
		this.strategoDebugRuntimeJar = stratego_debug_runtime_jar;
		this.strategoDebugRuntimeJavaJar = stratego_debug_runtime_java_jar;

		this.strategoDebugLibraryDirectory = directory; // rtree
	}
	
	public void checkJarLibraries() throws FileNotFoundException
	{
		String strategodebuglib = getStrategoDebugLibraryDirectory() + "/" + STRATEGODEBUGLIB_RTREE; // should contain strategodebuglib.rtree
		checkExistance(strategodebuglib);
		String strategoxtjar = getStrategoxtJar(); // should exist
		checkExistance(strategoxtjar);
		String strategodebugruntimejar = getStrategoDebugRuntimeJar(); // should exist
		checkExistance(strategodebugruntimejar);
		String strategodebugruntimejavajar = getStrategoDebugRuntimeJavaJar(); // should exist
		checkExistance(strategodebugruntimejavajar);
	}
	
	protected void checkExistance(String filename) throws FileNotFoundException{
		File f = new File(filename);
		if (!f.exists())
		{
			throw new FileNotFoundException();
		}
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
	
	
	private String[] strategoCompileTimeExtraArguments = null;
	
	public String[] getCompileTimeExtraArguments() {
		return strategoCompileTimeExtraArguments;
	}
	
	public void setCompileTimeExtraArguments(String[] strategoCompileTimeExtraArguments) {
		this.strategoCompileTimeExtraArguments = strategoCompileTimeExtraArguments;
	}
	
	/**
	 * Extra arguments such as --output-rtree
	 */
	private String[] generateStrategoExtraArguments = null;
	
	public String[] getGenerateStrategoExtraArguments() {
		return generateStrategoExtraArguments;
	}
	
	public void setGenerateStrategoExtraArguments(
			String[] generateStrategoExtraArguments) {
		this.generateStrategoExtraArguments = generateStrategoExtraArguments;
	}
	
	/**
	 * Classpath entry may be used when the stratego program references external strategies defined in java.
	 */
	public String[] javaCompileExtraClasspath = null;
	
	public void setJavaCompileExtraClasspath(String[] javaCompileExtraClasspath) {
		this.javaCompileExtraClasspath = javaCompileExtraClasspath;
	}
	
	public String[] getJavaCompileExtraClasspath() {
		return javaCompileExtraClasspath;
	}
}
