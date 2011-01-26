package transformer_debug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.strc.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted107 extends Strategy 
{ 
  public static final lifted107 instance = new lifted107();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail613:
    { 
      IStrategoTerm a_409 = null;
      IStrategoTerm b_409 = null;
      IStrategoTerm d_409 = null;
      IStrategoTerm e_409 = null;
      IStrategoTerm f_409 = null;
      d_409 = term;
      a_409 = transformer_debug.const67;
      e_409 = d_409;
      b_409 = transformer_debug.const174;
      f_409 = e_409;
      term = s_step_0_3.instance.invoke(context, f_409, a_409, b_409, transformer_debug.constLocationInfo65);
      if(term == null)
        break Fail613;
      term = transformer_debug.const179;
      if(true)
        return term;
    }
    return null;
  }
}