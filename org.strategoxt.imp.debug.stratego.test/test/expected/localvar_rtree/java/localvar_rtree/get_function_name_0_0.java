package localvar_rtree;

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
    Fail53:
    { 
      IStrategoTerm b_147 = null;
      IStrategoTerm d_147 = null;
      IStrategoTerm g_147 = null;
      IStrategoTerm i_147 = null;
      IStrategoTerm j_147 = null;
      IStrategoTerm k_147 = null;
      IStrategoTerm q_147 = null;
      IStrategoTerm r_147 = null;
      IStrategoTerm v_147 = null;
      IStrategoTerm x_147 = null;
      IStrategoTerm y_147 = null;
      IStrategoTerm z_147 = null;
      IStrategoTerm a_148 = null;
      IStrategoTerm b_148 = null;
      IStrategoTerm c_148 = null;
      IStrategoTerm e_148 = null;
      IStrategoTerm f_148 = null;
      IStrategoTerm g_148 = null;
      if(term.getTermType() != IStrategoTerm.APPL || localvar_rtree._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail53;
      b_147 = term.getSubterm(0);
      i_147 = term;
      d_147 = localvar_rtree.const125;
      j_147 = i_147;
      g_147 = localvar_rtree.const208;
      k_147 = j_147;
      term = r_enter_0_3.instance.invoke(context, k_147, d_147, g_147, localvar_rtree.constLocationInfo133);
      if(term == null)
        break Fail53;
      x_147 = b_147;
      q_147 = localvar_rtree.const125;
      y_147 = x_147;
      r_147 = localvar_rtree.const208;
      z_147 = y_147;
      v_147 = localvar_rtree.const205;
      a_148 = z_147;
      term = s_var_0_4.instance.invoke(context, a_148, q_147, r_147, v_147, localvar_rtree.constLocationInfo134);
      if(term == null)
        break Fail53;
      e_148 = b_147;
      b_148 = localvar_rtree.const125;
      f_148 = e_148;
      c_148 = localvar_rtree.const208;
      g_148 = f_148;
      term = r_exit_0_3.instance.invoke(context, g_148, b_148, c_148, localvar_rtree.constLocationInfo133);
      if(term == null)
        break Fail53;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}