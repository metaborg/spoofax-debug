package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.strategoxt.lang.JavaInteropRegisterer;
import org.strategoxt.lang.Strategy;

/**
 * Helper class for {@link java_strategy_0_0}.
 */
public class InteropRegisterer extends JavaInteropRegisterer {

	public InteropRegisterer() {
		super(new Strategy[] { 
				java_s_enter_0_4.instance // strategy enter
				, java_s_exit_0_4.instance // strategy exit
				, java_r_enter_0_4.instance // rule enter
				, java_r_exit_0_4.instance // rule exit
				, java_s_step_0_4.instance // step
				, java_s_var_0_5.instance // var assignment
				});
	}
}
