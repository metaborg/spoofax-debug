package org.strategoxt.debug.core.util;

import java.util.Collection;
import java.util.Map;

public class DebugCompilerWrapper extends DebugCompiler {

	public DebugCompilerWrapper(String workingDir) {
		super(workingDir);
		// TODO Auto-generated constructor stub
	}
	
	public Map<String, String> generateStratego(String sourceBasedir, String inputFilePath, String strOutputBasedir, Collection<String> libraryPaths) throws DebugCompileException
	{
		return super.generateStratego(sourceBasedir, inputFilePath, strOutputBasedir, libraryPaths);
	}

	protected boolean compileStratego(DebugSessionSettings debugSessionSettings, String inputStrategoFilename, String libraryName, String compiledStrategoFilename) throws DebugCompileException
	{
		return super.compileStratego(debugSessionSettings, inputStrategoFilename, libraryName, compiledStrategoFilename);
	}
}
