package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_functions_0_0 extends Strategy 
{ 
  public static find_functions_0_0 instance = new find_functions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("find_functions_0_0");
    Fail5:
    { 
      IStrategoTerm x_2 = null;
      IStrategoTerm y_2 = null;
      IStrategoTerm b_3 = null;
      IStrategoTerm c_3 = null;
      IStrategoTerm e_3 = null;
      IStrategoTerm f_3 = null;
      IStrategoTerm g_3 = null;
      IStrategoTerm j_3 = null;
      IStrategoTerm l_3 = null;
      IStrategoTerm m_3 = null;
      x_2 = term;
      b_3 = term;
      e_3 = term;
      c_3 = localvar.const15;
      f_3 = e_3;
      term = r_enter_0_2.instance.invoke(context, f_3, c_3, localvar.constLocationInfo3);
      if(term == null)
        break Fail5;
      term = b_3;
      g_3 = b_3;
      IStrategoTerm term2 = term;
      Success2:
      { 
        Fail6:
        { 
          term = filter_1_0.instance.invoke(context, x_2, lifted1.instance);
          if(term == null)
            break Fail6;
          y_2 = term;
          if(true)
            break Success2;
        }
        term = term2;
        IStrategoTerm z_2 = null;
        IStrategoTerm a_3 = null;
        IStrategoTerm i_3 = null;
        z_2 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail5;
        a_3 = term;
        i_3 = z_2;
        term = report_with_failure_0_2.instance.invoke(context, i_3, localvar.const19, a_3);
        if(term == null)
          break Fail5;
      }
      term = g_3;
      if(y_2 == null)
        break Fail5;
      l_3 = y_2;
      j_3 = localvar.const15;
      m_3 = l_3;
      term = r_exit_0_2.instance.invoke(context, m_3, j_3, localvar.constLocationInfo3);
      if(term == null)
        break Fail5;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}