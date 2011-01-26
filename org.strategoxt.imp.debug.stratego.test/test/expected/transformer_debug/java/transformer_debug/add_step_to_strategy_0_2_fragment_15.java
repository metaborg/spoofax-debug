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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_15 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail471:
    { 
      IStrategoTerm term198 = term;
      IStrategoConstructor cons22 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success227:
      { 
        if(cons22 == transformer_debug._consGenDynRules_1)
        { 
          Fail472:
          { 
            IStrategoTerm p_971 = null;
            IStrategoTerm q_971 = null;
            IStrategoTerm r_971 = null;
            IStrategoTerm s_971 = null;
            IStrategoTerm v_971 = null;
            IStrategoTerm w_971 = null;
            IStrategoTerm x_971 = null;
            IStrategoTerm z_971 = null;
            IStrategoTerm a_972 = null;
            IStrategoTerm b_972 = null;
            IStrategoTerm c_972 = null;
            IStrategoTerm d_972 = null;
            IStrategoTerm e_972 = null;
            IStrategoTerm f_972 = null;
            IStrategoTerm h_972 = null;
            IStrategoTerm i_972 = null;
            IStrategoTerm j_972 = null;
            IStrategoTerm k_972 = null;
            IStrategoTerm l_972 = null;
            IStrategoTerm m_972 = null;
            IStrategoTerm n_972 = null;
            IStrategoTerm p_972 = null;
            IStrategoTerm q_972 = null;
            IStrategoTerm r_972 = null;
            IStrategoTerm s_972 = null;
            IStrategoTerm t_972 = null;
            IStrategoTerm u_972 = null;
            IStrategoTerm v_972 = null;
            IStrategoTerm w_972 = null;
            IStrategoTerm y_972 = null;
            IStrategoTerm z_972 = null;
            IStrategoTerm a_973 = null;
            IStrategoTerm b_973 = null;
            IStrategoTerm c_973 = null;
            IStrategoTerm d_973 = null;
            IStrategoTerm e_973 = null;
            IStrategoTerm g_973 = null;
            IStrategoTerm h_973 = null;
            IStrategoTerm i_973 = null;
            IStrategoTerm j_973 = null;
            IStrategoTerm k_973 = null;
            r_971 = term;
            IStrategoList annos78 = term.getAnnotations();
            if(annos78.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos78).isEmpty())
              break Fail472;
            p_971 = ((IStrategoList)annos78).head();
            IStrategoTerm arg133 = ((IStrategoList)annos78).tail();
            if(arg133.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg133).isEmpty())
              break Fail472;
            v_971 = term;
            z_971 = term;
            w_971 = transformer_debug.const370;
            a_972 = z_971;
            x_971 = transformer_debug.const377;
            b_972 = a_972;
            term = r_enter_0_3.instance.invoke(context, b_972, w_971, x_971, transformer_debug.constLocationInfo580);
            if(term == null)
              break Fail472;
            term = v_971;
            c_972 = v_971;
            if(k_1145.value == null)
              break Fail472;
            h_972 = k_1145.value;
            d_972 = transformer_debug.const370;
            i_972 = h_972;
            e_972 = transformer_debug.const377;
            j_972 = i_972;
            f_972 = transformer_debug.const238;
            k_972 = j_972;
            term = s_var_0_4.instance.invoke(context, k_972, d_972, e_972, f_972, transformer_debug.constLocationInfo581);
            if(term == null)
              break Fail472;
            if(l_1145.value == null)
              break Fail472;
            p_972 = l_1145.value;
            l_972 = transformer_debug.const370;
            q_972 = p_972;
            m_972 = transformer_debug.const377;
            r_972 = q_972;
            n_972 = transformer_debug.const239;
            s_972 = r_972;
            term = s_var_0_4.instance.invoke(context, s_972, l_972, m_972, n_972, transformer_debug.constLocationInfo582);
            if(term == null)
              break Fail472;
            t_972 = c_972;
            y_972 = r_971;
            u_972 = transformer_debug.const370;
            z_972 = y_972;
            v_972 = transformer_debug.const377;
            a_973 = z_972;
            w_972 = transformer_debug.const277;
            b_973 = a_973;
            term = s_var_0_4.instance.invoke(context, b_973, u_972, v_972, w_972, transformer_debug.constLocationInfo583);
            if(term == null)
              break Fail472;
            g_973 = p_971;
            c_973 = transformer_debug.const370;
            h_973 = g_973;
            d_973 = transformer_debug.const377;
            i_973 = h_973;
            e_973 = transformer_debug.const381;
            j_973 = i_973;
            term = s_var_0_4.instance.invoke(context, j_973, c_973, d_973, e_973, transformer_debug.constLocationInfo584);
            if(term == null)
              break Fail472;
            term = t_972;
            k_973 = t_972;
            IStrategoTerm term199 = term;
            Success228:
            { 
              Fail473:
              { 
                IStrategoTerm l_973 = null;
                IStrategoTerm m_973 = null;
                IStrategoTerm o_973 = null;
                IStrategoTerm p_973 = null;
                IStrategoTerm q_973 = null;
                IStrategoTerm r_973 = null;
                IStrategoTerm t_973 = null;
                IStrategoTerm u_973 = null;
                IStrategoTerm w_973 = null;
                IStrategoTerm x_973 = null;
                IStrategoTerm y_973 = null;
                IStrategoTerm z_973 = null;
                IStrategoTerm a_974 = null;
                IStrategoTerm b_974 = null;
                IStrategoTerm d_974 = null;
                IStrategoTerm e_974 = null;
                IStrategoTerm f_974 = null;
                IStrategoTerm g_974 = null;
                IStrategoTerm h_974 = null;
                IStrategoTerm i_974 = null;
                IStrategoTerm k_974 = null;
                IStrategoTerm l_974 = null;
                IStrategoTerm m_974 = null;
                IStrategoTerm n_974 = null;
                IStrategoTerm o_974 = null;
                IStrategoTerm p_974 = null;
                IStrategoTerm r_974 = null;
                IStrategoTerm s_974 = null;
                IStrategoTerm t_974 = null;
                IStrategoTerm u_974 = null;
                o_973 = term;
                l_973 = transformer_debug.const370;
                p_973 = o_973;
                m_973 = transformer_debug.const377;
                q_973 = p_973;
                term = s_step_0_3.instance.invoke(context, q_973, l_973, m_973, transformer_debug.constLocationInfo585);
                if(term == null)
                  break Fail473;
                w_973 = term;
                t_973 = transformer_debug.const370;
                x_973 = w_973;
                u_973 = transformer_debug.const377;
                y_973 = x_973;
                term = s_step_0_3.instance.invoke(context, y_973, t_973, u_973, transformer_debug.constLocationInfo586);
                if(term == null)
                  break Fail473;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, p_971);
                if(term == null)
                  break Fail473;
                r_973 = term;
                q_971 = term;
                d_974 = r_973;
                z_973 = transformer_debug.const370;
                e_974 = d_974;
                a_974 = transformer_debug.const377;
                f_974 = e_974;
                b_974 = transformer_debug.const383;
                g_974 = f_974;
                term = s_var_0_4.instance.invoke(context, g_974, z_973, a_974, b_974, transformer_debug.constLocationInfo587);
                if(term == null)
                  break Fail473;
                k_974 = term;
                h_974 = transformer_debug.const370;
                l_974 = k_974;
                i_974 = transformer_debug.const377;
                m_974 = l_974;
                term = s_step_0_3.instance.invoke(context, m_974, h_974, i_974, transformer_debug.constLocationInfo588);
                if(term == null)
                  break Fail473;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{q_971, r_971});
                s_971 = term;
                r_974 = term;
                n_974 = transformer_debug.const370;
                s_974 = r_974;
                o_974 = transformer_debug.const377;
                t_974 = s_974;
                p_974 = transformer_debug.const294;
                u_974 = t_974;
                term = s_var_0_4.instance.invoke(context, u_974, n_974, o_974, p_974, transformer_debug.constLocationInfo589);
                if(term == null)
                  break Fail473;
                if(true)
                  break Success228;
              }
              term = term199;
              IStrategoTerm t_971 = null;
              IStrategoTerm u_971 = null;
              IStrategoTerm w_974 = null;
              t_971 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail472;
              u_971 = term;
              w_974 = t_971;
              term = report_with_failure_0_2.instance.invoke(context, w_974, transformer_debug.const384, u_971);
              if(term == null)
                break Fail472;
            }
            term = k_973;
            IStrategoTerm x_974 = null;
            IStrategoTerm y_974 = null;
            IStrategoTerm a_975 = null;
            IStrategoTerm b_975 = null;
            IStrategoTerm c_975 = null;
            if(s_971 == null)
              break Fail472;
            a_975 = s_971;
            x_974 = transformer_debug.const370;
            b_975 = a_975;
            y_974 = transformer_debug.const377;
            c_975 = b_975;
            term = r_exit_0_3.instance.invoke(context, c_975, x_974, y_974, transformer_debug.constLocationInfo580);
            if(term == null)
              break Fail472;
            if(true)
              break Success227;
          }
          term = term198;
        }
        Success229:
        { 
          if(cons22 == transformer_debug._consCall_2)
          { 
            Fail474:
            { 
              IStrategoTerm x_967 = null;
              IStrategoTerm y_967 = null;
              IStrategoTerm z_967 = null;
              IStrategoTerm a_968 = null;
              IStrategoTerm d_968 = null;
              IStrategoTerm e_968 = null;
              IStrategoTerm f_968 = null;
              IStrategoTerm h_968 = null;
              IStrategoTerm i_968 = null;
              IStrategoTerm j_968 = null;
              IStrategoTerm k_968 = null;
              IStrategoTerm l_968 = null;
              IStrategoTerm m_968 = null;
              IStrategoTerm n_968 = null;
              IStrategoTerm p_968 = null;
              IStrategoTerm q_968 = null;
              IStrategoTerm r_968 = null;
              IStrategoTerm s_968 = null;
              IStrategoTerm t_968 = null;
              IStrategoTerm u_968 = null;
              IStrategoTerm v_968 = null;
              IStrategoTerm x_968 = null;
              IStrategoTerm y_968 = null;
              IStrategoTerm z_968 = null;
              IStrategoTerm a_969 = null;
              IStrategoTerm b_969 = null;
              IStrategoTerm c_969 = null;
              IStrategoTerm d_969 = null;
              IStrategoTerm e_969 = null;
              IStrategoTerm g_969 = null;
              IStrategoTerm h_969 = null;
              IStrategoTerm i_969 = null;
              IStrategoTerm j_969 = null;
              IStrategoTerm k_969 = null;
              IStrategoTerm l_969 = null;
              IStrategoTerm m_969 = null;
              IStrategoTerm o_969 = null;
              IStrategoTerm p_969 = null;
              IStrategoTerm q_969 = null;
              IStrategoTerm r_969 = null;
              IStrategoTerm s_969 = null;
              z_967 = term;
              IStrategoList annos79 = term.getAnnotations();
              if(annos79.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos79).isEmpty())
                break Fail474;
              x_967 = ((IStrategoList)annos79).head();
              IStrategoTerm arg136 = ((IStrategoList)annos79).tail();
              if(arg136.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg136).isEmpty())
                break Fail474;
              d_968 = term;
              h_968 = term;
              e_968 = transformer_debug.const370;
              i_968 = h_968;
              f_968 = transformer_debug.const377;
              j_968 = i_968;
              term = r_enter_0_3.instance.invoke(context, j_968, e_968, f_968, transformer_debug.constLocationInfo590);
              if(term == null)
                break Fail474;
              term = d_968;
              k_968 = d_968;
              if(k_1145.value == null)
                break Fail474;
              p_968 = k_1145.value;
              l_968 = transformer_debug.const370;
              q_968 = p_968;
              m_968 = transformer_debug.const377;
              r_968 = q_968;
              n_968 = transformer_debug.const238;
              s_968 = r_968;
              term = s_var_0_4.instance.invoke(context, s_968, l_968, m_968, n_968, transformer_debug.constLocationInfo591);
              if(term == null)
                break Fail474;
              if(l_1145.value == null)
                break Fail474;
              x_968 = l_1145.value;
              t_968 = transformer_debug.const370;
              y_968 = x_968;
              u_968 = transformer_debug.const377;
              z_968 = y_968;
              v_968 = transformer_debug.const239;
              a_969 = z_968;
              term = s_var_0_4.instance.invoke(context, a_969, t_968, u_968, v_968, transformer_debug.constLocationInfo592);
              if(term == null)
                break Fail474;
              b_969 = k_968;
              g_969 = z_967;
              c_969 = transformer_debug.const370;
              h_969 = g_969;
              d_969 = transformer_debug.const377;
              i_969 = h_969;
              e_969 = transformer_debug.const277;
              j_969 = i_969;
              term = s_var_0_4.instance.invoke(context, j_969, c_969, d_969, e_969, transformer_debug.constLocationInfo593);
              if(term == null)
                break Fail474;
              o_969 = x_967;
              k_969 = transformer_debug.const370;
              p_969 = o_969;
              l_969 = transformer_debug.const377;
              q_969 = p_969;
              m_969 = transformer_debug.const381;
              r_969 = q_969;
              term = s_var_0_4.instance.invoke(context, r_969, k_969, l_969, m_969, transformer_debug.constLocationInfo594);
              if(term == null)
                break Fail474;
              term = b_969;
              s_969 = b_969;
              IStrategoTerm term201 = term;
              Success230:
              { 
                Fail475:
                { 
                  IStrategoTerm t_969 = null;
                  IStrategoTerm u_969 = null;
                  IStrategoTerm w_969 = null;
                  IStrategoTerm x_969 = null;
                  IStrategoTerm y_969 = null;
                  IStrategoTerm z_969 = null;
                  IStrategoTerm b_970 = null;
                  IStrategoTerm c_970 = null;
                  IStrategoTerm e_970 = null;
                  IStrategoTerm f_970 = null;
                  IStrategoTerm g_970 = null;
                  IStrategoTerm h_970 = null;
                  IStrategoTerm i_970 = null;
                  IStrategoTerm j_970 = null;
                  IStrategoTerm l_970 = null;
                  IStrategoTerm m_970 = null;
                  IStrategoTerm n_970 = null;
                  IStrategoTerm o_970 = null;
                  IStrategoTerm p_970 = null;
                  IStrategoTerm q_970 = null;
                  IStrategoTerm s_970 = null;
                  IStrategoTerm t_970 = null;
                  IStrategoTerm u_970 = null;
                  IStrategoTerm v_970 = null;
                  IStrategoTerm w_970 = null;
                  IStrategoTerm x_970 = null;
                  IStrategoTerm z_970 = null;
                  IStrategoTerm a_971 = null;
                  IStrategoTerm b_971 = null;
                  IStrategoTerm c_971 = null;
                  w_969 = term;
                  t_969 = transformer_debug.const370;
                  x_969 = w_969;
                  u_969 = transformer_debug.const377;
                  y_969 = x_969;
                  term = s_step_0_3.instance.invoke(context, y_969, t_969, u_969, transformer_debug.constLocationInfo595);
                  if(term == null)
                    break Fail475;
                  e_970 = term;
                  b_970 = transformer_debug.const370;
                  f_970 = e_970;
                  c_970 = transformer_debug.const377;
                  g_970 = f_970;
                  term = s_step_0_3.instance.invoke(context, g_970, b_970, c_970, transformer_debug.constLocationInfo596);
                  if(term == null)
                    break Fail475;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, x_967);
                  if(term == null)
                    break Fail475;
                  z_969 = term;
                  y_967 = term;
                  l_970 = z_969;
                  h_970 = transformer_debug.const370;
                  m_970 = l_970;
                  i_970 = transformer_debug.const377;
                  n_970 = m_970;
                  j_970 = transformer_debug.const383;
                  o_970 = n_970;
                  term = s_var_0_4.instance.invoke(context, o_970, h_970, i_970, j_970, transformer_debug.constLocationInfo597);
                  if(term == null)
                    break Fail475;
                  s_970 = term;
                  p_970 = transformer_debug.const370;
                  t_970 = s_970;
                  q_970 = transformer_debug.const377;
                  u_970 = t_970;
                  term = s_step_0_3.instance.invoke(context, u_970, p_970, q_970, transformer_debug.constLocationInfo598);
                  if(term == null)
                    break Fail475;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{y_967, z_967});
                  a_968 = term;
                  z_970 = term;
                  v_970 = transformer_debug.const370;
                  a_971 = z_970;
                  w_970 = transformer_debug.const377;
                  b_971 = a_971;
                  x_970 = transformer_debug.const294;
                  c_971 = b_971;
                  term = s_var_0_4.instance.invoke(context, c_971, v_970, w_970, x_970, transformer_debug.constLocationInfo599);
                  if(term == null)
                    break Fail475;
                  if(true)
                    break Success230;
                }
                term = term201;
                IStrategoTerm b_968 = null;
                IStrategoTerm c_968 = null;
                IStrategoTerm e_971 = null;
                b_968 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail474;
                c_968 = term;
                e_971 = b_968;
                term = report_with_failure_0_2.instance.invoke(context, e_971, transformer_debug.const384, c_968);
                if(term == null)
                  break Fail474;
              }
              term = s_969;
              IStrategoTerm f_971 = null;
              IStrategoTerm g_971 = null;
              IStrategoTerm i_971 = null;
              IStrategoTerm j_971 = null;
              IStrategoTerm k_971 = null;
              if(a_968 == null)
                break Fail474;
              i_971 = a_968;
              f_971 = transformer_debug.const370;
              j_971 = i_971;
              g_971 = transformer_debug.const377;
              k_971 = j_971;
              term = r_exit_0_3.instance.invoke(context, k_971, f_971, g_971, transformer_debug.constLocationInfo590);
              if(term == null)
                break Fail474;
              if(true)
                break Success229;
            }
            term = term198;
          }
          add_step_to_strategy_0_2_fragment_14 add_step_to_strategy_0_2_fragment_140 = new add_step_to_strategy_0_2_fragment_14();
          add_step_to_strategy_0_2_fragment_140.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_140.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_140.invoke(context, term);
          if(term == null)
            break Fail471;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}