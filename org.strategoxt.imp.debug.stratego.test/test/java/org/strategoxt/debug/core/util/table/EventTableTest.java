package org.strategoxt.debug.core.util.table;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class EventTableTest {
	
	public static void main(String[] args) {
		runTestTable();
	}

	public static void runTestTable()
	{
		EventTableTest test = new EventTableTest();
		test.testReadTable();
	}
	
	@Test
	public void testReadTable()
	{
		String location = "working/localvar/stratego/localvar.table";
		EventTable eventTable = EventTable.readEventTable(location);
		Assert.assertNotNull("EventTable is not initialized, check if the table file exists. ", eventTable);
		Assert.assertEquals(74, eventTable.size());
		
		// 31,1 // 0
		List<EventEntry> entries = countEntries(eventTable, 31, 1, 0);
		//System.out.println(entries.size());
		
		// 31,2 // 0
		entries = countEntries(eventTable, 31, 2, 0);
		
		// 31,3 // 3 enter/exit/exit
		entries = countEntries(eventTable, 31, 3, 3);
		
		// 31,4 //  3 enter/exit/exit
		entries = countEntries(eventTable, 31, 4, 3);
		
		// 32,1 // 3 enter/exit/exit
		entries = countEntries(eventTable, 32, 1, 3);

		// 32,2 // 3 enter/exit/exit
		entries = countEntries(eventTable, 32, 2, 3);

		// 32,3 // 3 enter/exit/exit
		entries = countEntries(eventTable, 32, 3, 3);

		// 32,4 // 3 enter/exit/exit
		entries = countEntries(eventTable, 32, 4, 3);

		// 32,5 // 4 enter/exit/exit/step
		entries = countEntries(eventTable, 32, 5, 4);

		// 43,2 // enter/exit
		entries = countEntries(eventTable, 43, 2, 2);
		
		// 43, 4 // enter/exit
		entries = countEntries(eventTable, 43, 4, 2);
		// 47,4
		entries = countEntries(eventTable, 47, 4, 3);
		// 48,6
		entries = countEntries(eventTable, 48, 6, 3);
		// 49,6
		entries = countEntries(eventTable, 49, 6, 3);
		
		// clear the list
		entries.clear();
	}
	
	private List<EventEntry> countEntries(EventTable eventTable, int linenumber, int token_position, int count)
	{
		List<EventEntry> entries = eventTable.getEventEntries("localvar.str", linenumber, token_position);
		Assert.assertEquals(count, entries.size());
		return entries;
	}
	
}
