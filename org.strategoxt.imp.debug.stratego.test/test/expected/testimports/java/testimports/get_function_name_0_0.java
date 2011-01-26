package testimports;

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
    Fail22:
    { 
      IStrategoTerm b_23 = null;
      IStrategoTerm d_23 = null;
      IStrategoTerm e_23 = null;
      IStrategoTerm g_23 = null;
      IStrategoTerm h_23 = null;
      IStrategoTerm i_23 = null;
      IStrategoTerm k_23 = null;
      IStrategoTerm l_23 = null;
      IStrategoTerm m_23 = null;
      IStrategoTerm o_23 = null;
      IStrategoTerm p_23 = null;
      IStrategoTerm q_23 = null;
      IStrategoTerm r_23 = null;
      IStrategoTerm s_23 = null;
      IStrategoTerm t_23 = null;
      IStrategoTerm v_23 = null;
      IStrategoTerm w_23 = null;
      IStrategoTerm x_23 = null;
      if(term.getTermType() != IStrategoTerm.APPL || testimports._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail22;
      b_23 = term.getSubterm(0);
      g_23 = term;
      d_23 = testimports.const24;
      h_23 = g_23;
      e_23 = testimports.const84;
      i_23 = h_23;
      term = r_enter_0_3.instance.invoke(context, i_23, d_23, e_23, testimports.constLocationInfo60);
      if(term == null)
        break Fail22;
      o_23 = b_23;
      k_23 = testimports.const24;
      p_23 = o_23;
      l_23 = testimports.const84;
      q_23 = p_23;
      m_23 = testimports.const81;
      r_23 = q_23;
      term = s_var_0_4.instance.invoke(context, r_23, k_23, l_23, m_23, testimports.constLocationInfo61);
      if(term == null)
        break Fail22;
      v_23 = b_23;
      s_23 = testimports.const24;
      w_23 = v_23;
      t_23 = testimports.const84;
      x_23 = w_23;
      term = r_exit_0_3.instance.invoke(context, x_23, s_23, t_23, testimports.constLocationInfo60);
      if(term == null)
        break Fail22;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}