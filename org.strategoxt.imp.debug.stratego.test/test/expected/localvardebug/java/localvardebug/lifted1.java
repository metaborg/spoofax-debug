package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted1 extends Strategy 
{ 
  public static final lifted1 instance = new lifted1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail36:
    { 
      IStrategoTerm o_9 = null;
      IStrategoTerm p_9 = null;
      IStrategoTerm r_9 = null;
      IStrategoTerm s_9 = null;
      IStrategoTerm t_9 = null;
      r_9 = term;
      o_9 = localvardebug.const0;
      s_9 = r_9;
      p_9 = localvardebug.const40;
      t_9 = s_9;
      term = s_step_0_3.instance.invoke(context, t_9, o_9, p_9, localvardebug.constLocationInfo23);
      if(term == null)
        break Fail36;
      if(term.getTermType() != IStrategoTerm.APPL || localvardebug._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail36;
      if(true)
        return term;
    }
    return null;
  }
}