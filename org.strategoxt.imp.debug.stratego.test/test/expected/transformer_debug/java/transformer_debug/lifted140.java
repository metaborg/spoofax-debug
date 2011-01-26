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

@SuppressWarnings("all") final class lifted140 extends Strategy 
{ 
  TermReference i_1145;

  TermReference v_819;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail565:
    { 
      IStrategoTerm l_823 = null;
      IStrategoTerm m_823 = null;
      IStrategoTerm o_823 = null;
      IStrategoTerm p_823 = null;
      IStrategoTerm q_823 = null;
      o_823 = term;
      l_823 = transformer_debug.const370;
      p_823 = o_823;
      m_823 = transformer_debug.const372;
      q_823 = p_823;
      term = s_step_0_3.instance.invoke(context, q_823, l_823, m_823, transformer_debug.constLocationInfo545);
      if(term == null)
        break Fail565;
      term = add_step_to_strategy_0_2.instance.invoke(context, term, i_1145.value, v_819.value);
      if(term == null)
        break Fail565;
      if(true)
        return term;
    }
    return null;
  }
}