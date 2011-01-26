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

@SuppressWarnings("all") final class lifted83 extends Strategy 
{ 
  public static final lifted83 instance = new lifted83();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail640:
    { 
      IStrategoTerm s_392 = null;
      IStrategoTerm t_392 = null;
      IStrategoTerm v_392 = null;
      IStrategoTerm w_392 = null;
      IStrategoTerm x_392 = null;
      v_392 = term;
      s_392 = transformer_debug.const67;
      w_392 = v_392;
      t_392 = transformer_debug.const81;
      x_392 = w_392;
      term = s_step_0_3.instance.invoke(context, x_392, s_392, t_392, transformer_debug.constLocationInfo24);
      if(term == null)
        break Fail640;
      term = transformer_debug.const118;
      if(true)
        return term;
    }
    return null;
  }
}