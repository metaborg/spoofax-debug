package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

/**
 * 
 * a step event is fired before each strategy.
 * e.g.
 * foo;bar; baz
 * becomes
 * (s-step; foo); (s-step; bar); (s-step; baz)
 * 
 * @author rlindeman
 *
 */
public class java_s_step_0_4 extends Strategy {
	
	public static java_s_step_0_4 instance = new java_s_step_0_4();

	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm filename,	IStrategoTerm name, IStrategoTerm location, IStrategoTerm given) {
		//context.getIOAgent().printError("Input for java_s_exit_0_4: " + current);
		return current;
	}

}
