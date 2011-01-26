package transformer_debug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.strc.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class write_stratego_str_0_1 extends Strategy 
{ 
  public static write_stratego_str_0_1 instance = new write_stratego_str_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm q_1046)
  { 
    context.push("write_stratego_str_0_1");
    Fail411:
    { 
      IStrategoTerm r_1046 = null;
      IStrategoTerm t_1046 = null;
      IStrategoTerm u_1046 = null;
      IStrategoTerm v_1046 = null;
      IStrategoTerm w_1046 = null;
      IStrategoTerm y_1046 = null;
      IStrategoTerm z_1046 = null;
      IStrategoTerm a_1047 = null;
      IStrategoTerm b_1047 = null;
      IStrategoTerm c_1047 = null;
      IStrategoTerm d_1047 = null;
      IStrategoTerm e_1047 = null;
      IStrategoTerm g_1047 = null;
      IStrategoTerm h_1047 = null;
      IStrategoTerm i_1047 = null;
      IStrategoTerm j_1047 = null;
      IStrategoTerm k_1047 = null;
      IStrategoTerm l_1047 = null;
      IStrategoTerm m_1047 = null;
      IStrategoTerm n_1047 = null;
      IStrategoTerm p_1047 = null;
      IStrategoTerm q_1047 = null;
      IStrategoTerm r_1047 = null;
      IStrategoTerm s_1047 = null;
      IStrategoTerm t_1047 = null;
      IStrategoTerm u_1047 = null;
      IStrategoTerm v_1047 = null;
      IStrategoTerm x_1047 = null;
      IStrategoTerm y_1047 = null;
      IStrategoTerm z_1047 = null;
      IStrategoTerm h_1048 = null;
      IStrategoTerm i_1048 = null;
      IStrategoTerm k_1048 = null;
      IStrategoTerm l_1048 = null;
      IStrategoTerm m_1048 = null;
      IStrategoTerm n_1048 = null;
      IStrategoTerm o_1048 = null;
      IStrategoTerm q_1048 = null;
      IStrategoTerm r_1048 = null;
      IStrategoTerm s_1048 = null;
      IStrategoTerm t_1048 = null;
      IStrategoTerm u_1048 = null;
      IStrategoTerm v_1048 = null;
      IStrategoTerm x_1048 = null;
      IStrategoTerm y_1048 = null;
      IStrategoTerm z_1048 = null;
      IStrategoTerm a_1049 = null;
      IStrategoTerm b_1049 = null;
      IStrategoTerm c_1049 = null;
      IStrategoTerm e_1049 = null;
      IStrategoTerm f_1049 = null;
      IStrategoTerm g_1049 = null;
      IStrategoTerm h_1049 = null;
      IStrategoTerm i_1049 = null;
      IStrategoTerm k_1049 = null;
      IStrategoTerm l_1049 = null;
      IStrategoTerm m_1049 = null;
      IStrategoTerm n_1049 = null;
      IStrategoTerm o_1049 = null;
      IStrategoTerm q_1049 = null;
      IStrategoTerm r_1049 = null;
      IStrategoTerm s_1049 = null;
      IStrategoTerm t_1049 = null;
      IStrategoTerm u_1049 = null;
      IStrategoTerm w_1049 = null;
      IStrategoTerm x_1049 = null;
      IStrategoTerm y_1049 = null;
      r_1046 = term;
      u_1046 = term;
      y_1046 = term;
      v_1046 = transformer_debug.const571;
      z_1046 = y_1046;
      w_1046 = transformer_debug.const577;
      a_1047 = z_1046;
      term = r_enter_0_3.instance.invoke(context, a_1047, v_1046, w_1046, transformer_debug.constLocationInfo1099);
      if(term == null)
        break Fail411;
      b_1047 = u_1046;
      g_1047 = q_1046;
      c_1047 = transformer_debug.const571;
      h_1047 = g_1047;
      d_1047 = transformer_debug.const577;
      i_1047 = h_1047;
      e_1047 = transformer_debug.const194;
      j_1047 = i_1047;
      term = s_var_0_4.instance.invoke(context, j_1047, c_1047, d_1047, e_1047, transformer_debug.constLocationInfo1100);
      if(term == null)
        break Fail411;
      k_1047 = b_1047;
      p_1047 = r_1046;
      l_1047 = transformer_debug.const571;
      q_1047 = p_1047;
      m_1047 = transformer_debug.const577;
      r_1047 = q_1047;
      n_1047 = transformer_debug.const578;
      s_1047 = r_1047;
      term = s_var_0_4.instance.invoke(context, s_1047, l_1047, m_1047, n_1047, transformer_debug.constLocationInfo1101);
      if(term == null)
        break Fail411;
      t_1047 = k_1047;
      x_1047 = q_1046;
      u_1047 = transformer_debug.const571;
      y_1047 = x_1047;
      v_1047 = transformer_debug.const577;
      z_1047 = y_1047;
      term = s_step_0_3.instance.invoke(context, z_1047, u_1047, v_1047, transformer_debug.constLocationInfo1102);
      if(term == null)
        break Fail411;
      term = debug_1_0.instance.invoke(context, term, lifted152.instance);
      if(term == null)
        break Fail411;
      term = t_1047;
      k_1048 = term;
      h_1048 = transformer_debug.const571;
      l_1048 = k_1048;
      i_1048 = transformer_debug.const577;
      m_1048 = l_1048;
      term = s_step_0_3.instance.invoke(context, m_1048, h_1048, i_1048, transformer_debug.constLocationInfo1104);
      if(term == null)
        break Fail411;
      q_1048 = r_1046;
      n_1048 = transformer_debug.const571;
      r_1048 = q_1048;
      o_1048 = transformer_debug.const577;
      s_1048 = r_1048;
      term = s_step_0_3.instance.invoke(context, s_1048, n_1048, o_1048, transformer_debug.constLocationInfo1105);
      if(term == null)
        break Fail411;
      term = pp_stratego_ast_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail411;
      t_1046 = term;
      x_1048 = term;
      t_1048 = transformer_debug.const571;
      y_1048 = x_1048;
      u_1048 = transformer_debug.const577;
      z_1048 = y_1048;
      v_1048 = transformer_debug.const580;
      a_1049 = z_1048;
      term = s_var_0_4.instance.invoke(context, a_1049, t_1048, u_1048, v_1048, transformer_debug.constLocationInfo1106);
      if(term == null)
        break Fail411;
      e_1049 = term;
      b_1049 = transformer_debug.const571;
      f_1049 = e_1049;
      c_1049 = transformer_debug.const577;
      g_1049 = f_1049;
      term = s_step_0_3.instance.invoke(context, g_1049, b_1049, c_1049, transformer_debug.constLocationInfo1107);
      if(term == null)
        break Fail411;
      k_1049 = q_1046;
      h_1049 = transformer_debug.const571;
      l_1049 = k_1049;
      i_1049 = transformer_debug.const577;
      m_1049 = l_1049;
      term = s_step_0_3.instance.invoke(context, m_1049, h_1049, i_1049, transformer_debug.constLocationInfo1108);
      if(term == null)
        break Fail411;
      term = dirname_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail411;
      q_1049 = term;
      n_1049 = transformer_debug.const571;
      r_1049 = q_1049;
      o_1049 = transformer_debug.const577;
      s_1049 = r_1049;
      term = s_step_0_3.instance.invoke(context, s_1049, n_1049, o_1049, transformer_debug.constLocationInfo1109);
      if(term == null)
        break Fail411;
      term = check_dir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail411;
      w_1049 = term;
      t_1049 = transformer_debug.const571;
      x_1049 = w_1049;
      u_1049 = transformer_debug.const577;
      y_1049 = x_1049;
      term = s_step_0_3.instance.invoke(context, y_1049, t_1049, u_1049, transformer_debug.constLocationInfo1110);
      if(term == null)
        break Fail411;
      term = write_to_file_0_2.instance.invoke(context, term, q_1046, t_1046);
      if(term == null)
        break Fail411;
      IStrategoTerm z_1049 = null;
      IStrategoTerm a_1050 = null;
      IStrategoTerm c_1050 = null;
      IStrategoTerm d_1050 = null;
      IStrategoTerm e_1050 = null;
      c_1050 = q_1046;
      z_1049 = transformer_debug.const571;
      d_1050 = c_1050;
      a_1050 = transformer_debug.const577;
      e_1050 = d_1050;
      term = r_exit_0_3.instance.invoke(context, e_1050, z_1049, a_1050, transformer_debug.constLocationInfo1099);
      if(term == null)
        break Fail411;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}