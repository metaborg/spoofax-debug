package org.strategoxt.imp.debug.stratego.transformer;

import java.io.File;
import java.io.IOException;

import org.StrategoFileManager;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.StrategoExit;

public class TransformTransformerTest {
	
	public static void main(String[] args) {
		System.out.println("TRANSFORM TRANSFORMER");
		// output rtree files
		String baseInputPath = "trans";
		String strategoFilePath = "stratego-transformer.str";
		String strategoSourceBasedir = "../org.strategoxt.imp.debug.stratego.transformer/" + baseInputPath + "/" + strategoFilePath;
		File f = new File(strategoSourceBasedir);
		try {
			System.out.println("INPUT: " + f.getCanonicalPath());
			strategoSourceBasedir = f.getCanonicalPath(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String stratego_input = strategoSourceBasedir;
		String output_base_dir = StrategoFileManager.WORKING_DIR + "/" + "java_main_test4";
		String[] l_args = new String[]{
				"-i", stratego_input
				, "--gen-dir", output_base_dir
				, "--output-rtree"};
		IStrategoTerm result = null;
		Context context = new Context();
		//CustomIOAgent ioAgent = new CustomIOAgent();
		//context.setIOAgent(ioAgent);
		try {
			result = org.strategoxt.imp.debug.stratego.transformer.trans.Main.mainNoExit(context, l_args);
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
