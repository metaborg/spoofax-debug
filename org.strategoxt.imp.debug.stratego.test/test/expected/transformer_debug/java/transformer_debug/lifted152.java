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

@SuppressWarnings("all") final class lifted152 extends Strategy 
{ 
  public static final lifted152 instance = new lifted152();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail450:
    { 
      IStrategoTerm a_1048 = null;
      IStrategoTerm b_1048 = null;
      IStrategoTerm d_1048 = null;
      IStrategoTerm e_1048 = null;
      IStrategoTerm f_1048 = null;
      d_1048 = term;
      a_1048 = transformer_debug.const571;
      e_1048 = d_1048;
      b_1048 = transformer_debug.const577;
      f_1048 = e_1048;
      term = s_step_0_3.instance.invoke(context, f_1048, a_1048, b_1048, transformer_debug.constLocationInfo1103);
      if(term == null)
        break Fail450;
      term = transformer_debug.const579;
      if(true)
        return term;
    }
    return null;
  }
}