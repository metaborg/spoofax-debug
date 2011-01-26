package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted4 extends Strategy 
{ 
  TermReference j_16;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27:
    { 
      IStrategoTerm z_17 = null;
      IStrategoTerm a_18 = null;
      IStrategoTerm c_18 = null;
      IStrategoTerm d_18 = null;
      IStrategoTerm e_18 = null;
      c_18 = term;
      z_17 = testimports.const24;
      d_18 = c_18;
      a_18 = testimports.const61;
      e_18 = d_18;
      term = s_step_0_3.instance.invoke(context, e_18, z_17, a_18, testimports.constLocationInfo46);
      if(term == null)
        break Fail27;
      term = try_find_comment_by_name_0_1.instance.invoke(context, term, j_16.value);
      if(term == null)
        break Fail27;
      if(true)
        return term;
    }
    return null;
  }
}