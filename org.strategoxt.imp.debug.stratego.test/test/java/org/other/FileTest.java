package org.other;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;


public class FileTest {
	
	@Test
	public void filemethods() throws Exception {
		String completePath = "/path/to/str/file/test-prop.str";
		File f = new File(completePath);
		String name = f.getName();
		assertEquals("test-prop.str", name);
		String parent = f.getParent();
		assertEquals("/path/to/str/file", parent);
		
	}

}
