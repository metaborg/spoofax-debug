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

@SuppressWarnings("all") final class lifted90 extends Strategy 
{ 
  public static final lifted90 instance = new lifted90();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail630:
    { 
      IStrategoTerm w_400 = null;
      IStrategoTerm x_400 = null;
      IStrategoTerm z_400 = null;
      IStrategoTerm a_401 = null;
      IStrategoTerm b_401 = null;
      z_400 = transformer_debug.const132;
      w_400 = transformer_debug.const67;
      a_401 = z_400;
      x_400 = transformer_debug.const122;
      b_401 = a_401;
      term = s_step_0_3.instance.invoke(context, b_401, w_400, x_400, transformer_debug.constLocationInfo34);
      if(term == null)
        break Fail630;
      term = set_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail630;
      if(true)
        return term;
    }
    return null;
  }
}