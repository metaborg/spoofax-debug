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
import com.sun.jdi.event.MethodExitEvent;

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
	
	protected MethodEntryEvent entry_event = null;
	protected MethodExitEvent exit_event = null;
	
	protected StrategoTermBuilder builder = new StrategoTermBuilder();
	
	public EventHandler(MethodExitEvent event)
	{
		this.exit_event = event;
		this.initLocalVariables();
	}
	
	public EventHandler(MethodEntryEvent event)
	{
		this.entry_event = event;
		this.initLocalVariables();
	}
	
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
		}
		return args;
	}
	
	private StackFrame stackFrame = null;
	/**
	 * Returns the current stack frame
	 * @return
	 */
	public StackFrame getStackFrame()
	{
		if (stackFrame == null)
		{
			if (this.entry_event != null)
			{
				ThreadReference thread = entry_event.thread();
				
				StackFrame fr = null;
				try {
					fr = thread.frame(0); // get current frame
				} catch (IncompatibleThreadStateException e) {
					e.printStackTrace(); // thread should be suspended
				}
				this.stackFrame = fr;
			}
			else if (exit_event != null)
			{
				ThreadReference thread = exit_event.thread();
				
				StackFrame fr = null;
				try {
					fr = thread.frame(0); // get current frame
				} catch (IncompatibleThreadStateException e) {
					e.printStackTrace(); // thread should be suspended
				}
				this.stackFrame = fr;
			}
		}
		return stackFrame;
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
	 * Returns the value of the LocalVariable given which is a method parameter.
	 * 
	 * @return
	 */
	protected Value getGivenValue()
	{
		StackFrame fr = getStackFrame();
		
		Value val = fr.getValue(this.givenLV);	
		
		return val;		
	}
	
	/**
	 * Returns the value of the LocalVariable context which is a method parameter.
	 * 
	 * @return
	 */
	public Value getContextValue()
	{
		StackFrame fr = getStackFrame();
		
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
		StackFrame fr = getStackFrame();
		
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
		StackFrame fr = getStackFrame();
		
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
		StackFrame fr = getStackFrame();
		
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
		
		StackFrame fr = getStackFrame();
		
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
	public boolean shouldSuspend(StrategoState currentState, EventSpecManager eventSpecManager){
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
		boolean isBreakPointHit = eventSpecManager.match(createBreakPoint());
		
        // if we should step
		// stop at the first s-step that is in the same StackFrame
		boolean shouldSuspend = false;
		if (isBreakPointHit){
			// we hit a break point
			// if stepping is active it should be cancelled
			if (eventSpecManager.isStepOverActive() || eventSpecManager.isStepIntoActive() || eventSpecManager.isStepReturnActive())
			{
				eventSpecManager.resetStep();
			}
			shouldSuspend = true;
		}
		else if (eventSpecManager.isStepOverActive())
		{
			// if level is the same
			if (eventSpecManager.getStepFrameLevel() == currentState.getCurrentFrameLevel())
			{
				// rule/strategy location are the same
				boolean sameLocation = eventSpecManager.getStepFrame().getLocationInfo().equals(currentState.currentFrame().getLocationInfo());
				boolean sameFilename = eventSpecManager.getStepFrame().getFilename().equals(currentState.currentFrame().getFilename());
				boolean sameName = eventSpecManager.getStepFrame().getName().equals(currentState.currentFrame().getName());
				if (sameLocation && sameFilename && sameName)
				{
					// we hit the next debug event
					if (this.getEventType().equals(EventHandler.S_STEP))
					{
						// we hit the next s-step
						shouldSuspend = true;
						eventSpecManager.resetStep(); // reset step
					}
					// S_VAR we can ignore
					// S_ENTER/R_ENTER should never happen is the same StackFrame
					// S_EXIT/R_EXIT can happen
					else if (this.getEventType().equals(EventHandler.S_EXIT) || this.getEventType().equals(EventHandler.R_EXIT))
					{
						// we have hit the s-exit/r-exit of the frame in which the step occured.
						shouldSuspend = true;
						eventSpecManager.resetStep(); // reset step
					}
				}
			}
			// what if the current stackframe level is smaller that the stepFrameLevel? We must have missed an r-exit/s-exit
		} else if (eventSpecManager.isStepIntoActive())
		{
			// an new debug event was fired, this should be an s-enter or r-enter as we can only step into strategies or rules that are debuggable
			// if the event is s-step we just did a normal step over, cancel the stepinto event and just resume
			
			// level of the current stackframe should equal (stepFrameLevel+1)
			// an we should have stopped at a s-enter/r-enter
			int stepIntoFrameLevel = eventSpecManager.getStepFrameLevel() + 1;
			if (stepIntoFrameLevel == currentState.getCurrentFrameLevel() && 
					(this.getEventType().equals(EventHandler.S_ENTER)
					|| this.getEventType().equals(EventHandler.R_ENTER))
					)
			{
				shouldSuspend = true;
			}
			else
			{
				// could not do a s-enter
			}
			eventSpecManager.resetStep(); // reset step
		}
		else if (eventSpecManager.isStepReturnActive())
		{
			// suspend if we get an event of the parent StackFrame of getStepFrame
			// stepIntoFrameLevel - 1 = getCurrentFrameLevel()
			int parentFrameLevel = eventSpecManager.getStepFrameLevel() - 1;
			if (parentFrameLevel == currentState.getCurrentFrameLevel())
			{
				// it does not matter what the eventType is of the fired debug event
				shouldSuspend = true;
				eventSpecManager.resetStep(); // reset step
			}
		}
		
        return shouldSuspend; // if break point exists suspend thread
	}
	
	/**
	 * Override this method when some stuff needs to be done if this DebugEvent occurs.
	 * @param strategoState 
	 */
	public void processDebugEvent(StrategoState strategoState) 
	{
	}
	
	protected abstract BreakPoint createBreakPoint();

	public abstract String getEventType();

	public abstract boolean isEnter();
}
