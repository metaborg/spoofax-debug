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

@SuppressWarnings("all") final class lifted154 extends Strategy 
{ 
  public static final lifted154 instance = new lifted154();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail448:
    { 
      IStrategoTerm l_1109 = null;
      IStrategoTerm m_1109 = null;
      IStrategoTerm o_1109 = null;
      IStrategoTerm p_1109 = null;
      IStrategoTerm q_1109 = null;
      o_1109 = term;
      l_1109 = transformer_debug.const618;
      p_1109 = o_1109;
      m_1109 = transformer_debug.const624;
      q_1109 = p_1109;
      term = s_step_0_3.instance.invoke(context, q_1109, l_1109, m_1109, transformer_debug.constLocationInfo1187);
      if(term == null)
        break Fail448;
      term = transformer_debug.const626;
      if(true)
        return term;
    }
    return null;
  }
}