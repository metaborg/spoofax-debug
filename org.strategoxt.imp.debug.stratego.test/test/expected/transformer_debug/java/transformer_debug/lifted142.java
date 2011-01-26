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

@SuppressWarnings("all") final class lifted142 extends Strategy 
{ 
  TermReference j_1145;

  TermReference m_841;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail559:
    { 
      IStrategoTerm h_844 = null;
      IStrategoTerm i_844 = null;
      IStrategoTerm k_844 = null;
      IStrategoTerm l_844 = null;
      IStrategoTerm n_844 = null;
      k_844 = term;
      h_844 = transformer_debug.const370;
      l_844 = k_844;
      i_844 = transformer_debug.const375;
      n_844 = l_844;
      term = s_step_0_3.instance.invoke(context, n_844, h_844, i_844, transformer_debug.constLocationInfo555);
      if(term == null)
        break Fail559;
      term = add_step_to_strategy_0_2.instance.invoke(context, term, j_1145.value, m_841.value);
      if(term == null)
        break Fail559;
      if(true)
        return term;
    }
    return null;
  }
}