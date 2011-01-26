package localvar;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_20)
  { 
    TermReference i_20 = new TermReference(ref_i_20);
    context.push("find_comment_by_name_0_1");
    Fail16:
    { 
      IStrategoTerm j_20 = null;
      IStrategoTerm k_20 = null;
      IStrategoTerm l_20 = null;
      IStrategoTerm o_20 = null;
      IStrategoTerm p_20 = null;
      IStrategoTerm q_20 = null;
      IStrategoTerm s_20 = null;
      IStrategoTerm t_20 = null;
      IStrategoTerm u_20 = null;
      IStrategoTerm v_20 = null;
      IStrategoTerm w_20 = null;
      IStrategoTerm x_20 = null;
      IStrategoTerm y_20 = null;
      IStrategoTerm a_21 = null;
      IStrategoTerm b_21 = null;
      IStrategoTerm c_21 = null;
      IStrategoTerm d_21 = null;
      IStrategoTerm e_21 = null;
      IStrategoTerm f_21 = null;
      IStrategoTerm g_21 = null;
      IStrategoTerm h_21 = null;
      IStrategoTerm j_21 = null;
      IStrategoTerm k_21 = null;
      IStrategoTerm l_21 = null;
      IStrategoTerm m_21 = null;
      IStrategoTerm n_21 = null;
      IStrategoTerm w_23 = null;
      IStrategoTerm x_23 = null;
      IStrategoTerm z_23 = null;
      IStrategoTerm a_24 = null;
      IStrategoTerm b_24 = null;
      j_20 = term;
      o_20 = term;
      s_20 = term;
      p_20 = localvar.const0;
      t_20 = s_20;
      q_20 = localvar.const87;
      u_20 = t_20;
      term = r_enter_0_3.instance.invoke(context, u_20, p_20, q_20, localvar.constLocationInfo52);
      if(term == null)
        break Fail16;
      term = o_20;
      v_20 = o_20;
      if(i_20.value == null)
        break Fail16;
      a_21 = i_20.value;
      w_20 = localvar.const0;
      b_21 = a_21;
      x_20 = localvar.const87;
      c_21 = b_21;
      y_20 = localvar.const80;
      d_21 = c_21;
      term = s_var_0_4.instance.invoke(context, d_21, w_20, x_20, y_20, localvar.constLocationInfo53);
      if(term == null)
        break Fail16;
      e_21 = v_20;
      j_21 = j_20;
      f_21 = localvar.const0;
      k_21 = j_21;
      g_21 = localvar.const87;
      l_21 = k_21;
      h_21 = localvar.const35;
      m_21 = l_21;
      term = s_var_0_4.instance.invoke(context, m_21, f_21, g_21, h_21, localvar.constLocationInfo54);
      if(term == null)
        break Fail16;
      term = e_21;
      n_21 = e_21;
      IStrategoTerm term7 = term;
      Success7:
      { 
        Fail17:
        { 
          IStrategoTerm o_21 = null;
          IStrategoTerm p_21 = null;
          IStrategoTerm r_21 = null;
          IStrategoTerm s_21 = null;
          IStrategoTerm t_21 = null;
          IStrategoTerm u_21 = null;
          IStrategoTerm v_21 = null;
          IStrategoTerm x_21 = null;
          IStrategoTerm y_21 = null;
          IStrategoTerm z_21 = null;
          IStrategoTerm g_22 = null;
          IStrategoTerm h_22 = null;
          IStrategoTerm i_22 = null;
          IStrategoTerm k_22 = null;
          IStrategoTerm l_22 = null;
          IStrategoTerm m_22 = null;
          IStrategoTerm n_22 = null;
          IStrategoTerm o_22 = null;
          IStrategoTerm p_22 = null;
          IStrategoTerm r_22 = null;
          IStrategoTerm s_22 = null;
          IStrategoTerm t_22 = null;
          IStrategoTerm u_22 = null;
          IStrategoTerm v_22 = null;
          IStrategoTerm x_22 = null;
          IStrategoTerm y_22 = null;
          IStrategoTerm z_22 = null;
          IStrategoTerm g_23 = null;
          IStrategoTerm h_23 = null;
          IStrategoTerm j_23 = null;
          IStrategoTerm k_23 = null;
          IStrategoTerm l_23 = null;
          IStrategoTerm m_23 = null;
          IStrategoTerm n_23 = null;
          IStrategoTerm o_23 = null;
          IStrategoTerm q_23 = null;
          IStrategoTerm r_23 = null;
          IStrategoTerm s_23 = null;
          IStrategoTerm t_23 = null;
          r_21 = term;
          o_21 = localvar.const0;
          s_21 = r_21;
          p_21 = localvar.const87;
          t_21 = s_21;
          term = s_step_0_3.instance.invoke(context, t_21, o_21, p_21, localvar.constLocationInfo55);
          if(term == null)
            break Fail17;
          x_21 = j_20;
          u_21 = localvar.const0;
          y_21 = x_21;
          v_21 = localvar.const87;
          z_21 = y_21;
          term = s_step_0_3.instance.invoke(context, z_21, u_21, v_21, localvar.constLocationInfo56);
          if(term == null)
            break Fail17;
          lifted4 lifted40 = new lifted4();
          lifted40.i_20 = i_20;
          term = filter_1_0.instance.invoke(context, term, lifted40);
          if(term == null)
            break Fail17;
          k_20 = term;
          k_22 = term;
          g_22 = localvar.const0;
          l_22 = k_22;
          h_22 = localvar.const87;
          m_22 = l_22;
          i_22 = localvar.const93;
          n_22 = m_22;
          term = s_var_0_4.instance.invoke(context, n_22, g_22, h_22, i_22, localvar.constLocationInfo58);
          if(term == null)
            break Fail17;
          r_22 = term;
          o_22 = localvar.const0;
          s_22 = r_22;
          p_22 = localvar.const87;
          t_22 = s_22;
          term = s_step_0_3.instance.invoke(context, t_22, o_22, p_22, localvar.constLocationInfo59);
          if(term == null)
            break Fail17;
          x_22 = k_20;
          u_22 = localvar.const0;
          y_22 = x_22;
          v_22 = localvar.const87;
          z_22 = y_22;
          term = s_step_0_3.instance.invoke(context, z_22, u_22, v_22, localvar.constLocationInfo60);
          if(term == null)
            break Fail17;
          term = debug_1_0.instance.invoke(context, term, lifted5.instance);
          if(term == null)
            break Fail17;
          j_23 = term;
          g_23 = localvar.const0;
          k_23 = j_23;
          h_23 = localvar.const87;
          l_23 = k_23;
          term = s_step_0_3.instance.invoke(context, l_23, g_23, h_23, localvar.constLocationInfo62);
          if(term == null)
            break Fail17;
          term = first_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail17;
          l_20 = term;
          q_23 = term;
          m_23 = localvar.const0;
          r_23 = q_23;
          n_23 = localvar.const87;
          s_23 = r_23;
          o_23 = localvar.const96;
          t_23 = s_23;
          term = s_var_0_4.instance.invoke(context, t_23, m_23, n_23, o_23, localvar.constLocationInfo63);
          if(term == null)
            break Fail17;
          if(true)
            break Success7;
        }
        term = term7;
        IStrategoTerm m_20 = null;
        IStrategoTerm n_20 = null;
        IStrategoTerm v_23 = null;
        m_20 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail16;
        n_20 = term;
        v_23 = m_20;
        term = report_with_failure_0_2.instance.invoke(context, v_23, localvar.const97, n_20);
        if(term == null)
          break Fail16;
      }
      term = n_21;
      if(l_20 == null)
        break Fail16;
      z_23 = l_20;
      w_23 = localvar.const0;
      a_24 = z_23;
      x_23 = localvar.const87;
      b_24 = a_24;
      term = r_exit_0_3.instance.invoke(context, b_24, w_23, x_23, localvar.constLocationInfo52);
      if(term == null)
        break Fail16;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}