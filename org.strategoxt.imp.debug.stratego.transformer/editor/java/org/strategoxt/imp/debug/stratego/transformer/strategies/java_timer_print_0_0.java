package org.strategoxt.imp.debug.stratego.transformer.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class java_timer_print_0_0 extends Strategy {

	public static java_timer_print_0_0 instance = new java_timer_print_0_0();
	

	
	public IStrategoTerm invoke(Context context, IStrategoTerm current)
	{
		TimeMonitor.getTimeMonitor().print();
		return current;
	}
}
