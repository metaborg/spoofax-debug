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

@SuppressWarnings("all") final class lifted156 extends Strategy 
{ 
  public static final lifted156 instance = new lifted156();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail446:
    { 
      IStrategoTerm l_1116 = null;
      IStrategoTerm m_1116 = null;
      IStrategoTerm o_1116 = null;
      IStrategoTerm p_1116 = null;
      IStrategoTerm q_1116 = null;
      o_1116 = term;
      l_1116 = transformer_debug.const618;
      p_1116 = o_1116;
      m_1116 = transformer_debug.const629;
      q_1116 = p_1116;
      term = s_step_0_3.instance.invoke(context, q_1116, l_1116, m_1116, transformer_debug.constLocationInfo1206);
      if(term == null)
        break Fail446;
      term = is_abspath_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail446;
      if(true)
        return term;
    }
    return null;
  }
}