package localvar_rtree;

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
    Fail69:
    { 
      IStrategoTerm m_121 = null;
      IStrategoTerm n_121 = null;
      IStrategoTerm p_121 = null;
      IStrategoTerm r_121 = null;
      IStrategoTerm s_121 = null;
      p_121 = term;
      m_121 = localvar_rtree.const125;
      r_121 = p_121;
      n_121 = localvar_rtree.const126;
      s_121 = r_121;
      term = s_step_0_3.instance.invoke(context, s_121, m_121, n_121, localvar_rtree.constLocationInfo84);
      if(term == null)
        break Fail69;
      term = execute_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail69;
      if(true)
        return term;
    }
    return null;
  }
}