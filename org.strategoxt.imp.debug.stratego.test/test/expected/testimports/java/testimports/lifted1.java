package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  public static final lifted1 instance = new lifted1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail30:
    { 
      IStrategoTerm r_5 = null;
      IStrategoTerm s_5 = null;
      IStrategoTerm u_5 = null;
      IStrategoTerm v_5 = null;
      IStrategoTerm w_5 = null;
      u_5 = term;
      r_5 = testimports.const24;
      v_5 = u_5;
      s_5 = testimports.const25;
      w_5 = v_5;
      term = s_step_0_3.instance.invoke(context, w_5, r_5, s_5, testimports.constLocationInfo11);
      if(term == null)
        break Fail30;
      term = execute_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail30;
      if(true)
        return term;
    }
    return null;
  }
}