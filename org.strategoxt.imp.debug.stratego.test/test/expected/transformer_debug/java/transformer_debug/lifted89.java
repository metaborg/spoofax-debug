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

@SuppressWarnings("all") final class lifted89 extends Strategy 
{ 
  public static final lifted89 instance = new lifted89();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail631:
    { 
      IStrategoTerm i_400 = null;
      IStrategoTerm j_400 = null;
      IStrategoTerm l_400 = null;
      IStrategoTerm m_400 = null;
      IStrategoTerm n_400 = null;
      l_400 = term;
      i_400 = transformer_debug.const67;
      m_400 = l_400;
      j_400 = transformer_debug.const122;
      n_400 = m_400;
      term = s_step_0_3.instance.invoke(context, n_400, i_400, j_400, transformer_debug.constLocationInfo32);
      if(term == null)
        break Fail631;
      term = transformer_debug.const130;
      if(true)
        return term;
    }
    return null;
  }
}