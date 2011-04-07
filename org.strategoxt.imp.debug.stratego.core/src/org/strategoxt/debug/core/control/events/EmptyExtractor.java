package org.strategoxt.debug.core.control.events;

import org.spoofax.interpreter.terms.IStrategoTerm;
import org.strategoxt.debug.core.model.LocationInfo;

import com.sun.jdi.IncompatibleThreadStateException;
import com.sun.jdi.StackFrame;
import com.sun.jdi.ThreadReference;
import com.sun.jdi.event.BreakpointEvent;

public class EmptyExtractor  implements IEventInfoExtractor {

	private BreakpointEvent event = null;
	
	public EmptyExtractor(BreakpointEvent event) {
		this.event = event;
	}

	public String getFilename() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	public IStrategoTerm getGiven() {
		// TODO Auto-generated method stub
		return null;
	}

	public LocationInfo getLocationInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getVarname() {
		// TODO Auto-generated method stub
		return null;
	}

	private StackFrame stackFrame = null;
	
	public StackFrame getStackFrame() {
		if (this.stackFrame == null)
		{
			if (this.event != null)
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
		return this.stackFrame;
	}

	public void updateContents() {
		// TODO Auto-generated method stub
		
	}

}
