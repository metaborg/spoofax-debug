package org.strategoxt.debug.core.eventspec;

public class RuleExitBreakPoint extends BreakPoint {
	
	public RuleExitBreakPoint(String name, int lineNumber, int startTokenPosition) {
		super(name, lineNumber, startTokenPosition);
	}

	@Override
	public int hashCode() {
		final int prime = 37;
		int result = 1;
		result = prime * result + getLineNumber();
		result = prime * result
				+ ((getName() == null) ? 0 : getName().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof RuleExitBreakPoint))
			return false;
		RuleExitBreakPoint other = (RuleExitBreakPoint) obj;
		if (getName() == null || other.getName() == null) {
			return false;
		} else if (!getName().equals(other.getName()))
			return false;
		if (getLineNumber() == -1 || other.getLineNumber() == -1)
		{
			return true; // -1 means match on any rule with the same name
		}
		if (getLineNumber() != other.getLineNumber())
			return false;
		return true;
	}
}
