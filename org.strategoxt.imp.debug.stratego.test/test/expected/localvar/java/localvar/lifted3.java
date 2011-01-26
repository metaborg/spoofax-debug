package localvar;

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
  TermReference r_12;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28:
    { 
      IStrategoTerm h_14 = null;
      IStrategoTerm i_14 = null;
      IStrategoTerm k_14 = null;
      IStrategoTerm l_14 = null;
      IStrategoTerm m_14 = null;
      k_14 = term;
      h_14 = localvar.const0;
      l_14 = k_14;
      i_14 = localvar.const57;
      m_14 = l_14;
      term = s_step_0_3.instance.invoke(context, m_14, h_14, i_14, localvar.constLocationInfo36);
      if(term == null)
        break Fail28;
      term = try_find_comment_by_name_0_1.instance.invoke(context, term, r_12.value);
      if(term == null)
        break Fail28;
      if(true)
        return term;
    }
    return null;
  }
}