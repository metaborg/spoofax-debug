package org.strategoxt.debug.core.control.events;

import java.util.ArrayList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.StrategoTermBuilder;
import org.strategoxt.lang.terms.StrategoString;

import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.LocalVariable;
import com.sun.jdi.StackFrame;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.Value;
import com.sun.jdi.event.MethodEntryEvent;

public abstract class EventHandler {
	
	// The following object attrbibutes should match the parameters in the invoke-method of the classes java_[r/s]_[enter/exit]_0_{x}
	// where {x} is the number of term arguments in the strategy
	protected LocalVariable contextLV = null; // org.strategoxt.lang.Context
	
	/**
	 * Current term should be the same as the given term
	 */
	protected LocalVariable currentLV = null; // org.spoofax.interpreter.terms.IStrategoTerm
	
	/**
	 * The filename from which the call originated
	 */
	protected LocalVariable filenameLV = null; // org.spoofax.interpreter.terms.IStrategoTerm
	
	/**
	 * The name of the rule or strategy
	 */
	protected LocalVariable nameLV = null; // org.spoofax.interpreter.terms.IStrategoTerm
	
	/**
	 * LocationInfo about the calling rule or strategy
	 */
	protected LocalVariable locationLV = null; // org.spoofax.interpreter.terms.IStrategoTerm
	
	/**
	 * Given term, the term that was the original term when the rule or strategy was entered.
	 */
	protected LocalVariable givenLV = null; // org.spoofax.interpreter.terms.IStrategoTerm
	
	/**
	 * Only applies to s-var events, contains the name of the local variable that is assigned.
	 */
	protected LocalVariable varnameLV = null; // org.spoofax.interpreter.terms.IStrategoTerm
	
	public static String S_ENTER = "s_enter";
	public static String S_EXIT = "s_exit";
	public static String R_ENTER = "r_enter";
	public static String R_EXIT = "r_exit";
	public static String S_STEP = "s_step";
	public static String S_VAR = "s_var";
	
	protected MethodEntryEvent event = null;
	
	protected StrategoTermBuilder builder = new StrategoTermBuilder();
	
	public EventHandler(MethodEntryEvent event)
	{
		this.event = event;
		this.initLocalVariables();
	}
	
	private void initLocalVariables()
	{
		contextLV = null;
		currentLV = null;
		filenameLV = null;
		nameLV = null; 
		locationLV = null;
		givenLV = null;
		varnameLV = null;
		// set arguments for easy reference	
		List<LocalVariable> args = new ArrayList<LocalVariable>();
		try {
			args = this.event.method().arguments();
		} catch (AbsentInformationException e) {
			e.printStackTrace();
		}
		for(LocalVariable lv : args)
		{
			String lvName = lv.name();
			//System.out.println("LV: " + lv.name() + " " + lv.typeName());
			if ("context".equals(lvName))
			{
				contextLV = lv;
			}
			else if ("current".equals(lvName))
			{
				currentLV = lv;					
			}
			else if ("filename".equals(lvName))
			{
				filenameLV = lv;
			}
			else if ("name".equals(lvName))
			{
				nameLV = lv;
			}
			else if ("location".equals(lvName))
			{
				locationLV = lv;
			}
			else if ("given".equals(lvName))
			{
				givenLV = lv;
			}
			else if ("varname".equals(lvName))
			{
				varnameLV = lv;
			}
		}	
	}
	
	/**
	 * Returns the value of the LocalVariable given which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getGivenValue()
	{
		ThreadReference thread = event.thread();

		StackFrame fr = null;
		try {
			fr = thread.frame(0); // get current frame
		} catch (IncompatibleThreadStateException e) {
			e.printStackTrace(); // thread should be suspended
		}
		Value val = fr.getValue(this.givenLV);	
		
		return val;		
	}
	
	/**
	 * Returns the value of the LocalVariable context which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getContextValue()
	{
		ThreadReference thread = event.thread();

		StackFrame fr = null;
		try {
			fr = thread.frame(0); // get current frame
		} catch (IncompatibleThreadStateException e) {
			e.printStackTrace(); // thread should be suspended
		}
		Value val = fr.getValue(this.contextLV);	
		
		return val;
	}
	
	/**
	 * Returns the value of the LocalVariable location which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getLocationValue()
	{
		ThreadReference thread = event.thread();
	
		StackFrame fr = null;
		try {
			fr = thread.frame(0); // get current frame
		} catch (IncompatibleThreadStateException e) {
			e.printStackTrace(); // thread should be suspended
		}
		Value val = fr.getValue(this.locationLV);	
		
		return val;
	}

	/**
	 * Returns the value of the LocalVariable name which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getNameValue()
	{
		ThreadReference thread = event.thread();
	
		StackFrame fr = null;
		try {
			fr = thread.frame(0); // get current frame
		} catch (IncompatibleThreadStateException e) {
			e.printStackTrace(); // thread should be suspended
		}
		Value nameValue = fr.getValue(this.nameLV); // StrategoString instance
		
		return nameValue;
	}
	
	/**
	 * Returns the value of the LocalVariable filename which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getFilenameValue()
	{
		ThreadReference thread = event.thread();
		
		StackFrame fr = null;
		try {
			fr = thread.frame(0); // get current frame
		} catch (IncompatibleThreadStateException e) {
			e.printStackTrace(); // thread should be suspended
		}
		Value filenameValue = fr.getValue(this.filenameLV); // StrategoString instance
		
		return filenameValue;
	}
	
	/**
	 * Returns the value of the LocalVariable varname which is a method parameters.
	 * This variable is only used in s-var. This method may return null when the method parameter is not defined.
	 * @return
	 */
	protected Value getVarnameValue()
	{
		if (this.varnameLV == null)
		{
			return null;
		}
		
		ThreadReference thread = event.thread();
		
		StackFrame fr = null;
		try {
			fr = thread.frame(0); // get current frame
		} catch (IncompatibleThreadStateException e) {
			e.printStackTrace(); // thread should be suspended
		}
		
		Value varnameValue = fr.getValue(this.varnameLV); // StrategoString instance

		return varnameValue;
	}
	
