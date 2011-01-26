package localvardebug;

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
      IStrategoTerm v_20 = null;
      IStrategoTerm w_20 = null;
      IStrategoTerm y_20 = null;
      IStrategoTerm z_20 = null;
      IStrategoTerm a_21 = null;
      y_20 = term;
      v_20 = localvardebug.const0;
      z_20 = y_20;
      w_20 = localvardebug.const78;
      a_21 = z_20;
      term = s_step_0_3.instance.invoke(context, a_21, v_20, w_20, localvardebug.constLocationInfo57);
      if(term == null)
        break Fail30;
      term = localvardebug.const94;
      if(true)
        return term;
    }
    return null;
  }
}