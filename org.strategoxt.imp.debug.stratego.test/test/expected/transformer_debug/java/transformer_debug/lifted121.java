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

@SuppressWarnings("all") final class lifted121 extends Strategy 
{ 
  TermReference c_728;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail592:
    { 
      IStrategoTerm v_733 = null;
      IStrategoTerm w_733 = null;
      IStrategoTerm y_733 = null;
      IStrategoTerm z_733 = null;
      IStrategoTerm a_734 = null;
      y_733 = term;
      v_733 = transformer_debug.const236;
      z_733 = y_733;
      w_733 = transformer_debug.const260;
      a_734 = z_733;
      term = s_step_0_3.instance.invoke(context, a_734, v_733, w_733, transformer_debug.constLocationInfo276);
      if(term == null)
        break Fail592;
      if(c_728.value == null)
        break Fail592;
      term = c_728.value;
      if(true)
        return term;
    }
    return null;
  }
}