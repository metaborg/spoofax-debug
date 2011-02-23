package org.strjdbg.eclipse.core.str.model;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IStep;
import org.eclipse.debug.core.model.IThread;

/**
 * As long as Stratego is single threaded this StrategoThread can directly access the single thread in the StrategoDebugTarget
 * @author rlindeman
 *
 */
public class StrategoThread extends StrategoDebugElement implements IThread {

	/**
	 * Breakpoints this thread is suspended at or <code>null</code>
	 * if none.
	 */
	private IBreakpoint[] fBreakpoints;
	
	/**
	 * Whether this thread is stepping
	 */
	private boolean fStepping = false;
	
	/**
	 * Constructs a new thread for the given target
	 * 
	 * @param target VM
	 */
	public StrategoThread(StrategoDebugTarget target) {
		super(target);
	}
	
	public IBreakpoint[] getBreakpoints() {
		if (fBreakpoints == null) {
			return new IBreakpoint[0];
		}
		return fBreakpoints;
	}
	
	/**
	 * Sets the breakpoints this thread is suspended at, or <code>null</code>
	 * if none.
	 * 
	 * @param breakpoints the breakpoints this thread is suspended at, or <code>null</code>
	 * if none
	 */
	protected void setBreakpoints(IBreakpoint[] breakpoints) {
		fBreakpoints = breakpoints;
	}

	public String getName() throws DebugException {
		return "Thread[1]";
	}

	public int getPriority() throws DebugException {
		return 0;
	}

	public IStackFrame[] getStackFrames() throws DebugException {
		if (isSuspended()) {
			return ((StrategoDebugTarget)getDebugTarget()).getStackFrames();
		} else {
			return new IStackFrame[0];
		}
	}

	public IStackFrame getTopStackFrame() throws DebugException {
		IStackFrame[] frames = getStackFrames();
		if (frames.length > 0) {
			return frames[0];
		}
		return null;
	}

	public boolean hasStackFrames() throws DebugException {
		return isSuspended();
	}

	/**
	 * Stratego Thread can only resume when it is suspend and not terminated/
	 */
	public boolean canResume() {
		return isSuspended() && !isTerminated();
	}

	/**
	 * Stratego Thread can only be suspended when it isn't already suspended and it isn't already terminated.
	 */
	public boolean canSuspend() {
		return !isSuspended() && !isTerminated();
	}

	public boolean isSuspended() {
		return getDebugTarget().isSuspended();
	}

	public void resume() throws DebugException {
		getDebugTarget().resume();
	}

	public void suspend() throws DebugException {
		getDebugTarget().suspend();
	}

	/**
	 * @see IStep#canStepInto()
	 */
	public boolean canStepInto() {
		return canStep();
	}

	/**
	 * @see IStep#canStepOver()
	 */
	public boolean canStepOver() {
		return canStep();
	}

	/**
	 * @see IStep#canStepReturn()
	 */
	public boolean canStepReturn() {
		return canStep();
	}
	
	/**
	 * Returns whether this thread is in a valid state to
	 * step.
	 * 
	 * @return whether this thread is in a valid state to
	 * step
	 */
	protected boolean canStep() {
		try {
			return isSuspended()
				// && (!isPerformingEvaluation() || isInvokingMethod()) // TODO: implement "perform evaluation"
				// && !isSuspendVoteInProgress() // TODO:  (conditional breakpoints, etc.).
				&& !isStepping()
				&& getTopStackFrame() != null
				// && !getJavaDebugTarget().isPerformingHotCodeReplace() // TODO: implement hot code replace
				;
		} catch (DebugException e) {
			return false;
		}
	}

	public boolean isStepping() {
		// TODO Auto-generated method stub
		return this.fStepping;
	}

	/**
	 * This method is synchronized, such that the step request
	 * begins before a background evaluation can be performed.
	 * 
	 * @see IStep#stepInto()
	 */
	public void stepInto() throws DebugException {
		synchronized (this) {
			if (!canStepInto()) {
				return;
			}
		}
		System.out.println("ECLIPSE STEP INTO");
		// TODO: the jdi eclipse plugin uses scheduling and such
		((StrategoDebugTarget)getDebugTarget()).getDebugSessionManager().stepInto();
	}

	/** 
	 * This method is synchronized, such that the step request
	 * begins before a background evaluation can be performed.
	 * 
	 * @see IStep#stepOver()
	 */
	public void stepOver() throws DebugException {
		synchronized (this) {
			if (!canStepOver()) {
				return;
			}
		}
		System.out.println("ECLIPSE STEP OVER");
		// TODO: the jdi eclipse plugin uses scheduling and such
		((StrategoDebugTarget)getDebugTarget()).getDebugSessionManager().stepOver();
	}

	/**
	 * This method is synchronized, such that the step request
	 * begins before a background evaluation can be performed.
	 * 
	 * @see IStep#stepReturn()
	 */
	public void stepReturn() throws DebugException {
		synchronized (this) {
			if (!canStepReturn()) {
				return;
			}
		}
		System.out.println("ECLIPSE STEP RETURN");
		// TODO: the jdi eclipse plugin uses scheduling and such
		((StrategoDebugTarget)getDebugTarget()).getDebugSessionManager().stepReturn();
	}

	public boolean canTerminate() {
		return !isTerminated();
	}

	public boolean isTerminated() {
		return getDebugTarget().isTerminated();
	}

	public void terminate() throws DebugException {
		getDebugTarget().terminate();
	}

	/**
	 * Sets whether this thread is stepping
	 * 
	 * @param stepping whether stepping
	 */
	protected void setStepping(boolean stepping) {
		fStepping = stepping;
	}
	
	public String toString()
	{
		String s = "StrategoThread";
		
		return s;
	}
	

}
