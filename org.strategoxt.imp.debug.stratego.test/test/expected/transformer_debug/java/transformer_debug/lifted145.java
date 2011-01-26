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

@SuppressWarnings("all") final class lifted145 extends Strategy 
{ 
  TermReference j_1145;

  TermReference t_832;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail554:
    { 
      IStrategoTerm x_835 = null;
      IStrategoTerm y_835 = null;
      IStrategoTerm a_836 = null;
      IStrategoTerm b_836 = null;
      IStrategoTerm d_836 = null;
      a_836 = term;
      x_835 = transformer_debug.const370;
      b_836 = a_836;
      y_835 = transformer_debug.const375;
      d_836 = b_836;
      term = s_step_0_3.instance.invoke(context, d_836, x_835, y_835, transformer_debug.constLocationInfo578);
      if(term == null)
        break Fail554;
      lifted146 lifted1460 = new lifted146();
      lifted1460.j_1145 = j_1145;
      lifted1460.t_832 = t_832;
      term = try_1_0.instance.invoke(context, term, lifted1460);
      if(term == null)
        break Fail554;
      if(true)
        return term;
    }
    return null;
  }
}