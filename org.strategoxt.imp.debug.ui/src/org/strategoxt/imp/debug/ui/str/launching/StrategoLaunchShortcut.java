package org.strategoxt.imp.debug.ui.str.launching;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
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
import org.strategoxt.imp.debug.core.str.launching.LaunchUtils;
import org.strategoxt.imp.debug.ui.Activator;

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
	
    /**
     * Returns the LaunchConfigurations that are Stratego launch configs and match the strategoProgramPath.
     * 
     * @param strategoProgramPath strategoProgramPath points to a stratego program, the path should start with "/{project-name}"
     */
    private ILaunchConfiguration findStrategoLaunchConfiguration(IFile strategoProgramPath, String mode) {
    	List<ILaunchConfiguration> candidateConfigs = LaunchUtils.getStrategoLaunchConfigurations(strategoProgramPath, mode);
		int candidateCount = candidateConfigs.size();
		if (candidateCount == 1) {
			return (ILaunchConfiguration) candidateConfigs.get(0);
		} else if (candidateCount > 1) {
			return chooseConfiguration(candidateConfigs);
		}
		return null;
	}

	protected void searchAndLaunch(Object[] search, String mode) {
		// TODO: implement!
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
	public static Shell getShell() {
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
	public static ILaunchConfiguration createConfiguration(IFile file) {
		ILaunchConfiguration config = null;
		try {
			config = LaunchUtils.createConfiguration(file);
		} catch (CoreException ce) {
			MessageDialog.openError(getShell(), "Error"/*LauncherMessages.JavaLaunchShortcut_3*/, ce.getStatus().getMessage());	
		}
		return config;
	}
	

}
