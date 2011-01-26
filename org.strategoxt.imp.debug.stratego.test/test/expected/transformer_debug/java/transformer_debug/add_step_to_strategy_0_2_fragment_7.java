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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_7 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail511:
    { 
      IStrategoTerm term230 = term;
      IStrategoConstructor cons30 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success259:
      { 
        if(cons30 == transformer_debug._consAssign_2)
        { 
          Fail512:
          { 
            IStrategoTerm t_904 = null;
            IStrategoTerm u_904 = null;
            IStrategoTerm v_904 = null;
            IStrategoTerm w_904 = null;
            IStrategoTerm z_904 = null;
            IStrategoTerm a_905 = null;
            IStrategoTerm b_905 = null;
            IStrategoTerm d_905 = null;
            IStrategoTerm e_905 = null;
            IStrategoTerm f_905 = null;
            IStrategoTerm g_905 = null;
            IStrategoTerm h_905 = null;
            IStrategoTerm i_905 = null;
            IStrategoTerm m_905 = null;
            IStrategoTerm o_905 = null;
            IStrategoTerm p_905 = null;
            IStrategoTerm q_905 = null;
            IStrategoTerm r_905 = null;
            IStrategoTerm s_905 = null;
            IStrategoTerm t_905 = null;
            IStrategoTerm u_905 = null;
            IStrategoTerm x_905 = null;
            IStrategoTerm b_906 = null;
            IStrategoTerm c_906 = null;
            IStrategoTerm e_906 = null;
            IStrategoTerm f_906 = null;
            IStrategoTerm g_906 = null;
            IStrategoTerm h_906 = null;
            IStrategoTerm i_906 = null;
            IStrategoTerm l_906 = null;
            IStrategoTerm m_906 = null;
            IStrategoTerm n_906 = null;
            IStrategoTerm o_906 = null;
            IStrategoTerm p_906 = null;
            IStrategoTerm q_906 = null;
            IStrategoTerm r_906 = null;
            IStrategoTerm t_906 = null;
            IStrategoTerm u_906 = null;
            IStrategoTerm w_906 = null;
            IStrategoTerm x_906 = null;
            IStrategoTerm y_906 = null;
            v_904 = term;
            IStrategoList annos94 = term.getAnnotations();
            if(annos94.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos94).isEmpty())
              break Fail512;
            t_904 = ((IStrategoList)annos94).head();
            IStrategoTerm arg169 = ((IStrategoList)annos94).tail();
            if(arg169.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg169).isEmpty())
              break Fail512;
            z_904 = term;
            d_905 = term;
            a_905 = transformer_debug.const370;
            e_905 = d_905;
            b_905 = transformer_debug.const377;
            f_905 = e_905;
            term = r_enter_0_3.instance.invoke(context, f_905, a_905, b_905, transformer_debug.constLocationInfo740);
            if(term == null)
              break Fail512;
            term = z_904;
            g_905 = z_904;
            if(k_1145.value == null)
              break Fail512;
            o_905 = k_1145.value;
            h_905 = transformer_debug.const370;
            p_905 = o_905;
            i_905 = transformer_debug.const377;
            q_905 = p_905;
            m_905 = transformer_debug.const238;
            r_905 = q_905;
            term = s_var_0_4.instance.invoke(context, r_905, h_905, i_905, m_905, transformer_debug.constLocationInfo741);
            if(term == null)
              break Fail512;
            if(l_1145.value == null)
              break Fail512;
            x_905 = l_1145.value;
            s_905 = transformer_debug.const370;
            b_906 = x_905;
            t_905 = transformer_debug.const377;
            c_906 = b_906;
            u_905 = transformer_debug.const239;
            e_906 = c_906;
            term = s_var_0_4.instance.invoke(context, e_906, s_905, t_905, u_905, transformer_debug.constLocationInfo742);
            if(term == null)
              break Fail512;
            f_906 = g_905;
            l_906 = v_904;
            g_906 = transformer_debug.const370;
            m_906 = l_906;
            h_906 = transformer_debug.const377;
            n_906 = m_906;
            i_906 = transformer_debug.const277;
            o_906 = n_906;
            term = s_var_0_4.instance.invoke(context, o_906, g_906, h_906, i_906, transformer_debug.constLocationInfo743);
            if(term == null)
              break Fail512;
            t_906 = t_904;
            p_906 = transformer_debug.const370;
            u_906 = t_906;
            q_906 = transformer_debug.const377;
            w_906 = u_906;
            r_906 = transformer_debug.const381;
            x_906 = w_906;
            term = s_var_0_4.instance.invoke(context, x_906, p_906, q_906, r_906, transformer_debug.constLocationInfo744);
            if(term == null)
              break Fail512;
            term = f_906;
            y_906 = f_906;
            IStrategoTerm term231 = term;
            Success260:
            { 
              Fail513:
              { 
                IStrategoTerm z_906 = null;
                IStrategoTerm a_907 = null;
                IStrategoTerm c_907 = null;
                IStrategoTerm d_907 = null;
                IStrategoTerm e_907 = null;
                IStrategoTerm f_907 = null;
                IStrategoTerm i_907 = null;
                IStrategoTerm j_907 = null;
                IStrategoTerm l_907 = null;
                IStrategoTerm m_907 = null;
                IStrategoTerm n_907 = null;
                IStrategoTerm o_907 = null;
                IStrategoTerm p_907 = null;
                IStrategoTerm q_907 = null;
                IStrategoTerm s_907 = null;
                IStrategoTerm t_907 = null;
                IStrategoTerm u_907 = null;
                IStrategoTerm v_907 = null;
                IStrategoTerm w_907 = null;
                IStrategoTerm x_907 = null;
                IStrategoTerm z_907 = null;
                IStrategoTerm a_908 = null;
                IStrategoTerm b_908 = null;
                IStrategoTerm c_908 = null;
                IStrategoTerm d_908 = null;
                IStrategoTerm e_908 = null;
                IStrategoTerm g_908 = null;
                IStrategoTerm h_908 = null;
                IStrategoTerm i_908 = null;
                IStrategoTerm j_908 = null;
                c_907 = term;
                z_906 = transformer_debug.const370;
                d_907 = c_907;
                a_907 = transformer_debug.const377;
                e_907 = d_907;
                term = s_step_0_3.instance.invoke(context, e_907, z_906, a_907, transformer_debug.constLocationInfo745);
                if(term == null)
                  break Fail513;
                l_907 = term;
                i_907 = transformer_debug.const370;
                m_907 = l_907;
                j_907 = transformer_debug.const377;
                n_907 = m_907;
                term = s_step_0_3.instance.invoke(context, n_907, i_907, j_907, transformer_debug.constLocationInfo746);
                if(term == null)
                  break Fail513;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, t_904);
                if(term == null)
                  break Fail513;
                f_907 = term;
                u_904 = term;
                s_907 = f_907;
                o_907 = transformer_debug.const370;
                t_907 = s_907;
                p_907 = transformer_debug.const377;
                u_907 = t_907;
                q_907 = transformer_debug.const383;
                v_907 = u_907;
                term = s_var_0_4.instance.invoke(context, v_907, o_907, p_907, q_907, transformer_debug.constLocationInfo747);
                if(term == null)
                  break Fail513;
                z_907 = term;
                w_907 = transformer_debug.const370;
                a_908 = z_907;
                x_907 = transformer_debug.const377;
                b_908 = a_908;
                term = s_step_0_3.instance.invoke(context, b_908, w_907, x_907, transformer_debug.constLocationInfo748);
                if(term == null)
                  break Fail513;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{u_904, v_904});
                w_904 = term;
                g_908 = term;
                c_908 = transformer_debug.const370;
                h_908 = g_908;
                d_908 = transformer_debug.const377;
                i_908 = h_908;
                e_908 = transformer_debug.const294;
                j_908 = i_908;
                term = s_var_0_4.instance.invoke(context, j_908, c_908, d_908, e_908, transformer_debug.constLocationInfo749);
                if(term == null)
                  break Fail513;
                if(true)
                  break Success260;
              }
              term = term231;
              IStrategoTerm x_904 = null;
              IStrategoTerm y_904 = null;
              IStrategoTerm l_908 = null;
              x_904 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail512;
              y_904 = term;
              l_908 = x_904;
              term = report_with_failure_0_2.instance.invoke(context, l_908, transformer_debug.const384, y_904);
              if(term == null)
                break Fail512;
            }
            term = y_906;
            IStrategoTerm m_908 = null;
            IStrategoTerm n_908 = null;
            IStrategoTerm p_908 = null;
            IStrategoTerm q_908 = null;
            IStrategoTerm r_908 = null;
            if(w_904 == null)
              break Fail512;
            p_908 = w_904;
            m_908 = transformer_debug.const370;
            q_908 = p_908;
            n_908 = transformer_debug.const377;
            r_908 = q_908;
            term = r_exit_0_3.instance.invoke(context, r_908, m_908, n_908, transformer_debug.constLocationInfo740);
            if(term == null)
              break Fail512;
            if(true)
              break Success259;
          }
          term = term230;
        }
        Success261:
        { 
          if(cons30 == transformer_debug._consLet_2)
          { 
            Fail514:
            { 
              IStrategoTerm y_900 = null;
              IStrategoTerm z_900 = null;
              IStrategoTerm a_901 = null;
              IStrategoTerm b_901 = null;
              IStrategoTerm e_901 = null;
              IStrategoTerm f_901 = null;
              IStrategoTerm g_901 = null;
              IStrategoTerm j_901 = null;
              IStrategoTerm k_901 = null;
              IStrategoTerm l_901 = null;
              IStrategoTerm m_901 = null;
              IStrategoTerm n_901 = null;
              IStrategoTerm o_901 = null;
              IStrategoTerm p_901 = null;
              IStrategoTerm r_901 = null;
              IStrategoTerm s_901 = null;
              IStrategoTerm t_901 = null;
              IStrategoTerm u_901 = null;
              IStrategoTerm v_901 = null;
              IStrategoTerm w_901 = null;
              IStrategoTerm y_901 = null;
              IStrategoTerm a_902 = null;
              IStrategoTerm b_902 = null;
              IStrategoTerm c_902 = null;
              IStrategoTerm d_902 = null;
              IStrategoTerm e_902 = null;
              IStrategoTerm f_902 = null;
              IStrategoTerm g_902 = null;
              IStrategoTerm h_902 = null;
              IStrategoTerm j_902 = null;
              IStrategoTerm k_902 = null;
              IStrategoTerm l_902 = null;
              IStrategoTerm m_902 = null;
              IStrategoTerm n_902 = null;
              IStrategoTerm o_902 = null;
              IStrategoTerm p_902 = null;
              IStrategoTerm r_902 = null;
              IStrategoTerm s_902 = null;
              IStrategoTerm t_902 = null;
              IStrategoTerm u_902 = null;
              IStrategoTerm v_902 = null;
              a_901 = term;
              IStrategoList annos95 = term.getAnnotations();
              if(annos95.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos95).isEmpty())
                break Fail514;
              y_900 = ((IStrategoList)annos95).head();
              IStrategoTerm arg172 = ((IStrategoList)annos95).tail();
              if(arg172.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg172).isEmpty())
                break Fail514;
              e_901 = term;
              j_901 = term;
              f_901 = transformer_debug.const370;
              k_901 = j_901;
              g_901 = transformer_debug.const377;
              l_901 = k_901;
              term = r_enter_0_3.instance.invoke(context, l_901, f_901, g_901, transformer_debug.constLocationInfo750);
              if(term == null)
                break Fail514;
              term = e_901;
              m_901 = e_901;
              if(k_1145.value == null)
                break Fail514;
              r_901 = k_1145.value;
              n_901 = transformer_debug.const370;
              s_901 = r_901;
              o_901 = transformer_debug.const377;
              t_901 = s_901;
              p_901 = transformer_debug.const238;
              u_901 = t_901;
              term = s_var_0_4.instance.invoke(context, u_901, n_901, o_901, p_901, transformer_debug.constLocationInfo751);
              if(term == null)
                break Fail514;
              if(l_1145.value == null)
                break Fail514;
              a_902 = l_1145.value;
              v_901 = transformer_debug.const370;
              b_902 = a_902;
              w_901 = transformer_debug.const377;
              c_902 = b_902;
              y_901 = transformer_debug.const239;
              d_902 = c_902;
              term = s_var_0_4.instance.invoke(context, d_902, v_901, w_901, y_901, transformer_debug.constLocationInfo752);
              if(term == null)
                break Fail514;
              e_902 = m_901;
              j_902 = a_901;
              f_902 = transformer_debug.const370;
              k_902 = j_902;
              g_902 = transformer_debug.const377;
              l_902 = k_902;
              h_902 = transformer_debug.const277;
              m_902 = l_902;
              term = s_var_0_4.instance.invoke(context, m_902, f_902, g_902, h_902, transformer_debug.constLocationInfo753);
              if(term == null)
                break Fail514;
              r_902 = y_900;
              n_902 = transformer_debug.const370;
              s_902 = r_902;
              o_902 = transformer_debug.const377;
              t_902 = s_902;
              p_902 = transformer_debug.const381;
              u_902 = t_902;
              term = s_var_0_4.instance.invoke(context, u_902, n_902, o_902, p_902, transformer_debug.constLocationInfo754);
              if(term == null)
                break Fail514;
              term = e_902;
              v_902 = e_902;
              IStrategoTerm term233 = term;
              Success262:
              { 
                Fail515:
                { 
                  IStrategoTerm w_902 = null;
                  IStrategoTerm x_902 = null;
                  IStrategoTerm z_902 = null;
                  IStrategoTerm a_903 = null;
                  IStrategoTerm b_903 = null;
                  IStrategoTerm c_903 = null;
                  IStrategoTerm e_903 = null;
                  IStrategoTerm f_903 = null;
                  IStrategoTerm h_903 = null;
                  IStrategoTerm i_903 = null;
                  IStrategoTerm j_903 = null;
                  IStrategoTerm k_903 = null;
                  IStrategoTerm l_903 = null;
                  IStrategoTerm m_903 = null;
                  IStrategoTerm o_903 = null;
                  IStrategoTerm p_903 = null;
                  IStrategoTerm q_903 = null;
                  IStrategoTerm r_903 = null;
                  IStrategoTerm s_903 = null;
                  IStrategoTerm t_903 = null;
                  IStrategoTerm v_903 = null;
                  IStrategoTerm w_903 = null;
                  IStrategoTerm x_903 = null;
                  IStrategoTerm y_903 = null;
                  IStrategoTerm z_903 = null;
                  IStrategoTerm a_904 = null;
                  IStrategoTerm c_904 = null;
                  IStrategoTerm d_904 = null;
                  IStrategoTerm e_904 = null;
                  IStrategoTerm f_904 = null;
                  z_902 = term;
                  w_902 = transformer_debug.const370;
                  a_903 = z_902;
                  x_902 = transformer_debug.const377;
                  b_903 = a_903;
                  term = s_step_0_3.instance.invoke(context, b_903, w_902, x_902, transformer_debug.constLocationInfo755);
                  if(term == null)
                    break Fail515;
                  h_903 = term;
                  e_903 = transformer_debug.const370;
                  i_903 = h_903;
                  f_903 = transformer_debug.const377;
                  j_903 = i_903;
                  term = s_step_0_3.instance.invoke(context, j_903, e_903, f_903, transformer_debug.constLocationInfo756);
                  if(term == null)
                    break Fail515;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, y_900);
                  if(term == null)
                    break Fail515;
                  c_903 = term;
                  z_900 = term;
                  o_903 = c_903;
                  k_903 = transformer_debug.const370;
                  p_903 = o_903;
                  l_903 = transformer_debug.const377;
                  q_903 = p_903;
                  m_903 = transformer_debug.const383;
                  r_903 = q_903;
                  term = s_var_0_4.instance.invoke(context, r_903, k_903, l_903, m_903, transformer_debug.constLocationInfo757);
                  if(term == null)
                    break Fail515;
                  v_903 = term;
                  s_903 = transformer_debug.const370;
                  w_903 = v_903;
                  t_903 = transformer_debug.const377;
                  x_903 = w_903;
                  term = s_step_0_3.instance.invoke(context, x_903, s_903, t_903, transformer_debug.constLocationInfo758);
                  if(term == null)
                    break Fail515;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{z_900, a_901});
                  b_901 = term;
                  c_904 = term;
                  y_903 = transformer_debug.const370;
                  d_904 = c_904;
                  z_903 = transformer_debug.const377;
                  e_904 = d_904;
                  a_904 = transformer_debug.const294;
                  f_904 = e_904;
                  term = s_var_0_4.instance.invoke(context, f_904, y_903, z_903, a_904, transformer_debug.constLocationInfo759);
                  if(term == null)
                    break Fail515;
                  if(true)
                    break Success262;
                }
                term = term233;
                IStrategoTerm c_901 = null;
                IStrategoTerm d_901 = null;
                IStrategoTerm h_904 = null;
                c_901 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail514;
                d_901 = term;
                h_904 = c_901;
                term = report_with_failure_0_2.instance.invoke(context, h_904, transformer_debug.const384, d_901);
                if(term == null)
                  break Fail514;
              }
              term = v_902;
              IStrategoTerm i_904 = null;
              IStrategoTerm j_904 = null;
              IStrategoTerm m_904 = null;
              IStrategoTerm n_904 = null;
              IStrategoTerm o_904 = null;
              if(b_901 == null)
                break Fail514;
              m_904 = b_901;
              i_904 = transformer_debug.const370;
              n_904 = m_904;
              j_904 = transformer_debug.const377;
              o_904 = n_904;
              term = r_exit_0_3.instance.invoke(context, o_904, i_904, j_904, transformer_debug.constLocationInfo750);
              if(term == null)
                break Fail514;
              if(true)
                break Success261;
            }
            term = term230;
          }
          add_step_to_strategy_0_2_fragment_6 add_step_to_strategy_0_2_fragment_60 = new add_step_to_strategy_0_2_fragment_6();
          add_step_to_strategy_0_2_fragment_60.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_60.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_60.invoke(context, term);
          if(term == null)
            break Fail511;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}