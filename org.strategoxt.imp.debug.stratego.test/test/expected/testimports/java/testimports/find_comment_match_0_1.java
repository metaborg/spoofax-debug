package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comment_match_0_1 extends Strategy 
{ 
  public static find_comment_match_0_1 instance = new find_comment_match_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_20)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("find_comment_match_0_1");
    Fail21:
    { 
      IStrategoTerm e_20 = null;
      IStrategoTerm f_20 = null;
      IStrategoTerm g_20 = null;
      IStrategoTerm h_20 = null;
      IStrategoTerm i_20 = null;
      IStrategoTerm j_20 = null;
      IStrategoTerm l_20 = null;
      IStrategoTerm m_20 = null;
      IStrategoTerm n_20 = null;
      IStrategoTerm o_20 = null;
      IStrategoTerm p_20 = null;
      IStrategoTerm q_20 = null;
      IStrategoTerm r_20 = null;
      IStrategoTerm t_20 = null;
      IStrategoTerm u_20 = null;
      IStrategoTerm v_20 = null;
      IStrategoTerm w_20 = null;
      IStrategoTerm x_20 = null;
      IStrategoTerm y_20 = null;
      IStrategoTerm z_20 = null;
      IStrategoTerm a_21 = null;
      IStrategoTerm c_21 = null;
      IStrategoTerm d_21 = null;
      IStrategoTerm e_21 = null;
      IStrategoTerm f_21 = null;
      IStrategoTerm h_21 = null;
      IStrategoTerm i_21 = null;
      IStrategoTerm k_21 = null;
      IStrategoTerm l_21 = null;
      IStrategoTerm m_21 = null;
      IStrategoTerm n_21 = null;
      IStrategoTerm o_21 = null;
      IStrategoTerm q_21 = null;
      IStrategoTerm r_21 = null;
      IStrategoTerm s_21 = null;
      IStrategoTerm t_21 = null;
      IStrategoTerm u_21 = null;
      IStrategoTerm v_21 = null;
      IStrategoTerm x_21 = null;
      IStrategoTerm y_21 = null;
      IStrategoTerm z_21 = null;
      IStrategoTerm a_22 = null;
      IStrategoTerm b_22 = null;
      IStrategoTerm c_22 = null;
      IStrategoTerm e_22 = null;
      IStrategoTerm f_22 = null;
      IStrategoTerm g_22 = null;
      IStrategoTerm h_22 = null;
      IStrategoTerm i_22 = null;
      IStrategoTerm k_22 = null;
      IStrategoTerm l_22 = null;
      IStrategoTerm m_22 = null;
      IStrategoTerm n_22 = null;
      IStrategoTerm o_22 = null;
      IStrategoTerm p_22 = null;
      IStrategoTerm r_22 = null;
      IStrategoTerm s_22 = null;
      IStrategoTerm t_22 = null;
      IStrategoTerm u_22 = null;
      e_20 = term;
      h_20 = term;
      l_20 = term;
      i_20 = testimports.const24;
      m_20 = l_20;
      j_20 = testimports.const74;
      n_20 = m_20;
      term = r_enter_0_3.instance.invoke(context, n_20, i_20, j_20, testimports.constLocationInfo51);
      if(term == null)
        break Fail21;
      o_20 = h_20;
      t_20 = d_20;
      p_20 = testimports.const24;
      u_20 = t_20;
      q_20 = testimports.const74;
      v_20 = u_20;
      r_20 = testimports.const44;
      w_20 = v_20;
      term = s_var_0_4.instance.invoke(context, w_20, p_20, q_20, r_20, testimports.constLocationInfo52);
      if(term == null)
        break Fail21;
      x_20 = o_20;
      c_21 = e_20;
      y_20 = testimports.const24;
      d_21 = c_21;
      z_20 = testimports.const74;
      e_21 = d_21;
      a_21 = testimports.const77;
      f_21 = e_21;
      term = s_var_0_4.instance.invoke(context, f_21, y_20, z_20, a_21, testimports.constLocationInfo53);
      if(term == null)
        break Fail21;
      term = x_20;
      k_21 = term;
      h_21 = testimports.const24;
      l_21 = k_21;
      i_21 = testimports.const74;
      m_21 = l_21;
      term = s_step_0_3.instance.invoke(context, m_21, h_21, i_21, testimports.constLocationInfo54);
      if(term == null)
        break Fail21;
      q_21 = e_20;
      n_21 = testimports.const24;
      r_21 = q_21;
      o_21 = testimports.const74;
      s_21 = r_21;
      term = s_step_0_3.instance.invoke(context, s_21, n_21, o_21, testimports.constLocationInfo55);
      if(term == null)
        break Fail21;
      term = get_function_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21;
      f_20 = term;
      x_21 = term;
      t_21 = testimports.const24;
      y_21 = x_21;
      u_21 = testimports.const74;
      z_21 = y_21;
      v_21 = testimports.const81;
      a_22 = z_21;
      term = s_var_0_4.instance.invoke(context, a_22, t_21, u_21, v_21, testimports.constLocationInfo56);
      if(term == null)
        break Fail21;
      e_22 = term;
      b_22 = testimports.const24;
      f_22 = e_22;
      c_22 = testimports.const74;
      g_22 = f_22;
      term = s_step_0_3.instance.invoke(context, g_22, b_22, c_22, testimports.constLocationInfo57);
      if(term == null)
        break Fail21;
      k_22 = d_20;
      h_22 = testimports.const24;
      l_22 = k_22;
      i_22 = testimports.const74;
      m_22 = l_22;
      term = s_step_0_3.instance.invoke(context, m_22, h_22, i_22, testimports.constLocationInfo58);
      if(term == null)
        break Fail21;
      term = find_comment_by_name_0_1.instance.invoke(context, term, f_20);
      if(term == null)
        break Fail21;
      g_20 = term;
      r_22 = term;
      n_22 = testimports.const24;
      s_22 = r_22;
      o_22 = testimports.const74;
      t_22 = s_22;
      p_22 = testimports.const82;
      u_22 = t_22;
      term = s_var_0_4.instance.invoke(context, u_22, n_22, o_22, p_22, testimports.constLocationInfo59);
      if(term == null)
        break Fail21;
      IStrategoTerm v_22 = null;
      IStrategoTerm w_22 = null;
      IStrategoTerm y_22 = null;
      IStrategoTerm z_22 = null;
      IStrategoTerm a_23 = null;
      term = termFactory.makeTuple(e_20, g_20);
      y_22 = term;
      v_22 = testimports.const24;
      z_22 = y_22;
      w_22 = testimports.const74;
      a_23 = z_22;
      term = r_exit_0_3.instance.invoke(context, a_23, v_22, w_22, testimports.constLocationInfo51);
      if(term == null)
        break Fail21;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}