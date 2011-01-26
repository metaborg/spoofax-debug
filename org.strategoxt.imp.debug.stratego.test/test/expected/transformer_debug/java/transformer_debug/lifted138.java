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

@SuppressWarnings("all") final class lifted138 extends Strategy 
{ 
  TermReference i_1145;

  TermReference m_824;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail567:
    { 
      IStrategoTerm s_827 = null;
      IStrategoTerm t_827 = null;
      IStrategoTerm v_827 = null;
      IStrategoTerm w_827 = null;
      IStrategoTerm x_827 = null;
      v_827 = term;
      s_827 = transformer_debug.const370;
      w_827 = v_827;
      t_827 = transformer_debug.const372;
      x_827 = w_827;
      term = s_step_0_3.instance.invoke(context, x_827, s_827, t_827, transformer_debug.constLocationInfo533);
      if(term == null)
        break Fail567;
      term = add_step_to_strategy_0_2.instance.invoke(context, term, i_1145.value, m_824.value);
      if(term == null)
        break Fail567;
      if(true)
        return term;
    }
    return null;
  }
}