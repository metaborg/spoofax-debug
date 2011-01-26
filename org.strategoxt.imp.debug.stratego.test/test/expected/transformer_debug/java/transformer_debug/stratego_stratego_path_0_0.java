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

@SuppressWarnings("all") public class stratego_stratego_path_0_0 extends Strategy 
{ 
  public static stratego_stratego_path_0_0 instance = new stratego_stratego_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("stratego_stratego_path_0_0");
    Fail427:
    { 
      IStrategoTerm p_1075 = null;
      IStrategoTerm q_1075 = null;
      IStrategoTerm s_1075 = null;
      IStrategoTerm t_1075 = null;
      IStrategoTerm u_1075 = null;
      s_1075 = term;
      p_1075 = transformer_debug.const571;
      t_1075 = s_1075;
      q_1075 = transformer_debug.const605;
      u_1075 = t_1075;
      term = s_enter_0_3.instance.invoke(context, u_1075, p_1075, q_1075, transformer_debug.constLocationInfo1155);
      if(term == null)
        break Fail427;
      IStrategoTerm term298 = term;
      Success209:
      { 
        Fail428:
        { 
          IStrategoTerm v_1075 = null;
          IStrategoTerm w_1075 = null;
          IStrategoTerm y_1075 = null;
          IStrategoTerm z_1075 = null;
          IStrategoTerm a_1076 = null;
          y_1075 = term;
          v_1075 = transformer_debug.const571;
          z_1075 = y_1075;
          w_1075 = transformer_debug.const605;
          a_1076 = z_1075;
          term = s_step_0_3.instance.invoke(context, a_1076, v_1075, w_1075, transformer_debug.constLocationInfo1156);
          if(term == null)
            break Fail428;
          term = transformer_debug.const606;
          { 
            IStrategoTerm b_1076 = null;
            IStrategoTerm c_1076 = null;
            IStrategoTerm e_1076 = null;
            IStrategoTerm f_1076 = null;
            IStrategoTerm g_1076 = null;
            e_1076 = term;
            b_1076 = transformer_debug.const571;
            f_1076 = e_1076;
            c_1076 = transformer_debug.const605;
            g_1076 = f_1076;
            term = s_exit_0_3.instance.invoke(context, g_1076, b_1076, c_1076, transformer_debug.constLocationInfo1155);
            if(term == null)
              break Fail427;
            if(true)
              break Success209;
          }
        }
        term = term298;
        IStrategoTerm h_1076 = null;
        IStrategoTerm i_1076 = null;
        IStrategoTerm k_1076 = null;
        IStrategoTerm l_1076 = null;
        IStrategoTerm m_1076 = null;
        k_1076 = term;
        h_1076 = transformer_debug.const571;
        l_1076 = k_1076;
        i_1076 = transformer_debug.const605;
        m_1076 = l_1076;
        term = s_exit_0_3.instance.invoke(context, m_1076, h_1076, i_1076, transformer_debug.constLocationInfo1155);
        if(term == null)
          break Fail427;
        if(true)
          break Fail427;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}