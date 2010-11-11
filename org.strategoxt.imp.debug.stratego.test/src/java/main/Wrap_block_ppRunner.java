package main;

import org.StrategoFileManager;

import strategies.wrap_block_pp_lib.wrap_block_pp_lib;


public class Wrap_block_ppRunner {
	
	public static void main(String[] args) {
		String[] temp_args = new String[] { "-i", StrategoFileManager.BASE + "/src/java/inputs/Foo2.java" 
											//, "-o", "str-output/output"
											};
		wrap_block_pp_lib.main(temp_args);
	}


}
