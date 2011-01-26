package localvardebug;

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
    Fail4:
    { 
      IStrategoTerm s_4 = null;
      IStrategoTerm t_4 = null;
      IStrategoTerm u_4 = null;
      IStrategoTerm v_4 = null;
      IStrategoTerm y_4 = null;
      IStrategoTerm z_4 = null;
      IStrategoTerm a_5 = null;
      IStrategoTerm c_5 = null;
      IStrategoTerm d_5 = null;
      IStrategoTerm e_5 = null;
      IStrategoTerm f_5 = null;
      IStrategoTerm g_5 = null;
      IStrategoTerm h_5 = null;
      IStrategoTerm i_5 = null;
      IStrategoTerm k_5 = null;
      IStrategoTerm l_5 = null;
      IStrategoTerm m_5 = null;
      IStrategoTerm n_5 = null;
      IStrategoTerm o_5 = null;
      IStrategoTerm z_7 = null;
      IStrategoTerm a_8 = null;
      IStrategoTerm c_8 = null;
      IStrategoTerm d_8 = null;
      IStrategoTerm e_8 = null;
      if(term.getTermType() != IStrategoTerm.APPL || localvardebug._consProgram_2 != ((IStrategoAppl)term).getConstructor())
        break Fail4;
      s_4 = term.getSubterm(1);
      y_4 = term;
      c_5 = term;
      z_4 = localvardebug.const0;
      d_5 = c_5;
      a_5 = localvardebug.const21;
      e_5 = d_5;
      term = r_enter_0_3.instance.invoke(context, e_5, z_4, a_5, localvardebug.constLocationInfo8);
      if(term == null)
        break Fail4;
      f_5 = y_4;
      k_5 = s_4;
      g_5 = localvardebug.const0;
      l_5 = k_5;
      h_5 = localvardebug.const21;
      m_5 = l_5;
      i_5 = localvardebug.const25;
      n_5 = m_5;
      term = s_var_0_4.instance.invoke(context, n_5, g_5, h_5, i_5, localvardebug.constLocationInfo9);
      if(term == null)
        break Fail4;
      term = f_5;
      o_5 = f_5;
      IStrategoTerm term2 = term;
      Success2:
      { 
        Fail5:
        { 
          IStrategoTerm p_5 = null;
          IStrategoTerm q_5 = null;
          IStrategoTerm s_5 = null;
          IStrategoTerm t_5 = null;
          IStrategoTerm u_5 = null;
          IStrategoTerm v_5 = null;
          IStrategoTerm w_5 = null;
          IStrategoTerm y_5 = null;
          IStrategoTerm z_5 = null;
          IStrategoTerm a_6 = null;
          IStrategoTerm b_6 = null;
          IStrategoTerm c_6 = null;
          IStrategoTerm d_6 = null;
          IStrategoTerm f_6 = null;
          IStrategoTerm g_6 = null;
          IStrategoTerm h_6 = null;
          IStrategoTerm i_6 = null;
          IStrategoTerm j_6 = null;
          IStrategoTerm k_6 = null;
          IStrategoTerm m_6 = null;
          IStrategoTerm n_6 = null;
          IStrategoTerm o_6 = null;
          IStrategoTerm p_6 = null;
          IStrategoTerm q_6 = null;
          IStrategoTerm s_6 = null;
          IStrategoTerm t_6 = null;
          IStrategoTerm u_6 = null;
          IStrategoTerm v_6 = null;
          IStrategoTerm w_6 = null;
          IStrategoTerm x_6 = null;
          IStrategoTerm z_6 = null;
          IStrategoTerm a_7 = null;
          IStrategoTerm b_7 = null;
          IStrategoTerm c_7 = null;
          IStrategoTerm d_7 = null;
          IStrategoTerm e_7 = null;
          IStrategoTerm g_7 = null;
          IStrategoTerm h_7 = null;
          IStrategoTerm i_7 = null;
          IStrategoTerm j_7 = null;
          IStrategoTerm k_7 = null;
          IStrategoTerm m_7 = null;
          IStrategoTerm n_7 = null;
          IStrategoTerm o_7 = null;
          IStrategoTerm p_7 = null;
          IStrategoTerm q_7 = null;
          IStrategoTerm r_7 = null;
          IStrategoTerm t_7 = null;
          IStrategoTerm u_7 = null;
          IStrategoTerm v_7 = null;
          IStrategoTerm w_7 = null;
          s_5 = term;
          p_5 = localvardebug.const0;
          t_5 = s_5;
          q_5 = localvardebug.const21;
          u_5 = t_5;
          term = s_step_0_3.instance.invoke(context, u_5, p_5, q_5, localvardebug.constLocationInfo10);
          if(term == null)
            break Fail5;
          y_5 = s_4;
          v_5 = localvardebug.const0;
          z_5 = y_5;
          w_5 = localvardebug.const21;
          a_6 = z_5;
          term = s_step_0_3.instance.invoke(context, a_6, v_5, w_5, localvardebug.constLocationInfo11);
          if(term == null)
            break Fail5;
          term = find_functions_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5;
          t_4 = term;
          f_6 = term;
          b_6 = localvardebug.const0;
          g_6 = f_6;
          c_6 = localvardebug.const21;
          h_6 = g_6;
          d_6 = localvardebug.const33;
          i_6 = h_6;
          term = s_var_0_4.instance.invoke(context, i_6, b_6, c_6, d_6, localvardebug.constLocationInfo12);
          if(term == null)
            break Fail5;
          m_6 = term;
          j_6 = localvardebug.const0;
          n_6 = m_6;
          k_6 = localvardebug.const21;
          o_6 = n_6;
          term = s_step_0_3.instance.invoke(context, o_6, j_6, k_6, localvardebug.constLocationInfo13);
          if(term == null)
            break Fail5;
          s_6 = s_4;
          p_6 = localvardebug.const0;
          t_6 = s_6;
          q_6 = localvardebug.const21;
          u_6 = t_6;
          term = s_step_0_3.instance.invoke(context, u_6, p_6, q_6, localvardebug.constLocationInfo14);
          if(term == null)
            break Fail5;
          term = find_comments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5;
          u_4 = term;
          z_6 = term;
          v_6 = localvardebug.const0;
          a_7 = z_6;
          w_6 = localvardebug.const21;
          b_7 = a_7;
          x_6 = localvardebug.const35;
          c_7 = b_7;
          term = s_var_0_4.instance.invoke(context, c_7, v_6, w_6, x_6, localvardebug.constLocationInfo15);
          if(term == null)
            break Fail5;
          g_7 = term;
          d_7 = localvardebug.const0;
          h_7 = g_7;
          e_7 = localvardebug.const21;
          i_7 = h_7;
          term = s_step_0_3.instance.invoke(context, i_7, d_7, e_7, localvardebug.constLocationInfo16);
          if(term == null)
            break Fail5;
          term = termFactory.makeTuple(t_4, u_4);
          m_7 = term;
          j_7 = localvardebug.const0;
          n_7 = m_7;
          k_7 = localvardebug.const21;
          o_7 = n_7;
          term = s_step_0_3.instance.invoke(context, o_7, j_7, k_7, localvardebug.constLocationInfo17);
          if(term == null)
            break Fail5;
          term = match_f_and_c_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5;
          v_4 = term;
          t_7 = term;
          p_7 = localvardebug.const0;
          u_7 = t_7;
          q_7 = localvardebug.const21;
          v_7 = u_7;
          r_7 = localvardebug.const38;
          w_7 = v_7;
          term = s_var_0_4.instance.invoke(context, w_7, p_7, q_7, r_7, localvardebug.constLocationInfo18);
          if(term == null)
            break Fail5;
          if(true)
            break Success2;
        }
        term = term2;
        IStrategoTerm w_4 = null;
        IStrategoTerm x_4 = null;
        IStrategoTerm y_7 = null;
        w_4 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4;
        x_4 = term;
        y_7 = w_4;
        term = report_with_failure_0_2.instance.invoke(context, y_7, localvardebug.const39, x_4);
        if(term == null)
          break Fail4;
      }
      term = o_5;
      if(v_4 == null)
        break Fail4;
      c_8 = v_4;
      z_7 = localvardebug.const0;
      d_8 = c_8;
      a_8 = localvardebug.const21;
      e_8 = d_8;
      term = r_exit_0_3.instance.invoke(context, e_8, z_7, a_8, localvardebug.constLocationInfo8);
      if(term == null)
        break Fail4;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}