package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_functions_0_0 extends Strategy 
{ 
  public static find_functions_0_0 instance = new find_functions_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("find_functions_0_0");
    Fail44:
    { 
      IStrategoTerm p_128 = null;
      IStrategoTerm q_128 = null;
      IStrategoTerm t_128 = null;
      IStrategoTerm u_128 = null;
      IStrategoTerm v_128 = null;
      IStrategoTerm x_128 = null;
      IStrategoTerm y_128 = null;
      IStrategoTerm z_128 = null;
      IStrategoTerm a_129 = null;
      IStrategoTerm b_129 = null;
      IStrategoTerm c_129 = null;
      IStrategoTerm d_129 = null;
      IStrategoTerm i_129 = null;
      IStrategoTerm l_129 = null;
      IStrategoTerm n_129 = null;
      IStrategoTerm o_129 = null;
      IStrategoTerm p_129 = null;
      IStrategoTerm g_131 = null;
      IStrategoTerm i_131 = null;
      IStrategoTerm p_131 = null;
      IStrategoTerm r_131 = null;
      IStrategoTerm s_131 = null;
      p_128 = term;
      t_128 = term;
      x_128 = term;
      u_128 = localvar_rtree.const125;
      y_128 = x_128;
      v_128 = localvar_rtree.const165;
      z_128 = y_128;
      term = r_enter_0_3.instance.invoke(context, z_128, u_128, v_128, localvar_rtree.constLocationInfo102);
      if(term == null)
        break Fail44;
      a_129 = t_128;
      i_129 = p_128;
      b_129 = localvar_rtree.const125;
      l_129 = i_129;
      c_129 = localvar_rtree.const165;
      n_129 = l_129;
      d_129 = localvar_rtree.const169;
      o_129 = n_129;
      term = s_var_0_4.instance.invoke(context, o_129, b_129, c_129, d_129, localvar_rtree.constLocationInfo103);
      if(term == null)
        break Fail44;
      term = a_129;
      p_129 = a_129;
      IStrategoTerm term15 = term;
      Success15:
      { 
        Fail45:
        { 
          IStrategoTerm q_129 = null;
          IStrategoTerm s_129 = null;
          IStrategoTerm u_129 = null;
          IStrategoTerm w_129 = null;
          IStrategoTerm x_129 = null;
          IStrategoTerm z_129 = null;
          IStrategoTerm a_130 = null;
          IStrategoTerm d_130 = null;
          IStrategoTerm e_130 = null;
          IStrategoTerm f_130 = null;
          IStrategoTerm s_130 = null;
          IStrategoTerm t_130 = null;
          IStrategoTerm u_130 = null;
          IStrategoTerm w_130 = null;
          IStrategoTerm x_130 = null;
          IStrategoTerm z_130 = null;
          IStrategoTerm b_131 = null;
          u_129 = term;
          q_129 = localvar_rtree.const125;
          w_129 = u_129;
          s_129 = localvar_rtree.const165;
          x_129 = w_129;
          term = s_step_0_3.instance.invoke(context, x_129, q_129, s_129, localvar_rtree.constLocationInfo104);
          if(term == null)
            break Fail45;
          d_130 = p_128;
          z_129 = localvar_rtree.const125;
          e_130 = d_130;
          a_130 = localvar_rtree.const165;
          f_130 = e_130;
          term = s_step_0_3.instance.invoke(context, f_130, z_129, a_130, localvar_rtree.constLocationInfo105);
          if(term == null)
            break Fail45;
          term = filter_1_0.instance.invoke(context, term, lifted11.instance);
          if(term == null)
            break Fail45;
          q_128 = term;
          w_130 = term;
          s_130 = localvar_rtree.const125;
          x_130 = w_130;
          t_130 = localvar_rtree.const165;
          z_130 = x_130;
          u_130 = localvar_rtree.const173;
          b_131 = z_130;
          term = s_var_0_4.instance.invoke(context, b_131, s_130, t_130, u_130, localvar_rtree.constLocationInfo107);
          if(term == null)
            break Fail45;
          if(true)
            break Success15;
        }
        term = term15;
        IStrategoTerm r_128 = null;
        IStrategoTerm s_128 = null;
        IStrategoTerm f_131 = null;
        r_128 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail44;
        s_128 = term;
        f_131 = r_128;
        term = report_with_failure_0_2.instance.invoke(context, f_131, localvar_rtree.const174, s_128);
        if(term == null)
          break Fail44;
      }
      term = p_129;
      if(q_128 == null)
        break Fail44;
      p_131 = q_128;
      g_131 = localvar_rtree.const125;
      r_131 = p_131;
      i_131 = localvar_rtree.const165;
      s_131 = r_131;
      term = r_exit_0_3.instance.invoke(context, s_131, g_131, i_131, localvar_rtree.constLocationInfo102);
      if(term == null)
        break Fail44;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}