package org.strategoxt.imp.debug.core.str.model;

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

	/**
	 * Changes the value of this variable.
	 */
	public void setValue(String expression) throws DebugException {
		System.out.println("setValue= " + expression);
		StrategoDebugTarget target = (StrategoDebugTarget) this.getDebugTarget();
		// TODO: implement proper variable change
		// currently it just replaces the current term while infact this variable could be the child of some of value.
		target.getDebugSessionManager().changeCurrentTerm(expression);
	}

	public void setValue(IValue value) throws DebugException {
		// TODO Auto-generated method stub
		System.out.println("setValue = " + value);
	}

	/**
	 * Support value modification
	 */
	public boolean supportsValueModification() {
		return true;
	}

	/**
	 * Returns true if the given expression can be parsed as an IStrategoTerm.
	 */
	public boolean verifyValue(String expression) throws DebugException {
		StrategoDebugTarget target = (StrategoDebugTarget) this.getDebugTarget();
		return target.getDebugSessionManager().verifyValue(expression);
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
