package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted16 extends Strategy 
{ 
  public static final lifted16 instance = new lifted16();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail63:
    { 
      IStrategoTerm r_158 = null;
      IStrategoTerm s_158 = null;
      IStrategoTerm u_158 = null;
      IStrategoTerm w_158 = null;
      IStrategoTerm x_158 = null;
      u_158 = term;
      r_158 = localvar_rtree.const125;
      w_158 = u_158;
      s_158 = localvar_rtree.const225;
      x_158 = w_158;
      term = s_step_0_3.instance.invoke(context, x_158, r_158, s_158, localvar_rtree.constLocationInfo151);
      if(term == null)
        break Fail63;
      term = localvar_rtree.const229;
      if(true)
        return term;
    }
    return null;
  }
}