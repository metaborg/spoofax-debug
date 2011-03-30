package org.strategoxt.debug.core.eventspec;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Contains current breakpoints
 * 
 * @author rlindeman
 *
 */
public class EventSpecList {
	
	private List<BreakPoint> breakPoints = null;
	//private Collection<BreakPoint> bp = null;
	
	/**
	 * Creates a new EventSpecList, it contains the active breakpoints.
	 */
	public EventSpecList()
	{
		this.breakPoints = new CopyOnWriteArrayList<BreakPoint>();
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
	
	public Collection<BreakPoint> getBreakPoints()
	{
		return this.breakPoints;
	}
	
	public void clear()
	{
		this.breakPoints.clear();
	}

}
