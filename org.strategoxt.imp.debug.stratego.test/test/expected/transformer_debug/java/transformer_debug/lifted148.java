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

@SuppressWarnings("all") final class lifted148 extends Strategy 
{ 
  TermReference p_980;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail470:
    { 
      IStrategoTerm r_981 = null;
      IStrategoTerm s_981 = null;
      IStrategoTerm u_981 = null;
      IStrategoTerm v_981 = null;
      IStrategoTerm w_981 = null;
      u_981 = term;
      r_981 = transformer_debug.const513;
      v_981 = u_981;
      s_981 = transformer_debug.const516;
      w_981 = v_981;
      term = s_step_0_3.instance.invoke(context, w_981, r_981, s_981, transformer_debug.constLocationInfo916);
      if(term == null)
        break Fail470;
      term = add_s_entry_and_exit_call_0_1.instance.invoke(context, term, p_980.value);
      if(term == null)
        break Fail470;
      if(true)
        return term;
    }
    return null;
  }
}