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

@SuppressWarnings("all") final class lifted128 extends Strategy 
{ 
  TermReference o_760;

  TermReference p_760;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail581:
    { 
      IStrategoTerm a_763 = null;
      IStrategoTerm b_763 = null;
      IStrategoTerm d_763 = null;
      IStrategoTerm e_763 = null;
      IStrategoTerm f_763 = null;
      d_763 = term;
      a_763 = transformer_debug.const284;
      e_763 = d_763;
      b_763 = transformer_debug.const295;
      f_763 = e_763;
      term = s_step_0_3.instance.invoke(context, f_763, a_763, b_763, transformer_debug.constLocationInfo363);
      if(term == null)
        break Fail581;
      term = match_assign_build_s_var_0_2.instance.invoke(context, term, o_760.value, p_760.value);
      if(term == null)
        break Fail581;
      if(true)
        return term;
    }
    return null;
  }
}