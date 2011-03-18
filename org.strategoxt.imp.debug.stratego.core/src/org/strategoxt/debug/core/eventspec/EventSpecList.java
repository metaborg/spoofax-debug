package org.strategoxt.debug.core.eventspec;

import java.util.ArrayList;
import java.util.List;

/**
 * Contains current breakpoints
 * 
 * @author rlindeman
 *
 */
public class EventSpecList {
	
	private List<BreakPoint> breakPoints = null;
	
	/**
	 * Creates a new EventSpecList, it contains the active breakpoints.
	 */
	public EventSpecList()
	{
		this.breakPoints = new ArrayList<BreakPoint>();
	}

	public void add(BreakPoint b)
	{
		this.breakPoints.add(b);
	}
	
	public boolean remove(BreakPoint b)
	{
		return this.breakPoints.remove(b);
	}
	
	public boolean contains(BreakPoint b) {
		return this.breakPoints.contains(b);
	}
	
	public List<BreakPoint> getBreakPoints()
	{
		return this.breakPoints;
	}
	
	public void clear()
	{
		this.breakPoints.clear();
	}

}
