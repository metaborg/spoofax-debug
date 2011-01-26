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

@SuppressWarnings("all") final class lifted130 extends Strategy 
{ 
  public static final lifted130 instance = new lifted130();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail574:
    { 
      IStrategoTerm c_805 = null;
      IStrategoTerm d_805 = null;
      IStrategoTerm g_805 = null;
      IStrategoTerm k_805 = null;
      IStrategoTerm l_805 = null;
      g_805 = term;
      c_805 = transformer_debug.const284;
      k_805 = g_805;
      d_805 = transformer_debug.const339;
      l_805 = k_805;
      term = s_step_0_3.instance.invoke(context, l_805, c_805, d_805, transformer_debug.constLocationInfo476);
      if(term == null)
        break Fail574;
      term = transformer_debug.const348;
      if(true)
        return term;
    }
    return null;
  }
}