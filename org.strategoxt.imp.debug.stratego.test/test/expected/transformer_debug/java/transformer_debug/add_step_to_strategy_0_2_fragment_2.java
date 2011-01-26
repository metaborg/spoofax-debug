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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_2 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail536:
    { 
      IStrategoTerm term250 = term;
      IStrategoConstructor cons35 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success279:
      { 
        if(cons35 == transformer_debug._consScope_2)
        { 
          Fail537:
          { 
            IStrategoTerm k_865 = null;
            IStrategoTerm l_865 = null;
            IStrategoTerm m_865 = null;
            IStrategoTerm n_865 = null;
            IStrategoTerm q_865 = null;
            IStrategoTerm r_865 = null;
            IStrategoTerm s_865 = null;
            IStrategoTerm u_865 = null;
            IStrategoTerm v_865 = null;
            IStrategoTerm w_865 = null;
            IStrategoTerm x_865 = null;
            IStrategoTerm y_865 = null;
            IStrategoTerm z_865 = null;
            IStrategoTerm a_866 = null;
            IStrategoTerm c_866 = null;
            IStrategoTerm d_866 = null;
            IStrategoTerm e_866 = null;
            IStrategoTerm f_866 = null;
            IStrategoTerm g_866 = null;
            IStrategoTerm h_866 = null;
            IStrategoTerm i_866 = null;
            IStrategoTerm k_866 = null;
            IStrategoTerm l_866 = null;
            IStrategoTerm m_866 = null;
            IStrategoTerm n_866 = null;
            IStrategoTerm o_866 = null;
            IStrategoTerm p_866 = null;
            IStrategoTerm q_866 = null;
            IStrategoTerm r_866 = null;
            IStrategoTerm t_866 = null;
            IStrategoTerm u_866 = null;
            IStrategoTerm v_866 = null;
            IStrategoTerm w_866 = null;
            IStrategoTerm x_866 = null;
            IStrategoTerm y_866 = null;
            IStrategoTerm z_866 = null;
            IStrategoTerm b_867 = null;
            IStrategoTerm c_867 = null;
            IStrategoTerm d_867 = null;
            IStrategoTerm e_867 = null;
            IStrategoTerm f_867 = null;
            m_865 = term;
            IStrategoList annos104 = term.getAnnotations();
            if(annos104.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos104).isEmpty())
              break Fail537;
            k_865 = ((IStrategoList)annos104).head();
            IStrategoTerm arg193 = ((IStrategoList)annos104).tail();
            if(arg193.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg193).isEmpty())
              break Fail537;
            q_865 = term;
            u_865 = term;
            r_865 = transformer_debug.const370;
            v_865 = u_865;
            s_865 = transformer_debug.const377;
            w_865 = v_865;
            term = r_enter_0_3.instance.invoke(context, w_865, r_865, s_865, transformer_debug.constLocationInfo840);
            if(term == null)
              break Fail537;
            term = q_865;
            x_865 = q_865;
            if(k_1145.value == null)
              break Fail537;
            c_866 = k_1145.value;
            y_865 = transformer_debug.const370;
            d_866 = c_866;
            z_865 = transformer_debug.const377;
            e_866 = d_866;
            a_866 = transformer_debug.const238;
            f_866 = e_866;
            term = s_var_0_4.instance.invoke(context, f_866, y_865, z_865, a_866, transformer_debug.constLocationInfo841);
            if(term == null)
              break Fail537;
            if(l_1145.value == null)
              break Fail537;
            k_866 = l_1145.value;
            g_866 = transformer_debug.const370;
            l_866 = k_866;
            h_866 = transformer_debug.const377;
            m_866 = l_866;
            i_866 = transformer_debug.const239;
            n_866 = m_866;
            term = s_var_0_4.instance.invoke(context, n_866, g_866, h_866, i_866, transformer_debug.constLocationInfo842);
            if(term == null)
              break Fail537;
            o_866 = x_865;
            t_866 = m_865;
            p_866 = transformer_debug.const370;
            u_866 = t_866;
            q_866 = transformer_debug.const377;
            v_866 = u_866;
            r_866 = transformer_debug.const277;
            w_866 = v_866;
            term = s_var_0_4.instance.invoke(context, w_866, p_866, q_866, r_866, transformer_debug.constLocationInfo843);
            if(term == null)
              break Fail537;
            b_867 = k_865;
            x_866 = transformer_debug.const370;
            c_867 = b_867;
            y_866 = transformer_debug.const377;
            d_867 = c_867;
            z_866 = transformer_debug.const381;
            e_867 = d_867;
            term = s_var_0_4.instance.invoke(context, e_867, x_866, y_866, z_866, transformer_debug.constLocationInfo844);
            if(term == null)
              break Fail537;
            term = o_866;
            f_867 = o_866;
            IStrategoTerm term251 = term;
            Success280:
            { 
              Fail538:
              { 
                IStrategoTerm g_867 = null;
                IStrategoTerm h_867 = null;
                IStrategoTerm j_867 = null;
                IStrategoTerm k_867 = null;
                IStrategoTerm l_867 = null;
                IStrategoTerm m_867 = null;
                IStrategoTerm o_867 = null;
                IStrategoTerm p_867 = null;
                IStrategoTerm r_867 = null;
                IStrategoTerm s_867 = null;
                IStrategoTerm t_867 = null;
                IStrategoTerm u_867 = null;
                IStrategoTerm v_867 = null;
                IStrategoTerm w_867 = null;
                IStrategoTerm y_867 = null;
                IStrategoTerm z_867 = null;
                IStrategoTerm a_868 = null;
                IStrategoTerm b_868 = null;
                IStrategoTerm c_868 = null;
                IStrategoTerm d_868 = null;
                IStrategoTerm f_868 = null;
                IStrategoTerm g_868 = null;
                IStrategoTerm h_868 = null;
                IStrategoTerm i_868 = null;
                IStrategoTerm j_868 = null;
                IStrategoTerm k_868 = null;
                IStrategoTerm m_868 = null;
                IStrategoTerm n_868 = null;
                IStrategoTerm o_868 = null;
                IStrategoTerm p_868 = null;
                j_867 = term;
                g_867 = transformer_debug.const370;
                k_867 = j_867;
                h_867 = transformer_debug.const377;
                l_867 = k_867;
                term = s_step_0_3.instance.invoke(context, l_867, g_867, h_867, transformer_debug.constLocationInfo845);
                if(term == null)
                  break Fail538;
                r_867 = term;
                o_867 = transformer_debug.const370;
                s_867 = r_867;
                p_867 = transformer_debug.const377;
                t_867 = s_867;
                term = s_step_0_3.instance.invoke(context, t_867, o_867, p_867, transformer_debug.constLocationInfo846);
                if(term == null)
                  break Fail538;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, k_865);
                if(term == null)
                  break Fail538;
                m_867 = term;
                l_865 = term;
                y_867 = m_867;
                u_867 = transformer_debug.const370;
                z_867 = y_867;
                v_867 = transformer_debug.const377;
                a_868 = z_867;
                w_867 = transformer_debug.const383;
                b_868 = a_868;
                term = s_var_0_4.instance.invoke(context, b_868, u_867, v_867, w_867, transformer_debug.constLocationInfo847);
                if(term == null)
                  break Fail538;
                f_868 = term;
                c_868 = transformer_debug.const370;
                g_868 = f_868;
                d_868 = transformer_debug.const377;
                h_868 = g_868;
                term = s_step_0_3.instance.invoke(context, h_868, c_868, d_868, transformer_debug.constLocationInfo848);
                if(term == null)
                  break Fail538;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{l_865, m_865});
                n_865 = term;
                m_868 = term;
                i_868 = transformer_debug.const370;
                n_868 = m_868;
                j_868 = transformer_debug.const377;
                o_868 = n_868;
                k_868 = transformer_debug.const294;
                p_868 = o_868;
                term = s_var_0_4.instance.invoke(context, p_868, i_868, j_868, k_868, transformer_debug.constLocationInfo849);
                if(term == null)
                  break Fail538;
                if(true)
                  break Success280;
              }
              term = term251;
              IStrategoTerm o_865 = null;
              IStrategoTerm p_865 = null;
              IStrategoTerm r_868 = null;
              o_865 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail537;
              p_865 = term;
              r_868 = o_865;
              term = report_with_failure_0_2.instance.invoke(context, r_868, transformer_debug.const384, p_865);
              if(term == null)
                break Fail537;
            }
            term = f_867;
            IStrategoTerm s_868 = null;
            IStrategoTerm t_868 = null;
            IStrategoTerm v_868 = null;
            IStrategoTerm w_868 = null;
            IStrategoTerm x_868 = null;
            if(n_865 == null)
              break Fail537;
            v_868 = n_865;
            s_868 = transformer_debug.const370;
            w_868 = v_868;
            t_868 = transformer_debug.const377;
            x_868 = w_868;
            term = r_exit_0_3.instance.invoke(context, x_868, s_868, t_868, transformer_debug.constLocationInfo840);
            if(term == null)
              break Fail537;
            if(true)
              break Success279;
          }
          term = term250;
        }
        Success281:
        { 
          if(cons35 == transformer_debug._consPrimT_3)
          { 
            Fail539:
            { 
              IStrategoTerm o_861 = null;
              IStrategoTerm p_861 = null;
              IStrategoTerm q_861 = null;
              IStrategoTerm r_861 = null;
              IStrategoTerm u_861 = null;
              IStrategoTerm v_861 = null;
              IStrategoTerm w_861 = null;
              IStrategoTerm y_861 = null;
              IStrategoTerm z_861 = null;
              IStrategoTerm a_862 = null;
              IStrategoTerm d_862 = null;
              IStrategoTerm e_862 = null;
              IStrategoTerm g_862 = null;
              IStrategoTerm h_862 = null;
              IStrategoTerm k_862 = null;
              IStrategoTerm l_862 = null;
              IStrategoTerm m_862 = null;
              IStrategoTerm n_862 = null;
              IStrategoTerm o_862 = null;
              IStrategoTerm p_862 = null;
              IStrategoTerm q_862 = null;
              IStrategoTerm s_862 = null;
              IStrategoTerm t_862 = null;
              IStrategoTerm u_862 = null;
              IStrategoTerm v_862 = null;
              IStrategoTerm w_862 = null;
              IStrategoTerm x_862 = null;
              IStrategoTerm y_862 = null;
              IStrategoTerm z_862 = null;
              IStrategoTerm b_863 = null;
              IStrategoTerm c_863 = null;
              IStrategoTerm d_863 = null;
              IStrategoTerm e_863 = null;
              IStrategoTerm f_863 = null;
              IStrategoTerm g_863 = null;
              IStrategoTerm h_863 = null;
              IStrategoTerm j_863 = null;
              IStrategoTerm k_863 = null;
              IStrategoTerm l_863 = null;
              IStrategoTerm m_863 = null;
              IStrategoTerm n_863 = null;
              q_861 = term;
              IStrategoList annos105 = term.getAnnotations();
              if(annos105.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos105).isEmpty())
                break Fail539;
              o_861 = ((IStrategoList)annos105).head();
              IStrategoTerm arg197 = ((IStrategoList)annos105).tail();
              if(arg197.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg197).isEmpty())
                break Fail539;
              u_861 = term;
              y_861 = term;
              v_861 = transformer_debug.const370;
              z_861 = y_861;
              w_861 = transformer_debug.const377;
              a_862 = z_861;
              term = r_enter_0_3.instance.invoke(context, a_862, v_861, w_861, transformer_debug.constLocationInfo850);
              if(term == null)
                break Fail539;
              term = u_861;
              d_862 = u_861;
              if(k_1145.value == null)
                break Fail539;
              k_862 = k_1145.value;
              e_862 = transformer_debug.const370;
              l_862 = k_862;
              g_862 = transformer_debug.const377;
              m_862 = l_862;
              h_862 = transformer_debug.const238;
              n_862 = m_862;
              term = s_var_0_4.instance.invoke(context, n_862, e_862, g_862, h_862, transformer_debug.constLocationInfo851);
              if(term == null)
                break Fail539;
              if(l_1145.value == null)
                break Fail539;
              s_862 = l_1145.value;
              o_862 = transformer_debug.const370;
              t_862 = s_862;
              p_862 = transformer_debug.const377;
              u_862 = t_862;
              q_862 = transformer_debug.const239;
              v_862 = u_862;
              term = s_var_0_4.instance.invoke(context, v_862, o_862, p_862, q_862, transformer_debug.constLocationInfo852);
              if(term == null)
                break Fail539;
              w_862 = d_862;
              b_863 = q_861;
              x_862 = transformer_debug.const370;
              c_863 = b_863;
              y_862 = transformer_debug.const377;
              d_863 = c_863;
              z_862 = transformer_debug.const277;
              e_863 = d_863;
              term = s_var_0_4.instance.invoke(context, e_863, x_862, y_862, z_862, transformer_debug.constLocationInfo853);
              if(term == null)
                break Fail539;
              j_863 = o_861;
              f_863 = transformer_debug.const370;
              k_863 = j_863;
              g_863 = transformer_debug.const377;
              l_863 = k_863;
              h_863 = transformer_debug.const381;
              m_863 = l_863;
              term = s_var_0_4.instance.invoke(context, m_863, f_863, g_863, h_863, transformer_debug.constLocationInfo854);
              if(term == null)
                break Fail539;
              term = w_862;
              n_863 = w_862;
              IStrategoTerm term253 = term;
              Success282:
              { 
                Fail540:
                { 
                  IStrategoTerm o_863 = null;
                  IStrategoTerm p_863 = null;
                  IStrategoTerm r_863 = null;
                  IStrategoTerm s_863 = null;
                  IStrategoTerm t_863 = null;
                  IStrategoTerm u_863 = null;
                  IStrategoTerm w_863 = null;
                  IStrategoTerm x_863 = null;
                  IStrategoTerm z_863 = null;
                  IStrategoTerm a_864 = null;
                  IStrategoTerm b_864 = null;
                  IStrategoTerm c_864 = null;
                  IStrategoTerm d_864 = null;
                  IStrategoTerm e_864 = null;
                  IStrategoTerm g_864 = null;
                  IStrategoTerm h_864 = null;
                  IStrategoTerm i_864 = null;
                  IStrategoTerm j_864 = null;
                  IStrategoTerm k_864 = null;
                  IStrategoTerm l_864 = null;
                  IStrategoTerm n_864 = null;
                  IStrategoTerm o_864 = null;
                  IStrategoTerm p_864 = null;
                  IStrategoTerm q_864 = null;
                  IStrategoTerm r_864 = null;
                  IStrategoTerm s_864 = null;
                  IStrategoTerm u_864 = null;
                  IStrategoTerm v_864 = null;
                  IStrategoTerm w_864 = null;
                  IStrategoTerm x_864 = null;
                  r_863 = term;
                  o_863 = transformer_debug.const370;
                  s_863 = r_863;
                  p_863 = transformer_debug.const377;
                  t_863 = s_863;
                  term = s_step_0_3.instance.invoke(context, t_863, o_863, p_863, transformer_debug.constLocationInfo855);
                  if(term == null)
                    break Fail540;
                  z_863 = term;
                  w_863 = transformer_debug.const370;
                  a_864 = z_863;
                  x_863 = transformer_debug.const377;
                  b_864 = a_864;
                  term = s_step_0_3.instance.invoke(context, b_864, w_863, x_863, transformer_debug.constLocationInfo856);
                  if(term == null)
                    break Fail540;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, o_861);
                  if(term == null)
                    break Fail540;
                  u_863 = term;
                  p_861 = term;
                  g_864 = u_863;
                  c_864 = transformer_debug.const370;
                  h_864 = g_864;
                  d_864 = transformer_debug.const377;
                  i_864 = h_864;
                  e_864 = transformer_debug.const383;
                  j_864 = i_864;
                  term = s_var_0_4.instance.invoke(context, j_864, c_864, d_864, e_864, transformer_debug.constLocationInfo857);
                  if(term == null)
                    break Fail540;
                  n_864 = term;
                  k_864 = transformer_debug.const370;
                  o_864 = n_864;
                  l_864 = transformer_debug.const377;
                  p_864 = o_864;
                  term = s_step_0_3.instance.invoke(context, p_864, k_864, l_864, transformer_debug.constLocationInfo858);
                  if(term == null)
                    break Fail540;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{p_861, q_861});
                  r_861 = term;
                  u_864 = term;
                  q_864 = transformer_debug.const370;
                  v_864 = u_864;
                  r_864 = transformer_debug.const377;
                  w_864 = v_864;
                  s_864 = transformer_debug.const294;
                  x_864 = w_864;
                  term = s_var_0_4.instance.invoke(context, x_864, q_864, r_864, s_864, transformer_debug.constLocationInfo859);
                  if(term == null)
                    break Fail540;
                  if(true)
                    break Success282;
                }
                term = term253;
                IStrategoTerm s_861 = null;
                IStrategoTerm t_861 = null;
                IStrategoTerm z_864 = null;
                s_861 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail539;
                t_861 = term;
                z_864 = s_861;
                term = report_with_failure_0_2.instance.invoke(context, z_864, transformer_debug.const384, t_861);
                if(term == null)
                  break Fail539;
              }
              term = n_863;
              IStrategoTerm a_865 = null;
              IStrategoTerm b_865 = null;
              IStrategoTerm d_865 = null;
              IStrategoTerm e_865 = null;
              IStrategoTerm f_865 = null;
              if(r_861 == null)
                break Fail539;
              d_865 = r_861;
              a_865 = transformer_debug.const370;
              e_865 = d_865;
              b_865 = transformer_debug.const377;
              f_865 = e_865;
              term = r_exit_0_3.instance.invoke(context, f_865, a_865, b_865, transformer_debug.constLocationInfo850);
              if(term == null)
                break Fail539;
              if(true)
                break Success281;
            }
            term = term250;
          }
          add_step_to_strategy_0_2_fragment_1 add_step_to_strategy_0_2_fragment_16 = new add_step_to_strategy_0_2_fragment_1();
          add_step_to_strategy_0_2_fragment_16.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_16.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_16.invoke(context, term);
          if(term == null)
            break Fail536;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}