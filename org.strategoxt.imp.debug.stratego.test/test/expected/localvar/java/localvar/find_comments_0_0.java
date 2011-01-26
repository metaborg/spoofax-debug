package localvar;

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
      IStrategoTerm m_10 = null;
      IStrategoTerm n_10 = null;
      IStrategoTerm q_10 = null;
      IStrategoTerm r_10 = null;
      IStrategoTerm s_10 = null;
      IStrategoTerm u_10 = null;
      IStrategoTerm v_10 = null;
      IStrategoTerm w_10 = null;
      IStrategoTerm x_10 = null;
      IStrategoTerm y_10 = null;
      IStrategoTerm z_10 = null;
      IStrategoTerm a_11 = null;
      IStrategoTerm c_11 = null;
      IStrategoTerm d_11 = null;
      IStrategoTerm e_11 = null;
      IStrategoTerm f_11 = null;
      IStrategoTerm g_11 = null;
      IStrategoTerm j_12 = null;
      IStrategoTerm k_12 = null;
      IStrategoTerm m_12 = null;
      IStrategoTerm n_12 = null;
      IStrategoTerm o_12 = null;
      m_10 = term;
      q_10 = term;
      u_10 = term;
      r_10 = localvar.const0;
      v_10 = u_10;
      s_10 = localvar.const50;
      w_10 = v_10;
      term = r_enter_0_3.instance.invoke(context, w_10, r_10, s_10, localvar.constLocationInfo25);
      if(term == null)
        break Fail8;
      x_10 = q_10;
      c_11 = m_10;
      y_10 = localvar.const0;
      d_11 = c_11;
      z_10 = localvar.const50;
      e_11 = d_11;
      a_11 = localvar.const44;
      f_11 = e_11;
      term = s_var_0_4.instance.invoke(context, f_11, y_10, z_10, a_11, localvar.constLocationInfo26);
      if(term == null)
        break Fail8;
      term = x_10;
      g_11 = x_10;
      IStrategoTerm term4 = term;
      Success4:
      { 
        Fail9:
        { 
          IStrategoTerm h_11 = null;
          IStrategoTerm i_11 = null;
          IStrategoTerm k_11 = null;
          IStrategoTerm l_11 = null;
          IStrategoTerm m_11 = null;
          IStrategoTerm n_11 = null;
          IStrategoTerm o_11 = null;
          IStrategoTerm q_11 = null;
          IStrategoTerm r_11 = null;
          IStrategoTerm s_11 = null;
          IStrategoTerm z_11 = null;
          IStrategoTerm a_12 = null;
          IStrategoTerm b_12 = null;
          IStrategoTerm d_12 = null;
          IStrategoTerm e_12 = null;
          IStrategoTerm f_12 = null;
          IStrategoTerm g_12 = null;
          k_11 = term;
          h_11 = localvar.const0;
          l_11 = k_11;
          i_11 = localvar.const50;
          m_11 = l_11;
          term = s_step_0_3.instance.invoke(context, m_11, h_11, i_11, localvar.constLocationInfo27);
          if(term == null)
            break Fail9;
          q_11 = m_10;
          n_11 = localvar.const0;
          r_11 = q_11;
          o_11 = localvar.const50;
          s_11 = r_11;
          term = s_step_0_3.instance.invoke(context, s_11, n_11, o_11, localvar.constLocationInfo28);
          if(term == null)
            break Fail9;
          term = filter_1_0.instance.invoke(context, term, lifted2.instance);
          if(term == null)
            break Fail9;
          n_10 = term;
          d_12 = term;
          z_11 = localvar.const0;
          e_12 = d_12;
          a_12 = localvar.const50;
          f_12 = e_12;
          b_12 = localvar.const55;
          g_12 = f_12;
          term = s_var_0_4.instance.invoke(context, g_12, z_11, a_12, b_12, localvar.constLocationInfo30);
          if(term == null)
            break Fail9;
          if(true)
            break Success4;
        }
        term = term4;
        IStrategoTerm o_10 = null;
        IStrategoTerm p_10 = null;
        IStrategoTerm i_12 = null;
        o_10 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail8;
        p_10 = term;
        i_12 = o_10;
        term = report_with_failure_0_2.instance.invoke(context, i_12, localvar.const56, p_10);
        if(term == null)
          break Fail8;
      }
      term = g_11;
      if(n_10 == null)
        break Fail8;
      m_12 = n_10;
      j_12 = localvar.const0;
      n_12 = m_12;
      k_12 = localvar.const50;
      o_12 = n_12;
      term = r_exit_0_3.instance.invoke(context, o_12, j_12, k_12, localvar.constLocationInfo25);
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