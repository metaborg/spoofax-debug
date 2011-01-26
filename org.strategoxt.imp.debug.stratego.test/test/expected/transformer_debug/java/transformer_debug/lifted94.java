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

@SuppressWarnings("all") final class lifted94 extends Strategy 
{ 
  public static final lifted94 instance = new lifted94();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail626:
    { 
      IStrategoTerm s_401 = null;
      IStrategoTerm t_401 = null;
      IStrategoTerm v_401 = null;
      IStrategoTerm w_401 = null;
      IStrategoTerm x_401 = null;
      IStrategoTerm y_401 = null;
      IStrategoTerm z_401 = null;
      IStrategoTerm b_402 = null;
      IStrategoTerm c_402 = null;
      IStrategoTerm d_402 = null;
      v_401 = term;
      s_401 = transformer_debug.const67;
      w_401 = v_401;
      t_401 = transformer_debug.const122;
      x_401 = w_401;
      term = s_step_0_3.instance.invoke(context, x_401, s_401, t_401, transformer_debug.constLocationInfo37);
      if(term == null)
        break Fail626;
      term = termFactory.makeTuple(transformer_debug.const96, term);
      b_402 = term;
      y_401 = transformer_debug.const67;
      c_402 = b_402;
      z_401 = transformer_debug.const122;
      d_402 = c_402;
      term = s_step_0_3.instance.invoke(context, d_402, y_401, z_401, transformer_debug.constLocationInfo38);
      if(term == null)
        break Fail626;
      term = set_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail626;
      if(true)
        return term;
    }
    return null;
  }
}