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

@SuppressWarnings("all") final class lifted149 extends Strategy 
{ 
  TermReference j_982;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail467:
    { 
      IStrategoTerm f_983 = null;
      IStrategoTerm g_983 = null;
      IStrategoTerm i_983 = null;
      IStrategoTerm j_983 = null;
      IStrategoTerm k_983 = null;
      i_983 = term;
      f_983 = transformer_debug.const513;
      j_983 = i_983;
      g_983 = transformer_debug.const517;
      k_983 = j_983;
      term = s_step_0_3.instance.invoke(context, k_983, f_983, g_983, transformer_debug.constLocationInfo922);
      if(term == null)
        break Fail467;
      lifted150 lifted1500 = new lifted150();
      lifted1500.j_982 = j_982;
      term = try_1_0.instance.invoke(context, term, lifted1500);
      if(term == null)
        break Fail467;
      if(true)
        return term;
    }
    return null;
  }
}