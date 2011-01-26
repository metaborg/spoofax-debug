package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class dynamic  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constComment0;

  protected static IStrategoTerm const124;

  protected static IStrategoTerm const123;

  protected static IStrategoTerm constLocationInfo82;

  protected static IStrategoTerm constLocationInfo81;

  protected static IStrategoTerm const122;

  protected static IStrategoTerm const121;

  protected static IStrategoTerm constLocationInfo80;

  protected static IStrategoTerm const120;

  protected static IStrategoTerm constLocationInfo79;

  protected static IStrategoTerm constLocationInfo78;

  protected static IStrategoTerm const119;

  protected static IStrategoTerm constLocationInfo77;

  protected static IStrategoTerm constLocationInfo76;

  protected static IStrategoTerm const118;

  protected static IStrategoTerm constLocationInfo75;

  protected static IStrategoTerm const117;

  protected static IStrategoTerm const116;

  protected static IStrategoTerm const115;

  protected static IStrategoTerm constLocationInfo74;

  protected static IStrategoTerm constLocationInfo73;

  protected static IStrategoTerm const114;

  protected static IStrategoTerm const113;

  protected static IStrategoTerm constLocationInfo72;

  protected static IStrategoTerm const112;

  protected static IStrategoTerm constLocationInfo71;

  protected static IStrategoTerm const111;

  protected static IStrategoTerm constLocationInfo70;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm const109;

  protected static IStrategoTerm constLocationInfo69;

  protected static IStrategoTerm constLocationInfo68;

  protected static IStrategoTerm constLocationInfo67;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm constLocationInfo66;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constLocationInfo65;

  protected static IStrategoTerm constLocationInfo64;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constLocationInfo63;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constLocationInfo62;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constLocationInfo61;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constLocationInfo60;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constLocationInfo59;

  protected static IStrategoTerm constLocationInfo58;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm constLocationInfo57;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm constLocationInfo56;

  protected static IStrategoTerm constLocationInfo55;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constLocationInfo54;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constLocationInfo53;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constLocationInfo52;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constLocationInfo51;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constLocationInfo50;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constLocationInfo49;

  protected static IStrategoTerm constLocationInfo48;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm constCons0;

  protected static IStrategoTerm constDR_DUMMY0;

  protected static IStrategoTerm constNil0;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm constLocationInfo47;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm const81;

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

  public static IStrategoConstructor _consDR_DUMMY_0;

  public static Context init(Context context)
  { 
    synchronized(dynamic.class)
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
          context.registerComponent("dynamic");
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
        result = context.invokeStrategyCLI(main_0_0.instance, "dynamic", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("dynamic" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
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
      return context.invokeStrategyCLI(main_0_0.instance, "dynamic", args);
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
    _consDR_DUMMY_0 = termFactory.makeConstructor("DR_DUMMY", 0);
  }

  public static void initConstants(ITermFactory termFactory)
  { 
    const0 = termFactory.makeString("localvar.str");
    const1 = termFactory.makeString("main");
    const2 = termFactory.makeString("31");
    const3 = termFactory.makeString("3");
    const4 = termFactory.makeString("32");
    const5 = termFactory.makeString("21");
    constLocationInfo0 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const2, dynamic.const3, dynamic.const4, dynamic.const5});
    const6 = termFactory.makeString("13");
    const7 = termFactory.makeString("20");
    constLocationInfo1 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const4, dynamic.const6, dynamic.const4, dynamic.const7});
    const8 = termFactory.makeString("5");
    constLocationInfo2 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const4, dynamic.const8, dynamic.const4, dynamic.const5});
    const9 = termFactory.makeString("execute");
    const10 = termFactory.makeString("37");
    const11 = termFactory.makeString("40");
    const12 = termFactory.makeString("38");
    constLocationInfo3 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const10, dynamic.const3, dynamic.const11, dynamic.const12});
    const13 = termFactory.makeString("input");
    const14 = termFactory.makeString("4");
    const15 = termFactory.makeString("9");
    constLocationInfo4 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const12, dynamic.const14, dynamic.const12, dynamic.const15});
    const16 = termFactory.makeString("6");
    constLocationInfo5 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const11, dynamic.const16, dynamic.const11, dynamic.const12});
    const17 = termFactory.makeString("17");
    constLocationInfo6 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const11, dynamic.const17, dynamic.const11, dynamic.const2});
    const18 = termFactory.makeString("output");
    const19 = termFactory.makeString("12");
    constLocationInfo7 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const11, dynamic.const16, dynamic.const11, dynamic.const19});
    const20 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'execute'");
    const21 = termFactory.makeString("match-comments");
    const22 = termFactory.makeString("43");
    const23 = termFactory.makeString("2");
    const24 = termFactory.makeString("49");
    constLocationInfo8 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const22, dynamic.const23, dynamic.const24, dynamic.const10});
    const25 = termFactory.makeString("definitions*");
    const26 = termFactory.makeString("45");
    const27 = termFactory.makeString("14");
    const28 = termFactory.makeString("26");
    constLocationInfo9 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const26, dynamic.const27, dynamic.const26, dynamic.const28});
    const29 = termFactory.makeString("47");
    const30 = termFactory.makeString("39");
    constLocationInfo10 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const29, dynamic.const14, dynamic.const29, dynamic.const30});
    const31 = termFactory.makeString("11");
    const32 = termFactory.makeString("25");
    constLocationInfo11 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const29, dynamic.const31, dynamic.const29, dynamic.const32});
    const33 = termFactory.makeString("f*");
    constLocationInfo12 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const29, dynamic.const14, dynamic.const29, dynamic.const16});
    const34 = termFactory.makeString("48");
    constLocationInfo13 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const34, dynamic.const16, dynamic.const34, dynamic.const11});
    constLocationInfo14 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const34, dynamic.const6, dynamic.const34, dynamic.const28});
    const35 = termFactory.makeString("c*");
    const36 = termFactory.makeString("8");
    constLocationInfo15 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const34, dynamic.const16, dynamic.const34, dynamic.const36});
    constLocationInfo16 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const24, dynamic.const16, dynamic.const24, dynamic.const10});
    const37 = termFactory.makeString("27");
    constLocationInfo17 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const24, dynamic.const27, dynamic.const24, dynamic.const37});
    const38 = termFactory.makeString("out");
    constLocationInfo18 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const24, dynamic.const16, dynamic.const24, dynamic.const15});
    const39 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-comments'");
    const40 = termFactory.makeString("find-functions");
    const41 = termFactory.makeString("52");
    const42 = termFactory.makeString("55");
    const43 = termFactory.makeString("54");
    constLocationInfo19 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const41, dynamic.const23, dynamic.const42, dynamic.const43});
    const44 = termFactory.makeString("definition*");
    const45 = termFactory.makeString("53");
    constLocationInfo20 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const45, dynamic.const3, dynamic.const45, dynamic.const27});
    constLocationInfo21 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const42, dynamic.const14, dynamic.const42, dynamic.const43});
    const46 = termFactory.makeString("19");
    const47 = termFactory.makeString("41");
    constLocationInfo22 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const42, dynamic.const46, dynamic.const42, dynamic.const47});
    constLocationInfo23 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const42, dynamic.const28, dynamic.const42, dynamic.const11});
    const48 = termFactory.makeString("functions*");
    constLocationInfo24 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const42, dynamic.const14, dynamic.const42, dynamic.const27});
    const49 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-functions'");
    const50 = termFactory.makeString("find-comments");
    const51 = termFactory.makeString("57");
    const52 = termFactory.makeString("60");
    constLocationInfo25 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const51, dynamic.const23, dynamic.const52, dynamic.const41});
    const53 = termFactory.makeString("58");
    constLocationInfo26 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const53, dynamic.const3, dynamic.const53, dynamic.const27});
    constLocationInfo27 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const52, dynamic.const14, dynamic.const52, dynamic.const41});
    const54 = termFactory.makeString("18");
    constLocationInfo28 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const52, dynamic.const54, dynamic.const52, dynamic.const30});
    constLocationInfo29 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const52, dynamic.const32, dynamic.const52, dynamic.const12});
    const55 = termFactory.makeString("comments*");
    constLocationInfo30 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const52, dynamic.const14, dynamic.const52, dynamic.const6});
    const56 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comments'");
    const57 = termFactory.makeString("match-f-and-c");
    const58 = termFactory.makeString("62");
    const59 = termFactory.makeString("66");
    constLocationInfo31 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const58, dynamic.const23, dynamic.const59, dynamic.const42});
    const60 = termFactory.makeString("63");
    constLocationInfo32 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const60, dynamic.const14, dynamic.const60, dynamic.const16});
    const61 = termFactory.makeString("10");
    constLocationInfo33 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const60, dynamic.const36, dynamic.const60, dynamic.const61});
    constLocationInfo34 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const59, dynamic.const14, dynamic.const59, dynamic.const42});
    const62 = termFactory.makeString("51");
    constLocationInfo35 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const59, dynamic.const17, dynamic.const59, dynamic.const62});
    const63 = termFactory.makeString("50");
    constLocationInfo36 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const59, dynamic.const5, dynamic.const59, dynamic.const63});
    const64 = termFactory.makeString("matches*");
    constLocationInfo37 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const59, dynamic.const14, dynamic.const59, dynamic.const19});
    const65 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-f-and-c'");
    const66 = termFactory.makeString("try-find-comment-by-name");
    const67 = termFactory.makeString("68");
    constLocationInfo38 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const67, dynamic.const23, dynamic.const67, dynamic.const51});
    const68 = termFactory.makeString("28");
    const69 = termFactory.makeString("30");
    constLocationInfo39 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const67, dynamic.const68, dynamic.const67, dynamic.const69});
    const70 = termFactory.makeString("34");
    constLocationInfo40 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const67, dynamic.const70, dynamic.const67, dynamic.const51});
    const71 = termFactory.makeString("find-comment-match");
    const72 = termFactory.makeString("70");
    const73 = termFactory.makeString("78");
    constLocationInfo41 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const72, dynamic.const23, dynamic.const73, dynamic.const22});
    const74 = termFactory.makeString("22");
    const75 = termFactory.makeString("24");
    constLocationInfo42 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const72, dynamic.const74, dynamic.const72, dynamic.const75});
    const76 = termFactory.makeString("f");
    const77 = termFactory.makeString("71");
    constLocationInfo43 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const77, dynamic.const3, dynamic.const77, dynamic.const14});
    const78 = termFactory.makeString("74");
    const79 = termFactory.makeString("33");
    constLocationInfo44 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const78, dynamic.const14, dynamic.const78, dynamic.const79});
    constLocationInfo45 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const78, dynamic.const6, dynamic.const78, dynamic.const69});
    const80 = termFactory.makeString("name");
    constLocationInfo46 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const78, dynamic.const14, dynamic.const78, dynamic.const36});
    const81 = termFactory.makeString("75");
    const82 = termFactory.makeString("77");
    const83 = termFactory.makeString("7");
    constLocationInfo47 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const81, dynamic.const16, dynamic.const82, dynamic.const83});
    const84 = termFactory.makeString("get-current-name");
    constNil0 = (IStrategoTerm)termFactory.makeList();
    constDR_DUMMY0 = termFactory.makeAppl(dynamic._consDR_DUMMY_0, NO_TERMS);
    constCons0 = (IStrategoTerm)termFactory.makeListCons(dynamic.constDR_DUMMY0, (IStrategoList)dynamic.constNil0);
    const85 = termFactory.makeString("-395458");
    constLocationInfo48 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const73, dynamic.const16, dynamic.const73, dynamic.const22});
    constLocationInfo49 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const73, dynamic.const19, dynamic.const73, dynamic.const30});
    const86 = termFactory.makeString("c");
    constLocationInfo50 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const73, dynamic.const16, dynamic.const73, dynamic.const83});
    const87 = termFactory.makeString("get-function-name");
    const88 = termFactory.makeString("80");
    const89 = termFactory.makeString("81");
    constLocationInfo51 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const88, dynamic.const23, dynamic.const89, dynamic.const68});
    const90 = termFactory.makeString("16");
    constLocationInfo52 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const89, dynamic.const19, dynamic.const89, dynamic.const90});
    const91 = termFactory.makeString("find-comment-by-name");
    const92 = termFactory.makeString("83");
    constLocationInfo53 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const92, dynamic.const75, dynamic.const92, dynamic.const68});
    const93 = termFactory.makeString("84");
    constLocationInfo54 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const93, dynamic.const3, dynamic.const93, dynamic.const8});
    const94 = termFactory.makeString("85");
    constLocationInfo55 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const94, dynamic.const61, dynamic.const94, dynamic.const47});
    constLocationInfo56 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const94, dynamic.const90, dynamic.const94, dynamic.const11});
    const95 = termFactory.makeString("find-comment-by-name ");
    const96 = termFactory.makeString("86");
    constLocationInfo57 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const96, dynamic.const15, dynamic.const96, dynamic.const4});
    const97 = termFactory.makeString("15");
    constLocationInfo58 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const96, dynamic.const97, dynamic.const96, dynamic.const2});
    constLocationInfo59 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const96, dynamic.const15, dynamic.const96, dynamic.const61});
    const98 = termFactory.makeString("61");
    constLocationInfo60 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const96, dynamic.const47, dynamic.const96, dynamic.const98});
    const99 = termFactory.makeString("get-current-name ");
    const100 = termFactory.makeString("35");
    constLocationInfo61 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const96, dynamic.const100, dynamic.const96, dynamic.const58});
    const101 = termFactory.makeString("88");
    const102 = termFactory.makeString("90");
    constLocationInfo62 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const101, dynamic.const15, dynamic.const102, dynamic.const14});
    const103 = termFactory.makeString("baz-rule");
    const104 = termFactory.makeString("-474403");
    const105 = termFactory.makeString("92");
    constLocationInfo63 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const105, dynamic.const3, dynamic.const105, dynamic.const34});
    const106 = termFactory.makeString("44");
    constLocationInfo64 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const105, dynamic.const46, dynamic.const105, dynamic.const106});
    constLocationInfo65 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const105, dynamic.const28, dynamic.const105, dynamic.const22});
    const107 = termFactory.makeString("c-filtered*");
    constLocationInfo66 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const105, dynamic.const3, dynamic.const105, dynamic.const27});
    const108 = termFactory.makeString("93");
    constLocationInfo67 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const108, dynamic.const8, dynamic.const108, dynamic.const42});
    constLocationInfo68 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const108, dynamic.const54, dynamic.const108, dynamic.const70});
    constLocationInfo69 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const108, dynamic.const75, dynamic.const108, dynamic.const79});
    const109 = termFactory.makeString("stuff:");
    const110 = termFactory.makeString("36");
    constLocationInfo70 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const108, dynamic.const110, dynamic.const108, dynamic.const47});
    const111 = termFactory.makeString("comment");
    constLocationInfo71 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const108, dynamic.const8, dynamic.const108, dynamic.const19});
    const112 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comment-by-name'");
    constLocationInfo72 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const92, dynamic.const23, dynamic.const108, dynamic.const42});
    const113 = termFactory.makeString("is-empty");
    const114 = termFactory.makeString("102");
    constLocationInfo73 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const114, dynamic.const23, dynamic.const114, dynamic.const90});
    constLocationInfo74 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const114, dynamic.const6, dynamic.const114, dynamic.const90});
    const115 = termFactory.makeString("first");
    const116 = termFactory.makeString("105");
    const117 = termFactory.makeString("107");
    constLocationInfo75 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const116, dynamic.const23, dynamic.const117, dynamic.const69});
    const118 = termFactory.makeString("106");
    constLocationInfo76 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const118, dynamic.const3, dynamic.const118, dynamic.const7});
    constLocationInfo77 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const118, dynamic.const15, dynamic.const118, dynamic.const46});
    const119 = termFactory.makeString("first: ");
    constLocationInfo78 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const117, dynamic.const14, dynamic.const117, dynamic.const19});
    constLocationInfo79 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const117, dynamic.const97, dynamic.const117, dynamic.const74});
    const120 = termFactory.makeString("29");
    constLocationInfo80 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const117, dynamic.const32, dynamic.const117, dynamic.const120});
    const121 = termFactory.makeString("build-c");
    const122 = termFactory.makeString("109");
    constLocationInfo81 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const122, dynamic.const23, dynamic.const122, dynamic.const11});
    constLocationInfo82 = termFactory.makeAppl(dynamic._consLocationInfo_4, new IStrategoTerm[]{dynamic.const122, dynamic.const19, dynamic.const122, dynamic.const11});
    const123 = termFactory.makeString("new");
    const124 = termFactory.makeString("created!!");
    constComment0 = termFactory.makeAppl(dynamic._consComment_2, new IStrategoTerm[]{dynamic.const123, dynamic.const124});
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}