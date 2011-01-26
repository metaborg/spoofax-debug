package dynamic;

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
    Fail0:
    { 
      IStrategoTerm j_2 = null;
      IStrategoTerm k_2 = null;
      IStrategoTerm m_2 = null;
      IStrategoTerm n_2 = null;
      IStrategoTerm o_2 = null;
      m_2 = term;
      j_2 = dynamic.const0;
      n_2 = m_2;
      k_2 = dynamic.const1;
      o_2 = n_2;
      term = s_enter_0_3.instance.invoke(context, o_2, j_2, k_2, dynamic.constLocationInfo0);
      if(term == null)
        break Fail0;
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail1:
        { 
          IStrategoTerm p_2 = null;
          IStrategoTerm q_2 = null;
          IStrategoTerm s_2 = null;
          IStrategoTerm t_2 = null;
          IStrategoTerm u_2 = null;
          s_2 = term;
          p_2 = dynamic.const0;
          t_2 = s_2;
          q_2 = dynamic.const1;
          u_2 = t_2;
          term = s_step_0_3.instance.invoke(context, u_2, p_2, q_2, dynamic.constLocationInfo2);
          if(term == null)
            break Fail1;
          term = io_wrap_1_0.instance.invoke(context, term, lifted0.instance);
          if(term == null)
            break Fail1;
          { 
            IStrategoTerm b_3 = null;
            IStrategoTerm c_3 = null;
            IStrategoTerm e_3 = null;
            IStrategoTerm f_3 = null;
            IStrategoTerm g_3 = null;
            e_3 = term;
            b_3 = dynamic.const0;
            f_3 = e_3;
            c_3 = dynamic.const1;
            g_3 = f_3;
            term = s_exit_0_3.instance.invoke(context, g_3, b_3, c_3, dynamic.constLocationInfo0);
            if(term == null)
              break Fail0;
            if(true)
              break Success0;
          }
        }
        term = term0;
        IStrategoTerm h_3 = null;
        IStrategoTerm i_3 = null;
        IStrategoTerm k_3 = null;
        IStrategoTerm l_3 = null;
        IStrategoTerm m_3 = null;
        k_3 = term;
        h_3 = dynamic.const0;
        l_3 = k_3;
        i_3 = dynamic.const1;
        m_3 = l_3;
        term = s_exit_0_3.instance.invoke(context, m_3, h_3, i_3, dynamic.constLocationInfo0);
        if(term == null)
          break Fail0;
        if(true)
          break Fail0;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}