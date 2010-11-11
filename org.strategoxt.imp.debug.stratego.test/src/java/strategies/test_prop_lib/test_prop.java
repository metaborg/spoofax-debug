package strategies.test_prop_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") public class test_prop  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static Context initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constTrue0;

  protected static IStrategoTerm constFalse0;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  public static IStrategoConstructor _consEq_2;

  public static IStrategoConstructor _consImpl_2;

  public static IStrategoConstructor _consOr_2;

  public static IStrategoConstructor _consAnd_2;

  public static IStrategoConstructor _consNot_1;

  public static IStrategoConstructor _consTrue_0;

  public static IStrategoConstructor _consFalse_0;

  public static Context init(Context context)
  { 
    synchronized(test_prop.class)
    { 
      if(isIniting)
        return null;
      isIniting = true;
      ITermFactory termFactory = context.getFactory();
      if(constantFactory == null)
      { 
        initConstructors(termFactory);
        initConstants(termFactory);
      }
      if(context != initedContext)
      { 
        org.strategoxt.stratego_lib.Main.init(context);
        context.registerComponent("test_prop_lib");
      }
      initedContext = context;
      constantFactory = termFactory;
      isIniting = false;
      return context;
    }
  }

  public static Context init()
  { 
    return init(new Context());
  }

  public static void main(String args[])
  { 
    Context context = init();
    context.setStandAlone(true);
    try
    { 
      IStrategoTerm result;
      try
      { 
        result = context.invokeStrategyCLI(main_0_0.instance, "test_prop", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("test_prop" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
        context.printStackTrace();
        context.setStandAlone(false);
        System.exit(1);
      }
      else
      { 
        System.out.println(result);
        context.setStandAlone(false);
        System.exit(0);
      }
    }
    catch(StrategoExit exit)
    { 
      context.setStandAlone(false);
      System.exit(exit.getValue());
    }
  }

  public static IStrategoTerm mainNoExit(String ... args) throws StrategoExit
  { 
    return mainNoExit(new Context(), args);
  }

  public static IStrategoTerm mainNoExit(Context context, String ... args) throws StrategoExit
  { 
    try
    { 
      init(context);
      return context.invokeStrategyCLI(main_0_0.instance, "test_prop", args);
    }
    finally
    { 
      context.getIOAgent().closeAllFiles();
    }
  }

  public static Strategy getMainStrategy()
  { 
    return main_0_0.instance;
  }

  public static void initConstructors(ITermFactory termFactory)
  { 
    _consConc_2 = termFactory.makeConstructor("Conc", 2);
    _consNone_0 = termFactory.makeConstructor("None", 0);
    _consSome_1 = termFactory.makeConstructor("Some", 1);
    _consEq_2 = termFactory.makeConstructor("Eq", 2);
    _consImpl_2 = termFactory.makeConstructor("Impl", 2);
    _consOr_2 = termFactory.makeConstructor("Or", 2);
    _consAnd_2 = termFactory.makeConstructor("And", 2);
    _consNot_1 = termFactory.makeConstructor("Not", 1);
    _consTrue_0 = termFactory.makeConstructor("True", 0);
    _consFalse_0 = termFactory.makeConstructor("False", 0);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    constFalse0 = termFactory.makeAppl(test_prop._consFalse_0, NO_TERMS);
    constTrue0 = termFactory.makeAppl(test_prop._consTrue_0, NO_TERMS);
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}