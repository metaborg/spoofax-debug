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

@SuppressWarnings("all") final class wrap_r_0_3_fragment_0 extends Strategy 
{ 
  TermReference o_1145;

  TermReference p_1145;

  TermReference q_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail455:
    { 
      IStrategoTerm term277 = term;
      IStrategoConstructor cons19 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success219:
      { 
        if(cons19 == transformer_debug._consRuleNoCond_2)
        { 
          Fail456:
          { 
            IStrategoTerm o_1015 = null;
            IStrategoTerm p_1015 = null;
            IStrategoTerm q_1015 = null;
            IStrategoTerm r_1015 = null;
            IStrategoTerm s_1015 = null;
            IStrategoTerm t_1015 = null;
            IStrategoTerm u_1015 = null;
            IStrategoTerm w_1015 = null;
            IStrategoTerm x_1015 = null;
            IStrategoTerm y_1015 = null;
            IStrategoTerm z_1015 = null;
            IStrategoTerm a_1016 = null;
            IStrategoTerm b_1016 = null;
            IStrategoTerm c_1016 = null;
            IStrategoTerm e_1016 = null;
            IStrategoTerm f_1016 = null;
            IStrategoTerm g_1016 = null;
            IStrategoTerm h_1016 = null;
            IStrategoTerm i_1016 = null;
            IStrategoTerm j_1016 = null;
            IStrategoTerm k_1016 = null;
            IStrategoTerm m_1016 = null;
            IStrategoTerm n_1016 = null;
            IStrategoTerm o_1016 = null;
            IStrategoTerm p_1016 = null;
            IStrategoTerm q_1016 = null;
            IStrategoTerm r_1016 = null;
            IStrategoTerm s_1016 = null;
            IStrategoTerm u_1016 = null;
            IStrategoTerm v_1016 = null;
            IStrategoTerm w_1016 = null;
            IStrategoTerm x_1016 = null;
            IStrategoTerm y_1016 = null;
            IStrategoTerm z_1016 = null;
            IStrategoTerm a_1017 = null;
            IStrategoTerm b_1017 = null;
            IStrategoTerm d_1017 = null;
            IStrategoTerm e_1017 = null;
            IStrategoTerm f_1017 = null;
            IStrategoTerm g_1017 = null;
            IStrategoTerm h_1017 = null;
            IStrategoTerm i_1017 = null;
            IStrategoTerm j_1017 = null;
            IStrategoTerm l_1017 = null;
            IStrategoTerm m_1017 = null;
            IStrategoTerm n_1017 = null;
            IStrategoTerm o_1017 = null;
            IStrategoTerm q_1017 = null;
            IStrategoTerm r_1017 = null;
            IStrategoTerm t_1017 = null;
            IStrategoTerm u_1017 = null;
            IStrategoTerm v_1017 = null;
            IStrategoTerm w_1017 = null;
            IStrategoTerm y_1017 = null;
            IStrategoTerm z_1017 = null;
            IStrategoTerm b_1018 = null;
            IStrategoTerm c_1018 = null;
            IStrategoTerm d_1018 = null;
            IStrategoTerm e_1018 = null;
            IStrategoTerm f_1018 = null;
            IStrategoTerm g_1018 = null;
            IStrategoTerm i_1018 = null;
            IStrategoTerm j_1018 = null;
            IStrategoTerm k_1018 = null;
            IStrategoTerm l_1018 = null;
            IStrategoTerm m_1018 = null;
            IStrategoTerm n_1018 = null;
            IStrategoTerm p_1018 = null;
            IStrategoTerm q_1018 = null;
            IStrategoTerm r_1018 = null;
            IStrategoTerm u_1018 = null;
            IStrategoTerm v_1018 = null;
            IStrategoTerm x_1018 = null;
            IStrategoTerm y_1018 = null;
            IStrategoTerm z_1018 = null;
            IStrategoTerm a_1019 = null;
            IStrategoTerm b_1019 = null;
            IStrategoTerm c_1019 = null;
            IStrategoTerm e_1019 = null;
            IStrategoTerm f_1019 = null;
            IStrategoTerm g_1019 = null;
            IStrategoTerm h_1019 = null;
            o_1015 = term.getSubterm(0);
            q_1015 = term.getSubterm(1);
            s_1015 = term;
            w_1015 = term;
            t_1015 = transformer_debug.const513;
            x_1015 = w_1015;
            u_1015 = transformer_debug.const533;
            y_1015 = x_1015;
            term = r_enter_0_3.instance.invoke(context, y_1015, t_1015, u_1015, transformer_debug.constLocationInfo999);
            if(term == null)
              break Fail456;
            term = s_1015;
            z_1015 = s_1015;
            if(o_1145.value == null)
              break Fail456;
            e_1016 = o_1145.value;
            a_1016 = transformer_debug.const513;
            f_1016 = e_1016;
            b_1016 = transformer_debug.const533;
            g_1016 = f_1016;
            c_1016 = transformer_debug.const238;
            h_1016 = g_1016;
            term = s_var_0_4.instance.invoke(context, h_1016, a_1016, b_1016, c_1016, transformer_debug.constLocationInfo1000);
            if(term == null)
              break Fail456;
            if(p_1145.value == null)
              break Fail456;
            m_1016 = p_1145.value;
            i_1016 = transformer_debug.const513;
            n_1016 = m_1016;
            j_1016 = transformer_debug.const533;
            o_1016 = n_1016;
            k_1016 = transformer_debug.const287;
            p_1016 = o_1016;
            term = s_var_0_4.instance.invoke(context, p_1016, i_1016, j_1016, k_1016, transformer_debug.constLocationInfo1001);
            if(term == null)
              break Fail456;
            if(q_1145.value == null)
              break Fail456;
            u_1016 = q_1145.value;
            q_1016 = transformer_debug.const513;
            v_1016 = u_1016;
            r_1016 = transformer_debug.const533;
            w_1016 = v_1016;
            s_1016 = transformer_debug.const235;
            x_1016 = w_1016;
            term = s_var_0_4.instance.invoke(context, x_1016, q_1016, r_1016, s_1016, transformer_debug.constLocationInfo1002);
            if(term == null)
              break Fail456;
            y_1016 = z_1015;
            d_1017 = o_1015;
            z_1016 = transformer_debug.const513;
            e_1017 = d_1017;
            a_1017 = transformer_debug.const533;
            f_1017 = e_1017;
            b_1017 = transformer_debug.const240;
            g_1017 = f_1017;
            term = s_var_0_4.instance.invoke(context, g_1017, z_1016, a_1017, b_1017, transformer_debug.constLocationInfo1003);
            if(term == null)
              break Fail456;
            l_1017 = q_1015;
            h_1017 = transformer_debug.const513;
            m_1017 = l_1017;
            i_1017 = transformer_debug.const533;
            n_1017 = m_1017;
            j_1017 = transformer_debug.const298;
            o_1017 = n_1017;
            term = s_var_0_4.instance.invoke(context, o_1017, h_1017, i_1017, j_1017, transformer_debug.constLocationInfo1004);
            if(term == null)
              break Fail456;
            term = y_1016;
            t_1017 = term;
            q_1017 = transformer_debug.const513;
            u_1017 = t_1017;
            r_1017 = transformer_debug.const533;
            v_1017 = u_1017;
            term = s_step_0_3.instance.invoke(context, v_1017, q_1017, r_1017, transformer_debug.constLocationInfo1005);
            if(term == null)
              break Fail456;
            b_1018 = term;
            y_1017 = transformer_debug.const513;
            c_1018 = b_1018;
            z_1017 = transformer_debug.const533;
            d_1018 = c_1018;
            term = s_step_0_3.instance.invoke(context, d_1018, y_1017, z_1017, transformer_debug.constLocationInfo1006);
            if(term == null)
              break Fail456;
            term = create_r_enter_call_0_3.instance.invoke(context, term, o_1145.value, p_1145.value, q_1145.value);
            if(term == null)
              break Fail456;
            w_1017 = term;
            p_1015 = term;
            i_1018 = w_1017;
            e_1018 = transformer_debug.const513;
            j_1018 = i_1018;
            f_1018 = transformer_debug.const533;
            k_1018 = j_1018;
            g_1018 = transformer_debug.const535;
            l_1018 = k_1018;
            term = s_var_0_4.instance.invoke(context, l_1018, e_1018, f_1018, g_1018, transformer_debug.constLocationInfo1007);
            if(term == null)
              break Fail456;
            p_1018 = term;
            m_1018 = transformer_debug.const513;
            q_1018 = p_1018;
            n_1018 = transformer_debug.const533;
            r_1018 = q_1018;
            term = s_step_0_3.instance.invoke(context, r_1018, m_1018, n_1018, transformer_debug.constLocationInfo1008);
            if(term == null)
              break Fail456;
            x_1018 = term;
            u_1018 = transformer_debug.const513;
            y_1018 = x_1018;
            v_1018 = transformer_debug.const533;
            z_1018 = y_1018;
            term = s_step_0_3.instance.invoke(context, z_1018, u_1018, v_1018, transformer_debug.constLocationInfo1009);
            if(term == null)
              break Fail456;
            term = create_r_exit_call_0_3.instance.invoke(context, term, o_1145.value, p_1145.value, q_1145.value);
            if(term == null)
              break Fail456;
            term = termFactory.makeAppl(transformer_debug._consApp_2, new IStrategoTerm[]{term, q_1015});
            r_1015 = term;
            e_1019 = term;
            a_1019 = transformer_debug.const513;
            f_1019 = e_1019;
            b_1019 = transformer_debug.const533;
            g_1019 = f_1019;
            c_1019 = transformer_debug.const299;
            h_1019 = g_1019;
            term = s_var_0_4.instance.invoke(context, h_1019, a_1019, b_1019, c_1019, transformer_debug.constLocationInfo1010);
            if(term == null)
              break Fail456;
            IStrategoTerm i_1019 = null;
            IStrategoTerm j_1019 = null;
            IStrategoTerm l_1019 = null;
            IStrategoTerm m_1019 = null;
            IStrategoTerm n_1019 = null;
            term = termFactory.makeAppl(transformer_debug._consRule_3, new IStrategoTerm[]{o_1015, r_1015, p_1015});
            l_1019 = term;
            i_1019 = transformer_debug.const513;
            m_1019 = l_1019;
            j_1019 = transformer_debug.const533;
            n_1019 = m_1019;
            term = r_exit_0_3.instance.invoke(context, n_1019, i_1019, j_1019, transformer_debug.constLocationInfo999);
            if(term == null)
              break Fail456;
            if(true)
              break Success219;
          }
          term = term277;
        }
        if(cons19 == transformer_debug._consRule_3)
        { 
          IStrategoTerm e_1011 = null;
          IStrategoTerm f_1011 = null;
          IStrategoTerm g_1011 = null;
          IStrategoTerm h_1011 = null;
          IStrategoTerm i_1011 = null;
          IStrategoTerm j_1011 = null;
          IStrategoTerm k_1011 = null;
          IStrategoTerm l_1011 = null;
          IStrategoTerm n_1011 = null;
          IStrategoTerm o_1011 = null;
          IStrategoTerm p_1011 = null;
          IStrategoTerm q_1011 = null;
          IStrategoTerm r_1011 = null;
          IStrategoTerm s_1011 = null;
          IStrategoTerm t_1011 = null;
          IStrategoTerm v_1011 = null;
          IStrategoTerm w_1011 = null;
          IStrategoTerm x_1011 = null;
          IStrategoTerm y_1011 = null;
          IStrategoTerm z_1011 = null;
          IStrategoTerm a_1012 = null;
          IStrategoTerm b_1012 = null;
          IStrategoTerm d_1012 = null;
          IStrategoTerm e_1012 = null;
          IStrategoTerm f_1012 = null;
          IStrategoTerm g_1012 = null;
          IStrategoTerm h_1012 = null;
          IStrategoTerm i_1012 = null;
          IStrategoTerm j_1012 = null;
          IStrategoTerm l_1012 = null;
          IStrategoTerm m_1012 = null;
          IStrategoTerm n_1012 = null;
          IStrategoTerm o_1012 = null;
          IStrategoTerm p_1012 = null;
          IStrategoTerm q_1012 = null;
          IStrategoTerm r_1012 = null;
          IStrategoTerm s_1012 = null;
          IStrategoTerm u_1012 = null;
          IStrategoTerm v_1012 = null;
          IStrategoTerm w_1012 = null;
          IStrategoTerm x_1012 = null;
          IStrategoTerm y_1012 = null;
          IStrategoTerm z_1012 = null;
          IStrategoTerm a_1013 = null;
          IStrategoTerm c_1013 = null;
          IStrategoTerm d_1013 = null;
          IStrategoTerm e_1013 = null;
          IStrategoTerm f_1013 = null;
          IStrategoTerm g_1013 = null;
          IStrategoTerm h_1013 = null;
          IStrategoTerm i_1013 = null;
          IStrategoTerm k_1013 = null;
          IStrategoTerm l_1013 = null;
          IStrategoTerm m_1013 = null;
          IStrategoTerm n_1013 = null;
          IStrategoTerm p_1013 = null;
          IStrategoTerm q_1013 = null;
          IStrategoTerm s_1013 = null;
          IStrategoTerm t_1013 = null;
          IStrategoTerm u_1013 = null;
          IStrategoTerm v_1013 = null;
          IStrategoTerm w_1013 = null;
          IStrategoTerm y_1013 = null;
          IStrategoTerm z_1013 = null;
          IStrategoTerm a_1014 = null;
          IStrategoTerm b_1014 = null;
          IStrategoTerm c_1014 = null;
          IStrategoTerm d_1014 = null;
          IStrategoTerm f_1014 = null;
          IStrategoTerm g_1014 = null;
          IStrategoTerm h_1014 = null;
          IStrategoTerm i_1014 = null;
          IStrategoTerm j_1014 = null;
          IStrategoTerm k_1014 = null;
          IStrategoTerm m_1014 = null;
          IStrategoTerm n_1014 = null;
          IStrategoTerm o_1014 = null;
          IStrategoTerm r_1014 = null;
          IStrategoTerm s_1014 = null;
          IStrategoTerm u_1014 = null;
          IStrategoTerm v_1014 = null;
          IStrategoTerm w_1014 = null;
          IStrategoTerm x_1014 = null;
          IStrategoTerm y_1014 = null;
          IStrategoTerm z_1014 = null;
          IStrategoTerm b_1015 = null;
          IStrategoTerm c_1015 = null;
          IStrategoTerm d_1015 = null;
          IStrategoTerm e_1015 = null;
          e_1011 = term.getSubterm(0);
          h_1011 = term.getSubterm(1);
          f_1011 = term.getSubterm(2);
          j_1011 = term;
          n_1011 = term;
          k_1011 = transformer_debug.const513;
          o_1011 = n_1011;
          l_1011 = transformer_debug.const533;
          p_1011 = o_1011;
          term = r_enter_0_3.instance.invoke(context, p_1011, k_1011, l_1011, transformer_debug.constLocationInfo1011);
          if(term == null)
            break Fail455;
          term = j_1011;
          q_1011 = j_1011;
          if(o_1145.value == null)
            break Fail455;
          v_1011 = o_1145.value;
          r_1011 = transformer_debug.const513;
          w_1011 = v_1011;
          s_1011 = transformer_debug.const533;
          x_1011 = w_1011;
          t_1011 = transformer_debug.const238;
          y_1011 = x_1011;
          term = s_var_0_4.instance.invoke(context, y_1011, r_1011, s_1011, t_1011, transformer_debug.constLocationInfo1012);
          if(term == null)
            break Fail455;
          if(p_1145.value == null)
            break Fail455;
          d_1012 = p_1145.value;
          z_1011 = transformer_debug.const513;
          e_1012 = d_1012;
          a_1012 = transformer_debug.const533;
          f_1012 = e_1012;
          b_1012 = transformer_debug.const287;
          g_1012 = f_1012;
          term = s_var_0_4.instance.invoke(context, g_1012, z_1011, a_1012, b_1012, transformer_debug.constLocationInfo1013);
          if(term == null)
            break Fail455;
          if(q_1145.value == null)
            break Fail455;
          l_1012 = q_1145.value;
          h_1012 = transformer_debug.const513;
          m_1012 = l_1012;
          i_1012 = transformer_debug.const533;
          n_1012 = m_1012;
          j_1012 = transformer_debug.const235;
          o_1012 = n_1012;
          term = s_var_0_4.instance.invoke(context, o_1012, h_1012, i_1012, j_1012, transformer_debug.constLocationInfo1014);
          if(term == null)
            break Fail455;
          p_1012 = q_1011;
          u_1012 = e_1011;
          q_1012 = transformer_debug.const513;
          v_1012 = u_1012;
          r_1012 = transformer_debug.const533;
          w_1012 = v_1012;
          s_1012 = transformer_debug.const240;
          x_1012 = w_1012;
          term = s_var_0_4.instance.invoke(context, x_1012, q_1012, r_1012, s_1012, transformer_debug.constLocationInfo1015);
          if(term == null)
            break Fail455;
          c_1013 = h_1011;
          y_1012 = transformer_debug.const513;
          d_1013 = c_1013;
          z_1012 = transformer_debug.const533;
          e_1013 = d_1013;
          a_1013 = transformer_debug.const298;
          f_1013 = e_1013;
          term = s_var_0_4.instance.invoke(context, f_1013, y_1012, z_1012, a_1013, transformer_debug.constLocationInfo1016);
          if(term == null)
            break Fail455;
          k_1013 = f_1011;
          g_1013 = transformer_debug.const513;
          l_1013 = k_1013;
          h_1013 = transformer_debug.const533;
          m_1013 = l_1013;
          i_1013 = transformer_debug.const304;
          n_1013 = m_1013;
          term = s_var_0_4.instance.invoke(context, n_1013, g_1013, h_1013, i_1013, transformer_debug.constLocationInfo1017);
          if(term == null)
            break Fail455;
          term = p_1012;
          s_1013 = term;
          p_1013 = transformer_debug.const513;
          t_1013 = s_1013;
          q_1013 = transformer_debug.const533;
          u_1013 = t_1013;
          term = s_step_0_3.instance.invoke(context, u_1013, p_1013, q_1013, transformer_debug.constLocationInfo1018);
          if(term == null)
            break Fail455;
          y_1013 = f_1011;
          v_1013 = transformer_debug.const513;
          z_1013 = y_1013;
          w_1013 = transformer_debug.const533;
          a_1014 = z_1013;
          term = s_step_0_3.instance.invoke(context, a_1014, v_1013, w_1013, transformer_debug.constLocationInfo1019);
          if(term == null)
            break Fail455;
          term = add_rule_cond_0_3.instance.invoke(context, term, o_1145.value, p_1145.value, q_1145.value);
          if(term == null)
            break Fail455;
          g_1011 = term;
          f_1014 = term;
          b_1014 = transformer_debug.const513;
          g_1014 = f_1014;
          c_1014 = transformer_debug.const533;
          h_1014 = g_1014;
          d_1014 = transformer_debug.const306;
          i_1014 = h_1014;
          term = s_var_0_4.instance.invoke(context, i_1014, b_1014, c_1014, d_1014, transformer_debug.constLocationInfo1020);
          if(term == null)
            break Fail455;
          m_1014 = term;
          j_1014 = transformer_debug.const513;
          n_1014 = m_1014;
          k_1014 = transformer_debug.const533;
          o_1014 = n_1014;
          term = s_step_0_3.instance.invoke(context, o_1014, j_1014, k_1014, transformer_debug.constLocationInfo1021);
          if(term == null)
            break Fail455;
          u_1014 = term;
          r_1014 = transformer_debug.const513;
          v_1014 = u_1014;
          s_1014 = transformer_debug.const533;
          w_1014 = v_1014;
          term = s_step_0_3.instance.invoke(context, w_1014, r_1014, s_1014, transformer_debug.constLocationInfo1022);
          if(term == null)
            break Fail455;
          term = create_r_exit_call_0_3.instance.invoke(context, term, o_1145.value, p_1145.value, q_1145.value);
          if(term == null)
            break Fail455;
          term = termFactory.makeAppl(transformer_debug._consApp_2, new IStrategoTerm[]{term, h_1011});
          i_1011 = term;
          b_1015 = term;
          x_1014 = transformer_debug.const513;
          c_1015 = b_1015;
          y_1014 = transformer_debug.const533;
          d_1015 = c_1015;
          z_1014 = transformer_debug.const299;
          e_1015 = d_1015;
          term = s_var_0_4.instance.invoke(context, e_1015, x_1014, y_1014, z_1014, transformer_debug.constLocationInfo1023);
          if(term == null)
            break Fail455;
          IStrategoTerm f_1015 = null;
          IStrategoTerm g_1015 = null;
          IStrategoTerm i_1015 = null;
          IStrategoTerm j_1015 = null;
          IStrategoTerm k_1015 = null;
          term = termFactory.makeAppl(transformer_debug._consRule_3, new IStrategoTerm[]{e_1011, i_1011, g_1011});
          i_1015 = term;
          f_1015 = transformer_debug.const513;
          j_1015 = i_1015;
          g_1015 = transformer_debug.const533;
          k_1015 = j_1015;
          term = r_exit_0_3.instance.invoke(context, k_1015, f_1015, g_1015, transformer_debug.constLocationInfo1011);
          if(term == null)
            break Fail455;
        }
        else
        { 
          break Fail455;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}