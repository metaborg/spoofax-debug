package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted2 extends Strategy 
{ 
  public static final lifted2 instance = new lifted2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29:
    { 
      IStrategoTerm g_13 = null;
      IStrategoTerm h_13 = null;
      IStrategoTerm j_13 = null;
      IStrategoTerm k_13 = null;
      IStrategoTerm l_13 = null;
      j_13 = term;
      g_13 = testimports.const24;
      k_13 = j_13;
      h_13 = testimports.const47;
      l_13 = k_13;
      term = s_step_0_3.instance.invoke(context, l_13, g_13, h_13, testimports.constLocationInfo33);
      if(term == null)
        break Fail29;
      if(term.getTermType() != IStrategoTerm.APPL || testimports._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail29;
      if(true)
        return term;
    }
    return null;
  }
}