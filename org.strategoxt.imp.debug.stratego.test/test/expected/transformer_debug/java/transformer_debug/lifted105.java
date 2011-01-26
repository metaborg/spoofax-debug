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

@SuppressWarnings("all") final class lifted105 extends Strategy 
{ 
  public static final lifted105 instance = new lifted105();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail615:
    { 
      IStrategoTerm i_407 = null;
      IStrategoTerm j_407 = null;
      IStrategoTerm l_407 = null;
      IStrategoTerm m_407 = null;
      IStrategoTerm n_407 = null;
      l_407 = term;
      i_407 = transformer_debug.const67;
      m_407 = l_407;
      j_407 = transformer_debug.const163;
      n_407 = m_407;
      term = s_step_0_3.instance.invoke(context, n_407, i_407, j_407, transformer_debug.constLocationInfo61);
      if(term == null)
        break Fail615;
      term = transformer_debug.const171;
      if(true)
        return term;
    }
    return null;
  }
}