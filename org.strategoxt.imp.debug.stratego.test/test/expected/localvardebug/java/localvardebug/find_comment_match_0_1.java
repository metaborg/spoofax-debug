package localvardebug;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm j_17)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("find_comment_match_0_1");
    Fail14:
    { 
      IStrategoTerm k_17 = null;
      IStrategoTerm l_17 = null;
      IStrategoTerm m_17 = null;
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
      IStrategoTerm m_18 = null;
      IStrategoTerm n_18 = null;
      IStrategoTerm o_18 = null;
      IStrategoTerm q_18 = null;
      IStrategoTerm r_18 = null;
      IStrategoTerm s_18 = null;
      IStrategoTerm z_18 = null;
      IStrategoTerm a_19 = null;
      IStrategoTerm b_19 = null;
      IStrategoTerm d_19 = null;
      IStrategoTerm e_19 = null;
      IStrategoTerm f_19 = null;
      IStrategoTerm g_19 = null;
      IStrategoTerm h_19 = null;
      IStrategoTerm j_19 = null;
      IStrategoTerm k_19 = null;
      IStrategoTerm l_19 = null;
      IStrategoTerm m_19 = null;
      IStrategoTerm n_19 = null;
      IStrategoTerm o_19 = null;
      IStrategoTerm q_19 = null;
      IStrategoTerm r_19 = null;
      IStrategoTerm s_19 = null;
      IStrategoTerm t_19 = null;
      IStrategoTerm u_19 = null;
      IStrategoTerm v_19 = null;
      IStrategoTerm x_19 = null;
      IStrategoTerm y_19 = null;
      IStrategoTerm z_19 = null;
      IStrategoTerm a_20 = null;
      IStrategoTerm b_20 = null;
      IStrategoTerm d_20 = null;
      IStrategoTerm e_20 = null;
      IStrategoTerm f_20 = null;
      IStrategoTerm g_20 = null;
      IStrategoTerm h_20 = null;
      IStrategoTerm i_20 = null;
      IStrategoTerm k_20 = null;
      IStrategoTerm l_20 = null;
      IStrategoTerm m_20 = null;
      IStrategoTerm n_20 = null;
      IStrategoTerm p_20 = null;
      IStrategoTerm q_20 = null;
      IStrategoTerm s_20 = null;
      IStrategoTerm t_20 = null;
      IStrategoTerm u_20 = null;
      k_17 = term;
      n_17 = term;
      r_17 = term;
      o_17 = localvardebug.const0;
      s_17 = r_17;
      p_17 = localvardebug.const78;
      t_17 = s_17;
      term = r_enter_0_3.instance.invoke(context, t_17, o_17, p_17, localvardebug.constLocationInfo45);
      if(term == null)
        break Fail14;
      u_17 = n_17;
      z_17 = j_17;
      v_17 = localvardebug.const0;
      a_18 = z_17;
      w_17 = localvardebug.const78;
      b_18 = a_18;
      x_17 = localvardebug.const35;
      c_18 = b_18;
      term = s_var_0_4.instance.invoke(context, c_18, v_17, w_17, x_17, localvardebug.constLocationInfo46);
      if(term == null)
        break Fail14;
      d_18 = u_17;
      i_18 = k_17;
      e_18 = localvardebug.const0;
      j_18 = i_18;
      f_18 = localvardebug.const78;
      k_18 = j_18;
      g_18 = localvardebug.const83;
      l_18 = k_18;
      term = s_var_0_4.instance.invoke(context, l_18, e_18, f_18, g_18, localvardebug.constLocationInfo47);
      if(term == null)
        break Fail14;
      term = d_18;
      m_18 = d_18;
      q_18 = term;
      n_18 = localvardebug.const0;
      r_18 = q_18;
      o_18 = localvardebug.const78;
      s_18 = r_18;
      term = s_step_0_3.instance.invoke(context, s_18, n_18, o_18, localvardebug.constLocationInfo48);
      if(term == null)
        break Fail14;
      term = debug_1_0.instance.invoke(context, term, lifted6.instance);
      if(term == null)
        break Fail14;
      term = m_18;
      z_18 = m_18;
      d_19 = term;
      a_19 = localvardebug.const0;
      e_19 = d_19;
      b_19 = localvardebug.const78;
      f_19 = e_19;
      term = s_step_0_3.instance.invoke(context, f_19, a_19, b_19, localvardebug.constLocationInfo50);
      if(term == null)
        break Fail14;
      j_19 = k_17;
      g_19 = localvardebug.const0;
      k_19 = j_19;
      h_19 = localvardebug.const78;
      l_19 = k_19;
      term = s_step_0_3.instance.invoke(context, l_19, g_19, h_19, localvardebug.constLocationInfo51);
      if(term == null)
        break Fail14;
      term = get_function_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail14;
      l_17 = term;
      q_19 = term;
      m_19 = localvardebug.const0;
      r_19 = q_19;
      n_19 = localvardebug.const78;
      s_19 = r_19;
      o_19 = localvardebug.const90;
      t_19 = s_19;
      term = s_var_0_4.instance.invoke(context, t_19, m_19, n_19, o_19, localvardebug.constLocationInfo52);
      if(term == null)
        break Fail14;
      x_19 = term;
      u_19 = localvardebug.const0;
      y_19 = x_19;
      v_19 = localvardebug.const78;
      z_19 = y_19;
      term = s_step_0_3.instance.invoke(context, z_19, u_19, v_19, localvardebug.constLocationInfo53);
      if(term == null)
        break Fail14;
      d_20 = j_17;
      a_20 = localvardebug.const0;
      e_20 = d_20;
      b_20 = localvardebug.const78;
      f_20 = e_20;
      term = s_step_0_3.instance.invoke(context, f_20, a_20, b_20, localvardebug.constLocationInfo54);
      if(term == null)
        break Fail14;
      term = find_comment_by_name_0_1.instance.invoke(context, term, l_17);
      if(term == null)
        break Fail14;
      m_17 = term;
      k_20 = term;
      g_20 = localvardebug.const0;
      l_20 = k_20;
      h_20 = localvardebug.const78;
      m_20 = l_20;
      i_20 = localvardebug.const91;
      n_20 = m_20;
      term = s_var_0_4.instance.invoke(context, n_20, g_20, h_20, i_20, localvardebug.constLocationInfo55);
      if(term == null)
        break Fail14;
      term = z_18;
      s_20 = term;
      p_20 = localvardebug.const0;
      t_20 = s_20;
      q_20 = localvardebug.const78;
      u_20 = t_20;
      term = s_step_0_3.instance.invoke(context, u_20, p_20, q_20, localvardebug.constLocationInfo56);
      if(term == null)
        break Fail14;
      term = debug_1_0.instance.invoke(context, term, lifted7.instance);
      if(term == null)
        break Fail14;
      IStrategoTerm b_21 = null;
      IStrategoTerm c_21 = null;
      IStrategoTerm e_21 = null;
      IStrategoTerm f_21 = null;
      IStrategoTerm g_21 = null;
      term = termFactory.makeTuple(k_17, m_17);
      e_21 = term;
      b_21 = localvardebug.const0;
      f_21 = e_21;
      c_21 = localvardebug.const78;
      g_21 = f_21;
      term = r_exit_0_3.instance.invoke(context, g_21, b_21, c_21, localvardebug.constLocationInfo45);
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