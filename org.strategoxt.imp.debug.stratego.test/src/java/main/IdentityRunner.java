package main;

import org.StrategoFileManager;

import strategies.identity_lib.identity_lib;


public class IdentityRunner {

	public static void main(String[] args) {
		String[] temp_args = new String[] { "-i", StrategoFileManager.BASE + "/src/java/foo.parsed" 
											//, "-o", "str-output/output"
											};
		identity_lib.main(temp_args);
	}
}
