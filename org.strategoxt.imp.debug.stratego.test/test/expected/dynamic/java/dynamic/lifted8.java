package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted8 extends Strategy 
{ 
  public static final lifted8 instance = new lifted8();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail27:
    { 
      IStrategoTerm h_31 = null;
      IStrategoTerm i_31 = null;
      IStrategoTerm k_31 = null;
      IStrategoTerm l_31 = null;
      IStrategoTerm m_31 = null;
      k_31 = term;
      h_31 = dynamic.const0;
      l_31 = k_31;
      i_31 = dynamic.const115;
      m_31 = l_31;
      term = s_step_0_3.instance.invoke(context, m_31, h_31, i_31, dynamic.constLocationInfo77);
      if(term == null)
        break Fail27;
      term = dynamic.const119;
      if(true)
        return term;
    }
    return null;
  }
}