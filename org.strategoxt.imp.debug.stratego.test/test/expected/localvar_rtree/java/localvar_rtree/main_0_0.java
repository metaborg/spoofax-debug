package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class main_0_0 extends Strategy 
{ 
  public static main_0_0 instance = new main_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("main_0_0");
    Fail38:
    { 
      IStrategoTerm y_120 = null;
      IStrategoTerm z_120 = null;
      IStrategoTerm b_121 = null;
      IStrategoTerm c_121 = null;
      IStrategoTerm d_121 = null;
      b_121 = term;
      y_120 = localvar_rtree.const125;
      c_121 = b_121;
      z_120 = localvar_rtree.const126;
      d_121 = c_121;
      term = s_enter_0_3.instance.invoke(context, d_121, y_120, z_120, localvar_rtree.constLocationInfo83);
      if(term == null)
        break Fail38;
      IStrategoTerm term12 = term;
      Success12:
      { 
        Fail39:
        { 
          IStrategoTerm e_121 = null;
          IStrategoTerm f_121 = null;
          IStrategoTerm h_121 = null;
          IStrategoTerm i_121 = null;
          IStrategoTerm l_121 = null;
          h_121 = term;
          e_121 = localvar_rtree.const125;
          i_121 = h_121;
          f_121 = localvar_rtree.const126;
          l_121 = i_121;
          term = s_step_0_3.instance.invoke(context, l_121, e_121, f_121, localvar_rtree.constLocationInfo85);
          if(term == null)
            break Fail39;
          term = io_wrap_1_0.instance.invoke(context, term, lifted10.instance);
          if(term == null)
            break Fail39;
          { 
            IStrategoTerm t_121 = null;
            IStrategoTerm v_121 = null;
            IStrategoTerm x_121 = null;
            IStrategoTerm y_121 = null;
            IStrategoTerm z_121 = null;
            x_121 = term;
            t_121 = localvar_rtree.const125;
            y_121 = x_121;
            v_121 = localvar_rtree.const126;
            z_121 = y_121;
            term = s_exit_0_3.instance.invoke(context, z_121, t_121, v_121, localvar_rtree.constLocationInfo83);
            if(term == null)
              break Fail38;
            if(true)
              break Success12;
          }
        }
        term = term12;
        IStrategoTerm a_122 = null;
        IStrategoTerm b_122 = null;
        IStrategoTerm d_122 = null;
        IStrategoTerm e_122 = null;
        IStrategoTerm g_122 = null;
        d_122 = term;
        a_122 = localvar_rtree.const125;
        e_122 = d_122;
        b_122 = localvar_rtree.const126;
        g_122 = e_122;
        term = s_exit_0_3.instance.invoke(context, g_122, a_122, b_122, localvar_rtree.constLocationInfo83);
        if(term == null)
          break Fail38;
        if(true)
          break Fail38;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}