package org.strategoxt.debug.core.eventspec;


public class StrategyStepBreakPoint extends BreakPoint {

	public StrategyStepBreakPoint(String name, int lineNumber) {
		super(name, lineNumber);
	}

	@Override
	public int hashCode() {
		final int prime = 47;
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
		if (!(obj instanceof StrategyStepBreakPoint))
			return false;
		StrategyStepBreakPoint other = (StrategyStepBreakPoint) obj;
		if (getName() == null || other.getName() == null) {
			return false; // one of the names is null
		} else if (!getName().equals(other.getName())) {
			return false; // names do not match
		}
		if (getLineNumber() == -1 || other.getLineNumber() == -1)
		{
			// TODO: do we allow this for Step Breakpoints?
			return true; // -1 means match on any strategy with the same name
		}
		if (getLineNumber() != other.getLineNumber())
			return false;
		return true;
	}
}
