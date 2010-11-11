package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comment_by_name_0_1 extends Strategy 
{ 
  public static find_comment_by_name_0_1 instance = new find_comment_by_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_6)
  { 
    TermReference e_6 = new TermReference(ref_e_6);
    context.push("find_comment_by_name_0_1");
    Fail14:
    { 
      IStrategoTerm f_6 = null;
      IStrategoTerm h_6 = null;
      IStrategoTerm k_6 = null;
      IStrategoTerm l_6 = null;
      IStrategoTerm n_6 = null;
      IStrategoTerm o_6 = null;
      IStrategoTerm p_6 = null;
      IStrategoTerm s_6 = null;
      IStrategoTerm u_6 = null;
      IStrategoTerm v_6 = null;
      f_6 = term;
      k_6 = term;
      n_6 = term;
      l_6 = localvar.const36;
      o_6 = n_6;
      term = r_enter_0_2.instance.invoke(context, o_6, l_6, localvar.constLocationInfo8);
      if(term == null)
        break Fail14;
      term = k_6;
      p_6 = k_6;
      IStrategoTerm term6 = term;
      Success6:
      { 
        Fail15:
        { 
          term = f_6;
          lifted4 lifted40 = new lifted4();
          lifted40.e_6 = e_6;
          term = filter_1_0.instance.invoke(context, term, lifted40);
          if(term == null)
            break Fail15;
          term = first_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail15;
          h_6 = term;
          if(true)
            break Success6;
        }
        term = term6;
        IStrategoTerm i_6 = null;
        IStrategoTerm j_6 = null;
        IStrategoTerm r_6 = null;
        i_6 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail14;
        j_6 = term;
        r_6 = i_6;
        term = report_with_failure_0_2.instance.invoke(context, r_6, localvar.const40, j_6);
        if(term == null)
          break Fail14;
      }
      term = p_6;
      if(h_6 == null)
        break Fail14;
      u_6 = h_6;
      s_6 = localvar.const36;
      v_6 = u_6;
      term = r_exit_0_2.instance.invoke(context, v_6, s_6, localvar.constLocationInfo8);
      if(term == null)
        break Fail14;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}