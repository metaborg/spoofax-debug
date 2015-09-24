package org.strategoxt.imp.debug.stratego.runtime.strategies;

import java.util.Arrays;
import java.util.List;

import org.strategoxt.lang.Context;
import org.strategoxt.lang.RegisteringStrategy;

public class LibraryInitializer extends org.strategoxt.lang.LibraryInitializer {

	@Override
	protected List<RegisteringStrategy> getLibraryStrategies() {
		return Arrays.<RegisteringStrategy>asList(java_r_enter_0_4.instance, java_r_exit_0_4.instance, java_s_enter_0_4.instance, java_s_exit_0_4.instance, java_s_fail_0_4.instance, java_s_step_0_4.instance, java_s_var_0_5.instance);
	}

	@Override
	protected void initializeLibrary(Context context) {
		
	}

}
