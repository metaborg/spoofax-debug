package org.strategoxt.debug.core.util.dctests;

import org.junit.Test;

public class DebugCompileInvalidProgramTest extends AbstractDebugCompileTest {

	public static void main(String[] args) {
		DebugCompileInvalidProgramTest t = new DebugCompileInvalidProgramTest();
		t.testCompileInvalidProgram();
	}
	
	@Test
	public void testCompileInvalidProgram()
	{
		this.baseInputPathString = "src/stratego/invalid-program"; // folder
		this.strategoFilePathString = "program.str"; // relative to folder
		this.projectName = "invalidprogram1";
		this.mainClass = "invalidprogram1.invalidprogram1";
		checkOutput = true;
		runJava = false;
		shouldFail = true;
		compileHelper();
		
	}
}
