package strategies.test_prop_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") final class lifted9 extends Strategy 
{ 
  Strategy x_66;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail21:
    { 
      term = v_66.instance.invoke(context, term, x_66);
      if(term == null)
        break Fail21;
      if(true)
        return term;
    }
    return null;
  }
}