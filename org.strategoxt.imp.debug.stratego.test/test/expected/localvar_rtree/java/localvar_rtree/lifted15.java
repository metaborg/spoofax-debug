package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted15 extends Strategy 
{ 
  public static final lifted15 instance = new lifted15();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail64:
    { 
      IStrategoTerm d_151 = null;
      IStrategoTerm e_151 = null;
      IStrategoTerm g_151 = null;
      IStrategoTerm h_151 = null;
      IStrategoTerm j_151 = null;
      g_151 = term;
      d_151 = localvar_rtree.const125;
      h_151 = g_151;
      e_151 = localvar_rtree.const212;
      j_151 = h_151;
      term = s_step_0_3.instance.invoke(context, j_151, d_151, e_151, localvar_rtree.constLocationInfo144);
      if(term == null)
        break Fail64;
      term = localvar_rtree.const219;
      if(true)
        return term;
    }
    return null;
  }
}