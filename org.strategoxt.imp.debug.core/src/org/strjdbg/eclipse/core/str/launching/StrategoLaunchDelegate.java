package org.strjdbg.eclipse.core.str.launching;

import java.io.File;
import java.io.IOException;
import java.net.ServerSocket;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strjdbg.eclipse.core.str.model.StrategoDebugTarget;

/**
 * Launches a Stratego program.
 * 
 * The program can be launched in debug or in run mode.
 * 
 * Debug Launch:
 * - add debug metadata to the stratego program
 * - compile the stratego program to java (strj)
 * - compile the java-stratego to class files
 * - run the class
 * - [handle breakpoints]
 * 
 * Run launch
 * - compile the stratego program to java (strj)
 * - compile the java-stratego to class files
 * - run the class
 * 
 * The delegate extends the AbstractJavaLaunchConfigurationDelegate as this simplifies how to use a JVM
 * @author rlindeman
 *
 */
@SuppressWarnings("unchecked")
public class StrategoLaunchDelegate extends AbstractJavaLaunchConfigurationDelegate implements ILaunchConfigurationDelegate {

	
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
        if (monitor == null){
            monitor = new NullProgressMonitor();
        }
        monitor.beginTask("Launching Stratego program", IProgressMonitor.UNKNOWN);
        
