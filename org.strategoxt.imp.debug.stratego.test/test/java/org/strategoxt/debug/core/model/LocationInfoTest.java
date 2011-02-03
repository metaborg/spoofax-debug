package org.strategoxt.debug.core.model;

import static org.junit.Assert.assertEquals;

import java.util.StringTokenizer;

import org.junit.Test;

public class LocationInfoTest {

	
	@Test
	public void testStringToLocationInfo()
	{
		String l = "LocationInfo(\"25\",\"2\",\"25\",\"81\")";
		LocationInfo info = new LocationInfo("25","2","25","81");
		String delim = "\"";
		StringTokenizer t = new StringTokenizer(l, delim);
		t.nextToken(); // LocationInfo(
		String startLineNum = t.nextToken(); // 25
		t.nextToken(); // ,
		String startTokenPos = t.nextToken(); // 2
		t.nextToken(); // ,
		String endLineNum = t.nextToken(); // 25
		t.nextToken(); // ,
		String endTokenPos = t.nextToken(); // 81
		LocationInfo parsedInfo = new LocationInfo(startLineNum, startTokenPos, endLineNum, endTokenPos);
		assertEquals(parsedInfo, info);
	}
}
