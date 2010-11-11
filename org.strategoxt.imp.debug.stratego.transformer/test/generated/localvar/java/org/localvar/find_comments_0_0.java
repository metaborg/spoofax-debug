package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comments_0_0 extends Strategy 
{ 
  public static find_comments_0_0 instance = new find_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("find_comments_0_0");
    Fail7:
    { 
      IStrategoTerm p_3 = null;
      IStrategoTerm q_3 = null;
      IStrategoTerm t_3 = null;
      IStrategoTerm u_3 = null;
      IStrategoTerm w_3 = null;
      IStrategoTerm x_3 = null;
      IStrategoTerm y_3 = null;
      IStrategoTerm b_4 = null;
      IStrategoTerm d_4 = null;
      IStrategoTerm e_4 = null;
      p_3 = term;
      t_3 = term;
      w_3 = term;
      u_3 = localvar.const20;
      x_3 = w_3;
      term = r_enter_0_2.instance.invoke(context, x_3, u_3, localvar.constLocationInfo4);
      if(term == null)
        break Fail7;
      term = t_3;
      y_3 = t_3;
      IStrategoTerm term3 = term;
      Success3:
      { 
        Fail8:
        { 
          term = filter_1_0.instance.invoke(context, p_3, lifted2.instance);
          if(term == null)
            break Fail8;
          q_3 = term;
          if(true)
            break Success3;
        }
        term = term3;
        IStrategoTerm r_3 = null;
        IStrategoTerm s_3 = null;
        IStrategoTerm a_4 = null;
        r_3 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail7;
        s_3 = term;
        a_4 = r_3;
        term = report_with_failure_0_2.instance.invoke(context, a_4, localvar.const23, s_3);
        if(term == null)
          break Fail7;
      }
      term = y_3;
      if(q_3 == null)
        break Fail7;
      d_4 = q_3;
      b_4 = localvar.const20;
      e_4 = d_4;
      term = r_exit_0_2.instance.invoke(context, e_4, b_4, localvar.constLocationInfo4);
      if(term == null)
        break Fail7;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}