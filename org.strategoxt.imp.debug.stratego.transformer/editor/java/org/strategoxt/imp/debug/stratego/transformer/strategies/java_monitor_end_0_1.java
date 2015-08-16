package org.strategoxt.imp.debug.stratego.transformer.strategies;

import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.RegisteringStrategy;
import org.strategoxt.lang.StrategyCollector;

public class java_monitor_end_0_1 extends RegisteringStrategy {

	protected static java_monitor_end_0_1 instance = new java_monitor_end_0_1();
	
	@Override
	public void registerImplementators(StrategyCollector collector) {
		collector.registerStrategyImplementator("java_monitor_end_0_1", instance);
	}
	
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm name)
	{
		String key = null;
		if (name instanceof IStrategoString)
		{
			key = ((IStrategoString) name).stringValue();
		}
		if (key != null)
		{
			TimeMonitor.getTimeMonitor().end(key);
		}
		return current;
	}
}
