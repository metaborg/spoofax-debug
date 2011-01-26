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

@SuppressWarnings("all") final class lifted118 extends Strategy 
{ 
  TermReference u_698;

  TermReference v_698;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail595:
    { 
      IStrategoTerm z_701 = null;
      IStrategoTerm a_702 = null;
      IStrategoTerm c_702 = null;
      IStrategoTerm d_702 = null;
      IStrategoTerm e_702 = null;
      c_702 = term;
      z_701 = transformer_debug.const236;
      d_702 = c_702;
      a_702 = transformer_debug.const243;
      e_702 = d_702;
      term = s_step_0_3.instance.invoke(context, e_702, z_701, a_702, transformer_debug.constLocationInfo193);
      if(term == null)
        break Fail595;
      term = create_s_var_call_with_term_0_2.instance.invoke(context, term, u_698.value, v_698.value);
      if(term == null)
        break Fail595;
      if(true)
        return term;
    }
    return null;
  }
}