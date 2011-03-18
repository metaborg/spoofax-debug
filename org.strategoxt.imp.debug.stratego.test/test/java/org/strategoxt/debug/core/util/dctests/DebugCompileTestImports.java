package org.strategoxt.debug.core.util.dctests;

import org.junit.Test;

public class DebugCompileTestImports extends AbstractDebugCompileTest {

	public static void main(String[] args) {
		DebugCompileTestImports t = new DebugCompileTestImports();
		t.testDebugCompileTestImports();
	}

	@Test
	public void testDebugCompileTestImports()
	{
		this.baseInputPathString = "src/stratego/testimports"; // folder
		this.strategoFilePathString = "localvar.str"; // relative to folder
		this.projectName = "testimports";
		this.mainClass = "testimports.testimports";
		checkOutput = true;
		runJava = false;
		compileHelper();
	}
}
