package org.strategoxt.debug.core.eventspec;

public abstract class BreakPoint {

	private String filename;
	private String name;
	private int lineNumber;
	private int startTokenPosition;
	
	/**
	 * True if the breakpoint contains wildcards and cannot be mapped to a single program state.
	 */
	private boolean isVirtual = false;
	
	/**
	 * Represents a BreakPoint at the given linenumber (1-based) and given startTokenPosition (1-based).
	 * The startTokenPosition should be used when multiple statements can be placed at a single line and the debugger is able to distinguish between them.
	 * @param name
	 * @param lineNumber
	 * @param startTokenPosition
	 */
	public BreakPoint(String filename, String name, int lineNumber, int startTokenPosition) {
		this.filename = filename;
		this.name = name;
		this.lineNumber = lineNumber;
		this.startTokenPosition = startTokenPosition;
	}
	
	public String getFilename()
	{
		return filename;
	}
	
	public void setFilename(String filename)
	{
		this.filename = filename;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLineNumber() {
		return lineNumber;
	}

	public void setLineNumber(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	public int getStartTokenPosition() {
		return startTokenPosition;
	}

	public void setStartTokenPosition(int startTokenPosition) {
		this.startTokenPosition = startTokenPosition;
	}
	
	/**
	 * Returns true if the breakpoint contains a wildcard.
	 * @return
	 */
	public boolean isVirtual() {
		return isVirtual;
	}
	
	public void setVirtual(boolean isVirtual) {
		this.isVirtual = isVirtual;
	}
	
	
	
	/**
	 * Returns true if the given breakpoint matches this breakpoint.
	 * The given breakpoint should be a 'real' breakpoint, no wildcards!
	 * @param breakPoint
	 * @return
	 */
	public abstract boolean match(BreakPoint breakPoint);
	
	public abstract boolean isEnter();
	
	public abstract boolean isExit();

}
