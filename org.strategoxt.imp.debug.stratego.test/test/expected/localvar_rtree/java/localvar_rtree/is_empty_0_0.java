package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_empty_0_0 extends Strategy 
{ 
  public static is_empty_0_0 instance = new is_empty_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_empty_0_0");
    Fail56:
    { 
      IStrategoTerm q_156 = null;
      IStrategoTerm r_156 = null;
      IStrategoTerm v_156 = null;
      IStrategoTerm w_156 = null;
      IStrategoTerm x_156 = null;
      v_156 = term;
      q_156 = localvar_rtree.const125;
      w_156 = v_156;
      r_156 = localvar_rtree.const223;
      x_156 = w_156;
      term = s_enter_0_3.instance.invoke(context, x_156, q_156, r_156, localvar_rtree.constLocationInfo147);
      if(term == null)
        break Fail56;
      IStrategoTerm term20 = term;
      Success20:
      { 
        Fail57:
        { 
          IStrategoTerm a_157 = null;
          IStrategoTerm b_157 = null;
          IStrategoTerm f_157 = null;
          IStrategoTerm g_157 = null;
          IStrategoTerm h_157 = null;
          f_157 = term;
          a_157 = localvar_rtree.const125;
          g_157 = f_157;
          b_157 = localvar_rtree.const223;
          h_157 = g_157;
          term = s_step_0_3.instance.invoke(context, h_157, a_157, b_157, localvar_rtree.constLocationInfo148);
          if(term == null)
            break Fail57;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail57;
          { 
            IStrategoTerm i_157 = null;
            IStrategoTerm j_157 = null;
            IStrategoTerm m_157 = null;
            IStrategoTerm n_157 = null;
            IStrategoTerm o_157 = null;
            m_157 = term;
            i_157 = localvar_rtree.const125;
            n_157 = m_157;
            j_157 = localvar_rtree.const223;
            o_157 = n_157;
            term = s_exit_0_3.instance.invoke(context, o_157, i_157, j_157, localvar_rtree.constLocationInfo147);
            if(term == null)
              break Fail56;
            if(true)
              break Success20;
          }
        }
        term = term20;
        IStrategoTerm t_157 = null;
        IStrategoTerm u_157 = null;
        IStrategoTerm y_157 = null;
        IStrategoTerm z_157 = null;
        IStrategoTerm c_158 = null;
        y_157 = term;
        t_157 = localvar_rtree.const125;
        z_157 = y_157;
        u_157 = localvar_rtree.const223;
        c_158 = z_157;
        term = s_exit_0_3.instance.invoke(context, c_158, t_157, u_157, localvar_rtree.constLocationInfo147);
        if(term == null)
          break Fail56;
        if(true)
          break Fail56;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}