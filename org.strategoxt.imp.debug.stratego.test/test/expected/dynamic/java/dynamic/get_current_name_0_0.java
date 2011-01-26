package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_current_name_0_0 extends Strategy 
{ 
  public static get_current_name_0_0 instance = new get_current_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_current_name_0_0");
    Fail24:
    { 
      TermReference r_38 = new TermReference();
      TermReference s_38 = new TermReference();
      IStrategoTerm v_38 = null;
      IStrategoTerm x_38 = null;
      IStrategoTerm y_38 = null;
      if(s_38.value == null)
        s_38.value = term;
      else
        if(s_38.value != term && !s_38.value.match(term))
          break Fail24;
      if(r_38.value == null)
        r_38.value = term;
      else
        if(r_38.value != term && !r_38.value.match(term))
          break Fail24;
      x_38 = term;
      v_38 = dynamic.const84;
      y_38 = x_38;
      term = dr_lookup_rule_0_2.instance.invoke(context, y_38, v_38, dynamic.constCons0);
      if(term == null)
        break Fail24;
      lifted9 lifted90 = new lifted9();
      lifted90.r_38 = r_38;
      lifted90.s_38 = s_38;
      term = fetch_elem_1_0.instance.invoke(context, term, lifted90);
      if(term == null)
        break Fail24;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}