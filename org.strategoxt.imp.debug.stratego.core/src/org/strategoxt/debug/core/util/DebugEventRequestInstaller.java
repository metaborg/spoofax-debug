package org.strategoxt.debug.core.util;

import org.strategoxt.debug.core.control.events.EventHandler;

import com.sun.jdi.VirtualMachine;
import com.sun.jdi.request.ClassPrepareRequest;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.MethodEntryRequest;
import com.sun.jdi.request.MethodExitRequest;
import com.sun.jdi.request.ThreadDeathRequest;

public class DebugEventRequestInstaller {

	/**
	 * package name of the runtime library, should match the package in 'strj_dbg_runtime_lib-java.jar'
	 */
	private static final String STRJ_DBG_RUNTIME_PACKAGE = "strjdbgruntimelib.strategies";
	private static final String STRJ_DBG_RUNTIME_LIB_S_ENTER = STRJ_DBG_RUNTIME_PACKAGE+ ".java_s_enter_0_4";
	private static final String STRJ_DBG_RUNTIME_LIB_S_EXIT = STRJ_DBG_RUNTIME_PACKAGE+ ".java_s_exit_0_4";
	private static final String STRJ_DBG_RUNTIME_LIB_R_ENTER = STRJ_DBG_RUNTIME_PACKAGE+ ".java_r_enter_0_4";
	private static final String STRJ_DBG_RUNTIME_LIB_R_EXIT = STRJ_DBG_RUNTIME_PACKAGE+ ".java_r_exit_0_4";
	private static final String STRJ_DBG_RUNTIME_LIB_S_STEP = STRJ_DBG_RUNTIME_PACKAGE+ ".java_s_step_0_4";
	private static final String STRJ_DBG_RUNTIME_LIB_S_VAR = STRJ_DBG_RUNTIME_PACKAGE+ ".java_s_var_0_5";
	
	private static final String EVENT_TYPE = "event-type";
	
	public static void installDebugEventRequests(VirtualMachine vm, boolean watchFields, String[] excludes)
	{
		EventRequestManager mgr = vm.eventRequestManager();
		
		// want all exceptions 
		/*
		ExceptionRequest excReq = mgr.createExceptionRequest(null, true, true); // suspend so we can step 
		excReq.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		excReq.enable();*/


		createMethodEntryRequest(mgr, STRJ_DBG_RUNTIME_LIB_S_ENTER, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.S_ENTER);
		
		createMethodEntryRequest(mgr, STRJ_DBG_RUNTIME_LIB_S_EXIT, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.S_EXIT);
		
		createMethodEntryRequest(mgr, STRJ_DBG_RUNTIME_LIB_R_ENTER, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.R_ENTER);
		
		createMethodEntryRequest(mgr, STRJ_DBG_RUNTIME_LIB_R_EXIT, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.R_EXIT);
		
		createMethodEntryRequest(mgr, STRJ_DBG_RUNTIME_LIB_S_STEP, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.S_STEP);

		createMethodEntryRequest(mgr, STRJ_DBG_RUNTIME_LIB_S_VAR, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.S_VAR);

		
		createMethodExitRequest(mgr, STRJ_DBG_RUNTIME_LIB_S_ENTER, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.S_ENTER);
		
		createMethodExitRequest(mgr, STRJ_DBG_RUNTIME_LIB_S_EXIT, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.S_EXIT);

		createMethodExitRequest(mgr, STRJ_DBG_RUNTIME_LIB_R_ENTER, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.R_ENTER);

		createMethodExitRequest(mgr, STRJ_DBG_RUNTIME_LIB_R_EXIT, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.R_EXIT);

		createMethodExitRequest(mgr, STRJ_DBG_RUNTIME_LIB_S_STEP, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.S_STEP);
		
		createMethodExitRequest(mgr, STRJ_DBG_RUNTIME_LIB_S_VAR, EventRequest.SUSPEND_EVENT_THREAD, EventHandler.S_VAR);


		
		// thread dies
		ThreadDeathRequest tdr = mgr.createThreadDeathRequest();
		// Make sure we sync on thread death
		tdr.setSuspendPolicy(EventRequest.SUSPEND_ALL);
		tdr.enable();

		if (watchFields) {
			ClassPrepareRequest cpr = mgr.createClassPrepareRequest();
			for (int i = 0; i < excludes.length; ++i) {
				cpr.addClassExclusionFilter(excludes[i]);
			}
			cpr.setSuspendPolicy(EventRequest.SUSPEND_ALL);
			cpr.enable();
		}
	}
	
	/**
	 * Creates a new MethodEntry Request DebugEvnt for the given class.
	 * The eventType should match one of the stratego debug events.
	 * @param classFilter
	 * @param suspendPolicy
	 * @param eventType
	 */
	public static void createMethodEntryRequest(EventRequestManager mgr, String classFilter, int suspendPolicy, String eventType)
	{
		MethodEntryRequest menr = mgr.createMethodEntryRequest();
		menr.addClassFilter(classFilter);
		menr.setSuspendPolicy(suspendPolicy);
		menr.putProperty(EVENT_TYPE, eventType);
		menr.enable();
	}
	
	public static void createMethodExitRequest(EventRequestManager mgr, String classFilter, int suspendPolicy, String eventType)
	{
		MethodExitRequest mexr = mgr.createMethodExitRequest();
		mexr.addClassFilter(classFilter);
		mexr.setSuspendPolicy(suspendPolicy);
		mexr.putProperty(EVENT_TYPE, eventType);
		mexr.enable();
	}
}
