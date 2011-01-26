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

@SuppressWarnings("all") public class filter_location_0_0 extends Strategy 
{ 
  public static filter_location_0_0 instance = new filter_location_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("filter_location_0_0");
    Fail375:
    { 
      IStrategoTerm l_977 = null;
      IStrategoTerm m_977 = null;
      IStrategoTerm o_977 = null;
      IStrategoTerm p_977 = null;
      IStrategoTerm q_977 = null;
      o_977 = term;
      l_977 = transformer_debug.const513;
      p_977 = o_977;
      m_977 = transformer_debug.const514;
      q_977 = p_977;
      term = s_enter_0_3.instance.invoke(context, q_977, l_977, m_977, transformer_debug.constLocationInfo906);
      if(term == null)
        break Fail375;
      IStrategoTerm term262 = term;
      Success183:
      { 
        Fail376:
        { 
          IStrategoTerm r_977 = null;
          IStrategoTerm s_977 = null;
          IStrategoTerm u_977 = null;
          IStrategoTerm v_977 = null;
          IStrategoTerm w_977 = null;
          u_977 = term;
          r_977 = transformer_debug.const513;
          v_977 = u_977;
          s_977 = transformer_debug.const514;
          w_977 = v_977;
          term = s_step_0_3.instance.invoke(context, w_977, r_977, s_977, transformer_debug.constLocationInfo907);
          if(term == null)
            break Fail376;
          { 
            IStrategoTerm x_977 = null;
            IStrategoTerm y_977 = null;
            IStrategoTerm a_978 = null;
            IStrategoTerm b_978 = null;
            IStrategoTerm c_978 = null;
            a_978 = term;
            x_977 = transformer_debug.const513;
            b_978 = a_978;
            y_977 = transformer_debug.const514;
            c_978 = b_978;
            term = s_exit_0_3.instance.invoke(context, c_978, x_977, y_977, transformer_debug.constLocationInfo906);
            if(term == null)
              break Fail375;
            if(true)
              break Success183;
          }
        }
        term = term262;
        IStrategoTerm d_978 = null;
        IStrategoTerm e_978 = null;
        IStrategoTerm g_978 = null;
        IStrategoTerm h_978 = null;
        IStrategoTerm i_978 = null;
        g_978 = term;
        d_978 = transformer_debug.const513;
        h_978 = g_978;
        e_978 = transformer_debug.const514;
        i_978 = h_978;
        term = s_exit_0_3.instance.invoke(context, i_978, d_978, e_978, transformer_debug.constLocationInfo906);
        if(term == null)
          break Fail375;
        if(true)
          break Fail375;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}