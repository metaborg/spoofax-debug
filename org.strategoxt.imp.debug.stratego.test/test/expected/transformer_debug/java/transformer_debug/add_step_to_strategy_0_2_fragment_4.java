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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_4 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail526:
    { 
      IStrategoTerm term242 = term;
      IStrategoConstructor cons33 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success271:
      { 
        if(cons33 == transformer_debug._consProceedT_2)
        { 
          Fail527:
          { 
            IStrategoTerm z_880 = null;
            IStrategoTerm a_881 = null;
            IStrategoTerm b_881 = null;
            IStrategoTerm c_881 = null;
            IStrategoTerm f_881 = null;
            IStrategoTerm g_881 = null;
            IStrategoTerm i_881 = null;
            IStrategoTerm k_881 = null;
            IStrategoTerm l_881 = null;
            IStrategoTerm m_881 = null;
            IStrategoTerm n_881 = null;
            IStrategoTerm o_881 = null;
            IStrategoTerm p_881 = null;
            IStrategoTerm q_881 = null;
            IStrategoTerm s_881 = null;
            IStrategoTerm t_881 = null;
            IStrategoTerm u_881 = null;
            IStrategoTerm v_881 = null;
            IStrategoTerm w_881 = null;
            IStrategoTerm x_881 = null;
            IStrategoTerm y_881 = null;
            IStrategoTerm a_882 = null;
            IStrategoTerm b_882 = null;
            IStrategoTerm c_882 = null;
            IStrategoTerm d_882 = null;
            IStrategoTerm e_882 = null;
            IStrategoTerm f_882 = null;
            IStrategoTerm g_882 = null;
            IStrategoTerm h_882 = null;
            IStrategoTerm j_882 = null;
            IStrategoTerm k_882 = null;
            IStrategoTerm l_882 = null;
            IStrategoTerm m_882 = null;
            IStrategoTerm n_882 = null;
            IStrategoTerm o_882 = null;
            IStrategoTerm p_882 = null;
            IStrategoTerm r_882 = null;
            IStrategoTerm s_882 = null;
            IStrategoTerm t_882 = null;
            IStrategoTerm u_882 = null;
            IStrategoTerm v_882 = null;
            b_881 = term;
            IStrategoList annos100 = term.getAnnotations();
            if(annos100.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos100).isEmpty())
              break Fail527;
            z_880 = ((IStrategoList)annos100).head();
            IStrategoTerm arg185 = ((IStrategoList)annos100).tail();
            if(arg185.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg185).isEmpty())
              break Fail527;
            f_881 = term;
            k_881 = term;
            g_881 = transformer_debug.const370;
            l_881 = k_881;
            i_881 = transformer_debug.const377;
            m_881 = l_881;
            term = r_enter_0_3.instance.invoke(context, m_881, g_881, i_881, transformer_debug.constLocationInfo800);
            if(term == null)
              break Fail527;
            term = f_881;
            n_881 = f_881;
            if(k_1145.value == null)
              break Fail527;
            s_881 = k_1145.value;
            o_881 = transformer_debug.const370;
            t_881 = s_881;
            p_881 = transformer_debug.const377;
            u_881 = t_881;
            q_881 = transformer_debug.const238;
            v_881 = u_881;
            term = s_var_0_4.instance.invoke(context, v_881, o_881, p_881, q_881, transformer_debug.constLocationInfo801);
            if(term == null)
              break Fail527;
            if(l_1145.value == null)
              break Fail527;
            a_882 = l_1145.value;
            w_881 = transformer_debug.const370;
            b_882 = a_882;
            x_881 = transformer_debug.const377;
            c_882 = b_882;
            y_881 = transformer_debug.const239;
            d_882 = c_882;
            term = s_var_0_4.instance.invoke(context, d_882, w_881, x_881, y_881, transformer_debug.constLocationInfo802);
            if(term == null)
              break Fail527;
            e_882 = n_881;
            j_882 = b_881;
            f_882 = transformer_debug.const370;
            k_882 = j_882;
            g_882 = transformer_debug.const377;
            l_882 = k_882;
            h_882 = transformer_debug.const277;
            m_882 = l_882;
            term = s_var_0_4.instance.invoke(context, m_882, f_882, g_882, h_882, transformer_debug.constLocationInfo803);
            if(term == null)
              break Fail527;
            r_882 = z_880;
            n_882 = transformer_debug.const370;
            s_882 = r_882;
            o_882 = transformer_debug.const377;
            t_882 = s_882;
            p_882 = transformer_debug.const381;
            u_882 = t_882;
            term = s_var_0_4.instance.invoke(context, u_882, n_882, o_882, p_882, transformer_debug.constLocationInfo804);
            if(term == null)
              break Fail527;
            term = e_882;
            v_882 = e_882;
            IStrategoTerm term243 = term;
            Success272:
            { 
              Fail528:
              { 
                IStrategoTerm w_882 = null;
                IStrategoTerm x_882 = null;
                IStrategoTerm z_882 = null;
                IStrategoTerm a_883 = null;
                IStrategoTerm b_883 = null;
                IStrategoTerm c_883 = null;
                IStrategoTerm e_883 = null;
                IStrategoTerm f_883 = null;
                IStrategoTerm h_883 = null;
                IStrategoTerm i_883 = null;
                IStrategoTerm j_883 = null;
                IStrategoTerm k_883 = null;
                IStrategoTerm l_883 = null;
                IStrategoTerm m_883 = null;
                IStrategoTerm o_883 = null;
                IStrategoTerm p_883 = null;
                IStrategoTerm q_883 = null;
                IStrategoTerm r_883 = null;
                IStrategoTerm s_883 = null;
                IStrategoTerm t_883 = null;
                IStrategoTerm v_883 = null;
                IStrategoTerm w_883 = null;
                IStrategoTerm x_883 = null;
                IStrategoTerm y_883 = null;
                IStrategoTerm z_883 = null;
                IStrategoTerm a_884 = null;
                IStrategoTerm d_884 = null;
                IStrategoTerm e_884 = null;
                IStrategoTerm f_884 = null;
                IStrategoTerm g_884 = null;
                z_882 = term;
                w_882 = transformer_debug.const370;
                a_883 = z_882;
                x_882 = transformer_debug.const377;
                b_883 = a_883;
                term = s_step_0_3.instance.invoke(context, b_883, w_882, x_882, transformer_debug.constLocationInfo805);
                if(term == null)
                  break Fail528;
                h_883 = term;
                e_883 = transformer_debug.const370;
                i_883 = h_883;
                f_883 = transformer_debug.const377;
                j_883 = i_883;
                term = s_step_0_3.instance.invoke(context, j_883, e_883, f_883, transformer_debug.constLocationInfo806);
                if(term == null)
                  break Fail528;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, z_880);
                if(term == null)
                  break Fail528;
                c_883 = term;
                a_881 = term;
                o_883 = c_883;
                k_883 = transformer_debug.const370;
                p_883 = o_883;
                l_883 = transformer_debug.const377;
                q_883 = p_883;
                m_883 = transformer_debug.const383;
                r_883 = q_883;
                term = s_var_0_4.instance.invoke(context, r_883, k_883, l_883, m_883, transformer_debug.constLocationInfo807);
                if(term == null)
                  break Fail528;
                v_883 = term;
                s_883 = transformer_debug.const370;
                w_883 = v_883;
                t_883 = transformer_debug.const377;
                x_883 = w_883;
                term = s_step_0_3.instance.invoke(context, x_883, s_883, t_883, transformer_debug.constLocationInfo808);
                if(term == null)
                  break Fail528;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{a_881, b_881});
                c_881 = term;
                d_884 = term;
                y_883 = transformer_debug.const370;
                e_884 = d_884;
                z_883 = transformer_debug.const377;
                f_884 = e_884;
                a_884 = transformer_debug.const294;
                g_884 = f_884;
                term = s_var_0_4.instance.invoke(context, g_884, y_883, z_883, a_884, transformer_debug.constLocationInfo809);
                if(term == null)
                  break Fail528;
                if(true)
                  break Success272;
              }
              term = term243;
              IStrategoTerm d_881 = null;
              IStrategoTerm e_881 = null;
              IStrategoTerm i_884 = null;
              d_881 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail527;
              e_881 = term;
              i_884 = d_881;
              term = report_with_failure_0_2.instance.invoke(context, i_884, transformer_debug.const384, e_881);
              if(term == null)
                break Fail527;
            }
            term = v_882;
            IStrategoTerm j_884 = null;
            IStrategoTerm k_884 = null;
            IStrategoTerm m_884 = null;
            IStrategoTerm n_884 = null;
            IStrategoTerm o_884 = null;
            if(c_881 == null)
              break Fail527;
            m_884 = c_881;
            j_884 = transformer_debug.const370;
            n_884 = m_884;
            k_884 = transformer_debug.const377;
            o_884 = n_884;
            term = r_exit_0_3.instance.invoke(context, o_884, j_884, k_884, transformer_debug.constLocationInfo800);
            if(term == null)
              break Fail527;
            if(true)
              break Success271;
          }
          term = term242;
        }
        Success273:
        { 
          if(cons33 == transformer_debug._consProceedNoArgs_0)
          { 
            Fail529:
            { 
              IStrategoTerm z_876 = null;
              IStrategoTerm a_877 = null;
              IStrategoTerm b_877 = null;
              IStrategoTerm c_877 = null;
              IStrategoTerm f_877 = null;
              IStrategoTerm g_877 = null;
              IStrategoTerm h_877 = null;
              IStrategoTerm j_877 = null;
              IStrategoTerm k_877 = null;
              IStrategoTerm l_877 = null;
              IStrategoTerm m_877 = null;
              IStrategoTerm n_877 = null;
              IStrategoTerm o_877 = null;
              IStrategoTerm p_877 = null;
              IStrategoTerm s_877 = null;
              IStrategoTerm t_877 = null;
              IStrategoTerm u_877 = null;
              IStrategoTerm v_877 = null;
              IStrategoTerm w_877 = null;
              IStrategoTerm x_877 = null;
              IStrategoTerm y_877 = null;
              IStrategoTerm a_878 = null;
              IStrategoTerm b_878 = null;
              IStrategoTerm c_878 = null;
              IStrategoTerm d_878 = null;
              IStrategoTerm e_878 = null;
              IStrategoTerm f_878 = null;
              IStrategoTerm g_878 = null;
              IStrategoTerm h_878 = null;
              IStrategoTerm j_878 = null;
              IStrategoTerm k_878 = null;
              IStrategoTerm l_878 = null;
              IStrategoTerm m_878 = null;
              IStrategoTerm n_878 = null;
              IStrategoTerm o_878 = null;
              IStrategoTerm p_878 = null;
              IStrategoTerm r_878 = null;
              IStrategoTerm s_878 = null;
              IStrategoTerm t_878 = null;
              IStrategoTerm u_878 = null;
              IStrategoTerm v_878 = null;
              b_877 = term;
              IStrategoList annos101 = term.getAnnotations();
              if(annos101.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos101).isEmpty())
                break Fail529;
              z_876 = ((IStrategoList)annos101).head();
              IStrategoTerm arg186 = ((IStrategoList)annos101).tail();
              if(arg186.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg186).isEmpty())
                break Fail529;
              f_877 = term;
              j_877 = term;
              g_877 = transformer_debug.const370;
              k_877 = j_877;
              h_877 = transformer_debug.const377;
              l_877 = k_877;
              term = r_enter_0_3.instance.invoke(context, l_877, g_877, h_877, transformer_debug.constLocationInfo810);
              if(term == null)
                break Fail529;
              term = f_877;
              m_877 = f_877;
              if(k_1145.value == null)
                break Fail529;
              s_877 = k_1145.value;
              n_877 = transformer_debug.const370;
              t_877 = s_877;
              o_877 = transformer_debug.const377;
              u_877 = t_877;
              p_877 = transformer_debug.const238;
              v_877 = u_877;
              term = s_var_0_4.instance.invoke(context, v_877, n_877, o_877, p_877, transformer_debug.constLocationInfo811);
              if(term == null)
                break Fail529;
              if(l_1145.value == null)
                break Fail529;
              a_878 = l_1145.value;
              w_877 = transformer_debug.const370;
              b_878 = a_878;
              x_877 = transformer_debug.const377;
              c_878 = b_878;
              y_877 = transformer_debug.const239;
              d_878 = c_878;
              term = s_var_0_4.instance.invoke(context, d_878, w_877, x_877, y_877, transformer_debug.constLocationInfo812);
              if(term == null)
                break Fail529;
              e_878 = m_877;
              j_878 = b_877;
              f_878 = transformer_debug.const370;
              k_878 = j_878;
              g_878 = transformer_debug.const377;
              l_878 = k_878;
              h_878 = transformer_debug.const277;
              m_878 = l_878;
              term = s_var_0_4.instance.invoke(context, m_878, f_878, g_878, h_878, transformer_debug.constLocationInfo813);
              if(term == null)
                break Fail529;
              r_878 = z_876;
              n_878 = transformer_debug.const370;
              s_878 = r_878;
              o_878 = transformer_debug.const377;
              t_878 = s_878;
              p_878 = transformer_debug.const381;
              u_878 = t_878;
              term = s_var_0_4.instance.invoke(context, u_878, n_878, o_878, p_878, transformer_debug.constLocationInfo814);
              if(term == null)
                break Fail529;
              term = e_878;
              v_878 = e_878;
              IStrategoTerm term245 = term;
              Success274:
              { 
                Fail530:
                { 
                  IStrategoTerm w_878 = null;
                  IStrategoTerm x_878 = null;
                  IStrategoTerm z_878 = null;
                  IStrategoTerm a_879 = null;
                  IStrategoTerm b_879 = null;
                  IStrategoTerm c_879 = null;
                  IStrategoTerm e_879 = null;
                  IStrategoTerm f_879 = null;
                  IStrategoTerm h_879 = null;
                  IStrategoTerm i_879 = null;
                  IStrategoTerm j_879 = null;
                  IStrategoTerm k_879 = null;
                  IStrategoTerm m_879 = null;
                  IStrategoTerm n_879 = null;
                  IStrategoTerm s_879 = null;
                  IStrategoTerm u_879 = null;
                  IStrategoTerm v_879 = null;
                  IStrategoTerm w_879 = null;
                  IStrategoTerm x_879 = null;
                  IStrategoTerm y_879 = null;
                  IStrategoTerm b_880 = null;
                  IStrategoTerm c_880 = null;
                  IStrategoTerm d_880 = null;
                  IStrategoTerm e_880 = null;
                  IStrategoTerm f_880 = null;
                  IStrategoTerm g_880 = null;
                  IStrategoTerm i_880 = null;
                  IStrategoTerm j_880 = null;
                  IStrategoTerm k_880 = null;
                  IStrategoTerm l_880 = null;
                  z_878 = term;
                  w_878 = transformer_debug.const370;
                  a_879 = z_878;
                  x_878 = transformer_debug.const377;
                  b_879 = a_879;
                  term = s_step_0_3.instance.invoke(context, b_879, w_878, x_878, transformer_debug.constLocationInfo815);
                  if(term == null)
                    break Fail530;
                  h_879 = term;
                  e_879 = transformer_debug.const370;
                  i_879 = h_879;
                  f_879 = transformer_debug.const377;
                  j_879 = i_879;
                  term = s_step_0_3.instance.invoke(context, j_879, e_879, f_879, transformer_debug.constLocationInfo816);
                  if(term == null)
                    break Fail530;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, z_876);
                  if(term == null)
                    break Fail530;
                  c_879 = term;
                  a_877 = term;
                  s_879 = c_879;
                  k_879 = transformer_debug.const370;
                  u_879 = s_879;
                  m_879 = transformer_debug.const377;
                  v_879 = u_879;
                  n_879 = transformer_debug.const383;
                  w_879 = v_879;
                  term = s_var_0_4.instance.invoke(context, w_879, k_879, m_879, n_879, transformer_debug.constLocationInfo817);
                  if(term == null)
                    break Fail530;
                  b_880 = term;
                  x_879 = transformer_debug.const370;
                  c_880 = b_880;
                  y_879 = transformer_debug.const377;
                  d_880 = c_880;
                  term = s_step_0_3.instance.invoke(context, d_880, x_879, y_879, transformer_debug.constLocationInfo818);
                  if(term == null)
                    break Fail530;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{a_877, b_877});
                  c_877 = term;
                  i_880 = term;
                  e_880 = transformer_debug.const370;
                  j_880 = i_880;
                  f_880 = transformer_debug.const377;
                  k_880 = j_880;
                  g_880 = transformer_debug.const294;
                  l_880 = k_880;
                  term = s_var_0_4.instance.invoke(context, l_880, e_880, f_880, g_880, transformer_debug.constLocationInfo819);
                  if(term == null)
                    break Fail530;
                  if(true)
                    break Success274;
                }
                term = term245;
                IStrategoTerm d_877 = null;
                IStrategoTerm e_877 = null;
                IStrategoTerm n_880 = null;
                d_877 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail529;
                e_877 = term;
                n_880 = d_877;
                term = report_with_failure_0_2.instance.invoke(context, n_880, transformer_debug.const384, e_877);
                if(term == null)
                  break Fail529;
              }
              term = v_878;
              IStrategoTerm o_880 = null;
              IStrategoTerm q_880 = null;
              IStrategoTerm s_880 = null;
              IStrategoTerm t_880 = null;
              IStrategoTerm u_880 = null;
              if(c_877 == null)
                break Fail529;
              s_880 = c_877;
              o_880 = transformer_debug.const370;
              t_880 = s_880;
              q_880 = transformer_debug.const377;
              u_880 = t_880;
              term = r_exit_0_3.instance.invoke(context, u_880, o_880, q_880, transformer_debug.constLocationInfo810);
              if(term == null)
                break Fail529;
              if(true)
                break Success273;
            }
            term = term242;
          }
          add_step_to_strategy_0_2_fragment_3 add_step_to_strategy_0_2_fragment_30 = new add_step_to_strategy_0_2_fragment_3();
          add_step_to_strategy_0_2_fragment_30.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_30.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_30.invoke(context, term);
          if(term == null)
            break Fail526;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}