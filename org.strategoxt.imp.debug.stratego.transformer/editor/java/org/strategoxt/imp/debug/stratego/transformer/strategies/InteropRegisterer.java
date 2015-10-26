package org.strategoxt.imp.debug.stratego.transformer.strategies;

import org.strategoxt.lang.JavaInteropRegisterer;
import org.strategoxt.lang.Strategy;

public class InteropRegisterer extends JavaInteropRegisterer {

	public InteropRegisterer() {
		super(new LibraryInitializer());
	}
}
