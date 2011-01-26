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

@SuppressWarnings("all") final class lifted86 extends Strategy 
{ 
  public static final lifted86 instance = new lifted86();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail634:
    { 
      IStrategoTerm w_394 = null;
      IStrategoTerm x_394 = null;
      IStrategoTerm z_394 = null;
      IStrategoTerm a_395 = null;
      IStrategoTerm b_395 = null;
      z_394 = term;
      w_394 = transformer_debug.const67;
      a_395 = z_394;
      x_394 = transformer_debug.const122;
      b_395 = a_395;
      term = s_step_0_3.instance.invoke(context, b_395, w_394, x_394, transformer_debug.constLocationInfo28);
      if(term == null)
        break Fail634;
      term = transformer_debug.const125;
      if(true)
        return term;
    }
    return null;
  }
}