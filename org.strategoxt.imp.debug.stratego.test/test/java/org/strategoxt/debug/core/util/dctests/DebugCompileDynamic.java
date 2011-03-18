package org.strategoxt.debug.core.util.dctests;

import org.junit.Test;

public class DebugCompileDynamic extends AbstractDebugCompileTest {

	public static void main(String[] args) {
		//testDebugCompileLocalVar();
		DebugCompileDynamic t = new DebugCompileDynamic();
		t.testDebugCompileDynamic();
	}
	
	@Test
	public void testDebugCompileDynamic() {
		this.baseInputPathString = "src/stratego/dynamic"; // folder
		this.strategoFilePathString = "localvar.str"; // relative to folder
		this.projectName = "dynamic";
		this.mainClass = "dynamic.dynamic";
		checkOutput = true;
		runJava = false;
		compileHelper();
		
	}
	
}
