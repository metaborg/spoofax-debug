package localvardebug;

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
    Fail31:
    { 
      IStrategoTerm t_18 = null;
      IStrategoTerm u_18 = null;
      IStrategoTerm w_18 = null;
      IStrategoTerm x_18 = null;
      IStrategoTerm y_18 = null;
      w_18 = term;
      t_18 = localvardebug.const0;
      x_18 = w_18;
      u_18 = localvardebug.const78;
      y_18 = x_18;
      term = s_step_0_3.instance.invoke(context, y_18, t_18, u_18, localvardebug.constLocationInfo49);
      if(term == null)
        break Fail31;
      term = localvardebug.const87;
      if(true)
        return term;
    }
    return null;
  }
}