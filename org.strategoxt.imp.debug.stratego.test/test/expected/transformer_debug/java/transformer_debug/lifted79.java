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

@SuppressWarnings("all") final class lifted79 extends Strategy 
{ 
  public static final lifted79 instance = new lifted79();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail644:
    { 
      IStrategoTerm w_385 = null;
      IStrategoTerm x_385 = null;
      IStrategoTerm z_385 = null;
      IStrategoTerm a_386 = null;
      IStrategoTerm b_386 = null;
      z_385 = term;
      w_385 = transformer_debug.const67;
      a_386 = z_385;
      x_385 = transformer_debug.const68;
      b_386 = a_386;
      term = s_step_0_3.instance.invoke(context, b_386, w_385, x_385, transformer_debug.constLocationInfo1);
      if(term == null)
        break Fail644;
      term = create_options_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail644;
      if(true)
        return term;
    }
    return null;
  }
}