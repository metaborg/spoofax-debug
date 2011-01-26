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

@SuppressWarnings("all") final class apply_debug_project_0_1_fragment_0 extends Strategy 
{ 
  TermReference t_1112;

  TermReference u_1112;

  TermReference v_1112;

  TermReference w_1112;

  TermReference p_1112;

  TermReference q_1112;

  TermReference r_1112;

  TermReference s_1112;

  TermReference o_1112;

  TermReference c_1113;

  TermReference d_1113;

  TermReference e_1113;

  TermReference f_1113;

  TermReference y_1112;

  TermReference z_1112;

  TermReference a_1113;

  TermReference b_1113;

  TermReference k_1113;

  TermReference l_1113;

  TermReference m_1113;

  TermReference n_1113;

  TermReference g_1113;

  TermReference h_1113;

  TermReference i_1113;

  TermReference j_1113;

  TermReference s_1113;

  TermReference t_1113;

  TermReference u_1113;

  TermReference v_1113;

  TermReference o_1113;

  TermReference p_1113;

  TermReference q_1113;

  TermReference r_1113;

  TermReference x_1112;

  TermReference a_1112;

  TermReference z_1111;

  TermReference b_1112;

  TermReference c_1112;

  TermReference f_1112;

  TermReference d_1112;

  TermReference e_1112;

