package dynamic;

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
      IStrategoTerm o_5 = null;
      IStrategoTerm p_5 = null;
      IStrategoTerm q_5 = null;
      IStrategoTerm r_5 = null;
      IStrategoTerm u_5 = null;
      IStrategoTerm v_5 = null;
      IStrategoTerm w_5 = null;
      IStrategoTerm y_5 = null;
      IStrategoTerm z_5 = null;
      IStrategoTerm a_6 = null;
      IStrategoTerm b_6 = null;
      IStrategoTerm c_6 = null;
      IStrategoTerm d_6 = null;
      IStrategoTerm e_6 = null;
      IStrategoTerm g_6 = null;
      IStrategoTerm h_6 = null;
      IStrategoTerm i_6 = null;
      IStrategoTerm j_6 = null;
      IStrategoTerm k_6 = null;
      IStrategoTerm v_8 = null;
      IStrategoTerm w_8 = null;
      IStrategoTerm y_8 = null;
      IStrategoTerm z_8 = null;
      IStrategoTerm a_9 = null;
      if(term.getTermType() != IStrategoTerm.APPL || dynamic._consProgram_2 != ((IStrategoAppl)term).getConstructor())
        break Fail4;
      o_5 = term.getSubterm(1);
      u_5 = term;
      y_5 = term;
      v_5 = dynamic.const0;
      z_5 = y_5;
      w_5 = dynamic.const21;
      a_6 = z_5;
      term = r_enter_0_3.instance.invoke(context, a_6, v_5, w_5, dynamic.constLocationInfo8);
      if(term == null)
        break Fail4;
      b_6 = u_5;
      g_6 = o_5;
      c_6 = dynamic.const0;
      h_6 = g_6;
      d_6 = dynamic.const21;
      i_6 = h_6;
      e_6 = dynamic.const25;
      j_6 = i_6;
      term = s_var_0_4.instance.invoke(context, j_6, c_6, d_6, e_6, dynamic.constLocationInfo9);
      if(term == null)
        break Fail4;
      term = b_6;
      k_6 = b_6;
      IStrategoTerm term2 = term;
      Success2:
      { 
        Fail5:
        { 
          IStrategoTerm l_6 = null;
          IStrategoTerm m_6 = null;
          IStrategoTerm o_6 = null;
          IStrategoTerm p_6 = null;
          IStrategoTerm q_6 = null;
          IStrategoTerm r_6 = null;
          IStrategoTerm s_6 = null;
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
          IStrategoTerm g_7 = null;
          IStrategoTerm i_7 = null;
          IStrategoTerm j_7 = null;
          IStrategoTerm k_7 = null;
          IStrategoTerm l_7 = null;
          IStrategoTerm m_7 = null;
          IStrategoTerm o_7 = null;
          IStrategoTerm p_7 = null;
          IStrategoTerm q_7 = null;
          IStrategoTerm r_7 = null;
          IStrategoTerm s_7 = null;
          IStrategoTerm t_7 = null;
          IStrategoTerm v_7 = null;
          IStrategoTerm w_7 = null;
          IStrategoTerm x_7 = null;
          IStrategoTerm y_7 = null;
          IStrategoTerm z_7 = null;
          IStrategoTerm a_8 = null;
          IStrategoTerm c_8 = null;
          IStrategoTerm d_8 = null;
          IStrategoTerm e_8 = null;
          IStrategoTerm f_8 = null;
          IStrategoTerm g_8 = null;
          IStrategoTerm i_8 = null;
          IStrategoTerm j_8 = null;
          IStrategoTerm k_8 = null;
          IStrategoTerm l_8 = null;
          IStrategoTerm m_8 = null;
          IStrategoTerm n_8 = null;
          IStrategoTerm p_8 = null;
          IStrategoTerm q_8 = null;
          IStrategoTerm r_8 = null;
          IStrategoTerm s_8 = null;
          o_6 = term;
          l_6 = dynamic.const0;
          p_6 = o_6;
          m_6 = dynamic.const21;
          q_6 = p_6;
          term = s_step_0_3.instance.invoke(context, q_6, l_6, m_6, dynamic.constLocationInfo10);
          if(term == null)
            break Fail5;
          u_6 = o_5;
          r_6 = dynamic.const0;
          v_6 = u_6;
          s_6 = dynamic.const21;
          w_6 = v_6;
          term = s_step_0_3.instance.invoke(context, w_6, r_6, s_6, dynamic.constLocationInfo11);
          if(term == null)
            break Fail5;
          term = find_functions_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5;
          p_5 = term;
          b_7 = term;
          x_6 = dynamic.const0;
          c_7 = b_7;
          y_6 = dynamic.const21;
          d_7 = c_7;
          z_6 = dynamic.const33;
          e_7 = d_7;
          term = s_var_0_4.instance.invoke(context, e_7, x_6, y_6, z_6, dynamic.constLocationInfo12);
          if(term == null)
            break Fail5;
          i_7 = term;
          f_7 = dynamic.const0;
          j_7 = i_7;
          g_7 = dynamic.const21;
          k_7 = j_7;
          term = s_step_0_3.instance.invoke(context, k_7, f_7, g_7, dynamic.constLocationInfo13);
          if(term == null)
            break Fail5;
          o_7 = o_5;
          l_7 = dynamic.const0;
          p_7 = o_7;
          m_7 = dynamic.const21;
          q_7 = p_7;
          term = s_step_0_3.instance.invoke(context, q_7, l_7, m_7, dynamic.constLocationInfo14);
          if(term == null)
            break Fail5;
          term = find_comments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5;
          q_5 = term;
          v_7 = term;
          r_7 = dynamic.const0;
          w_7 = v_7;
          s_7 = dynamic.const21;
          x_7 = w_7;
          t_7 = dynamic.const35;
          y_7 = x_7;
          term = s_var_0_4.instance.invoke(context, y_7, r_7, s_7, t_7, dynamic.constLocationInfo15);
          if(term == null)
            break Fail5;
          c_8 = term;
          z_7 = dynamic.const0;
          d_8 = c_8;
          a_8 = dynamic.const21;
          e_8 = d_8;
          term = s_step_0_3.instance.invoke(context, e_8, z_7, a_8, dynamic.constLocationInfo16);
          if(term == null)
            break Fail5;
          term = termFactory.makeTuple(p_5, q_5);
          i_8 = term;
          f_8 = dynamic.const0;
          j_8 = i_8;
          g_8 = dynamic.const21;
          k_8 = j_8;
          term = s_step_0_3.instance.invoke(context, k_8, f_8, g_8, dynamic.constLocationInfo17);
          if(term == null)
            break Fail5;
          term = match_f_and_c_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail5;
          r_5 = term;
          p_8 = term;
          l_8 = dynamic.const0;
          q_8 = p_8;
          m_8 = dynamic.const21;
          r_8 = q_8;
          n_8 = dynamic.const38;
          s_8 = r_8;
          term = s_var_0_4.instance.invoke(context, s_8, l_8, m_8, n_8, dynamic.constLocationInfo18);
          if(term == null)
            break Fail5;
          if(true)
            break Success2;
        }
        term = term2;
        IStrategoTerm s_5 = null;
        IStrategoTerm t_5 = null;
        IStrategoTerm u_8 = null;
        s_5 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail4;
        t_5 = term;
        u_8 = s_5;
        term = report_with_failure_0_2.instance.invoke(context, u_8, dynamic.const39, t_5);
        if(term == null)
          break Fail4;
      }
      term = k_6;
      if(r_5 == null)
        break Fail4;
      y_8 = r_5;
      v_8 = dynamic.const0;
      z_8 = y_8;
      w_8 = dynamic.const21;
      a_9 = z_8;
      term = r_exit_0_3.instance.invoke(context, a_9, v_8, w_8, dynamic.constLocationInfo8);
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