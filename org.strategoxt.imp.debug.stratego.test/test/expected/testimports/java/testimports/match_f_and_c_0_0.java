package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_f_and_c_0_0 extends Strategy 
{ 
  public static match_f_and_c_0_0 instance = new match_f_and_c_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("match_f_and_c_0_0");
    Fail17:
    { 
      TermReference j_16 = new TermReference();
      IStrategoTerm k_16 = null;
      IStrategoTerm l_16 = null;
      IStrategoTerm o_16 = null;
      IStrategoTerm p_16 = null;
      IStrategoTerm q_16 = null;
      IStrategoTerm s_16 = null;
      IStrategoTerm t_16 = null;
      IStrategoTerm u_16 = null;
      IStrategoTerm v_16 = null;
      IStrategoTerm w_16 = null;
      IStrategoTerm x_16 = null;
      IStrategoTerm y_16 = null;
      IStrategoTerm a_17 = null;
      IStrategoTerm b_17 = null;
      IStrategoTerm c_17 = null;
      IStrategoTerm d_17 = null;
      IStrategoTerm e_17 = null;
      IStrategoTerm f_17 = null;
      IStrategoTerm g_17 = null;
      IStrategoTerm i_17 = null;
      IStrategoTerm j_17 = null;
      IStrategoTerm k_17 = null;
      IStrategoTerm l_17 = null;
      IStrategoTerm m_17 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail17;
      k_16 = term.getSubterm(0);
      if(j_16.value == null)
        j_16.value = term.getSubterm(1);
      else
        if(j_16.value != term.getSubterm(1) && !j_16.value.match(term.getSubterm(1)))
          break Fail17;
      o_16 = term;
      s_16 = term;
      p_16 = testimports.const24;
      t_16 = s_16;
      q_16 = testimports.const61;
      u_16 = t_16;
      term = r_enter_0_3.instance.invoke(context, u_16, p_16, q_16, testimports.constLocationInfo41);
      if(term == null)
        break Fail17;
      v_16 = o_16;
      a_17 = k_16;
      w_16 = testimports.const24;
      b_17 = a_17;
      x_16 = testimports.const61;
      c_17 = b_17;
      y_16 = testimports.const43;
      d_17 = c_17;
      term = s_var_0_4.instance.invoke(context, d_17, w_16, x_16, y_16, testimports.constLocationInfo42);
      if(term == null)
        break Fail17;
      if(j_16.value == null)
        break Fail17;
      i_17 = j_16.value;
      e_17 = testimports.const24;
      j_17 = i_17;
      f_17 = testimports.const61;
      k_17 = j_17;
      g_17 = testimports.const44;
      l_17 = k_17;
      term = s_var_0_4.instance.invoke(context, l_17, e_17, f_17, g_17, testimports.constLocationInfo43);
      if(term == null)
        break Fail17;
      term = v_16;
      m_17 = v_16;
      IStrategoTerm term9 = term;
      Success9:
      { 
        Fail18:
        { 
          IStrategoTerm n_17 = null;
          IStrategoTerm o_17 = null;
          IStrategoTerm q_17 = null;
          IStrategoTerm r_17 = null;
          IStrategoTerm s_17 = null;
          IStrategoTerm t_17 = null;
          IStrategoTerm u_17 = null;
          IStrategoTerm w_17 = null;
          IStrategoTerm x_17 = null;
          IStrategoTerm y_17 = null;
          IStrategoTerm f_18 = null;
          IStrategoTerm g_18 = null;
          IStrategoTerm h_18 = null;
          IStrategoTerm j_18 = null;
          IStrategoTerm k_18 = null;
          IStrategoTerm l_18 = null;
          IStrategoTerm m_18 = null;
          q_17 = term;
          n_17 = testimports.const24;
          r_17 = q_17;
          o_17 = testimports.const61;
          s_17 = r_17;
          term = s_step_0_3.instance.invoke(context, s_17, n_17, o_17, testimports.constLocationInfo44);
          if(term == null)
            break Fail18;
          w_17 = k_16;
          t_17 = testimports.const24;
          x_17 = w_17;
          u_17 = testimports.const61;
          y_17 = x_17;
          term = s_step_0_3.instance.invoke(context, y_17, t_17, u_17, testimports.constLocationInfo45);
          if(term == null)
            break Fail18;
          lifted4 lifted40 = new lifted4();
          lifted40.j_16 = j_16;
          term = map_1_0.instance.invoke(context, term, lifted40);
          if(term == null)
            break Fail18;
          l_16 = term;
          j_18 = term;
          f_18 = testimports.const24;
          k_18 = j_18;
          g_18 = testimports.const61;
          l_18 = k_18;
          h_18 = testimports.const69;
          m_18 = l_18;
          term = s_var_0_4.instance.invoke(context, m_18, f_18, g_18, h_18, testimports.constLocationInfo47);
          if(term == null)
            break Fail18;
          if(true)
            break Success9;
        }
        term = term9;
        IStrategoTerm m_16 = null;
        IStrategoTerm n_16 = null;
        IStrategoTerm o_18 = null;
        m_16 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail17;
        n_16 = term;
        o_18 = m_16;
        term = report_with_failure_0_2.instance.invoke(context, o_18, testimports.const70, n_16);
        if(term == null)
          break Fail17;
      }
      term = m_17;
      IStrategoTerm p_18 = null;
      IStrategoTerm q_18 = null;
      IStrategoTerm s_18 = null;
      IStrategoTerm t_18 = null;
      IStrategoTerm u_18 = null;
      if(l_16 == null)
        break Fail17;
      s_18 = l_16;
      p_18 = testimports.const24;
      t_18 = s_18;
      q_18 = testimports.const61;
      u_18 = t_18;
      term = r_exit_0_3.instance.invoke(context, u_18, p_18, q_18, testimports.constLocationInfo41);
      if(term == null)
        break Fail17;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}