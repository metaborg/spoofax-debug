package org.strategoxt.debug.core.control;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
  DSMTestBasic.class,
  DSMTestDynamic.class,
  DSMTestImports.class,
  DSMTestStepInto.class,
  DSMTestStepping.class,
  DSMTestStepReturn.class,
  DSMTransformerDebug.class
})

public class DSMSuite {
	
	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.strategoxt.debug.core.control");
		//$JUnit-BEGIN$

		//$JUnit-END$
		return suite;
	}

}
