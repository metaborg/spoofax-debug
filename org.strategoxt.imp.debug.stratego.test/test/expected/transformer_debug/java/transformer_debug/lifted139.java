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

@SuppressWarnings("all") final class lifted139 extends Strategy 
{ 
  TermReference i_1145;

  TermReference v_819;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail564:
    { 
      IStrategoTerm f_823 = null;
      IStrategoTerm g_823 = null;
      IStrategoTerm i_823 = null;
      IStrategoTerm j_823 = null;
      IStrategoTerm k_823 = null;
      i_823 = term;
      f_823 = transformer_debug.const370;
      j_823 = i_823;
      g_823 = transformer_debug.const372;
      k_823 = j_823;
      term = s_step_0_3.instance.invoke(context, k_823, f_823, g_823, transformer_debug.constLocationInfo546);
      if(term == null)
        break Fail564;
      lifted140 lifted1400 = new lifted140();
      lifted1400.i_1145 = i_1145;
      lifted1400.v_819 = v_819;
      term = try_1_0.instance.invoke(context, term, lifted1400);
      if(term == null)
        break Fail564;
      if(true)
        return term;
    }
    return null;
  }
}