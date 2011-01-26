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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_5 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail521:
    { 
      IStrategoTerm term238 = term;
      IStrategoConstructor cons32 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success267:
      { 
        if(cons32 == transformer_debug._consFail_0)
        { 
          Fail522:
          { 
            IStrategoTerm t_888 = null;
            IStrategoTerm u_888 = null;
            IStrategoTerm v_888 = null;
            IStrategoTerm w_888 = null;
            IStrategoTerm a_889 = null;
            IStrategoTerm b_889 = null;
            IStrategoTerm c_889 = null;
            IStrategoTerm e_889 = null;
            IStrategoTerm f_889 = null;
            IStrategoTerm g_889 = null;
            IStrategoTerm h_889 = null;
            IStrategoTerm i_889 = null;
            IStrategoTerm j_889 = null;
            IStrategoTerm k_889 = null;
            IStrategoTerm m_889 = null;
            IStrategoTerm n_889 = null;
            IStrategoTerm o_889 = null;
            IStrategoTerm p_889 = null;
            IStrategoTerm q_889 = null;
            IStrategoTerm r_889 = null;
            IStrategoTerm s_889 = null;
            IStrategoTerm u_889 = null;
            IStrategoTerm v_889 = null;
            IStrategoTerm w_889 = null;
            IStrategoTerm x_889 = null;
            IStrategoTerm y_889 = null;
            IStrategoTerm z_889 = null;
            IStrategoTerm a_890 = null;
            IStrategoTerm b_890 = null;
            IStrategoTerm d_890 = null;
            IStrategoTerm e_890 = null;
            IStrategoTerm f_890 = null;
            IStrategoTerm g_890 = null;
            IStrategoTerm h_890 = null;
            IStrategoTerm i_890 = null;
            IStrategoTerm j_890 = null;
            IStrategoTerm l_890 = null;
            IStrategoTerm m_890 = null;
            IStrategoTerm n_890 = null;
            IStrategoTerm o_890 = null;
            IStrategoTerm q_890 = null;
            v_888 = term;
            IStrategoList annos98 = term.getAnnotations();
            if(annos98.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos98).isEmpty())
              break Fail522;
            t_888 = ((IStrategoList)annos98).head();
            IStrategoTerm arg181 = ((IStrategoList)annos98).tail();
            if(arg181.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg181).isEmpty())
              break Fail522;
            a_889 = term;
            e_889 = term;
            b_889 = transformer_debug.const370;
            f_889 = e_889;
            c_889 = transformer_debug.const377;
            g_889 = f_889;
            term = r_enter_0_3.instance.invoke(context, g_889, b_889, c_889, transformer_debug.constLocationInfo780);
            if(term == null)
              break Fail522;
            term = a_889;
            h_889 = a_889;
            if(k_1145.value == null)
              break Fail522;
            m_889 = k_1145.value;
            i_889 = transformer_debug.const370;
            n_889 = m_889;
            j_889 = transformer_debug.const377;
            o_889 = n_889;
            k_889 = transformer_debug.const238;
            p_889 = o_889;
            term = s_var_0_4.instance.invoke(context, p_889, i_889, j_889, k_889, transformer_debug.constLocationInfo781);
            if(term == null)
              break Fail522;
            if(l_1145.value == null)
              break Fail522;
            u_889 = l_1145.value;
            q_889 = transformer_debug.const370;
            v_889 = u_889;
            r_889 = transformer_debug.const377;
            w_889 = v_889;
            s_889 = transformer_debug.const239;
            x_889 = w_889;
            term = s_var_0_4.instance.invoke(context, x_889, q_889, r_889, s_889, transformer_debug.constLocationInfo782);
            if(term == null)
              break Fail522;
            y_889 = h_889;
            d_890 = v_888;
            z_889 = transformer_debug.const370;
            e_890 = d_890;
            a_890 = transformer_debug.const377;
            f_890 = e_890;
            b_890 = transformer_debug.const277;
            g_890 = f_890;
            term = s_var_0_4.instance.invoke(context, g_890, z_889, a_890, b_890, transformer_debug.constLocationInfo783);
            if(term == null)
              break Fail522;
            l_890 = t_888;
            h_890 = transformer_debug.const370;
            m_890 = l_890;
            i_890 = transformer_debug.const377;
            n_890 = m_890;
            j_890 = transformer_debug.const381;
            o_890 = n_890;
            term = s_var_0_4.instance.invoke(context, o_890, h_890, i_890, j_890, transformer_debug.constLocationInfo784);
            if(term == null)
              break Fail522;
            term = y_889;
            q_890 = y_889;
            IStrategoTerm term239 = term;
            Success268:
            { 
              Fail523:
              { 
                IStrategoTerm r_890 = null;
                IStrategoTerm v_890 = null;
                IStrategoTerm y_890 = null;
                IStrategoTerm z_890 = null;
                IStrategoTerm a_891 = null;
                IStrategoTerm b_891 = null;
                IStrategoTerm d_891 = null;
                IStrategoTerm f_891 = null;
                IStrategoTerm h_891 = null;
                IStrategoTerm i_891 = null;
                IStrategoTerm j_891 = null;
                IStrategoTerm k_891 = null;
                IStrategoTerm l_891 = null;
                IStrategoTerm m_891 = null;
                IStrategoTerm p_891 = null;
                IStrategoTerm q_891 = null;
                IStrategoTerm r_891 = null;
                IStrategoTerm s_891 = null;
                IStrategoTerm t_891 = null;
                IStrategoTerm u_891 = null;
                IStrategoTerm w_891 = null;
                IStrategoTerm x_891 = null;
                IStrategoTerm y_891 = null;
                IStrategoTerm a_892 = null;
                IStrategoTerm b_892 = null;
                IStrategoTerm c_892 = null;
                IStrategoTerm e_892 = null;
                IStrategoTerm f_892 = null;
                IStrategoTerm g_892 = null;
                IStrategoTerm h_892 = null;
                y_890 = term;
                r_890 = transformer_debug.const370;
                z_890 = y_890;
                v_890 = transformer_debug.const377;
                a_891 = z_890;
                term = s_step_0_3.instance.invoke(context, a_891, r_890, v_890, transformer_debug.constLocationInfo785);
                if(term == null)
                  break Fail523;
                h_891 = term;
                d_891 = transformer_debug.const370;
                i_891 = h_891;
                f_891 = transformer_debug.const377;
                j_891 = i_891;
                term = s_step_0_3.instance.invoke(context, j_891, d_891, f_891, transformer_debug.constLocationInfo786);
                if(term == null)
                  break Fail523;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, t_888);
                if(term == null)
                  break Fail523;
                b_891 = term;
                u_888 = term;
                p_891 = b_891;
                k_891 = transformer_debug.const370;
                q_891 = p_891;
                l_891 = transformer_debug.const377;
                r_891 = q_891;
                m_891 = transformer_debug.const383;
                s_891 = r_891;
                term = s_var_0_4.instance.invoke(context, s_891, k_891, l_891, m_891, transformer_debug.constLocationInfo787);
                if(term == null)
                  break Fail523;
                w_891 = term;
                t_891 = transformer_debug.const370;
                x_891 = w_891;
                u_891 = transformer_debug.const377;
                y_891 = x_891;
                term = s_step_0_3.instance.invoke(context, y_891, t_891, u_891, transformer_debug.constLocationInfo788);
                if(term == null)
                  break Fail523;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{u_888, v_888});
                w_888 = term;
                e_892 = term;
                a_892 = transformer_debug.const370;
                f_892 = e_892;
                b_892 = transformer_debug.const377;
                g_892 = f_892;
                c_892 = transformer_debug.const294;
                h_892 = g_892;
                term = s_var_0_4.instance.invoke(context, h_892, a_892, b_892, c_892, transformer_debug.constLocationInfo789);
                if(term == null)
                  break Fail523;
                if(true)
                  break Success268;
              }
              term = term239;
              IStrategoTerm y_888 = null;
              IStrategoTerm z_888 = null;
              IStrategoTerm j_892 = null;
              y_888 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail522;
              z_888 = term;
              j_892 = y_888;
              term = report_with_failure_0_2.instance.invoke(context, j_892, transformer_debug.const384, z_888);
              if(term == null)
                break Fail522;
            }
            term = q_890;
            IStrategoTerm k_892 = null;
            IStrategoTerm l_892 = null;
            IStrategoTerm n_892 = null;
            IStrategoTerm o_892 = null;
            IStrategoTerm p_892 = null;
            if(w_888 == null)
              break Fail522;
            n_892 = w_888;
            k_892 = transformer_debug.const370;
            o_892 = n_892;
            l_892 = transformer_debug.const377;
            p_892 = o_892;
            term = r_exit_0_3.instance.invoke(context, p_892, k_892, l_892, transformer_debug.constLocationInfo780);
            if(term == null)
              break Fail522;
            if(true)
              break Success267;
          }
          term = term238;
        }
        Success269:
        { 
          if(cons32 == transformer_debug._consId_0)
          { 
            Fail524:
            { 
              IStrategoTerm t_884 = null;
              IStrategoTerm u_884 = null;
              IStrategoTerm v_884 = null;
              IStrategoTerm w_884 = null;
              IStrategoTerm z_884 = null;
              IStrategoTerm a_885 = null;
              IStrategoTerm b_885 = null;
              IStrategoTerm e_885 = null;
              IStrategoTerm i_885 = null;
              IStrategoTerm j_885 = null;
              IStrategoTerm l_885 = null;
              IStrategoTerm m_885 = null;
              IStrategoTerm n_885 = null;
              IStrategoTerm o_885 = null;
              IStrategoTerm q_885 = null;
              IStrategoTerm s_885 = null;
              IStrategoTerm t_885 = null;
              IStrategoTerm u_885 = null;
              IStrategoTerm v_885 = null;
              IStrategoTerm w_885 = null;
              IStrategoTerm x_885 = null;
              IStrategoTerm z_885 = null;
              IStrategoTerm a_886 = null;
              IStrategoTerm b_886 = null;
              IStrategoTerm d_886 = null;
              IStrategoTerm e_886 = null;
              IStrategoTerm f_886 = null;
              IStrategoTerm g_886 = null;
              IStrategoTerm h_886 = null;
              IStrategoTerm j_886 = null;
              IStrategoTerm k_886 = null;
              IStrategoTerm l_886 = null;
              IStrategoTerm m_886 = null;
              IStrategoTerm n_886 = null;
              IStrategoTerm o_886 = null;
              IStrategoTerm p_886 = null;
              IStrategoTerm s_886 = null;
              IStrategoTerm t_886 = null;
              IStrategoTerm u_886 = null;
              IStrategoTerm v_886 = null;
              IStrategoTerm w_886 = null;
              v_884 = term;
              IStrategoList annos99 = term.getAnnotations();
              if(annos99.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos99).isEmpty())
                break Fail524;
              t_884 = ((IStrategoList)annos99).head();
              IStrategoTerm arg182 = ((IStrategoList)annos99).tail();
              if(arg182.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg182).isEmpty())
                break Fail524;
              z_884 = term;
              e_885 = term;
              a_885 = transformer_debug.const370;
              i_885 = e_885;
              b_885 = transformer_debug.const377;
              j_885 = i_885;
              term = r_enter_0_3.instance.invoke(context, j_885, a_885, b_885, transformer_debug.constLocationInfo790);
              if(term == null)
                break Fail524;
              term = z_884;
              l_885 = z_884;
              if(k_1145.value == null)
                break Fail524;
              q_885 = k_1145.value;
              m_885 = transformer_debug.const370;
              s_885 = q_885;
              n_885 = transformer_debug.const377;
              t_885 = s_885;
              o_885 = transformer_debug.const238;
              u_885 = t_885;
              term = s_var_0_4.instance.invoke(context, u_885, m_885, n_885, o_885, transformer_debug.constLocationInfo791);
              if(term == null)
                break Fail524;
              if(l_1145.value == null)
                break Fail524;
              z_885 = l_1145.value;
              v_885 = transformer_debug.const370;
              a_886 = z_885;
              w_885 = transformer_debug.const377;
              b_886 = a_886;
              x_885 = transformer_debug.const239;
              d_886 = b_886;
              term = s_var_0_4.instance.invoke(context, d_886, v_885, w_885, x_885, transformer_debug.constLocationInfo792);
              if(term == null)
                break Fail524;
              e_886 = l_885;
              j_886 = v_884;
              f_886 = transformer_debug.const370;
              k_886 = j_886;
              g_886 = transformer_debug.const377;
              l_886 = k_886;
              h_886 = transformer_debug.const277;
              m_886 = l_886;
              term = s_var_0_4.instance.invoke(context, m_886, f_886, g_886, h_886, transformer_debug.constLocationInfo793);
              if(term == null)
                break Fail524;
              s_886 = t_884;
              n_886 = transformer_debug.const370;
              t_886 = s_886;
              o_886 = transformer_debug.const377;
              u_886 = t_886;
              p_886 = transformer_debug.const381;
              v_886 = u_886;
              term = s_var_0_4.instance.invoke(context, v_886, n_886, o_886, p_886, transformer_debug.constLocationInfo794);
              if(term == null)
                break Fail524;
              term = e_886;
              w_886 = e_886;
              IStrategoTerm term241 = term;
              Success270:
              { 
                Fail525:
                { 
                  IStrategoTerm x_886 = null;
                  IStrategoTerm y_886 = null;
                  IStrategoTerm a_887 = null;
                  IStrategoTerm b_887 = null;
                  IStrategoTerm c_887 = null;
                  IStrategoTerm d_887 = null;
                  IStrategoTerm f_887 = null;
                  IStrategoTerm g_887 = null;
                  IStrategoTerm i_887 = null;
                  IStrategoTerm j_887 = null;
                  IStrategoTerm k_887 = null;
                  IStrategoTerm l_887 = null;
                  IStrategoTerm m_887 = null;
                  IStrategoTerm n_887 = null;
                  IStrategoTerm p_887 = null;
                  IStrategoTerm q_887 = null;
                  IStrategoTerm r_887 = null;
                  IStrategoTerm s_887 = null;
                  IStrategoTerm t_887 = null;
                  IStrategoTerm u_887 = null;
                  IStrategoTerm w_887 = null;
                  IStrategoTerm x_887 = null;
                  IStrategoTerm y_887 = null;
                  IStrategoTerm z_887 = null;
                  IStrategoTerm a_888 = null;
                  IStrategoTerm b_888 = null;
                  IStrategoTerm d_888 = null;
                  IStrategoTerm e_888 = null;
                  IStrategoTerm f_888 = null;
                  IStrategoTerm g_888 = null;
                  a_887 = term;
                  x_886 = transformer_debug.const370;
                  b_887 = a_887;
                  y_886 = transformer_debug.const377;
                  c_887 = b_887;
                  term = s_step_0_3.instance.invoke(context, c_887, x_886, y_886, transformer_debug.constLocationInfo795);
                  if(term == null)
                    break Fail525;
                  i_887 = term;
                  f_887 = transformer_debug.const370;
                  j_887 = i_887;
                  g_887 = transformer_debug.const377;
                  k_887 = j_887;
                  term = s_step_0_3.instance.invoke(context, k_887, f_887, g_887, transformer_debug.constLocationInfo796);
                  if(term == null)
                    break Fail525;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, t_884);
                  if(term == null)
                    break Fail525;
                  d_887 = term;
                  u_884 = term;
                  p_887 = d_887;
                  l_887 = transformer_debug.const370;
                  q_887 = p_887;
                  m_887 = transformer_debug.const377;
                  r_887 = q_887;
                  n_887 = transformer_debug.const383;
                  s_887 = r_887;
                  term = s_var_0_4.instance.invoke(context, s_887, l_887, m_887, n_887, transformer_debug.constLocationInfo797);
                  if(term == null)
                    break Fail525;
                  w_887 = term;
                  t_887 = transformer_debug.const370;
                  x_887 = w_887;
                  u_887 = transformer_debug.const377;
                  y_887 = x_887;
                  term = s_step_0_3.instance.invoke(context, y_887, t_887, u_887, transformer_debug.constLocationInfo798);
                  if(term == null)
                    break Fail525;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{u_884, v_884});
                  w_884 = term;
                  d_888 = term;
                  z_887 = transformer_debug.const370;
                  e_888 = d_888;
                  a_888 = transformer_debug.const377;
                  f_888 = e_888;
                  b_888 = transformer_debug.const294;
                  g_888 = f_888;
                  term = s_var_0_4.instance.invoke(context, g_888, z_887, a_888, b_888, transformer_debug.constLocationInfo799);
                  if(term == null)
                    break Fail525;
                  if(true)
                    break Success270;
                }
                term = term241;
                IStrategoTerm x_884 = null;
                IStrategoTerm y_884 = null;
                IStrategoTerm i_888 = null;
                x_884 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail524;
                y_884 = term;
                i_888 = x_884;
                term = report_with_failure_0_2.instance.invoke(context, i_888, transformer_debug.const384, y_884);
                if(term == null)
                  break Fail524;
              }
              term = w_886;
              IStrategoTerm j_888 = null;
              IStrategoTerm k_888 = null;
              IStrategoTerm m_888 = null;
              IStrategoTerm n_888 = null;
              IStrategoTerm o_888 = null;
              if(w_884 == null)
                break Fail524;
              m_888 = w_884;
              j_888 = transformer_debug.const370;
              n_888 = m_888;
              k_888 = transformer_debug.const377;
              o_888 = n_888;
              term = r_exit_0_3.instance.invoke(context, o_888, j_888, k_888, transformer_debug.constLocationInfo790);
              if(term == null)
                break Fail524;
              if(true)
                break Success269;
            }
            term = term238;
          }
          add_step_to_strategy_0_2_fragment_4 add_step_to_strategy_0_2_fragment_40 = new add_step_to_strategy_0_2_fragment_4();
          add_step_to_strategy_0_2_fragment_40.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_40.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_40.invoke(context, term);
          if(term == null)
            break Fail521;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}