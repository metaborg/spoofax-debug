package localvar_rtree;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_142)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("find_comment_match_0_1");
    Fail52:
    { 
      IStrategoTerm w_142 = null;
      IStrategoTerm x_142 = null;
      IStrategoTerm y_142 = null;
      IStrategoTerm z_142 = null;
      IStrategoTerm b_143 = null;
      IStrategoTerm c_143 = null;
      IStrategoTerm e_143 = null;
      IStrategoTerm f_143 = null;
      IStrategoTerm h_143 = null;
      IStrategoTerm i_143 = null;
      IStrategoTerm j_143 = null;
      IStrategoTerm l_143 = null;
      IStrategoTerm m_143 = null;
      IStrategoTerm o_143 = null;
      IStrategoTerm p_143 = null;
      IStrategoTerm q_143 = null;
      IStrategoTerm s_143 = null;
      IStrategoTerm t_143 = null;
      IStrategoTerm u_143 = null;
      IStrategoTerm v_143 = null;
      IStrategoTerm w_143 = null;
      IStrategoTerm z_143 = null;
      IStrategoTerm a_144 = null;
      IStrategoTerm b_144 = null;
      IStrategoTerm c_144 = null;
      IStrategoTerm f_144 = null;
      IStrategoTerm g_144 = null;
      IStrategoTerm i_144 = null;
      IStrategoTerm j_144 = null;
      IStrategoTerm m_144 = null;
      IStrategoTerm n_144 = null;
      IStrategoTerm o_144 = null;
      IStrategoTerm q_144 = null;
      IStrategoTerm r_144 = null;
      IStrategoTerm s_144 = null;
      IStrategoTerm t_144 = null;
      IStrategoTerm u_144 = null;
      IStrategoTerm v_144 = null;
      IStrategoTerm z_144 = null;
      IStrategoTerm a_145 = null;
      IStrategoTerm e_145 = null;
      IStrategoTerm f_145 = null;
      IStrategoTerm m_145 = null;
      IStrategoTerm s_145 = null;
      IStrategoTerm v_145 = null;
      IStrategoTerm w_145 = null;
      IStrategoTerm x_145 = null;
      IStrategoTerm y_145 = null;
      IStrategoTerm z_145 = null;
      IStrategoTerm c_146 = null;
      IStrategoTerm d_146 = null;
      IStrategoTerm e_146 = null;
      IStrategoTerm f_146 = null;
      IStrategoTerm g_146 = null;
      IStrategoTerm h_146 = null;
      IStrategoTerm m_146 = null;
      IStrategoTerm n_146 = null;
      IStrategoTerm o_146 = null;
      IStrategoTerm p_146 = null;
      w_142 = term;
      z_142 = term;
      e_143 = term;
      b_143 = localvar_rtree.const125;
      f_143 = e_143;
      c_143 = localvar_rtree.const196;
      h_143 = f_143;
      term = r_enter_0_3.instance.invoke(context, h_143, b_143, c_143, localvar_rtree.constLocationInfo124);
      if(term == null)
        break Fail52;
      i_143 = z_142;
      o_143 = v_142;
      j_143 = localvar_rtree.const125;
      p_143 = o_143;
      l_143 = localvar_rtree.const196;
      q_143 = p_143;
      m_143 = localvar_rtree.const160;
      s_143 = q_143;
      term = s_var_0_4.instance.invoke(context, s_143, j_143, l_143, m_143, localvar_rtree.constLocationInfo125);
      if(term == null)
        break Fail52;
      t_143 = i_143;
      z_143 = w_142;
      u_143 = localvar_rtree.const125;
      a_144 = z_143;
      v_143 = localvar_rtree.const196;
      b_144 = a_144;
      w_143 = localvar_rtree.const201;
      c_144 = b_144;
      term = s_var_0_4.instance.invoke(context, c_144, u_143, v_143, w_143, localvar_rtree.constLocationInfo126);
      if(term == null)
        break Fail52;
      term = t_143;
      i_144 = term;
      f_144 = localvar_rtree.const125;
      j_144 = i_144;
      g_144 = localvar_rtree.const196;
      m_144 = j_144;
      term = s_step_0_3.instance.invoke(context, m_144, f_144, g_144, localvar_rtree.constLocationInfo127);
      if(term == null)
        break Fail52;
      q_144 = w_142;
      n_144 = localvar_rtree.const125;
      r_144 = q_144;
      o_144 = localvar_rtree.const196;
      s_144 = r_144;
      term = s_step_0_3.instance.invoke(context, s_144, n_144, o_144, localvar_rtree.constLocationInfo128);
      if(term == null)
        break Fail52;
      term = get_function_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail52;
      x_142 = term;
      z_144 = term;
      t_144 = localvar_rtree.const125;
      a_145 = z_144;
      u_144 = localvar_rtree.const196;
      e_145 = a_145;
      v_144 = localvar_rtree.const205;
      f_145 = e_145;
      term = s_var_0_4.instance.invoke(context, f_145, t_144, u_144, v_144, localvar_rtree.constLocationInfo129);
      if(term == null)
        break Fail52;
      v_145 = term;
      m_145 = localvar_rtree.const125;
      w_145 = v_145;
      s_145 = localvar_rtree.const196;
      x_145 = w_145;
      term = s_step_0_3.instance.invoke(context, x_145, m_145, s_145, localvar_rtree.constLocationInfo130);
      if(term == null)
        break Fail52;
      c_146 = v_142;
      y_145 = localvar_rtree.const125;
      d_146 = c_146;
      z_145 = localvar_rtree.const196;
      e_146 = d_146;
      term = s_step_0_3.instance.invoke(context, e_146, y_145, z_145, localvar_rtree.constLocationInfo131);
      if(term == null)
        break Fail52;
      term = find_comment_by_name_0_1.instance.invoke(context, term, x_142);
      if(term == null)
        break Fail52;
      y_142 = term;
      m_146 = term;
      f_146 = localvar_rtree.const125;
      n_146 = m_146;
      g_146 = localvar_rtree.const196;
      o_146 = n_146;
      h_146 = localvar_rtree.const206;
      p_146 = o_146;
      term = s_var_0_4.instance.invoke(context, p_146, f_146, g_146, h_146, localvar_rtree.constLocationInfo132);
      if(term == null)
        break Fail52;
      IStrategoTerm q_146 = null;
      IStrategoTerm r_146 = null;
      IStrategoTerm y_146 = null;
      IStrategoTerm z_146 = null;
      IStrategoTerm a_147 = null;
      term = termFactory.makeTuple(w_142, y_142);
      y_146 = term;
      q_146 = localvar_rtree.const125;
      z_146 = y_146;
      r_146 = localvar_rtree.const196;
      a_147 = z_146;
      term = r_exit_0_3.instance.invoke(context, a_147, q_146, r_146, localvar_rtree.constLocationInfo124);
      if(term == null)
        break Fail52;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}