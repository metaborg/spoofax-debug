package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_functions_0_0 extends Strategy 
{ 
  public static find_functions_0_0 instance = new find_functions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("find_functions_0_0");
    Fail6:
    { 
      IStrategoTerm d_9 = null;
      IStrategoTerm e_9 = null;
      IStrategoTerm h_9 = null;
      IStrategoTerm i_9 = null;
      IStrategoTerm j_9 = null;
      IStrategoTerm l_9 = null;
      IStrategoTerm m_9 = null;
      IStrategoTerm n_9 = null;
      IStrategoTerm o_9 = null;
      IStrategoTerm p_9 = null;
      IStrategoTerm q_9 = null;
      IStrategoTerm r_9 = null;
      IStrategoTerm t_9 = null;
      IStrategoTerm u_9 = null;
      IStrategoTerm v_9 = null;
      IStrategoTerm w_9 = null;
      IStrategoTerm x_9 = null;
      IStrategoTerm a_11 = null;
      IStrategoTerm b_11 = null;
      IStrategoTerm d_11 = null;
      IStrategoTerm e_11 = null;
      IStrategoTerm f_11 = null;
      d_9 = term;
      h_9 = term;
      l_9 = term;
      i_9 = dynamic.const0;
      m_9 = l_9;
      j_9 = dynamic.const40;
      n_9 = m_9;
      term = r_enter_0_3.instance.invoke(context, n_9, i_9, j_9, dynamic.constLocationInfo19);
      if(term == null)
        break Fail6;
      o_9 = h_9;
      t_9 = d_9;
      p_9 = dynamic.const0;
      u_9 = t_9;
      q_9 = dynamic.const40;
      v_9 = u_9;
      r_9 = dynamic.const44;
      w_9 = v_9;
      term = s_var_0_4.instance.invoke(context, w_9, p_9, q_9, r_9, dynamic.constLocationInfo20);
      if(term == null)
        break Fail6;
      term = o_9;
      x_9 = o_9;
      IStrategoTerm term3 = term;
      Success3:
      { 
        Fail7:
        { 
          IStrategoTerm y_9 = null;
          IStrategoTerm z_9 = null;
          IStrategoTerm b_10 = null;
          IStrategoTerm c_10 = null;
          IStrategoTerm d_10 = null;
          IStrategoTerm e_10 = null;
          IStrategoTerm f_10 = null;
          IStrategoTerm h_10 = null;
          IStrategoTerm i_10 = null;
          IStrategoTerm j_10 = null;
          IStrategoTerm q_10 = null;
          IStrategoTerm r_10 = null;
          IStrategoTerm s_10 = null;
          IStrategoTerm u_10 = null;
          IStrategoTerm v_10 = null;
          IStrategoTerm w_10 = null;
          IStrategoTerm x_10 = null;
          b_10 = term;
          y_9 = dynamic.const0;
          c_10 = b_10;
          z_9 = dynamic.const40;
          d_10 = c_10;
          term = s_step_0_3.instance.invoke(context, d_10, y_9, z_9, dynamic.constLocationInfo21);
          if(term == null)
            break Fail7;
          h_10 = d_9;
          e_10 = dynamic.const0;
          i_10 = h_10;
          f_10 = dynamic.const40;
          j_10 = i_10;
          term = s_step_0_3.instance.invoke(context, j_10, e_10, f_10, dynamic.constLocationInfo22);
          if(term == null)
            break Fail7;
          term = filter_1_0.instance.invoke(context, term, lifted1.instance);
          if(term == null)
            break Fail7;
          e_9 = term;
          u_10 = term;
          q_10 = dynamic.const0;
          v_10 = u_10;
          r_10 = dynamic.const40;
          w_10 = v_10;
          s_10 = dynamic.const48;
          x_10 = w_10;
          term = s_var_0_4.instance.invoke(context, x_10, q_10, r_10, s_10, dynamic.constLocationInfo24);
          if(term == null)
            break Fail7;
          if(true)
            break Success3;
        }
        term = term3;
        IStrategoTerm f_9 = null;
        IStrategoTerm g_9 = null;
        IStrategoTerm z_10 = null;
        f_9 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail6;
        g_9 = term;
        z_10 = f_9;
        term = report_with_failure_0_2.instance.invoke(context, z_10, dynamic.const49, g_9);
        if(term == null)
          break Fail6;
      }
      term = x_9;
      if(e_9 == null)
        break Fail6;
      d_11 = e_9;
      a_11 = dynamic.const0;
      e_11 = d_11;
      b_11 = dynamic.const40;
      f_11 = e_11;
      term = r_exit_0_3.instance.invoke(context, f_11, a_11, b_11, dynamic.constLocationInfo19);
      if(term == null)
        break Fail6;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}