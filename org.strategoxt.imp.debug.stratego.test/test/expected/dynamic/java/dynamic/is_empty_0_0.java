package dynamic;

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
      IStrategoTerm x_29 = null;
      IStrategoTerm y_29 = null;
      IStrategoTerm a_30 = null;
      IStrategoTerm b_30 = null;
      IStrategoTerm c_30 = null;
      a_30 = term;
      x_29 = dynamic.const0;
      b_30 = a_30;
      y_29 = dynamic.const113;
      c_30 = b_30;
      term = s_enter_0_3.instance.invoke(context, c_30, x_29, y_29, dynamic.constLocationInfo73);
      if(term == null)
        break Fail17;
      IStrategoTerm term8 = term;
      Success7:
      { 
        Fail18:
        { 
          IStrategoTerm d_30 = null;
          IStrategoTerm e_30 = null;
          IStrategoTerm g_30 = null;
          IStrategoTerm h_30 = null;
          IStrategoTerm i_30 = null;
          g_30 = term;
          d_30 = dynamic.const0;
          h_30 = g_30;
          e_30 = dynamic.const113;
          i_30 = h_30;
          term = s_step_0_3.instance.invoke(context, i_30, d_30, e_30, dynamic.constLocationInfo74);
          if(term == null)
            break Fail18;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail18;
          { 
            IStrategoTerm j_30 = null;
            IStrategoTerm k_30 = null;
            IStrategoTerm m_30 = null;
            IStrategoTerm n_30 = null;
            IStrategoTerm o_30 = null;
            m_30 = term;
            j_30 = dynamic.const0;
            n_30 = m_30;
            k_30 = dynamic.const113;
            o_30 = n_30;
            term = s_exit_0_3.instance.invoke(context, o_30, j_30, k_30, dynamic.constLocationInfo73);
            if(term == null)
              break Fail17;
            if(true)
              break Success7;
          }
        }
        term = term8;
        IStrategoTerm p_30 = null;
        IStrategoTerm q_30 = null;
        IStrategoTerm s_30 = null;
        IStrategoTerm t_30 = null;
        IStrategoTerm u_30 = null;
        s_30 = term;
        p_30 = dynamic.const0;
        t_30 = s_30;
        q_30 = dynamic.const113;
        u_30 = t_30;
        term = s_exit_0_3.instance.invoke(context, u_30, p_30, q_30, dynamic.constLocationInfo73);
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