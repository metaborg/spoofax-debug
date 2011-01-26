package localvardebug;

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
      TermReference r_12 = new TermReference();
      IStrategoTerm s_12 = null;
      IStrategoTerm t_12 = null;
      IStrategoTerm w_12 = null;
      IStrategoTerm x_12 = null;
      IStrategoTerm y_12 = null;
      IStrategoTerm a_13 = null;
      IStrategoTerm b_13 = null;
      IStrategoTerm c_13 = null;
      IStrategoTerm d_13 = null;
      IStrategoTerm e_13 = null;
      IStrategoTerm f_13 = null;
      IStrategoTerm g_13 = null;
      IStrategoTerm i_13 = null;
      IStrategoTerm j_13 = null;
      IStrategoTerm k_13 = null;
      IStrategoTerm l_13 = null;
      IStrategoTerm m_13 = null;
      IStrategoTerm n_13 = null;
      IStrategoTerm o_13 = null;
      IStrategoTerm q_13 = null;
      IStrategoTerm r_13 = null;
      IStrategoTerm s_13 = null;
      IStrategoTerm t_13 = null;
      IStrategoTerm u_13 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail10;
      s_12 = term.getSubterm(0);
      if(r_12.value == null)
        r_12.value = term.getSubterm(1);
      else
        if(r_12.value != term.getSubterm(1) && !r_12.value.match(term.getSubterm(1)))
          break Fail10;
      w_12 = term;
      a_13 = term;
      x_12 = localvardebug.const0;
      b_13 = a_13;
      y_12 = localvardebug.const57;
      c_13 = b_13;
      term = r_enter_0_3.instance.invoke(context, c_13, x_12, y_12, localvardebug.constLocationInfo31);
      if(term == null)
        break Fail10;
      d_13 = w_12;
      i_13 = s_12;
      e_13 = localvardebug.const0;
      j_13 = i_13;
      f_13 = localvardebug.const57;
      k_13 = j_13;
      g_13 = localvardebug.const33;
      l_13 = k_13;
      term = s_var_0_4.instance.invoke(context, l_13, e_13, f_13, g_13, localvardebug.constLocationInfo32);
      if(term == null)
        break Fail10;
      if(r_12.value == null)
        break Fail10;
      q_13 = r_12.value;
      m_13 = localvardebug.const0;
      r_13 = q_13;
      n_13 = localvardebug.const57;
      s_13 = r_13;
      o_13 = localvardebug.const35;
      t_13 = s_13;
      term = s_var_0_4.instance.invoke(context, t_13, m_13, n_13, o_13, localvardebug.constLocationInfo33);
      if(term == null)
        break Fail10;
      term = d_13;
      u_13 = d_13;
      IStrategoTerm term5 = term;
      Success5:
      { 
        Fail11:
        { 
          IStrategoTerm v_13 = null;
          IStrategoTerm w_13 = null;
          IStrategoTerm y_13 = null;
          IStrategoTerm z_13 = null;
          IStrategoTerm a_14 = null;
          IStrategoTerm b_14 = null;
          IStrategoTerm c_14 = null;
          IStrategoTerm e_14 = null;
          IStrategoTerm f_14 = null;
          IStrategoTerm g_14 = null;
          IStrategoTerm n_14 = null;
          IStrategoTerm o_14 = null;
          IStrategoTerm p_14 = null;
          IStrategoTerm r_14 = null;
          IStrategoTerm s_14 = null;
          IStrategoTerm t_14 = null;
          IStrategoTerm u_14 = null;
          y_13 = term;
          v_13 = localvardebug.const0;
          z_13 = y_13;
          w_13 = localvardebug.const57;
          a_14 = z_13;
          term = s_step_0_3.instance.invoke(context, a_14, v_13, w_13, localvardebug.constLocationInfo34);
          if(term == null)
            break Fail11;
          e_14 = s_12;
          b_14 = localvardebug.const0;
          f_14 = e_14;
          c_14 = localvardebug.const57;
          g_14 = f_14;
          term = s_step_0_3.instance.invoke(context, g_14, b_14, c_14, localvardebug.constLocationInfo35);
          if(term == null)
            break Fail11;
          lifted3 lifted30 = new lifted3();
          lifted30.r_12 = r_12;
          term = map_1_0.instance.invoke(context, term, lifted30);
          if(term == null)
            break Fail11;
          t_12 = term;
          r_14 = term;
          n_14 = localvardebug.const0;
          s_14 = r_14;
          o_14 = localvardebug.const57;
          t_14 = s_14;
          p_14 = localvardebug.const64;
          u_14 = t_14;
          term = s_var_0_4.instance.invoke(context, u_14, n_14, o_14, p_14, localvardebug.constLocationInfo37);
          if(term == null)
            break Fail11;
          if(true)
            break Success5;
        }
        term = term5;
        IStrategoTerm u_12 = null;
        IStrategoTerm v_12 = null;
        IStrategoTerm w_14 = null;
        u_12 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail10;
        v_12 = term;
        w_14 = u_12;
        term = report_with_failure_0_2.instance.invoke(context, w_14, localvardebug.const65, v_12);
        if(term == null)
          break Fail10;
      }
      term = u_13;
      IStrategoTerm x_14 = null;
      IStrategoTerm y_14 = null;
      IStrategoTerm a_15 = null;
      IStrategoTerm b_15 = null;
      IStrategoTerm c_15 = null;
      if(t_12 == null)
        break Fail10;
      a_15 = t_12;
      x_14 = localvardebug.const0;
      b_15 = a_15;
      y_14 = localvardebug.const57;
      c_15 = b_15;
      term = r_exit_0_3.instance.invoke(context, c_15, x_14, y_14, localvardebug.constLocationInfo31);
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