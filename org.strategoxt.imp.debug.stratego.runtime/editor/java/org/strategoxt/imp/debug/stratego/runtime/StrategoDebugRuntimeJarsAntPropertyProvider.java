package org.strategoxt.imp.debug.stratego.runtime;

import java.net.URL;

import org.eclipse.ant.core.IAntPropertyValueProvider;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

/**
 * Creates an ANT property that will point to the stratego-debug-runtime.jar and stratego-debug-runtime-java.jar.
 * 
 * @author rlindeman
 *
 */
public class StrategoDebugRuntimeJarsAntPropertyProvider implements IAntPropertyValueProvider {

	private static String INCLUDE = "include";
	private static String STR_LIB = "str-lib";
	
	public static String RUNTIME_JAR = "stratego-debug-runtime.jar";
	public static String RUNTIME_JAVA_JAR = "stratego-debug-runtime-java.jar";
	
	private static String ANT_RUNTIME_JAR = "eclipse.spoofaximp.stratego-debug-runtime-jar";
	private static String ANT_RUNTIME_JAVA_JAR = "eclipse.spoofaximp.stratego-debug-runtime-java-jar";
	private static String ANT_STRATEGO_DEBUG_LIB_FOLDER = "eclipse.spoofaximp.strategodebuglib-folder";
	
	public String getAntPropertyValue(String antPropertyName) {
		if (ANT_RUNTIME_JAR.equals(antPropertyName))
		{
			return getRuntimeJarPath();
		} else if (ANT_RUNTIME_JAVA_JAR.equals(antPropertyName))
		{
			return getRuntimeJavaJarPath();
		} else if (ANT_STRATEGO_DEBUG_LIB_FOLDER.equals(antPropertyName)) 
		{
			return getStrategoDebugLibFolderPath();
		}
		return null;
	}
	
	private String getStrategoDebugLibFolderPath() {
		// loc points to the basedit of the plugin
		URL loc = StrategoDebugRuntimeJarsAntPropertyProvider.class.getProtectionDomain().getCodeSource().getLocation();
		IPath p = new Path(loc.getPath());
		p = p.append(STR_LIB); 
		return p.toOSString();
	}

	private String getRuntimeJarPath()
	{
		// loc points to the basedit of the plugin
		URL loc = StrategoDebugRuntimeJarsAntPropertyProvider.class.getProtectionDomain().getCodeSource().getLocation();
		IPath p = new Path(loc.getPath());
		p = p.append(INCLUDE).append(RUNTIME_JAR); 
		return p.toOSString();
	}
	
	private String getRuntimeJavaJarPath()
	{
		// loc points to the basedit of the plugin
		URL loc = StrategoDebugRuntimeJarsAntPropertyProvider.class.getProtectionDomain().getCodeSource().getLocation();
		IPath p = new Path(loc.getPath());
		p = p.append(INCLUDE).append(RUNTIME_JAVA_JAR); 
		return p.toOSString();
	}

}
