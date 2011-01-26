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

@SuppressWarnings("all") public class add_step_to_strategy_0_2 extends Strategy 
{ 
  public static add_step_to_strategy_0_2 instance = new add_step_to_strategy_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_1145, IStrategoTerm ref_l_1145)
  { 
    TermReference k_1145 = new TermReference(ref_k_1145);
    TermReference l_1145 = new TermReference(ref_l_1145);
    context.push("add_step_to_strategy_0_2");
    Fail372:
    { 
      add_step_to_strategy_0_2_fragment_15 add_step_to_strategy_0_2_fragment_150 = new add_step_to_strategy_0_2_fragment_15();
      add_step_to_strategy_0_2_fragment_150.k_1145 = k_1145;
      add_step_to_strategy_0_2_fragment_150.l_1145 = l_1145;
      term = add_step_to_strategy_0_2_fragment_150.invoke(context, term);
      if(term == null)
        break Fail372;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}