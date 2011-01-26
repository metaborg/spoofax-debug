package org.strategoxt.debug.core.util.dctests;

import java.io.File;
import java.io.IOException;

import org.StrategoFileManager;
import org.junit.Test;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;

/*
Stackoverflow
Add command line options!

-Xss8m
-Xms256m
-Xmx1024m
-XX:MaxPermSize=256m
-server


gen-debug-var.str:213
	to-string :
	  	value ->  NoAnnoList(Str(value))

replace it with
	to-string-term :
	  	value ->  NoAnnoList(Str(value))

Compile str to java...
Exception: giving-up
org.strategoxt.debug.core.util.DebugCompileException: Failed to compile stratego program to java. 
error: redefining external definition: to-string
giving-up
	at org.strategoxt.debug.core.util.DebugCompiler.compileStratego(DebugCompiler.java:377)
	at org.strategoxt.debug.core.util.DebugCompiler.debugCompile(DebugCompiler.java:168)
	at org.strategoxt.debug.core.util.dctests.DebugCompileTransformer.testDebugCompileTransformer(DebugCompileTransformer.java:51)
	at org.strategoxt.debug.core.util.dctests.DebugCompileTransformer.main(DebugCompileTransformer.java:17)
Caused by: org.strategoxt.lang.StrategoErrorExit: giving-up
	at org.strategoxt.lang.SRTS_EXT_fatal_err_0_2.invoke(SRTS_EXT_fatal_err_0_2.java:23)
	at org.strategoxt.lang.compat.override.java_integration.fatal_error_0_0_override.invoke(fatal_error_0_0_override.java:34)
	at org.strategoxt.stratego_lib.giving_up_0_0.invoke(giving_up_0_0.java:23)
	at org.strategoxt.strc.$Join$Defs$Ext_0_0.invoke($Join$Defs$Ext_0_0.java:81)
	at org.strategoxt.strc.lifted1852.invoke(lifted1852.java:42)
	at org.strategoxt.strc.m_transform_def_1_0.invoke(m_transform_def_1_0.java:54)
	at org.strategoxt.strc.lifted2876.invoke(lifted2876.java:31)
	at org.strategoxt.lang.SRTS_EXT_filter_1_0.filterIgnoreAnnos(SRTS_EXT_filter_1_0.java:83)
	at org.strategoxt.lang.SRTS_EXT_filter_1_0.invoke(SRTS_EXT_filter_1_0.java:34)
	at org.strategoxt.lang.compat.override.performance_tweaks.filter_1_0_override.invoke(filter_1_0_override.java:21)
	at org.strategoxt.strc.m_transform_local_defs_1_0.invoke(m_transform_local_defs_1_0.java:31)
	at org.strategoxt.strc.lifted1811.invoke(lifted1811.java:184)
	at org.strategoxt.strc.lifted2875.invoke(lifted2875.java:28)
	at org.strategoxt.stratego_lib.dr_scope_1_1.invoke(dr_scope_1_1.java:58)
	at org.strategoxt.strc.lifted2874.invoke(lifted2874.java:32)
	at org.strategoxt.stratego_lib.dr_scope_1_1.invoke(dr_scope_1_1.java:58)
	at org.strategoxt.strc.lifted2873.invoke(lifted2873.java:32)
	at org.strategoxt.stratego_lib.dr_scope_1_1.invoke(dr_scope_1_1.java:58)
	at org.strategoxt.strc.lifted2872.invoke(lifted2872.java:32)
	at org.strategoxt.stratego_lib.dr_scope_1_1.invoke(dr_scope_1_1.java:58)
	at org.strategoxt.strc.lifted2871.invoke(lifted2871.java:32)
	at org.strategoxt.stratego_lib.dr_scope_1_1.invoke(dr_scope_1_1.java:58)
	at org.strategoxt.strc.m_transform_no_overlays_1_0.invoke(m_transform_no_overlays_1_0.java:33)
	at org.strategoxt.strc.frontend_0_0.invoke(frontend_0_0.java:38)
	at org.strategoxt.strc.lifted836.invoke(lifted836.java:55)
	at org.strategoxt.strc.log_timed_1_2.invoke(log_timed_1_2.java:60)
	at org.strategoxt.strc.strc_front_end_0_0.invoke(strc_front_end_0_0.java:32)
	at org.strategoxt.strj.lifted591.invoke(lifted591.java:53)
	at org.strategoxt.strj.lifted6.invoke(lifted6.java:32)
	at org.strategoxt.stratego_lib.dr_scope_1_1.invoke(dr_scope_1_1.java:58)
	at org.strategoxt.strj.dr_scope_all_verbose_1_0.invoke(dr_scope_all_verbose_1_0.java:32)
	at org.strategoxt.strj.strj_0_0.invoke(strj_0_0.java:75)
	at org.strategoxt.strj.strj_or_die_0_0.invoke(strj_or_die_0_0.java:31)
	at org.strategoxt.stratego_xtc.lifted80.invoke(lifted80.java:35)
	at org.strategoxt.stratego_lib.restore_always_2_0.invoke(restore_always_2_0.java:28)
	at org.strategoxt.stratego_xtc.xtc_temp_files_1_0.invoke(xtc_temp_files_1_0.java:30)
	at org.strategoxt.stratego_xtc.xtc_input_1_0.invoke(xtc_input_1_0.java:24)
	at org.strategoxt.strj.lifted586.invoke(lifted586.java:24)
	at org.strategoxt.strc.log_timed_1_2.invoke(log_timed_1_2.java:60)
	at org.strategoxt.strj.main_strj_0_0.invoke(main_strj_0_0.java:37)
	at org.strategoxt.strj.main_0_0.invoke(main_0_0.java:25)
	at org.strategoxt.lang.Context.invokeStrategyCLI(Context.java:174)
	at org.strategoxt.strj.Main.mainNoExit(Main.java:2748)
	at org.strategoxt.debug.core.util.DebugCompiler.compileStratego(DebugCompiler.java:365)
	... 3 more

 */
