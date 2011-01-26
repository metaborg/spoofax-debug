package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class testimports  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constLocationInfo73;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm constLocationInfo72;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constLocationInfo71;

  protected static IStrategoTerm constLocationInfo70;

  protected static IStrategoTerm constLocationInfo69;

  protected static IStrategoTerm constLocationInfo68;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constLocationInfo67;

  protected static IStrategoTerm constLocationInfo66;

  protected static IStrategoTerm constLocationInfo65;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constLocationInfo64;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constLocationInfo63;

  protected static IStrategoTerm constLocationInfo62;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constLocationInfo61;

  protected static IStrategoTerm constLocationInfo60;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constLocationInfo59;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constLocationInfo58;

  protected static IStrategoTerm constLocationInfo57;

  protected static IStrategoTerm constLocationInfo56;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constLocationInfo55;

  protected static IStrategoTerm constLocationInfo54;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm constLocationInfo53;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constLocationInfo52;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constLocationInfo51;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constLocationInfo50;

  protected static IStrategoTerm constLocationInfo49;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm constLocationInfo48;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constLocationInfo47;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constLocationInfo46;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constLocationInfo45;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm constLocationInfo44;

  protected static IStrategoTerm constLocationInfo43;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm constLocationInfo42;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constLocationInfo41;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constLocationInfo40;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm constLocationInfo39;

  protected static IStrategoTerm constLocationInfo38;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm constLocationInfo37;

  protected static IStrategoTerm constLocationInfo36;

  protected static IStrategoTerm constLocationInfo35;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constLocationInfo34;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constLocationInfo33;

  protected static IStrategoTerm constLocationInfo32;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm constLocationInfo31;

  protected static IStrategoTerm constLocationInfo30;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm constLocationInfo29;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constLocationInfo28;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm constLocationInfo27;

  protected static IStrategoTerm constLocationInfo26;

  protected static IStrategoTerm constLocationInfo25;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constLocationInfo24;

  protected static IStrategoTerm constLocationInfo23;

  protected static IStrategoTerm constLocationInfo22;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm constLocationInfo21;

  protected static IStrategoTerm constLocationInfo20;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm constLocationInfo19;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constLocationInfo18;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm constLocationInfo17;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constLocationInfo16;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constLocationInfo15;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm constLocationInfo14;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constLocationInfo13;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constLocationInfo12;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm constLocationInfo11;

  protected static IStrategoTerm constLocationInfo10;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm constComment0;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm constLocationInfo9;

  protected static IStrategoTerm constLocationInfo8;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constLocationInfo7;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constLocationInfo6;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constLocationInfo5;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm constLocationInfo4;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm constLocationInfo3;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constLocationInfo2;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm constLocationInfo1;

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
    synchronized(testimports.class)
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
          org.strategoxt.imp.debug.stratego.runtime.trans.Main.init(context);
          context.registerComponent("testimports");
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
        result = context.invokeStrategyCLI(main_0_0.instance, "testimports", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("testimports" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
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
      return context.invokeStrategyCLI(main_0_0.instance, "testimports", args);
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
    const0 = termFactory.makeString("localmod/util/utils.str");
    const1 = termFactory.makeString("is-empty");
    const2 = termFactory.makeString("8");
    const3 = termFactory.makeString("2");
    const4 = termFactory.makeString("16");
    constLocationInfo0 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const2, testimports.const3, testimports.const2, testimports.const4});
    const5 = termFactory.makeString("13");
    constLocationInfo1 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const2, testimports.const5, testimports.const2, testimports.const4});
    const6 = termFactory.makeString("first");
    const7 = termFactory.makeString("11");
    const8 = termFactory.makeString("30");
    constLocationInfo2 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const7, testimports.const3, testimports.const5, testimports.const8});
    const9 = termFactory.makeString("12");
    const10 = termFactory.makeString("3");
    const11 = termFactory.makeString("20");
    constLocationInfo3 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const9, testimports.const10, testimports.const9, testimports.const11});
    const12 = termFactory.makeString("9");
    const13 = termFactory.makeString("19");
    constLocationInfo4 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const9, testimports.const12, testimports.const9, testimports.const13});
    const14 = termFactory.makeString("first: ");
    const15 = termFactory.makeString("4");
    constLocationInfo5 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const5, testimports.const15, testimports.const5, testimports.const9});
    const16 = termFactory.makeString("15");
    const17 = termFactory.makeString("22");
    constLocationInfo6 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const5, testimports.const16, testimports.const5, testimports.const17});
    const18 = termFactory.makeString("25");
    const19 = termFactory.makeString("29");
    constLocationInfo7 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const5, testimports.const18, testimports.const5, testimports.const19});
    const20 = termFactory.makeString("build-c");
    const21 = termFactory.makeString("40");
    constLocationInfo8 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const4, testimports.const3, testimports.const4, testimports.const21});
    constLocationInfo9 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const4, testimports.const9, testimports.const4, testimports.const21});
    const22 = termFactory.makeString("new");
    const23 = termFactory.makeString("created!!");
    constComment0 = termFactory.makeAppl(testimports._consComment_2, new IStrategoTerm[]{testimports.const22, testimports.const23});
    const24 = termFactory.makeString("localvar.str");
    const25 = termFactory.makeString("main");
    const26 = termFactory.makeString("14");
    const27 = termFactory.makeString("21");
    constLocationInfo10 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const5, testimports.const10, testimports.const26, testimports.const27});
    constLocationInfo11 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const26, testimports.const5, testimports.const26, testimports.const11});
    const28 = termFactory.makeString("5");
    constLocationInfo12 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const26, testimports.const28, testimports.const26, testimports.const27});
    const29 = termFactory.makeString("execute");
    const30 = termFactory.makeString("38");
    constLocationInfo13 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const13, testimports.const10, testimports.const17, testimports.const30});
    const31 = termFactory.makeString("input");
    constLocationInfo14 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const11, testimports.const15, testimports.const11, testimports.const12});
    const32 = termFactory.makeString("6");
    constLocationInfo15 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const17, testimports.const32, testimports.const17, testimports.const30});
    const33 = termFactory.makeString("17");
    const34 = termFactory.makeString("31");
    constLocationInfo16 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const17, testimports.const33, testimports.const17, testimports.const34});
    const35 = termFactory.makeString("output");
    constLocationInfo17 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const17, testimports.const32, testimports.const17, testimports.const9});
    const36 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'execute'");
    const37 = termFactory.makeString("match-comments");
    const38 = termFactory.makeString("37");
    constLocationInfo18 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const18, testimports.const3, testimports.const34, testimports.const38});
    const39 = termFactory.makeString("definitions*");
    const40 = termFactory.makeString("27");
    const41 = termFactory.makeString("26");
    constLocationInfo19 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const40, testimports.const26, testimports.const40, testimports.const41});
    const42 = termFactory.makeString("39");
    constLocationInfo20 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const19, testimports.const15, testimports.const19, testimports.const42});
    constLocationInfo21 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const19, testimports.const7, testimports.const19, testimports.const18});
    const43 = termFactory.makeString("f*");
    constLocationInfo22 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const19, testimports.const15, testimports.const19, testimports.const32});
    constLocationInfo23 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const8, testimports.const32, testimports.const8, testimports.const21});
    constLocationInfo24 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const8, testimports.const5, testimports.const8, testimports.const41});
    const44 = termFactory.makeString("c*");
    constLocationInfo25 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const8, testimports.const32, testimports.const8, testimports.const2});
    constLocationInfo26 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const34, testimports.const32, testimports.const34, testimports.const38});
    constLocationInfo27 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const34, testimports.const26, testimports.const34, testimports.const40});
    const45 = termFactory.makeString("out");
    constLocationInfo28 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const34, testimports.const32, testimports.const34, testimports.const12});
    const46 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-comments'");
    const47 = termFactory.makeString("find-functions");
    const48 = termFactory.makeString("34");
    const49 = termFactory.makeString("54");
    constLocationInfo29 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const48, testimports.const3, testimports.const38, testimports.const49});
    const50 = termFactory.makeString("definition*");
    const51 = termFactory.makeString("35");
    constLocationInfo30 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const51, testimports.const10, testimports.const51, testimports.const26});
    constLocationInfo31 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const38, testimports.const15, testimports.const38, testimports.const49});
    const52 = termFactory.makeString("41");
    constLocationInfo32 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const38, testimports.const13, testimports.const38, testimports.const52});
    constLocationInfo33 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const38, testimports.const41, testimports.const38, testimports.const21});
    const53 = termFactory.makeString("functions*");
    constLocationInfo34 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const38, testimports.const15, testimports.const38, testimports.const26});
    const54 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-functions'");
    const55 = termFactory.makeString("find-comments");
    const56 = termFactory.makeString("42");
    const57 = termFactory.makeString("52");
    constLocationInfo35 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const42, testimports.const3, testimports.const56, testimports.const57});
    constLocationInfo36 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const21, testimports.const10, testimports.const21, testimports.const26});
    constLocationInfo37 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const56, testimports.const15, testimports.const56, testimports.const57});
    const58 = termFactory.makeString("18");
    constLocationInfo38 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const56, testimports.const58, testimports.const56, testimports.const42});
    constLocationInfo39 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const56, testimports.const18, testimports.const56, testimports.const30});
    const59 = termFactory.makeString("comments*");
    constLocationInfo40 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const56, testimports.const15, testimports.const56, testimports.const5});
    const60 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comments'");
    const61 = termFactory.makeString("match-f-and-c");
    const62 = termFactory.makeString("44");
    const63 = termFactory.makeString("48");
    const64 = termFactory.makeString("55");
    constLocationInfo41 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const62, testimports.const3, testimports.const63, testimports.const64});
    const65 = termFactory.makeString("45");
    constLocationInfo42 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const65, testimports.const15, testimports.const65, testimports.const32});
    const66 = termFactory.makeString("10");
    constLocationInfo43 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const65, testimports.const2, testimports.const65, testimports.const66});
    constLocationInfo44 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const63, testimports.const15, testimports.const63, testimports.const64});
    const67 = termFactory.makeString("51");
    constLocationInfo45 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const63, testimports.const33, testimports.const63, testimports.const67});
    const68 = termFactory.makeString("50");
    constLocationInfo46 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const63, testimports.const27, testimports.const63, testimports.const68});
    const69 = termFactory.makeString("matches*");
    constLocationInfo47 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const63, testimports.const15, testimports.const63, testimports.const9});
    const70 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-f-and-c'");
    const71 = termFactory.makeString("try-find-comment-by-name");
    const72 = termFactory.makeString("57");
    constLocationInfo48 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const68, testimports.const3, testimports.const68, testimports.const72});
    const73 = termFactory.makeString("28");
    constLocationInfo49 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const68, testimports.const73, testimports.const68, testimports.const8});
    constLocationInfo50 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const68, testimports.const48, testimports.const68, testimports.const72});
    const74 = termFactory.makeString("find-comment-match");
    const75 = termFactory.makeString("43");
    constLocationInfo51 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const57, testimports.const3, testimports.const72, testimports.const75});
    const76 = termFactory.makeString("24");
    constLocationInfo52 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const57, testimports.const17, testimports.const57, testimports.const76});
    const77 = termFactory.makeString("f");
    const78 = termFactory.makeString("53");
    constLocationInfo53 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const78, testimports.const10, testimports.const78, testimports.const15});
    const79 = termFactory.makeString("56");
    const80 = termFactory.makeString("33");
    constLocationInfo54 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const79, testimports.const15, testimports.const79, testimports.const80});
    constLocationInfo55 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const79, testimports.const5, testimports.const79, testimports.const8});
    const81 = termFactory.makeString("name");
    constLocationInfo56 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const79, testimports.const15, testimports.const79, testimports.const2});
    constLocationInfo57 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const72, testimports.const32, testimports.const72, testimports.const75});
    constLocationInfo58 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const72, testimports.const9, testimports.const72, testimports.const42});
    const82 = termFactory.makeString("c");
    const83 = termFactory.makeString("7");
    constLocationInfo59 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const72, testimports.const32, testimports.const72, testimports.const83});
    const84 = termFactory.makeString("get-function-name");
    const85 = termFactory.makeString("59");
    const86 = termFactory.makeString("60");
    constLocationInfo60 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const85, testimports.const3, testimports.const86, testimports.const73});
    constLocationInfo61 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const86, testimports.const9, testimports.const86, testimports.const4});
    const87 = termFactory.makeString("find-comment-by-name");
    const88 = termFactory.makeString("62");
    const89 = termFactory.makeString("66");
    constLocationInfo62 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const88, testimports.const3, testimports.const89, testimports.const64});
    constLocationInfo63 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const88, testimports.const76, testimports.const88, testimports.const73});
    const90 = termFactory.makeString("63");
    constLocationInfo64 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const90, testimports.const10, testimports.const90, testimports.const28});
    const91 = termFactory.makeString("65");
    constLocationInfo65 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const91, testimports.const10, testimports.const91, testimports.const63});
    constLocationInfo66 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const91, testimports.const13, testimports.const91, testimports.const62});
    constLocationInfo67 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const91, testimports.const41, testimports.const91, testimports.const75});
    const92 = termFactory.makeString("c-filtered*");
    constLocationInfo68 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const91, testimports.const10, testimports.const91, testimports.const26});
    constLocationInfo69 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const89, testimports.const28, testimports.const89, testimports.const64});
    constLocationInfo70 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const89, testimports.const58, testimports.const89, testimports.const48});
    constLocationInfo71 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const89, testimports.const76, testimports.const89, testimports.const80});
    const93 = termFactory.makeString("stuff:");
    const94 = termFactory.makeString("36");
    constLocationInfo72 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const89, testimports.const94, testimports.const89, testimports.const52});
    const95 = termFactory.makeString("comment");
    constLocationInfo73 = termFactory.makeAppl(testimports._consLocationInfo_4, new IStrategoTerm[]{testimports.const89, testimports.const28, testimports.const89, testimports.const9});
    const96 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comment-by-name'");
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}