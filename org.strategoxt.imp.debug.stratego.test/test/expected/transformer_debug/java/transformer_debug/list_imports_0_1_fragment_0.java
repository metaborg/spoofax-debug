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

@SuppressWarnings("all") final class list_imports_0_1_fragment_0 extends Strategy 
{ 
  TermReference r_622;

  TermReference k_622;

  TermReference l_622;

  TermReference m_622;

  TermReference n_622;

  TermReference b_622;

  TermReference v_622;

  TermReference w_622;

  TermReference x_622;

  TermReference s_622;

  TermReference t_622;

  TermReference u_622;

  TermReference b_623;

  TermReference c_623;

  TermReference d_623;

  TermReference y_622;

  TermReference z_622;

  TermReference a_623;

  TermReference w_621;

  TermReference h_623;

  TermReference i_623;

  TermReference j_623;

  TermReference e_623;

  TermReference f_623;

  TermReference g_623;

  TermReference n_623;

  TermReference o_623;

  TermReference p_623;

  TermReference k_623;

  TermReference l_623;

  TermReference m_623;

  TermReference u_623;

  TermReference v_623;

  TermReference w_623;

  TermReference q_623;

  TermReference s_623;

  TermReference t_623;

  TermReference x_621;

  TermReference u_624;

  TermReference v_624;

  TermReference w_624;

  TermReference x_624;

  TermReference q_624;

  TermReference r_624;

  TermReference s_624;

  TermReference t_624;

  TermReference v_621;

  TermReference c_622;

  TermReference y_621;

