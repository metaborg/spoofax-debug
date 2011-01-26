package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comment_by_name_0_1 extends Strategy 
{ 
  public static find_comment_by_name_0_1 instance = new find_comment_by_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_22)
  { 
    TermReference e_22 = new TermReference(ref_e_22);
    context.push("find_comment_by_name_0_1");
    Fail16:
    { 
      IStrategoTerm f_22 = null;
      IStrategoTerm g_22 = null;
      IStrategoTerm h_22 = null;
      IStrategoTerm i_22 = null;
      IStrategoTerm j_22 = null;
      IStrategoTerm k_22 = null;
      IStrategoTerm m_22 = null;
      IStrategoTerm n_22 = null;
      IStrategoTerm o_22 = null;
      IStrategoTerm p_22 = null;
      IStrategoTerm q_22 = null;
      IStrategoTerm r_22 = null;
      IStrategoTerm s_22 = null;
      IStrategoTerm u_22 = null;
      IStrategoTerm v_22 = null;
      IStrategoTerm w_22 = null;
      IStrategoTerm x_22 = null;
      IStrategoTerm y_22 = null;
      IStrategoTerm z_22 = null;
      IStrategoTerm a_23 = null;
      IStrategoTerm b_23 = null;
      IStrategoTerm d_23 = null;
      IStrategoTerm e_23 = null;
      IStrategoTerm f_23 = null;
      IStrategoTerm g_23 = null;
      IStrategoTerm h_23 = null;
      IStrategoTerm i_23 = null;
      IStrategoTerm j_23 = null;
      IStrategoTerm l_23 = null;
      IStrategoTerm m_23 = null;
      IStrategoTerm n_23 = null;
      IStrategoTerm u_23 = null;
      IStrategoTerm v_23 = null;
      IStrategoTerm w_23 = null;
      IStrategoTerm y_23 = null;
      IStrategoTerm z_23 = null;
      IStrategoTerm a_24 = null;
      IStrategoTerm b_24 = null;
      IStrategoTerm c_24 = null;
      IStrategoTerm e_24 = null;
      IStrategoTerm f_24 = null;
      IStrategoTerm g_24 = null;
      IStrategoTerm n_24 = null;
      IStrategoTerm o_24 = null;
      IStrategoTerm p_24 = null;
      IStrategoTerm r_24 = null;
      IStrategoTerm s_24 = null;
      IStrategoTerm t_24 = null;
      IStrategoTerm u_24 = null;
      IStrategoTerm v_24 = null;
      IStrategoTerm w_24 = null;
      IStrategoTerm y_24 = null;
      IStrategoTerm z_24 = null;
      IStrategoTerm a_25 = null;
      IStrategoTerm b_25 = null;
      IStrategoTerm c_25 = null;
      IStrategoTerm e_25 = null;
      IStrategoTerm f_25 = null;
      IStrategoTerm g_25 = null;
      IStrategoTerm n_25 = null;
      IStrategoTerm o_25 = null;
      IStrategoTerm q_25 = null;
      IStrategoTerm r_25 = null;
      IStrategoTerm s_25 = null;
      IStrategoTerm t_25 = null;
      IStrategoTerm u_25 = null;
      IStrategoTerm v_25 = null;
      IStrategoTerm x_25 = null;
      IStrategoTerm y_25 = null;
      IStrategoTerm z_25 = null;
      IStrategoTerm a_26 = null;
      IStrategoTerm c_26 = null;
      IStrategoTerm d_26 = null;
      IStrategoTerm f_26 = null;
      IStrategoTerm g_26 = null;
      IStrategoTerm h_26 = null;
      f_22 = term;
      i_22 = term;
      m_22 = term;
      j_22 = localvardebug.const0;
      n_22 = m_22;
      k_22 = localvardebug.const99;
      o_22 = n_22;
      term = r_enter_0_3.instance.invoke(context, o_22, j_22, k_22, localvardebug.constLocationInfo60);
      if(term == null)
        break Fail16;
      term = i_22;
      p_22 = i_22;
      if(e_22.value == null)
        break Fail16;
      u_22 = e_22.value;
      q_22 = localvardebug.const0;
      v_22 = u_22;
      r_22 = localvardebug.const99;
      w_22 = v_22;
      s_22 = localvardebug.const90;
      x_22 = w_22;
      term = s_var_0_4.instance.invoke(context, x_22, q_22, r_22, s_22, localvardebug.constLocationInfo61);
      if(term == null)
        break Fail16;
      y_22 = p_22;
      d_23 = f_22;
      z_22 = localvardebug.const0;
      e_23 = d_23;
      a_23 = localvardebug.const99;
      f_23 = e_23;
      b_23 = localvardebug.const35;
      g_23 = f_23;
      term = s_var_0_4.instance.invoke(context, g_23, z_22, a_23, b_23, localvardebug.constLocationInfo62);
      if(term == null)
        break Fail16;
      term = y_22;
      h_23 = y_22;
      l_23 = term;
      i_23 = localvardebug.const0;
      m_23 = l_23;
      j_23 = localvardebug.const99;
      n_23 = m_23;
      term = s_step_0_3.instance.invoke(context, n_23, i_23, j_23, localvardebug.constLocationInfo63);
      if(term == null)
        break Fail16;
      term = debug_1_0.instance.invoke(context, term, lifted8.instance);
      if(term == null)
        break Fail16;
      term = h_23;
      u_23 = h_23;
      y_23 = term;
      v_23 = localvardebug.const0;
      z_23 = y_23;
      w_23 = localvardebug.const99;
      a_24 = z_23;
      term = s_step_0_3.instance.invoke(context, a_24, v_23, w_23, localvardebug.constLocationInfo65);
      if(term == null)
        break Fail16;
      e_24 = f_22;
      b_24 = localvardebug.const0;
      f_24 = e_24;
      c_24 = localvardebug.const99;
      g_24 = f_24;
      term = s_step_0_3.instance.invoke(context, g_24, b_24, c_24, localvardebug.constLocationInfo66);
      if(term == null)
        break Fail16;
      lifted9 lifted90 = new lifted9();
      lifted90.e_22 = e_22;
      term = filter_1_0.instance.invoke(context, term, lifted90);
      if(term == null)
        break Fail16;
      g_22 = term;
      r_24 = term;
      n_24 = localvardebug.const0;
      s_24 = r_24;
      o_24 = localvardebug.const99;
      t_24 = s_24;
      p_24 = localvardebug.const106;
      u_24 = t_24;
      term = s_var_0_4.instance.invoke(context, u_24, n_24, o_24, p_24, localvardebug.constLocationInfo68);
      if(term == null)
        break Fail16;
      y_24 = term;
      v_24 = localvardebug.const0;
      z_24 = y_24;
      w_24 = localvardebug.const99;
      a_25 = z_24;
      term = s_step_0_3.instance.invoke(context, a_25, v_24, w_24, localvardebug.constLocationInfo69);
      if(term == null)
        break Fail16;
      e_25 = g_22;
      b_25 = localvardebug.const0;
      f_25 = e_25;
      c_25 = localvardebug.const99;
      g_25 = f_25;
      term = s_step_0_3.instance.invoke(context, g_25, b_25, c_25, localvardebug.constLocationInfo70);
      if(term == null)
        break Fail16;
      term = debug_1_0.instance.invoke(context, term, lifted10.instance);
      if(term == null)
        break Fail16;
      q_25 = term;
      n_25 = localvardebug.const0;
      r_25 = q_25;
      o_25 = localvardebug.const99;
      s_25 = r_25;
      term = s_step_0_3.instance.invoke(context, s_25, n_25, o_25, localvardebug.constLocationInfo72);
      if(term == null)
        break Fail16;
      term = first_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail16;
      h_22 = term;
      x_25 = term;
      t_25 = localvardebug.const0;
      y_25 = x_25;
      u_25 = localvardebug.const99;
      z_25 = y_25;
      v_25 = localvardebug.const110;
      a_26 = z_25;
      term = s_var_0_4.instance.invoke(context, a_26, t_25, u_25, v_25, localvardebug.constLocationInfo73);
      if(term == null)
        break Fail16;
      term = u_23;
      f_26 = term;
      c_26 = localvardebug.const0;
      g_26 = f_26;
      d_26 = localvardebug.const99;
      h_26 = g_26;
      term = s_step_0_3.instance.invoke(context, h_26, c_26, d_26, localvardebug.constLocationInfo74);
      if(term == null)
        break Fail16;
      term = debug_1_0.instance.invoke(context, term, lifted11.instance);
      if(term == null)
        break Fail16;
      IStrategoTerm o_26 = null;
      IStrategoTerm p_26 = null;
      IStrategoTerm r_26 = null;
      IStrategoTerm s_26 = null;
      IStrategoTerm t_26 = null;
      r_26 = h_22;
      o_26 = localvardebug.const0;
      s_26 = r_26;
      p_26 = localvardebug.const99;
      t_26 = s_26;
      term = r_exit_0_3.instance.invoke(context, t_26, o_26, p_26, localvardebug.constLocationInfo60);
      if(term == null)
        break Fail16;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}