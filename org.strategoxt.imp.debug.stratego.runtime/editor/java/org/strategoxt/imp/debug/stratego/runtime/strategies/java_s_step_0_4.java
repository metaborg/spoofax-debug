package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategyCollector;

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
public class java_s_step_0_4 extends DebugCallStrategy {
	
	protected static java_s_step_0_4 instance = new java_s_step_0_4();

	public static int breakpointLinenumber = 26;
	
	@Override
	public void registerImplementators(StrategyCollector collector) {
		collector.registerStrategyImplementator("s_step_0_4", instance);
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
