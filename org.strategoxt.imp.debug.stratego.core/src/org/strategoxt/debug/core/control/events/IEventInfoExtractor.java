package org.strategoxt.debug.core.control.events;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.model.LocationInfo;

import com.sun.jdi.StackFrame;

public interface IEventInfoExtractor {

	/**
	 * Returns the filename.
	 * @return
	 */
	public String getFilename();
	
	/**
	 * Returns the name of the current strategy or rule.
	 * @return
	 */
	public String getName();
	
	/**
	 * Returns the given IStrategoTerm (this should be the current term).
	 * @return
	 */
	public IStrategoTerm getGiven();
	
	/**
	 * Returns the LocationInfo.
	 * @return
	 */
	public LocationInfo getLocationInfo();

	/**
	 * Returns the varname
	 * @return
	 */
	public String getVarname();
	
	/**
	 * Returns the current Java StackFrame.
	 * @return
	 */
	public StackFrame getStackFrame();
	
	/**
	 * Call this method if the event info has changed in the debuggee.
	 */
	public void updateContents();

}
