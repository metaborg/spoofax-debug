package testimports;

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
    Fail15:
    { 
      IStrategoTerm e_14 = null;
      IStrategoTerm f_14 = null;
      IStrategoTerm i_14 = null;
      IStrategoTerm j_14 = null;
      IStrategoTerm k_14 = null;
      IStrategoTerm m_14 = null;
      IStrategoTerm n_14 = null;
      IStrategoTerm o_14 = null;
      IStrategoTerm p_14 = null;
      IStrategoTerm q_14 = null;
      IStrategoTerm r_14 = null;
      IStrategoTerm s_14 = null;
      IStrategoTerm u_14 = null;
      IStrategoTerm v_14 = null;
      IStrategoTerm w_14 = null;
      IStrategoTerm x_14 = null;
      IStrategoTerm y_14 = null;
      IStrategoTerm b_16 = null;
      IStrategoTerm c_16 = null;
      IStrategoTerm e_16 = null;
      IStrategoTerm f_16 = null;
      IStrategoTerm g_16 = null;
      e_14 = term;
      i_14 = term;
      m_14 = term;
      j_14 = testimports.const24;
      n_14 = m_14;
      k_14 = testimports.const55;
      o_14 = n_14;
      term = r_enter_0_3.instance.invoke(context, o_14, j_14, k_14, testimports.constLocationInfo35);
      if(term == null)
        break Fail15;
      p_14 = i_14;
      u_14 = e_14;
      q_14 = testimports.const24;
      v_14 = u_14;
      r_14 = testimports.const55;
      w_14 = v_14;
      s_14 = testimports.const50;
      x_14 = w_14;
      term = s_var_0_4.instance.invoke(context, x_14, q_14, r_14, s_14, testimports.constLocationInfo36);
      if(term == null)
        break Fail15;
      term = p_14;
      y_14 = p_14;
      IStrategoTerm term8 = term;
      Success8:
      { 
        Fail16:
        { 
          IStrategoTerm z_14 = null;
          IStrategoTerm a_15 = null;
          IStrategoTerm c_15 = null;
          IStrategoTerm d_15 = null;
          IStrategoTerm e_15 = null;
          IStrategoTerm f_15 = null;
          IStrategoTerm g_15 = null;
          IStrategoTerm i_15 = null;
          IStrategoTerm j_15 = null;
          IStrategoTerm k_15 = null;
          IStrategoTerm r_15 = null;
          IStrategoTerm s_15 = null;
          IStrategoTerm t_15 = null;
          IStrategoTerm v_15 = null;
          IStrategoTerm w_15 = null;
          IStrategoTerm x_15 = null;
          IStrategoTerm y_15 = null;
          c_15 = term;
          z_14 = testimports.const24;
          d_15 = c_15;
          a_15 = testimports.const55;
          e_15 = d_15;
          term = s_step_0_3.instance.invoke(context, e_15, z_14, a_15, testimports.constLocationInfo37);
          if(term == null)
            break Fail16;
          i_15 = e_14;
          f_15 = testimports.const24;
          j_15 = i_15;
          g_15 = testimports.const55;
          k_15 = j_15;
          term = s_step_0_3.instance.invoke(context, k_15, f_15, g_15, testimports.constLocationInfo38);
          if(term == null)
            break Fail16;
          term = filter_1_0.instance.invoke(context, term, lifted3.instance);
          if(term == null)
            break Fail16;
          f_14 = term;
          v_15 = term;
          r_15 = testimports.const24;
          w_15 = v_15;
          s_15 = testimports.const55;
          x_15 = w_15;
          t_15 = testimports.const59;
          y_15 = x_15;
          term = s_var_0_4.instance.invoke(context, y_15, r_15, s_15, t_15, testimports.constLocationInfo40);
          if(term == null)
            break Fail16;
          if(true)
            break Success8;
        }
        term = term8;
        IStrategoTerm g_14 = null;
        IStrategoTerm h_14 = null;
        IStrategoTerm a_16 = null;
        g_14 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail15;
        h_14 = term;
        a_16 = g_14;
        term = report_with_failure_0_2.instance.invoke(context, a_16, testimports.const60, h_14);
        if(term == null)
          break Fail15;
      }
      term = y_14;
      if(f_14 == null)
        break Fail15;
      e_16 = f_14;
      b_16 = testimports.const24;
      f_16 = e_16;
      c_16 = testimports.const55;
      g_16 = f_16;
      term = r_exit_0_3.instance.invoke(context, g_16, b_16, c_16, testimports.constLocationInfo35);
      if(term == null)
        break Fail15;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}