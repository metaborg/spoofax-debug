package org.strategoxt.debug.core.util;

import java.util.Collection;
import java.util.Map;

import org.eclipse.core.runtime.IPath;

public class DebugCompilerWrapper extends DebugCompiler {

	public DebugCompilerWrapper(String workingDir) {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Map<IPath, IPath> generateStratego(DebugSessionSettings debugSessionSettings, Collection<String> libraryPaths) throws DebugCompileException
	{
		return super.generateStratego(debugSessionSettings, libraryPaths);
	}

	protected boolean compileStratego(DebugSessionSettings debugSessionSettings, IPath inputStrategoFilename, String libraryName, IPath compiledStrategoFilename) throws DebugCompileException
	{
		return super.compileStratego(debugSessionSettings, inputStrategoFilename, libraryName, compiledStrategoFilename);
	}
}
