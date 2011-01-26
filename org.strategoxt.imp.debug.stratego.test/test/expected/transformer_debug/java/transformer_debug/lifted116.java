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

@SuppressWarnings("all") final class lifted116 extends Strategy 
{ 
  public static final lifted116 instance = new lifted116();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail597:
    { 
      IStrategoTerm m_693 = null;
      IStrategoTerm n_693 = null;
      IStrategoTerm p_693 = null;
      IStrategoTerm q_693 = null;
      IStrategoTerm r_693 = null;
      p_693 = term;
      m_693 = transformer_debug.const227;
      q_693 = p_693;
      n_693 = transformer_debug.const228;
      r_693 = q_693;
      term = s_step_0_3.instance.invoke(context, r_693, m_693, n_693, transformer_debug.constLocationInfo168);
      if(term == null)
        break Fail597;
      term = create_arg_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail597;
      if(true)
        return term;
    }
    return null;
  }
}