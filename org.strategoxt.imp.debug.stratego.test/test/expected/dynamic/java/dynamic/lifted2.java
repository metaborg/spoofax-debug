package dynamic;

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
      IStrategoTerm p_12 = null;
      IStrategoTerm q_12 = null;
      IStrategoTerm s_12 = null;
      IStrategoTerm t_12 = null;
      IStrategoTerm u_12 = null;
      s_12 = term;
      p_12 = dynamic.const0;
      t_12 = s_12;
      q_12 = dynamic.const50;
      u_12 = t_12;
      term = s_step_0_3.instance.invoke(context, u_12, p_12, q_12, dynamic.constLocationInfo29);
      if(term == null)
        break Fail35;
      if(term.getTermType() != IStrategoTerm.APPL || dynamic._consComment_2 != ((IStrategoAppl)term).getConstructor())
        break Fail35;
      if(true)
        return term;
    }
    return null;
  }
}