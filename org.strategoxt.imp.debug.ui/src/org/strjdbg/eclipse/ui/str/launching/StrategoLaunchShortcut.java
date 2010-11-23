package org.strjdbg.eclipse.ui.str.launching;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.ui.ILaunchShortcut;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;

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
        }
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
    
    
}
