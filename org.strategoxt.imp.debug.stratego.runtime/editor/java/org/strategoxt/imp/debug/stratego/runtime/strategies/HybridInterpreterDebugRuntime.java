package org.strategoxt.imp.debug.stratego.runtime.strategies;

import org.spoofax.interpreter.core.InterpreterErrorExit;
import org.spoofax.interpreter.core.InterpreterException;
import org.spoofax.interpreter.core.InterpreterExit;
import org.spoofax.interpreter.core.UndefinedStrategyException;
import org.spoofax.interpreter.terms.IStrategoString;
import org.spoofax.interpreter.terms.IStrategoTerm;
import org.spoofax.terms.ParseError;
import org.spoofax.terms.StringTermReader;
import org.strategoxt.HybridInterpreter;

/**
 * Extends the HybridInterpreter in the org.strategoxt.strj plugin.
 * 
 * This class contains several overrides so we can place breakpoints at the appropriate methods without breaking the debugger
 * when the structure of the HybridInterpreter changes.
 * 
 * If the HybridInterpreterDebugRuntime is used in another debuggee JVM we can use the static properties to determine the location of the breakpoints.
 * 
 * @author rlindeman
 *
 */
public class HybridInterpreterDebugRuntime extends HybridInterpreter {
	
	public static int BEFORE_INVOKE = 32;
	public static int AFTER_INVOKE = 33;
	
	@Override
	public boolean invoke(String name) throws InterpreterErrorExit,
			InterpreterExit, UndefinedStrategyException, InterpreterException {
		boolean succeeded = super.invoke(name);
		return succeeded;
	}
	
	public static String SET_CURRENT_TERM = "setCurrentTerm";

	/**
	 * Sets the current Term to the given String-representation of an
	 * IStrategoTerm.
	 * 
	 * The term will be parsed as an IStrategoTerm and then set as current term.
	 * 
	 * The method returns true if the action was successful, else it returns
	 * false.
	 * 
	 * @param term
	 * @return Returns true if setting the current term was successful, else
	 *         returns false.
	 */
	public boolean setCurrentTerm(String term) {
		System.out.println("hi setCurrent begin");
		StringTermReader termReader = new StringTermReader(this.getFactory());
		try {
			IStrategoTerm strategoTerm = termReader.parseFromString(term);
			if (strategoTerm != null) {
				super.setCurrent(strategoTerm);
				return true;
			}
		} catch (ParseError e) {

		}
		return false;
	}

	public static void main(String... args) {
		System.out.println("Main");
		if (args == null || args.length < 1) {
			System.out.println(USAGE);
			System.exit(127);
		}
		HybridInterpreter interpreter = new HybridInterpreterDebugRuntime();
		int i = mainLoadAll(interpreter, args);
		boolean nothingLoaded = i == 0;
		
		String main = args[i++];

		if (nothingLoaded)
			warnUnqualifiedInvoke(interpreter, main);
		
		IStrategoString[] mainArgs = new IStrategoString[args.length - i + 1];
		mainArgs[0] = interpreter.getFactory().makeString(main);
		
		for (int j = 1; j < mainArgs.length; i++, j++) {
			mainArgs[j] = interpreter.getFactory().makeString(args[i]);
		}
		interpreter.setCurrent(interpreter.getFactory().makeList(mainArgs));
		try {
			interpreter.invoke(main);
		} catch (InterpreterExit e) {
			System.exit(e.getValue());
		} catch (UndefinedStrategyException e) {
			System.err.println(e.getMessage());
			System.exit(125);
		} catch (InterpreterException e) {
			e.printStackTrace();
			System.exit(124);
		}
	}
}
