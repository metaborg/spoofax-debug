package org.strategoxt.imp.debug.stratego.transformer.strategies;

import java.util.HashMap;
import java.util.Map;

public class TimeMonitor {

	private static TimeMonitor instance = new TimeMonitor();
	
	private Map<String, Long> timeMonitorsN = null; // nano
	private Map<String, Long> timeMonitors = null; // milli
	
	private Map<String, Long> startMonitorsN = null; // nano
	private Map<String, Long> startMonitors = null; // milli
	
	/**
	 * TODO: implement correct synchronized singleton...
	 * @return
	 */
	public static TimeMonitor getTimeMonitor()
	{
		if (instance == null)
		{
			instance = new TimeMonitor();
		}
		return instance;
	}
	
	private TimeMonitor()
	{
		this.timeMonitors = new HashMap<String, Long>();
		this.timeMonitorsN = new HashMap<String, Long>();
		this.startMonitors = new HashMap<String, Long>();
		this.startMonitorsN = new HashMap<String, Long>();
	}
	
	public long getDurationN(String name)
	{
		if (!this.timeMonitorsN.containsKey(name))
		{
			this.timeMonitorsN.put(name, (long) 0);
		}
		return this.timeMonitorsN.get(name);
	}
	
	public long getDuration(String name)
	{
		if (!this.timeMonitors.containsKey(name))
		{
			this.timeMonitors.put(name, (long) 0);
		}
		return this.timeMonitors.get(name);
	}
	
	protected void start(String name)
	{
		
		long startTimeN = System.nanoTime();
		long startTime = System.currentTimeMillis();
		this.startMonitors.put(name, startTime);
		this.startMonitorsN.put(name, startTimeN);
	}
	
	protected void end(String name)
	{
		long endTimeN = System.nanoTime();
		long endTime = System.currentTimeMillis();
		long startTimeN = this.startMonitorsN.get(name);
		long startTime = this.startMonitors.get(name);
		long durationN = endTimeN - startTimeN;
		long duration = endTime - startTime;
		long totalDurationN = getDurationN(name) + durationN;
		long totalDuration = getDuration(name) + duration;
		this.timeMonitorsN.put(name, totalDurationN);
		this.timeMonitors.put(name, totalDuration);
	}
	
	public static boolean TIME_MONITOR_ENABLED = false;
	
	public void print()
	{
		if (!TIME_MONITOR_ENABLED)
		{
			return;
		}
		for(String key : this.timeMonitors.keySet())
		{
			System.out.println("NANO " + key + ":" + this.timeMonitorsN.get(key));
			System.out.println("MILL " + key + ":" + this.timeMonitors.get(key));
		}
	}
}
