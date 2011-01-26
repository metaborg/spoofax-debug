package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  public static final lifted1 instance = new lifted1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail36:
    { 
      IStrategoTerm k_10 = null;
      IStrategoTerm l_10 = null;
      IStrategoTerm n_10 = null;
      IStrategoTerm o_10 = null;
      IStrategoTerm p_10 = null;
      n_10 = term;
      k_10 = dynamic.const0;
      o_10 = n_10;
      l_10 = dynamic.const40;
      p_10 = o_10;
      term = s_step_0_3.instance.invoke(context, p_10, k_10, l_10, dynamic.constLocationInfo23);
      if(term == null)
        break Fail36;
      if(term.getTermType() != IStrategoTerm.APPL || dynamic._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      if(true)
        return term;
    }
    return null;
  }
}