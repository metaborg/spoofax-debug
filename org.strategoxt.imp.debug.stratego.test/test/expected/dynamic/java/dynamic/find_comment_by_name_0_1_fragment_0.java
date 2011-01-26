package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class find_comment_by_name_0_1_fragment_0 extends Strategy 
{ 
  TermReference b_22;

  TermReference n_22;

  TermReference o_22;

  TermReference p_22;

  TermReference q_22;

  TermReference j_22;

  TermReference k_22;

  TermReference l_22;

  TermReference m_22;

  TermReference i_22;

  TermReference w_22;

  TermReference x_22;

  TermReference y_22;

  TermReference z_22;

  TermReference s_22;

  TermReference t_22;

  TermReference u_22;

  TermReference v_22;

  TermReference r_22;

  TermReference e_23;

  TermReference f_23;

  TermReference g_23;

  TermReference b_23;

  TermReference c_23;

  TermReference d_23;

  TermReference a_23;

  TermReference r_23;

  TermReference s_23;

  TermReference t_23;

  TermReference o_23;

  TermReference p_23;

  TermReference q_23;

  TermReference z_23;

  TermReference a_24;

  TermReference b_24;

  TermReference w_23;

  TermReference x_23;

  TermReference y_23;

  TermReference v_23;

  TermReference u_23;

  TermReference g_24;

  TermReference h_24;

  TermReference i_24;

  TermReference j_24;

  TermReference c_24;

  TermReference d_24;

  TermReference e_24;

  TermReference f_24;

  TermReference u_21;

  TermReference n_23;

  TermReference v_21;

  TermReference t_21;

  TermReference w_21;

  TermReference x_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28:
    { 
      IStrategoTerm k_24 = null;
      IStrategoTerm l_24 = null;
      IStrategoTerm n_24 = null;
      IStrategoTerm o_24 = null;
      IStrategoTerm p_24 = null;
      IStrategoTerm w_24 = null;
      IStrategoTerm x_24 = null;
      IStrategoTerm y_24 = null;
      IStrategoTerm a_25 = null;
      IStrategoTerm b_25 = null;
      IStrategoTerm c_25 = null;
      IStrategoTerm d_25 = null;
      IStrategoTerm e_25 = null;
      IStrategoTerm g_25 = null;
      IStrategoTerm h_25 = null;
      IStrategoTerm i_25 = null;
      IStrategoTerm j_25 = null;
      if(b_22.value == null)
        break Fail28;
      term = b_22.value;
      if(i_22.value == null)
        i_22.value = term;
      else
        if(i_22.value != term && !i_22.value.match(term))
          break Fail28;
      if(t_21.value == null)
        break Fail28;
      term = t_21.value;
      if(n_22.value == null)
        n_22.value = term;
      else
        if(n_22.value != term && !n_22.value.match(term))
          break Fail28;
      term = dynamic.const0;
      if(j_22.value == null)
        j_22.value = term;
      else
        if(j_22.value != term && !j_22.value.match(term))
          break Fail28;
      if(n_22.value == null)
        break Fail28;
      term = n_22.value;
      if(o_22.value == null)
        o_22.value = term;
      else
        if(o_22.value != term && !o_22.value.match(term))
          break Fail28;
      term = dynamic.const91;
      if(k_22.value == null)
        k_22.value = term;
      else
        if(k_22.value != term && !k_22.value.match(term))
          break Fail28;
      if(o_22.value == null)
        break Fail28;
      term = o_22.value;
      if(p_22.value == null)
        p_22.value = term;
      else
        if(p_22.value != term && !p_22.value.match(term))
          break Fail28;
      term = dynamic.const80;
      if(l_22.value == null)
        l_22.value = term;
      else
        if(l_22.value != term && !l_22.value.match(term))
          break Fail28;
      if(p_22.value == null)
        break Fail28;
      term = p_22.value;
      if(q_22.value == null)
        q_22.value = term;
      else
        if(q_22.value != term && !q_22.value.match(term))
          break Fail28;
      term = dynamic.constLocationInfo53;
      if(m_22.value == null)
        m_22.value = term;
      else
        if(m_22.value != term && !m_22.value.match(term))
          break Fail28;
      if(q_22.value == null)
        break Fail28;
      term = s_var_0_4.instance.invoke(context, q_22.value, j_22.value, k_22.value, l_22.value, m_22.value);
      if(term == null)
        break Fail28;
      if(i_22.value == null)
        break Fail28;
      term = i_22.value;
      if(r_22.value == null)
        r_22.value = term;
      else
        if(r_22.value != term && !r_22.value.match(term))
          break Fail28;
      if(v_21.value == null)
        break Fail28;
      term = v_21.value;
      if(w_22.value == null)
        w_22.value = term;
      else
        if(w_22.value != term && !w_22.value.match(term))
          break Fail28;
      term = dynamic.const0;
      if(s_22.value == null)
        s_22.value = term;
      else
        if(s_22.value != term && !s_22.value.match(term))
          break Fail28;
      if(w_22.value == null)
        break Fail28;
      term = w_22.value;
      if(x_22.value == null)
        x_22.value = term;
      else
        if(x_22.value != term && !x_22.value.match(term))
          break Fail28;
      term = dynamic.const91;
      if(t_22.value == null)
        t_22.value = term;
      else
        if(t_22.value != term && !t_22.value.match(term))
          break Fail28;
      if(x_22.value == null)
        break Fail28;
      term = x_22.value;
      if(y_22.value == null)
        y_22.value = term;
      else
        if(y_22.value != term && !y_22.value.match(term))
          break Fail28;
      term = dynamic.const35;
      if(u_22.value == null)
        u_22.value = term;
      else
        if(u_22.value != term && !u_22.value.match(term))
          break Fail28;
      if(y_22.value == null)
        break Fail28;
      term = y_22.value;
      if(z_22.value == null)
        z_22.value = term;
      else
        if(z_22.value != term && !z_22.value.match(term))
          break Fail28;
      term = dynamic.constLocationInfo54;
      if(v_22.value == null)
        v_22.value = term;
      else
        if(v_22.value != term && !v_22.value.match(term))
          break Fail28;
      if(z_22.value == null)
        break Fail28;
      term = s_var_0_4.instance.invoke(context, z_22.value, s_22.value, t_22.value, u_22.value, v_22.value);
      if(term == null)
        break Fail28;
      if(r_22.value == null)
        break Fail28;
      term = r_22.value;
      if(a_23.value == null)
        a_23.value = term;
      else
        if(a_23.value != term && !a_23.value.match(term))
          break Fail28;
      if(t_21.value == null)
        break Fail28;
      term = t_21.value;
      if(e_23.value == null)
        e_23.value = term;
      else
        if(e_23.value != term && !e_23.value.match(term))
          break Fail28;
      term = dynamic.const0;
      if(b_23.value == null)
        b_23.value = term;
      else
        if(b_23.value != term && !b_23.value.match(term))
          break Fail28;
      if(e_23.value == null)
        break Fail28;
      term = e_23.value;
      if(f_23.value == null)
        f_23.value = term;
      else
        if(f_23.value != term && !f_23.value.match(term))
          break Fail28;
      term = dynamic.const91;
      if(c_23.value == null)
        c_23.value = term;
      else
        if(c_23.value != term && !c_23.value.match(term))
          break Fail28;
      if(f_23.value == null)
        break Fail28;
      term = f_23.value;
      if(g_23.value == null)
        g_23.value = term;
      else
        if(g_23.value != term && !g_23.value.match(term))
          break Fail28;
      term = dynamic.constLocationInfo55;
      if(d_23.value == null)
        d_23.value = term;
      else
        if(d_23.value != term && !d_23.value.match(term))
          break Fail28;
      if(g_23.value == null)
        break Fail28;
      term = s_step_0_3.instance.invoke(context, g_23.value, b_23.value, c_23.value, d_23.value);
      if(term == null)
        break Fail28;
      term = debug_1_0.instance.invoke(context, term, lifted4.instance);
      if(term == null)
        break Fail28;
      if(a_23.value == null)
        break Fail28;
      term = a_23.value;
      if(n_23.value == null)
        n_23.value = term;
      else
        if(n_23.value != term && !n_23.value.match(term))
          break Fail28;
      if(r_23.value == null)
        r_23.value = term;
      else
        if(r_23.value != term && !r_23.value.match(term))
          break Fail28;
      term = dynamic.const0;
      if(o_23.value == null)
        o_23.value = term;
      else
        if(o_23.value != term && !o_23.value.match(term))
          break Fail28;
      if(r_23.value == null)
        break Fail28;
      term = r_23.value;
      if(s_23.value == null)
        s_23.value = term;
      else
        if(s_23.value != term && !s_23.value.match(term))
          break Fail28;
      term = dynamic.const91;
      if(p_23.value == null)
        p_23.value = term;
      else
        if(p_23.value != term && !p_23.value.match(term))
          break Fail28;
      if(s_23.value == null)
        break Fail28;
      term = s_23.value;
      if(t_23.value == null)
        t_23.value = term;
      else
        if(t_23.value != term && !t_23.value.match(term))
          break Fail28;
      term = dynamic.constLocationInfo57;
      if(q_23.value == null)
        q_23.value = term;
      else
        if(q_23.value != term && !q_23.value.match(term))
          break Fail28;
      if(t_23.value == null)
        break Fail28;
      term = s_step_0_3.instance.invoke(context, t_23.value, o_23.value, p_23.value, q_23.value);
      if(term == null)
        break Fail28;
      if(v_23.value == null)
        v_23.value = term;
      else
        if(v_23.value != term && !v_23.value.match(term))
          break Fail28;
      if(z_23.value == null)
        z_23.value = term;
      else
        if(z_23.value != term && !z_23.value.match(term))
          break Fail28;
      term = dynamic.const0;
      if(w_23.value == null)
        w_23.value = term;
      else
        if(w_23.value != term && !w_23.value.match(term))
          break Fail28;
      if(z_23.value == null)
        break Fail28;
      term = z_23.value;
      if(a_24.value == null)
        a_24.value = term;
      else
        if(a_24.value != term && !a_24.value.match(term))
          break Fail28;
      term = dynamic.const91;
      if(x_23.value == null)
        x_23.value = term;
      else
        if(x_23.value != term && !x_23.value.match(term))
          break Fail28;
      if(a_24.value == null)
        break Fail28;
      term = a_24.value;
      if(b_24.value == null)
        b_24.value = term;
      else
        if(b_24.value != term && !b_24.value.match(term))
          break Fail28;
      term = dynamic.constLocationInfo58;
      if(y_23.value == null)
        y_23.value = term;
      else
        if(y_23.value != term && !y_23.value.match(term))
          break Fail28;
      if(b_24.value == null)
        break Fail28;
      term = s_step_0_3.instance.invoke(context, b_24.value, w_23.value, x_23.value, y_23.value);
      if(term == null)
        break Fail28;
      term = get_current_name_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail28;
      if(u_23.value == null)
        u_23.value = term;
      else
        if(u_23.value != term && !u_23.value.match(term))
          break Fail28;
      if(v_23.value == null)
        break Fail28;
      term = v_23.value;
      if(u_23.value == null)
        break Fail28;
      term = u_23.value;
      if(u_21.value == null)
        u_21.value = term;
      else
        if(u_21.value != term && !u_21.value.match(term))
          break Fail28;
      if(u_21.value == null)
        break Fail28;
      term = u_21.value;
      if(g_24.value == null)
        g_24.value = term;
      else
        if(g_24.value != term && !g_24.value.match(term))
          break Fail28;
      term = dynamic.const0;
      if(c_24.value == null)
        c_24.value = term;
      else
        if(c_24.value != term && !c_24.value.match(term))
          break Fail28;
      if(g_24.value == null)
        break Fail28;
      term = g_24.value;
      if(h_24.value == null)
        h_24.value = term;
      else
        if(h_24.value != term && !h_24.value.match(term))
          break Fail28;
      term = dynamic.const91;
      if(d_24.value == null)
        d_24.value = term;
      else
        if(d_24.value != term && !d_24.value.match(term))
          break Fail28;
      if(h_24.value == null)
        break Fail28;
      term = h_24.value;
      if(i_24.value == null)
        i_24.value = term;
      else
        if(i_24.value != term && !i_24.value.match(term))
          break Fail28;
      term = dynamic.const86;
      if(e_24.value == null)
        e_24.value = term;
      else
        if(e_24.value != term && !e_24.value.match(term))
          break Fail28;
      if(i_24.value == null)
        break Fail28;
      term = i_24.value;
      if(j_24.value == null)
        j_24.value = term;
      else
        if(j_24.value != term && !j_24.value.match(term))
          break Fail28;
      term = dynamic.constLocationInfo59;
      if(f_24.value == null)
        f_24.value = term;
      else
        if(f_24.value != term && !f_24.value.match(term))
          break Fail28;
      if(j_24.value == null)
        break Fail28;
      term = s_var_0_4.instance.invoke(context, j_24.value, c_24.value, d_24.value, e_24.value, f_24.value);
      if(term == null)
        break Fail28;
      if(u_21.value == null)
        break Fail28;
      n_24 = u_21.value;
      k_24 = dynamic.const0;
      o_24 = n_24;
      l_24 = dynamic.const91;
      p_24 = o_24;
      term = s_step_0_3.instance.invoke(context, p_24, k_24, l_24, dynamic.constLocationInfo61);
      if(term == null)
        break Fail28;
      term = debug_1_0.instance.invoke(context, term, lifted5.instance);
      if(term == null)
        break Fail28;
      if(n_23.value == null)
        break Fail28;
      term = n_23.value;
      w_24 = n_23.value;
      a_25 = term;
      x_24 = dynamic.const0;
      b_25 = a_25;
      y_24 = dynamic.const91;
      c_25 = b_25;
      term = s_step_0_3.instance.invoke(context, c_25, x_24, y_24, dynamic.constLocationInfo62);
      if(term == null)
        break Fail28;
      g_25 = term;
      d_25 = dynamic.const103;
      h_25 = g_25;
      e_25 = dynamic.constCons0;
      i_25 = h_25;
      term = dr_set_rule_0_3.instance.invoke(context, i_25, d_25, e_25, dynamic.const104);
      if(term == null)
        break Fail28;
      term = w_24;
      j_25 = w_24;
      IStrategoTerm term7 = term;
      Success11:
      { 
        Fail29:
        { 
          IStrategoTerm k_25 = null;
          IStrategoTerm l_25 = null;
          IStrategoTerm n_25 = null;
          IStrategoTerm o_25 = null;
          IStrategoTerm p_25 = null;
          IStrategoTerm q_25 = null;
          IStrategoTerm r_25 = null;
          IStrategoTerm t_25 = null;
          IStrategoTerm u_25 = null;
          IStrategoTerm v_25 = null;
          IStrategoTerm c_26 = null;
          IStrategoTerm d_26 = null;
          IStrategoTerm e_26 = null;
          IStrategoTerm g_26 = null;
          IStrategoTerm h_26 = null;
          IStrategoTerm i_26 = null;
          IStrategoTerm j_26 = null;
          IStrategoTerm k_26 = null;
          IStrategoTerm l_26 = null;
          IStrategoTerm n_26 = null;
          IStrategoTerm o_26 = null;
          IStrategoTerm p_26 = null;
          IStrategoTerm q_26 = null;
          IStrategoTerm r_26 = null;
          IStrategoTerm t_26 = null;
          IStrategoTerm u_26 = null;
          IStrategoTerm v_26 = null;
          IStrategoTerm c_27 = null;
          IStrategoTerm d_27 = null;
          IStrategoTerm f_27 = null;
          IStrategoTerm g_27 = null;
          IStrategoTerm h_27 = null;
          IStrategoTerm i_27 = null;
          IStrategoTerm j_27 = null;
          IStrategoTerm k_27 = null;
          IStrategoTerm m_27 = null;
          IStrategoTerm n_27 = null;
          IStrategoTerm o_27 = null;
          IStrategoTerm p_27 = null;
          n_25 = term;
          k_25 = dynamic.const0;
          o_25 = n_25;
          l_25 = dynamic.const91;
          p_25 = o_25;
          term = s_step_0_3.instance.invoke(context, p_25, k_25, l_25, dynamic.constLocationInfo63);
          if(term == null)
            break Fail29;
          if(v_21.value == null)
            break Fail29;
          t_25 = v_21.value;
          q_25 = dynamic.const0;
          u_25 = t_25;
          r_25 = dynamic.const91;
          v_25 = u_25;
          term = s_step_0_3.instance.invoke(context, v_25, q_25, r_25, dynamic.constLocationInfo64);
          if(term == null)
            break Fail29;
          lifted6 lifted60 = new lifted6();
          lifted60.t_21 = t_21;
          term = filter_1_0.instance.invoke(context, term, lifted60);
          if(term == null)
            break Fail29;
          if(w_21.value == null)
            w_21.value = term;
          else
            if(w_21.value != term && !w_21.value.match(term))
              break Fail29;
          if(w_21.value == null)
            break Fail29;
          g_26 = w_21.value;
          c_26 = dynamic.const0;
          h_26 = g_26;
          d_26 = dynamic.const91;
          i_26 = h_26;
          e_26 = dynamic.const107;
          j_26 = i_26;
          term = s_var_0_4.instance.invoke(context, j_26, c_26, d_26, e_26, dynamic.constLocationInfo66);
          if(term == null)
            break Fail29;
          n_26 = term;
          k_26 = dynamic.const0;
          o_26 = n_26;
          l_26 = dynamic.const91;
          p_26 = o_26;
          term = s_step_0_3.instance.invoke(context, p_26, k_26, l_26, dynamic.constLocationInfo67);
          if(term == null)
            break Fail29;
          if(w_21.value == null)
            break Fail29;
          t_26 = w_21.value;
          q_26 = dynamic.const0;
          u_26 = t_26;
          r_26 = dynamic.const91;
          v_26 = u_26;
          term = s_step_0_3.instance.invoke(context, v_26, q_26, r_26, dynamic.constLocationInfo68);
          if(term == null)
            break Fail29;
          term = debug_1_0.instance.invoke(context, term, lifted7.instance);
          if(term == null)
            break Fail29;
          f_27 = term;
          c_27 = dynamic.const0;
          g_27 = f_27;
          d_27 = dynamic.const91;
          h_27 = g_27;
          term = s_step_0_3.instance.invoke(context, h_27, c_27, d_27, dynamic.constLocationInfo70);
          if(term == null)
            break Fail29;
          term = first_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail29;
          if(x_21.value == null)
            x_21.value = term;
          else
            if(x_21.value != term && !x_21.value.match(term))
              break Fail29;
          if(x_21.value == null)
            break Fail29;
          m_27 = x_21.value;
          i_27 = dynamic.const0;
          n_27 = m_27;
          j_27 = dynamic.const91;
          o_27 = n_27;
          k_27 = dynamic.const111;
          p_27 = o_27;
          term = s_var_0_4.instance.invoke(context, p_27, i_27, j_27, k_27, dynamic.constLocationInfo71);
          if(term == null)
            break Fail29;
          if(true)
            break Success11;
        }
        term = term7;
        IStrategoTerm z_21 = null;
        IStrategoTerm a_22 = null;
        IStrategoTerm r_27 = null;
        z_21 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail28;
        a_22 = term;
        r_27 = z_21;
        term = report_with_failure_0_2.instance.invoke(context, r_27, dynamic.const112, a_22);
        if(term == null)
          break Fail28;
      }
      term = j_25;
      IStrategoTerm s_27 = null;
      IStrategoTerm t_27 = null;
      IStrategoTerm v_27 = null;
      IStrategoTerm w_27 = null;
      IStrategoTerm x_27 = null;
      if(x_21.value == null)
        break Fail28;
      v_27 = x_21.value;
      s_27 = dynamic.const0;
      w_27 = v_27;
      t_27 = dynamic.const91;
      x_27 = w_27;
      term = r_exit_0_3.instance.invoke(context, x_27, s_27, t_27, dynamic.constLocationInfo72);
      if(term == null)
        break Fail28;
      if(true)
        return term;
    }
    return null;
  }
}