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

@SuppressWarnings("all") final class lifted122 extends Strategy 
{ 
  public static final lifted122 instance = new lifted122();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail591:
    { 
      IStrategoTerm b_734 = null;
      IStrategoTerm c_734 = null;
      IStrategoTerm e_734 = null;
      IStrategoTerm f_734 = null;
      IStrategoTerm g_734 = null;
      e_734 = term;
      b_734 = transformer_debug.const236;
      f_734 = e_734;
      c_734 = transformer_debug.const260;
      g_734 = f_734;
      term = s_step_0_3.instance.invoke(context, g_734, b_734, c_734, transformer_debug.constLocationInfo277);
      if(term == null)
        break Fail591;
      term = create_seq_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail591;
      if(true)
        return term;
    }
    return null;
  }
}