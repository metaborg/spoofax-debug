package org.strategoxt.imp.debug.core.str.launching;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.strategoxt.debug.core.util.DebugCompileException;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;

/**
 * This class should take care of all the stuff that needs to be done after validating the LaunchConfig and before launching.
 * 
 * This class can be used to compile the program (with debug info) initialize the JVM for the debuggee.
 * 
 * @author rlindeman
 *
 */
@SuppressWarnings("unchecked")
public class StrategoLaunchUtil {

	
	/**
	 * Returns a free port number on localhost, or -1 if unable to find a free port.
	 * 
	 * @return a free port number on localhost, or -1 if unable to find a free port
	 */
	public static int findFreePort() {
		ServerSocket socket= null;
		try {
			socket= new ServerSocket(0);
			return socket.getLocalPort();
		} catch (IOException e) { 
		} finally {
			if (socket != null) {
				try {
					socket.close();
				} catch (IOException e) {
				}
			}
		}
		return -1;		
	}
	
	/**
	 * Prepares the stratego program before it can be launched.
	 * @param configuration
	 * @param monitor
	 * @param mode
	 * @param debugCompiler
	 * @param debugSessionSettings
	 * @return
	 * @throws DebugCompileException
	 * @throws CoreException
	 */
	public static IPath prepareProgram(ILaunchConfiguration configuration, IProgressMonitor monitor, String mode, DebugCompiler debugCompiler, DebugSessionSettings debugSessionSettings) throws DebugCompileException, CoreException {
		// program recompile
		boolean rebuildBinary = false;
		rebuildBinary = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_RECOMPILE, true);


		// program arguments
		List compileArguments = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_COMPILE_ARGUMENTS, (List)null);
		if (compileArguments == null) {
			//abort("Stratego program unspecified.", null);
			compileArguments = new ArrayList<String>();
		}
		String[] compileTimeExtraArguments = (String[]) compileArguments.toArray(new String[0]);
		debugSessionSettings.setCompileTimeExtraArguments(compileTimeExtraArguments);
		
		// java compile extra classpath
		List javaCompileClasspath = configuration.getAttribute(IStrategoConstants.ATTR_JAVA_COMPILE_CLASSPATH_LIST, (List) null);
		if (javaCompileClasspath == null) {
			javaCompileClasspath = new ArrayList<String>();
		}
		List<IPath> paths = new ArrayList<IPath>();
		for(Object o : javaCompileClasspath)
		{
			if (o instanceof String)
			{
				IPath path = new Path((String) o);
				paths.add(path);
			}
		}
		IPath[] javaCompileClasspathArray = (IPath[]) paths.toArray(new IPath[0]);
		debugSessionSettings.setJavaCompileExtraClasspath(javaCompileClasspathArray);
		
		
		IPath binBase = debugSessionSettings.getClassDirectory(); // default

		if (rebuildBinary)
		{
			binBase = compile(monitor, mode, debugCompiler, debugSessionSettings);
		}
		else
		{
			// TODO: check if all the necessary files exist in the working dir...
			// check if binBase contains javafiles
			IPath binBasePath = binBase;
			File binBaseFile = binBasePath.toFile();
			if (!binBaseFile.exists())
			{
				// did not compile to class files
				// try to compile it
				System.out.println("Class files not found, compile...");
				binBase = compile(monitor, mode, debugCompiler, debugSessionSettings);
			}
			else
			{
				// check if dir is empty
				String[] files = binBaseFile.list();
				if (files == null || files.length == 0)
				{
					System.out.println("Class files not found, compile...");
					binBase = compile(monitor, mode, debugCompiler, debugSessionSettings);
				}
			}
			
			// TODO: check if table file exists
			File strBase = debugSessionSettings.getStrategoDirectory().toFile();
			if (!strBase.exists())
			{
				System.out.println("Stratego program does not have debug info, compile...");
				binBase = compile(monitor, mode, debugCompiler, debugSessionSettings);
			} else {
				String[] files = strBase.list();
				if (files == null || files.length == 0)
				{
					System.out.println("Stratego program does not have debug info, compile...");
					binBase = compile(monitor, mode, debugCompiler, debugSessionSettings);
				}
			}
			
		}
		return binBase;
	}
	
	
	private static IPath compile(IProgressMonitor monitor, String mode, DebugCompiler debugCompiler, DebugSessionSettings debugSessionSettings) throws DebugCompileException
	{
		monitor.subTask("Compiling stratego program");
		IPath binBase = null;
		if (mode.equals(ILaunchManager.DEBUG_MODE)) 
		{
			binBase = debugCompile(debugCompiler, debugSessionSettings);

		}
		else if (mode.equals(ILaunchManager.RUN_MODE))
		{
			binBase = runCompile(debugCompiler, debugSessionSettings);
		}
		monitor.worked(3);
		return binBase;
	}
	
	/**
	 * Calls debugCompile on the DebugCompiler using the given DebugSessionSettings.
	 * @param debugCompiler
	 * @param debugSessionSettings
	 * @return
	 * @throws DebugCompileException
	 */
	private static IPath debugCompile(DebugCompiler debugCompiler, DebugSessionSettings debugSessionSettings) throws DebugCompileException
	{
		// compile for a debug
		IPath binBase = null;
		try {
			binBase = debugCompiler.debugCompile(debugSessionSettings);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		/*
		catch (DebugCompileException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			abort("Could not compile stratego program.", e);
		}*/
		return binBase;
	}
	
	/**
	 * Calls runCompile on the DebugCompiler using the given DebugSessionSettings.
	 * @param debugCompiler
	 * @param debugSessionSettings
	 * @return
	 * @throws DebugCompileException
	 */
	private static IPath runCompile(DebugCompiler debugCompiler, DebugSessionSettings debugSessionSettings) throws DebugCompileException
	{
		// compile for a run
		IPath binBase = null;
		try {
			binBase = debugCompiler.runCompile(debugSessionSettings);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		// do not catch the DebugCompileException here...
		return binBase;
	}
}
