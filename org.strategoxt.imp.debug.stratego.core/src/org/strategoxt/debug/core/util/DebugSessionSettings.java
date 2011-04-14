package org.strategoxt.debug.core.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.strategoxt.imp.debug.stratego.runtime.ClasspathHandler;


public class DebugSessionSettings {
	
	public final static String STRATEGOXT_JAR = "strategoxt.jar";

	public final static String STRATEGODEBUGLIB_RTREE = "strategodebuglib.rtree";
	
	private String projectName;
	
	/**
	 * directory without the project name.
	 * Should not end with a slash
	 */
	private IPath workingDirectory;
	
	public DebugSessionSettings(IPath workingDirectory, String projectName){
		// TODO: check for illegal project name
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
	private IPath classDirectory = null;
	private IPath strategoDirectory = null;
	private IPath javaDirectory = null;
	
	/**
	 * Returns the directory that contains the generated java class files.
	 * @return
	 */
	public IPath getClassDirectory()
	{
		if (classDirectory == null)
		{
			classDirectory = getProjectDirectory().append(CLASS_DIR_NAME);
		}
		return classDirectory;
	}
	
	/**
	 * Returns the directory that contains the stratego files with debug information.
	 * @return
	 */
	public IPath getStrategoDirectory()
	{
		if (strategoDirectory == null)
		{
			strategoDirectory = getProjectDirectory().append(STRATEGO_DIR_NAME);
		}
		return strategoDirectory;
	}
	
	/**
	 * Returns the directory that contains the generated java files.
	 * @return
	 */
	public IPath getJavaDirectory()
	{
		if (javaDirectory == null)
		{
			javaDirectory = getProjectDirectory().append(JAVA_DIR_NAME);
		}
		return javaDirectory;
	}
	
	/**
	 * Returns the working directory
	 * @return
	 */
	public IPath getWorkingDirectory()
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
	
	public IPath getProjectDirectory()
	{
		return getWorkingDirectory().append(getProjectName());
	}
	
	private IPath strategoSourceBasedir = null;
	private IPath strategoFilePath = null;
	
	
	
	/**
	 * Returns the directory that is the base-dir containing the source of the stratego program.
	 * @return
	 */
	public IPath getStrategoSourceBasedir() {
		return strategoSourceBasedir;
	}

	public void setStrategoSourceBasedir(IPath strategoSourceBasedir) {
		this.strategoSourceBasedir = strategoSourceBasedir;
	}

	/**
	 * File location of the stratego program main entry point. The location is relative to the strategoSourceBasedir.
	 * @return
	 */
	public IPath getStrategoFilePath() {
		return strategoFilePath;
	}

	public void setStrategoFilePath(IPath strategoFilePath) {
		this.strategoFilePath = strategoFilePath;
	}

	/**
	 * All required jars are in this directory...
	 * @param directory
	 */
	public void setJarLibraryDirectory(IPath directory)
	{
		IPath strategoxt_jar = directory.append(STRATEGOXT_JAR);
		
		this.strategoxtJar = strategoxt_jar;
	}
	
	private List<IPath> runtimeJars = null;
	
	public List<IPath> getRuntimeJars()
	{
		return runtimeJars;
	}
	
	/**
	 * Sets the paths to "stratego-debug-runtime.jar" and "stratego-debug-runtime-java.jar"
	 * @param runtimeJars
	 */
	public void setRuntimeJars(List<IPath> runtimeJars)
	{
		this.runtimeJars = runtimeJars;
	}
	
	/**
	 * Check if all the required jars can be found.
	 * @throws FileNotFoundException
	 */
	public void checkJarLibraries() throws FileNotFoundException
	{
		IPath strategodebuglib = getStrategoDebugLibraryDirectory().append(STRATEGODEBUGLIB_RTREE); // should contain strategodebuglib.rtree
		checkExistance(strategodebuglib);
		IPath strategoxtjar = getStrategoxtJar(); // should exist
		checkExistance(strategoxtjar);
		
		for(IPath runtimeJar : this.getRuntimeJars())
		{
			checkExistance(runtimeJar);
		}
	}
	
	protected void checkExistance(IPath path) throws FileNotFoundException{
		File f =path.toFile();
		if (!f.exists())
		{
			throw new FileNotFoundException();
		}
	}
	
	public String getDebugCompileClasspath()
	{
		List<IPath> cpList = new ArrayList<IPath>();
		cpList.add(this.getStrategoxtJar());
		cpList.addAll(this.getRuntimeJars());
		cpList.add(this.getJavaDirectory());
		String classPath = FileUtil.convertIPathToClasspath(cpList);
		return classPath;
	}
	
	/*
	public String getRunClasspath()
	{
		List<IPath> cpList = new ArrayList<IPath>();
		cpList.add(this.getStrategoxtJar());
		cpList.addAll(this.getRuntimeJars());
		cpList.add(this.getClassDirectory());
		String classPath = FileUtil.convertIPathToClasspath(cpList);
		return classPath;
	}*/
	
	//private static String root = "/home/rlindeman/Documents/TU/webdsl/spoofax-imp/source";
	//public static String strategoxtjar = root+"/org.strategoxt.imp.debug.stratego.transformer/utils/strategoxt.jar";
	//public static String libstrategodebuglib = root + "/org.strategoxt.imp.debug.stratego.runtime/include/stratego-debug-runtime.jar";
	//public static String strjdebugruntime = root + "/org.strategoxt.imp.debug.stratego.runtime/include/stratego-debug-runtime-java.jar";
	//public static String strategodebuglib_rtree_file = root + "/org.strategoxt.imp.debug.stratego.runtime/str-lib/strategodebuglib.rtree";
	
	//public static String strategodebuglib_rtree_dir = root + "/org.strategoxt.imp.debug.stratego.runtime/str-lib";
	
	private IPath strategoDebugLibraryDirectory = null;
	
	/**
	 * returns a path to the directory that contains strategodebuglib.rtree.
	 * 
	 * See /org.strategoxt.imp.debug.stratego.runtime/str-lib how to generate this file.
	 * @return
	 */
	public IPath getStrategoDebugLibraryDirectory()
	{
		if (this.strategoDebugLibraryDirectory == null)
		{
			this.strategoDebugLibraryDirectory = ClasspathHandler.getStrLibDirectory();
		}
		return this.strategoDebugLibraryDirectory;
	}
	
	private IPath strategoxtJar = null;
	
	/**
	 * Returns a path to the strategoxt.jar
	 * @return
	 */
	public IPath getStrategoxtJar()
	{
		return this.strategoxtJar;
	}

	
	/**
	 * Contains stratego compile time extra arguments.
	 */
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
	public IPath[] javaCompileExtraClasspath = null;
	
	public void setJavaCompileExtraClasspath(IPath[] javaCompileExtraClasspath) {
		this.javaCompileExtraClasspath = javaCompileExtraClasspath;
	}
	
	public IPath[] getJavaCompileExtraClasspath() {
		return javaCompileExtraClasspath;
	}

	private IPath tableDirectory = null;
	
	public void setTableDirectory(IPath tableDirectory) {
		this.tableDirectory = tableDirectory;
	}
	
	/**
	 * This directory contains table and offset files
	 * @return
	 */
	public IPath getTableDirectory() {
		return tableDirectory;
	}
}
