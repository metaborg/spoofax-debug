package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comments_0_0 extends Strategy 
{ 
  public static find_comments_0_0 instance = new find_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("find_comments_0_0");
    Fail8:
    { 
      IStrategoTerm i_11 = null;
      IStrategoTerm j_11 = null;
      IStrategoTerm m_11 = null;
      IStrategoTerm n_11 = null;
      IStrategoTerm o_11 = null;
      IStrategoTerm q_11 = null;
      IStrategoTerm r_11 = null;
      IStrategoTerm s_11 = null;
      IStrategoTerm t_11 = null;
      IStrategoTerm u_11 = null;
      IStrategoTerm v_11 = null;
      IStrategoTerm w_11 = null;
      IStrategoTerm y_11 = null;
      IStrategoTerm z_11 = null;
      IStrategoTerm a_12 = null;
      IStrategoTerm b_12 = null;
      IStrategoTerm c_12 = null;
      IStrategoTerm f_13 = null;
      IStrategoTerm g_13 = null;
      IStrategoTerm i_13 = null;
      IStrategoTerm j_13 = null;
      IStrategoTerm k_13 = null;
      i_11 = term;
      m_11 = term;
      q_11 = term;
      n_11 = dynamic.const0;
      r_11 = q_11;
      o_11 = dynamic.const50;
      s_11 = r_11;
      term = r_enter_0_3.instance.invoke(context, s_11, n_11, o_11, dynamic.constLocationInfo25);
      if(term == null)
        break Fail8;
      t_11 = m_11;
      y_11 = i_11;
      u_11 = dynamic.const0;
      z_11 = y_11;
      v_11 = dynamic.const50;
      a_12 = z_11;
      w_11 = dynamic.const44;
      b_12 = a_12;
      term = s_var_0_4.instance.invoke(context, b_12, u_11, v_11, w_11, dynamic.constLocationInfo26);
      if(term == null)
        break Fail8;
      term = t_11;
      c_12 = t_11;
      IStrategoTerm term4 = term;
      Success4:
      { 
        Fail9:
        { 
          IStrategoTerm d_12 = null;
          IStrategoTerm e_12 = null;
          IStrategoTerm g_12 = null;
          IStrategoTerm h_12 = null;
          IStrategoTerm i_12 = null;
          IStrategoTerm j_12 = null;
          IStrategoTerm k_12 = null;
          IStrategoTerm m_12 = null;
          IStrategoTerm n_12 = null;
          IStrategoTerm o_12 = null;
          IStrategoTerm v_12 = null;
          IStrategoTerm w_12 = null;
          IStrategoTerm x_12 = null;
          IStrategoTerm z_12 = null;
          IStrategoTerm a_13 = null;
          IStrategoTerm b_13 = null;
          IStrategoTerm c_13 = null;
          g_12 = term;
          d_12 = dynamic.const0;
          h_12 = g_12;
          e_12 = dynamic.const50;
          i_12 = h_12;
          term = s_step_0_3.instance.invoke(context, i_12, d_12, e_12, dynamic.constLocationInfo27);
          if(term == null)
            break Fail9;
          m_12 = i_11;
          j_12 = dynamic.const0;
          n_12 = m_12;
          k_12 = dynamic.const50;
          o_12 = n_12;
          term = s_step_0_3.instance.invoke(context, o_12, j_12, k_12, dynamic.constLocationInfo28);
          if(term == null)
            break Fail9;
          term = filter_1_0.instance.invoke(context, term, lifted2.instance);
          if(term == null)
            break Fail9;
          j_11 = term;
          z_12 = term;
          v_12 = dynamic.const0;
          a_13 = z_12;
          w_12 = dynamic.const50;
          b_13 = a_13;
          x_12 = dynamic.const55;
          c_13 = b_13;
          term = s_var_0_4.instance.invoke(context, c_13, v_12, w_12, x_12, dynamic.constLocationInfo30);
          if(term == null)
            break Fail9;
          if(true)
            break Success4;
        }
        term = term4;
        IStrategoTerm k_11 = null;
        IStrategoTerm l_11 = null;
        IStrategoTerm e_13 = null;
        k_11 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail8;
        l_11 = term;
        e_13 = k_11;
        term = report_with_failure_0_2.instance.invoke(context, e_13, dynamic.const56, l_11);
        if(term == null)
          break Fail8;
      }
      term = c_12;
      if(j_11 == null)
        break Fail8;
      i_13 = j_11;
      f_13 = dynamic.const0;
      j_13 = i_13;
      g_13 = dynamic.const50;
      k_13 = j_13;
      term = r_exit_0_3.instance.invoke(context, k_13, f_13, g_13, dynamic.constLocationInfo25);
      if(term == null)
        break Fail8;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}