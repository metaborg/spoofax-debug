package testimports;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted3 extends Strategy 
{ 
  public static final lifted3 instance = new lifted3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail28:
    { 
      IStrategoTerm l_15 = null;
      IStrategoTerm m_15 = null;
      IStrategoTerm o_15 = null;
      IStrategoTerm p_15 = null;
      IStrategoTerm q_15 = null;
      o_15 = term;
      l_15 = testimports.const24;
      p_15 = o_15;
      m_15 = testimports.const55;
      q_15 = p_15;
      term = s_step_0_3.instance.invoke(context, q_15, l_15, m_15, testimports.constLocationInfo39);
      if(term == null)
        break Fail28;
      if(term.getTermType() != IStrategoTerm.APPL || testimports._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail28;
      if(true)
        return term;
    }
    return null;
  }
}