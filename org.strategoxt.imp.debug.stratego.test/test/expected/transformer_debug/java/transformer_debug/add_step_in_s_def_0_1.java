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

@SuppressWarnings("all") public class add_step_in_s_def_0_1 extends Strategy 
{ 
  public static add_step_in_s_def_0_1 instance = new add_step_in_s_def_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_1145)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference j_1145 = new TermReference(ref_j_1145);
    context.push("add_step_in_s_def_0_1");
    Fail369:
    { 
      IStrategoTerm term193 = term;
      Success180:
      { 
        Fail370:
        { 
          IStrategoTerm l_841 = null;
          TermReference m_841 = new TermReference();
          IStrategoTerm n_841 = null;
          IStrategoTerm o_841 = null;
          IStrategoTerm r_841 = null;
          IStrategoTerm s_841 = null;
          IStrategoTerm t_841 = null;
          IStrategoTerm v_841 = null;
          IStrategoTerm w_841 = null;
          IStrategoTerm x_841 = null;
          IStrategoTerm y_841 = null;
          IStrategoTerm z_841 = null;
          IStrategoTerm a_842 = null;
          IStrategoTerm b_842 = null;
          IStrategoTerm d_842 = null;
          IStrategoTerm e_842 = null;
          IStrategoTerm f_842 = null;
          IStrategoTerm g_842 = null;
          IStrategoTerm h_842 = null;
          IStrategoTerm i_842 = null;
          IStrategoTerm j_842 = null;
          IStrategoTerm k_842 = null;
          IStrategoTerm m_842 = null;
          IStrategoTerm n_842 = null;
          IStrategoTerm o_842 = null;
          IStrategoTerm p_842 = null;
          IStrategoTerm q_842 = null;
          IStrategoTerm r_842 = null;
          IStrategoTerm s_842 = null;
          IStrategoTerm u_842 = null;
          IStrategoTerm v_842 = null;
          IStrategoTerm w_842 = null;
          IStrategoTerm x_842 = null;
          IStrategoTerm y_842 = null;
          IStrategoTerm z_842 = null;
          IStrategoTerm a_843 = null;
          IStrategoTerm c_843 = null;
          IStrategoTerm e_843 = null;
          IStrategoTerm f_843 = null;
          IStrategoTerm g_843 = null;
          IStrategoTerm h_843 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
            break Fail370;
          if(m_841.value == null)
            m_841.value = term.getSubterm(0);
          else
            if(m_841.value != term.getSubterm(0) && !m_841.value.match(term.getSubterm(0)))
              break Fail370;
          n_841 = term.getSubterm(1);
          IStrategoList annos75 = term.getAnnotations();
          if(annos75.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos75).isEmpty())
            break Fail370;
          l_841 = ((IStrategoList)annos75).head();
          IStrategoTerm arg129 = ((IStrategoList)annos75).tail();
          if(arg129.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg129).isEmpty())
            break Fail370;
          r_841 = term;
          v_841 = term;
          s_841 = transformer_debug.const370;
          w_841 = v_841;
          t_841 = transformer_debug.const375;
          x_841 = w_841;
          term = r_enter_0_3.instance.invoke(context, x_841, s_841, t_841, transformer_debug.constLocationInfo548);
          if(term == null)
            break Fail370;
          term = r_841;
          y_841 = r_841;
          if(j_1145.value == null)
            break Fail370;
          d_842 = j_1145.value;
          z_841 = transformer_debug.const370;
          e_842 = d_842;
          a_842 = transformer_debug.const375;
          f_842 = e_842;
          b_842 = transformer_debug.const238;
          g_842 = f_842;
          term = s_var_0_4.instance.invoke(context, g_842, z_841, a_842, b_842, transformer_debug.constLocationInfo549);
          if(term == null)
            break Fail370;
          term = y_841;
          h_842 = y_841;
          if(m_841.value == null)
            break Fail370;
          m_842 = m_841.value;
          i_842 = transformer_debug.const370;
          n_842 = m_842;
          j_842 = transformer_debug.const375;
          o_842 = n_842;
          k_842 = transformer_debug.const293;
          p_842 = o_842;
          term = s_var_0_4.instance.invoke(context, p_842, i_842, j_842, k_842, transformer_debug.constLocationInfo550);
          if(term == null)
            break Fail370;
          u_842 = n_841;
          q_842 = transformer_debug.const370;
          v_842 = u_842;
          r_842 = transformer_debug.const375;
          w_842 = v_842;
          s_842 = transformer_debug.const277;
          x_842 = w_842;
          term = s_var_0_4.instance.invoke(context, x_842, q_842, r_842, s_842, transformer_debug.constLocationInfo551);
          if(term == null)
            break Fail370;
          c_843 = l_841;
          y_842 = transformer_debug.const370;
          e_843 = c_843;
          z_842 = transformer_debug.const375;
          f_843 = e_843;
          a_843 = transformer_debug.const235;
          g_843 = f_843;
          term = s_var_0_4.instance.invoke(context, g_843, y_842, z_842, a_843, transformer_debug.constLocationInfo552);
          if(term == null)
            break Fail370;
          term = h_842;
          h_843 = h_842;
          IStrategoTerm term194 = term;
          Success181:
          { 
            Fail371:
            { 
              IStrategoTerm i_843 = null;
              IStrategoTerm j_843 = null;
              IStrategoTerm l_843 = null;
              IStrategoTerm m_843 = null;
              IStrategoTerm n_843 = null;
              IStrategoTerm o_843 = null;
              IStrategoTerm p_843 = null;
              IStrategoTerm r_843 = null;
              IStrategoTerm s_843 = null;
              IStrategoTerm v_843 = null;
              IStrategoTerm o_844 = null;
              IStrategoTerm p_844 = null;
              IStrategoTerm q_844 = null;
              IStrategoTerm s_844 = null;
              IStrategoTerm t_844 = null;
              IStrategoTerm u_844 = null;
              IStrategoTerm v_844 = null;
              l_843 = term;
              i_843 = transformer_debug.const370;
              m_843 = l_843;
              j_843 = transformer_debug.const375;
              n_843 = m_843;
              term = s_step_0_3.instance.invoke(context, n_843, i_843, j_843, transformer_debug.constLocationInfo553);
              if(term == null)
                break Fail371;
              r_843 = n_841;
              o_843 = transformer_debug.const370;
              s_843 = r_843;
              p_843 = transformer_debug.const375;
              v_843 = s_843;
              term = s_step_0_3.instance.invoke(context, v_843, o_843, p_843, transformer_debug.constLocationInfo554);
              if(term == null)
                break Fail371;
              lifted141 lifted1410 = new lifted141();
              lifted1410.j_1145 = j_1145;
              lifted1410.m_841 = m_841;
              term = bottomup_1_0.instance.invoke(context, term, lifted1410);
              if(term == null)
                break Fail371;
              o_841 = term;
              s_844 = term;
              o_844 = transformer_debug.const370;
              t_844 = s_844;
              p_844 = transformer_debug.const375;
              u_844 = t_844;
              q_844 = transformer_debug.const294;
              v_844 = u_844;
              term = s_var_0_4.instance.invoke(context, v_844, o_844, p_844, q_844, transformer_debug.constLocationInfo557);
              if(term == null)
                break Fail371;
              if(true)
                break Success181;
            }
            term = term194;
            IStrategoTerm p_841 = null;
            IStrategoTerm q_841 = null;
            IStrategoTerm x_844 = null;
            p_841 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail370;
            q_841 = term;
            x_844 = p_841;
            term = report_with_failure_0_2.instance.invoke(context, x_844, transformer_debug.const376, q_841);
            if(term == null)
              break Fail370;
          }
          term = h_843;
          IStrategoTerm y_844 = null;
          IStrategoTerm z_844 = null;
          IStrategoTerm c_845 = null;
          IStrategoTerm d_845 = null;
          IStrategoTerm e_845 = null;
          if(m_841.value == null || o_841 == null)
            break Fail370;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consSDefNoArgs_2, new IStrategoTerm[]{m_841.value, o_841}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(l_841, (IStrategoList)transformer_debug.constNil1)));
          c_845 = term;
          y_844 = transformer_debug.const370;
          d_845 = c_845;
          z_844 = transformer_debug.const375;
          e_845 = d_845;
          term = r_exit_0_3.instance.invoke(context, e_845, y_844, z_844, transformer_debug.constLocationInfo548);
          if(term == null)
            break Fail370;
          if(true)
            break Success180;
        }
        term = term193;
        add_step_in_s_def_0_1_fragment_0 add_step_in_s_def_0_1_fragment_00 = new add_step_in_s_def_0_1_fragment_0();
        add_step_in_s_def_0_1_fragment_00.j_1145 = j_1145;
        term = add_step_in_s_def_0_1_fragment_00.invoke(context, term);
        if(term == null)
          break Fail369;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}