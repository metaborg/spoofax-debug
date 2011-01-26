package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted2 extends Strategy 
{ 
  public static final lifted2 instance = new lifted2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail35:
    { 
      IStrategoTerm t_11 = null;
      IStrategoTerm u_11 = null;
      IStrategoTerm w_11 = null;
      IStrategoTerm x_11 = null;
      IStrategoTerm y_11 = null;
      w_11 = term;
      t_11 = localvardebug.const0;
      x_11 = w_11;
      u_11 = localvardebug.const50;
      y_11 = x_11;
      term = s_step_0_3.instance.invoke(context, y_11, t_11, u_11, localvardebug.constLocationInfo29);
      if(term == null)
        break Fail35;
      if(term.getTermType() != IStrategoTerm.APPL || localvardebug._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      if(true)
        return term;
    }
    return null;
  }
}