package org.strategoxt.debug.core.eventspec;

public abstract class BreakPoint {

	private String name;
	private int lineNumber;
	
	public BreakPoint(String name, int lineNumber) {
		this.name = name;
		this.lineNumber = lineNumber;
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
}
