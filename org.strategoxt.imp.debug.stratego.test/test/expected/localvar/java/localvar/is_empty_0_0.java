package localvar;

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
    Fail18:
    { 
      IStrategoTerm b_26 = null;
      IStrategoTerm c_26 = null;
      IStrategoTerm e_26 = null;
      IStrategoTerm f_26 = null;
      IStrategoTerm g_26 = null;
      e_26 = term;
      b_26 = localvar.const0;
      f_26 = e_26;
      c_26 = localvar.const98;
      g_26 = f_26;
      term = s_enter_0_3.instance.invoke(context, g_26, b_26, c_26, localvar.constLocationInfo64);
      if(term == null)
        break Fail18;
      IStrategoTerm term8 = term;
      Success8:
      { 
        Fail19:
        { 
          IStrategoTerm h_26 = null;
          IStrategoTerm i_26 = null;
          IStrategoTerm k_26 = null;
          IStrategoTerm l_26 = null;
          IStrategoTerm m_26 = null;
          k_26 = term;
          h_26 = localvar.const0;
          l_26 = k_26;
          i_26 = localvar.const98;
          m_26 = l_26;
          term = s_step_0_3.instance.invoke(context, m_26, h_26, i_26, localvar.constLocationInfo65);
          if(term == null)
            break Fail19;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail19;
          { 
            IStrategoTerm n_26 = null;
            IStrategoTerm o_26 = null;
            IStrategoTerm q_26 = null;
            IStrategoTerm r_26 = null;
            IStrategoTerm s_26 = null;
            q_26 = term;
            n_26 = localvar.const0;
            r_26 = q_26;
            o_26 = localvar.const98;
            s_26 = r_26;
            term = s_exit_0_3.instance.invoke(context, s_26, n_26, o_26, localvar.constLocationInfo64);
            if(term == null)
              break Fail18;
            if(true)
              break Success8;
          }
        }
        term = term8;
        IStrategoTerm t_26 = null;
        IStrategoTerm u_26 = null;
        IStrategoTerm w_26 = null;
        IStrategoTerm x_26 = null;
        IStrategoTerm y_26 = null;
        w_26 = term;
        t_26 = localvar.const0;
        x_26 = w_26;
        u_26 = localvar.const98;
        y_26 = x_26;
        term = s_exit_0_3.instance.invoke(context, y_26, t_26, u_26, localvar.constLocationInfo64);
        if(term == null)
          break Fail18;
        if(true)
          break Fail18;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}