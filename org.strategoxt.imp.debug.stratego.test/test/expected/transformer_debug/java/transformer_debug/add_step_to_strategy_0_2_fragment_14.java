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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_14 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail476:
    { 
      IStrategoTerm term202 = term;
      IStrategoConstructor cons23 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success231:
      { 
        if(cons23 == transformer_debug._consScopeDefault_1)
        { 
          Fail477:
          { 
            IStrategoTerm f_964 = null;
            IStrategoTerm g_964 = null;
            IStrategoTerm h_964 = null;
            IStrategoTerm i_964 = null;
            IStrategoTerm l_964 = null;
            IStrategoTerm m_964 = null;
            IStrategoTerm n_964 = null;
            IStrategoTerm p_964 = null;
            IStrategoTerm q_964 = null;
            IStrategoTerm r_964 = null;
            IStrategoTerm s_964 = null;
            IStrategoTerm t_964 = null;
            IStrategoTerm u_964 = null;
            IStrategoTerm v_964 = null;
            IStrategoTerm x_964 = null;
            IStrategoTerm y_964 = null;
            IStrategoTerm z_964 = null;
            IStrategoTerm a_965 = null;
            IStrategoTerm b_965 = null;
            IStrategoTerm c_965 = null;
            IStrategoTerm d_965 = null;
            IStrategoTerm f_965 = null;
            IStrategoTerm g_965 = null;
            IStrategoTerm h_965 = null;
            IStrategoTerm i_965 = null;
            IStrategoTerm j_965 = null;
            IStrategoTerm k_965 = null;
            IStrategoTerm l_965 = null;
            IStrategoTerm m_965 = null;
            IStrategoTerm o_965 = null;
            IStrategoTerm p_965 = null;
            IStrategoTerm q_965 = null;
            IStrategoTerm r_965 = null;
            IStrategoTerm s_965 = null;
            IStrategoTerm t_965 = null;
            IStrategoTerm u_965 = null;
            IStrategoTerm w_965 = null;
            IStrategoTerm x_965 = null;
            IStrategoTerm y_965 = null;
            IStrategoTerm z_965 = null;
            IStrategoTerm a_966 = null;
            h_964 = term;
            IStrategoList annos80 = term.getAnnotations();
            if(annos80.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos80).isEmpty())
              break Fail477;
            f_964 = ((IStrategoList)annos80).head();
            IStrategoTerm arg138 = ((IStrategoList)annos80).tail();
            if(arg138.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg138).isEmpty())
              break Fail477;
            l_964 = term;
            p_964 = term;
            m_964 = transformer_debug.const370;
            q_964 = p_964;
            n_964 = transformer_debug.const377;
            r_964 = q_964;
            term = r_enter_0_3.instance.invoke(context, r_964, m_964, n_964, transformer_debug.constLocationInfo600);
            if(term == null)
              break Fail477;
            term = l_964;
            s_964 = l_964;
            if(k_1145.value == null)
              break Fail477;
            x_964 = k_1145.value;
            t_964 = transformer_debug.const370;
            y_964 = x_964;
            u_964 = transformer_debug.const377;
            z_964 = y_964;
            v_964 = transformer_debug.const238;
            a_965 = z_964;
            term = s_var_0_4.instance.invoke(context, a_965, t_964, u_964, v_964, transformer_debug.constLocationInfo601);
            if(term == null)
              break Fail477;
            if(l_1145.value == null)
              break Fail477;
            f_965 = l_1145.value;
            b_965 = transformer_debug.const370;
            g_965 = f_965;
            c_965 = transformer_debug.const377;
            h_965 = g_965;
            d_965 = transformer_debug.const239;
            i_965 = h_965;
            term = s_var_0_4.instance.invoke(context, i_965, b_965, c_965, d_965, transformer_debug.constLocationInfo602);
            if(term == null)
              break Fail477;
            j_965 = s_964;
            o_965 = h_964;
            k_965 = transformer_debug.const370;
            p_965 = o_965;
            l_965 = transformer_debug.const377;
            q_965 = p_965;
            m_965 = transformer_debug.const277;
            r_965 = q_965;
            term = s_var_0_4.instance.invoke(context, r_965, k_965, l_965, m_965, transformer_debug.constLocationInfo603);
            if(term == null)
              break Fail477;
            w_965 = f_964;
            s_965 = transformer_debug.const370;
            x_965 = w_965;
            t_965 = transformer_debug.const377;
            y_965 = x_965;
            u_965 = transformer_debug.const381;
            z_965 = y_965;
            term = s_var_0_4.instance.invoke(context, z_965, s_965, t_965, u_965, transformer_debug.constLocationInfo604);
            if(term == null)
              break Fail477;
            term = j_965;
            a_966 = j_965;
            IStrategoTerm term203 = term;
            Success232:
            { 
              Fail478:
              { 
                IStrategoTerm b_966 = null;
                IStrategoTerm c_966 = null;
                IStrategoTerm e_966 = null;
                IStrategoTerm f_966 = null;
                IStrategoTerm g_966 = null;
                IStrategoTerm h_966 = null;
                IStrategoTerm j_966 = null;
                IStrategoTerm k_966 = null;
                IStrategoTerm m_966 = null;
                IStrategoTerm n_966 = null;
                IStrategoTerm o_966 = null;
                IStrategoTerm p_966 = null;
                IStrategoTerm q_966 = null;
                IStrategoTerm r_966 = null;
                IStrategoTerm t_966 = null;
                IStrategoTerm u_966 = null;
                IStrategoTerm v_966 = null;
                IStrategoTerm w_966 = null;
                IStrategoTerm x_966 = null;
                IStrategoTerm y_966 = null;
                IStrategoTerm a_967 = null;
                IStrategoTerm b_967 = null;
                IStrategoTerm c_967 = null;
                IStrategoTerm d_967 = null;
                IStrategoTerm e_967 = null;
                IStrategoTerm f_967 = null;
                IStrategoTerm h_967 = null;
                IStrategoTerm i_967 = null;
                IStrategoTerm j_967 = null;
                IStrategoTerm k_967 = null;
                e_966 = term;
                b_966 = transformer_debug.const370;
                f_966 = e_966;
                c_966 = transformer_debug.const377;
                g_966 = f_966;
                term = s_step_0_3.instance.invoke(context, g_966, b_966, c_966, transformer_debug.constLocationInfo605);
                if(term == null)
                  break Fail478;
                m_966 = term;
                j_966 = transformer_debug.const370;
                n_966 = m_966;
                k_966 = transformer_debug.const377;
                o_966 = n_966;
                term = s_step_0_3.instance.invoke(context, o_966, j_966, k_966, transformer_debug.constLocationInfo606);
                if(term == null)
                  break Fail478;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, f_964);
                if(term == null)
                  break Fail478;
                h_966 = term;
                g_964 = term;
                t_966 = h_966;
                p_966 = transformer_debug.const370;
                u_966 = t_966;
                q_966 = transformer_debug.const377;
                v_966 = u_966;
                r_966 = transformer_debug.const383;
                w_966 = v_966;
                term = s_var_0_4.instance.invoke(context, w_966, p_966, q_966, r_966, transformer_debug.constLocationInfo607);
                if(term == null)
                  break Fail478;
                a_967 = term;
                x_966 = transformer_debug.const370;
                b_967 = a_967;
                y_966 = transformer_debug.const377;
                c_967 = b_967;
                term = s_step_0_3.instance.invoke(context, c_967, x_966, y_966, transformer_debug.constLocationInfo608);
                if(term == null)
                  break Fail478;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{g_964, h_964});
                i_964 = term;
                h_967 = term;
                d_967 = transformer_debug.const370;
                i_967 = h_967;
                e_967 = transformer_debug.const377;
                j_967 = i_967;
                f_967 = transformer_debug.const294;
                k_967 = j_967;
                term = s_var_0_4.instance.invoke(context, k_967, d_967, e_967, f_967, transformer_debug.constLocationInfo609);
                if(term == null)
                  break Fail478;
                if(true)
                  break Success232;
              }
              term = term203;
              IStrategoTerm j_964 = null;
              IStrategoTerm k_964 = null;
              IStrategoTerm m_967 = null;
              j_964 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail477;
              k_964 = term;
              m_967 = j_964;
              term = report_with_failure_0_2.instance.invoke(context, m_967, transformer_debug.const384, k_964);
              if(term == null)
                break Fail477;
            }
            term = a_966;
            IStrategoTerm n_967 = null;
            IStrategoTerm o_967 = null;
            IStrategoTerm q_967 = null;
            IStrategoTerm r_967 = null;
            IStrategoTerm s_967 = null;
            if(i_964 == null)
              break Fail477;
            q_967 = i_964;
            n_967 = transformer_debug.const370;
            r_967 = q_967;
            o_967 = transformer_debug.const377;
            s_967 = r_967;
            term = r_exit_0_3.instance.invoke(context, s_967, n_967, o_967, transformer_debug.constLocationInfo600);
            if(term == null)
              break Fail477;
            if(true)
              break Success231;
          }
          term = term202;
        }
        Success233:
        { 
          if(cons23 == transformer_debug._consRec_2)
          { 
            Fail479:
            { 
              IStrategoTerm n_960 = null;
              IStrategoTerm o_960 = null;
              IStrategoTerm p_960 = null;
              IStrategoTerm q_960 = null;
              IStrategoTerm t_960 = null;
              IStrategoTerm u_960 = null;
              IStrategoTerm v_960 = null;
              IStrategoTerm x_960 = null;
              IStrategoTerm y_960 = null;
              IStrategoTerm z_960 = null;
              IStrategoTerm a_961 = null;
              IStrategoTerm b_961 = null;
              IStrategoTerm c_961 = null;
              IStrategoTerm d_961 = null;
              IStrategoTerm f_961 = null;
              IStrategoTerm g_961 = null;
              IStrategoTerm h_961 = null;
              IStrategoTerm i_961 = null;
              IStrategoTerm j_961 = null;
              IStrategoTerm k_961 = null;
              IStrategoTerm l_961 = null;
              IStrategoTerm n_961 = null;
              IStrategoTerm o_961 = null;
              IStrategoTerm p_961 = null;
              IStrategoTerm q_961 = null;
              IStrategoTerm r_961 = null;
              IStrategoTerm s_961 = null;
              IStrategoTerm t_961 = null;
              IStrategoTerm u_961 = null;
              IStrategoTerm w_961 = null;
              IStrategoTerm x_961 = null;
              IStrategoTerm y_961 = null;
              IStrategoTerm z_961 = null;
              IStrategoTerm a_962 = null;
              IStrategoTerm b_962 = null;
              IStrategoTerm c_962 = null;
              IStrategoTerm e_962 = null;
              IStrategoTerm f_962 = null;
              IStrategoTerm g_962 = null;
              IStrategoTerm h_962 = null;
              IStrategoTerm i_962 = null;
              p_960 = term;
              IStrategoList annos81 = term.getAnnotations();
              if(annos81.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos81).isEmpty())
                break Fail479;
              n_960 = ((IStrategoList)annos81).head();
              IStrategoTerm arg141 = ((IStrategoList)annos81).tail();
              if(arg141.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg141).isEmpty())
                break Fail479;
              t_960 = term;
              x_960 = term;
              u_960 = transformer_debug.const370;
              y_960 = x_960;
              v_960 = transformer_debug.const377;
              z_960 = y_960;
              term = r_enter_0_3.instance.invoke(context, z_960, u_960, v_960, transformer_debug.constLocationInfo610);
              if(term == null)
                break Fail479;
              term = t_960;
              a_961 = t_960;
              if(k_1145.value == null)
                break Fail479;
              f_961 = k_1145.value;
              b_961 = transformer_debug.const370;
              g_961 = f_961;
              c_961 = transformer_debug.const377;
              h_961 = g_961;
              d_961 = transformer_debug.const238;
              i_961 = h_961;
              term = s_var_0_4.instance.invoke(context, i_961, b_961, c_961, d_961, transformer_debug.constLocationInfo611);
              if(term == null)
                break Fail479;
              if(l_1145.value == null)
                break Fail479;
              n_961 = l_1145.value;
              j_961 = transformer_debug.const370;
              o_961 = n_961;
              k_961 = transformer_debug.const377;
              p_961 = o_961;
              l_961 = transformer_debug.const239;
              q_961 = p_961;
              term = s_var_0_4.instance.invoke(context, q_961, j_961, k_961, l_961, transformer_debug.constLocationInfo612);
              if(term == null)
                break Fail479;
              r_961 = a_961;
              w_961 = p_960;
              s_961 = transformer_debug.const370;
              x_961 = w_961;
              t_961 = transformer_debug.const377;
              y_961 = x_961;
              u_961 = transformer_debug.const277;
              z_961 = y_961;
              term = s_var_0_4.instance.invoke(context, z_961, s_961, t_961, u_961, transformer_debug.constLocationInfo613);
              if(term == null)
                break Fail479;
              e_962 = n_960;
              a_962 = transformer_debug.const370;
              f_962 = e_962;
              b_962 = transformer_debug.const377;
              g_962 = f_962;
              c_962 = transformer_debug.const381;
              h_962 = g_962;
              term = s_var_0_4.instance.invoke(context, h_962, a_962, b_962, c_962, transformer_debug.constLocationInfo614);
              if(term == null)
                break Fail479;
              term = r_961;
              i_962 = r_961;
              IStrategoTerm term205 = term;
              Success234:
              { 
                Fail480:
                { 
                  IStrategoTerm j_962 = null;
                  IStrategoTerm k_962 = null;
                  IStrategoTerm m_962 = null;
                  IStrategoTerm n_962 = null;
                  IStrategoTerm o_962 = null;
                  IStrategoTerm p_962 = null;
                  IStrategoTerm r_962 = null;
                  IStrategoTerm s_962 = null;
                  IStrategoTerm u_962 = null;
                  IStrategoTerm v_962 = null;
                  IStrategoTerm w_962 = null;
                  IStrategoTerm x_962 = null;
                  IStrategoTerm y_962 = null;
                  IStrategoTerm z_962 = null;
                  IStrategoTerm b_963 = null;
                  IStrategoTerm c_963 = null;
                  IStrategoTerm d_963 = null;
                  IStrategoTerm e_963 = null;
                  IStrategoTerm f_963 = null;
                  IStrategoTerm g_963 = null;
                  IStrategoTerm i_963 = null;
                  IStrategoTerm j_963 = null;
                  IStrategoTerm k_963 = null;
                  IStrategoTerm l_963 = null;
                  IStrategoTerm m_963 = null;
                  IStrategoTerm n_963 = null;
                  IStrategoTerm p_963 = null;
                  IStrategoTerm q_963 = null;
                  IStrategoTerm r_963 = null;
                  IStrategoTerm s_963 = null;
                  m_962 = term;
                  j_962 = transformer_debug.const370;
                  n_962 = m_962;
                  k_962 = transformer_debug.const377;
                  o_962 = n_962;
                  term = s_step_0_3.instance.invoke(context, o_962, j_962, k_962, transformer_debug.constLocationInfo615);
                  if(term == null)
                    break Fail480;
                  u_962 = term;
                  r_962 = transformer_debug.const370;
                  v_962 = u_962;
                  s_962 = transformer_debug.const377;
                  w_962 = v_962;
                  term = s_step_0_3.instance.invoke(context, w_962, r_962, s_962, transformer_debug.constLocationInfo616);
                  if(term == null)
                    break Fail480;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, n_960);
                  if(term == null)
                    break Fail480;
                  p_962 = term;
                  o_960 = term;
                  b_963 = p_962;
                  x_962 = transformer_debug.const370;
                  c_963 = b_963;
                  y_962 = transformer_debug.const377;
                  d_963 = c_963;
                  z_962 = transformer_debug.const383;
                  e_963 = d_963;
                  term = s_var_0_4.instance.invoke(context, e_963, x_962, y_962, z_962, transformer_debug.constLocationInfo617);
                  if(term == null)
                    break Fail480;
                  i_963 = term;
                  f_963 = transformer_debug.const370;
                  j_963 = i_963;
                  g_963 = transformer_debug.const377;
                  k_963 = j_963;
                  term = s_step_0_3.instance.invoke(context, k_963, f_963, g_963, transformer_debug.constLocationInfo618);
                  if(term == null)
                    break Fail480;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{o_960, p_960});
                  q_960 = term;
                  p_963 = term;
                  l_963 = transformer_debug.const370;
                  q_963 = p_963;
                  m_963 = transformer_debug.const377;
                  r_963 = q_963;
                  n_963 = transformer_debug.const294;
                  s_963 = r_963;
                  term = s_var_0_4.instance.invoke(context, s_963, l_963, m_963, n_963, transformer_debug.constLocationInfo619);
                  if(term == null)
                    break Fail480;
                  if(true)
                    break Success234;
                }
                term = term205;
                IStrategoTerm r_960 = null;
                IStrategoTerm s_960 = null;
                IStrategoTerm u_963 = null;
                r_960 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail479;
                s_960 = term;
                u_963 = r_960;
                term = report_with_failure_0_2.instance.invoke(context, u_963, transformer_debug.const384, s_960);
                if(term == null)
                  break Fail479;
              }
              term = i_962;
              IStrategoTerm v_963 = null;
              IStrategoTerm w_963 = null;
              IStrategoTerm y_963 = null;
              IStrategoTerm z_963 = null;
              IStrategoTerm a_964 = null;
              if(q_960 == null)
                break Fail479;
              y_963 = q_960;
              v_963 = transformer_debug.const370;
              z_963 = y_963;
              w_963 = transformer_debug.const377;
              a_964 = z_963;
              term = r_exit_0_3.instance.invoke(context, a_964, v_963, w_963, transformer_debug.constLocationInfo610);
              if(term == null)
                break Fail479;
              if(true)
                break Success233;
            }
            term = term202;
          }
          add_step_to_strategy_0_2_fragment_13 add_step_to_strategy_0_2_fragment_130 = new add_step_to_strategy_0_2_fragment_13();
          add_step_to_strategy_0_2_fragment_130.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_130.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_130.invoke(context, term);
          if(term == null)
            break Fail476;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}