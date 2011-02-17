package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class localvar_rtree  
{ 
  protected static final boolean TRACES_ENABLED = true;

  protected static ITermFactory constantFactory;

  private static WeakReference<Context> initedContext;

  private static boolean isIniting;

  protected static IStrategoTerm constComment1;

  protected static IStrategoTerm const235;

  protected static IStrategoTerm const234;

  protected static IStrategoTerm constLocationInfo156;

  protected static IStrategoTerm constLocationInfo155;

  protected static IStrategoTerm const233;

  protected static IStrategoTerm const232;

  protected static IStrategoTerm constLocationInfo154;

  protected static IStrategoTerm const231;

  protected static IStrategoTerm constLocationInfo153;

  protected static IStrategoTerm const230;

  protected static IStrategoTerm constLocationInfo152;

  protected static IStrategoTerm const229;

  protected static IStrategoTerm constLocationInfo151;

  protected static IStrategoTerm constLocationInfo150;

  protected static IStrategoTerm const228;

  protected static IStrategoTerm constLocationInfo149;

  protected static IStrategoTerm const227;

  protected static IStrategoTerm const226;

  protected static IStrategoTerm const225;

  protected static IStrategoTerm constLocationInfo148;

  protected static IStrategoTerm constLocationInfo147;

  protected static IStrategoTerm const224;

  protected static IStrategoTerm const223;

  protected static IStrategoTerm const222;

  protected static IStrategoTerm constLocationInfo146;

  protected static IStrategoTerm const221;

  protected static IStrategoTerm constLocationInfo145;

  protected static IStrategoTerm const220;

  protected static IStrategoTerm const219;

  protected static IStrategoTerm constLocationInfo144;

  protected static IStrategoTerm constLocationInfo143;

  protected static IStrategoTerm constLocationInfo142;

  protected static IStrategoTerm constLocationInfo141;

  protected static IStrategoTerm const218;

  protected static IStrategoTerm constLocationInfo140;

  protected static IStrategoTerm constLocationInfo139;

  protected static IStrategoTerm const217;

  protected static IStrategoTerm constLocationInfo138;

  protected static IStrategoTerm const216;

  protected static IStrategoTerm constLocationInfo137;

  protected static IStrategoTerm const215;

  protected static IStrategoTerm constLocationInfo136;

  protected static IStrategoTerm constLocationInfo135;

  protected static IStrategoTerm const214;

  protected static IStrategoTerm const213;

  protected static IStrategoTerm const212;

  protected static IStrategoTerm constLocationInfo134;

  protected static IStrategoTerm const211;

  protected static IStrategoTerm constLocationInfo133;

  protected static IStrategoTerm const210;

  protected static IStrategoTerm const209;

  protected static IStrategoTerm const208;

  protected static IStrategoTerm constLocationInfo132;

  protected static IStrategoTerm const207;

  protected static IStrategoTerm const206;

  protected static IStrategoTerm constLocationInfo131;

  protected static IStrategoTerm constLocationInfo130;

  protected static IStrategoTerm constLocationInfo129;

  protected static IStrategoTerm const205;

  protected static IStrategoTerm constLocationInfo128;

  protected static IStrategoTerm constLocationInfo127;

  protected static IStrategoTerm const204;

  protected static IStrategoTerm const203;

  protected static IStrategoTerm constLocationInfo126;

  protected static IStrategoTerm const202;

  protected static IStrategoTerm const201;

  protected static IStrategoTerm constLocationInfo125;

  protected static IStrategoTerm const200;

  protected static IStrategoTerm const199;

  protected static IStrategoTerm constLocationInfo124;

  protected static IStrategoTerm const198;

  protected static IStrategoTerm const197;

  protected static IStrategoTerm const196;

  protected static IStrategoTerm constLocationInfo123;

  protected static IStrategoTerm const195;

  protected static IStrategoTerm constLocationInfo122;

  protected static IStrategoTerm const194;

  protected static IStrategoTerm const193;

  protected static IStrategoTerm constLocationInfo121;

  protected static IStrategoTerm const192;

  protected static IStrategoTerm const191;

  protected static IStrategoTerm const190;

  protected static IStrategoTerm constLocationInfo120;

  protected static IStrategoTerm const189;

  protected static IStrategoTerm constLocationInfo119;

  protected static IStrategoTerm const188;

  protected static IStrategoTerm constLocationInfo118;

  protected static IStrategoTerm const187;

  protected static IStrategoTerm constLocationInfo117;

  protected static IStrategoTerm constLocationInfo116;

  protected static IStrategoTerm const186;

  protected static IStrategoTerm constLocationInfo115;

  protected static IStrategoTerm const185;

  protected static IStrategoTerm constLocationInfo114;

  protected static IStrategoTerm const184;

  protected static IStrategoTerm const183;

  protected static IStrategoTerm const182;

  protected static IStrategoTerm const181;

  protected static IStrategoTerm constLocationInfo113;

  protected static IStrategoTerm const180;

  protected static IStrategoTerm constLocationInfo112;

  protected static IStrategoTerm constLocationInfo111;

  protected static IStrategoTerm const179;

  protected static IStrategoTerm constLocationInfo110;

  protected static IStrategoTerm constLocationInfo109;

  protected static IStrategoTerm const178;

  protected static IStrategoTerm constLocationInfo108;

  protected static IStrategoTerm const177;

  protected static IStrategoTerm const176;

  protected static IStrategoTerm const175;

  protected static IStrategoTerm const174;

  protected static IStrategoTerm constLocationInfo107;

  protected static IStrategoTerm const173;

  protected static IStrategoTerm constLocationInfo106;

  protected static IStrategoTerm constLocationInfo105;

  protected static IStrategoTerm const172;

  protected static IStrategoTerm const171;

  protected static IStrategoTerm constLocationInfo104;

  protected static IStrategoTerm constLocationInfo103;

  protected static IStrategoTerm const170;

  protected static IStrategoTerm const169;

  protected static IStrategoTerm constLocationInfo102;

  protected static IStrategoTerm const168;

  protected static IStrategoTerm const167;

  protected static IStrategoTerm const166;

  protected static IStrategoTerm const165;

  protected static IStrategoTerm const164;

  protected static IStrategoTerm constLocationInfo101;

  protected static IStrategoTerm const163;

  protected static IStrategoTerm constLocationInfo100;

  protected static IStrategoTerm const162;

  protected static IStrategoTerm constLocationInfo99;

  protected static IStrategoTerm constLocationInfo98;

  protected static IStrategoTerm const161;

  protected static IStrategoTerm const160;

  protected static IStrategoTerm constLocationInfo97;

  protected static IStrategoTerm constLocationInfo96;

  protected static IStrategoTerm const159;

  protected static IStrategoTerm constLocationInfo95;

  protected static IStrategoTerm const158;

  protected static IStrategoTerm constLocationInfo94;

  protected static IStrategoTerm const157;

  protected static IStrategoTerm const156;

  protected static IStrategoTerm constLocationInfo93;

  protected static IStrategoTerm const155;

  protected static IStrategoTerm const154;

  protected static IStrategoTerm constLocationInfo92;

  protected static IStrategoTerm const153;

  protected static IStrategoTerm const152;

  protected static IStrategoTerm const151;

  protected static IStrategoTerm const150;

  protected static IStrategoTerm constLocationInfo91;

  protected static IStrategoTerm const149;

  protected static IStrategoTerm const148;

  protected static IStrategoTerm const147;

  protected static IStrategoTerm const146;

  protected static IStrategoTerm const145;

  protected static IStrategoTerm constLocationInfo90;

  protected static IStrategoTerm const144;

  protected static IStrategoTerm const143;

  protected static IStrategoTerm constLocationInfo89;

  protected static IStrategoTerm const142;

  protected static IStrategoTerm constLocationInfo88;

  protected static IStrategoTerm const141;

  protected static IStrategoTerm constLocationInfo87;

  protected static IStrategoTerm const140;

  protected static IStrategoTerm const139;

  protected static IStrategoTerm const138;

  protected static IStrategoTerm constLocationInfo86;

  protected static IStrategoTerm const137;

  protected static IStrategoTerm const136;

  protected static IStrategoTerm const135;

  protected static IStrategoTerm const134;

  protected static IStrategoTerm constLocationInfo85;

  protected static IStrategoTerm const133;

  protected static IStrategoTerm constLocationInfo84;

  protected static IStrategoTerm const132;

  protected static IStrategoTerm const131;

  protected static IStrategoTerm constLocationInfo83;

  protected static IStrategoTerm const130;

  protected static IStrategoTerm const129;

  protected static IStrategoTerm const128;

  protected static IStrategoTerm const127;

  protected static IStrategoTerm const126;

  protected static IStrategoTerm const125;

  public static IStrategoConstructor _consConc_2;

  public static IStrategoConstructor _consNone_0;

  public static IStrategoConstructor _consSome_1;

  protected static IStrategoConstructor _consLocationInfo_4;

  public static IStrategoConstructor _consProgram_2;

  public static IStrategoConstructor _consComment_2;

  public static IStrategoConstructor _consFunction_2;

  public static Context init(Context context)
  { 
    synchronized(localvar_rtree.class)
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
          context.registerComponent("localvar_rtree");
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
        result = context.invokeStrategyCLI(main_0_0.instance, "localvar_rtree", args);
      }
      finally
      { 
        context.getIOAgent().closeAllFiles();
      }
      if(result == null)
      { 
        System.err.println("localvar_rtree" + (TRACES_ENABLED ? ": rewriting failed, trace:" : ": rewriting failed"));
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
      return context.invokeStrategyCLI(main_0_0.instance, "localvar_rtree", args);
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
    const125 = termFactory.makeString("localvar.str");
    const126 = termFactory.makeString("main");
    const127 = termFactory.makeString("31");
    const128 = termFactory.makeString("3");
    const129 = termFactory.makeString("32");
    const130 = termFactory.makeString("21");
    constLocationInfo83 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const127, localvar_rtree.const128, localvar_rtree.const129, localvar_rtree.const130});
    const131 = termFactory.makeString("13");
    const132 = termFactory.makeString("20");
    constLocationInfo84 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const129, localvar_rtree.const131, localvar_rtree.const129, localvar_rtree.const132});
    const133 = termFactory.makeString("5");
    constLocationInfo85 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const129, localvar_rtree.const133, localvar_rtree.const129, localvar_rtree.const130});
    const134 = termFactory.makeString("execute");
    const135 = termFactory.makeString("37");
    const136 = termFactory.makeString("40");
    const137 = termFactory.makeString("38");
    constLocationInfo86 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const135, localvar_rtree.const128, localvar_rtree.const136, localvar_rtree.const137});
    const138 = termFactory.makeString("input");
    const139 = termFactory.makeString("4");
    const140 = termFactory.makeString("9");
    constLocationInfo87 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const137, localvar_rtree.const139, localvar_rtree.const137, localvar_rtree.const140});
    const141 = termFactory.makeString("6");
    constLocationInfo88 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const136, localvar_rtree.const141, localvar_rtree.const136, localvar_rtree.const137});
    const142 = termFactory.makeString("17");
    constLocationInfo89 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const136, localvar_rtree.const142, localvar_rtree.const136, localvar_rtree.const127});
    const143 = termFactory.makeString("output");
    const144 = termFactory.makeString("12");
    constLocationInfo90 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const136, localvar_rtree.const141, localvar_rtree.const136, localvar_rtree.const144});
    const145 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'execute'");
    const146 = termFactory.makeString("match-comments");
    const147 = termFactory.makeString("43");
    const148 = termFactory.makeString("2");
    const149 = termFactory.makeString("49");
    constLocationInfo91 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const147, localvar_rtree.const148, localvar_rtree.const149, localvar_rtree.const135});
    const150 = termFactory.makeString("definitions*");
    const151 = termFactory.makeString("45");
    const152 = termFactory.makeString("14");
    const153 = termFactory.makeString("26");
    constLocationInfo92 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const151, localvar_rtree.const152, localvar_rtree.const151, localvar_rtree.const153});
    const154 = termFactory.makeString("47");
    const155 = termFactory.makeString("39");
    constLocationInfo93 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const154, localvar_rtree.const139, localvar_rtree.const154, localvar_rtree.const155});
    const156 = termFactory.makeString("11");
    const157 = termFactory.makeString("25");
    constLocationInfo94 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const154, localvar_rtree.const156, localvar_rtree.const154, localvar_rtree.const157});
    const158 = termFactory.makeString("f*");
    constLocationInfo95 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const154, localvar_rtree.const139, localvar_rtree.const154, localvar_rtree.const141});
    const159 = termFactory.makeString("48");
    constLocationInfo96 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const159, localvar_rtree.const141, localvar_rtree.const159, localvar_rtree.const136});
    constLocationInfo97 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const159, localvar_rtree.const131, localvar_rtree.const159, localvar_rtree.const153});
    const160 = termFactory.makeString("c*");
    const161 = termFactory.makeString("8");
    constLocationInfo98 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const159, localvar_rtree.const141, localvar_rtree.const159, localvar_rtree.const161});
    constLocationInfo99 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const149, localvar_rtree.const141, localvar_rtree.const149, localvar_rtree.const135});
    const162 = termFactory.makeString("27");
    constLocationInfo100 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const149, localvar_rtree.const152, localvar_rtree.const149, localvar_rtree.const162});
    const163 = termFactory.makeString("out");
    constLocationInfo101 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const149, localvar_rtree.const141, localvar_rtree.const149, localvar_rtree.const140});
    const164 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-comments'");
    const165 = termFactory.makeString("find-functions");
    const166 = termFactory.makeString("52");
    const167 = termFactory.makeString("55");
    const168 = termFactory.makeString("54");
    constLocationInfo102 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const166, localvar_rtree.const148, localvar_rtree.const167, localvar_rtree.const168});
    const169 = termFactory.makeString("definition*");
    const170 = termFactory.makeString("53");
    constLocationInfo103 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const170, localvar_rtree.const128, localvar_rtree.const170, localvar_rtree.const152});
    constLocationInfo104 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const167, localvar_rtree.const139, localvar_rtree.const167, localvar_rtree.const168});
    const171 = termFactory.makeString("19");
    const172 = termFactory.makeString("41");
    constLocationInfo105 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const167, localvar_rtree.const171, localvar_rtree.const167, localvar_rtree.const172});
    constLocationInfo106 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const167, localvar_rtree.const153, localvar_rtree.const167, localvar_rtree.const136});
    const173 = termFactory.makeString("functions*");
    constLocationInfo107 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const167, localvar_rtree.const139, localvar_rtree.const167, localvar_rtree.const152});
    const174 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-functions'");
    const175 = termFactory.makeString("find-comments");
    const176 = termFactory.makeString("57");
    const177 = termFactory.makeString("60");
    constLocationInfo108 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const176, localvar_rtree.const148, localvar_rtree.const177, localvar_rtree.const166});
    const178 = termFactory.makeString("58");
    constLocationInfo109 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const178, localvar_rtree.const128, localvar_rtree.const178, localvar_rtree.const152});
    constLocationInfo110 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const177, localvar_rtree.const139, localvar_rtree.const177, localvar_rtree.const166});
    const179 = termFactory.makeString("18");
    constLocationInfo111 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const177, localvar_rtree.const179, localvar_rtree.const177, localvar_rtree.const155});
    constLocationInfo112 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const177, localvar_rtree.const157, localvar_rtree.const177, localvar_rtree.const137});
    const180 = termFactory.makeString("comments*");
    constLocationInfo113 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const177, localvar_rtree.const139, localvar_rtree.const177, localvar_rtree.const131});
    const181 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comments'");
    const182 = termFactory.makeString("match-f-and-c");
    const183 = termFactory.makeString("62");
    const184 = termFactory.makeString("66");
    constLocationInfo114 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const183, localvar_rtree.const148, localvar_rtree.const184, localvar_rtree.const167});
    const185 = termFactory.makeString("63");
    constLocationInfo115 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const185, localvar_rtree.const139, localvar_rtree.const185, localvar_rtree.const141});
    const186 = termFactory.makeString("10");
    constLocationInfo116 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const185, localvar_rtree.const161, localvar_rtree.const185, localvar_rtree.const186});
    constLocationInfo117 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const184, localvar_rtree.const139, localvar_rtree.const184, localvar_rtree.const167});
    const187 = termFactory.makeString("51");
    constLocationInfo118 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const184, localvar_rtree.const142, localvar_rtree.const184, localvar_rtree.const187});
    const188 = termFactory.makeString("50");
    constLocationInfo119 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const184, localvar_rtree.const130, localvar_rtree.const184, localvar_rtree.const188});
    const189 = termFactory.makeString("matches*");
    constLocationInfo120 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const184, localvar_rtree.const139, localvar_rtree.const184, localvar_rtree.const144});
    const190 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'match-f-and-c'");
    const191 = termFactory.makeString("try-find-comment-by-name");
    const192 = termFactory.makeString("68");
    constLocationInfo121 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const192, localvar_rtree.const148, localvar_rtree.const192, localvar_rtree.const176});
    const193 = termFactory.makeString("28");
    const194 = termFactory.makeString("30");
    constLocationInfo122 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const192, localvar_rtree.const193, localvar_rtree.const192, localvar_rtree.const194});
    const195 = termFactory.makeString("34");
    constLocationInfo123 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const192, localvar_rtree.const195, localvar_rtree.const192, localvar_rtree.const176});
    const196 = termFactory.makeString("find-comment-match");
    const197 = termFactory.makeString("70");
    const198 = termFactory.makeString("75");
    constLocationInfo124 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const197, localvar_rtree.const148, localvar_rtree.const198, localvar_rtree.const147});
    const199 = termFactory.makeString("22");
    const200 = termFactory.makeString("24");
    constLocationInfo125 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const197, localvar_rtree.const199, localvar_rtree.const197, localvar_rtree.const200});
    const201 = termFactory.makeString("f");
    const202 = termFactory.makeString("71");
    constLocationInfo126 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const202, localvar_rtree.const128, localvar_rtree.const202, localvar_rtree.const139});
    const203 = termFactory.makeString("74");
    const204 = termFactory.makeString("33");
    constLocationInfo127 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const203, localvar_rtree.const139, localvar_rtree.const203, localvar_rtree.const204});
    constLocationInfo128 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const203, localvar_rtree.const131, localvar_rtree.const203, localvar_rtree.const194});
    const205 = termFactory.makeString("name");
    constLocationInfo129 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const203, localvar_rtree.const139, localvar_rtree.const203, localvar_rtree.const161});
    constLocationInfo130 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const198, localvar_rtree.const141, localvar_rtree.const198, localvar_rtree.const147});
    constLocationInfo131 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const198, localvar_rtree.const144, localvar_rtree.const198, localvar_rtree.const155});
    const206 = termFactory.makeString("c");
    const207 = termFactory.makeString("7");
    constLocationInfo132 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const198, localvar_rtree.const141, localvar_rtree.const198, localvar_rtree.const207});
    const208 = termFactory.makeString("get-function-name");
    const209 = termFactory.makeString("77");
    const210 = termFactory.makeString("78");
    constLocationInfo133 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const209, localvar_rtree.const148, localvar_rtree.const210, localvar_rtree.const193});
    const211 = termFactory.makeString("16");
    constLocationInfo134 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const210, localvar_rtree.const144, localvar_rtree.const210, localvar_rtree.const211});
    const212 = termFactory.makeString("find-comment-by-name");
    const213 = termFactory.makeString("80");
    const214 = termFactory.makeString("84");
    constLocationInfo135 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const213, localvar_rtree.const148, localvar_rtree.const214, localvar_rtree.const167});
    constLocationInfo136 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const213, localvar_rtree.const200, localvar_rtree.const213, localvar_rtree.const193});
    const215 = termFactory.makeString("81");
    constLocationInfo137 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const215, localvar_rtree.const128, localvar_rtree.const215, localvar_rtree.const133});
    const216 = termFactory.makeString("83");
    constLocationInfo138 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const216, localvar_rtree.const128, localvar_rtree.const216, localvar_rtree.const159});
    const217 = termFactory.makeString("44");
    constLocationInfo139 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const216, localvar_rtree.const171, localvar_rtree.const216, localvar_rtree.const217});
    constLocationInfo140 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const216, localvar_rtree.const153, localvar_rtree.const216, localvar_rtree.const147});
    const218 = termFactory.makeString("c-filtered*");
    constLocationInfo141 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const216, localvar_rtree.const128, localvar_rtree.const216, localvar_rtree.const152});
    constLocationInfo142 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const214, localvar_rtree.const133, localvar_rtree.const214, localvar_rtree.const167});
    constLocationInfo143 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const214, localvar_rtree.const179, localvar_rtree.const214, localvar_rtree.const195});
    constLocationInfo144 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const214, localvar_rtree.const200, localvar_rtree.const214, localvar_rtree.const204});
    const219 = termFactory.makeString("stuff:");
    const220 = termFactory.makeString("36");
    constLocationInfo145 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const214, localvar_rtree.const220, localvar_rtree.const214, localvar_rtree.const172});
    const221 = termFactory.makeString("comment");
    constLocationInfo146 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const214, localvar_rtree.const133, localvar_rtree.const214, localvar_rtree.const144});
    const222 = termFactory.makeString("Internal error: with clause failed unexpectedly in rule 'find-comment-by-name'");
    const223 = termFactory.makeString("is-empty");
    const224 = termFactory.makeString("91");
    constLocationInfo147 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const224, localvar_rtree.const148, localvar_rtree.const224, localvar_rtree.const211});
    constLocationInfo148 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const224, localvar_rtree.const131, localvar_rtree.const224, localvar_rtree.const211});
    const225 = termFactory.makeString("first");
    const226 = termFactory.makeString("94");
    const227 = termFactory.makeString("96");
    constLocationInfo149 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const226, localvar_rtree.const148, localvar_rtree.const227, localvar_rtree.const194});
    const228 = termFactory.makeString("95");
    constLocationInfo150 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const228, localvar_rtree.const128, localvar_rtree.const228, localvar_rtree.const132});
    constLocationInfo151 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const228, localvar_rtree.const140, localvar_rtree.const228, localvar_rtree.const171});
    const229 = termFactory.makeString("first: ");
    constLocationInfo152 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const227, localvar_rtree.const139, localvar_rtree.const227, localvar_rtree.const144});
    const230 = termFactory.makeString("15");
    constLocationInfo153 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const227, localvar_rtree.const230, localvar_rtree.const227, localvar_rtree.const199});
    const231 = termFactory.makeString("29");
    constLocationInfo154 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const227, localvar_rtree.const157, localvar_rtree.const227, localvar_rtree.const231});
    const232 = termFactory.makeString("build-c");
    const233 = termFactory.makeString("98");
    constLocationInfo155 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const233, localvar_rtree.const148, localvar_rtree.const233, localvar_rtree.const136});
    constLocationInfo156 = termFactory.makeAppl(localvar_rtree._consLocationInfo_4, new IStrategoTerm[]{localvar_rtree.const233, localvar_rtree.const144, localvar_rtree.const233, localvar_rtree.const136});
    const234 = termFactory.makeString("new");
    const235 = termFactory.makeString("created!!");
    constComment1 = termFactory.makeAppl(localvar_rtree._consComment_2, new IStrategoTerm[]{localvar_rtree.const234, localvar_rtree.const235});
  }

  public static void registerInterop(org.spoofax.interpreter.core.IContext context, Context compiledContext)
  { 
    new InteropRegisterer().registerLazy(context, compiledContext, InteropRegisterer.class.getClassLoader());
  }
}