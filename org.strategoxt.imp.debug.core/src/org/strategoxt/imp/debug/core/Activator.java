package org.strategoxt.imp.debug.core;

import org.eclipse.core.runtime.Plugin;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.IDebugTarget;
import org.osgi.framework.BundleContext;
import org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget;

/**
 * The activator class controls the plug-in life cycle
 */
public class Activator extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.strategoxt.imp.debug.core";

	// The shared instance
	private static Activator plugin;
	
	/**
	 * The constructor
	 */
	public Activator() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;
	}

	/**
	 * The plugin is shutting down, stop all jobs in each StrategoDebugTarget.
	 * 
	 * Method is inspired by JDIDebugPlugin.stop(BundleContext context)
	 * org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget$EventDispatchJob.
	 * 
	 * 
	 * (non-Javadoc)
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		// TODO: Shutdown jobs from org.strategoxt.imp.debug.core.str.model.StrategoDebugTarget$EventDispatchJob
		try {
			// find all StrategoDebugTarget
			ILaunchManager launchManager= DebugPlugin.getDefault().getLaunchManager();
			IDebugTarget[] targets= launchManager.getDebugTargets();
			for (int i= 0 ; i < targets.length; i++) {
				IDebugTarget target= targets[i];
				if (target instanceof StrategoDebugTarget) {
					((StrategoDebugTarget)target).shutdown();
				}
			}
			
		} finally
		{
			// always stop
			plugin = null;
			super.stop(context);
		}
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
