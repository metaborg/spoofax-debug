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

@SuppressWarnings("all") final class add_var_in_r_def_0_1_fragment_0 extends Strategy 
{ 
  TermReference z_1144;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail584:
    { 
      IStrategoTerm term164 = term;
      IStrategoConstructor cons39 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success299:
      { 
        if(cons39 == transformer_debug._consRDef_3)
        { 
          Fail585:
          { 
            IStrategoTerm x_742 = null;
            IStrategoTerm y_742 = null;
            IStrategoTerm z_742 = null;
            IStrategoTerm a_743 = null;
            IStrategoTerm b_743 = null;
            IStrategoTerm c_743 = null;
            IStrategoTerm d_743 = null;
            IStrategoTerm e_743 = null;
            IStrategoTerm f_743 = null;
            IStrategoTerm h_743 = null;
            IStrategoTerm i_743 = null;
            IStrategoTerm j_743 = null;
            IStrategoTerm k_743 = null;
            IStrategoTerm l_743 = null;
            IStrategoTerm m_743 = null;
            IStrategoTerm n_743 = null;
            IStrategoTerm p_743 = null;
            IStrategoTerm q_743 = null;
            IStrategoTerm r_743 = null;
            IStrategoTerm s_743 = null;
            IStrategoTerm u_743 = null;
            IStrategoTerm v_743 = null;
            IStrategoTerm w_743 = null;
            IStrategoTerm x_743 = null;
            IStrategoTerm z_743 = null;
            IStrategoTerm a_744 = null;
            IStrategoTerm b_744 = null;
            IStrategoTerm c_744 = null;
            IStrategoTerm d_744 = null;
            IStrategoTerm e_744 = null;
            IStrategoTerm f_744 = null;
            IStrategoTerm h_744 = null;
            IStrategoTerm i_744 = null;
            IStrategoTerm j_744 = null;
            IStrategoTerm k_744 = null;
            IStrategoTerm l_744 = null;
            IStrategoTerm m_744 = null;
            IStrategoTerm o_744 = null;
            IStrategoTerm s_744 = null;
            IStrategoTerm t_744 = null;
            IStrategoTerm v_744 = null;
            IStrategoTerm w_744 = null;
            IStrategoTerm x_744 = null;
            IStrategoTerm y_744 = null;
            IStrategoTerm z_744 = null;
            IStrategoTerm c_745 = null;
            IStrategoTerm d_745 = null;
            IStrategoTerm e_745 = null;
            IStrategoTerm f_745 = null;
            IStrategoTerm g_745 = null;
            IStrategoTerm h_745 = null;
            IStrategoTerm i_745 = null;
            IStrategoTerm k_745 = null;
            IStrategoTerm l_745 = null;
            IStrategoTerm n_745 = null;
            IStrategoTerm o_745 = null;
            IStrategoTerm q_745 = null;
            IStrategoTerm r_745 = null;
            IStrategoTerm t_745 = null;
            IStrategoTerm u_745 = null;
            IStrategoTerm v_745 = null;
            IStrategoTerm w_745 = null;
            IStrategoTerm x_745 = null;
            IStrategoTerm z_745 = null;
            IStrategoTerm b_746 = null;
            IStrategoTerm c_746 = null;
            IStrategoTerm e_746 = null;
            IStrategoTerm f_746 = null;
            IStrategoTerm g_746 = null;
            IStrategoTerm h_746 = null;
            IStrategoTerm j_746 = null;
            IStrategoTerm k_746 = null;
            IStrategoTerm l_746 = null;
            IStrategoTerm m_746 = null;
            x_742 = term;
            a_743 = term.getSubterm(0);
            y_742 = term.getSubterm(1);
            b_743 = term.getSubterm(2);
            IStrategoList annos62 = term.getAnnotations();
            if(annos62.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos62).isEmpty())
              break Fail585;
            z_742 = ((IStrategoList)annos62).head();
            IStrategoTerm arg114 = ((IStrategoList)annos62).tail();
            if(arg114.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg114).isEmpty())
              break Fail585;
            d_743 = term;
            h_743 = term;
            e_743 = transformer_debug.const284;
            i_743 = h_743;
            f_743 = transformer_debug.const286;
            j_743 = i_743;
            term = r_enter_0_3.instance.invoke(context, j_743, e_743, f_743, transformer_debug.constLocationInfo309);
            if(term == null)
              break Fail585;
            term = d_743;
            k_743 = d_743;
            if(z_1144.value == null)
              break Fail585;
            p_743 = z_1144.value;
            l_743 = transformer_debug.const284;
            q_743 = p_743;
            m_743 = transformer_debug.const286;
            r_743 = q_743;
            n_743 = transformer_debug.const238;
            s_743 = r_743;
            term = s_var_0_4.instance.invoke(context, s_743, l_743, m_743, n_743, transformer_debug.constLocationInfo310);
            if(term == null)
              break Fail585;
            u_743 = k_743;
            z_743 = x_742;
            v_743 = transformer_debug.const284;
            a_744 = z_743;
            w_743 = transformer_debug.const286;
            b_744 = a_744;
            x_743 = transformer_debug.const290;
            c_744 = b_744;
            term = s_var_0_4.instance.invoke(context, c_744, v_743, w_743, x_743, transformer_debug.constLocationInfo311);
            if(term == null)
              break Fail585;
            h_744 = a_743;
            d_744 = transformer_debug.const284;
            i_744 = h_744;
            e_744 = transformer_debug.const286;
            j_744 = i_744;
            f_744 = transformer_debug.const287;
            k_744 = j_744;
            term = s_var_0_4.instance.invoke(context, k_744, d_744, e_744, f_744, transformer_debug.constLocationInfo312);
            if(term == null)
              break Fail585;
            s_744 = y_742;
            l_744 = transformer_debug.const284;
            t_744 = s_744;
            m_744 = transformer_debug.const286;
            v_744 = t_744;
            o_744 = transformer_debug.const291;
            w_744 = v_744;
            term = s_var_0_4.instance.invoke(context, w_744, l_744, m_744, o_744, transformer_debug.constLocationInfo313);
            if(term == null)
              break Fail585;
            c_745 = b_743;
            x_744 = transformer_debug.const284;
            d_745 = c_745;
            y_744 = transformer_debug.const286;
            e_745 = d_745;
            z_744 = transformer_debug.const288;
            f_745 = e_745;
            term = s_var_0_4.instance.invoke(context, f_745, x_744, y_744, z_744, transformer_debug.constLocationInfo314);
            if(term == null)
              break Fail585;
            k_745 = z_742;
            g_745 = transformer_debug.const284;
            l_745 = k_745;
            h_745 = transformer_debug.const286;
            n_745 = l_745;
            i_745 = transformer_debug.const235;
            o_745 = n_745;
            term = s_var_0_4.instance.invoke(context, o_745, g_745, h_745, i_745, transformer_debug.constLocationInfo315);
            if(term == null)
              break Fail585;
            term = u_743;
            t_745 = term;
            q_745 = transformer_debug.const284;
            u_745 = t_745;
            r_745 = transformer_debug.const286;
            v_745 = u_745;
            term = s_step_0_3.instance.invoke(context, v_745, q_745, r_745, transformer_debug.constLocationInfo316);
            if(term == null)
              break Fail585;
            z_745 = b_743;
            w_745 = transformer_debug.const284;
            b_746 = z_745;
            x_745 = transformer_debug.const286;
            c_746 = b_746;
            term = s_step_0_3.instance.invoke(context, c_746, w_745, x_745, transformer_debug.constLocationInfo317);
            if(term == null)
              break Fail585;
            e_746 = term;
            term = var_wrap_r_0_3.instance.invoke(context, e_746, z_1144.value, a_743, transformer_debug.constNil1);
            if(term == null)
              break Fail585;
            c_743 = term;
            j_746 = term;
            f_746 = transformer_debug.const284;
            k_746 = j_746;
            g_746 = transformer_debug.const286;
            l_746 = k_746;
            h_746 = transformer_debug.const289;
            m_746 = l_746;
            term = s_var_0_4.instance.invoke(context, m_746, f_746, g_746, h_746, transformer_debug.constLocationInfo318);
            if(term == null)
              break Fail585;
            IStrategoTerm n_746 = null;
            IStrategoTerm o_746 = null;
            IStrategoTerm q_746 = null;
            IStrategoTerm r_746 = null;
            IStrategoTerm s_746 = null;
            term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consRDef_3, new IStrategoTerm[]{a_743, y_742, c_743}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(z_742, (IStrategoList)transformer_debug.constNil1)));
            q_746 = term;
            n_746 = transformer_debug.const284;
            r_746 = q_746;
            o_746 = transformer_debug.const286;
            s_746 = r_746;
            term = r_exit_0_3.instance.invoke(context, s_746, n_746, o_746, transformer_debug.constLocationInfo309);
            if(term == null)
              break Fail585;
            if(true)
              break Success299;
          }
          term = term164;
        }
        if(cons39 == transformer_debug._consRDefT_4)
        { 
          IStrategoTerm s_738 = null;
          IStrategoTerm t_738 = null;
          IStrategoTerm u_738 = null;
          IStrategoTerm v_738 = null;
          IStrategoTerm x_738 = null;
          IStrategoTerm y_738 = null;
          IStrategoTerm z_738 = null;
          IStrategoTerm a_739 = null;
          IStrategoTerm b_739 = null;
          IStrategoTerm c_739 = null;
          IStrategoTerm e_739 = null;
          IStrategoTerm f_739 = null;
          IStrategoTerm g_739 = null;
          IStrategoTerm h_739 = null;
          IStrategoTerm i_739 = null;
          IStrategoTerm j_739 = null;
          IStrategoTerm k_739 = null;
          IStrategoTerm m_739 = null;
          IStrategoTerm n_739 = null;
          IStrategoTerm o_739 = null;
          IStrategoTerm p_739 = null;
          IStrategoTerm q_739 = null;
          IStrategoTerm r_739 = null;
          IStrategoTerm s_739 = null;
          IStrategoTerm t_739 = null;
          IStrategoTerm v_739 = null;
          IStrategoTerm w_739 = null;
          IStrategoTerm x_739 = null;
          IStrategoTerm y_739 = null;
          IStrategoTerm z_739 = null;
          IStrategoTerm a_740 = null;
          IStrategoTerm b_740 = null;
          IStrategoTerm d_740 = null;
          IStrategoTerm e_740 = null;
          IStrategoTerm f_740 = null;
          IStrategoTerm g_740 = null;
          IStrategoTerm h_740 = null;
          IStrategoTerm i_740 = null;
          IStrategoTerm k_740 = null;
          IStrategoTerm p_740 = null;
          IStrategoTerm q_740 = null;
          IStrategoTerm s_740 = null;
          IStrategoTerm t_740 = null;
          IStrategoTerm u_740 = null;
          IStrategoTerm v_740 = null;
          IStrategoTerm w_740 = null;
          IStrategoTerm z_740 = null;
          IStrategoTerm a_741 = null;
          IStrategoTerm b_741 = null;
          IStrategoTerm c_741 = null;
          IStrategoTerm d_741 = null;
          IStrategoTerm e_741 = null;
          IStrategoTerm f_741 = null;
          IStrategoTerm i_741 = null;
          IStrategoTerm j_741 = null;
          IStrategoTerm k_741 = null;
          IStrategoTerm l_741 = null;
          IStrategoTerm m_741 = null;
          IStrategoTerm n_741 = null;
          IStrategoTerm o_741 = null;
          IStrategoTerm q_741 = null;
          IStrategoTerm r_741 = null;
          IStrategoTerm s_741 = null;
          IStrategoTerm u_741 = null;
          IStrategoTerm w_741 = null;
          IStrategoTerm x_741 = null;
          IStrategoTerm z_741 = null;
          IStrategoTerm a_742 = null;
          IStrategoTerm b_742 = null;
          IStrategoTerm c_742 = null;
          IStrategoTerm d_742 = null;
          IStrategoTerm f_742 = null;
          IStrategoTerm g_742 = null;
          IStrategoTerm h_742 = null;
          IStrategoTerm i_742 = null;
          IStrategoTerm j_742 = null;
          IStrategoTerm k_742 = null;
          IStrategoTerm m_742 = null;
          IStrategoTerm n_742 = null;
          IStrategoTerm o_742 = null;
          IStrategoTerm p_742 = null;
          s_738 = term;
          v_738 = term.getSubterm(0);
          t_738 = term.getSubterm(1);
          x_738 = term.getSubterm(2);
          y_738 = term.getSubterm(3);
          IStrategoList annos63 = term.getAnnotations();
          if(annos63.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos63).isEmpty())
            break Fail584;
          u_738 = ((IStrategoList)annos63).head();
          IStrategoTerm arg115 = ((IStrategoList)annos63).tail();
          if(arg115.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg115).isEmpty())
            break Fail584;
          a_739 = term;
          e_739 = term;
          b_739 = transformer_debug.const284;
          f_739 = e_739;
          c_739 = transformer_debug.const286;
          g_739 = f_739;
          term = r_enter_0_3.instance.invoke(context, g_739, b_739, c_739, transformer_debug.constLocationInfo319);
          if(term == null)
            break Fail584;
          term = a_739;
          h_739 = a_739;
          if(z_1144.value == null)
            break Fail584;
          m_739 = z_1144.value;
          i_739 = transformer_debug.const284;
          n_739 = m_739;
          j_739 = transformer_debug.const286;
          o_739 = n_739;
          k_739 = transformer_debug.const238;
          p_739 = o_739;
          term = s_var_0_4.instance.invoke(context, p_739, i_739, j_739, k_739, transformer_debug.constLocationInfo320);
          if(term == null)
            break Fail584;
          q_739 = h_739;
          v_739 = s_738;
          r_739 = transformer_debug.const284;
          w_739 = v_739;
          s_739 = transformer_debug.const286;
          x_739 = w_739;
          t_739 = transformer_debug.const290;
          y_739 = x_739;
          term = s_var_0_4.instance.invoke(context, y_739, r_739, s_739, t_739, transformer_debug.constLocationInfo321);
          if(term == null)
            break Fail584;
          d_740 = v_738;
          z_739 = transformer_debug.const284;
          e_740 = d_740;
          a_740 = transformer_debug.const286;
          f_740 = e_740;
          b_740 = transformer_debug.const287;
          g_740 = f_740;
          term = s_var_0_4.instance.invoke(context, g_740, z_739, a_740, b_740, transformer_debug.constLocationInfo322);
          if(term == null)
            break Fail584;
          p_740 = t_738;
          h_740 = transformer_debug.const284;
          q_740 = p_740;
          i_740 = transformer_debug.const286;
          s_740 = q_740;
          k_740 = transformer_debug.const291;
          t_740 = s_740;
          term = s_var_0_4.instance.invoke(context, t_740, h_740, i_740, k_740, transformer_debug.constLocationInfo323);
          if(term == null)
            break Fail584;
          z_740 = x_738;
          u_740 = transformer_debug.const284;
          a_741 = z_740;
          v_740 = transformer_debug.const286;
          b_741 = a_741;
          w_740 = transformer_debug.const248;
          c_741 = b_741;
          term = s_var_0_4.instance.invoke(context, c_741, u_740, v_740, w_740, transformer_debug.constLocationInfo324);
          if(term == null)
            break Fail584;
          i_741 = y_738;
          d_741 = transformer_debug.const284;
          j_741 = i_741;
          e_741 = transformer_debug.const286;
          k_741 = j_741;
          f_741 = transformer_debug.const288;
          l_741 = k_741;
          term = s_var_0_4.instance.invoke(context, l_741, d_741, e_741, f_741, transformer_debug.constLocationInfo325);
          if(term == null)
            break Fail584;
          q_741 = u_738;
          m_741 = transformer_debug.const284;
          r_741 = q_741;
          n_741 = transformer_debug.const286;
          s_741 = r_741;
          o_741 = transformer_debug.const235;
          u_741 = s_741;
          term = s_var_0_4.instance.invoke(context, u_741, m_741, n_741, o_741, transformer_debug.constLocationInfo326);
          if(term == null)
            break Fail584;
          term = q_739;
          z_741 = term;
          w_741 = transformer_debug.const284;
          a_742 = z_741;
          x_741 = transformer_debug.const286;
          b_742 = a_742;
          term = s_step_0_3.instance.invoke(context, b_742, w_741, x_741, transformer_debug.constLocationInfo327);
          if(term == null)
            break Fail584;
          f_742 = y_738;
          c_742 = transformer_debug.const284;
          g_742 = f_742;
          d_742 = transformer_debug.const286;
          h_742 = g_742;
          term = s_step_0_3.instance.invoke(context, h_742, c_742, d_742, transformer_debug.constLocationInfo328);
          if(term == null)
            break Fail584;
          term = var_wrap_r_0_3.instance.invoke(context, term, z_1144.value, v_738, x_738);
          if(term == null)
            break Fail584;
          z_738 = term;
          m_742 = term;
          i_742 = transformer_debug.const284;
          n_742 = m_742;
          j_742 = transformer_debug.const286;
          o_742 = n_742;
          k_742 = transformer_debug.const289;
          p_742 = o_742;
          term = s_var_0_4.instance.invoke(context, p_742, i_742, j_742, k_742, transformer_debug.constLocationInfo329);
          if(term == null)
            break Fail584;
          IStrategoTerm q_742 = null;
          IStrategoTerm r_742 = null;
          IStrategoTerm t_742 = null;
          IStrategoTerm u_742 = null;
          IStrategoTerm v_742 = null;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consRDefT_4, new IStrategoTerm[]{v_738, t_738, x_738, z_738}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(u_738, (IStrategoList)transformer_debug.constNil1)));
          t_742 = term;
          q_742 = transformer_debug.const284;
          u_742 = t_742;
          r_742 = transformer_debug.const286;
          v_742 = u_742;
          term = r_exit_0_3.instance.invoke(context, v_742, q_742, r_742, transformer_debug.constLocationInfo319);
          if(term == null)
            break Fail584;
        }
        else
        { 
          break Fail584;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}