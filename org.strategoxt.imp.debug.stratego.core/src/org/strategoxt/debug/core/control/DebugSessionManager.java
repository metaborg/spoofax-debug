package org.strategoxt.debug.core.control;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IPath;
import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.model.StrategoState;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.StreamRedirectThread;
import org.strategoxt.debug.core.util.VMLauncherHelper;

import com.sun.jdi.Bootstrap;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.VirtualMachineManager;


public class DebugSessionManager {

	private VirtualMachine vm = null;

	public boolean running = false;
	
	/**
	 * Will be true when terminateVM() is called.
	 */
	private boolean isTerminated = false;
	
	// Thread transferring remote error stream to our error stream
	private StreamRedirectThread errThread = null;

	// Thread transferring remote output stream to our output stream
	private StreamRedirectThread outThread = null;

	// Class patterns for which we don't want events
	private String[] excludes = { "java.*"
			, "javax.*"
			, "sun.*"
			, "com.sun.*"
			,"org.strategoxt.lang.terms.*"
			//, "org.strategoxt.*"
			//, "org.spoofax.*"
			//, "aterm.*"
		};
	
	// Do we want to watch assignments to fields
	private boolean watchFields = false;
	
	// keeps track of all event specifications (e.g. breakpoints)
	private EventSpecManager eventSpecManager = null;
	
	private EventThread eventThread = null;
	
	// any changes to the VM are reported to this monitor
	// e.g. thread suspended
	private VMMonitor vmMonitor = null;
	
	private DebugSessionSettings debugSessionSettings = null;
	
	public DebugSessionManager(DebugSessionSettings debugSessionSettings, VMMonitor vmMonitor)
	{
		this.debugSessionSettings = debugSessionSettings;
		this.eventSpecManager = new EventSpecManager(debugSessionSettings);
		this.vmMonitor = vmMonitor;
	}
	

	
	/**
	 * Initialize a new VM using the given VirtualMachineManager.
	 * 
	 * @param vmManager
	 * @param mainArgs
	 * @param classpath
	 */
	public void initVM(VirtualMachineManager vmManager, DebugSessionSettings settings, String mainArgs, String classpath, String connectorType) {
		VMLauncherHelper helper = new VMLauncherHelper(vmManager, connectorType);
		helper.setMainClasspath(classpath);
		List<IPath> jars = new ArrayList<IPath>();
		jars.add(settings.getStrategoxtJar());
		jars.addAll(settings.getRuntimeJars());
		
		helper.setDebugJars(jars);
		this.vm = helper.getTargetVM(mainArgs);
	}
	
	/**
	 * Initialize a new VM.
	 * Use the eclipse org.eclipse.jdi.Bootstrap.virtualMachineManager() method to get a VirtualMachineManager.
	 * If this method returns null, try to use the Sun implementation via com.sun.jdi.BootStrap.virtualMachineManager().
	 * @param mainArgs
	 * @param classpath
	 */
	public void initVM(DebugSessionSettings settings, String mainArgs, String classpath)
	{
		// use default launch
		this.initVM(settings, mainArgs, classpath, "LAUNCH");
	}
	
	public void initVM(DebugSessionSettings settings, String mainArgs, String classpath, String connectorType) {
		VirtualMachineManager vmManager = DebugSessionManager.getVirtualMachineManager();
		this.initVM(vmManager, settings, mainArgs, classpath, connectorType);
	}

	/**
	 * If initVM cannot be used, use this method to explicity set Virtual Machine.
	 * @param vm
	 */
	public void setVirtualMachine(VirtualMachine vm)
	{
		this.vm = vm;
	}

	/**
	 * Initializes the event listeners for the current virtual machine
	 */
	public void setupEventListeners() {
		int debugTraceMode = 0; // -dbgtrace 
		vm.setDebugTraceMode(debugTraceMode);
		this.eventThread = new EventThread(vm, excludes, eventSpecManager, vmMonitor);
		this.eventThread.setEventRequests(watchFields); // install the debug events
		this.eventThread.start();
	}
	
	public void redirectOutput() {
		Process process = vm.process();
		if (process != null)
		{
			// Copy target's output and error to our output and error.
			errThread = new StreamRedirectThread("error reader", process
					.getErrorStream(), System.err);
			outThread = new StreamRedirectThread("output reader", process
					.getInputStream(), System.out);
			errThread.start();
			outThread.start();
		}
		else
		{
			log("no process with vm");
		}
	}

	// next block of methods can be used to control the VM

	public void runVM() {
		log("runVM start");
        vm.resume();

        // Shutdown begins when event thread terminates
        try {
        	if (eventThread != null)
        	{
        		eventThread.join();
        	}
        	if (errThread != null)
        	{
	            errThread.join(); // Make sure output is forwarded
	        	errThread.closeStream();
        	}
        	if (outThread != null)
        	{
	            outThread.join(); // before we exit
	            outThread.closeStream();
        	}
        } catch (InterruptedException exc) {
            // we don't interrupt
        }
        log("runVM end");
	}
	
