package org.strategoxt.imp.debug.stratego.transformer;


import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.TermFactory;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_apply_debug_testimports_full_rtree_0_0;
import org.strategoxt.imp.debug.stratego.transformer.trans.test_apply_debug_testimports_full_str_0_0;
import org.strategoxt.lang.Context;

/**
 * Parse testimports stratego project
 * 
 * @author rlindeman
 *
 */
public class ParseTestimportsTest {

	private static TermFactory factory = new TermFactory();
	
	public static void createRtree()
	{
		System.out.println("test-apply-debug-testimports-full-rtree");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = factory.makeString("");
		test_apply_debug_testimports_full_rtree_0_0.instance.invoke(context, currentTerm);
		// compile stratego to java
	}
	
	public static void createStr()
	{
		System.out.println("test-apply-debug-testimports-full-str");
		Context context = org.strategoxt.imp.debug.stratego.transformer.trans.Main.init();
		IStrategoTerm currentTerm = factory.makeString("");
		test_apply_debug_testimports_full_str_0_0.instance.invoke(context, currentTerm);
		// compile stratego to java
	}
	
	public static void debugCompileRtree()
	{
		
	}
	
	public static void debugCompileStr()
	{
		
	}
}
