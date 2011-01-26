package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted7 extends Strategy 
{ 
  public static final lifted7 instance = new lifted7();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail30:
    { 
      IStrategoTerm w_26 = null;
      IStrategoTerm x_26 = null;
      IStrategoTerm z_26 = null;
      IStrategoTerm a_27 = null;
      IStrategoTerm b_27 = null;
      z_26 = term;
      w_26 = dynamic.const0;
      a_27 = z_26;
      x_26 = dynamic.const91;
      b_27 = a_27;
      term = s_step_0_3.instance.invoke(context, b_27, w_26, x_26, dynamic.constLocationInfo69);
      if(term == null)
        break Fail30;
      term = dynamic.const109;
      if(true)
        return term;
    }
    return null;
  }
}