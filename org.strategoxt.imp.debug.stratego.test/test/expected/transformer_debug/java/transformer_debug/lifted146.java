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

@SuppressWarnings("all") final class lifted146 extends Strategy 
{ 
  TermReference j_1145;

  TermReference t_832;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail555:
    { 
      IStrategoTerm e_836 = null;
      IStrategoTerm f_836 = null;
      IStrategoTerm h_836 = null;
      IStrategoTerm i_836 = null;
      IStrategoTerm j_836 = null;
      h_836 = term;
      e_836 = transformer_debug.const370;
      i_836 = h_836;
      f_836 = transformer_debug.const375;
      j_836 = i_836;
      term = s_step_0_3.instance.invoke(context, j_836, e_836, f_836, transformer_debug.constLocationInfo577);
      if(term == null)
        break Fail555;
      term = add_step_to_strategy_0_2.instance.invoke(context, term, j_1145.value, t_832.value);
      if(term == null)
        break Fail555;
      if(true)
        return term;
    }
    return null;
  }
}