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

@SuppressWarnings("all") public class create_usage_0_0 extends Strategy 
{ 
  public static create_usage_0_0 instance = new create_usage_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_usage_0_0");
    Fail296:
    { 
      IStrategoTerm i_408 = null;
      IStrategoTerm j_408 = null;
      IStrategoTerm l_408 = null;
      IStrategoTerm m_408 = null;
      IStrategoTerm n_408 = null;
      l_408 = term;
      i_408 = transformer_debug.const67;
      m_408 = l_408;
      j_408 = transformer_debug.const174;
      n_408 = m_408;
      term = s_enter_0_3.instance.invoke(context, n_408, i_408, j_408, transformer_debug.constLocationInfo63);
      if(term == null)
        break Fail296;
      IStrategoTerm term145 = term;
      Success143:
      { 
        Fail297:
        { 
          IStrategoTerm o_408 = null;
          IStrategoTerm p_408 = null;
          IStrategoTerm r_408 = null;
          IStrategoTerm s_408 = null;
          IStrategoTerm t_408 = null;
          r_408 = term;
          o_408 = transformer_debug.const67;
          s_408 = r_408;
          p_408 = transformer_debug.const174;
          t_408 = s_408;
          term = s_step_0_3.instance.invoke(context, t_408, o_408, p_408, transformer_debug.constLocationInfo66);
          if(term == null)
            break Fail297;
          term = default_system_usage_2_0.instance.invoke(context, term, lifted106.instance, lifted107.instance);
          if(term == null)
            break Fail297;
          { 
            IStrategoTerm g_409 = null;
            IStrategoTerm h_409 = null;
            IStrategoTerm j_409 = null;
            IStrategoTerm k_409 = null;
            IStrategoTerm l_409 = null;
            j_409 = term;
            g_409 = transformer_debug.const67;
            k_409 = j_409;
            h_409 = transformer_debug.const174;
            l_409 = k_409;
            term = s_exit_0_3.instance.invoke(context, l_409, g_409, h_409, transformer_debug.constLocationInfo63);
            if(term == null)
              break Fail296;
            if(true)
              break Success143;
          }
        }
        term = term145;
        IStrategoTerm m_409 = null;
        IStrategoTerm n_409 = null;
        IStrategoTerm p_409 = null;
        IStrategoTerm q_409 = null;
        IStrategoTerm r_409 = null;
        p_409 = term;
        m_409 = transformer_debug.const67;
        q_409 = p_409;
        n_409 = transformer_debug.const174;
        r_409 = q_409;
        term = s_exit_0_3.instance.invoke(context, r_409, m_409, n_409, transformer_debug.constLocationInfo63);
        if(term == null)
          break Fail296;
        if(true)
          break Fail296;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}