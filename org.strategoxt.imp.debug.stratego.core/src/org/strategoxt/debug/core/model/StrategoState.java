package org.strategoxt.debug.core.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StrategoState {

	//private LocationInfo locationInfo = null;
	
	private boolean isSuspended = false;
	private boolean isStepping = false;
	private boolean hasDied = false;
	
	private Stack<StrategoStackFrame> stack = new Stack<StrategoStackFrame>();
	
	/*
	// LocationInfo should be saved per StrategoStackFrame
	public LocationInfo getLocationInfo()
	{
		return this.locationInfo;
	}

	public void setLocationInfo(LocationInfo locationInfo) {
		this.locationInfo = locationInfo;
	}
	*/
	
	// push given frame on top of stack
	public StrategoStackFrame pushFrame(StrategoStackFrame frame)
	{
		return stack.push(frame);
	}
	
	// given frame should be on top of the stack, pop it
	public StrategoStackFrame popFrame(StrategoStackFrame frame)
	{
		//StrategoStackFrame top = stack.peek();
		// top should be the same as frame
		return stack.pop();
	}
	

	public StrategoStackFrame popFrame() {
		// pop without matching
		return stack.pop();
	}
	
	public StrategoStackFrame currentFrame()
	{
		return stack.peek();
	}
	
	public int size()
	{
		return this.stack.size();
	}
	
	public StrategoStackFrame get(int index)
	{
		return this.stack.get(index);
	}
	
	/**
	 * Returns a list of strings, each item represents a stratego state
	 * @return
	 */
	public List<String> getFrames()
	{
		List<String> l = new ArrayList<String>();
		for(StrategoStackFrame frame : this.stack)
		{
			l.add(frame.toString());
		}
		return l;
	}
	
	public int getCurrentFrameLevel()
	{
		return this.stack.size() - 1;
	}
	
	public StrategoStackFrame[] getStackFrames()
	{
		StrategoStackFrame[] a = new StrategoStackFrame[this.stack.size()];
		return this.stack.toArray(a);
	}
	
	/**
	 * Returns true if the Stratego Program is suspended.
	 * @return
	 */
	public boolean isSuspended()
	{
		return this.isSuspended;
	}
	
	public void setSuspended(boolean isSuspended)
	{
		this.isSuspended = isSuspended;
	}
	
	/**
	 * Returns true if the client issued a stepping command.
	 * @return
	 */
	public boolean isStepping()
	{
		return this.isStepping;
	}
	
	public void setStepping(boolean isStepping)
	{
		this.isStepping = isStepping;
	}
	
	public boolean hasDied()
	{
		return this.hasDied;
	}
	
	public void setDeath(boolean hasDied)
	{
		this.hasDied = hasDied;
	}

}
