package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.strategoxt.lang.JavaInteropRegisterer;

/**
 * Helper class for {@link java_strategy_0_0}.
 */
public class InteropRegisterer extends JavaInteropRegisterer {

	public InteropRegisterer() {
		super(new LibraryInitializer());
	}
}
