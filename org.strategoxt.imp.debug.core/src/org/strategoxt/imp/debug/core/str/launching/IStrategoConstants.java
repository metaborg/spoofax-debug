package org.strategoxt.imp.debug.core.str.launching;

public interface IStrategoConstants {

	/**
	 * Unique identifier for the Stratego debug model (value 
	 * <code>org.strategoxt.imp.debug.core</code>).
	 */
	public static final String ID_STRATEGO_DEBUG_MODEL = "org.strategoxt.imp.debug.core";
	
	/**
	 * Launch configuration key. Value is a path to a stratego
	 * program. The path is a string representing a full path
	 * to a stratego program in the workspace. 
	 */
	public static final String ATTR_STRATEGO_PROGRAM = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_PROGRAM";
	
	/**
	 * Launch configuration key. Value is the arguments for the stratego program that will be executed.
	 * Value has type List<String>.
	 */
	public static final String ATTR_STRATEGO_PROGRAM_ARGUMENTS = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_PROGRAM_ARGUMENTS";
	
	/**
	 * Launch configuration key. Value has type List<String> and contains the extra compile arguments needed to compile the 
	 * stratego program (for example "-I" or "-la" specifications)
	 */
	public static final String ATTR_STRATEGO_COMPILE_ARGUMENTS = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_COMPILE_ARGUMENTS";
	
	/**
	 * Extra classpath entries needed to compile java. Strategoxt and the stratego-debug-runtime jars will be on the classpath.
	 * The attribute can be used to set other jars (that contain external strategies) on the classpath.
	 */
	public static final String ATTR_JAVA_COMPILE_CLASSPATH_LIST = ID_STRATEGO_DEBUG_MODEL + ".ATTR_JAVA_COMPILE_CLASSPATH_LIST";
	
	public static final String ATTR_JAVA_RUNTIME_CLASSPATH_LIST = ID_STRATEGO_DEBUG_MODEL + ".ATTR_JAVA_RUNTIME_CLASSPATH_LIST";
	
	/**
	 * Launch configuration key. Value is boolean and true when before each launch the application should be recompiled.
	 * If the value is false then the application won't get recompiled. Launching may fail if the compiled binaries are not present.
	 */
	public static final String ATTR_STRATEGO_PROGRAM_RECOMPILE = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_PROGRAM_RECOMPILE";

	/**
	 * The strategy that will be invoked by the HybridInterpreter Launcher.
	 */
	public static final String ATTR_STRATEGO_STRATEGY_NAME = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_STRATEGY_NAME";

	/**
	 * List of jars that will be placed on the classpath for a HybridIntepreter Launch
	 */
	public static final String ATTR_STRATEGO_REQUIRED_JARS = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_REQUIRED_JARS";

	//public static final String ATTR_STRATEGO_CLASSPATH = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_CLASSPATH";
	
	/**
	 * Points to metadata directory, contains offsettable
	 */
	public static final String ATTR_METADATA_DIRECTORY = ID_STRATEGO_DEBUG_MODEL + ".ATTR_METADATA_DIRECTORY";
	
	/**
	 * Points to the eclipse spoofax project
	 */
	public static final String ATTR_PROJECT_DIRECTORY = ID_STRATEGO_DEBUG_MODEL + ".ATTR_PROJECT_DIRECTORY";
	
	/**
	 * The current term will be replaced by this value, it will be parsed as an IStrategoTerm.
	 */
	public static final String ATTR_CURRENT_TERM = ID_STRATEGO_DEBUG_MODEL + ".ATTR_CURRENT_TERM";
	
	/**
	 * The id of the HybridIntepreter launch type.
	 */
	public static final String HYBRID_INTERPRETER_LAUNCH_TYPE = ID_STRATEGO_DEBUG_MODEL + ".launchConfigurationType.hybridinterpreter";

}
