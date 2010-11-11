package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_f_and_c_0_0 extends Strategy 
{ 
  public static match_f_and_c_0_0 instance = new match_f_and_c_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("match_f_and_c_0_0");
    Fail9:
    { 
      TermReference h_4 = new TermReference();
      IStrategoTerm i_4 = null;
      IStrategoTerm j_4 = null;
      IStrategoTerm m_4 = null;
      IStrategoTerm n_4 = null;
      IStrategoTerm p_4 = null;
      IStrategoTerm q_4 = null;
      IStrategoTerm r_4 = null;
      IStrategoTerm u_4 = null;
      IStrategoTerm w_4 = null;
      IStrategoTerm x_4 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail9;
      i_4 = term.getSubterm(0);
      if(h_4.value == null)
        h_4.value = term.getSubterm(1);
      else
        if(h_4.value != term.getSubterm(1) && !h_4.value.match(term.getSubterm(1)))
          break Fail9;
      m_4 = term;
      p_4 = term;
      n_4 = localvar.const24;
      q_4 = p_4;
      term = r_enter_0_2.instance.invoke(context, q_4, n_4, localvar.constLocationInfo5);
      if(term == null)
        break Fail9;
      term = m_4;
      r_4 = m_4;
      IStrategoTerm term4 = term;
      Success4:
      { 
        Fail10:
        { 
          term = i_4;
          lifted3 lifted30 = new lifted3();
          lifted30.h_4 = h_4;
          term = map_1_0.instance.invoke(context, term, lifted30);
          if(term == null)
            break Fail10;
          j_4 = term;
          if(true)
            break Success4;
        }
        term = term4;
        IStrategoTerm k_4 = null;
        IStrategoTerm l_4 = null;
        IStrategoTerm t_4 = null;
        k_4 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail9;
        l_4 = term;
        t_4 = k_4;
        term = report_with_failure_0_2.instance.invoke(context, t_4, localvar.const27, l_4);
        if(term == null)
          break Fail9;
      }
      term = r_4;
      if(j_4 == null)
        break Fail9;
      w_4 = j_4;
      u_4 = localvar.const24;
      x_4 = w_4;
      term = r_exit_0_2.instance.invoke(context, x_4, u_4, localvar.constLocationInfo5);
      if(term == null)
        break Fail9;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}