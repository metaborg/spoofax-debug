package dynamic;

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
  public static final lifted4 instance = new lifted4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail33:
    { 
      IStrategoTerm h_23 = null;
      IStrategoTerm i_23 = null;
      IStrategoTerm k_23 = null;
      IStrategoTerm l_23 = null;
      IStrategoTerm m_23 = null;
      k_23 = term;
      h_23 = dynamic.const0;
      l_23 = k_23;
      i_23 = dynamic.const91;
      m_23 = l_23;
      term = s_step_0_3.instance.invoke(context, m_23, h_23, i_23, dynamic.constLocationInfo56);
      if(term == null)
        break Fail33;
      term = dynamic.const95;
      if(true)
        return term;
    }
    return null;
  }
}