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

@SuppressWarnings("all") final class lifted113 extends Strategy 
{ 
  public static final lifted113 instance = new lifted113();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail601:
    { 
      IStrategoTerm b_639 = null;
      IStrategoTerm c_639 = null;
      IStrategoTerm e_639 = null;
      IStrategoTerm f_639 = null;
      IStrategoTerm g_639 = null;
      e_639 = term;
      b_639 = transformer_debug.const181;
      f_639 = e_639;
      c_639 = transformer_debug.const204;
      g_639 = f_639;
      term = s_step_0_3.instance.invoke(context, g_639, b_639, c_639, transformer_debug.constLocationInfo120);
      if(term == null)
        break Fail601;
      term = transformer_debug.const207;
      if(true)
        return term;
    }
    return null;
  }
}