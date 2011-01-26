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

@SuppressWarnings("all") final class lifted120 extends Strategy 
{ 
  TermReference n_708;

  TermReference o_708;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail593:
    { 
      IStrategoTerm n_710 = null;
      IStrategoTerm o_710 = null;
      IStrategoTerm q_710 = null;
      IStrategoTerm r_710 = null;
      IStrategoTerm s_710 = null;
      q_710 = term;
      n_710 = transformer_debug.const236;
      r_710 = q_710;
      o_710 = transformer_debug.const249;
      s_710 = r_710;
      term = s_step_0_3.instance.invoke(context, s_710, n_710, o_710, transformer_debug.constLocationInfo221);
      if(term == null)
        break Fail593;
      term = t_arg_to_s_var_0_2.instance.invoke(context, term, n_708.value, o_708.value);
      if(term == null)
        break Fail593;
      if(true)
        return term;
    }
    return null;
  }
}