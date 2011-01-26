package org.other;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

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
	
	@Test
	public void compareFiles()
	{
		File f1 = new File("src/file/file1.txt");
		File f1copy = new File("src/file/file1.copy.txt");
		File f2 = new File("src/file/file2.txt");
		File f3 = new File("src/file/file3.txt");
		
		assertFiles(f1, f1);
		assertFiles(f1, f1copy);
		assertFiles(f1copy, f1);
		
		assertFilesNotEquals(f1, f2);
		
		assertFilesNotEquals(f1, f3);
		assertFilesNotEquals(f3, f1);
	}
	
	public static void assertFilesNotEquals(File fExpected, File fActual)
	{
		try {
		assertFiles(fExpected, fActual);
		fail("Files should differ");
		} catch(java.lang.AssertionError e)
		{
			// they are not equal, or the file does not exist
		}
	}
	
	public static void assertFiles(File fExpected, File fActual)
	{
		try {
			BufferedReader bExpected = new BufferedReader(new FileReader(fExpected));
			BufferedReader bActual = new BufferedReader(new FileReader(fActual));
			try {
				assertReaders(bExpected, bActual);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				fail("IOException when comparing files: " + e.getMessage());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			fail("Could not find file: " + e.getMessage());
		}
		
	}
	
	public static void assertReaders(BufferedReader expected,
			BufferedReader actual) throws IOException {
		String expectedLine;
		while ((expectedLine = expected.readLine()) != null) {
			String actualLine = actual.readLine();

			assertNotNull("Expected had more lines then the actual.",
					actualLine);
			assertEquals(expectedLine, actualLine);
		}

		assertNull("Actual had more lines then the expected.", actual
				.readLine());
	}
	
	public static String getExpectedDirectory()
	{
		return "test/expected";
	}
	
	

}
