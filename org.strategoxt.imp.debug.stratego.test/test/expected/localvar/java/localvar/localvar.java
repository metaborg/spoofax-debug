package localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
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

  protected static IStrategoTerm constComment0;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm const109;

  protected static IStrategoTerm constLocationInfo73;

  protected static IStrategoTerm constLocationInfo72;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constLocationInfo71;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constLocationInfo70;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm constLocationInfo69;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm constLocationInfo68;

  protected static IStrategoTerm constLocationInfo67;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constLocationInfo66;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm constLocationInfo65;

  protected static IStrategoTerm constLocationInfo64;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constLocationInfo63;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm constLocationInfo62;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constLocationInfo61;

  protected static IStrategoTerm constLocationInfo60;

  protected static IStrategoTerm constLocationInfo59;

  protected static IStrategoTerm constLocationInfo58;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constLocationInfo57;

  protected static IStrategoTerm constLocationInfo56;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm constLocationInfo55;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constLocationInfo54;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constLocationInfo53;

  protected static IStrategoTerm constLocationInfo52;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constLocationInfo51;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constLocationInfo50;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constLocationInfo49;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm constLocationInfo48;

  protected static IStrategoTerm constLocationInfo47;

  protected static IStrategoTerm constLocationInfo46;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm constLocationInfo45;

  protected static IStrategoTerm constLocationInfo44;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constLocationInfo43;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm constLocationInfo42;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constLocationInfo41;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constLocationInfo40;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm constLocationInfo39;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm const68;

  protected static IStrategoTerm constLocationInfo38;

  protected static IStrategoTerm const67;

  protected static IStrategoTerm const66;

  protected static IStrategoTerm const65;

  protected static IStrategoTerm constLocationInfo37;

  protected static IStrategoTerm const64;

  protected static IStrategoTerm constLocationInfo36;

  protected static IStrategoTerm const63;

  protected static IStrategoTerm constLocationInfo35;

  protected static IStrategoTerm const62;

  protected static IStrategoTerm constLocationInfo34;

  protected static IStrategoTerm constLocationInfo33;

  protected static IStrategoTerm const61;

  protected static IStrategoTerm constLocationInfo32;

  protected static IStrategoTerm const60;

  protected static IStrategoTerm constLocationInfo31;

  protected static IStrategoTerm const59;

  protected static IStrategoTerm const58;

  protected static IStrategoTerm const57;

  protected static IStrategoTerm const56;

  protected static IStrategoTerm constLocationInfo30;

  protected static IStrategoTerm const55;

  protected static IStrategoTerm constLocationInfo29;

  protected static IStrategoTerm constLocationInfo28;

  protected static IStrategoTerm const54;

  protected static IStrategoTerm constLocationInfo27;

  protected static IStrategoTerm constLocationInfo26;

  protected static IStrategoTerm const53;

  protected static IStrategoTerm constLocationInfo25;

  protected static IStrategoTerm const52;

  protected static IStrategoTerm const51;

  protected static IStrategoTerm const50;

  protected static IStrategoTerm const49;

  protected static IStrategoTerm constLocationInfo24;

  protected static IStrategoTerm const48;

  protected static IStrategoTerm constLocationInfo23;

  protected static IStrategoTerm constLocationInfo22;

  protected static IStrategoTerm const47;

  protected static IStrategoTerm const46;

  protected static IStrategoTerm constLocationInfo21;

  protected static IStrategoTerm constLocationInfo20;

  protected static IStrategoTerm const45;

  protected static IStrategoTerm const44;

  protected static IStrategoTerm constLocationInfo19;

  protected static IStrategoTerm const43;

  protected static IStrategoTerm const42;

  protected static IStrategoTerm const41;

  protected static IStrategoTerm const40;

  protected static IStrategoTerm const39;

  protected static IStrategoTerm constLocationInfo18;

  protected static IStrategoTerm const38;

  protected static IStrategoTerm constLocationInfo17;

  protected static IStrategoTerm const37;

  protected static IStrategoTerm constLocationInfo16;

  protected static IStrategoTerm constLocationInfo15;

  protected static IStrategoTerm const36;

  protected static IStrategoTerm const35;

  protected static IStrategoTerm constLocationInfo14;

  protected static IStrategoTerm constLocationInfo13;

  protected static IStrategoTerm const34;

  protected static IStrategoTerm constLocationInfo12;

  protected static IStrategoTerm const33;

  protected static IStrategoTerm constLocationInfo11;

  protected static IStrategoTerm const32;

  protected static IStrategoTerm const31;

  protected static IStrategoTerm constLocationInfo10;

  protected static IStrategoTerm const30;

  protected static IStrategoTerm const29;

  protected static IStrategoTerm constLocationInfo9;

  protected static IStrategoTerm const28;

  protected static IStrategoTerm const27;

  protected static IStrategoTerm const26;

  protected static IStrategoTerm const25;

  protected static IStrategoTerm constLocationInfo8;

  protected static IStrategoTerm const24;

  protected static IStrategoTerm const23;

  protected static IStrategoTerm const22;

  protected static IStrategoTerm const21;

  protected static IStrategoTerm const20;

  protected static IStrategoTerm constLocationInfo7;

  protected static IStrategoTerm const19;

  protected static IStrategoTerm const18;

  protected static IStrategoTerm constLocationInfo6;

  protected static IStrategoTerm const17;

  protected static IStrategoTerm constLocationInfo5;

  protected static IStrategoTerm const16;

  protected static IStrategoTerm constLocationInfo4;

  protected static IStrategoTerm const15;

  protected static IStrategoTerm const14;

  protected static IStrategoTerm const13;

  protected static IStrategoTerm constLocationInfo3;

  protected static IStrategoTerm const12;

  protected static IStrategoTerm const11;

  protected static IStrategoTerm const10;

  protected static IStrategoTerm const9;

  protected static IStrategoTerm constLocationInfo2;

  protected static IStrategoTerm const8;

  protected static IStrategoTerm constLocationInfo1;

  protected static IStrategoTerm const7;

  protected static IStrategoTerm const6;

  protected static IStrategoTerm constLocationInfo0;

  protected static IStrategoTerm const5;

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
          org.strategoxt.imp.debug.stratego.runtime.trans.Main.init(context);
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
    const0 = termFactory.makeString("localvar.str");
    const1 = termFactory.makeString("main");
    const2 = termFactory.makeString("31");
    const3 = termFactory.makeString("3");
    const4 = termFactory.makeString("32");
    const5 = termFactory.makeString("21");
    constLocationInfo0 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const2, localvar.const3, localvar.const4, localvar.const5});
    const6 = termFactory.makeString("13");
    const7 = termFactory.makeString("20");
    constLocationInfo1 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const4, localvar.const6, localvar.const4, localvar.const7});
    const8 = termFactory.makeString("5");
    constLocationInfo2 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const4, localvar.const8, localvar.const4, localvar.const5});
    const9 = termFactory.makeString("execute");
    const10 = termFactory.makeString("37");
    const11 = termFactory.makeString("40");
    const12 = termFactory.makeString("38");
    constLocationInfo3 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const10, localvar.const3, localvar.const11, localvar.const12});
    const13 = termFactory.makeString("input");
    const14 = termFactory.makeString("4");
    const15 = termFactory.makeString("9");
    constLocationInfo4 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const12, localvar.const14, localvar.const12, localvar.const15});
    const16 = termFactory.makeString("6");
    constLocationInfo5 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const11, localvar.const16, localvar.const11, localvar.const12});
    const17 = termFactory.makeString("17");
    constLocationInfo6 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const11, localvar.const17, localvar.const11, localvar.const2});
    const18 = termFactory.makeString("output");
    const19 = termFactory.makeString("12");
    constLocationInfo7 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const11, localvar.const16, localvar.const11, localvar.const19});
    const20 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'execute'");
    const21 = termFactory.makeString("match-comments");
    const22 = termFactory.makeString("43");
    const23 = termFactory.makeString("2");
    const24 = termFactory.makeString("49");
    constLocationInfo8 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const22, localvar.const23, localvar.const24, localvar.const10});
    const25 = termFactory.makeString("definitions*");
    const26 = termFactory.makeString("45");
    const27 = termFactory.makeString("14");
    const28 = termFactory.makeString("26");
    constLocationInfo9 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const26, localvar.const27, localvar.const26, localvar.const28});
    const29 = termFactory.makeString("47");
    const30 = termFactory.makeString("39");
    constLocationInfo10 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const29, localvar.const14, localvar.const29, localvar.const30});
    const31 = termFactory.makeString("11");
    const32 = termFactory.makeString("25");
    constLocationInfo11 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const29, localvar.const31, localvar.const29, localvar.const32});
    const33 = termFactory.makeString("f*");
    constLocationInfo12 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const29, localvar.const14, localvar.const29, localvar.const16});
    const34 = termFactory.makeString("48");
    constLocationInfo13 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const34, localvar.const16, localvar.const34, localvar.const11});
    constLocationInfo14 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const34, localvar.const6, localvar.const34, localvar.const28});
    const35 = termFactory.makeString("c*");
    const36 = termFactory.makeString("8");
    constLocationInfo15 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const34, localvar.const16, localvar.const34, localvar.const36});
    constLocationInfo16 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const24, localvar.const16, localvar.const24, localvar.const10});
    const37 = termFactory.makeString("27");
    constLocationInfo17 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const24, localvar.const27, localvar.const24, localvar.const37});
    const38 = termFactory.makeString("out");
    constLocationInfo18 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const24, localvar.const16, localvar.const24, localvar.const15});
    const39 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-comments'");
    const40 = termFactory.makeString("find-functions");
    const41 = termFactory.makeString("52");
    const42 = termFactory.makeString("55");
    const43 = termFactory.makeString("54");
    constLocationInfo19 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const41, localvar.const23, localvar.const42, localvar.const43});
    const44 = termFactory.makeString("definition*");
    const45 = termFactory.makeString("53");
    constLocationInfo20 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const45, localvar.const3, localvar.const45, localvar.const27});
    constLocationInfo21 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const42, localvar.const14, localvar.const42, localvar.const43});
    const46 = termFactory.makeString("19");
    const47 = termFactory.makeString("41");
    constLocationInfo22 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const42, localvar.const46, localvar.const42, localvar.const47});
    constLocationInfo23 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const42, localvar.const28, localvar.const42, localvar.const11});
    const48 = termFactory.makeString("functions*");
    constLocationInfo24 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const42, localvar.const14, localvar.const42, localvar.const27});
    const49 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-functions'");
    const50 = termFactory.makeString("find-comments");
    const51 = termFactory.makeString("57");
    const52 = termFactory.makeString("60");
    constLocationInfo25 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const51, localvar.const23, localvar.const52, localvar.const41});
    const53 = termFactory.makeString("58");
    constLocationInfo26 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const53, localvar.const3, localvar.const53, localvar.const27});
    constLocationInfo27 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const52, localvar.const14, localvar.const52, localvar.const41});
    const54 = termFactory.makeString("18");
    constLocationInfo28 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const52, localvar.const54, localvar.const52, localvar.const30});
    constLocationInfo29 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const52, localvar.const32, localvar.const52, localvar.const12});
    const55 = termFactory.makeString("comments*");
    constLocationInfo30 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const52, localvar.const14, localvar.const52, localvar.const6});
    const56 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comments'");
    const57 = termFactory.makeString("match-f-and-c");
    const58 = termFactory.makeString("62");
    const59 = termFactory.makeString("66");
    constLocationInfo31 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const58, localvar.const23, localvar.const59, localvar.const42});
    const60 = termFactory.makeString("63");
    constLocationInfo32 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const60, localvar.const14, localvar.const60, localvar.const16});
    const61 = termFactory.makeString("10");
    constLocationInfo33 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const60, localvar.const36, localvar.const60, localvar.const61});
    constLocationInfo34 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const59, localvar.const14, localvar.const59, localvar.const42});
    const62 = termFactory.makeString("51");
    constLocationInfo35 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const59, localvar.const17, localvar.const59, localvar.const62});
    const63 = termFactory.makeString("50");
    constLocationInfo36 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const59, localvar.const5, localvar.const59, localvar.const63});
    const64 = termFactory.makeString("matches*");
    constLocationInfo37 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const59, localvar.const14, localvar.const59, localvar.const19});
    const65 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-f-and-c'");
    const66 = termFactory.makeString("try-find-comment-by-name");
    const67 = termFactory.makeString("68");
    constLocationInfo38 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const67, localvar.const23, localvar.const67, localvar.const51});
    const68 = termFactory.makeString("28");
    const69 = termFactory.makeString("30");
    constLocationInfo39 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const67, localvar.const68, localvar.const67, localvar.const69});
    const70 = termFactory.makeString("34");
    constLocationInfo40 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const67, localvar.const70, localvar.const67, localvar.const51});
    const71 = termFactory.makeString("find-comment-match");
    const72 = termFactory.makeString("70");
    const73 = termFactory.makeString("75");
    constLocationInfo41 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const72, localvar.const23, localvar.const73, localvar.const22});
    const74 = termFactory.makeString("22");
    const75 = termFactory.makeString("24");
    constLocationInfo42 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const72, localvar.const74, localvar.const72, localvar.const75});
    const76 = termFactory.makeString("f");
    const77 = termFactory.makeString("71");
    constLocationInfo43 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const77, localvar.const3, localvar.const77, localvar.const14});
    const78 = termFactory.makeString("74");
    const79 = termFactory.makeString("33");
    constLocationInfo44 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const78, localvar.const14, localvar.const78, localvar.const79});
    constLocationInfo45 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const78, localvar.const6, localvar.const78, localvar.const69});
    const80 = termFactory.makeString("name");
    constLocationInfo46 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const78, localvar.const14, localvar.const78, localvar.const36});
    constLocationInfo47 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const73, localvar.const16, localvar.const73, localvar.const22});
    constLocationInfo48 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const73, localvar.const19, localvar.const73, localvar.const30});
    const81 = termFactory.makeString("c");
    const82 = termFactory.makeString("7");
    constLocationInfo49 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const73, localvar.const16, localvar.const73, localvar.const82});
    const83 = termFactory.makeString("get-function-name");
    const84 = termFactory.makeString("77");
    const85 = termFactory.makeString("78");
    constLocationInfo50 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const84, localvar.const23, localvar.const85, localvar.const68});
    const86 = termFactory.makeString("16");
    constLocationInfo51 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const85, localvar.const19, localvar.const85, localvar.const86});
    const87 = termFactory.makeString("find-comment-by-name");
    const88 = termFactory.makeString("80");
    const89 = termFactory.makeString("84");
    constLocationInfo52 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const88, localvar.const23, localvar.const89, localvar.const42});
    constLocationInfo53 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const88, localvar.const75, localvar.const88, localvar.const68});
    const90 = termFactory.makeString("81");
    constLocationInfo54 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const90, localvar.const3, localvar.const90, localvar.const8});
    const91 = termFactory.makeString("83");
    constLocationInfo55 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const91, localvar.const3, localvar.const91, localvar.const34});
    const92 = termFactory.makeString("44");
    constLocationInfo56 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const91, localvar.const46, localvar.const91, localvar.const92});
    constLocationInfo57 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const91, localvar.const28, localvar.const91, localvar.const22});
    const93 = termFactory.makeString("c-filtered*");
    constLocationInfo58 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const91, localvar.const3, localvar.const91, localvar.const27});
    constLocationInfo59 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const89, localvar.const8, localvar.const89, localvar.const42});
    constLocationInfo60 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const89, localvar.const54, localvar.const89, localvar.const70});
    constLocationInfo61 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const89, localvar.const75, localvar.const89, localvar.const79});
    const94 = termFactory.makeString("stuff:");
    const95 = termFactory.makeString("36");
    constLocationInfo62 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const89, localvar.const95, localvar.const89, localvar.const47});
    const96 = termFactory.makeString("comment");
    constLocationInfo63 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const89, localvar.const8, localvar.const89, localvar.const19});
    const97 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comment-by-name'");
    const98 = termFactory.makeString("is-empty");
    const99 = termFactory.makeString("91");
    constLocationInfo64 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const99, localvar.const23, localvar.const99, localvar.const86});
    constLocationInfo65 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const99, localvar.const6, localvar.const99, localvar.const86});
    const100 = termFactory.makeString("first");
    const101 = termFactory.makeString("94");
    const102 = termFactory.makeString("96");
    constLocationInfo66 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const101, localvar.const23, localvar.const102, localvar.const69});
    const103 = termFactory.makeString("95");
    constLocationInfo67 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const103, localvar.const3, localvar.const103, localvar.const7});
    constLocationInfo68 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const103, localvar.const15, localvar.const103, localvar.const46});
    const104 = termFactory.makeString("first: ");
    constLocationInfo69 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const102, localvar.const14, localvar.const102, localvar.const19});
    const105 = termFactory.makeString("15");
    constLocationInfo70 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const102, localvar.const105, localvar.const102, localvar.const74});
    const106 = termFactory.makeString("29");
    constLocationInfo71 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const102, localvar.const32, localvar.const102, localvar.const106});
    const107 = termFactory.makeString("build-c");
    const108 = termFactory.makeString("98");
    constLocationInfo72 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const108, localvar.const23, localvar.const108, localvar.const11});
    constLocationInfo73 = termFactory.makeAppl(localvar._consLocationInfo_4, new IStrategoTerm[]{localvar.const108, localvar.const19, localvar.const108, localvar.const11});
    const109 = termFactory.makeString("new");
    const110 = termFactory.makeString("created!!");
    constComment0 = termFactory.makeAppl(localvar._consComment_2, new IStrategoTerm[]{localvar.const109, localvar.const110});
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}