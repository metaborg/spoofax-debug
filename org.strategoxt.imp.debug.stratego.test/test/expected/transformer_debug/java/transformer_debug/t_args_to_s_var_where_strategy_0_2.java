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

@SuppressWarnings("all") public class t_args_to_s_var_where_strategy_0_2 extends Strategy 
{ 
  public static t_args_to_s_var_where_strategy_0_2 instance = new t_args_to_s_var_where_strategy_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_708, IStrategoTerm ref_o_708)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_708 = new TermReference(ref_n_708);
    TermReference o_708 = new TermReference(ref_o_708);
    context.push("t_args_to_s_var_where_strategy_0_2");
    Fail316:
    { 
      IStrategoTerm p_708 = null;
      IStrategoTerm q_708 = null;
      IStrategoTerm r_708 = null;
      IStrategoTerm s_708 = null;
      IStrategoTerm t_708 = null;
      IStrategoTerm u_708 = null;
      IStrategoTerm v_708 = null;
      IStrategoTerm x_708 = null;
      IStrategoTerm y_708 = null;
      IStrategoTerm z_708 = null;
      IStrategoTerm a_709 = null;
      IStrategoTerm b_709 = null;
      IStrategoTerm c_709 = null;
      IStrategoTerm d_709 = null;
      IStrategoTerm f_709 = null;
      IStrategoTerm g_709 = null;
      IStrategoTerm h_709 = null;
      IStrategoTerm i_709 = null;
      IStrategoTerm j_709 = null;
      IStrategoTerm k_709 = null;
      IStrategoTerm l_709 = null;
      IStrategoTerm n_709 = null;
      IStrategoTerm o_709 = null;
      IStrategoTerm p_709 = null;
      IStrategoTerm q_709 = null;
      IStrategoTerm r_709 = null;
      IStrategoTerm s_709 = null;
      IStrategoTerm t_709 = null;
      IStrategoTerm u_709 = null;
      IStrategoTerm w_709 = null;
      IStrategoTerm x_709 = null;
      IStrategoTerm y_709 = null;
      IStrategoTerm z_709 = null;
      IStrategoTerm b_710 = null;
      IStrategoTerm c_710 = null;
      IStrategoTerm e_710 = null;
      IStrategoTerm f_710 = null;
      IStrategoTerm g_710 = null;
      IStrategoTerm h_710 = null;
      IStrategoTerm i_710 = null;
      IStrategoTerm k_710 = null;
      IStrategoTerm l_710 = null;
      IStrategoTerm m_710 = null;
      IStrategoTerm t_710 = null;
      IStrategoTerm u_710 = null;
      IStrategoTerm v_710 = null;
      IStrategoTerm x_710 = null;
      IStrategoTerm y_710 = null;
      IStrategoTerm z_710 = null;
      IStrategoTerm a_711 = null;
      IStrategoTerm b_711 = null;
      IStrategoTerm c_711 = null;
      IStrategoTerm e_711 = null;
      IStrategoTerm f_711 = null;
      IStrategoTerm g_711 = null;
      IStrategoTerm n_711 = null;
      IStrategoTerm o_711 = null;
      IStrategoTerm q_711 = null;
      IStrategoTerm r_711 = null;
      IStrategoTerm s_711 = null;
      IStrategoTerm t_711 = null;
      IStrategoTerm u_711 = null;
      IStrategoTerm w_711 = null;
      IStrategoTerm y_711 = null;
      IStrategoTerm z_711 = null;
      IStrategoTerm c_712 = null;
      IStrategoTerm d_712 = null;
      IStrategoTerm h_712 = null;
      IStrategoTerm k_712 = null;
      IStrategoTerm l_712 = null;
      IStrategoTerm m_712 = null;
      IStrategoTerm n_712 = null;
      IStrategoTerm o_712 = null;
      IStrategoTerm p_712 = null;
      IStrategoTerm s_712 = null;
      IStrategoTerm t_712 = null;
      IStrategoTerm u_712 = null;
      IStrategoTerm v_712 = null;
      IStrategoTerm w_712 = null;
      IStrategoTerm x_712 = null;
      IStrategoTerm z_712 = null;
      IStrategoTerm a_713 = null;
      IStrategoTerm b_713 = null;
      IStrategoTerm c_713 = null;
      p_708 = term;
      t_708 = term;
      x_708 = term;
      u_708 = transformer_debug.const236;
      y_708 = x_708;
      v_708 = transformer_debug.const249;
      z_708 = y_708;
      term = r_enter_0_3.instance.invoke(context, z_708, u_708, v_708, transformer_debug.constLocationInfo215);
      if(term == null)
        break Fail316;
      term = t_708;
      a_709 = t_708;
      if(n_708.value == null)
        break Fail316;
      f_709 = n_708.value;
      b_709 = transformer_debug.const236;
      g_709 = f_709;
      c_709 = transformer_debug.const249;
      h_709 = g_709;
      d_709 = transformer_debug.const238;
      i_709 = h_709;
      term = s_var_0_4.instance.invoke(context, i_709, b_709, c_709, d_709, transformer_debug.constLocationInfo216);
      if(term == null)
        break Fail316;
      if(o_708.value == null)
        break Fail316;
      n_709 = o_708.value;
      j_709 = transformer_debug.const236;
      o_709 = n_709;
      k_709 = transformer_debug.const249;
      p_709 = o_709;
      l_709 = transformer_debug.const239;
      q_709 = p_709;
      term = s_var_0_4.instance.invoke(context, q_709, j_709, k_709, l_709, transformer_debug.constLocationInfo217);
      if(term == null)
        break Fail316;
      r_709 = a_709;
      w_709 = p_708;
      s_709 = transformer_debug.const236;
      x_709 = w_709;
      t_709 = transformer_debug.const249;
      y_709 = x_709;
      u_709 = transformer_debug.const248;
      z_709 = y_709;
      term = s_var_0_4.instance.invoke(context, z_709, s_709, t_709, u_709, transformer_debug.constLocationInfo218);
      if(term == null)
        break Fail316;
      term = r_709;
      e_710 = term;
      b_710 = transformer_debug.const236;
      f_710 = e_710;
      c_710 = transformer_debug.const249;
      g_710 = f_710;
      term = s_step_0_3.instance.invoke(context, g_710, b_710, c_710, transformer_debug.constLocationInfo219);
      if(term == null)
        break Fail316;
      k_710 = p_708;
      h_710 = transformer_debug.const236;
      l_710 = k_710;
      i_710 = transformer_debug.const249;
      m_710 = l_710;
      term = s_step_0_3.instance.invoke(context, m_710, h_710, i_710, transformer_debug.constLocationInfo220);
      if(term == null)
        break Fail316;
      lifted120 lifted1200 = new lifted120();
      lifted1200.n_708 = n_708;
      lifted1200.o_708 = o_708;
      term = map_1_0.instance.invoke(context, term, lifted1200);
      if(term == null)
        break Fail316;
      q_708 = term;
      x_710 = term;
      t_710 = transformer_debug.const236;
      y_710 = x_710;
      u_710 = transformer_debug.const249;
      z_710 = y_710;
      v_710 = transformer_debug.const246;
      a_711 = z_710;
      term = s_var_0_4.instance.invoke(context, a_711, t_710, u_710, v_710, transformer_debug.constLocationInfo222);
      if(term == null)
        break Fail316;
      e_711 = term;
      b_711 = transformer_debug.const236;
      f_711 = e_711;
      c_711 = transformer_debug.const249;
      g_711 = f_711;
      term = s_step_0_3.instance.invoke(context, g_711, b_711, c_711, transformer_debug.constLocationInfo223);
      if(term == null)
        break Fail316;
      IStrategoTerm term157 = term;
      Success151:
      { 
        Fail317:
        { 
          IStrategoTerm h_711 = null;
          IStrategoTerm i_711 = null;
          IStrategoTerm k_711 = null;
          IStrategoTerm l_711 = null;
          IStrategoTerm m_711 = null;
          k_711 = term;
          h_711 = transformer_debug.const236;
          l_711 = k_711;
          i_711 = transformer_debug.const249;
          m_711 = l_711;
          term = s_step_0_3.instance.invoke(context, m_711, h_711, i_711, transformer_debug.constLocationInfo224);
          if(term == null)
            break Fail317;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail317;
          { 
            if(true)
              break Fail316;
            if(true)
              break Success151;
          }
        }
        term = term157;
      }
      q_711 = term;
      n_711 = transformer_debug.const236;
      r_711 = q_711;
      o_711 = transformer_debug.const249;
      s_711 = r_711;
      term = s_step_0_3.instance.invoke(context, s_711, n_711, o_711, transformer_debug.constLocationInfo225);
      if(term == null)
        break Fail316;
      w_711 = q_708;
      t_711 = transformer_debug.const236;
      y_711 = w_711;
      u_711 = transformer_debug.const249;
      z_711 = y_711;
      term = s_step_0_3.instance.invoke(context, z_711, t_711, u_711, transformer_debug.constLocationInfo226);
      if(term == null)
        break Fail316;
      term = create_seqs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail316;
      r_708 = term;
      k_712 = term;
      c_712 = transformer_debug.const236;
      l_712 = k_712;
      d_712 = transformer_debug.const249;
      m_712 = l_712;
      h_712 = transformer_debug.const241;
      n_712 = m_712;
      term = s_var_0_4.instance.invoke(context, n_712, c_712, d_712, h_712, transformer_debug.constLocationInfo227);
      if(term == null)
        break Fail316;
      s_712 = term;
      o_712 = transformer_debug.const236;
      t_712 = s_712;
      p_712 = transformer_debug.const249;
      u_712 = t_712;
      term = s_step_0_3.instance.invoke(context, u_712, o_712, p_712, transformer_debug.constLocationInfo228);
      if(term == null)
        break Fail316;
      term = termFactory.makeAppl(transformer_debug._consWhere_1, new IStrategoTerm[]{r_708});
      s_708 = term;
      z_712 = term;
      v_712 = transformer_debug.const236;
      a_713 = z_712;
      w_712 = transformer_debug.const249;
      b_713 = a_713;
      x_712 = transformer_debug.const250;
      c_713 = b_713;
      term = s_var_0_4.instance.invoke(context, c_713, v_712, w_712, x_712, transformer_debug.constLocationInfo229);
      if(term == null)
        break Fail316;
      IStrategoTerm d_713 = null;
      IStrategoTerm e_713 = null;
      IStrategoTerm h_713 = null;
      IStrategoTerm i_713 = null;
      IStrategoTerm j_713 = null;
      h_713 = s_708;
      d_713 = transformer_debug.const236;
      i_713 = h_713;
      e_713 = transformer_debug.const249;
      j_713 = i_713;
      term = r_exit_0_3.instance.invoke(context, j_713, d_713, e_713, transformer_debug.constLocationInfo215);
      if(term == null)
        break Fail316;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}