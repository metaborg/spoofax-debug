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

@SuppressWarnings("all") final class lifted93 extends Strategy 
{ 
  public static final lifted93 instance = new lifted93();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail627:
    { 
      if(term.getTermType() != IStrategoTerm.STRING || !"-o".equals(((IStrategoString)term).stringValue()))
        break Fail627;
      if(true)
        return term;
    }
    return null;
  }
}