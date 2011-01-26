package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  public static final lifted4 instance = new lifted4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail32:
    { 
      IStrategoTerm z_15 = null;
      IStrategoTerm a_16 = null;
      IStrategoTerm c_16 = null;
      IStrategoTerm d_16 = null;
      IStrategoTerm e_16 = null;
      c_16 = term;
      z_15 = localvardebug.const0;
      d_16 = c_16;
      a_16 = localvardebug.const66;
      e_16 = d_16;
      term = s_step_0_3.instance.invoke(context, e_16, z_15, a_16, localvardebug.constLocationInfo42);
      if(term == null)
        break Fail32;
      term = localvardebug.const75;
      if(true)
        return term;
    }
    return null;
  }
}