/*******************************************************************************
 * Copyright (c) 2000, 2009 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.jdt.debug.tests;

import java.io.File;

import junit.framework.TestCase;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IBreakpointManager;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.debug.core.model.ILineBreakpoint;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.debug.core.IJavaDebugTarget;
import org.eclipse.jdt.debug.core.IJavaStackFrame;
import org.eclipse.jdt.debug.core.IJavaThread;
import org.eclipse.jdt.debug.eval.EvaluationManager;
import org.eclipse.jdt.debug.eval.IAstEvaluationEngine;
import org.eclipse.jdt.debug.eval.IEvaluationListener;
import org.eclipse.jdt.debug.eval.IEvaluationResult;
import org.eclipse.jdt.debug.testplugin.DebugElementKindEventDetailWaiter;
import org.eclipse.jdt.debug.testplugin.DebugElementKindEventWaiter;
import org.eclipse.jdt.debug.testplugin.DebugEventWaiter;
import org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget;

/**
 * Tests for launch configurations
 */
@SuppressWarnings({})
public abstract class AbstractDebugTest extends TestCase implements  IEvaluationListener {
	
	/**
	 * the default timeout
	 */
	public static final int DEFAULT_TIMEOUT = 30000;
	
	//constants
	protected static final String JAVA = "java"; //$NON-NLS-1$
	protected static final String JAVA_EXTENSION = ".java"; //$NON-NLS-1$
	protected static final String LAUNCHCONFIGURATIONS = "launchConfigurations"; //$NON-NLS-1$
	protected static final String LAUNCH_EXTENSION = ".launch"; //$NON-NLS-1$
	protected static final String LOCAL_JAVA_APPLICATION_TYPE_ID = "org.eclipse.jdt.launching.localJavaApplication"; //$NON-NLS-1$
	protected static final String JAVA_LAUNCH_SHORTCUT_ID = "org.eclipse.jdt.debug.ui.localJavaShortcut"; //$NON-NLS-1$
	protected static final String TEST_LAUNCH_SHORTCUT = "org.eclipse.jdt.debug.tests.testShortCut";
	
	/**
	 * an evaluation result
	 */
	public IEvaluationResult fEvaluationResult;
	
	/**
	 * the java project
	 */
	public static IJavaProject fJavaProject;
	
	/**
	 * The last relevant event set - for example, that caused
	 * a thread to suspend
	 */
	protected DebugEvent[] fEventSet;
	
	private boolean ignoreErrors = false;
	
	/**
	 * Constructor
	 * @param name
	 */
	public AbstractDebugTest(String name) {
		super(name);
		// set error dialog to non-blocking to avoid hanging the UI during test
		if (ignoreErrors)
		{
			//ErrorDialog.AUTOMATED_MODE = true;
			//SafeRunnable.setIgnoreErrors(true);
		}
	}
	
	
	protected void setUp() throws Exception {
		super.setUp();
		// RL: skip ProjectCreationDecorator tests..
		/*
		if (!ProjectCreationDecorator.isReady()) {
			new TestSuite(ProjectCreationDecorator.class).run(new TestResult());
		}*/
	}

	/**
	 * Sets the last relevant event set
	 *
	 * @param set event set
	 */
	protected void setEventSet(DebugEvent[] set) {
		fEventSet = set;
	}
	
	/**
	 * Returns the last relevant event set
	 * 
	 * @return event set
	 */
	protected DebugEvent[] getEventSet() {
		return fEventSet;
	}
	
	/**
	 * Returns the launch manager
	 * 
	 * @return launch manager
	 */
	protected ILaunchManager getLaunchManager() {
		return DebugPlugin.getDefault().getLaunchManager();
	}
	

	
	/**
	 * Returns the breakpoint manager
	 * 
	 * @return breakpoint manager
	 */
	protected IBreakpointManager getBreakpointManager() {
		return DebugPlugin.getDefault().getBreakpointManager();
	}	
	
	/**
	 * Returns the 'DebugTests' project.
	 * 
	 * @return the test project
	 */
	protected IJavaProject getJavaProject() {
		return getJavaProject("DebugTests");
	}
	
	protected IJavaProject get15Project() {
		return getJavaProject("OneFive");
	}
	
