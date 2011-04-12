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
		boolean ret = true;
		if (this.breakPoints.contains(b))
		{
			this.breakPoints.remove(b);
		} else
		{
			BreakPoint pbRemove = null;
			for(BreakPoint bp : this.breakPoints)
			{
				boolean sameFile = bp.getFilename().equals(b.getFilename());
				boolean sameLine = bp.getLineNumber() == b.getLineNumber();
				if (sameFile && sameLine)
				{
					pbRemove = bp;
				}
			}
			boolean removed = this.breakPoints.remove(pbRemove);
			if (!removed)
			{
				System.out.println("Second remove also failed!");
			}
		}
		return ret;
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
