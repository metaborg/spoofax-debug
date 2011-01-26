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

@SuppressWarnings("all") final class lifted80 extends Strategy 
{ 
  public static final lifted80 instance = new lifted80();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail643:
    { 
      IStrategoTerm c_386 = null;
      IStrategoTerm d_386 = null;
      IStrategoTerm f_386 = null;
      IStrategoTerm g_386 = null;
      IStrategoTerm h_386 = null;
      f_386 = term;
      c_386 = transformer_debug.const67;
      g_386 = f_386;
      d_386 = transformer_debug.const68;
      h_386 = g_386;
      term = s_step_0_3.instance.invoke(context, h_386, c_386, d_386, transformer_debug.constLocationInfo2);
      if(term == null)
        break Fail643;
      term = create_usage_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail643;
      if(true)
        return term;
    }
    return null;
  }
}