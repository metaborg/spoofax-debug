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

@SuppressWarnings("all") final class lifted115 extends Strategy 
{ 
  public static final lifted115 instance = new lifted115();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail598:
    { 
      IStrategoTerm r_688 = null;
      IStrategoTerm s_688 = null;
      IStrategoTerm u_688 = null;
      IStrategoTerm v_688 = null;
      IStrategoTerm w_688 = null;
      u_688 = term;
      r_688 = transformer_debug.const223;
      v_688 = u_688;
      s_688 = transformer_debug.const224;
      w_688 = v_688;
      term = s_step_0_3.instance.invoke(context, w_688, r_688, s_688, transformer_debug.constLocationInfo159);
      if(term == null)
        break Fail598;
      term = transformer_debug.const226;
      if(true)
        return term;
    }
    return null;
  }
}