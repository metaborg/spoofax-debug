package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9 extends Strategy 
{ 
  TermReference r_38;

  TermReference s_38;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26:
    { 
      term = aux_get_current_name_0_2.instance.invoke(context, term, r_38.value, s_38.value);
      if(term == null)
        break Fail26;
      if(true)
        return term;
    }
    return null;
  }
}