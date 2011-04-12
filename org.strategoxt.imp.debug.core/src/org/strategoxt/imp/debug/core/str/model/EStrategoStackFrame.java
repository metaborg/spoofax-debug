package org.strategoxt.imp.debug.core.str.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IRegisterGroup;
import org.eclipse.debug.core.model.IStackFrame;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.debug.core.model.IVariable;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.TermFactory;
import org.strategoxt.debug.core.model.StrategoStackFrame;
import org.strategoxt.debug.core.util.table.OffsetTable;

public class EStrategoStackFrame extends StrategoDebugElement implements IStackFrame {

	private StrategoThread fThread;
	private String fName;
	private int fId;
	
	private IVariable[] fVariables;
	
	private StrategoStackFrame frameData = null;
	/**
	 * Constructs a stack frame in the given thread with the given
	 * frame data.
	 * 
	 * @param thread
	 * @param data frame data
	 * @param id stack frame id (0 is the bottom of the stack)
	 */
	public EStrategoStackFrame(StrategoThread thread, StrategoStackFrame data, int id) {
		super((StrategoDebugTarget) thread.getDebugTarget());
		fId = id;
		fThread = thread;
		frameData = data;
		init(data);
	}
	
	/**
	 * Initializes this frame based on its data
	 * 
	 * @param data
	 */
	private void init(StrategoStackFrame data) {
		this.frameData = data;
		fName = data.getName()+":"+data.getFilename();
		extractVariablesFromFrame();
	}
	
	private Object lock = new Object();
	
	/**
	 * Saves the variables that are active in the current frame in fVariables.
	 * The local variables emitted by the s-var debugger calls are shown
	 * as well as the current Term, with the label *current* 
	 * but also the dynamic rules.
	 */
	private synchronized void extractVariablesFromFrame()
	{		
		synchronized(lock){
			List<EStrategoVariable> vars = new ArrayList<EStrategoVariable>();
			EStrategoVariable currentVar = new EStrategoVariable(this.fTarget, this.frameData.getCurrentTerm(), "*current*");
			currentVar.setValueChanged(true);
			vars.add(currentVar);
			for(Map.Entry<String, IStrategoTerm> entry : this.frameData.getVariables().entrySet())
			{
				EStrategoVariable v = new EStrategoVariable(this.fTarget, entry.getValue(), entry.getKey());
				v.setValueChanged(true);
				vars.add(v);
			}
			// add dynamic rules
			if (this.frameData.hasDynamicRules())
			{
				TermFactory factory = new TermFactory();
				
				EStrategoMap ruleMap = new EStrategoMap(this.fTarget);
				for(String dynamicRuleName : this.frameData.getDynamicRules())
				{
					EStrategoVariable v = new EStrategoVariable(this.fTarget, factory.makeString("rule contents"), dynamicRuleName);
					v.setValueChanged(true);
					ruleMap.add(v);
				}
				
				EStrategoVariable dynamicRules = new EStrategoVariable(this.fTarget, ruleMap, "*dynamic rules*");
				vars.add(dynamicRules);
			}
			// TODO: use this.frameData to determine if the value was changed
			fVariables = new IVariable[vars.size()];
			fVariables = vars.toArray(fVariables);
		}
		
	}

	public int getCharEnd() throws DebugException {
		// convert linenumber and offset relative to the line to the total character offset
		// NOTE: take care with 0-based and 1-based indices, also newlines are counted as characters
		OffsetTable t = this.fTarget.getDebugSessionManager().getEventSpecManager().getOffsetTable();
		if (t == null)
		{
			return -1;
		}
		int linenumber = frameData.getCurrentLocationInfo().getEnd_line_num(); // one-based index
		int lineOffset = t.getLineOffset(this.frameData.getFilename(), linenumber - 1); // convert linenumber to zero-based index

		int end_token_pos = frameData.getCurrentLocationInfo().getEnd_token_pos();
		int charEnd = lineOffset + end_token_pos - 1; // convert charoffset to zero-based index
		return charEnd;
	}

