package org.strategoxt.debug.core.util.table;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.util.StringUtil;

public class EventTable {

	private List<EventEntry> eventEntries = null;
	
	public EventTable()
	{
		this.eventEntries = new ArrayList<EventEntry>();
	}
	
	/**
	 * Add an EventEntry to the EventTable.
	 * @param eventEntry
	 */
	public void add(EventEntry eventEntry)
	{
		this.eventEntries.add(eventEntry);
	}
		
	/**
	 * Returns the number of items in the EventTable.
	 * @return
	 */
	public int size()
	{
		return this.eventEntries.size();
	}
	
	/**
	 * Read the table from the given location and return a EventTable
	 * @param location
	 * @return
	 */
	public static EventTable readEventTable(String location)
	{
		EventTable eventTable = null; // return value
		
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(location));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		if (reader == null)
		{
			// could not open file
			System.out.println("Could not open file " + location);
			return eventTable;
		}
	    String line;
	    int i = 0;
	    try {
	    	eventTable = new EventTable();
			while ((line = reader.readLine()) != null)
			{
				String cells[] = line.split("\t");
				// should have length 7
				if (cells.length != 7)
				{
					System.err.println("Row " + i + " does not have 7 cells...");
				}
				String eventType = cells[0];
				String strategoFilename = StringUtil.trimQuotes(cells[1]); // is surround by quotes
				String strategyName = StringUtil.trimQuotes(cells[2]); // is surrounded by quotes
				String start_line_num = StringUtil.trimQuotes(cells[3]);
				String start_token_pos = StringUtil.trimQuotes(cells[4]);
				String end_line_num = StringUtil.trimQuotes(cells[5]);
				String end_token_pos = StringUtil.trimQuotes(cells[6]);
				LocationInfo locationInfo = new LocationInfo(start_line_num, start_token_pos, end_line_num, end_token_pos);
				// convert cells to EventEntry
				EventEntry eventEntry = new EventEntry(eventType, strategoFilename, strategyName, locationInfo);
				eventTable.add(eventEntry);
				// next line please...
				i++;
			}
		} catch (IOException e) {
			System.out.println("Failed at row " + i);
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return eventTable;
	}
	
	/**
	 * Gets the EventEntries that match the given filename and the given linenumber.
	 * Multiple EventEntries can be at the same linenumber.
	 * @param filename
	 * @param linenumber
	 * @return
	 */
	public List<EventEntry> getEventEntries(String filename, int linenumber)
	{
		List<EventEntry> matches = new ArrayList<EventEntry>();
		
		for(EventEntry eventEntry : this.eventEntries)
		{
			int start_line_num = eventEntry.getLocationInfo().getStart_line_num();
			int end_line_num = eventEntry.getLocationInfo().getEnd_line_num();
			String strFilename = eventEntry.getStrategoFilename();
			if ((start_line_num <= linenumber) && (linenumber <= end_line_num)  && strFilename.equals(filename))
			{
				matches.add(eventEntry);
			}
		}
		return matches;
	}
	
	/**
	 * Gets the EventEntries that match the given filename, the given linenumber and the given eventType.
	 * @param filename
	 * @param linenumber
	 * @param eventType
	 * @return
	 */
	public List<EventEntry> getEventEntries(String filename, int linenumber, String eventType)
	{
		List<EventEntry> matches = this.getEventEntries(filename, linenumber);
		List<EventEntry> typeMatches = new ArrayList<EventEntry>();
		for(EventEntry eventEntry : matches)
		{
			if (eventType != null && eventType.equals(eventEntry.getEventType()))
			{
				typeMatches.add(eventEntry);
			}
		}
		return typeMatches;
	}
	
	/**
	 * Gets the EventEntries that match the given filename and the EventEntry should surround the linenumber and token_position.
	 * 
	 * @param filename
	 * @param linenumber
	 * @param token_position
	 * @return
	 */
	public List<EventEntry> getEventEntries(String filename, int linenumber, int token_position)
	{
		List<EventEntry> matches = new ArrayList<EventEntry>();
		
		for(EventEntry eventEntry : this.eventEntries)
		{
			if (eventEntry.getLocationInfo().surrounds(linenumber, token_position) && eventEntry.getStrategoFilename().equals(filename))
			{
				matches.add(eventEntry);
			}
		}
		return matches;
	}
	
	/**
	 * Gets the EventEntries that match the given filename, the given eventType and the EventEntry should surround the linenumber and token_position.
	 * 
	 * @param filename
	 * @param linenumber
	 * @param token_position
	 * @param eventType
	 * @return
	 */
	public List<EventEntry> getEventEntries(String filename, int linenumber, int token_position, String eventType)
	{
		List<EventEntry> matches = this.getEventEntries(filename, linenumber, token_position);
		List<EventEntry> typeMatches = new ArrayList<EventEntry>();
		for(EventEntry eventEntry : matches)
		{
			if (eventType != null && eventType.equals(eventEntry.getEventType()))
			{
				typeMatches.add(eventEntry);
			}
		}
		return typeMatches;
	}
	
	/**
	 * Returns the first EventEntry that is a s-step event from the given list.
	 * @param entries
	 * @return
	 */
	public static EventEntry getFirstStepEventEntry(List<EventEntry> entries)
	{
		for(EventEntry eventEntry: entries)
		{
			if ("s-step".equals(eventEntry.getEventType()))
			{
				return eventEntry;
			}
		}
		return null;
	}
	
	/**
	 * Returns the first EventEntry that is a s-enter or a r-enter event from the given list.
	 * @param entries
	 * @return
	 */
	public static EventEntry getFirstEnterEventEntry(List<EventEntry> entries)
	{
		for(EventEntry eventEntry: entries)
		{
			if ("s-enter".equals(eventEntry.getEventType()) || "r-enter".equals(eventEntry.getEventType()))
			{
				return eventEntry;
			}
		}
		return null;
	}
}
