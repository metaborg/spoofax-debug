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

@SuppressWarnings("all") final class lifted111 extends Strategy 
{ 
  public static final lifted111 instance = new lifted111();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail605:
    { 
      IStrategoTerm s_631 = null;
      IStrategoTerm v_631 = null;
      IStrategoTerm y_631 = null;
      IStrategoTerm z_631 = null;
      IStrategoTerm d_632 = null;
      y_631 = term;
      s_631 = transformer_debug.const181;
      z_631 = y_631;
      v_631 = transformer_debug.const192;
      d_632 = z_631;
      term = s_step_0_3.instance.invoke(context, d_632, s_631, v_631, transformer_debug.constLocationInfo97);
      if(term == null)
        break Fail605;
      term = create_$I_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail605;
      if(true)
        return term;
    }
    return null;
  }
}