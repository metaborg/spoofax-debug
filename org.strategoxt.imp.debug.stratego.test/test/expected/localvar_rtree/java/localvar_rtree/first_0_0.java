package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class first_0_0 extends Strategy 
{ 
  public static first_0_0 instance = new first_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("first_0_0");
    Fail58:
    { 
      IStrategoTerm d_158 = null;
      IStrategoTerm e_158 = null;
      IStrategoTerm g_158 = null;
      IStrategoTerm h_158 = null;
      IStrategoTerm i_158 = null;
      g_158 = term;
      d_158 = localvar_rtree.const125;
      h_158 = g_158;
      e_158 = localvar_rtree.const225;
      i_158 = h_158;
      term = s_enter_0_3.instance.invoke(context, i_158, d_158, e_158, localvar_rtree.constLocationInfo149);
      if(term == null)
        break Fail58;
      IStrategoTerm term21 = term;
      Success21:
      { 
        Fail59:
        { 
          IStrategoTerm k_158 = null;
          IStrategoTerm l_158 = null;
          IStrategoTerm n_158 = null;
          IStrategoTerm p_158 = null;
          IStrategoTerm q_158 = null;
          n_158 = term;
          k_158 = localvar_rtree.const125;
          p_158 = n_158;
          l_158 = localvar_rtree.const225;
          q_158 = p_158;
          term = s_step_0_3.instance.invoke(context, q_158, k_158, l_158, localvar_rtree.constLocationInfo150);
          if(term == null)
            break Fail59;
          term = debug_1_0.instance.invoke(context, term, lifted16.instance);
          if(term == null)
            break Fail59;
          IStrategoTerm term22 = term;
          Success22:
          { 
            Fail60:
            { 
              IStrategoTerm b_159 = null;
              IStrategoTerm d_159 = null;
              IStrategoTerm g_159 = null;
              IStrategoTerm h_159 = null;
              IStrategoTerm i_159 = null;
              g_159 = term;
              b_159 = localvar_rtree.const125;
              h_159 = g_159;
              d_159 = localvar_rtree.const225;
              i_159 = h_159;
              term = s_step_0_3.instance.invoke(context, i_159, b_159, d_159, localvar_rtree.constLocationInfo152);
              if(term == null)
                break Fail60;
              term = is_empty_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail60;
              { 
                IStrategoTerm j_159 = null;
                IStrategoTerm k_159 = null;
                IStrategoTerm m_159 = null;
                IStrategoTerm n_159 = null;
                IStrategoTerm o_159 = null;
                m_159 = term;
                j_159 = localvar_rtree.const125;
                n_159 = m_159;
                k_159 = localvar_rtree.const225;
                o_159 = n_159;
                term = s_step_0_3.instance.invoke(context, o_159, j_159, k_159, localvar_rtree.constLocationInfo153);
                if(term == null)
                  break Fail59;
                term = build_c_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail59;
                if(true)
                  break Success22;
              }
            }
            term = term22;
            IStrategoTerm p_159 = null;
            IStrategoTerm q_159 = null;
            IStrategoTerm s_159 = null;
            IStrategoTerm t_159 = null;
            IStrategoTerm u_159 = null;
            s_159 = term;
            p_159 = localvar_rtree.const125;
            t_159 = s_159;
            q_159 = localvar_rtree.const225;
            u_159 = t_159;
            term = s_step_0_3.instance.invoke(context, u_159, p_159, q_159, localvar_rtree.constLocationInfo154);
            if(term == null)
              break Fail59;
            term = last_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail59;
          }
          { 
            IStrategoTerm v_159 = null;
            IStrategoTerm w_159 = null;
            IStrategoTerm y_159 = null;
            IStrategoTerm z_159 = null;
            IStrategoTerm a_160 = null;
            y_159 = term;
            v_159 = localvar_rtree.const125;
            z_159 = y_159;
            w_159 = localvar_rtree.const225;
            a_160 = z_159;
            term = s_exit_0_3.instance.invoke(context, a_160, v_159, w_159, localvar_rtree.constLocationInfo149);
            if(term == null)
              break Fail58;
            if(true)
              break Success21;
          }
        }
        term = term21;
        IStrategoTerm b_160 = null;
        IStrategoTerm c_160 = null;
        IStrategoTerm e_160 = null;
        IStrategoTerm f_160 = null;
        IStrategoTerm g_160 = null;
        e_160 = term;
        b_160 = localvar_rtree.const125;
        f_160 = e_160;
        c_160 = localvar_rtree.const225;
        g_160 = f_160;
        term = s_exit_0_3.instance.invoke(context, g_160, b_160, c_160, localvar_rtree.constLocationInfo149);
        if(term == null)
          break Fail58;
        if(true)
          break Fail58;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}