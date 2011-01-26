package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  public static final lifted0 instance = new lifted0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail31:
    { 
      IStrategoTerm x_2 = null;
      IStrategoTerm y_2 = null;
      IStrategoTerm a_3 = null;
      IStrategoTerm b_3 = null;
      IStrategoTerm c_3 = null;
      a_3 = term;
      x_2 = testimports.const0;
      b_3 = a_3;
      y_2 = testimports.const6;
      c_3 = b_3;
      term = s_step_0_3.instance.invoke(context, c_3, x_2, y_2, testimports.constLocationInfo4);
      if(term == null)
        break Fail31;
      term = testimports.const14;
      if(true)
        return term;
    }
    return null;
  }
}