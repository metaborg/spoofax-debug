package org.strategoxt.debug.core.model;

import java.util.HashMap;

import org.spoofax.interpreter.terms.IStrategoTerm;

public class StrategoStackFrame {
	
	/**
	 * The name of the current rule or strategy.
	 */
	private String name;
	
	/**
	 * The filename in which the current rule or strategy is defined.
	 */
	private String filename;
	
	/**
	 * Location info about the current rule or strategy.
	 */
	private LocationInfo locationInfo;
	
	/**
	 * The current LocationInfo, currentLocationInfo should be surrounded by this.locationInfo
	 */
	private LocationInfo currentLocationInfo = null;
	
	/**
	 * The current stratego term.
	 */
	private IStrategoTerm current;

	private HashMap<String, IStrategoTerm> variables = null;
	
	/**
	 * 
	 * @param filename The filename in which the current rule or strategy is defined.
	 * @param name The name of the current rule or strategy.
	 * @param locationInfo Location info about the current rule or strategy.
	 * @param current The current stratego term.
	 */
	public StrategoStackFrame(String filename, String name, LocationInfo locationInfo,
			IStrategoTerm current) {
		this.name = name;
		this.filename = filename;
		this.locationInfo = locationInfo;
		this.current = current;
		this.variables = new HashMap<String, IStrategoTerm>();
	}
	
	public String toString()
	{
		String val = "Frame @ " + this.name + "[" + this.filename + "]";
		val += ":" + locationInfo.getStart_line_num();
		return val;
	}
	
	/**
	 * Returns the name of the current rule or strategy.
	 * 
	 * @return
	 */
	public String getName()
	{
		return this.name;
	}
	
	/**
	 * Returns the filename in which the current rule or strategy is defined.
	 * @return
	 */
	public String getFilename()
	{
		return this.filename;
	}
	
	/**
	 * Returns LocationInfo about the current rule or strategy.
	 * @return
	 */
	public LocationInfo getLocationInfo()
	{
		return this.locationInfo;
	}
	
	/**
	 * Returns the current stratego term.
	 * 
	 * @return
	 */
	public IStrategoTerm getCurrentTerm()
	{
		return this.current;
	}
	
	public LocationInfo getCurrentLocationInfo()
	{
		return this.currentLocationInfo;
	}
	
	public HashMap<String, IStrategoTerm> getVariables()
	{
		return this.variables;
	}
	
	public void setCurrentTerm(IStrategoTerm term)
	{
		this.current = term;
	}
	
	public void setCurrentLocationInfo(LocationInfo currentLocationInfo)
	{
		this.currentLocationInfo = currentLocationInfo;
	}
	
	/**
	 * Call this method when a new variable was used in this frame. (We received a s-var call from the debugger)
	 * @param varname
	 * @param value
	 */
	public void addVariable(String varname, IStrategoTerm value)
	{
		this.variables.put(varname, value);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof StrategoStackFrame))
			return false;
		StrategoStackFrame other = (StrategoStackFrame) obj;
		if (this.name == null || other.name == null)
			return false;
		if (this.current == null || other.current == null)
			return false;
		if (this.currentLocationInfo == null || other.currentLocationInfo == null)
			return false;
		if (this.filename == null || other.filename == null)
			return false;
		if (this.locationInfo == null || other.locationInfo == null)
			return false;
		
		boolean c1 = this.name.equals(other.name);
		boolean c2 = this.current.equals(other.current);
		boolean c3 = this.currentLocationInfo.equals(other.currentLocationInfo);
		boolean c4 = this.filename.equals(other.filename);
		boolean c5 = this.locationInfo.equals(other.locationInfo); // TODO: use this one?
		
		if (c1 && c2 && c3 && c4 && c5)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		final int prime = 61;
		
		int result = 1;
		result = prime * result + this.current.hashCode();
		result = prime * result + this.currentLocationInfo.hashCode();
		result = prime * result + this.filename.hashCode();
		result = prime * result + this.locationInfo.hashCode(); // TODO: ise this one?
		result = prime * result + this.name.hashCode();
		
		return result;
	}
}
