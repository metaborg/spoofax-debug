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

@SuppressWarnings("all") public class match_term_to_s_var_clause_0_2 extends Strategy 
{ 
  public static match_term_to_s_var_clause_0_2 instance = new match_term_to_s_var_clause_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_695, IStrategoTerm u_695)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("match_term_to_s_var_clause_0_2");
    Fail311:
    { 
      IStrategoTerm v_695 = null;
      IStrategoTerm w_695 = null;
      IStrategoTerm x_695 = null;
      IStrategoTerm y_695 = null;
      IStrategoTerm z_695 = null;
      IStrategoTerm a_696 = null;
      IStrategoTerm c_696 = null;
      IStrategoTerm d_696 = null;
      IStrategoTerm e_696 = null;
      IStrategoTerm f_696 = null;
      IStrategoTerm g_696 = null;
      IStrategoTerm h_696 = null;
      IStrategoTerm i_696 = null;
      IStrategoTerm k_696 = null;
      IStrategoTerm l_696 = null;
      IStrategoTerm m_696 = null;
      IStrategoTerm n_696 = null;
      IStrategoTerm o_696 = null;
      IStrategoTerm p_696 = null;
      IStrategoTerm q_696 = null;
      IStrategoTerm s_696 = null;
      IStrategoTerm t_696 = null;
      IStrategoTerm u_696 = null;
      IStrategoTerm v_696 = null;
      IStrategoTerm w_696 = null;
      IStrategoTerm x_696 = null;
      IStrategoTerm y_696 = null;
      IStrategoTerm z_696 = null;
      IStrategoTerm b_697 = null;
      IStrategoTerm c_697 = null;
      IStrategoTerm d_697 = null;
      IStrategoTerm e_697 = null;
      IStrategoTerm g_697 = null;
      IStrategoTerm h_697 = null;
      IStrategoTerm j_697 = null;
      IStrategoTerm k_697 = null;
      IStrategoTerm l_697 = null;
      IStrategoTerm m_697 = null;
      IStrategoTerm n_697 = null;
      IStrategoTerm p_697 = null;
      IStrategoTerm q_697 = null;
      IStrategoTerm r_697 = null;
      IStrategoTerm s_697 = null;
      IStrategoTerm t_697 = null;
      IStrategoTerm u_697 = null;
      IStrategoTerm w_697 = null;
      IStrategoTerm x_697 = null;
      IStrategoTerm y_697 = null;
      IStrategoTerm z_697 = null;
      IStrategoTerm a_698 = null;
      IStrategoTerm b_698 = null;
      IStrategoTerm d_698 = null;
      IStrategoTerm e_698 = null;
      IStrategoTerm f_698 = null;
      IStrategoTerm g_698 = null;
      IStrategoTerm h_698 = null;
      IStrategoTerm i_698 = null;
      IStrategoTerm k_698 = null;
      IStrategoTerm l_698 = null;
      IStrategoTerm m_698 = null;
      IStrategoTerm n_698 = null;
      v_695 = term;
      y_695 = term;
      c_696 = term;
      z_695 = transformer_debug.const236;
      d_696 = c_696;
      a_696 = transformer_debug.const237;
      e_696 = d_696;
      term = r_enter_0_3.instance.invoke(context, e_696, z_695, a_696, transformer_debug.constLocationInfo174);
      if(term == null)
        break Fail311;
      f_696 = y_695;
      k_696 = t_695;
      g_696 = transformer_debug.const236;
      l_696 = k_696;
      h_696 = transformer_debug.const237;
      m_696 = l_696;
      i_696 = transformer_debug.const238;
      n_696 = m_696;
      term = s_var_0_4.instance.invoke(context, n_696, g_696, h_696, i_696, transformer_debug.constLocationInfo175);
      if(term == null)
        break Fail311;
      s_696 = u_695;
      o_696 = transformer_debug.const236;
      t_696 = s_696;
      p_696 = transformer_debug.const237;
      u_696 = t_696;
      q_696 = transformer_debug.const239;
      v_696 = u_696;
      term = s_var_0_4.instance.invoke(context, v_696, o_696, p_696, q_696, transformer_debug.constLocationInfo176);
      if(term == null)
        break Fail311;
      w_696 = f_696;
      b_697 = v_695;
      x_696 = transformer_debug.const236;
      c_697 = b_697;
      y_696 = transformer_debug.const237;
      d_697 = c_697;
      z_696 = transformer_debug.const240;
      e_697 = d_697;
      term = s_var_0_4.instance.invoke(context, e_697, x_696, y_696, z_696, transformer_debug.constLocationInfo177);
      if(term == null)
        break Fail311;
      term = w_696;
      j_697 = term;
      g_697 = transformer_debug.const236;
      k_697 = j_697;
      h_697 = transformer_debug.const237;
      l_697 = k_697;
      term = s_step_0_3.instance.invoke(context, l_697, g_697, h_697, transformer_debug.constLocationInfo178);
      if(term == null)
        break Fail311;
      p_697 = v_695;
      m_697 = transformer_debug.const236;
      q_697 = p_697;
      n_697 = transformer_debug.const237;
      r_697 = q_697;
      term = s_step_0_3.instance.invoke(context, r_697, m_697, n_697, transformer_debug.constLocationInfo179);
      if(term == null)
        break Fail311;
      term = create_s_var_calls_for_$Term_0_2.instance.invoke(context, term, t_695, u_695);
      if(term == null)
        break Fail311;
      w_695 = term;
      w_697 = term;
      s_697 = transformer_debug.const236;
      x_697 = w_697;
      t_697 = transformer_debug.const237;
      y_697 = x_697;
      u_697 = transformer_debug.const241;
      z_697 = y_697;
      term = s_var_0_4.instance.invoke(context, z_697, s_697, t_697, u_697, transformer_debug.constLocationInfo180);
      if(term == null)
        break Fail311;
      d_698 = term;
      a_698 = transformer_debug.const236;
      e_698 = d_698;
      b_698 = transformer_debug.const237;
      f_698 = e_698;
      term = s_step_0_3.instance.invoke(context, f_698, a_698, b_698, transformer_debug.constLocationInfo181);
      if(term == null)
        break Fail311;
      term = termFactory.makeAppl(transformer_debug._consWhereClause_1, new IStrategoTerm[]{w_695});
      x_695 = term;
      k_698 = term;
      g_698 = transformer_debug.const236;
      l_698 = k_698;
      h_698 = transformer_debug.const237;
      m_698 = l_698;
      i_698 = transformer_debug.const242;
      n_698 = m_698;
      term = s_var_0_4.instance.invoke(context, n_698, g_698, h_698, i_698, transformer_debug.constLocationInfo182);
      if(term == null)
        break Fail311;
      IStrategoTerm o_698 = null;
      IStrategoTerm p_698 = null;
      IStrategoTerm r_698 = null;
      IStrategoTerm s_698 = null;
      IStrategoTerm t_698 = null;
      r_698 = x_695;
      o_698 = transformer_debug.const236;
      s_698 = r_698;
      p_698 = transformer_debug.const237;
      t_698 = s_698;
      term = r_exit_0_3.instance.invoke(context, t_698, o_698, p_698, transformer_debug.constLocationInfo174);
      if(term == null)
        break Fail311;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}