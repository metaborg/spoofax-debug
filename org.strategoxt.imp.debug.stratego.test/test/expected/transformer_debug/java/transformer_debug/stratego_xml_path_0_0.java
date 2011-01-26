package transformer_debug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.strc.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class stratego_xml_path_0_0 extends Strategy 
{ 
  public static stratego_xml_path_0_0 instance = new stratego_xml_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("stratego_xml_path_0_0");
    Fail431:
    { 
      IStrategoTerm l_1077 = null;
      IStrategoTerm m_1077 = null;
      IStrategoTerm o_1077 = null;
      IStrategoTerm p_1077 = null;
      IStrategoTerm q_1077 = null;
      o_1077 = term;
      l_1077 = transformer_debug.const571;
      p_1077 = o_1077;
      m_1077 = transformer_debug.const609;
      q_1077 = p_1077;
      term = s_enter_0_3.instance.invoke(context, q_1077, l_1077, m_1077, transformer_debug.constLocationInfo1159);
      if(term == null)
        break Fail431;
      IStrategoTerm term300 = term;
      Success211:
      { 
        Fail432:
        { 
          IStrategoTerm r_1077 = null;
          IStrategoTerm s_1077 = null;
          IStrategoTerm u_1077 = null;
          IStrategoTerm v_1077 = null;
          IStrategoTerm w_1077 = null;
          u_1077 = term;
          r_1077 = transformer_debug.const571;
          v_1077 = u_1077;
          s_1077 = transformer_debug.const609;
          w_1077 = v_1077;
          term = s_step_0_3.instance.invoke(context, w_1077, r_1077, s_1077, transformer_debug.constLocationInfo1160);
          if(term == null)
            break Fail432;
          term = transformer_debug.const611;
          { 
            IStrategoTerm x_1077 = null;
            IStrategoTerm y_1077 = null;
            IStrategoTerm a_1078 = null;
            IStrategoTerm b_1078 = null;
            IStrategoTerm c_1078 = null;
            a_1078 = term;
            x_1077 = transformer_debug.const571;
            b_1078 = a_1078;
            y_1077 = transformer_debug.const609;
            c_1078 = b_1078;
            term = s_exit_0_3.instance.invoke(context, c_1078, x_1077, y_1077, transformer_debug.constLocationInfo1159);
            if(term == null)
              break Fail431;
            if(true)
              break Success211;
          }
        }
        term = term300;
        IStrategoTerm d_1078 = null;
        IStrategoTerm e_1078 = null;
        IStrategoTerm g_1078 = null;
        IStrategoTerm h_1078 = null;
        IStrategoTerm i_1078 = null;
        g_1078 = term;
        d_1078 = transformer_debug.const571;
        h_1078 = g_1078;
        e_1078 = transformer_debug.const609;
        i_1078 = h_1078;
        term = s_exit_0_3.instance.invoke(context, i_1078, d_1078, e_1078, transformer_debug.constLocationInfo1159);
        if(term == null)
          break Fail431;
        if(true)
          break Fail431;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}