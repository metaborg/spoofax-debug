package org.strategoxt.debug.core.control;

import org.junit.Test;
import org.strategoxt.HybridInterpreter;

/**
 * Launch the HybridInterpreter.
 * 
 * @author rlindeman
 *
 */
public class TestHybridInterpreter {

	@Test
	public void testname() throws Exception {
		String includeDir = "/home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include";
		String jar = includeDir+"/orgexamplelang1.jar";
		String javaJar = includeDir+"/orgexamplelang1-java.jar";
		String main = "main";
		String[] args = new String[] {javaJar, jar, main};
		HybridInterpreter.main(args);
	}
}
