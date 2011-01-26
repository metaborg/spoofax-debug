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

@SuppressWarnings("all") final class var_wrap_r_0_3_fragment_0 extends Strategy 
{ 
  TermReference m_768;

  TermReference h_768;

  TermReference i_768;

  TermReference j_768;

  TermReference g_768;

  TermReference s_768;

  TermReference t_768;

  TermReference u_768;

  TermReference v_768;

  TermReference o_768;

  TermReference p_768;

  TermReference q_768;

  TermReference r_768;

  TermReference a_769;

  TermReference b_769;

  TermReference c_769;

  TermReference d_769;

  TermReference w_768;

  TermReference x_768;

  TermReference y_768;

  TermReference z_768;

  TermReference i_769;

  TermReference j_769;

  TermReference k_769;

  TermReference l_769;

  TermReference e_769;

  TermReference f_769;

  TermReference g_769;

  TermReference h_769;

  TermReference n_768;

  TermReference z_767;

  TermReference a_768;

  TermReference d_1145;

  TermReference c_768;

  TermReference e_768;

  TermReference b_1145;

  TermReference c_1145;

  TermReference b_768;

  TermReference f_768;

  TermReference d_768;

  TermReference y_767;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail579:
    { 
      IStrategoTerm m_769 = null;
      IStrategoTerm n_769 = null;
      IStrategoTerm o_769 = null;
      IStrategoTerm p_769 = null;
      IStrategoTerm r_769 = null;
      IStrategoTerm s_769 = null;
      IStrategoTerm t_769 = null;
      IStrategoTerm u_769 = null;
      IStrategoTerm v_769 = null;
      IStrategoTerm w_769 = null;
      IStrategoTerm x_769 = null;
      IStrategoTerm z_769 = null;
      IStrategoTerm a_770 = null;
      IStrategoTerm b_770 = null;
      IStrategoTerm c_770 = null;
      IStrategoTerm d_770 = null;
      IStrategoTerm e_770 = null;
      IStrategoTerm f_770 = null;
      IStrategoTerm h_770 = null;
      IStrategoTerm i_770 = null;
      IStrategoTerm j_770 = null;
      IStrategoTerm k_770 = null;
      IStrategoTerm l_770 = null;
      IStrategoTerm m_770 = null;
      IStrategoTerm n_770 = null;
      IStrategoTerm p_770 = null;
      IStrategoTerm q_770 = null;
      IStrategoTerm r_770 = null;
      IStrategoTerm s_770 = null;
      IStrategoTerm t_770 = null;
      IStrategoTerm u_770 = null;
      IStrategoTerm v_770 = null;
      IStrategoTerm x_770 = null;
      IStrategoTerm y_770 = null;
      IStrategoTerm z_770 = null;
      IStrategoTerm a_771 = null;
      IStrategoTerm b_771 = null;
      IStrategoTerm d_771 = null;
      IStrategoTerm e_771 = null;
      IStrategoTerm f_771 = null;
      IStrategoTerm g_771 = null;
      IStrategoTerm h_771 = null;
      IStrategoTerm i_771 = null;
      IStrategoTerm k_771 = null;
      IStrategoTerm l_771 = null;
      IStrategoTerm m_771 = null;
      IStrategoTerm n_771 = null;
      IStrategoTerm o_771 = null;
      IStrategoTerm p_771 = null;
      IStrategoTerm r_771 = null;
      IStrategoTerm s_771 = null;
      IStrategoTerm t_771 = null;
      IStrategoTerm u_771 = null;
      IStrategoTerm v_771 = null;
      IStrategoTerm x_771 = null;
      IStrategoTerm y_771 = null;
      IStrategoTerm z_771 = null;
      IStrategoTerm a_772 = null;
      IStrategoTerm b_772 = null;
      IStrategoTerm c_772 = null;
      IStrategoTerm e_772 = null;
      IStrategoTerm f_772 = null;
      IStrategoTerm g_772 = null;
      IStrategoTerm h_772 = null;
      IStrategoTerm i_772 = null;
      IStrategoTerm j_772 = null;
      IStrategoTerm l_772 = null;
      IStrategoTerm m_772 = null;
      IStrategoTerm n_772 = null;
      IStrategoTerm o_772 = null;
      IStrategoTerm p_772 = null;
      IStrategoTerm r_772 = null;
      IStrategoTerm s_772 = null;
      IStrategoTerm t_772 = null;
      IStrategoTerm u_772 = null;
      IStrategoTerm v_772 = null;
      IStrategoTerm w_772 = null;
      IStrategoTerm y_772 = null;
      IStrategoTerm z_772 = null;
      IStrategoTerm a_773 = null;
      IStrategoTerm b_773 = null;
      IStrategoTerm c_773 = null;
      IStrategoTerm d_773 = null;
      IStrategoTerm f_773 = null;
      IStrategoTerm g_773 = null;
      IStrategoTerm h_773 = null;
      IStrategoTerm i_773 = null;
      IStrategoTerm j_773 = null;
      IStrategoTerm l_773 = null;
      IStrategoTerm m_773 = null;
      IStrategoTerm n_773 = null;
      IStrategoTerm o_773 = null;
      IStrategoTerm p_773 = null;
      IStrategoTerm q_773 = null;
      IStrategoTerm s_773 = null;
      IStrategoTerm t_773 = null;
      IStrategoTerm u_773 = null;
      IStrategoTerm v_773 = null;
      if(m_768.value == null)
        break Fail579;
      term = r_enter_0_3.instance.invoke(context, m_768.value, h_768.value, i_768.value, j_768.value);
      if(term == null)
        break Fail579;
      if(g_768.value == null)
        break Fail579;
      term = g_768.value;
      if(n_768.value == null)
        n_768.value = term;
      else
        if(n_768.value != term && !n_768.value.match(term))
          break Fail579;
      if(b_1145.value == null)
        break Fail579;
      term = b_1145.value;
      if(s_768.value == null)
        s_768.value = term;
      else
        if(s_768.value != term && !s_768.value.match(term))
          break Fail579;
      term = transformer_debug.const284;
      if(o_768.value == null)
        o_768.value = term;
      else
        if(o_768.value != term && !o_768.value.match(term))
          break Fail579;
      if(s_768.value == null)
        break Fail579;
      term = s_768.value;
      if(t_768.value == null)
        t_768.value = term;
      else
        if(t_768.value != term && !t_768.value.match(term))
          break Fail579;
      term = transformer_debug.const297;
      if(p_768.value == null)
        p_768.value = term;
      else
        if(p_768.value != term && !p_768.value.match(term))
          break Fail579;
      if(t_768.value == null)
        break Fail579;
      term = t_768.value;
      if(u_768.value == null)
        u_768.value = term;
      else
        if(u_768.value != term && !u_768.value.match(term))
          break Fail579;
      term = transformer_debug.const238;
      if(q_768.value == null)
        q_768.value = term;
      else
        if(q_768.value != term && !q_768.value.match(term))
          break Fail579;
      if(u_768.value == null)
        break Fail579;
      term = u_768.value;
      if(v_768.value == null)
        v_768.value = term;
      else
        if(v_768.value != term && !v_768.value.match(term))
          break Fail579;
      term = transformer_debug.constLocationInfo392;
      if(r_768.value == null)
        r_768.value = term;
      else
        if(r_768.value != term && !r_768.value.match(term))
          break Fail579;
      if(v_768.value == null)
        break Fail579;
      term = s_var_0_4.instance.invoke(context, v_768.value, o_768.value, p_768.value, q_768.value, r_768.value);
      if(term == null)
        break Fail579;
      if(c_1145.value == null)
        break Fail579;
      term = c_1145.value;
      if(a_769.value == null)
        a_769.value = term;
      else
        if(a_769.value != term && !a_769.value.match(term))
          break Fail579;
      term = transformer_debug.const284;
      if(w_768.value == null)
        w_768.value = term;
      else
        if(w_768.value != term && !w_768.value.match(term))
          break Fail579;
      if(a_769.value == null)
        break Fail579;
      term = a_769.value;
      if(b_769.value == null)
        b_769.value = term;
      else
        if(b_769.value != term && !b_769.value.match(term))
          break Fail579;
      term = transformer_debug.const297;
      if(x_768.value == null)
        x_768.value = term;
      else
        if(x_768.value != term && !x_768.value.match(term))
          break Fail579;
      if(b_769.value == null)
        break Fail579;
      term = b_769.value;
      if(c_769.value == null)
        c_769.value = term;
      else
        if(c_769.value != term && !c_769.value.match(term))
          break Fail579;
      term = transformer_debug.const287;
      if(y_768.value == null)
        y_768.value = term;
      else
        if(y_768.value != term && !y_768.value.match(term))
          break Fail579;
      if(c_769.value == null)
        break Fail579;
      term = c_769.value;
      if(d_769.value == null)
        d_769.value = term;
      else
        if(d_769.value != term && !d_769.value.match(term))
          break Fail579;
      term = transformer_debug.constLocationInfo393;
      if(z_768.value == null)
        z_768.value = term;
      else
        if(z_768.value != term && !z_768.value.match(term))
          break Fail579;
      if(d_769.value == null)
        break Fail579;
      term = s_var_0_4.instance.invoke(context, d_769.value, w_768.value, x_768.value, y_768.value, z_768.value);
      if(term == null)
        break Fail579;
      if(d_1145.value == null)
        break Fail579;
      term = d_1145.value;
      if(i_769.value == null)
        i_769.value = term;
      else
        if(i_769.value != term && !i_769.value.match(term))
          break Fail579;
      term = transformer_debug.const284;
      if(e_769.value == null)
        e_769.value = term;
      else
        if(e_769.value != term && !e_769.value.match(term))
          break Fail579;
      if(i_769.value == null)
        break Fail579;
      term = i_769.value;
      if(j_769.value == null)
        j_769.value = term;
      else
        if(j_769.value != term && !j_769.value.match(term))
          break Fail579;
      term = transformer_debug.const297;
      if(f_769.value == null)
        f_769.value = term;
      else
        if(f_769.value != term && !f_769.value.match(term))
          break Fail579;
      if(j_769.value == null)
        break Fail579;
      term = j_769.value;
      if(k_769.value == null)
        k_769.value = term;
      else
        if(k_769.value != term && !k_769.value.match(term))
          break Fail579;
      term = transformer_debug.const248;
      if(g_769.value == null)
        g_769.value = term;
      else
        if(g_769.value != term && !g_769.value.match(term))
          break Fail579;
      if(k_769.value == null)
        break Fail579;
      term = k_769.value;
      if(l_769.value == null)
        l_769.value = term;
      else
        if(l_769.value != term && !l_769.value.match(term))
          break Fail579;
      term = transformer_debug.constLocationInfo394;
      if(h_769.value == null)
        h_769.value = term;
      else
        if(h_769.value != term && !h_769.value.match(term))
          break Fail579;
      if(l_769.value == null)
        break Fail579;
      term = s_var_0_4.instance.invoke(context, l_769.value, e_769.value, f_769.value, g_769.value, h_769.value);
      if(term == null)
        break Fail579;
      if(n_768.value == null)
        break Fail579;
      term = n_768.value;
      m_769 = n_768.value;
      if(b_768.value == null)
        break Fail579;
      r_769 = b_768.value;
      n_769 = transformer_debug.const284;
      s_769 = r_769;
      o_769 = transformer_debug.const297;
      t_769 = s_769;
      p_769 = transformer_debug.const240;
      u_769 = t_769;
      term = s_var_0_4.instance.invoke(context, u_769, n_769, o_769, p_769, transformer_debug.constLocationInfo395);
      if(term == null)
        break Fail579;
      if(e_768.value == null)
        break Fail579;
      z_769 = e_768.value;
      v_769 = transformer_debug.const284;
      a_770 = z_769;
      w_769 = transformer_debug.const297;
      b_770 = a_770;
      x_769 = transformer_debug.const298;
      c_770 = b_770;
      term = s_var_0_4.instance.invoke(context, c_770, v_769, w_769, x_769, transformer_debug.constLocationInfo396);
      if(term == null)
        break Fail579;
      if(z_767.value == null)
        break Fail579;
      h_770 = z_767.value;
      d_770 = transformer_debug.const284;
      i_770 = h_770;
      e_770 = transformer_debug.const297;
      j_770 = i_770;
      f_770 = transformer_debug.const304;
      k_770 = j_770;
      term = s_var_0_4.instance.invoke(context, k_770, d_770, e_770, f_770, transformer_debug.constLocationInfo397);
      if(term == null)
        break Fail579;
      if(y_767.value == null)
        break Fail579;
      p_770 = y_767.value;
      l_770 = transformer_debug.const284;
      q_770 = p_770;
      m_770 = transformer_debug.const297;
      r_770 = q_770;
      n_770 = transformer_debug.const235;
      s_770 = r_770;
      term = s_var_0_4.instance.invoke(context, s_770, l_770, m_770, n_770, transformer_debug.constLocationInfo398);
      if(term == null)
        break Fail579;
      term = m_769;
      t_770 = m_769;
      x_770 = term;
      u_770 = transformer_debug.const284;
      y_770 = x_770;
      v_770 = transformer_debug.const297;
      z_770 = y_770;
      term = s_step_0_3.instance.invoke(context, z_770, u_770, v_770, transformer_debug.constLocationInfo399);
      if(term == null)
        break Fail579;
      if(z_767.value == null)
        break Fail579;
      d_771 = z_767.value;
      a_771 = transformer_debug.const284;
      e_771 = d_771;
      b_771 = transformer_debug.const297;
      f_771 = e_771;
      term = s_step_0_3.instance.invoke(context, f_771, a_771, b_771, transformer_debug.constLocationInfo400);
      if(term == null)
        break Fail579;
      term = add_var_to_rule_cond_0_2.instance.invoke(context, term, b_1145.value, c_1145.value);
      if(term == null)
        break Fail579;
      if(a_768.value == null)
        a_768.value = term;
      else
        if(a_768.value != term && !a_768.value.match(term))
          break Fail579;
      if(a_768.value == null)
        break Fail579;
      k_771 = a_768.value;
      g_771 = transformer_debug.const284;
      l_771 = k_771;
      h_771 = transformer_debug.const297;
      m_771 = l_771;
      i_771 = transformer_debug.const306;
      n_771 = m_771;
      term = s_var_0_4.instance.invoke(context, n_771, g_771, h_771, i_771, transformer_debug.constLocationInfo401);
      if(term == null)
        break Fail579;
      r_771 = term;
      o_771 = transformer_debug.const284;
      s_771 = r_771;
      p_771 = transformer_debug.const297;
      t_771 = s_771;
      term = s_step_0_3.instance.invoke(context, t_771, o_771, p_771, transformer_debug.constLocationInfo402);
      if(term == null)
        break Fail579;
      if(b_768.value == null)
        break Fail579;
      x_771 = b_768.value;
      u_771 = transformer_debug.const284;
      y_771 = x_771;
      v_771 = transformer_debug.const297;
      z_771 = y_771;
      term = s_step_0_3.instance.invoke(context, z_771, u_771, v_771, transformer_debug.constLocationInfo403);
      if(term == null)
        break Fail579;
      term = try_s_var_for_match_0_3.instance.invoke(context, term, b_1145.value, c_1145.value, a_768.value);
      if(term == null)
        break Fail579;
      if(c_768.value == null)
        c_768.value = term;
      else
        if(c_768.value != term && !c_768.value.match(term))
          break Fail579;
      if(c_768.value == null)
        break Fail579;
      e_772 = c_768.value;
      a_772 = transformer_debug.const284;
      f_772 = e_772;
      b_772 = transformer_debug.const297;
      g_772 = f_772;
      c_772 = transformer_debug.const300;
      h_772 = g_772;
      term = s_var_0_4.instance.invoke(context, h_772, a_772, b_772, c_772, transformer_debug.constLocationInfo404);
      if(term == null)
        break Fail579;
      l_772 = term;
      i_772 = transformer_debug.const284;
      m_772 = l_772;
      j_772 = transformer_debug.const297;
      n_772 = m_772;
      term = s_step_0_3.instance.invoke(context, n_772, i_772, j_772, transformer_debug.constLocationInfo405);
      if(term == null)
        break Fail579;
      if(d_1145.value == null)
        break Fail579;
      r_772 = d_1145.value;
      o_772 = transformer_debug.const284;
      s_772 = r_772;
      p_772 = transformer_debug.const297;
      t_772 = s_772;
      term = s_step_0_3.instance.invoke(context, t_772, o_772, p_772, transformer_debug.constLocationInfo406);
      if(term == null)
        break Fail579;
      term = try_s_var_for_t_args_0_3.instance.invoke(context, term, b_1145.value, c_1145.value, c_768.value);
      if(term == null)
        break Fail579;
      if(d_768.value == null)
        d_768.value = term;
      else
        if(d_768.value != term && !d_768.value.match(term))
          break Fail579;
      if(d_768.value == null)
        break Fail579;
      y_772 = d_768.value;
      u_772 = transformer_debug.const284;
      z_772 = y_772;
      v_772 = transformer_debug.const297;
      a_773 = z_772;
      w_772 = transformer_debug.const301;
      b_773 = a_773;
      term = s_var_0_4.instance.invoke(context, b_773, u_772, v_772, w_772, transformer_debug.constLocationInfo407);
      if(term == null)
        break Fail579;
      f_773 = term;
      c_773 = transformer_debug.const284;
      g_773 = f_773;
      d_773 = transformer_debug.const297;
      h_773 = g_773;
      term = s_step_0_3.instance.invoke(context, h_773, c_773, d_773, transformer_debug.constLocationInfo408);
      if(term == null)
        break Fail579;
      if(e_768.value == null)
        break Fail579;
      l_773 = e_768.value;
      i_773 = transformer_debug.const284;
      m_773 = l_773;
      j_773 = transformer_debug.const297;
      n_773 = m_773;
      term = s_step_0_3.instance.invoke(context, n_773, i_773, j_773, transformer_debug.constLocationInfo409);
      if(term == null)
        break Fail579;
      term = var_wrap_s_0_2.instance.invoke(context, term, b_1145.value, c_1145.value);
      if(term == null)
        break Fail579;
      if(f_768.value == null)
        f_768.value = term;
      else
        if(f_768.value != term && !f_768.value.match(term))
          break Fail579;
      if(f_768.value == null)
        break Fail579;
      s_773 = f_768.value;
      o_773 = transformer_debug.const284;
      t_773 = s_773;
      p_773 = transformer_debug.const297;
      u_773 = t_773;
      q_773 = transformer_debug.const299;
      v_773 = u_773;
      term = s_var_0_4.instance.invoke(context, v_773, o_773, p_773, q_773, transformer_debug.constLocationInfo410);
      if(term == null)
        break Fail579;
      term = t_770;
      IStrategoTerm w_773 = null;
      IStrategoTerm x_773 = null;
      IStrategoTerm z_773 = null;
      IStrategoTerm a_774 = null;
      IStrategoTerm b_774 = null;
      if(b_768.value == null || (f_768.value == null || (d_768.value == null || y_767.value == null)))
        break Fail579;
      term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consRule_3, new IStrategoTerm[]{b_768.value, f_768.value, d_768.value}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(y_767.value, (IStrategoList)transformer_debug.constNil1)));
      z_773 = term;
      w_773 = transformer_debug.const284;
      a_774 = z_773;
      x_773 = transformer_debug.const297;
      b_774 = a_774;
      term = r_exit_0_3.instance.invoke(context, b_774, w_773, x_773, transformer_debug.constLocationInfo411);
      if(term == null)
        break Fail579;
      if(true)
        return term;
    }
    return null;
  }
}