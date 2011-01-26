package dynamic;

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
      IStrategoTerm p_3 = null;
      IStrategoTerm q_3 = null;
      IStrategoTerm t_3 = null;
      IStrategoTerm u_3 = null;
      IStrategoTerm v_3 = null;
      IStrategoTerm x_3 = null;
      IStrategoTerm y_3 = null;
      IStrategoTerm z_3 = null;
      IStrategoTerm a_4 = null;
      IStrategoTerm b_4 = null;
      IStrategoTerm c_4 = null;
      IStrategoTerm d_4 = null;
      IStrategoTerm f_4 = null;
      IStrategoTerm g_4 = null;
      IStrategoTerm h_4 = null;
      IStrategoTerm i_4 = null;
      IStrategoTerm j_4 = null;
      IStrategoTerm g_5 = null;
      IStrategoTerm h_5 = null;
      IStrategoTerm j_5 = null;
      IStrategoTerm k_5 = null;
      IStrategoTerm l_5 = null;
      p_3 = term;
      t_3 = term;
      x_3 = term;
      u_3 = dynamic.const0;
      y_3 = x_3;
      v_3 = dynamic.const9;
      z_3 = y_3;
      term = r_enter_0_3.instance.invoke(context, z_3, u_3, v_3, dynamic.constLocationInfo3);
      if(term == null)
        break Fail2;
      a_4 = t_3;
      f_4 = p_3;
      b_4 = dynamic.const0;
      g_4 = f_4;
      c_4 = dynamic.const9;
      h_4 = g_4;
      d_4 = dynamic.const13;
      i_4 = h_4;
      term = s_var_0_4.instance.invoke(context, i_4, b_4, c_4, d_4, dynamic.constLocationInfo4);
      if(term == null)
        break Fail2;
      term = a_4;
      j_4 = a_4;
      IStrategoTerm term1 = term;
      Success1:
      { 
        Fail3:
        { 
          IStrategoTerm k_4 = null;
          IStrategoTerm l_4 = null;
          IStrategoTerm n_4 = null;
          IStrategoTerm o_4 = null;
          IStrategoTerm p_4 = null;
          IStrategoTerm q_4 = null;
          IStrategoTerm r_4 = null;
          IStrategoTerm t_4 = null;
          IStrategoTerm u_4 = null;
          IStrategoTerm v_4 = null;
          IStrategoTerm w_4 = null;
          IStrategoTerm x_4 = null;
          IStrategoTerm y_4 = null;
          IStrategoTerm a_5 = null;
          IStrategoTerm b_5 = null;
          IStrategoTerm c_5 = null;
          IStrategoTerm d_5 = null;
          n_4 = term;
          k_4 = dynamic.const0;
          o_4 = n_4;
          l_4 = dynamic.const9;
          p_4 = o_4;
          term = s_step_0_3.instance.invoke(context, p_4, k_4, l_4, dynamic.constLocationInfo5);
          if(term == null)
            break Fail3;
          t_4 = p_3;
          q_4 = dynamic.const0;
          u_4 = t_4;
          r_4 = dynamic.const9;
          v_4 = u_4;
          term = s_step_0_3.instance.invoke(context, v_4, q_4, r_4, dynamic.constLocationInfo6);
          if(term == null)
            break Fail3;
          term = match_comments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail3;
          q_3 = term;
          a_5 = term;
          w_4 = dynamic.const0;
          b_5 = a_5;
          x_4 = dynamic.const9;
          c_5 = b_5;
          y_4 = dynamic.const18;
          d_5 = c_5;
          term = s_var_0_4.instance.invoke(context, d_5, w_4, x_4, y_4, dynamic.constLocationInfo7);
          if(term == null)
            break Fail3;
          if(true)
            break Success1;
        }
        term = term1;
        IStrategoTerm r_3 = null;
        IStrategoTerm s_3 = null;
        IStrategoTerm f_5 = null;
        r_3 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail2;
        s_3 = term;
        f_5 = r_3;
        term = report_with_failure_0_2.instance.invoke(context, f_5, dynamic.const20, s_3);
        if(term == null)
          break Fail2;
      }
      term = j_4;
      if(q_3 == null)
        break Fail2;
      j_5 = q_3;
      g_5 = dynamic.const0;
      k_5 = j_5;
      h_5 = dynamic.const9;
      l_5 = k_5;
      term = r_exit_0_3.instance.invoke(context, l_5, g_5, h_5, dynamic.constLocationInfo3);
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