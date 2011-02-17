package org.other;

import junit.framework.Assert;

import org.junit.Test;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.interpreter.terms.ITermFactory;
import org.spoofax.terms.StringTermReader;
import org.spoofax.terms.TermFactory;

public class TermParser {

	@Test
	public void testParse()
	{
		ITermFactory factory = new TermFactory();
		StringTermReader r = null;
		r = new StringTermReader(factory);
		IStrategoTerm t0 = r.parseFromString("(1,2,3)"); // tuple (1,2,3)
		System.out.println(t0);
		IStrategoTerm t1 = r.parseFromString("[1,2,3]"); // list [1,2,3]
		System.out.println(t1);
		IStrategoTerm t2 = r.parseFromString("LocationInfo(\"23\",\"5\",\"24\",\"7\")");
		System.out.println(t2);
		
		String s = "(\"localvar.str\",\"main\",LocationInfo(\"31\",\"3\",\"32\",\"21\"))";
		IStrategoTerm t3 = r.parseFromString(s);
		Assert.assertEquals(3, t3.getSubtermCount());
		IStrategoTerm t3_0 = t3.getSubterm(0);
		Assert.assertEquals("\"localvar.str\"", t3_0.toString());
		
		IStrategoTerm t3_1 = t3.getSubterm(1);
		Assert.assertEquals("\"main\"", t3_1.toString());
		
		IStrategoTerm t3_2 = t3.getSubterm(2);
		Assert.assertEquals("LocationInfo(\"31\",\"3\",\"32\",\"21\")", t3_2.toString());
		
	}
}
