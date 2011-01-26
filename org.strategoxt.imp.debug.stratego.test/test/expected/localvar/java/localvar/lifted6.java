package localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted6 extends Strategy 
{ 
  public static final lifted6 instance = new lifted6();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail25:
    { 
      IStrategoTerm l_27 = null;
      IStrategoTerm m_27 = null;
      IStrategoTerm o_27 = null;
      IStrategoTerm p_27 = null;
      IStrategoTerm q_27 = null;
      o_27 = term;
      l_27 = localvar.const0;
      p_27 = o_27;
      m_27 = localvar.const100;
      q_27 = p_27;
      term = s_step_0_3.instance.invoke(context, q_27, l_27, m_27, localvar.constLocationInfo68);
      if(term == null)
        break Fail25;
      term = localvar.const104;
      if(true)
        return term;
    }
    return null;
  }
}