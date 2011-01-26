package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted11 extends Strategy 
{ 
  public static final lifted11 instance = new lifted11();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail26:
    { 
      IStrategoTerm i_26 = null;
      IStrategoTerm j_26 = null;
      IStrategoTerm l_26 = null;
      IStrategoTerm m_26 = null;
      IStrategoTerm n_26 = null;
      l_26 = term;
      i_26 = localvardebug.const0;
      m_26 = l_26;
      j_26 = localvardebug.const99;
      n_26 = m_26;
      term = s_step_0_3.instance.invoke(context, n_26, i_26, j_26, localvardebug.constLocationInfo75);
      if(term == null)
        break Fail26;
      term = localvardebug.const111;
      if(true)
        return term;
    }
    return null;
  }
}