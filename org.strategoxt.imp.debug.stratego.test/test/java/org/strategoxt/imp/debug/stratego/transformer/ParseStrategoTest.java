package org.strategoxt.imp.debug.stratego.transformer;

import org.spoofax.interpreter.terms.BasicStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_apply_debug_strategoxt_full_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_output_parse_stratego_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_parse_localvar_1_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_parse_test_prop_1_0_0;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.terms.TermFactory;


public class ParseStrategoTest {

	public static void main(String[] args) {
		//m1();
		//m2();
		//m3();
		//m4(); // walk over strategoxt source and apply debug transformation
		m5();
	}
	
	public static void m1() {
		System.out.println("test-parse-localvar-2");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		TermFactory factory = new TermFactory();
		IStrategoTerm currentTerm = factory.makeString("");
		test_parse_localvar_1_0_0.instance.invoke(context, currentTerm);
	}

	public static void m2() {
		System.out.println("test-parse-localvar-2");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		TermFactory factory = new TermFactory();
		IStrategoTerm currentTerm = factory.makeString("");
		test_parse_test_prop_1_0_0.instance.invoke(context, currentTerm);

	}


	public static void m4()
	{
		System.out.println("test-apply-debug-strategoxt-full");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = new BasicStrategoString("");
		test_apply_debug_strategoxt_full_0_0.instance.invoke(context, currentTerm);
	}
	
	public static void m5()
	{
		// parse-stratego from the commandline returns an ast that is not the same as the java version
		System.out.println("test-output-parse-stratego");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = new BasicStrategoString("");
		test_output_parse_stratego_0_0.instance.invoke(context, currentTerm);
	}

}
