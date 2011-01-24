package org.strategoxt.debug.core.util.table;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.strategoxt.debug.core.util.StringUtil;

public class LineLengthTable {

	private Map<String, FileLineLengthTable> tablesPerFile = null;
	
	public LineLengthTable()
	{
		tablesPerFile = new HashMap<String, FileLineLengthTable>();
	}
	
	public FileLineLengthTable getFileLineLengthTable(String filename)
	{
		if (!tablesPerFile.containsKey(filename))
		{
			tablesPerFile.put(filename, new FileLineLengthTable(filename));
		}
		return tablesPerFile.get(filename);
	}
	
	public static LineLengthTable readLineLengthTable(String location)
	{
		LineLengthTable lineLengthTable = null; // return value
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(location));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (reader == null)
		{
			// could not open file
			System.out.println("Could not open file " + location);
			return lineLengthTable;
		}
	    String line;
	    int i = 0;
	    try {
	    	lineLengthTable = new LineLengthTable();
			while ((line = reader.readLine()) != null)
			{
				String cells[] = line.split("\t");
				// should have length 4
				if (cells.length != 4)
				{
					System.err.println("Row " + i + " does not have 4 cells...");
				}
				String filename = cells[0];
				String linenumberString = StringUtil.trimQuotes(cells[1]);
				String lineLengthString = StringUtil.trimQuotes(cells[2]);
				String lineOffsetString = StringUtil.trimQuotes(cells[3]);

				int linenumber = Integer.parseInt(linenumberString);
				int lineLength = Integer.parseInt(lineLengthString);
				int lineOffset = Integer.parseInt(lineOffsetString);
				
				lineLengthTable.getFileLineLengthTable(filename).setEntry(linenumber, lineLength, lineOffset);
				// next line please...
				i++;
			}
		} catch (IOException e) {
			System.out.println("Failed at row " + i);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lineLengthTable;
	}
	
	public static void writeLineLengthTable(String location, List<FileLineLengthTable> tables)
	{
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(location));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	    try {
	    	for(FileLineLengthTable table : tables)
	    	{
	    		int size = table.size();
	    		String name = table.getFilename();
	    		for(int i = 0; i < size; i++)
	    		{
	    			writer.write(name); // filename
	    			writer.write("\t");
	    			writer.write(""+i);// linenumber
	    			writer.write("\t");
	    			writer.write(""+table.getLineLength(i)); // line length
	    			writer.write("\t");
	    			writer.write(""+table.getLineOffset(i)); // summarized offset
	    			writer.newLine();
	    		}
	    		writer.flush();
	    	}
	    	writer.flush();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
