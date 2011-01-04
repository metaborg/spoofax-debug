package org.strategoxt.imp.debug.stratego.transformer;

import org.StrategoFileManager;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.StrategoExit;

/**
 * Test the main strategy of stratego-transformer.str.
 * The main strategy adds debug information to a stratego program and writes it to an output directory.
 * 
 * @author rlindeman
 *
 */
public class MainStrategyTest {
	public static void main(String[] args) {
		m1();
		m2();
	}

	private static void m1() {
		String baseInputPath = "src/stratego/localvardebug";
		String strategoFilePath = "localvar.str";
		String strategoSourceBasedir = StrategoFileManager.BASE + "/" + baseInputPath + "/" + strategoFilePath;

		String stratego_input = strategoSourceBasedir;
		String output_base_dir = StrategoFileManager.WORKING_DIR + "/" + "java_main_test1";
		String[] l_args = new String[]{
				"-i", stratego_input
				, "-o", output_base_dir};
		IStrategoTerm result = null;
		try {
			result = org.strategoxt.imp.debug.stratego.transformer.trans.Main.mainNoExit(l_args);
		} catch(StrategoExit exit)
		{
			if (exit.getValue() == StrategoExit.SUCCESS)
			{
				System.out.println("SUCCES");
				System.out.println(result);
			}
		}
	}


	private static void m2() {
		String baseInputPath = "src/stratego/testimports";
		String strategoFilePath = "localvar.str";
		String strategoSourceBasedir = StrategoFileManager.BASE + "/" + baseInputPath + "/" + strategoFilePath;

		String stratego_input = strategoSourceBasedir;
		String output_base_dir = StrategoFileManager.WORKING_DIR + "/" + "java_main_test2";
		String[] l_args = new String[]{
				"-i", stratego_input
				, "-o", output_base_dir};
		IStrategoTerm result = null;
		try {
			result = org.strategoxt.imp.debug.stratego.transformer.trans.Main.mainNoExit(l_args);
		} catch(StrategoExit exit)
		{
			if (exit.getValue() == StrategoExit.SUCCESS)
			{
				System.out.println("SUCCES");
				System.out.println(result);
			}
		}
	}
	
}
