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

@SuppressWarnings("all") final class get_internal_files_0_1_fragment_0 extends Strategy 
{ 
  TermReference d_630;

  TermReference e_630;

  TermReference f_630;

  TermReference g_630;

  TermReference z_629;

  TermReference a_630;

  TermReference b_630;

  TermReference c_630;

  TermReference y_629;

  TermReference m_630;

  TermReference n_630;

  TermReference o_630;

  TermReference p_630;

  TermReference i_630;

  TermReference j_630;

  TermReference k_630;

  TermReference l_630;

  TermReference h_630;

  TermReference u_630;

  TermReference v_630;

  TermReference w_630;

  TermReference r_630;

  TermReference s_630;

  TermReference t_630;

  TermReference b_631;

  TermReference c_631;

  TermReference e_631;

  TermReference f_631;

  TermReference x_630;

  TermReference y_630;

  TermReference z_630;

  TermReference a_631;

  TermReference k_629;

  TermReference l_629;

  TermReference m_629;

  TermReference n_629;

  TermReference o_629;

  TermReference p_629;

  TermReference q_630;

  TermReference q_629;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail602:
    { 
      IStrategoTerm g_631 = null;
      IStrategoTerm h_631 = null;
      IStrategoTerm j_631 = null;
      IStrategoTerm k_631 = null;
      IStrategoTerm l_631 = null;
      IStrategoTerm m_631 = null;
      IStrategoTerm n_631 = null;
      IStrategoTerm p_631 = null;
      IStrategoTerm q_631 = null;
      IStrategoTerm r_631 = null;
      IStrategoTerm e_632 = null;
      IStrategoTerm g_632 = null;
      IStrategoTerm i_632 = null;
      IStrategoTerm j_632 = null;
      IStrategoTerm k_632 = null;
      IStrategoTerm l_632 = null;
      IStrategoTerm n_632 = null;
      IStrategoTerm o_632 = null;
      IStrategoTerm q_632 = null;
      IStrategoTerm r_632 = null;
      IStrategoTerm s_632 = null;
      IStrategoTerm t_632 = null;
      IStrategoTerm u_632 = null;
      IStrategoTerm v_632 = null;
      IStrategoTerm y_632 = null;
      IStrategoTerm z_632 = null;
      IStrategoTerm a_633 = null;
      IStrategoTerm b_633 = null;
      IStrategoTerm c_633 = null;
      IStrategoTerm e_633 = null;
      IStrategoTerm f_633 = null;
      IStrategoTerm g_633 = null;
      IStrategoTerm h_633 = null;
      IStrategoTerm i_633 = null;
      IStrategoTerm k_633 = null;
      IStrategoTerm m_633 = null;
      IStrategoTerm n_633 = null;
      IStrategoTerm o_633 = null;
      IStrategoTerm p_633 = null;
      IStrategoTerm q_633 = null;
      IStrategoTerm s_633 = null;
      IStrategoTerm t_633 = null;
      IStrategoTerm u_633 = null;
      IStrategoTerm v_633 = null;
      IStrategoTerm w_633 = null;
      IStrategoTerm x_633 = null;
      IStrategoTerm z_633 = null;
      IStrategoTerm a_634 = null;
      IStrategoTerm b_634 = null;
      IStrategoTerm c_634 = null;
      IStrategoTerm d_634 = null;
      IStrategoTerm f_634 = null;
      IStrategoTerm g_634 = null;
      IStrategoTerm h_634 = null;
      IStrategoTerm i_634 = null;
      IStrategoTerm j_634 = null;
      IStrategoTerm l_634 = null;
      IStrategoTerm m_634 = null;
      IStrategoTerm n_634 = null;
      IStrategoTerm o_634 = null;
      IStrategoTerm p_634 = null;
      IStrategoTerm r_634 = null;
      IStrategoTerm s_634 = null;
      IStrategoTerm t_634 = null;
      IStrategoTerm g_635 = null;
      IStrategoTerm h_635 = null;
      IStrategoTerm i_635 = null;
      IStrategoTerm k_635 = null;
      IStrategoTerm l_635 = null;
      IStrategoTerm m_635 = null;
      IStrategoTerm n_635 = null;
      if(y_629.value == null)
        y_629.value = term;
      else
        if(y_629.value != term && !y_629.value.match(term))
          break Fail602;
      if(k_629.value == null)
        break Fail602;
      term = k_629.value;
      if(d_630.value == null)
        d_630.value = term;
      else
        if(d_630.value != term && !d_630.value.match(term))
          break Fail602;
      term = transformer_debug.const181;
      if(z_629.value == null)
        z_629.value = term;
      else
        if(z_629.value != term && !z_629.value.match(term))
          break Fail602;
      if(d_630.value == null)
        break Fail602;
      term = d_630.value;
      if(e_630.value == null)
        e_630.value = term;
      else
        if(e_630.value != term && !e_630.value.match(term))
          break Fail602;
      term = transformer_debug.const192;
      if(a_630.value == null)
        a_630.value = term;
      else
        if(a_630.value != term && !a_630.value.match(term))
          break Fail602;
      if(e_630.value == null)
        break Fail602;
      term = e_630.value;
      if(f_630.value == null)
        f_630.value = term;
      else
        if(f_630.value != term && !f_630.value.match(term))
          break Fail602;
      term = transformer_debug.const193;
      if(b_630.value == null)
        b_630.value = term;
      else
        if(b_630.value != term && !b_630.value.match(term))
          break Fail602;
      if(f_630.value == null)
        break Fail602;
      term = f_630.value;
      if(g_630.value == null)
        g_630.value = term;
      else
        if(g_630.value != term && !g_630.value.match(term))
          break Fail602;
      term = transformer_debug.constLocationInfo91;
      if(c_630.value == null)
        c_630.value = term;
      else
        if(c_630.value != term && !c_630.value.match(term))
          break Fail602;
      if(g_630.value == null)
        break Fail602;
      term = s_var_0_4.instance.invoke(context, g_630.value, z_629.value, a_630.value, b_630.value, c_630.value);
      if(term == null)
        break Fail602;
      if(y_629.value == null)
        break Fail602;
      term = y_629.value;
      if(h_630.value == null)
        h_630.value = term;
      else
        if(h_630.value != term && !h_630.value.match(term))
          break Fail602;
      if(n_629.value == null)
        break Fail602;
      term = n_629.value;
      if(m_630.value == null)
        m_630.value = term;
      else
        if(m_630.value != term && !m_630.value.match(term))
          break Fail602;
      term = transformer_debug.const181;
      if(i_630.value == null)
        i_630.value = term;
      else
        if(i_630.value != term && !i_630.value.match(term))
          break Fail602;
      if(m_630.value == null)
        break Fail602;
      term = m_630.value;
      if(n_630.value == null)
        n_630.value = term;
      else
        if(n_630.value != term && !n_630.value.match(term))
          break Fail602;
      term = transformer_debug.const192;
      if(j_630.value == null)
        j_630.value = term;
      else
        if(j_630.value != term && !j_630.value.match(term))
          break Fail602;
      if(n_630.value == null)
        break Fail602;
      term = n_630.value;
      if(o_630.value == null)
        o_630.value = term;
      else
        if(o_630.value != term && !o_630.value.match(term))
          break Fail602;
      term = transformer_debug.const194;
      if(k_630.value == null)
        k_630.value = term;
      else
        if(k_630.value != term && !k_630.value.match(term))
          break Fail602;
      if(o_630.value == null)
        break Fail602;
      term = o_630.value;
      if(p_630.value == null)
        p_630.value = term;
      else
        if(p_630.value != term && !p_630.value.match(term))
          break Fail602;
      term = transformer_debug.constLocationInfo92;
      if(l_630.value == null)
        l_630.value = term;
      else
        if(l_630.value != term && !l_630.value.match(term))
          break Fail602;
      if(p_630.value == null)
        break Fail602;
      term = s_var_0_4.instance.invoke(context, p_630.value, i_630.value, j_630.value, k_630.value, l_630.value);
      if(term == null)
        break Fail602;
      if(h_630.value == null)
        break Fail602;
      term = h_630.value;
      if(q_630.value == null)
        q_630.value = term;
      else
        if(q_630.value != term && !q_630.value.match(term))
          break Fail602;
      if(u_630.value == null)
        u_630.value = term;
      else
        if(u_630.value != term && !u_630.value.match(term))
          break Fail602;
      term = transformer_debug.const181;
      if(r_630.value == null)
        r_630.value = term;
      else
        if(r_630.value != term && !r_630.value.match(term))
          break Fail602;
      if(u_630.value == null)
        break Fail602;
      term = u_630.value;
      if(v_630.value == null)
        v_630.value = term;
      else
        if(v_630.value != term && !v_630.value.match(term))
          break Fail602;
      term = transformer_debug.const192;
      if(s_630.value == null)
        s_630.value = term;
      else
        if(s_630.value != term && !s_630.value.match(term))
          break Fail602;
      if(v_630.value == null)
        break Fail602;
      term = v_630.value;
      if(w_630.value == null)
        w_630.value = term;
      else
        if(w_630.value != term && !w_630.value.match(term))
          break Fail602;
      term = transformer_debug.constLocationInfo93;
      if(t_630.value == null)
        t_630.value = term;
      else
        if(t_630.value != term && !t_630.value.match(term))
          break Fail602;
      if(w_630.value == null)
        break Fail602;
      term = s_step_0_3.instance.invoke(context, w_630.value, r_630.value, s_630.value, t_630.value);
      if(term == null)
        break Fail602;
      if(n_629.value == null)
        break Fail602;
      term = (IStrategoTerm)termFactory.makeListCons(transformer_debug.const195, termFactory.makeListCons(transformer_debug.const91, termFactory.makeListCons(n_629.value, (IStrategoList)transformer_debug.constNil1)));
      if(l_629.value == null)
        l_629.value = term;
      else
        if(l_629.value != term && !l_629.value.match(term))
          break Fail602;
      if(l_629.value == null)
        break Fail602;
      term = l_629.value;
      if(b_631.value == null)
        b_631.value = term;
      else
        if(b_631.value != term && !b_631.value.match(term))
          break Fail602;
      term = transformer_debug.const181;
      if(x_630.value == null)
        x_630.value = term;
      else
        if(x_630.value != term && !x_630.value.match(term))
          break Fail602;
      if(b_631.value == null)
        break Fail602;
      term = b_631.value;
      if(c_631.value == null)
        c_631.value = term;
      else
        if(c_631.value != term && !c_631.value.match(term))
          break Fail602;
      term = transformer_debug.const192;
      if(y_630.value == null)
        y_630.value = term;
      else
        if(y_630.value != term && !y_630.value.match(term))
          break Fail602;
      if(c_631.value == null)
        break Fail602;
      term = c_631.value;
      if(e_631.value == null)
        e_631.value = term;
      else
        if(e_631.value != term && !e_631.value.match(term))
          break Fail602;
      term = transformer_debug.const196;
      if(z_630.value == null)
        z_630.value = term;
      else
        if(z_630.value != term && !z_630.value.match(term))
          break Fail602;
      if(e_631.value == null)
        break Fail602;
      term = e_631.value;
      if(f_631.value == null)
        f_631.value = term;
      else
        if(f_631.value != term && !f_631.value.match(term))
          break Fail602;
      term = transformer_debug.constLocationInfo94;
      if(a_631.value == null)
        a_631.value = term;
      else
        if(a_631.value != term && !a_631.value.match(term))
          break Fail602;
      if(f_631.value == null)
        break Fail602;
      term = s_var_0_4.instance.invoke(context, f_631.value, x_630.value, y_630.value, z_630.value, a_631.value);
      if(term == null)
        break Fail602;
      j_631 = term;
      g_631 = transformer_debug.const181;
      k_631 = j_631;
      h_631 = transformer_debug.const192;
      l_631 = k_631;
      term = s_step_0_3.instance.invoke(context, l_631, g_631, h_631, transformer_debug.constLocationInfo95);
      if(term == null)
        break Fail602;
      if(k_629.value == null)
        break Fail602;
      p_631 = k_629.value;
      m_631 = transformer_debug.const181;
      q_631 = p_631;
      n_631 = transformer_debug.const192;
      r_631 = q_631;
      term = s_step_0_3.instance.invoke(context, r_631, m_631, n_631, transformer_debug.constLocationInfo96);
      if(term == null)
        break Fail602;
      term = map_1_0.instance.invoke(context, term, lifted111.instance);
      if(term == null)
        break Fail602;
      i_632 = term;
      e_632 = transformer_debug.const181;
      j_632 = i_632;
      g_632 = transformer_debug.const192;
      k_632 = j_632;
      term = s_step_0_3.instance.invoke(context, k_632, e_632, g_632, transformer_debug.constLocationInfo98);
      if(term == null)
        break Fail602;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail602;
      if(m_629.value == null)
        m_629.value = term;
      else
        if(m_629.value != term && !m_629.value.match(term))
          break Fail602;
      if(m_629.value == null)
        break Fail602;
      q_632 = m_629.value;
      l_632 = transformer_debug.const181;
      r_632 = q_632;
      n_632 = transformer_debug.const192;
      s_632 = r_632;
      o_632 = transformer_debug.const197;
      t_632 = s_632;
      term = s_var_0_4.instance.invoke(context, t_632, l_632, n_632, o_632, transformer_debug.constLocationInfo99);
      if(term == null)
        break Fail602;
      if(k_629.value == null)
        break Fail602;
      term = termFactory.makeTuple(transformer_debug.const149, k_629.value);
      y_632 = term;
      u_632 = transformer_debug.const181;
      z_632 = y_632;
      v_632 = transformer_debug.const192;
      a_633 = z_632;
      term = s_step_0_3.instance.invoke(context, a_633, u_632, v_632, transformer_debug.constLocationInfo100);
      if(term == null)
        break Fail602;
      term = set_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail602;
      e_633 = term;
      b_633 = transformer_debug.const181;
      f_633 = e_633;
      c_633 = transformer_debug.const192;
      g_633 = f_633;
      term = s_step_0_3.instance.invoke(context, g_633, b_633, c_633, transformer_debug.constLocationInfo101);
      if(term == null)
        break Fail602;
      if(l_629.value == null || m_629.value == null)
        break Fail602;
      term = (IStrategoTerm)termFactory.makeListCons(l_629.value, termFactory.makeListCons(m_629.value, (IStrategoList)transformer_debug.constNil1));
      k_633 = term;
      h_633 = transformer_debug.const181;
      m_633 = k_633;
      i_633 = transformer_debug.const192;
      n_633 = m_633;
      term = s_step_0_3.instance.invoke(context, n_633, h_633, i_633, transformer_debug.constLocationInfo102);
      if(term == null)
        break Fail602;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail602;
      if(o_629.value == null)
        o_629.value = term;
      else
        if(o_629.value != term && !o_629.value.match(term))
          break Fail602;
      if(o_629.value == null)
        break Fail602;
      s_633 = o_629.value;
      o_633 = transformer_debug.const181;
      t_633 = s_633;
      p_633 = transformer_debug.const192;
      u_633 = t_633;
      q_633 = transformer_debug.const191;
      v_633 = u_633;
      term = s_var_0_4.instance.invoke(context, v_633, o_633, p_633, q_633, transformer_debug.constLocationInfo103);
      if(term == null)
        break Fail602;
      if(n_629.value == null)
        break Fail602;
      z_633 = n_629.value;
      w_633 = transformer_debug.const181;
      a_634 = z_633;
      x_633 = transformer_debug.const192;
      b_634 = a_634;
      term = s_step_0_3.instance.invoke(context, b_634, w_633, x_633, transformer_debug.constLocationInfo104);
      if(term == null)
        break Fail602;
      term = list_imports_0_1.instance.invoke(context, term, o_629.value);
      if(term == null)
        break Fail602;
      f_634 = term;
      c_634 = transformer_debug.const181;
      g_634 = f_634;
      d_634 = transformer_debug.const192;
      h_634 = g_634;
      term = s_step_0_3.instance.invoke(context, h_634, c_634, d_634, transformer_debug.constLocationInfo105);
      if(term == null)
        break Fail602;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail602;
      if(p_629.value == null)
        p_629.value = term.getSubterm(0);
      else
        if(p_629.value != term.getSubterm(0) && !p_629.value.match(term.getSubterm(0)))
          break Fail602;
      l_634 = term;
      i_634 = transformer_debug.const181;
      m_634 = l_634;
      j_634 = transformer_debug.const192;
      n_634 = m_634;
      term = s_step_0_3.instance.invoke(context, n_634, i_634, j_634, transformer_debug.constLocationInfo106);
      if(term == null)
        break Fail602;
      if(p_629.value == null)
        break Fail602;
      r_634 = p_629.value;
      o_634 = transformer_debug.const181;
      s_634 = r_634;
      p_634 = transformer_debug.const192;
      t_634 = s_634;
      term = s_step_0_3.instance.invoke(context, t_634, o_634, p_634, transformer_debug.constLocationInfo107);
      if(term == null)
        break Fail602;
      term = filter_1_0.instance.invoke(context, term, lifted112.instance);
      if(term == null)
        break Fail602;
      if(q_629.value == null)
        q_629.value = term;
      else
        if(q_629.value != term && !q_629.value.match(term))
          break Fail602;
      if(q_629.value == null)
        break Fail602;
      k_635 = q_629.value;
      g_635 = transformer_debug.const181;
      l_635 = k_635;
      h_635 = transformer_debug.const192;
      m_635 = l_635;
      i_635 = transformer_debug.const200;
      n_635 = m_635;
      term = s_var_0_4.instance.invoke(context, n_635, g_635, h_635, i_635, transformer_debug.constLocationInfo110);
      if(term == null)
        break Fail602;
      if(q_630.value == null)
        break Fail602;
      term = q_630.value;
      IStrategoTerm o_635 = null;
      IStrategoTerm p_635 = null;
      IStrategoTerm r_635 = null;
      IStrategoTerm t_635 = null;
      IStrategoTerm u_635 = null;
      if(q_629.value == null)
        break Fail602;
      r_635 = q_629.value;
      o_635 = transformer_debug.const181;
      t_635 = r_635;
      p_635 = transformer_debug.const192;
      u_635 = t_635;
      term = r_exit_0_3.instance.invoke(context, u_635, o_635, p_635, transformer_debug.constLocationInfo111);
      if(term == null)
        break Fail602;
      if(true)
        return term;
    }
    return null;
  }
}