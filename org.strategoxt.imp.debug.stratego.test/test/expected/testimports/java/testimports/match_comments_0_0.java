package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_comments_0_0 extends Strategy 
{ 
  public static match_comments_0_0 instance = new match_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("match_comments_0_0");
    Fail11:
    { 
      IStrategoTerm k_8 = null;
      IStrategoTerm l_8 = null;
      IStrategoTerm m_8 = null;
      IStrategoTerm n_8 = null;
      IStrategoTerm q_8 = null;
      IStrategoTerm r_8 = null;
      IStrategoTerm s_8 = null;
      IStrategoTerm u_8 = null;
      IStrategoTerm v_8 = null;
      IStrategoTerm w_8 = null;
      IStrategoTerm x_8 = null;
      IStrategoTerm y_8 = null;
      IStrategoTerm z_8 = null;
      IStrategoTerm a_9 = null;
      IStrategoTerm c_9 = null;
      IStrategoTerm d_9 = null;
      IStrategoTerm e_9 = null;
      IStrategoTerm f_9 = null;
      IStrategoTerm g_9 = null;
      IStrategoTerm r_11 = null;
      IStrategoTerm s_11 = null;
      IStrategoTerm u_11 = null;
      IStrategoTerm v_11 = null;
      IStrategoTerm w_11 = null;
      if(term.getTermType() != IStrategoTerm.APPL || testimports._consProgram_2 != ((IStrategoAppl)term).getConstructor())
        break Fail11;
      k_8 = term.getSubterm(1);
      q_8 = term;
      u_8 = term;
      r_8 = testimports.const24;
      v_8 = u_8;
      s_8 = testimports.const37;
      w_8 = v_8;
      term = r_enter_0_3.instance.invoke(context, w_8, r_8, s_8, testimports.constLocationInfo18);
      if(term == null)
        break Fail11;
      x_8 = q_8;
      c_9 = k_8;
      y_8 = testimports.const24;
      d_9 = c_9;
      z_8 = testimports.const37;
      e_9 = d_9;
      a_9 = testimports.const39;
      f_9 = e_9;
      term = s_var_0_4.instance.invoke(context, f_9, y_8, z_8, a_9, testimports.constLocationInfo19);
      if(term == null)
        break Fail11;
      term = x_8;
      g_9 = x_8;
      IStrategoTerm term6 = term;
      Success6:
      { 
        Fail12:
        { 
          IStrategoTerm h_9 = null;
          IStrategoTerm i_9 = null;
          IStrategoTerm k_9 = null;
          IStrategoTerm l_9 = null;
          IStrategoTerm m_9 = null;
          IStrategoTerm n_9 = null;
          IStrategoTerm o_9 = null;
          IStrategoTerm q_9 = null;
          IStrategoTerm r_9 = null;
          IStrategoTerm s_9 = null;
          IStrategoTerm t_9 = null;
          IStrategoTerm u_9 = null;
          IStrategoTerm v_9 = null;
          IStrategoTerm x_9 = null;
          IStrategoTerm y_9 = null;
          IStrategoTerm z_9 = null;
          IStrategoTerm a_10 = null;
          IStrategoTerm b_10 = null;
          IStrategoTerm c_10 = null;
          IStrategoTerm e_10 = null;
          IStrategoTerm f_10 = null;
          IStrategoTerm g_10 = null;
          IStrategoTerm h_10 = null;
          IStrategoTerm i_10 = null;
          IStrategoTerm k_10 = null;
          IStrategoTerm l_10 = null;
          IStrategoTerm m_10 = null;
          IStrategoTerm n_10 = null;
          IStrategoTerm o_10 = null;
          IStrategoTerm p_10 = null;
          IStrategoTerm r_10 = null;
          IStrategoTerm s_10 = null;
          IStrategoTerm t_10 = null;
          IStrategoTerm u_10 = null;
          IStrategoTerm v_10 = null;
          IStrategoTerm w_10 = null;
          IStrategoTerm y_10 = null;
          IStrategoTerm z_10 = null;
          IStrategoTerm a_11 = null;
          IStrategoTerm b_11 = null;
          IStrategoTerm c_11 = null;
          IStrategoTerm e_11 = null;
          IStrategoTerm f_11 = null;
          IStrategoTerm g_11 = null;
          IStrategoTerm h_11 = null;
          IStrategoTerm i_11 = null;
          IStrategoTerm j_11 = null;
          IStrategoTerm l_11 = null;
          IStrategoTerm m_11 = null;
          IStrategoTerm n_11 = null;
          IStrategoTerm o_11 = null;
          k_9 = term;
          h_9 = testimports.const24;
          l_9 = k_9;
          i_9 = testimports.const37;
          m_9 = l_9;
          term = s_step_0_3.instance.invoke(context, m_9, h_9, i_9, testimports.constLocationInfo20);
          if(term == null)
            break Fail12;
          q_9 = k_8;
          n_9 = testimports.const24;
          r_9 = q_9;
          o_9 = testimports.const37;
          s_9 = r_9;
          term = s_step_0_3.instance.invoke(context, s_9, n_9, o_9, testimports.constLocationInfo21);
          if(term == null)
            break Fail12;
          term = find_functions_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail12;
          l_8 = term;
          x_9 = term;
          t_9 = testimports.const24;
          y_9 = x_9;
          u_9 = testimports.const37;
          z_9 = y_9;
          v_9 = testimports.const43;
          a_10 = z_9;
          term = s_var_0_4.instance.invoke(context, a_10, t_9, u_9, v_9, testimports.constLocationInfo22);
          if(term == null)
            break Fail12;
          e_10 = term;
          b_10 = testimports.const24;
          f_10 = e_10;
          c_10 = testimports.const37;
          g_10 = f_10;
          term = s_step_0_3.instance.invoke(context, g_10, b_10, c_10, testimports.constLocationInfo23);
          if(term == null)
            break Fail12;
          k_10 = k_8;
          h_10 = testimports.const24;
          l_10 = k_10;
          i_10 = testimports.const37;
          m_10 = l_10;
          term = s_step_0_3.instance.invoke(context, m_10, h_10, i_10, testimports.constLocationInfo24);
          if(term == null)
            break Fail12;
          term = find_comments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail12;
          m_8 = term;
          r_10 = term;
          n_10 = testimports.const24;
          s_10 = r_10;
          o_10 = testimports.const37;
          t_10 = s_10;
          p_10 = testimports.const44;
          u_10 = t_10;
          term = s_var_0_4.instance.invoke(context, u_10, n_10, o_10, p_10, testimports.constLocationInfo25);
          if(term == null)
            break Fail12;
          y_10 = term;
          v_10 = testimports.const24;
          z_10 = y_10;
          w_10 = testimports.const37;
          a_11 = z_10;
          term = s_step_0_3.instance.invoke(context, a_11, v_10, w_10, testimports.constLocationInfo26);
          if(term == null)
            break Fail12;
          term = termFactory.makeTuple(l_8, m_8);
          e_11 = term;
          b_11 = testimports.const24;
          f_11 = e_11;
          c_11 = testimports.const37;
          g_11 = f_11;
          term = s_step_0_3.instance.invoke(context, g_11, b_11, c_11, testimports.constLocationInfo27);
          if(term == null)
            break Fail12;
          term = match_f_and_c_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail12;
          n_8 = term;
          l_11 = term;
          h_11 = testimports.const24;
          m_11 = l_11;
          i_11 = testimports.const37;
          n_11 = m_11;
          j_11 = testimports.const45;
          o_11 = n_11;
          term = s_var_0_4.instance.invoke(context, o_11, h_11, i_11, j_11, testimports.constLocationInfo28);
          if(term == null)
            break Fail12;
          if(true)
            break Success6;
        }
        term = term6;
        IStrategoTerm o_8 = null;
        IStrategoTerm p_8 = null;
        IStrategoTerm q_11 = null;
        o_8 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail11;
        p_8 = term;
        q_11 = o_8;
        term = report_with_failure_0_2.instance.invoke(context, q_11, testimports.const46, p_8);
        if(term == null)
          break Fail11;
      }
      term = g_9;
      if(n_8 == null)
        break Fail11;
      u_11 = n_8;
      r_11 = testimports.const24;
      v_11 = u_11;
      s_11 = testimports.const37;
      w_11 = v_11;
      term = r_exit_0_3.instance.invoke(context, w_11, r_11, s_11, testimports.constLocationInfo18);
      if(term == null)
        break Fail11;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}