        // project
        String project = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROJECT, (String) null);
        if (project == null)
        {
        	abort("Eclipse project unspecified.", null);
        }
        
		// program name
		String program = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, (String)null);
		if (program == null) {
			abort("Stratego program unspecified.", null);
		}
		
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(program));
		if (!file.exists()) {
			abort(MessageFormat.format("Stratego program {0} does not exist.", new Object[] {file.getFullPath().toString()}), null);
		}
		
		// program arguments
		List programArguments = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS, (List)null);
		if (programArguments == null) {
			//abort("Stratego program unspecified.", null);
			programArguments = new ArrayList<String>();
		}
		
		// program recompile
		boolean rebuildBinary = false;
		rebuildBinary = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_RECOMPILE, true);
		
		// the started wm will wait for a debugger to connect to this port
		String port = ""+findFreePort();
		
		//String strategoFilePath = file.getLocation().toOSString(); // full path to the stratego program
		String strategoFilePath = program;
		String strategoSourceBasedir = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getLocation().toOSString();
		//String strategoSourceBasedir = ResourcesPlugin.getWorkspace().getRoot().getLocation().toOSString();
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getFile(strategoFilePath); // path to the stratego file
		strategoFilePath =  f.getProjectRelativePath().toOSString();
		IPath projectPath = new Path(project);
		strategoFilePath = f.getProjectRelativePath().makeRelativeTo(projectPath).toOSString(); // make the stratego file path relative to the project path
		System.out.println("PROJECT...:" + project);
		System.out.println("BASEDIR...: " + strategoSourceBasedir);
		System.out.println("COMPILING...: " + strategoFilePath);

		// now find a suitable temp directory to generate the files in...
		String w = file.getProject().getFolder("working").getFullPath().toOSString();
		IFolder wDir = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(w));
		String workingDirFolder = wDir.getLocation().toOSString();
		System.out.println("WORKING DIR: " + workingDirFolder);
		
		DebugCompiler debugCompiler = new DebugCompiler("/tmp");
		String projectName = DebugCompiler.createProjectName(new File(program));
		
		// compile the stratego program
		String binBase = "/tmp/"+projectName+"/class";
		if (rebuildBinary)
		{
			monitor.subTask("Compiling stratego program");
			if (mode.equals(ILaunchManager.DEBUG_MODE)) 
			{
				
				try {
					binBase = debugCompiler.debugCompile(strategoSourceBasedir, strategoFilePath, projectName);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else if (mode.equals(ILaunchManager.RUN_MODE))
			{
				try {
					binBase = debugCompiler.runCompile(strategoFilePath, projectName);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			monitor.worked(3);
		}
		else
		{
			// TODO: check if all the necessary files exist in the working dir...
		}
		
		monitor.subTask("Starting Stratego VM");
		// Initialize the VMRunner
		IVMInstall defaultInstall = JavaRuntime.getDefaultVMInstall();
		System.out.println("default: " + defaultInstall.getName());
		//IVMRunner vmRunner = defaultInstall.getVMRunner(mode);
		IVMRunner vmRunner = defaultInstall.getVMRunner(ILaunchManager.RUN_MODE); // always use RUN, so we can control the debug parameters of the VM

		
		// set up vm arguments
		String classToLaunch = projectName + "." + projectName;
		
		String strategoxtjar = DebugSessionSettings.strategoxtjar;
		String libstrategodebuglib = DebugSessionSettings.libstrategodebuglib;
		String strjdebugruntime = DebugSessionSettings.strjdebugruntime;
		
		String[] classPath = new String[] { binBase, strategoxtjar, libstrategodebuglib, strjdebugruntime};
		VMRunnerConfiguration vmRunnerConfiguration = new VMRunnerConfiguration(classToLaunch, classPath);
		
		// setup program arguments
		System.out.println("Args: " + programArguments);
		String[] programArgsArray = new String[programArguments.size()];
		programArgsArray = (String[]) programArguments.toArray(programArgsArray);
		vmRunnerConfiguration.setProgramArguments(programArgsArray);


		
		// if we arein DEBUG_MODE also set the debugging parameters for the VM as we previously created an IVMRunner in RUN_MODE
		if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			// socket attach
			//String[] realVMargs = new String[] { "-Xdebug", "-Xrunjdwp:transport=dt_socket,address="+port+",server=y,suspend=y" };
			// socket listen
			String[] realVMargs = new String[] { "-Xdebug", "-Xrunjdwp:transport=dt_socket,address="+port+",suspend=y" };
		//String[] realVMargs = new String[] { "-Xrunjdwp:transport=dt_socket,address=9000,server=y,suspend=y" };
		//String[] realVMargs = new String[] { "-Xdebug" };
			vmRunnerConfiguration.setVMArguments(realVMargs);
		}
		

		DebugSessionSettings debugSessionSettings = new DebugSessionSettings("/tmp", projectName);
		if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			monitor.subTask("Attaching to the Stratego VM");
			StrategoDebugTarget target = new StrategoDebugTarget(debugSessionSettings, launch, port);
			//(launch,p,requestPort,eventPort );
			launch.addDebugTarget(target);
			monitor.worked(1);
		}
		
		// start the VM with the stratego program
		// using attach, run before the StrategoDebugTarget is initialized
		// using listen, run after the StrategoDebugTarget is initialized
		System.out.println("RUN");
		vmRunner.run(vmRunnerConfiguration, launch, monitor);
		monitor.worked(1);
		
		monitor.done();
	}
	
	public static void showDebugInfo(IVMInstall defaultInstall, VMRunnerConfiguration vmRunnerConfiguration)
	{
		// show debug info
		String[] installArgs = defaultInstall.getVMArguments();
		String installArgsString = Arrays.toString(installArgs);
		System.out.println("installArgsString: " + installArgsString);
		
		String[] env = vmRunnerConfiguration.getEnvironment();
		String envString = Arrays.toString(env);
		System.out.println("env: " + envString);
		
		String[] vmArgs = vmRunnerConfiguration.getVMArguments();
		String vmArgsString = Arrays.toString(vmArgs);
		System.out.println("vmArgs: " + vmArgsString);
		
		Map map = vmRunnerConfiguration.getVMSpecificAttributesMap();
		if (map != null)
		{
			for(Object key : map.keySet())
			{
				Object value = map.get(key);
				System.out.println("key: " + key + "    val:"+value);
			}
		}
	}


	
	/*
	private void startRunVM()
	{
		
	}
	
	private void startDebugVM(com.sun.jdi.VirtualMachine vm, VMMonitor vmMonitor)
	{
		// create a new VM
		// TODO: let the user select the VM in the launchconfiguration
		
		DebugSessionManager manager = new DebugSessionManager(vmMonitor);
		VMLauncherHelper vmHelper = null;
		//manager.initVM(mainArgs, classpath);
		
		manager.setVirtualMachine(vm);
		manager.setupEventListeners();
		manager.redirectOutput();

	}
	*/
	
	/**
	 * Throws an exception with a new status containing the given
	 * message and optional exception.
	 * 
	 * @param message error message
	 * @param e underlying exception
	 * @throws CoreException
	 */
	private void abort(String message, Throwable e) throws CoreException {
		// TODO: the plug-in code should be the example plug-in, not Stratego debug model id
		throw new CoreException(new Status(IStatus.ERROR, IStrategoConstants.ID_STRATEGO_DEBUG_MODEL, 0, message, e));
	}
	
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

}
