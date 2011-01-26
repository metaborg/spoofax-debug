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

@SuppressWarnings("all") final class lifted131 extends Strategy 
{ 
  TermReference d_817;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail570:
    { 
      IStrategoTerm z_817 = null;
      IStrategoTerm a_818 = null;
      IStrategoTerm c_818 = null;
      IStrategoTerm d_818 = null;
      IStrategoTerm e_818 = null;
      c_818 = term;
      z_817 = transformer_debug.const370;
      d_818 = c_818;
      a_818 = transformer_debug.const371;
      e_818 = d_818;
      term = s_step_0_3.instance.invoke(context, e_818, z_817, a_818, transformer_debug.constLocationInfo513);
      if(term == null)
        break Fail570;
      lifted132 lifted1320 = new lifted132();
      lifted1320.d_817 = d_817;
      term = try_1_0.instance.invoke(context, term, lifted1320);
      if(term == null)
        break Fail570;
      if(true)
        return term;
    }
    return null;
  }
}