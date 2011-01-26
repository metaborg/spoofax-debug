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

@SuppressWarnings("all") public class add_rule_cond_0_3 extends Strategy 
{ 
  public static add_rule_cond_0_3 instance = new add_rule_cond_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_r_1145, IStrategoTerm ref_s_1145, IStrategoTerm ref_t_1145)
  { 
    TermReference r_1145 = new TermReference(ref_r_1145);
    TermReference s_1145 = new TermReference(ref_s_1145);
    TermReference t_1145 = new TermReference(ref_t_1145);
    context.push("add_rule_cond_0_3");
    Fail391:
    { 
      add_rule_cond_0_3_fragment_0 add_rule_cond_0_3_fragment_00 = new add_rule_cond_0_3_fragment_0();
      add_rule_cond_0_3_fragment_00.r_1145 = r_1145;
      add_rule_cond_0_3_fragment_00.s_1145 = s_1145;
      add_rule_cond_0_3_fragment_00.t_1145 = t_1145;
      term = add_rule_cond_0_3_fragment_00.invoke(context, term);
      if(term == null)
        break Fail391;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}