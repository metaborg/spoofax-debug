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

@SuppressWarnings("all") public class create_$I_0_0 extends Strategy 
{ 
  public static create_$I_0_0 instance = new create_$I_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_I_0_0");
    Fail301:
    { 
      IStrategoTerm v_635 = null;
      IStrategoTerm x_635 = null;
      IStrategoTerm y_635 = null;
      IStrategoTerm a_636 = null;
      IStrategoTerm b_636 = null;
      IStrategoTerm c_636 = null;
      IStrategoTerm e_636 = null;
      IStrategoTerm f_636 = null;
      IStrategoTerm g_636 = null;
      IStrategoTerm i_636 = null;
      IStrategoTerm j_636 = null;
      IStrategoTerm k_636 = null;
      IStrategoTerm l_636 = null;
      IStrategoTerm m_636 = null;
      IStrategoTerm n_636 = null;
      IStrategoTerm r_636 = null;
      IStrategoTerm t_636 = null;
      IStrategoTerm u_636 = null;
      v_635 = term;
      a_636 = term;
      x_635 = transformer_debug.const181;
      b_636 = a_636;
      y_635 = transformer_debug.const201;
      c_636 = b_636;
      term = r_enter_0_3.instance.invoke(context, c_636, x_635, y_635, transformer_debug.constLocationInfo112);
      if(term == null)
        break Fail301;
      i_636 = v_635;
      e_636 = transformer_debug.const181;
      j_636 = i_636;
      f_636 = transformer_debug.const201;
      k_636 = j_636;
      g_636 = transformer_debug.const203;
      l_636 = k_636;
      term = s_var_0_4.instance.invoke(context, l_636, e_636, f_636, g_636, transformer_debug.constLocationInfo113);
      if(term == null)
        break Fail301;
      term = (IStrategoTerm)termFactory.makeListCons(transformer_debug.const149, termFactory.makeListCons(v_635, (IStrategoList)transformer_debug.constNil1));
      r_636 = term;
      m_636 = transformer_debug.const181;
      t_636 = r_636;
      n_636 = transformer_debug.const201;
      u_636 = t_636;
      term = r_exit_0_3.instance.invoke(context, u_636, m_636, n_636, transformer_debug.constLocationInfo112);
      if(term == null)
        break Fail301;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}