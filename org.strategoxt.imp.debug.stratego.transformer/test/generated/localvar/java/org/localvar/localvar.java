package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class localvar  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constLocationInfo9;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm constLocationInfo8;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constLocationInfo7;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constLocationInfo6;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm constLocationInfo5;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm constLocationInfo4;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm constLocationInfo3;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm constLocationInfo2;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constLocationInfo1;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm const5;

  protected static IStrategoTerm constLocationInfo0;

  protected static IStrategoTerm const4;

  protected static IStrategoTerm const3;

  protected static IStrategoTerm const2;

  protected static IStrategoTerm const1;

  protected static IStrategoTerm const0;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consLocationInfo_4;

  public static IStrategoConstructor _consProgram_2;

  public static IStrategoConstructor _consComment_2;

  public static IStrategoConstructor _consFunction_2;

  public static Context init(Context context)
  { 
    synchronized(localvar.class)
    { 
      if(isIniting)
        return null;
      try
      { 
        isIniting = true;
        ITermFactory termFactory = context.getFactory();
        if(constantFactory == null)
        { 
          initConstructors(termFactory);
          initConstants(termFactory);
        }
        if(initedContext == null || initedContext.get() != context)
        { 
          org.strategoxt.stratego_lib.Main.init(context);
          org.strategoxt.libstrategodebuglib.Main.init(context);
          context.registerComponent("localvar");
        }
        initedContext = new WeakReference<Context>(context);
        constantFactory = termFactory;
      }
      finally
      { 
        isIniting = false;
      }
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
        result = context.invokeStrategyCLI(main_0_0.instance, "localvar", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("localvar" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
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
      return context.invokeStrategyCLI(main_0_0.instance, "localvar", args);
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
    _consLocationInfo_4 = termFactory.makeConstructor("LocationInfo", 4);
    _consProgram_2 = termFactory.makeConstructor("Program", 2);
    _consComment_2 = termFactory.makeConstructor("Comment", 2);
    _consFunction_2 = termFactory.makeConstructor("Function", 2);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    const0 = termFactory.makeString("main");
    const1 = termFactory.makeString("31");
    const2 = termFactory.makeString("3");
    const3 = termFactory.makeString("32");
    const4 = termFactory.makeString("21");
    constLocationInfo0 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const1, localvar.const2, localvar.const3, localvar.const4});
    const5 = termFactory.makeString("execute");
    const6 = termFactory.makeString("37");
    const7 = termFactory.makeString("40");
    const8 = termFactory.makeString("38");
    constLocationInfo1 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const6, localvar.const2, localvar.const7, localvar.const8});
    const9 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'execute'");
    const10 = termFactory.makeString("match-comments");
    const11 = termFactory.makeString("43");
    const12 = termFactory.makeString("2");
    const13 = termFactory.makeString("49");
    constLocationInfo2 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const11, localvar.const12, localvar.const13, localvar.const6});
    const14 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-comments'");
    const15 = termFactory.makeString("find-functions");
    const16 = termFactory.makeString("52");
    const17 = termFactory.makeString("55");
    const18 = termFactory.makeString("54");
    constLocationInfo3 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const16, localvar.const12, localvar.const17, localvar.const18});
    const19 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-functions'");
    const20 = termFactory.makeString("find-comments");
    const21 = termFactory.makeString("57");
    const22 = termFactory.makeString("60");
    constLocationInfo4 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const21, localvar.const12, localvar.const22, localvar.const16});
    const23 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comments'");
    const24 = termFactory.makeString("match-f-and-c");
    const25 = termFactory.makeString("62");
    const26 = termFactory.makeString("65");
    constLocationInfo5 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const25, localvar.const12, localvar.const26, localvar.const13});
    const27 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-f-and-c'");
    const28 = termFactory.makeString("find-comment-match");
    const29 = termFactory.makeString("67");
    const30 = termFactory.makeString("72");
    constLocationInfo6 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const29, localvar.const12, localvar.const30, localvar.const11});
    const31 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comment-match'");
    const32 = termFactory.makeString("get-function-name");
    const33 = termFactory.makeString("74");
    const34 = termFactory.makeString("75");
    const35 = termFactory.makeString("28");
    constLocationInfo7 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const33, localvar.const12, localvar.const34, localvar.const35});
    const36 = termFactory.makeString("find-comment-by-name");
    const37 = termFactory.makeString("77");
    const38 = termFactory.makeString("81");
    const39 = termFactory.makeString("35");
    constLocationInfo8 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const37, localvar.const12, localvar.const38, localvar.const39});
    const40 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comment-by-name'");
    const41 = termFactory.makeString("first");
    const42 = termFactory.makeString("83");
    const43 = termFactory.makeString("84");
    constLocationInfo9 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const42, localvar.const12, localvar.const43, localvar.const35});
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}