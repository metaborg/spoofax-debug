package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comment_match_0_1 extends Strategy 
{ 
  public static find_comment_match_0_1 instance = new find_comment_match_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm a_5)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("find_comment_match_0_1");
    Fail11:
    { 
      IStrategoTerm b_5 = null;
      IStrategoTerm d_5 = null;
      IStrategoTerm g_5 = null;
      IStrategoTerm h_5 = null;
      IStrategoTerm j_5 = null;
      IStrategoTerm k_5 = null;
      IStrategoTerm l_5 = null;
      IStrategoTerm o_5 = null;
      IStrategoTerm q_5 = null;
      IStrategoTerm r_5 = null;
      b_5 = term;
      g_5 = term;
      j_5 = term;
      h_5 = localvar.const28;
      k_5 = j_5;
      term = r_enter_0_2.instance.invoke(context, k_5, h_5, localvar.constLocationInfo6);
      if(term == null)
        break Fail11;
      term = g_5;
      l_5 = g_5;
      IStrategoTerm term5 = term;
      Success5:
      { 
        Fail12:
        { 
          term = get_function_name_0_0.instance.invoke(context, b_5);
          if(term == null)
            break Fail12;
          term = find_comment_by_name_0_1.instance.invoke(context, a_5, term);
          if(term == null)
            break Fail12;
          d_5 = term;
          if(true)
            break Success5;
        }
        term = term5;
        IStrategoTerm e_5 = null;
        IStrategoTerm f_5 = null;
        IStrategoTerm n_5 = null;
        e_5 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail11;
        f_5 = term;
        n_5 = e_5;
        term = report_with_failure_0_2.instance.invoke(context, n_5, localvar.const31, f_5);
        if(term == null)
          break Fail11;
      }
      term = l_5;
      if(d_5 == null)
        break Fail11;
      term = termFactory.makeTuple(b_5, d_5);
      q_5 = term;
      o_5 = localvar.const28;
      r_5 = q_5;
      term = r_exit_0_2.instance.invoke(context, r_5, o_5, localvar.constLocationInfo6);
      if(term == null)
        break Fail11;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}