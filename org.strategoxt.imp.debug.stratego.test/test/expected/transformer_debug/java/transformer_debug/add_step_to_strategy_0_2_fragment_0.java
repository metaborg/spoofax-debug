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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_0 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail546:
    { 
      IStrategoTerm term258 = term;
      IStrategoConstructor cons37 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success287:
      { 
        if(cons37 == transformer_debug._consAll_1)
        { 
          Fail547:
          { 
            IStrategoTerm d_849 = null;
            IStrategoTerm e_849 = null;
            IStrategoTerm f_849 = null;
            IStrategoTerm g_849 = null;
            IStrategoTerm j_849 = null;
            IStrategoTerm k_849 = null;
            IStrategoTerm l_849 = null;
            IStrategoTerm n_849 = null;
            IStrategoTerm s_849 = null;
            IStrategoTerm u_849 = null;
            IStrategoTerm v_849 = null;
            IStrategoTerm z_849 = null;
            IStrategoTerm a_850 = null;
            IStrategoTerm c_850 = null;
            IStrategoTerm e_850 = null;
            IStrategoTerm f_850 = null;
            IStrategoTerm g_850 = null;
            IStrategoTerm h_850 = null;
            IStrategoTerm j_850 = null;
            IStrategoTerm k_850 = null;
            IStrategoTerm l_850 = null;
            IStrategoTerm n_850 = null;
            IStrategoTerm o_850 = null;
            IStrategoTerm p_850 = null;
            IStrategoTerm q_850 = null;
            IStrategoTerm r_850 = null;
            IStrategoTerm s_850 = null;
            IStrategoTerm u_850 = null;
            IStrategoTerm v_850 = null;
            IStrategoTerm x_850 = null;
            IStrategoTerm y_850 = null;
            IStrategoTerm z_850 = null;
            IStrategoTerm a_851 = null;
            IStrategoTerm b_851 = null;
            IStrategoTerm c_851 = null;
            IStrategoTerm d_851 = null;
            IStrategoTerm g_851 = null;
            IStrategoTerm h_851 = null;
            IStrategoTerm i_851 = null;
            IStrategoTerm j_851 = null;
            IStrategoTerm k_851 = null;
            f_849 = term;
            IStrategoList annos108 = term.getAnnotations();
            if(annos108.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos108).isEmpty())
              break Fail547;
            d_849 = ((IStrategoList)annos108).head();
            IStrategoTerm arg203 = ((IStrategoList)annos108).tail();
            if(arg203.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg203).isEmpty())
              break Fail547;
            j_849 = term;
            n_849 = term;
            k_849 = transformer_debug.const370;
            s_849 = n_849;
            l_849 = transformer_debug.const377;
            u_849 = s_849;
            term = r_enter_0_3.instance.invoke(context, u_849, k_849, l_849, transformer_debug.constLocationInfo880);
            if(term == null)
              break Fail547;
            term = j_849;
            v_849 = j_849;
            if(k_1145.value == null)
              break Fail547;
            e_850 = k_1145.value;
            z_849 = transformer_debug.const370;
            f_850 = e_850;
            a_850 = transformer_debug.const377;
            g_850 = f_850;
            c_850 = transformer_debug.const238;
            h_850 = g_850;
            term = s_var_0_4.instance.invoke(context, h_850, z_849, a_850, c_850, transformer_debug.constLocationInfo881);
            if(term == null)
              break Fail547;
            if(l_1145.value == null)
              break Fail547;
            n_850 = l_1145.value;
            j_850 = transformer_debug.const370;
            o_850 = n_850;
            k_850 = transformer_debug.const377;
            p_850 = o_850;
            l_850 = transformer_debug.const239;
            q_850 = p_850;
            term = s_var_0_4.instance.invoke(context, q_850, j_850, k_850, l_850, transformer_debug.constLocationInfo882);
            if(term == null)
              break Fail547;
            r_850 = v_849;
            x_850 = f_849;
            s_850 = transformer_debug.const370;
            y_850 = x_850;
            u_850 = transformer_debug.const377;
            z_850 = y_850;
            v_850 = transformer_debug.const277;
            a_851 = z_850;
            term = s_var_0_4.instance.invoke(context, a_851, s_850, u_850, v_850, transformer_debug.constLocationInfo883);
            if(term == null)
              break Fail547;
            g_851 = d_849;
            b_851 = transformer_debug.const370;
            h_851 = g_851;
            c_851 = transformer_debug.const377;
            i_851 = h_851;
            d_851 = transformer_debug.const381;
            j_851 = i_851;
            term = s_var_0_4.instance.invoke(context, j_851, b_851, c_851, d_851, transformer_debug.constLocationInfo884);
            if(term == null)
              break Fail547;
            term = r_850;
            k_851 = r_850;
            IStrategoTerm term259 = term;
            Success288:
            { 
              Fail548:
              { 
                IStrategoTerm l_851 = null;
                IStrategoTerm m_851 = null;
                IStrategoTerm o_851 = null;
                IStrategoTerm p_851 = null;
                IStrategoTerm q_851 = null;
                IStrategoTerm r_851 = null;
                IStrategoTerm t_851 = null;
                IStrategoTerm u_851 = null;
                IStrategoTerm w_851 = null;
                IStrategoTerm x_851 = null;
                IStrategoTerm y_851 = null;
                IStrategoTerm z_851 = null;
                IStrategoTerm a_852 = null;
                IStrategoTerm b_852 = null;
                IStrategoTerm d_852 = null;
                IStrategoTerm e_852 = null;
                IStrategoTerm f_852 = null;
                IStrategoTerm g_852 = null;
                IStrategoTerm h_852 = null;
                IStrategoTerm i_852 = null;
                IStrategoTerm k_852 = null;
                IStrategoTerm l_852 = null;
                IStrategoTerm m_852 = null;
                IStrategoTerm n_852 = null;
                IStrategoTerm o_852 = null;
                IStrategoTerm p_852 = null;
                IStrategoTerm r_852 = null;
                IStrategoTerm s_852 = null;
                IStrategoTerm t_852 = null;
                IStrategoTerm u_852 = null;
                o_851 = term;
                l_851 = transformer_debug.const370;
                p_851 = o_851;
                m_851 = transformer_debug.const377;
                q_851 = p_851;
                term = s_step_0_3.instance.invoke(context, q_851, l_851, m_851, transformer_debug.constLocationInfo885);
                if(term == null)
                  break Fail548;
                w_851 = term;
                t_851 = transformer_debug.const370;
                x_851 = w_851;
                u_851 = transformer_debug.const377;
                y_851 = x_851;
                term = s_step_0_3.instance.invoke(context, y_851, t_851, u_851, transformer_debug.constLocationInfo886);
                if(term == null)
                  break Fail548;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, d_849);
                if(term == null)
                  break Fail548;
                r_851 = term;
                e_849 = term;
                d_852 = r_851;
                z_851 = transformer_debug.const370;
                e_852 = d_852;
                a_852 = transformer_debug.const377;
                f_852 = e_852;
                b_852 = transformer_debug.const383;
                g_852 = f_852;
                term = s_var_0_4.instance.invoke(context, g_852, z_851, a_852, b_852, transformer_debug.constLocationInfo887);
                if(term == null)
                  break Fail548;
                k_852 = term;
                h_852 = transformer_debug.const370;
                l_852 = k_852;
                i_852 = transformer_debug.const377;
                m_852 = l_852;
                term = s_step_0_3.instance.invoke(context, m_852, h_852, i_852, transformer_debug.constLocationInfo888);
                if(term == null)
                  break Fail548;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{e_849, f_849});
                g_849 = term;
                r_852 = term;
                n_852 = transformer_debug.const370;
                s_852 = r_852;
                o_852 = transformer_debug.const377;
                t_852 = s_852;
                p_852 = transformer_debug.const294;
                u_852 = t_852;
                term = s_var_0_4.instance.invoke(context, u_852, n_852, o_852, p_852, transformer_debug.constLocationInfo889);
                if(term == null)
                  break Fail548;
                if(true)
                  break Success288;
              }
              term = term259;
              IStrategoTerm h_849 = null;
              IStrategoTerm i_849 = null;
              IStrategoTerm w_852 = null;
              h_849 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail547;
              i_849 = term;
              w_852 = h_849;
              term = report_with_failure_0_2.instance.invoke(context, w_852, transformer_debug.const384, i_849);
              if(term == null)
                break Fail547;
            }
            term = k_851;
            IStrategoTerm x_852 = null;
            IStrategoTerm y_852 = null;
            IStrategoTerm a_853 = null;
            IStrategoTerm b_853 = null;
            IStrategoTerm d_853 = null;
            if(g_849 == null)
              break Fail547;
            a_853 = g_849;
            x_852 = transformer_debug.const370;
            b_853 = a_853;
            y_852 = transformer_debug.const377;
            d_853 = b_853;
            term = r_exit_0_3.instance.invoke(context, d_853, x_852, y_852, transformer_debug.constLocationInfo880);
            if(term == null)
              break Fail547;
            if(true)
              break Success287;
          }
          term = term258;
        }
        if(cons37 == transformer_debug._consImportTerm_1)
        { 
          IStrategoTerm j_845 = null;
          IStrategoTerm k_845 = null;
          IStrategoTerm l_845 = null;
          IStrategoTerm m_845 = null;
          IStrategoTerm p_845 = null;
          IStrategoTerm q_845 = null;
          IStrategoTerm r_845 = null;
          IStrategoTerm u_845 = null;
          IStrategoTerm v_845 = null;
          IStrategoTerm w_845 = null;
          IStrategoTerm x_845 = null;
          IStrategoTerm y_845 = null;
          IStrategoTerm z_845 = null;
          IStrategoTerm a_846 = null;
          IStrategoTerm c_846 = null;
          IStrategoTerm d_846 = null;
          IStrategoTerm e_846 = null;
          IStrategoTerm f_846 = null;
          IStrategoTerm g_846 = null;
          IStrategoTerm h_846 = null;
          IStrategoTerm i_846 = null;
          IStrategoTerm k_846 = null;
          IStrategoTerm l_846 = null;
          IStrategoTerm m_846 = null;
          IStrategoTerm n_846 = null;
          IStrategoTerm o_846 = null;
          IStrategoTerm p_846 = null;
          IStrategoTerm q_846 = null;
          IStrategoTerm r_846 = null;
          IStrategoTerm t_846 = null;
          IStrategoTerm u_846 = null;
          IStrategoTerm v_846 = null;
          IStrategoTerm w_846 = null;
          IStrategoTerm x_846 = null;
          IStrategoTerm y_846 = null;
          IStrategoTerm z_846 = null;
          IStrategoTerm b_847 = null;
          IStrategoTerm c_847 = null;
          IStrategoTerm d_847 = null;
          IStrategoTerm e_847 = null;
          IStrategoTerm f_847 = null;
          l_845 = term;
          IStrategoList annos109 = term.getAnnotations();
          if(annos109.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos109).isEmpty())
            break Fail546;
          j_845 = ((IStrategoList)annos109).head();
          IStrategoTerm arg205 = ((IStrategoList)annos109).tail();
          if(arg205.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg205).isEmpty())
            break Fail546;
          p_845 = term;
          u_845 = term;
          q_845 = transformer_debug.const370;
          v_845 = u_845;
          r_845 = transformer_debug.const377;
          w_845 = v_845;
          term = r_enter_0_3.instance.invoke(context, w_845, q_845, r_845, transformer_debug.constLocationInfo890);
          if(term == null)
            break Fail546;
          term = p_845;
          x_845 = p_845;
          if(k_1145.value == null)
            break Fail546;
          c_846 = k_1145.value;
          y_845 = transformer_debug.const370;
          d_846 = c_846;
          z_845 = transformer_debug.const377;
          e_846 = d_846;
          a_846 = transformer_debug.const238;
          f_846 = e_846;
          term = s_var_0_4.instance.invoke(context, f_846, y_845, z_845, a_846, transformer_debug.constLocationInfo891);
          if(term == null)
            break Fail546;
          if(l_1145.value == null)
            break Fail546;
          k_846 = l_1145.value;
          g_846 = transformer_debug.const370;
          l_846 = k_846;
          h_846 = transformer_debug.const377;
          m_846 = l_846;
          i_846 = transformer_debug.const239;
          n_846 = m_846;
          term = s_var_0_4.instance.invoke(context, n_846, g_846, h_846, i_846, transformer_debug.constLocationInfo892);
          if(term == null)
            break Fail546;
          o_846 = x_845;
          t_846 = l_845;
          p_846 = transformer_debug.const370;
          u_846 = t_846;
          q_846 = transformer_debug.const377;
          v_846 = u_846;
          r_846 = transformer_debug.const277;
          w_846 = v_846;
          term = s_var_0_4.instance.invoke(context, w_846, p_846, q_846, r_846, transformer_debug.constLocationInfo893);
          if(term == null)
            break Fail546;
          b_847 = j_845;
          x_846 = transformer_debug.const370;
          c_847 = b_847;
          y_846 = transformer_debug.const377;
          d_847 = c_847;
          z_846 = transformer_debug.const381;
          e_847 = d_847;
          term = s_var_0_4.instance.invoke(context, e_847, x_846, y_846, z_846, transformer_debug.constLocationInfo894);
          if(term == null)
            break Fail546;
          term = o_846;
          f_847 = o_846;
          IStrategoTerm term260 = term;
          Success289:
          { 
            Fail549:
            { 
              IStrategoTerm g_847 = null;
              IStrategoTerm h_847 = null;
              IStrategoTerm j_847 = null;
              IStrategoTerm k_847 = null;
              IStrategoTerm l_847 = null;
              IStrategoTerm m_847 = null;
              IStrategoTerm o_847 = null;
              IStrategoTerm p_847 = null;
              IStrategoTerm r_847 = null;
              IStrategoTerm s_847 = null;
              IStrategoTerm t_847 = null;
              IStrategoTerm u_847 = null;
              IStrategoTerm v_847 = null;
              IStrategoTerm w_847 = null;
              IStrategoTerm y_847 = null;
              IStrategoTerm z_847 = null;
              IStrategoTerm a_848 = null;
              IStrategoTerm b_848 = null;
              IStrategoTerm c_848 = null;
              IStrategoTerm d_848 = null;
              IStrategoTerm f_848 = null;
              IStrategoTerm g_848 = null;
              IStrategoTerm h_848 = null;
              IStrategoTerm i_848 = null;
              IStrategoTerm j_848 = null;
              IStrategoTerm k_848 = null;
              IStrategoTerm m_848 = null;
              IStrategoTerm n_848 = null;
              IStrategoTerm p_848 = null;
              IStrategoTerm q_848 = null;
              j_847 = term;
              g_847 = transformer_debug.const370;
              k_847 = j_847;
              h_847 = transformer_debug.const377;
              l_847 = k_847;
              term = s_step_0_3.instance.invoke(context, l_847, g_847, h_847, transformer_debug.constLocationInfo895);
              if(term == null)
                break Fail549;
              r_847 = term;
              o_847 = transformer_debug.const370;
              s_847 = r_847;
              p_847 = transformer_debug.const377;
              t_847 = s_847;
              term = s_step_0_3.instance.invoke(context, t_847, o_847, p_847, transformer_debug.constLocationInfo896);
              if(term == null)
                break Fail549;
              term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, j_845);
              if(term == null)
                break Fail549;
              m_847 = term;
              k_845 = term;
              y_847 = m_847;
              u_847 = transformer_debug.const370;
              z_847 = y_847;
              v_847 = transformer_debug.const377;
              a_848 = z_847;
              w_847 = transformer_debug.const383;
              b_848 = a_848;
              term = s_var_0_4.instance.invoke(context, b_848, u_847, v_847, w_847, transformer_debug.constLocationInfo897);
              if(term == null)
                break Fail549;
              f_848 = term;
              c_848 = transformer_debug.const370;
              g_848 = f_848;
              d_848 = transformer_debug.const377;
              h_848 = g_848;
              term = s_step_0_3.instance.invoke(context, h_848, c_848, d_848, transformer_debug.constLocationInfo898);
              if(term == null)
                break Fail549;
              term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{k_845, l_845});
              m_845 = term;
              m_848 = term;
              i_848 = transformer_debug.const370;
              n_848 = m_848;
              j_848 = transformer_debug.const377;
              p_848 = n_848;
              k_848 = transformer_debug.const294;
              q_848 = p_848;
              term = s_var_0_4.instance.invoke(context, q_848, i_848, j_848, k_848, transformer_debug.constLocationInfo899);
              if(term == null)
                break Fail549;
              if(true)
                break Success289;
            }
            term = term260;
            IStrategoTerm n_845 = null;
            IStrategoTerm o_845 = null;
            IStrategoTerm s_848 = null;
            n_845 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail546;
            o_845 = term;
            s_848 = n_845;
            term = report_with_failure_0_2.instance.invoke(context, s_848, transformer_debug.const384, o_845);
            if(term == null)
              break Fail546;
          }
          term = f_847;
          IStrategoTerm t_848 = null;
          IStrategoTerm u_848 = null;
          IStrategoTerm w_848 = null;
          IStrategoTerm x_848 = null;
          IStrategoTerm y_848 = null;
          if(m_845 == null)
            break Fail546;
          w_848 = m_845;
          t_848 = transformer_debug.const370;
          x_848 = w_848;
          u_848 = transformer_debug.const377;
          y_848 = x_848;
          term = r_exit_0_3.instance.invoke(context, y_848, t_848, u_848, transformer_debug.constLocationInfo890);
          if(term == null)
            break Fail546;
        }
        else
        { 
          break Fail546;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}