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

@SuppressWarnings("all") final class lifted150 extends Strategy 
{ 
  TermReference j_982;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail468:
    { 
      IStrategoTerm l_983 = null;
      IStrategoTerm m_983 = null;
      IStrategoTerm o_983 = null;
      IStrategoTerm p_983 = null;
      IStrategoTerm q_983 = null;
      o_983 = term;
      l_983 = transformer_debug.const513;
      p_983 = o_983;
      m_983 = transformer_debug.const517;
      q_983 = p_983;
      term = s_step_0_3.instance.invoke(context, q_983, l_983, m_983, transformer_debug.constLocationInfo921);
      if(term == null)
        break Fail468;
      term = add_r_entry_and_exit_call_0_1.instance.invoke(context, term, j_982.value);
      if(term == null)
        break Fail468;
      if(true)
        return term;
    }
    return null;
  }
}