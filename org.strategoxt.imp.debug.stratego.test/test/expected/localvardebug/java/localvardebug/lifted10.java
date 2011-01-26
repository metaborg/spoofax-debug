package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted10 extends Strategy 
{ 
  public static final lifted10 instance = new lifted10();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27:
    { 
      IStrategoTerm h_25 = null;
      IStrategoTerm i_25 = null;
      IStrategoTerm k_25 = null;
      IStrategoTerm l_25 = null;
      IStrategoTerm m_25 = null;
      k_25 = term;
      h_25 = localvardebug.const0;
      l_25 = k_25;
      i_25 = localvardebug.const99;
      m_25 = l_25;
      term = s_step_0_3.instance.invoke(context, m_25, h_25, i_25, localvardebug.constLocationInfo71);
      if(term == null)
        break Fail27;
      term = localvardebug.const108;
      if(true)
        return term;
    }
    return null;
  }
}