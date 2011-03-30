package org.strategoxt.imp.debug.stratego.transformer.strategies;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoList;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.imp.debug.stratego.transformer.strategies.ffl_util.FileLineLengthTable;
import org.strategoxt.imp.debug.stratego.transformer.strategies.ffl_util.LineLengthTable;
import org.strategoxt.lang.Context;
import org.strategoxt.lang.Strategy;

public class java_create_fll_table_0_3 extends Strategy {

	public static java_create_fll_table_0_3 instance = new java_create_fll_table_0_3();
	
	public IStrategoTerm invoke(Context context, IStrategoTerm current,	IStrategoTerm table_filename, IStrategoTerm base_dir, IStrategoTerm input_files)
	{
		System.out.println("CREATE FLL");
		String tf = table_filename.toString();
		File charOffsetTableFilename = new File(LineLengthTable.trimQuotes(tf));
		
		String bd = base_dir.toString();
		File strategoSourceBasedir = new File(LineLengthTable.trimQuotes(bd));
		
		Collection<File> inputFiles = new ArrayList<File>();
		if (input_files.isList())
		{
			IStrategoList list = (IStrategoList) input_files;
			for(int i = 0; i < list.size(); i++)
			{
				String inputfile = LineLengthTable.trimQuotes(list.getSubterm(i).toString());
				inputFiles.add(new File(inputfile));
			}
		}
		
		generateOffsetTable(charOffsetTableFilename, strategoSourceBasedir, inputFiles);
		return table_filename;
	}
	
	/**
	 * Returns true if file has parent path that is equal to the path of prefix.
	 * @param file
	 * @param prefix
	 * @return
	 */
	private boolean isPrefixOf(File file, File prefix)
	{
		if (file == null || prefix == null)
		{
			return false;
		}
		File parent = file.getParentFile();
		while(parent != null && !prefix.equals(parent))
		{
			parent = parent.getParentFile();
		}
		
		return prefix.equals(parent);
	}
	
	/**
	 * Creates a table with the length per line, so we can convert a linenumber+token_line_offset to a token_file_offset
	 */
	protected void generateOffsetTable(File charOffsetTableFilename, File strategoSourceBasedir, Collection<File> inputFiles)
	{
		// create character offset table
		// TODO: optimize
		List<FileLineLengthTable> tables = new ArrayList<FileLineLengthTable>();
		for(File inputFilePath : inputFiles) // TODO: sort the inputFiles on their path
		{
			File basedir = strategoSourceBasedir; // end with '/'
			String filename = "";
			//IPath inputFilePath = new Path(inputFileString);
			if (isPrefixOf(inputFilePath, basedir)) {
				//inputFile = inputFile.substring(basedir.length()); // make relative to the basedir
				//inputFilePath = inputFilePath.makeRelativeTo(basedir);
				try {
					int length = basedir.getCanonicalPath().length();
					filename = inputFilePath.getCanonicalPath().substring(length+1); // +1 removes the leading "/"
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				System.err.println("inputfile '"+inputFilePath+"' is not located in the strategoSourceBasedir '"+strategoSourceBasedir+"'");
			}
			if (filename == null || "".equals(filename))
			{
				System.err.println("Filename not set!");
			}
			FileLineLengthTable t = new FileLineLengthTable(filename);
			t.create(basedir);
			tables.add(t);
		}
		
		LineLengthTable.writeLineLengthTable(charOffsetTableFilename, tables);
	}
	
}
