package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;

/**
 * Called right before the strategy exits
 * 
 * @author rlindeman
 * 
 */
public class java_s_exit_0_4 extends DebugCallStrategy {
	public static java_s_exit_0_4 instance = new java_s_exit_0_4();

	public static int breakpointLinenumber = 20;
	
	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm filename,	IStrategoTerm name, IStrategoTerm location, IStrategoTerm given) {
		super.invoke(context, current, filename, name, location, given);
		nothing();
		return current;
	}
	
	public static String getFullClassName()
	{
		return instance.getClass().getName();
	}
}
