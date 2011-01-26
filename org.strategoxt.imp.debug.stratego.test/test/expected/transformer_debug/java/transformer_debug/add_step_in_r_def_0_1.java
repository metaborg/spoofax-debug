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

@SuppressWarnings("all") public class add_step_in_r_def_0_1 extends Strategy 
{ 
  public static add_step_in_r_def_0_1 instance = new add_step_in_r_def_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_i_1145)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference i_1145 = new TermReference(ref_i_1145);
    context.push("add_step_in_r_def_0_1");
    Fail366:
    { 
      IStrategoTerm term188 = term;
      Success178:
      { 
        Fail367:
        { 
          IStrategoTerm r_828 = null;
          TermReference s_828 = new TermReference();
          IStrategoTerm t_828 = null;
          IStrategoTerm u_828 = null;
          IStrategoTerm x_828 = null;
          IStrategoTerm y_828 = null;
          IStrategoTerm z_828 = null;
          IStrategoTerm b_829 = null;
          IStrategoTerm c_829 = null;
          IStrategoTerm d_829 = null;
          IStrategoTerm e_829 = null;
          IStrategoTerm f_829 = null;
          IStrategoTerm g_829 = null;
          IStrategoTerm h_829 = null;
          IStrategoTerm j_829 = null;
          IStrategoTerm k_829 = null;
          IStrategoTerm l_829 = null;
          IStrategoTerm m_829 = null;
          IStrategoTerm n_829 = null;
          IStrategoTerm o_829 = null;
          IStrategoTerm p_829 = null;
          IStrategoTerm q_829 = null;
          IStrategoTerm s_829 = null;
          IStrategoTerm t_829 = null;
          IStrategoTerm u_829 = null;
          IStrategoTerm v_829 = null;
          IStrategoTerm w_829 = null;
          IStrategoTerm x_829 = null;
          IStrategoTerm y_829 = null;
          IStrategoTerm a_830 = null;
          IStrategoTerm b_830 = null;
          IStrategoTerm c_830 = null;
          IStrategoTerm e_830 = null;
          IStrategoTerm f_830 = null;
          IStrategoTerm g_830 = null;
          IStrategoTerm h_830 = null;
          IStrategoTerm j_830 = null;
          IStrategoTerm k_830 = null;
          IStrategoTerm l_830 = null;
          IStrategoTerm m_830 = null;
          IStrategoTerm n_830 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
            break Fail367;
          if(s_828.value == null)
            s_828.value = term.getSubterm(0);
          else
            if(s_828.value != term.getSubterm(0) && !s_828.value.match(term.getSubterm(0)))
              break Fail367;
          t_828 = term.getSubterm(1);
          IStrategoList annos72 = term.getAnnotations();
          if(annos72.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos72).isEmpty())
            break Fail367;
          r_828 = ((IStrategoList)annos72).head();
          IStrategoTerm arg126 = ((IStrategoList)annos72).tail();
          if(arg126.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg126).isEmpty())
            break Fail367;
          x_828 = term;
          b_829 = term;
          y_828 = transformer_debug.const370;
          c_829 = b_829;
          z_828 = transformer_debug.const372;
          d_829 = c_829;
          term = r_enter_0_3.instance.invoke(context, d_829, y_828, z_828, transformer_debug.constLocationInfo515);
          if(term == null)
            break Fail367;
          term = x_828;
          e_829 = x_828;
          if(i_1145.value == null)
            break Fail367;
          j_829 = i_1145.value;
          f_829 = transformer_debug.const370;
          k_829 = j_829;
          g_829 = transformer_debug.const372;
          l_829 = k_829;
          h_829 = transformer_debug.const238;
          m_829 = l_829;
          term = s_var_0_4.instance.invoke(context, m_829, f_829, g_829, h_829, transformer_debug.constLocationInfo516);
          if(term == null)
            break Fail367;
          term = e_829;
          n_829 = e_829;
          if(s_828.value == null)
            break Fail367;
          s_829 = s_828.value;
          o_829 = transformer_debug.const370;
          t_829 = s_829;
          p_829 = transformer_debug.const372;
          u_829 = t_829;
          q_829 = transformer_debug.const287;
          v_829 = u_829;
          term = s_var_0_4.instance.invoke(context, v_829, o_829, p_829, q_829, transformer_debug.constLocationInfo517);
          if(term == null)
            break Fail367;
          a_830 = t_828;
          w_829 = transformer_debug.const370;
          b_830 = a_830;
          x_829 = transformer_debug.const372;
          c_830 = b_830;
          y_829 = transformer_debug.const288;
          e_830 = c_830;
          term = s_var_0_4.instance.invoke(context, e_830, w_829, x_829, y_829, transformer_debug.constLocationInfo518);
          if(term == null)
            break Fail367;
          j_830 = r_828;
          f_830 = transformer_debug.const370;
          k_830 = j_830;
          g_830 = transformer_debug.const372;
          l_830 = k_830;
          h_830 = transformer_debug.const235;
          m_830 = l_830;
          term = s_var_0_4.instance.invoke(context, m_830, f_830, g_830, h_830, transformer_debug.constLocationInfo519);
          if(term == null)
            break Fail367;
          term = n_829;
          n_830 = n_829;
          IStrategoTerm term189 = term;
          Success179:
          { 
            Fail368:
            { 
              IStrategoTerm o_830 = null;
              IStrategoTerm p_830 = null;
              IStrategoTerm r_830 = null;
              IStrategoTerm s_830 = null;
              IStrategoTerm t_830 = null;
              IStrategoTerm u_830 = null;
              IStrategoTerm v_830 = null;
              IStrategoTerm x_830 = null;
              IStrategoTerm y_830 = null;
              IStrategoTerm z_830 = null;
              IStrategoTerm u_831 = null;
              IStrategoTerm w_831 = null;
              IStrategoTerm x_831 = null;
              IStrategoTerm z_831 = null;
              IStrategoTerm a_832 = null;
              IStrategoTerm b_832 = null;
              IStrategoTerm c_832 = null;
              r_830 = term;
              o_830 = transformer_debug.const370;
              s_830 = r_830;
              p_830 = transformer_debug.const372;
              t_830 = s_830;
              term = s_step_0_3.instance.invoke(context, t_830, o_830, p_830, transformer_debug.constLocationInfo520);
              if(term == null)
                break Fail368;
              x_830 = t_828;
              u_830 = transformer_debug.const370;
              y_830 = x_830;
              v_830 = transformer_debug.const372;
              z_830 = y_830;
              term = s_step_0_3.instance.invoke(context, z_830, u_830, v_830, transformer_debug.constLocationInfo521);
              if(term == null)
                break Fail368;
              lifted135 lifted1350 = new lifted135();
              lifted1350.i_1145 = i_1145;
              lifted1350.s_828 = s_828;
              term = bottomup_1_0.instance.invoke(context, term, lifted1350);
              if(term == null)
                break Fail368;
              u_828 = term;
              z_831 = term;
              u_831 = transformer_debug.const370;
              a_832 = z_831;
              w_831 = transformer_debug.const372;
              b_832 = a_832;
              x_831 = transformer_debug.const289;
              c_832 = b_832;
              term = s_var_0_4.instance.invoke(context, c_832, u_831, w_831, x_831, transformer_debug.constLocationInfo524);
              if(term == null)
                break Fail368;
              if(true)
                break Success179;
            }
            term = term189;
            IStrategoTerm v_828 = null;
            IStrategoTerm w_828 = null;
            IStrategoTerm f_832 = null;
            v_828 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail367;
            w_828 = term;
            f_832 = v_828;
            term = report_with_failure_0_2.instance.invoke(context, f_832, transformer_debug.const373, w_828);
            if(term == null)
              break Fail367;
          }
          term = n_830;
          IStrategoTerm g_832 = null;
          IStrategoTerm h_832 = null;
          IStrategoTerm j_832 = null;
          IStrategoTerm k_832 = null;
          IStrategoTerm l_832 = null;
          if(s_828.value == null || u_828 == null)
            break Fail367;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consRDefNoArgs_2, new IStrategoTerm[]{s_828.value, u_828}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(r_828, (IStrategoList)transformer_debug.constNil1)));
          j_832 = term;
          g_832 = transformer_debug.const370;
          k_832 = j_832;
          h_832 = transformer_debug.const372;
          l_832 = k_832;
          term = r_exit_0_3.instance.invoke(context, l_832, g_832, h_832, transformer_debug.constLocationInfo515);
          if(term == null)
            break Fail367;
          if(true)
            break Success178;
        }
        term = term188;
        add_step_in_r_def_0_1_fragment_0 add_step_in_r_def_0_1_fragment_00 = new add_step_in_r_def_0_1_fragment_0();
        add_step_in_r_def_0_1_fragment_00.i_1145 = i_1145;
        term = add_step_in_r_def_0_1_fragment_00.invoke(context, term);
        if(term == null)
          break Fail366;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}