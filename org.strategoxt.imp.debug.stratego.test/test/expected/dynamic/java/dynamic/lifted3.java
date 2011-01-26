package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  TermReference n_13;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail34:
    { 
      IStrategoTerm d_15 = null;
      IStrategoTerm e_15 = null;
      IStrategoTerm g_15 = null;
      IStrategoTerm h_15 = null;
      IStrategoTerm i_15 = null;
      g_15 = term;
      d_15 = dynamic.const0;
      h_15 = g_15;
      e_15 = dynamic.const57;
      i_15 = h_15;
      term = s_step_0_3.instance.invoke(context, i_15, d_15, e_15, dynamic.constLocationInfo36);
      if(term == null)
        break Fail34;
      term = try_find_comment_by_name_0_1.instance.invoke(context, term, n_13.value);
      if(term == null)
        break Fail34;
      if(true)
        return term;
    }
    return null;
  }
}