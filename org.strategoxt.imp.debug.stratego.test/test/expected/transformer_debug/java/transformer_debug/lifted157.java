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

@SuppressWarnings("all") final class lifted157 extends Strategy 
{ 
  TermReference d_1112;

  TermReference e_1112;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail445:
    { 
      IStrategoTerm l_1117 = null;
      IStrategoTerm m_1117 = null;
      IStrategoTerm o_1117 = null;
      IStrategoTerm p_1117 = null;
      IStrategoTerm q_1117 = null;
      o_1117 = term;
      l_1117 = transformer_debug.const618;
      p_1117 = o_1117;
      m_1117 = transformer_debug.const629;
      q_1117 = p_1117;
      term = s_step_0_3.instance.invoke(context, q_1117, l_1117, m_1117, transformer_debug.constLocationInfo1210);
      if(term == null)
        break Fail445;
      term = handle_file_0_2.instance.invoke(context, term, d_1112.value, e_1112.value);
      if(term == null)
        break Fail445;
      if(true)
        return term;
    }
    return null;
  }
}