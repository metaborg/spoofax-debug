package org.strategoxt.debug.core.control.events;

import org.strategoxt.debug.core.control.EventProfiler;
import org.strategoxt.debug.core.eventspec.BreakPoint;
import org.strategoxt.debug.core.eventspec.StrategyStepBreakPoint;
import org.strategoxt.debug.core.model.LocationInfo;
import org.strategoxt.debug.core.model.StrategoState;

public class StrategyStepHandler extends EventHandler {

	public StrategyStepHandler(ValueExtractor extractor) {
		super(extractor);
	}

	@Override
	protected BreakPoint createBreakPoint(StrategoState currentState) {
		//long start = System.nanoTime();
		//String name = this.getName(); // the name of the strategy
		//String n = currentState.currentFrame().getName();
		//if (!n.equals(name)) {System.err.println("NAMES DO NOT MATCH");}
		String name = currentState.currentFrame().getName();
		
		//long b1 = System.nanoTime();
		//EventProfiler.instance.mark("createBreakPoint", "B1", b1 - start);
		//String filename = this.getFilename(); // the filename of the stratego file in which we want to set a breakpoint
		//String f = currentState.currentFrame().getFilename();
		//if (!f.equals(filename)) {System.err.println("FILENAMES DO NOT MATCH");}
		String filename = currentState.currentFrame().getFilename();
		
		//long b2 = System.nanoTime();
		//EventProfiler.instance.mark("createBreakPoint", "B2", b2 - b1);
		LocationInfo locationInfo = getLocationInfo();
		
		//long b3 = System.nanoTime();
		//EventProfiler.instance.mark("createBreakPoint", "B3", b3 - b2);
		StrategyStepBreakPoint b = new StrategyStepBreakPoint(filename, name, locationInfo.getStart_line_num(), locationInfo.getStart_token_pos());
		
		//long b4 = System.nanoTime();
		//EventProfiler.instance.mark("createBreakPoint", "B4", b4 - b3);
		return b;
	}

	@Override
	public String getEventType() {
		return EventHandler.S_STEP;
	}

	@Override
	public boolean isEnter() {
		return false;
	}
	
	@Override
	public boolean isExit() {
		return false;
	}
	
	@Override
	public void processDebugEvent(StrategoState strategoState) {
		// the current term on the frame should now be
		//h.getGiven();
		
		/*
		// OPTIMIZED: only set the current term when we are suspended
		// perform smart set
		if (strategoState.currentFrame().getCurrentTerm() == this.getGiven())
		{
			// the same, do not set
			// same reference
		}
		else if (strategoState.currentFrame().getCurrentTerm().equals(this.getGiven()))
		{
			// the same, do not set
			// same value
		}
		else
		{
			strategoState.currentFrame().setCurrentTerm(this.getGiven()); 
		}
		*/
		String markName = "PDE_" + this.getEventType();
		EventProfiler.instance.startMark(markName);
		
		super.processDebugEvent(strategoState); // update current location info
		

		EventProfiler.instance.subMark(markName, "P-SUPER");

	}
	
}
