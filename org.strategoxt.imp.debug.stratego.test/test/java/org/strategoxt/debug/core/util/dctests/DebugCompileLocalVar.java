package org.strategoxt.debug.core.util.dctests;

import org.junit.Test;

public class DebugCompileLocalVar extends AbstractDebugCompileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DebugCompileLocalVar t = new DebugCompileLocalVar();
		//t.testDebugCompileLocalVar();
		t.testDebugCompileLocalVarOutputRtree();
	}
	
	@Test
	public void testDebugCompileLocalVar() {
		this.baseInputPathString = "src/stratego/localvar"; // folder
		this.strategoFilePathString = "localvar.str"; // relative to folder
		this.projectName = "localvar";
		this.mainClass = "localvar.localvar";
		checkOutput = true;
		runJava = false;
		compileHelper();
	}
	
	
	/**
	 * Output rtree instead of str files
	 */
	@Test
	public void testDebugCompileLocalVarOutputRtree() {
		this.baseInputPathString = "src/stratego/localvar"; // folder
		this.strategoFilePathString = "localvar.str"; // relative to folder
		this.projectName = "localvar_rtree";
		this.mainClass = "localvar_rtree.localvar_rtree";
		checkOutput = true;
		runJava = false;
		this.generateStrategoExtraArguments = new String[] {"--output-rtree"};
		compileHelper();
	}
	
	
	@Test
	public void testRunCompileLocalVar() {
		this.baseInputPathString = "src/stratego/localvar"; // folder
		this.strategoFilePathString = "localvar.str"; // relative to folder
		this.projectName = "localvar_run";
		this.mainClass = "localvar_run.localvar_run";
		checkOutput = false;
		runJava = false;
		debugCompile = false;
		compileHelper();
	}
	
}
