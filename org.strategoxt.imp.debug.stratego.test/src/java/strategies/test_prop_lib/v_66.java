package strategies.test_prop_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") final class v_66 extends Strategy 
{ 
  public static final v_66 instance = new v_66();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy x_66)
  { 
    Fail20:
    { 
      lifted9 lifted94 = new lifted9();
      lifted94.x_66 = x_66;
      term = SRTS_all.instance.invoke(context, term, lifted94);
      if(term == null)
        break Fail20;
      term = x_66.invoke(context, term);
      if(term == null)
        break Fail20;
      if(true)
        return term;
    }
    return null;
  }
}