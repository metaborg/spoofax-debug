package localvardebug;

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
      IStrategoTerm h_21 = null;
      IStrategoTerm j_21 = null;
      IStrategoTerm k_21 = null;
      IStrategoTerm m_21 = null;
      IStrategoTerm n_21 = null;
      IStrategoTerm o_21 = null;
      IStrategoTerm q_21 = null;
      IStrategoTerm r_21 = null;
      IStrategoTerm s_21 = null;
      IStrategoTerm u_21 = null;
      IStrategoTerm v_21 = null;
      IStrategoTerm w_21 = null;
      IStrategoTerm x_21 = null;
      IStrategoTerm y_21 = null;
      IStrategoTerm z_21 = null;
      IStrategoTerm b_22 = null;
      IStrategoTerm c_22 = null;
      IStrategoTerm d_22 = null;
      if(term.getTermType() != IStrategoTerm.APPL || localvardebug._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      h_21 = term.getSubterm(0);
      m_21 = term;
      j_21 = localvardebug.const0;
      n_21 = m_21;
      k_21 = localvardebug.const95;
      o_21 = n_21;
      term = r_enter_0_3.instance.invoke(context, o_21, j_21, k_21, localvardebug.constLocationInfo58);
      if(term == null)
        break Fail15;
      u_21 = h_21;
      q_21 = localvardebug.const0;
      v_21 = u_21;
      r_21 = localvardebug.const95;
      w_21 = v_21;
      s_21 = localvardebug.const90;
      x_21 = w_21;
      term = s_var_0_4.instance.invoke(context, x_21, q_21, r_21, s_21, localvardebug.constLocationInfo59);
      if(term == null)
        break Fail15;
      b_22 = h_21;
      y_21 = localvardebug.const0;
      c_22 = b_22;
      z_21 = localvardebug.const95;
      d_22 = c_22;
      term = r_exit_0_3.instance.invoke(context, d_22, y_21, z_21, localvardebug.constLocationInfo58);
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