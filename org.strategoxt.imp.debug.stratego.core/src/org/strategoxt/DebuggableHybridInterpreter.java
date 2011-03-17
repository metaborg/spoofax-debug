package org.strategoxt;

import org.spoofax.interpreter.core.InterpreterErrorExit;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.core.InterpreterExit;
import org.spoofax.interpreter.core.UndefinedStrategyException;
import org.spoofax.interpreter.terms.ITermFactory;
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
			//if (!loadedJars) init();
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
