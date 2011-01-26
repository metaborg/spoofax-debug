package localvar;

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
    Fail23:
    { 
      IStrategoTerm v_28 = null;
      IStrategoTerm w_28 = null;
      IStrategoTerm y_28 = null;
      IStrategoTerm z_28 = null;
      IStrategoTerm a_29 = null;
      y_28 = term;
      v_28 = localvar.const0;
      z_28 = y_28;
      w_28 = localvar.const107;
      a_29 = z_28;
      term = s_enter_0_3.instance.invoke(context, a_29, v_28, w_28, localvar.constLocationInfo72);
      if(term == null)
        break Fail23;
      IStrategoTerm term11 = term;
      Success11:
      { 
        Fail24:
        { 
          IStrategoTerm b_29 = null;
          IStrategoTerm c_29 = null;
          IStrategoTerm e_29 = null;
          IStrategoTerm f_29 = null;
          IStrategoTerm g_29 = null;
          e_29 = term;
          b_29 = localvar.const0;
          f_29 = e_29;
          c_29 = localvar.const107;
          g_29 = f_29;
          term = s_step_0_3.instance.invoke(context, g_29, b_29, c_29, localvar.constLocationInfo73);
          if(term == null)
            break Fail24;
          term = localvar.constComment0;
          { 
            IStrategoTerm h_29 = null;
            IStrategoTerm i_29 = null;
            IStrategoTerm k_29 = null;
            IStrategoTerm l_29 = null;
            IStrategoTerm m_29 = null;
            k_29 = term;
            h_29 = localvar.const0;
            l_29 = k_29;
            i_29 = localvar.const107;
            m_29 = l_29;
            term = s_exit_0_3.instance.invoke(context, m_29, h_29, i_29, localvar.constLocationInfo72);
            if(term == null)
              break Fail23;
            if(true)
              break Success11;
          }
        }
        term = term11;
        IStrategoTerm n_29 = null;
        IStrategoTerm o_29 = null;
        IStrategoTerm q_29 = null;
        IStrategoTerm r_29 = null;
        IStrategoTerm s_29 = null;
        q_29 = term;
        n_29 = localvar.const0;
        r_29 = q_29;
        o_29 = localvar.const107;
        s_29 = r_29;
        term = s_exit_0_3.instance.invoke(context, s_29, n_29, o_29, localvar.constLocationInfo72);
        if(term == null)
          break Fail23;
        if(true)
          break Fail23;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}