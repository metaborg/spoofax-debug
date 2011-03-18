package org.strategoxt.debug.core.util.dctests;

import org.junit.Test;

public class DebugCompilerTest extends AbstractDebugCompileTest {
	
	public static void main(String[] args) {
		DebugCompilerTest t = new DebugCompilerTest();
		t.testDebugCompileLocalVarDebug();
	}
	

	@Test
	public void testDebugCompileLocalVarDebug() {
		this.baseInputPathString = "src/stratego/localvardebug"; // folder
		this.strategoFilePathString = "localvar.str"; // relative to folder
		this.projectName = "localvardebug";
		this.mainClass = "localvardebug.localvardebug";
		checkOutput = true;
		runJava = false;
		compileHelper();
	}


}
