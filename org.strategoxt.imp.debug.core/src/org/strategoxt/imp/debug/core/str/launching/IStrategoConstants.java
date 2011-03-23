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
	 * Launch configuration key. Value is boolean and true when before each launch the application should be recompiled.
	 * If the value is false then the application won't get recompiled. Launching may fail if the compiled binaries are not present.
	 */
	public static final String ATTR_STRATEGO_PROGRAM_RECOMPILE = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_PROGRAM_RECOMPILE";

	public static final String ATTR_STRATEGO_STRATEGY_NAME = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_STRATEGY_NAME";

	public static final String ATTR_STRATEGO_REQUIRED_JARS = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_REQUIRED_JARS";

	public static final String ATTR_STRATEGO_CLASSPATH = ID_STRATEGO_DEBUG_MODEL + ".ATTR_STRATEGO_CLASSPATH";
}
