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
import org.eclipse.debug.core.IStatusHandler;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;
import org.strategoxt.debug.core.control.DebugSessionManager;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;
import org.strategoxt.debug.core.util.FileUtil;

public class HybridInterpreterLaunchDelegate implements
		ILaunchConfigurationDelegate {

	@SuppressWarnings("rawtypes")
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {
		// TODO Auto-generated method stub

		
		// get name of the strategy
		String name = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_STRATEGY_NAME, (String)null);
		if (name == null) {
			abort("Stratego program unspecified.", null);
			return;
		}
		// get required jars that we want to load
		List requiredJars = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_REQUIRED_JARS, (List)null);
		if (requiredJars == null) {
			//abort("Stratego program unspecified.", null);
			requiredJars = new ArrayList<String>();
		}
		// get the classpath
		String classpathAttr = configuration.getAttribute(IStrategoConstants.ATTR_STRATEGO_CLASSPATH, (String)null);
		if (classpathAttr == null) {
			abort("Stratego program unspecified.", null);
			return;
		}
		
		String flatJarList = "";
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
				flatJarList += urlPath + " ";
			}
		}

		String invokeStrategy = name; // this strategy will be executed
		String invokeStrategyArguments = name; // the arguments for the strategy
		String argsForMainClass = flatJarList + " " + invokeStrategy + " " + invokeStrategyArguments;
		
		String mainClass = "org.strategoxt.HybridInterpreter";
		String mainArgs = mainClass + " " + argsForMainClass;
		
		//String classpath = FileUtil.convertIPathToClasspath(jarPaths);
		//String cp = "" + jar + ":" + javaJar; // + ":" + utilsDir+"/strategoxt.jar";
		//String classpath = cp;
		
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.create(new Path("workingdirectory"), "projectname");
		IPath libDir = FileUtil.getLibDirectory(); // contains the rtree
		debugSessionSettings.setJarLibraryDirectory(libDir);
		DebugSessionManager dsm = new DebugSessionManager();
		List<IPath> classpaths = jarPaths;
		IPath tableDirectory = null;
		dsm.initVM(mainArgs, classpaths, tableDirectory, "LAUNCH");
		dsm.setupEventListeners();
		dsm.redirectOutput();
		dsm.runVM();
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
