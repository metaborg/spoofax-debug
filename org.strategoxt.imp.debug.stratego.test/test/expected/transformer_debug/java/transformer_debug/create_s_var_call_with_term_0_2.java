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

@SuppressWarnings("all") public class create_s_var_call_with_term_0_2 extends Strategy 
{ 
  public static create_s_var_call_with_term_0_2 instance = new create_s_var_call_with_term_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm i_717, IStrategoTerm j_717)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_s_var_call_with_term_0_2");
    Fail320:
    { 
      IStrategoTerm k_717 = null;
      IStrategoTerm l_717 = null;
      IStrategoTerm m_717 = null;
      IStrategoTerm n_717 = null;
      IStrategoTerm o_717 = null;
      IStrategoTerm p_717 = null;
      IStrategoTerm q_717 = null;
      IStrategoTerm r_717 = null;
      IStrategoTerm x_717 = null;
      IStrategoTerm z_717 = null;
      IStrategoTerm a_718 = null;
      IStrategoTerm e_718 = null;
      IStrategoTerm f_718 = null;
      IStrategoTerm h_718 = null;
      IStrategoTerm i_718 = null;
      IStrategoTerm k_718 = null;
      IStrategoTerm l_718 = null;
      IStrategoTerm m_718 = null;
      IStrategoTerm o_718 = null;
      IStrategoTerm p_718 = null;
      IStrategoTerm q_718 = null;
      IStrategoTerm r_718 = null;
      IStrategoTerm t_718 = null;
      IStrategoTerm u_718 = null;
      IStrategoTerm v_718 = null;
      IStrategoTerm w_718 = null;
      IStrategoTerm x_718 = null;
      IStrategoTerm z_718 = null;
      IStrategoTerm a_719 = null;
      IStrategoTerm b_719 = null;
      IStrategoTerm d_719 = null;
      IStrategoTerm e_719 = null;
      IStrategoTerm f_719 = null;
      IStrategoTerm g_719 = null;
      IStrategoTerm h_719 = null;
      IStrategoTerm i_719 = null;
      IStrategoTerm j_719 = null;
      IStrategoTerm l_719 = null;
      IStrategoTerm n_719 = null;
      IStrategoTerm o_719 = null;
      IStrategoTerm p_719 = null;
      IStrategoTerm r_719 = null;
      IStrategoTerm s_719 = null;
      IStrategoTerm u_719 = null;
      IStrategoTerm v_719 = null;
      IStrategoTerm w_719 = null;
      IStrategoTerm x_719 = null;
      IStrategoTerm y_719 = null;
      IStrategoTerm a_720 = null;
      IStrategoTerm b_720 = null;
      IStrategoTerm c_720 = null;
      IStrategoTerm d_720 = null;
      IStrategoTerm e_720 = null;
      IStrategoTerm f_720 = null;
      IStrategoTerm h_720 = null;
      IStrategoTerm i_720 = null;
      IStrategoTerm j_720 = null;
      IStrategoTerm k_720 = null;
      IStrategoTerm l_720 = null;
      IStrategoTerm m_720 = null;
      IStrategoTerm o_720 = null;
      IStrategoTerm p_720 = null;
      IStrategoTerm q_720 = null;
      IStrategoTerm r_720 = null;
      IStrategoTerm t_720 = null;
      IStrategoTerm u_720 = null;
      IStrategoTerm w_720 = null;
      IStrategoTerm x_720 = null;
      IStrategoTerm y_720 = null;
      IStrategoTerm z_720 = null;
      IStrategoTerm a_721 = null;
      IStrategoTerm b_721 = null;
      IStrategoTerm d_721 = null;
      IStrategoTerm e_721 = null;
      IStrategoTerm f_721 = null;
      IStrategoTerm g_721 = null;
      IStrategoTerm h_721 = null;
      IStrategoTerm i_721 = null;
      IStrategoTerm k_721 = null;
      IStrategoTerm l_721 = null;
      IStrategoTerm m_721 = null;
      IStrategoTerm n_721 = null;
      IStrategoTerm o_721 = null;
      IStrategoTerm p_721 = null;
      IStrategoTerm r_721 = null;
      IStrategoTerm s_721 = null;
      IStrategoTerm u_721 = null;
      IStrategoTerm v_721 = null;
      n_717 = term;
      IStrategoList annos59 = term.getAnnotations();
      if(annos59.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos59).isEmpty())
        break Fail320;
      l_717 = ((IStrategoList)annos59).head();
      IStrategoTerm arg111 = ((IStrategoList)annos59).tail();
      if(arg111.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg111).isEmpty())
        break Fail320;
      p_717 = term;
      x_717 = term;
      q_717 = transformer_debug.const236;
      z_717 = x_717;
      r_717 = transformer_debug.const256;
      a_718 = z_717;
      term = r_enter_0_3.instance.invoke(context, a_718, q_717, r_717, transformer_debug.constLocationInfo241);
      if(term == null)
        break Fail320;
      e_718 = p_717;
      k_718 = i_717;
      f_718 = transformer_debug.const236;
      l_718 = k_718;
      h_718 = transformer_debug.const256;
      m_718 = l_718;
      i_718 = transformer_debug.const238;
      o_718 = m_718;
      term = s_var_0_4.instance.invoke(context, o_718, f_718, h_718, i_718, transformer_debug.constLocationInfo242);
      if(term == null)
        break Fail320;
      t_718 = j_717;
      p_718 = transformer_debug.const236;
      u_718 = t_718;
      q_718 = transformer_debug.const256;
      v_718 = u_718;
      r_718 = transformer_debug.const239;
      w_718 = v_718;
      term = s_var_0_4.instance.invoke(context, w_718, p_718, q_718, r_718, transformer_debug.constLocationInfo243);
      if(term == null)
        break Fail320;
      x_718 = e_718;
      d_719 = n_717;
      z_718 = transformer_debug.const236;
      e_719 = d_719;
      a_719 = transformer_debug.const256;
      f_719 = e_719;
      b_719 = transformer_debug.const253;
      g_719 = f_719;
      term = s_var_0_4.instance.invoke(context, g_719, z_718, a_719, b_719, transformer_debug.constLocationInfo244);
      if(term == null)
        break Fail320;
      l_719 = l_717;
      h_719 = transformer_debug.const236;
      n_719 = l_719;
      i_719 = transformer_debug.const256;
      o_719 = n_719;
      j_719 = transformer_debug.const235;
      p_719 = o_719;
      term = s_var_0_4.instance.invoke(context, p_719, h_719, i_719, j_719, transformer_debug.constLocationInfo245);
      if(term == null)
        break Fail320;
      term = x_718;
      u_719 = term;
      r_719 = transformer_debug.const236;
      v_719 = u_719;
      s_719 = transformer_debug.const256;
      w_719 = v_719;
      term = s_step_0_3.instance.invoke(context, w_719, r_719, s_719, transformer_debug.constLocationInfo246);
      if(term == null)
        break Fail320;
      a_720 = n_717;
      x_719 = transformer_debug.const236;
      b_720 = a_720;
      y_719 = transformer_debug.const256;
      c_720 = b_720;
      term = s_step_0_3.instance.invoke(context, c_720, x_719, y_719, transformer_debug.constLocationInfo247);
      if(term == null)
        break Fail320;
      term = get_var_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail320;
      k_717 = term;
      h_720 = term;
      d_720 = transformer_debug.const236;
      i_720 = h_720;
      e_720 = transformer_debug.const256;
      j_720 = i_720;
      f_720 = transformer_debug.const257;
      k_720 = j_720;
      term = s_var_0_4.instance.invoke(context, k_720, d_720, e_720, f_720, transformer_debug.constLocationInfo248);
      if(term == null)
        break Fail320;
      o_720 = term;
      l_720 = transformer_debug.const236;
      p_720 = o_720;
      m_720 = transformer_debug.const256;
      q_720 = p_720;
      term = s_step_0_3.instance.invoke(context, q_720, l_720, m_720, transformer_debug.constLocationInfo249);
      if(term == null)
        break Fail320;
      w_720 = term;
      t_720 = transformer_debug.const236;
      x_720 = w_720;
      u_720 = transformer_debug.const256;
      y_720 = x_720;
      term = s_step_0_3.instance.invoke(context, y_720, t_720, u_720, transformer_debug.constLocationInfo250);
      if(term == null)
        break Fail320;
      term = create_s_var_call_0_4.instance.invoke(context, term, i_717, j_717, k_717, l_717);
      if(term == null)
        break Fail320;
      r_720 = term;
      m_717 = term;
      d_721 = r_720;
      z_720 = transformer_debug.const236;
      e_721 = d_721;
      a_721 = transformer_debug.const256;
      f_721 = e_721;
      b_721 = transformer_debug.const254;
      g_721 = f_721;
      term = s_var_0_4.instance.invoke(context, g_721, z_720, a_721, b_721, transformer_debug.constLocationInfo251);
      if(term == null)
        break Fail320;
      k_721 = term;
      h_721 = transformer_debug.const236;
      l_721 = k_721;
      i_721 = transformer_debug.const256;
      m_721 = l_721;
      term = s_step_0_3.instance.invoke(context, m_721, h_721, i_721, transformer_debug.constLocationInfo252);
      if(term == null)
        break Fail320;
      term = termFactory.makeAppl(transformer_debug._consBA_2, new IStrategoTerm[]{m_717, n_717});
      o_717 = term;
      r_721 = term;
      n_721 = transformer_debug.const236;
      s_721 = r_721;
      o_721 = transformer_debug.const256;
      u_721 = s_721;
      p_721 = transformer_debug.const258;
      v_721 = u_721;
      term = s_var_0_4.instance.invoke(context, v_721, n_721, o_721, p_721, transformer_debug.constLocationInfo253);
      if(term == null)
        break Fail320;
      IStrategoTerm w_721 = null;
      IStrategoTerm x_721 = null;
      IStrategoTerm z_721 = null;
      IStrategoTerm a_722 = null;
      IStrategoTerm b_722 = null;
      z_721 = o_717;
      w_721 = transformer_debug.const236;
      a_722 = z_721;
      x_721 = transformer_debug.const256;
      b_722 = a_722;
      term = r_exit_0_3.instance.invoke(context, b_722, w_721, x_721, transformer_debug.constLocationInfo241);
      if(term == null)
        break Fail320;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}