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

@SuppressWarnings("all") final class lifted147 extends Strategy 
{ 
  TermReference p_980;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail469:
    { 
      IStrategoTerm l_981 = null;
      IStrategoTerm m_981 = null;
      IStrategoTerm o_981 = null;
      IStrategoTerm p_981 = null;
      IStrategoTerm q_981 = null;
      o_981 = term;
      l_981 = transformer_debug.const513;
      p_981 = o_981;
      m_981 = transformer_debug.const516;
      q_981 = p_981;
      term = s_step_0_3.instance.invoke(context, q_981, l_981, m_981, transformer_debug.constLocationInfo917);
      if(term == null)
        break Fail469;
      lifted148 lifted1480 = new lifted148();
      lifted1480.p_980 = p_980;
      term = try_1_0.instance.invoke(context, term, lifted1480);
      if(term == null)
        break Fail469;
      if(true)
        return term;
    }
    return null;
  }
}