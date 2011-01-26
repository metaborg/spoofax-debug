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

@SuppressWarnings("all") final class lifted125 extends Strategy 
{ 
  TermReference b_736;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail588:
    { 
      IStrategoTerm q_737 = null;
      IStrategoTerm r_737 = null;
      IStrategoTerm t_737 = null;
      IStrategoTerm u_737 = null;
      IStrategoTerm v_737 = null;
      t_737 = term;
      q_737 = transformer_debug.const284;
      u_737 = t_737;
      r_737 = transformer_debug.const285;
      v_737 = u_737;
      term = s_step_0_3.instance.invoke(context, v_737, q_737, r_737, transformer_debug.constLocationInfo295);
      if(term == null)
        break Fail588;
      lifted126 lifted1260 = new lifted126();
      lifted1260.b_736 = b_736;
      term = try_1_0.instance.invoke(context, term, lifted1260);
      if(term == null)
        break Fail588;
      if(true)
        return term;
    }
    return null;
  }
}