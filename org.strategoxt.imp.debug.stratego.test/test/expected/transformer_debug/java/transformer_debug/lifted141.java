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

@SuppressWarnings("all") final class lifted141 extends Strategy 
{ 
  TermReference j_1145;

  TermReference m_841;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail558:
    { 
      IStrategoTerm w_843 = null;
      IStrategoTerm y_843 = null;
      IStrategoTerm d_844 = null;
      IStrategoTerm e_844 = null;
      IStrategoTerm g_844 = null;
      d_844 = term;
      w_843 = transformer_debug.const370;
      e_844 = d_844;
      y_843 = transformer_debug.const375;
      g_844 = e_844;
      term = s_step_0_3.instance.invoke(context, g_844, w_843, y_843, transformer_debug.constLocationInfo556);
      if(term == null)
        break Fail558;
      lifted142 lifted1420 = new lifted142();
      lifted1420.j_1145 = j_1145;
      lifted1420.m_841 = m_841;
      term = try_1_0.instance.invoke(context, term, lifted1420);
      if(term == null)
        break Fail558;
      if(true)
        return term;
    }
    return null;
  }
}