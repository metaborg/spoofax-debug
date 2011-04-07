package org.strategoxt.imp.debug.core.str.launching;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationType;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchListener;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IBreakpoint;
import org.eclipse.jdt.debug.testplugin.DebugEventWaiter;
import org.eclipse.jdt.debug.tests.AbstractDebugTest;
import org.junit.Before;
import org.junit.Test;
import org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget;
import org.strategoxt.imp.debug.core.str.model.StrategoLineBreakpoint;
import org.strategoxt.imp.debug.stratego.runtime.ClasspathHandler;
import org.strategoxt.imp.debug.ui.str.launching.StrategoLaunchShortcut;

public class TestHybridInterpreterLauncher extends AbstractDebugTest implements ILaunchListener {


	private boolean added = false; // true if a launch was added
	private boolean removed = false; // true if a launch was removed
	private boolean terminated = false; // true if a launch was terminated
	
	
	
	public TestHybridInterpreterLauncher(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	@Before
	public void setUp() throws CoreException
	{
		// clear all breakpoints
		if (DebugPlugin.getDefault().getBreakpointManager().hasBreakpoints())
		{
			System.out.println("Remove breakpoints");
			IBreakpoint[] breakpoints = DebugPlugin.getDefault().getBreakpointManager().getBreakpoints();
			DebugPlugin.getDefault().getBreakpointManager().removeBreakpoints(breakpoints, true);
		}
		// remove existing launch configs
		ILaunchManager manager = DebugPlugin.getDefault().getLaunchManager();
		ILaunchConfigurationType type = manager.getLaunchConfigurationType(IStrategoConstants.ID_STRATEGO_DEBUG_MODEL+".launchConfigurationType.hybridinterpreter"); 
		ILaunchConfiguration[] configurations =  manager.getLaunchConfigurations(type);
		for (int i = 0; i < configurations.length; i++) {
			ILaunchConfiguration configuration = configurations[i];
			System.out.println(configuration.getName());
			//if (configuration.getName().equals("TESTSTR")) {
				configuration.delete();
			//	break;
			//}
		}
		
		// check if workspace contains stratego-resources project
		// use the stratego-resources project to test launching stratego programs
		if (getStrategoResourcesProject() == null)
		{
			fail("Project stratego-resources not found in workspace");
		}
	}
	
	/**
	 * Returns a IFile in the stratego-resources project, the path shuld be relative to "stratego-resources".
	 * E.g.: "src-str/test/localvar/localvar.str"
	 * @param strFile
	 * @return
	 */
	private IFile getFile(String path)
	{
		IFile strFile = null;
		IPath path2str = new Path(path);
		
		boolean strFileExists = getStrategoResourcesProject().exists(path2str);
		assertTrue("File was not found", strFileExists);
		strFile = getStrategoResourcesProject().getFile(path2str);
		return strFile;
	}
	


	@Test
	public void testLaunch() throws Exception {
		// /stratego-resources/src-str/test/localvar/localvar.str
		//IFile strFile = getFile("src-str/test/localvar/localvar.str");
		
		/*
		// create breakpoint
		StrategoLineBreakpoint lineBreakpoint = new StrategoLineBreakpoint(strFile, 48); // 1-based linenumber
		DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(
				lineBreakpoint);
		*/
		
		// create the config
		// find HybridInterpreter launch config
		ILaunchConfigurationWorkingCopy configWC = LaunchUtils.createHybridInterpreterLaunchConfigurationWorkingCopy();
		if (configWC == null)
		{
			System.err.println("No config working copy!");
		}
		// set the required attributes
		
		// strategy name
		// IStrategoConstants.ATTR_STRATEGO_STRATEGY_NAME
		String name = "foo";
		configWC.setAttribute(IStrategoConstants.ATTR_STRATEGO_STRATEGY_NAME, name);
		
		// required jars
		// IStrategoConstants.ATTR_STRATEGO_REQUIRED_JARS
		//String strategoXTJar = StrategoFileManager.getStrategoXTJar();
		List<IPath> paths = ClasspathHandler.getClasspathEntries();
		List<String> list = new ArrayList<String>();
		for(IPath p : paths)
		{
			list.add(p.toOSString());
		}
		configWC.setAttribute(IStrategoConstants.ATTR_STRATEGO_REQUIRED_JARS, list);
		
		// classpath
		// IStrategoConstants.ATTR_STRATEGO_CLASSPATH
		
		
		// and save
		ILaunchConfiguration config = null;
		try {
			config = configWC.doSave();
			//config.launch(ILaunchManager.DEBUG_MODE, null);
		} catch (CoreException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		getLaunchManager().addLaunchListener(this); // listen to launch events
		// the testcase will sleep a few seconds and will wake up when a launch event occurred.
		IProgressMonitor monitor = null;
		
		System.out.println("LAUNCH...");
		

		// launch the config ant wait for the suspend event
		ILaunch launch = config.launch(ILaunchManager.DEBUG_MODE, monitor);
		System.out.println("STARTED...");
		synchronized (this) {
			if (!added) {
				try {
					System.out.println("Wait...");
					wait(30000);
				} catch (InterruptedException e) {
				}
			}
		}
		assertTrue("Launch should have been added", added); //$NON-NLS-1$
		
		synchronized (this) {
			for (int i= 0; i < 300; i++) {
				if (launch.isTerminated()) {
					terminated= true;
					break;
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
				}
			}
		}
		assertTrue("Launch should have been terminated", terminated); //$NON-NLS-1$
		
		getLaunchManager().removeLaunch(launch);
		
		synchronized (this) {
			if (!removed) {
				try {
					wait(30000);
				} catch (InterruptedException e) {
				}
			}
		}
		assertTrue("Launch should have been removed", removed);		 //$NON-NLS-1$

	}
	
	//Test
	public void testBreakpoint() throws Exception {
		// /stratego-resources/src-str/test/localvar/localvar.str
		IFile strFile = getFile("src-str/test/localvar/localvar.str");
		
		// create breakpoint
		StrategoLineBreakpoint lineBreakpoint = new StrategoLineBreakpoint(strFile, 48); // 1-based linenumber
		DebugPlugin.getDefault().getBreakpointManager().addBreakpoint(
				lineBreakpoint);
		
		
		// create the config
		ILaunchConfiguration config = StrategoLaunchShortcut.createConfiguration(strFile);
		getLaunchManager().addLaunchListener(this);
		
		System.out.println("LAUNCH TO BREAKPOINT...");
		
		   //String typeName = "Breakpoints"; //$NON-NLS-1$
		   //createLineBreakpoint(52, typeName);
			StrategoDebugTarget thread = null;
	       try {
	    	   boolean register = true;
	    	   //thread = launchToBreakpoint(config, register);
	    	   //Class clazz = org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget.class;
	    	   //DebugEventWaiter waiter= new DebugElementKindEventDetailWaiter(DebugEvent.CREATE, clazz, DebugEvent.BREAKPOINT);
	    	   DebugEventWaiter waiter= new DebugEventWaiter(DebugEvent.CREATE);
	    	   thread = (StrategoDebugTarget) launchAndWait(config, waiter, register);
	           //thread = launchToBreakpoint(typeName, true);
	           assertNotNull("Breakpoint not hit within timeout period", thread); //$NON-NLS-1$
	           //ILaunch launch = thread.getLaunch();
	           //assertFalse("Launch should not be registered", DebugPlugin.getDefault().getLaunchManager().isRegistered(launch)); //$NON-NLS-1$
	       } finally {
	           //terminateAndRemove(thread);
	           removeAllBreakpoints();
	       }
	}
	
	private IProject strategoResourcesProject = null;
	
	private IProject getStrategoResourcesProject()
	{
		if (strategoResourcesProject == null)
		{
			IWorkspace workspace = ResourcesPlugin.getWorkspace();
			// check if workspace contains stratego-resources project
			IProject[] projects = workspace.getRoot().getProjects();
			for(IProject project : projects)
			{
				if ("stratego-resources".equals(project.getName()))
				{
					strategoResourcesProject = project;
				}
			}
		}
		return strategoResourcesProject;
	}
	
	/**
	 * @see org.eclipse.debug.core.ILaunchListener#launchRemoved(org.eclipse.debug.core.ILaunch)
	 */
	public synchronized void launchRemoved(ILaunch launch) {
		removed = true;
		notifyAll();
	}

	/**
	 * @see org.eclipse.debug.core.ILaunchListener#launchAdded(org.eclipse.debug.core.ILaunch)
	 */
	public synchronized void launchAdded(ILaunch launch) {
		added = true;
		notifyAll();
	}
	
	/**
	 * @see org.eclipse.debug.core.ILaunchListener#launchChanged(org.eclipse.debug.core.ILaunch)
	 */
	public synchronized void launchChanged(ILaunch launch) {}
}
