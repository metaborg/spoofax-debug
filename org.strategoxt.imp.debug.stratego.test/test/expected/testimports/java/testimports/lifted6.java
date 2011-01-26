package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6 extends Strategy 
{ 
  public static final lifted6 instance = new lifted6();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25:
    { 
      IStrategoTerm s_26 = null;
      IStrategoTerm t_26 = null;
      IStrategoTerm v_26 = null;
      IStrategoTerm w_26 = null;
      IStrategoTerm x_26 = null;
      v_26 = term;
      s_26 = testimports.const24;
      w_26 = v_26;
      t_26 = testimports.const87;
      x_26 = w_26;
      term = s_step_0_3.instance.invoke(context, x_26, s_26, t_26, testimports.constLocationInfo71);
      if(term == null)
        break Fail25;
      term = testimports.const93;
      if(true)
        return term;
    }
    return null;
  }
}