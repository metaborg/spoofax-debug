package localvar_rtree;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_148)
  { 
    TermReference j_148 = new TermReference(ref_j_148);
    context.push("find_comment_by_name_0_1");
    Fail54:
    { 
      IStrategoTerm k_148 = null;
      IStrategoTerm l_148 = null;
      IStrategoTerm m_148 = null;
      IStrategoTerm p_148 = null;
      IStrategoTerm q_148 = null;
      IStrategoTerm r_148 = null;
      IStrategoTerm t_148 = null;
      IStrategoTerm u_148 = null;
      IStrategoTerm v_148 = null;
      IStrategoTerm w_148 = null;
      IStrategoTerm x_148 = null;
      IStrategoTerm y_148 = null;
      IStrategoTerm z_148 = null;
      IStrategoTerm b_149 = null;
      IStrategoTerm c_149 = null;
      IStrategoTerm d_149 = null;
      IStrategoTerm e_149 = null;
      IStrategoTerm f_149 = null;
      IStrategoTerm g_149 = null;
      IStrategoTerm h_149 = null;
      IStrategoTerm i_149 = null;
      IStrategoTerm k_149 = null;
      IStrategoTerm l_149 = null;
      IStrategoTerm m_149 = null;
      IStrategoTerm n_149 = null;
      IStrategoTerm o_149 = null;
      IStrategoTerm o_152 = null;
      IStrategoTerm t_152 = null;
      IStrategoTerm y_152 = null;
      IStrategoTerm j_153 = null;
      IStrategoTerm k_153 = null;
      k_148 = term;
      p_148 = term;
      t_148 = term;
      q_148 = localvar_rtree.const125;
      u_148 = t_148;
      r_148 = localvar_rtree.const212;
      v_148 = u_148;
      term = r_enter_0_3.instance.invoke(context, v_148, q_148, r_148, localvar_rtree.constLocationInfo135);
      if(term == null)
        break Fail54;
      term = p_148;
      w_148 = p_148;
      if(j_148.value == null)
        break Fail54;
      b_149 = j_148.value;
      x_148 = localvar_rtree.const125;
      c_149 = b_149;
      y_148 = localvar_rtree.const212;
      d_149 = c_149;
      z_148 = localvar_rtree.const205;
      e_149 = d_149;
      term = s_var_0_4.instance.invoke(context, e_149, x_148, y_148, z_148, localvar_rtree.constLocationInfo136);
      if(term == null)
        break Fail54;
      f_149 = w_148;
      k_149 = k_148;
      g_149 = localvar_rtree.const125;
      l_149 = k_149;
      h_149 = localvar_rtree.const212;
      m_149 = l_149;
      i_149 = localvar_rtree.const160;
      n_149 = m_149;
      term = s_var_0_4.instance.invoke(context, n_149, g_149, h_149, i_149, localvar_rtree.constLocationInfo137);
      if(term == null)
        break Fail54;
      term = f_149;
      o_149 = f_149;
      IStrategoTerm term19 = term;
      Success19:
      { 
        Fail55:
        { 
          IStrategoTerm p_149 = null;
          IStrategoTerm q_149 = null;
          IStrategoTerm s_149 = null;
          IStrategoTerm t_149 = null;
          IStrategoTerm u_149 = null;
          IStrategoTerm v_149 = null;
          IStrategoTerm w_149 = null;
          IStrategoTerm y_149 = null;
          IStrategoTerm z_149 = null;
          IStrategoTerm a_150 = null;
          IStrategoTerm h_150 = null;
          IStrategoTerm i_150 = null;
          IStrategoTerm j_150 = null;
          IStrategoTerm l_150 = null;
          IStrategoTerm m_150 = null;
          IStrategoTerm n_150 = null;
          IStrategoTerm o_150 = null;
          IStrategoTerm p_150 = null;
          IStrategoTerm q_150 = null;
          IStrategoTerm s_150 = null;
          IStrategoTerm t_150 = null;
          IStrategoTerm u_150 = null;
          IStrategoTerm v_150 = null;
          IStrategoTerm w_150 = null;
          IStrategoTerm y_150 = null;
          IStrategoTerm z_150 = null;
          IStrategoTerm c_151 = null;
          IStrategoTerm k_151 = null;
          IStrategoTerm l_151 = null;
          IStrategoTerm n_151 = null;
          IStrategoTerm q_151 = null;
          IStrategoTerm r_151 = null;
          IStrategoTerm s_151 = null;
          IStrategoTerm w_151 = null;
          IStrategoTerm x_151 = null;
          IStrategoTerm d_152 = null;
          IStrategoTerm g_152 = null;
          IStrategoTerm h_152 = null;
          IStrategoTerm i_152 = null;
          s_149 = term;
          p_149 = localvar_rtree.const125;
          t_149 = s_149;
          q_149 = localvar_rtree.const212;
          u_149 = t_149;
          term = s_step_0_3.instance.invoke(context, u_149, p_149, q_149, localvar_rtree.constLocationInfo138);
          if(term == null)
            break Fail55;
          y_149 = k_148;
          v_149 = localvar_rtree.const125;
          z_149 = y_149;
          w_149 = localvar_rtree.const212;
          a_150 = z_149;
          term = s_step_0_3.instance.invoke(context, a_150, v_149, w_149, localvar_rtree.constLocationInfo139);
          if(term == null)
            break Fail55;
          lifted14 lifted140 = new lifted14();
          lifted140.j_148 = j_148;
          term = filter_1_0.instance.invoke(context, term, lifted140);
          if(term == null)
            break Fail55;
          l_148 = term;
          l_150 = term;
          h_150 = localvar_rtree.const125;
          m_150 = l_150;
          i_150 = localvar_rtree.const212;
          n_150 = m_150;
          j_150 = localvar_rtree.const218;
          o_150 = n_150;
          term = s_var_0_4.instance.invoke(context, o_150, h_150, i_150, j_150, localvar_rtree.constLocationInfo141);
          if(term == null)
            break Fail55;
          s_150 = term;
          p_150 = localvar_rtree.const125;
          t_150 = s_150;
          q_150 = localvar_rtree.const212;
          u_150 = t_150;
          term = s_step_0_3.instance.invoke(context, u_150, p_150, q_150, localvar_rtree.constLocationInfo142);
          if(term == null)
            break Fail55;
          y_150 = l_148;
          v_150 = localvar_rtree.const125;
          z_150 = y_150;
          w_150 = localvar_rtree.const212;
          c_151 = z_150;
          term = s_step_0_3.instance.invoke(context, c_151, v_150, w_150, localvar_rtree.constLocationInfo143);
          if(term == null)
            break Fail55;
          term = debug_1_0.instance.invoke(context, term, lifted15.instance);
          if(term == null)
            break Fail55;
          n_151 = term;
          k_151 = localvar_rtree.const125;
          q_151 = n_151;
          l_151 = localvar_rtree.const212;
          r_151 = q_151;
          term = s_step_0_3.instance.invoke(context, r_151, k_151, l_151, localvar_rtree.constLocationInfo145);
          if(term == null)
            break Fail55;
          term = first_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail55;
          m_148 = term;
          d_152 = term;
          s_151 = localvar_rtree.const125;
          g_152 = d_152;
          w_151 = localvar_rtree.const212;
          h_152 = g_152;
          x_151 = localvar_rtree.const221;
          i_152 = h_152;
          term = s_var_0_4.instance.invoke(context, i_152, s_151, w_151, x_151, localvar_rtree.constLocationInfo146);
          if(term == null)
            break Fail55;
          if(true)
            break Success19;
        }
        term = term19;
        IStrategoTerm n_148 = null;
        IStrategoTerm o_148 = null;
        IStrategoTerm n_152 = null;
        n_148 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail54;
        o_148 = term;
        n_152 = n_148;
        term = report_with_failure_0_2.instance.invoke(context, n_152, localvar_rtree.const222, o_148);
        if(term == null)
          break Fail54;
      }
      term = o_149;
      if(m_148 == null)
        break Fail54;
      y_152 = m_148;
      o_152 = localvar_rtree.const125;
      j_153 = y_152;
      t_152 = localvar_rtree.const212;
      k_153 = j_153;
      term = r_exit_0_3.instance.invoke(context, k_153, o_152, t_152, localvar_rtree.constLocationInfo135);
      if(term == null)
        break Fail54;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}