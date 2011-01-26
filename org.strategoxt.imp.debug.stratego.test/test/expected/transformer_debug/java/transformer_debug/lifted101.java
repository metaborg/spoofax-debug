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

@SuppressWarnings("all") final class lifted101 extends Strategy 
{ 
  public static final lifted101 instance = new lifted101();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail619:
    { 
      IStrategoTerm h_404 = null;
      IStrategoTerm i_404 = null;
      IStrategoTerm k_404 = null;
      IStrategoTerm l_404 = null;
      IStrategoTerm m_404 = null;
      k_404 = term;
      h_404 = transformer_debug.const67;
      l_404 = k_404;
      i_404 = transformer_debug.const122;
      m_404 = l_404;
      term = s_step_0_3.instance.invoke(context, m_404, h_404, i_404, transformer_debug.constLocationInfo47);
      if(term == null)
        break Fail619;
      term = transformer_debug.const152;
      if(true)
        return term;
    }
    return null;
  }
}