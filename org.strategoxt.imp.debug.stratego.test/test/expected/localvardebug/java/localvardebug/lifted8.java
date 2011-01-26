package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted8 extends Strategy 
{ 
  public static final lifted8 instance = new lifted8();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail29:
    { 
      IStrategoTerm o_23 = null;
      IStrategoTerm p_23 = null;
      IStrategoTerm r_23 = null;
      IStrategoTerm s_23 = null;
      IStrategoTerm t_23 = null;
      r_23 = term;
      o_23 = localvardebug.const0;
      s_23 = r_23;
      p_23 = localvardebug.const99;
      t_23 = s_23;
      term = s_step_0_3.instance.invoke(context, t_23, o_23, p_23, localvardebug.constLocationInfo64);
      if(term == null)
        break Fail29;
      term = localvardebug.const103;
      if(true)
        return term;
    }
    return null;
  }
}