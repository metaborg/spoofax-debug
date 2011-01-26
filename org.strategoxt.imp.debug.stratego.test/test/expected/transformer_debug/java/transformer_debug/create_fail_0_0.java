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

@SuppressWarnings("all") public class create_fail_0_0 extends Strategy 
{ 
  public static create_fail_0_0 instance = new create_fail_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_fail_0_0");
    Fail404:
    { 
      IStrategoTerm d_1040 = null;
      IStrategoTerm e_1040 = null;
      IStrategoTerm g_1040 = null;
      IStrategoTerm h_1040 = null;
      IStrategoTerm i_1040 = null;
      g_1040 = term;
      d_1040 = transformer_debug.const513;
      h_1040 = g_1040;
      e_1040 = transformer_debug.const569;
      i_1040 = h_1040;
      term = s_enter_0_3.instance.invoke(context, i_1040, d_1040, e_1040, transformer_debug.constLocationInfo1080);
      if(term == null)
        break Fail404;
      IStrategoTerm term286 = term;
      Success197:
      { 
        Fail405:
        { 
          IStrategoTerm j_1040 = null;
          IStrategoTerm k_1040 = null;
          IStrategoTerm m_1040 = null;
          IStrategoTerm n_1040 = null;
          IStrategoTerm o_1040 = null;
          m_1040 = term;
          j_1040 = transformer_debug.const513;
          n_1040 = m_1040;
          k_1040 = transformer_debug.const569;
          o_1040 = n_1040;
          term = s_step_0_3.instance.invoke(context, o_1040, j_1040, k_1040, transformer_debug.constLocationInfo1081);
          if(term == null)
            break Fail405;
          term = transformer_debug.constFail0;
          { 
            IStrategoTerm p_1040 = null;
            IStrategoTerm q_1040 = null;
            IStrategoTerm s_1040 = null;
            IStrategoTerm t_1040 = null;
            IStrategoTerm u_1040 = null;
            s_1040 = term;
            p_1040 = transformer_debug.const513;
            t_1040 = s_1040;
            q_1040 = transformer_debug.const569;
            u_1040 = t_1040;
            term = s_exit_0_3.instance.invoke(context, u_1040, p_1040, q_1040, transformer_debug.constLocationInfo1080);
            if(term == null)
              break Fail404;
            if(true)
              break Success197;
          }
        }
        term = term286;
        IStrategoTerm v_1040 = null;
        IStrategoTerm w_1040 = null;
        IStrategoTerm y_1040 = null;
        IStrategoTerm z_1040 = null;
        IStrategoTerm a_1041 = null;
        y_1040 = term;
        v_1040 = transformer_debug.const513;
        z_1040 = y_1040;
        w_1040 = transformer_debug.const569;
        a_1041 = z_1040;
        term = s_exit_0_3.instance.invoke(context, a_1041, v_1040, w_1040, transformer_debug.constLocationInfo1080);
        if(term == null)
          break Fail404;
        if(true)
          break Fail404;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}