package org.strategoxt.imp.debug.core.str.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.spoofax.interpreter.terms.IStrategoTerm;

public class EStrategoValue extends StrategoDebugElement implements IValue {

	private IStrategoTerm fValue;
	
	public EStrategoValue(StrategoDebugTarget target, IStrategoTerm value) {
		super(target);
		fValue = value;
	}
	
	public String getReferenceTypeName() throws DebugException {
		// TODO Auto-generated method stub
		return ""+fValue.getTermType();
	}

	public String getValueString() throws DebugException {
		// TODO Auto-generated method stub
		return fValue.toString();
	}

	public IVariable[] getVariables() throws DebugException {
		// TODO Auto-generated method stub
		IStrategoTerm[] subTerms = this.fValue.getAllSubterms();
		IVariable[] subVars = new IVariable[subTerms.length];
		for(int i = 0; i < subTerms.length; i++)
		{
			subVars[i] = new EStrategoVariable(this.fTarget, subTerms[i], "["+i+"]");
		}
		return subVars;
	}

	public boolean hasVariables() throws DebugException {
		// TODO Auto-generated method stub
		return fValue.getSubtermCount() > 0;
	}

	public boolean isAllocated() throws DebugException {
		// TODO Auto-generated method stub
		return false;
	}

	public String toString()
	{
		return fValue.toString();
	}
}
