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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_10 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail496:
    { 
      IStrategoTerm term218 = term;
      IStrategoConstructor cons27 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success247:
      { 
        if(cons27 == transformer_debug._consCallNoArgs_1)
        { 
          Fail497:
          { 
            IStrategoTerm k_929 = null;
            IStrategoTerm l_929 = null;
            IStrategoTerm m_929 = null;
            IStrategoTerm n_929 = null;
            IStrategoTerm q_929 = null;
            IStrategoTerm r_929 = null;
            IStrategoTerm s_929 = null;
            IStrategoTerm u_929 = null;
            IStrategoTerm v_929 = null;
            IStrategoTerm w_929 = null;
            IStrategoTerm y_929 = null;
            IStrategoTerm z_929 = null;
            IStrategoTerm a_930 = null;
            IStrategoTerm b_930 = null;
            IStrategoTerm d_930 = null;
            IStrategoTerm e_930 = null;
            IStrategoTerm f_930 = null;
            IStrategoTerm g_930 = null;
            IStrategoTerm h_930 = null;
            IStrategoTerm i_930 = null;
            IStrategoTerm j_930 = null;
            IStrategoTerm l_930 = null;
            IStrategoTerm m_930 = null;
            IStrategoTerm p_930 = null;
            IStrategoTerm q_930 = null;
            IStrategoTerm s_930 = null;
            IStrategoTerm t_930 = null;
            IStrategoTerm x_930 = null;
            IStrategoTerm y_930 = null;
            IStrategoTerm b_931 = null;
            IStrategoTerm c_931 = null;
            IStrategoTerm d_931 = null;
            IStrategoTerm e_931 = null;
            IStrategoTerm f_931 = null;
            IStrategoTerm h_931 = null;
            IStrategoTerm i_931 = null;
            IStrategoTerm k_931 = null;
            IStrategoTerm l_931 = null;
            IStrategoTerm m_931 = null;
            IStrategoTerm n_931 = null;
            IStrategoTerm o_931 = null;
            m_929 = term;
            IStrategoList annos88 = term.getAnnotations();
            if(annos88.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos88).isEmpty())
              break Fail497;
            k_929 = ((IStrategoList)annos88).head();
            IStrategoTerm arg156 = ((IStrategoList)annos88).tail();
            if(arg156.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg156).isEmpty())
              break Fail497;
            q_929 = term;
            u_929 = term;
            r_929 = transformer_debug.const370;
            v_929 = u_929;
            s_929 = transformer_debug.const377;
            w_929 = v_929;
            term = r_enter_0_3.instance.invoke(context, w_929, r_929, s_929, transformer_debug.constLocationInfo680);
            if(term == null)
              break Fail497;
            term = q_929;
            y_929 = q_929;
            if(k_1145.value == null)
              break Fail497;
            d_930 = k_1145.value;
            z_929 = transformer_debug.const370;
            e_930 = d_930;
            a_930 = transformer_debug.const377;
            f_930 = e_930;
            b_930 = transformer_debug.const238;
            g_930 = f_930;
            term = s_var_0_4.instance.invoke(context, g_930, z_929, a_930, b_930, transformer_debug.constLocationInfo681);
            if(term == null)
              break Fail497;
            if(l_1145.value == null)
              break Fail497;
            l_930 = l_1145.value;
            h_930 = transformer_debug.const370;
            m_930 = l_930;
            i_930 = transformer_debug.const377;
            p_930 = m_930;
            j_930 = transformer_debug.const239;
            q_930 = p_930;
            term = s_var_0_4.instance.invoke(context, q_930, h_930, i_930, j_930, transformer_debug.constLocationInfo682);
            if(term == null)
              break Fail497;
            s_930 = y_929;
            b_931 = m_929;
            t_930 = transformer_debug.const370;
            c_931 = b_931;
            x_930 = transformer_debug.const377;
            d_931 = c_931;
            y_930 = transformer_debug.const277;
            e_931 = d_931;
            term = s_var_0_4.instance.invoke(context, e_931, t_930, x_930, y_930, transformer_debug.constLocationInfo683);
            if(term == null)
              break Fail497;
            k_931 = k_929;
            f_931 = transformer_debug.const370;
            l_931 = k_931;
            h_931 = transformer_debug.const377;
            m_931 = l_931;
            i_931 = transformer_debug.const381;
            n_931 = m_931;
            term = s_var_0_4.instance.invoke(context, n_931, f_931, h_931, i_931, transformer_debug.constLocationInfo684);
            if(term == null)
              break Fail497;
            term = s_930;
            o_931 = s_930;
            IStrategoTerm term219 = term;
            Success248:
            { 
              Fail498:
              { 
                IStrategoTerm p_931 = null;
                IStrategoTerm q_931 = null;
                IStrategoTerm t_931 = null;
                IStrategoTerm u_931 = null;
                IStrategoTerm v_931 = null;
                IStrategoTerm w_931 = null;
                IStrategoTerm y_931 = null;
                IStrategoTerm z_931 = null;
                IStrategoTerm b_932 = null;
                IStrategoTerm c_932 = null;
                IStrategoTerm e_932 = null;
                IStrategoTerm f_932 = null;
                IStrategoTerm g_932 = null;
                IStrategoTerm h_932 = null;
                IStrategoTerm j_932 = null;
                IStrategoTerm k_932 = null;
                IStrategoTerm l_932 = null;
                IStrategoTerm m_932 = null;
                IStrategoTerm n_932 = null;
                IStrategoTerm o_932 = null;
                IStrategoTerm q_932 = null;
                IStrategoTerm r_932 = null;
                IStrategoTerm s_932 = null;
                IStrategoTerm t_932 = null;
                IStrategoTerm u_932 = null;
                IStrategoTerm v_932 = null;
                IStrategoTerm x_932 = null;
                IStrategoTerm y_932 = null;
                IStrategoTerm z_932 = null;
                IStrategoTerm a_933 = null;
                t_931 = term;
                p_931 = transformer_debug.const370;
                u_931 = t_931;
                q_931 = transformer_debug.const377;
                v_931 = u_931;
                term = s_step_0_3.instance.invoke(context, v_931, p_931, q_931, transformer_debug.constLocationInfo685);
                if(term == null)
                  break Fail498;
                b_932 = term;
                y_931 = transformer_debug.const370;
                c_932 = b_932;
                z_931 = transformer_debug.const377;
                e_932 = c_932;
                term = s_step_0_3.instance.invoke(context, e_932, y_931, z_931, transformer_debug.constLocationInfo686);
                if(term == null)
                  break Fail498;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, k_929);
                if(term == null)
                  break Fail498;
                w_931 = term;
                l_929 = term;
                j_932 = w_931;
                f_932 = transformer_debug.const370;
                k_932 = j_932;
                g_932 = transformer_debug.const377;
                l_932 = k_932;
                h_932 = transformer_debug.const383;
                m_932 = l_932;
                term = s_var_0_4.instance.invoke(context, m_932, f_932, g_932, h_932, transformer_debug.constLocationInfo687);
                if(term == null)
                  break Fail498;
                q_932 = term;
                n_932 = transformer_debug.const370;
                r_932 = q_932;
                o_932 = transformer_debug.const377;
                s_932 = r_932;
                term = s_step_0_3.instance.invoke(context, s_932, n_932, o_932, transformer_debug.constLocationInfo688);
                if(term == null)
                  break Fail498;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{l_929, m_929});
                n_929 = term;
                x_932 = term;
                t_932 = transformer_debug.const370;
                y_932 = x_932;
                u_932 = transformer_debug.const377;
                z_932 = y_932;
                v_932 = transformer_debug.const294;
                a_933 = z_932;
                term = s_var_0_4.instance.invoke(context, a_933, t_932, u_932, v_932, transformer_debug.constLocationInfo689);
                if(term == null)
                  break Fail498;
                if(true)
                  break Success248;
              }
              term = term219;
              IStrategoTerm o_929 = null;
              IStrategoTerm p_929 = null;
              IStrategoTerm c_933 = null;
              o_929 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail497;
              p_929 = term;
              c_933 = o_929;
              term = report_with_failure_0_2.instance.invoke(context, c_933, transformer_debug.const384, p_929);
              if(term == null)
                break Fail497;
            }
            term = o_931;
            IStrategoTerm d_933 = null;
            IStrategoTerm e_933 = null;
            IStrategoTerm g_933 = null;
            IStrategoTerm h_933 = null;
            IStrategoTerm i_933 = null;
            if(n_929 == null)
              break Fail497;
            g_933 = n_929;
            d_933 = transformer_debug.const370;
            h_933 = g_933;
            e_933 = transformer_debug.const377;
            i_933 = h_933;
            term = r_exit_0_3.instance.invoke(context, i_933, d_933, e_933, transformer_debug.constLocationInfo680);
            if(term == null)
              break Fail497;
            if(true)
              break Success247;
          }
          term = term218;
        }
        Success249:
        { 
          if(cons27 == transformer_debug._consLRule_1)
          { 
            Fail499:
            { 
              IStrategoTerm i_925 = null;
              IStrategoTerm j_925 = null;
              IStrategoTerm k_925 = null;
              IStrategoTerm l_925 = null;
              IStrategoTerm o_925 = null;
              IStrategoTerm p_925 = null;
              IStrategoTerm q_925 = null;
              IStrategoTerm t_925 = null;
              IStrategoTerm u_925 = null;
              IStrategoTerm v_925 = null;
              IStrategoTerm w_925 = null;
              IStrategoTerm x_925 = null;
              IStrategoTerm y_925 = null;
              IStrategoTerm z_925 = null;
              IStrategoTerm b_926 = null;
              IStrategoTerm c_926 = null;
              IStrategoTerm d_926 = null;
              IStrategoTerm e_926 = null;
              IStrategoTerm f_926 = null;
              IStrategoTerm g_926 = null;
              IStrategoTerm h_926 = null;
              IStrategoTerm j_926 = null;
              IStrategoTerm k_926 = null;
              IStrategoTerm m_926 = null;
              IStrategoTerm n_926 = null;
              IStrategoTerm p_926 = null;
              IStrategoTerm q_926 = null;
              IStrategoTerm u_926 = null;
              IStrategoTerm v_926 = null;
              IStrategoTerm y_926 = null;
              IStrategoTerm z_926 = null;
              IStrategoTerm a_927 = null;
              IStrategoTerm b_927 = null;
              IStrategoTerm c_927 = null;
              IStrategoTerm e_927 = null;
              IStrategoTerm f_927 = null;
              IStrategoTerm h_927 = null;
              IStrategoTerm i_927 = null;
              IStrategoTerm j_927 = null;
              IStrategoTerm k_927 = null;
              IStrategoTerm l_927 = null;
              k_925 = term;
              IStrategoList annos89 = term.getAnnotations();
              if(annos89.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos89).isEmpty())
                break Fail499;
              i_925 = ((IStrategoList)annos89).head();
              IStrategoTerm arg158 = ((IStrategoList)annos89).tail();
              if(arg158.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg158).isEmpty())
                break Fail499;
              o_925 = term;
              t_925 = term;
              p_925 = transformer_debug.const370;
              u_925 = t_925;
              q_925 = transformer_debug.const377;
              v_925 = u_925;
              term = r_enter_0_3.instance.invoke(context, v_925, p_925, q_925, transformer_debug.constLocationInfo690);
              if(term == null)
                break Fail499;
              term = o_925;
              w_925 = o_925;
              if(k_1145.value == null)
                break Fail499;
              b_926 = k_1145.value;
              x_925 = transformer_debug.const370;
              c_926 = b_926;
              y_925 = transformer_debug.const377;
              d_926 = c_926;
              z_925 = transformer_debug.const238;
              e_926 = d_926;
              term = s_var_0_4.instance.invoke(context, e_926, x_925, y_925, z_925, transformer_debug.constLocationInfo691);
              if(term == null)
                break Fail499;
              if(l_1145.value == null)
                break Fail499;
              j_926 = l_1145.value;
              f_926 = transformer_debug.const370;
              k_926 = j_926;
              g_926 = transformer_debug.const377;
              m_926 = k_926;
              h_926 = transformer_debug.const239;
              n_926 = m_926;
              term = s_var_0_4.instance.invoke(context, n_926, f_926, g_926, h_926, transformer_debug.constLocationInfo692);
              if(term == null)
                break Fail499;
              p_926 = w_925;
              y_926 = k_925;
              q_926 = transformer_debug.const370;
              z_926 = y_926;
              u_926 = transformer_debug.const377;
              a_927 = z_926;
              v_926 = transformer_debug.const277;
              b_927 = a_927;
              term = s_var_0_4.instance.invoke(context, b_927, q_926, u_926, v_926, transformer_debug.constLocationInfo693);
              if(term == null)
                break Fail499;
              h_927 = i_925;
              c_927 = transformer_debug.const370;
              i_927 = h_927;
              e_927 = transformer_debug.const377;
              j_927 = i_927;
              f_927 = transformer_debug.const381;
              k_927 = j_927;
              term = s_var_0_4.instance.invoke(context, k_927, c_927, e_927, f_927, transformer_debug.constLocationInfo694);
              if(term == null)
                break Fail499;
              term = p_926;
              l_927 = p_926;
              IStrategoTerm term221 = term;
              Success250:
              { 
                Fail500:
                { 
                  IStrategoTerm m_927 = null;
                  IStrategoTerm n_927 = null;
                  IStrategoTerm q_927 = null;
                  IStrategoTerm r_927 = null;
                  IStrategoTerm s_927 = null;
                  IStrategoTerm t_927 = null;
                  IStrategoTerm v_927 = null;
                  IStrategoTerm w_927 = null;
                  IStrategoTerm y_927 = null;
                  IStrategoTerm z_927 = null;
                  IStrategoTerm b_928 = null;
                  IStrategoTerm c_928 = null;
                  IStrategoTerm d_928 = null;
                  IStrategoTerm e_928 = null;
                  IStrategoTerm g_928 = null;
                  IStrategoTerm h_928 = null;
                  IStrategoTerm i_928 = null;
                  IStrategoTerm j_928 = null;
                  IStrategoTerm k_928 = null;
                  IStrategoTerm l_928 = null;
                  IStrategoTerm n_928 = null;
                  IStrategoTerm o_928 = null;
                  IStrategoTerm p_928 = null;
                  IStrategoTerm q_928 = null;
                  IStrategoTerm r_928 = null;
                  IStrategoTerm s_928 = null;
                  IStrategoTerm u_928 = null;
                  IStrategoTerm v_928 = null;
                  IStrategoTerm w_928 = null;
                  IStrategoTerm x_928 = null;
                  q_927 = term;
                  m_927 = transformer_debug.const370;
                  r_927 = q_927;
                  n_927 = transformer_debug.const377;
                  s_927 = r_927;
                  term = s_step_0_3.instance.invoke(context, s_927, m_927, n_927, transformer_debug.constLocationInfo695);
                  if(term == null)
                    break Fail500;
                  y_927 = term;
                  v_927 = transformer_debug.const370;
                  z_927 = y_927;
                  w_927 = transformer_debug.const377;
                  b_928 = z_927;
                  term = s_step_0_3.instance.invoke(context, b_928, v_927, w_927, transformer_debug.constLocationInfo696);
                  if(term == null)
                    break Fail500;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, i_925);
                  if(term == null)
                    break Fail500;
                  t_927 = term;
                  j_925 = term;
                  g_928 = t_927;
                  c_928 = transformer_debug.const370;
                  h_928 = g_928;
                  d_928 = transformer_debug.const377;
                  i_928 = h_928;
                  e_928 = transformer_debug.const383;
                  j_928 = i_928;
                  term = s_var_0_4.instance.invoke(context, j_928, c_928, d_928, e_928, transformer_debug.constLocationInfo697);
                  if(term == null)
                    break Fail500;
                  n_928 = term;
                  k_928 = transformer_debug.const370;
                  o_928 = n_928;
                  l_928 = transformer_debug.const377;
                  p_928 = o_928;
                  term = s_step_0_3.instance.invoke(context, p_928, k_928, l_928, transformer_debug.constLocationInfo698);
                  if(term == null)
                    break Fail500;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{j_925, k_925});
                  l_925 = term;
                  u_928 = term;
                  q_928 = transformer_debug.const370;
                  v_928 = u_928;
                  r_928 = transformer_debug.const377;
                  w_928 = v_928;
                  s_928 = transformer_debug.const294;
                  x_928 = w_928;
                  term = s_var_0_4.instance.invoke(context, x_928, q_928, r_928, s_928, transformer_debug.constLocationInfo699);
                  if(term == null)
                    break Fail500;
                  if(true)
                    break Success250;
                }
                term = term221;
                IStrategoTerm m_925 = null;
                IStrategoTerm n_925 = null;
                IStrategoTerm z_928 = null;
                m_925 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail499;
                n_925 = term;
                z_928 = m_925;
                term = report_with_failure_0_2.instance.invoke(context, z_928, transformer_debug.const384, n_925);
                if(term == null)
                  break Fail499;
              }
              term = l_927;
              IStrategoTerm a_929 = null;
              IStrategoTerm b_929 = null;
              IStrategoTerm d_929 = null;
              IStrategoTerm e_929 = null;
              IStrategoTerm f_929 = null;
              if(l_925 == null)
                break Fail499;
              d_929 = l_925;
              a_929 = transformer_debug.const370;
              e_929 = d_929;
              b_929 = transformer_debug.const377;
              f_929 = e_929;
              term = r_exit_0_3.instance.invoke(context, f_929, a_929, b_929, transformer_debug.constLocationInfo690);
              if(term == null)
                break Fail499;
              if(true)
                break Success249;
            }
            term = term218;
          }
          add_step_to_strategy_0_2_fragment_9 add_step_to_strategy_0_2_fragment_90 = new add_step_to_strategy_0_2_fragment_9();
          add_step_to_strategy_0_2_fragment_90.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_90.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_90.invoke(context, term);
          if(term == null)
            break Fail496;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}