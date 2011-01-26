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

@SuppressWarnings("all") final class lifted144 extends Strategy 
{ 
  TermReference j_1145;

  TermReference h_837;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail557:
    { 
      IStrategoTerm k_840 = null;
      IStrategoTerm l_840 = null;
      IStrategoTerm n_840 = null;
      IStrategoTerm o_840 = null;
      IStrategoTerm p_840 = null;
      n_840 = term;
      k_840 = transformer_debug.const370;
      o_840 = n_840;
      l_840 = transformer_debug.const375;
      p_840 = o_840;
      term = s_step_0_3.instance.invoke(context, p_840, k_840, l_840, transformer_debug.constLocationInfo565);
      if(term == null)
        break Fail557;
      term = add_step_to_strategy_0_2.instance.invoke(context, term, j_1145.value, h_837.value);
      if(term == null)
        break Fail557;
      if(true)
        return term;
    }
    return null;
  }
}