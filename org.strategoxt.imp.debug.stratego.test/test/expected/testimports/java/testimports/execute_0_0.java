package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class execute_0_0 extends Strategy 
{ 
  public static execute_0_0 instance = new execute_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("execute_0_0");
    Fail9:
    { 
      IStrategoTerm l_6 = null;
      IStrategoTerm m_6 = null;
      IStrategoTerm p_6 = null;
      IStrategoTerm q_6 = null;
      IStrategoTerm r_6 = null;
      IStrategoTerm t_6 = null;
      IStrategoTerm u_6 = null;
      IStrategoTerm v_6 = null;
      IStrategoTerm w_6 = null;
      IStrategoTerm x_6 = null;
      IStrategoTerm y_6 = null;
      IStrategoTerm z_6 = null;
      IStrategoTerm b_7 = null;
      IStrategoTerm c_7 = null;
      IStrategoTerm d_7 = null;
      IStrategoTerm e_7 = null;
      IStrategoTerm f_7 = null;
      IStrategoTerm c_8 = null;
      IStrategoTerm d_8 = null;
      IStrategoTerm f_8 = null;
      IStrategoTerm g_8 = null;
      IStrategoTerm h_8 = null;
      l_6 = term;
      p_6 = term;
      t_6 = term;
      q_6 = testimports.const24;
      u_6 = t_6;
      r_6 = testimports.const29;
      v_6 = u_6;
      term = r_enter_0_3.instance.invoke(context, v_6, q_6, r_6, testimports.constLocationInfo13);
      if(term == null)
        break Fail9;
      w_6 = p_6;
      b_7 = l_6;
      x_6 = testimports.const24;
      c_7 = b_7;
      y_6 = testimports.const29;
      d_7 = c_7;
      z_6 = testimports.const31;
      e_7 = d_7;
      term = s_var_0_4.instance.invoke(context, e_7, x_6, y_6, z_6, testimports.constLocationInfo14);
      if(term == null)
        break Fail9;
      term = w_6;
      f_7 = w_6;
      IStrategoTerm term5 = term;
      Success5:
      { 
        Fail10:
        { 
          IStrategoTerm g_7 = null;
          IStrategoTerm h_7 = null;
          IStrategoTerm j_7 = null;
          IStrategoTerm k_7 = null;
          IStrategoTerm l_7 = null;
          IStrategoTerm m_7 = null;
          IStrategoTerm n_7 = null;
          IStrategoTerm p_7 = null;
          IStrategoTerm q_7 = null;
          IStrategoTerm r_7 = null;
          IStrategoTerm s_7 = null;
          IStrategoTerm t_7 = null;
          IStrategoTerm u_7 = null;
          IStrategoTerm w_7 = null;
          IStrategoTerm x_7 = null;
          IStrategoTerm y_7 = null;
          IStrategoTerm z_7 = null;
          j_7 = term;
          g_7 = testimports.const24;
          k_7 = j_7;
          h_7 = testimports.const29;
          l_7 = k_7;
          term = s_step_0_3.instance.invoke(context, l_7, g_7, h_7, testimports.constLocationInfo15);
          if(term == null)
            break Fail10;
          p_7 = l_6;
          m_7 = testimports.const24;
          q_7 = p_7;
          n_7 = testimports.const29;
          r_7 = q_7;
          term = s_step_0_3.instance.invoke(context, r_7, m_7, n_7, testimports.constLocationInfo16);
          if(term == null)
            break Fail10;
          term = match_comments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail10;
          m_6 = term;
          w_7 = term;
          s_7 = testimports.const24;
          x_7 = w_7;
          t_7 = testimports.const29;
          y_7 = x_7;
          u_7 = testimports.const35;
          z_7 = y_7;
          term = s_var_0_4.instance.invoke(context, z_7, s_7, t_7, u_7, testimports.constLocationInfo17);
          if(term == null)
            break Fail10;
          if(true)
            break Success5;
        }
        term = term5;
        IStrategoTerm n_6 = null;
        IStrategoTerm o_6 = null;
        IStrategoTerm b_8 = null;
        n_6 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail9;
        o_6 = term;
        b_8 = n_6;
        term = report_with_failure_0_2.instance.invoke(context, b_8, testimports.const36, o_6);
        if(term == null)
          break Fail9;
      }
      term = f_7;
      if(m_6 == null)
        break Fail9;
      f_8 = m_6;
      c_8 = testimports.const24;
      g_8 = f_8;
      d_8 = testimports.const29;
      h_8 = g_8;
      term = r_exit_0_3.instance.invoke(context, h_8, c_8, d_8, testimports.constLocationInfo13);
      if(term == null)
        break Fail9;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}