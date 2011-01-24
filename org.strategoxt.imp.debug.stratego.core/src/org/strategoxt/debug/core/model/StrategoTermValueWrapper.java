package org.strategoxt.debug.core.model;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.util.StrategoTermBuilder;

import com.sun.jdi.Value;

public class StrategoTermValueWrapper {
	
	protected StrategoTermBuilder builder = new StrategoTermBuilder();
	
	private Value value = null;
	
	private IStrategoTerm term = null;
	
	public StrategoTermValueWrapper(IStrategoTerm term)
	{
		this.term = term;
	}
	
	public StrategoTermValueWrapper(Value value)
	{
		this.value = value;
	}
	
	public IStrategoTerm getIStrategoTerm()
	{
		if (this.term == null)
		{
			this.term = builder.buildIStrategoTerm(value);
		}
		return this.term;
	}

}
