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

@SuppressWarnings("all") final class create_seqs_0_0_fragment_0 extends Strategy 
{ 
  TermReference t_728;

  TermReference u_728;

  TermReference v_728;

  TermReference w_728;

  TermReference p_728;

  TermReference q_728;

  TermReference r_728;

  TermReference s_728;

  TermReference n_728;

  TermReference e_729;

  TermReference f_729;

  TermReference g_729;

  TermReference b_729;

  TermReference c_729;

  TermReference d_729;

  TermReference z_728;

  TermReference y_728;

  TermReference k_729;

  TermReference l_729;

  TermReference m_729;

  TermReference h_729;

  TermReference i_729;

  TermReference j_729;

  TermReference x_728;

  TermReference z_727;

  TermReference a_728;

  TermReference b_728;

  TermReference e_728;

  TermReference c_728;

  TermReference f_728;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail590:
    { 
      IStrategoTerm n_729 = null;
      IStrategoTerm o_729 = null;
      IStrategoTerm p_729 = null;
      IStrategoTerm r_729 = null;
      IStrategoTerm s_729 = null;
      IStrategoTerm t_729 = null;
      IStrategoTerm u_729 = null;
      IStrategoTerm v_729 = null;
      IStrategoTerm x_729 = null;
      IStrategoTerm y_729 = null;
      IStrategoTerm z_729 = null;
      IStrategoTerm a_730 = null;
      IStrategoTerm b_730 = null;
      IStrategoTerm c_730 = null;
      IStrategoTerm e_730 = null;
      IStrategoTerm f_730 = null;
      IStrategoTerm g_730 = null;
      IStrategoTerm h_730 = null;
      IStrategoTerm i_730 = null;
      IStrategoTerm j_730 = null;
      IStrategoTerm l_730 = null;
      IStrategoTerm m_730 = null;
      IStrategoTerm n_730 = null;
      IStrategoTerm o_730 = null;
      IStrategoTerm p_730 = null;
      IStrategoTerm r_730 = null;
      IStrategoTerm s_730 = null;
      IStrategoTerm t_730 = null;
      IStrategoTerm u_730 = null;
      IStrategoTerm v_730 = null;
      IStrategoTerm w_730 = null;
      IStrategoTerm z_730 = null;
      IStrategoTerm a_731 = null;
      IStrategoTerm b_731 = null;
      IStrategoTerm c_731 = null;
      IStrategoTerm d_731 = null;
      IStrategoTerm e_731 = null;
      IStrategoTerm g_731 = null;
      IStrategoTerm h_731 = null;
      IStrategoTerm i_731 = null;
      IStrategoTerm j_731 = null;
      IStrategoTerm k_731 = null;
      IStrategoTerm m_731 = null;
      IStrategoTerm p_731 = null;
      IStrategoTerm q_731 = null;
      IStrategoTerm t_731 = null;
      IStrategoTerm x_731 = null;
      IStrategoTerm y_731 = null;
      IStrategoTerm b_732 = null;
      IStrategoTerm c_732 = null;
      IStrategoTerm d_732 = null;
      IStrategoTerm e_732 = null;
      IStrategoTerm f_732 = null;
      IStrategoTerm h_732 = null;
      IStrategoTerm j_732 = null;
      IStrategoTerm k_732 = null;
      IStrategoTerm l_732 = null;
      IStrategoTerm m_732 = null;
      IStrategoTerm n_732 = null;
      IStrategoTerm o_732 = null;
      IStrategoTerm q_732 = null;
      IStrategoTerm r_732 = null;
      IStrategoTerm s_732 = null;
      IStrategoTerm t_732 = null;
      IStrategoTerm u_732 = null;
      IStrategoTerm w_732 = null;
      IStrategoTerm y_732 = null;
      IStrategoTerm z_732 = null;
      IStrategoTerm a_733 = null;
      IStrategoTerm b_733 = null;
      IStrategoTerm c_733 = null;
      IStrategoTerm e_733 = null;
      IStrategoTerm f_733 = null;
      IStrategoTerm g_733 = null;
      IStrategoTerm h_733 = null;
      IStrategoTerm i_733 = null;
      IStrategoTerm j_733 = null;
      IStrategoTerm l_733 = null;
      IStrategoTerm m_733 = null;
      IStrategoTerm n_733 = null;
      IStrategoTerm o_733 = null;
      IStrategoTerm p_733 = null;
      IStrategoTerm s_733 = null;
      IStrategoTerm t_733 = null;
      IStrategoTerm u_733 = null;
      IStrategoTerm h_734 = null;
      IStrategoTerm i_734 = null;
      IStrategoTerm j_734 = null;
      IStrategoTerm l_734 = null;
      IStrategoTerm m_734 = null;
      IStrategoTerm n_734 = null;
      IStrategoTerm o_734 = null;
      if(t_728.value == null)
        break Fail590;
      term = t_728.value;
      if(u_728.value == null)
        u_728.value = term;
      else
        if(u_728.value != term && !u_728.value.match(term))
          break Fail590;
      term = transformer_debug.const260;
      if(q_728.value == null)
        q_728.value = term;
      else
        if(q_728.value != term && !q_728.value.match(term))
          break Fail590;
      if(u_728.value == null)
        break Fail590;
      term = u_728.value;
      if(v_728.value == null)
        v_728.value = term;
      else
        if(v_728.value != term && !v_728.value.match(term))
          break Fail590;
      term = transformer_debug.const262;
      if(r_728.value == null)
        r_728.value = term;
      else
        if(r_728.value != term && !r_728.value.match(term))
          break Fail590;
      if(v_728.value == null)
        break Fail590;
      term = v_728.value;
      if(w_728.value == null)
        w_728.value = term;
      else
        if(w_728.value != term && !w_728.value.match(term))
          break Fail590;
      term = transformer_debug.constLocationInfo258;
      if(s_728.value == null)
        s_728.value = term;
      else
        if(s_728.value != term && !s_728.value.match(term))
          break Fail590;
      if(w_728.value == null)
        break Fail590;
      term = s_var_0_4.instance.invoke(context, w_728.value, p_728.value, q_728.value, r_728.value, s_728.value);
      if(term == null)
        break Fail590;
      if(n_728.value == null)
        break Fail590;
      term = n_728.value;
      if(x_728.value == null)
        x_728.value = term;
      else
        if(x_728.value != term && !x_728.value.match(term))
          break Fail590;
      if(z_728.value == null)
        z_728.value = term;
      else
        if(z_728.value != term && !z_728.value.match(term))
          break Fail590;
      if(b_728.value == null)
        break Fail590;
      term = b_728.value;
      if(e_729.value == null)
        e_729.value = term;
      else
        if(e_729.value != term && !e_729.value.match(term))
          break Fail590;
      term = transformer_debug.const236;
      if(b_729.value == null)
        b_729.value = term;
      else
        if(b_729.value != term && !b_729.value.match(term))
          break Fail590;
      if(e_729.value == null)
        break Fail590;
      term = e_729.value;
      if(f_729.value == null)
        f_729.value = term;
      else
        if(f_729.value != term && !f_729.value.match(term))
          break Fail590;
      term = transformer_debug.const260;
      if(c_729.value == null)
        c_729.value = term;
      else
        if(c_729.value != term && !c_729.value.match(term))
          break Fail590;
      if(f_729.value == null)
        break Fail590;
      term = f_729.value;
      if(g_729.value == null)
        g_729.value = term;
      else
        if(g_729.value != term && !g_729.value.match(term))
          break Fail590;
      term = transformer_debug.constLocationInfo259;
      if(d_729.value == null)
        d_729.value = term;
      else
        if(d_729.value != term && !d_729.value.match(term))
          break Fail590;
      if(g_729.value == null)
        break Fail590;
      term = s_step_0_3.instance.invoke(context, g_729.value, b_729.value, c_729.value, d_729.value);
      if(term == null)
        break Fail590;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail590;
      if(y_728.value == null)
        y_728.value = term;
      else
        if(y_728.value != term && !y_728.value.match(term))
          break Fail590;
      if(z_728.value == null)
        break Fail590;
      term = z_728.value;
      if(y_728.value == null)
        break Fail590;
      term = termFactory.makeTuple(y_728.value, transformer_debug.const265);
      if(k_729.value == null)
        k_729.value = term;
      else
        if(k_729.value != term && !k_729.value.match(term))
          break Fail590;
      term = transformer_debug.const236;
      if(h_729.value == null)
        h_729.value = term;
      else
        if(h_729.value != term && !h_729.value.match(term))
          break Fail590;
      if(k_729.value == null)
        break Fail590;
      term = k_729.value;
      if(l_729.value == null)
        l_729.value = term;
      else
        if(l_729.value != term && !l_729.value.match(term))
          break Fail590;
      term = transformer_debug.const260;
      if(i_729.value == null)
        i_729.value = term;
      else
        if(i_729.value != term && !i_729.value.match(term))
          break Fail590;
      if(l_729.value == null)
        break Fail590;
      term = l_729.value;
      if(m_729.value == null)
        m_729.value = term;
      else
        if(m_729.value != term && !m_729.value.match(term))
          break Fail590;
      term = transformer_debug.constLocationInfo260;
      if(j_729.value == null)
        j_729.value = term;
      else
        if(j_729.value != term && !j_729.value.match(term))
          break Fail590;
      if(m_729.value == null)
        break Fail590;
      term = s_step_0_3.instance.invoke(context, m_729.value, h_729.value, i_729.value, j_729.value);
      if(term == null)
        break Fail590;
      term = geq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail590;
      if(x_728.value == null)
        break Fail590;
      term = x_728.value;
      n_729 = x_728.value;
      r_729 = term;
      o_729 = transformer_debug.const236;
      s_729 = r_729;
      p_729 = transformer_debug.const260;
      t_729 = s_729;
      term = s_step_0_3.instance.invoke(context, t_729, o_729, p_729, transformer_debug.constLocationInfo261);
      if(term == null)
        break Fail590;
      if(b_728.value == null)
        break Fail590;
      x_729 = b_728.value;
      u_729 = transformer_debug.const236;
      y_729 = x_729;
      v_729 = transformer_debug.const260;
      z_729 = y_729;
      term = s_step_0_3.instance.invoke(context, z_729, u_729, v_729, transformer_debug.constLocationInfo262);
      if(term == null)
        break Fail590;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail590;
      if(a_728.value == null)
        a_728.value = term;
      else
        if(a_728.value != term && !a_728.value.match(term))
          break Fail590;
      if(a_728.value == null)
        break Fail590;
      e_730 = a_728.value;
      a_730 = transformer_debug.const236;
      f_730 = e_730;
      b_730 = transformer_debug.const260;
      g_730 = f_730;
      c_730 = transformer_debug.const266;
      h_730 = g_730;
      term = s_var_0_4.instance.invoke(context, h_730, a_730, b_730, c_730, transformer_debug.constLocationInfo263);
      if(term == null)
        break Fail590;
      l_730 = term;
      i_730 = transformer_debug.const236;
      m_730 = l_730;
      j_730 = transformer_debug.const260;
      n_730 = m_730;
      term = s_step_0_3.instance.invoke(context, n_730, i_730, j_730, transformer_debug.constLocationInfo264);
      if(term == null)
        break Fail590;
      if(a_728.value == null)
        break Fail590;
      term = termFactory.makeTuple(a_728.value, transformer_debug.const268);
      r_730 = term;
      o_730 = transformer_debug.const236;
      s_730 = r_730;
      p_730 = transformer_debug.const260;
      t_730 = s_730;
      term = s_step_0_3.instance.invoke(context, t_730, o_730, p_730, transformer_debug.constLocationInfo265);
      if(term == null)
        break Fail590;
      term = subt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail590;
      if(z_727.value == null)
        z_727.value = term;
      else
        if(z_727.value != term && !z_727.value.match(term))
          break Fail590;
      if(z_727.value == null)
        break Fail590;
      z_730 = z_727.value;
      u_730 = transformer_debug.const236;
      a_731 = z_730;
      v_730 = transformer_debug.const260;
      b_731 = a_731;
      w_730 = transformer_debug.const269;
      c_731 = b_731;
      term = s_var_0_4.instance.invoke(context, c_731, u_730, v_730, w_730, transformer_debug.constLocationInfo266);
      if(term == null)
        break Fail590;
      g_731 = term;
      d_731 = transformer_debug.const236;
      h_731 = g_731;
      e_731 = transformer_debug.const260;
      i_731 = h_731;
      term = s_step_0_3.instance.invoke(context, i_731, d_731, e_731, transformer_debug.constLocationInfo267);
      if(term == null)
        break Fail590;
      if(b_728.value == null)
        break Fail590;
      m_731 = b_728.value;
      j_731 = transformer_debug.const236;
      p_731 = m_731;
      k_731 = transformer_debug.const260;
      q_731 = p_731;
      term = s_step_0_3.instance.invoke(context, q_731, j_731, k_731, transformer_debug.constLocationInfo268);
      if(term == null)
        break Fail590;
      t_731 = term;
      if(a_728.value == null)
        break Fail590;
      term = termFactory.makeTuple(a_728.value, transformer_debug.const268);
      b_732 = term;
      x_731 = transformer_debug.const236;
      c_732 = b_732;
      y_731 = transformer_debug.const260;
      d_732 = c_732;
      term = s_step_0_3.instance.invoke(context, d_732, x_731, y_731, transformer_debug.constLocationInfo269);
      if(term == null)
        break Fail590;
      term = subt_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail590;
      term = take_0_1.instance.invoke(context, t_731, term);
      if(term == null)
        break Fail590;
      if(e_728.value == null)
        e_728.value = term;
      else
        if(e_728.value != term && !e_728.value.match(term))
          break Fail590;
      if(e_728.value == null)
        break Fail590;
      j_732 = e_728.value;
      e_732 = transformer_debug.const236;
      k_732 = j_732;
      f_732 = transformer_debug.const260;
      l_732 = k_732;
      h_732 = transformer_debug.const271;
      m_732 = l_732;
      term = s_var_0_4.instance.invoke(context, m_732, e_732, f_732, h_732, transformer_debug.constLocationInfo270);
      if(term == null)
        break Fail590;
      q_732 = term;
      n_732 = transformer_debug.const236;
      r_732 = q_732;
      o_732 = transformer_debug.const260;
      s_732 = r_732;
      term = s_step_0_3.instance.invoke(context, s_732, n_732, o_732, transformer_debug.constLocationInfo271);
      if(term == null)
        break Fail590;
      if(b_728.value == null)
        break Fail590;
      w_732 = b_728.value;
      t_732 = transformer_debug.const236;
      y_732 = w_732;
      u_732 = transformer_debug.const260;
      z_732 = y_732;
      term = s_step_0_3.instance.invoke(context, z_732, t_732, u_732, transformer_debug.constLocationInfo272);
      if(term == null)
        break Fail590;
      term = last_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail590;
      if(c_728.value == null)
        c_728.value = term;
      else
        if(c_728.value != term && !c_728.value.match(term))
          break Fail590;
      if(c_728.value == null)
        break Fail590;
      e_733 = c_728.value;
      a_733 = transformer_debug.const236;
      f_733 = e_733;
      b_733 = transformer_debug.const260;
      g_733 = f_733;
      c_733 = transformer_debug.const273;
      h_733 = g_733;
      term = s_var_0_4.instance.invoke(context, h_733, a_733, b_733, c_733, transformer_debug.constLocationInfo273);
      if(term == null)
        break Fail590;
      l_733 = term;
      i_733 = transformer_debug.const236;
      m_733 = l_733;
      j_733 = transformer_debug.const260;
      n_733 = m_733;
      term = s_step_0_3.instance.invoke(context, n_733, i_733, j_733, transformer_debug.constLocationInfo274);
      if(term == null)
        break Fail590;
      if(e_728.value == null)
        break Fail590;
      s_733 = e_728.value;
      o_733 = transformer_debug.const236;
      t_733 = s_733;
      p_733 = transformer_debug.const260;
      u_733 = t_733;
      term = s_step_0_3.instance.invoke(context, u_733, o_733, p_733, transformer_debug.constLocationInfo275);
      if(term == null)
        break Fail590;
      lifted121 lifted1210 = new lifted121();
      lifted1210.c_728 = c_728;
      term = foldr_2_0.instance.invoke(context, term, lifted1210, lifted122.instance);
      if(term == null)
        break Fail590;
      if(f_728.value == null)
        f_728.value = term;
      else
        if(f_728.value != term && !f_728.value.match(term))
          break Fail590;
      if(f_728.value == null)
        break Fail590;
      l_734 = f_728.value;
      h_734 = transformer_debug.const236;
      m_734 = l_734;
      i_734 = transformer_debug.const260;
      n_734 = m_734;
      j_734 = transformer_debug.const241;
      o_734 = n_734;
      term = s_var_0_4.instance.invoke(context, o_734, h_734, i_734, j_734, transformer_debug.constLocationInfo278);
      if(term == null)
        break Fail590;
      term = n_729;
      if(true)
        return term;
    }
    return null;
  }
}