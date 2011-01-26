package dynamic;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("find_comment_match_0_1");
    Fail14:
    { 
      IStrategoTerm j_17 = null;
      IStrategoTerm k_17 = null;
      IStrategoTerm l_17 = null;
      IStrategoTerm n_17 = null;
      IStrategoTerm o_17 = null;
      IStrategoTerm p_17 = null;
      IStrategoTerm r_17 = null;
      IStrategoTerm s_17 = null;
      IStrategoTerm t_17 = null;
      IStrategoTerm u_17 = null;
      IStrategoTerm v_17 = null;
      IStrategoTerm w_17 = null;
      IStrategoTerm x_17 = null;
      IStrategoTerm z_17 = null;
      IStrategoTerm a_18 = null;
      IStrategoTerm b_18 = null;
      IStrategoTerm c_18 = null;
      IStrategoTerm d_18 = null;
      IStrategoTerm e_18 = null;
      IStrategoTerm f_18 = null;
      IStrategoTerm g_18 = null;
      IStrategoTerm i_18 = null;
      IStrategoTerm j_18 = null;
      IStrategoTerm k_18 = null;
      IStrategoTerm l_18 = null;
      IStrategoTerm n_18 = null;
      IStrategoTerm o_18 = null;
      IStrategoTerm q_18 = null;
      IStrategoTerm r_18 = null;
      IStrategoTerm s_18 = null;
      IStrategoTerm t_18 = null;
      IStrategoTerm u_18 = null;
      IStrategoTerm w_18 = null;
      IStrategoTerm x_18 = null;
      IStrategoTerm y_18 = null;
      IStrategoTerm z_18 = null;
      IStrategoTerm a_19 = null;
      IStrategoTerm b_19 = null;
      IStrategoTerm d_19 = null;
      IStrategoTerm e_19 = null;
      IStrategoTerm f_19 = null;
      IStrategoTerm g_19 = null;
      IStrategoTerm h_19 = null;
      IStrategoTerm i_19 = null;
      IStrategoTerm k_19 = null;
      IStrategoTerm l_19 = null;
      IStrategoTerm m_19 = null;
      IStrategoTerm m_17 = null;
      IStrategoTerm n_19 = null;
      IStrategoTerm o_19 = null;
      IStrategoTerm q_19 = null;
      IStrategoTerm r_19 = null;
      IStrategoTerm s_19 = null;
      IStrategoTerm t_19 = null;
      IStrategoTerm u_19 = null;
      IStrategoTerm w_19 = null;
      IStrategoTerm x_19 = null;
      IStrategoTerm y_19 = null;
      IStrategoTerm z_19 = null;
      IStrategoTerm a_20 = null;
      IStrategoTerm c_20 = null;
      IStrategoTerm d_20 = null;
      IStrategoTerm e_20 = null;
      IStrategoTerm f_20 = null;
      IStrategoTerm g_20 = null;
      IStrategoTerm h_20 = null;
      IStrategoTerm j_20 = null;
      IStrategoTerm k_20 = null;
      IStrategoTerm l_20 = null;
      IStrategoTerm m_20 = null;
      j_17 = term;
      n_17 = term;
      r_17 = term;
      o_17 = dynamic.const0;
      s_17 = r_17;
      p_17 = dynamic.const71;
      t_17 = s_17;
      term = r_enter_0_3.instance.invoke(context, t_17, o_17, p_17, dynamic.constLocationInfo41);
      if(term == null)
        break Fail14;
      u_17 = n_17;
      z_17 = i_17;
      v_17 = dynamic.const0;
      a_18 = z_17;
      w_17 = dynamic.const71;
      b_18 = a_18;
      x_17 = dynamic.const35;
      c_18 = b_18;
      term = s_var_0_4.instance.invoke(context, c_18, v_17, w_17, x_17, dynamic.constLocationInfo42);
      if(term == null)
        break Fail14;
      d_18 = u_17;
      i_18 = j_17;
      e_18 = dynamic.const0;
      j_18 = i_18;
      f_18 = dynamic.const71;
      k_18 = j_18;
      g_18 = dynamic.const76;
      l_18 = k_18;
      term = s_var_0_4.instance.invoke(context, l_18, e_18, f_18, g_18, dynamic.constLocationInfo43);
      if(term == null)
        break Fail14;
      term = d_18;
      q_18 = term;
      n_18 = dynamic.const0;
      r_18 = q_18;
      o_18 = dynamic.const71;
      s_18 = r_18;
      term = s_step_0_3.instance.invoke(context, s_18, n_18, o_18, dynamic.constLocationInfo44);
      if(term == null)
        break Fail14;
      w_18 = j_17;
      t_18 = dynamic.const0;
      x_18 = w_18;
      u_18 = dynamic.const71;
      y_18 = x_18;
      term = s_step_0_3.instance.invoke(context, y_18, t_18, u_18, dynamic.constLocationInfo45);
      if(term == null)
        break Fail14;
      term = get_function_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail14;
      k_17 = term;
      d_19 = term;
      z_18 = dynamic.const0;
      e_19 = d_19;
      a_19 = dynamic.const71;
      f_19 = e_19;
      b_19 = dynamic.const80;
      g_19 = f_19;
      term = s_var_0_4.instance.invoke(context, g_19, z_18, a_19, b_19, dynamic.constLocationInfo46);
      if(term == null)
        break Fail14;
      k_19 = term;
      h_19 = dynamic.const0;
      l_19 = k_19;
      i_19 = dynamic.const71;
      m_19 = l_19;
      term = s_step_0_3.instance.invoke(context, m_19, h_19, i_19, dynamic.constLocationInfo47);
      if(term == null)
        break Fail14;
      m_17 = term;
      q_19 = term;
      n_19 = dynamic.const84;
      r_19 = q_19;
      o_19 = dynamic.constCons0;
      s_19 = r_19;
      term = termFactory.makeTuple(dynamic.const85, k_17);
      term = dr_set_rule_0_3.instance.invoke(context, s_19, n_19, o_19, term);
      if(term == null)
        break Fail14;
      w_19 = m_17;
      t_19 = dynamic.const0;
      x_19 = w_19;
      u_19 = dynamic.const71;
      y_19 = x_19;
      term = s_step_0_3.instance.invoke(context, y_19, t_19, u_19, dynamic.constLocationInfo48);
      if(term == null)
        break Fail14;
      c_20 = i_17;
      z_19 = dynamic.const0;
      d_20 = c_20;
      a_20 = dynamic.const71;
      e_20 = d_20;
      term = s_step_0_3.instance.invoke(context, e_20, z_19, a_20, dynamic.constLocationInfo49);
      if(term == null)
        break Fail14;
      term = find_comment_by_name_0_1.instance.invoke(context, term, k_17);
      if(term == null)
        break Fail14;
      l_17 = term;
      j_20 = term;
      f_20 = dynamic.const0;
      k_20 = j_20;
      g_20 = dynamic.const71;
      l_20 = k_20;
      h_20 = dynamic.const86;
      m_20 = l_20;
      term = s_var_0_4.instance.invoke(context, m_20, f_20, g_20, h_20, dynamic.constLocationInfo50);
      if(term == null)
        break Fail14;
      IStrategoTerm n_20 = null;
      IStrategoTerm o_20 = null;
      IStrategoTerm q_20 = null;
      IStrategoTerm r_20 = null;
      IStrategoTerm s_20 = null;
      term = termFactory.makeTuple(j_17, l_17);
      q_20 = term;
      n_20 = dynamic.const0;
      r_20 = q_20;
      o_20 = dynamic.const71;
      s_20 = r_20;
      term = r_exit_0_3.instance.invoke(context, s_20, n_20, o_20, dynamic.constLocationInfo41);
      if(term == null)
        break Fail14;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}