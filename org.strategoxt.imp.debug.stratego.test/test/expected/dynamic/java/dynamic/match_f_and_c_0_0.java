package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_f_and_c_0_0 extends Strategy 
{ 
  public static match_f_and_c_0_0 instance = new match_f_and_c_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("match_f_and_c_0_0");
    Fail10:
    { 
      TermReference n_13 = new TermReference();
      IStrategoTerm o_13 = null;
      IStrategoTerm p_13 = null;
      IStrategoTerm s_13 = null;
      IStrategoTerm t_13 = null;
      IStrategoTerm u_13 = null;
      IStrategoTerm w_13 = null;
      IStrategoTerm x_13 = null;
      IStrategoTerm y_13 = null;
      IStrategoTerm z_13 = null;
      IStrategoTerm a_14 = null;
      IStrategoTerm b_14 = null;
      IStrategoTerm c_14 = null;
      IStrategoTerm e_14 = null;
      IStrategoTerm f_14 = null;
      IStrategoTerm g_14 = null;
      IStrategoTerm h_14 = null;
      IStrategoTerm i_14 = null;
      IStrategoTerm j_14 = null;
      IStrategoTerm k_14 = null;
      IStrategoTerm m_14 = null;
      IStrategoTerm n_14 = null;
      IStrategoTerm o_14 = null;
      IStrategoTerm p_14 = null;
      IStrategoTerm q_14 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail10;
      o_13 = term.getSubterm(0);
      if(n_13.value == null)
        n_13.value = term.getSubterm(1);
      else
        if(n_13.value != term.getSubterm(1) && !n_13.value.match(term.getSubterm(1)))
          break Fail10;
      s_13 = term;
      w_13 = term;
      t_13 = dynamic.const0;
      x_13 = w_13;
      u_13 = dynamic.const57;
      y_13 = x_13;
      term = r_enter_0_3.instance.invoke(context, y_13, t_13, u_13, dynamic.constLocationInfo31);
      if(term == null)
        break Fail10;
      z_13 = s_13;
      e_14 = o_13;
      a_14 = dynamic.const0;
      f_14 = e_14;
      b_14 = dynamic.const57;
      g_14 = f_14;
      c_14 = dynamic.const33;
      h_14 = g_14;
      term = s_var_0_4.instance.invoke(context, h_14, a_14, b_14, c_14, dynamic.constLocationInfo32);
      if(term == null)
        break Fail10;
      if(n_13.value == null)
        break Fail10;
      m_14 = n_13.value;
      i_14 = dynamic.const0;
      n_14 = m_14;
      j_14 = dynamic.const57;
      o_14 = n_14;
      k_14 = dynamic.const35;
      p_14 = o_14;
      term = s_var_0_4.instance.invoke(context, p_14, i_14, j_14, k_14, dynamic.constLocationInfo33);
      if(term == null)
        break Fail10;
      term = z_13;
      q_14 = z_13;
      IStrategoTerm term5 = term;
      Success5:
      { 
        Fail11:
        { 
          IStrategoTerm r_14 = null;
          IStrategoTerm s_14 = null;
          IStrategoTerm u_14 = null;
          IStrategoTerm v_14 = null;
          IStrategoTerm w_14 = null;
          IStrategoTerm x_14 = null;
          IStrategoTerm y_14 = null;
          IStrategoTerm a_15 = null;
          IStrategoTerm b_15 = null;
          IStrategoTerm c_15 = null;
          IStrategoTerm j_15 = null;
          IStrategoTerm k_15 = null;
          IStrategoTerm l_15 = null;
          IStrategoTerm n_15 = null;
          IStrategoTerm o_15 = null;
          IStrategoTerm p_15 = null;
          IStrategoTerm q_15 = null;
          u_14 = term;
          r_14 = dynamic.const0;
          v_14 = u_14;
          s_14 = dynamic.const57;
          w_14 = v_14;
          term = s_step_0_3.instance.invoke(context, w_14, r_14, s_14, dynamic.constLocationInfo34);
          if(term == null)
            break Fail11;
          a_15 = o_13;
          x_14 = dynamic.const0;
          b_15 = a_15;
          y_14 = dynamic.const57;
          c_15 = b_15;
          term = s_step_0_3.instance.invoke(context, c_15, x_14, y_14, dynamic.constLocationInfo35);
          if(term == null)
            break Fail11;
          lifted3 lifted30 = new lifted3();
          lifted30.n_13 = n_13;
          term = map_1_0.instance.invoke(context, term, lifted30);
          if(term == null)
            break Fail11;
          p_13 = term;
          n_15 = term;
          j_15 = dynamic.const0;
          o_15 = n_15;
          k_15 = dynamic.const57;
          p_15 = o_15;
          l_15 = dynamic.const64;
          q_15 = p_15;
          term = s_var_0_4.instance.invoke(context, q_15, j_15, k_15, l_15, dynamic.constLocationInfo37);
          if(term == null)
            break Fail11;
          if(true)
            break Success5;
        }
        term = term5;
        IStrategoTerm q_13 = null;
        IStrategoTerm r_13 = null;
        IStrategoTerm s_15 = null;
        q_13 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail10;
        r_13 = term;
        s_15 = q_13;
        term = report_with_failure_0_2.instance.invoke(context, s_15, dynamic.const65, r_13);
        if(term == null)
          break Fail10;
      }
      term = q_14;
      IStrategoTerm t_15 = null;
      IStrategoTerm u_15 = null;
      IStrategoTerm w_15 = null;
      IStrategoTerm x_15 = null;
      IStrategoTerm y_15 = null;
      if(p_13 == null)
        break Fail10;
      w_15 = p_13;
      t_15 = dynamic.const0;
      x_15 = w_15;
      u_15 = dynamic.const57;
      y_15 = x_15;
      term = r_exit_0_3.instance.invoke(context, y_15, t_15, u_15, dynamic.constLocationInfo31);
      if(term == null)
        break Fail10;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}