package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;

public class java_s_var_0_5 extends DebugCallStrategy {

	
	public static java_s_var_0_5 instance = new java_s_var_0_5();

	public static int breakpointLinenumber = 16;
	
	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm filename,	IStrategoTerm name, IStrategoTerm varname, IStrategoTerm location, IStrategoTerm given) {
		super.invoke(context, current, filename, name, varname, location, given);
		nothing();
		return current;
	}
	
	public static String getFullClassName()
	{
		return instance.getClass().getName();
	}
}
