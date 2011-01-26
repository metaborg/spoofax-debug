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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_12 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail486:
    { 
      IStrategoTerm term210 = term;
      IStrategoConstructor cons25 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success239:
      { 
        if(cons25 == transformer_debug._consWith_1)
        { 
          Fail487:
          { 
            IStrategoTerm l_949 = null;
            IStrategoTerm m_949 = null;
            IStrategoTerm n_949 = null;
            IStrategoTerm o_949 = null;
            IStrategoTerm r_949 = null;
            IStrategoTerm s_949 = null;
            IStrategoTerm t_949 = null;
            IStrategoTerm v_949 = null;
            IStrategoTerm w_949 = null;
            IStrategoTerm x_949 = null;
            IStrategoTerm y_949 = null;
            IStrategoTerm z_949 = null;
            IStrategoTerm a_950 = null;
            IStrategoTerm b_950 = null;
            IStrategoTerm d_950 = null;
            IStrategoTerm e_950 = null;
            IStrategoTerm f_950 = null;
            IStrategoTerm g_950 = null;
            IStrategoTerm h_950 = null;
            IStrategoTerm i_950 = null;
            IStrategoTerm j_950 = null;
            IStrategoTerm l_950 = null;
            IStrategoTerm m_950 = null;
            IStrategoTerm n_950 = null;
            IStrategoTerm o_950 = null;
            IStrategoTerm p_950 = null;
            IStrategoTerm q_950 = null;
            IStrategoTerm r_950 = null;
            IStrategoTerm s_950 = null;
            IStrategoTerm u_950 = null;
            IStrategoTerm v_950 = null;
            IStrategoTerm w_950 = null;
            IStrategoTerm x_950 = null;
            IStrategoTerm y_950 = null;
            IStrategoTerm z_950 = null;
            IStrategoTerm a_951 = null;
            IStrategoTerm c_951 = null;
            IStrategoTerm d_951 = null;
            IStrategoTerm e_951 = null;
            IStrategoTerm f_951 = null;
            IStrategoTerm g_951 = null;
            n_949 = term;
            IStrategoList annos84 = term.getAnnotations();
            if(annos84.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos84).isEmpty())
              break Fail487;
            l_949 = ((IStrategoList)annos84).head();
            IStrategoTerm arg147 = ((IStrategoList)annos84).tail();
            if(arg147.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg147).isEmpty())
              break Fail487;
            r_949 = term;
            v_949 = term;
            s_949 = transformer_debug.const370;
            w_949 = v_949;
            t_949 = transformer_debug.const377;
            x_949 = w_949;
            term = r_enter_0_3.instance.invoke(context, x_949, s_949, t_949, transformer_debug.constLocationInfo640);
            if(term == null)
              break Fail487;
            term = r_949;
            y_949 = r_949;
            if(k_1145.value == null)
              break Fail487;
            d_950 = k_1145.value;
            z_949 = transformer_debug.const370;
            e_950 = d_950;
            a_950 = transformer_debug.const377;
            f_950 = e_950;
            b_950 = transformer_debug.const238;
            g_950 = f_950;
            term = s_var_0_4.instance.invoke(context, g_950, z_949, a_950, b_950, transformer_debug.constLocationInfo641);
            if(term == null)
              break Fail487;
            if(l_1145.value == null)
              break Fail487;
            l_950 = l_1145.value;
            h_950 = transformer_debug.const370;
            m_950 = l_950;
            i_950 = transformer_debug.const377;
            n_950 = m_950;
            j_950 = transformer_debug.const239;
            o_950 = n_950;
            term = s_var_0_4.instance.invoke(context, o_950, h_950, i_950, j_950, transformer_debug.constLocationInfo642);
            if(term == null)
              break Fail487;
            p_950 = y_949;
            u_950 = n_949;
            q_950 = transformer_debug.const370;
            v_950 = u_950;
            r_950 = transformer_debug.const377;
            w_950 = v_950;
            s_950 = transformer_debug.const277;
            x_950 = w_950;
            term = s_var_0_4.instance.invoke(context, x_950, q_950, r_950, s_950, transformer_debug.constLocationInfo643);
            if(term == null)
              break Fail487;
            c_951 = l_949;
            y_950 = transformer_debug.const370;
            d_951 = c_951;
            z_950 = transformer_debug.const377;
            e_951 = d_951;
            a_951 = transformer_debug.const381;
            f_951 = e_951;
            term = s_var_0_4.instance.invoke(context, f_951, y_950, z_950, a_951, transformer_debug.constLocationInfo644);
            if(term == null)
              break Fail487;
            term = p_950;
            g_951 = p_950;
            IStrategoTerm term211 = term;
            Success240:
            { 
              Fail488:
              { 
                IStrategoTerm h_951 = null;
                IStrategoTerm i_951 = null;
                IStrategoTerm k_951 = null;
                IStrategoTerm l_951 = null;
                IStrategoTerm m_951 = null;
                IStrategoTerm n_951 = null;
                IStrategoTerm p_951 = null;
                IStrategoTerm q_951 = null;
                IStrategoTerm s_951 = null;
                IStrategoTerm t_951 = null;
                IStrategoTerm u_951 = null;
                IStrategoTerm v_951 = null;
                IStrategoTerm w_951 = null;
                IStrategoTerm x_951 = null;
                IStrategoTerm z_951 = null;
                IStrategoTerm a_952 = null;
                IStrategoTerm b_952 = null;
                IStrategoTerm c_952 = null;
                IStrategoTerm d_952 = null;
                IStrategoTerm e_952 = null;
                IStrategoTerm g_952 = null;
                IStrategoTerm h_952 = null;
                IStrategoTerm i_952 = null;
                IStrategoTerm j_952 = null;
                IStrategoTerm k_952 = null;
                IStrategoTerm l_952 = null;
                IStrategoTerm n_952 = null;
                IStrategoTerm o_952 = null;
                IStrategoTerm p_952 = null;
                IStrategoTerm q_952 = null;
                k_951 = term;
                h_951 = transformer_debug.const370;
                l_951 = k_951;
                i_951 = transformer_debug.const377;
                m_951 = l_951;
                term = s_step_0_3.instance.invoke(context, m_951, h_951, i_951, transformer_debug.constLocationInfo645);
                if(term == null)
                  break Fail488;
                s_951 = term;
                p_951 = transformer_debug.const370;
                t_951 = s_951;
                q_951 = transformer_debug.const377;
                u_951 = t_951;
                term = s_step_0_3.instance.invoke(context, u_951, p_951, q_951, transformer_debug.constLocationInfo646);
                if(term == null)
                  break Fail488;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, l_949);
                if(term == null)
                  break Fail488;
                n_951 = term;
                m_949 = term;
                z_951 = n_951;
                v_951 = transformer_debug.const370;
                a_952 = z_951;
                w_951 = transformer_debug.const377;
                b_952 = a_952;
                x_951 = transformer_debug.const383;
                c_952 = b_952;
                term = s_var_0_4.instance.invoke(context, c_952, v_951, w_951, x_951, transformer_debug.constLocationInfo647);
                if(term == null)
                  break Fail488;
                g_952 = term;
                d_952 = transformer_debug.const370;
                h_952 = g_952;
                e_952 = transformer_debug.const377;
                i_952 = h_952;
                term = s_step_0_3.instance.invoke(context, i_952, d_952, e_952, transformer_debug.constLocationInfo648);
                if(term == null)
                  break Fail488;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{m_949, n_949});
                o_949 = term;
                n_952 = term;
                j_952 = transformer_debug.const370;
                o_952 = n_952;
                k_952 = transformer_debug.const377;
                p_952 = o_952;
                l_952 = transformer_debug.const294;
                q_952 = p_952;
                term = s_var_0_4.instance.invoke(context, q_952, j_952, k_952, l_952, transformer_debug.constLocationInfo649);
                if(term == null)
                  break Fail488;
                if(true)
                  break Success240;
              }
              term = term211;
              IStrategoTerm p_949 = null;
              IStrategoTerm q_949 = null;
              IStrategoTerm s_952 = null;
              p_949 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail487;
              q_949 = term;
              s_952 = p_949;
              term = report_with_failure_0_2.instance.invoke(context, s_952, transformer_debug.const384, q_949);
              if(term == null)
                break Fail487;
            }
            term = g_951;
            IStrategoTerm t_952 = null;
            IStrategoTerm u_952 = null;
            IStrategoTerm w_952 = null;
            IStrategoTerm x_952 = null;
            IStrategoTerm y_952 = null;
            if(o_949 == null)
              break Fail487;
            w_952 = o_949;
            t_952 = transformer_debug.const370;
            x_952 = w_952;
            u_952 = transformer_debug.const377;
            y_952 = x_952;
            term = r_exit_0_3.instance.invoke(context, y_952, t_952, u_952, transformer_debug.constLocationInfo640);
            if(term == null)
              break Fail487;
            if(true)
              break Success239;
          }
          term = term210;
        }
        Success241:
        { 
          if(cons25 == transformer_debug._consTest_1)
          { 
            Fail489:
            { 
              IStrategoTerm z_941 = null;
              IStrategoTerm a_942 = null;
              IStrategoTerm c_942 = null;
              IStrategoTerm d_942 = null;
              IStrategoTerm g_942 = null;
              IStrategoTerm h_942 = null;
              IStrategoTerm i_942 = null;
              IStrategoTerm k_942 = null;
              IStrategoTerm l_942 = null;
              IStrategoTerm m_942 = null;
              IStrategoTerm o_942 = null;
              IStrategoTerm p_942 = null;
              IStrategoTerm q_942 = null;
              IStrategoTerm r_942 = null;
              IStrategoTerm t_942 = null;
              IStrategoTerm u_942 = null;
              IStrategoTerm v_942 = null;
              IStrategoTerm w_942 = null;
              IStrategoTerm x_942 = null;
              IStrategoTerm y_942 = null;
              IStrategoTerm z_942 = null;
              IStrategoTerm b_943 = null;
              IStrategoTerm c_943 = null;
              IStrategoTerm d_943 = null;
              IStrategoTerm e_943 = null;
              IStrategoTerm f_943 = null;
              IStrategoTerm g_943 = null;
              IStrategoTerm h_943 = null;
              IStrategoTerm i_943 = null;
              IStrategoTerm k_943 = null;
              IStrategoTerm l_943 = null;
              IStrategoTerm m_943 = null;
              IStrategoTerm n_943 = null;
              IStrategoTerm o_943 = null;
              IStrategoTerm p_943 = null;
              IStrategoTerm q_943 = null;
              IStrategoTerm s_943 = null;
              IStrategoTerm t_943 = null;
              IStrategoTerm u_943 = null;
              IStrategoTerm v_943 = null;
              IStrategoTerm w_943 = null;
              c_942 = term;
              IStrategoList annos85 = term.getAnnotations();
              if(annos85.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos85).isEmpty())
                break Fail489;
              z_941 = ((IStrategoList)annos85).head();
              IStrategoTerm arg149 = ((IStrategoList)annos85).tail();
              if(arg149.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg149).isEmpty())
                break Fail489;
              g_942 = term;
              k_942 = term;
              h_942 = transformer_debug.const370;
              l_942 = k_942;
              i_942 = transformer_debug.const377;
              m_942 = l_942;
              term = r_enter_0_3.instance.invoke(context, m_942, h_942, i_942, transformer_debug.constLocationInfo650);
              if(term == null)
                break Fail489;
              term = g_942;
              o_942 = g_942;
              if(k_1145.value == null)
                break Fail489;
              t_942 = k_1145.value;
              p_942 = transformer_debug.const370;
              u_942 = t_942;
              q_942 = transformer_debug.const377;
              v_942 = u_942;
              r_942 = transformer_debug.const238;
              w_942 = v_942;
              term = s_var_0_4.instance.invoke(context, w_942, p_942, q_942, r_942, transformer_debug.constLocationInfo651);
              if(term == null)
                break Fail489;
              if(l_1145.value == null)
                break Fail489;
              b_943 = l_1145.value;
              x_942 = transformer_debug.const370;
              c_943 = b_943;
              y_942 = transformer_debug.const377;
              d_943 = c_943;
              z_942 = transformer_debug.const239;
              e_943 = d_943;
              term = s_var_0_4.instance.invoke(context, e_943, x_942, y_942, z_942, transformer_debug.constLocationInfo652);
              if(term == null)
                break Fail489;
              f_943 = o_942;
              k_943 = c_942;
              g_943 = transformer_debug.const370;
              l_943 = k_943;
              h_943 = transformer_debug.const377;
              m_943 = l_943;
              i_943 = transformer_debug.const277;
              n_943 = m_943;
              term = s_var_0_4.instance.invoke(context, n_943, g_943, h_943, i_943, transformer_debug.constLocationInfo653);
              if(term == null)
                break Fail489;
              s_943 = z_941;
              o_943 = transformer_debug.const370;
              t_943 = s_943;
              p_943 = transformer_debug.const377;
              u_943 = t_943;
              q_943 = transformer_debug.const381;
              v_943 = u_943;
              term = s_var_0_4.instance.invoke(context, v_943, o_943, p_943, q_943, transformer_debug.constLocationInfo654);
              if(term == null)
                break Fail489;
              term = f_943;
              w_943 = f_943;
              IStrategoTerm term213 = term;
              Success242:
              { 
                Fail490:
                { 
                  IStrategoTerm x_943 = null;
                  IStrategoTerm y_943 = null;
                  IStrategoTerm a_944 = null;
                  IStrategoTerm b_944 = null;
                  IStrategoTerm c_944 = null;
                  IStrategoTerm d_944 = null;
                  IStrategoTerm f_944 = null;
                  IStrategoTerm g_944 = null;
                  IStrategoTerm i_944 = null;
                  IStrategoTerm j_944 = null;
                  IStrategoTerm l_944 = null;
                  IStrategoTerm m_944 = null;
                  IStrategoTerm n_944 = null;
                  IStrategoTerm o_944 = null;
                  IStrategoTerm q_944 = null;
                  IStrategoTerm r_944 = null;
                  IStrategoTerm s_944 = null;
                  IStrategoTerm t_944 = null;
                  IStrategoTerm u_944 = null;
                  IStrategoTerm v_944 = null;
                  IStrategoTerm x_944 = null;
                  IStrategoTerm y_944 = null;
                  IStrategoTerm z_944 = null;
                  IStrategoTerm c_945 = null;
                  IStrategoTerm d_945 = null;
                  IStrategoTerm t_948 = null;
                  IStrategoTerm v_948 = null;
                  IStrategoTerm w_948 = null;
                  IStrategoTerm x_948 = null;
                  IStrategoTerm y_948 = null;
                  a_944 = term;
                  x_943 = transformer_debug.const370;
                  b_944 = a_944;
                  y_943 = transformer_debug.const377;
                  c_944 = b_944;
                  term = s_step_0_3.instance.invoke(context, c_944, x_943, y_943, transformer_debug.constLocationInfo655);
                  if(term == null)
                    break Fail490;
                  i_944 = term;
                  f_944 = transformer_debug.const370;
                  j_944 = i_944;
                  g_944 = transformer_debug.const377;
                  l_944 = j_944;
                  term = s_step_0_3.instance.invoke(context, l_944, f_944, g_944, transformer_debug.constLocationInfo656);
                  if(term == null)
                    break Fail490;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, z_941);
                  if(term == null)
                    break Fail490;
                  d_944 = term;
                  a_942 = term;
                  q_944 = d_944;
                  m_944 = transformer_debug.const370;
                  r_944 = q_944;
                  n_944 = transformer_debug.const377;
                  s_944 = r_944;
                  o_944 = transformer_debug.const383;
                  t_944 = s_944;
                  term = s_var_0_4.instance.invoke(context, t_944, m_944, n_944, o_944, transformer_debug.constLocationInfo657);
                  if(term == null)
                    break Fail490;
                  x_944 = term;
                  u_944 = transformer_debug.const370;
                  y_944 = x_944;
                  v_944 = transformer_debug.const377;
                  z_944 = y_944;
                  term = s_step_0_3.instance.invoke(context, z_944, u_944, v_944, transformer_debug.constLocationInfo658);
                  if(term == null)
                    break Fail490;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{a_942, c_942});
                  d_942 = term;
                  v_948 = term;
                  c_945 = transformer_debug.const370;
                  w_948 = v_948;
                  d_945 = transformer_debug.const377;
                  x_948 = w_948;
                  t_948 = transformer_debug.const294;
                  y_948 = x_948;
                  term = s_var_0_4.instance.invoke(context, y_948, c_945, d_945, t_948, transformer_debug.constLocationInfo659);
                  if(term == null)
                    break Fail490;
                  if(true)
                    break Success242;
                }
                term = term213;
                IStrategoTerm e_942 = null;
                IStrategoTerm f_942 = null;
                IStrategoTerm a_949 = null;
                e_942 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail489;
                f_942 = term;
                a_949 = e_942;
                term = report_with_failure_0_2.instance.invoke(context, a_949, transformer_debug.const384, f_942);
                if(term == null)
                  break Fail489;
              }
              term = w_943;
              IStrategoTerm b_949 = null;
              IStrategoTerm c_949 = null;
              IStrategoTerm e_949 = null;
              IStrategoTerm f_949 = null;
              IStrategoTerm g_949 = null;
              if(d_942 == null)
                break Fail489;
              e_949 = d_942;
              b_949 = transformer_debug.const370;
              f_949 = e_949;
              c_949 = transformer_debug.const377;
              g_949 = f_949;
              term = r_exit_0_3.instance.invoke(context, g_949, b_949, c_949, transformer_debug.constLocationInfo650);
              if(term == null)
                break Fail489;
              if(true)
                break Success241;
            }
            term = term210;
          }
          add_step_to_strategy_0_2_fragment_11 add_step_to_strategy_0_2_fragment_110 = new add_step_to_strategy_0_2_fragment_11();
          add_step_to_strategy_0_2_fragment_110.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_110.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_110.invoke(context, term);
          if(term == null)
            break Fail486;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}