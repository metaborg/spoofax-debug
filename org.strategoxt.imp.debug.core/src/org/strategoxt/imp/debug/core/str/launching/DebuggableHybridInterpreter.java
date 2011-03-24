package org.strategoxt.imp.debug.core.str.launching;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.core.ILaunchManager;
import org.spoofax.interpreter.core.InterpreterErrorExit;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.core.InterpreterExit;
import org.spoofax.interpreter.core.UndefinedStrategyException;
import org.spoofax.interpreter.terms.ITermFactory;
import org.strategoxt.HybridInterpreter;
import org.strategoxt.IncompatibleJarException;
import org.strategoxt.NoInteropRegistererJarException;
import org.strategoxt.lang.MissingStrategyException;
import org.strategoxt.lang.StrategoErrorExit;
import org.strategoxt.lang.StrategoException;
import org.strategoxt.lang.StrategoExit;

/**
 * 
 * This DebuggableHybridInterpreter extends the HybridInterpreter so that it can provide debugging support.
 * It will execute the stratego code in a separate JVM.
 * 
 * @author rlindeman
 *
 */
public class DebuggableHybridInterpreter extends HybridInterpreter {

	public DebuggableHybridInterpreter(ITermFactory termFactory) {
		super(termFactory);
	}

	
	/**
	 * Creates an interpreter that bases its definition scope on an existing instance.
	 * 
	 * TODO: For now just ignore this because the HybridInterpreter will be instantiated in another VM.
	 * 
	 * 
	 * @param interpreter		The interpreter to base this instance on.
	 * 
	 * @param reuseRegistries	The names of operator registries that should not be re-created,
	 *                       	but can be reused from the old instance.
	 */
	public DebuggableHybridInterpreter(HybridInterpreter interpreter, String... reuseRegistries) {
		
		super(interpreter, reuseRegistries);
	}
	
	private List<URL> loadJars = new ArrayList<URL>();
	
	@Override
	public void loadJars(ClassLoader parentClassLoader, URL... jars)
	throws SecurityException, NoInteropRegistererJarException, IncompatibleJarException, IOException {

		// save the locations of the jar, so we can load the in the other VM
		for(URL jarURL : jars)
		{
			loadJars.add(jarURL);
		}

		super.loadJars(parentClassLoader, jars);
	}
	
	private List<String> getLoadJarsAsList()
	{
		List<String> list = new ArrayList<String>();
		for(URL jarURL : this.loadJars)
		{
			list.add(jarURL.getPath());
		}
		return list;
	}
	
	/**
	 * Invokes a compiled or interpreted strategy bound to this instance.
	 * 
	 * Wraps any StrategoException into checked InterpreterException exceptions.
	 */
	@Override
	public boolean invoke(String name)
			throws InterpreterErrorExit, InterpreterExit, UndefinedStrategyException, InterpreterException {
		
		try {
			// launch a JVM
			// http://www.eclipse.org/articles/Article-Java-launch/launching-java.html
			
			// find HybridInterpreter launch config
			ILaunchConfigurationWorkingCopy configWC = LaunchUtils.createHybridInterpreterLaunchConfigurationWorkingCopy();
			if (configWC == null)
			{
				System.err.println("No config working copy!");
			}
			// set the required attributes
			
			// strategy name
			// IStrategoConstants.ATTR_STRATEGO_STRATEGY_NAME
			configWC.setAttribute(IStrategoConstants.ATTR_STRATEGO_STRATEGY_NAME, name);
			
			// required jars
			// IStrategoConstants.ATTR_STRATEGO_REQUIRED_JARS
			configWC.setAttribute(IStrategoConstants.ATTR_STRATEGO_REQUIRED_JARS, getLoadJarsAsList());
			
			// also set the path to the project, breakpoints 
			// IStrategoConstants.ATTR_STRATEGO_PROGRAM
			// TODO: set the project path, so we can filter breakpoints limited to this project
			configWC.setAttribute(IStrategoConstants.ATTR_STRATEGO_PROGRAM, (String) null);
			//org.example.lang1
			// classpath
			// IStrategoConstants.ATTR_STRATEGO_CLASSPATH
			
			
			// and launch
			try {
				ILaunchConfiguration config = configWC.doSave();
				config.launch(ILaunchManager.DEBUG_MODE, null);
			} catch (CoreException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// TODO: wait for launch to finish
			boolean result = super.invoke(name);
			return result;
		} catch (StrategoErrorExit e) {
			throw new InterpreterErrorExit(e.getMessage(), e.getTerm(), e);
        } catch (StrategoExit e) {
            throw new InterpreterExit(e.getValue(), e);
        } catch (MissingStrategyException e) {
        	throw new UndefinedStrategyException(e);
        } catch (StrategoException e) {
            throw new InterpreterException(e);
        }
		//return false;
	}
}
