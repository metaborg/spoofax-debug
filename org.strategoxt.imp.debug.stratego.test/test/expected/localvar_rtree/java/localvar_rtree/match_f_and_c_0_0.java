package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class match_f_and_c_0_0 extends Strategy 
{ 
  public static match_f_and_c_0_0 instance = new match_f_and_c_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("match_f_and_c_0_0");
    Fail48:
    { 
      TermReference s_136 = new TermReference();
      IStrategoTerm t_136 = null;
      IStrategoTerm u_136 = null;
      IStrategoTerm z_136 = null;
      IStrategoTerm a_137 = null;
      IStrategoTerm c_137 = null;
      IStrategoTerm e_137 = null;
      IStrategoTerm f_137 = null;
      IStrategoTerm g_137 = null;
      IStrategoTerm h_137 = null;
      IStrategoTerm i_137 = null;
      IStrategoTerm j_137 = null;
      IStrategoTerm k_137 = null;
      IStrategoTerm m_137 = null;
      IStrategoTerm n_137 = null;
      IStrategoTerm o_137 = null;
      IStrategoTerm p_137 = null;
      IStrategoTerm q_137 = null;
      IStrategoTerm r_137 = null;
      IStrategoTerm s_137 = null;
      IStrategoTerm u_137 = null;
      IStrategoTerm v_137 = null;
      IStrategoTerm z_137 = null;
      IStrategoTerm a_138 = null;
      IStrategoTerm b_138 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
        break Fail48;
      t_136 = term.getSubterm(0);
      if(s_136.value == null)
        s_136.value = term.getSubterm(1);
      else
        if(s_136.value != term.getSubterm(1) && !s_136.value.match(term.getSubterm(1)))
          break Fail48;
      z_136 = term;
      e_137 = term;
      a_137 = localvar_rtree.const125;
      f_137 = e_137;
      c_137 = localvar_rtree.const182;
      g_137 = f_137;
      term = r_enter_0_3.instance.invoke(context, g_137, a_137, c_137, localvar_rtree.constLocationInfo114);
      if(term == null)
        break Fail48;
      h_137 = z_136;
      m_137 = t_136;
      i_137 = localvar_rtree.const125;
      n_137 = m_137;
      j_137 = localvar_rtree.const182;
      o_137 = n_137;
      k_137 = localvar_rtree.const158;
      p_137 = o_137;
      term = s_var_0_4.instance.invoke(context, p_137, i_137, j_137, k_137, localvar_rtree.constLocationInfo115);
      if(term == null)
        break Fail48;
      if(s_136.value == null)
        break Fail48;
      u_137 = s_136.value;
      q_137 = localvar_rtree.const125;
      v_137 = u_137;
      r_137 = localvar_rtree.const182;
      z_137 = v_137;
      s_137 = localvar_rtree.const160;
      a_138 = z_137;
      term = s_var_0_4.instance.invoke(context, a_138, q_137, r_137, s_137, localvar_rtree.constLocationInfo116);
      if(term == null)
        break Fail48;
      term = h_137;
      b_138 = h_137;
      IStrategoTerm term17 = term;
      Success17:
      { 
        Fail49:
        { 
          IStrategoTerm c_138 = null;
          IStrategoTerm d_138 = null;
          IStrategoTerm f_138 = null;
          IStrategoTerm g_138 = null;
          IStrategoTerm h_138 = null;
          IStrategoTerm i_138 = null;
          IStrategoTerm j_138 = null;
          IStrategoTerm l_138 = null;
          IStrategoTerm m_138 = null;
          IStrategoTerm n_138 = null;
          IStrategoTerm x_138 = null;
          IStrategoTerm y_138 = null;
          IStrategoTerm z_138 = null;
          IStrategoTerm b_139 = null;
          IStrategoTerm c_139 = null;
          IStrategoTerm d_139 = null;
          IStrategoTerm e_139 = null;
          f_138 = term;
          c_138 = localvar_rtree.const125;
          g_138 = f_138;
          d_138 = localvar_rtree.const182;
          h_138 = g_138;
          term = s_step_0_3.instance.invoke(context, h_138, c_138, d_138, localvar_rtree.constLocationInfo117);
          if(term == null)
            break Fail49;
          l_138 = t_136;
          i_138 = localvar_rtree.const125;
          m_138 = l_138;
          j_138 = localvar_rtree.const182;
          n_138 = m_138;
          term = s_step_0_3.instance.invoke(context, n_138, i_138, j_138, localvar_rtree.constLocationInfo118);
          if(term == null)
            break Fail49;
          lifted13 lifted130 = new lifted13();
          lifted130.s_136 = s_136;
          term = map_1_0.instance.invoke(context, term, lifted130);
          if(term == null)
            break Fail49;
          u_136 = term;
          b_139 = term;
          x_138 = localvar_rtree.const125;
          c_139 = b_139;
          y_138 = localvar_rtree.const182;
          d_139 = c_139;
          z_138 = localvar_rtree.const189;
          e_139 = d_139;
          term = s_var_0_4.instance.invoke(context, e_139, x_138, y_138, z_138, localvar_rtree.constLocationInfo120);
          if(term == null)
            break Fail49;
          if(true)
            break Success17;
        }
        term = term17;
        IStrategoTerm x_136 = null;
        IStrategoTerm y_136 = null;
        IStrategoTerm g_139 = null;
        x_136 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail48;
        y_136 = term;
        g_139 = x_136;
        term = report_with_failure_0_2.instance.invoke(context, g_139, localvar_rtree.const190, y_136);
        if(term == null)
          break Fail48;
      }
      term = b_138;
      IStrategoTerm h_139 = null;
      IStrategoTerm i_139 = null;
      IStrategoTerm w_139 = null;
      IStrategoTerm x_139 = null;
      IStrategoTerm b_140 = null;
      if(u_136 == null)
        break Fail48;
      w_139 = u_136;
      h_139 = localvar_rtree.const125;
      x_139 = w_139;
      i_139 = localvar_rtree.const182;
      b_140 = x_139;
      term = r_exit_0_3.instance.invoke(context, b_140, h_139, i_139, localvar_rtree.constLocationInfo114);
      if(term == null)
        break Fail48;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}