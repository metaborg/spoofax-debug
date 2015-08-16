package org.strategoxt.imp.debug.stratego.transformer.strategies;

import java.util.HashMap;
import java.util.Map;

import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.RegisteringStrategy;
import org.strategoxt.lang.StrategyCollector;

public class java_store_term_0_1 extends RegisteringStrategy {

	protected static java_store_term_0_1 instance = new java_store_term_0_1();
	
	private Map<String, IStrategoTerm> storedTerms = new HashMap<String, IStrategoTerm>();
	
	@Override
	public void registerImplementators(StrategyCollector collector) {
		collector.registerStrategyImplementator("java_store_term_0_1", instance);
	}
	
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm name)
	{
		// TODO: should we clone it so the current term can get collected by the GC?
		String key = null;
		if (name instanceof IStrategoString)
		{
			key = ((IStrategoString) name).stringValue();
		}
		if (key != null)
		{
			this.storedTerms.put(key, current);
		}
		return current;
	}
	
	public IStrategoTerm getStoredTerm(String name)
	{
		if (storedTerms.containsKey(name)) {
			return storedTerms.get(name);
		} else {
			return null;
		}
	}
}
