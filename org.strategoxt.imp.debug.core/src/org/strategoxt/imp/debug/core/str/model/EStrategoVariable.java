package org.strjdbg.eclipse.core.str.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;
import org.spoofax.interpreter.terms.IStrategoTerm;

public class EStrategoVariable extends StrategoDebugElement implements IVariable {

	// name
	private String fName;
	
	private IValue termValue = null;

	/**
	 * Constructs a variable contained in the given stack frame
	 * with the given name.
	 * 
	 * @param target the corresponding StrategoDebugTarget
	 * @param frame owning stack frame
	 * @param name variable name
	 */
	public EStrategoVariable(StrategoDebugTarget target, IValue termValue, String name) {
		//super((StrategoDebugTarget) frame.getDebugTarget());
		super(target);
		this.termValue = termValue;
		fName = name;
	}
	
	public EStrategoVariable(StrategoDebugTarget target, IStrategoTerm term, String name) {
		//super((StrategoDebugTarget) frame.getDebugTarget());
		super(target);
		this.termValue = new EStrategoValue(target, term);
		fName = name;
	}
	
	public String getName() throws DebugException {
		return this.fName;
	}

	public String getReferenceTypeName() throws DebugException {
		// TODO Auto-generated method stub
		return "StrategoThing";
	}

	public IValue getValue() throws DebugException {
		return termValue;
	}

	// TODO: proper implement using the StrategoStackFrame and event handlers
	private boolean hasValueChanged = false;
	
	public boolean hasValueChanged() throws DebugException {
		// TODO Auto-generated method stub
		return hasValueChanged;
	}
	
	public void setValueChanged(boolean hasValueChanged)
	{
		this.hasValueChanged = hasValueChanged;
	}

	public void setValue(String expression) throws DebugException {
		// TODO Auto-generated method stub
		
	}

	public void setValue(IValue value) throws DebugException {
		// TODO Auto-generated method stub
		
	}

	public boolean supportsValueModification() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyValue(String expression) throws DebugException {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean verifyValue(IValue value) throws DebugException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString()
	{
		return "name="+fName+" value="+termValue;
	}

}