	/**
	 * Returns the Java project with the given name.
	 * 
	 * @param name project name
	 * @return the Java project with the given name
	 */
	protected IJavaProject getJavaProject(String name) {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(name);
		return JavaCore.create(project);
	}
	
	
	/**
	 * Launches the given configuration and waits for an event. Returns the
	 * source of the event. If the event is not received, the launch is
	 * terminated and an exception is thrown.
	 * 
	 * @param configuration the configuration to launch
	 * @param waiter the event waiter to use
	 * @return Object the source of the event
	 * @exception Exception if the event is never received.
	 */
	protected Object launchAndWait(ILaunchConfiguration configuration, DebugEventWaiter waiter) throws CoreException {
	    return launchAndWait(configuration, waiter, true);
	}
	
	/**
	 * Launches the given configuration in debug mode and waits for an event. 
	 * Returns the source of the event. If the event is not received, the 
	 * launch is terminated and an exception is thrown.
	 * 
	 * @param configuration the configuration to launch
	 * @param waiter the event waiter to use
	 * @param register whether to register the launch
	 * @return Object the source of the event
	 * @exception Exception if the event is never received.
	 */
	protected Object launchAndWait(ILaunchConfiguration configuration, DebugEventWaiter waiter, boolean register) throws CoreException {
		return launchAndWait(configuration, ILaunchManager.DEBUG_MODE, waiter, register);
	}
	
	/**
	 * Launches the given configuration and waits for an event. Returns the
	 * source of the event. If the event is not received, the launch is
	 * terminated and an exception is thrown.
	 * 
	 * @param configuration the configuration to launch
	 * @param mode the mode to launch the configuration in
	 * @param waiter the event waiter to use
	 * @param register whether to register the launch
	 * @return Object the source of the event
	 * @exception Exception if the event is never received.
	 */
	protected Object launchAndWait(ILaunchConfiguration configuration, String mode, DebugEventWaiter waiter, boolean register) throws CoreException {
		ILaunch launch = configuration.launch(mode, null, false, register);
		Object suspendee= waiter.waitForEvent();
		if (suspendee == null) {
			StringBuffer buf = new StringBuffer();
            buf.append("Test case: "); //$NON-NLS-1$
            buf.append(getName());
            buf.append("\n"); //$NON-NLS-1$
            buf.append("Never received event: "); //$NON-NLS-1$
            buf.append(waiter.getEventKindName());
            buf.append("\n"); //$NON-NLS-1$
            if (launch.isTerminated()) {
            	buf.append("Process exit value: "); //$NON-NLS-1$
            	buf.append(launch.getProcesses()[0].getExitValue());
                buf.append("\n"); //$NON-NLS-1$
            }
            /*
            IConsole console = DebugUITools.getConsole(launch.getProcesses()[0]);
            if (console instanceof TextConsole) {
                TextConsole textConsole = (TextConsole)console;
                String string = textConsole.getDocument().get();
                buf.append("Console output follows:\n"); //$NON-NLS-1$
                buf.append(string);
            }*/
            buf.append("\n"); //$NON-NLS-1$
            DebugPlugin.log(new Status(IStatus.ERROR, "org.eclipse.jdt.debug.ui.tests", buf.toString())); //$NON-NLS-1$
			try {
				launch.terminate();
			} catch (CoreException e) {
				e.printStackTrace();
				fail("Program did not suspend, and unable to terminate launch."); //$NON-NLS-1$
			}
			throw new TestAgainException();
		}
		setEventSet(waiter.getEventSet());
		assertNotNull("Program did not suspend, launch terminated.", suspendee); //$NON-NLS-1$
		return suspendee;		
	}
	

	/**
	 * Launches the given configuration in debug mode, and waits for a breakpoint-caused 
	 * suspend event in that program. Returns the thread in which the suspend
	 * event occurred.
	 * 
	 * @param config the configuration to launch
	 * @return thread in which the first suspend event occurred
	 */	
	protected StrategoDebugTarget launchToBreakpoint(ILaunchConfiguration config) throws CoreException {
	    return launchToBreakpoint(config, true);
	}
	
