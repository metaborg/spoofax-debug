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

@SuppressWarnings("all") final class lifted153 extends Strategy 
{ 
  TermReference k_1066;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail449:
    { 
      IStrategoTerm d_1068 = null;
      IStrategoTerm e_1068 = null;
      IStrategoTerm g_1068 = null;
      IStrategoTerm h_1068 = null;
      IStrategoTerm i_1068 = null;
      IStrategoTerm j_1068 = null;
      IStrategoTerm k_1068 = null;
      IStrategoTerm m_1068 = null;
      IStrategoTerm n_1068 = null;
      IStrategoTerm o_1068 = null;
      g_1068 = term;
      d_1068 = transformer_debug.const571;
      h_1068 = g_1068;
      e_1068 = transformer_debug.const589;
      i_1068 = h_1068;
      term = s_step_0_3.instance.invoke(context, i_1068, d_1068, e_1068, transformer_debug.constLocationInfo1134);
      if(term == null)
        break Fail449;
      if(k_1066.value == null)
        break Fail449;
      m_1068 = k_1066.value;
      j_1068 = transformer_debug.const571;
      n_1068 = m_1068;
      k_1068 = transformer_debug.const589;
      o_1068 = n_1068;
      term = s_step_0_3.instance.invoke(context, o_1068, j_1068, k_1068, transformer_debug.constLocationInfo1135);
      if(term == null)
        break Fail449;
      term = mkdir_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail449;
      if(true)
        return term;
    }
    return null;
  }
}