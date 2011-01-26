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

@SuppressWarnings("all") final class lifted110 extends Strategy 
{ 
  public static final lifted110 instance = new lifted110();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail609:
    { 
      IStrategoTerm m_626 = null;
      IStrategoTerm n_626 = null;
      IStrategoTerm p_626 = null;
      IStrategoTerm q_626 = null;
      IStrategoTerm r_626 = null;
      p_626 = term;
      m_626 = transformer_debug.const181;
      q_626 = p_626;
      n_626 = transformer_debug.const182;
      r_626 = q_626;
      term = s_step_0_3.instance.invoke(context, r_626, m_626, n_626, transformer_debug.constLocationInfo79);
      if(term == null)
        break Fail609;
      if(true)
        return term;
    }
    return null;
  }
}