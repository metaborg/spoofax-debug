package testimports;

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
  TermReference a_24;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26:
    { 
      IStrategoTerm s_25 = null;
      IStrategoTerm t_25 = null;
      IStrategoTerm v_25 = null;
      IStrategoTerm w_25 = null;
      IStrategoTerm x_25 = null;
      v_25 = term;
      s_25 = testimports.const24;
      w_25 = v_25;
      t_25 = testimports.const87;
      x_25 = w_25;
      term = s_step_0_3.instance.invoke(context, x_25, s_25, t_25, testimports.constLocationInfo67);
      if(term == null)
        break Fail26;
      if(term.getTermType() != IStrategoTerm.APPL || testimports._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail26;
      if(a_24.value == null)
        a_24.value = term.getSubterm(0);
      else
        if(a_24.value != term.getSubterm(0) && !a_24.value.match(term.getSubterm(0)))
          break Fail26;
      if(true)
        return term;
    }
    return null;
  }
}