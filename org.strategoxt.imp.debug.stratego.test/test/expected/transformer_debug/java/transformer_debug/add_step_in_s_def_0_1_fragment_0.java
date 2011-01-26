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

@SuppressWarnings("all") final class add_step_in_s_def_0_1_fragment_0 extends Strategy 
{ 
  TermReference j_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail550:
    { 
      IStrategoTerm term195 = term;
      Success290:
      { 
        Fail551:
        { 
          IStrategoTerm f_837 = null;
          IStrategoTerm g_837 = null;
          TermReference h_837 = new TermReference();
          IStrategoTerm i_837 = null;
          IStrategoTerm j_837 = null;
          IStrategoTerm m_837 = null;
          IStrategoTerm n_837 = null;
          IStrategoTerm o_837 = null;
          IStrategoTerm q_837 = null;
          IStrategoTerm r_837 = null;
          IStrategoTerm s_837 = null;
          IStrategoTerm t_837 = null;
          IStrategoTerm u_837 = null;
          IStrategoTerm v_837 = null;
          IStrategoTerm w_837 = null;
          IStrategoTerm y_837 = null;
          IStrategoTerm z_837 = null;
          IStrategoTerm a_838 = null;
          IStrategoTerm b_838 = null;
          IStrategoTerm c_838 = null;
          IStrategoTerm d_838 = null;
          IStrategoTerm e_838 = null;
          IStrategoTerm f_838 = null;
          IStrategoTerm h_838 = null;
          IStrategoTerm i_838 = null;
          IStrategoTerm j_838 = null;
          IStrategoTerm k_838 = null;
          IStrategoTerm l_838 = null;
          IStrategoTerm m_838 = null;
          IStrategoTerm n_838 = null;
          IStrategoTerm p_838 = null;
          IStrategoTerm q_838 = null;
          IStrategoTerm r_838 = null;
          IStrategoTerm s_838 = null;
          IStrategoTerm t_838 = null;
          IStrategoTerm u_838 = null;
          IStrategoTerm v_838 = null;
          IStrategoTerm y_838 = null;
          IStrategoTerm z_838 = null;
          IStrategoTerm a_839 = null;
          IStrategoTerm b_839 = null;
          IStrategoTerm c_839 = null;
          IStrategoTerm d_839 = null;
          IStrategoTerm e_839 = null;
          IStrategoTerm g_839 = null;
          IStrategoTerm h_839 = null;
          IStrategoTerm i_839 = null;
          IStrategoTerm j_839 = null;
          IStrategoTerm k_839 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consSDef_3 != ((IStrategoAppl)term).getConstructor())
            break Fail551;
          if(h_837.value == null)
            h_837.value = term.getSubterm(0);
          else
            if(h_837.value != term.getSubterm(0) && !h_837.value.match(term.getSubterm(0)))
              break Fail551;
          f_837 = term.getSubterm(1);
          i_837 = term.getSubterm(2);
          IStrategoList annos76 = term.getAnnotations();
          if(annos76.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos76).isEmpty())
            break Fail551;
          g_837 = ((IStrategoList)annos76).head();
          IStrategoTerm arg130 = ((IStrategoList)annos76).tail();
          if(arg130.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg130).isEmpty())
            break Fail551;
          m_837 = term;
          q_837 = term;
          n_837 = transformer_debug.const370;
          r_837 = q_837;
          o_837 = transformer_debug.const375;
          s_837 = r_837;
          term = r_enter_0_3.instance.invoke(context, s_837, n_837, o_837, transformer_debug.constLocationInfo558);
          if(term == null)
            break Fail551;
          term = m_837;
          t_837 = m_837;
          if(j_1145.value == null)
            break Fail551;
          y_837 = j_1145.value;
          u_837 = transformer_debug.const370;
          z_837 = y_837;
          v_837 = transformer_debug.const375;
          a_838 = z_837;
          w_837 = transformer_debug.const238;
          b_838 = a_838;
          term = s_var_0_4.instance.invoke(context, b_838, u_837, v_837, w_837, transformer_debug.constLocationInfo559);
          if(term == null)
            break Fail551;
          term = t_837;
          c_838 = t_837;
          if(h_837.value == null)
            break Fail551;
          h_838 = h_837.value;
          d_838 = transformer_debug.const370;
          i_838 = h_838;
          e_838 = transformer_debug.const375;
          j_838 = i_838;
          f_838 = transformer_debug.const293;
          k_838 = j_838;
          term = s_var_0_4.instance.invoke(context, k_838, d_838, e_838, f_838, transformer_debug.constLocationInfo560);
          if(term == null)
            break Fail551;
          p_838 = f_837;
          l_838 = transformer_debug.const370;
          q_838 = p_838;
          m_838 = transformer_debug.const375;
          r_838 = q_838;
          n_838 = transformer_debug.const291;
          s_838 = r_838;
          term = s_var_0_4.instance.invoke(context, s_838, l_838, m_838, n_838, transformer_debug.constLocationInfo350);
          if(term == null)
            break Fail551;
          y_838 = i_837;
          t_838 = transformer_debug.const370;
          z_838 = y_838;
          u_838 = transformer_debug.const375;
          a_839 = z_838;
          v_838 = transformer_debug.const277;
          b_839 = a_839;
          term = s_var_0_4.instance.invoke(context, b_839, t_838, u_838, v_838, transformer_debug.constLocationInfo561);
          if(term == null)
            break Fail551;
          g_839 = g_837;
          c_839 = transformer_debug.const370;
          h_839 = g_839;
          d_839 = transformer_debug.const375;
          i_839 = h_839;
          e_839 = transformer_debug.const235;
          j_839 = i_839;
          term = s_var_0_4.instance.invoke(context, j_839, c_839, d_839, e_839, transformer_debug.constLocationInfo562);
          if(term == null)
            break Fail551;
          term = c_838;
          k_839 = c_838;
          IStrategoTerm term196 = term;
          Success291:
          { 
            Fail552:
            { 
              IStrategoTerm l_839 = null;
              IStrategoTerm m_839 = null;
              IStrategoTerm o_839 = null;
              IStrategoTerm p_839 = null;
              IStrategoTerm q_839 = null;
              IStrategoTerm s_839 = null;
              IStrategoTerm t_839 = null;
              IStrategoTerm w_839 = null;
              IStrategoTerm a_840 = null;
              IStrategoTerm b_840 = null;
              IStrategoTerm q_840 = null;
              IStrategoTerm r_840 = null;
              IStrategoTerm s_840 = null;
              IStrategoTerm v_840 = null;
              IStrategoTerm w_840 = null;
              IStrategoTerm x_840 = null;
              IStrategoTerm y_840 = null;
              o_839 = term;
              l_839 = transformer_debug.const370;
              p_839 = o_839;
              m_839 = transformer_debug.const375;
              q_839 = p_839;
              term = s_step_0_3.instance.invoke(context, q_839, l_839, m_839, transformer_debug.constLocationInfo563);
              if(term == null)
                break Fail552;
              w_839 = i_837;
              s_839 = transformer_debug.const370;
              a_840 = w_839;
              t_839 = transformer_debug.const375;
              b_840 = a_840;
              term = s_step_0_3.instance.invoke(context, b_840, s_839, t_839, transformer_debug.constLocationInfo564);
              if(term == null)
                break Fail552;
              lifted143 lifted1430 = new lifted143();
              lifted1430.j_1145 = j_1145;
              lifted1430.h_837 = h_837;
              term = bottomup_1_0.instance.invoke(context, term, lifted1430);
              if(term == null)
                break Fail552;
              j_837 = term;
              v_840 = term;
              q_840 = transformer_debug.const370;
              w_840 = v_840;
              r_840 = transformer_debug.const375;
              x_840 = w_840;
              s_840 = transformer_debug.const294;
              y_840 = x_840;
              term = s_var_0_4.instance.invoke(context, y_840, q_840, r_840, s_840, transformer_debug.constLocationInfo567);
              if(term == null)
                break Fail552;
              if(true)
                break Success291;
            }
            term = term196;
            IStrategoTerm k_837 = null;
            IStrategoTerm l_837 = null;
            IStrategoTerm a_841 = null;
            k_837 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail551;
            l_837 = term;
            a_841 = k_837;
            term = report_with_failure_0_2.instance.invoke(context, a_841, transformer_debug.const376, l_837);
            if(term == null)
              break Fail551;
          }
          term = k_839;
          IStrategoTerm b_841 = null;
          IStrategoTerm c_841 = null;
          IStrategoTerm e_841 = null;
          IStrategoTerm f_841 = null;
          IStrategoTerm h_841 = null;
          if(h_837.value == null || j_837 == null)
            break Fail551;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consSDef_3, new IStrategoTerm[]{h_837.value, f_837, j_837}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(g_837, (IStrategoList)transformer_debug.constNil1)));
          e_841 = term;
          b_841 = transformer_debug.const370;
          f_841 = e_841;
          c_841 = transformer_debug.const375;
          h_841 = f_841;
          term = r_exit_0_3.instance.invoke(context, h_841, b_841, c_841, transformer_debug.constLocationInfo558);
          if(term == null)
            break Fail551;
          if(true)
            break Success290;
        }
        term = term195;
        IStrategoTerm p_832 = null;
        IStrategoTerm r_832 = null;
        IStrategoTerm s_832 = null;
        TermReference t_832 = new TermReference();
        IStrategoTerm u_832 = null;
        IStrategoTerm v_832 = null;
        IStrategoTerm y_832 = null;
        IStrategoTerm z_832 = null;
        IStrategoTerm a_833 = null;
        IStrategoTerm c_833 = null;
        IStrategoTerm d_833 = null;
        IStrategoTerm e_833 = null;
        IStrategoTerm f_833 = null;
        IStrategoTerm g_833 = null;
        IStrategoTerm h_833 = null;
        IStrategoTerm i_833 = null;
        IStrategoTerm k_833 = null;
        IStrategoTerm l_833 = null;
        IStrategoTerm m_833 = null;
        IStrategoTerm n_833 = null;
        IStrategoTerm o_833 = null;
        IStrategoTerm p_833 = null;
        IStrategoTerm q_833 = null;
        IStrategoTerm r_833 = null;
        IStrategoTerm t_833 = null;
        IStrategoTerm u_833 = null;
        IStrategoTerm v_833 = null;
        IStrategoTerm w_833 = null;
        IStrategoTerm x_833 = null;
        IStrategoTerm y_833 = null;
        IStrategoTerm z_833 = null;
        IStrategoTerm b_834 = null;
        IStrategoTerm c_834 = null;
        IStrategoTerm d_834 = null;
        IStrategoTerm e_834 = null;
        IStrategoTerm f_834 = null;
        IStrategoTerm g_834 = null;
        IStrategoTerm h_834 = null;
        IStrategoTerm j_834 = null;
        IStrategoTerm k_834 = null;
        IStrategoTerm l_834 = null;
        IStrategoTerm m_834 = null;
        IStrategoTerm n_834 = null;
        IStrategoTerm o_834 = null;
        IStrategoTerm p_834 = null;
        IStrategoTerm s_834 = null;
        IStrategoTerm t_834 = null;
        IStrategoTerm u_834 = null;
        IStrategoTerm v_834 = null;
        IStrategoTerm w_834 = null;
        IStrategoTerm x_834 = null;
        IStrategoTerm y_834 = null;
        IStrategoTerm a_835 = null;
        IStrategoTerm b_835 = null;
        IStrategoTerm c_835 = null;
        IStrategoTerm d_835 = null;
        IStrategoTerm e_835 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
          break Fail550;
        if(t_832.value == null)
          t_832.value = term.getSubterm(0);
        else
          if(t_832.value != term.getSubterm(0) && !t_832.value.match(term.getSubterm(0)))
            break Fail550;
        p_832 = term.getSubterm(1);
        r_832 = term.getSubterm(2);
        u_832 = term.getSubterm(3);
        IStrategoList annos77 = term.getAnnotations();
        if(annos77.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos77).isEmpty())
          break Fail550;
        s_832 = ((IStrategoList)annos77).head();
        IStrategoTerm arg131 = ((IStrategoList)annos77).tail();
        if(arg131.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg131).isEmpty())
          break Fail550;
        y_832 = term;
        c_833 = term;
        z_832 = transformer_debug.const370;
        d_833 = c_833;
        a_833 = transformer_debug.const375;
        e_833 = d_833;
        term = r_enter_0_3.instance.invoke(context, e_833, z_832, a_833, transformer_debug.constLocationInfo568);
        if(term == null)
          break Fail550;
        term = y_832;
        f_833 = y_832;
        if(j_1145.value == null)
          break Fail550;
        k_833 = j_1145.value;
        g_833 = transformer_debug.const370;
        l_833 = k_833;
        h_833 = transformer_debug.const375;
        m_833 = l_833;
        i_833 = transformer_debug.const238;
        n_833 = m_833;
        term = s_var_0_4.instance.invoke(context, n_833, g_833, h_833, i_833, transformer_debug.constLocationInfo569);
        if(term == null)
          break Fail550;
        term = f_833;
        o_833 = f_833;
        if(t_832.value == null)
          break Fail550;
        t_833 = t_832.value;
        p_833 = transformer_debug.const370;
        u_833 = t_833;
        q_833 = transformer_debug.const375;
        v_833 = u_833;
        r_833 = transformer_debug.const293;
        w_833 = v_833;
        term = s_var_0_4.instance.invoke(context, w_833, p_833, q_833, r_833, transformer_debug.constLocationInfo570);
        if(term == null)
          break Fail550;
        b_834 = p_832;
        x_833 = transformer_debug.const370;
        c_834 = b_834;
        y_833 = transformer_debug.const375;
        d_834 = c_834;
        z_833 = transformer_debug.const291;
        e_834 = d_834;
        term = s_var_0_4.instance.invoke(context, e_834, x_833, y_833, z_833, transformer_debug.constLocationInfo571);
        if(term == null)
          break Fail550;
        j_834 = r_832;
        f_834 = transformer_debug.const370;
        k_834 = j_834;
        g_834 = transformer_debug.const375;
        l_834 = k_834;
        h_834 = transformer_debug.const374;
        m_834 = l_834;
        term = s_var_0_4.instance.invoke(context, m_834, f_834, g_834, h_834, transformer_debug.constLocationInfo572);
        if(term == null)
          break Fail550;
        s_834 = u_832;
        n_834 = transformer_debug.const370;
        t_834 = s_834;
        o_834 = transformer_debug.const375;
        u_834 = t_834;
        p_834 = transformer_debug.const277;
        v_834 = u_834;
        term = s_var_0_4.instance.invoke(context, v_834, n_834, o_834, p_834, transformer_debug.constLocationInfo573);
        if(term == null)
          break Fail550;
        a_835 = s_832;
        w_834 = transformer_debug.const370;
        b_835 = a_835;
        x_834 = transformer_debug.const375;
        c_835 = b_835;
        y_834 = transformer_debug.const235;
        d_835 = c_835;
        term = s_var_0_4.instance.invoke(context, d_835, w_834, x_834, y_834, transformer_debug.constLocationInfo574);
        if(term == null)
          break Fail550;
        term = o_833;
        e_835 = o_833;
        IStrategoTerm term197 = term;
        Success292:
        { 
          Fail553:
          { 
            IStrategoTerm f_835 = null;
            IStrategoTerm g_835 = null;
            IStrategoTerm i_835 = null;
            IStrategoTerm j_835 = null;
            IStrategoTerm l_835 = null;
            IStrategoTerm m_835 = null;
            IStrategoTerm o_835 = null;
            IStrategoTerm t_835 = null;
            IStrategoTerm u_835 = null;
            IStrategoTerm w_835 = null;
            IStrategoTerm k_836 = null;
            IStrategoTerm m_836 = null;
            IStrategoTerm n_836 = null;
            IStrategoTerm p_836 = null;
            IStrategoTerm q_836 = null;
            IStrategoTerm r_836 = null;
            IStrategoTerm s_836 = null;
            i_835 = term;
            f_835 = transformer_debug.const370;
            j_835 = i_835;
            g_835 = transformer_debug.const375;
            l_835 = j_835;
            term = s_step_0_3.instance.invoke(context, l_835, f_835, g_835, transformer_debug.constLocationInfo575);
            if(term == null)
              break Fail553;
            t_835 = u_832;
            m_835 = transformer_debug.const370;
            u_835 = t_835;
            o_835 = transformer_debug.const375;
            w_835 = u_835;
            term = s_step_0_3.instance.invoke(context, w_835, m_835, o_835, transformer_debug.constLocationInfo576);
            if(term == null)
              break Fail553;
            lifted145 lifted1450 = new lifted145();
            lifted1450.j_1145 = j_1145;
            lifted1450.t_832 = t_832;
            term = bottomup_1_0.instance.invoke(context, term, lifted1450);
            if(term == null)
              break Fail553;
            v_832 = term;
            p_836 = term;
            k_836 = transformer_debug.const370;
            q_836 = p_836;
            m_836 = transformer_debug.const375;
            r_836 = q_836;
            n_836 = transformer_debug.const294;
            s_836 = r_836;
            term = s_var_0_4.instance.invoke(context, s_836, k_836, m_836, n_836, transformer_debug.constLocationInfo579);
            if(term == null)
              break Fail553;
            if(true)
              break Success292;
          }
          term = term197;
          IStrategoTerm w_832 = null;
          IStrategoTerm x_832 = null;
          IStrategoTerm u_836 = null;
          w_832 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail550;
          x_832 = term;
          u_836 = w_832;
          term = report_with_failure_0_2.instance.invoke(context, u_836, transformer_debug.const376, x_832);
          if(term == null)
            break Fail550;
        }
        term = e_835;
        IStrategoTerm v_836 = null;
        IStrategoTerm w_836 = null;
        IStrategoTerm z_836 = null;
        IStrategoTerm a_837 = null;
        IStrategoTerm b_837 = null;
        if(t_832.value == null || v_832 == null)
          break Fail550;
        term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consSDefT_4, new IStrategoTerm[]{t_832.value, p_832, r_832, v_832}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(s_832, (IStrategoList)transformer_debug.constNil1)));
        z_836 = term;
        v_836 = transformer_debug.const370;
        a_837 = z_836;
        w_836 = transformer_debug.const375;
        b_837 = a_837;
        term = r_exit_0_3.instance.invoke(context, b_837, v_836, w_836, transformer_debug.constLocationInfo568);
        if(term == null)
          break Fail550;
      }
      if(true)
        return term;
    }
    return null;
  }
}