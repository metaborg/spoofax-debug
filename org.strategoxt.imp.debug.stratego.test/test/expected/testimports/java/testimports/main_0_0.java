package testimports;

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
    Fail7:
    { 
      IStrategoTerm f_5 = null;
      IStrategoTerm g_5 = null;
      IStrategoTerm i_5 = null;
      IStrategoTerm j_5 = null;
      IStrategoTerm k_5 = null;
      i_5 = term;
      f_5 = testimports.const24;
      j_5 = i_5;
      g_5 = testimports.const25;
      k_5 = j_5;
      term = s_enter_0_3.instance.invoke(context, k_5, f_5, g_5, testimports.constLocationInfo10);
      if(term == null)
        break Fail7;
      IStrategoTerm term4 = term;
      Success4:
      { 
        Fail8:
        { 
          IStrategoTerm l_5 = null;
          IStrategoTerm m_5 = null;
          IStrategoTerm o_5 = null;
          IStrategoTerm p_5 = null;
          IStrategoTerm q_5 = null;
          o_5 = term;
          l_5 = testimports.const24;
          p_5 = o_5;
          m_5 = testimports.const25;
          q_5 = p_5;
          term = s_step_0_3.instance.invoke(context, q_5, l_5, m_5, testimports.constLocationInfo12);
          if(term == null)
            break Fail8;
          term = io_wrap_1_0.instance.invoke(context, term, lifted1.instance);
          if(term == null)
            break Fail8;
          { 
            IStrategoTerm x_5 = null;
            IStrategoTerm y_5 = null;
            IStrategoTerm a_6 = null;
            IStrategoTerm b_6 = null;
            IStrategoTerm c_6 = null;
            a_6 = term;
            x_5 = testimports.const24;
            b_6 = a_6;
            y_5 = testimports.const25;
            c_6 = b_6;
            term = s_exit_0_3.instance.invoke(context, c_6, x_5, y_5, testimports.constLocationInfo10);
            if(term == null)
              break Fail7;
            if(true)
              break Success4;
          }
        }
        term = term4;
        IStrategoTerm d_6 = null;
        IStrategoTerm e_6 = null;
        IStrategoTerm g_6 = null;
        IStrategoTerm h_6 = null;
        IStrategoTerm i_6 = null;
        g_6 = term;
        d_6 = testimports.const24;
        h_6 = g_6;
        e_6 = testimports.const25;
        i_6 = h_6;
        term = s_exit_0_3.instance.invoke(context, i_6, d_6, e_6, testimports.constLocationInfo10);
        if(term == null)
          break Fail7;
        if(true)
          break Fail7;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}