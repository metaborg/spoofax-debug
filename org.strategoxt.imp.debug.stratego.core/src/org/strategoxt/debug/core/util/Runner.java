package org.strategoxt.debug.core.util;

import org.strategoxt.debug.core.control.DebugSessionManager;


public class Runner {
	// http://java.sys-con.com/node/36221
	
	/*
	public static void main(String[] args) {
		
		String mainArgs = "main.Test_propRunner";
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings("/tmp", "propRunner");
		DebugSessionManager manager = new DebugSessionManager(debugSessionSettings, null);
		manager.initVM(mainArgs);
		System.out.println("init listeners");
		manager.setupEventListeners();
		System.out.println("Redirect");
		manager.redirectOutput();
		System.out.println("RUN");
		manager.runVM();
		System.out.println("Done");
	}
	*/
	
	/**
	 * classPath contains the binary files of the compiled strj program
	 * @param mainArgs
	 * @param classpath
	 */
	public static void run(String projectName, String mainArgs, String classpath)
	{
		DebugSessionSettings debugSessionSettings = new DebugSessionSettings("/tmp", projectName);
		DebugSessionManager manager = new DebugSessionManager(debugSessionSettings, null);
		manager.initVM(manager.getDebugSessionSettings(), mainArgs, classpath);
		manager.setupEventListeners();
		manager.redirectOutput();
		System.out.println("RUN");
		//manager.runVM();		
	}

}
