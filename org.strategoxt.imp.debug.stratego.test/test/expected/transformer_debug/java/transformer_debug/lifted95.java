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

@SuppressWarnings("all") final class lifted95 extends Strategy 
{ 
  public static final lifted95 instance = new lifted95();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail625:
    { 
      IStrategoTerm e_402 = null;
      IStrategoTerm f_402 = null;
      IStrategoTerm i_402 = null;
      IStrategoTerm k_402 = null;
      IStrategoTerm l_402 = null;
      i_402 = term;
      e_402 = transformer_debug.const67;
      k_402 = i_402;
      f_402 = transformer_debug.const122;
      l_402 = k_402;
      term = s_step_0_3.instance.invoke(context, l_402, e_402, f_402, transformer_debug.constLocationInfo39);
      if(term == null)
        break Fail625;
      term = transformer_debug.const140;
      if(true)
        return term;
    }
    return null;
  }
}