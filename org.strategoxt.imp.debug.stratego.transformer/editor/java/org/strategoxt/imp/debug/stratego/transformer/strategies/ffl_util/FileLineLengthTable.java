package org.strategoxt.imp.debug.stratego.transformer.strategies.ffl_util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileLineLengthTable {

	/**
	 * Initialize the lengthPerLine array with this number of entries.
	 * When the current file has more lines, the array will be copied to a larger array.
	 */
	public static final int DEFAULT_LINE_COUNT = 50;
	
	// currently just one stratego file
	private int[] lengthPerLine = null;
	
	private int[] characterOffsetPerLine = null;
	
	private String filename = null;
	
	/**
	 * Filename should be relative to baseDir.
	 * @param baseDir
	 * @param filename
	 */
	public FileLineLengthTable(String filename)
	{
		this.filename = filename;
		this.lengthPerLine = new int[DEFAULT_LINE_COUNT];
		this.characterOffsetPerLine = new int[DEFAULT_LINE_COUNT];
	}
	
	
	public void create(File baseDir)
	{
		new File(baseDir, filename);
		File absLocation = new File(baseDir, filename);
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(absLocation));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (br == null) {
			return;
		}
		String strLine;
		// Read File Line By Line
		int linenumber = 0;
		try {
			while ((strLine = br.readLine()) != null) {
				// Print the content on the console
				//System.out.println(strLine);
				// TODO: Fix tabs?
				int length = strLine.length() + 1; // also count the newline character
				this.setLineLength(linenumber, length);
				linenumber++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				// Close the input stream
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// clean up the array, make it smaller so it will fit exactly.
		this.lengthPerLine = compact(this.lengthPerLine, linenumber);
		
		createCharacterOffset();
	}
	
	/**
	 * Use a zero-based linenumber.
	 * @param linenumber
	 * @param length
	 */
	private void setLineLength(int linenumber, int length)
	{
		if (this.lengthPerLine.length <= linenumber)
		{
			// increase the size
			this.lengthPerLine = expand(this.lengthPerLine, this.lengthPerLine.length + DEFAULT_LINE_COUNT);
		}
		this.lengthPerLine[linenumber] = length;
	}
	
	private void createCharacterOffset()
	{
		this.characterOffsetPerLine = new int[this.lengthPerLine.length];
		int sum = 0;
		for(int i = 0; i < this.lengthPerLine.length; i++)
		{
			this.characterOffsetPerLine[i] = sum;
			// next offset will be the previous offset plus the length of the current line
			sum += this.lengthPerLine[i];
		}
	}
	
	protected void setEntry(int linenumber, int lineLength, int lineOffset)
	{
		// linelength
		if (this.lengthPerLine.length <= linenumber)
		{
			// increase the size
			this.lengthPerLine = expand(this.lengthPerLine, this.lengthPerLine.length + DEFAULT_LINE_COUNT);
		}
		this.lengthPerLine[linenumber] = lineLength;
		// lineoffset
		if (this.characterOffsetPerLine.length <= linenumber)
		{
			// increase the size
			this.characterOffsetPerLine = expand(this.characterOffsetPerLine, this.characterOffsetPerLine.length + DEFAULT_LINE_COUNT);
		}
		this.characterOffsetPerLine[linenumber] = lineOffset;
	}
	
	public int size()
	{
		return this.lengthPerLine.length;
	}
	
	/**
	 * Use a zero based linenumber.
	 * @param linenumber
	 * @return
	 */
	public int getLineLength(int linenumber)
	{
		return this.lengthPerLine[linenumber];
	}
	
	public int getLineOffset(int linenumber)
	{
		return this.characterOffsetPerLine[linenumber];
	}
	
	public String getFilename()
	{
		return this.filename;
	}
	
	
	/**
	 * Create a new array with the given size and copy the contents of oldArray to the new array.
	 * Every value after the last value set by the oldArray will be -1.
	 * @param array
	 * @param size
	 * @return
	 */
	private static int[] expand(int[] oldArray, int size) {
	    int[] temp = new int[size];
	    System.arraycopy(oldArray, 0, temp, 0, oldArray.length);
	    // fill everything with a -1 afterthe last valid value
	    for(int j = oldArray.length; j < size; j++)
	        temp[j] = -1;
	    return temp;
	}
	
	/**
	 * Compact the given oldArray to the given size. Any element beyond the size are dropped.
	 * @param oldArray
	 * @param size
	 * @return
	 */
	private static int[] compact(int[] oldArray, int size)
	{
		 int[] temp = new int[size];
		 System.arraycopy(oldArray, 0, temp, 0, size);
		 return temp;
	}
}
