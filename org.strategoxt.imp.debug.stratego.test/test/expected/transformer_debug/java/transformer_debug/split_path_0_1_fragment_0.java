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

@SuppressWarnings("all") final class split_path_0_1_fragment_0 extends Strategy 
{ 
  TermReference f_644;

  TermReference x_643;

  TermReference y_643;

  TermReference z_643;

  TermReference a_644;

  TermReference w_643;

  TermReference l_644;

  TermReference m_644;

  TermReference n_644;

  TermReference o_644;

  TermReference h_644;

  TermReference i_644;

  TermReference j_644;

  TermReference k_644;

  TermReference g_644;

  TermReference t_644;

  TermReference u_644;

  TermReference v_644;

  TermReference q_644;

  TermReference r_644;

  TermReference s_644;

  TermReference p_644;

  TermReference b_645;

  TermReference c_645;

  TermReference d_645;

  TermReference y_644;

  TermReference z_644;

  TermReference a_645;

  TermReference c_643;

  TermReference h_645;

  TermReference i_645;

  TermReference j_645;

  TermReference e_645;

  TermReference f_645;

  TermReference g_645;

  TermReference o_645;

  TermReference p_645;

  TermReference q_645;

  TermReference r_645;

  TermReference k_645;

  TermReference l_645;

  TermReference m_645;

  TermReference n_645;

  TermReference d_643;

  TermReference g_643;

  TermReference h_643;

  TermReference j_643;

  TermReference k_643;

  TermReference l_643;

  TermReference m_643;

  TermReference n_643;

