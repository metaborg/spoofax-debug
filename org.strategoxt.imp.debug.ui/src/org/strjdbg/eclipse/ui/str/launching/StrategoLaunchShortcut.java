package org.strjdbg.eclipse.ui.str.launching;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.strjdbg.eclipse.core.str.launching.IStrategoConstants;

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
        	List<ILaunchConfiguration> launchConfigs = searchStrategoLaunchConfigs(file.getFullPath().toOSString(), mode);
        	if (launchConfigs != null && !launchConfigs.isEmpty())
        	{
        		ILaunchConfiguration config = launchConfigs.get(0); // get the first
        		try {
					config.launch(mode, null);
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
    private List<ILaunchConfiguration> searchStrategoLaunchConfigs(String strategoProgramPath, String mode)
    {
    	ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();

		ILaunchConfigurationType type = manager.getLaunchConfigurationType(IStrategoConstants.ID_STRATEGO_DEBUG_MODEL+".launchConfigurationType.str"); // fetch the stratego
		List<ILaunchConfiguration> launchConfigs = new ArrayList<ILaunchConfiguration>();
		if (type != null)
		{
			// type found!
			try {
				ILaunchConfiguration[] configs = manager.getLaunchConfigurations(type);
				for(ILaunchConfiguration config : configs)
				{
					String program = config.getAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, "");
					// TODO: should we equal on IPath objects instead of Strings?
					if (program.equals(strategoProgramPath)) 
					{
						System.out.println(config.getModes());
						launchConfigs.add(config);
					}
					//System.out.println(program);
				}
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return launchConfigs;
    }
    
    
}
