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

@SuppressWarnings("all") public class add_s_entry_and_exit_calls_0_1 extends Strategy 
{ 
  public static add_s_entry_and_exit_calls_0_1 instance = new add_s_entry_and_exit_calls_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_p_980)
  { 
    TermReference p_980 = new TermReference(ref_p_980);
    context.push("add_s_entry_and_exit_calls_0_1");
    Fail379:
    { 
      IStrategoTerm r_980 = null;
      IStrategoTerm s_980 = null;
      IStrategoTerm u_980 = null;
      IStrategoTerm v_980 = null;
      IStrategoTerm w_980 = null;
      u_980 = term;
      r_980 = transformer_debug.const513;
      v_980 = u_980;
      s_980 = transformer_debug.const516;
      w_980 = v_980;
      term = s_enter_0_3.instance.invoke(context, w_980, r_980, s_980, transformer_debug.constLocationInfo915);
      if(term == null)
        break Fail379;
      IStrategoTerm term264 = term;
      Success185:
      { 
        Fail380:
        { 
          IStrategoTerm q_980 = null;
          IStrategoTerm x_980 = null;
          IStrategoTerm y_980 = null;
          IStrategoTerm z_980 = null;
          IStrategoTerm b_981 = null;
          IStrategoTerm c_981 = null;
          IStrategoTerm d_981 = null;
          IStrategoTerm e_981 = null;
          IStrategoTerm f_981 = null;
          IStrategoTerm g_981 = null;
          IStrategoTerm i_981 = null;
          IStrategoTerm j_981 = null;
          IStrategoTerm k_981 = null;
          q_980 = term;
          if(p_980.value == null)
            break Fail380;
          b_981 = p_980.value;
          x_980 = transformer_debug.const513;
          c_981 = b_981;
          y_980 = transformer_debug.const516;
          d_981 = c_981;
          z_980 = transformer_debug.const238;
          e_981 = d_981;
          term = s_var_0_4.instance.invoke(context, e_981, x_980, y_980, z_980, transformer_debug.constLocationInfo918);
          if(term == null)
            break Fail380;
          i_981 = q_980;
          f_981 = transformer_debug.const513;
          j_981 = i_981;
          g_981 = transformer_debug.const516;
          k_981 = j_981;
          term = s_step_0_3.instance.invoke(context, k_981, f_981, g_981, transformer_debug.constLocationInfo919);
          if(term == null)
            break Fail380;
          lifted147 lifted1470 = new lifted147();
          lifted1470.p_980 = p_980;
          term = bottomup_1_0.instance.invoke(context, term, lifted1470);
          if(term == null)
            break Fail380;
          { 
            IStrategoTerm x_981 = null;
            IStrategoTerm y_981 = null;
            IStrategoTerm a_982 = null;
            IStrategoTerm b_982 = null;
            IStrategoTerm c_982 = null;
            a_982 = term;
            x_981 = transformer_debug.const513;
            b_982 = a_982;
            y_981 = transformer_debug.const516;
            c_982 = b_982;
            term = s_exit_0_3.instance.invoke(context, c_982, x_981, y_981, transformer_debug.constLocationInfo915);
            if(term == null)
              break Fail379;
            if(true)
              break Success185;
          }
        }
        term = term264;
        IStrategoTerm d_982 = null;
        IStrategoTerm e_982 = null;
        IStrategoTerm g_982 = null;
        IStrategoTerm h_982 = null;
        IStrategoTerm i_982 = null;
        g_982 = term;
        d_982 = transformer_debug.const513;
        h_982 = g_982;
        e_982 = transformer_debug.const516;
        i_982 = h_982;
        term = s_exit_0_3.instance.invoke(context, i_982, d_982, e_982, transformer_debug.constLocationInfo915);
        if(term == null)
          break Fail379;
        if(true)
          break Fail379;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}