  TermReference x_644;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail599:
    { 
      IStrategoTerm s_645 = null;
      IStrategoTerm t_645 = null;
      IStrategoTerm v_645 = null;
      IStrategoTerm w_645 = null;
      IStrategoTerm x_645 = null;
      IStrategoTerm y_645 = null;
      IStrategoTerm z_645 = null;
      IStrategoTerm b_646 = null;
      IStrategoTerm c_646 = null;
      IStrategoTerm d_646 = null;
      IStrategoTerm e_646 = null;
      IStrategoTerm f_646 = null;
      IStrategoTerm g_646 = null;
      IStrategoTerm i_646 = null;
      IStrategoTerm j_646 = null;
      IStrategoTerm k_646 = null;
      IStrategoTerm l_646 = null;
      IStrategoTerm m_646 = null;
      IStrategoTerm n_646 = null;
      IStrategoTerm p_646 = null;
      IStrategoTerm q_646 = null;
      IStrategoTerm r_646 = null;
      IStrategoTerm s_646 = null;
      IStrategoTerm u_646 = null;
      IStrategoTerm w_646 = null;
      IStrategoTerm x_646 = null;
      IStrategoTerm y_646 = null;
      IStrategoTerm z_646 = null;
      IStrategoTerm e_647 = null;
      IStrategoTerm f_647 = null;
      IStrategoTerm h_647 = null;
      IStrategoTerm i_647 = null;
      IStrategoTerm j_647 = null;
      IStrategoTerm k_647 = null;
      IStrategoTerm l_647 = null;
      IStrategoTerm m_647 = null;
      IStrategoTerm o_647 = null;
      IStrategoTerm p_647 = null;
      IStrategoTerm q_647 = null;
      IStrategoTerm r_647 = null;
      IStrategoTerm s_647 = null;
      IStrategoTerm u_647 = null;
      IStrategoTerm v_647 = null;
      IStrategoTerm w_647 = null;
      IStrategoTerm y_647 = null;
      IStrategoTerm z_647 = null;
      IStrategoTerm e_648 = null;
      IStrategoTerm g_648 = null;
      IStrategoTerm h_648 = null;
      IStrategoTerm i_648 = null;
      IStrategoTerm j_648 = null;
      IStrategoTerm l_648 = null;
      IStrategoTerm n_648 = null;
      IStrategoTerm o_648 = null;
      IStrategoTerm p_648 = null;
      IStrategoTerm q_648 = null;
      IStrategoTerm r_648 = null;
      IStrategoTerm t_648 = null;
      IStrategoTerm u_648 = null;
      IStrategoTerm v_648 = null;
      IStrategoTerm w_648 = null;
      IStrategoTerm y_648 = null;
      IStrategoTerm z_648 = null;
      IStrategoTerm b_649 = null;
      IStrategoTerm c_649 = null;
      IStrategoTerm d_649 = null;
      IStrategoTerm e_649 = null;
      IStrategoTerm f_649 = null;
      IStrategoTerm h_649 = null;
      IStrategoTerm i_649 = null;
      IStrategoTerm j_649 = null;
      IStrategoTerm k_649 = null;
      IStrategoTerm m_649 = null;
      IStrategoTerm o_649 = null;
      IStrategoTerm p_649 = null;
      IStrategoTerm q_649 = null;
      IStrategoTerm x_649 = null;
      IStrategoTerm y_649 = null;
      IStrategoTerm z_649 = null;
      IStrategoTerm b_650 = null;
      IStrategoTerm c_650 = null;
      IStrategoTerm d_650 = null;
      IStrategoTerm e_650 = null;
      term = transformer_debug.constLocationInfo134;
      if(a_644.value == null)
        a_644.value = term;
      else
        if(a_644.value != term && !a_644.value.match(term))
          break Fail599;
      if(f_644.value == null)
        break Fail599;
      term = s_var_0_4.instance.invoke(context, f_644.value, x_643.value, y_643.value, z_643.value, a_644.value);
      if(term == null)
        break Fail599;
      if(w_643.value == null)
        break Fail599;
      term = w_643.value;
      if(g_644.value == null)
        g_644.value = term;
      else
        if(g_644.value != term && !g_644.value.match(term))
          break Fail599;
      if(g_643.value == null)
        break Fail599;
      term = g_643.value;
      if(l_644.value == null)
        l_644.value = term;
      else
        if(l_644.value != term && !l_644.value.match(term))
          break Fail599;
      term = transformer_debug.const181;
      if(h_644.value == null)
        h_644.value = term;
      else
        if(h_644.value != term && !h_644.value.match(term))
          break Fail599;
      if(l_644.value == null)
        break Fail599;
      term = l_644.value;
      if(m_644.value == null)
        m_644.value = term;
      else
        if(m_644.value != term && !m_644.value.match(term))
          break Fail599;
      term = transformer_debug.const213;
      if(i_644.value == null)
        i_644.value = term;
      else
        if(i_644.value != term && !i_644.value.match(term))
          break Fail599;
      if(m_644.value == null)
        break Fail599;
      term = m_644.value;
      if(n_644.value == null)
        n_644.value = term;
      else
        if(n_644.value != term && !n_644.value.match(term))
          break Fail599;
      term = transformer_debug.const215;
      if(j_644.value == null)
        j_644.value = term;
      else
        if(j_644.value != term && !j_644.value.match(term))
          break Fail599;
      if(n_644.value == null)
        break Fail599;
      term = n_644.value;
      if(o_644.value == null)
        o_644.value = term;
      else
        if(o_644.value != term && !o_644.value.match(term))
          break Fail599;
      term = transformer_debug.constLocationInfo135;
      if(k_644.value == null)
        k_644.value = term;
      else
        if(k_644.value != term && !k_644.value.match(term))
          break Fail599;
      if(o_644.value == null)
        break Fail599;
      term = s_var_0_4.instance.invoke(context, o_644.value, h_644.value, i_644.value, j_644.value, k_644.value);
      if(term == null)
        break Fail599;
      if(g_644.value == null)
        break Fail599;
      term = g_644.value;
      if(p_644.value == null)
        p_644.value = term;
      else
        if(p_644.value != term && !p_644.value.match(term))
          break Fail599;
      if(g_643.value == null)
        break Fail599;
      term = g_643.value;
      if(t_644.value == null)
        t_644.value = term;
      else
        if(t_644.value != term && !t_644.value.match(term))
          break Fail599;
      term = transformer_debug.const181;
      if(q_644.value == null)
        q_644.value = term;
      else
        if(q_644.value != term && !q_644.value.match(term))
          break Fail599;
      if(t_644.value == null)
        break Fail599;
      term = t_644.value;
      if(u_644.value == null)
        u_644.value = term;
      else
        if(u_644.value != term && !u_644.value.match(term))
          break Fail599;
      term = transformer_debug.const213;
      if(r_644.value == null)
        r_644.value = term;
      else
        if(r_644.value != term && !r_644.value.match(term))
          break Fail599;
      if(u_644.value == null)
        break Fail599;
      term = u_644.value;
      if(v_644.value == null)
        v_644.value = term;
      else
        if(v_644.value != term && !v_644.value.match(term))
          break Fail599;
      term = transformer_debug.constLocationInfo136;
      if(s_644.value == null)
        s_644.value = term;
      else
        if(s_644.value != term && !s_644.value.match(term))
          break Fail599;
      if(v_644.value == null)
        break Fail599;
      term = s_step_0_3.instance.invoke(context, v_644.value, q_644.value, r_644.value, s_644.value);
      if(term == null)
        break Fail599;
      term = string_starts_with_0_1.instance.invoke(context, term, c_643.value);
      if(term == null)
        break Fail599;
      if(p_644.value == null)
        break Fail599;
      term = p_644.value;
      if(x_644.value == null)
        x_644.value = term;
      else
        if(x_644.value != term && !x_644.value.match(term))
          break Fail599;
      if(b_645.value == null)
        b_645.value = term;
      else
        if(b_645.value != term && !b_645.value.match(term))
          break Fail599;
      term = transformer_debug.const181;
      if(y_644.value == null)
        y_644.value = term;
      else
        if(y_644.value != term && !y_644.value.match(term))
          break Fail599;
      if(b_645.value == null)
        break Fail599;
      term = b_645.value;
      if(c_645.value == null)
        c_645.value = term;
      else
        if(c_645.value != term && !c_645.value.match(term))
          break Fail599;
      term = transformer_debug.const213;
      if(z_644.value == null)
        z_644.value = term;
      else
        if(z_644.value != term && !z_644.value.match(term))
          break Fail599;
      if(c_645.value == null)
        break Fail599;
      term = c_645.value;
      if(d_645.value == null)
        d_645.value = term;
      else
        if(d_645.value != term && !d_645.value.match(term))
          break Fail599;
      term = transformer_debug.constLocationInfo137;
      if(a_645.value == null)
        a_645.value = term;
      else
        if(a_645.value != term && !a_645.value.match(term))
          break Fail599;
      if(d_645.value == null)
        break Fail599;
      term = s_step_0_3.instance.invoke(context, d_645.value, y_644.value, z_644.value, a_645.value);
      if(term == null)
        break Fail599;
      if(c_643.value == null)
        break Fail599;
      term = c_643.value;
      if(h_645.value == null)
        h_645.value = term;
      else
        if(h_645.value != term && !h_645.value.match(term))
          break Fail599;
      term = transformer_debug.const181;
      if(e_645.value == null)
        e_645.value = term;
      else
        if(e_645.value != term && !e_645.value.match(term))
          break Fail599;
      if(h_645.value == null)
        break Fail599;
      term = h_645.value;
      if(i_645.value == null)
        i_645.value = term;
      else
        if(i_645.value != term && !i_645.value.match(term))
          break Fail599;
      term = transformer_debug.const213;
      if(f_645.value == null)
        f_645.value = term;
      else
        if(f_645.value != term && !f_645.value.match(term))
          break Fail599;
      if(i_645.value == null)
        break Fail599;
      term = i_645.value;
      if(j_645.value == null)
        j_645.value = term;
      else
        if(j_645.value != term && !j_645.value.match(term))
          break Fail599;
      term = transformer_debug.constLocationInfo138;
      if(g_645.value == null)
        g_645.value = term;
      else
        if(g_645.value != term && !g_645.value.match(term))
          break Fail599;
      if(j_645.value == null)
        break Fail599;
      term = s_step_0_3.instance.invoke(context, j_645.value, e_645.value, f_645.value, g_645.value);
      if(term == null)
        break Fail599;
      term = string_length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail599;
      if(j_643.value == null)
        j_643.value = term;
      else
        if(j_643.value != term && !j_643.value.match(term))
          break Fail599;
      if(j_643.value == null)
        break Fail599;
      term = j_643.value;
      if(o_645.value == null)
        o_645.value = term;
      else
        if(o_645.value != term && !o_645.value.match(term))
          break Fail599;
      term = transformer_debug.const181;
      if(k_645.value == null)
        k_645.value = term;
      else
        if(k_645.value != term && !k_645.value.match(term))
          break Fail599;
      if(o_645.value == null)
        break Fail599;
      term = o_645.value;
      if(p_645.value == null)
        p_645.value = term;
      else
        if(p_645.value != term && !p_645.value.match(term))
          break Fail599;
      term = transformer_debug.const213;
      if(l_645.value == null)
        l_645.value = term;
      else
        if(l_645.value != term && !l_645.value.match(term))
          break Fail599;
      if(p_645.value == null)
        break Fail599;
      term = p_645.value;
      if(q_645.value == null)
        q_645.value = term;
      else
        if(q_645.value != term && !q_645.value.match(term))
          break Fail599;
      term = transformer_debug.const217;
      if(m_645.value == null)
        m_645.value = term;
      else
        if(m_645.value != term && !m_645.value.match(term))
          break Fail599;
      if(q_645.value == null)
        break Fail599;
      term = q_645.value;
      if(r_645.value == null)
        r_645.value = term;
      else
        if(r_645.value != term && !r_645.value.match(term))
          break Fail599;
      term = transformer_debug.constLocationInfo139;
      if(n_645.value == null)
        n_645.value = term;
      else
        if(n_645.value != term && !n_645.value.match(term))
          break Fail599;
      if(r_645.value == null)
        break Fail599;
      term = s_var_0_4.instance.invoke(context, r_645.value, k_645.value, l_645.value, m_645.value, n_645.value);
      if(term == null)
        break Fail599;
      v_645 = term;
      s_645 = transformer_debug.const181;
      w_645 = v_645;
      t_645 = transformer_debug.const213;
      x_645 = w_645;
      term = s_step_0_3.instance.invoke(context, x_645, s_645, t_645, transformer_debug.constLocationInfo140);
      if(term == null)
        break Fail599;
      if(g_643.value == null)
        break Fail599;
      b_646 = g_643.value;
      y_645 = transformer_debug.const181;
      c_646 = b_646;
      z_645 = transformer_debug.const213;
      d_646 = c_646;
      term = s_step_0_3.instance.invoke(context, d_646, y_645, z_645, transformer_debug.constLocationInfo141);
      if(term == null)
        break Fail599;
      term = string_length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail599;
      if(d_643.value == null)
        d_643.value = term;
      else
        if(d_643.value != term && !d_643.value.match(term))
          break Fail599;
      if(d_643.value == null)
        break Fail599;
      i_646 = d_643.value;
      e_646 = transformer_debug.const181;
      j_646 = i_646;
      f_646 = transformer_debug.const213;
      k_646 = j_646;
      g_646 = transformer_debug.const218;
      l_646 = k_646;
      term = s_var_0_4.instance.invoke(context, l_646, e_646, f_646, g_646, transformer_debug.constLocationInfo142);
      if(term == null)
        break Fail599;
      p_646 = term;
      m_646 = transformer_debug.const181;
      q_646 = p_646;
      n_646 = transformer_debug.const213;
      r_646 = q_646;
      term = s_step_0_3.instance.invoke(context, r_646, m_646, n_646, transformer_debug.constLocationInfo143);
      if(term == null)
        break Fail599;
      if(g_643.value == null)
        break Fail599;
      w_646 = g_643.value;
      s_646 = transformer_debug.const181;
      x_646 = w_646;
      u_646 = transformer_debug.const213;
      y_646 = x_646;
      term = s_step_0_3.instance.invoke(context, y_646, s_646, u_646, transformer_debug.constLocationInfo144);
      if(term == null)
        break Fail599;
      term = explode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail599;
      if(h_643.value == null)
        h_643.value = term;
      else
        if(h_643.value != term && !h_643.value.match(term))
          break Fail599;
      if(h_643.value == null)
        break Fail599;
      h_647 = h_643.value;
      z_646 = transformer_debug.const181;
      i_647 = h_647;
      e_647 = transformer_debug.const213;
      j_647 = i_647;
      f_647 = transformer_debug.const219;
      k_647 = j_647;
      term = s_var_0_4.instance.invoke(context, k_647, z_646, e_647, f_647, transformer_debug.constLocationInfo145);
      if(term == null)
        break Fail599;
      o_647 = term;
      l_647 = transformer_debug.const181;
      p_647 = o_647;
      m_647 = transformer_debug.const213;
      q_647 = p_647;
      term = s_step_0_3.instance.invoke(context, q_647, l_647, m_647, transformer_debug.constLocationInfo146);
      if(term == null)
        break Fail599;
      if(h_643.value == null)
        break Fail599;
      u_647 = h_643.value;
      r_647 = transformer_debug.const181;
      v_647 = u_647;
      s_647 = transformer_debug.const213;
      w_647 = v_647;
      term = s_step_0_3.instance.invoke(context, w_647, r_647, s_647, transformer_debug.constLocationInfo147);
      if(term == null)
        break Fail599;
      term = split_at_0_1.instance.invoke(context, term, j_643.value);
      if(term == null)
        break Fail599;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail599;
      if(k_643.value == null)
        k_643.value = term.getSubterm(0);
      else
        if(k_643.value != term.getSubterm(0) && !k_643.value.match(term.getSubterm(0)))
          break Fail599;
      if(m_643.value == null)
        m_643.value = term.getSubterm(1);
      else
        if(m_643.value != term.getSubterm(1) && !m_643.value.match(term.getSubterm(1)))
          break Fail599;
      e_648 = term;
      y_647 = transformer_debug.const181;
      g_648 = e_648;
      z_647 = transformer_debug.const213;
      h_648 = g_648;
      term = s_step_0_3.instance.invoke(context, h_648, y_647, z_647, transformer_debug.constLocationInfo148);
      if(term == null)
        break Fail599;
      if(k_643.value == null)
        break Fail599;
      l_648 = k_643.value;
      i_648 = transformer_debug.const181;
      n_648 = l_648;
      j_648 = transformer_debug.const213;
      o_648 = n_648;
      term = s_step_0_3.instance.invoke(context, o_648, i_648, j_648, transformer_debug.constLocationInfo149);
      if(term == null)
        break Fail599;
      term = implode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail599;
      if(l_643.value == null)
        l_643.value = term;
      else
        if(l_643.value != term && !l_643.value.match(term))
          break Fail599;
      if(l_643.value == null)
        break Fail599;
      t_648 = l_643.value;
      p_648 = transformer_debug.const181;
      u_648 = t_648;
      q_648 = transformer_debug.const213;
      v_648 = u_648;
      r_648 = transformer_debug.const221;
      w_648 = v_648;
      term = s_var_0_4.instance.invoke(context, w_648, p_648, q_648, r_648, transformer_debug.constLocationInfo150);
      if(term == null)
        break Fail599;
      b_649 = term;
      y_648 = transformer_debug.const181;
      c_649 = b_649;
      z_648 = transformer_debug.const213;
      d_649 = c_649;
      term = s_step_0_3.instance.invoke(context, d_649, y_648, z_648, transformer_debug.constLocationInfo151);
      if(term == null)
        break Fail599;
      if(m_643.value == null)
        break Fail599;
      h_649 = m_643.value;
      e_649 = transformer_debug.const181;
      i_649 = h_649;
      f_649 = transformer_debug.const213;
      j_649 = i_649;
      term = s_step_0_3.instance.invoke(context, j_649, e_649, f_649, transformer_debug.constLocationInfo152);
      if(term == null)
        break Fail599;
      term = implode_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail599;
      o_649 = term;
      k_649 = transformer_debug.const181;
      p_649 = o_649;
      m_649 = transformer_debug.const213;
      q_649 = p_649;
      term = s_step_0_3.instance.invoke(context, q_649, k_649, m_649, transformer_debug.constLocationInfo154);
      if(term == null)
        break Fail599;
      term = ltrim_chars_1_0.instance.invoke(context, term, lifted114.instance);
      if(term == null)
        break Fail599;
      if(n_643.value == null)
        n_643.value = term;
      else
        if(n_643.value != term && !n_643.value.match(term))
          break Fail599;
      if(n_643.value == null)
        break Fail599;
      b_650 = n_643.value;
      x_649 = transformer_debug.const181;
      c_650 = b_650;
      y_649 = transformer_debug.const213;
      d_650 = c_650;
      z_649 = transformer_debug.const222;
      e_650 = d_650;
      term = s_var_0_4.instance.invoke(context, e_650, x_649, y_649, z_649, transformer_debug.constLocationInfo155);
      if(term == null)
        break Fail599;
      if(x_644.value == null)
        break Fail599;
      term = x_644.value;
      if(true)
        return term;
    }
    return null;
  }
}