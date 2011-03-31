package org.strategoxt.debug.core.util.table;

import org.strategoxt.imp.debug.stratego.transformer.strategies.ffl_util.FileLineLengthTable;
import org.strategoxt.imp.debug.stratego.transformer.strategies.ffl_util.LineLengthTable;

public class OffsetTable {

	private LineLengthTable t;
	
	public OffsetTable(LineLengthTable t)
	{
		this.t = t;
	}
	
	/**
	 * 
	 * @param filename
	 * @param i i is a zero-based index
	 * @return
	 */
	public int getLineOffset(String filename, int i) {
		// TODO Auto-generated method stub
		FileLineLengthTable ft = t.getFileLineLengthTable(filename);
		int lineOffset = ft.getLineOffset(i);
		return lineOffset;
	}

}
