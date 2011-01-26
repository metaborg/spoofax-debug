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

@SuppressWarnings("all") final class lifted108 extends Strategy 
{ 
  public static final lifted108 instance = new lifted108();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail611:
    { 
      IStrategoTerm term148 = term;
      Success303:
      { 
        Fail612:
        { 
          IStrategoTerm u_625 = null;
          IStrategoTerm v_625 = null;
          IStrategoTerm x_625 = null;
          IStrategoTerm y_625 = null;
          IStrategoTerm z_625 = null;
          x_625 = term;
          u_625 = transformer_debug.const181;
          y_625 = x_625;
          v_625 = transformer_debug.const182;
          z_625 = y_625;
          term = s_step_0_3.instance.invoke(context, z_625, u_625, v_625, transformer_debug.constLocationInfo76);
          if(term == null)
            break Fail612;
          term = pack_stratego_options_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail612;
          if(true)
            break Success303;
        }
        term = term148;
        IStrategoTerm a_626 = null;
        IStrategoTerm b_626 = null;
        IStrategoTerm d_626 = null;
        IStrategoTerm e_626 = null;
        IStrategoTerm f_626 = null;
        d_626 = term;
        a_626 = transformer_debug.const181;
        e_626 = d_626;
        b_626 = transformer_debug.const182;
        f_626 = e_626;
        term = s_step_0_3.instance.invoke(context, f_626, a_626, b_626, transformer_debug.constLocationInfo77);
        if(term == null)
          break Fail611;
        term = input_options_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail611;
      }
      if(true)
        return term;
    }
    return null;
  }
}