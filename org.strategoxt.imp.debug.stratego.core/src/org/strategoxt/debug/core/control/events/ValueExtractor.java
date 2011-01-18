package org.strategoxt.debug.core.control.events;

import java.util.ArrayList;
import java.util.List;

import org.spoofax.interpreter.terms.IStrategoAppl;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoTermValueWrapper;
import org.strategoxt.debug.core.util.StrategoTermBuilder;
import org.strategoxt.lang.terms.StrategoString;

import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.InvalidStackFrameException;
import com.sun.jdi.LocalVariable;
import com.sun.jdi.StackFrame;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.Value;
import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.LocatableEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;

public class ValueExtractor {

	// The following object attributes should match the parameters in the invoke-method of the classes java_[r/s]_[enter/exit]_0_{x}
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
	
	/**
	 * The current com.sun.jdi.StackFrame.
	 */
	private StackFrame stackFrame = null;
	
	
	
	protected MethodEntryEvent entry_event = null;
	protected MethodExitEvent exit_event = null;
	protected BreakpointEvent breakpoint_event = null;
	
	
	/**
	 * Used to reconstruct StrategoTerms
	 */
	protected StrategoTermBuilder builder = new StrategoTermBuilder();
	
	
	public ValueExtractor(MethodEntryEvent event)
	{
		this.entry_event = event;
		this.initLocalVariables();
	}
	
	public ValueExtractor(MethodExitEvent event)
	{
		this.exit_event = event;
		this.initLocalVariables();
	}
	
