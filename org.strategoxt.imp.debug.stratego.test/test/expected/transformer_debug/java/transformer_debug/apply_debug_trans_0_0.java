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

@SuppressWarnings("all") public class apply_debug_trans_0_0 extends Strategy 
{ 
  public static apply_debug_trans_0_0 instance = new apply_debug_trans_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("apply_debug_trans_0_0");
    Fail437:
    { 
      IStrategoTerm i_1100 = null;
      IStrategoTerm j_1100 = null;
      IStrategoTerm l_1100 = null;
      IStrategoTerm m_1100 = null;
      IStrategoTerm n_1100 = null;
      l_1100 = term;
      i_1100 = transformer_debug.const618;
      m_1100 = l_1100;
      j_1100 = transformer_debug.const619;
      n_1100 = m_1100;
      term = s_enter_0_3.instance.invoke(context, n_1100, i_1100, j_1100, transformer_debug.constLocationInfo1165);
      if(term == null)
        break Fail437;
      IStrategoTerm term303 = term;
      Success214:
      { 
        Fail438:
        { 
          IStrategoTerm term304 = term;
          Success215:
          { 
            Fail439:
            { 
              IStrategoTerm o_1100 = null;
              IStrategoTerm p_1100 = null;
              IStrategoTerm r_1100 = null;
              IStrategoTerm s_1100 = null;
              IStrategoTerm t_1100 = null;
              r_1100 = term;
              o_1100 = transformer_debug.const618;
              s_1100 = r_1100;
              p_1100 = transformer_debug.const619;
              t_1100 = s_1100;
              term = s_step_0_3.instance.invoke(context, t_1100, o_1100, p_1100, transformer_debug.constLocationInfo1166);
              if(term == null)
                break Fail439;
              term = apply_debug_trans_internal_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail439;
              if(true)
                break Success215;
            }
            term = term304;
            IStrategoTerm u_1100 = null;
            IStrategoTerm v_1100 = null;
            IStrategoTerm x_1100 = null;
            IStrategoTerm y_1100 = null;
            IStrategoTerm z_1100 = null;
            x_1100 = term;
            u_1100 = transformer_debug.const618;
            y_1100 = x_1100;
            v_1100 = transformer_debug.const619;
            z_1100 = y_1100;
            term = s_step_0_3.instance.invoke(context, z_1100, u_1100, v_1100, transformer_debug.constLocationInfo1167);
            if(term == null)
              break Fail438;
            term = apply_debug_trans_error_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail438;
          }
          { 
            IStrategoTerm a_1101 = null;
            IStrategoTerm b_1101 = null;
            IStrategoTerm d_1101 = null;
            IStrategoTerm e_1101 = null;
            IStrategoTerm f_1101 = null;
            d_1101 = term;
            a_1101 = transformer_debug.const618;
            e_1101 = d_1101;
            b_1101 = transformer_debug.const619;
            f_1101 = e_1101;
            term = s_exit_0_3.instance.invoke(context, f_1101, a_1101, b_1101, transformer_debug.constLocationInfo1165);
            if(term == null)
              break Fail437;
            if(true)
              break Success214;
          }
        }
        term = term303;
        IStrategoTerm g_1101 = null;
        IStrategoTerm h_1101 = null;
        IStrategoTerm j_1101 = null;
        IStrategoTerm k_1101 = null;
        IStrategoTerm l_1101 = null;
        j_1101 = term;
        g_1101 = transformer_debug.const618;
        k_1101 = j_1101;
        h_1101 = transformer_debug.const619;
        l_1101 = k_1101;
        term = s_exit_0_3.instance.invoke(context, l_1101, g_1101, h_1101, transformer_debug.constLocationInfo1165);
        if(term == null)
          break Fail437;
        if(true)
          break Fail437;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}