package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategyCollector;

/**
 * Called when a Where or With clause in a rule fails.
 * 
 * @author rlindeman
 *
 */
public class java_s_fail_0_4 extends DebugCallStrategy {
	protected static java_s_fail_0_4 instance = new java_s_fail_0_4();
	
	public static int breakpointLinenumber = 21;
	
	@Override
	public void registerImplementators(StrategyCollector collector) {
		collector.registerStrategyImplementator("s_fail_0_4", instance);
	}
		
	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm filename,	IStrategoTerm name, IStrategoTerm location, IStrategoTerm given) {
		super.invoke(context, current, filename, name, location, given);
		nothing();
		return this.current;
	}
	
	public static String getFullClassName()
	{
		return instance.getClass().getName();
	}	
}
