package org.strategoxt.imp.debug.core.str.launching;

import java.io.File;
import java.io.FileNotFoundException;
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
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.IStatusHandler;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jdt.launching.AbstractJavaLaunchConfigurationDelegate;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.strategoxt.debug.core.util.DebugCompileException;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;
import org.strategoxt.debug.core.util.FileUtil;
import org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget;

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
        
		// program name
		String program = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, (String)null);
		if (program == null) {
			abort("Stratego program unspecified.", null);
			return;
		}
		
		IFile file = ResourcesPlugin.getWorkspace().getRoot().getFile(new Path(program));
		if (!file.exists()) {
			abort(MessageFormat.format("Stratego program {0} does not exist.", new Object[] {file.getFullPath().toString()}), null);
			return;
		}
		String project = file.getProject().getName();
		
		// program arguments
		List programArguments = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS, (List)null);
		if (programArguments == null) {
			//abort("Stratego program unspecified.", null);
			programArguments = new ArrayList<String>();
		}
				
		//String strategoFilePath = file.getLocation().toOSString(); // full path to the stratego program
		IPath strategoFilePath = new Path(program);
		IPath strategoSourceBasedir = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getLocation();
		IFile f = ResourcesPlugin.getWorkspace().getRoot().getProject(project).getFile(strategoFilePath); // path to the stratego file
		strategoFilePath =  f.getProjectRelativePath();
		IPath projectPath = new Path(project);
		strategoFilePath = f.getProjectRelativePath().makeRelativeTo(projectPath); // make the stratego file path relative to the project path
		System.out.println("PROJECT...:" + project);
		System.out.println("BASEDIR...: " + strategoSourceBasedir);
		System.out.println("COMPILING...: " + strategoFilePath);

		// now find a suitable temp directory to generate the files in...
		String w = file.getProject().getFolder("working").getFullPath().toOSString();
		IFolder wDir = ResourcesPlugin.getWorkspace().getRoot().getFolder(new Path(w));
		IPath workingDirFolder = wDir.getLocation();
		System.out.println("WORKING DIR: " + workingDirFolder);
		
		DebugCompiler debugCompiler = new DebugCompiler(); // or use a system temp folder
		String projectName = DebugCompiler.createProjectName(new File(program));
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.create(workingDirFolder, projectName);
		

		initJarLocations(debugSessionSettings);
		
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		// compile the stratego program
		IPath binBase = null;
		try {
			binBase = StrategoLaunchUtil.prepareProgram(configuration, monitor, mode, debugCompiler, debugSessionSettings);
		} catch (DebugCompileException e) {
			// could not compile program: Show error message
			String message = MessageFormat.format("Could not launch Stratego program {0}. Failed to compile the program.", new Object[] { program });
			this.abort(message, e);
			return;
		}
		
		monitor.subTask("Starting Stratego VM");
		
		// set up vm arguments
		String classToLaunch = projectName + "." + projectName;
		
		List<IPath> cpList = new ArrayList<IPath>();
		cpList.add(binBase);
		cpList.add(debugSessionSettings.getStrategoxtJar());
		cpList.addAll(debugSessionSettings.getRuntimeJars());
		// add additional classpath
		
		// java runtime classpath
		List runtimeClasspath = configuration.getAttribute(IStrategoConstants.ATTR_JAVA_RUNTIME_CLASSPATH_LIST, (List)null);
		if (runtimeClasspath == null) {
			runtimeClasspath = new ArrayList<String>();
		}
		for(Object o : runtimeClasspath)
		{
			if (o instanceof String)
			{
				cpList.add(new Path((String) o));
			}
		}
		
		String[] classPath = FileUtil.convertIPathToStringArray(cpList);	
		
		
		
		
		// setup program arguments
		System.out.println("Args: " + programArguments);
		String[] programArgsArray = new String[programArguments.size()];
		programArgsArray = (String[]) programArguments.toArray(programArgsArray);
		
		
		LaunchSettings ls = new LaunchSettings();
		ls.classToLaunch = classToLaunch;
		ls.classpath = classPath;
		ls.programArguments = programArgsArray;
		ls.mode = mode;
		ls.metadataDirectory = debugSessionSettings.getStrategoDirectory().toOSString();
		
		launchVM(monitor, ls, launch);

		monitor.done();
	}
	
	private void launchVM(IProgressMonitor monitor, LaunchSettings ls, ILaunch launch) throws CoreException
	{
		// Initialize the VMRunner
		IVMInstall defaultInstall = JavaRuntime.getDefaultVMInstall();
		IVMRunner vmRunner = defaultInstall.getVMRunner(ILaunchManager.RUN_MODE); // always use RUN, so we can control the debug parameters of the VM
		
		VMRunnerConfiguration vmRunnerConfiguration = new VMRunnerConfiguration(ls.classToLaunch, ls.classpath);
		vmRunnerConfiguration.setProgramArguments(ls.programArguments);
		
		// the started wm will wait for a debugger to connect to this port
		String port = ""+StrategoLaunchUtil.findFreePort();
		
		// if we are in DEBUG_MODE also set the debugging parameters for the VM as we previously created an IVMRunner in RUN_MODE
		if (ls.mode.equals(ILaunchManager.DEBUG_MODE)) {
			// socket attach
			//String[] realVMargs = new String[] { "-Xdebug", "-Xrunjdwp:transport=dt_socket,address="+port+",server=y,suspend=y" };
			// socket listen
			String[] realVMargs = new String[] { "-Xdebug", "-Xrunjdwp:transport=dt_socket,address="+port+",suspend=y", "-Xss8m" };
		//String[] realVMargs = new String[] { "-Xrunjdwp:transport=dt_socket,address=9000,server=y,suspend=y" };
		//String[] realVMargs = new String[] { "-Xdebug" };
			vmRunnerConfiguration.setVMArguments(realVMargs);
		}
		
		if (ls.mode.equals(ILaunchManager.DEBUG_MODE)) {
			monitor.subTask("Attaching to the Stratego VM");
			StrategoDebugTarget target = new StrategoDebugTarget(launch, port, ls.metadataDirectory);
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
	}
	


	class LaunchSettings {
		public String classToLaunch;
		public String[] classpath;
		
		public String[] programArguments;
		
		public String mode;
		
		public String metadataDirectory;
	}
	

	
	/**
	 * This method tries to set the path to the jars and then will validate if they exist.
	 * @param debugSessionSettings
	 * @throws CoreException 
	 */
	private void initJarLocations(DebugSessionSettings debugSessionSettings) throws CoreException {

		IPath directory = FileUtil.getLibDirectory();
		
		debugSessionSettings.setJarLibraryDirectory(directory);
		try {
			debugSessionSettings.checkJarLibraries();
		} catch (FileNotFoundException e) {
			abort("Could not find required eclipse jars in directory \""+directory+"\".", e);
		}	
	}








	/**
	 * Show debug info about the IVMInstall and the VMRunnerConfiguration.
	 * @param defaultInstall
	 * @param vmRunnerConfiguration
	 */
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
		IStatus status = new Status(IStatus.ERROR, IStrategoConstants.ID_STRATEGO_DEBUG_MODEL, 0, message, e);
		//throw new CoreException(status);
		
		IStatusHandler handler = DebugPlugin.getDefault().getStatusHandler(status);
		
		if (handler != null) {
			Object result = handler.handleStatus(status, null);
			System.out.println(result);
		}
	}
	

}
