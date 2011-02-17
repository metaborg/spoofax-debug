package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comments_0_0 extends Strategy 
{ 
  public static find_comments_0_0 instance = new find_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("find_comments_0_0");
    Fail46:
    { 
      IStrategoTerm w_131 = null;
      IStrategoTerm y_131 = null;
      IStrategoTerm b_132 = null;
      IStrategoTerm c_132 = null;
      IStrategoTerm d_132 = null;
      IStrategoTerm f_132 = null;
      IStrategoTerm g_132 = null;
      IStrategoTerm j_132 = null;
      IStrategoTerm l_132 = null;
      IStrategoTerm n_132 = null;
      IStrategoTerm q_132 = null;
      IStrategoTerm t_132 = null;
      IStrategoTerm z_132 = null;
      IStrategoTerm c_133 = null;
      IStrategoTerm g_133 = null;
      IStrategoTerm i_133 = null;
      IStrategoTerm j_133 = null;
      IStrategoTerm j_136 = null;
      IStrategoTerm k_136 = null;
      IStrategoTerm m_136 = null;
      IStrategoTerm n_136 = null;
      IStrategoTerm p_136 = null;
      w_131 = term;
      b_132 = term;
      f_132 = term;
      c_132 = localvar_rtree.const125;
      g_132 = f_132;
      d_132 = localvar_rtree.const175;
      j_132 = g_132;
      term = r_enter_0_3.instance.invoke(context, j_132, c_132, d_132, localvar_rtree.constLocationInfo108);
      if(term == null)
        break Fail46;
      l_132 = b_132;
      z_132 = w_131;
      n_132 = localvar_rtree.const125;
      c_133 = z_132;
      q_132 = localvar_rtree.const175;
      g_133 = c_133;
      t_132 = localvar_rtree.const169;
      i_133 = g_133;
      term = s_var_0_4.instance.invoke(context, i_133, n_132, q_132, t_132, localvar_rtree.constLocationInfo109);
      if(term == null)
        break Fail46;
      term = l_132;
      j_133 = l_132;
      IStrategoTerm term16 = term;
      Success16:
      { 
        Fail47:
        { 
          IStrategoTerm k_133 = null;
          IStrategoTerm l_133 = null;
          IStrategoTerm o_133 = null;
          IStrategoTerm r_133 = null;
          IStrategoTerm u_133 = null;
          IStrategoTerm n_134 = null;
          IStrategoTerm o_134 = null;
          IStrategoTerm q_134 = null;
          IStrategoTerm w_134 = null;
          IStrategoTerm y_134 = null;
          IStrategoTerm o_135 = null;
          IStrategoTerm r_135 = null;
          IStrategoTerm v_135 = null;
          IStrategoTerm a_136 = null;
          IStrategoTerm c_136 = null;
          IStrategoTerm e_136 = null;
          IStrategoTerm g_136 = null;
          o_133 = term;
          k_133 = localvar_rtree.const125;
          r_133 = o_133;
          l_133 = localvar_rtree.const175;
          u_133 = r_133;
          term = s_step_0_3.instance.invoke(context, u_133, k_133, l_133, localvar_rtree.constLocationInfo110);
          if(term == null)
            break Fail47;
          q_134 = w_131;
          n_134 = localvar_rtree.const125;
          w_134 = q_134;
          o_134 = localvar_rtree.const175;
          y_134 = w_134;
          term = s_step_0_3.instance.invoke(context, y_134, n_134, o_134, localvar_rtree.constLocationInfo111);
          if(term == null)
            break Fail47;
          term = filter_1_0.instance.invoke(context, term, lifted12.instance);
          if(term == null)
            break Fail47;
          y_131 = term;
          a_136 = term;
          o_135 = localvar_rtree.const125;
          c_136 = a_136;
          r_135 = localvar_rtree.const175;
          e_136 = c_136;
          v_135 = localvar_rtree.const180;
          g_136 = e_136;
          term = s_var_0_4.instance.invoke(context, g_136, o_135, r_135, v_135, localvar_rtree.constLocationInfo113);
          if(term == null)
            break Fail47;
          if(true)
            break Success16;
        }
        term = term16;
        IStrategoTerm z_131 = null;
        IStrategoTerm a_132 = null;
        IStrategoTerm i_136 = null;
        z_131 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail46;
        a_132 = term;
        i_136 = z_131;
        term = report_with_failure_0_2.instance.invoke(context, i_136, localvar_rtree.const181, a_132);
        if(term == null)
          break Fail46;
      }
      term = j_133;
      if(y_131 == null)
        break Fail46;
      m_136 = y_131;
      j_136 = localvar_rtree.const125;
      n_136 = m_136;
      k_136 = localvar_rtree.const175;
      p_136 = n_136;
      term = r_exit_0_3.instance.invoke(context, p_136, j_136, k_136, localvar_rtree.constLocationInfo108);
      if(term == null)
        break Fail46;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}