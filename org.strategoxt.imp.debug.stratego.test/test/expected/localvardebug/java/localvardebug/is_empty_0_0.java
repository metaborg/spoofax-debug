package localvardebug;

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
    Fail17:
    { 
      IStrategoTerm t_28 = null;
      IStrategoTerm u_28 = null;
      IStrategoTerm w_28 = null;
      IStrategoTerm x_28 = null;
      IStrategoTerm y_28 = null;
      w_28 = term;
      t_28 = localvardebug.const0;
      x_28 = w_28;
      u_28 = localvardebug.const112;
      y_28 = x_28;
      term = s_enter_0_3.instance.invoke(context, y_28, t_28, u_28, localvardebug.constLocationInfo76);
      if(term == null)
        break Fail17;
      IStrategoTerm term7 = term;
      Success7:
      { 
        Fail18:
        { 
          IStrategoTerm z_28 = null;
          IStrategoTerm a_29 = null;
          IStrategoTerm c_29 = null;
          IStrategoTerm d_29 = null;
          IStrategoTerm e_29 = null;
          c_29 = term;
          z_28 = localvardebug.const0;
          d_29 = c_29;
          a_29 = localvardebug.const112;
          e_29 = d_29;
          term = s_step_0_3.instance.invoke(context, e_29, z_28, a_29, localvardebug.constLocationInfo77);
          if(term == null)
            break Fail18;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail18;
          { 
            IStrategoTerm f_29 = null;
            IStrategoTerm g_29 = null;
            IStrategoTerm i_29 = null;
            IStrategoTerm j_29 = null;
            IStrategoTerm k_29 = null;
            i_29 = term;
            f_29 = localvardebug.const0;
            j_29 = i_29;
            g_29 = localvardebug.const112;
            k_29 = j_29;
            term = s_exit_0_3.instance.invoke(context, k_29, f_29, g_29, localvardebug.constLocationInfo76);
            if(term == null)
              break Fail17;
            if(true)
              break Success7;
          }
        }
        term = term7;
        IStrategoTerm l_29 = null;
        IStrategoTerm m_29 = null;
        IStrategoTerm o_29 = null;
        IStrategoTerm p_29 = null;
        IStrategoTerm q_29 = null;
        o_29 = term;
        l_29 = localvardebug.const0;
        p_29 = o_29;
        m_29 = localvardebug.const112;
        q_29 = p_29;
        term = s_exit_0_3.instance.invoke(context, q_29, l_29, m_29, localvardebug.constLocationInfo76);
        if(term == null)
          break Fail17;
        if(true)
          break Fail17;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}