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

@SuppressWarnings("all") final class lifted119 extends Strategy 
{ 
  TermReference z_703;

  TermReference a_704;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail594:
    { 
      IStrategoTerm z_705 = null;
      IStrategoTerm a_706 = null;
      IStrategoTerm c_706 = null;
      IStrategoTerm d_706 = null;
      IStrategoTerm e_706 = null;
      c_706 = term;
      z_705 = transformer_debug.const236;
      d_706 = c_706;
      a_706 = transformer_debug.const247;
      e_706 = d_706;
      term = s_step_0_3.instance.invoke(context, e_706, z_705, a_706, transformer_debug.constLocationInfo206);
      if(term == null)
        break Fail594;
      term = t_arg_to_s_var_0_2.instance.invoke(context, term, z_703.value, a_704.value);
      if(term == null)
        break Fail594;
      if(true)
        return term;
    }
    return null;
  }
}