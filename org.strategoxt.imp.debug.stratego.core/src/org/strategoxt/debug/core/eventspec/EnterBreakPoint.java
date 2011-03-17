package org.strategoxt.debug.core.eventspec;

public class EnterBreakPoint extends BreakPoint {

	public EnterBreakPoint(String filename, String name, int lineNumber,
			int startTokenPosition) {
		super(filename, name, lineNumber, startTokenPosition);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean match(BreakPoint breakPoint) {
		if (breakPoint.isVirtual())
		{
			return false;
		}
		else if (breakPoint.isEnter())
		{
			return true; // TODO: match on wildcards?
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean isEnter() {
		return true;
	}

	@Override
	public boolean isExit() {
		return false;
	}

}
