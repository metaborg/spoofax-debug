package org.strategoxt.debug.core.control.events;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.StringTermReader;
import org.spoofax.terms.TermFactory;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.util.StrategoTermBuilder;
import org.strategoxt.debug.core.util.StringUtil;
import org.strategoxt.imp.debug.stratego.runtime.strategies.DebugCallStrategy;

import com.sun.jdi.Field;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.StackFrame;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.Value;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.LocatableEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;

/**
 * Extracts the Event Info from a string.
 * 
 * @author rlindeman
 *
 */
public class EventInfoStringExtractor implements IEventInfoExtractor {

	public static StrategoTermBuilder builder = new StrategoTermBuilder();
	
	public static TermFactory factory = new TermFactory();
	public static StringTermReader termReader = new StringTermReader(factory);
	
	
	private String eventInfoString = null;
	private String givenTermString = null;
	private String varnameString = null;
	
	private IStrategoTerm eventInfoStrategoTerm = null;
	
	
	
	private String filename = null;
	private String name = null;
	private LocationInfo locationInfo = null;
	
	private IStrategoTerm given = null;
	
	private String varname = null;
	
	protected MethodEntryEvent entry_event = null;
	protected MethodExitEvent exit_event = null;
	protected BreakpointEvent breakpoint_event = null;
	
	public EventInfoStringExtractor(MethodEntryEvent event)
	{
		this.entry_event = event;
		this.init();
	}
	
	public EventInfoStringExtractor(MethodExitEvent event)
	{
		this.exit_event = event;
		this.init();
	}
	
	public EventInfoStringExtractor(BreakpointEvent event)
	{
		this.breakpoint_event = event;
		this.init();
	}
	
	private void init()
	{
		String eventInfoString = builder.buildString(getEventInfoStringValue());
		this.eventInfoString = eventInfoString;
		// parse the eventInfoString
		
		eventInfoStrategoTerm = termReader.parseFromString(this.eventInfoString);
		// return a tuple (filename, name, location)
		this.filename = StringUtil.trimQuotes(eventInfoStrategoTerm.getSubterm(0).toString());
		this.name = StringUtil.trimQuotes(eventInfoStrategoTerm.getSubterm(1).toString());
		this.locationInfo = LocationInfo.parse(eventInfoStrategoTerm.getSubterm(2));
		
		// fetch the current Term
		// TODO: use lazy loading when the current Term is big...
		String givenTermString = builder.buildString(getGivenTermStringValue());
		this.givenTermString = givenTermString;
		this.given = termReader.parseFromString(this.givenTermString);
		
		Value v = getVarnameStringValue();
		if (v != null)
		{
		String varnameString = builder.buildString(v);
		this.varnameString = varnameString;
		this.varname = StringUtil.trimQuotes(this.varnameString);
		}
	}

	public String getFilename() {
		return filename;
	}

	public IStrategoTerm getGiven() {
		return given;
	}
	
	public LocationInfo getLocationInfo() {
		return locationInfo;
	}
	
	public String getName() {
		return name;
	}

	public String getVarname()
	{
		return this.varname;
	}
	
	public Value getContextValue() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * The current com.sun.jdi.StackFrame.
	 */
	private StackFrame stackFrame = null;
	
	/**
	 * Returns the current com.sun.jdi.StackFrame
	 * @return
	 */
	public StackFrame getStackFrame() {
		if (stackFrame == null)
		{
			LocatableEvent event = this.getEvent();
			if (event != null)
			{
				ThreadReference thread = event.thread();
				
				StackFrame fr = null;
				try {
					fr = thread.frame(0); // get current frame
				} catch (IncompatibleThreadStateException e) {
					e.printStackTrace(); // thread should be suspended
				} catch (IndexOutOfBoundsException e) {
					e.printStackTrace(); // invalid index
				}
				this.stackFrame = fr;
			}

		}
		return stackFrame;
	}
	
	private LocatableEvent getEvent()
	{
		if (this.breakpoint_event != null)
		{
			return this.breakpoint_event;
		} else if (this.entry_event != null)
		{
			return this.entry_event;
		}
		else if (this.exit_event != null)
		{
			return this.exit_event;
		}
		else
		{
			return null;
		}
	}

	
	/**
	 * A string representation of the Event Info tuple (filename, name, LocationInfo), this maybe faster to copy from the debug vm instead of each one separately.
	 */
	private Value eventInfoStringValue = null;
	
	/**
	 * This value is a String representation of the Event Info tuple (filename, name, LocationInfo)
	 * @return
	 */
	private Value getEventInfoStringValue()
	{
		if (this.eventInfoStringValue == null)
		{
			Field lsField = this.getStackFrame().thisObject().referenceType().fieldByName(DebugCallStrategy.EVENTINFO);
			Value val = this.getStackFrame().thisObject().getValue(lsField);
			
			//Value val = getSafeValue(this.locationStringLV);
			this.eventInfoStringValue = val;
		}
		return this.eventInfoStringValue;
	}
	
	private Value givenTermStringValue = null;
	
	public Value getGivenTermStringValue() {
		if (this.givenTermStringValue == null) 
		{
			Field lsField = this.getStackFrame().thisObject().referenceType().fieldByName(DebugCallStrategy.CURRENTTERMSTRING);
			Value val = this.getStackFrame().thisObject().getValue(lsField);
			
			this.givenTermStringValue = val;
		}

		return this.givenTermStringValue;
	}
	
	private Value varnameStringValue = null;
	
	public Value getVarnameStringValue() {
		if (this.varnameStringValue == null) 
		{
			Field lsField = this.getStackFrame().thisObject().referenceType().fieldByName(DebugCallStrategy.VARNAMESTRING);
			Value val = this.getStackFrame().thisObject().getValue(lsField);
			
			this.varnameStringValue = val;
		}

		return this.varnameStringValue;
	}
}
