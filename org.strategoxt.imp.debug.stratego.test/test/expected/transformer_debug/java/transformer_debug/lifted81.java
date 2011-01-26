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

@SuppressWarnings("all") final class lifted81 extends Strategy 
{ 
  public static final lifted81 instance = new lifted81();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail642:
    { 
      IStrategoTerm i_386 = null;
      IStrategoTerm j_386 = null;
      IStrategoTerm l_386 = null;
      IStrategoTerm m_386 = null;
      IStrategoTerm n_386 = null;
      l_386 = term;
      i_386 = transformer_debug.const67;
      m_386 = l_386;
      j_386 = transformer_debug.const68;
      n_386 = m_386;
      term = s_step_0_3.instance.invoke(context, n_386, i_386, j_386, transformer_debug.constLocationInfo3);
      if(term == null)
        break Fail642;
      term = default_system_about_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail642;
      if(true)
        return term;
    }
    return null;
  }
}