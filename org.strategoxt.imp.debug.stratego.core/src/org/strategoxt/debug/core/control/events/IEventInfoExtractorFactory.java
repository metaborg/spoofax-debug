package org.strategoxt.debug.core.control.events;

import org.strategoxt.imp.debug.stratego.runtime.strategies.HybridInterpreterDebugRuntime;

import com.sun.jdi.event.BreakpointEvent;
import com.sun.jdi.event.MethodEntryEvent;
import com.sun.jdi.event.MethodExitEvent;

public class IEventInfoExtractorFactory {

	public static IEventInfoExtractor createExtractor(BreakpointEvent event) {
		String name = event.location().method().declaringType().name();
		if (HybridInterpreterDebugRuntime.class.getName().equals(name))
		{
			// the breakpoint in the HybridInterpreter does not have any StrategoState info, it is hit before the program is executed
			return new EmptyExtractor(event);
		} else {
			return new EventInfoStringExtractor(event);
		}
	}
	
	public static IEventInfoExtractor createExtractor(MethodEntryEvent event) {
		return new EventInfoStringExtractor(event);
	}
	
	public static IEventInfoExtractor createExtractor(MethodExitEvent event) {
		return new EventInfoStringExtractor(event);
	}

}
