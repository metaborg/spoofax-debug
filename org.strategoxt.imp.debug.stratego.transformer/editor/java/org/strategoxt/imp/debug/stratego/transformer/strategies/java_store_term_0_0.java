package org.strategoxt.imp.debug.stratego.transformer.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.RegisteringStrategy;
import org.strategoxt.lang.StrategyCollector;

public class java_store_term_0_0 extends RegisteringStrategy {

	protected static java_store_term_0_0 instance = new java_store_term_0_0();
	
	@Override
	public void registerImplementators(StrategyCollector collector) {
		collector.registerStrategyImplementator("java_store_term_0_0", instance);
	}
	
	private IStrategoTerm storedTerm = null;
	
	public IStrategoTerm invoke(Context context, IStrategoTerm current)
	{
		storedTerm = current; // TODO: should we clone it so the current term can get collected by the GC?
		return current;
	}
	
	public IStrategoTerm getStoredTerm()
	{
		return storedTerm;
	}
}
