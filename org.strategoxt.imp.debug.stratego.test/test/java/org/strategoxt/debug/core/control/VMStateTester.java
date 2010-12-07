package org.strategoxt.debug.core.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.model.StrategoState;

enum VMStateTesterCompareType
{
	Name, TopStackFrame, FullState
}
/**
 * Helper class for testing the state of the DebugSessionManager.
 * This class contains a list of StrategoStates and whenever a breakpoint is hit we should compare the state
 * of the DebugSessionManager with the current state of the VMStateTester.
 * 
 * For now it will only test the toplevel StrategoStackFrame.
 * @author rlindeman
 *
 */
public class VMStateTester {

	private List<StrategoState> willHitStates = new ArrayList<StrategoState>();
	
	private Iterator<StrategoState> iter = null;
	
	private StrategoState current;
	
	// if fullcompare is true compare the toplevel StackFrame
	// if fullCompare is false only compare the strategy name
	private VMStateTesterCompareType compareType = VMStateTesterCompareType.Name;
	
	public VMStateTester(VMStateTesterCompareType compareType)
	{
		this.compareType = compareType;
	}
	
	public void initialize()
	{
		this.iter =  getIterator();
	}
	
	private Iterator<StrategoState> getIterator()
	{
		if (iter == null)
		{
			this.iter = this.willHitStates.iterator();
		}
		return this.iter;
	}
	
	public boolean hasNext()
	{
		return getIterator().hasNext();
	}
	
	public StrategoState next()
	{
		this.current = getIterator().next();
		return this.current;
	}
	
	public StrategoState current()
	{
		return this.current;
	}
	
	
	
	/**
	 * Compare the given StrategoState with the current StrategoState.
	 * 
	 * For now only compare the toplevel StrategoStackFrame.
	 * @param state
	 */
	public boolean compareState(StrategoState state)
	{
		StrategoStackFrame currentTop = this.current().currentFrame();
		StrategoStackFrame compareTop = state.currentFrame();
		
		boolean statesEquals = false;
		switch(this.compareType) {
			case TopStackFrame:
				boolean sameName = currentTop.getName().equals(compareTop.getName());
				boolean sameFilename = currentTop.getFilename().equals(compareTop.getFilename());
				boolean sameLocation = currentTop.getCurrentLocationInfo().equals(compareTop.getCurrentLocationInfo());
				statesEquals = sameName && sameFilename && sameLocation;
				break;
			case Name:
				statesEquals = currentTop.getName().equals(compareTop.getName());
				break;
			default:
				break;
			
		}
		// TODO: compare on full StackFrame or even on full StrategoState
		return statesEquals;
	}
	

	public void addStrategoState(String name)
	{
		if (this.compareType != VMStateTesterCompareType.Name)
		{
			// we want to compare on names, but compareType is not Name!
			// TODO: throw error
		}
		StrategoState state = new StrategoState();
		StrategoStackFrame frame = new StrategoStackFrame(null, name, null, null);
		state.pushFrame(frame);
		
		this.willHitStates.add(state);
	}
	
	public void addStrategoState(StrategoState state)
	{
		this.willHitStates.add(state);
	}
}
