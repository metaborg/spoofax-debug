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

@SuppressWarnings("all") final class lifted106 extends Strategy 
{ 
  public static final lifted106 instance = new lifted106();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail614:
    { 
      IStrategoTerm u_408 = null;
      IStrategoTerm v_408 = null;
      IStrategoTerm x_408 = null;
      IStrategoTerm y_408 = null;
      IStrategoTerm z_408 = null;
      x_408 = term;
      u_408 = transformer_debug.const67;
      y_408 = x_408;
      v_408 = transformer_debug.const174;
      z_408 = y_408;
      term = s_step_0_3.instance.invoke(context, z_408, u_408, v_408, transformer_debug.constLocationInfo64);
      if(term == null)
        break Fail614;
      term = transformer_debug.const177;
      if(true)
        return term;
    }
    return null;
  }
}