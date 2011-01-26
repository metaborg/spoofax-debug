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

@SuppressWarnings("all") public class stratego_sdf2_path_0_0 extends Strategy 
{ 
  public static stratego_sdf2_path_0_0 instance = new stratego_sdf2_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("stratego_sdf2_path_0_0");
    Fail425:
    { 
      IStrategoTerm r_1074 = null;
      IStrategoTerm s_1074 = null;
      IStrategoTerm u_1074 = null;
      IStrategoTerm v_1074 = null;
      IStrategoTerm w_1074 = null;
      u_1074 = term;
      r_1074 = transformer_debug.const571;
      v_1074 = u_1074;
      s_1074 = transformer_debug.const602;
      w_1074 = v_1074;
      term = s_enter_0_3.instance.invoke(context, w_1074, r_1074, s_1074, transformer_debug.constLocationInfo1153);
      if(term == null)
        break Fail425;
      IStrategoTerm term297 = term;
      Success208:
      { 
        Fail426:
        { 
          IStrategoTerm x_1074 = null;
          IStrategoTerm y_1074 = null;
          IStrategoTerm a_1075 = null;
          IStrategoTerm b_1075 = null;
          IStrategoTerm c_1075 = null;
          a_1075 = term;
          x_1074 = transformer_debug.const571;
          b_1075 = a_1075;
          y_1074 = transformer_debug.const602;
          c_1075 = b_1075;
          term = s_step_0_3.instance.invoke(context, c_1075, x_1074, y_1074, transformer_debug.constLocationInfo1154);
          if(term == null)
            break Fail426;
          term = transformer_debug.const604;
          { 
            IStrategoTerm d_1075 = null;
            IStrategoTerm e_1075 = null;
            IStrategoTerm g_1075 = null;
            IStrategoTerm h_1075 = null;
            IStrategoTerm i_1075 = null;
            g_1075 = term;
            d_1075 = transformer_debug.const571;
            h_1075 = g_1075;
            e_1075 = transformer_debug.const602;
            i_1075 = h_1075;
            term = s_exit_0_3.instance.invoke(context, i_1075, d_1075, e_1075, transformer_debug.constLocationInfo1153);
            if(term == null)
              break Fail425;
            if(true)
              break Success208;
          }
        }
        term = term297;
        IStrategoTerm j_1075 = null;
        IStrategoTerm k_1075 = null;
        IStrategoTerm m_1075 = null;
        IStrategoTerm n_1075 = null;
        IStrategoTerm o_1075 = null;
        m_1075 = term;
        j_1075 = transformer_debug.const571;
        n_1075 = m_1075;
        k_1075 = transformer_debug.const602;
        o_1075 = n_1075;
        term = s_exit_0_3.instance.invoke(context, o_1075, j_1075, k_1075, transformer_debug.constLocationInfo1153);
        if(term == null)
          break Fail425;
        if(true)
          break Fail425;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}