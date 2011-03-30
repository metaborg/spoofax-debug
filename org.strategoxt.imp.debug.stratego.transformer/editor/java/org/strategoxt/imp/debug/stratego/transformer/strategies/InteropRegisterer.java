package org.strategoxt.imp.debug.stratego.transformer.strategies;

import org.strategoxt.lang.JavaInteropRegisterer;
import org.strategoxt.lang.Strategy;

public class InteropRegisterer extends JavaInteropRegisterer {

	public InteropRegisterer() {
		super(new Strategy[] { 
				java_store_term_0_0.instance
				, java_store_term_0_1.instance
				, java_monitor_start_0_1.instance
				, java_monitor_end_0_1.instance
				, java_timer_print_0_0.instance
				, java_create_fll_table_0_3.instance
		});
	}
}
