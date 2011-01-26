package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6 extends Strategy 
{ 
  TermReference t_21;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail31:
    { 
      IStrategoTerm w_25 = null;
      IStrategoTerm x_25 = null;
      IStrategoTerm z_25 = null;
      IStrategoTerm a_26 = null;
      IStrategoTerm b_26 = null;
      z_25 = term;
      w_25 = dynamic.const0;
      a_26 = z_25;
      x_25 = dynamic.const91;
      b_26 = a_26;
      term = s_step_0_3.instance.invoke(context, b_26, w_25, x_25, dynamic.constLocationInfo65);
      if(term == null)
        break Fail31;
      if(term.getTermType() != IStrategoTerm.APPL || dynamic._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail31;
      if(t_21.value == null)
        t_21.value = term.getSubterm(0);
      else
        if(t_21.value != term.getSubterm(0) && !t_21.value.match(term.getSubterm(0)))
          break Fail31;
      if(true)
        return term;
    }
    return null;
  }
}