	/**
	 * Returns the value of the method parameter 'given' as an IStrategoTerm.
	 * 
	 * @return
	 */
	public IStrategoTerm getGiven()
	{
        Value givenValue = this.getGivenValue();
        //Dump.dump(givenValue);
        IStrategoTerm given = builder.buildIStrategoTerm(givenValue);
        return given;
	}

	protected void getContext()
	{
		//System.out.println("CONTEXT");
        //ObjectReference obj = (ObjectReference) this.getContextValue();
        //ReferenceType refType = obj.referenceType();
        //Dump.dump(obj, refType, refType);
	}
	
	/**
	 * Creates a LocationInfo containing the location information
	 * 
	 * @return
	 */
	public LocationInfo getLocationInfo()
	{
		String[] locationInfo = new String[4];
		Value locationValue = getLocationValue();
		IStrategoAppl appl = builder.buildStrategoAppl(locationValue);
		IStrategoTerm[] terms = appl.getAllSubterms();
		int i = 0;
		for(IStrategoTerm term : terms)
		{
			if (term instanceof StrategoString)
			{
				StrategoString ss = (StrategoString) term;
				String number = ss.stringValue();
				if (number.startsWith("\"") && number.endsWith("\""))
				{
					number = number.substring(1, number.length()-1);
				}
				locationInfo[i] = number;
				i++;   
			}
		}

		LocationInfo loc = new LocationInfo(locationInfo);
		return loc;
	}

	/**
	 * Returns thevalue of the method parameter 'filename' as a String.
	 * @return
	 */
	public String getFilename()
	{
		Value filenameValue = getFilenameValue(); // should be StrategoString
		String s = builder.buildStrategoString(filenameValue).stringValue();
		
		String filename = "";
		// name is surrounded by double quotes, remove them.
		if (s.startsWith("\"") && s.endsWith("\""))
		{
			filename = s.substring(1, s.length()-1);
		}
		else
		{
			filename = s;
		}
		return filename;
	}
	
	/**
	 * Returns the value of the method parameter 'name' as a String.
	 * 
	 * @return
	 */
	public String getName()
	{
		Value nameValue = getNameValue(); // should be StrategoString
		String s = builder.buildStrategoString(nameValue).stringValue();
		
		String name = "";
		// name is surrounded by double quotes, remove them.
		if (s.startsWith("\"") && s.endsWith("\""))
		{
			name = s.substring(1, s.length()-1);
		}
		else
		{
			name = s;
		}
		return name;
	}
	
	/**
	 * Returns the value of the method parameter 'varname' as a String.
	 * If the method does not have a parameter 'varname' null is returned.
	 * @return
	 */
	public String getVarname()
	{
		Value varnameValue = getVarnameValue(); // should be StrategoString
		if (varnameValue == null)
		{
			return null;
		}
		String s = builder.buildStrategoString(varnameValue).stringValue();
		
		String varname = "";
		// varname is surrounded by double quotes, remove them.
		if (s.startsWith("\"") && s.endsWith("\""))
		{
			varname = s.substring(1, s.length()-1);
		}
		else
		{
			varname = s;
		}
		return varname;
	}
	

	/**
	 * Returns true if the thread should stay suspended.
	 * Returns false if the thread should resume
	 * @return
	 */
	public boolean shouldSuspend(EventSpecManager eventSpecManager){
		// sysout debug info
		/*
		String name = this.getName(); // the name of the rule
		LocationInfo locationInfo = getLocationInfo();
		//IStrategoTerm given = getGiven();
        //ITermPrinter pp = new PrettyPrinter();
        //ITermPrinter pp = new InlinePrinter();
        //given.prettyPrint(pp);
        System.out.println(this.getEventType() + " Name: " + name);
        System.out.println(locationInfo);
		//System.out.println("Current term:");
        //System.out.println(pp.getString());
        //System.out.println();
        */
        // end debug info
        
        boolean isBreakPoint = eventSpecManager.match(createBreakPoint());
        return isBreakPoint; // if break point exists suspend thread
	}
	
	/**
	 * Override this method when some stuff needs to be done if this DebugEvent occurs.
	 * @param strategoState 
	 */
	public void processDebugEvent(StrategoState strategoState) 
	{
	}
	
	protected abstract BreakPoint createBreakPoint();

	protected abstract String getEventType();

	public abstract boolean isEnter();
}
