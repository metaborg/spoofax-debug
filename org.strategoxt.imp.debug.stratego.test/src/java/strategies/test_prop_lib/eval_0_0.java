package strategies.test_prop_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") public class eval_0_0 extends Strategy 
{ 
  public static eval_0_0 instance = new eval_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("eval_0_0");
    Fail1:
    { 
      term = v_66.instance.invoke(context, term, w_66.instance);
      if(term == null)
        break Fail1;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}