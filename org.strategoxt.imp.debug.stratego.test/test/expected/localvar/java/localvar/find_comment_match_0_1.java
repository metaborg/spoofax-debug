package localvar;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_16)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("find_comment_match_0_1");
    Fail14:
    { 
      IStrategoTerm m_16 = null;
      IStrategoTerm n_16 = null;
      IStrategoTerm o_16 = null;
      IStrategoTerm p_16 = null;
      IStrategoTerm q_16 = null;
      IStrategoTerm r_16 = null;
      IStrategoTerm t_16 = null;
      IStrategoTerm u_16 = null;
      IStrategoTerm v_16 = null;
      IStrategoTerm w_16 = null;
      IStrategoTerm x_16 = null;
      IStrategoTerm y_16 = null;
      IStrategoTerm z_16 = null;
      IStrategoTerm b_17 = null;
      IStrategoTerm c_17 = null;
      IStrategoTerm d_17 = null;
      IStrategoTerm e_17 = null;
      IStrategoTerm f_17 = null;
      IStrategoTerm g_17 = null;
      IStrategoTerm h_17 = null;
      IStrategoTerm i_17 = null;
      IStrategoTerm k_17 = null;
      IStrategoTerm l_17 = null;
      IStrategoTerm m_17 = null;
      IStrategoTerm n_17 = null;
      IStrategoTerm p_17 = null;
      IStrategoTerm q_17 = null;
      IStrategoTerm s_17 = null;
      IStrategoTerm t_17 = null;
      IStrategoTerm u_17 = null;
      IStrategoTerm v_17 = null;
      IStrategoTerm w_17 = null;
      IStrategoTerm y_17 = null;
      IStrategoTerm z_17 = null;
      IStrategoTerm a_18 = null;
      IStrategoTerm b_18 = null;
      IStrategoTerm c_18 = null;
      IStrategoTerm d_18 = null;
      IStrategoTerm f_18 = null;
      IStrategoTerm g_18 = null;
      IStrategoTerm h_18 = null;
      IStrategoTerm i_18 = null;
      IStrategoTerm j_18 = null;
      IStrategoTerm k_18 = null;
      IStrategoTerm m_18 = null;
      IStrategoTerm n_18 = null;
      IStrategoTerm o_18 = null;
      IStrategoTerm p_18 = null;
      IStrategoTerm q_18 = null;
      IStrategoTerm s_18 = null;
      IStrategoTerm t_18 = null;
      IStrategoTerm u_18 = null;
      IStrategoTerm v_18 = null;
      IStrategoTerm w_18 = null;
      IStrategoTerm x_18 = null;
      IStrategoTerm z_18 = null;
      IStrategoTerm a_19 = null;
      IStrategoTerm b_19 = null;
      IStrategoTerm c_19 = null;
      m_16 = term;
      p_16 = term;
      t_16 = term;
      q_16 = localvar.const0;
      u_16 = t_16;
      r_16 = localvar.const71;
      v_16 = u_16;
      term = r_enter_0_3.instance.invoke(context, v_16, q_16, r_16, localvar.constLocationInfo41);
      if(term == null)
        break Fail14;
      w_16 = p_16;
      b_17 = l_16;
      x_16 = localvar.const0;
      c_17 = b_17;
      y_16 = localvar.const71;
      d_17 = c_17;
      z_16 = localvar.const35;
      e_17 = d_17;
      term = s_var_0_4.instance.invoke(context, e_17, x_16, y_16, z_16, localvar.constLocationInfo42);
      if(term == null)
        break Fail14;
      f_17 = w_16;
      k_17 = m_16;
      g_17 = localvar.const0;
      l_17 = k_17;
      h_17 = localvar.const71;
      m_17 = l_17;
      i_17 = localvar.const76;
      n_17 = m_17;
      term = s_var_0_4.instance.invoke(context, n_17, g_17, h_17, i_17, localvar.constLocationInfo43);
      if(term == null)
        break Fail14;
      term = f_17;
      s_17 = term;
      p_17 = localvar.const0;
      t_17 = s_17;
      q_17 = localvar.const71;
      u_17 = t_17;
      term = s_step_0_3.instance.invoke(context, u_17, p_17, q_17, localvar.constLocationInfo44);
      if(term == null)
        break Fail14;
      y_17 = m_16;
      v_17 = localvar.const0;
      z_17 = y_17;
      w_17 = localvar.const71;
      a_18 = z_17;
      term = s_step_0_3.instance.invoke(context, a_18, v_17, w_17, localvar.constLocationInfo45);
      if(term == null)
        break Fail14;
      term = get_function_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail14;
      n_16 = term;
      f_18 = term;
      b_18 = localvar.const0;
      g_18 = f_18;
      c_18 = localvar.const71;
      h_18 = g_18;
      d_18 = localvar.const80;
      i_18 = h_18;
      term = s_var_0_4.instance.invoke(context, i_18, b_18, c_18, d_18, localvar.constLocationInfo46);
      if(term == null)
        break Fail14;
      m_18 = term;
      j_18 = localvar.const0;
      n_18 = m_18;
      k_18 = localvar.const71;
      o_18 = n_18;
      term = s_step_0_3.instance.invoke(context, o_18, j_18, k_18, localvar.constLocationInfo47);
      if(term == null)
        break Fail14;
      s_18 = l_16;
      p_18 = localvar.const0;
      t_18 = s_18;
      q_18 = localvar.const71;
      u_18 = t_18;
      term = s_step_0_3.instance.invoke(context, u_18, p_18, q_18, localvar.constLocationInfo48);
      if(term == null)
        break Fail14;
      term = find_comment_by_name_0_1.instance.invoke(context, term, n_16);
      if(term == null)
        break Fail14;
      o_16 = term;
      z_18 = term;
      v_18 = localvar.const0;
      a_19 = z_18;
      w_18 = localvar.const71;
      b_19 = a_19;
      x_18 = localvar.const81;
      c_19 = b_19;
      term = s_var_0_4.instance.invoke(context, c_19, v_18, w_18, x_18, localvar.constLocationInfo49);
      if(term == null)
        break Fail14;
      IStrategoTerm d_19 = null;
      IStrategoTerm e_19 = null;
      IStrategoTerm g_19 = null;
      IStrategoTerm h_19 = null;
      IStrategoTerm i_19 = null;
      term = termFactory.makeTuple(m_16, o_16);
      g_19 = term;
      d_19 = localvar.const0;
      h_19 = g_19;
      e_19 = localvar.const71;
      i_19 = h_19;
      term = r_exit_0_3.instance.invoke(context, i_19, d_19, e_19, localvar.constLocationInfo41);
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