  TermReference g_1112;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail444:
    { 
      IStrategoTerm w_1113 = null;
      IStrategoTerm x_1113 = null;
      IStrategoTerm y_1113 = null;
      IStrategoTerm a_1114 = null;
      IStrategoTerm b_1114 = null;
      IStrategoTerm c_1114 = null;
      IStrategoTerm d_1114 = null;
      IStrategoTerm e_1114 = null;
      IStrategoTerm g_1114 = null;
      IStrategoTerm h_1114 = null;
      IStrategoTerm i_1114 = null;
      IStrategoTerm l_1114 = null;
      IStrategoTerm m_1114 = null;
      IStrategoTerm o_1114 = null;
      IStrategoTerm p_1114 = null;
      IStrategoTerm q_1114 = null;
      IStrategoTerm r_1114 = null;
      IStrategoTerm s_1114 = null;
      IStrategoTerm t_1114 = null;
      IStrategoTerm v_1114 = null;
      IStrategoTerm w_1114 = null;
      IStrategoTerm x_1114 = null;
      IStrategoTerm y_1114 = null;
      IStrategoTerm z_1114 = null;
      IStrategoTerm a_1115 = null;
      IStrategoTerm c_1115 = null;
      IStrategoTerm d_1115 = null;
      IStrategoTerm e_1115 = null;
      IStrategoTerm f_1115 = null;
      IStrategoTerm g_1115 = null;
      IStrategoTerm i_1115 = null;
      IStrategoTerm j_1115 = null;
      IStrategoTerm k_1115 = null;
      IStrategoTerm r_1115 = null;
      IStrategoTerm s_1115 = null;
      IStrategoTerm t_1115 = null;
      IStrategoTerm v_1115 = null;
      IStrategoTerm w_1115 = null;
      IStrategoTerm x_1115 = null;
      IStrategoTerm y_1115 = null;
      IStrategoTerm z_1115 = null;
      IStrategoTerm a_1116 = null;
      IStrategoTerm c_1116 = null;
      IStrategoTerm d_1116 = null;
      IStrategoTerm e_1116 = null;
      IStrategoTerm f_1116 = null;
      IStrategoTerm g_1116 = null;
      IStrategoTerm i_1116 = null;
      IStrategoTerm j_1116 = null;
      IStrategoTerm k_1116 = null;
      IStrategoTerm r_1116 = null;
      IStrategoTerm s_1116 = null;
      IStrategoTerm t_1116 = null;
      IStrategoTerm v_1116 = null;
      IStrategoTerm w_1116 = null;
      IStrategoTerm x_1116 = null;
      IStrategoTerm y_1116 = null;
      IStrategoTerm z_1116 = null;
      IStrategoTerm a_1117 = null;
      IStrategoTerm c_1117 = null;
      IStrategoTerm d_1117 = null;
      IStrategoTerm e_1117 = null;
      IStrategoTerm f_1117 = null;
      IStrategoTerm g_1117 = null;
      IStrategoTerm i_1117 = null;
      IStrategoTerm j_1117 = null;
      IStrategoTerm k_1117 = null;
      IStrategoTerm r_1117 = null;
      IStrategoTerm s_1117 = null;
      IStrategoTerm t_1117 = null;
      IStrategoTerm v_1117 = null;
      IStrategoTerm w_1117 = null;
      IStrategoTerm x_1117 = null;
      IStrategoTerm y_1117 = null;
      if(o_1112.value == null)
        o_1112.value = term;
      else
        if(o_1112.value != term && !o_1112.value.match(term))
          break Fail444;
      if(z_1111.value == null)
        break Fail444;
      term = z_1111.value;
      if(t_1112.value == null)
        t_1112.value = term;
      else
        if(t_1112.value != term && !t_1112.value.match(term))
          break Fail444;
      term = transformer_debug.const618;
      if(p_1112.value == null)
        p_1112.value = term;
      else
        if(p_1112.value != term && !p_1112.value.match(term))
          break Fail444;
      if(t_1112.value == null)
        break Fail444;
      term = t_1112.value;
      if(u_1112.value == null)
        u_1112.value = term;
      else
        if(u_1112.value != term && !u_1112.value.match(term))
          break Fail444;
      term = transformer_debug.const629;
      if(q_1112.value == null)
        q_1112.value = term;
      else
        if(q_1112.value != term && !q_1112.value.match(term))
          break Fail444;
      if(u_1112.value == null)
        break Fail444;
      term = u_1112.value;
      if(v_1112.value == null)
        v_1112.value = term;
      else
        if(v_1112.value != term && !v_1112.value.match(term))
          break Fail444;
      term = transformer_debug.const630;
      if(r_1112.value == null)
        r_1112.value = term;
      else
        if(r_1112.value != term && !r_1112.value.match(term))
          break Fail444;
      if(v_1112.value == null)
        break Fail444;
      term = v_1112.value;
      if(w_1112.value == null)
        w_1112.value = term;
      else
        if(w_1112.value != term && !w_1112.value.match(term))
          break Fail444;
      term = transformer_debug.constLocationInfo1192;
      if(s_1112.value == null)
        s_1112.value = term;
      else
        if(s_1112.value != term && !s_1112.value.match(term))
          break Fail444;
      if(w_1112.value == null)
        break Fail444;
      term = s_var_0_4.instance.invoke(context, w_1112.value, p_1112.value, q_1112.value, r_1112.value, s_1112.value);
      if(term == null)
        break Fail444;
      if(o_1112.value == null)
        break Fail444;
      term = o_1112.value;
      if(x_1112.value == null)
        x_1112.value = term;
      else
        if(x_1112.value != term && !x_1112.value.match(term))
          break Fail444;
      if(d_1112.value == null)
        break Fail444;
      term = d_1112.value;
      if(c_1113.value == null)
        c_1113.value = term;
      else
        if(c_1113.value != term && !c_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const618;
      if(y_1112.value == null)
        y_1112.value = term;
      else
        if(y_1112.value != term && !y_1112.value.match(term))
          break Fail444;
      if(c_1113.value == null)
        break Fail444;
      term = c_1113.value;
      if(d_1113.value == null)
        d_1113.value = term;
      else
        if(d_1113.value != term && !d_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const629;
      if(z_1112.value == null)
        z_1112.value = term;
      else
        if(z_1112.value != term && !z_1112.value.match(term))
          break Fail444;
      if(d_1113.value == null)
        break Fail444;
      term = d_1113.value;
      if(e_1113.value == null)
        e_1113.value = term;
      else
        if(e_1113.value != term && !e_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const103;
      if(a_1113.value == null)
        a_1113.value = term;
      else
        if(a_1113.value != term && !a_1113.value.match(term))
          break Fail444;
      if(e_1113.value == null)
        break Fail444;
      term = e_1113.value;
      if(f_1113.value == null)
        f_1113.value = term;
      else
        if(f_1113.value != term && !f_1113.value.match(term))
          break Fail444;
      term = transformer_debug.constLocationInfo1193;
      if(b_1113.value == null)
        b_1113.value = term;
      else
        if(b_1113.value != term && !b_1113.value.match(term))
          break Fail444;
      if(f_1113.value == null)
        break Fail444;
      term = s_var_0_4.instance.invoke(context, f_1113.value, y_1112.value, z_1112.value, a_1113.value, b_1113.value);
      if(term == null)
        break Fail444;
      if(e_1112.value == null)
        break Fail444;
      term = e_1112.value;
      if(k_1113.value == null)
        k_1113.value = term;
      else
        if(k_1113.value != term && !k_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const618;
      if(g_1113.value == null)
        g_1113.value = term;
      else
        if(g_1113.value != term && !g_1113.value.match(term))
          break Fail444;
      if(k_1113.value == null)
        break Fail444;
      term = k_1113.value;
      if(l_1113.value == null)
        l_1113.value = term;
      else
        if(l_1113.value != term && !l_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const629;
      if(h_1113.value == null)
        h_1113.value = term;
      else
        if(h_1113.value != term && !h_1113.value.match(term))
          break Fail444;
      if(l_1113.value == null)
        break Fail444;
      term = l_1113.value;
      if(m_1113.value == null)
        m_1113.value = term;
      else
        if(m_1113.value != term && !m_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const99;
      if(i_1113.value == null)
        i_1113.value = term;
      else
        if(i_1113.value != term && !i_1113.value.match(term))
          break Fail444;
      if(m_1113.value == null)
        break Fail444;
      term = m_1113.value;
      if(n_1113.value == null)
        n_1113.value = term;
      else
        if(n_1113.value != term && !n_1113.value.match(term))
          break Fail444;
      term = transformer_debug.constLocationInfo1194;
      if(j_1113.value == null)
        j_1113.value = term;
      else
        if(j_1113.value != term && !j_1113.value.match(term))
          break Fail444;
      if(n_1113.value == null)
        break Fail444;
      term = s_var_0_4.instance.invoke(context, n_1113.value, g_1113.value, h_1113.value, i_1113.value, j_1113.value);
      if(term == null)
        break Fail444;
      if(a_1112.value == null)
        break Fail444;
      term = a_1112.value;
      if(s_1113.value == null)
        s_1113.value = term;
      else
        if(s_1113.value != term && !s_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const618;
      if(o_1113.value == null)
        o_1113.value = term;
      else
        if(o_1113.value != term && !o_1113.value.match(term))
          break Fail444;
      if(s_1113.value == null)
        break Fail444;
      term = s_1113.value;
      if(t_1113.value == null)
        t_1113.value = term;
      else
        if(t_1113.value != term && !t_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const629;
      if(p_1113.value == null)
        p_1113.value = term;
      else
        if(p_1113.value != term && !p_1113.value.match(term))
          break Fail444;
      if(t_1113.value == null)
        break Fail444;
      term = t_1113.value;
      if(u_1113.value == null)
        u_1113.value = term;
      else
        if(u_1113.value != term && !u_1113.value.match(term))
          break Fail444;
      term = transformer_debug.const108;
      if(q_1113.value == null)
        q_1113.value = term;
      else
        if(q_1113.value != term && !q_1113.value.match(term))
          break Fail444;
      if(u_1113.value == null)
        break Fail444;
      term = u_1113.value;
      if(v_1113.value == null)
        v_1113.value = term;
      else
        if(v_1113.value != term && !v_1113.value.match(term))
          break Fail444;
      term = transformer_debug.constLocationInfo1195;
      if(r_1113.value == null)
        r_1113.value = term;
      else
        if(r_1113.value != term && !r_1113.value.match(term))
          break Fail444;
      if(v_1113.value == null)
        break Fail444;
      term = s_var_0_4.instance.invoke(context, v_1113.value, o_1113.value, p_1113.value, q_1113.value, r_1113.value);
      if(term == null)
        break Fail444;
      if(x_1112.value == null)
        break Fail444;
      term = x_1112.value;
      w_1113 = x_1112.value;
      if(d_1112.value == null || a_1112.value == null)
        break Fail444;
      term = (IStrategoTerm)termFactory.makeListCons(d_1112.value, termFactory.makeListCons(transformer_debug.const210, termFactory.makeListCons(a_1112.value, (IStrategoList)transformer_debug.constNil1)));
      a_1114 = term;
      x_1113 = transformer_debug.const618;
      b_1114 = a_1114;
      y_1113 = transformer_debug.const629;
      c_1114 = b_1114;
      term = s_step_0_3.instance.invoke(context, c_1114, x_1113, y_1113, transformer_debug.constLocationInfo1196);
      if(term == null)
        break Fail444;
      term = concat_strings_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail444;
      g_1114 = term;
      d_1114 = transformer_debug.const618;
      h_1114 = g_1114;
      e_1114 = transformer_debug.const629;
      i_1114 = h_1114;
      term = s_step_0_3.instance.invoke(context, i_1114, d_1114, e_1114, transformer_debug.constLocationInfo1197);
      if(term == null)
        break Fail444;
      o_1114 = term;
      l_1114 = transformer_debug.const618;
      p_1114 = o_1114;
      m_1114 = transformer_debug.const629;
      q_1114 = p_1114;
      term = s_step_0_3.instance.invoke(context, q_1114, l_1114, m_1114, transformer_debug.constLocationInfo1198);
      if(term == null)
        break Fail444;
      term = get_internal_files_0_1.instance.invoke(context, term, z_1111.value);
      if(term == null)
        break Fail444;
      if(c_1112.value == null)
        c_1112.value = term;
      else
        if(c_1112.value != term && !c_1112.value.match(term))
          break Fail444;
      if(c_1112.value == null)
        break Fail444;
      v_1114 = c_1112.value;
      r_1114 = transformer_debug.const618;
      w_1114 = v_1114;
      s_1114 = transformer_debug.const629;
      x_1114 = w_1114;
      t_1114 = transformer_debug.const631;
      y_1114 = x_1114;
      term = s_var_0_4.instance.invoke(context, y_1114, r_1114, s_1114, t_1114, transformer_debug.constLocationInfo1199);
      if(term == null)
        break Fail444;
      c_1115 = term;
      z_1114 = transformer_debug.const618;
      d_1115 = c_1115;
      a_1115 = transformer_debug.const629;
      e_1115 = d_1115;
      term = s_step_0_3.instance.invoke(context, e_1115, z_1114, a_1115, transformer_debug.constLocationInfo1200);
      if(term == null)
        break Fail444;
      if(c_1112.value == null)
        break Fail444;
      i_1115 = c_1112.value;
      f_1115 = transformer_debug.const618;
      j_1115 = i_1115;
      g_1115 = transformer_debug.const629;
      k_1115 = j_1115;
      term = s_step_0_3.instance.invoke(context, k_1115, f_1115, g_1115, transformer_debug.constLocationInfo1201);
      if(term == null)
        break Fail444;
      term = filter_1_0.instance.invoke(context, term, lifted155.instance);
      if(term == null)
        break Fail444;
      if(b_1112.value == null)
        b_1112.value = term;
      else
        if(b_1112.value != term && !b_1112.value.match(term))
          break Fail444;
      if(b_1112.value == null)
        break Fail444;
      v_1115 = b_1112.value;
      r_1115 = transformer_debug.const618;
      w_1115 = v_1115;
      s_1115 = transformer_debug.const629;
      x_1115 = w_1115;
      t_1115 = transformer_debug.const632;
      y_1115 = x_1115;
      term = s_var_0_4.instance.invoke(context, y_1115, r_1115, s_1115, t_1115, transformer_debug.constLocationInfo1203);
      if(term == null)
        break Fail444;
      c_1116 = term;
      z_1115 = transformer_debug.const618;
      d_1116 = c_1116;
      a_1116 = transformer_debug.const629;
      e_1116 = d_1116;
      term = s_step_0_3.instance.invoke(context, e_1116, z_1115, a_1116, transformer_debug.constLocationInfo1204);
      if(term == null)
        break Fail444;
      if(c_1112.value == null)
        break Fail444;
      i_1116 = c_1112.value;
      f_1116 = transformer_debug.const618;
      j_1116 = i_1116;
      g_1116 = transformer_debug.const629;
      k_1116 = j_1116;
      term = s_step_0_3.instance.invoke(context, k_1116, f_1116, g_1116, transformer_debug.constLocationInfo1205);
      if(term == null)
        break Fail444;
      term = filter_1_0.instance.invoke(context, term, lifted156.instance);
      if(term == null)
        break Fail444;
      if(f_1112.value == null)
        f_1112.value = term;
      else
        if(f_1112.value != term && !f_1112.value.match(term))
          break Fail444;
      if(f_1112.value == null)
        break Fail444;
      v_1116 = f_1112.value;
      r_1116 = transformer_debug.const618;
      w_1116 = v_1116;
      s_1116 = transformer_debug.const629;
      x_1116 = w_1116;
      t_1116 = transformer_debug.const200;
      y_1116 = x_1116;
      term = s_var_0_4.instance.invoke(context, y_1116, r_1116, s_1116, t_1116, transformer_debug.constLocationInfo1207);
      if(term == null)
        break Fail444;
      c_1117 = term;
      z_1116 = transformer_debug.const618;
      d_1117 = c_1117;
      a_1117 = transformer_debug.const629;
      e_1117 = d_1117;
      term = s_step_0_3.instance.invoke(context, e_1117, z_1116, a_1117, transformer_debug.constLocationInfo1208);
      if(term == null)
        break Fail444;
      if(f_1112.value == null)
        break Fail444;
      i_1117 = f_1112.value;
      f_1117 = transformer_debug.const618;
      j_1117 = i_1117;
      g_1117 = transformer_debug.const629;
      k_1117 = j_1117;
      term = s_step_0_3.instance.invoke(context, k_1117, f_1117, g_1117, transformer_debug.constLocationInfo1209);
      if(term == null)
        break Fail444;
      lifted157 lifted1570 = new lifted157();
      lifted1570.d_1112 = d_1112;
      lifted1570.e_1112 = e_1112;
      term = map_1_0.instance.invoke(context, term, lifted1570);
      if(term == null)
        break Fail444;
      if(g_1112.value == null)
        g_1112.value = term;
      else
        if(g_1112.value != term && !g_1112.value.match(term))
          break Fail444;
      if(g_1112.value == null)
        break Fail444;
      v_1117 = g_1112.value;
      r_1117 = transformer_debug.const618;
      w_1117 = v_1117;
      s_1117 = transformer_debug.const629;
      x_1117 = w_1117;
      t_1117 = transformer_debug.const633;
      y_1117 = x_1117;
      term = s_var_0_4.instance.invoke(context, y_1117, r_1117, s_1117, t_1117, transformer_debug.constLocationInfo1211);
      if(term == null)
        break Fail444;
      term = w_1113;
      IStrategoTerm z_1117 = null;
      IStrategoTerm a_1118 = null;
      IStrategoTerm c_1118 = null;
      IStrategoTerm d_1118 = null;
      IStrategoTerm e_1118 = null;
      if(g_1112.value == null)
        break Fail444;
      c_1118 = g_1112.value;
      z_1117 = transformer_debug.const618;
      d_1118 = c_1118;
      a_1118 = transformer_debug.const629;
      e_1118 = d_1118;
      term = r_exit_0_3.instance.invoke(context, e_1118, z_1117, a_1118, transformer_debug.constLocationInfo1212);
      if(term == null)
        break Fail444;
      if(true)
        return term;
    }
    return null;
  }
}