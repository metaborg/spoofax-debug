package org.strategoxt.imp.debug.core.str.launching;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.sourcelookup.AbstractSourceLookupParticipant;
import org.strategoxt.imp.debug.core.str.model.EStrategoStackFrame;

public class StrategoSourceLookupParticipant  extends AbstractSourceLookupParticipant {

	/* (non-Javadoc)
	 * @see org.eclipse.debug.internal.core.sourcelookup.ISourceLookupParticipant#getSourceName(java.lang.Object)
	 */
	public String getSourceName(Object object) throws CoreException {
		if (object instanceof EStrategoStackFrame) {
			return ((EStrategoStackFrame)object).getSourceName(); // relative to the project dir
		}
		return null;
	}

	
}
