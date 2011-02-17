package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted12 extends Strategy 
{ 
  public static final lifted12 instance = new lifted12();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail67:
    { 
      IStrategoTerm a_135 = null;
      IStrategoTerm c_135 = null;
      IStrategoTerm h_135 = null;
      IStrategoTerm j_135 = null;
      IStrategoTerm l_135 = null;
      h_135 = term;
      a_135 = localvar_rtree.const125;
      j_135 = h_135;
      c_135 = localvar_rtree.const175;
      l_135 = j_135;
      term = s_step_0_3.instance.invoke(context, l_135, a_135, c_135, localvar_rtree.constLocationInfo112);
      if(term == null)
        break Fail67;
      if(term.getTermType() != IStrategoTerm.APPL || localvar_rtree._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail67;
      if(true)
        return term;
    }
    return null;
  }
}