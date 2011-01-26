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

@SuppressWarnings("all") final class lifted103 extends Strategy 
{ 
  public static final lifted103 instance = new lifted103();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail617:
    { 
      IStrategoTerm x_393 = null;
      IStrategoTerm y_393 = null;
      IStrategoTerm a_394 = null;
      IStrategoTerm b_394 = null;
      IStrategoTerm c_394 = null;
      a_394 = transformer_debug.const156;
      x_393 = transformer_debug.const67;
      b_394 = a_394;
      y_393 = transformer_debug.const122;
      c_394 = b_394;
      term = s_step_0_3.instance.invoke(context, c_394, x_393, y_393, transformer_debug.constLocationInfo50);
      if(term == null)
        break Fail617;
      term = set_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail617;
      if(true)
        return term;
    }
    return null;
  }
}