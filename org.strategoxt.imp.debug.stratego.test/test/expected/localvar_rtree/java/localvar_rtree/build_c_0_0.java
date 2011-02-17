package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class build_c_0_0 extends Strategy 
{ 
  public static build_c_0_0 instance = new build_c_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("build_c_0_0");
    Fail61:
    { 
      IStrategoTerm h_160 = null;
      IStrategoTerm i_160 = null;
      IStrategoTerm k_160 = null;
      IStrategoTerm l_160 = null;
      IStrategoTerm m_160 = null;
      k_160 = term;
      h_160 = localvar_rtree.const125;
      l_160 = k_160;
      i_160 = localvar_rtree.const232;
      m_160 = l_160;
      term = s_enter_0_3.instance.invoke(context, m_160, h_160, i_160, localvar_rtree.constLocationInfo155);
      if(term == null)
        break Fail61;
      IStrategoTerm term23 = term;
      Success23:
      { 
        Fail62:
        { 
          IStrategoTerm n_160 = null;
          IStrategoTerm o_160 = null;
          IStrategoTerm q_160 = null;
          IStrategoTerm r_160 = null;
          IStrategoTerm s_160 = null;
          q_160 = term;
          n_160 = localvar_rtree.const125;
          r_160 = q_160;
          o_160 = localvar_rtree.const232;
          s_160 = r_160;
          term = s_step_0_3.instance.invoke(context, s_160, n_160, o_160, localvar_rtree.constLocationInfo156);
          if(term == null)
            break Fail62;
          term = localvar_rtree.constComment1;
          { 
            IStrategoTerm t_160 = null;
            IStrategoTerm u_160 = null;
            IStrategoTerm w_160 = null;
            IStrategoTerm x_160 = null;
            IStrategoTerm y_160 = null;
            w_160 = term;
            t_160 = localvar_rtree.const125;
            x_160 = w_160;
            u_160 = localvar_rtree.const232;
            y_160 = x_160;
            term = s_exit_0_3.instance.invoke(context, y_160, t_160, u_160, localvar_rtree.constLocationInfo155);
            if(term == null)
              break Fail61;
            if(true)
              break Success23;
          }
        }
        term = term23;
        IStrategoTerm z_160 = null;
        IStrategoTerm a_161 = null;
        IStrategoTerm c_161 = null;
        IStrategoTerm d_161 = null;
        IStrategoTerm e_161 = null;
        c_161 = term;
        z_160 = localvar_rtree.const125;
        d_161 = c_161;
        a_161 = localvar_rtree.const232;
        e_161 = d_161;
        term = s_exit_0_3.instance.invoke(context, e_161, z_160, a_161, localvar_rtree.constLocationInfo155);
        if(term == null)
          break Fail61;
        if(true)
          break Fail61;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}