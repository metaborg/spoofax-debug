package org.strategoxt.debug.core.util;

import java.util.List;

import org.strategoxt.debug.core.control.events.EventHandler;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_r_enter_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_r_exit_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_s_enter_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_s_exit_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_s_step_0_4;
import org.strategoxt.imp.debug.stratego.runtime.strategies.java_s_var_0_5;

import com.sun.jdi.AbsentInformationException;
import com.sun.jdi.ClassType;
import com.sun.jdi.Location;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.request.BreakpointRequest;
import com.sun.jdi.request.ClassPrepareRequest;
import com.sun.jdi.request.EventRequest;
import com.sun.jdi.request.EventRequestManager;
import com.sun.jdi.request.ExceptionRequest;
import com.sun.jdi.request.MethodEntryRequest;
import com.sun.jdi.request.MethodExitRequest;
import com.sun.jdi.request.ThreadDeathRequest;

public class DebugEventRequestInstaller {

	/**
	 * package name of the runtime library, should match the package in 'strj_dbg_runtime_lib-java.jar'
	 */
	private static final String STRJ_DBG_RUNTIME_LIB_S_ENTER = java_s_enter_0_4.getFullClassName();
	private static final String STRJ_DBG_RUNTIME_LIB_S_EXIT = java_s_exit_0_4.getFullClassName();
	private static final String STRJ_DBG_RUNTIME_LIB_R_ENTER = java_r_enter_0_4.getFullClassName();
	private static final String STRJ_DBG_RUNTIME_LIB_R_EXIT = java_r_exit_0_4.getFullClassName();
	private static final String STRJ_DBG_RUNTIME_LIB_S_STEP = java_s_step_0_4.getFullClassName();
	private static final String STRJ_DBG_RUNTIME_LIB_S_VAR = java_s_var_0_5.getFullClassName();
	
	private static final String EVENT_TYPE = "event-type";
	
	public static final boolean useMethodRequests = false;
	
	public static final boolean useBreakpoints = true;
	
	public static final boolean useExceptionRequests = true;
	
	public static void installDebugEventRequests(VirtualMachine vm, boolean watchFields, String[] excludes)
	{
		EventRequestManager mgr = vm.eventRequestManager();
		
		if (useBreakpoints) {
			// listen to the class prepare requests for all classes in this package
			// the classes are s-enter, r-enter, ....
			// when they are prepared, catch that DebugEvent and create a BreakpointEntryRequest in each class in the invoke method
			// Using MethodEntry events is way too slow because it prevents method-inlining optimizations
			ClassPrepareRequest str_cpr = mgr.createClassPrepareRequest();
			str_cpr.addClassFilter("org.strategoxt.imp.debug.stratego.runtime.strategies.*");
			str_cpr.enable();
		}
		// want all exceptions 
		
		if (useExceptionRequests)
		{
			ExceptionRequest excReq = mgr.createExceptionRequest(null, true, true); // suspend so we can step 
			excReq.setSuspendPolicy(EventRequest.SUSPEND_ALL);
			excReq.enable();
		}

		
		if (useMethodRequests)
		{

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

		}

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
		
		/*
		// exception request
		ReferenceType refType = null; // report all exceptions
		boolean notifyCaught = true;
		boolean notifyUncaught = true;
		ExceptionRequest er = mgr.createExceptionRequest(refType, notifyCaught, notifyUncaught);
		er.enable();
		*/
	}
	
	@SuppressWarnings("unchecked")
	private static Location location(ClassType clazz, int linenumber) {
		Location location = null;
		try {
			List<Location> locs = clazz.locationsOfLine(linenumber);
			if (locs.size() == 0) {
				return null;
			}
			// TODO handle multiple locations
			location = (Location) locs.get(0);
			if (location.method() == null) {
				return null;
			}
		} catch (AbsentInformationException e) {
			/*
			 * TO DO: throw something more specific, or allow AbsentInfo
			 * exception to pass through.
			 */
			return null;
		}
		return location;
	}
	
	@SuppressWarnings("unchecked")
	public static void createBreakpointEntryRequest(EventRequestManager mgr, ClassType clazz, int linenumber, String eventType)
	{
		int suspendPolicy = EventRequest.SUSPEND_EVENT_THREAD;
		Location location = null;
		location = location(clazz, linenumber);
		if (location == null) {
			return;
		}
		List<BreakpointRequest> existing = mgr.breakpointRequests();
		for(BreakpointRequest r : existing)
		{
			if (location.equals(r.location()))
			{
				System.out.println("THE SAME");
			}
		}
		BreakpointRequest bpr = mgr.createBreakpointRequest(location);
		bpr.setSuspendPolicy(suspendPolicy);
		bpr.putProperty(EVENT_TYPE, eventType);
		bpr.enable();
		
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
