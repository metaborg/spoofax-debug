package localvar;

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
  TermReference i_20;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27:
    { 
      IStrategoTerm a_22 = null;
      IStrategoTerm b_22 = null;
      IStrategoTerm d_22 = null;
      IStrategoTerm e_22 = null;
      IStrategoTerm f_22 = null;
      d_22 = term;
      a_22 = localvar.const0;
      e_22 = d_22;
      b_22 = localvar.const87;
      f_22 = e_22;
      term = s_step_0_3.instance.invoke(context, f_22, a_22, b_22, localvar.constLocationInfo57);
      if(term == null)
        break Fail27;
      if(term.getTermType() != IStrategoTerm.APPL || localvar._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail27;
      if(i_20.value == null)
        i_20.value = term.getSubterm(0);
      else
        if(i_20.value != term.getSubterm(0) && !i_20.value.match(term.getSubterm(0)))
          break Fail27;
      if(true)
        return term;
    }
    return null;
  }
}