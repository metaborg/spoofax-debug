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

@SuppressWarnings("all") public class create_s_var_calls_for_$Term_0_2 extends Strategy 
{ 
  public static create_s_var_calls_for_$Term_0_2 instance = new create_s_var_calls_for_$Term_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_u_698, IStrategoTerm ref_v_698)
  { 
    TermReference u_698 = new TermReference(ref_u_698);
    TermReference v_698 = new TermReference(ref_v_698);
    context.push("create_s_var_calls_for_Term_0_2");
    Fail312:
    { 
      IStrategoTerm w_698 = null;
      IStrategoTerm x_698 = null;
      IStrategoTerm y_698 = null;
      IStrategoTerm z_698 = null;
      IStrategoTerm a_699 = null;
      IStrategoTerm b_699 = null;
      IStrategoTerm c_699 = null;
      IStrategoTerm e_699 = null;
      IStrategoTerm f_699 = null;
      IStrategoTerm g_699 = null;
      IStrategoTerm h_699 = null;
      IStrategoTerm i_699 = null;
      IStrategoTerm j_699 = null;
      IStrategoTerm k_699 = null;
      IStrategoTerm m_699 = null;
      IStrategoTerm n_699 = null;
      IStrategoTerm o_699 = null;
      IStrategoTerm p_699 = null;
      IStrategoTerm q_699 = null;
      IStrategoTerm r_699 = null;
      IStrategoTerm s_699 = null;
      IStrategoTerm u_699 = null;
      IStrategoTerm v_699 = null;
      IStrategoTerm w_699 = null;
      IStrategoTerm x_699 = null;
      IStrategoTerm y_699 = null;
      IStrategoTerm z_699 = null;
      IStrategoTerm c_700 = null;
      IStrategoTerm d_700 = null;
      IStrategoTerm g_700 = null;
      IStrategoTerm j_700 = null;
      IStrategoTerm k_700 = null;
      IStrategoTerm l_700 = null;
      IStrategoTerm n_700 = null;
      IStrategoTerm o_700 = null;
      IStrategoTerm q_700 = null;
      IStrategoTerm r_700 = null;
      IStrategoTerm s_700 = null;
      IStrategoTerm t_700 = null;
      IStrategoTerm u_700 = null;
      IStrategoTerm w_700 = null;
      IStrategoTerm x_700 = null;
      IStrategoTerm y_700 = null;
      IStrategoTerm f_701 = null;
      IStrategoTerm g_701 = null;
      IStrategoTerm h_701 = null;
      IStrategoTerm j_701 = null;
      IStrategoTerm k_701 = null;
      IStrategoTerm l_701 = null;
      IStrategoTerm m_701 = null;
      IStrategoTerm n_701 = null;
      IStrategoTerm o_701 = null;
      IStrategoTerm q_701 = null;
      IStrategoTerm r_701 = null;
      IStrategoTerm s_701 = null;
      IStrategoTerm t_701 = null;
      IStrategoTerm u_701 = null;
      IStrategoTerm w_701 = null;
      IStrategoTerm x_701 = null;
      IStrategoTerm y_701 = null;
      IStrategoTerm f_702 = null;
      IStrategoTerm g_702 = null;
      IStrategoTerm h_702 = null;
      IStrategoTerm j_702 = null;
      IStrategoTerm k_702 = null;
      IStrategoTerm l_702 = null;
      IStrategoTerm m_702 = null;
      IStrategoTerm n_702 = null;
      IStrategoTerm o_702 = null;
      IStrategoTerm q_702 = null;
      IStrategoTerm r_702 = null;
      IStrategoTerm s_702 = null;
      IStrategoTerm z_702 = null;
      IStrategoTerm a_703 = null;
      IStrategoTerm c_703 = null;
      IStrategoTerm d_703 = null;
      IStrategoTerm e_703 = null;
      IStrategoTerm f_703 = null;
      IStrategoTerm g_703 = null;
      IStrategoTerm i_703 = null;
      IStrategoTerm j_703 = null;
      IStrategoTerm k_703 = null;
      IStrategoTerm l_703 = null;
      IStrategoTerm m_703 = null;
      IStrategoTerm n_703 = null;
      IStrategoTerm p_703 = null;
      IStrategoTerm q_703 = null;
      IStrategoTerm r_703 = null;
      IStrategoTerm s_703 = null;
      w_698 = term;
      a_699 = term;
      e_699 = term;
      b_699 = transformer_debug.const236;
      f_699 = e_699;
      c_699 = transformer_debug.const243;
      g_699 = f_699;
      term = r_enter_0_3.instance.invoke(context, g_699, b_699, c_699, transformer_debug.constLocationInfo183);
      if(term == null)
        break Fail312;
      term = a_699;
      h_699 = a_699;
      if(u_698.value == null)
        break Fail312;
      m_699 = u_698.value;
      i_699 = transformer_debug.const236;
      n_699 = m_699;
      j_699 = transformer_debug.const243;
      o_699 = n_699;
      k_699 = transformer_debug.const238;
      p_699 = o_699;
      term = s_var_0_4.instance.invoke(context, p_699, i_699, j_699, k_699, transformer_debug.constLocationInfo184);
      if(term == null)
        break Fail312;
      if(v_698.value == null)
        break Fail312;
      u_699 = v_698.value;
      q_699 = transformer_debug.const236;
      v_699 = u_699;
      r_699 = transformer_debug.const243;
      w_699 = v_699;
      s_699 = transformer_debug.const239;
      x_699 = w_699;
      term = s_var_0_4.instance.invoke(context, x_699, q_699, r_699, s_699, transformer_debug.constLocationInfo185);
      if(term == null)
        break Fail312;
      y_699 = h_699;
      g_700 = w_698;
      z_699 = transformer_debug.const236;
      j_700 = g_700;
      c_700 = transformer_debug.const243;
      k_700 = j_700;
      d_700 = transformer_debug.const232;
      l_700 = k_700;
      term = s_var_0_4.instance.invoke(context, l_700, z_699, c_700, d_700, transformer_debug.constLocationInfo186);
      if(term == null)
        break Fail312;
      term = y_699;
      q_700 = term;
      n_700 = transformer_debug.const236;
      r_700 = q_700;
      o_700 = transformer_debug.const243;
      s_700 = r_700;
      term = s_step_0_3.instance.invoke(context, s_700, n_700, o_700, transformer_debug.constLocationInfo187);
      if(term == null)
        break Fail312;
      w_700 = w_698;
      t_700 = transformer_debug.const236;
      x_700 = w_700;
      u_700 = transformer_debug.const243;
      y_700 = x_700;
      term = s_step_0_3.instance.invoke(context, y_700, t_700, u_700, transformer_debug.constLocationInfo188);
      if(term == null)
        break Fail312;
      term = collect_1_0.instance.invoke(context, term, lifted117.instance);
      if(term == null)
        break Fail312;
      x_698 = term;
      j_701 = term;
      f_701 = transformer_debug.const236;
      k_701 = j_701;
      g_701 = transformer_debug.const243;
      l_701 = k_701;
      h_701 = transformer_debug.const244;
      m_701 = l_701;
      term = s_var_0_4.instance.invoke(context, m_701, f_701, g_701, h_701, transformer_debug.constLocationInfo190);
      if(term == null)
        break Fail312;
      q_701 = term;
      n_701 = transformer_debug.const236;
      r_701 = q_701;
      o_701 = transformer_debug.const243;
      s_701 = r_701;
      term = s_step_0_3.instance.invoke(context, s_701, n_701, o_701, transformer_debug.constLocationInfo191);
      if(term == null)
        break Fail312;
      w_701 = x_698;
      t_701 = transformer_debug.const236;
      x_701 = w_701;
      u_701 = transformer_debug.const243;
      y_701 = x_701;
      term = s_step_0_3.instance.invoke(context, y_701, t_701, u_701, transformer_debug.constLocationInfo192);
      if(term == null)
        break Fail312;
      lifted118 lifted1180 = new lifted118();
      lifted1180.u_698 = u_698;
      lifted1180.v_698 = v_698;
      term = map_1_0.instance.invoke(context, term, lifted1180);
      if(term == null)
        break Fail312;
      y_698 = term;
      j_702 = term;
      f_702 = transformer_debug.const236;
      k_702 = j_702;
      g_702 = transformer_debug.const243;
      l_702 = k_702;
      h_702 = transformer_debug.const246;
      m_702 = l_702;
      term = s_var_0_4.instance.invoke(context, m_702, f_702, g_702, h_702, transformer_debug.constLocationInfo194);
      if(term == null)
        break Fail312;
      q_702 = term;
      n_702 = transformer_debug.const236;
      r_702 = q_702;
      o_702 = transformer_debug.const243;
      s_702 = r_702;
      term = s_step_0_3.instance.invoke(context, s_702, n_702, o_702, transformer_debug.constLocationInfo195);
      if(term == null)
        break Fail312;
      IStrategoTerm term155 = term;
      Success149:
      { 
        Fail313:
        { 
          IStrategoTerm t_702 = null;
          IStrategoTerm u_702 = null;
          IStrategoTerm w_702 = null;
          IStrategoTerm x_702 = null;
          IStrategoTerm y_702 = null;
          w_702 = term;
          t_702 = transformer_debug.const236;
          x_702 = w_702;
          u_702 = transformer_debug.const243;
          y_702 = x_702;
          term = s_step_0_3.instance.invoke(context, y_702, t_702, u_702, transformer_debug.constLocationInfo196);
          if(term == null)
            break Fail313;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail313;
          { 
            if(true)
              break Fail312;
            if(true)
              break Success149;
          }
        }
        term = term155;
      }
      c_703 = term;
      z_702 = transformer_debug.const236;
      d_703 = c_703;
      a_703 = transformer_debug.const243;
      e_703 = d_703;
      term = s_step_0_3.instance.invoke(context, e_703, z_702, a_703, transformer_debug.constLocationInfo197);
      if(term == null)
        break Fail312;
      i_703 = y_698;
      f_703 = transformer_debug.const236;
      j_703 = i_703;
      g_703 = transformer_debug.const243;
      k_703 = j_703;
      term = s_step_0_3.instance.invoke(context, k_703, f_703, g_703, transformer_debug.constLocationInfo198);
      if(term == null)
        break Fail312;
      term = create_seqs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail312;
      z_698 = term;
      p_703 = term;
      l_703 = transformer_debug.const236;
      q_703 = p_703;
      m_703 = transformer_debug.const243;
      r_703 = q_703;
      n_703 = transformer_debug.const241;
      s_703 = r_703;
      term = s_var_0_4.instance.invoke(context, s_703, l_703, m_703, n_703, transformer_debug.constLocationInfo199);
      if(term == null)
        break Fail312;
      IStrategoTerm t_703 = null;
      IStrategoTerm u_703 = null;
      IStrategoTerm w_703 = null;
      IStrategoTerm x_703 = null;
      IStrategoTerm y_703 = null;
      w_703 = z_698;
      t_703 = transformer_debug.const236;
      x_703 = w_703;
      u_703 = transformer_debug.const243;
      y_703 = x_703;
      term = r_exit_0_3.instance.invoke(context, y_703, t_703, u_703, transformer_debug.constLocationInfo183);
      if(term == null)
        break Fail312;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}