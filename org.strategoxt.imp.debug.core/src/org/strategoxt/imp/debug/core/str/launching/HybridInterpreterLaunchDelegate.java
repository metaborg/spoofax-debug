package org.strategoxt.imp.debug.core.str.launching;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.IStatusHandler;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;
import org.strategoxt.debug.core.util.FileUtil;
import org.strategoxt.debug.core.util.StringUtil;
import org.strategoxt.eclipse.ant.StrategoJarAntPropertyProvider;
import org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget;

public class HybridInterpreterLaunchDelegate implements
		ILaunchConfigurationDelegate {

	@SuppressWarnings("rawtypes")
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub

		
		// get name of the strategy
		String name = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_STRATEGY_NAME, (String)null);
		if (name == null) {
			abort("Strategy name unspecified.", null);
			return;
		}
		// get required jars that we want to load
		List requiredJars = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_REQUIRED_JARS, (List)null);
		if (requiredJars == null) {
			//abort("Stratego program unspecified.", null);
			requiredJars = new ArrayList<String>();
		}
		// get the classpath
		//String classpathAttr = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_CLASSPATH, (String)null);
		/*
		if (classpathAttr == null) {
			abort("Classpath unspecified.", null);
			return;
		}*/
		
		// get name of the directory that contains metadata (such as charoffset.table)
		//String metadataDirectory = configuration.getAttribute(IStrategoConstants.ATTR_METADATA_DIRECTORY, (String)null);
		//if (metadataDirectory == null) {
			//abort("Strategy name unspecified.", null);
			//return;
		//}
		
		// get the project path
		String projectPath = configuration.getAttribute(IStrategoConstants.ATTR_PROJECT_DIRECTORY, (String) null);
		String metadataDirectory = null;
		if (projectPath != null)
		{
			IPath p = new Path(projectPath);
			metadataDirectory = p.append("trans-debug").toOSString();
		}
		
		//String flatJarList = "";
		List<IPath> jarPaths = new ArrayList<IPath>();
		Iterator iter = requiredJars.iterator();
		while(iter.hasNext())
		//for(URL jarURL : loadJars)
		{
			Object oNext = iter.next();
			if (oNext instanceof String)
			{
				//String urlPath = jarURL.getPath();
				String urlPath = (String) oNext;
				IPath jarPath = new Path(urlPath);
				jarPaths.add(jarPath);
				//flatJarList += urlPath + " ";
			}
		}

		String invokeStrategy = name; // this strategy will be executed
		String invokeStrategyArguments = name; // the arguments for the strategy
		
		String mainClass = "org.strategoxt.HybridInterpreter";

		String[] jarArray = FileUtil.convertIPathToStringArray(jarPaths); // + invokeStrategy + " " + invokeStrategyArguments;
		String[] args = new String[] { invokeStrategy, invokeStrategyArguments };

		List<IPath> classpaths = jarPaths;
		// also add strategoxt.jar
		classpaths.add(new Path(StrategoJarAntPropertyProvider.getStrategoJarPath()));
		
		LaunchSettings ls = new LaunchSettings();
		ls.classToLaunch = mainClass;
		ls.classpath = FileUtil.convertIPathToStringArray(classpaths);
		
		ls.programArguments = StringUtil.concat(jarArray, args);
		ls.mode = ILaunchManager.DEBUG_MODE;
		ls.metadataDirectory = metadataDirectory;
		
		launchVM(monitor, launch, ls);
		//String cp = "" + jar + ":" + javaJar; // + ":" + utilsDir+"/strategoxt.jar";
		//String classpath = cp;
		
		/*
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.create(new Path("workingdirectory"), "projectname");
		IPath libDir = FileUtil.getLibDirectory(); // contains the rtree
		debugSessionSettings.setJarLibraryDirectory(libDir);
		DebugSessionManager dsm = new DebugSessionManager();

		IPath tableDirectory = null;
		dsm.initVM(mainArgs, classpaths, tableDirectory, "LAUNCH");
		dsm.setupEventListeners();
		dsm.redirectOutput();
		dsm.runVM();
		*/
	}
	
	class LaunchSettings {
		public String classToLaunch;
		public String[] classpath;
		
		public String[] programArguments;
		
		public String mode;
		
		public String metadataDirectory;
	}
	
	private void launchVM(IProgressMonitor monitor, ILaunch launch, LaunchSettings ls) throws CoreException
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
			String[] realVMargs = new String[] { "-Xdebug", "-Xrunjdwp:transport=dt_socket,address="+port+",suspend=y" };
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
