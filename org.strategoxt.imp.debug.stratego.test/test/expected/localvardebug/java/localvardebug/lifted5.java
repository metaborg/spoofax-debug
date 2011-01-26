package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  public static final lifted5 instance = new lifted5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail33:
    { 
      IStrategoTerm r_16 = null;
      IStrategoTerm s_16 = null;
      IStrategoTerm u_16 = null;
      IStrategoTerm v_16 = null;
      IStrategoTerm w_16 = null;
      u_16 = term;
      r_16 = localvardebug.const0;
      v_16 = u_16;
      s_16 = localvardebug.const66;
      w_16 = v_16;
      term = s_step_0_3.instance.invoke(context, w_16, r_16, s_16, localvardebug.constLocationInfo39);
      if(term == null)
        break Fail33;
      term = localvardebug.const71;
      if(true)
        return term;
    }
    return null;
  }
}