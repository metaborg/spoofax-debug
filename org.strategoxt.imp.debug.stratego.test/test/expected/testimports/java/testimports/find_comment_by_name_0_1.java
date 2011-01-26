package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comment_by_name_0_1 extends Strategy 
{ 
  public static find_comment_by_name_0_1 instance = new find_comment_by_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_24)
  { 
    TermReference a_24 = new TermReference(ref_a_24);
    context.push("find_comment_by_name_0_1");
    Fail23:
    { 
      IStrategoTerm b_24 = null;
      IStrategoTerm c_24 = null;
      IStrategoTerm d_24 = null;
      IStrategoTerm g_24 = null;
      IStrategoTerm h_24 = null;
      IStrategoTerm i_24 = null;
      IStrategoTerm k_24 = null;
      IStrategoTerm l_24 = null;
      IStrategoTerm m_24 = null;
      IStrategoTerm n_24 = null;
      IStrategoTerm o_24 = null;
      IStrategoTerm p_24 = null;
      IStrategoTerm q_24 = null;
      IStrategoTerm s_24 = null;
      IStrategoTerm t_24 = null;
      IStrategoTerm u_24 = null;
      IStrategoTerm v_24 = null;
      IStrategoTerm w_24 = null;
      IStrategoTerm x_24 = null;
      IStrategoTerm y_24 = null;
      IStrategoTerm z_24 = null;
      IStrategoTerm b_25 = null;
      IStrategoTerm c_25 = null;
      IStrategoTerm d_25 = null;
      IStrategoTerm e_25 = null;
      IStrategoTerm f_25 = null;
      IStrategoTerm o_27 = null;
      IStrategoTerm p_27 = null;
      IStrategoTerm r_27 = null;
      IStrategoTerm s_27 = null;
      IStrategoTerm t_27 = null;
      b_24 = term;
      g_24 = term;
      k_24 = term;
      h_24 = testimports.const24;
      l_24 = k_24;
      i_24 = testimports.const87;
      m_24 = l_24;
      term = r_enter_0_3.instance.invoke(context, m_24, h_24, i_24, testimports.constLocationInfo62);
      if(term == null)
        break Fail23;
      term = g_24;
      n_24 = g_24;
      if(a_24.value == null)
        break Fail23;
      s_24 = a_24.value;
      o_24 = testimports.const24;
      t_24 = s_24;
      p_24 = testimports.const87;
      u_24 = t_24;
      q_24 = testimports.const81;
      v_24 = u_24;
      term = s_var_0_4.instance.invoke(context, v_24, o_24, p_24, q_24, testimports.constLocationInfo63);
      if(term == null)
        break Fail23;
      w_24 = n_24;
      b_25 = b_24;
      x_24 = testimports.const24;
      c_25 = b_25;
      y_24 = testimports.const87;
      d_25 = c_25;
      z_24 = testimports.const44;
      e_25 = d_25;
      term = s_var_0_4.instance.invoke(context, e_25, x_24, y_24, z_24, testimports.constLocationInfo64);
      if(term == null)
        break Fail23;
      term = w_24;
      f_25 = w_24;
      IStrategoTerm term11 = term;
      Success11:
      { 
        Fail24:
        { 
          IStrategoTerm g_25 = null;
          IStrategoTerm h_25 = null;
          IStrategoTerm j_25 = null;
          IStrategoTerm k_25 = null;
          IStrategoTerm l_25 = null;
          IStrategoTerm m_25 = null;
          IStrategoTerm n_25 = null;
          IStrategoTerm p_25 = null;
          IStrategoTerm q_25 = null;
          IStrategoTerm r_25 = null;
          IStrategoTerm y_25 = null;
          IStrategoTerm z_25 = null;
          IStrategoTerm a_26 = null;
          IStrategoTerm c_26 = null;
          IStrategoTerm d_26 = null;
          IStrategoTerm e_26 = null;
          IStrategoTerm f_26 = null;
          IStrategoTerm g_26 = null;
          IStrategoTerm h_26 = null;
          IStrategoTerm j_26 = null;
          IStrategoTerm k_26 = null;
          IStrategoTerm l_26 = null;
          IStrategoTerm m_26 = null;
          IStrategoTerm n_26 = null;
          IStrategoTerm p_26 = null;
          IStrategoTerm q_26 = null;
          IStrategoTerm r_26 = null;
          IStrategoTerm y_26 = null;
          IStrategoTerm z_26 = null;
          IStrategoTerm b_27 = null;
          IStrategoTerm c_27 = null;
          IStrategoTerm d_27 = null;
          IStrategoTerm e_27 = null;
          IStrategoTerm f_27 = null;
          IStrategoTerm g_27 = null;
          IStrategoTerm i_27 = null;
          IStrategoTerm j_27 = null;
          IStrategoTerm k_27 = null;
          IStrategoTerm l_27 = null;
          j_25 = term;
          g_25 = testimports.const24;
          k_25 = j_25;
          h_25 = testimports.const87;
          l_25 = k_25;
          term = s_step_0_3.instance.invoke(context, l_25, g_25, h_25, testimports.constLocationInfo65);
          if(term == null)
            break Fail24;
          p_25 = b_24;
          m_25 = testimports.const24;
          q_25 = p_25;
          n_25 = testimports.const87;
          r_25 = q_25;
          term = s_step_0_3.instance.invoke(context, r_25, m_25, n_25, testimports.constLocationInfo66);
          if(term == null)
            break Fail24;
          lifted5 lifted50 = new lifted5();
          lifted50.a_24 = a_24;
          term = filter_1_0.instance.invoke(context, term, lifted50);
          if(term == null)
            break Fail24;
          c_24 = term;
          c_26 = term;
          y_25 = testimports.const24;
          d_26 = c_26;
          z_25 = testimports.const87;
          e_26 = d_26;
          a_26 = testimports.const92;
          f_26 = e_26;
          term = s_var_0_4.instance.invoke(context, f_26, y_25, z_25, a_26, testimports.constLocationInfo68);
          if(term == null)
            break Fail24;
          j_26 = term;
          g_26 = testimports.const24;
          k_26 = j_26;
          h_26 = testimports.const87;
          l_26 = k_26;
          term = s_step_0_3.instance.invoke(context, l_26, g_26, h_26, testimports.constLocationInfo69);
          if(term == null)
            break Fail24;
          p_26 = c_24;
          m_26 = testimports.const24;
          q_26 = p_26;
          n_26 = testimports.const87;
          r_26 = q_26;
          term = s_step_0_3.instance.invoke(context, r_26, m_26, n_26, testimports.constLocationInfo70);
          if(term == null)
            break Fail24;
          term = debug_1_0.instance.invoke(context, term, lifted6.instance);
          if(term == null)
            break Fail24;
          b_27 = term;
          y_26 = testimports.const24;
          c_27 = b_27;
          z_26 = testimports.const87;
          d_27 = c_27;
          term = s_step_0_3.instance.invoke(context, d_27, y_26, z_26, testimports.constLocationInfo72);
          if(term == null)
            break Fail24;
          term = first_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail24;
          d_24 = term;
          i_27 = term;
          e_27 = testimports.const24;
          j_27 = i_27;
          f_27 = testimports.const87;
          k_27 = j_27;
          g_27 = testimports.const95;
          l_27 = k_27;
          term = s_var_0_4.instance.invoke(context, l_27, e_27, f_27, g_27, testimports.constLocationInfo73);
          if(term == null)
            break Fail24;
          if(true)
            break Success11;
        }
        term = term11;
        IStrategoTerm e_24 = null;
        IStrategoTerm f_24 = null;
        IStrategoTerm n_27 = null;
        e_24 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23;
        f_24 = term;
        n_27 = e_24;
        term = report_with_failure_0_2.instance.invoke(context, n_27, testimports.const96, f_24);
        if(term == null)
          break Fail23;
      }
      term = f_25;
      if(d_24 == null)
        break Fail23;
      r_27 = d_24;
      o_27 = testimports.const24;
      s_27 = r_27;
      p_27 = testimports.const87;
      t_27 = s_27;
      term = r_exit_0_3.instance.invoke(context, t_27, o_27, p_27, testimports.constLocationInfo62);
      if(term == null)
        break Fail23;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}