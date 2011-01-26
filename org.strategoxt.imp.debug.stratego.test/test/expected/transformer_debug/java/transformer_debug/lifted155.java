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

@SuppressWarnings("all") final class lifted155 extends Strategy 
{ 
  public static final lifted155 instance = new lifted155();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail447:
    { 
      IStrategoTerm l_1115 = null;
      IStrategoTerm m_1115 = null;
      IStrategoTerm o_1115 = null;
      IStrategoTerm p_1115 = null;
      IStrategoTerm q_1115 = null;
      o_1115 = term;
      l_1115 = transformer_debug.const618;
      p_1115 = o_1115;
      m_1115 = transformer_debug.const629;
      q_1115 = p_1115;
      term = s_step_0_3.instance.invoke(context, q_1115, l_1115, m_1115, transformer_debug.constLocationInfo1202);
      if(term == null)
        break Fail447;
      term = is_relpath_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail447;
      if(true)
        return term;
    }
    return null;
  }
}