package org.strategoxt.debug.core.util;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.sun.jdi.Bootstrap;
import com.sun.jdi.VirtualMachine;
import com.sun.jdi.VirtualMachineManager;
import com.sun.jdi.connect.AttachingConnector;
import com.sun.jdi.connect.Connector;
import com.sun.jdi.connect.IllegalConnectorArgumentsException;
import com.sun.jdi.connect.LaunchingConnector;
import com.sun.jdi.connect.ListeningConnector;
import com.sun.jdi.connect.VMStartException;

public class VMLauncherHelper {

	//  Do we want to watch assignments to fields
    private boolean watchFields = false;
    
    //public String classpath = "";
    
    /*
    public final String defaultClasspath = "/home/rlindeman/workspace/short-examples/bin" +
    		":/home/rlindeman/workspace/strj-dbg-generated/bin";
	
    public final String defaultJars = DebugSessionSettings.strategoxtjar + ":" + DebugSessionSettings.libstrategodebuglib + ":" + DebugSessionSettings.strjdebugruntime;    
    */
    
	private VirtualMachineManager vmManager = null;
    
	public VMLauncherHelper(VirtualMachineManager vmManager) {
		this.vmManager = vmManager;
	}

	/**
	 * Find a com.sun.jdi.CommandLineLaunch connector.
	 * 
	 * @param vmManager
	 * @return
	 */
	public static LaunchingConnector findCLLaunchingConnector(VirtualMachineManager vmManager) {
		List<Connector> connectors = Bootstrap.virtualMachineManager().allConnectors();
		Iterator<Connector> iter = connectors.iterator();
		while (iter.hasNext()) {
			Connector connector = (Connector) iter.next();
			if (connector.name().equals("com.sun.jdi.CommandLineLaunch")) {
				return (LaunchingConnector) connector;
			}
		}
		throw new Error("No com.sun.jdi.CommandLineLaunch connector");
	}

	/**
	 * Find a com.sun.jdi.SocketAttach connector.
	 * 
	 * @param vmManager
	 * @return
	 */
	public static AttachingConnector findSocketAttachConnector(VirtualMachineManager vmManager)
	{
		List<Connector> connectors = vmManager.allConnectors();
		//List<Connector> connectors = vmManager.attachingConnectors();
		Iterator<Connector> iter = connectors.iterator();
		while (iter.hasNext()) {
			Connector connector = (Connector) iter.next();
			if (connector.name().equals("com.sun.jdi.SocketAttach")) {
				return (AttachingConnector) connector;
			}
		}
		throw new Error("No com.sun.jdi.SocketAttach connector");
	}
	
	public static ListeningConnector findSocketListenConnector(VirtualMachineManager vmManager)
	{
		List<Connector> connectors = vmManager.allConnectors();
		Iterator<Connector> iter = connectors.iterator();
		while(iter.hasNext()) {
			Connector connector = (Connector) iter.next();
			if (connector.name().equals("com.sun.jdi.SocketListen")) {
				return (ListeningConnector) connector;
			}
		}
		throw new Error("No com.sun.jdi.SocketListen connector");
	}
	
	// set arguments for the connector
	/**
	 * Return the launching connector's arguments.
	 */
	private Map<String, ? extends Connector.Argument> connectorArguments(Connector connector, String mainArgs) {
		Map<String, ? extends Connector.Argument> arguments = connector.defaultArguments();
		Connector.Argument mainArg = (Connector.Argument) arguments.get("main");
		if (mainArg == null) {
			throw new Error("Bad launching connector");
		}
		mainArg.setValue(mainArgs);
		
		//System.out.println("CP:" + classpath);
		Connector.Argument opts = (Connector.Argument) arguments.get("options");
		String classpath = this.getDebugProgramClasspath();
		opts.setValue("-classpath " + classpath);
		
		Connector.Argument susp = (Connector.Argument) arguments.get("suspend");
		susp.setValue("true");
		
		if (watchFields) {
			// We need a VM that supports watchpoints
			Connector.Argument optionArg = (Connector.Argument) arguments.get("options");
			if (optionArg == null) {
				throw new Error("Bad launching connector");
			}
			optionArg.setValue("-classic");
		}
		return arguments;
	}
	// attach to target vm (target vm runs the stratego program)
	/**
	 * Launch target VM. Forward target's output and error.
	 */
	private VirtualMachine launchTarget(String mainArgs) {
		LaunchingConnector connector = null;

		connector = VMLauncherHelper.findCLLaunchingConnector(this.vmManager);
		
		Map<String, ? extends Connector.Argument> arguments = connectorArguments(connector, mainArgs);
		try {
			return connector.launch(arguments);
		} catch (IOException exc) {
			throw new Error("Unable to launch target VM: " + exc);
		} catch (IllegalConnectorArgumentsException exc) {
			throw new Error("Internal error: " + exc);
		} catch (VMStartException exc) {
			throw new Error("Target VM failed to initialize: "
					+ exc.getMessage());
		}
	}
	
	public VirtualMachine getTargetVM(String mainArgs)
	{
		return this.launchTarget(mainArgs);
		
	}


	/*
	public void setDefaultClasspath() {
		String cp = this.defaultClasspath + ":" + this.defaultJars;
		this.classpath = cp;
	}
	*/
	
	private List<String> debugJars;
	
	public void setDebugJars(List<String> debugJars)
	{
		this.debugJars = debugJars;
	}


	private String mainClasspath = null;
	
	/**
	 * Set the classpath needed for the main java program (set the debug jars using the setJars() method)
	 * @param cp
	 */
	public void setMainClasspath(String mainClasspath) {
		this.mainClasspath = mainClasspath;
	}
	
	/**
	 * Returns the classpath that contains the main java application plus the additional jars needed for debugging.
	 * @return
	 */
	public String getDebugProgramClasspath()
	{
		String cp = this.mainClasspath; // should not end with a ':'
		for(String path : this.debugJars)
		{
			cp += ":" + path;
		}
		System.out.println("CP: " + cp);
		return cp;
	}
}
