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
}
