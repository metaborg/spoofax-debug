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

@SuppressWarnings("all") final class lifted117 extends Strategy 
{ 
  public static final lifted117 instance = new lifted117();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail596:
    { 
      IStrategoTerm z_700 = null;
      IStrategoTerm a_701 = null;
      IStrategoTerm c_701 = null;
      IStrategoTerm d_701 = null;
      IStrategoTerm e_701 = null;
      c_701 = term;
      z_700 = transformer_debug.const236;
      d_701 = c_701;
      a_701 = transformer_debug.const243;
      e_701 = d_701;
      term = s_step_0_3.instance.invoke(context, e_701, z_700, a_701, transformer_debug.constLocationInfo189);
      if(term == null)
        break Fail596;
      if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consVar_1 != ((IStrategoAppl)term).getConstructor())
        break Fail596;
      if(true)
        return term;
    }
    return null;
  }
}