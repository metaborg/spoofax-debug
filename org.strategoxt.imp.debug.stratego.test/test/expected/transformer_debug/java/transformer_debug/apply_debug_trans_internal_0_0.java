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

@SuppressWarnings("all") public class apply_debug_trans_internal_0_0 extends Strategy 
{ 
  public static apply_debug_trans_internal_0_0 instance = new apply_debug_trans_internal_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("apply_debug_trans_internal_0_0");
    Fail440:
    { 
      IStrategoTerm m_1101 = null;
      IStrategoTerm n_1101 = null;
      IStrategoTerm o_1101 = null;
      IStrategoTerm p_1101 = null;
      IStrategoTerm q_1101 = null;
      IStrategoTerm r_1101 = null;
      IStrategoTerm s_1101 = null;
      IStrategoTerm t_1101 = null;
      IStrategoTerm v_1101 = null;
      IStrategoTerm w_1101 = null;
      IStrategoTerm x_1101 = null;
      IStrategoTerm y_1101 = null;
      IStrategoTerm z_1101 = null;
      IStrategoTerm a_1102 = null;
      IStrategoTerm b_1102 = null;
      IStrategoTerm d_1102 = null;
      IStrategoTerm e_1102 = null;
      IStrategoTerm f_1102 = null;
      IStrategoTerm g_1102 = null;
      IStrategoTerm h_1102 = null;
      IStrategoTerm i_1102 = null;
      IStrategoTerm j_1102 = null;
      IStrategoTerm l_1102 = null;
      IStrategoTerm m_1102 = null;
      IStrategoTerm n_1102 = null;
      IStrategoTerm o_1102 = null;
      IStrategoTerm p_1102 = null;
      IStrategoTerm q_1102 = null;
      IStrategoTerm r_1102 = null;
      IStrategoTerm t_1102 = null;
      IStrategoTerm u_1102 = null;
      IStrategoTerm v_1102 = null;
      IStrategoTerm w_1102 = null;
      IStrategoTerm y_1102 = null;
      IStrategoTerm z_1102 = null;
      IStrategoTerm b_1103 = null;
      IStrategoTerm c_1103 = null;
      IStrategoTerm d_1103 = null;
      IStrategoTerm e_1103 = null;
      IStrategoTerm f_1103 = null;
      IStrategoTerm h_1103 = null;
      IStrategoTerm i_1103 = null;
      IStrategoTerm j_1103 = null;
      IStrategoTerm k_1103 = null;
      IStrategoTerm l_1103 = null;
      IStrategoTerm m_1103 = null;
      IStrategoTerm o_1103 = null;
      IStrategoTerm p_1103 = null;
      IStrategoTerm q_1103 = null;
      IStrategoTerm r_1103 = null;
      IStrategoTerm s_1103 = null;
      IStrategoTerm t_1103 = null;
      IStrategoTerm v_1103 = null;
      IStrategoTerm w_1103 = null;
      IStrategoTerm x_1103 = null;
      IStrategoTerm y_1103 = null;
      IStrategoTerm z_1103 = null;
      IStrategoTerm b_1104 = null;
      IStrategoTerm c_1104 = null;
      IStrategoTerm d_1104 = null;
      IStrategoTerm e_1104 = null;
      IStrategoTerm f_1104 = null;
      IStrategoTerm h_1104 = null;
      IStrategoTerm i_1104 = null;
      IStrategoTerm j_1104 = null;
      IStrategoTerm k_1104 = null;
      IStrategoTerm l_1104 = null;
      IStrategoTerm n_1104 = null;
      IStrategoTerm o_1104 = null;
      IStrategoTerm p_1104 = null;
      IStrategoTerm q_1104 = null;
      IStrategoTerm r_1104 = null;
      IStrategoTerm t_1104 = null;
      IStrategoTerm u_1104 = null;
      IStrategoTerm v_1104 = null;
      IStrategoTerm w_1104 = null;
      IStrategoTerm x_1104 = null;
      IStrategoTerm z_1104 = null;
      IStrategoTerm a_1105 = null;
      IStrategoTerm b_1105 = null;
      IStrategoTerm c_1105 = null;
      IStrategoTerm d_1105 = null;
      IStrategoTerm e_1105 = null;
      IStrategoTerm g_1105 = null;
      IStrategoTerm h_1105 = null;
      IStrategoTerm i_1105 = null;
      IStrategoTerm j_1105 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail440;
      m_1101 = term.getSubterm(0);
      o_1101 = term.getSubterm(1);
      p_1101 = term.getSubterm(2);
      r_1101 = term;
      v_1101 = term;
      s_1101 = transformer_debug.const618;
      w_1101 = v_1101;
      t_1101 = transformer_debug.const620;
      x_1101 = w_1101;
      term = r_enter_0_3.instance.invoke(context, x_1101, s_1101, t_1101, transformer_debug.constLocationInfo1168);
      if(term == null)
        break Fail440;
      y_1101 = r_1101;
      d_1102 = m_1101;
      z_1101 = transformer_debug.const618;
      e_1102 = d_1102;
      a_1102 = transformer_debug.const620;
      f_1102 = e_1102;
      b_1102 = transformer_debug.const208;
      g_1102 = f_1102;
      term = s_var_0_4.instance.invoke(context, g_1102, z_1101, a_1102, b_1102, transformer_debug.constLocationInfo1169);
      if(term == null)
        break Fail440;
      l_1102 = o_1101;
      h_1102 = transformer_debug.const618;
      m_1102 = l_1102;
      i_1102 = transformer_debug.const620;
      n_1102 = m_1102;
      j_1102 = transformer_debug.const209;
      o_1102 = n_1102;
      term = s_var_0_4.instance.invoke(context, o_1102, h_1102, i_1102, j_1102, transformer_debug.constLocationInfo1170);
      if(term == null)
        break Fail440;
      t_1102 = p_1101;
      p_1102 = transformer_debug.const618;
      u_1102 = t_1102;
      q_1102 = transformer_debug.const620;
      v_1102 = u_1102;
      r_1102 = transformer_debug.const211;
      w_1102 = v_1102;
      term = s_var_0_4.instance.invoke(context, w_1102, p_1102, q_1102, r_1102, transformer_debug.constLocationInfo1171);
      if(term == null)
        break Fail440;
      term = y_1101;
      b_1103 = term;
      y_1102 = transformer_debug.const618;
      c_1103 = b_1103;
      z_1102 = transformer_debug.const620;
      d_1103 = c_1103;
      term = s_step_0_3.instance.invoke(context, d_1103, y_1102, z_1102, transformer_debug.constLocationInfo1172);
      if(term == null)
        break Fail440;
      term = (IStrategoTerm)termFactory.makeListCons(m_1101, termFactory.makeListCons(transformer_debug.const210, termFactory.makeListCons(o_1101, (IStrategoList)transformer_debug.constNil1)));
      h_1103 = term;
      e_1103 = transformer_debug.const618;
      i_1103 = h_1103;
      f_1103 = transformer_debug.const620;
      j_1103 = i_1103;
      term = s_step_0_3.instance.invoke(context, j_1103, e_1103, f_1103, transformer_debug.constLocationInfo1173);
      if(term == null)
        break Fail440;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail440;
      n_1101 = term;
      o_1103 = term;
      k_1103 = transformer_debug.const618;
      p_1103 = o_1103;
      l_1103 = transformer_debug.const620;
      q_1103 = p_1103;
      m_1103 = transformer_debug.const621;
      r_1103 = q_1103;
      term = s_var_0_4.instance.invoke(context, r_1103, k_1103, l_1103, m_1103, transformer_debug.constLocationInfo1174);
      if(term == null)
        break Fail440;
      v_1103 = term;
      s_1103 = transformer_debug.const618;
      w_1103 = v_1103;
      t_1103 = transformer_debug.const620;
      x_1103 = w_1103;
      term = s_step_0_3.instance.invoke(context, x_1103, s_1103, t_1103, transformer_debug.constLocationInfo1175);
      if(term == null)
        break Fail440;
      term = parse_stratego_with_locations_0_1.instance.invoke(context, term, n_1101);
      if(term == null)
        break Fail440;
      b_1104 = term;
      y_1103 = transformer_debug.const618;
      c_1104 = b_1104;
      z_1103 = transformer_debug.const620;
      d_1104 = c_1104;
      term = s_step_0_3.instance.invoke(context, d_1104, y_1103, z_1103, transformer_debug.constLocationInfo1176);
      if(term == null)
        break Fail440;
      term = assert_module_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail440;
      h_1104 = term;
      e_1104 = transformer_debug.const618;
      i_1104 = h_1104;
      f_1104 = transformer_debug.const620;
      j_1104 = i_1104;
      term = s_step_0_3.instance.invoke(context, j_1104, e_1104, f_1104, transformer_debug.constLocationInfo1177);
      if(term == null)
        break Fail440;
      term = filter_location_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail440;
      n_1104 = term;
      k_1104 = transformer_debug.const618;
      o_1104 = n_1104;
      l_1104 = transformer_debug.const620;
      p_1104 = o_1104;
      term = s_step_0_3.instance.invoke(context, p_1104, k_1104, l_1104, transformer_debug.constLocationInfo1178);
      if(term == null)
        break Fail440;
      term = add_debug_info_0_1.instance.invoke(context, term, o_1101);
      if(term == null)
        break Fail440;
      t_1104 = term;
      q_1104 = transformer_debug.const618;
      u_1104 = t_1104;
      r_1104 = transformer_debug.const620;
      v_1104 = u_1104;
      term = s_step_0_3.instance.invoke(context, v_1104, q_1104, r_1104, transformer_debug.constLocationInfo1179);
      if(term == null)
        break Fail440;
      term = write_stratego_0_1.instance.invoke(context, term, p_1101);
      if(term == null)
        break Fail440;
      z_1104 = term;
      w_1104 = transformer_debug.const618;
      a_1105 = z_1104;
      x_1104 = transformer_debug.const620;
      b_1105 = a_1105;
      term = s_step_0_3.instance.invoke(context, b_1105, w_1104, x_1104, transformer_debug.constLocationInfo1180);
      if(term == null)
        break Fail440;
      q_1101 = transformer_debug.const622;
      g_1105 = transformer_debug.const622;
      c_1105 = transformer_debug.const618;
      h_1105 = g_1105;
      d_1105 = transformer_debug.const620;
      i_1105 = h_1105;
      e_1105 = transformer_debug.const623;
      j_1105 = i_1105;
      term = s_var_0_4.instance.invoke(context, j_1105, c_1105, d_1105, e_1105, transformer_debug.constLocationInfo1181);
      if(term == null)
        break Fail440;
      IStrategoTerm k_1105 = null;
      IStrategoTerm l_1105 = null;
      IStrategoTerm n_1105 = null;
      IStrategoTerm o_1105 = null;
      IStrategoTerm p_1105 = null;
      term = termFactory.makeTuple(q_1101, p_1101, n_1101);
      n_1105 = term;
      k_1105 = transformer_debug.const618;
      o_1105 = n_1105;
      l_1105 = transformer_debug.const620;
      p_1105 = o_1105;
      term = r_exit_0_3.instance.invoke(context, p_1105, k_1105, l_1105, transformer_debug.constLocationInfo1168);
      if(term == null)
        break Fail440;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}