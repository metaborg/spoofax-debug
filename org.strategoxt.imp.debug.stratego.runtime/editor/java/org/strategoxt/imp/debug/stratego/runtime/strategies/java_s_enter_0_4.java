package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

/**
 * Called when a strategy is entered.
 * 
 * @author rlindeman
 * 
 */
public class java_s_enter_0_4 extends Strategy {
	public static java_s_enter_0_4 instance = new java_s_enter_0_4();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm filename,	IStrategoTerm name, IStrategoTerm location, IStrategoTerm given) {
		//context.getIOAgent().printError("Input for java_s_enter_0_4: " + current);
		return current;
	}
}
