package strategies.wrap_block_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") public class add_block_0_0 extends Strategy 
{ 
  public static add_block_0_0 instance = new add_block_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("add_block_0_0");
    Fail1:
    { 
      term = topdown_1_0.instance.invoke(context, term, lifted9.instance);
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