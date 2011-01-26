package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class aux_get_current_name_0_2 extends Strategy 
{ 
  public static aux_get_current_name_0_2 instance = new aux_get_current_name_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_38, IStrategoTerm a_39)
  { 
    Fail25:
    { 
      IStrategoTerm b_39 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail25;
      IStrategoTerm arg7 = term.getSubterm(0);
      if(arg7.getTermType() != IStrategoTerm.STRING || !"-395458".equals(((IStrategoString)arg7).stringValue()))
        break Fail25;
      b_39 = term.getSubterm(1);
      term = b_39;
      if(true)
        return term;
    }
    context.push("aux_get_current_name_0_2");
    context.popOnFailure();
    return null;
  }
}