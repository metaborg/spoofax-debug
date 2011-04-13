package org.strategoxt.imp.debug.stratego.transformer;

import java.net.URL;

import org.eclipse.ant.core.IAntPropertyValueProvider;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;

/**
 * Creates an ANT property that will point to the stratego-transformer.jar and stratego-transformer.jar.
 * 
 * @author rlindeman
 *
 */
public class StrategoTransformerJarsAntPropertyProvider implements IAntPropertyValueProvider {

	private static String INCLUDE = "include";
	
	public static String TRANSFORMER_JAR = "stratego-transformer.jar";
	public static String TRANSFORMER_JAVA_JAR = "stratego-transformer-java.jar";
	
	private static String ANT_TRANSFORMER_JAR = "eclipse.spoofaximp.stratego-transformer-jar";
	private static String ANT_TRANSFORMER_JAVA_JAR = "eclipse.spoofaximp.stratego-transformer-java-jar";
	
	public String getAntPropertyValue(String antPropertyName) {
		if (ANT_TRANSFORMER_JAR.equals(antPropertyName))
		{
			return getTransformerJarPath();
		} else if (ANT_TRANSFORMER_JAVA_JAR.equals(antPropertyName))
		{
			return getTransformerJavaJarPath();
		}
		return null;
	}
	
	private String getTransformerJarPath()
	{
		// loc points to the basedit of the plugin
		URL loc = StrategoTransformerJarsAntPropertyProvider.class.getProtectionDomain().getCodeSource().getLocation();
		IPath p = new Path(loc.getPath());
		p = p.append(INCLUDE).append(TRANSFORMER_JAR); 
		return p.toOSString();
	}
	
	private String getTransformerJavaJarPath()
	{
		// loc points to the basedit of the plugin
		URL loc = StrategoTransformerJarsAntPropertyProvider.class.getProtectionDomain().getCodeSource().getLocation();
		IPath p = new Path(loc.getPath());
		p = p.append(INCLUDE).append(TRANSFORMER_JAVA_JAR); 
		return p.toOSString();
	}

}
