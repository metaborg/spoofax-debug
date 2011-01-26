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

@SuppressWarnings("all") public class stratego_rtg_path_0_0 extends Strategy 
{ 
  public static stratego_rtg_path_0_0 instance = new stratego_rtg_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("stratego_rtg_path_0_0");
    Fail433:
    { 
      IStrategoTerm j_1078 = null;
      IStrategoTerm k_1078 = null;
      IStrategoTerm m_1078 = null;
      IStrategoTerm n_1078 = null;
      IStrategoTerm o_1078 = null;
      m_1078 = term;
      j_1078 = transformer_debug.const571;
      n_1078 = m_1078;
      k_1078 = transformer_debug.const612;
      o_1078 = n_1078;
      term = s_enter_0_3.instance.invoke(context, o_1078, j_1078, k_1078, transformer_debug.constLocationInfo1161);
      if(term == null)
        break Fail433;
      IStrategoTerm term301 = term;
      Success212:
      { 
        Fail434:
        { 
          IStrategoTerm p_1078 = null;
          IStrategoTerm q_1078 = null;
          IStrategoTerm s_1078 = null;
          IStrategoTerm t_1078 = null;
          IStrategoTerm u_1078 = null;
          s_1078 = term;
          p_1078 = transformer_debug.const571;
          t_1078 = s_1078;
          q_1078 = transformer_debug.const612;
          u_1078 = t_1078;
          term = s_step_0_3.instance.invoke(context, u_1078, p_1078, q_1078, transformer_debug.constLocationInfo1162);
          if(term == null)
            break Fail434;
          term = transformer_debug.const614;
          { 
            IStrategoTerm v_1078 = null;
            IStrategoTerm w_1078 = null;
            IStrategoTerm y_1078 = null;
            IStrategoTerm z_1078 = null;
            IStrategoTerm a_1079 = null;
            y_1078 = term;
            v_1078 = transformer_debug.const571;
            z_1078 = y_1078;
            w_1078 = transformer_debug.const612;
            a_1079 = z_1078;
            term = s_exit_0_3.instance.invoke(context, a_1079, v_1078, w_1078, transformer_debug.constLocationInfo1161);
            if(term == null)
              break Fail433;
            if(true)
              break Success212;
          }
        }
        term = term301;
        IStrategoTerm b_1079 = null;
        IStrategoTerm c_1079 = null;
        IStrategoTerm e_1079 = null;
        IStrategoTerm f_1079 = null;
        IStrategoTerm g_1079 = null;
        e_1079 = term;
        b_1079 = transformer_debug.const571;
        f_1079 = e_1079;
        c_1079 = transformer_debug.const612;
        g_1079 = f_1079;
        term = s_exit_0_3.instance.invoke(context, g_1079, b_1079, c_1079, transformer_debug.constLocationInfo1161);
        if(term == null)
          break Fail433;
        if(true)
          break Fail433;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}