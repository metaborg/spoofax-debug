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

@SuppressWarnings("all") public class add_s_entry_and_exit_call_0_1 extends Strategy 
{ 
  public static add_s_entry_and_exit_call_0_1 instance = new add_s_entry_and_exit_call_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_m_1145)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference m_1145 = new TermReference(ref_m_1145);
    context.push("add_s_entry_and_exit_call_0_1");
    Fail383:
    { 
      IStrategoTerm term266 = term;
      Success187:
      { 
        Fail384:
        { 
          IStrategoTerm j_991 = null;
          IStrategoTerm k_991 = null;
          IStrategoTerm l_991 = null;
          IStrategoTerm m_991 = null;
          IStrategoTerm p_991 = null;
          IStrategoTerm q_991 = null;
          IStrategoTerm r_991 = null;
          IStrategoTerm t_991 = null;
          IStrategoTerm u_991 = null;
          IStrategoTerm v_991 = null;
          IStrategoTerm w_991 = null;
          IStrategoTerm x_991 = null;
          IStrategoTerm y_991 = null;
          IStrategoTerm z_991 = null;
          IStrategoTerm b_992 = null;
          IStrategoTerm c_992 = null;
          IStrategoTerm d_992 = null;
          IStrategoTerm e_992 = null;
          IStrategoTerm f_992 = null;
          IStrategoTerm g_992 = null;
          IStrategoTerm h_992 = null;
          IStrategoTerm i_992 = null;
          IStrategoTerm k_992 = null;
          IStrategoTerm l_992 = null;
          IStrategoTerm m_992 = null;
          IStrategoTerm n_992 = null;
          IStrategoTerm o_992 = null;
          IStrategoTerm p_992 = null;
          IStrategoTerm q_992 = null;
          IStrategoTerm s_992 = null;
          IStrategoTerm t_992 = null;
          IStrategoTerm u_992 = null;
          IStrategoTerm v_992 = null;
          IStrategoTerm w_992 = null;
          IStrategoTerm x_992 = null;
          IStrategoTerm y_992 = null;
          IStrategoTerm a_993 = null;
          IStrategoTerm b_993 = null;
          IStrategoTerm c_993 = null;
          IStrategoTerm d_993 = null;
          IStrategoTerm e_993 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
            break Fail384;
          j_991 = term.getSubterm(0);
          l_991 = term.getSubterm(1);
          IStrategoList annos110 = term.getAnnotations();
          if(annos110.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos110).isEmpty())
            break Fail384;
          k_991 = ((IStrategoList)annos110).head();
          IStrategoTerm arg206 = ((IStrategoList)annos110).tail();
          if(arg206.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg206).isEmpty())
            break Fail384;
          p_991 = term;
          t_991 = term;
          q_991 = transformer_debug.const513;
          u_991 = t_991;
          r_991 = transformer_debug.const518;
          v_991 = u_991;
          term = r_enter_0_3.instance.invoke(context, v_991, q_991, r_991, transformer_debug.constLocationInfo925);
          if(term == null)
            break Fail384;
          term = p_991;
          w_991 = p_991;
          if(m_1145.value == null)
            break Fail384;
          b_992 = m_1145.value;
          x_991 = transformer_debug.const513;
          c_992 = b_992;
          y_991 = transformer_debug.const518;
          d_992 = c_992;
          z_991 = transformer_debug.const238;
          e_992 = d_992;
          term = s_var_0_4.instance.invoke(context, e_992, x_991, y_991, z_991, transformer_debug.constLocationInfo926);
          if(term == null)
            break Fail384;
          f_992 = w_991;
          k_992 = j_991;
          g_992 = transformer_debug.const513;
          l_992 = k_992;
          h_992 = transformer_debug.const518;
          m_992 = l_992;
          i_992 = transformer_debug.const293;
          n_992 = m_992;
          term = s_var_0_4.instance.invoke(context, n_992, g_992, h_992, i_992, transformer_debug.constLocationInfo927);
          if(term == null)
            break Fail384;
          s_992 = l_991;
          o_992 = transformer_debug.const513;
          t_992 = s_992;
          p_992 = transformer_debug.const518;
          u_992 = t_992;
          q_992 = transformer_debug.const277;
          v_992 = u_992;
          term = s_var_0_4.instance.invoke(context, v_992, o_992, p_992, q_992, transformer_debug.constLocationInfo928);
          if(term == null)
            break Fail384;
          a_993 = k_991;
          w_992 = transformer_debug.const513;
          b_993 = a_993;
          x_992 = transformer_debug.const518;
          c_993 = b_993;
          y_992 = transformer_debug.const235;
          d_993 = c_993;
          term = s_var_0_4.instance.invoke(context, d_993, w_992, x_992, y_992, transformer_debug.constLocationInfo929);
          if(term == null)
            break Fail384;
          term = f_992;
          e_993 = f_992;
          IStrategoTerm term267 = term;
          Success188:
          { 
            Fail385:
            { 
              IStrategoTerm f_993 = null;
              IStrategoTerm g_993 = null;
              IStrategoTerm i_993 = null;
              IStrategoTerm j_993 = null;
              IStrategoTerm k_993 = null;
              IStrategoTerm l_993 = null;
              IStrategoTerm m_993 = null;
              IStrategoTerm o_993 = null;
              IStrategoTerm p_993 = null;
              IStrategoTerm q_993 = null;
              IStrategoTerm r_993 = null;
              IStrategoTerm s_993 = null;
              IStrategoTerm t_993 = null;
              IStrategoTerm v_993 = null;
              IStrategoTerm w_993 = null;
              IStrategoTerm x_993 = null;
              IStrategoTerm y_993 = null;
              i_993 = term;
              f_993 = transformer_debug.const513;
              j_993 = i_993;
              g_993 = transformer_debug.const518;
              k_993 = j_993;
              term = s_step_0_3.instance.invoke(context, k_993, f_993, g_993, transformer_debug.constLocationInfo930);
              if(term == null)
                break Fail385;
              o_993 = l_991;
              l_993 = transformer_debug.const513;
              p_993 = o_993;
              m_993 = transformer_debug.const518;
              q_993 = p_993;
              term = s_step_0_3.instance.invoke(context, q_993, l_993, m_993, transformer_debug.constLocationInfo931);
              if(term == null)
                break Fail385;
              term = wrap_s_0_3.instance.invoke(context, term, m_1145.value, j_991, k_991);
              if(term == null)
                break Fail385;
              m_991 = term;
              v_993 = term;
              r_993 = transformer_debug.const513;
              w_993 = v_993;
              s_993 = transformer_debug.const518;
              x_993 = w_993;
              t_993 = transformer_debug.const294;
              y_993 = x_993;
              term = s_var_0_4.instance.invoke(context, y_993, r_993, s_993, t_993, transformer_debug.constLocationInfo932);
              if(term == null)
                break Fail385;
              if(true)
                break Success188;
            }
            term = term267;
            IStrategoTerm n_991 = null;
            IStrategoTerm o_991 = null;
            IStrategoTerm a_994 = null;
            n_991 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail384;
            o_991 = term;
            a_994 = n_991;
            term = report_with_failure_0_2.instance.invoke(context, a_994, transformer_debug.const519, o_991);
            if(term == null)
              break Fail384;
          }
          term = e_993;
          IStrategoTerm b_994 = null;
          IStrategoTerm c_994 = null;
          IStrategoTerm e_994 = null;
          IStrategoTerm f_994 = null;
          IStrategoTerm g_994 = null;
          if(m_991 == null)
            break Fail384;
          term = termFactory.makeAppl(transformer_debug._consSDefNoArgs_2, new IStrategoTerm[]{j_991, m_991});
          e_994 = term;
          b_994 = transformer_debug.const513;
          f_994 = e_994;
          c_994 = transformer_debug.const518;
          g_994 = f_994;
          term = r_exit_0_3.instance.invoke(context, g_994, b_994, c_994, transformer_debug.constLocationInfo925);
          if(term == null)
            break Fail384;
          if(true)
            break Success187;
        }
        term = term266;
        add_s_entry_and_exit_call_0_1_fragment_0 add_s_entry_and_exit_call_0_1_fragment_00 = new add_s_entry_and_exit_call_0_1_fragment_0();
        add_s_entry_and_exit_call_0_1_fragment_00.m_1145 = m_1145;
        term = add_s_entry_and_exit_call_0_1_fragment_00.invoke(context, term);
        if(term == null)
          break Fail383;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}