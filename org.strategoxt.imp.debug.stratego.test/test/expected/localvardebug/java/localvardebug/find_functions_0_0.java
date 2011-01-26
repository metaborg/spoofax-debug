package localvardebug;

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
      IStrategoTerm h_8 = null;
      IStrategoTerm i_8 = null;
      IStrategoTerm l_8 = null;
      IStrategoTerm m_8 = null;
      IStrategoTerm n_8 = null;
      IStrategoTerm p_8 = null;
      IStrategoTerm q_8 = null;
      IStrategoTerm r_8 = null;
      IStrategoTerm s_8 = null;
      IStrategoTerm t_8 = null;
      IStrategoTerm u_8 = null;
      IStrategoTerm v_8 = null;
      IStrategoTerm x_8 = null;
      IStrategoTerm y_8 = null;
      IStrategoTerm z_8 = null;
      IStrategoTerm a_9 = null;
      IStrategoTerm b_9 = null;
      IStrategoTerm e_10 = null;
      IStrategoTerm f_10 = null;
      IStrategoTerm h_10 = null;
      IStrategoTerm i_10 = null;
      IStrategoTerm j_10 = null;
      h_8 = term;
      l_8 = term;
      p_8 = term;
      m_8 = localvardebug.const0;
      q_8 = p_8;
      n_8 = localvardebug.const40;
      r_8 = q_8;
      term = r_enter_0_3.instance.invoke(context, r_8, m_8, n_8, localvardebug.constLocationInfo19);
      if(term == null)
        break Fail6;
      s_8 = l_8;
      x_8 = h_8;
      t_8 = localvardebug.const0;
      y_8 = x_8;
      u_8 = localvardebug.const40;
      z_8 = y_8;
      v_8 = localvardebug.const44;
      a_9 = z_8;
      term = s_var_0_4.instance.invoke(context, a_9, t_8, u_8, v_8, localvardebug.constLocationInfo20);
      if(term == null)
        break Fail6;
      term = s_8;
      b_9 = s_8;
      IStrategoTerm term3 = term;
      Success3:
      { 
        Fail7:
        { 
          IStrategoTerm c_9 = null;
          IStrategoTerm d_9 = null;
          IStrategoTerm f_9 = null;
          IStrategoTerm g_9 = null;
          IStrategoTerm h_9 = null;
          IStrategoTerm i_9 = null;
          IStrategoTerm j_9 = null;
          IStrategoTerm l_9 = null;
          IStrategoTerm m_9 = null;
          IStrategoTerm n_9 = null;
          IStrategoTerm u_9 = null;
          IStrategoTerm v_9 = null;
          IStrategoTerm w_9 = null;
          IStrategoTerm y_9 = null;
          IStrategoTerm z_9 = null;
          IStrategoTerm a_10 = null;
          IStrategoTerm b_10 = null;
          f_9 = term;
          c_9 = localvardebug.const0;
          g_9 = f_9;
          d_9 = localvardebug.const40;
          h_9 = g_9;
          term = s_step_0_3.instance.invoke(context, h_9, c_9, d_9, localvardebug.constLocationInfo21);
          if(term == null)
            break Fail7;
          l_9 = h_8;
          i_9 = localvardebug.const0;
          m_9 = l_9;
          j_9 = localvardebug.const40;
          n_9 = m_9;
          term = s_step_0_3.instance.invoke(context, n_9, i_9, j_9, localvardebug.constLocationInfo22);
          if(term == null)
            break Fail7;
          term = filter_1_0.instance.invoke(context, term, lifted1.instance);
          if(term == null)
            break Fail7;
          i_8 = term;
          y_9 = term;
          u_9 = localvardebug.const0;
          z_9 = y_9;
          v_9 = localvardebug.const40;
          a_10 = z_9;
          w_9 = localvardebug.const48;
          b_10 = a_10;
          term = s_var_0_4.instance.invoke(context, b_10, u_9, v_9, w_9, localvardebug.constLocationInfo24);
          if(term == null)
            break Fail7;
          if(true)
            break Success3;
        }
        term = term3;
        IStrategoTerm j_8 = null;
        IStrategoTerm k_8 = null;
        IStrategoTerm d_10 = null;
        j_8 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail6;
        k_8 = term;
        d_10 = j_8;
        term = report_with_failure_0_2.instance.invoke(context, d_10, localvardebug.const49, k_8);
        if(term == null)
          break Fail6;
      }
      term = b_9;
      if(i_8 == null)
        break Fail6;
      h_10 = i_8;
      e_10 = localvardebug.const0;
      i_10 = h_10;
      f_10 = localvardebug.const40;
      j_10 = i_10;
      term = r_exit_0_3.instance.invoke(context, j_10, e_10, f_10, localvardebug.constLocationInfo19);
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