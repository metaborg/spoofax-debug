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

@SuppressWarnings("all") final class lifted123 extends Strategy 
{ 
  TermReference b_736;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail586:
    { 
      IStrategoTerm y_736 = null;
      IStrategoTerm z_736 = null;
      IStrategoTerm b_737 = null;
      IStrategoTerm c_737 = null;
      IStrategoTerm d_737 = null;
      b_737 = term;
      y_736 = transformer_debug.const284;
      c_737 = b_737;
      z_736 = transformer_debug.const285;
      d_737 = c_737;
      term = s_step_0_3.instance.invoke(context, d_737, y_736, z_736, transformer_debug.constLocationInfo299);
      if(term == null)
        break Fail586;
      lifted124 lifted1240 = new lifted124();
      lifted1240.b_736 = b_736;
      term = try_1_0.instance.invoke(context, term, lifted1240);
      if(term == null)
        break Fail586;
      if(true)
        return term;
    }
    return null;
  }
}