package org.strategoxt.debug.core.eventspec;

public class LineBreakPoint extends BreakPoint {

	public LineBreakPoint(String filename, String name, int lineNumber,
			int startTokenPosition) {
		super(filename, name, lineNumber, startTokenPosition);
	}

	@Override
	public boolean match(BreakPoint breakPoint) {
		if (breakPoint.isVirtual())
		{
			return false;
		}
		else
		{
			boolean onSameLine = breakPoint.getLineNumber() == this.getLineNumber();
			return onSameLine;
		}
	}

	@Override
	public boolean isEnter() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isExit() {
		// TODO Auto-generated method stub
		return false;
	}
	
	/**
	 * LineBreakPoints are virtual because we don't know the token offset.
	 * @return
	 */
	public boolean isVirtual() {
		return false;
	}

}
