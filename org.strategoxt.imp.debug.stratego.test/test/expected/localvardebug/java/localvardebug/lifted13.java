package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted13 extends Strategy 
{ 
  public static final lifted13 instance = new lifted13();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25:
    { 
      IStrategoTerm h_31 = null;
      IStrategoTerm i_31 = null;
      IStrategoTerm k_31 = null;
      IStrategoTerm l_31 = null;
      IStrategoTerm m_31 = null;
      k_31 = term;
      h_31 = localvardebug.const0;
      l_31 = k_31;
      i_31 = localvardebug.const114;
      m_31 = l_31;
      term = s_step_0_3.instance.invoke(context, m_31, h_31, i_31, localvardebug.constLocationInfo79);
      if(term == null)
        break Fail25;
      term = localvardebug.const117;
      if(true)
        return term;
    }
    return null;
  }
}