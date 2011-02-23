package org.strjdbg.eclipse.ui.str.model;

import org.eclipse.core.resources.IFile;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.ui.IDebugModelPresentation;
import org.eclipse.debug.ui.IValueDetailListener;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.part.FileEditorInput;

public class StrategoModelPresentation extends LabelProvider implements IDebugModelPresentation {

	public void computeDetail(IValue value, IValueDetailListener listener) {
		// TODO Auto-generated method stub
		String detail = "";
		try {
			detail = value.getValueString();
		} catch (DebugException e) {
		}
		listener.detailComputed(value, detail);
	}

	public String getText(Object element) {
		// TODO Implement!
		/*
		try {
			if (element instanceof StrategoThread)
			{
					return ((org.strjdbg.eclipse.core.str.model.StrategoThread) element).getName();
			}
		} catch (DebugException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("getText(Object element)" + element);
		//return null;
		return element.toString();
		*/
		return null;
	}

	public void setAttribute(String attribute, Object value) {
		// TODO Auto-generated method stub

	}

	public void dispose() {
		// TODO Auto-generated method stub

	}

	public String getEditorId(IEditorInput input, Object element) {
		if (element instanceof IFile || element instanceof ILineBreakpoint)
		{

			return "org.eclipse.imp.runtime.impEditor"; // specialized stratego editor from the imp framework
		}
		return null;
	}


	public IEditorInput getEditorInput(Object element) {
		if (element instanceof IFile)
		{
			return new FileEditorInput((IFile)element);
		}
		if (element instanceof ILineBreakpoint)
		{
			return new FileEditorInput((IFile)((ILineBreakpoint)element).getMarker().getResource());
		}
		return null;

	}

}
