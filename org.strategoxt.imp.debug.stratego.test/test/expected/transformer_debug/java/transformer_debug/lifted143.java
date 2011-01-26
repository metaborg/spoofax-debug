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

@SuppressWarnings("all") final class lifted143 extends Strategy 
{ 
  TermReference j_1145;

  TermReference h_837;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail556:
    { 
      IStrategoTerm d_840 = null;
      IStrategoTerm e_840 = null;
      IStrategoTerm g_840 = null;
      IStrategoTerm h_840 = null;
      IStrategoTerm i_840 = null;
      g_840 = term;
      d_840 = transformer_debug.const370;
      h_840 = g_840;
      e_840 = transformer_debug.const375;
      i_840 = h_840;
      term = s_step_0_3.instance.invoke(context, i_840, d_840, e_840, transformer_debug.constLocationInfo566);
      if(term == null)
        break Fail556;
      lifted144 lifted1440 = new lifted144();
      lifted1440.j_1145 = j_1145;
      lifted1440.h_837 = h_837;
      term = try_1_0.instance.invoke(context, term, lifted1440);
      if(term == null)
        break Fail556;
      if(true)
        return term;
    }
    return null;
  }
}