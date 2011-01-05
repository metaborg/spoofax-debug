package org.strjdbg.eclipse.ui.str.launching;

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
import org.eclipse.debug.ui.DebugUITools;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.strjdbg.eclipse.core.str.launching.IStrategoConstants;
import org.strjdbg.eclipse.ui.Activator;

public class StrategoLaunchShortcut implements ILaunchShortcut {

	public void launch(ISelection selection, String mode) {
		System.out.println("Launch selection");
        if (selection instanceof IStructuredSelection) {
        	searchAndLaunch(((IStructuredSelection)selection).toArray(), mode);
        } 
	}

	/**
	 * Launches the stratego program in the active editor
	 */
	public void launch(IEditorPart editor, String mode) {
		System.out.println("Launch from editor");
        IEditorInput input = editor.getEditorInput();
        IFile file = (IFile) input.getAdapter(IFile.class);
        if (file != null) {
        	System.out.println("File: " + file.getFullPath());
        	// /stratego-resources/src-str/test/localvar/localvar.str
        	ILaunchConfiguration launchConfig = findStrategoLaunchConfiguration(file, mode);
    		if (launchConfig == null) {
    			launchConfig = createConfiguration(file);
    		}
    		if (launchConfig != null) {
    			//DebugUITools.launch(config, mode); // TODO use this helper method?
        		try {
        			launchConfig.launch(mode, null);
				} catch (CoreException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    		}


        }
        // lookup an existing launch configuration
        
		/*
        IEditorInput input = editor.getEditorInput();
        IJavaElement javaElement = 
            (IJavaElement) input.getAdapter(IJavaElement.class);
        if (javaElement != null) {
         searchAndLaunch(new Object[] {javaElement}, mode);
        } 
        */
	}
	
	
    protected void searchAndLaunch(Object[] search, String mode) {
        /*
    	IType[] types = null;
        if (search != null) {
            try {
             types = AppletLaunchConfigurationUtils.findApplets(
                     new ProgressMonitorDialog(getShell()), search);
            } catch (Exception e) {
               
            }
            IType type = null;
         if (types.length == 0) {
                MessageDialog.openInformation(
                    getShell(), "Applet Launch", "No applets found."};
         } else if (types.length > 1) {
                type = chooseType(types, mode);
         } else {
                type = types[0];
            }
            if (type != null) {
             launch(type, mode);
            }
        }
        */
    }

    protected void launch(/*IType type, */String mode) {
    	/*
        try {
            ILaunchConfiguration config = findLaunchConfiguration(mode);
            if (config != null) {
             config.launch(mode, null);
            }
        } catch (CoreException e) {

        }*/
    }
    
    /**
     * Returns the LaunchConfigurations that are Stratego launch configs and match the strategoProgramPath.
     * 
     * @param strategoProgramPath strategoProgramPath points to a stratego program, the path should start with "/{project-name}"
     */
    private ILaunchConfiguration findStrategoLaunchConfiguration(IFile strategoProgramPath, String mode)
    {
    	// fetch the stratego config type
    	ILaunchConfigurationType type = this.getStrategoLaunchConfigurationType();
		List<ILaunchConfiguration> candidateConfigs = new ArrayList<ILaunchConfiguration>();
		if (type != null)
		{
			// stratego launch configuration type found!
			try {
				ILaunchConfiguration[] configs = DebugPlugin.getDefault().getLaunchManager().getLaunchConfigurations(type);
				
				for(ILaunchConfiguration config : configs)
				{
					// find a config that matches the program name
					String program = config.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, "");
					// TODO: should we equal on IPath objects instead of Strings?
					if (program.equals(strategoProgramPath.getFullPath().toOSString())) 
					{
						System.out.println(config.getModes());
						candidateConfigs.add(config);
					}
					//System.out.println(program);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		int candidateCount = candidateConfigs.size();
		if (candidateCount == 1) {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		} else if (candidateCount > 1) {
			return chooseConfiguration(candidateConfigs);
		}
		return null;
    }
    
	/**
	 * Returns a configuration from the given collection of configurations that should be launched,
	 * or <code>null</code> to cancel. Default implementation opens a selection dialog that allows
	 * the user to choose one of the specified launch configurations.  Returns the chosen configuration,
	 * or <code>null</code> if the user cancels.
	 * 
	 * Copied from org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut.
	 * 
	 * @param configList list of configurations to choose from
	 * @return configuration to launch or <code>null</code> to cancel
	 */
	protected ILaunchConfiguration chooseConfiguration(List<ILaunchConfiguration> configList) {
		IDebugModelPresentation labelProvider = DebugUITools.newDebugModelPresentation();
		ElementListSelectionDialog dialog= new ElementListSelectionDialog(getShell(), labelProvider);
		dialog.setElements(configList.toArray());
		dialog.setTitle(getTypeSelectionTitle());  
		dialog.setMessage("&Select existing configuration:"/*LauncherMessages.JavaLaunchShortcut_2*/);
		dialog.setMultipleSelection(false);
		int result = dialog.open();
		labelProvider.dispose();
		if (result == Window.OK) {
			return (ILaunchConfiguration) dialog.getFirstResult();
		}
		return null;		
	}
    
	/**
	 * Convenience method to return the active workbench window shell.
	 * 
	 * Copied from org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut.
	 * 
	 * @return active workbench window shell
	 */
	protected Shell getShell() {
		return Activator.getActiveWorkbenchShell();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut#getTypeSelectionTitle()
	 */
	protected String getTypeSelectionTitle() {
		return "Select Stratego Application"; //LauncherMessages.JavaApplicationLaunchShortcut_0;
	}
	
	/**
	 * Creates and returns a new configuration based on the specified type.
	 * 
	 * Copied from org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut#createConfiguration(org.eclipse.jdt.core.IType)
	 * 
	 * @param type the stratego file to create a launch configuration for
	 * @return launch configuration configured to launch the specified type
	 */
	protected ILaunchConfiguration createConfiguration(IFile file) {
		ILaunchConfiguration config = null;
		try {
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
			String project = file.getProject().getName();
			wc.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, program);
			wc.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_ARGUMENTS, programArguments);
			wc.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM_RECOMPILE, recompile);
			wc.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROJECT, project);
			//wc.setAttribute(IJavaLaunchConfigurationConstants.ATTR_APPLET_NAME, ""); //$NON-NLS-1$
			IResource[] rs = new IResource[] {file};
			wc.setMappedResources(rs);
			config = wc.doSave();
				
		} catch (CoreException ce) {
			MessageDialog.openError(getShell(), "Error"/*LauncherMessages.JavaLaunchShortcut_3*/, ce.getStatus().getMessage());	
		}
		return config;
	}
	
	/**
	 * Returns the type of configuration this shortcut is applicable to.
	 * 
	 * Copied from org.eclipse.jdt.debug.ui.launchConfigurations.JavaLaunchShortcut.
	 * 
	 * @return the type of configuration this shortcut is applicable to
	 */
	protected ILaunchConfigurationType getStrategoLaunchConfigurationType()
	{
    	ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();

		ILaunchConfigurationType type = manager.getLaunchConfigurationType(IStrategoConstants.ID_STRATEGO_DEBUG_MODEL+".launchConfigurationType.str"); 
		return type;
	}
}