	/**
	 * Resume the Stratego VM.
	 */
	public void resumeVM()
	{
		log("RESUME");
		if (this.eventThread.getVMDied())
		{
			// cannot resume a VM that has died
			log("Cannot resume a VM that has died...");
		}
		else
		{
			this.getStrategoState().setSuspended(false);
			vm.resume();
		}
	}
	
	/**
	 * Suspend the Stratego VM.
	 */
	public void suspendVM()
	{
		vm.suspend();
	}
	
	public void stepInto()
	{
		if (canStepInto())
		{
			log("STEP INTO");
			// stop at the first possible s-enter/r-enter event
			// if the current statement is not a call to another method, we can only step over
			this.eventSpecManager.setStepInto(this.getStrategoState());
			this.resumeVM();
		}
	}
	
	public void stepOver()
	{
		if (this.canStepOver())
		{
			log("STEP OVER");
			// get the thread that is suspended, stratego programs are single threaded, so we always know which thread we need.
			// just save the step info in the EventSpecManager, if stratego becomes multi-threaded, step info needs to be saved per Thread
			this.eventSpecManager.setStepOver(this.getStrategoState());
			// stop at the next s-step that is in the same stackframe as the current one
			// if the current StackFrame exists (s-exit or r-exit) continue at the returning stackframe
			this.resumeVM();
		}
	}
	
	public void stepReturn()
	{
		if (this.canStepReturn())
		{
			log("STEP RETURN");
			// continue until the current stackframe fires an s-exit or r-exit event.
			// we should stop at the next s-step in the parent stackframe.
			this.eventSpecManager.setStepReturn(this.getStrategoState());
			this.resumeVM();
		}
	}
	
	/**
	 * Terminate the Stratego VM. Exits with exitcode 1, abnormal termination.
	 */
	public void terminateVM()
	{
		if (this.vm != null)
		{
			this.isTerminated = true;
			vm.exit(1);
		}
		else
		{
			System.out.println("No VM!");
		}
	}
	
	// next block of methods can be used to ask the VM if we can perform the action
	
	public boolean canResume() {
		return !isTerminated() && isSuspended();
	}

	public boolean canSuspend() {
		return !isTerminated() && !isSuspended();
	}
	
	public boolean canStepInto() {
		return canStep();
	}

	public boolean canStepOver() {
		return canStep();
	}

	public boolean canStepReturn() {
		return canStep();
	}
	
	/**
	 * Returns whether this thread is in a valid state to
	 * step.
	 * 
	 * @return whether this thread is in a valid state to
	 * step
	 */
	protected boolean canStep() {
		return isSuspended()
			// && (!isPerformingEvaluation() || isInvokingMethod()) // TODO: implement "perform evaluation"
			// && !isSuspendVoteInProgress() // TODO:  (conditional breakpoints, etc.).
			&& !isStepping()
			//&& getTopStackFrame() != null // just use the frame level
			&& this.getStrategoState().getCurrentFrameLevel() > -1
			// && !getJavaDebugTarget().isPerformingHotCodeReplace() // TODO: implement hot code replace
			;
	}
	
	
	// next block of methods ask for the state of the VM
	
	public boolean isTerminated() {
		return this.isTerminated;
	}
	
	public boolean isSuspended() {
		return this.getStrategoState().isSuspended();
	}
	
	public boolean isStepping()
	{
		return this.getStrategoState().isStepping();
	}
	// get methods
	
	public EventSpecManager getEventSpecManager()
	{
		return this.eventSpecManager;
	}

	public DebugSessionSettings getDebugSessionSettings()
	{
		return this.debugSessionSettings;
	}
	
	/**
	 * Returns the StrategoState of Stratego program. 
	 * As long as Stratego programs remain single threaded we can just return the state of the single man thread.
	 * @return
	 */
	private StrategoState getStrategoState()
	{
		return this.eventThread.getStrategoState();
	}
	
	/**
	 * returns the sun VirtualMachineManager via com.sun.jdi.BootStrap.virtualMachineManager().
	 * If this method is called with jdi.jar, the eclipse-version, on the classpath instead of tools.jar, the sun-version, 
	 * then this method will return null.
	 */
	public static VirtualMachineManager getSunVMM()
	{
		VirtualMachineManager vmm = Bootstrap.virtualMachineManager(); // com.sun.jdi.BootStrap
		return vmm;
	}
	
	public static VirtualMachineManager getEclipseVMM()
	{
		VirtualMachineManager vmm = org.eclipse.jdi.Bootstrap.virtualMachineManager();
		return vmm;
	}
	
	/**
	 * Try to get the VirtualMachineManager from the eclipse plugin implementation via org.eclipse.jdi.Bootstrap.virtualMachineManager().
	 * If it is null, try to use the Sun implementation via com.sun.jdi.BootStrap.virtualMachineManager(). 
	 * @return
	 */
	public static VirtualMachineManager getVirtualMachineManager()
	{
		VirtualMachineManager vmm = getEclipseVMM();
		if (vmm != null)
		{
			return vmm;
		}
		else
		{
			return getSunVMM();
		}
	}

	private void log(String s)
	{
		System.out.println(s);
	}
}