  TermReference a_622;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail606:
    { 
      IStrategoTerm y_624 = null;
      IStrategoTerm z_624 = null;
      IStrategoTerm n_625 = null;
      IStrategoTerm o_625 = null;
      IStrategoTerm r_625 = null;
      IStrategoTerm s_625 = null;
      IStrategoTerm t_625 = null;
      if(n_622.value == null)
        n_622.value = term;
      else
        if(n_622.value != term && !n_622.value.match(term))
          break Fail606;
      if(r_622.value == null)
        break Fail606;
      term = s_var_0_4.instance.invoke(context, r_622.value, k_622.value, l_622.value, m_622.value, n_622.value);
      if(term == null)
        break Fail606;
      if(b_622.value == null)
        break Fail606;
      term = b_622.value;
      if(v_622.value == null)
        v_622.value = term;
      else
        if(v_622.value != term && !v_622.value.match(term))
          break Fail606;
      term = transformer_debug.const181;
      if(s_622.value == null)
        s_622.value = term;
      else
        if(s_622.value != term && !s_622.value.match(term))
          break Fail606;
      if(v_622.value == null)
        break Fail606;
      term = v_622.value;
      if(w_622.value == null)
        w_622.value = term;
      else
        if(w_622.value != term && !w_622.value.match(term))
          break Fail606;
      term = transformer_debug.const182;
      if(t_622.value == null)
        t_622.value = term;
      else
        if(t_622.value != term && !t_622.value.match(term))
          break Fail606;
      if(w_622.value == null)
        break Fail606;
      term = w_622.value;
      if(x_622.value == null)
        x_622.value = term;
      else
        if(x_622.value != term && !x_622.value.match(term))
          break Fail606;
      term = transformer_debug.constLocationInfo68;
      if(u_622.value == null)
        u_622.value = term;
      else
        if(u_622.value != term && !u_622.value.match(term))
          break Fail606;
      if(x_622.value == null)
        break Fail606;
      term = s_step_0_3.instance.invoke(context, x_622.value, s_622.value, t_622.value, u_622.value);
      if(term == null)
        break Fail606;
      if(w_621.value == null)
        w_621.value = term;
      else
        if(w_621.value != term && !w_621.value.match(term))
          break Fail606;
      if(b_623.value == null)
        b_623.value = term;
      else
        if(b_623.value != term && !b_623.value.match(term))
          break Fail606;
      term = transformer_debug.const181;
      if(y_622.value == null)
        y_622.value = term;
      else
        if(y_622.value != term && !y_622.value.match(term))
          break Fail606;
      if(b_623.value == null)
        break Fail606;
      term = b_623.value;
      if(c_623.value == null)
        c_623.value = term;
      else
        if(c_623.value != term && !c_623.value.match(term))
          break Fail606;
      term = transformer_debug.const182;
      if(z_622.value == null)
        z_622.value = term;
      else
        if(z_622.value != term && !z_622.value.match(term))
          break Fail606;
      if(c_623.value == null)
        break Fail606;
      term = c_623.value;
      if(d_623.value == null)
        d_623.value = term;
      else
        if(d_623.value != term && !d_623.value.match(term))
          break Fail606;
      term = transformer_debug.constLocationInfo69;
      if(a_623.value == null)
        a_623.value = term;
      else
        if(a_623.value != term && !a_623.value.match(term))
          break Fail606;
      if(d_623.value == null)
        break Fail606;
      term = s_step_0_3.instance.invoke(context, d_623.value, y_622.value, z_622.value, a_623.value);
      if(term == null)
        break Fail606;
      if(w_621.value == null)
        break Fail606;
      term = termFactory.makeAppl(transformer_debug._consFILE_1, new IStrategoTerm[]{w_621.value});
      if(h_623.value == null)
        h_623.value = term;
      else
        if(h_623.value != term && !h_623.value.match(term))
          break Fail606;
      term = transformer_debug.const181;
      if(e_623.value == null)
        e_623.value = term;
      else
        if(e_623.value != term && !e_623.value.match(term))
          break Fail606;
      if(h_623.value == null)
        break Fail606;
      term = h_623.value;
      if(i_623.value == null)
        i_623.value = term;
      else
        if(i_623.value != term && !i_623.value.match(term))
          break Fail606;
      term = transformer_debug.const182;
      if(f_623.value == null)
        f_623.value = term;
      else
        if(f_623.value != term && !f_623.value.match(term))
          break Fail606;
      if(i_623.value == null)
        break Fail606;
      term = i_623.value;
      if(j_623.value == null)
        j_623.value = term;
      else
        if(j_623.value != term && !j_623.value.match(term))
          break Fail606;
      term = transformer_debug.constLocationInfo70;
      if(g_623.value == null)
        g_623.value = term;
      else
        if(g_623.value != term && !g_623.value.match(term))
          break Fail606;
      if(j_623.value == null)
        break Fail606;
      term = s_step_0_3.instance.invoke(context, j_623.value, e_623.value, f_623.value, g_623.value);
      if(term == null)
        break Fail606;
      if(c_622.value == null)
        c_622.value = term;
      else
        if(c_622.value != term && !c_622.value.match(term))
          break Fail606;
      if(n_623.value == null)
        n_623.value = term;
      else
        if(n_623.value != term && !n_623.value.match(term))
          break Fail606;
      term = transformer_debug.const181;
      if(k_623.value == null)
        k_623.value = term;
      else
        if(k_623.value != term && !k_623.value.match(term))
          break Fail606;
      if(n_623.value == null)
        break Fail606;
      term = n_623.value;
      if(o_623.value == null)
        o_623.value = term;
      else
        if(o_623.value != term && !o_623.value.match(term))
          break Fail606;
      term = transformer_debug.const182;
      if(l_623.value == null)
        l_623.value = term;
      else
        if(l_623.value != term && !l_623.value.match(term))
          break Fail606;
      if(o_623.value == null)
        break Fail606;
      term = o_623.value;
      if(p_623.value == null)
        p_623.value = term;
      else
        if(p_623.value != term && !p_623.value.match(term))
          break Fail606;
      term = transformer_debug.constLocationInfo71;
      if(m_623.value == null)
        m_623.value = term;
      else
        if(m_623.value != term && !m_623.value.match(term))
          break Fail606;
      if(p_623.value == null)
        break Fail606;
      term = s_step_0_3.instance.invoke(context, p_623.value, k_623.value, l_623.value, m_623.value);
      if(term == null)
        break Fail606;
      if(u_623.value == null)
        u_623.value = term;
      else
        if(u_623.value != term && !u_623.value.match(term))
          break Fail606;
      term = transformer_debug.const181;
      if(q_623.value == null)
        q_623.value = term;
      else
        if(q_623.value != term && !q_623.value.match(term))
          break Fail606;
      if(u_623.value == null)
        break Fail606;
      term = u_623.value;
      if(v_623.value == null)
        v_623.value = term;
      else
        if(v_623.value != term && !v_623.value.match(term))
          break Fail606;
      term = transformer_debug.const182;
      if(s_623.value == null)
        s_623.value = term;
      else
        if(s_623.value != term && !s_623.value.match(term))
          break Fail606;
      if(v_623.value == null)
        break Fail606;
      term = v_623.value;
      if(w_623.value == null)
        w_623.value = term;
      else
        if(w_623.value != term && !w_623.value.match(term))
          break Fail606;
      term = transformer_debug.constLocationInfo72;
      if(t_623.value == null)
        t_623.value = term;
      else
        if(t_623.value != term && !t_623.value.match(term))
          break Fail606;
      if(w_623.value == null)
        break Fail606;
      term = s_step_0_3.instance.invoke(context, w_623.value, q_623.value, s_623.value, t_623.value);
      if(term == null)
        break Fail606;
      term = transformer_debug.const149;
      IStrategoTerm term147 = term;
      Success301:
      { 
        Fail607:
        { 
          IStrategoTerm a_624 = null;
          IStrategoTerm b_624 = null;
          IStrategoTerm f_624 = null;
          IStrategoTerm h_624 = null;
          IStrategoTerm i_624 = null;
          f_624 = term;
          a_624 = transformer_debug.const181;
          h_624 = f_624;
          b_624 = transformer_debug.const182;
          i_624 = h_624;
          term = s_step_0_3.instance.invoke(context, i_624, a_624, b_624, transformer_debug.constLocationInfo73);
          if(term == null)
            break Fail607;
          term = get_config_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail607;
          if(true)
            break Success301;
        }
        term = term147;
        IStrategoTerm j_624 = null;
        IStrategoTerm k_624 = null;
        IStrategoTerm m_624 = null;
        IStrategoTerm o_624 = null;
        IStrategoTerm p_624 = null;
        m_624 = term;
        j_624 = transformer_debug.const181;
        o_624 = m_624;
        k_624 = transformer_debug.const182;
        p_624 = o_624;
        term = s_step_0_3.instance.invoke(context, p_624, j_624, k_624, transformer_debug.constLocationInfo74);
        if(term == null)
          break Fail606;
        term = transformer_debug.constNil1;
      }
      if(x_621.value == null)
        x_621.value = term;
      else
        if(x_621.value != term && !x_621.value.match(term))
          break Fail606;
      if(x_621.value == null)
        break Fail606;
      term = x_621.value;
      if(u_624.value == null)
        u_624.value = term;
      else
        if(u_624.value != term && !u_624.value.match(term))
          break Fail606;
      term = transformer_debug.const181;
      if(q_624.value == null)
        q_624.value = term;
      else
        if(q_624.value != term && !q_624.value.match(term))
          break Fail606;
      if(u_624.value == null)
        break Fail606;
      term = u_624.value;
      if(v_624.value == null)
        v_624.value = term;
      else
        if(v_624.value != term && !v_624.value.match(term))
          break Fail606;
      term = transformer_debug.const182;
      if(r_624.value == null)
        r_624.value = term;
      else
        if(r_624.value != term && !r_624.value.match(term))
          break Fail606;
      if(v_624.value == null)
        break Fail606;
      term = v_624.value;
      if(w_624.value == null)
        w_624.value = term;
      else
        if(w_624.value != term && !w_624.value.match(term))
          break Fail606;
      term = transformer_debug.const185;
      if(s_624.value == null)
        s_624.value = term;
      else
        if(s_624.value != term && !s_624.value.match(term))
          break Fail606;
      if(w_624.value == null)
        break Fail606;
      term = w_624.value;
      if(x_624.value == null)
        x_624.value = term;
      else
        if(x_624.value != term && !x_624.value.match(term))
          break Fail606;
      term = transformer_debug.constLocationInfo75;
      if(t_624.value == null)
        t_624.value = term;
      else
        if(t_624.value != term && !t_624.value.match(term))
          break Fail606;
      if(x_624.value == null)
        break Fail606;
      term = s_var_0_4.instance.invoke(context, x_624.value, q_624.value, r_624.value, s_624.value, t_624.value);
      if(term == null)
        break Fail606;
      z_624 = term;
      IStrategoTerm term149 = term;
      Success302:
      { 
        Fail608:
        { 
          IStrategoTerm b_625 = null;
          IStrategoTerm c_625 = null;
          IStrategoTerm e_625 = null;
          IStrategoTerm f_625 = null;
          IStrategoTerm g_625 = null;
          e_625 = term;
          b_625 = transformer_debug.const181;
          f_625 = e_625;
          c_625 = transformer_debug.const182;
          g_625 = f_625;
          term = s_step_0_3.instance.invoke(context, g_625, b_625, c_625, transformer_debug.constLocationInfo80);
          if(term == null)
            break Fail608;
          term = whoami_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail608;
          if(true)
            break Success302;
        }
        term = term149;
        IStrategoTerm h_625 = null;
        IStrategoTerm i_625 = null;
        IStrategoTerm k_625 = null;
        IStrategoTerm l_625 = null;
        IStrategoTerm m_625 = null;
        k_625 = term;
        h_625 = transformer_debug.const181;
        l_625 = k_625;
        i_625 = transformer_debug.const182;
        m_625 = l_625;
        term = s_step_0_3.instance.invoke(context, m_625, h_625, i_625, transformer_debug.constLocationInfo81);
        if(term == null)
          break Fail606;
        term = transformer_debug.const189;
      }
      y_624 = term;
      term = z_624;
      if(v_621.value == null)
        break Fail606;
      IStrategoList list1;
      list1 = checkListTail(v_621.value);
      if(list1 == null)
        break Fail606;
      term = (IStrategoTerm)termFactory.makeListCons(y_624, list1);
      r_625 = term;
      n_625 = transformer_debug.const181;
      s_625 = r_625;
      o_625 = transformer_debug.const182;
      t_625 = s_625;
      term = s_step_0_3.instance.invoke(context, t_625, n_625, o_625, transformer_debug.constLocationInfo82);
      if(term == null)
        break Fail606;
      term = parse_options_3_0.instance.invoke(context, term, lifted108.instance, lifted109.instance, lifted110.instance);
      if(term == null)
        break Fail606;
      if(c_622.value == null)
        break Fail606;
      term = c_622.value;
      IStrategoTerm s_626 = null;
      IStrategoTerm t_626 = null;
      IStrategoTerm v_626 = null;
      IStrategoTerm w_626 = null;
      IStrategoTerm x_626 = null;
      IStrategoTerm y_626 = null;
      IStrategoTerm z_626 = null;
      IStrategoTerm b_627 = null;
      IStrategoTerm c_627 = null;
      IStrategoTerm d_627 = null;
      IStrategoTerm e_627 = null;
      IStrategoTerm f_627 = null;
      IStrategoTerm h_627 = null;
      IStrategoTerm j_627 = null;
      IStrategoTerm k_627 = null;
      IStrategoTerm d_622 = null;
      IStrategoTerm l_627 = null;
      IStrategoTerm m_627 = null;
      IStrategoTerm r_627 = null;
      IStrategoTerm s_627 = null;
      IStrategoTerm t_627 = null;
      IStrategoTerm v_627 = null;
      IStrategoTerm w_627 = null;
      IStrategoTerm b_628 = null;
      IStrategoTerm d_628 = null;
      IStrategoTerm e_628 = null;
      IStrategoTerm f_628 = null;
      IStrategoTerm g_628 = null;
      IStrategoTerm i_628 = null;
      IStrategoTerm k_628 = null;
      IStrategoTerm l_628 = null;
      IStrategoTerm n_628 = null;
      IStrategoTerm q_628 = null;
      IStrategoTerm r_628 = null;
      IStrategoTerm t_628 = null;
      IStrategoTerm v_628 = null;
      IStrategoTerm w_628 = null;
      v_626 = term;
      s_626 = transformer_debug.const181;
      w_626 = v_626;
      t_626 = transformer_debug.const182;
      x_626 = w_626;
      term = s_step_0_3.instance.invoke(context, x_626, s_626, t_626, transformer_debug.constLocationInfo83);
      if(term == null)
        break Fail606;
      term = pack_process_options_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail606;
      b_627 = term;
      y_626 = transformer_debug.const181;
      c_627 = b_627;
      z_626 = transformer_debug.const182;
      d_627 = c_627;
      term = s_step_0_3.instance.invoke(context, d_627, y_626, z_626, transformer_debug.constLocationInfo84);
      if(term == null)
        break Fail606;
      term = pack_report_options_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail606;
      h_627 = term;
      e_627 = transformer_debug.const181;
      j_627 = h_627;
      f_627 = transformer_debug.const182;
      k_627 = j_627;
      term = s_step_0_3.instance.invoke(context, k_627, e_627, f_627, transformer_debug.constLocationInfo85);
      if(term == null)
        break Fail606;
      d_622 = term;
      r_627 = term;
      l_627 = transformer_debug.const181;
      s_627 = r_627;
      m_627 = transformer_debug.const182;
      t_627 = s_627;
      term = s_step_0_3.instance.invoke(context, t_627, l_627, m_627, transformer_debug.constLocationInfo86);
      if(term == null)
        break Fail606;
      term = pack_include_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail606;
      b_628 = d_622;
      v_627 = transformer_debug.const181;
      d_628 = b_628;
      w_627 = transformer_debug.const182;
      e_628 = d_628;
      term = s_step_0_3.instance.invoke(context, e_628, v_627, w_627, transformer_debug.constLocationInfo87);
      if(term == null)
        break Fail606;
      i_628 = term;
      f_628 = transformer_debug.const181;
      k_628 = i_628;
      g_628 = transformer_debug.const182;
      l_628 = k_628;
      term = s_step_0_3.instance.invoke(context, l_628, f_628, g_628, transformer_debug.constLocationInfo88);
      if(term == null)
        break Fail606;
      n_628 = term;
      t_628 = term;
      q_628 = transformer_debug.const181;
      v_628 = t_628;
      r_628 = transformer_debug.const182;
      w_628 = v_628;
      term = s_step_0_3.instance.invoke(context, w_628, q_628, r_628, transformer_debug.constLocationInfo89);
      if(term == null)
        break Fail606;
      term = pack_include_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail606;
      term = pack_stratego_0_1.instance.invoke(context, n_628, term);
      if(term == null)
        break Fail606;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail606;
      if(y_621.value == null)
        y_621.value = term.getSubterm(0);
      else
        if(y_621.value != term.getSubterm(0) && !y_621.value.match(term.getSubterm(0)))
          break Fail606;
      if(a_622.value == null)
        a_622.value = term.getSubterm(1);
      else
        if(a_622.value != term.getSubterm(1) && !a_622.value.match(term.getSubterm(1)))
          break Fail606;
      if(true)
        return term;
    }
    return null;
  }
}