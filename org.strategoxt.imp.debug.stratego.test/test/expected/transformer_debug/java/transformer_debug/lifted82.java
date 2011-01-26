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

@SuppressWarnings("all") final class lifted82 extends Strategy 
{ 
  public static final lifted82 instance = new lifted82();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail641:
    { 
      IStrategoTerm o_386 = null;
      IStrategoTerm p_386 = null;
      IStrategoTerm r_386 = null;
      IStrategoTerm s_386 = null;
      IStrategoTerm t_386 = null;
      r_386 = term;
      o_386 = transformer_debug.const67;
      s_386 = r_386;
      p_386 = transformer_debug.const68;
      t_386 = s_386;
      term = s_step_0_3.instance.invoke(context, t_386, o_386, p_386, transformer_debug.constLocationInfo4);
      if(term == null)
        break Fail641;
      term = execute_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail641;
      if(true)
        return term;
    }
    return null;
  }
}