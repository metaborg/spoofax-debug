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

@SuppressWarnings("all") public class add_var_to_rule_cond_0_2 extends Strategy 
{ 
  public static add_var_to_rule_cond_0_2 instance = new add_var_to_rule_cond_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_e_1145, IStrategoTerm ref_f_1145)
  { 
    TermReference e_1145 = new TermReference(ref_e_1145);
    TermReference f_1145 = new TermReference(ref_f_1145);
    context.push("add_var_to_rule_cond_0_2");
    Fail348:
    { 
      add_var_to_rule_cond_0_2_fragment_0 add_var_to_rule_cond_0_2_fragment_00 = new add_var_to_rule_cond_0_2_fragment_0();
      add_var_to_rule_cond_0_2_fragment_00.e_1145 = e_1145;
      add_var_to_rule_cond_0_2_fragment_00.f_1145 = f_1145;
      term = add_var_to_rule_cond_0_2_fragment_00.invoke(context, term);
      if(term == null)
        break Fail348;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}