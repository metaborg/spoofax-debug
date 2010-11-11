package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_comments_0_0 extends Strategy 
{ 
  public static match_comments_0_0 instance = new match_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("match_comments_0_0");
    Fail3:
    { 
      IStrategoTerm d_2 = null;
      IStrategoTerm e_2 = null;
      IStrategoTerm g_2 = null;
      IStrategoTerm j_2 = null;
      IStrategoTerm k_2 = null;
      IStrategoTerm m_2 = null;
      IStrategoTerm n_2 = null;
      IStrategoTerm o_2 = null;
      IStrategoTerm r_2 = null;
      IStrategoTerm t_2 = null;
      IStrategoTerm u_2 = null;
      if(term.getTermType() != IStrategoTerm.APPL || localvar._consProgram_2 != ((IStrategoAppl)term).getConstructor())
        break Fail3;
      d_2 = term.getSubterm(1);
      j_2 = term;
      m_2 = term;
      k_2 = localvar.const10;
      n_2 = m_2;
      term = r_enter_0_2.instance.invoke(context, n_2, k_2, localvar.constLocationInfo2);
      if(term == null)
        break Fail3;
      term = j_2;
      o_2 = j_2;
      IStrategoTerm term1 = term;
      Success1:
      { 
        Fail4:
        { 
          term = find_functions_0_0.instance.invoke(context, d_2);
          if(term == null)
            break Fail4;
          e_2 = term;
          term = find_comments_0_0.instance.invoke(context, d_2);
          if(term == null)
            break Fail4;
          term = termFactory.makeTuple(e_2, term);
          term = match_f_and_c_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail4;
          g_2 = term;
          if(true)
            break Success1;
        }
        term = term1;
        IStrategoTerm h_2 = null;
        IStrategoTerm i_2 = null;
        IStrategoTerm q_2 = null;
        h_2 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail3;
        i_2 = term;
        q_2 = h_2;
        term = report_with_failure_0_2.instance.invoke(context, q_2, localvar.const14, i_2);
        if(term == null)
          break Fail3;
      }
      term = o_2;
      if(g_2 == null)
        break Fail3;
      t_2 = g_2;
      r_2 = localvar.const10;
      u_2 = t_2;
      term = r_exit_0_2.instance.invoke(context, u_2, r_2, localvar.constLocationInfo2);
      if(term == null)
        break Fail3;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}