package org.strategoxt.debug.core.util;

import java.util.Collection;
import java.util.Map;

public class DebugCompilerWrapper extends DebugCompiler {

	public DebugCompilerWrapper(String workingDir) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Map<String, String> generateStratego(DebugSessionSettings debugSessionSettings, Collection<String> libraryPaths) throws DebugCompileException
	{
		return super.generateStratego(debugSessionSettings, libraryPaths);
	}

	protected boolean compileStratego(DebugSessionSettings debugSessionSettings, String inputStrategoFilename, String libraryName, String compiledStrategoFilename) throws DebugCompileException
	{
		return super.compileStratego(debugSessionSettings, inputStrategoFilename, libraryName, compiledStrategoFilename);
	}
}
