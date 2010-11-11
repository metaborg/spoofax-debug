package strategies.wrap_block_pp_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") final class lifted9 extends Strategy 
{ 
  public static final lifted9 instance = new lifted9();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail3:
    { 
      term = try_1_0.instance.invoke(context, term, $Add$Block_0_0.instance);
      if(term == null)
        break Fail3;
      if(true)
        return term;
    }
    return null;
  }
}