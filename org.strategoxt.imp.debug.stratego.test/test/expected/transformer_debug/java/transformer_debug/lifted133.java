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

@SuppressWarnings("all") final class lifted133 extends Strategy 
{ 
  TermReference d_817;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail572:
    { 
      IStrategoTerm r_818 = null;
      IStrategoTerm s_818 = null;
      IStrategoTerm u_818 = null;
      IStrategoTerm v_818 = null;
      IStrategoTerm w_818 = null;
      u_818 = term;
      r_818 = transformer_debug.const370;
      v_818 = u_818;
      s_818 = transformer_debug.const371;
      w_818 = v_818;
      term = s_step_0_3.instance.invoke(context, w_818, r_818, s_818, transformer_debug.constLocationInfo509);
      if(term == null)
        break Fail572;
      lifted134 lifted1340 = new lifted134();
      lifted1340.d_817 = d_817;
      term = try_1_0.instance.invoke(context, term, lifted1340);
      if(term == null)
        break Fail572;
      if(true)
        return term;
    }
    return null;
  }
}