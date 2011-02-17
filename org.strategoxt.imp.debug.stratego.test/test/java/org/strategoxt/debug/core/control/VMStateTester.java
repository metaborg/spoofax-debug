package org.strategoxt.debug.core.control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.model.LocationInfo;
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
	private int index = -1;
	
	// if fullcompare is true compare the toplevel StackFrame
	// if fullCompare is false only compare the strategy name
	private VMStateTesterCompareType compareType = VMStateTesterCompareType.Name;
	
	public VMStateTester(VMStateTesterCompareType compareType)
	{
		this.compareType = compareType;
	}
	
	public void initialize()
	{
		this.iter = getIterator();
		this.index = -1;
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
		this.index++;
		return this.current;
	}
	
	/**
	 * The VMStateTester expects that the state of the program will match the current StrategoState (specified in the testcase)
	 * @return
	 */
	public StrategoState current()
	{
		return this.current;
	}
	
	public int getIndex()
	{
		return this.index;
	}
	
	/**
	 * Compare the given StrategoState with the current StrategoState.
	 * 
	 * For now only compare the toplevel StrategoStackFrame.
	 * @param state
	 */
	public boolean compareState(StrategoState state)
	{
		StrategoStackFrame currentTop = this.current().currentFrame(); // the expected value
		StrategoStackFrame compareTop = state.currentFrame(); // top frame in the program
		
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
		StrategoStackFrame frame = new StrategoStackFrame(-1, null, name, null, null);
		state.pushFrame(frame);
		
		this.willHitStates.add(state);
	}
	
	public void addStrategoState(StrategoState state)
	{
		this.willHitStates.add(state);
	}
	
	/**
	 * Filename points to the stratego file name.
	 * Name points to the strategy or rule name.
	 * The four integers, startLineNum, startTokenPos, endLineNum, endTokenPos are used to create a LocationInfo object that points
	 * to the current active statement.
	 * @param filename
	 * @param name
	 * @param startLineNum
	 * @param startTokenPos
	 * @param endLineNum
	 * @param endTokenPos
	 * @return
	 */
	public static StrategoState createState(String filename, String name, String eventType, int startLineNum, int startTokenPos, int endLineNum,
			int endTokenPos)
	{
		StrategoState state = new StrategoState();
		LocationInfo currentLocationInfo = new LocationInfo(startLineNum, startTokenPos, endLineNum, endTokenPos);
		IStrategoTerm current = null;
		// TODO: add stackframedepth
		StrategoStackFrame frame = new StrategoStackFrame(-1, filename, name, null, current);
		frame.setCurrentLocationInfo(currentLocationInfo, eventType);
		state.pushFrame(frame);
		return state;
	}
}
