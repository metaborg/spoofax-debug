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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_1 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail541:
    { 
      IStrategoTerm term254 = term;
      IStrategoConstructor cons36 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success283:
      { 
        if(cons36 == transformer_debug._consSome_1)
        { 
          Fail542:
          { 
            IStrategoTerm l_857 = null;
            IStrategoTerm m_857 = null;
            IStrategoTerm n_857 = null;
            IStrategoTerm o_857 = null;
            IStrategoTerm r_857 = null;
            IStrategoTerm s_857 = null;
            IStrategoTerm t_857 = null;
            IStrategoTerm x_857 = null;
            IStrategoTerm y_857 = null;
            IStrategoTerm z_857 = null;
            IStrategoTerm a_858 = null;
            IStrategoTerm b_858 = null;
            IStrategoTerm d_858 = null;
            IStrategoTerm e_858 = null;
            IStrategoTerm j_858 = null;
            IStrategoTerm l_858 = null;
            IStrategoTerm m_858 = null;
            IStrategoTerm n_858 = null;
            IStrategoTerm o_858 = null;
            IStrategoTerm p_858 = null;
            IStrategoTerm q_858 = null;
            IStrategoTerm t_858 = null;
            IStrategoTerm u_858 = null;
            IStrategoTerm v_858 = null;
            IStrategoTerm w_858 = null;
            IStrategoTerm x_858 = null;
            IStrategoTerm y_858 = null;
            IStrategoTerm z_858 = null;
            IStrategoTerm a_859 = null;
            IStrategoTerm d_859 = null;
            IStrategoTerm e_859 = null;
            IStrategoTerm f_859 = null;
            IStrategoTerm g_859 = null;
            IStrategoTerm h_859 = null;
            IStrategoTerm i_859 = null;
            IStrategoTerm j_859 = null;
            IStrategoTerm l_859 = null;
            IStrategoTerm m_859 = null;
            IStrategoTerm n_859 = null;
            IStrategoTerm p_859 = null;
            IStrategoTerm q_859 = null;
            n_857 = term;
            IStrategoList annos106 = term.getAnnotations();
            if(annos106.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos106).isEmpty())
              break Fail542;
            l_857 = ((IStrategoList)annos106).head();
            IStrategoTerm arg199 = ((IStrategoList)annos106).tail();
            if(arg199.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg199).isEmpty())
              break Fail542;
            r_857 = term;
            x_857 = term;
            s_857 = transformer_debug.const370;
            y_857 = x_857;
            t_857 = transformer_debug.const377;
            z_857 = y_857;
            term = r_enter_0_3.instance.invoke(context, z_857, s_857, t_857, transformer_debug.constLocationInfo860);
            if(term == null)
              break Fail542;
            term = r_857;
            a_858 = r_857;
            if(k_1145.value == null)
              break Fail542;
            j_858 = k_1145.value;
            b_858 = transformer_debug.const370;
            l_858 = j_858;
            d_858 = transformer_debug.const377;
            m_858 = l_858;
            e_858 = transformer_debug.const238;
            n_858 = m_858;
            term = s_var_0_4.instance.invoke(context, n_858, b_858, d_858, e_858, transformer_debug.constLocationInfo861);
            if(term == null)
              break Fail542;
            if(l_1145.value == null)
              break Fail542;
            t_858 = l_1145.value;
            o_858 = transformer_debug.const370;
            u_858 = t_858;
            p_858 = transformer_debug.const377;
            v_858 = u_858;
            q_858 = transformer_debug.const239;
            w_858 = v_858;
            term = s_var_0_4.instance.invoke(context, w_858, o_858, p_858, q_858, transformer_debug.constLocationInfo862);
            if(term == null)
              break Fail542;
            x_858 = a_858;
            d_859 = n_857;
            y_858 = transformer_debug.const370;
            e_859 = d_859;
            z_858 = transformer_debug.const377;
            f_859 = e_859;
            a_859 = transformer_debug.const277;
            g_859 = f_859;
            term = s_var_0_4.instance.invoke(context, g_859, y_858, z_858, a_859, transformer_debug.constLocationInfo863);
            if(term == null)
              break Fail542;
            l_859 = l_857;
            h_859 = transformer_debug.const370;
            m_859 = l_859;
            i_859 = transformer_debug.const377;
            n_859 = m_859;
            j_859 = transformer_debug.const381;
            p_859 = n_859;
            term = s_var_0_4.instance.invoke(context, p_859, h_859, i_859, j_859, transformer_debug.constLocationInfo864);
            if(term == null)
              break Fail542;
            term = x_858;
            q_859 = x_858;
            IStrategoTerm term255 = term;
            Success284:
            { 
              Fail543:
              { 
                IStrategoTerm r_859 = null;
                IStrategoTerm s_859 = null;
                IStrategoTerm u_859 = null;
                IStrategoTerm v_859 = null;
                IStrategoTerm w_859 = null;
                IStrategoTerm x_859 = null;
                IStrategoTerm z_859 = null;
                IStrategoTerm a_860 = null;
                IStrategoTerm c_860 = null;
                IStrategoTerm d_860 = null;
                IStrategoTerm e_860 = null;
                IStrategoTerm f_860 = null;
                IStrategoTerm g_860 = null;
                IStrategoTerm h_860 = null;
                IStrategoTerm j_860 = null;
                IStrategoTerm k_860 = null;
                IStrategoTerm l_860 = null;
                IStrategoTerm m_860 = null;
                IStrategoTerm n_860 = null;
                IStrategoTerm o_860 = null;
                IStrategoTerm q_860 = null;
                IStrategoTerm r_860 = null;
                IStrategoTerm s_860 = null;
                IStrategoTerm t_860 = null;
                IStrategoTerm u_860 = null;
                IStrategoTerm v_860 = null;
                IStrategoTerm x_860 = null;
                IStrategoTerm y_860 = null;
                IStrategoTerm z_860 = null;
                IStrategoTerm a_861 = null;
                u_859 = term;
                r_859 = transformer_debug.const370;
                v_859 = u_859;
                s_859 = transformer_debug.const377;
                w_859 = v_859;
                term = s_step_0_3.instance.invoke(context, w_859, r_859, s_859, transformer_debug.constLocationInfo865);
                if(term == null)
                  break Fail543;
                c_860 = term;
                z_859 = transformer_debug.const370;
                d_860 = c_860;
                a_860 = transformer_debug.const377;
                e_860 = d_860;
                term = s_step_0_3.instance.invoke(context, e_860, z_859, a_860, transformer_debug.constLocationInfo866);
                if(term == null)
                  break Fail543;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, l_857);
                if(term == null)
                  break Fail543;
                x_859 = term;
                m_857 = term;
                j_860 = x_859;
                f_860 = transformer_debug.const370;
                k_860 = j_860;
                g_860 = transformer_debug.const377;
                l_860 = k_860;
                h_860 = transformer_debug.const383;
                m_860 = l_860;
                term = s_var_0_4.instance.invoke(context, m_860, f_860, g_860, h_860, transformer_debug.constLocationInfo867);
                if(term == null)
                  break Fail543;
                q_860 = term;
                n_860 = transformer_debug.const370;
                r_860 = q_860;
                o_860 = transformer_debug.const377;
                s_860 = r_860;
                term = s_step_0_3.instance.invoke(context, s_860, n_860, o_860, transformer_debug.constLocationInfo868);
                if(term == null)
                  break Fail543;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{m_857, n_857});
                o_857 = term;
                x_860 = term;
                t_860 = transformer_debug.const370;
                y_860 = x_860;
                u_860 = transformer_debug.const377;
                z_860 = y_860;
                v_860 = transformer_debug.const294;
                a_861 = z_860;
                term = s_var_0_4.instance.invoke(context, a_861, t_860, u_860, v_860, transformer_debug.constLocationInfo869);
                if(term == null)
                  break Fail543;
                if(true)
                  break Success284;
              }
              term = term255;
              IStrategoTerm p_857 = null;
              IStrategoTerm q_857 = null;
              IStrategoTerm c_861 = null;
              p_857 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail542;
              q_857 = term;
              c_861 = p_857;
              term = report_with_failure_0_2.instance.invoke(context, c_861, transformer_debug.const384, q_857);
              if(term == null)
                break Fail542;
            }
            term = q_859;
            IStrategoTerm d_861 = null;
            IStrategoTerm e_861 = null;
            IStrategoTerm g_861 = null;
            IStrategoTerm h_861 = null;
            IStrategoTerm i_861 = null;
            if(o_857 == null)
              break Fail542;
            g_861 = o_857;
            d_861 = transformer_debug.const370;
            h_861 = g_861;
            e_861 = transformer_debug.const377;
            i_861 = h_861;
            term = r_exit_0_3.instance.invoke(context, i_861, d_861, e_861, transformer_debug.constLocationInfo860);
            if(term == null)
              break Fail542;
            if(true)
              break Success283;
          }
          term = term254;
        }
        Success285:
        { 
          if(cons36 == transformer_debug._consOne_1)
          { 
            Fail544:
            { 
              IStrategoTerm i_853 = null;
              IStrategoTerm j_853 = null;
              IStrategoTerm k_853 = null;
              IStrategoTerm l_853 = null;
              IStrategoTerm o_853 = null;
              IStrategoTerm p_853 = null;
              IStrategoTerm q_853 = null;
              IStrategoTerm u_853 = null;
              IStrategoTerm v_853 = null;
              IStrategoTerm x_853 = null;
              IStrategoTerm y_853 = null;
              IStrategoTerm c_854 = null;
              IStrategoTerm d_854 = null;
              IStrategoTerm f_854 = null;
              IStrategoTerm h_854 = null;
              IStrategoTerm i_854 = null;
              IStrategoTerm j_854 = null;
              IStrategoTerm k_854 = null;
              IStrategoTerm m_854 = null;
              IStrategoTerm n_854 = null;
              IStrategoTerm o_854 = null;
              IStrategoTerm q_854 = null;
              IStrategoTerm r_854 = null;
              IStrategoTerm s_854 = null;
              IStrategoTerm t_854 = null;
              IStrategoTerm u_854 = null;
              IStrategoTerm v_854 = null;
              IStrategoTerm x_854 = null;
              IStrategoTerm y_854 = null;
              IStrategoTerm a_855 = null;
              IStrategoTerm b_855 = null;
              IStrategoTerm c_855 = null;
              IStrategoTerm d_855 = null;
              IStrategoTerm e_855 = null;
              IStrategoTerm f_855 = null;
              IStrategoTerm g_855 = null;
              IStrategoTerm j_855 = null;
              IStrategoTerm k_855 = null;
              IStrategoTerm l_855 = null;
              IStrategoTerm m_855 = null;
              IStrategoTerm n_855 = null;
              k_853 = term;
              IStrategoList annos107 = term.getAnnotations();
              if(annos107.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos107).isEmpty())
                break Fail544;
              i_853 = ((IStrategoList)annos107).head();
              IStrategoTerm arg201 = ((IStrategoList)annos107).tail();
              if(arg201.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg201).isEmpty())
                break Fail544;
              o_853 = term;
              u_853 = term;
              p_853 = transformer_debug.const370;
              v_853 = u_853;
              q_853 = transformer_debug.const377;
              x_853 = v_853;
              term = r_enter_0_3.instance.invoke(context, x_853, p_853, q_853, transformer_debug.constLocationInfo870);
              if(term == null)
                break Fail544;
              term = o_853;
              y_853 = o_853;
              if(k_1145.value == null)
                break Fail544;
              h_854 = k_1145.value;
              c_854 = transformer_debug.const370;
              i_854 = h_854;
              d_854 = transformer_debug.const377;
              j_854 = i_854;
              f_854 = transformer_debug.const238;
              k_854 = j_854;
              term = s_var_0_4.instance.invoke(context, k_854, c_854, d_854, f_854, transformer_debug.constLocationInfo871);
              if(term == null)
                break Fail544;
              if(l_1145.value == null)
                break Fail544;
              q_854 = l_1145.value;
              m_854 = transformer_debug.const370;
              r_854 = q_854;
              n_854 = transformer_debug.const377;
              s_854 = r_854;
              o_854 = transformer_debug.const239;
              t_854 = s_854;
              term = s_var_0_4.instance.invoke(context, t_854, m_854, n_854, o_854, transformer_debug.constLocationInfo872);
              if(term == null)
                break Fail544;
              u_854 = y_853;
              a_855 = k_853;
              v_854 = transformer_debug.const370;
              b_855 = a_855;
              x_854 = transformer_debug.const377;
              c_855 = b_855;
              y_854 = transformer_debug.const277;
              d_855 = c_855;
              term = s_var_0_4.instance.invoke(context, d_855, v_854, x_854, y_854, transformer_debug.constLocationInfo873);
              if(term == null)
                break Fail544;
              j_855 = i_853;
              e_855 = transformer_debug.const370;
              k_855 = j_855;
              f_855 = transformer_debug.const377;
              l_855 = k_855;
              g_855 = transformer_debug.const381;
              m_855 = l_855;
              term = s_var_0_4.instance.invoke(context, m_855, e_855, f_855, g_855, transformer_debug.constLocationInfo874);
              if(term == null)
                break Fail544;
              term = u_854;
              n_855 = u_854;
              IStrategoTerm term257 = term;
              Success286:
              { 
                Fail545:
                { 
                  IStrategoTerm o_855 = null;
                  IStrategoTerm p_855 = null;
                  IStrategoTerm r_855 = null;
                  IStrategoTerm s_855 = null;
                  IStrategoTerm t_855 = null;
                  IStrategoTerm u_855 = null;
                  IStrategoTerm w_855 = null;
                  IStrategoTerm x_855 = null;
                  IStrategoTerm z_855 = null;
                  IStrategoTerm a_856 = null;
                  IStrategoTerm b_856 = null;
                  IStrategoTerm c_856 = null;
                  IStrategoTerm d_856 = null;
                  IStrategoTerm e_856 = null;
                  IStrategoTerm g_856 = null;
                  IStrategoTerm h_856 = null;
                  IStrategoTerm i_856 = null;
                  IStrategoTerm j_856 = null;
                  IStrategoTerm k_856 = null;
                  IStrategoTerm l_856 = null;
                  IStrategoTerm n_856 = null;
                  IStrategoTerm o_856 = null;
                  IStrategoTerm p_856 = null;
                  IStrategoTerm q_856 = null;
                  IStrategoTerm r_856 = null;
                  IStrategoTerm s_856 = null;
                  IStrategoTerm u_856 = null;
                  IStrategoTerm v_856 = null;
                  IStrategoTerm w_856 = null;
                  IStrategoTerm x_856 = null;
                  r_855 = term;
                  o_855 = transformer_debug.const370;
                  s_855 = r_855;
                  p_855 = transformer_debug.const377;
                  t_855 = s_855;
                  term = s_step_0_3.instance.invoke(context, t_855, o_855, p_855, transformer_debug.constLocationInfo875);
                  if(term == null)
                    break Fail545;
                  z_855 = term;
                  w_855 = transformer_debug.const370;
                  a_856 = z_855;
                  x_855 = transformer_debug.const377;
                  b_856 = a_856;
                  term = s_step_0_3.instance.invoke(context, b_856, w_855, x_855, transformer_debug.constLocationInfo876);
                  if(term == null)
                    break Fail545;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, i_853);
                  if(term == null)
                    break Fail545;
                  u_855 = term;
                  j_853 = term;
                  g_856 = u_855;
                  c_856 = transformer_debug.const370;
                  h_856 = g_856;
                  d_856 = transformer_debug.const377;
                  i_856 = h_856;
                  e_856 = transformer_debug.const383;
                  j_856 = i_856;
                  term = s_var_0_4.instance.invoke(context, j_856, c_856, d_856, e_856, transformer_debug.constLocationInfo877);
                  if(term == null)
                    break Fail545;
                  n_856 = term;
                  k_856 = transformer_debug.const370;
                  o_856 = n_856;
                  l_856 = transformer_debug.const377;
                  p_856 = o_856;
                  term = s_step_0_3.instance.invoke(context, p_856, k_856, l_856, transformer_debug.constLocationInfo878);
                  if(term == null)
                    break Fail545;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{j_853, k_853});
                  l_853 = term;
                  u_856 = term;
                  q_856 = transformer_debug.const370;
                  v_856 = u_856;
                  r_856 = transformer_debug.const377;
                  w_856 = v_856;
                  s_856 = transformer_debug.const294;
                  x_856 = w_856;
                  term = s_var_0_4.instance.invoke(context, x_856, q_856, r_856, s_856, transformer_debug.constLocationInfo879);
                  if(term == null)
                    break Fail545;
                  if(true)
                    break Success286;
                }
                term = term257;
                IStrategoTerm m_853 = null;
                IStrategoTerm n_853 = null;
                IStrategoTerm z_856 = null;
                m_853 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail544;
                n_853 = term;
                z_856 = m_853;
                term = report_with_failure_0_2.instance.invoke(context, z_856, transformer_debug.const384, n_853);
                if(term == null)
                  break Fail544;
              }
              term = n_855;
              IStrategoTerm a_857 = null;
              IStrategoTerm b_857 = null;
              IStrategoTerm d_857 = null;
              IStrategoTerm e_857 = null;
              IStrategoTerm g_857 = null;
              if(l_853 == null)
                break Fail544;
              d_857 = l_853;
              a_857 = transformer_debug.const370;
              e_857 = d_857;
              b_857 = transformer_debug.const377;
              g_857 = e_857;
              term = r_exit_0_3.instance.invoke(context, g_857, a_857, b_857, transformer_debug.constLocationInfo870);
              if(term == null)
                break Fail544;
              if(true)
                break Success285;
            }
            term = term254;
          }
          add_step_to_strategy_0_2_fragment_0 add_step_to_strategy_0_2_fragment_00 = new add_step_to_strategy_0_2_fragment_0();
          add_step_to_strategy_0_2_fragment_00.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_00.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_00.invoke(context, term);
          if(term == null)
            break Fail541;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}