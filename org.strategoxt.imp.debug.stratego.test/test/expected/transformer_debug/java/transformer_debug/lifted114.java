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

@SuppressWarnings("all") final class lifted114 extends Strategy 
{ 
  public static final lifted114 instance = new lifted114();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail600:
    { 
      IStrategoTerm r_649 = null;
      IStrategoTerm s_649 = null;
      IStrategoTerm u_649 = null;
      IStrategoTerm v_649 = null;
      IStrategoTerm w_649 = null;
      u_649 = term;
      r_649 = transformer_debug.const181;
      v_649 = u_649;
      s_649 = transformer_debug.const213;
      w_649 = v_649;
      term = s_step_0_3.instance.invoke(context, w_649, r_649, s_649, transformer_debug.constLocationInfo153);
      if(term == null)
        break Fail600;
      if(term.getTermType() != IStrategoTerm.INT || 47 != ((IStrategoInt)term).intValue())
        break Fail600;
      if(true)
        return term;
    }
    return null;
  }
}