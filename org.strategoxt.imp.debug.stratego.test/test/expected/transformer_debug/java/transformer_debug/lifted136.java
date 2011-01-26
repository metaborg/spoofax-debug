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

@SuppressWarnings("all") final class lifted136 extends Strategy 
{ 
  TermReference i_1145;

  TermReference s_828;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail569:
    { 
      IStrategoTerm n_831 = null;
      IStrategoTerm p_831 = null;
      IStrategoTerm r_831 = null;
      IStrategoTerm s_831 = null;
      IStrategoTerm t_831 = null;
      r_831 = term;
      n_831 = transformer_debug.const370;
      s_831 = r_831;
      p_831 = transformer_debug.const372;
      t_831 = s_831;
      term = s_step_0_3.instance.invoke(context, t_831, n_831, p_831, transformer_debug.constLocationInfo522);
      if(term == null)
        break Fail569;
      term = add_step_to_strategy_0_2.instance.invoke(context, term, i_1145.value, s_828.value);
      if(term == null)
        break Fail569;
      if(true)
        return term;
    }
    return null;
  }
}