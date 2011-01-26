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

@SuppressWarnings("all") public class stratego_propstratego_path_0_0 extends Strategy 
{ 
  public static stratego_propstratego_path_0_0 instance = new stratego_propstratego_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("stratego_propstratego_path_0_0");
    Fail435:
    { 
      IStrategoTerm h_1079 = null;
      IStrategoTerm i_1079 = null;
      IStrategoTerm k_1079 = null;
      IStrategoTerm l_1079 = null;
      IStrategoTerm m_1079 = null;
      k_1079 = term;
      h_1079 = transformer_debug.const571;
      l_1079 = k_1079;
      i_1079 = transformer_debug.const615;
      m_1079 = l_1079;
      term = s_enter_0_3.instance.invoke(context, m_1079, h_1079, i_1079, transformer_debug.constLocationInfo1163);
      if(term == null)
        break Fail435;
      IStrategoTerm term302 = term;
      Success213:
      { 
        Fail436:
        { 
          IStrategoTerm n_1079 = null;
          IStrategoTerm o_1079 = null;
          IStrategoTerm q_1079 = null;
          IStrategoTerm r_1079 = null;
          IStrategoTerm s_1079 = null;
          q_1079 = term;
          n_1079 = transformer_debug.const571;
          r_1079 = q_1079;
          o_1079 = transformer_debug.const615;
          s_1079 = r_1079;
          term = s_step_0_3.instance.invoke(context, s_1079, n_1079, o_1079, transformer_debug.constLocationInfo1164);
          if(term == null)
            break Fail436;
          term = transformer_debug.const617;
          { 
            IStrategoTerm t_1079 = null;
            IStrategoTerm u_1079 = null;
            IStrategoTerm w_1079 = null;
            IStrategoTerm x_1079 = null;
            IStrategoTerm y_1079 = null;
            w_1079 = term;
            t_1079 = transformer_debug.const571;
            x_1079 = w_1079;
            u_1079 = transformer_debug.const615;
            y_1079 = x_1079;
            term = s_exit_0_3.instance.invoke(context, y_1079, t_1079, u_1079, transformer_debug.constLocationInfo1163);
            if(term == null)
              break Fail435;
            if(true)
              break Success213;
          }
        }
        term = term302;
        IStrategoTerm z_1079 = null;
        IStrategoTerm a_1080 = null;
        IStrategoTerm c_1080 = null;
        IStrategoTerm d_1080 = null;
        IStrategoTerm e_1080 = null;
        c_1080 = term;
        z_1079 = transformer_debug.const571;
        d_1080 = c_1080;
        a_1080 = transformer_debug.const615;
        e_1080 = d_1080;
        term = s_exit_0_3.instance.invoke(context, e_1080, z_1079, a_1080, transformer_debug.constLocationInfo1163);
        if(term == null)
          break Fail435;
        if(true)
          break Fail435;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}