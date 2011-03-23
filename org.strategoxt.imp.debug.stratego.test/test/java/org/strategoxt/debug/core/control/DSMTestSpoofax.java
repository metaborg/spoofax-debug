package org.strategoxt.debug.core.control;

import org.eclipse.core.runtime.Path;
import org.strategoxt.debug.core.eventspec.StrategyStepBreakPoint;

/**
 * Try to launch a debug session using the output from a spoofax project (all the stuff in the include dir)
 * @author rlindeman
 *
 */
public class DSMTestSpoofax  extends AbstractDSMTest {

	// stratego program should already be compiled
	@org.junit.Test
	public void testDSM1()
	{
		String includeDir = "/home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include";
		//String utilsDir = "/home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/utils";
		String javaJar = includeDir+"/orgexamplelang1-java.jar";
		String jar = includeDir+"/orgexamplelang1.jar";
		
		String projectName = "stub";
		createDebugSessionSettings(projectName);


		// dynamically load language.jar, it will assume the language-java.jar is already on the classpath
		String invokeStrategy = "main12"; // will converted to a java name e.g.: main12_0_0
		String loadJars = javaJar + " " + jar;
		String invokeStrategyArguments = "str.args";
		String argsForMainClass = loadJars + " " + invokeStrategy + " " + invokeStrategyArguments;
		
		String mainClass = "org.strategoxt.HybridInterpreter"; // launch the interpreter
		String mainArgs = mainClass + " " + argsForMainClass;

		// TODO: this.debugSessionSettings.getClassDirectory() is also added but should not be used
		this.addToClasspath(new Path(jar));
		this.addToClasspath(new Path(javaJar));

		
		DebugSessionManager dsm = createDebugSessionManager();		
	
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs);
	}
	
	
	@org.junit.Test
	public void testDSM2()
	{
		String includeDir = "/home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include";
		//String utilsDir = "/home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/utils";
		String javaJar = includeDir+"/orgexamplelang1-java.jar";
		String jar = includeDir+"/orgexamplelang1.jar";
		
		String projectName = "stub";
		createDebugSessionSettings(projectName);

		//String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		//String argsForMainClass = "-i " + input; // Interpreter hasother args
		// dynamically load language.jar, it will assume the language-java.jar is already on the classpath
		String invokeStrategy = "main12"; // will converted to a java name e.g.: main12_0_0
		String argsForMainClass = javaJar + " " + jar + " " + invokeStrategy + " " + "str.args";
		//String mainClass = "trans.trans"; // does not have a Main method
		//String mainClass = "org.example.lang1.strategies.Main";
		String mainClass = "org.strategoxt.HybridInterpreter";
		String mainArgs = mainClass + " " + argsForMainClass;

		// TODO: this.debugSessionSettings.getClassDirectory() is also added but should not be used
		this.addToClasspath(new Path(jar));
		this.addToClasspath(new Path(javaJar));

		
		DebugSessionManager dsm = createDebugSessionManager();
		
		// TODO: use event table
		
		/*
		(s-step(
           | "test-main.str"
           , "main12"
           , LocationInfo("8", "6", "8", "20")
           )
		 */
		// set breakpoint
		String filename = "test-main.str";
		String strategyName = "main12";
		StrategyStepBreakPoint bp = new StrategyStepBreakPoint(filename, strategyName, 8, 6);
		dsm.getEventSpecManager().add(bp);
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		String term = null;
		term = "\"\""; // empty string
		vmStateTester.addStrategoState("main12", termReader.parseFromString(term));
		
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs);
	}
	
	@org.junit.Test
	public void testDSM3()
	{
		String includeDir = "/home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include";
		//String utilsDir = "/home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/utils";
		String javaJar = includeDir+"/orgexamplelang1-java.jar";
		String jar = includeDir+"/orgexamplelang1.jar";
		
		String projectName = "stub";
		createDebugSessionSettings(projectName);

		//String input = StrategoFileManager.BASE + "/src/stratego/localvar/run.input";
		//String argsForMainClass = "-i " + input; // Interpreter hasother args
		// dynamically load language.jar, it will assume the language-java.jar is already on the classpath
		String invokeStrategy = "main12"; // will converted to a java name e.g.: main12_0_0
		String argsForMainClass = javaJar + " " + jar + " " + invokeStrategy + " " + "str.args";
		//String mainClass = "trans.trans"; // does not have a Main method
		//String mainClass = "org.example.lang1.strategies.Main";
		String mainClass = "org.strategoxt.HybridInterpreter";
		String mainArgs = mainClass + " " + argsForMainClass;

		// TODO: this.debugSessionSettings.getClassDirectory() is also added but should not be used
		this.addToClasspath(new Path(jar));
		this.addToClasspath(new Path(javaJar));
		
		DebugSessionManager dsm = createDebugSessionManager();
		
		// TODO: use event table
		
		/*
		(s-step(
           | "test-main.str"
           , "main12"
           , LocationInfo("8", "6", "8", "20")
           )
		 */
		
		// TODO: change current term
		
		// set breakpoint
		String filename = "test-main.str";
		String strategyName = "main12";
		StrategyStepBreakPoint bp = new StrategyStepBreakPoint(filename, strategyName, 8, 6);
		dsm.getEventSpecManager().add(bp);
		
		// which breakpoints will be hit?
		VMStateTester vmStateTester = new VMStateTester(VMStateTesterCompareType.Name);
		String term = null;
		term = "\"\""; // empty string
		vmStateTester.addStrategoState("main12", termReader.parseFromString(term));
		
		vmStateTester.initialize();
		vmMonitor.setVMStateTester(vmStateTester);
		
		System.out.println("RUN");
		// start the debug session
		start(dsm, mainArgs);
	}
}