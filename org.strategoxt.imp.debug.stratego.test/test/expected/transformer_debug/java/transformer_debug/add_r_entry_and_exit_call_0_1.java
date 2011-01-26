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

@SuppressWarnings("all") public class add_r_entry_and_exit_call_0_1 extends Strategy 
{ 
  public static add_r_entry_and_exit_call_0_1 instance = new add_r_entry_and_exit_call_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_n_1145)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference n_1145 = new TermReference(ref_n_1145);
    context.push("add_r_entry_and_exit_call_0_1");
    Fail387:
    { 
      IStrategoTerm term272 = term;
      Success189:
      { 
        Fail388:
        { 
          IStrategoTerm d_1008 = null;
          IStrategoTerm e_1008 = null;
          IStrategoTerm f_1008 = null;
          IStrategoTerm g_1008 = null;
          IStrategoTerm j_1008 = null;
          IStrategoTerm k_1008 = null;
          IStrategoTerm l_1008 = null;
          IStrategoTerm n_1008 = null;
          IStrategoTerm o_1008 = null;
          IStrategoTerm p_1008 = null;
          IStrategoTerm q_1008 = null;
          IStrategoTerm r_1008 = null;
          IStrategoTerm s_1008 = null;
          IStrategoTerm t_1008 = null;
          IStrategoTerm v_1008 = null;
          IStrategoTerm w_1008 = null;
          IStrategoTerm x_1008 = null;
          IStrategoTerm y_1008 = null;
          IStrategoTerm z_1008 = null;
          IStrategoTerm a_1009 = null;
          IStrategoTerm b_1009 = null;
          IStrategoTerm c_1009 = null;
          IStrategoTerm e_1009 = null;
          IStrategoTerm f_1009 = null;
          IStrategoTerm g_1009 = null;
          IStrategoTerm h_1009 = null;
          IStrategoTerm i_1009 = null;
          IStrategoTerm j_1009 = null;
          IStrategoTerm k_1009 = null;
          IStrategoTerm m_1009 = null;
          IStrategoTerm n_1009 = null;
          IStrategoTerm o_1009 = null;
          IStrategoTerm p_1009 = null;
          IStrategoTerm q_1009 = null;
          IStrategoTerm r_1009 = null;
          IStrategoTerm s_1009 = null;
          IStrategoTerm u_1009 = null;
          IStrategoTerm v_1009 = null;
          IStrategoTerm w_1009 = null;
          IStrategoTerm x_1009 = null;
          IStrategoTerm y_1009 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
            break Fail388;
          d_1008 = term.getSubterm(0);
          f_1008 = term.getSubterm(1);
          IStrategoList annos113 = term.getAnnotations();
          if(annos113.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos113).isEmpty())
            break Fail388;
          e_1008 = ((IStrategoList)annos113).head();
          IStrategoTerm arg209 = ((IStrategoList)annos113).tail();
          if(arg209.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg209).isEmpty())
            break Fail388;
          j_1008 = term;
          n_1008 = term;
          k_1008 = transformer_debug.const513;
          o_1008 = n_1008;
          l_1008 = transformer_debug.const530;
          p_1008 = o_1008;
          term = r_enter_0_3.instance.invoke(context, p_1008, k_1008, l_1008, transformer_debug.constLocationInfo972);
          if(term == null)
            break Fail388;
          term = j_1008;
          q_1008 = j_1008;
          if(n_1145.value == null)
            break Fail388;
          v_1008 = n_1145.value;
          r_1008 = transformer_debug.const513;
          w_1008 = v_1008;
          s_1008 = transformer_debug.const530;
          x_1008 = w_1008;
          t_1008 = transformer_debug.const238;
          y_1008 = x_1008;
          term = s_var_0_4.instance.invoke(context, y_1008, r_1008, s_1008, t_1008, transformer_debug.constLocationInfo973);
          if(term == null)
            break Fail388;
          z_1008 = q_1008;
          e_1009 = d_1008;
          a_1009 = transformer_debug.const513;
          f_1009 = e_1009;
          b_1009 = transformer_debug.const530;
          g_1009 = f_1009;
          c_1009 = transformer_debug.const287;
          h_1009 = g_1009;
          term = s_var_0_4.instance.invoke(context, h_1009, a_1009, b_1009, c_1009, transformer_debug.constLocationInfo974);
          if(term == null)
            break Fail388;
          m_1009 = f_1008;
          i_1009 = transformer_debug.const513;
          n_1009 = m_1009;
          j_1009 = transformer_debug.const530;
          o_1009 = n_1009;
          k_1009 = transformer_debug.const288;
          p_1009 = o_1009;
          term = s_var_0_4.instance.invoke(context, p_1009, i_1009, j_1009, k_1009, transformer_debug.constLocationInfo975);
          if(term == null)
            break Fail388;
          u_1009 = e_1008;
          q_1009 = transformer_debug.const513;
          v_1009 = u_1009;
          r_1009 = transformer_debug.const530;
          w_1009 = v_1009;
          s_1009 = transformer_debug.const235;
          x_1009 = w_1009;
          term = s_var_0_4.instance.invoke(context, x_1009, q_1009, r_1009, s_1009, transformer_debug.constLocationInfo976);
          if(term == null)
            break Fail388;
          term = z_1008;
          y_1009 = z_1008;
          IStrategoTerm term273 = term;
          Success190:
          { 
            Fail389:
            { 
              IStrategoTerm z_1009 = null;
              IStrategoTerm a_1010 = null;
              IStrategoTerm c_1010 = null;
              IStrategoTerm d_1010 = null;
              IStrategoTerm e_1010 = null;
              IStrategoTerm f_1010 = null;
              IStrategoTerm g_1010 = null;
              IStrategoTerm i_1010 = null;
              IStrategoTerm j_1010 = null;
              IStrategoTerm k_1010 = null;
              IStrategoTerm l_1010 = null;
              IStrategoTerm m_1010 = null;
              IStrategoTerm n_1010 = null;
              IStrategoTerm p_1010 = null;
              IStrategoTerm q_1010 = null;
              IStrategoTerm r_1010 = null;
              IStrategoTerm s_1010 = null;
              c_1010 = term;
              z_1009 = transformer_debug.const513;
              d_1010 = c_1010;
              a_1010 = transformer_debug.const530;
              e_1010 = d_1010;
              term = s_step_0_3.instance.invoke(context, e_1010, z_1009, a_1010, transformer_debug.constLocationInfo977);
              if(term == null)
                break Fail389;
              i_1010 = f_1008;
              f_1010 = transformer_debug.const513;
              j_1010 = i_1010;
              g_1010 = transformer_debug.const530;
              k_1010 = j_1010;
              term = s_step_0_3.instance.invoke(context, k_1010, f_1010, g_1010, transformer_debug.constLocationInfo978);
              if(term == null)
                break Fail389;
              term = wrap_r_0_3.instance.invoke(context, term, n_1145.value, d_1008, e_1008);
              if(term == null)
                break Fail389;
              g_1008 = term;
              p_1010 = term;
              l_1010 = transformer_debug.const513;
              q_1010 = p_1010;
              m_1010 = transformer_debug.const530;
              r_1010 = q_1010;
              n_1010 = transformer_debug.const289;
              s_1010 = r_1010;
              term = s_var_0_4.instance.invoke(context, s_1010, l_1010, m_1010, n_1010, transformer_debug.constLocationInfo979);
              if(term == null)
                break Fail389;
              if(true)
                break Success190;
            }
            term = term273;
            IStrategoTerm h_1008 = null;
            IStrategoTerm i_1008 = null;
            IStrategoTerm u_1010 = null;
            h_1008 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail388;
            i_1008 = term;
            u_1010 = h_1008;
            term = report_with_failure_0_2.instance.invoke(context, u_1010, transformer_debug.const531, i_1008);
            if(term == null)
              break Fail388;
          }
          term = y_1009;
          IStrategoTerm v_1010 = null;
          IStrategoTerm w_1010 = null;
          IStrategoTerm y_1010 = null;
          IStrategoTerm z_1010 = null;
          IStrategoTerm a_1011 = null;
          if(g_1008 == null)
            break Fail388;
          term = termFactory.makeAppl(transformer_debug._consRDefNoArgs_2, new IStrategoTerm[]{d_1008, g_1008});
          y_1010 = term;
          v_1010 = transformer_debug.const513;
          z_1010 = y_1010;
          w_1010 = transformer_debug.const530;
          a_1011 = z_1010;
          term = r_exit_0_3.instance.invoke(context, a_1011, v_1010, w_1010, transformer_debug.constLocationInfo972);
          if(term == null)
            break Fail388;
          if(true)
            break Success189;
        }
        term = term272;
        add_r_entry_and_exit_call_0_1_fragment_0 add_r_entry_and_exit_call_0_1_fragment_00 = new add_r_entry_and_exit_call_0_1_fragment_0();
        add_r_entry_and_exit_call_0_1_fragment_00.n_1145 = n_1145;
        term = add_r_entry_and_exit_call_0_1_fragment_00.invoke(context, term);
        if(term == null)
          break Fail387;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}