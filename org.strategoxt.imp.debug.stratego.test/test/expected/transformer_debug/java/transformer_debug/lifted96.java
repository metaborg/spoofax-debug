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

@SuppressWarnings("all") final class lifted96 extends Strategy 
{ 
  public static final lifted96 instance = new lifted96();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail624:
    { 
      IStrategoTerm v_402 = null;
      IStrategoTerm w_402 = null;
      IStrategoTerm y_402 = null;
      IStrategoTerm z_402 = null;
      IStrategoTerm a_403 = null;
      y_402 = transformer_debug.const132;
      v_402 = transformer_debug.const67;
      z_402 = y_402;
      w_402 = transformer_debug.const122;
      a_403 = z_402;
      term = s_step_0_3.instance.invoke(context, a_403, v_402, w_402, transformer_debug.constLocationInfo41);
      if(term == null)
        break Fail624;
      term = set_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail624;
      if(true)
        return term;
    }
    return null;
  }
}