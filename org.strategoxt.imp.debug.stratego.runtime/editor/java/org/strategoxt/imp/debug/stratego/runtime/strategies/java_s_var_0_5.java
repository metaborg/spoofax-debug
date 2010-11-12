package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class java_s_var_0_5 extends Strategy {

	
	public static java_s_var_0_5 instance = new java_s_var_0_5();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm filename,	IStrategoTerm name, IStrategoTerm varname, IStrategoTerm location, IStrategoTerm given) {
		//context.getIOAgent().printError("Input for java_s_exit_0_4: " + current);
		return current;
	}
}
