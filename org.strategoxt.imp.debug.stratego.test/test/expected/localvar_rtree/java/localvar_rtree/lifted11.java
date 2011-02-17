package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted11 extends Strategy 
{ 
  public static final lifted11 instance = new lifted11();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail68:
    { 
      IStrategoTerm g_130 = null;
      IStrategoTerm h_130 = null;
      IStrategoTerm l_130 = null;
      IStrategoTerm n_130 = null;
      IStrategoTerm q_130 = null;
      l_130 = term;
      g_130 = localvar_rtree.const125;
      n_130 = l_130;
      h_130 = localvar_rtree.const165;
      q_130 = n_130;
      term = s_step_0_3.instance.invoke(context, q_130, g_130, h_130, localvar_rtree.constLocationInfo106);
      if(term == null)
        break Fail68;
      if(term.getTermType() != IStrategoTerm.APPL || localvar_rtree._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail68;
      if(true)
        return term;
    }
    return null;
  }
}