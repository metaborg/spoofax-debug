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

@SuppressWarnings("all") final class lifted151 extends Strategy 
{ 
  public static final lifted151 instance = new lifted151();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail451:
    { 
      IStrategoTerm u_1044 = null;
      IStrategoTerm v_1044 = null;
      IStrategoTerm x_1044 = null;
      IStrategoTerm y_1044 = null;
      IStrategoTerm z_1044 = null;
      x_1044 = term;
      u_1044 = transformer_debug.const571;
      y_1044 = x_1044;
      v_1044 = transformer_debug.const575;
      z_1044 = y_1044;
      term = s_step_0_3.instance.invoke(context, z_1044, u_1044, v_1044, transformer_debug.constLocationInfo1093);
      if(term == null)
        break Fail451;
      term = transformer_debug.const576;
      if(true)
        return term;
    }
    return null;
  }
}