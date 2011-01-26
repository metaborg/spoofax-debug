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

@SuppressWarnings("all") public class add_r_entry_and_exit_calls_0_1 extends Strategy 
{ 
  public static add_r_entry_and_exit_calls_0_1 instance = new add_r_entry_and_exit_calls_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_982)
  { 
    TermReference j_982 = new TermReference(ref_j_982);
    context.push("add_r_entry_and_exit_calls_0_1");
    Fail381:
    { 
      IStrategoTerm l_982 = null;
      IStrategoTerm m_982 = null;
      IStrategoTerm o_982 = null;
      IStrategoTerm p_982 = null;
      IStrategoTerm q_982 = null;
      o_982 = term;
      l_982 = transformer_debug.const513;
      p_982 = o_982;
      m_982 = transformer_debug.const517;
      q_982 = p_982;
      term = s_enter_0_3.instance.invoke(context, q_982, l_982, m_982, transformer_debug.constLocationInfo920);
      if(term == null)
        break Fail381;
      IStrategoTerm term265 = term;
      Success186:
      { 
        Fail382:
        { 
          IStrategoTerm k_982 = null;
          IStrategoTerm r_982 = null;
          IStrategoTerm s_982 = null;
          IStrategoTerm t_982 = null;
          IStrategoTerm v_982 = null;
          IStrategoTerm w_982 = null;
          IStrategoTerm x_982 = null;
          IStrategoTerm y_982 = null;
          IStrategoTerm z_982 = null;
          IStrategoTerm a_983 = null;
          IStrategoTerm c_983 = null;
          IStrategoTerm d_983 = null;
          IStrategoTerm e_983 = null;
          k_982 = term;
          if(j_982.value == null)
            break Fail382;
          v_982 = j_982.value;
          r_982 = transformer_debug.const513;
          w_982 = v_982;
          s_982 = transformer_debug.const517;
          x_982 = w_982;
          t_982 = transformer_debug.const238;
          y_982 = x_982;
          term = s_var_0_4.instance.invoke(context, y_982, r_982, s_982, t_982, transformer_debug.constLocationInfo923);
          if(term == null)
            break Fail382;
          c_983 = k_982;
          z_982 = transformer_debug.const513;
          d_983 = c_983;
          a_983 = transformer_debug.const517;
          e_983 = d_983;
          term = s_step_0_3.instance.invoke(context, e_983, z_982, a_983, transformer_debug.constLocationInfo924);
          if(term == null)
            break Fail382;
          lifted149 lifted1490 = new lifted149();
          lifted1490.j_982 = j_982;
          term = bottomup_1_0.instance.invoke(context, term, lifted1490);
          if(term == null)
            break Fail382;
          { 
            IStrategoTerm r_983 = null;
            IStrategoTerm s_983 = null;
            IStrategoTerm u_983 = null;
            IStrategoTerm v_983 = null;
            IStrategoTerm w_983 = null;
            u_983 = term;
            r_983 = transformer_debug.const513;
            v_983 = u_983;
            s_983 = transformer_debug.const517;
            w_983 = v_983;
            term = s_exit_0_3.instance.invoke(context, w_983, r_983, s_983, transformer_debug.constLocationInfo920);
            if(term == null)
              break Fail381;
            if(true)
              break Success186;
          }
        }
        term = term265;
        IStrategoTerm x_983 = null;
        IStrategoTerm y_983 = null;
        IStrategoTerm a_984 = null;
        IStrategoTerm b_984 = null;
        IStrategoTerm c_984 = null;
        a_984 = term;
        x_983 = transformer_debug.const513;
        b_984 = a_984;
        y_983 = transformer_debug.const517;
        c_984 = b_984;
        term = s_exit_0_3.instance.invoke(context, c_984, x_983, y_983, transformer_debug.constLocationInfo920);
        if(term == null)
          break Fail381;
        if(true)
          break Fail381;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}