package org.strategoxt.debug.core.eventspec;

public abstract class BreakPoint {

	private String name;
	private int lineNumber;
	private int startTokenPosition;
	
	/**
	 * Represents a BreakPoint at the given linenumber (1-based) and given startTokenPosition (1-based).
	 * The startTokenPosition should be used when multiple statements can be placed at a single line and the debugger is able to distinguish between them.
	 * @param name
	 * @param lineNumber
	 * @param startTokenPosition
	 */
	public BreakPoint(String name, int lineNumber, int startTokenPosition) {
		this.name = name;
		this.lineNumber = lineNumber;
		this.startTokenPosition = startTokenPosition;
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
}
