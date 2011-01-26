package localvardebug;

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
    Fail2:
    { 
      IStrategoTerm t_2 = null;
      IStrategoTerm u_2 = null;
      IStrategoTerm x_2 = null;
      IStrategoTerm y_2 = null;
      IStrategoTerm z_2 = null;
      IStrategoTerm b_3 = null;
      IStrategoTerm c_3 = null;
      IStrategoTerm d_3 = null;
      IStrategoTerm e_3 = null;
      IStrategoTerm f_3 = null;
      IStrategoTerm g_3 = null;
      IStrategoTerm h_3 = null;
      IStrategoTerm j_3 = null;
      IStrategoTerm k_3 = null;
      IStrategoTerm l_3 = null;
      IStrategoTerm m_3 = null;
      IStrategoTerm n_3 = null;
      IStrategoTerm k_4 = null;
      IStrategoTerm l_4 = null;
      IStrategoTerm n_4 = null;
      IStrategoTerm o_4 = null;
      IStrategoTerm p_4 = null;
      t_2 = term;
      x_2 = term;
      b_3 = term;
      y_2 = localvardebug.const0;
      c_3 = b_3;
      z_2 = localvardebug.const9;
      d_3 = c_3;
      term = r_enter_0_3.instance.invoke(context, d_3, y_2, z_2, localvardebug.constLocationInfo3);
      if(term == null)
        break Fail2;
      e_3 = x_2;
      j_3 = t_2;
      f_3 = localvardebug.const0;
      k_3 = j_3;
      g_3 = localvardebug.const9;
      l_3 = k_3;
      h_3 = localvardebug.const13;
      m_3 = l_3;
      term = s_var_0_4.instance.invoke(context, m_3, f_3, g_3, h_3, localvardebug.constLocationInfo4);
      if(term == null)
        break Fail2;
      term = e_3;
      n_3 = e_3;
      IStrategoTerm term1 = term;
      Success1:
      { 
        Fail3:
        { 
          IStrategoTerm o_3 = null;
          IStrategoTerm p_3 = null;
          IStrategoTerm r_3 = null;
          IStrategoTerm s_3 = null;
          IStrategoTerm t_3 = null;
          IStrategoTerm u_3 = null;
          IStrategoTerm v_3 = null;
          IStrategoTerm x_3 = null;
          IStrategoTerm y_3 = null;
          IStrategoTerm z_3 = null;
          IStrategoTerm a_4 = null;
          IStrategoTerm b_4 = null;
          IStrategoTerm c_4 = null;
          IStrategoTerm e_4 = null;
          IStrategoTerm f_4 = null;
          IStrategoTerm g_4 = null;
          IStrategoTerm h_4 = null;
          r_3 = term;
          o_3 = localvardebug.const0;
          s_3 = r_3;
          p_3 = localvardebug.const9;
          t_3 = s_3;
          term = s_step_0_3.instance.invoke(context, t_3, o_3, p_3, localvardebug.constLocationInfo5);
          if(term == null)
            break Fail3;
          x_3 = t_2;
          u_3 = localvardebug.const0;
          y_3 = x_3;
          v_3 = localvardebug.const9;
          z_3 = y_3;
          term = s_step_0_3.instance.invoke(context, z_3, u_3, v_3, localvardebug.constLocationInfo6);
          if(term == null)
            break Fail3;
          term = match_comments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail3;
          u_2 = term;
          e_4 = term;
          a_4 = localvardebug.const0;
          f_4 = e_4;
          b_4 = localvardebug.const9;
          g_4 = f_4;
          c_4 = localvardebug.const18;
          h_4 = g_4;
          term = s_var_0_4.instance.invoke(context, h_4, a_4, b_4, c_4, localvardebug.constLocationInfo7);
          if(term == null)
            break Fail3;
          if(true)
            break Success1;
        }
        term = term1;
        IStrategoTerm v_2 = null;
        IStrategoTerm w_2 = null;
        IStrategoTerm j_4 = null;
        v_2 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2;
        w_2 = term;
        j_4 = v_2;
        term = report_with_failure_0_2.instance.invoke(context, j_4, localvardebug.const20, w_2);
        if(term == null)
          break Fail2;
      }
      term = n_3;
      if(u_2 == null)
        break Fail2;
      n_4 = u_2;
      k_4 = localvardebug.const0;
      o_4 = n_4;
      l_4 = localvardebug.const9;
      p_4 = o_4;
      term = r_exit_0_3.instance.invoke(context, p_4, k_4, l_4, localvardebug.constLocationInfo3);
      if(term == null)
        break Fail2;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}