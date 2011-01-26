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

@SuppressWarnings("all") final class lifted97 extends Strategy 
{ 
  public static final lifted97 instance = new lifted97();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail622:
    { 
      IStrategoTerm b_403 = null;
      IStrategoTerm c_403 = null;
      IStrategoTerm e_403 = null;
      IStrategoTerm f_403 = null;
      IStrategoTerm g_403 = null;
      e_403 = term;
      b_403 = transformer_debug.const67;
      f_403 = e_403;
      c_403 = transformer_debug.const122;
      g_403 = f_403;
      term = s_step_0_3.instance.invoke(context, g_403, b_403, c_403, transformer_debug.constLocationInfo42);
      if(term == null)
        break Fail622;
      term = $Option$One$Check_1_0.instance.invoke(context, term, lifted98.instance);
      if(term == null)
        break Fail622;
      if(true)
        return term;
    }
    return null;
  }
}