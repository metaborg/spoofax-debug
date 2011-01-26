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

@SuppressWarnings("all") final class lifted104 extends Strategy 
{ 
  public static final lifted104 instance = new lifted104();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail616:
    { 
      IStrategoTerm d_394 = null;
      IStrategoTerm e_394 = null;
      IStrategoTerm g_394 = null;
      IStrategoTerm h_394 = null;
      IStrategoTerm i_394 = null;
      g_394 = term;
      d_394 = transformer_debug.const67;
      h_394 = g_394;
      e_394 = transformer_debug.const122;
      i_394 = h_394;
      term = s_step_0_3.instance.invoke(context, i_394, d_394, e_394, transformer_debug.constLocationInfo51);
      if(term == null)
        break Fail616;
      term = transformer_debug.const159;
      if(true)
        return term;
    }
    return null;
  }
}