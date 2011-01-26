package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_function_name_0_0 extends Strategy 
{ 
  public static get_function_name_0_0 instance = new get_function_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_function_name_0_0");
    Fail15:
    { 
      IStrategoTerm t_20 = null;
      IStrategoTerm v_20 = null;
      IStrategoTerm w_20 = null;
      IStrategoTerm y_20 = null;
      IStrategoTerm z_20 = null;
      IStrategoTerm a_21 = null;
      IStrategoTerm c_21 = null;
      IStrategoTerm d_21 = null;
      IStrategoTerm e_21 = null;
      IStrategoTerm g_21 = null;
      IStrategoTerm h_21 = null;
      IStrategoTerm i_21 = null;
      IStrategoTerm j_21 = null;
      IStrategoTerm k_21 = null;
      IStrategoTerm l_21 = null;
      IStrategoTerm n_21 = null;
      IStrategoTerm o_21 = null;
      IStrategoTerm p_21 = null;
      if(term.getTermType() != IStrategoTerm.APPL || dynamic._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      t_20 = term.getSubterm(0);
      y_20 = term;
      v_20 = dynamic.const0;
      z_20 = y_20;
      w_20 = dynamic.const87;
      a_21 = z_20;
      term = r_enter_0_3.instance.invoke(context, a_21, v_20, w_20, dynamic.constLocationInfo51);
      if(term == null)
        break Fail15;
      g_21 = t_20;
      c_21 = dynamic.const0;
      h_21 = g_21;
      d_21 = dynamic.const87;
      i_21 = h_21;
      e_21 = dynamic.const80;
      j_21 = i_21;
      term = s_var_0_4.instance.invoke(context, j_21, c_21, d_21, e_21, dynamic.constLocationInfo52);
      if(term == null)
        break Fail15;
      n_21 = t_20;
      k_21 = dynamic.const0;
      o_21 = n_21;
      l_21 = dynamic.const87;
      p_21 = o_21;
      term = r_exit_0_3.instance.invoke(context, p_21, k_21, l_21, dynamic.constLocationInfo51);
      if(term == null)
        break Fail15;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}