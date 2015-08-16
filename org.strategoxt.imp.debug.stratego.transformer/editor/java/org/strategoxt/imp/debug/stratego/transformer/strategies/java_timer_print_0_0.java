package org.strategoxt.imp.debug.stratego.transformer.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.RegisteringStrategy;
import org.strategoxt.lang.StrategyCollector;

public class java_timer_print_0_0 extends RegisteringStrategy {

	protected static java_timer_print_0_0 instance = new java_timer_print_0_0();
	
	@Override
	public void registerImplementators(StrategyCollector collector) {
		collector.registerStrategyImplementator("java_timer_print_0_0", instance);
	}
	
	public IStrategoTerm invoke(Context context, IStrategoTerm current)
	{
		TimeMonitor.getTimeMonitor().print();
		return current;
	}
}
