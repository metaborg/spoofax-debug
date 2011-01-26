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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_13 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail481:
    { 
      IStrategoTerm term206 = term;
      IStrategoConstructor cons24 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success235:
      { 
        if(cons24 == transformer_debug._consNot_1)
        { 
          Fail482:
          { 
            IStrategoTerm v_956 = null;
            IStrategoTerm w_956 = null;
            IStrategoTerm x_956 = null;
            IStrategoTerm y_956 = null;
            IStrategoTerm b_957 = null;
            IStrategoTerm c_957 = null;
            IStrategoTerm d_957 = null;
            IStrategoTerm f_957 = null;
            IStrategoTerm g_957 = null;
            IStrategoTerm h_957 = null;
            IStrategoTerm i_957 = null;
            IStrategoTerm j_957 = null;
            IStrategoTerm k_957 = null;
            IStrategoTerm l_957 = null;
            IStrategoTerm n_957 = null;
            IStrategoTerm o_957 = null;
            IStrategoTerm p_957 = null;
            IStrategoTerm q_957 = null;
            IStrategoTerm r_957 = null;
            IStrategoTerm s_957 = null;
            IStrategoTerm t_957 = null;
            IStrategoTerm v_957 = null;
            IStrategoTerm w_957 = null;
            IStrategoTerm x_957 = null;
            IStrategoTerm y_957 = null;
            IStrategoTerm z_957 = null;
            IStrategoTerm a_958 = null;
            IStrategoTerm b_958 = null;
            IStrategoTerm c_958 = null;
            IStrategoTerm e_958 = null;
            IStrategoTerm f_958 = null;
            IStrategoTerm g_958 = null;
            IStrategoTerm h_958 = null;
            IStrategoTerm i_958 = null;
            IStrategoTerm j_958 = null;
            IStrategoTerm k_958 = null;
            IStrategoTerm m_958 = null;
            IStrategoTerm n_958 = null;
            IStrategoTerm o_958 = null;
            IStrategoTerm p_958 = null;
            IStrategoTerm q_958 = null;
            x_956 = term;
            IStrategoList annos82 = term.getAnnotations();
            if(annos82.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos82).isEmpty())
              break Fail482;
            v_956 = ((IStrategoList)annos82).head();
            IStrategoTerm arg143 = ((IStrategoList)annos82).tail();
            if(arg143.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg143).isEmpty())
              break Fail482;
            b_957 = term;
            f_957 = term;
            c_957 = transformer_debug.const370;
            g_957 = f_957;
            d_957 = transformer_debug.const377;
            h_957 = g_957;
            term = r_enter_0_3.instance.invoke(context, h_957, c_957, d_957, transformer_debug.constLocationInfo620);
            if(term == null)
              break Fail482;
            term = b_957;
            i_957 = b_957;
            if(k_1145.value == null)
              break Fail482;
            n_957 = k_1145.value;
            j_957 = transformer_debug.const370;
            o_957 = n_957;
            k_957 = transformer_debug.const377;
            p_957 = o_957;
            l_957 = transformer_debug.const238;
            q_957 = p_957;
            term = s_var_0_4.instance.invoke(context, q_957, j_957, k_957, l_957, transformer_debug.constLocationInfo621);
            if(term == null)
              break Fail482;
            if(l_1145.value == null)
              break Fail482;
            v_957 = l_1145.value;
            r_957 = transformer_debug.const370;
            w_957 = v_957;
            s_957 = transformer_debug.const377;
            x_957 = w_957;
            t_957 = transformer_debug.const239;
            y_957 = x_957;
            term = s_var_0_4.instance.invoke(context, y_957, r_957, s_957, t_957, transformer_debug.constLocationInfo622);
            if(term == null)
              break Fail482;
            z_957 = i_957;
            e_958 = x_956;
            a_958 = transformer_debug.const370;
            f_958 = e_958;
            b_958 = transformer_debug.const377;
            g_958 = f_958;
            c_958 = transformer_debug.const277;
            h_958 = g_958;
            term = s_var_0_4.instance.invoke(context, h_958, a_958, b_958, c_958, transformer_debug.constLocationInfo623);
            if(term == null)
              break Fail482;
            m_958 = v_956;
            i_958 = transformer_debug.const370;
            n_958 = m_958;
            j_958 = transformer_debug.const377;
            o_958 = n_958;
            k_958 = transformer_debug.const381;
            p_958 = o_958;
            term = s_var_0_4.instance.invoke(context, p_958, i_958, j_958, k_958, transformer_debug.constLocationInfo624);
            if(term == null)
              break Fail482;
            term = z_957;
            q_958 = z_957;
            IStrategoTerm term207 = term;
            Success236:
            { 
              Fail483:
              { 
                IStrategoTerm r_958 = null;
                IStrategoTerm s_958 = null;
                IStrategoTerm u_958 = null;
                IStrategoTerm v_958 = null;
                IStrategoTerm w_958 = null;
                IStrategoTerm x_958 = null;
                IStrategoTerm z_958 = null;
                IStrategoTerm a_959 = null;
                IStrategoTerm c_959 = null;
                IStrategoTerm d_959 = null;
                IStrategoTerm e_959 = null;
                IStrategoTerm f_959 = null;
                IStrategoTerm g_959 = null;
                IStrategoTerm h_959 = null;
                IStrategoTerm j_959 = null;
                IStrategoTerm k_959 = null;
                IStrategoTerm l_959 = null;
                IStrategoTerm m_959 = null;
                IStrategoTerm n_959 = null;
                IStrategoTerm o_959 = null;
                IStrategoTerm q_959 = null;
                IStrategoTerm r_959 = null;
                IStrategoTerm s_959 = null;
                IStrategoTerm t_959 = null;
                IStrategoTerm u_959 = null;
                IStrategoTerm v_959 = null;
                IStrategoTerm x_959 = null;
                IStrategoTerm y_959 = null;
                IStrategoTerm z_959 = null;
                IStrategoTerm a_960 = null;
                u_958 = term;
                r_958 = transformer_debug.const370;
                v_958 = u_958;
                s_958 = transformer_debug.const377;
                w_958 = v_958;
                term = s_step_0_3.instance.invoke(context, w_958, r_958, s_958, transformer_debug.constLocationInfo625);
                if(term == null)
                  break Fail483;
                c_959 = term;
                z_958 = transformer_debug.const370;
                d_959 = c_959;
                a_959 = transformer_debug.const377;
                e_959 = d_959;
                term = s_step_0_3.instance.invoke(context, e_959, z_958, a_959, transformer_debug.constLocationInfo626);
                if(term == null)
                  break Fail483;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, v_956);
                if(term == null)
                  break Fail483;
                x_958 = term;
                w_956 = term;
                j_959 = x_958;
                f_959 = transformer_debug.const370;
                k_959 = j_959;
                g_959 = transformer_debug.const377;
                l_959 = k_959;
                h_959 = transformer_debug.const383;
                m_959 = l_959;
                term = s_var_0_4.instance.invoke(context, m_959, f_959, g_959, h_959, transformer_debug.constLocationInfo627);
                if(term == null)
                  break Fail483;
                q_959 = term;
                n_959 = transformer_debug.const370;
                r_959 = q_959;
                o_959 = transformer_debug.const377;
                s_959 = r_959;
                term = s_step_0_3.instance.invoke(context, s_959, n_959, o_959, transformer_debug.constLocationInfo628);
                if(term == null)
                  break Fail483;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{w_956, x_956});
                y_956 = term;
                x_959 = term;
                t_959 = transformer_debug.const370;
                y_959 = x_959;
                u_959 = transformer_debug.const377;
                z_959 = y_959;
                v_959 = transformer_debug.const294;
                a_960 = z_959;
                term = s_var_0_4.instance.invoke(context, a_960, t_959, u_959, v_959, transformer_debug.constLocationInfo629);
                if(term == null)
                  break Fail483;
                if(true)
                  break Success236;
              }
              term = term207;
              IStrategoTerm z_956 = null;
              IStrategoTerm a_957 = null;
              IStrategoTerm c_960 = null;
              z_956 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail482;
              a_957 = term;
              c_960 = z_956;
              term = report_with_failure_0_2.instance.invoke(context, c_960, transformer_debug.const384, a_957);
              if(term == null)
                break Fail482;
            }
            term = q_958;
            IStrategoTerm d_960 = null;
            IStrategoTerm e_960 = null;
            IStrategoTerm g_960 = null;
            IStrategoTerm h_960 = null;
            IStrategoTerm i_960 = null;
            if(y_956 == null)
              break Fail482;
            g_960 = y_956;
            d_960 = transformer_debug.const370;
            h_960 = g_960;
            e_960 = transformer_debug.const377;
            i_960 = h_960;
            term = r_exit_0_3.instance.invoke(context, i_960, d_960, e_960, transformer_debug.constLocationInfo620);
            if(term == null)
              break Fail482;
            if(true)
              break Success235;
          }
          term = term206;
        }
        Success237:
        { 
          if(cons24 == transformer_debug._consWhere_1)
          { 
            Fail484:
            { 
              IStrategoTerm d_953 = null;
              IStrategoTerm e_953 = null;
              IStrategoTerm f_953 = null;
              IStrategoTerm g_953 = null;
              IStrategoTerm j_953 = null;
              IStrategoTerm k_953 = null;
              IStrategoTerm l_953 = null;
              IStrategoTerm n_953 = null;
              IStrategoTerm o_953 = null;
              IStrategoTerm p_953 = null;
              IStrategoTerm q_953 = null;
              IStrategoTerm r_953 = null;
              IStrategoTerm s_953 = null;
              IStrategoTerm t_953 = null;
              IStrategoTerm v_953 = null;
              IStrategoTerm w_953 = null;
              IStrategoTerm x_953 = null;
              IStrategoTerm y_953 = null;
              IStrategoTerm z_953 = null;
              IStrategoTerm a_954 = null;
              IStrategoTerm b_954 = null;
              IStrategoTerm d_954 = null;
              IStrategoTerm e_954 = null;
              IStrategoTerm f_954 = null;
              IStrategoTerm g_954 = null;
              IStrategoTerm h_954 = null;
              IStrategoTerm i_954 = null;
              IStrategoTerm j_954 = null;
              IStrategoTerm k_954 = null;
              IStrategoTerm m_954 = null;
              IStrategoTerm n_954 = null;
              IStrategoTerm o_954 = null;
              IStrategoTerm p_954 = null;
              IStrategoTerm q_954 = null;
              IStrategoTerm r_954 = null;
              IStrategoTerm s_954 = null;
              IStrategoTerm u_954 = null;
              IStrategoTerm v_954 = null;
              IStrategoTerm w_954 = null;
              IStrategoTerm x_954 = null;
              IStrategoTerm y_954 = null;
              f_953 = term;
              IStrategoList annos83 = term.getAnnotations();
              if(annos83.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos83).isEmpty())
                break Fail484;
              d_953 = ((IStrategoList)annos83).head();
              IStrategoTerm arg145 = ((IStrategoList)annos83).tail();
              if(arg145.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg145).isEmpty())
                break Fail484;
              j_953 = term;
              n_953 = term;
              k_953 = transformer_debug.const370;
              o_953 = n_953;
              l_953 = transformer_debug.const377;
              p_953 = o_953;
              term = r_enter_0_3.instance.invoke(context, p_953, k_953, l_953, transformer_debug.constLocationInfo630);
              if(term == null)
                break Fail484;
              term = j_953;
              q_953 = j_953;
              if(k_1145.value == null)
                break Fail484;
              v_953 = k_1145.value;
              r_953 = transformer_debug.const370;
              w_953 = v_953;
              s_953 = transformer_debug.const377;
              x_953 = w_953;
              t_953 = transformer_debug.const238;
              y_953 = x_953;
              term = s_var_0_4.instance.invoke(context, y_953, r_953, s_953, t_953, transformer_debug.constLocationInfo631);
              if(term == null)
                break Fail484;
              if(l_1145.value == null)
                break Fail484;
              d_954 = l_1145.value;
              z_953 = transformer_debug.const370;
              e_954 = d_954;
              a_954 = transformer_debug.const377;
              f_954 = e_954;
              b_954 = transformer_debug.const239;
              g_954 = f_954;
              term = s_var_0_4.instance.invoke(context, g_954, z_953, a_954, b_954, transformer_debug.constLocationInfo632);
              if(term == null)
                break Fail484;
              h_954 = q_953;
              m_954 = f_953;
              i_954 = transformer_debug.const370;
              n_954 = m_954;
              j_954 = transformer_debug.const377;
              o_954 = n_954;
              k_954 = transformer_debug.const277;
              p_954 = o_954;
              term = s_var_0_4.instance.invoke(context, p_954, i_954, j_954, k_954, transformer_debug.constLocationInfo633);
              if(term == null)
                break Fail484;
              u_954 = d_953;
              q_954 = transformer_debug.const370;
              v_954 = u_954;
              r_954 = transformer_debug.const377;
              w_954 = v_954;
              s_954 = transformer_debug.const381;
              x_954 = w_954;
              term = s_var_0_4.instance.invoke(context, x_954, q_954, r_954, s_954, transformer_debug.constLocationInfo634);
              if(term == null)
                break Fail484;
              term = h_954;
              y_954 = h_954;
              IStrategoTerm term209 = term;
              Success238:
              { 
                Fail485:
                { 
                  IStrategoTerm z_954 = null;
                  IStrategoTerm a_955 = null;
                  IStrategoTerm c_955 = null;
                  IStrategoTerm d_955 = null;
                  IStrategoTerm e_955 = null;
                  IStrategoTerm f_955 = null;
                  IStrategoTerm h_955 = null;
                  IStrategoTerm i_955 = null;
                  IStrategoTerm k_955 = null;
                  IStrategoTerm l_955 = null;
                  IStrategoTerm m_955 = null;
                  IStrategoTerm n_955 = null;
                  IStrategoTerm o_955 = null;
                  IStrategoTerm p_955 = null;
                  IStrategoTerm r_955 = null;
                  IStrategoTerm s_955 = null;
                  IStrategoTerm t_955 = null;
                  IStrategoTerm u_955 = null;
                  IStrategoTerm v_955 = null;
                  IStrategoTerm w_955 = null;
                  IStrategoTerm y_955 = null;
                  IStrategoTerm z_955 = null;
                  IStrategoTerm a_956 = null;
                  IStrategoTerm b_956 = null;
                  IStrategoTerm c_956 = null;
                  IStrategoTerm d_956 = null;
                  IStrategoTerm f_956 = null;
                  IStrategoTerm g_956 = null;
                  IStrategoTerm h_956 = null;
                  IStrategoTerm i_956 = null;
                  c_955 = term;
                  z_954 = transformer_debug.const370;
                  d_955 = c_955;
                  a_955 = transformer_debug.const377;
                  e_955 = d_955;
                  term = s_step_0_3.instance.invoke(context, e_955, z_954, a_955, transformer_debug.constLocationInfo635);
                  if(term == null)
                    break Fail485;
                  k_955 = term;
                  h_955 = transformer_debug.const370;
                  l_955 = k_955;
                  i_955 = transformer_debug.const377;
                  m_955 = l_955;
                  term = s_step_0_3.instance.invoke(context, m_955, h_955, i_955, transformer_debug.constLocationInfo636);
                  if(term == null)
                    break Fail485;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, d_953);
                  if(term == null)
                    break Fail485;
                  f_955 = term;
                  e_953 = term;
                  r_955 = f_955;
                  n_955 = transformer_debug.const370;
                  s_955 = r_955;
                  o_955 = transformer_debug.const377;
                  t_955 = s_955;
                  p_955 = transformer_debug.const383;
                  u_955 = t_955;
                  term = s_var_0_4.instance.invoke(context, u_955, n_955, o_955, p_955, transformer_debug.constLocationInfo637);
                  if(term == null)
                    break Fail485;
                  y_955 = term;
                  v_955 = transformer_debug.const370;
                  z_955 = y_955;
                  w_955 = transformer_debug.const377;
                  a_956 = z_955;
                  term = s_step_0_3.instance.invoke(context, a_956, v_955, w_955, transformer_debug.constLocationInfo638);
                  if(term == null)
                    break Fail485;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{e_953, f_953});
                  g_953 = term;
                  f_956 = term;
                  b_956 = transformer_debug.const370;
                  g_956 = f_956;
                  c_956 = transformer_debug.const377;
                  h_956 = g_956;
                  d_956 = transformer_debug.const294;
                  i_956 = h_956;
                  term = s_var_0_4.instance.invoke(context, i_956, b_956, c_956, d_956, transformer_debug.constLocationInfo639);
                  if(term == null)
                    break Fail485;
                  if(true)
                    break Success238;
                }
                term = term209;
                IStrategoTerm h_953 = null;
                IStrategoTerm i_953 = null;
                IStrategoTerm k_956 = null;
                h_953 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail484;
                i_953 = term;
                k_956 = h_953;
                term = report_with_failure_0_2.instance.invoke(context, k_956, transformer_debug.const384, i_953);
                if(term == null)
                  break Fail484;
              }
              term = y_954;
              IStrategoTerm l_956 = null;
              IStrategoTerm m_956 = null;
              IStrategoTerm o_956 = null;
              IStrategoTerm p_956 = null;
              IStrategoTerm q_956 = null;
              if(g_953 == null)
                break Fail484;
              o_956 = g_953;
              l_956 = transformer_debug.const370;
              p_956 = o_956;
              m_956 = transformer_debug.const377;
              q_956 = p_956;
              term = r_exit_0_3.instance.invoke(context, q_956, l_956, m_956, transformer_debug.constLocationInfo630);
              if(term == null)
                break Fail484;
              if(true)
                break Success237;
            }
            term = term206;
          }
          add_step_to_strategy_0_2_fragment_12 add_step_to_strategy_0_2_fragment_120 = new add_step_to_strategy_0_2_fragment_12();
          add_step_to_strategy_0_2_fragment_120.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_120.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_120.invoke(context, term);
          if(term == null)
            break Fail481;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}