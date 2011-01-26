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

@SuppressWarnings("all") final class lifted135 extends Strategy 
{ 
  TermReference i_1145;

  TermReference s_828;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail568:
    { 
      IStrategoTerm a_831 = null;
      IStrategoTerm e_831 = null;
      IStrategoTerm h_831 = null;
      IStrategoTerm i_831 = null;
      IStrategoTerm m_831 = null;
      h_831 = term;
      a_831 = transformer_debug.const370;
      i_831 = h_831;
      e_831 = transformer_debug.const372;
      m_831 = i_831;
      term = s_step_0_3.instance.invoke(context, m_831, a_831, e_831, transformer_debug.constLocationInfo523);
      if(term == null)
        break Fail568;
      lifted136 lifted1360 = new lifted136();
      lifted1360.i_1145 = i_1145;
      lifted1360.s_828 = s_828;
      term = try_1_0.instance.invoke(context, term, lifted1360);
      if(term == null)
        break Fail568;
      if(true)
        return term;
    }
    return null;
  }
}