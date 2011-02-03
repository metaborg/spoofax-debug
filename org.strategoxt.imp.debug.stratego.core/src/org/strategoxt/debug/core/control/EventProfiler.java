package org.strategoxt.debug.core.control;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

public class EventProfiler {

	private Stack<Long> startTime = null;
	
	private HashMap<String, Long> duration = null;
	
	private HashMap<String, Long> counter = null;
	
	/**
	 * TODO: not thread safe singleton
	 */
	public static EventProfiler instance = new EventProfiler();
	
	
	private EventProfiler()
	{
		counter = new HashMap<String, Long>();
		startTime = new Stack<Long>();
		duration = new HashMap<String, Long>();
	}
	
	
	public void enter(String name)
	{
		// count the number of calls
		if (!counter.containsKey(name))
		{
			counter.put(name, (long)0);
		}
		long i = counter.get(name);
		i++;
		counter.put(name, i);
		
		// get the time
		startTime.push(System.currentTimeMillis());
		// init duration
		if (!duration.containsKey(name))
		{
			duration.put(name, (long) 0);
		}
	}
	
	public void exit(String name)
	{
		if (!duration.containsKey(name))
		{
			duration.put(name, (long) 0);
		}
		long d = System.currentTimeMillis() - startTime.pop();
		long total = duration.get(name);
		total += d;
		duration.put(name, total);
	}
	
	
	// count how often each event is call
	private HashMap<String, Long> internalCounter = new HashMap<String, Long>();
	
	private HashMap<String, InternalProfilerWrapper> internalDuration = new HashMap<String, InternalProfilerWrapper>();
	
	public void internalProfile(String event, long start, long extractorEnd, long processStart, long processEnd, long suspendCheckEnd, long end)
	{
		//InternalProfilerWrapper w = new InternalProfilerWrapper(start, extractorEnd, processStart, processEnd, suspendCheckEnd, end);
		// count
		if (!internalCounter.containsKey(event))
		{
			internalCounter.put(event, (long) 0);
		}
		long c = internalCounter.get(event);
		c++;
		internalCounter.put(event, c);
		
		// duration of internal event handling
		if (!internalDuration.containsKey(event))
		{
			internalDuration.put(event, new InternalProfilerWrapper());
		}
		InternalProfilerWrapper total = internalDuration.get(event);
		total.add(start, extractorEnd, processStart, processEnd, suspendCheckEnd, end);
		//internalDuration.put(event, total);
	}
	
	
	public void writeInternal() throws IOException
	{
		File file = new File("internalcount.tsv");
		BufferedWriter w = new BufferedWriter(new FileWriter(file));
		Set<String> names = internalCounter.keySet();
		w.write("name\tcount\tsum duration");
		w.newLine();
		for(String name : names)
		{
			w.write(name);
			w.write("\t");
			w.write(internalCounter.get(name).toString());
			w.write("\t");
			if (!internalDuration.containsKey(name))
			{
				System.err.println("Name: '" + name + "' not found in duration");
			}
			w.write(internalDuration.get(name).toString());
			w.newLine();
		}
		w.flush();
		w.close();
	}
	
	public void writeStratego() throws IOException
	{
		File file = new File("count.tsv");
		BufferedWriter w = new BufferedWriter(new FileWriter(file));
		Set<String> names = counter.keySet();
		w.write("name\tcount\tsum duration");
		w.newLine();
		for(String name : names)
		{
			w.write(name);
			w.write("\t");
			w.write(counter.get(name).toString());
			w.write("\t");
			if (!duration.containsKey(name))
			{
				System.err.println("Name: '" + name + "' not found in duration");
			}
			w.write(duration.get(name).toString());
			w.newLine();
		}
		w.flush();
		w.close();
	}
	
	public void write()
	{
		try {
			writeStratego();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			writeInternal();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 try {
			saveProfile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public final static String TAB = "\t";
	
	class InternalProfilerWrapper
	{
		/*
		public InternalProfilerWrapper(long start, long extractorEnd,
				long processStart, long processEnd, long suspendCheckEnd,
				long end) {
			super();
			this.start = start;
			this.extractorEnd = extractorEnd;
			this.processStart = processStart;
			this.processEnd = processEnd;
			this.suspendCheckEnd = suspendCheckEnd;
			this.end = end;
		}
		*/
		public long start = 0;
		public long extractorEnd = 0;
		public long processStart = 0;
		public long processEnd = 0;
		public long suspendCheckEnd = 0;
		public long end = 0;
		
		public void add(long start, long extractorEnd, long processStart, long processEnd, long suspendCheckEnd, long end) {
			this.start += start;
			this.extractorEnd += extractorEnd;
			this.processStart += processStart;
			this.processEnd += processEnd;
			this.suspendCheckEnd += suspendCheckEnd;
			this.end += end;
		}
		
		
		
		public String toString()
		{
			StringBuilder builder = new StringBuilder();
			builder.append(start);
			builder.append(TAB);
			builder.append(extractorEnd);
			builder.append(TAB);
			builder.append(processStart);
			builder.append(TAB);
			builder.append(processEnd);
			builder.append(TAB);
			builder.append(suspendCheckEnd);
			builder.append(TAB);
			builder.append(end);
			
			return builder.toString();
		}
	}
	
	public void startMark(String name)
	{
		ProfileItem item = getMainItem(name);
		item.previousTime = System.nanoTime();
	}
	
	public void subMark(String name, String subName)
	{
		ProfileItem item = getMainItem(name);
		ProfileSubItem sub = item.getSubItem(subName);
		sub.count++;
		long currentTime = System.nanoTime();
		long duration = currentTime - item.previousTime;
		item.previousTime = currentTime;
		sub.duration+=duration;
	}
	
	
	private ProfileItem getMainItem(String clazz)
	{
		if (!items.containsKey(clazz))
		{
			items.put(clazz, new ProfileItem());
		}
		return items.get(clazz);
	}
	
	private HashMap<String, ProfileItem> items = new HashMap<String, ProfileItem>();

	
	class ProfileItem
	{
		public long previousTime = 0;
		
		public HashMap<String, ProfileSubItem> items = new HashMap<String, ProfileSubItem>();
		
		public ProfileSubItem getSubItem(String subItemName)
		{
			if (!items.containsKey(subItemName))
			{
				items.put(subItemName, new ProfileSubItem());
			}
			return items.get(subItemName);
		}
	}
	
	class ProfileSubItem
	{
		public long count = 0;
		public long duration = 0;
	}
	

	public void saveProfile() throws IOException
	{
		File file = new File("profiler.tsv");
		BufferedWriter w = new BufferedWriter(new FileWriter(file));
		w.write("item\tsubitem\tcount\tduration");
		w.newLine();
		Set<String> itemKeys = items.keySet();
		for(String itemKey : itemKeys)
		{
			ProfileItem profileItem = items.get(itemKey);
			Set<String> subItemKeys = profileItem.items.keySet();
			for(String subItemKey : subItemKeys)
			{
				ProfileSubItem subItem = profileItem.items.get(subItemKey);
				StringBuilder builder = new StringBuilder();
				builder.append(itemKey);
				builder.append(TAB);
				builder.append(subItemKey);
				builder.append(TAB);
				builder.append(subItem.count);
				builder.append(TAB);
				builder.append(subItem.duration);
				
				w.write(builder.toString());
				w.newLine();
			}
			w.flush();
		}
		w.flush();
		w.close();
	}
}
