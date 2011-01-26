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

@SuppressWarnings("all") final class lifted88 extends Strategy 
{ 
  public static final lifted88 instance = new lifted88();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail632:
    { 
      IStrategoTerm n_395 = null;
      IStrategoTerm o_395 = null;
      IStrategoTerm q_395 = null;
      IStrategoTerm r_395 = null;
      IStrategoTerm s_395 = null;
      IStrategoTerm t_395 = null;
      IStrategoTerm w_395 = null;
      IStrategoTerm f_400 = null;
      IStrategoTerm g_400 = null;
      IStrategoTerm h_400 = null;
      q_395 = term;
      n_395 = transformer_debug.const67;
      r_395 = q_395;
      o_395 = transformer_debug.const122;
      s_395 = r_395;
      term = s_step_0_3.instance.invoke(context, s_395, n_395, o_395, transformer_debug.constLocationInfo30);
      if(term == null)
        break Fail632;
      term = termFactory.makeTuple(transformer_debug.const91, term);
      f_400 = term;
      t_395 = transformer_debug.const67;
      g_400 = f_400;
      w_395 = transformer_debug.const122;
      h_400 = g_400;
      term = s_step_0_3.instance.invoke(context, h_400, t_395, w_395, transformer_debug.constLocationInfo31);
      if(term == null)
        break Fail632;
      term = set_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail632;
      if(true)
        return term;
    }
    return null;
  }
}