package testimports;

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
    Fail13:
    { 
      IStrategoTerm z_11 = null;
      IStrategoTerm a_12 = null;
      IStrategoTerm d_12 = null;
      IStrategoTerm e_12 = null;
      IStrategoTerm f_12 = null;
      IStrategoTerm h_12 = null;
      IStrategoTerm i_12 = null;
      IStrategoTerm j_12 = null;
      IStrategoTerm k_12 = null;
      IStrategoTerm l_12 = null;
      IStrategoTerm m_12 = null;
      IStrategoTerm n_12 = null;
      IStrategoTerm p_12 = null;
      IStrategoTerm q_12 = null;
      IStrategoTerm r_12 = null;
      IStrategoTerm s_12 = null;
      IStrategoTerm t_12 = null;
      IStrategoTerm w_13 = null;
      IStrategoTerm x_13 = null;
      IStrategoTerm z_13 = null;
      IStrategoTerm a_14 = null;
      IStrategoTerm b_14 = null;
      z_11 = term;
      d_12 = term;
      h_12 = term;
      e_12 = testimports.const24;
      i_12 = h_12;
      f_12 = testimports.const47;
      j_12 = i_12;
      term = r_enter_0_3.instance.invoke(context, j_12, e_12, f_12, testimports.constLocationInfo29);
      if(term == null)
        break Fail13;
      k_12 = d_12;
      p_12 = z_11;
      l_12 = testimports.const24;
      q_12 = p_12;
      m_12 = testimports.const47;
      r_12 = q_12;
      n_12 = testimports.const50;
      s_12 = r_12;
      term = s_var_0_4.instance.invoke(context, s_12, l_12, m_12, n_12, testimports.constLocationInfo30);
      if(term == null)
        break Fail13;
      term = k_12;
      t_12 = k_12;
      IStrategoTerm term7 = term;
      Success7:
      { 
        Fail14:
        { 
          IStrategoTerm u_12 = null;
          IStrategoTerm v_12 = null;
          IStrategoTerm x_12 = null;
          IStrategoTerm y_12 = null;
          IStrategoTerm z_12 = null;
          IStrategoTerm a_13 = null;
          IStrategoTerm b_13 = null;
          IStrategoTerm d_13 = null;
          IStrategoTerm e_13 = null;
          IStrategoTerm f_13 = null;
          IStrategoTerm m_13 = null;
          IStrategoTerm n_13 = null;
          IStrategoTerm o_13 = null;
          IStrategoTerm q_13 = null;
          IStrategoTerm r_13 = null;
          IStrategoTerm s_13 = null;
          IStrategoTerm t_13 = null;
          x_12 = term;
          u_12 = testimports.const24;
          y_12 = x_12;
          v_12 = testimports.const47;
          z_12 = y_12;
          term = s_step_0_3.instance.invoke(context, z_12, u_12, v_12, testimports.constLocationInfo31);
          if(term == null)
            break Fail14;
          d_13 = z_11;
          a_13 = testimports.const24;
          e_13 = d_13;
          b_13 = testimports.const47;
          f_13 = e_13;
          term = s_step_0_3.instance.invoke(context, f_13, a_13, b_13, testimports.constLocationInfo32);
          if(term == null)
            break Fail14;
          term = filter_1_0.instance.invoke(context, term, lifted2.instance);
          if(term == null)
            break Fail14;
          a_12 = term;
          q_13 = term;
          m_13 = testimports.const24;
          r_13 = q_13;
          n_13 = testimports.const47;
          s_13 = r_13;
          o_13 = testimports.const53;
          t_13 = s_13;
          term = s_var_0_4.instance.invoke(context, t_13, m_13, n_13, o_13, testimports.constLocationInfo34);
          if(term == null)
            break Fail14;
          if(true)
            break Success7;
        }
        term = term7;
        IStrategoTerm b_12 = null;
        IStrategoTerm c_12 = null;
        IStrategoTerm v_13 = null;
        b_12 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail13;
        c_12 = term;
        v_13 = b_12;
        term = report_with_failure_0_2.instance.invoke(context, v_13, testimports.const54, c_12);
        if(term == null)
          break Fail13;
      }
      term = t_12;
      if(a_12 == null)
        break Fail13;
      z_13 = a_12;
      w_13 = testimports.const24;
      a_14 = z_13;
      x_13 = testimports.const47;
      b_14 = a_14;
      term = r_exit_0_3.instance.invoke(context, b_14, w_13, x_13, testimports.constLocationInfo29);
      if(term == null)
        break Fail13;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}