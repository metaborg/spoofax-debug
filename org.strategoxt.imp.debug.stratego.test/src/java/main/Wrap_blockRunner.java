package main;

import org.StrategoFileManager;

import strategies.wrap_block_lib.wrap_block_lib;

public class Wrap_blockRunner {
	public static void main(String[] args) {
		String[] temp_args = new String[] { "-i", StrategoFileManager.BASE + "/src/java/foo.parsed" 
											, "-o", "str-output/output"
											};
		wrap_block_lib.main(temp_args);
	}
}
