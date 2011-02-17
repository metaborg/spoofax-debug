package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted14 extends Strategy 
{ 
  TermReference j_148;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail65:
    { 
      IStrategoTerm b_150 = null;
      IStrategoTerm c_150 = null;
      IStrategoTerm e_150 = null;
      IStrategoTerm f_150 = null;
      IStrategoTerm g_150 = null;
      e_150 = term;
      b_150 = localvar_rtree.const125;
      f_150 = e_150;
      c_150 = localvar_rtree.const212;
      g_150 = f_150;
      term = s_step_0_3.instance.invoke(context, g_150, b_150, c_150, localvar_rtree.constLocationInfo140);
      if(term == null)
        break Fail65;
      if(term.getTermType() != IStrategoTerm.APPL || localvar_rtree._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail65;
      if(j_148.value == null)
        j_148.value = term.getSubterm(0);
      else
        if(j_148.value != term.getSubterm(0) && !j_148.value.match(term.getSubterm(0)))
          break Fail65;
      if(true)
        return term;
    }
    return null;
  }
}