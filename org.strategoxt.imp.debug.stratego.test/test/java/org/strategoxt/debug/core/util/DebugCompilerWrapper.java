package org.strategoxt.debug.core.util;

import java.util.Collection;
import java.util.List;

public class DebugCompilerWrapper extends DebugCompiler {

	public DebugCompilerWrapper(String workingDir) {
		super(workingDir);
		// TODO Auto-generated constructor stub
	}
	
	public List<String> generateStratego(String sourceBasedir, String inputFilePath, String strOutputBasedir, Collection<String> libraryPaths) throws DebugCompileException
	{
		return super.generateStratego(sourceBasedir, inputFilePath, strOutputBasedir, libraryPaths);
	}

	protected void compileStratego(DebugSessionSettings debugSessionSettings, String inputStrategoFilename, String libraryName, String compiledStrategoFilename)
	{
		super.compileStratego(debugSessionSettings, inputStrategoFilename, libraryName, compiledStrategoFilename);
	}
}
