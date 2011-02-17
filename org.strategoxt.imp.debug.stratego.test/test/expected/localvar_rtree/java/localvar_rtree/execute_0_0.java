package localvar_rtree;

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
    Fail40:
    { 
      IStrategoTerm j_122 = null;
      IStrategoTerm k_122 = null;
      IStrategoTerm p_122 = null;
      IStrategoTerm q_122 = null;
      IStrategoTerm r_122 = null;
      IStrategoTerm t_122 = null;
      IStrategoTerm u_122 = null;
      IStrategoTerm v_122 = null;
      IStrategoTerm w_122 = null;
      IStrategoTerm x_122 = null;
      IStrategoTerm y_122 = null;
      IStrategoTerm z_122 = null;
      IStrategoTerm b_123 = null;
      IStrategoTerm c_123 = null;
      IStrategoTerm d_123 = null;
      IStrategoTerm e_123 = null;
      IStrategoTerm f_123 = null;
      IStrategoTerm d_124 = null;
      IStrategoTerm f_124 = null;
      IStrategoTerm m_124 = null;
      IStrategoTerm n_124 = null;
      IStrategoTerm o_124 = null;
      j_122 = term;
      p_122 = term;
      t_122 = term;
      q_122 = localvar_rtree.const125;
      u_122 = t_122;
      r_122 = localvar_rtree.const134;
      v_122 = u_122;
      term = r_enter_0_3.instance.invoke(context, v_122, q_122, r_122, localvar_rtree.constLocationInfo86);
      if(term == null)
        break Fail40;
      w_122 = p_122;
      b_123 = j_122;
      x_122 = localvar_rtree.const125;
      c_123 = b_123;
      y_122 = localvar_rtree.const134;
      d_123 = c_123;
      z_122 = localvar_rtree.const138;
      e_123 = d_123;
      term = s_var_0_4.instance.invoke(context, e_123, x_122, y_122, z_122, localvar_rtree.constLocationInfo87);
      if(term == null)
        break Fail40;
      term = w_122;
      f_123 = w_122;
      IStrategoTerm term13 = term;
      Success13:
      { 
        Fail41:
        { 
          IStrategoTerm g_123 = null;
          IStrategoTerm h_123 = null;
          IStrategoTerm j_123 = null;
          IStrategoTerm k_123 = null;
          IStrategoTerm l_123 = null;
          IStrategoTerm m_123 = null;
          IStrategoTerm n_123 = null;
          IStrategoTerm p_123 = null;
          IStrategoTerm q_123 = null;
          IStrategoTerm r_123 = null;
          IStrategoTerm s_123 = null;
          IStrategoTerm t_123 = null;
          IStrategoTerm u_123 = null;
          IStrategoTerm w_123 = null;
          IStrategoTerm x_123 = null;
          IStrategoTerm y_123 = null;
          IStrategoTerm a_124 = null;
          j_123 = term;
          g_123 = localvar_rtree.const125;
          k_123 = j_123;
          h_123 = localvar_rtree.const134;
          l_123 = k_123;
          term = s_step_0_3.instance.invoke(context, l_123, g_123, h_123, localvar_rtree.constLocationInfo88);
          if(term == null)
            break Fail41;
          p_123 = j_122;
          m_123 = localvar_rtree.const125;
          q_123 = p_123;
          n_123 = localvar_rtree.const134;
          r_123 = q_123;
          term = s_step_0_3.instance.invoke(context, r_123, m_123, n_123, localvar_rtree.constLocationInfo89);
          if(term == null)
            break Fail41;
          term = match_comments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail41;
          k_122 = term;
          w_123 = term;
          s_123 = localvar_rtree.const125;
          x_123 = w_123;
          t_123 = localvar_rtree.const134;
          y_123 = x_123;
          u_123 = localvar_rtree.const143;
          a_124 = y_123;
          term = s_var_0_4.instance.invoke(context, a_124, s_123, t_123, u_123, localvar_rtree.constLocationInfo90);
          if(term == null)
            break Fail41;
          if(true)
            break Success13;
        }
        term = term13;
        IStrategoTerm n_122 = null;
        IStrategoTerm o_122 = null;
        IStrategoTerm c_124 = null;
        n_122 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail40;
        o_122 = term;
        c_124 = n_122;
        term = report_with_failure_0_2.instance.invoke(context, c_124, localvar_rtree.const145, o_122);
        if(term == null)
          break Fail40;
      }
      term = f_123;
      if(k_122 == null)
        break Fail40;
      m_124 = k_122;
      d_124 = localvar_rtree.const125;
      n_124 = m_124;
      f_124 = localvar_rtree.const134;
      o_124 = n_124;
      term = r_exit_0_3.instance.invoke(context, o_124, d_124, f_124, localvar_rtree.constLocationInfo86);
      if(term == null)
        break Fail40;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}