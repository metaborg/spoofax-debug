package org.strategoxt.debug.core.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StrategoState {
	
	private boolean isSuspended = false;
	private boolean isStepping = false;
	private boolean hasDied = false;
	
	private Stack<StrategoStackFrame> stack = new Stack<StrategoStackFrame>();
	
	
	/**
	 * Push given frame on top of stack.
	 * @param frame
	 * @return
	 */
	public StrategoStackFrame pushFrame(StrategoStackFrame frame)
	{
		return stack.push(frame);
	}
	
	/**
	 * Pops the current StrategoStackFrame.
	 * TODO: the given frame should be on top of the stack, pop it
	 * @param frame
	 * @return
	 */
	public StrategoStackFrame popFrame(StrategoStackFrame frame)
	{
		//StrategoStackFrame top = stack.peek();
		// top should be the same as frame
		return stack.pop();
	}
	

	/**
	 * Pop the current StrategoStackFrame.
	 * @return
	 */
	public StrategoStackFrame popFrame() {
		// pop without matching
		return stack.pop();
	}
	
	/**
	 * Returns the current StrategoStackFrame.
	 * @return
	 */
	public StrategoStackFrame currentFrame()
	{
		return stack.peek();
	}
	
	/**
	 * Returns the number of stackframes.
	 * @return
	 */
	public int size()
	{
		return this.stack.size();
	}
	
	/**
	 * Gets the StrategoStackFrame at the given index. The bottom stackframe has index 0.
	 * @param index
	 * @return
	 */
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
	
	/**
	 * Gets the current stackframe level. The bottom frame has level 0.
	 * @return
	 */
	public int getCurrentFrameLevel()
	{
		return this.stack.size() - 1;
	}
	
	/**
	 * Returns an array of StrategoStackFrames.
	 * @return
	 */
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
	
	/**
	 * Set the stratego state to suspended or not.
	 * @param isSuspended
	 */
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
