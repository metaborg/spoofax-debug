package org.strategoxt.imp.debug.core.str.launching;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

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
			
			// TODO: find HybridInterpreter launch config
			// set the required attributes
			// and launch
			
			return super.invoke(name);
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
