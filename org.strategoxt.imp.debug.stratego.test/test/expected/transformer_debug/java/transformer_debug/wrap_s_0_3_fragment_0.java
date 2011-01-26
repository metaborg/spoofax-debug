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

@SuppressWarnings("all") final class wrap_s_0_3_fragment_0 extends Strategy 
{ 
  TermReference h_995;

  TermReference i_995;

  TermReference j_995;

  TermReference k_995;

  TermReference d_995;

  TermReference e_995;

  TermReference f_995;

  TermReference g_995;

  TermReference p_995;

  TermReference q_995;

  TermReference r_995;

  TermReference s_995;

  TermReference l_995;

  TermReference m_995;

  TermReference n_995;

  TermReference o_995;

  TermReference x_995;

  TermReference y_995;

  TermReference z_995;

  TermReference a_996;

  TermReference t_995;

  TermReference u_995;

  TermReference v_995;

  TermReference w_995;

  TermReference c_995;

  TermReference j_994;

  TermReference k_994;

  TermReference l_994;

  TermReference m_994;

  TermReference n_994;

  TermReference o_994;

  TermReference p_994;

  TermReference q_994;

  TermReference r_994;

  TermReference s_994;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail461:
    { 
      IStrategoTerm b_996 = null;
      IStrategoTerm c_996 = null;
      IStrategoTerm d_996 = null;
      IStrategoTerm e_996 = null;
      IStrategoTerm g_996 = null;
      IStrategoTerm h_996 = null;
      IStrategoTerm i_996 = null;
      IStrategoTerm j_996 = null;
      IStrategoTerm k_996 = null;
      if(c_995.value == null)
        c_995.value = term;
      else
        if(c_995.value != term && !c_995.value.match(term))
          break Fail461;
      if(j_994.value == null)
        break Fail461;
      term = j_994.value;
      if(h_995.value == null)
        h_995.value = term;
      else
        if(h_995.value != term && !h_995.value.match(term))
          break Fail461;
      term = transformer_debug.const513;
      if(d_995.value == null)
        d_995.value = term;
      else
        if(d_995.value != term && !d_995.value.match(term))
          break Fail461;
      if(h_995.value == null)
        break Fail461;
      term = h_995.value;
      if(i_995.value == null)
        i_995.value = term;
      else
        if(i_995.value != term && !i_995.value.match(term))
          break Fail461;
      term = transformer_debug.const521;
      if(e_995.value == null)
        e_995.value = term;
      else
        if(e_995.value != term && !e_995.value.match(term))
          break Fail461;
      if(i_995.value == null)
        break Fail461;
      term = i_995.value;
      if(j_995.value == null)
        j_995.value = term;
      else
        if(j_995.value != term && !j_995.value.match(term))
          break Fail461;
      term = transformer_debug.const238;
      if(f_995.value == null)
        f_995.value = term;
      else
        if(f_995.value != term && !f_995.value.match(term))
          break Fail461;
      if(j_995.value == null)
        break Fail461;
      term = j_995.value;
      if(k_995.value == null)
        k_995.value = term;
      else
        if(k_995.value != term && !k_995.value.match(term))
          break Fail461;
      term = transformer_debug.constLocationInfo952;
      if(g_995.value == null)
        g_995.value = term;
      else
        if(g_995.value != term && !g_995.value.match(term))
          break Fail461;
      if(k_995.value == null)
        break Fail461;
      term = s_var_0_4.instance.invoke(context, k_995.value, d_995.value, e_995.value, f_995.value, g_995.value);
      if(term == null)
        break Fail461;
      if(k_994.value == null)
        break Fail461;
      term = k_994.value;
      if(p_995.value == null)
        p_995.value = term;
      else
        if(p_995.value != term && !p_995.value.match(term))
          break Fail461;
      term = transformer_debug.const513;
      if(l_995.value == null)
        l_995.value = term;
      else
        if(l_995.value != term && !l_995.value.match(term))
          break Fail461;
      if(p_995.value == null)
        break Fail461;
      term = p_995.value;
      if(q_995.value == null)
        q_995.value = term;
      else
        if(q_995.value != term && !q_995.value.match(term))
          break Fail461;
      term = transformer_debug.const521;
      if(m_995.value == null)
        m_995.value = term;
      else
        if(m_995.value != term && !m_995.value.match(term))
          break Fail461;
      if(q_995.value == null)
        break Fail461;
      term = q_995.value;
      if(r_995.value == null)
        r_995.value = term;
      else
        if(r_995.value != term && !r_995.value.match(term))
          break Fail461;
      term = transformer_debug.const293;
      if(n_995.value == null)
        n_995.value = term;
      else
        if(n_995.value != term && !n_995.value.match(term))
          break Fail461;
      if(r_995.value == null)
        break Fail461;
      term = r_995.value;
      if(s_995.value == null)
        s_995.value = term;
      else
        if(s_995.value != term && !s_995.value.match(term))
          break Fail461;
      term = transformer_debug.constLocationInfo953;
      if(o_995.value == null)
        o_995.value = term;
      else
        if(o_995.value != term && !o_995.value.match(term))
          break Fail461;
      if(s_995.value == null)
        break Fail461;
      term = s_var_0_4.instance.invoke(context, s_995.value, l_995.value, m_995.value, n_995.value, o_995.value);
      if(term == null)
        break Fail461;
      if(l_994.value == null)
        break Fail461;
      term = l_994.value;
      if(x_995.value == null)
        x_995.value = term;
      else
        if(x_995.value != term && !x_995.value.match(term))
          break Fail461;
      term = transformer_debug.const513;
      if(t_995.value == null)
        t_995.value = term;
      else
        if(t_995.value != term && !t_995.value.match(term))
          break Fail461;
      if(x_995.value == null)
        break Fail461;
      term = x_995.value;
      if(y_995.value == null)
        y_995.value = term;
      else
        if(y_995.value != term && !y_995.value.match(term))
          break Fail461;
      term = transformer_debug.const521;
      if(u_995.value == null)
        u_995.value = term;
      else
        if(u_995.value != term && !u_995.value.match(term))
          break Fail461;
      if(y_995.value == null)
        break Fail461;
      term = y_995.value;
      if(z_995.value == null)
        z_995.value = term;
      else
        if(z_995.value != term && !z_995.value.match(term))
          break Fail461;
      term = transformer_debug.const235;
      if(v_995.value == null)
        v_995.value = term;
      else
        if(v_995.value != term && !v_995.value.match(term))
          break Fail461;
      if(z_995.value == null)
        break Fail461;
      term = z_995.value;
      if(a_996.value == null)
        a_996.value = term;
      else
        if(a_996.value != term && !a_996.value.match(term))
          break Fail461;
      term = transformer_debug.constLocationInfo954;
      if(w_995.value == null)
        w_995.value = term;
      else
        if(w_995.value != term && !w_995.value.match(term))
          break Fail461;
      if(a_996.value == null)
        break Fail461;
      term = s_var_0_4.instance.invoke(context, a_996.value, t_995.value, u_995.value, v_995.value, w_995.value);
      if(term == null)
        break Fail461;
      if(c_995.value == null)
        break Fail461;
      term = c_995.value;
      b_996 = c_995.value;
      if(n_994.value == null)
        break Fail461;
      g_996 = n_994.value;
      c_996 = transformer_debug.const513;
      h_996 = g_996;
      d_996 = transformer_debug.const521;
      i_996 = h_996;
      e_996 = transformer_debug.const277;
      j_996 = i_996;
      term = s_var_0_4.instance.invoke(context, j_996, c_996, d_996, e_996, transformer_debug.constLocationInfo955);
      if(term == null)
        break Fail461;
      term = b_996;
      k_996 = b_996;
      IStrategoTerm term271 = term;
      Success223:
      { 
        Fail462:
        { 
          IStrategoTerm l_996 = null;
          IStrategoTerm m_996 = null;
          IStrategoTerm o_996 = null;
          IStrategoTerm p_996 = null;
          IStrategoTerm q_996 = null;
          IStrategoTerm t_996 = null;
          IStrategoTerm u_996 = null;
          IStrategoTerm w_996 = null;
          IStrategoTerm x_996 = null;
          IStrategoTerm y_996 = null;
          IStrategoTerm z_996 = null;
          IStrategoTerm a_997 = null;
          IStrategoTerm b_997 = null;
          IStrategoTerm d_997 = null;
          IStrategoTerm e_997 = null;
          IStrategoTerm f_997 = null;
          IStrategoTerm g_997 = null;
          IStrategoTerm h_997 = null;
          IStrategoTerm i_997 = null;
          IStrategoTerm k_997 = null;
          IStrategoTerm l_997 = null;
          IStrategoTerm m_997 = null;
          IStrategoTerm p_997 = null;
          IStrategoTerm q_997 = null;
          IStrategoTerm s_997 = null;
          IStrategoTerm t_997 = null;
          IStrategoTerm u_997 = null;
          IStrategoTerm v_997 = null;
          IStrategoTerm w_997 = null;
          IStrategoTerm x_997 = null;
          IStrategoTerm z_997 = null;
          IStrategoTerm a_998 = null;
          IStrategoTerm b_998 = null;
          IStrategoTerm c_998 = null;
          IStrategoTerm d_998 = null;
          IStrategoTerm e_998 = null;
          IStrategoTerm g_998 = null;
          IStrategoTerm h_998 = null;
          IStrategoTerm i_998 = null;
          IStrategoTerm l_998 = null;
          IStrategoTerm m_998 = null;
          IStrategoTerm o_998 = null;
          IStrategoTerm p_998 = null;
          IStrategoTerm q_998 = null;
          IStrategoTerm r_998 = null;
          IStrategoTerm s_998 = null;
          IStrategoTerm t_998 = null;
          IStrategoTerm v_998 = null;
          IStrategoTerm w_998 = null;
          IStrategoTerm x_998 = null;
          IStrategoTerm y_998 = null;
          IStrategoTerm z_998 = null;
          IStrategoTerm a_999 = null;
          IStrategoTerm c_999 = null;
          IStrategoTerm d_999 = null;
          IStrategoTerm e_999 = null;
          IStrategoTerm f_999 = null;
          IStrategoTerm g_999 = null;
          IStrategoTerm h_999 = null;
          IStrategoTerm j_999 = null;
          IStrategoTerm k_999 = null;
          IStrategoTerm l_999 = null;
          IStrategoTerm m_999 = null;
          IStrategoTerm n_999 = null;
          IStrategoTerm o_999 = null;
          IStrategoTerm q_999 = null;
          IStrategoTerm r_999 = null;
          IStrategoTerm s_999 = null;
          IStrategoTerm t_999 = null;
          IStrategoTerm u_999 = null;
          IStrategoTerm v_999 = null;
          IStrategoTerm x_999 = null;
          IStrategoTerm y_999 = null;
          IStrategoTerm z_999 = null;
          IStrategoTerm a_1000 = null;
          IStrategoTerm b_1000 = null;
          IStrategoTerm c_1000 = null;
          IStrategoTerm e_1000 = null;
          IStrategoTerm f_1000 = null;
          IStrategoTerm g_1000 = null;
          IStrategoTerm h_1000 = null;
          IStrategoTerm i_1000 = null;
          IStrategoTerm j_1000 = null;
          IStrategoTerm l_1000 = null;
          IStrategoTerm m_1000 = null;
          IStrategoTerm n_1000 = null;
          IStrategoTerm o_1000 = null;
          o_996 = term;
          l_996 = transformer_debug.const513;
          p_996 = o_996;
          m_996 = transformer_debug.const521;
          q_996 = p_996;
          term = s_step_0_3.instance.invoke(context, q_996, l_996, m_996, transformer_debug.constLocationInfo956);
          if(term == null)
            break Fail462;
          w_996 = term;
          t_996 = transformer_debug.const513;
          x_996 = w_996;
          u_996 = transformer_debug.const521;
          y_996 = x_996;
          term = s_step_0_3.instance.invoke(context, y_996, t_996, u_996, transformer_debug.constLocationInfo957);
          if(term == null)
            break Fail462;
          term = create_s_enter_call_0_3.instance.invoke(context, term, j_994.value, k_994.value, l_994.value);
          if(term == null)
            break Fail462;
          if(q_994.value == null)
            q_994.value = term;
          else
            if(q_994.value != term && !q_994.value.match(term))
              break Fail462;
          if(q_994.value == null)
            break Fail462;
          d_997 = q_994.value;
          z_996 = transformer_debug.const513;
          e_997 = d_997;
          a_997 = transformer_debug.const521;
          f_997 = e_997;
          b_997 = transformer_debug.const523;
          g_997 = f_997;
          term = s_var_0_4.instance.invoke(context, g_997, z_996, a_997, b_997, transformer_debug.constLocationInfo958);
          if(term == null)
            break Fail462;
          k_997 = term;
          h_997 = transformer_debug.const513;
          l_997 = k_997;
          i_997 = transformer_debug.const521;
          m_997 = l_997;
          term = s_step_0_3.instance.invoke(context, m_997, h_997, i_997, transformer_debug.constLocationInfo959);
          if(term == null)
            break Fail462;
          s_997 = term;
          p_997 = transformer_debug.const513;
          t_997 = s_997;
          q_997 = transformer_debug.const521;
          u_997 = t_997;
          term = s_step_0_3.instance.invoke(context, u_997, p_997, q_997, transformer_debug.constLocationInfo960);
          if(term == null)
            break Fail462;
          term = create_s_exit_call_0_3.instance.invoke(context, term, j_994.value, k_994.value, l_994.value);
          if(term == null)
            break Fail462;
          if(o_994.value == null)
            o_994.value = term;
          else
            if(o_994.value != term && !o_994.value.match(term))
              break Fail462;
          if(o_994.value == null)
            break Fail462;
          z_997 = o_994.value;
          v_997 = transformer_debug.const513;
          a_998 = z_997;
          w_997 = transformer_debug.const521;
          b_998 = a_998;
          x_997 = transformer_debug.const524;
          c_998 = b_998;
          term = s_var_0_4.instance.invoke(context, c_998, v_997, w_997, x_997, transformer_debug.constLocationInfo961);
          if(term == null)
            break Fail462;
          g_998 = term;
          d_998 = transformer_debug.const513;
          h_998 = g_998;
          e_998 = transformer_debug.const521;
          i_998 = h_998;
          term = s_step_0_3.instance.invoke(context, i_998, d_998, e_998, transformer_debug.constLocationInfo962);
          if(term == null)
            break Fail462;
          o_998 = term;
          l_998 = transformer_debug.const513;
          p_998 = o_998;
          m_998 = transformer_debug.const521;
          q_998 = p_998;
          term = s_step_0_3.instance.invoke(context, q_998, l_998, m_998, transformer_debug.constLocationInfo963);
          if(term == null)
            break Fail462;
          term = create_fail_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail462;
          if(m_994.value == null)
            m_994.value = term;
          else
            if(m_994.value != term && !m_994.value.match(term))
              break Fail462;
          if(m_994.value == null)
            break Fail462;
          v_998 = m_994.value;
          r_998 = transformer_debug.const513;
          w_998 = v_998;
          s_998 = transformer_debug.const521;
          x_998 = w_998;
          t_998 = transformer_debug.const525;
          y_998 = x_998;
          term = s_var_0_4.instance.invoke(context, y_998, r_998, s_998, t_998, transformer_debug.constLocationInfo964);
          if(term == null)
            break Fail462;
          c_999 = term;
          z_998 = transformer_debug.const513;
          d_999 = c_999;
          a_999 = transformer_debug.const521;
          e_999 = d_999;
          term = s_step_0_3.instance.invoke(context, e_999, z_998, a_999, transformer_debug.constLocationInfo965);
          if(term == null)
            break Fail462;
          if(o_994.value == null || m_994.value == null)
            break Fail462;
          term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{o_994.value, m_994.value});
          if(p_994.value == null)
            p_994.value = term;
          else
            if(p_994.value != term && !p_994.value.match(term))
              break Fail462;
          if(p_994.value == null)
            break Fail462;
          j_999 = p_994.value;
          f_999 = transformer_debug.const513;
          k_999 = j_999;
          g_999 = transformer_debug.const521;
          l_999 = k_999;
          h_999 = transformer_debug.const526;
          m_999 = l_999;
          term = s_var_0_4.instance.invoke(context, m_999, f_999, g_999, h_999, transformer_debug.constLocationInfo966);
          if(term == null)
            break Fail462;
          q_999 = term;
          n_999 = transformer_debug.const513;
          r_999 = q_999;
          o_999 = transformer_debug.const521;
          s_999 = r_999;
          term = s_step_0_3.instance.invoke(context, s_999, n_999, o_999, transformer_debug.constLocationInfo967);
          if(term == null)
            break Fail462;
          if(n_994.value == null || (o_994.value == null || p_994.value == null))
            break Fail462;
          term = termFactory.makeAppl(transformer_debug._consGuardedLChoice_3, new IStrategoTerm[]{n_994.value, o_994.value, p_994.value});
          if(r_994.value == null)
            r_994.value = term;
          else
            if(r_994.value != term && !r_994.value.match(term))
              break Fail462;
          if(r_994.value == null)
            break Fail462;
          x_999 = r_994.value;
          t_999 = transformer_debug.const513;
          y_999 = x_999;
          u_999 = transformer_debug.const521;
          z_999 = y_999;
          v_999 = transformer_debug.const527;
          a_1000 = z_999;
          term = s_var_0_4.instance.invoke(context, a_1000, t_999, u_999, v_999, transformer_debug.constLocationInfo968);
          if(term == null)
            break Fail462;
          e_1000 = term;
          b_1000 = transformer_debug.const513;
          f_1000 = e_1000;
          c_1000 = transformer_debug.const521;
          g_1000 = f_1000;
          term = s_step_0_3.instance.invoke(context, g_1000, b_1000, c_1000, transformer_debug.constLocationInfo969);
          if(term == null)
            break Fail462;
          if(q_994.value == null || r_994.value == null)
            break Fail462;
          term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{q_994.value, r_994.value});
          if(s_994.value == null)
            s_994.value = term;
          else
            if(s_994.value != term && !s_994.value.match(term))
              break Fail462;
          if(s_994.value == null)
            break Fail462;
          l_1000 = s_994.value;
          h_1000 = transformer_debug.const513;
          m_1000 = l_1000;
          i_1000 = transformer_debug.const521;
          n_1000 = m_1000;
          j_1000 = transformer_debug.const528;
          o_1000 = n_1000;
          term = s_var_0_4.instance.invoke(context, o_1000, h_1000, i_1000, j_1000, transformer_debug.constLocationInfo970);
          if(term == null)
            break Fail462;
          if(true)
            break Success223;
        }
        term = term271;
        IStrategoTerm t_994 = null;
        IStrategoTerm u_994 = null;
        IStrategoTerm q_1000 = null;
        t_994 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail461;
        u_994 = term;
        q_1000 = t_994;
        term = report_with_failure_0_2.instance.invoke(context, q_1000, transformer_debug.const529, u_994);
        if(term == null)
          break Fail461;
      }
      term = k_996;
      IStrategoTerm r_1000 = null;
      IStrategoTerm s_1000 = null;
      IStrategoTerm u_1000 = null;
      IStrategoTerm v_1000 = null;
      IStrategoTerm w_1000 = null;
      if(s_994.value == null)
        break Fail461;
      u_1000 = s_994.value;
      r_1000 = transformer_debug.const513;
      v_1000 = u_1000;
      s_1000 = transformer_debug.const521;
      w_1000 = v_1000;
      term = r_exit_0_3.instance.invoke(context, w_1000, r_1000, s_1000, transformer_debug.constLocationInfo971);
      if(term == null)
        break Fail461;
      if(true)
        return term;
    }
    return null;
  }
}