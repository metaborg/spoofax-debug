package localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted0 extends Strategy 
{ 
  public static final lifted0 instance = new lifted0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail31:
    { 
      IStrategoTerm z_1 = null;
      IStrategoTerm a_2 = null;
      IStrategoTerm c_2 = null;
      IStrategoTerm d_2 = null;
      IStrategoTerm e_2 = null;
      c_2 = term;
      z_1 = localvar.const0;
      d_2 = c_2;
      a_2 = localvar.const1;
      e_2 = d_2;
      term = s_step_0_3.instance.invoke(context, e_2, z_1, a_2, localvar.constLocationInfo1);
      if(term == null)
        break Fail31;
      term = execute_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail31;
      if(true)
        return term;
    }
    return null;
  }
}