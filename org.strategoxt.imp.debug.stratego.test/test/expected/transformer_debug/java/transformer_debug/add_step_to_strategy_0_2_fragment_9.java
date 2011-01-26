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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_9 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail501:
    { 
      IStrategoTerm term222 = term;
      IStrategoConstructor cons28 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success251:
      { 
        if(cons28 == transformer_debug._consSRule_1)
        { 
          Fail502:
          { 
            IStrategoTerm f_921 = null;
            IStrategoTerm g_921 = null;
            IStrategoTerm h_921 = null;
            IStrategoTerm i_921 = null;
            IStrategoTerm l_921 = null;
            IStrategoTerm m_921 = null;
            IStrategoTerm o_921 = null;
            IStrategoTerm q_921 = null;
            IStrategoTerm r_921 = null;
            IStrategoTerm s_921 = null;
            IStrategoTerm t_921 = null;
            IStrategoTerm u_921 = null;
            IStrategoTerm v_921 = null;
            IStrategoTerm w_921 = null;
            IStrategoTerm y_921 = null;
            IStrategoTerm z_921 = null;
            IStrategoTerm a_922 = null;
            IStrategoTerm b_922 = null;
            IStrategoTerm c_922 = null;
            IStrategoTerm f_922 = null;
            IStrategoTerm g_922 = null;
            IStrategoTerm j_922 = null;
            IStrategoTerm n_922 = null;
            IStrategoTerm o_922 = null;
            IStrategoTerm q_922 = null;
            IStrategoTerm r_922 = null;
            IStrategoTerm s_922 = null;
            IStrategoTerm t_922 = null;
            IStrategoTerm u_922 = null;
            IStrategoTerm x_922 = null;
            IStrategoTerm y_922 = null;
            IStrategoTerm z_922 = null;
            IStrategoTerm a_923 = null;
            IStrategoTerm b_923 = null;
            IStrategoTerm c_923 = null;
            IStrategoTerm d_923 = null;
            IStrategoTerm g_923 = null;
            IStrategoTerm h_923 = null;
            IStrategoTerm i_923 = null;
            IStrategoTerm j_923 = null;
            IStrategoTerm k_923 = null;
            h_921 = term;
            IStrategoList annos90 = term.getAnnotations();
            if(annos90.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos90).isEmpty())
              break Fail502;
            f_921 = ((IStrategoList)annos90).head();
            IStrategoTerm arg160 = ((IStrategoList)annos90).tail();
            if(arg160.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg160).isEmpty())
              break Fail502;
            l_921 = term;
            q_921 = term;
            m_921 = transformer_debug.const370;
            r_921 = q_921;
            o_921 = transformer_debug.const377;
            s_921 = r_921;
            term = r_enter_0_3.instance.invoke(context, s_921, m_921, o_921, transformer_debug.constLocationInfo700);
            if(term == null)
              break Fail502;
            term = l_921;
            t_921 = l_921;
            if(k_1145.value == null)
              break Fail502;
            y_921 = k_1145.value;
            u_921 = transformer_debug.const370;
            z_921 = y_921;
            v_921 = transformer_debug.const377;
            a_922 = z_921;
            w_921 = transformer_debug.const238;
            b_922 = a_922;
            term = s_var_0_4.instance.invoke(context, b_922, u_921, v_921, w_921, transformer_debug.constLocationInfo701);
            if(term == null)
              break Fail502;
            if(l_1145.value == null)
              break Fail502;
            j_922 = l_1145.value;
            c_922 = transformer_debug.const370;
            n_922 = j_922;
            f_922 = transformer_debug.const377;
            o_922 = n_922;
            g_922 = transformer_debug.const239;
            q_922 = o_922;
            term = s_var_0_4.instance.invoke(context, q_922, c_922, f_922, g_922, transformer_debug.constLocationInfo702);
            if(term == null)
              break Fail502;
            r_922 = t_921;
            x_922 = h_921;
            s_922 = transformer_debug.const370;
            y_922 = x_922;
            t_922 = transformer_debug.const377;
            z_922 = y_922;
            u_922 = transformer_debug.const277;
            a_923 = z_922;
            term = s_var_0_4.instance.invoke(context, a_923, s_922, t_922, u_922, transformer_debug.constLocationInfo703);
            if(term == null)
              break Fail502;
            g_923 = f_921;
            b_923 = transformer_debug.const370;
            h_923 = g_923;
            c_923 = transformer_debug.const377;
            i_923 = h_923;
            d_923 = transformer_debug.const381;
            j_923 = i_923;
            term = s_var_0_4.instance.invoke(context, j_923, b_923, c_923, d_923, transformer_debug.constLocationInfo704);
            if(term == null)
              break Fail502;
            term = r_922;
            k_923 = r_922;
            IStrategoTerm term223 = term;
            Success252:
            { 
              Fail503:
              { 
                IStrategoTerm l_923 = null;
                IStrategoTerm m_923 = null;
                IStrategoTerm o_923 = null;
                IStrategoTerm p_923 = null;
                IStrategoTerm q_923 = null;
                IStrategoTerm s_923 = null;
                IStrategoTerm u_923 = null;
                IStrategoTerm v_923 = null;
                IStrategoTerm x_923 = null;
                IStrategoTerm y_923 = null;
                IStrategoTerm z_923 = null;
                IStrategoTerm a_924 = null;
                IStrategoTerm b_924 = null;
                IStrategoTerm c_924 = null;
                IStrategoTerm e_924 = null;
                IStrategoTerm f_924 = null;
                IStrategoTerm g_924 = null;
                IStrategoTerm h_924 = null;
                IStrategoTerm i_924 = null;
                IStrategoTerm j_924 = null;
                IStrategoTerm l_924 = null;
                IStrategoTerm m_924 = null;
                IStrategoTerm n_924 = null;
                IStrategoTerm o_924 = null;
                IStrategoTerm p_924 = null;
                IStrategoTerm q_924 = null;
                IStrategoTerm s_924 = null;
                IStrategoTerm t_924 = null;
                IStrategoTerm u_924 = null;
                IStrategoTerm v_924 = null;
                o_923 = term;
                l_923 = transformer_debug.const370;
                p_923 = o_923;
                m_923 = transformer_debug.const377;
                q_923 = p_923;
                term = s_step_0_3.instance.invoke(context, q_923, l_923, m_923, transformer_debug.constLocationInfo705);
                if(term == null)
                  break Fail503;
                x_923 = term;
                u_923 = transformer_debug.const370;
                y_923 = x_923;
                v_923 = transformer_debug.const377;
                z_923 = y_923;
                term = s_step_0_3.instance.invoke(context, z_923, u_923, v_923, transformer_debug.constLocationInfo706);
                if(term == null)
                  break Fail503;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, f_921);
                if(term == null)
                  break Fail503;
                s_923 = term;
                g_921 = term;
                e_924 = s_923;
                a_924 = transformer_debug.const370;
                f_924 = e_924;
                b_924 = transformer_debug.const377;
                g_924 = f_924;
                c_924 = transformer_debug.const383;
                h_924 = g_924;
                term = s_var_0_4.instance.invoke(context, h_924, a_924, b_924, c_924, transformer_debug.constLocationInfo707);
                if(term == null)
                  break Fail503;
                l_924 = term;
                i_924 = transformer_debug.const370;
                m_924 = l_924;
                j_924 = transformer_debug.const377;
                n_924 = m_924;
                term = s_step_0_3.instance.invoke(context, n_924, i_924, j_924, transformer_debug.constLocationInfo708);
                if(term == null)
                  break Fail503;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{g_921, h_921});
                i_921 = term;
                s_924 = term;
                o_924 = transformer_debug.const370;
                t_924 = s_924;
                p_924 = transformer_debug.const377;
                u_924 = t_924;
                q_924 = transformer_debug.const294;
                v_924 = u_924;
                term = s_var_0_4.instance.invoke(context, v_924, o_924, p_924, q_924, transformer_debug.constLocationInfo709);
                if(term == null)
                  break Fail503;
                if(true)
                  break Success252;
              }
              term = term223;
              IStrategoTerm j_921 = null;
              IStrategoTerm k_921 = null;
              IStrategoTerm x_924 = null;
              j_921 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail502;
              k_921 = term;
              x_924 = j_921;
              term = report_with_failure_0_2.instance.invoke(context, x_924, transformer_debug.const384, k_921);
              if(term == null)
                break Fail502;
            }
            term = k_923;
            IStrategoTerm y_924 = null;
            IStrategoTerm z_924 = null;
            IStrategoTerm b_925 = null;
            IStrategoTerm c_925 = null;
            IStrategoTerm d_925 = null;
            if(i_921 == null)
              break Fail502;
            b_925 = i_921;
            y_924 = transformer_debug.const370;
            c_925 = b_925;
            z_924 = transformer_debug.const377;
            d_925 = c_925;
            term = r_exit_0_3.instance.invoke(context, d_925, y_924, z_924, transformer_debug.constLocationInfo700);
            if(term == null)
              break Fail502;
            if(true)
              break Success251;
          }
          term = term222;
        }
        Success253:
        { 
          if(cons28 == transformer_debug._consProceedNoArgs_0)
          { 
            Fail504:
            { 
              IStrategoTerm c_917 = null;
              IStrategoTerm d_917 = null;
              IStrategoTerm e_917 = null;
              IStrategoTerm f_917 = null;
              IStrategoTerm i_917 = null;
              IStrategoTerm j_917 = null;
              IStrategoTerm l_917 = null;
              IStrategoTerm n_917 = null;
              IStrategoTerm o_917 = null;
              IStrategoTerm p_917 = null;
              IStrategoTerm q_917 = null;
              IStrategoTerm r_917 = null;
              IStrategoTerm s_917 = null;
              IStrategoTerm t_917 = null;
              IStrategoTerm v_917 = null;
              IStrategoTerm w_917 = null;
              IStrategoTerm x_917 = null;
              IStrategoTerm y_917 = null;
              IStrategoTerm z_917 = null;
              IStrategoTerm c_918 = null;
              IStrategoTerm d_918 = null;
              IStrategoTerm g_918 = null;
              IStrategoTerm k_918 = null;
              IStrategoTerm l_918 = null;
              IStrategoTerm n_918 = null;
              IStrategoTerm o_918 = null;
              IStrategoTerm p_918 = null;
              IStrategoTerm q_918 = null;
              IStrategoTerm r_918 = null;
              IStrategoTerm u_918 = null;
              IStrategoTerm v_918 = null;
              IStrategoTerm w_918 = null;
              IStrategoTerm x_918 = null;
              IStrategoTerm y_918 = null;
              IStrategoTerm z_918 = null;
              IStrategoTerm a_919 = null;
              IStrategoTerm c_919 = null;
              IStrategoTerm d_919 = null;
              IStrategoTerm f_919 = null;
              IStrategoTerm g_919 = null;
              IStrategoTerm h_919 = null;
              e_917 = term;
              IStrategoList annos91 = term.getAnnotations();
              if(annos91.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos91).isEmpty())
                break Fail504;
              c_917 = ((IStrategoList)annos91).head();
              IStrategoTerm arg161 = ((IStrategoList)annos91).tail();
              if(arg161.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg161).isEmpty())
                break Fail504;
              i_917 = term;
              n_917 = term;
              j_917 = transformer_debug.const370;
              o_917 = n_917;
              l_917 = transformer_debug.const377;
              p_917 = o_917;
              term = r_enter_0_3.instance.invoke(context, p_917, j_917, l_917, transformer_debug.constLocationInfo710);
              if(term == null)
                break Fail504;
              term = i_917;
              q_917 = i_917;
              if(k_1145.value == null)
                break Fail504;
              v_917 = k_1145.value;
              r_917 = transformer_debug.const370;
              w_917 = v_917;
              s_917 = transformer_debug.const377;
              x_917 = w_917;
              t_917 = transformer_debug.const238;
              y_917 = x_917;
              term = s_var_0_4.instance.invoke(context, y_917, r_917, s_917, t_917, transformer_debug.constLocationInfo711);
              if(term == null)
                break Fail504;
              if(l_1145.value == null)
                break Fail504;
              g_918 = l_1145.value;
              z_917 = transformer_debug.const370;
              k_918 = g_918;
              c_918 = transformer_debug.const377;
              l_918 = k_918;
              d_918 = transformer_debug.const239;
              n_918 = l_918;
              term = s_var_0_4.instance.invoke(context, n_918, z_917, c_918, d_918, transformer_debug.constLocationInfo712);
              if(term == null)
                break Fail504;
              o_918 = q_917;
              u_918 = e_917;
              p_918 = transformer_debug.const370;
              v_918 = u_918;
              q_918 = transformer_debug.const377;
              w_918 = v_918;
              r_918 = transformer_debug.const277;
              x_918 = w_918;
              term = s_var_0_4.instance.invoke(context, x_918, p_918, q_918, r_918, transformer_debug.constLocationInfo713);
              if(term == null)
                break Fail504;
              c_919 = c_917;
              y_918 = transformer_debug.const370;
              d_919 = c_919;
              z_918 = transformer_debug.const377;
              f_919 = d_919;
              a_919 = transformer_debug.const381;
              g_919 = f_919;
              term = s_var_0_4.instance.invoke(context, g_919, y_918, z_918, a_919, transformer_debug.constLocationInfo714);
              if(term == null)
                break Fail504;
              term = o_918;
              h_919 = o_918;
              IStrategoTerm term225 = term;
              Success254:
              { 
                Fail505:
                { 
                  IStrategoTerm i_919 = null;
                  IStrategoTerm j_919 = null;
                  IStrategoTerm l_919 = null;
                  IStrategoTerm m_919 = null;
                  IStrategoTerm n_919 = null;
                  IStrategoTerm o_919 = null;
                  IStrategoTerm r_919 = null;
                  IStrategoTerm s_919 = null;
                  IStrategoTerm u_919 = null;
                  IStrategoTerm v_919 = null;
                  IStrategoTerm w_919 = null;
                  IStrategoTerm x_919 = null;
                  IStrategoTerm y_919 = null;
                  IStrategoTerm z_919 = null;
                  IStrategoTerm b_920 = null;
                  IStrategoTerm c_920 = null;
                  IStrategoTerm d_920 = null;
                  IStrategoTerm e_920 = null;
                  IStrategoTerm f_920 = null;
                  IStrategoTerm g_920 = null;
                  IStrategoTerm i_920 = null;
                  IStrategoTerm j_920 = null;
                  IStrategoTerm k_920 = null;
                  IStrategoTerm l_920 = null;
                  IStrategoTerm m_920 = null;
                  IStrategoTerm n_920 = null;
                  IStrategoTerm p_920 = null;
                  IStrategoTerm q_920 = null;
                  IStrategoTerm r_920 = null;
                  IStrategoTerm s_920 = null;
                  l_919 = term;
                  i_919 = transformer_debug.const370;
                  m_919 = l_919;
                  j_919 = transformer_debug.const377;
                  n_919 = m_919;
                  term = s_step_0_3.instance.invoke(context, n_919, i_919, j_919, transformer_debug.constLocationInfo715);
                  if(term == null)
                    break Fail505;
                  u_919 = term;
                  r_919 = transformer_debug.const370;
                  v_919 = u_919;
                  s_919 = transformer_debug.const377;
                  w_919 = v_919;
                  term = s_step_0_3.instance.invoke(context, w_919, r_919, s_919, transformer_debug.constLocationInfo716);
                  if(term == null)
                    break Fail505;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, c_917);
                  if(term == null)
                    break Fail505;
                  o_919 = term;
                  d_917 = term;
                  b_920 = o_919;
                  x_919 = transformer_debug.const370;
                  c_920 = b_920;
                  y_919 = transformer_debug.const377;
                  d_920 = c_920;
                  z_919 = transformer_debug.const383;
                  e_920 = d_920;
                  term = s_var_0_4.instance.invoke(context, e_920, x_919, y_919, z_919, transformer_debug.constLocationInfo717);
                  if(term == null)
                    break Fail505;
                  i_920 = term;
                  f_920 = transformer_debug.const370;
                  j_920 = i_920;
                  g_920 = transformer_debug.const377;
                  k_920 = j_920;
                  term = s_step_0_3.instance.invoke(context, k_920, f_920, g_920, transformer_debug.constLocationInfo718);
                  if(term == null)
                    break Fail505;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{d_917, e_917});
                  f_917 = term;
                  p_920 = term;
                  l_920 = transformer_debug.const370;
                  q_920 = p_920;
                  m_920 = transformer_debug.const377;
                  r_920 = q_920;
                  n_920 = transformer_debug.const294;
                  s_920 = r_920;
                  term = s_var_0_4.instance.invoke(context, s_920, l_920, m_920, n_920, transformer_debug.constLocationInfo719);
                  if(term == null)
                    break Fail505;
                  if(true)
                    break Success254;
                }
                term = term225;
                IStrategoTerm g_917 = null;
                IStrategoTerm h_917 = null;
                IStrategoTerm u_920 = null;
                g_917 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail504;
                h_917 = term;
                u_920 = g_917;
                term = report_with_failure_0_2.instance.invoke(context, u_920, transformer_debug.const384, h_917);
                if(term == null)
                  break Fail504;
              }
              term = h_919;
              IStrategoTerm v_920 = null;
              IStrategoTerm w_920 = null;
              IStrategoTerm y_920 = null;
              IStrategoTerm z_920 = null;
              IStrategoTerm a_921 = null;
              if(f_917 == null)
                break Fail504;
              y_920 = f_917;
              v_920 = transformer_debug.const370;
              z_920 = y_920;
              w_920 = transformer_debug.const377;
              a_921 = z_920;
              term = r_exit_0_3.instance.invoke(context, a_921, v_920, w_920, transformer_debug.constLocationInfo710);
              if(term == null)
                break Fail504;
              if(true)
                break Success253;
            }
            term = term222;
          }
          add_step_to_strategy_0_2_fragment_8 add_step_to_strategy_0_2_fragment_80 = new add_step_to_strategy_0_2_fragment_8();
          add_step_to_strategy_0_2_fragment_80.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_80.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_80.invoke(context, term);
          if(term == null)
            break Fail501;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}