package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_comments_0_0 extends Strategy 
{ 
  public static match_comments_0_0 instance = new match_comments_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("match_comments_0_0");
    Fail42:
    { 
      IStrategoTerm s_124 = null;
      IStrategoTerm t_124 = null;
      IStrategoTerm u_124 = null;
      IStrategoTerm v_124 = null;
      IStrategoTerm a_125 = null;
      IStrategoTerm b_125 = null;
      IStrategoTerm c_125 = null;
      IStrategoTerm e_125 = null;
      IStrategoTerm g_125 = null;
      IStrategoTerm h_125 = null;
      IStrategoTerm i_125 = null;
      IStrategoTerm j_125 = null;
      IStrategoTerm k_125 = null;
      IStrategoTerm l_125 = null;
      IStrategoTerm n_125 = null;
      IStrategoTerm o_125 = null;
      IStrategoTerm p_125 = null;
      IStrategoTerm q_125 = null;
      IStrategoTerm r_125 = null;
      IStrategoTerm f_128 = null;
      IStrategoTerm g_128 = null;
      IStrategoTerm i_128 = null;
      IStrategoTerm j_128 = null;
      IStrategoTerm k_128 = null;
      if(term.getTermType() != IStrategoTerm.APPL || localvar_rtree._consProgram_2 != ((IStrategoAppl)term).getConstructor())
        break Fail42;
      s_124 = term.getSubterm(1);
      a_125 = term;
      e_125 = term;
      b_125 = localvar_rtree.const125;
      g_125 = e_125;
      c_125 = localvar_rtree.const146;
      h_125 = g_125;
      term = r_enter_0_3.instance.invoke(context, h_125, b_125, c_125, localvar_rtree.constLocationInfo91);
      if(term == null)
        break Fail42;
      i_125 = a_125;
      n_125 = s_124;
      j_125 = localvar_rtree.const125;
      o_125 = n_125;
      k_125 = localvar_rtree.const146;
      p_125 = o_125;
      l_125 = localvar_rtree.const150;
      q_125 = p_125;
      term = s_var_0_4.instance.invoke(context, q_125, j_125, k_125, l_125, localvar_rtree.constLocationInfo92);
      if(term == null)
        break Fail42;
      term = i_125;
      r_125 = i_125;
      IStrategoTerm term14 = term;
      Success14:
      { 
        Fail43:
        { 
          IStrategoTerm s_125 = null;
          IStrategoTerm t_125 = null;
          IStrategoTerm v_125 = null;
          IStrategoTerm w_125 = null;
          IStrategoTerm x_125 = null;
          IStrategoTerm y_125 = null;
          IStrategoTerm z_125 = null;
          IStrategoTerm b_126 = null;
          IStrategoTerm c_126 = null;
          IStrategoTerm d_126 = null;
          IStrategoTerm e_126 = null;
          IStrategoTerm f_126 = null;
          IStrategoTerm g_126 = null;
          IStrategoTerm i_126 = null;
          IStrategoTerm j_126 = null;
          IStrategoTerm k_126 = null;
          IStrategoTerm l_126 = null;
          IStrategoTerm m_126 = null;
          IStrategoTerm n_126 = null;
          IStrategoTerm p_126 = null;
          IStrategoTerm q_126 = null;
          IStrategoTerm r_126 = null;
          IStrategoTerm s_126 = null;
          IStrategoTerm t_126 = null;
          IStrategoTerm v_126 = null;
          IStrategoTerm w_126 = null;
          IStrategoTerm x_126 = null;
          IStrategoTerm y_126 = null;
          IStrategoTerm a_127 = null;
          IStrategoTerm b_127 = null;
          IStrategoTerm f_127 = null;
          IStrategoTerm g_127 = null;
          IStrategoTerm h_127 = null;
          IStrategoTerm i_127 = null;
          IStrategoTerm j_127 = null;
          IStrategoTerm k_127 = null;
          IStrategoTerm m_127 = null;
          IStrategoTerm n_127 = null;
          IStrategoTerm o_127 = null;
          IStrategoTerm p_127 = null;
          IStrategoTerm q_127 = null;
          IStrategoTerm s_127 = null;
          IStrategoTerm t_127 = null;
          IStrategoTerm u_127 = null;
          IStrategoTerm v_127 = null;
          IStrategoTerm w_127 = null;
          IStrategoTerm x_127 = null;
          IStrategoTerm z_127 = null;
          IStrategoTerm a_128 = null;
          IStrategoTerm b_128 = null;
          IStrategoTerm c_128 = null;
          v_125 = term;
          s_125 = localvar_rtree.const125;
          w_125 = v_125;
          t_125 = localvar_rtree.const146;
          x_125 = w_125;
          term = s_step_0_3.instance.invoke(context, x_125, s_125, t_125, localvar_rtree.constLocationInfo93);
          if(term == null)
            break Fail43;
          b_126 = s_124;
          y_125 = localvar_rtree.const125;
          c_126 = b_126;
          z_125 = localvar_rtree.const146;
          d_126 = c_126;
          term = s_step_0_3.instance.invoke(context, d_126, y_125, z_125, localvar_rtree.constLocationInfo94);
          if(term == null)
            break Fail43;
          term = find_functions_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail43;
          t_124 = term;
          i_126 = term;
          e_126 = localvar_rtree.const125;
          j_126 = i_126;
          f_126 = localvar_rtree.const146;
          k_126 = j_126;
          g_126 = localvar_rtree.const158;
          l_126 = k_126;
          term = s_var_0_4.instance.invoke(context, l_126, e_126, f_126, g_126, localvar_rtree.constLocationInfo95);
          if(term == null)
            break Fail43;
          p_126 = term;
          m_126 = localvar_rtree.const125;
          q_126 = p_126;
          n_126 = localvar_rtree.const146;
          r_126 = q_126;
          term = s_step_0_3.instance.invoke(context, r_126, m_126, n_126, localvar_rtree.constLocationInfo96);
          if(term == null)
            break Fail43;
          v_126 = s_124;
          s_126 = localvar_rtree.const125;
          w_126 = v_126;
          t_126 = localvar_rtree.const146;
          x_126 = w_126;
          term = s_step_0_3.instance.invoke(context, x_126, s_126, t_126, localvar_rtree.constLocationInfo97);
          if(term == null)
            break Fail43;
          term = find_comments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail43;
          u_124 = term;
          f_127 = term;
          y_126 = localvar_rtree.const125;
          g_127 = f_127;
          a_127 = localvar_rtree.const146;
          h_127 = g_127;
          b_127 = localvar_rtree.const160;
          i_127 = h_127;
          term = s_var_0_4.instance.invoke(context, i_127, y_126, a_127, b_127, localvar_rtree.constLocationInfo98);
          if(term == null)
            break Fail43;
          m_127 = term;
          j_127 = localvar_rtree.const125;
          n_127 = m_127;
          k_127 = localvar_rtree.const146;
          o_127 = n_127;
          term = s_step_0_3.instance.invoke(context, o_127, j_127, k_127, localvar_rtree.constLocationInfo99);
          if(term == null)
            break Fail43;
          term = termFactory.makeTuple(t_124, u_124);
          s_127 = term;
          p_127 = localvar_rtree.const125;
          t_127 = s_127;
          q_127 = localvar_rtree.const146;
          u_127 = t_127;
          term = s_step_0_3.instance.invoke(context, u_127, p_127, q_127, localvar_rtree.constLocationInfo100);
          if(term == null)
            break Fail43;
          term = match_f_and_c_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail43;
          v_124 = term;
          z_127 = term;
          v_127 = localvar_rtree.const125;
          a_128 = z_127;
          w_127 = localvar_rtree.const146;
          b_128 = a_128;
          x_127 = localvar_rtree.const163;
          c_128 = b_128;
          term = s_var_0_4.instance.invoke(context, c_128, v_127, w_127, x_127, localvar_rtree.constLocationInfo101);
          if(term == null)
            break Fail43;
          if(true)
            break Success14;
        }
        term = term14;
        IStrategoTerm w_124 = null;
        IStrategoTerm z_124 = null;
        IStrategoTerm e_128 = null;
        w_124 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail42;
        z_124 = term;
        e_128 = w_124;
        term = report_with_failure_0_2.instance.invoke(context, e_128, localvar_rtree.const164, z_124);
        if(term == null)
          break Fail42;
      }
      term = r_125;
      if(v_124 == null)
        break Fail42;
      i_128 = v_124;
      f_128 = localvar_rtree.const125;
      j_128 = i_128;
      g_128 = localvar_rtree.const146;
      k_128 = j_128;
      term = r_exit_0_3.instance.invoke(context, k_128, f_128, g_128, localvar_rtree.constLocationInfo91);
      if(term == null)
        break Fail42;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}