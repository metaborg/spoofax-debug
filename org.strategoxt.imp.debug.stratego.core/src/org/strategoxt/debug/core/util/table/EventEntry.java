package org.strategoxt.debug.core.util.table;

import org.strategoxt.debug.core.model.LocationInfo;

public class EventEntry {

	private String eventType;
	
	private String strategoFilename;
	
	private String strategyName;
	
	private LocationInfo locationInfo;

	public EventEntry(String eventType, String strategoFilename,
			String strategyName, LocationInfo locationInfo) {
		super();
		this.eventType = eventType;
		this.strategoFilename = strategoFilename;
		this.strategyName = strategyName;
		this.locationInfo = locationInfo;
	}

	public String getEventType() {
		return eventType;
	}

	public String getStrategoFilename() {
		return strategoFilename;
	}

	public String getStrategyName() {
		return strategyName;
	}

	public LocationInfo getLocationInfo() {
		return locationInfo;
	}
	
	@Override
	public String toString() {
		String s = String.format("EventEntry type=%s strategyName=%s file=%s locationInfo=%s", eventType, strategyName, strategoFilename, locationInfo.toString());
		return s;
	}
	
}
