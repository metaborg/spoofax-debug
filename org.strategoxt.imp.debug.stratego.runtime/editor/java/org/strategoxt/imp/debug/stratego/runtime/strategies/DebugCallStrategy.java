package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.imp.debug.stratego.runtime.trans.dr_get_key_set_0_0;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public abstract class DebugCallStrategy extends Strategy {
	
	public IStrategoTerm getDRKeySet(Context context)
	{
		//Context context;
		IStrategoTerm term = null; // the current term, can this be null?
		IStrategoTerm keyList = dr_get_key_set_0_0.instance.invoke(context, term);
		return keyList;
	}

	/*
	public String getFullClassName(){
		
		System.out.println(this.getClass().getName());
		System.out.println(this.getClass().getCanonicalName());
		System.out.println(this.getClass().getSimpleName());
		
		return this.getClass().getName();
	}*/
}