	public ValueExtractor(BreakpointEvent event)
	{
		this.breakpoint_event = event;
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
		List<LocalVariable> args = getMethodArguments();

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
	 * Extract the method arguments. 
	 * @return Returns a list of LocalVariables each represents a method argument.
	 */
	private List<LocalVariable> getMethodArguments()
	{
		List<LocalVariable> args = new ArrayList<LocalVariable>();
		if (this.entry_event != null)
		{
			try {
				args = this.entry_event.method().arguments();
			} catch (AbsentInformationException e) {
				e.printStackTrace();
			}
		}
		else if (exit_event != null)
		{
			try {
				args = this.exit_event.method().arguments();
			} catch (AbsentInformationException e) {
				e.printStackTrace();
			}
		} else if (breakpoint_event != null)
		{
			try {
				args = this.getStackFrame().visibleVariables();
			} catch (AbsentInformationException e) {
				e.printStackTrace();
			}
		}
		return args;
	}
	
	
	/**
	 * Returns the current com.sun.jdi.StackFrame
	 * @return
	 */
	public StackFrame getStackFrame()
	{
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
	
	private Value getSafeValue(LocalVariable localVariable)
	{
		StackFrame fr = getStackFrame();
		Value value = null;
		if (fr != null)
		{
			try {
				value = fr.getValue(localVariable);
			} catch (IllegalArgumentException e) {
				e.printStackTrace(); // if the variable is either invalid for this frame's method or not visible. 
			} catch (InvalidStackFrameException e) {
				e.printStackTrace(); // if this stack frame has become invalid. Once the frame's thread is resumed, the stack frame is no longer valid.
			}
		}
		return value;
	}
	
	
	private Value givenValue = null;
	
	/**
	 * Returns the value of the LocalVariable given which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getGivenValue()
	{
		if (givenValue == null)
		{
			Value val = getSafeValue(this.givenLV);
			this.givenValue = val;
		}
		return givenValue;		
	}
	
	private Value contextValue = null;
	
	/**
	 * Returns the value of the LocalVariable context which is a method parameter.
	 * 
	 * @return
	 */
	public Value getContextValue()
	{
		if (this.contextValue == null)
		{
			Value val = getSafeValue(this.contextLV);
			this.contextValue = val;
		}
		return contextValue;
	}
	
	private Value locationValue = null;
	
	/**
	 * Returns the value of the LocalVariable location which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getLocationValue()
	{
		if (this.locationValue == null) {
			Value val = getSafeValue(this.locationLV);	
			this.locationValue = val;
		}
		return locationValue;
	}

	private Value nameValue = null;
	
	/**
	 * Returns the value of the LocalVariable name which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getNameValue()
	{
		if (this.nameValue == null){
			Value val = getSafeValue(this.nameLV); // StrategoString instance
			this.nameValue = val;
		}
		return nameValue;
	}
	
	private Value filenameValue = null;
	
	/**
	 * Returns the value of the LocalVariable filename which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getFilenameValue()
	{
		if (this.filenameValue == null)
		{
			Value val = getSafeValue(this.filenameLV); // StrategoString instance
			this.filenameValue = val;
		}
		return filenameValue;
	}
	
	private Value varnameValue = null;
	
	/**
	 * Returns the value of the LocalVariable varname which is a method parameters.
	 * This variable is only used in s-var. This method may return null when the method parameter is not defined.
	 * @return
	 */
	protected Value getVarnameValue()
	{
		// the varname will not always be present
		if (this.varnameLV == null)
		{
			return null;
		}
		if (this.varnameValue == null)
		{
			Value varnameValue = getSafeValue(this.varnameLV); // StrategoString instance
			this.varnameValue = varnameValue;
		}
		return varnameValue;
	}
	
	private StrategoTermValueWrapper given = null;
	
	/**
	 * Returns the value of the method parameter 'given' as an IStrategoTerm.
	 * 
	 * @return
	 */
	public StrategoTermValueWrapper getGiven()
	{
		if (this.given == null)
		{
	        Value givenValue = this.getGivenValue();
	        //Dump.dump(givenValue);
	        //given = builder.buildIStrategoTerm(givenValue);
	        given = new StrategoTermValueWrapper(givenValue);
		}
        return given;
	}

	protected void getContext()
	{
		//System.out.println("CONTEXT");
        //ObjectReference obj = (ObjectReference) this.getContextValue();
        //ReferenceType refType = obj.referenceType();
        //Dump.dump(obj, refType, refType);
	}
	
	
	private LocationInfo locationInfo = null;
	
	/**
	 * Creates a LocationInfo containing the location information
	 * 
	 * @return
	 */
	public LocationInfo getLocationInfo()
	{
		if (this.locationInfo == null)
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
			this.locationInfo = loc;
		}
		return locationInfo;
	}
	
	private String filename = null;

	/**
	 * Returns thevalue of the method parameter 'filename' as a String.
	 * @return
	 */
	public String getFilename()
	{
		if (this.filename == null)
		{
			Value filenameValue = getFilenameValue(); // should be StrategoString
			String s = builder.buildStrategoString(filenameValue).stringValue();
			
			String f = "";
			// name is surrounded by double quotes, remove them.
			if (s.startsWith("\"") && s.endsWith("\""))
			{
				f = s.substring(1, s.length()-1);
			}
			else
			{
				f = s;
			}
			this.filename = f;
		}
		return filename;
	}
	
	private String name = null;
	
	/**
	 * Returns the value of the method parameter 'name' as a String.
	 * 
	 * @return
	 */
	public String getName()
	{
		if (this.name == null)
		{
			Value nameValue = getNameValue(); // should be StrategoString
			String s = builder.buildStrategoString(nameValue).stringValue();
			
			String n = "";
			// name is surrounded by double quotes, remove them.
			if (s.startsWith("\"") && s.endsWith("\""))
			{
				n = s.substring(1, s.length()-1);
			}
			else
			{
				n = s;
			}
			this.name = n;
		}
		return name;
	}
	
	private String varname = null;
	
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
		if (varname == null)
		{
			String s = builder.buildStrategoString(varnameValue).stringValue();
			
			String v = "";
			// varname is surrounded by double quotes, remove them.
			if (s.startsWith("\"") && s.endsWith("\""))
			{
				v = s.substring(1, s.length()-1);
			}
			else
			{
				v = s;
			}
			this.varname = v;
		}
		return varname;
	}
}