	public int getCharStart() throws DebugException {
		// NOTE: take care with 0-based and 1-based indices, also newlines are counted as characters
		OffsetTable t = this.fTarget.getDebugSessionManager().getEventSpecManager().getOffsetTable();
		if (t == null)
		{
			return -1;
		}
		int linenumber = frameData.getCurrentLocationInfo().getStart_line_num(); // one-based index
		int lineOffset = t.getLineOffset(this.frameData.getFilename(), linenumber - 1); // convert linenumber to zero-based index

		int start_token_pos = frameData.getCurrentLocationInfo().getStart_token_pos();
		int charStart = lineOffset + start_token_pos - 1; // convert charoffset to zero-based index
		return charStart;
	}

	public int getLineNumber() throws DebugException {
		// TODO Auto-generated method stub
		//return frameData.getLocationInfo().getStart_line_num(); // LocationInfo of the rule/strategy that is active
		return frameData.getCurrentLocationInfo().getStart_line_num();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getName()
	 */
	public String getName() throws DebugException {
		return fName;
	}
	
	public int getId()
	{
		return this.fId;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getRegisterGroups()
	 */
	public IRegisterGroup[] getRegisterGroups() throws DebugException {
		return null;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getThread()
	 */
	public IThread getThread() {
		return fThread;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#getVariables()
	 */
	public IVariable[] getVariables() throws DebugException {
		extractVariablesFromFrame();
		return fVariables;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#hasRegisterGroups()
	 */
	public boolean hasRegisterGroups() throws DebugException {
		return false;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStackFrame#hasVariables()
	 */
	public boolean hasVariables() throws DebugException {
		return fVariables.length > 0;
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepInto()
	 */
	public boolean canStepInto() {
		return getThread().canStepInto();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepOver()
	 */
	public boolean canStepOver() {
		return getThread().canStepOver();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#canStepReturn()
	 */
	public boolean canStepReturn() {
		return getThread().canStepReturn();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#isStepping()
	 */
	public boolean isStepping() {
		return getThread().isStepping();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepInto()
	 */
	public void stepInto() throws DebugException {
		getThread().stepInto();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepOver()
	 */
	public void stepOver() throws DebugException {
		getThread().stepOver();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.IStep#stepReturn()
	 */
	public void stepReturn() throws DebugException {
		getThread().stepReturn();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canResume()
	 */
	public boolean canResume() {
		return getThread().canResume();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#canSuspend()
	 */
	public boolean canSuspend() {
		return getThread().canSuspend();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#isSuspended()
	 */
	public boolean isSuspended() {
		return getThread().isSuspended();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#resume()
	 */
	public void resume() throws DebugException {
		getThread().resume();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ISuspendResume#suspend()
	 */
	public void suspend() throws DebugException {
		getThread().suspend();
	}

	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#canTerminate()
	 */
	public boolean canTerminate() {
		return getThread().canTerminate();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#isTerminated()
	 */
	public boolean isTerminated() {
		return getThread().isTerminated();
	}
	
	/* (non-Javadoc)
	 * @see org.eclipse.debug.core.model.ITerminate#terminate()
	 */
	public void terminate() throws DebugException {
		getThread().terminate();
	}

	/**
	 * Returns the source filename of the current Frame.
	 * 
	 * @return
	 */
	public String getSourceName() {
		// TODO Auto-generated method stub
		return this.frameData.getFilename();
	}
	
	public StrategoStackFrame getFrameData()
	{
		return this.frameData;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof EStrategoStackFrame))
			return false;
		EStrategoStackFrame other = (EStrategoStackFrame) obj;
		// check frame data
		if (this.getFrameData() == null || other.getFrameData() == null)
		{
			return false;
		}
		return other.getFrameData().equals(this.getFrameData());
	}
	
	@Override
	public int hashCode() {
		final int prime = 71;
		int result = 1;
		result = prime * result;
		if (this.frameData != null)
		{
			result += this.frameData.hashCode();
		}
		return result;
	}
	
	public String toString()
	{
		String s = "EStrategoStackFrame ";
		if (this.getFrameData() != null)
		{
			// name of the file
			s += this.getFrameData().toString();
		}
		return s;
	}

}
