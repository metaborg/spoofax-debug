package dynamic;

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
    Fail37:
    { 
      IStrategoTerm v_2 = null;
      IStrategoTerm w_2 = null;
      IStrategoTerm y_2 = null;
      IStrategoTerm z_2 = null;
      IStrategoTerm a_3 = null;
      y_2 = term;
      v_2 = dynamic.const0;
      z_2 = y_2;
      w_2 = dynamic.const1;
      a_3 = z_2;
      term = s_step_0_3.instance.invoke(context, a_3, v_2, w_2, dynamic.constLocationInfo1);
      if(term == null)
        break Fail37;
      term = execute_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail37;
      if(true)
        return term;
    }
    return null;
  }
}