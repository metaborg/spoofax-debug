package org.strategoxt.imp.debug.stratego.transformer;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.TermFactory;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_apply_debug_strategoxt_full_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_apply_debug_strategoxt_full_rtree_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_output_parse_stratego_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_parse_localvar_1_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_parse_rtree_1_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_parse_test_prop_1_0_0;
import org.strategoxt.lang.Context;


public class ParseStrategoTest {

	private static TermFactory factory = new TermFactory();
	
	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4(); // walk over strategoxt source and apply debug transformation
		//m5();
		
		m7();
	}
	
	public static void m1() {
		System.out.println("test-parse-localvar-2");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = factory.makeString("");
		test_parse_localvar_1_0_0.instance.invoke(context, currentTerm);
	}

	public static void m2() {
		System.out.println("test-parse-localvar-2");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = factory.makeString("");
		test_parse_test_prop_1_0_0.instance.invoke(context, currentTerm);

	}


	public static void m6()
	{
		long start = System.currentTimeMillis();
		System.out.println("test-apply-debug-strategoxt-full");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = factory.makeString("");
		test_apply_debug_strategoxt_full_0_0.instance.invoke(context, currentTerm);
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("GENERATE STRATEGO: " + duration);
	}
	
	public static void m4()
	{
		long start = System.currentTimeMillis();
		System.out.println("test-apply-debug-strategoxt-full-rtree");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = factory.makeString("");
		test_apply_debug_strategoxt_full_rtree_0_0.instance.invoke(context, currentTerm);
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("GENERATE STRATEGO: " + duration);
	}
	
	public static void m5()
	{
		// parse-stratego from the commandline returns an ast that is not the same as the java version
		System.out.println("test-output-parse-stratego");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = factory.makeString("");
		test_output_parse_stratego_0_0.instance.invoke(context, currentTerm);
	}

	
	public static void m7()
	{
		long start = System.currentTimeMillis();
		System.out.println("test-parse-rtree-1");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = factory.makeString("");
		test_parse_rtree_1_0_0.instance.invoke(context, currentTerm);
		long end = System.currentTimeMillis();
		long duration = end - start;
		System.out.println("GENERATE STRATEGO: " + duration);
	}
}