	/**
	 * Launches the given configuration in debug mode, and waits for a breakpoint-caused 
	 * suspend event in that program. Returns the thread in which the suspend
	 * event occurred.
	 * 
	 * @param config the configuration to launch
	 * @param whether to register the launch
	 * @return thread in which the first suspend event occurred
	 */	
	protected StrategoDebugTarget launchToBreakpoint(ILaunchConfiguration config, boolean register) throws CoreException {
		//Class clazz = org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget.class;
		// was IJavaThread.class
		//DebugEventWaiter waiter= new DebugElementKindEventDetailWaiter(DebugEvent.SUSPEND, clazz, DebugEvent.BREAKPOINT);
		DebugEventWaiter waiter = new DebugEventWaiter(new int[] { DebugEvent.CREATE, DebugEvent.SUSPEND });
		waiter.setTimeout(DEFAULT_TIMEOUT);

		Object suspendee= launchAndWait(config, waiter, register);
		//assertTrue("suspendee was not an IJavaThread", suspendee instanceof IJavaThread); //$NON-NLS-1$
		assertTrue("suspendee was not an StrategoDebugTarget", suspendee instanceof StrategoDebugTarget); //$NON-NLS-1$
		return (StrategoDebugTarget)suspendee;		
	}	
	
	/**
	 * Launches the given configuration in debug mode, and waits for a terminate
	 * event in that program. Returns the debug target in which the terminate
	 * event occurred.
	 * 
	 * @param config the configuration to launch
	 * @param timeout the number of milliseconds to wait for a terminate event
	 * @return thread in which the first suspend event occurred
	 */	
	protected IJavaDebugTarget launchAndTerminate(ILaunchConfiguration config, int timeout) throws Exception {
		return launchAndTerminate(config, timeout, true);	
	}
	
	/**
	 * Launches the given configuration in debug mode, and waits for a terminate
	 * event in that program. Returns the debug target in which the terminate
	 * event occurred.
	 * 
	 * @param config the configuration to launch
	 * @param timeout the number of milliseconds to wait for a terminate event
	 * @param register whether to register the launch
	 * @return thread in which the first suspend event occurred
	 */	
	protected IJavaDebugTarget launchAndTerminate(ILaunchConfiguration config, int timeout, boolean register) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventWaiter(DebugEvent.TERMINATE, IJavaDebugTarget.class);
		waiter.setTimeout(timeout);

