package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted9 extends Strategy 
{ 
  TermReference e_22;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28:
    { 
      IStrategoTerm h_24 = null;
      IStrategoTerm i_24 = null;
      IStrategoTerm k_24 = null;
      IStrategoTerm l_24 = null;
      IStrategoTerm m_24 = null;
      k_24 = term;
      h_24 = localvardebug.const0;
      l_24 = k_24;
      i_24 = localvardebug.const99;
      m_24 = l_24;
      term = s_step_0_3.instance.invoke(context, m_24, h_24, i_24, localvardebug.constLocationInfo67);
      if(term == null)
        break Fail28;
      if(term.getTermType() != IStrategoTerm.APPL || localvardebug._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      if(e_22.value == null)
        e_22.value = term.getSubterm(0);
      else
        if(e_22.value != term.getSubterm(0) && !e_22.value.match(term.getSubterm(0)))
          break Fail28;
      if(true)
        return term;
    }
    return null;
  }
}