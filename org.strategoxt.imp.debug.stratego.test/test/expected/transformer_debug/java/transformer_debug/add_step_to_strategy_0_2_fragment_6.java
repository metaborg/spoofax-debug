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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_6 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail516:
    { 
      IStrategoTerm term234 = term;
      IStrategoConstructor cons31 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success263:
      { 
        if(cons31 == transformer_debug._consCallT_3)
        { 
          Fail517:
          { 
            IStrategoTerm w_896 = null;
            IStrategoTerm x_896 = null;
            IStrategoTerm y_896 = null;
            IStrategoTerm z_896 = null;
            IStrategoTerm c_897 = null;
            IStrategoTerm d_897 = null;
            IStrategoTerm e_897 = null;
            IStrategoTerm g_897 = null;
            IStrategoTerm h_897 = null;
            IStrategoTerm i_897 = null;
            IStrategoTerm j_897 = null;
            IStrategoTerm k_897 = null;
            IStrategoTerm l_897 = null;
            IStrategoTerm m_897 = null;
            IStrategoTerm o_897 = null;
            IStrategoTerm p_897 = null;
            IStrategoTerm q_897 = null;
            IStrategoTerm r_897 = null;
            IStrategoTerm s_897 = null;
            IStrategoTerm t_897 = null;
            IStrategoTerm u_897 = null;
            IStrategoTerm w_897 = null;
            IStrategoTerm x_897 = null;
            IStrategoTerm y_897 = null;
            IStrategoTerm z_897 = null;
            IStrategoTerm a_898 = null;
            IStrategoTerm b_898 = null;
            IStrategoTerm c_898 = null;
            IStrategoTerm d_898 = null;
            IStrategoTerm f_898 = null;
            IStrategoTerm g_898 = null;
            IStrategoTerm h_898 = null;
            IStrategoTerm i_898 = null;
            IStrategoTerm j_898 = null;
            IStrategoTerm k_898 = null;
            IStrategoTerm l_898 = null;
            IStrategoTerm n_898 = null;
            IStrategoTerm o_898 = null;
            IStrategoTerm p_898 = null;
            IStrategoTerm q_898 = null;
            IStrategoTerm r_898 = null;
            y_896 = term;
            IStrategoList annos96 = term.getAnnotations();
            if(annos96.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos96).isEmpty())
              break Fail517;
            w_896 = ((IStrategoList)annos96).head();
            IStrategoTerm arg176 = ((IStrategoList)annos96).tail();
            if(arg176.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg176).isEmpty())
              break Fail517;
            c_897 = term;
            g_897 = term;
            d_897 = transformer_debug.const370;
            h_897 = g_897;
            e_897 = transformer_debug.const377;
            i_897 = h_897;
            term = r_enter_0_3.instance.invoke(context, i_897, d_897, e_897, transformer_debug.constLocationInfo760);
            if(term == null)
              break Fail517;
            term = c_897;
            j_897 = c_897;
            if(k_1145.value == null)
              break Fail517;
            o_897 = k_1145.value;
            k_897 = transformer_debug.const370;
            p_897 = o_897;
            l_897 = transformer_debug.const377;
            q_897 = p_897;
            m_897 = transformer_debug.const238;
            r_897 = q_897;
            term = s_var_0_4.instance.invoke(context, r_897, k_897, l_897, m_897, transformer_debug.constLocationInfo761);
            if(term == null)
              break Fail517;
            if(l_1145.value == null)
              break Fail517;
            w_897 = l_1145.value;
            s_897 = transformer_debug.const370;
            x_897 = w_897;
            t_897 = transformer_debug.const377;
            y_897 = x_897;
            u_897 = transformer_debug.const239;
            z_897 = y_897;
            term = s_var_0_4.instance.invoke(context, z_897, s_897, t_897, u_897, transformer_debug.constLocationInfo762);
            if(term == null)
              break Fail517;
            a_898 = j_897;
            f_898 = y_896;
            b_898 = transformer_debug.const370;
            g_898 = f_898;
            c_898 = transformer_debug.const377;
            h_898 = g_898;
            d_898 = transformer_debug.const277;
            i_898 = h_898;
            term = s_var_0_4.instance.invoke(context, i_898, b_898, c_898, d_898, transformer_debug.constLocationInfo763);
            if(term == null)
              break Fail517;
            n_898 = w_896;
            j_898 = transformer_debug.const370;
            o_898 = n_898;
            k_898 = transformer_debug.const377;
            p_898 = o_898;
            l_898 = transformer_debug.const381;
            q_898 = p_898;
            term = s_var_0_4.instance.invoke(context, q_898, j_898, k_898, l_898, transformer_debug.constLocationInfo764);
            if(term == null)
              break Fail517;
            term = a_898;
            r_898 = a_898;
            IStrategoTerm term235 = term;
            Success264:
            { 
              Fail518:
              { 
                IStrategoTerm s_898 = null;
                IStrategoTerm t_898 = null;
                IStrategoTerm v_898 = null;
                IStrategoTerm w_898 = null;
                IStrategoTerm x_898 = null;
                IStrategoTerm y_898 = null;
                IStrategoTerm a_899 = null;
                IStrategoTerm b_899 = null;
                IStrategoTerm e_899 = null;
                IStrategoTerm f_899 = null;
                IStrategoTerm g_899 = null;
                IStrategoTerm h_899 = null;
                IStrategoTerm i_899 = null;
                IStrategoTerm j_899 = null;
                IStrategoTerm l_899 = null;
                IStrategoTerm m_899 = null;
                IStrategoTerm n_899 = null;
                IStrategoTerm o_899 = null;
                IStrategoTerm p_899 = null;
                IStrategoTerm q_899 = null;
                IStrategoTerm s_899 = null;
                IStrategoTerm t_899 = null;
                IStrategoTerm u_899 = null;
                IStrategoTerm v_899 = null;
                IStrategoTerm w_899 = null;
                IStrategoTerm x_899 = null;
                IStrategoTerm z_899 = null;
                IStrategoTerm d_900 = null;
                IStrategoTerm e_900 = null;
                IStrategoTerm g_900 = null;
                v_898 = term;
                s_898 = transformer_debug.const370;
                w_898 = v_898;
                t_898 = transformer_debug.const377;
                x_898 = w_898;
                term = s_step_0_3.instance.invoke(context, x_898, s_898, t_898, transformer_debug.constLocationInfo765);
                if(term == null)
                  break Fail518;
                e_899 = term;
                a_899 = transformer_debug.const370;
                f_899 = e_899;
                b_899 = transformer_debug.const377;
                g_899 = f_899;
                term = s_step_0_3.instance.invoke(context, g_899, a_899, b_899, transformer_debug.constLocationInfo766);
                if(term == null)
                  break Fail518;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, w_896);
                if(term == null)
                  break Fail518;
                y_898 = term;
                x_896 = term;
                l_899 = y_898;
                h_899 = transformer_debug.const370;
                m_899 = l_899;
                i_899 = transformer_debug.const377;
                n_899 = m_899;
                j_899 = transformer_debug.const383;
                o_899 = n_899;
                term = s_var_0_4.instance.invoke(context, o_899, h_899, i_899, j_899, transformer_debug.constLocationInfo767);
                if(term == null)
                  break Fail518;
                s_899 = term;
                p_899 = transformer_debug.const370;
                t_899 = s_899;
                q_899 = transformer_debug.const377;
                u_899 = t_899;
                term = s_step_0_3.instance.invoke(context, u_899, p_899, q_899, transformer_debug.constLocationInfo768);
                if(term == null)
                  break Fail518;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{x_896, y_896});
                z_896 = term;
                z_899 = term;
                v_899 = transformer_debug.const370;
                d_900 = z_899;
                w_899 = transformer_debug.const377;
                e_900 = d_900;
                x_899 = transformer_debug.const294;
                g_900 = e_900;
                term = s_var_0_4.instance.invoke(context, g_900, v_899, w_899, x_899, transformer_debug.constLocationInfo769);
                if(term == null)
                  break Fail518;
                if(true)
                  break Success264;
              }
              term = term235;
              IStrategoTerm a_897 = null;
              IStrategoTerm b_897 = null;
              IStrategoTerm l_900 = null;
              a_897 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail517;
              b_897 = term;
              l_900 = a_897;
              term = report_with_failure_0_2.instance.invoke(context, l_900, transformer_debug.const384, b_897);
              if(term == null)
                break Fail517;
            }
            term = r_898;
            IStrategoTerm m_900 = null;
            IStrategoTerm o_900 = null;
            IStrategoTerm q_900 = null;
            IStrategoTerm r_900 = null;
            IStrategoTerm s_900 = null;
            if(z_896 == null)
              break Fail517;
            q_900 = z_896;
            m_900 = transformer_debug.const370;
            r_900 = q_900;
            o_900 = transformer_debug.const377;
            s_900 = r_900;
            term = r_exit_0_3.instance.invoke(context, s_900, m_900, o_900, transformer_debug.constLocationInfo760);
            if(term == null)
              break Fail517;
            if(true)
              break Success263;
          }
          term = term234;
        }
        Success265:
        { 
          if(cons31 == transformer_debug._consCallDynamic_3)
          { 
            Fail519:
            { 
              IStrategoTerm u_892 = null;
              IStrategoTerm v_892 = null;
              IStrategoTerm w_892 = null;
              IStrategoTerm x_892 = null;
              IStrategoTerm a_893 = null;
              IStrategoTerm b_893 = null;
              IStrategoTerm c_893 = null;
              IStrategoTerm e_893 = null;
              IStrategoTerm f_893 = null;
              IStrategoTerm g_893 = null;
              IStrategoTerm h_893 = null;
              IStrategoTerm i_893 = null;
              IStrategoTerm j_893 = null;
              IStrategoTerm k_893 = null;
              IStrategoTerm m_893 = null;
              IStrategoTerm n_893 = null;
              IStrategoTerm o_893 = null;
              IStrategoTerm p_893 = null;
              IStrategoTerm q_893 = null;
              IStrategoTerm r_893 = null;
              IStrategoTerm s_893 = null;
              IStrategoTerm u_893 = null;
              IStrategoTerm v_893 = null;
              IStrategoTerm w_893 = null;
              IStrategoTerm x_893 = null;
              IStrategoTerm y_893 = null;
              IStrategoTerm a_894 = null;
              IStrategoTerm b_894 = null;
              IStrategoTerm c_894 = null;
              IStrategoTerm e_894 = null;
              IStrategoTerm f_894 = null;
              IStrategoTerm g_894 = null;
              IStrategoTerm h_894 = null;
              IStrategoTerm i_894 = null;
              IStrategoTerm j_894 = null;
              IStrategoTerm k_894 = null;
              IStrategoTerm m_894 = null;
              IStrategoTerm n_894 = null;
              IStrategoTerm o_894 = null;
              IStrategoTerm p_894 = null;
              IStrategoTerm q_894 = null;
              w_892 = term;
              IStrategoList annos97 = term.getAnnotations();
              if(annos97.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos97).isEmpty())
                break Fail519;
              u_892 = ((IStrategoList)annos97).head();
              IStrategoTerm arg180 = ((IStrategoList)annos97).tail();
              if(arg180.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg180).isEmpty())
                break Fail519;
              a_893 = term;
              e_893 = term;
              b_893 = transformer_debug.const370;
              f_893 = e_893;
              c_893 = transformer_debug.const377;
              g_893 = f_893;
              term = r_enter_0_3.instance.invoke(context, g_893, b_893, c_893, transformer_debug.constLocationInfo770);
              if(term == null)
                break Fail519;
              term = a_893;
              h_893 = a_893;
              if(k_1145.value == null)
                break Fail519;
              m_893 = k_1145.value;
              i_893 = transformer_debug.const370;
              n_893 = m_893;
              j_893 = transformer_debug.const377;
              o_893 = n_893;
              k_893 = transformer_debug.const238;
              p_893 = o_893;
              term = s_var_0_4.instance.invoke(context, p_893, i_893, j_893, k_893, transformer_debug.constLocationInfo771);
              if(term == null)
                break Fail519;
              if(l_1145.value == null)
                break Fail519;
              u_893 = l_1145.value;
              q_893 = transformer_debug.const370;
              v_893 = u_893;
              r_893 = transformer_debug.const377;
              w_893 = v_893;
              s_893 = transformer_debug.const239;
              x_893 = w_893;
              term = s_var_0_4.instance.invoke(context, x_893, q_893, r_893, s_893, transformer_debug.constLocationInfo772);
              if(term == null)
                break Fail519;
              y_893 = h_893;
              e_894 = w_892;
              a_894 = transformer_debug.const370;
              f_894 = e_894;
              b_894 = transformer_debug.const377;
              g_894 = f_894;
              c_894 = transformer_debug.const277;
              h_894 = g_894;
              term = s_var_0_4.instance.invoke(context, h_894, a_894, b_894, c_894, transformer_debug.constLocationInfo773);
              if(term == null)
                break Fail519;
              m_894 = u_892;
              i_894 = transformer_debug.const370;
              n_894 = m_894;
              j_894 = transformer_debug.const377;
              o_894 = n_894;
              k_894 = transformer_debug.const381;
              p_894 = o_894;
              term = s_var_0_4.instance.invoke(context, p_894, i_894, j_894, k_894, transformer_debug.constLocationInfo774);
              if(term == null)
                break Fail519;
              term = y_893;
              q_894 = y_893;
              IStrategoTerm term237 = term;
              Success266:
              { 
                Fail520:
                { 
                  IStrategoTerm r_894 = null;
                  IStrategoTerm s_894 = null;
                  IStrategoTerm v_894 = null;
                  IStrategoTerm x_894 = null;
                  IStrategoTerm y_894 = null;
                  IStrategoTerm c_895 = null;
                  IStrategoTerm f_895 = null;
                  IStrategoTerm g_895 = null;
                  IStrategoTerm i_895 = null;
                  IStrategoTerm j_895 = null;
                  IStrategoTerm k_895 = null;
                  IStrategoTerm m_895 = null;
                  IStrategoTerm n_895 = null;
                  IStrategoTerm o_895 = null;
                  IStrategoTerm q_895 = null;
                  IStrategoTerm r_895 = null;
                  IStrategoTerm s_895 = null;
                  IStrategoTerm t_895 = null;
                  IStrategoTerm u_895 = null;
                  IStrategoTerm v_895 = null;
                  IStrategoTerm x_895 = null;
                  IStrategoTerm z_895 = null;
                  IStrategoTerm a_896 = null;
                  IStrategoTerm b_896 = null;
                  IStrategoTerm c_896 = null;
                  IStrategoTerm d_896 = null;
                  IStrategoTerm f_896 = null;
                  IStrategoTerm g_896 = null;
                  IStrategoTerm h_896 = null;
                  IStrategoTerm i_896 = null;
                  v_894 = term;
                  r_894 = transformer_debug.const370;
                  x_894 = v_894;
                  s_894 = transformer_debug.const377;
                  y_894 = x_894;
                  term = s_step_0_3.instance.invoke(context, y_894, r_894, s_894, transformer_debug.constLocationInfo775);
                  if(term == null)
                    break Fail520;
                  i_895 = term;
                  f_895 = transformer_debug.const370;
                  j_895 = i_895;
                  g_895 = transformer_debug.const377;
                  k_895 = j_895;
                  term = s_step_0_3.instance.invoke(context, k_895, f_895, g_895, transformer_debug.constLocationInfo776);
                  if(term == null)
                    break Fail520;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, u_892);
                  if(term == null)
                    break Fail520;
                  c_895 = term;
                  v_892 = term;
                  q_895 = c_895;
                  m_895 = transformer_debug.const370;
                  r_895 = q_895;
                  n_895 = transformer_debug.const377;
                  s_895 = r_895;
                  o_895 = transformer_debug.const383;
                  t_895 = s_895;
                  term = s_var_0_4.instance.invoke(context, t_895, m_895, n_895, o_895, transformer_debug.constLocationInfo777);
                  if(term == null)
                    break Fail520;
                  x_895 = term;
                  u_895 = transformer_debug.const370;
                  z_895 = x_895;
                  v_895 = transformer_debug.const377;
                  a_896 = z_895;
                  term = s_step_0_3.instance.invoke(context, a_896, u_895, v_895, transformer_debug.constLocationInfo778);
                  if(term == null)
                    break Fail520;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{v_892, w_892});
                  x_892 = term;
                  f_896 = term;
                  b_896 = transformer_debug.const370;
                  g_896 = f_896;
                  c_896 = transformer_debug.const377;
                  h_896 = g_896;
                  d_896 = transformer_debug.const294;
                  i_896 = h_896;
                  term = s_var_0_4.instance.invoke(context, i_896, b_896, c_896, d_896, transformer_debug.constLocationInfo779);
                  if(term == null)
                    break Fail520;
                  if(true)
                    break Success266;
                }
                term = term237;
                IStrategoTerm y_892 = null;
                IStrategoTerm z_892 = null;
                IStrategoTerm k_896 = null;
                y_892 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail519;
                z_892 = term;
                k_896 = y_892;
                term = report_with_failure_0_2.instance.invoke(context, k_896, transformer_debug.const384, z_892);
                if(term == null)
                  break Fail519;
              }
              term = q_894;
              IStrategoTerm l_896 = null;
              IStrategoTerm m_896 = null;
              IStrategoTerm p_896 = null;
              IStrategoTerm q_896 = null;
              IStrategoTerm r_896 = null;
              if(x_892 == null)
                break Fail519;
              p_896 = x_892;
              l_896 = transformer_debug.const370;
              q_896 = p_896;
              m_896 = transformer_debug.const377;
              r_896 = q_896;
              term = r_exit_0_3.instance.invoke(context, r_896, l_896, m_896, transformer_debug.constLocationInfo770);
              if(term == null)
                break Fail519;
              if(true)
                break Success265;
            }
            term = term234;
          }
          add_step_to_strategy_0_2_fragment_5 add_step_to_strategy_0_2_fragment_50 = new add_step_to_strategy_0_2_fragment_5();
          add_step_to_strategy_0_2_fragment_50.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_50.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_50.invoke(context, term);
          if(term == null)
            break Fail516;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}