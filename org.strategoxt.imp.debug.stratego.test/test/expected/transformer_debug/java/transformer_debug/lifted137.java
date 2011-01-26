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

@SuppressWarnings("all") final class lifted137 extends Strategy 
{ 
  TermReference i_1145;

  TermReference m_824;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail566:
    { 
      IStrategoTerm l_827 = null;
      IStrategoTerm m_827 = null;
      IStrategoTerm o_827 = null;
      IStrategoTerm q_827 = null;
      IStrategoTerm r_827 = null;
      o_827 = term;
      l_827 = transformer_debug.const370;
      q_827 = o_827;
      m_827 = transformer_debug.const372;
      r_827 = q_827;
      term = s_step_0_3.instance.invoke(context, r_827, l_827, m_827, transformer_debug.constLocationInfo534);
      if(term == null)
        break Fail566;
      lifted138 lifted1380 = new lifted138();
      lifted1380.i_1145 = i_1145;
      lifted1380.m_824 = m_824;
      term = try_1_0.instance.invoke(context, term, lifted1380);
      if(term == null)
        break Fail566;
      if(true)
        return term;
    }
    return null;
  }
}