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

@SuppressWarnings("all") final class lifted109 extends Strategy 
{ 
  public static final lifted109 instance = new lifted109();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail610:
    { 
      IStrategoTerm g_626 = null;
      IStrategoTerm h_626 = null;
      IStrategoTerm j_626 = null;
      IStrategoTerm k_626 = null;
      IStrategoTerm l_626 = null;
      j_626 = term;
      g_626 = transformer_debug.const181;
      k_626 = j_626;
      h_626 = transformer_debug.const182;
      l_626 = k_626;
      term = s_step_0_3.instance.invoke(context, l_626, g_626, h_626, transformer_debug.constLocationInfo78);
      if(term == null)
        break Fail610;
      term = system_usage_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail610;
      if(true)
        return term;
    }
    return null;
  }
}