package transformer_debug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.strc.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted87 extends Strategy 
{ 
  public static final lifted87 instance = new lifted87();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail633:
    { 
      if(term.getTermType() != IStrategoTerm.STRING || !"-i".equals(((IStrategoString)term).stringValue()))
        break Fail633;
      if(true)
        return term;
    }
    return null;
  }
}