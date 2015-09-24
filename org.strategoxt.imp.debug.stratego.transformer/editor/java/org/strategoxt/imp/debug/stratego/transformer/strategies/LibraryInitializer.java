package org.strategoxt.imp.debug.stratego.transformer.strategies;

import java.util.Arrays;
import java.util.List;

import org.strategoxt.lang.Context;
import org.strategoxt.lang.RegisteringStrategy;

public class LibraryInitializer extends org.strategoxt.lang.LibraryInitializer {

	@Override
	protected List<RegisteringStrategy> getLibraryStrategies() {
		return Arrays.asList(java_create_fll_table_0_3.instance, java_monitor_end_0_1.instance, java_monitor_start_0_1.instance, java_store_term_0_0.instance, java_store_term_0_1.instance, java_timer_print_0_0.instance);
	}

	@Override
	protected void initializeLibrary(Context context) {
		Main.init(context);
	}

}