		Object terminatee = launchAndWait(config, waiter, register);		
		assertNotNull("Program did not terminate.", terminatee); //$NON-NLS-1$
		assertTrue("terminatee is not an IJavaDebugTarget", terminatee instanceof IJavaDebugTarget); //$NON-NLS-1$
		IJavaDebugTarget debugTarget = (IJavaDebugTarget) terminatee;
		assertTrue("debug target is not terminated", debugTarget.isTerminated() || debugTarget.isDisconnected()); //$NON-NLS-1$
		return debugTarget;		
	}	

	/**
	 * Launches the given configuration in debug mode, and waits for a line breakpoint 
	 * suspend event in that program. Returns the thread in which the suspend
	 * event occurred.
	 * 
	 * @param config the configuration to launch
	 * @param bp the breakpoint that should cause a suspend event
	 * @return thread in which the first suspend event occurred
	 */	
	protected IJavaThread launchToLineBreakpoint(ILaunchConfiguration config, ILineBreakpoint bp, boolean register) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventDetailWaiter(DebugEvent.SUSPEND, IJavaThread.class, DebugEvent.BREAKPOINT);
		waiter.setTimeout(DEFAULT_TIMEOUT);

		Object suspendee= launchAndWait(config, waiter, register);
		assertTrue("suspendee was not an IJavaThread", suspendee instanceof IJavaThread); //$NON-NLS-1$
		IJavaThread thread = (IJavaThread) suspendee;
		IBreakpoint hit = getBreakpoint(thread);
		assertNotNull("suspended, but not by breakpoint", hit); //$NON-NLS-1$
		assertTrue("hit un-registered breakpoint", bp.equals(hit)); //$NON-NLS-1$
		assertTrue("suspended, but not by line breakpoint", hit instanceof ILineBreakpoint); //$NON-NLS-1$
		ILineBreakpoint breakpoint= (ILineBreakpoint) hit;
		int lineNumber = breakpoint.getLineNumber();
		int stackLine = thread.getTopStackFrame().getLineNumber();
		assertTrue("line numbers of breakpoint and stack frame do not match", lineNumber == stackLine); //$NON-NLS-1$
		
		return thread;		
	}
	
	

	/**
	 * Resumes the given thread, and waits for another breakpoint-caused suspend event.
	 * Returns the thread in which the suspend event occurs.
	 * 
	 * @param thread thread to resume
	 * @return thread in which the first suspend event occurs
	 */
	protected IJavaThread resume(IJavaThread thread) throws Exception {
	    return resume(thread, DEFAULT_TIMEOUT);
	}	
	
	/**
	 * Resumes the given thread, and waits for another breakpoint-caused suspend event.
	 * Returns the thread in which the suspend event occurs.
	 * 
	 * @param thread thread to resume
	 * @param timeout timeout in milliseconds
	 * @return thread in which the first suspend event occurs
	 */
	protected IJavaThread resume(IJavaThread thread, int timeout) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventDetailWaiter(DebugEvent.SUSPEND, IJavaThread.class, DebugEvent.BREAKPOINT);
		waiter.setTimeout(timeout);
		
		thread.resume();

		Object suspendee= waiter.waitForEvent();
		setEventSet(waiter.getEventSet());
		assertNotNull("Program did not suspend.", suspendee); //$NON-NLS-1$
		return (IJavaThread)suspendee;
	}	
	
	/**
	 * Resumes the given thread, and waits for a suspend event caused by the specified
	 * line breakpoint.  Returns the thread in which the suspend event occurs.
	 * 
	 * @param thread thread to resume
	 * @return thread in which the first suspend event occurs
	 */
	protected IJavaThread resumeToLineBreakpoint(IJavaThread resumeThread, ILineBreakpoint bp) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventDetailWaiter(DebugEvent.SUSPEND, IJavaThread.class, DebugEvent.BREAKPOINT);
		waiter.setTimeout(DEFAULT_TIMEOUT);
		
		resumeThread.resume();

		Object suspendee= waiter.waitForEvent();
		setEventSet(waiter.getEventSet());
		assertNotNull("Program did not suspend.", suspendee); //$NON-NLS-1$
		assertTrue("suspendee was not an IJavaThread", suspendee instanceof IJavaThread); //$NON-NLS-1$
		IJavaThread thread = (IJavaThread) suspendee;
		IBreakpoint hit = getBreakpoint(thread);
		assertNotNull("suspended, but not by breakpoint", hit); //$NON-NLS-1$
		assertTrue("hit un-registered breakpoint", bp.equals(hit)); //$NON-NLS-1$
		assertTrue("suspended, but not by line breakpoint", hit instanceof ILineBreakpoint); //$NON-NLS-1$
		ILineBreakpoint breakpoint= (ILineBreakpoint) hit;
		int lineNumber = breakpoint.getLineNumber();
		int stackLine = thread.getTopStackFrame().getLineNumber();
		assertTrue("line numbers of breakpoint and stack frame do not match", lineNumber == stackLine); //$NON-NLS-1$
		
		return (IJavaThread)suspendee;
	}	
	
	/**
	 * Resumes the given thread, and waits for the debug target
	 * to terminate (i.e. finish/exit the program).
	 * 
	 * @param thread thread to resume
	 */
	protected void exit(IJavaThread thread) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventWaiter(DebugEvent.TERMINATE, IProcess.class);
		waiter.setTimeout(DEFAULT_TIMEOUT);
		
		thread.resume();

		Object suspendee= waiter.waitForEvent();
		setEventSet(waiter.getEventSet());
		assertNotNull("Program did not terminate.", suspendee); //$NON-NLS-1$
	}	
		


	/**
	 * Returns the Java model type from the test project with the given name or <code>null</code>
	 * if none.
	 * 
	 * @param typeName
	 * @return type or <code>null</code>
	 * @throws Exception
	 */
	protected IType getType(String typeName) throws Exception {
		return getJavaProject().findType(typeName);
	}
	
	



	
	
	/**
	 * Deletes all existing breakpoints
	 */
	protected void removeAllBreakpoints() {
		IBreakpoint[] bps = getBreakpointManager().getBreakpoints();
		try {
			getBreakpointManager().removeBreakpoints(bps, true);
		} catch (CoreException e) {
		}
	}
	
	/**
	 * Returns the first breakpoint the given thread is suspended
	 * at, or <code>null</code> if none.
	 * 
	 * @return the first breakpoint the given thread is suspended
	 * at, or <code>null</code> if none
	 */
	protected IBreakpoint getBreakpoint(IThread thread) {
		IBreakpoint[] bps = thread.getBreakpoints();
		if (bps.length > 0) {
			return bps[0];
		}
		return null;
	}
	
	/**
	 * Evaluates the given snippet in the context of the given stack frame and returns
	 * the result.
	 * 
	 * @param snippet code snippet
	 * @param frame stack frame context
	 * @return evaluation result
	 */
	protected IEvaluationResult evaluate(String snippet, IJavaStackFrame frame) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventWaiter(DebugEvent.SUSPEND, IJavaThread.class);
		waiter.setTimeout(DEFAULT_TIMEOUT);
		
		IAstEvaluationEngine engine = EvaluationManager.newAstEvaluationEngine(getJavaProject(), (IJavaDebugTarget)frame.getDebugTarget());
		engine.evaluate(snippet, frame, this, DebugEvent.EVALUATION, true);

		Object suspendee= waiter.waitForEvent();
		setEventSet(waiter.getEventSet());
		assertNotNull("Program did not suspend.", suspendee); //$NON-NLS-1$
		engine.dispose();
		return fEvaluationResult;
	}		
	
	/**
	 * @see IEvaluationListener#evaluationComplete(IEvaluationResult)
	 */
	public void evaluationComplete(IEvaluationResult result) {
		fEvaluationResult = result;
	}
	
	/**
	 * Performs a step over in the given stack frame and returns when complete.
	 * 
	 * @param frame stack frame to step in
	 */
	protected IJavaThread stepOver(IJavaStackFrame frame) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventDetailWaiter(DebugEvent.SUSPEND, IJavaThread.class, DebugEvent.STEP_END);
		waiter.setTimeout(DEFAULT_TIMEOUT);
		
		frame.stepOver();
		
		Object suspendee= waiter.waitForEvent();
		setEventSet(waiter.getEventSet());
		assertNotNull("Program did not suspend.", suspendee); //$NON-NLS-1$
		return (IJavaThread) suspendee;
	}
	
	/**
	 * Performs a step over in the given stack frame and returns when a breakpoint is hit.
	 * 
	 * @param frame stack frame to step in
	 */
	protected IJavaThread stepOverToBreakpoint(IJavaStackFrame frame) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventDetailWaiter(DebugEvent.SUSPEND, IJavaThread.class, DebugEvent.BREAKPOINT);
		waiter.setTimeout(DEFAULT_TIMEOUT);
		
		frame.stepOver();
		
		Object suspendee= waiter.waitForEvent();
		setEventSet(waiter.getEventSet());
		assertNotNull("Program did not suspend.", suspendee); //$NON-NLS-1$
		return (IJavaThread) suspendee;
	}	

	/**
	 * Performs a step into in the given stack frame and returns when complete.
	 * 
	 * @param frame stack frame to step in
	 */
	protected IJavaThread stepInto(IJavaStackFrame frame) throws Exception {
		DebugEventWaiter waiter= new DebugElementKindEventDetailWaiter(DebugEvent.SUSPEND, IJavaThread.class, DebugEvent.STEP_END);
		waiter.setTimeout(DEFAULT_TIMEOUT);
		
		frame.stepInto();
		
		Object suspendee= waiter.waitForEvent();
		setEventSet(waiter.getEventSet());
		assertNotNull("Program did not suspend.", suspendee); //$NON-NLS-1$
		return (IJavaThread) suspendee;		
	}
	

	
	
    /**
     * Wait for builds to complete
     */
    public static void waitForBuild() {
        boolean wasInterrupted = false;
        do {
            try {
                Job.getJobManager().join(ResourcesPlugin.FAMILY_AUTO_BUILD, null);
                Job.getJobManager().join(ResourcesPlugin.FAMILY_MANUAL_BUILD, null);
                wasInterrupted = false;
            } catch (OperationCanceledException e) {
                e.printStackTrace();
            } catch (InterruptedException e) {
                wasInterrupted = true;
            }
        } while (wasInterrupted);
    }	
    
	/**
	 * Returns if the local filesystem is case-sensitive or not
	 * @return true if the local filesystem is case-sensitive, false otherwise
	 */
	protected boolean isFileSystemCaseSensitive() {
		return Platform.OS_MACOSX.equals(Platform.getOS()) ? false : new File("a").compareTo(new File("A")) != 0; //$NON-NLS-1$ //$NON-NLS-2$
	}
	


	/**
	 * Returns the version level of the class files being run, based on the system property <code>java.class.version</code>
	 * @return the version level of the class files being run in the current VM
	 *  
	 *  @since 3.6
	 */
	protected String getClassFileVersion() {
		String version = System.getProperty("java.class.version");
		if(version.compareTo("48.0") <= 0) {
			return JavaCore.VERSION_1_4;
		}
		if(version.compareTo("49.0") <= 0) {
			return JavaCore.VERSION_1_5;
		}
		return JavaCore.VERSION_1_6;
	}
	

	
}

