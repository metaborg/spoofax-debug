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

@SuppressWarnings("all") final class lifted112 extends Strategy 
{ 
  public static final lifted112 instance = new lifted112();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail603:
    { 
      IStrategoTerm u_634 = null;
      IStrategoTerm v_634 = null;
      IStrategoTerm x_634 = null;
      IStrategoTerm y_634 = null;
      IStrategoTerm z_634 = null;
      x_634 = term;
      u_634 = transformer_debug.const181;
      y_634 = x_634;
      v_634 = transformer_debug.const192;
      z_634 = y_634;
      term = s_step_0_3.instance.invoke(context, z_634, u_634, v_634, transformer_debug.constLocationInfo108);
      if(term == null)
        break Fail603;
      IStrategoTerm term150 = term;
      Success300:
      { 
        Fail604:
        { 
          IStrategoTerm a_635 = null;
          IStrategoTerm b_635 = null;
          IStrategoTerm d_635 = null;
          IStrategoTerm e_635 = null;
          IStrategoTerm f_635 = null;
          d_635 = term;
          a_635 = transformer_debug.const181;
          e_635 = d_635;
          b_635 = transformer_debug.const192;
          f_635 = e_635;
          term = s_step_0_3.instance.invoke(context, f_635, a_635, b_635, transformer_debug.constLocationInfo109);
          if(term == null)
            break Fail604;
          if(term.getTermType() != IStrategoTerm.STRING || !"".equals(((IStrategoString)term).stringValue()))
            break Fail604;
          { 
            if(true)
              break Fail603;
            if(true)
              break Success300;
          }
        }
        term = term150;
      }
      if(true)
        return term;
    }
    return null;
  }
}