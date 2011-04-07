package org.strategoxt.debug.core.control;

import org.eclipse.core.runtime.Path;
import org.junit.Test;
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
		String javaJar = includeDir+"/orgexamplelang1-java.jar";
		String jar = includeDir+"/orgexamplelang1.jar";
		
		String projectName = "stub";
		createDebugSessionSettings(projectName);

		// dynamically load language.jar, it will assume the language-java.jar is already on the classpath
		String invokeStrategy = "main12"; // will converted to a java name e.g.: main12_0_0
		String argsForMainClass = javaJar + " " + jar + " " + invokeStrategy + " " + "str.args";
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
	
	@Test
	public void testDSM4() throws Exception {
		// test another JVM connect type
		
		// launch in terminal:
		/*
		/usr/lib/jvm/java-6-sun/jre/bin/java -Xrunjdwp:transport=dt_socket,server=y,address=8000 -Xss8m -Xms256m -Xmx1024m -XX:MaxPermSize=256m -server -Dvisualvm.display.name=FooBar -classpath /home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include/orgexamplelang1.jar /home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include/orgexamplelang1-java.jar /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/stub/class /home/rlindeman/Applications/development/eclipse/helios_sdk/eclipse/plugins/org.strategoxt.strj_0.17.92.201103221248/java/strategoxt.jar /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.runtime/include/stratego-debug-runtime.jar /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.runtime/include/stratego-debug-runtime-java.jar org.strategoxt.HybridInterpreter /home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include/orgexamplelang1-java.jar /home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include/orgexamplelang1.jar main12 str.args
		
		
		Listening for transport dt_socket at address: 8000
Exception in thread "main" java.lang.NoClassDefFoundError: /home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org/example/lang1/include/orgexamplelang1-java/jar
Caused by: java.lang.ClassNotFoundException: .home.rlindeman.Applications.development.eclipse.helios_sdk.workspace.org.example.lang1.include.orgexamplelang1-java.jar
	at java.net.URLClassLoader$1.run(URLClassLoader.java:202)
	at java.security.AccessController.doPrivileged(Native Method)
	at java.net.URLClassLoader.findClass(URLClassLoader.java:190)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:307)
	at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:301)
	at java.lang.ClassLoader.loadClass(ClassLoader.java:248)
Could not find the main class: /home/rlindeman/Applications/development/eclipse/helios_sdk/workspace/org.example.lang1/include/orgexamplelang1-java.jar.  Program will exit.

		
		*/
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
		//start(dsm, mainArgs, "ATTACH");
		start(dsm, mainArgs);
	}
}