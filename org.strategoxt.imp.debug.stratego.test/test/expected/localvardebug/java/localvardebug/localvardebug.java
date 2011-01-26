package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class localvardebug  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constComment0;

  protected static IStrategoTerm const125;

  protected static IStrategoTerm const124;

  protected static IStrategoTerm constLocationInfo87;

  protected static IStrategoTerm constLocationInfo86;

  protected static IStrategoTerm const123;

  protected static IStrategoTerm const122;

  protected static IStrategoTerm constLocationInfo85;

  protected static IStrategoTerm constLocationInfo84;

  protected static IStrategoTerm const121;

  protected static IStrategoTerm constLocationInfo83;

  protected static IStrategoTerm constLocationInfo82;

  protected static IStrategoTerm const120;

  protected static IStrategoTerm const119;

  protected static IStrategoTerm constLocationInfo81;

  protected static IStrategoTerm constLocationInfo80;

  protected static IStrategoTerm const118;

  protected static IStrategoTerm const117;

  protected static IStrategoTerm constLocationInfo79;

  protected static IStrategoTerm constLocationInfo78;

  protected static IStrategoTerm const116;

  protected static IStrategoTerm const115;

  protected static IStrategoTerm const114;

  protected static IStrategoTerm constLocationInfo77;

  protected static IStrategoTerm constLocationInfo76;

  protected static IStrategoTerm const113;

  protected static IStrategoTerm const112;

  protected static IStrategoTerm const111;

  protected static IStrategoTerm constLocationInfo75;

  protected static IStrategoTerm constLocationInfo74;

  protected static IStrategoTerm constLocationInfo73;

  protected static IStrategoTerm const110;

  protected static IStrategoTerm constLocationInfo72;

  protected static IStrategoTerm const109;

  protected static IStrategoTerm const108;

  protected static IStrategoTerm constLocationInfo71;

  protected static IStrategoTerm constLocationInfo70;

  protected static IStrategoTerm constLocationInfo69;

  protected static IStrategoTerm const107;

  protected static IStrategoTerm constLocationInfo68;

  protected static IStrategoTerm const106;

  protected static IStrategoTerm constLocationInfo67;

  protected static IStrategoTerm constLocationInfo66;

  protected static IStrategoTerm const105;

  protected static IStrategoTerm constLocationInfo65;

  protected static IStrategoTerm const104;

  protected static IStrategoTerm const103;

  protected static IStrategoTerm constLocationInfo64;

  protected static IStrategoTerm constLocationInfo63;

  protected static IStrategoTerm const102;

  protected static IStrategoTerm constLocationInfo62;

  protected static IStrategoTerm const101;

  protected static IStrategoTerm constLocationInfo61;

  protected static IStrategoTerm constLocationInfo60;

  protected static IStrategoTerm const100;

  protected static IStrategoTerm const99;

  protected static IStrategoTerm constLocationInfo59;

  protected static IStrategoTerm const98;

  protected static IStrategoTerm constLocationInfo58;

  protected static IStrategoTerm const97;

  protected static IStrategoTerm const96;

  protected static IStrategoTerm const95;

  protected static IStrategoTerm const94;

  protected static IStrategoTerm constLocationInfo57;

  protected static IStrategoTerm const93;

  protected static IStrategoTerm constLocationInfo56;

  protected static IStrategoTerm constLocationInfo55;

  protected static IStrategoTerm const92;

  protected static IStrategoTerm const91;

  protected static IStrategoTerm constLocationInfo54;

  protected static IStrategoTerm constLocationInfo53;

  protected static IStrategoTerm constLocationInfo52;

  protected static IStrategoTerm const90;

  protected static IStrategoTerm constLocationInfo51;

  protected static IStrategoTerm constLocationInfo50;

  protected static IStrategoTerm const89;

  protected static IStrategoTerm const88;

  protected static IStrategoTerm const87;

  protected static IStrategoTerm constLocationInfo49;

  protected static IStrategoTerm const86;

  protected static IStrategoTerm constLocationInfo48;

  protected static IStrategoTerm const85;

  protected static IStrategoTerm constLocationInfo47;

  protected static IStrategoTerm const84;

  protected static IStrategoTerm const83;

  protected static IStrategoTerm constLocationInfo46;

  protected static IStrategoTerm const82;

  protected static IStrategoTerm constLocationInfo45;

  protected static IStrategoTerm const81;

  protected static IStrategoTerm const80;

  protected static IStrategoTerm const79;

  protected static IStrategoTerm const78;

  protected static IStrategoTerm constLocationInfo44;

  protected static IStrategoTerm const77;

  protected static IStrategoTerm constLocationInfo43;

  protected static IStrategoTerm const76;

  protected static IStrategoTerm const75;

  protected static IStrategoTerm constLocationInfo42;

  protected static IStrategoTerm constLocationInfo41;

  protected static IStrategoTerm const74;

  protected static IStrategoTerm constLocationInfo40;

  protected static IStrategoTerm const73;

  protected static IStrategoTerm const72;

  protected static IStrategoTerm const71;

  protected static IStrategoTerm constLocationInfo39;

  protected static IStrategoTerm const70;

  protected static IStrategoTerm const69;

  protected static IStrategoTerm constLocationInfo38;

  protected static IStrategoTerm const68;

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
    synchronized(localvardebug.class)
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
          context.registerComponent("localvardebug");
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
        result = context.invokeStrategyCLI(main_0_0.instance, "localvardebug", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("localvardebug" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
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
      return context.invokeStrategyCLI(main_0_0.instance, "localvardebug", args);
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
    constLocationInfo0 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const2, localvardebug.const3, localvardebug.const4, localvardebug.const5});
    const6 = termFactory.makeString("13");
    const7 = termFactory.makeString("20");
    constLocationInfo1 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const4, localvardebug.const6, localvardebug.const4, localvardebug.const7});
    const8 = termFactory.makeString("5");
    constLocationInfo2 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const4, localvardebug.const8, localvardebug.const4, localvardebug.const5});
    const9 = termFactory.makeString("execute");
    const10 = termFactory.makeString("37");
    const11 = termFactory.makeString("40");
    const12 = termFactory.makeString("38");
    constLocationInfo3 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const10, localvardebug.const3, localvardebug.const11, localvardebug.const12});
    const13 = termFactory.makeString("input");
    const14 = termFactory.makeString("4");
    const15 = termFactory.makeString("9");
    constLocationInfo4 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const12, localvardebug.const14, localvardebug.const12, localvardebug.const15});
    const16 = termFactory.makeString("6");
    constLocationInfo5 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const11, localvardebug.const16, localvardebug.const11, localvardebug.const12});
    const17 = termFactory.makeString("17");
    constLocationInfo6 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const11, localvardebug.const17, localvardebug.const11, localvardebug.const2});
    const18 = termFactory.makeString("output");
    const19 = termFactory.makeString("12");
    constLocationInfo7 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const11, localvardebug.const16, localvardebug.const11, localvardebug.const19});
    const20 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'execute'");
    const21 = termFactory.makeString("match-comments");
    const22 = termFactory.makeString("43");
    const23 = termFactory.makeString("2");
    const24 = termFactory.makeString("49");
    constLocationInfo8 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const22, localvardebug.const23, localvardebug.const24, localvardebug.const10});
    const25 = termFactory.makeString("definitions*");
    const26 = termFactory.makeString("45");
    const27 = termFactory.makeString("14");
    const28 = termFactory.makeString("26");
    constLocationInfo9 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const26, localvardebug.const27, localvardebug.const26, localvardebug.const28});
    const29 = termFactory.makeString("47");
    const30 = termFactory.makeString("39");
    constLocationInfo10 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const29, localvardebug.const14, localvardebug.const29, localvardebug.const30});
    const31 = termFactory.makeString("11");
    const32 = termFactory.makeString("25");
    constLocationInfo11 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const29, localvardebug.const31, localvardebug.const29, localvardebug.const32});
    const33 = termFactory.makeString("f*");
    constLocationInfo12 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const29, localvardebug.const14, localvardebug.const29, localvardebug.const16});
    const34 = termFactory.makeString("48");
    constLocationInfo13 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const34, localvardebug.const16, localvardebug.const34, localvardebug.const11});
    constLocationInfo14 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const34, localvardebug.const6, localvardebug.const34, localvardebug.const28});
    const35 = termFactory.makeString("c*");
    const36 = termFactory.makeString("8");
    constLocationInfo15 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const34, localvardebug.const16, localvardebug.const34, localvardebug.const36});
    constLocationInfo16 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const24, localvardebug.const16, localvardebug.const24, localvardebug.const10});
    const37 = termFactory.makeString("27");
    constLocationInfo17 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const24, localvardebug.const27, localvardebug.const24, localvardebug.const37});
    const38 = termFactory.makeString("out");
    constLocationInfo18 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const24, localvardebug.const16, localvardebug.const24, localvardebug.const15});
    const39 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-comments'");
    const40 = termFactory.makeString("find-functions");
    const41 = termFactory.makeString("52");
    const42 = termFactory.makeString("55");
    const43 = termFactory.makeString("54");
    constLocationInfo19 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const41, localvardebug.const23, localvardebug.const42, localvardebug.const43});
    const44 = termFactory.makeString("definition*");
    const45 = termFactory.makeString("53");
    constLocationInfo20 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const45, localvardebug.const3, localvardebug.const45, localvardebug.const27});
    constLocationInfo21 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const42, localvardebug.const14, localvardebug.const42, localvardebug.const43});
    const46 = termFactory.makeString("19");
    const47 = termFactory.makeString("41");
    constLocationInfo22 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const42, localvardebug.const46, localvardebug.const42, localvardebug.const47});
    constLocationInfo23 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const42, localvardebug.const28, localvardebug.const42, localvardebug.const11});
    const48 = termFactory.makeString("functions*");
    constLocationInfo24 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const42, localvardebug.const14, localvardebug.const42, localvardebug.const27});
    const49 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-functions'");
    const50 = termFactory.makeString("find-comments");
    const51 = termFactory.makeString("57");
    const52 = termFactory.makeString("60");
    constLocationInfo25 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const51, localvardebug.const23, localvardebug.const52, localvardebug.const41});
    const53 = termFactory.makeString("58");
    constLocationInfo26 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const53, localvardebug.const3, localvardebug.const53, localvardebug.const27});
    constLocationInfo27 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const52, localvardebug.const14, localvardebug.const52, localvardebug.const41});
    const54 = termFactory.makeString("18");
    constLocationInfo28 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const52, localvardebug.const54, localvardebug.const52, localvardebug.const30});
    constLocationInfo29 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const52, localvardebug.const32, localvardebug.const52, localvardebug.const12});
    const55 = termFactory.makeString("comments*");
    constLocationInfo30 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const52, localvardebug.const14, localvardebug.const52, localvardebug.const6});
    const56 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comments'");
    const57 = termFactory.makeString("match-f-and-c");
    const58 = termFactory.makeString("62");
    const59 = termFactory.makeString("66");
    constLocationInfo31 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const58, localvardebug.const23, localvardebug.const59, localvardebug.const42});
    const60 = termFactory.makeString("63");
    constLocationInfo32 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const60, localvardebug.const14, localvardebug.const60, localvardebug.const16});
    const61 = termFactory.makeString("10");
    constLocationInfo33 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const60, localvardebug.const36, localvardebug.const60, localvardebug.const61});
    constLocationInfo34 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const59, localvardebug.const14, localvardebug.const59, localvardebug.const42});
    const62 = termFactory.makeString("51");
    constLocationInfo35 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const59, localvardebug.const17, localvardebug.const59, localvardebug.const62});
    const63 = termFactory.makeString("50");
    constLocationInfo36 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const59, localvardebug.const5, localvardebug.const59, localvardebug.const63});
    const64 = termFactory.makeString("matches*");
    constLocationInfo37 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const59, localvardebug.const14, localvardebug.const59, localvardebug.const19});
    const65 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-f-and-c'");
    const66 = termFactory.makeString("try-find-comment-by-name");
    const67 = termFactory.makeString("68");
    const68 = termFactory.makeString("91");
    constLocationInfo38 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const67, localvardebug.const23, localvardebug.const67, localvardebug.const68});
    const69 = termFactory.makeString("82");
    const70 = termFactory.makeString("90");
    constLocationInfo39 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const67, localvardebug.const69, localvardebug.const67, localvardebug.const70});
    const71 = termFactory.makeString("exit1");
    const72 = termFactory.makeString("28");
    const73 = termFactory.makeString("30");
    constLocationInfo40 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const67, localvardebug.const72, localvardebug.const67, localvardebug.const73});
    const74 = termFactory.makeString("34");
    constLocationInfo41 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const67, localvardebug.const74, localvardebug.const67, localvardebug.const63});
    constLocationInfo42 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const67, localvardebug.const11, localvardebug.const67, localvardebug.const24});
    const75 = termFactory.makeString("enter1");
    const76 = termFactory.makeString("74");
    constLocationInfo43 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const67, localvardebug.const62, localvardebug.const67, localvardebug.const76});
    const77 = termFactory.makeString("76");
    constLocationInfo44 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const67, localvardebug.const77, localvardebug.const67, localvardebug.const68});
    const78 = termFactory.makeString("find-comment-match");
    const79 = termFactory.makeString("70");
    const80 = termFactory.makeString("77");
    const81 = termFactory.makeString("24");
    constLocationInfo45 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const79, localvardebug.const23, localvardebug.const80, localvardebug.const81});
    const82 = termFactory.makeString("22");
    constLocationInfo46 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const79, localvardebug.const82, localvardebug.const79, localvardebug.const81});
    const83 = termFactory.makeString("f");
    const84 = termFactory.makeString("71");
    constLocationInfo47 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const84, localvardebug.const3, localvardebug.const84, localvardebug.const14});
    const85 = termFactory.makeString("73");
    constLocationInfo48 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const85, localvardebug.const15, localvardebug.const85, localvardebug.const32});
    const86 = termFactory.makeString("15");
    constLocationInfo49 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const85, localvardebug.const86, localvardebug.const85, localvardebug.const81});
    const87 = termFactory.makeString("enter2");
    const88 = termFactory.makeString("75");
    const89 = termFactory.makeString("33");
    constLocationInfo50 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const88, localvardebug.const14, localvardebug.const88, localvardebug.const89});
    constLocationInfo51 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const88, localvardebug.const6, localvardebug.const88, localvardebug.const73});
    const90 = termFactory.makeString("name");
    constLocationInfo52 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const88, localvardebug.const14, localvardebug.const88, localvardebug.const36});
    constLocationInfo53 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const77, localvardebug.const16, localvardebug.const77, localvardebug.const22});
    constLocationInfo54 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const77, localvardebug.const19, localvardebug.const77, localvardebug.const30});
    const91 = termFactory.makeString("c");
    const92 = termFactory.makeString("7");
    constLocationInfo55 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const77, localvardebug.const16, localvardebug.const77, localvardebug.const92});
    constLocationInfo56 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const80, localvardebug.const15, localvardebug.const80, localvardebug.const81});
    const93 = termFactory.makeString("23");
    constLocationInfo57 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const80, localvardebug.const86, localvardebug.const80, localvardebug.const93});
    const94 = termFactory.makeString("exit2");
    const95 = termFactory.makeString("get-function-name");
    const96 = termFactory.makeString("79");
    const97 = termFactory.makeString("80");
    constLocationInfo58 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const96, localvardebug.const23, localvardebug.const97, localvardebug.const72});
    const98 = termFactory.makeString("16");
    constLocationInfo59 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const97, localvardebug.const19, localvardebug.const97, localvardebug.const98});
    const99 = termFactory.makeString("find-comment-by-name");
    const100 = termFactory.makeString("89");
    constLocationInfo60 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const69, localvardebug.const23, localvardebug.const100, localvardebug.const81});
    constLocationInfo61 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const69, localvardebug.const81, localvardebug.const69, localvardebug.const72});
    const101 = termFactory.makeString("83");
    constLocationInfo62 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const101, localvardebug.const3, localvardebug.const101, localvardebug.const8});
    const102 = termFactory.makeString("84");
    constLocationInfo63 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const102, localvardebug.const15, localvardebug.const102, localvardebug.const32});
    constLocationInfo64 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const102, localvardebug.const86, localvardebug.const102, localvardebug.const81});
    const103 = termFactory.makeString("enter3");
    const104 = termFactory.makeString("86");
    constLocationInfo65 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const104, localvardebug.const3, localvardebug.const104, localvardebug.const34});
    const105 = termFactory.makeString("44");
    constLocationInfo66 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const104, localvardebug.const46, localvardebug.const104, localvardebug.const105});
    constLocationInfo67 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const104, localvardebug.const28, localvardebug.const104, localvardebug.const22});
    const106 = termFactory.makeString("c-filtered*");
    constLocationInfo68 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const104, localvardebug.const3, localvardebug.const104, localvardebug.const27});
    const107 = termFactory.makeString("87");
    constLocationInfo69 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const107, localvardebug.const8, localvardebug.const107, localvardebug.const42});
    constLocationInfo70 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const107, localvardebug.const54, localvardebug.const107, localvardebug.const74});
    constLocationInfo71 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const107, localvardebug.const81, localvardebug.const107, localvardebug.const89});
    const108 = termFactory.makeString("stuff:");
    const109 = termFactory.makeString("36");
    constLocationInfo72 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const107, localvardebug.const109, localvardebug.const107, localvardebug.const47});
    const110 = termFactory.makeString("comment");
    constLocationInfo73 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const107, localvardebug.const8, localvardebug.const107, localvardebug.const19});
    constLocationInfo74 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const100, localvardebug.const15, localvardebug.const100, localvardebug.const81});
    constLocationInfo75 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const100, localvardebug.const86, localvardebug.const100, localvardebug.const93});
    const111 = termFactory.makeString("exit3");
    const112 = termFactory.makeString("is-empty");
    const113 = termFactory.makeString("95");
    constLocationInfo76 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const113, localvardebug.const23, localvardebug.const113, localvardebug.const98});
    constLocationInfo77 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const113, localvardebug.const6, localvardebug.const113, localvardebug.const98});
    const114 = termFactory.makeString("first");
    const115 = termFactory.makeString("98");
    const116 = termFactory.makeString("101");
    constLocationInfo78 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const115, localvardebug.const23, localvardebug.const116, localvardebug.const32});
    constLocationInfo79 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const116, localvardebug.const31, localvardebug.const116, localvardebug.const81});
    const117 = termFactory.makeString("first exit");
    const118 = termFactory.makeString("99");
    constLocationInfo80 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const118, localvardebug.const3, localvardebug.const118, localvardebug.const28});
    constLocationInfo81 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const118, localvardebug.const15, localvardebug.const118, localvardebug.const32});
    const119 = termFactory.makeString("first enter: ");
    const120 = termFactory.makeString("100");
    constLocationInfo82 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const120, localvardebug.const14, localvardebug.const120, localvardebug.const19});
    constLocationInfo83 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const120, localvardebug.const86, localvardebug.const120, localvardebug.const82});
    const121 = termFactory.makeString("29");
    constLocationInfo84 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const120, localvardebug.const32, localvardebug.const120, localvardebug.const121});
    constLocationInfo85 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const116, localvardebug.const8, localvardebug.const116, localvardebug.const32});
    const122 = termFactory.makeString("build-c");
    const123 = termFactory.makeString("103");
    constLocationInfo86 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const123, localvardebug.const23, localvardebug.const123, localvardebug.const11});
    constLocationInfo87 = termFactory.makeAppl(localvardebug._consLocationInfo_4, new IStrategoTerm[]{localvardebug.const123, localvardebug.const19, localvardebug.const123, localvardebug.const11});
    const124 = termFactory.makeString("new");
    const125 = termFactory.makeString("created!!");
    constComment0 = termFactory.makeAppl(localvardebug._consComment_2, new IStrategoTerm[]{localvardebug.const124, localvardebug.const125});
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}