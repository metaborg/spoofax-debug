package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted12 extends Strategy 
{ 
  public static final lifted12 instance = new lifted12();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail24:
    { 
      IStrategoTerm d_30 = null;
      IStrategoTerm e_30 = null;
      IStrategoTerm g_30 = null;
      IStrategoTerm h_30 = null;
      IStrategoTerm i_30 = null;
      g_30 = term;
      d_30 = localvardebug.const0;
      h_30 = g_30;
      e_30 = localvardebug.const114;
      i_30 = h_30;
      term = s_step_0_3.instance.invoke(context, i_30, d_30, e_30, localvardebug.constLocationInfo81);
      if(term == null)
        break Fail24;
      term = localvardebug.const119;
      if(true)
        return term;
    }
    return null;
  }
}