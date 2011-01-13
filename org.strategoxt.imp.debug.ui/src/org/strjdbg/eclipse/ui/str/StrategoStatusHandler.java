package org.strjdbg.eclipse.ui.str;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.debug.core.IStatusHandler;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.swt.widgets.Shell;
import org.strjdbg.eclipse.ui.Activator;

public class StrategoStatusHandler implements IStatusHandler {

	public Object handleStatus(IStatus status, Object source)
			throws CoreException {
		Shell parent = Activator.getActiveWorkbenchShell();
		// TODO Auto-generated method stub
		String title = "Stratego program error";
		String message = "Cannot launch stratego program.";
		ErrorDialog.openError(parent , title, message, status);
		return null;
	}

}
