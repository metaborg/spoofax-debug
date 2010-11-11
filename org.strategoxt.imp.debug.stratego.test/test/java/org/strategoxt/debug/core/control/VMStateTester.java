package org.strategoxt.debug.core.control;

import java.util.ArrayList;
import java.util.List;

public class VMStateTester {

	private List<String> willHitNames = new ArrayList<String>();
	
	private int currentHit = -1;
	
	public boolean isNextHit(String name){
		currentHit++;
		if (currentHit >= willHitNames.size())
		{
			// we are hitting more breakpoints than anticipated...
			return false;
		}
		String expected = willHitNames.get(currentHit);
		if (name != null && name.equals(expected))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public String currentHit()
	{
		if (currentHit < 0 || currentHit >= willHitNames.size())
		{
			return null;
		}
		return this.willHitNames.get(currentHit);
	}
	
	public boolean hasNextHit()
	{
		if (currentHit < 0 || (currentHit + 1) >= willHitNames.size())
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public void addName(String name)
	{
		this.willHitNames.add(name);
	}
}
