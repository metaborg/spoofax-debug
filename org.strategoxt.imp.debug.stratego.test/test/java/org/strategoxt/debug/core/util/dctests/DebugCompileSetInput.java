package org.strategoxt.debug.core.util.dctests;

import org.junit.Test;

public class DebugCompileSetInput extends AbstractDebugCompileTest {

	
	@Test
	public void testDebugCompileSetInput() throws Exception {
		// compile the setinput.str
		this.baseInputPathString = "src/stratego/setinput"; // folder
		this.strategoFilePathString = "setinput.str"; // relative to folder
		this.projectName = "setinput";
		this.mainClass = "setinput.setinput";
		checkOutput = false;
		runJava = false;
		compileHelper();
	}

	
}

