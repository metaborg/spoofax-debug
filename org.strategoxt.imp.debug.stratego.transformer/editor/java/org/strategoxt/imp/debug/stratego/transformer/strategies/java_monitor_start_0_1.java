package org.strategoxt.imp.debug.stratego.transformer.strategies;

import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class java_monitor_start_0_1 extends Strategy {

	public static java_monitor_start_0_1 instance = new java_monitor_start_0_1();
	
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm name)
	{
		String key = null;
		if (name instanceof IStrategoString)
		{
			key = ((IStrategoString) name).stringValue();
		}
		if (key != null)
		{
			TimeMonitor.getTimeMonitor().start(key);
		}
		return current;
	}
}
