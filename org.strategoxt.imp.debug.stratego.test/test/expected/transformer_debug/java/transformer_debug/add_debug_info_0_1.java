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

@SuppressWarnings("all") public class add_debug_info_0_1 extends Strategy 
{ 
  public static add_debug_info_0_1 instance = new add_debug_info_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_978)
  { 
    context.push("add_debug_info_0_1");
    Fail377:
    { 
      IStrategoTerm l_978 = null;
      IStrategoTerm m_978 = null;
      IStrategoTerm o_978 = null;
      IStrategoTerm p_978 = null;
      IStrategoTerm q_978 = null;
      o_978 = term;
      l_978 = transformer_debug.const513;
      p_978 = o_978;
      m_978 = transformer_debug.const515;
      q_978 = p_978;
      term = s_enter_0_3.instance.invoke(context, q_978, l_978, m_978, transformer_debug.constLocationInfo908);
      if(term == null)
        break Fail377;
      IStrategoTerm term263 = term;
      Success184:
      { 
        Fail378:
        { 
          IStrategoTerm k_978 = null;
          IStrategoTerm r_978 = null;
          IStrategoTerm s_978 = null;
          IStrategoTerm t_978 = null;
          IStrategoTerm v_978 = null;
          IStrategoTerm w_978 = null;
          IStrategoTerm x_978 = null;
          IStrategoTerm y_978 = null;
          IStrategoTerm z_978 = null;
          IStrategoTerm a_979 = null;
          IStrategoTerm c_979 = null;
          IStrategoTerm d_979 = null;
          IStrategoTerm e_979 = null;
          IStrategoTerm f_979 = null;
          IStrategoTerm g_979 = null;
          IStrategoTerm i_979 = null;
          IStrategoTerm j_979 = null;
          IStrategoTerm k_979 = null;
          IStrategoTerm l_979 = null;
          IStrategoTerm m_979 = null;
          IStrategoTerm o_979 = null;
          IStrategoTerm p_979 = null;
          IStrategoTerm q_979 = null;
          IStrategoTerm r_979 = null;
          IStrategoTerm s_979 = null;
          IStrategoTerm u_979 = null;
          IStrategoTerm v_979 = null;
          IStrategoTerm w_979 = null;
          IStrategoTerm x_979 = null;
          IStrategoTerm y_979 = null;
          IStrategoTerm a_980 = null;
          IStrategoTerm b_980 = null;
          IStrategoTerm c_980 = null;
          k_978 = term;
          v_978 = j_978;
          r_978 = transformer_debug.const513;
          w_978 = v_978;
          s_978 = transformer_debug.const515;
          x_978 = w_978;
          t_978 = transformer_debug.const238;
          y_978 = x_978;
          term = s_var_0_4.instance.invoke(context, y_978, r_978, s_978, t_978, transformer_debug.constLocationInfo909);
          if(term == null)
            break Fail378;
          c_979 = k_978;
          z_978 = transformer_debug.const513;
          d_979 = c_979;
          a_979 = transformer_debug.const515;
          e_979 = d_979;
          term = s_step_0_3.instance.invoke(context, e_979, z_978, a_979, transformer_debug.constLocationInfo910);
          if(term == null)
            break Fail378;
          term = add_step_statements_0_1.instance.invoke(context, term, j_978);
          if(term == null)
            break Fail378;
          i_979 = term;
          f_979 = transformer_debug.const513;
          j_979 = i_979;
          g_979 = transformer_debug.const515;
          k_979 = j_979;
          term = s_step_0_3.instance.invoke(context, k_979, f_979, g_979, transformer_debug.constLocationInfo911);
          if(term == null)
            break Fail378;
          term = add_var_statements_0_1.instance.invoke(context, term, j_978);
          if(term == null)
            break Fail378;
          o_979 = term;
          l_979 = transformer_debug.const513;
          p_979 = o_979;
          m_979 = transformer_debug.const515;
          q_979 = p_979;
          term = s_step_0_3.instance.invoke(context, q_979, l_979, m_979, transformer_debug.constLocationInfo912);
          if(term == null)
            break Fail378;
          term = add_s_entry_and_exit_calls_0_1.instance.invoke(context, term, j_978);
          if(term == null)
            break Fail378;
          u_979 = term;
          r_979 = transformer_debug.const513;
          v_979 = u_979;
          s_979 = transformer_debug.const515;
          w_979 = v_979;
          term = s_step_0_3.instance.invoke(context, w_979, r_979, s_979, transformer_debug.constLocationInfo913);
          if(term == null)
            break Fail378;
          term = add_r_entry_and_exit_calls_0_1.instance.invoke(context, term, j_978);
          if(term == null)
            break Fail378;
          a_980 = term;
          x_979 = transformer_debug.const513;
          b_980 = a_980;
          y_979 = transformer_debug.const515;
          c_980 = b_980;
          term = s_step_0_3.instance.invoke(context, c_980, x_979, y_979, transformer_debug.constLocationInfo914);
          if(term == null)
            break Fail378;
          term = add_s_debug_import_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail378;
          { 
            IStrategoTerm d_980 = null;
            IStrategoTerm e_980 = null;
            IStrategoTerm g_980 = null;
            IStrategoTerm h_980 = null;
            IStrategoTerm i_980 = null;
            g_980 = term;
            d_980 = transformer_debug.const513;
            h_980 = g_980;
            e_980 = transformer_debug.const515;
            i_980 = h_980;
            term = s_exit_0_3.instance.invoke(context, i_980, d_980, e_980, transformer_debug.constLocationInfo908);
            if(term == null)
              break Fail377;
            if(true)
              break Success184;
          }
        }
        term = term263;
        IStrategoTerm j_980 = null;
        IStrategoTerm k_980 = null;
        IStrategoTerm m_980 = null;
        IStrategoTerm n_980 = null;
        IStrategoTerm o_980 = null;
        m_980 = term;
        j_980 = transformer_debug.const513;
        n_980 = m_980;
        k_980 = transformer_debug.const515;
        o_980 = n_980;
        term = s_exit_0_3.instance.invoke(context, o_980, j_980, k_980, transformer_debug.constLocationInfo908);
        if(term == null)
          break Fail377;
        if(true)
          break Fail377;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}