package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted2 extends Strategy 
{ 
  public static final lifted2 instance = new lifted2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail19:
    { 
      if(term.getTermType() != IStrategoTerm.APPL || localvar._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail19;
      if(true)
        return term;
    }
    return null;
  }
}