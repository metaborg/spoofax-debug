package strategies.debuggable_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") final class lifted6 extends Strategy 
{ 
  public static final lifted6 instance = new lifted6();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail2:
    { 
      term = debuggable_lib.const1;
      if(true)
        return term;
    }
    return null;
  }
}