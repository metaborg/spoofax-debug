package org.strategoxt.imp.debug.core.str.launching;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;

public class LaunchUtils {

	/**
	 * Returns the type of configuration this shortcut is applicable to.
	 * 
	 * Copied from org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut.
	 * 
	 * @return the type of configuration this shortcut is applicable to
	 */
	public static ILaunchConfigurationType getStrategoLaunchConfigurationType()
	{
    	ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();

		ILaunchConfigurationType type = manager.getLaunchConfigurationType(IStrategoConstants.ID_STRATEGO_DEBUG_MODEL+".launchConfigurationType.str"); 
		return type;
	}
	
	/**
	 * Returns the type of the HybridInterpreterLaunchConfiguration.
	 * @return
	 */
	public static ILaunchConfigurationType getHybridInterpreterLaunchConfigurationType()
	{
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		
		//LaunchConfigurationType[] types = manager.getLaunchConfigurationTypes();
		ILaunchConfigurationType type = manager.getLaunchConfigurationType(IStrategoConstants.ID_STRATEGO_DEBUG_MODEL + ".launchConfigurationType.hybridinterpreter");
		return type;
	}
	
	/**
	 * Creates and returns a new configuration based on the specified type.
	 * 
	 * Copied from org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut#createConfiguration(org.eclipse.jdt.core.IType)
	 * 
	 * TODO: generateUniqueLaunchConfigurationNameFrom is deprecated, since 3.6 clients should use the generateLaunchConfigurationName(String)
	 * @param type the stratego file to create a launch configuration for
	 * @return launch configuration configured to launch the specified type
	 * @throws CoreException 
	 */
	@SuppressWarnings("deprecation")
	public static ILaunchConfiguration createStrategoLaunchConfiguration(IFile file) throws CoreException {
		ILaunchConfiguration config = null;

		ILaunchConfigurationType configType = getStrategoLaunchConfigurationType();
		String namePrefix = file.getName();
		ILaunchConfigurationWorkingCopy wc = configType.newInstance(null, DebugPlugin.getDefault().getLaunchManager().generateUniqueLaunchConfigurationNameFrom(namePrefix)); 
		
		/*
		IStrategoConstants.ATTR_STRATEGO_PROGRAM;
		IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS;
		IStrategoConstants.ATTR_STRATEGO_PROGRAM_RECOMPILE;
		IStrategoConstants.ATTR_STRATEGO_PROJECT;
		*/
		// default parameters
		String program = file.getFullPath().toOSString();
		List<String> programArguments = new ArrayList<String>();
		String fulldir = file.getParent().getLocation().toOSString();
		programArguments.add("-i");
		programArguments.add(fulldir + "/run.input");
		programArguments.add("-o");
		programArguments.add(fulldir + "/run.output");

		boolean recompile = false;
		wc.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, program);
		wc.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS, programArguments);
		wc.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_RECOMPILE, recompile);
		IResource[] rs = new IResource[] {file};
		wc.setMappedResources(rs);
		config = wc.doSave();

		return config;
	}
	
	/**
	 * Create a LaunchConfig for a HybridInterpreterLaunch. The caller of this method should set the appropriate attributes.
	 * @return
	 */
	@SuppressWarnings("deprecation")
	public static ILaunchConfigurationWorkingCopy createHybridInterpreterLaunchConfigurationWorkingCopy()
	{
		//ILaunchConfiguration config = null;
		ILaunchConfigurationType configType = getHybridInterpreterLaunchConfigurationType();
		
		String namePrefix = "spoofax launchh";
		String name = DebugPlugin.getDefault().getLaunchManager().generateUniqueLaunchConfigurationNameFrom(namePrefix);

		ILaunchConfigurationWorkingCopy wc = null;
		try {
			wc = configType.newInstance(null, name);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// the attributes should be set in the caller of this method!
		
		return wc;
	}
	
	/**
	 * Get the existing launch configurations for the given stratego file.
	 * 
	 * @param strategoProgramPath
	 * @return
	 */
    public static List<ILaunchConfiguration> getStrategoLaunchConfigurations(IFile strategoProgramPath, String mode)
    {
    	// fetch the stratego config type
    	ILaunchConfigurationType type = getStrategoLaunchConfigurationType();
		List<ILaunchConfiguration> candidateConfigs = new ArrayList<ILaunchConfiguration>();
		if (type != null)
		{
			// stratego launch configuration type found!
			ILaunchConfiguration[] configs = null;
			try {
				configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(type);
			} catch (CoreException e) {
				// Could not get Launch configurations for the stratego launch type.
				e.printStackTrace();
			}		
			if (configs != null)
			{
				for(ILaunchConfiguration config : configs)
				{
					// find a config that matches the program name
					String program;
					try {
						program = config.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, "");
						// TODO: should we equal on IPath objects instead of Strings?
						// TODO: should we also check if the mode is supported for this launch config?
						if (program.equals(strategoProgramPath.getFullPath().toOSString())) 
						{
							candidateConfigs.add(config);
						}
					} catch (CoreException e) {
						// Could not get program name for the stratego launch
						e.printStackTrace();
					}
				}
			}

		}
		return candidateConfigs;
    }
}
