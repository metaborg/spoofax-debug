package org.strjdbg.eclipse.core.str.model;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IValue;
import org.eclipse.debug.core.model.IVariable;

public class EStrategoMap extends StrategoDebugElement implements IValue {

	private List<EStrategoVariable> entries = null;
	
	public EStrategoMap(StrategoDebugTarget target) {
		super(target);
		// TODO Auto-generated constructor stub
		entries = new ArrayList<EStrategoVariable>();
	}
	
	public void add(EStrategoVariable var)
	{
		this.entries.add(var);
	}

	public String getReferenceTypeName() throws DebugException {
		// TODO Auto-generated method stub
		return "EStrategoMap";
	}

	public String getValueString() throws DebugException {
		// TODO Auto-generated method stub
		return entries.toString();
	}

	public IVariable[] getVariables() throws DebugException {
		// TODO Auto-generated method stub
		return entries.toArray(new IVariable[]{});
	}

	public boolean hasVariables() throws DebugException {
		// TODO Auto-generated method stub
		return !entries.isEmpty();
	}

	public boolean isAllocated() throws DebugException {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString()
	{
		return this.entries.toString();
	}

}
