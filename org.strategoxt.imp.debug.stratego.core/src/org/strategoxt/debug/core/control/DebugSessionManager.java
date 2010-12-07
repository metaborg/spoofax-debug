package org.strategoxt.debug.core.control;

import org.strategoxt.debug.core.eventspec.EventSpecManager;
import org.strategoxt.debug.core.util.DebugSessionSettings;
import org.strategoxt.debug.core.util.StreamRedirectThread;
import org.strategoxt.debug.core.util.VMLauncherHelper;

import com.sun.jdi.Bootstrap;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.VirtualMachineManager;


public class DebugSessionManager {

	private VirtualMachine vm = null;

	public boolean running = false;
	
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
	
	public DebugSessionSettings getDebugSessionSettings()
	{
		return this.debugSessionSettings;
	}
	
	/**
	 * Initialize a new VM using the given VirtualMachineManager.
	 * 
	 * @param vmManager
	 * @param mainArgs
	 * @param classpath
	 */
	public void initVM(VirtualMachineManager vmManager, String mainArgs, String classpath) {
		VMLauncherHelper helper = new VMLauncherHelper(vmManager);
		helper.setClasspath(classpath);
		this.vm = helper.getTargetVM(mainArgs);
	}
	
	/**
	 * Initialize a new VM. The VM is found using Bootstrap.virtualMachineManager(), in tools.jar (Sun's implementation).
	 * 
	 * However if jdi.jar is used (The eclipse implementation) then Bootstrap.virtualMachineManager() returns null.
	 * In this case we need to get our VM elsewhere...
	 * @param mainArgs
	 * @param classpath
	 */
	public void initVM(String mainArgs, String classpath) {
		VirtualMachineManager vmManager = DebugSessionManager.getSunVMM();
		this.initVM(vmManager, mainArgs, classpath);
	}
	
	/**
	 * Initialize a new VM using the given VirtualMachineManager.
	 * 
	 * @param vmManager
	 * @param mainArgs
	 */
	public void initVM(VirtualMachineManager vmManager, String mainArgs) {
		VMLauncherHelper helper = new VMLauncherHelper(vmManager);
		helper.setDefaultClasspath();
		this.vm = helper.getTargetVM(mainArgs);
	}
	
	/**
	 * Initialize a new VM. The VM is found using Bootstrap.virtualMachineManager(), in tools.jar (Sun's implementation).
	 * 
	 * However if jdi.jar is used (The eclipse implementation) then Bootstrap.virtualMachineManager() returns null.
	 * In this case we need to get our VM elsewhere...
	 * @param mainArgs
	 * @param classpath
	 */
	public void initVM(String mainArgs) {
		VirtualMachineManager vmManager = DebugSessionManager.getSunVMM();
		this.initVM(vmManager, mainArgs);
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
		// vm should not be null
		/*
		EventRequestManager em = vm.eventRequestManager();
		MethodEntryRequest meR = em.createMethodEntryRequest();
		meR.addClassFilter("strjdebugruntime.*");
		meR.enable();
		 */
		int debugTraceMode = 0; // -dbgtrace 
		vm.setDebugTraceMode(debugTraceMode);
		this.eventThread = new EventThread(vm, excludes, eventSpecManager, vmMonitor);
		this.eventThread.setEventRequests(watchFields);
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
			System.out.println("no process with vm");
		}
	}



	public void runVM() {
		System.out.println("runVM start");
        vm.resume();

        // Shutdown begins when event thread terminates
        try {
            //eventThread.join();
            errThread.join(); // Make sure output is forwarded
            outThread.join(); // before we exit
            errThread.closeStream();
            outThread.closeStream();
        } catch (InterruptedException exc) {
            // we don't interrupt
        }
        System.out.println("runVM end");
	}
	
	/**
	 * Resume the Stratego VM.
	 */
	public void resumeVM()
	{
		if (this.eventThread.getVMDied())
		{
			// cannot resume a VM that has died
			System.out.println("Cannot resume a VM that has died...");
		}
		else
		{
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
		// stop at the first possible s-enter/r-enter event
		// if the current statement is not a call to another method, we can only step over
	}
	
	public void stepOver()
	{
		// get the thread that is suspended, stratego programs are single threaded, so we always know which thread we need.
		// just save the step info in the EventSpecManager, if stratego becomes multi-threaded, step info needs to be saved per Thread
		ThreadEventHandler handler = this.eventThread.getMainThreadHandler();
		this.eventSpecManager.setStepOver(handler.getStrategoState());
		// stop at the next s-step that is in the same stackframe as the current one
		// if the current StackFrame exists (s-exit or r-exit) continue at the returning stackframe
		this.resumeVM();
	}
	
	public void stepReturn()
	{
		
	}
	
	/**
	 * Terminate the Stratego VM.
	 */
	public void terminateVM()
	{
		// TODO: Implement
	}
	
	public EventSpecManager getEventSpecManager()
	{
		return this.eventSpecManager;
	}

	public void setStepExit() {
		// TODO Auto-generated method stub
		
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

}
