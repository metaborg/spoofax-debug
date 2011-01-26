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

@SuppressWarnings("all") final class lifted132 extends Strategy 
{ 
  TermReference d_817;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail571:
    { 
      IStrategoTerm f_818 = null;
      IStrategoTerm g_818 = null;
      IStrategoTerm i_818 = null;
      IStrategoTerm j_818 = null;
      IStrategoTerm k_818 = null;
      i_818 = term;
      f_818 = transformer_debug.const370;
      j_818 = i_818;
      g_818 = transformer_debug.const371;
      k_818 = j_818;
      term = s_step_0_3.instance.invoke(context, k_818, f_818, g_818, transformer_debug.constLocationInfo512);
      if(term == null)
        break Fail571;
      term = add_step_in_r_def_0_1.instance.invoke(context, term, d_817.value);
      if(term == null)
        break Fail571;
      if(true)
        return term;
    }
    return null;
  }
}