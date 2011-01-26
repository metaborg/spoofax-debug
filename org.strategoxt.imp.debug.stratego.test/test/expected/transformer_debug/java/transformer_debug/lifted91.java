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

@SuppressWarnings("all") final class lifted91 extends Strategy 
{ 
  public static final lifted91 instance = new lifted91();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail628:
    { 
      IStrategoTerm c_401 = null;
      IStrategoTerm d_401 = null;
      IStrategoTerm f_401 = null;
      IStrategoTerm g_401 = null;
      IStrategoTerm h_401 = null;
      f_401 = term;
      c_401 = transformer_debug.const67;
      g_401 = f_401;
      d_401 = transformer_debug.const122;
      h_401 = g_401;
      term = s_step_0_3.instance.invoke(context, h_401, c_401, d_401, transformer_debug.constLocationInfo35);
      if(term == null)
        break Fail628;
      term = $Option$One$Check_1_0.instance.invoke(context, term, lifted92.instance);
      if(term == null)
        break Fail628;
      if(true)
        return term;
    }
    return null;
  }
}