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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_8 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail506:
    { 
      IStrategoTerm term226 = term;
      IStrategoConstructor cons29 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success255:
      { 
        if(cons29 == transformer_debug._consProceed_1)
        { 
          Fail507:
          { 
            IStrategoTerm z_912 = null;
            IStrategoTerm a_913 = null;
            IStrategoTerm b_913 = null;
            IStrategoTerm c_913 = null;
            IStrategoTerm f_913 = null;
            IStrategoTerm g_913 = null;
            IStrategoTerm i_913 = null;
            IStrategoTerm k_913 = null;
            IStrategoTerm l_913 = null;
            IStrategoTerm m_913 = null;
            IStrategoTerm n_913 = null;
            IStrategoTerm o_913 = null;
            IStrategoTerm p_913 = null;
            IStrategoTerm q_913 = null;
            IStrategoTerm s_913 = null;
            IStrategoTerm t_913 = null;
            IStrategoTerm u_913 = null;
            IStrategoTerm v_913 = null;
            IStrategoTerm w_913 = null;
            IStrategoTerm z_913 = null;
            IStrategoTerm a_914 = null;
            IStrategoTerm d_914 = null;
            IStrategoTerm h_914 = null;
            IStrategoTerm i_914 = null;
            IStrategoTerm k_914 = null;
            IStrategoTerm l_914 = null;
            IStrategoTerm m_914 = null;
            IStrategoTerm n_914 = null;
            IStrategoTerm o_914 = null;
            IStrategoTerm r_914 = null;
            IStrategoTerm s_914 = null;
            IStrategoTerm t_914 = null;
            IStrategoTerm u_914 = null;
            IStrategoTerm v_914 = null;
            IStrategoTerm w_914 = null;
            IStrategoTerm x_914 = null;
            IStrategoTerm z_914 = null;
            IStrategoTerm a_915 = null;
            IStrategoTerm c_915 = null;
            IStrategoTerm d_915 = null;
            IStrategoTerm e_915 = null;
            b_913 = term;
            IStrategoList annos92 = term.getAnnotations();
            if(annos92.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos92).isEmpty())
              break Fail507;
            z_912 = ((IStrategoList)annos92).head();
            IStrategoTerm arg163 = ((IStrategoList)annos92).tail();
            if(arg163.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg163).isEmpty())
              break Fail507;
            f_913 = term;
            k_913 = term;
            g_913 = transformer_debug.const370;
            l_913 = k_913;
            i_913 = transformer_debug.const377;
            m_913 = l_913;
            term = r_enter_0_3.instance.invoke(context, m_913, g_913, i_913, transformer_debug.constLocationInfo720);
            if(term == null)
              break Fail507;
            term = f_913;
            n_913 = f_913;
            if(k_1145.value == null)
              break Fail507;
            s_913 = k_1145.value;
            o_913 = transformer_debug.const370;
            t_913 = s_913;
            p_913 = transformer_debug.const377;
            u_913 = t_913;
            q_913 = transformer_debug.const238;
            v_913 = u_913;
            term = s_var_0_4.instance.invoke(context, v_913, o_913, p_913, q_913, transformer_debug.constLocationInfo721);
            if(term == null)
              break Fail507;
            if(l_1145.value == null)
              break Fail507;
            d_914 = l_1145.value;
            w_913 = transformer_debug.const370;
            h_914 = d_914;
            z_913 = transformer_debug.const377;
            i_914 = h_914;
            a_914 = transformer_debug.const239;
            k_914 = i_914;
            term = s_var_0_4.instance.invoke(context, k_914, w_913, z_913, a_914, transformer_debug.constLocationInfo722);
            if(term == null)
              break Fail507;
            l_914 = n_913;
            r_914 = b_913;
            m_914 = transformer_debug.const370;
            s_914 = r_914;
            n_914 = transformer_debug.const377;
            t_914 = s_914;
            o_914 = transformer_debug.const277;
            u_914 = t_914;
            term = s_var_0_4.instance.invoke(context, u_914, m_914, n_914, o_914, transformer_debug.constLocationInfo723);
            if(term == null)
              break Fail507;
            z_914 = z_912;
            v_914 = transformer_debug.const370;
            a_915 = z_914;
            w_914 = transformer_debug.const377;
            c_915 = a_915;
            x_914 = transformer_debug.const381;
            d_915 = c_915;
            term = s_var_0_4.instance.invoke(context, d_915, v_914, w_914, x_914, transformer_debug.constLocationInfo724);
            if(term == null)
              break Fail507;
            term = l_914;
            e_915 = l_914;
            IStrategoTerm term227 = term;
            Success256:
            { 
              Fail508:
              { 
                IStrategoTerm f_915 = null;
                IStrategoTerm g_915 = null;
                IStrategoTerm i_915 = null;
                IStrategoTerm j_915 = null;
                IStrategoTerm k_915 = null;
                IStrategoTerm l_915 = null;
                IStrategoTerm o_915 = null;
                IStrategoTerm p_915 = null;
                IStrategoTerm r_915 = null;
                IStrategoTerm s_915 = null;
                IStrategoTerm t_915 = null;
                IStrategoTerm u_915 = null;
                IStrategoTerm v_915 = null;
                IStrategoTerm w_915 = null;
                IStrategoTerm y_915 = null;
                IStrategoTerm z_915 = null;
                IStrategoTerm a_916 = null;
                IStrategoTerm b_916 = null;
                IStrategoTerm c_916 = null;
                IStrategoTerm d_916 = null;
                IStrategoTerm f_916 = null;
                IStrategoTerm g_916 = null;
                IStrategoTerm h_916 = null;
                IStrategoTerm i_916 = null;
                IStrategoTerm j_916 = null;
                IStrategoTerm k_916 = null;
                IStrategoTerm m_916 = null;
                IStrategoTerm n_916 = null;
                IStrategoTerm o_916 = null;
                IStrategoTerm p_916 = null;
                i_915 = term;
                f_915 = transformer_debug.const370;
                j_915 = i_915;
                g_915 = transformer_debug.const377;
                k_915 = j_915;
                term = s_step_0_3.instance.invoke(context, k_915, f_915, g_915, transformer_debug.constLocationInfo725);
                if(term == null)
                  break Fail508;
                r_915 = term;
                o_915 = transformer_debug.const370;
                s_915 = r_915;
                p_915 = transformer_debug.const377;
                t_915 = s_915;
                term = s_step_0_3.instance.invoke(context, t_915, o_915, p_915, transformer_debug.constLocationInfo726);
                if(term == null)
                  break Fail508;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, z_912);
                if(term == null)
                  break Fail508;
                l_915 = term;
                a_913 = term;
                y_915 = l_915;
                u_915 = transformer_debug.const370;
                z_915 = y_915;
                v_915 = transformer_debug.const377;
                a_916 = z_915;
                w_915 = transformer_debug.const383;
                b_916 = a_916;
                term = s_var_0_4.instance.invoke(context, b_916, u_915, v_915, w_915, transformer_debug.constLocationInfo727);
                if(term == null)
                  break Fail508;
                f_916 = term;
                c_916 = transformer_debug.const370;
                g_916 = f_916;
                d_916 = transformer_debug.const377;
                h_916 = g_916;
                term = s_step_0_3.instance.invoke(context, h_916, c_916, d_916, transformer_debug.constLocationInfo728);
                if(term == null)
                  break Fail508;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{a_913, b_913});
                c_913 = term;
                m_916 = term;
                i_916 = transformer_debug.const370;
                n_916 = m_916;
                j_916 = transformer_debug.const377;
                o_916 = n_916;
                k_916 = transformer_debug.const294;
                p_916 = o_916;
                term = s_var_0_4.instance.invoke(context, p_916, i_916, j_916, k_916, transformer_debug.constLocationInfo729);
                if(term == null)
                  break Fail508;
                if(true)
                  break Success256;
              }
              term = term227;
              IStrategoTerm d_913 = null;
              IStrategoTerm e_913 = null;
              IStrategoTerm r_916 = null;
              d_913 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail507;
              e_913 = term;
              r_916 = d_913;
              term = report_with_failure_0_2.instance.invoke(context, r_916, transformer_debug.const384, e_913);
              if(term == null)
                break Fail507;
            }
            term = e_915;
            IStrategoTerm s_916 = null;
            IStrategoTerm t_916 = null;
            IStrategoTerm v_916 = null;
            IStrategoTerm w_916 = null;
            IStrategoTerm x_916 = null;
            if(c_913 == null)
              break Fail507;
            v_916 = c_913;
            s_916 = transformer_debug.const370;
            w_916 = v_916;
            t_916 = transformer_debug.const377;
            x_916 = w_916;
            term = r_exit_0_3.instance.invoke(context, x_916, s_916, t_916, transformer_debug.constLocationInfo720);
            if(term == null)
              break Fail507;
            if(true)
              break Success255;
          }
          term = term226;
        }
        Success257:
        { 
          if(cons29 == transformer_debug._consAM_2)
          { 
            Fail509:
            { 
              IStrategoTerm w_908 = null;
              IStrategoTerm x_908 = null;
              IStrategoTerm y_908 = null;
              IStrategoTerm z_908 = null;
              IStrategoTerm c_909 = null;
              IStrategoTerm d_909 = null;
              IStrategoTerm f_909 = null;
              IStrategoTerm h_909 = null;
              IStrategoTerm i_909 = null;
              IStrategoTerm j_909 = null;
              IStrategoTerm k_909 = null;
              IStrategoTerm l_909 = null;
              IStrategoTerm m_909 = null;
              IStrategoTerm n_909 = null;
              IStrategoTerm p_909 = null;
              IStrategoTerm q_909 = null;
              IStrategoTerm r_909 = null;
              IStrategoTerm s_909 = null;
              IStrategoTerm t_909 = null;
              IStrategoTerm w_909 = null;
              IStrategoTerm x_909 = null;
              IStrategoTerm a_910 = null;
              IStrategoTerm e_910 = null;
              IStrategoTerm f_910 = null;
              IStrategoTerm h_910 = null;
              IStrategoTerm i_910 = null;
              IStrategoTerm j_910 = null;
              IStrategoTerm k_910 = null;
              IStrategoTerm l_910 = null;
              IStrategoTerm o_910 = null;
              IStrategoTerm p_910 = null;
              IStrategoTerm q_910 = null;
              IStrategoTerm r_910 = null;
              IStrategoTerm s_910 = null;
              IStrategoTerm t_910 = null;
              IStrategoTerm u_910 = null;
              IStrategoTerm w_910 = null;
              IStrategoTerm x_910 = null;
              IStrategoTerm z_910 = null;
              IStrategoTerm a_911 = null;
              IStrategoTerm b_911 = null;
              y_908 = term;
              IStrategoList annos93 = term.getAnnotations();
              if(annos93.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos93).isEmpty())
                break Fail509;
              w_908 = ((IStrategoList)annos93).head();
              IStrategoTerm arg166 = ((IStrategoList)annos93).tail();
              if(arg166.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg166).isEmpty())
                break Fail509;
              c_909 = term;
              h_909 = term;
              d_909 = transformer_debug.const370;
              i_909 = h_909;
              f_909 = transformer_debug.const377;
              j_909 = i_909;
              term = r_enter_0_3.instance.invoke(context, j_909, d_909, f_909, transformer_debug.constLocationInfo730);
              if(term == null)
                break Fail509;
              term = c_909;
              k_909 = c_909;
              if(k_1145.value == null)
                break Fail509;
              p_909 = k_1145.value;
              l_909 = transformer_debug.const370;
              q_909 = p_909;
              m_909 = transformer_debug.const377;
              r_909 = q_909;
              n_909 = transformer_debug.const238;
              s_909 = r_909;
              term = s_var_0_4.instance.invoke(context, s_909, l_909, m_909, n_909, transformer_debug.constLocationInfo731);
              if(term == null)
                break Fail509;
              if(l_1145.value == null)
                break Fail509;
              a_910 = l_1145.value;
              t_909 = transformer_debug.const370;
              e_910 = a_910;
              w_909 = transformer_debug.const377;
              f_910 = e_910;
              x_909 = transformer_debug.const239;
              h_910 = f_910;
              term = s_var_0_4.instance.invoke(context, h_910, t_909, w_909, x_909, transformer_debug.constLocationInfo732);
              if(term == null)
                break Fail509;
              i_910 = k_909;
              o_910 = y_908;
              j_910 = transformer_debug.const370;
              p_910 = o_910;
              k_910 = transformer_debug.const377;
              q_910 = p_910;
              l_910 = transformer_debug.const277;
              r_910 = q_910;
              term = s_var_0_4.instance.invoke(context, r_910, j_910, k_910, l_910, transformer_debug.constLocationInfo733);
              if(term == null)
                break Fail509;
              w_910 = w_908;
              s_910 = transformer_debug.const370;
              x_910 = w_910;
              t_910 = transformer_debug.const377;
              z_910 = x_910;
              u_910 = transformer_debug.const381;
              a_911 = z_910;
              term = s_var_0_4.instance.invoke(context, a_911, s_910, t_910, u_910, transformer_debug.constLocationInfo734);
              if(term == null)
                break Fail509;
              term = i_910;
              b_911 = i_910;
              IStrategoTerm term229 = term;
              Success258:
              { 
                Fail510:
                { 
                  IStrategoTerm c_911 = null;
                  IStrategoTerm d_911 = null;
                  IStrategoTerm f_911 = null;
                  IStrategoTerm g_911 = null;
                  IStrategoTerm h_911 = null;
                  IStrategoTerm i_911 = null;
                  IStrategoTerm l_911 = null;
                  IStrategoTerm m_911 = null;
                  IStrategoTerm o_911 = null;
                  IStrategoTerm p_911 = null;
                  IStrategoTerm q_911 = null;
                  IStrategoTerm r_911 = null;
                  IStrategoTerm s_911 = null;
                  IStrategoTerm t_911 = null;
                  IStrategoTerm v_911 = null;
                  IStrategoTerm w_911 = null;
                  IStrategoTerm x_911 = null;
                  IStrategoTerm y_911 = null;
                  IStrategoTerm z_911 = null;
                  IStrategoTerm a_912 = null;
                  IStrategoTerm c_912 = null;
                  IStrategoTerm d_912 = null;
                  IStrategoTerm e_912 = null;
                  IStrategoTerm f_912 = null;
                  IStrategoTerm g_912 = null;
                  IStrategoTerm h_912 = null;
                  IStrategoTerm j_912 = null;
                  IStrategoTerm k_912 = null;
                  IStrategoTerm l_912 = null;
                  IStrategoTerm m_912 = null;
                  f_911 = term;
                  c_911 = transformer_debug.const370;
                  g_911 = f_911;
                  d_911 = transformer_debug.const377;
                  h_911 = g_911;
                  term = s_step_0_3.instance.invoke(context, h_911, c_911, d_911, transformer_debug.constLocationInfo735);
                  if(term == null)
                    break Fail510;
                  o_911 = term;
                  l_911 = transformer_debug.const370;
                  p_911 = o_911;
                  m_911 = transformer_debug.const377;
                  q_911 = p_911;
                  term = s_step_0_3.instance.invoke(context, q_911, l_911, m_911, transformer_debug.constLocationInfo736);
                  if(term == null)
                    break Fail510;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, w_908);
                  if(term == null)
                    break Fail510;
                  i_911 = term;
                  x_908 = term;
                  v_911 = i_911;
                  r_911 = transformer_debug.const370;
                  w_911 = v_911;
                  s_911 = transformer_debug.const377;
                  x_911 = w_911;
                  t_911 = transformer_debug.const383;
                  y_911 = x_911;
                  term = s_var_0_4.instance.invoke(context, y_911, r_911, s_911, t_911, transformer_debug.constLocationInfo737);
                  if(term == null)
                    break Fail510;
                  c_912 = term;
                  z_911 = transformer_debug.const370;
                  d_912 = c_912;
                  a_912 = transformer_debug.const377;
                  e_912 = d_912;
                  term = s_step_0_3.instance.invoke(context, e_912, z_911, a_912, transformer_debug.constLocationInfo738);
                  if(term == null)
                    break Fail510;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{x_908, y_908});
                  z_908 = term;
                  j_912 = term;
                  f_912 = transformer_debug.const370;
                  k_912 = j_912;
                  g_912 = transformer_debug.const377;
                  l_912 = k_912;
                  h_912 = transformer_debug.const294;
                  m_912 = l_912;
                  term = s_var_0_4.instance.invoke(context, m_912, f_912, g_912, h_912, transformer_debug.constLocationInfo739);
                  if(term == null)
                    break Fail510;
                  if(true)
                    break Success258;
                }
                term = term229;
                IStrategoTerm a_909 = null;
                IStrategoTerm b_909 = null;
                IStrategoTerm o_912 = null;
                a_909 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail509;
                b_909 = term;
                o_912 = a_909;
                term = report_with_failure_0_2.instance.invoke(context, o_912, transformer_debug.const384, b_909);
                if(term == null)
                  break Fail509;
              }
              term = b_911;
              IStrategoTerm p_912 = null;
              IStrategoTerm q_912 = null;
              IStrategoTerm s_912 = null;
              IStrategoTerm t_912 = null;
              IStrategoTerm u_912 = null;
              if(z_908 == null)
                break Fail509;
              s_912 = z_908;
              p_912 = transformer_debug.const370;
              t_912 = s_912;
              q_912 = transformer_debug.const377;
              u_912 = t_912;
              term = r_exit_0_3.instance.invoke(context, u_912, p_912, q_912, transformer_debug.constLocationInfo730);
              if(term == null)
                break Fail509;
              if(true)
                break Success257;
            }
            term = term226;
          }
          add_step_to_strategy_0_2_fragment_7 add_step_to_strategy_0_2_fragment_70 = new add_step_to_strategy_0_2_fragment_7();
          add_step_to_strategy_0_2_fragment_70.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_70.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_70.invoke(context, term);
          if(term == null)
            break Fail506;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}