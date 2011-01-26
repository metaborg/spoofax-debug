package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted5 extends Strategy 
{ 
  public static final lifted5 instance = new lifted5();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail32:
    { 
      IStrategoTerm q_24 = null;
      IStrategoTerm r_24 = null;
      IStrategoTerm t_24 = null;
      IStrategoTerm u_24 = null;
      IStrategoTerm v_24 = null;
      t_24 = term;
      q_24 = dynamic.const0;
      u_24 = t_24;
      r_24 = dynamic.const91;
      v_24 = u_24;
      term = s_step_0_3.instance.invoke(context, v_24, q_24, r_24, dynamic.constLocationInfo60);
      if(term == null)
        break Fail32;
      term = dynamic.const99;
      if(true)
        return term;
    }
    return null;
  }
}