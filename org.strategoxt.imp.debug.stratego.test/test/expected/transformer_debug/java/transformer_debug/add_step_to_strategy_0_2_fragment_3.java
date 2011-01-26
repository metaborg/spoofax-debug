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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_3 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail531:
    { 
      IStrategoTerm term246 = term;
      IStrategoConstructor cons34 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success275:
      { 
        if(cons34 == transformer_debug._consMatch_1)
        { 
          Fail532:
          { 
            IStrategoTerm a_873 = null;
            IStrategoTerm b_873 = null;
            IStrategoTerm f_873 = null;
            IStrategoTerm g_873 = null;
            IStrategoTerm k_873 = null;
            IStrategoTerm l_873 = null;
            IStrategoTerm m_873 = null;
            IStrategoTerm p_873 = null;
            IStrategoTerm q_873 = null;
            IStrategoTerm r_873 = null;
            IStrategoTerm s_873 = null;
            IStrategoTerm t_873 = null;
            IStrategoTerm u_873 = null;
            IStrategoTerm v_873 = null;
            IStrategoTerm x_873 = null;
            IStrategoTerm y_873 = null;
            IStrategoTerm z_873 = null;
            IStrategoTerm a_874 = null;
            IStrategoTerm b_874 = null;
            IStrategoTerm c_874 = null;
            IStrategoTerm e_874 = null;
            IStrategoTerm g_874 = null;
            IStrategoTerm h_874 = null;
            IStrategoTerm i_874 = null;
            IStrategoTerm j_874 = null;
            IStrategoTerm k_874 = null;
            IStrategoTerm l_874 = null;
            IStrategoTerm m_874 = null;
            IStrategoTerm n_874 = null;
            IStrategoTerm p_874 = null;
            IStrategoTerm q_874 = null;
            IStrategoTerm r_874 = null;
            IStrategoTerm s_874 = null;
            IStrategoTerm t_874 = null;
            IStrategoTerm u_874 = null;
            IStrategoTerm w_874 = null;
            IStrategoTerm y_874 = null;
            IStrategoTerm z_874 = null;
            IStrategoTerm a_875 = null;
            IStrategoTerm b_875 = null;
            IStrategoTerm c_875 = null;
            f_873 = term;
            IStrategoList annos102 = term.getAnnotations();
            if(annos102.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos102).isEmpty())
              break Fail532;
            a_873 = ((IStrategoList)annos102).head();
            IStrategoTerm arg188 = ((IStrategoList)annos102).tail();
            if(arg188.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg188).isEmpty())
              break Fail532;
            k_873 = term;
            p_873 = term;
            l_873 = transformer_debug.const370;
            q_873 = p_873;
            m_873 = transformer_debug.const377;
            r_873 = q_873;
            term = r_enter_0_3.instance.invoke(context, r_873, l_873, m_873, transformer_debug.constLocationInfo820);
            if(term == null)
              break Fail532;
            term = k_873;
            s_873 = k_873;
            if(k_1145.value == null)
              break Fail532;
            x_873 = k_1145.value;
            t_873 = transformer_debug.const370;
            y_873 = x_873;
            u_873 = transformer_debug.const377;
            z_873 = y_873;
            v_873 = transformer_debug.const238;
            a_874 = z_873;
            term = s_var_0_4.instance.invoke(context, a_874, t_873, u_873, v_873, transformer_debug.constLocationInfo821);
            if(term == null)
              break Fail532;
            if(l_1145.value == null)
              break Fail532;
            g_874 = l_1145.value;
            b_874 = transformer_debug.const370;
            h_874 = g_874;
            c_874 = transformer_debug.const377;
            i_874 = h_874;
            e_874 = transformer_debug.const239;
            j_874 = i_874;
            term = s_var_0_4.instance.invoke(context, j_874, b_874, c_874, e_874, transformer_debug.constLocationInfo822);
            if(term == null)
              break Fail532;
            k_874 = s_873;
            p_874 = f_873;
            l_874 = transformer_debug.const370;
            q_874 = p_874;
            m_874 = transformer_debug.const377;
            r_874 = q_874;
            n_874 = transformer_debug.const277;
            s_874 = r_874;
            term = s_var_0_4.instance.invoke(context, s_874, l_874, m_874, n_874, transformer_debug.constLocationInfo823);
            if(term == null)
              break Fail532;
            y_874 = a_873;
            t_874 = transformer_debug.const370;
            z_874 = y_874;
            u_874 = transformer_debug.const377;
            a_875 = z_874;
            w_874 = transformer_debug.const381;
            b_875 = a_875;
            term = s_var_0_4.instance.invoke(context, b_875, t_874, u_874, w_874, transformer_debug.constLocationInfo824);
            if(term == null)
              break Fail532;
            term = k_874;
            c_875 = k_874;
            IStrategoTerm term247 = term;
            Success276:
            { 
              Fail533:
              { 
                IStrategoTerm d_875 = null;
                IStrategoTerm e_875 = null;
                IStrategoTerm g_875 = null;
                IStrategoTerm h_875 = null;
                IStrategoTerm i_875 = null;
                IStrategoTerm j_875 = null;
                IStrategoTerm l_875 = null;
                IStrategoTerm m_875 = null;
                IStrategoTerm o_875 = null;
                IStrategoTerm p_875 = null;
                IStrategoTerm q_875 = null;
                IStrategoTerm r_875 = null;
                IStrategoTerm s_875 = null;
                IStrategoTerm t_875 = null;
                IStrategoTerm v_875 = null;
                IStrategoTerm w_875 = null;
                IStrategoTerm x_875 = null;
                IStrategoTerm y_875 = null;
                IStrategoTerm z_875 = null;
                IStrategoTerm a_876 = null;
                IStrategoTerm c_876 = null;
                IStrategoTerm d_876 = null;
                IStrategoTerm e_876 = null;
                IStrategoTerm f_876 = null;
                IStrategoTerm g_876 = null;
                IStrategoTerm h_876 = null;
                IStrategoTerm j_876 = null;
                IStrategoTerm k_876 = null;
                IStrategoTerm l_876 = null;
                IStrategoTerm m_876 = null;
                g_875 = term;
                d_875 = transformer_debug.const370;
                h_875 = g_875;
                e_875 = transformer_debug.const377;
                i_875 = h_875;
                term = s_step_0_3.instance.invoke(context, i_875, d_875, e_875, transformer_debug.constLocationInfo825);
                if(term == null)
                  break Fail533;
                o_875 = term;
                l_875 = transformer_debug.const370;
                p_875 = o_875;
                m_875 = transformer_debug.const377;
                q_875 = p_875;
                term = s_step_0_3.instance.invoke(context, q_875, l_875, m_875, transformer_debug.constLocationInfo826);
                if(term == null)
                  break Fail533;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, a_873);
                if(term == null)
                  break Fail533;
                j_875 = term;
                b_873 = term;
                v_875 = j_875;
                r_875 = transformer_debug.const370;
                w_875 = v_875;
                s_875 = transformer_debug.const377;
                x_875 = w_875;
                t_875 = transformer_debug.const383;
                y_875 = x_875;
                term = s_var_0_4.instance.invoke(context, y_875, r_875, s_875, t_875, transformer_debug.constLocationInfo827);
                if(term == null)
                  break Fail533;
                c_876 = term;
                z_875 = transformer_debug.const370;
                d_876 = c_876;
                a_876 = transformer_debug.const377;
                e_876 = d_876;
                term = s_step_0_3.instance.invoke(context, e_876, z_875, a_876, transformer_debug.constLocationInfo828);
                if(term == null)
                  break Fail533;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{b_873, f_873});
                g_873 = term;
                j_876 = term;
                f_876 = transformer_debug.const370;
                k_876 = j_876;
                g_876 = transformer_debug.const377;
                l_876 = k_876;
                h_876 = transformer_debug.const294;
                m_876 = l_876;
                term = s_var_0_4.instance.invoke(context, m_876, f_876, g_876, h_876, transformer_debug.constLocationInfo829);
                if(term == null)
                  break Fail533;
                if(true)
                  break Success276;
              }
              term = term247;
              IStrategoTerm i_873 = null;
              IStrategoTerm j_873 = null;
              IStrategoTerm o_876 = null;
              i_873 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail532;
              j_873 = term;
              o_876 = i_873;
              term = report_with_failure_0_2.instance.invoke(context, o_876, transformer_debug.const384, j_873);
              if(term == null)
                break Fail532;
            }
            term = c_875;
            IStrategoTerm p_876 = null;
            IStrategoTerm q_876 = null;
            IStrategoTerm s_876 = null;
            IStrategoTerm t_876 = null;
            IStrategoTerm u_876 = null;
            if(g_873 == null)
              break Fail532;
            s_876 = g_873;
            p_876 = transformer_debug.const370;
            t_876 = s_876;
            q_876 = transformer_debug.const377;
            u_876 = t_876;
            term = r_exit_0_3.instance.invoke(context, u_876, p_876, q_876, transformer_debug.constLocationInfo820);
            if(term == null)
              break Fail532;
            if(true)
              break Success275;
          }
          term = term246;
        }
        Success277:
        { 
          if(cons34 == transformer_debug._consBuild_1)
          { 
            Fail534:
            { 
              IStrategoTerm c_869 = null;
              IStrategoTerm d_869 = null;
              IStrategoTerm e_869 = null;
              IStrategoTerm f_869 = null;
              IStrategoTerm i_869 = null;
              IStrategoTerm j_869 = null;
              IStrategoTerm k_869 = null;
              IStrategoTerm m_869 = null;
              IStrategoTerm n_869 = null;
              IStrategoTerm o_869 = null;
              IStrategoTerm p_869 = null;
              IStrategoTerm q_869 = null;
              IStrategoTerm r_869 = null;
              IStrategoTerm s_869 = null;
              IStrategoTerm u_869 = null;
              IStrategoTerm v_869 = null;
              IStrategoTerm w_869 = null;
              IStrategoTerm x_869 = null;
              IStrategoTerm y_869 = null;
              IStrategoTerm z_869 = null;
              IStrategoTerm a_870 = null;
              IStrategoTerm c_870 = null;
              IStrategoTerm d_870 = null;
              IStrategoTerm e_870 = null;
              IStrategoTerm f_870 = null;
              IStrategoTerm g_870 = null;
              IStrategoTerm h_870 = null;
              IStrategoTerm i_870 = null;
              IStrategoTerm j_870 = null;
              IStrategoTerm l_870 = null;
              IStrategoTerm m_870 = null;
              IStrategoTerm n_870 = null;
              IStrategoTerm o_870 = null;
              IStrategoTerm p_870 = null;
              IStrategoTerm q_870 = null;
              IStrategoTerm r_870 = null;
              IStrategoTerm t_870 = null;
              IStrategoTerm u_870 = null;
              IStrategoTerm v_870 = null;
              IStrategoTerm w_870 = null;
              IStrategoTerm x_870 = null;
              e_869 = term;
              IStrategoList annos103 = term.getAnnotations();
              if(annos103.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos103).isEmpty())
                break Fail534;
              c_869 = ((IStrategoList)annos103).head();
              IStrategoTerm arg190 = ((IStrategoList)annos103).tail();
              if(arg190.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg190).isEmpty())
                break Fail534;
              i_869 = term;
              m_869 = term;
              j_869 = transformer_debug.const370;
              n_869 = m_869;
              k_869 = transformer_debug.const377;
              o_869 = n_869;
              term = r_enter_0_3.instance.invoke(context, o_869, j_869, k_869, transformer_debug.constLocationInfo830);
              if(term == null)
                break Fail534;
              term = i_869;
              p_869 = i_869;
              if(k_1145.value == null)
                break Fail534;
              u_869 = k_1145.value;
              q_869 = transformer_debug.const370;
              v_869 = u_869;
              r_869 = transformer_debug.const377;
              w_869 = v_869;
              s_869 = transformer_debug.const238;
              x_869 = w_869;
              term = s_var_0_4.instance.invoke(context, x_869, q_869, r_869, s_869, transformer_debug.constLocationInfo831);
              if(term == null)
                break Fail534;
              if(l_1145.value == null)
                break Fail534;
              c_870 = l_1145.value;
              y_869 = transformer_debug.const370;
              d_870 = c_870;
              z_869 = transformer_debug.const377;
              e_870 = d_870;
              a_870 = transformer_debug.const239;
              f_870 = e_870;
              term = s_var_0_4.instance.invoke(context, f_870, y_869, z_869, a_870, transformer_debug.constLocationInfo832);
              if(term == null)
                break Fail534;
              g_870 = p_869;
              l_870 = e_869;
              h_870 = transformer_debug.const370;
              m_870 = l_870;
              i_870 = transformer_debug.const377;
              n_870 = m_870;
              j_870 = transformer_debug.const277;
              o_870 = n_870;
              term = s_var_0_4.instance.invoke(context, o_870, h_870, i_870, j_870, transformer_debug.constLocationInfo833);
              if(term == null)
                break Fail534;
              t_870 = c_869;
              p_870 = transformer_debug.const370;
              u_870 = t_870;
              q_870 = transformer_debug.const377;
              v_870 = u_870;
              r_870 = transformer_debug.const381;
              w_870 = v_870;
              term = s_var_0_4.instance.invoke(context, w_870, p_870, q_870, r_870, transformer_debug.constLocationInfo834);
              if(term == null)
                break Fail534;
              term = g_870;
              x_870 = g_870;
              IStrategoTerm term249 = term;
              Success278:
              { 
                Fail535:
                { 
                  IStrategoTerm y_870 = null;
                  IStrategoTerm z_870 = null;
                  IStrategoTerm b_871 = null;
                  IStrategoTerm c_871 = null;
                  IStrategoTerm d_871 = null;
                  IStrategoTerm e_871 = null;
                  IStrategoTerm g_871 = null;
                  IStrategoTerm h_871 = null;
                  IStrategoTerm j_871 = null;
                  IStrategoTerm k_871 = null;
                  IStrategoTerm l_871 = null;
                  IStrategoTerm m_871 = null;
                  IStrategoTerm n_871 = null;
                  IStrategoTerm o_871 = null;
                  IStrategoTerm q_871 = null;
                  IStrategoTerm r_871 = null;
                  IStrategoTerm s_871 = null;
                  IStrategoTerm t_871 = null;
                  IStrategoTerm u_871 = null;
                  IStrategoTerm v_871 = null;
                  IStrategoTerm c_872 = null;
                  IStrategoTerm d_872 = null;
                  IStrategoTerm e_872 = null;
                  IStrategoTerm f_872 = null;
                  IStrategoTerm g_872 = null;
                  IStrategoTerm h_872 = null;
                  IStrategoTerm j_872 = null;
                  IStrategoTerm k_872 = null;
                  IStrategoTerm l_872 = null;
                  IStrategoTerm m_872 = null;
                  b_871 = term;
                  y_870 = transformer_debug.const370;
                  c_871 = b_871;
                  z_870 = transformer_debug.const377;
                  d_871 = c_871;
                  term = s_step_0_3.instance.invoke(context, d_871, y_870, z_870, transformer_debug.constLocationInfo835);
                  if(term == null)
                    break Fail535;
                  j_871 = term;
                  g_871 = transformer_debug.const370;
                  k_871 = j_871;
                  h_871 = transformer_debug.const377;
                  l_871 = k_871;
                  term = s_step_0_3.instance.invoke(context, l_871, g_871, h_871, transformer_debug.constLocationInfo836);
                  if(term == null)
                    break Fail535;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, c_869);
                  if(term == null)
                    break Fail535;
                  e_871 = term;
                  d_869 = term;
                  q_871 = e_871;
                  m_871 = transformer_debug.const370;
                  r_871 = q_871;
                  n_871 = transformer_debug.const377;
                  s_871 = r_871;
                  o_871 = transformer_debug.const383;
                  t_871 = s_871;
                  term = s_var_0_4.instance.invoke(context, t_871, m_871, n_871, o_871, transformer_debug.constLocationInfo837);
                  if(term == null)
                    break Fail535;
                  c_872 = term;
                  u_871 = transformer_debug.const370;
                  d_872 = c_872;
                  v_871 = transformer_debug.const377;
                  e_872 = d_872;
                  term = s_step_0_3.instance.invoke(context, e_872, u_871, v_871, transformer_debug.constLocationInfo838);
                  if(term == null)
                    break Fail535;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{d_869, e_869});
                  f_869 = term;
                  j_872 = term;
                  f_872 = transformer_debug.const370;
                  k_872 = j_872;
                  g_872 = transformer_debug.const377;
                  l_872 = k_872;
                  h_872 = transformer_debug.const294;
                  m_872 = l_872;
                  term = s_var_0_4.instance.invoke(context, m_872, f_872, g_872, h_872, transformer_debug.constLocationInfo839);
                  if(term == null)
                    break Fail535;
                  if(true)
                    break Success278;
                }
                term = term249;
                IStrategoTerm g_869 = null;
                IStrategoTerm h_869 = null;
                IStrategoTerm o_872 = null;
                g_869 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail534;
                h_869 = term;
                o_872 = g_869;
                term = report_with_failure_0_2.instance.invoke(context, o_872, transformer_debug.const384, h_869);
                if(term == null)
                  break Fail534;
              }
              term = x_870;
              IStrategoTerm p_872 = null;
              IStrategoTerm q_872 = null;
              IStrategoTerm s_872 = null;
              IStrategoTerm t_872 = null;
              IStrategoTerm u_872 = null;
              if(f_869 == null)
                break Fail534;
              s_872 = f_869;
              p_872 = transformer_debug.const370;
              t_872 = s_872;
              q_872 = transformer_debug.const377;
              u_872 = t_872;
              term = r_exit_0_3.instance.invoke(context, u_872, p_872, q_872, transformer_debug.constLocationInfo830);
              if(term == null)
                break Fail534;
              if(true)
                break Success277;
            }
            term = term246;
          }
          add_step_to_strategy_0_2_fragment_2 add_step_to_strategy_0_2_fragment_20 = new add_step_to_strategy_0_2_fragment_2();
          add_step_to_strategy_0_2_fragment_20.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_20.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_20.invoke(context, term);
          if(term == null)
            break Fail531;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}