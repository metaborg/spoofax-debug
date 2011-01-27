package org.strategoxt.debug.core.util.dctests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	DebugCompileDynamic.class,
	DebugCompileInvalidProgramTest.class,
	DebugCompileLocalVar.class,
	DebugCompilerTest.class,
	DebugCompileTestImports.class,
	DebugCompileTestProp.class,
	DebugCompileTransformer.class,
	DebugCompileTransformerError.class
})
public class DebugCompileSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.strategoxt.debug.core.util.dctests");
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}
}
