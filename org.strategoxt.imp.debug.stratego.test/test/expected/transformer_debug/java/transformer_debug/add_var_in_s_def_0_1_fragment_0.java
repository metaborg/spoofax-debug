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

@SuppressWarnings("all") final class add_var_in_s_def_0_1_fragment_0 extends Strategy 
{ 
  TermReference a_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail582:
    { 
      IStrategoTerm term166 = term;
      IStrategoConstructor cons38 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success298:
      { 
        if(cons38 == transformer_debug._consSDef_3)
        { 
          Fail583:
          { 
            IStrategoTerm a_754 = null;
            IStrategoTerm b_754 = null;
            IStrategoTerm c_754 = null;
            IStrategoTerm d_754 = null;
            IStrategoTerm e_754 = null;
            IStrategoTerm f_754 = null;
            IStrategoTerm g_754 = null;
            IStrategoTerm h_754 = null;
            IStrategoTerm j_754 = null;
            IStrategoTerm k_754 = null;
            IStrategoTerm l_754 = null;
            IStrategoTerm m_754 = null;
            IStrategoTerm n_754 = null;
            IStrategoTerm o_754 = null;
            IStrategoTerm p_754 = null;
            IStrategoTerm r_754 = null;
            IStrategoTerm s_754 = null;
            IStrategoTerm t_754 = null;
            IStrategoTerm u_754 = null;
            IStrategoTerm v_754 = null;
            IStrategoTerm w_754 = null;
            IStrategoTerm x_754 = null;
            IStrategoTerm y_754 = null;
            IStrategoTerm a_755 = null;
            IStrategoTerm b_755 = null;
            IStrategoTerm c_755 = null;
            IStrategoTerm d_755 = null;
            IStrategoTerm e_755 = null;
            IStrategoTerm f_755 = null;
            IStrategoTerm g_755 = null;
            IStrategoTerm i_755 = null;
            IStrategoTerm j_755 = null;
            IStrategoTerm k_755 = null;
            IStrategoTerm l_755 = null;
            IStrategoTerm m_755 = null;
            IStrategoTerm n_755 = null;
            IStrategoTerm o_755 = null;
            IStrategoTerm q_755 = null;
            IStrategoTerm r_755 = null;
            IStrategoTerm s_755 = null;
            IStrategoTerm t_755 = null;
            IStrategoTerm u_755 = null;
            IStrategoTerm w_755 = null;
            IStrategoTerm x_755 = null;
            IStrategoTerm z_755 = null;
            IStrategoTerm a_756 = null;
            IStrategoTerm b_756 = null;
            IStrategoTerm c_756 = null;
            IStrategoTerm e_756 = null;
            IStrategoTerm f_756 = null;
            IStrategoTerm h_756 = null;
            IStrategoTerm i_756 = null;
            IStrategoTerm j_756 = null;
            IStrategoTerm k_756 = null;
            IStrategoTerm l_756 = null;
            IStrategoTerm n_756 = null;
            IStrategoTerm o_756 = null;
            IStrategoTerm p_756 = null;
            IStrategoTerm t_756 = null;
            IStrategoTerm u_756 = null;
            IStrategoTerm v_756 = null;
            IStrategoTerm x_756 = null;
            IStrategoTerm c_757 = null;
            IStrategoTerm d_757 = null;
            IStrategoTerm f_757 = null;
            IStrategoTerm g_757 = null;
            c_754 = term.getSubterm(0);
            a_754 = term.getSubterm(1);
            d_754 = term.getSubterm(2);
            IStrategoList annos65 = term.getAnnotations();
            if(annos65.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos65).isEmpty())
              break Fail583;
            b_754 = ((IStrategoList)annos65).head();
            IStrategoTerm arg117 = ((IStrategoList)annos65).tail();
            if(arg117.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg117).isEmpty())
              break Fail583;
            f_754 = term;
            j_754 = term;
            g_754 = transformer_debug.const284;
            k_754 = j_754;
            h_754 = transformer_debug.const292;
            l_754 = k_754;
            term = r_enter_0_3.instance.invoke(context, l_754, g_754, h_754, transformer_debug.constLocationInfo338);
            if(term == null)
              break Fail583;
            term = f_754;
            m_754 = f_754;
            if(a_1145.value == null)
              break Fail583;
            r_754 = a_1145.value;
            n_754 = transformer_debug.const284;
            s_754 = r_754;
            o_754 = transformer_debug.const292;
            t_754 = s_754;
            p_754 = transformer_debug.const238;
            u_754 = t_754;
            term = s_var_0_4.instance.invoke(context, u_754, n_754, o_754, p_754, transformer_debug.constLocationInfo339);
            if(term == null)
              break Fail583;
            v_754 = m_754;
            a_755 = c_754;
            w_754 = transformer_debug.const284;
            b_755 = a_755;
            x_754 = transformer_debug.const292;
            c_755 = b_755;
            y_754 = transformer_debug.const293;
            d_755 = c_755;
            term = s_var_0_4.instance.invoke(context, d_755, w_754, x_754, y_754, transformer_debug.constLocationInfo340);
            if(term == null)
              break Fail583;
            i_755 = a_754;
            e_755 = transformer_debug.const284;
            j_755 = i_755;
            f_755 = transformer_debug.const292;
            k_755 = j_755;
            g_755 = transformer_debug.const291;
            l_755 = k_755;
            term = s_var_0_4.instance.invoke(context, l_755, e_755, f_755, g_755, transformer_debug.constLocationInfo341);
            if(term == null)
              break Fail583;
            q_755 = d_754;
            m_755 = transformer_debug.const284;
            r_755 = q_755;
            n_755 = transformer_debug.const292;
            s_755 = r_755;
            o_755 = transformer_debug.const277;
            t_755 = s_755;
            term = s_var_0_4.instance.invoke(context, t_755, m_755, n_755, o_755, transformer_debug.constLocationInfo342);
            if(term == null)
              break Fail583;
            z_755 = b_754;
            u_755 = transformer_debug.const284;
            a_756 = z_755;
            w_755 = transformer_debug.const292;
            b_756 = a_756;
            x_755 = transformer_debug.const235;
            c_756 = b_756;
            term = s_var_0_4.instance.invoke(context, c_756, u_755, w_755, x_755, transformer_debug.constLocationInfo343);
            if(term == null)
              break Fail583;
            term = v_754;
            h_756 = term;
            e_756 = transformer_debug.const284;
            i_756 = h_756;
            f_756 = transformer_debug.const292;
            j_756 = i_756;
            term = s_step_0_3.instance.invoke(context, j_756, e_756, f_756, transformer_debug.constLocationInfo344);
            if(term == null)
              break Fail583;
            n_756 = d_754;
            k_756 = transformer_debug.const284;
            o_756 = n_756;
            l_756 = transformer_debug.const292;
            p_756 = o_756;
            term = s_step_0_3.instance.invoke(context, p_756, k_756, l_756, transformer_debug.constLocationInfo345);
            if(term == null)
              break Fail583;
            t_756 = term;
            term = var_wrap_s_0_3.instance.invoke(context, t_756, a_1145.value, c_754, transformer_debug.constNil1);
            if(term == null)
              break Fail583;
            e_754 = term;
            c_757 = term;
            u_756 = transformer_debug.const284;
            d_757 = c_757;
            v_756 = transformer_debug.const292;
            f_757 = d_757;
            x_756 = transformer_debug.const294;
            g_757 = f_757;
            term = s_var_0_4.instance.invoke(context, g_757, u_756, v_756, x_756, transformer_debug.constLocationInfo346);
            if(term == null)
              break Fail583;
            IStrategoTerm h_757 = null;
            IStrategoTerm i_757 = null;
            IStrategoTerm k_757 = null;
            IStrategoTerm m_757 = null;
            IStrategoTerm n_757 = null;
            term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consSDef_3, new IStrategoTerm[]{c_754, a_754, e_754}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(b_754, (IStrategoList)transformer_debug.constNil1)));
            k_757 = term;
            h_757 = transformer_debug.const284;
            m_757 = k_757;
            i_757 = transformer_debug.const292;
            n_757 = m_757;
            term = r_exit_0_3.instance.invoke(context, n_757, h_757, i_757, transformer_debug.constLocationInfo338);
            if(term == null)
              break Fail583;
            if(true)
              break Success298;
          }
          term = term166;
        }
        if(cons38 == transformer_debug._consSDefT_4)
        { 
          IStrategoTerm c_750 = null;
          IStrategoTerm d_750 = null;
          IStrategoTerm e_750 = null;
          IStrategoTerm f_750 = null;
          IStrategoTerm g_750 = null;
          IStrategoTerm h_750 = null;
          IStrategoTerm i_750 = null;
          IStrategoTerm j_750 = null;
          IStrategoTerm k_750 = null;
          IStrategoTerm m_750 = null;
          IStrategoTerm n_750 = null;
          IStrategoTerm o_750 = null;
          IStrategoTerm p_750 = null;
          IStrategoTerm q_750 = null;
          IStrategoTerm r_750 = null;
          IStrategoTerm s_750 = null;
          IStrategoTerm u_750 = null;
          IStrategoTerm v_750 = null;
          IStrategoTerm w_750 = null;
          IStrategoTerm x_750 = null;
          IStrategoTerm y_750 = null;
          IStrategoTerm z_750 = null;
          IStrategoTerm a_751 = null;
          IStrategoTerm b_751 = null;
          IStrategoTerm d_751 = null;
          IStrategoTerm e_751 = null;
          IStrategoTerm f_751 = null;
          IStrategoTerm h_751 = null;
          IStrategoTerm i_751 = null;
          IStrategoTerm j_751 = null;
          IStrategoTerm k_751 = null;
          IStrategoTerm m_751 = null;
          IStrategoTerm n_751 = null;
          IStrategoTerm o_751 = null;
          IStrategoTerm p_751 = null;
          IStrategoTerm q_751 = null;
          IStrategoTerm r_751 = null;
          IStrategoTerm s_751 = null;
          IStrategoTerm u_751 = null;
          IStrategoTerm v_751 = null;
          IStrategoTerm y_751 = null;
          IStrategoTerm z_751 = null;
          IStrategoTerm b_752 = null;
          IStrategoTerm c_752 = null;
          IStrategoTerm g_752 = null;
          IStrategoTerm j_752 = null;
          IStrategoTerm k_752 = null;
          IStrategoTerm l_752 = null;
          IStrategoTerm m_752 = null;
          IStrategoTerm n_752 = null;
          IStrategoTerm o_752 = null;
          IStrategoTerm q_752 = null;
          IStrategoTerm s_752 = null;
          IStrategoTerm t_752 = null;
          IStrategoTerm u_752 = null;
          IStrategoTerm v_752 = null;
          IStrategoTerm x_752 = null;
          IStrategoTerm y_752 = null;
          IStrategoTerm b_753 = null;
          IStrategoTerm c_753 = null;
          IStrategoTerm d_753 = null;
          IStrategoTerm e_753 = null;
          IStrategoTerm f_753 = null;
          IStrategoTerm h_753 = null;
          IStrategoTerm i_753 = null;
          IStrategoTerm j_753 = null;
          IStrategoTerm k_753 = null;
          IStrategoTerm l_753 = null;
          IStrategoTerm m_753 = null;
          IStrategoTerm p_753 = null;
          IStrategoTerm q_753 = null;
          IStrategoTerm r_753 = null;
          IStrategoTerm s_753 = null;
          e_750 = term.getSubterm(0);
          c_750 = term.getSubterm(1);
          f_750 = term.getSubterm(2);
          g_750 = term.getSubterm(3);
          IStrategoList annos66 = term.getAnnotations();
          if(annos66.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos66).isEmpty())
            break Fail582;
          d_750 = ((IStrategoList)annos66).head();
          IStrategoTerm arg118 = ((IStrategoList)annos66).tail();
          if(arg118.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg118).isEmpty())
            break Fail582;
          i_750 = term;
          m_750 = term;
          j_750 = transformer_debug.const284;
          n_750 = m_750;
          k_750 = transformer_debug.const292;
          o_750 = n_750;
          term = r_enter_0_3.instance.invoke(context, o_750, j_750, k_750, transformer_debug.constLocationInfo347);
          if(term == null)
            break Fail582;
          term = i_750;
          p_750 = i_750;
          if(a_1145.value == null)
            break Fail582;
          u_750 = a_1145.value;
          q_750 = transformer_debug.const284;
          v_750 = u_750;
          r_750 = transformer_debug.const292;
          w_750 = v_750;
          s_750 = transformer_debug.const238;
          x_750 = w_750;
          term = s_var_0_4.instance.invoke(context, x_750, q_750, r_750, s_750, transformer_debug.constLocationInfo348);
          if(term == null)
            break Fail582;
          y_750 = p_750;
          d_751 = e_750;
          z_750 = transformer_debug.const284;
          e_751 = d_751;
          a_751 = transformer_debug.const292;
          f_751 = e_751;
          b_751 = transformer_debug.const293;
          h_751 = f_751;
          term = s_var_0_4.instance.invoke(context, h_751, z_750, a_751, b_751, transformer_debug.constLocationInfo349);
          if(term == null)
            break Fail582;
          m_751 = c_750;
          i_751 = transformer_debug.const284;
          n_751 = m_751;
          j_751 = transformer_debug.const292;
          o_751 = n_751;
          k_751 = transformer_debug.const291;
          p_751 = o_751;
          term = s_var_0_4.instance.invoke(context, p_751, i_751, j_751, k_751, transformer_debug.constLocationInfo350);
          if(term == null)
            break Fail582;
          u_751 = f_750;
          q_751 = transformer_debug.const284;
          v_751 = u_751;
          r_751 = transformer_debug.const292;
          y_751 = v_751;
          s_751 = transformer_debug.const248;
          z_751 = y_751;
          term = s_var_0_4.instance.invoke(context, z_751, q_751, r_751, s_751, transformer_debug.constLocationInfo351);
          if(term == null)
            break Fail582;
          j_752 = g_750;
          b_752 = transformer_debug.const284;
          k_752 = j_752;
          c_752 = transformer_debug.const292;
          l_752 = k_752;
          g_752 = transformer_debug.const277;
          m_752 = l_752;
          term = s_var_0_4.instance.invoke(context, m_752, b_752, c_752, g_752, transformer_debug.constLocationInfo352);
          if(term == null)
            break Fail582;
          s_752 = d_750;
          n_752 = transformer_debug.const284;
          t_752 = s_752;
          o_752 = transformer_debug.const292;
          u_752 = t_752;
          q_752 = transformer_debug.const235;
          v_752 = u_752;
          term = s_var_0_4.instance.invoke(context, v_752, n_752, o_752, q_752, transformer_debug.constLocationInfo353);
          if(term == null)
            break Fail582;
          term = y_750;
          b_753 = term;
          x_752 = transformer_debug.const284;
          c_753 = b_753;
          y_752 = transformer_debug.const292;
          d_753 = c_753;
          term = s_step_0_3.instance.invoke(context, d_753, x_752, y_752, transformer_debug.constLocationInfo354);
          if(term == null)
            break Fail582;
          h_753 = g_750;
          e_753 = transformer_debug.const284;
          i_753 = h_753;
          f_753 = transformer_debug.const292;
          j_753 = i_753;
          term = s_step_0_3.instance.invoke(context, j_753, e_753, f_753, transformer_debug.constLocationInfo355);
          if(term == null)
            break Fail582;
          term = var_wrap_s_0_3.instance.invoke(context, term, a_1145.value, e_750, f_750);
          if(term == null)
            break Fail582;
          h_750 = term;
          p_753 = term;
          k_753 = transformer_debug.const284;
          q_753 = p_753;
          l_753 = transformer_debug.const292;
          r_753 = q_753;
          m_753 = transformer_debug.const294;
          s_753 = r_753;
          term = s_var_0_4.instance.invoke(context, s_753, k_753, l_753, m_753, transformer_debug.constLocationInfo356);
          if(term == null)
            break Fail582;
          IStrategoTerm t_753 = null;
          IStrategoTerm u_753 = null;
          IStrategoTerm w_753 = null;
          IStrategoTerm x_753 = null;
          IStrategoTerm y_753 = null;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consSDefT_4, new IStrategoTerm[]{e_750, c_750, f_750, h_750}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(d_750, (IStrategoList)transformer_debug.constNil1)));
          w_753 = term;
          t_753 = transformer_debug.const284;
          x_753 = w_753;
          u_753 = transformer_debug.const292;
          y_753 = x_753;
          term = r_exit_0_3.instance.invoke(context, y_753, t_753, u_753, transformer_debug.constLocationInfo347);
          if(term == null)
            break Fail582;
        }
        else
        { 
          break Fail582;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}