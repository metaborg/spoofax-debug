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

@SuppressWarnings("all") final class lifted127 extends Strategy 
{ 
  TermReference o_760;

  TermReference p_760;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail580:
    { 
      IStrategoTerm u_762 = null;
      IStrategoTerm v_762 = null;
      IStrategoTerm x_762 = null;
      IStrategoTerm y_762 = null;
      IStrategoTerm z_762 = null;
      x_762 = term;
      u_762 = transformer_debug.const284;
      y_762 = x_762;
      v_762 = transformer_debug.const295;
      z_762 = y_762;
      term = s_step_0_3.instance.invoke(context, z_762, u_762, v_762, transformer_debug.constLocationInfo364);
      if(term == null)
        break Fail580;
      lifted128 lifted1280 = new lifted128();
      lifted1280.o_760 = o_760;
      lifted1280.p_760 = p_760;
      term = try_1_0.instance.invoke(context, term, lifted1280);
      if(term == null)
        break Fail580;
      if(true)
        return term;
    }
    return null;
  }
}