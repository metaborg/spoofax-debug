package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  TermReference h_4;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail18:
    { 
      term = find_comment_match_0_1.instance.invoke(context, term, h_4.value);
      if(term == null)
        break Fail18;
      if(true)
        return term;
    }
    return null;
  }
}