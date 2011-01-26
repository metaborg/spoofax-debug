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

@SuppressWarnings("all") final class lifted126 extends Strategy 
{ 
  TermReference b_736;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail589:
    { 
      IStrategoTerm w_737 = null;
      IStrategoTerm x_737 = null;
      IStrategoTerm z_737 = null;
      IStrategoTerm a_738 = null;
      IStrategoTerm b_738 = null;
      z_737 = term;
      w_737 = transformer_debug.const284;
      a_738 = z_737;
      x_737 = transformer_debug.const285;
      b_738 = a_738;
      term = s_step_0_3.instance.invoke(context, b_738, w_737, x_737, transformer_debug.constLocationInfo294);
      if(term == null)
        break Fail589;
      term = add_var_in_s_def_0_1.instance.invoke(context, term, b_736.value);
      if(term == null)
        break Fail589;
      if(true)
        return term;
    }
    return null;
  }
}