package localvar;

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
  public static final lifted5 instance = new lifted5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26:
    { 
      IStrategoTerm a_23 = null;
      IStrategoTerm b_23 = null;
      IStrategoTerm d_23 = null;
      IStrategoTerm e_23 = null;
      IStrategoTerm f_23 = null;
      d_23 = term;
      a_23 = localvar.const0;
      e_23 = d_23;
      b_23 = localvar.const87;
      f_23 = e_23;
      term = s_step_0_3.instance.invoke(context, f_23, a_23, b_23, localvar.constLocationInfo61);
      if(term == null)
        break Fail26;
      term = localvar.const94;
      if(true)
        return term;
    }
    return null;
  }
}