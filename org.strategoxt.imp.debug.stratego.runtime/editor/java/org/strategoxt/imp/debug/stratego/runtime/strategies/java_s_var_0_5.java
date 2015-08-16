package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategyCollector;

public class java_s_var_0_5 extends DebugCallStrategy {

	
	protected static java_s_var_0_5 instance = new java_s_var_0_5();

	public static int breakpointLinenumber = 16;
	
	@Override
	public void registerImplementators(StrategyCollector collector) {
		collector.registerStrategyImplementator("java_s_var_0_5", instance);
	}
	
	@Override
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm filename,	IStrategoTerm name, IStrategoTerm varname, IStrategoTerm location, IStrategoTerm given) {
		super.invoke(context, current, filename, name, varname, location, given);
		nothing();
		return this.current;
	}
	
	public static String getFullClassName()
	{
		return instance.getClass().getName();
	}
}