public class DebugCompileTransformer extends AbstractDebugCompileTest {

	public static void main(String[] args) {

		DebugCompileTransformer test = new DebugCompileTransformer();
		
		//long a1 = System.currentTimeMillis();
		//test.testDebugCompileTransformer();
		long a2 = System.currentTimeMillis();
		//System.out.println("DBG:" + (a2 - a1));

		test.testRunCompileTransformer();
		long a3 = System.currentTimeMillis();
		System.out.println("RUN:" + (a3 - a2));
		
	}

	@Test
	public void testDebugCompileTransformer() {
		String baseInputPath = "trans";
		String strategoFilePath = "stratego-transformer.str";

		String transformerProject = "../org.strategoxt.imp.debug.stratego.transformer";
		File f = new File(transformerProject);
		try {
			//System.out.println("INPUT: " + f.getCanonicalPath());
			transformerProject = f.getCanonicalPath(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String strategoSourceBasedir = transformerProject + "/" + baseInputPath;
		
		String projectName = "transformer_debug";
		DebugCompiler debugCompiler = new DebugCompiler(StrategoFileManager.WORKING_DIR);
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		
		String[] compileTimeExtraArguments = new String[]
		                                          {
				"-I", transformerProject
				, "-la", "strc"
		                                          };
		
		debugSessionSettings.setCompileTimeExtraArguments(compileTimeExtraArguments);
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		String binBase = null;
		boolean compileSucces = false;
		try {
			binBase = debugCompiler.debugCompile(debugSessionSettings);
			compileSucces = true;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/localvar/localvar.str"; // program that will be debug transformed
			String output = StrategoFileManager.WORKING_DIR + "/transformer_debug_output_localvar";
			String argsForMainClass = "-i " + input + " -o " + output;
			String mainClass = "transformer_debug.transformer_debug";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String strategoxtjar = debugSessionSettings.getStrategoxtJar();
			String libstrategodebuglib = debugSessionSettings.getStrategoDebugRuntimeJar();
			String strjdebugruntime = debugSessionSettings.getStrategoDebugRuntimeJavaJar();
			
			String cp = strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + binBase;
			String classpath = cp;
			System.out.println("ARGS: " + mainArgs);
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
		debugCompiler.getDebugCompileProgress().printStats();
	}

	@Test
	public void testRunCompileTransformer() {
		String baseInputPath = "trans";
		String strategoFilePath = "stratego-transformer.str";

		String transformerProject = "../org.strategoxt.imp.debug.stratego.transformer";
		File f = new File(transformerProject);
		try {
			//System.out.println("INPUT: " + f.getCanonicalPath());
			transformerProject = f.getCanonicalPath(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String strategoSourceBasedir = transformerProject + "/" + baseInputPath;
		
		String projectName = "transformer_run";
		DebugCompiler debugCompiler = new DebugCompiler(StrategoFileManager.WORKING_DIR);
		DebugSessionSettings debugSessionSettings = DebugSessionSettingsFactory.createTest(StrategoFileManager.WORKING_DIR, projectName);
		debugSessionSettings.setStrategoSourceBasedir(strategoSourceBasedir);
		debugSessionSettings.setStrategoFilePath(strategoFilePath);
		
		String[] compileTimeExtraArguments = new String[]
		                                          {
				"-I", transformerProject
				, "-la", "strc"
		                                          };
		
		debugSessionSettings.setCompileTimeExtraArguments(compileTimeExtraArguments);
		// mkdir localvar/stratego in workingdir
		// mkdir localvar/java
		// mkdir localvar/class
		String binBase = null;
		boolean compileSucces = false;
		try {
			binBase = debugCompiler.runCompile(debugSessionSettings);
			compileSucces = true;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		checkOutput(debugSessionSettings);
		
		boolean runjava = false;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/localvar/localvar.str"; // program that will be debug transformed
			String output = StrategoFileManager.WORKING_DIR + "/transformer_run_output_localvar";
			String argsForMainClass = "-i " + input + " -o " + output;
			String mainClass = "transformer_run.transformer_run";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String strategoxtjar = debugSessionSettings.getStrategoxtJar();
			String libstrategodebuglib = debugSessionSettings.getStrategoDebugRuntimeJar();
			String strjdebugruntime = debugSessionSettings.getStrategoDebugRuntimeJavaJar();
			
			String cp = strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + binBase;
			String classpath = cp;
			System.out.println("ARGS: " + mainArgs);
			org.strategoxt.debug.core.util.Runner.run(debugSessionSettings, mainArgs, classpath);
		}
		debugCompiler.getDebugCompileProgress().printStats();
	}
}
