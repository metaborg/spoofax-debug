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

@SuppressWarnings("all") final class lifted134 extends Strategy 
{ 
  TermReference d_817;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail573:
    { 
      IStrategoTerm x_818 = null;
      IStrategoTerm y_818 = null;
      IStrategoTerm a_819 = null;
      IStrategoTerm b_819 = null;
      IStrategoTerm c_819 = null;
      a_819 = term;
      x_818 = transformer_debug.const370;
      b_819 = a_819;
      y_818 = transformer_debug.const371;
      c_819 = b_819;
      term = s_step_0_3.instance.invoke(context, c_819, x_818, y_818, transformer_debug.constLocationInfo508);
      if(term == null)
        break Fail573;
      term = add_step_in_s_def_0_1.instance.invoke(context, term, d_817.value);
      if(term == null)
        break Fail573;
      if(true)
        return term;
    }
    return null;
  }
}