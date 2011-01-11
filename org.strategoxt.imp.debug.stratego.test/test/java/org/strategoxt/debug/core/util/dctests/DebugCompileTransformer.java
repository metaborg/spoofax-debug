package org.strategoxt.debug.core.util.dctests;

import java.io.File;
import java.io.IOException;

import org.StrategoFileManager;
import org.strategoxt.debug.core.util.DebugCompiler;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.DebugSessionSettingsFactory;

/*


gen-debug-var.str:213
	to-string :
	  	value ->  NoAnnoList(Str(value))

replace it with
	to-string-term :
	  	value ->  NoAnnoList(Str(value))


P:/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test
Adding debug information to /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/stratego-transformer.str
Please wait...
/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans
stratego-transformer.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/tests/strategoxt-parsing-test.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/strategoxt-parsing-test.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/tests/parsing-test.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/parsing-test.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/tests/imports-test.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/imports-test.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/transformer-test-suite.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/transformer-test-suite.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/traverse-imports.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/traverse-imports.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/gen-lookup.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-lookup.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/assert.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/assert.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/location-util.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/location-util.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/gen-debug-entry.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-entry.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/gen-debug-var-arg.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-var-arg.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/gen-debug-var.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-var.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/gen-debug-step.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-step.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/gen-debug-info.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-info.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/str-reader.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/str-reader.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/trans-str.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/trans-str.str
file: /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.transformer/trans/stratego-transformer.str
Writing str.../home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/stratego-transformer.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/strategoxt-parsing-test.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/parsing-test.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/imports-test.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/transformer-test-suite.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/traverse-imports.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-lookup.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/assert.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/location-util.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-entry.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-var-arg.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-var.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-step.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-info.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/str-reader.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/trans-str.str
SUCCES /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/stratego-transformer.str
create-table["/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/strategoxt-parsing-test.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/parsing-test.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/tests/imports-test.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/transformer-test-suite.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/traverse-imports.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-lookup.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/assert.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/location-util.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-entry.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-var-arg.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-var.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-step.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/gen-debug-info.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/str-reader.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/trans-str.str","/home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/stratego-transformer.str"]
Generated file at /home/rlindeman/Documents/TU/strategoxt/spoofax-imp/source/org.strategoxt.imp.debug.stratego.test/working/transformer/stratego/stratego-transformer.str
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
public class DebugCompileTransformer {

	public static void main(String[] args) {
		//testDebugCompileLocalVar();
		testDebugCompileTransformer();
	}

	private static void testDebugCompileTransformer() {
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
		
		String projectName = "transformer";
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
		boolean runjava = true;
		// run .class
		if (runjava && compileSucces)
		{
			String input = StrategoFileManager.BASE + "/src/stratego/transformer/run.input";
			String argsForMainClass = "-i " + input;
			String mainClass = "transformer.transformer";
			String mainArgs = mainClass + " " + argsForMainClass;
			
			String strategoxtjar = debugSessionSettings.getStrategoxtJar();
			String libstrategodebuglib = debugSessionSettings.getStrategoDebugRuntimeJar();
			String strjdebugruntime = debugSessionSettings.getStrategoDebugRuntimeJavaJar();
			
			String cp = strategoxtjar + ":" + libstrategodebuglib + ":" + strjdebugruntime + ":" + binBase;
			String classpath = cp;
			System.out.println("ARGS: " + mainArgs);
			org.strategoxt.debug.core.util.Runner.run(projectName, mainArgs, classpath);
		}
	}
}
