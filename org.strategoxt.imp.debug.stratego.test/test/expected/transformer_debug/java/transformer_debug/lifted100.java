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

@SuppressWarnings("all") final class lifted100 extends Strategy 
{ 
  public static final lifted100 instance = new lifted100();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail620:
    { 
      IStrategoTerm n_403 = null;
      IStrategoTerm o_403 = null;
      IStrategoTerm q_403 = null;
      IStrategoTerm r_403 = null;
      IStrategoTerm s_403 = null;
      IStrategoTerm k_393 = null;
      IStrategoTerm v_403 = null;
      IStrategoTerm w_403 = null;
      IStrategoTerm y_403 = null;
      IStrategoTerm z_403 = null;
      IStrategoTerm a_404 = null;
      IStrategoTerm b_404 = null;
      IStrategoTerm c_404 = null;
      IStrategoTerm e_404 = null;
      IStrategoTerm f_404 = null;
      IStrategoTerm g_404 = null;
      q_403 = term;
      n_403 = transformer_debug.const67;
      r_403 = q_403;
      o_403 = transformer_debug.const122;
      s_403 = r_403;
      term = s_step_0_3.instance.invoke(context, s_403, n_403, o_403, transformer_debug.constLocationInfo44);
      if(term == null)
        break Fail620;
      k_393 = term;
      y_403 = term;
      v_403 = transformer_debug.const67;
      z_403 = y_403;
      w_403 = transformer_debug.const122;
      a_404 = z_403;
      term = s_step_0_3.instance.invoke(context, a_404, v_403, w_403, transformer_debug.constLocationInfo45);
      if(term == null)
        break Fail620;
      term = termFactory.makeTuple(transformer_debug.const149, (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)transformer_debug.constNil1));
      e_404 = term;
      b_404 = transformer_debug.const67;
      f_404 = e_404;
      c_404 = transformer_debug.const122;
      g_404 = f_404;
      term = s_step_0_3.instance.invoke(context, g_404, b_404, c_404, transformer_debug.constLocationInfo46);
      if(term == null)
        break Fail620;
      term = extend_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail620;
      term = k_393;
      if(true)
        return term;
    }
    return null;
  }
}