package localvar;

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
      IStrategoTerm j_19 = null;
      IStrategoTerm l_19 = null;
      IStrategoTerm m_19 = null;
      IStrategoTerm o_19 = null;
      IStrategoTerm p_19 = null;
      IStrategoTerm q_19 = null;
      IStrategoTerm s_19 = null;
      IStrategoTerm t_19 = null;
      IStrategoTerm u_19 = null;
      IStrategoTerm w_19 = null;
      IStrategoTerm x_19 = null;
      IStrategoTerm y_19 = null;
      IStrategoTerm z_19 = null;
      IStrategoTerm a_20 = null;
      IStrategoTerm b_20 = null;
      IStrategoTerm d_20 = null;
      IStrategoTerm e_20 = null;
      IStrategoTerm f_20 = null;
      if(term.getTermType() != IStrategoTerm.APPL || localvar._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail15;
      j_19 = term.getSubterm(0);
      o_19 = term;
      l_19 = localvar.const0;
      p_19 = o_19;
      m_19 = localvar.const83;
      q_19 = p_19;
      term = r_enter_0_3.instance.invoke(context, q_19, l_19, m_19, localvar.constLocationInfo50);
      if(term == null)
        break Fail15;
      w_19 = j_19;
      s_19 = localvar.const0;
      x_19 = w_19;
      t_19 = localvar.const83;
      y_19 = x_19;
      u_19 = localvar.const80;
      z_19 = y_19;
      term = s_var_0_4.instance.invoke(context, z_19, s_19, t_19, u_19, localvar.constLocationInfo51);
      if(term == null)
        break Fail15;
      d_20 = j_19;
      a_20 = localvar.const0;
      e_20 = d_20;
      b_20 = localvar.const83;
      f_20 = e_20;
      term = r_exit_0_3.instance.invoke(context, f_20, a_20, b_20, localvar.constLocationInfo50);
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