package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference e_6;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail17:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || localvar._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail17;
      if(e_6.value == null)
        e_6.value = term.getSubterm(0);
      else
        if(e_6.value != term.getSubterm(0) && !e_6.value.match(term.getSubterm(0)))
          break Fail17;
      if(true)
        return term;
    }
    return null;
  }
}