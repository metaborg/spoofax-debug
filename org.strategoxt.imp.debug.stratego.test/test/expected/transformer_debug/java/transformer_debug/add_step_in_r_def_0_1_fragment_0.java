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

@SuppressWarnings("all") final class add_step_in_r_def_0_1_fragment_0 extends Strategy 
{ 
  TermReference i_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail560:
    { 
      IStrategoTerm term190 = term;
      Success293:
      { 
        Fail561:
        { 
          IStrategoTerm k_824 = null;
          IStrategoTerm l_824 = null;
          TermReference m_824 = new TermReference();
          IStrategoTerm n_824 = null;
          IStrategoTerm o_824 = null;
          IStrategoTerm r_824 = null;
          IStrategoTerm s_824 = null;
          IStrategoTerm t_824 = null;
          IStrategoTerm v_824 = null;
          IStrategoTerm w_824 = null;
          IStrategoTerm y_824 = null;
          IStrategoTerm z_824 = null;
          IStrategoTerm a_825 = null;
          IStrategoTerm b_825 = null;
          IStrategoTerm c_825 = null;
          IStrategoTerm e_825 = null;
          IStrategoTerm f_825 = null;
          IStrategoTerm g_825 = null;
          IStrategoTerm h_825 = null;
          IStrategoTerm i_825 = null;
          IStrategoTerm j_825 = null;
          IStrategoTerm k_825 = null;
          IStrategoTerm l_825 = null;
          IStrategoTerm n_825 = null;
          IStrategoTerm o_825 = null;
          IStrategoTerm p_825 = null;
          IStrategoTerm q_825 = null;
          IStrategoTerm r_825 = null;
          IStrategoTerm s_825 = null;
          IStrategoTerm v_825 = null;
          IStrategoTerm y_825 = null;
          IStrategoTerm z_825 = null;
          IStrategoTerm d_826 = null;
          IStrategoTerm e_826 = null;
          IStrategoTerm g_826 = null;
          IStrategoTerm h_826 = null;
          IStrategoTerm i_826 = null;
          IStrategoTerm k_826 = null;
          IStrategoTerm l_826 = null;
          IStrategoTerm n_826 = null;
          IStrategoTerm o_826 = null;
          IStrategoTerm p_826 = null;
          IStrategoTerm q_826 = null;
          IStrategoTerm r_826 = null;
          IStrategoTerm t_826 = null;
          IStrategoTerm u_826 = null;
          IStrategoTerm v_826 = null;
          IStrategoTerm w_826 = null;
          IStrategoTerm x_826 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consRDef_3 != ((IStrategoAppl)term).getConstructor())
            break Fail561;
          if(m_824.value == null)
            m_824.value = term.getSubterm(0);
          else
            if(m_824.value != term.getSubterm(0) && !m_824.value.match(term.getSubterm(0)))
              break Fail561;
          k_824 = term.getSubterm(1);
          n_824 = term.getSubterm(2);
          IStrategoList annos73 = term.getAnnotations();
          if(annos73.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos73).isEmpty())
            break Fail561;
          l_824 = ((IStrategoList)annos73).head();
          IStrategoTerm arg127 = ((IStrategoList)annos73).tail();
          if(arg127.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg127).isEmpty())
            break Fail561;
          r_824 = term;
          v_824 = term;
          s_824 = transformer_debug.const370;
          w_824 = v_824;
          t_824 = transformer_debug.const372;
          y_824 = w_824;
          term = r_enter_0_3.instance.invoke(context, y_824, s_824, t_824, transformer_debug.constLocationInfo525);
          if(term == null)
            break Fail561;
          term = r_824;
          z_824 = r_824;
          if(i_1145.value == null)
            break Fail561;
          e_825 = i_1145.value;
          a_825 = transformer_debug.const370;
          f_825 = e_825;
          b_825 = transformer_debug.const372;
          g_825 = f_825;
          c_825 = transformer_debug.const238;
          h_825 = g_825;
          term = s_var_0_4.instance.invoke(context, h_825, a_825, b_825, c_825, transformer_debug.constLocationInfo526);
          if(term == null)
            break Fail561;
          term = z_824;
          i_825 = z_824;
          if(m_824.value == null)
            break Fail561;
          n_825 = m_824.value;
          j_825 = transformer_debug.const370;
          o_825 = n_825;
          k_825 = transformer_debug.const372;
          p_825 = o_825;
          l_825 = transformer_debug.const287;
          q_825 = p_825;
          term = s_var_0_4.instance.invoke(context, q_825, j_825, k_825, l_825, transformer_debug.constLocationInfo527);
          if(term == null)
            break Fail561;
          y_825 = k_824;
          r_825 = transformer_debug.const370;
          z_825 = y_825;
          s_825 = transformer_debug.const372;
          d_826 = z_825;
          v_825 = transformer_debug.const291;
          e_826 = d_826;
          term = s_var_0_4.instance.invoke(context, e_826, r_825, s_825, v_825, transformer_debug.constLocationInfo528);
          if(term == null)
            break Fail561;
          k_826 = n_824;
          g_826 = transformer_debug.const370;
          l_826 = k_826;
          h_826 = transformer_debug.const372;
          n_826 = l_826;
          i_826 = transformer_debug.const288;
          o_826 = n_826;
          term = s_var_0_4.instance.invoke(context, o_826, g_826, h_826, i_826, transformer_debug.constLocationInfo529);
          if(term == null)
            break Fail561;
          t_826 = l_824;
          p_826 = transformer_debug.const370;
          u_826 = t_826;
          q_826 = transformer_debug.const372;
          v_826 = u_826;
          r_826 = transformer_debug.const235;
          w_826 = v_826;
          term = s_var_0_4.instance.invoke(context, w_826, p_826, q_826, r_826, transformer_debug.constLocationInfo530);
          if(term == null)
            break Fail561;
          term = i_825;
          x_826 = i_825;
          IStrategoTerm term191 = term;
          Success294:
          { 
            Fail562:
            { 
              IStrategoTerm y_826 = null;
              IStrategoTerm a_827 = null;
              IStrategoTerm c_827 = null;
              IStrategoTerm d_827 = null;
              IStrategoTerm e_827 = null;
              IStrategoTerm f_827 = null;
              IStrategoTerm g_827 = null;
              IStrategoTerm i_827 = null;
              IStrategoTerm j_827 = null;
              IStrategoTerm k_827 = null;
              IStrategoTerm y_827 = null;
              IStrategoTerm z_827 = null;
              IStrategoTerm a_828 = null;
              IStrategoTerm c_828 = null;
              IStrategoTerm d_828 = null;
              IStrategoTerm e_828 = null;
              IStrategoTerm f_828 = null;
              c_827 = term;
              y_826 = transformer_debug.const370;
              d_827 = c_827;
              a_827 = transformer_debug.const372;
              e_827 = d_827;
              term = s_step_0_3.instance.invoke(context, e_827, y_826, a_827, transformer_debug.constLocationInfo531);
              if(term == null)
                break Fail562;
              i_827 = n_824;
              f_827 = transformer_debug.const370;
              j_827 = i_827;
              g_827 = transformer_debug.const372;
              k_827 = j_827;
              term = s_step_0_3.instance.invoke(context, k_827, f_827, g_827, transformer_debug.constLocationInfo532);
              if(term == null)
                break Fail562;
              lifted137 lifted1370 = new lifted137();
              lifted1370.i_1145 = i_1145;
              lifted1370.m_824 = m_824;
              term = bottomup_1_0.instance.invoke(context, term, lifted1370);
              if(term == null)
                break Fail562;
              o_824 = term;
              c_828 = term;
              y_827 = transformer_debug.const370;
              d_828 = c_828;
              z_827 = transformer_debug.const372;
              e_828 = d_828;
              a_828 = transformer_debug.const289;
              f_828 = e_828;
              term = s_var_0_4.instance.invoke(context, f_828, y_827, z_827, a_828, transformer_debug.constLocationInfo535);
              if(term == null)
                break Fail562;
              if(true)
                break Success294;
            }
            term = term191;
            IStrategoTerm p_824 = null;
            IStrategoTerm q_824 = null;
            IStrategoTerm h_828 = null;
            p_824 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail561;
            q_824 = term;
            h_828 = p_824;
            term = report_with_failure_0_2.instance.invoke(context, h_828, transformer_debug.const373, q_824);
            if(term == null)
              break Fail561;
          }
          term = x_826;
          IStrategoTerm i_828 = null;
          IStrategoTerm j_828 = null;
          IStrategoTerm l_828 = null;
          IStrategoTerm m_828 = null;
          IStrategoTerm n_828 = null;
          if(m_824.value == null || o_824 == null)
            break Fail561;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consRDef_3, new IStrategoTerm[]{m_824.value, k_824, o_824}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(l_824, (IStrategoList)transformer_debug.constNil1)));
          l_828 = term;
          i_828 = transformer_debug.const370;
          m_828 = l_828;
          j_828 = transformer_debug.const372;
          n_828 = m_828;
          term = r_exit_0_3.instance.invoke(context, n_828, i_828, j_828, transformer_debug.constLocationInfo525);
          if(term == null)
            break Fail561;
          if(true)
            break Success293;
        }
        term = term190;
        IStrategoTerm s_819 = null;
        IStrategoTerm t_819 = null;
        IStrategoTerm u_819 = null;
        TermReference v_819 = new TermReference();
        IStrategoTerm x_819 = null;
        IStrategoTerm y_819 = null;
        IStrategoTerm b_820 = null;
        IStrategoTerm c_820 = null;
        IStrategoTerm d_820 = null;
        IStrategoTerm f_820 = null;
        IStrategoTerm g_820 = null;
        IStrategoTerm h_820 = null;
        IStrategoTerm i_820 = null;
        IStrategoTerm j_820 = null;
        IStrategoTerm k_820 = null;
        IStrategoTerm l_820 = null;
        IStrategoTerm n_820 = null;
        IStrategoTerm o_820 = null;
        IStrategoTerm p_820 = null;
        IStrategoTerm q_820 = null;
        IStrategoTerm r_820 = null;
        IStrategoTerm s_820 = null;
        IStrategoTerm t_820 = null;
        IStrategoTerm u_820 = null;
        IStrategoTerm a_821 = null;
        IStrategoTerm b_821 = null;
        IStrategoTerm d_821 = null;
        IStrategoTerm e_821 = null;
        IStrategoTerm i_821 = null;
        IStrategoTerm j_821 = null;
        IStrategoTerm l_821 = null;
        IStrategoTerm n_821 = null;
        IStrategoTerm o_821 = null;
        IStrategoTerm p_821 = null;
        IStrategoTerm q_821 = null;
        IStrategoTerm s_821 = null;
        IStrategoTerm t_821 = null;
        IStrategoTerm u_821 = null;
        IStrategoTerm w_821 = null;
        IStrategoTerm x_821 = null;
        IStrategoTerm y_821 = null;
        IStrategoTerm z_821 = null;
        IStrategoTerm a_822 = null;
        IStrategoTerm b_822 = null;
        IStrategoTerm d_822 = null;
        IStrategoTerm f_822 = null;
        IStrategoTerm g_822 = null;
        IStrategoTerm h_822 = null;
        IStrategoTerm i_822 = null;
        IStrategoTerm j_822 = null;
        IStrategoTerm k_822 = null;
        IStrategoTerm l_822 = null;
        IStrategoTerm n_822 = null;
        IStrategoTerm o_822 = null;
        IStrategoTerm p_822 = null;
        IStrategoTerm r_822 = null;
        IStrategoTerm s_822 = null;
        if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consRDefT_4 != ((IStrategoAppl)term).getConstructor())
          break Fail560;
        if(v_819.value == null)
          v_819.value = term.getSubterm(0);
        else
          if(v_819.value != term.getSubterm(0) && !v_819.value.match(term.getSubterm(0)))
            break Fail560;
        s_819 = term.getSubterm(1);
        t_819 = term.getSubterm(2);
        x_819 = term.getSubterm(3);
        IStrategoList annos74 = term.getAnnotations();
        if(annos74.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos74).isEmpty())
          break Fail560;
        u_819 = ((IStrategoList)annos74).head();
        IStrategoTerm arg128 = ((IStrategoList)annos74).tail();
        if(arg128.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg128).isEmpty())
          break Fail560;
        b_820 = term;
        f_820 = term;
        c_820 = transformer_debug.const370;
        g_820 = f_820;
        d_820 = transformer_debug.const372;
        h_820 = g_820;
        term = r_enter_0_3.instance.invoke(context, h_820, c_820, d_820, transformer_debug.constLocationInfo536);
        if(term == null)
          break Fail560;
        term = b_820;
        i_820 = b_820;
        if(i_1145.value == null)
          break Fail560;
        n_820 = i_1145.value;
        j_820 = transformer_debug.const370;
        o_820 = n_820;
        k_820 = transformer_debug.const372;
        p_820 = o_820;
        l_820 = transformer_debug.const238;
        q_820 = p_820;
        term = s_var_0_4.instance.invoke(context, q_820, j_820, k_820, l_820, transformer_debug.constLocationInfo537);
        if(term == null)
          break Fail560;
        term = i_820;
        r_820 = i_820;
        if(v_819.value == null)
          break Fail560;
        a_821 = v_819.value;
        s_820 = transformer_debug.const370;
        b_821 = a_821;
        t_820 = transformer_debug.const372;
        d_821 = b_821;
        u_820 = transformer_debug.const287;
        e_821 = d_821;
        term = s_var_0_4.instance.invoke(context, e_821, s_820, t_820, u_820, transformer_debug.constLocationInfo538);
        if(term == null)
          break Fail560;
        n_821 = s_819;
        i_821 = transformer_debug.const370;
        o_821 = n_821;
        j_821 = transformer_debug.const372;
        p_821 = o_821;
        l_821 = transformer_debug.const291;
        q_821 = p_821;
        term = s_var_0_4.instance.invoke(context, q_821, i_821, j_821, l_821, transformer_debug.constLocationInfo539);
        if(term == null)
          break Fail560;
        w_821 = t_819;
        s_821 = transformer_debug.const370;
        x_821 = w_821;
        t_821 = transformer_debug.const372;
        y_821 = x_821;
        u_821 = transformer_debug.const374;
        z_821 = y_821;
        term = s_var_0_4.instance.invoke(context, z_821, s_821, t_821, u_821, transformer_debug.constLocationInfo540);
        if(term == null)
          break Fail560;
        f_822 = x_819;
        a_822 = transformer_debug.const370;
        g_822 = f_822;
        b_822 = transformer_debug.const372;
        h_822 = g_822;
        d_822 = transformer_debug.const288;
        i_822 = h_822;
        term = s_var_0_4.instance.invoke(context, i_822, a_822, b_822, d_822, transformer_debug.constLocationInfo541);
        if(term == null)
          break Fail560;
        n_822 = u_819;
        j_822 = transformer_debug.const370;
        o_822 = n_822;
        k_822 = transformer_debug.const372;
        p_822 = o_822;
        l_822 = transformer_debug.const235;
        r_822 = p_822;
        term = s_var_0_4.instance.invoke(context, r_822, j_822, k_822, l_822, transformer_debug.constLocationInfo542);
        if(term == null)
          break Fail560;
        term = r_820;
        s_822 = r_820;
        IStrategoTerm term192 = term;
        Success295:
        { 
          Fail563:
          { 
            IStrategoTerm t_822 = null;
            IStrategoTerm u_822 = null;
            IStrategoTerm w_822 = null;
            IStrategoTerm x_822 = null;
            IStrategoTerm y_822 = null;
            IStrategoTerm z_822 = null;
            IStrategoTerm a_823 = null;
            IStrategoTerm c_823 = null;
            IStrategoTerm d_823 = null;
            IStrategoTerm e_823 = null;
            IStrategoTerm r_823 = null;
            IStrategoTerm s_823 = null;
            IStrategoTerm t_823 = null;
            IStrategoTerm v_823 = null;
            IStrategoTerm w_823 = null;
            IStrategoTerm x_823 = null;
            IStrategoTerm y_823 = null;
            w_822 = term;
            t_822 = transformer_debug.const370;
            x_822 = w_822;
            u_822 = transformer_debug.const372;
            y_822 = x_822;
            term = s_step_0_3.instance.invoke(context, y_822, t_822, u_822, transformer_debug.constLocationInfo543);
            if(term == null)
              break Fail563;
            c_823 = x_819;
            z_822 = transformer_debug.const370;
            d_823 = c_823;
            a_823 = transformer_debug.const372;
            e_823 = d_823;
            term = s_step_0_3.instance.invoke(context, e_823, z_822, a_823, transformer_debug.constLocationInfo544);
            if(term == null)
              break Fail563;
            lifted139 lifted1390 = new lifted139();
            lifted1390.i_1145 = i_1145;
            lifted1390.v_819 = v_819;
            term = bottomup_1_0.instance.invoke(context, term, lifted1390);
            if(term == null)
              break Fail563;
            y_819 = term;
            v_823 = term;
            r_823 = transformer_debug.const370;
            w_823 = v_823;
            s_823 = transformer_debug.const372;
            x_823 = w_823;
            t_823 = transformer_debug.const289;
            y_823 = x_823;
            term = s_var_0_4.instance.invoke(context, y_823, r_823, s_823, t_823, transformer_debug.constLocationInfo547);
            if(term == null)
              break Fail563;
            if(true)
              break Success295;
          }
          term = term192;
          IStrategoTerm z_819 = null;
          IStrategoTerm a_820 = null;
          IStrategoTerm a_824 = null;
          z_819 = term;
          term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
          if(term == null)
            break Fail560;
          a_820 = term;
          a_824 = z_819;
          term = report_with_failure_0_2.instance.invoke(context, a_824, transformer_debug.const373, a_820);
          if(term == null)
            break Fail560;
        }
        term = s_822;
        IStrategoTerm b_824 = null;
        IStrategoTerm c_824 = null;
        IStrategoTerm e_824 = null;
        IStrategoTerm f_824 = null;
        IStrategoTerm g_824 = null;
        if(v_819.value == null || y_819 == null)
          break Fail560;
        term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consRDefT_4, new IStrategoTerm[]{v_819.value, s_819, t_819, y_819}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(u_819, (IStrategoList)transformer_debug.constNil1)));
        e_824 = term;
        b_824 = transformer_debug.const370;
        f_824 = e_824;
        c_824 = transformer_debug.const372;
        g_824 = f_824;
        term = r_exit_0_3.instance.invoke(context, g_824, b_824, c_824, transformer_debug.constLocationInfo536);
        if(term == null)
          break Fail560;
      }
      if(true)
        return term;
    }
    return null;
  }
}