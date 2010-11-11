package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class execute_0_0 extends Strategy 
{ 
  public static execute_0_0 instance = new execute_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("execute_0_0");
    Fail1:
    { 
      IStrategoTerm l_1 = null;
      IStrategoTerm m_1 = null;
      IStrategoTerm p_1 = null;
      IStrategoTerm q_1 = null;
      IStrategoTerm s_1 = null;
      IStrategoTerm t_1 = null;
      IStrategoTerm u_1 = null;
      IStrategoTerm x_1 = null;
      IStrategoTerm z_1 = null;
      IStrategoTerm a_2 = null;
      l_1 = term;
      p_1 = term;
      s_1 = term;
      q_1 = localvar.const5;
      t_1 = s_1;
      term = r_enter_0_2.instance.invoke(context, t_1, q_1, localvar.constLocationInfo1);
      if(term == null)
        break Fail1;
      term = p_1;
      u_1 = p_1;
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail2:
        { 
          term = match_comments_0_0.instance.invoke(context, l_1);
          if(term == null)
            break Fail2;
          m_1 = term;
          if(true)
            break Success0;
        }
        term = term0;
        IStrategoTerm n_1 = null;
        IStrategoTerm o_1 = null;
        IStrategoTerm w_1 = null;
        n_1 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail1;
        o_1 = term;
        w_1 = n_1;
        term = report_with_failure_0_2.instance.invoke(context, w_1, localvar.const9, o_1);
        if(term == null)
          break Fail1;
      }
      term = u_1;
      if(m_1 == null)
        break Fail1;
      z_1 = m_1;
      x_1 = localvar.const5;
      a_2 = z_1;
      term = r_exit_0_2.instance.invoke(context, a_2, x_1, localvar.constLocationInfo1);
      if(term == null)
        break Fail1;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}