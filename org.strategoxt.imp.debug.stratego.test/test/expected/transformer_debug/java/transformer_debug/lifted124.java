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

@SuppressWarnings("all") final class lifted124 extends Strategy 
{ 
  TermReference b_736;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail587:
    { 
      IStrategoTerm e_737 = null;
      IStrategoTerm f_737 = null;
      IStrategoTerm h_737 = null;
      IStrategoTerm i_737 = null;
      IStrategoTerm j_737 = null;
      h_737 = term;
      e_737 = transformer_debug.const284;
      i_737 = h_737;
      f_737 = transformer_debug.const285;
      j_737 = i_737;
      term = s_step_0_3.instance.invoke(context, j_737, e_737, f_737, transformer_debug.constLocationInfo298);
      if(term == null)
        break Fail587;
      term = add_var_in_r_def_0_1.instance.invoke(context, term, b_736.value);
      if(term == null)
        break Fail587;
      if(true)
        return term;
    }
    return null;
  }
}