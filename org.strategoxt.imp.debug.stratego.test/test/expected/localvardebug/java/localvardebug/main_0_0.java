package localvardebug;

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
      IStrategoTerm z_0 = null;
      IStrategoTerm a_1 = null;
      IStrategoTerm f_1 = null;
      IStrategoTerm j_1 = null;
      IStrategoTerm k_1 = null;
      f_1 = term;
      z_0 = localvardebug.const0;
      j_1 = f_1;
      a_1 = localvardebug.const1;
      k_1 = j_1;
      term = s_enter_0_3.instance.invoke(context, k_1, z_0, a_1, localvardebug.constLocationInfo0);
      if(term == null)
        break Fail0;
      IStrategoTerm term0 = term;
      Success0:
      { 
        Fail1:
        { 
          IStrategoTerm p_1 = null;
          IStrategoTerm q_1 = null;
          IStrategoTerm w_1 = null;
          IStrategoTerm x_1 = null;
          IStrategoTerm y_1 = null;
          w_1 = term;
          p_1 = localvardebug.const0;
          x_1 = w_1;
          q_1 = localvardebug.const1;
          y_1 = x_1;
          term = s_step_0_3.instance.invoke(context, y_1, p_1, q_1, localvardebug.constLocationInfo2);
          if(term == null)
            break Fail1;
          term = io_wrap_1_0.instance.invoke(context, term, lifted0.instance);
          if(term == null)
            break Fail1;
          { 
            IStrategoTerm f_2 = null;
            IStrategoTerm g_2 = null;
            IStrategoTerm i_2 = null;
            IStrategoTerm j_2 = null;
            IStrategoTerm k_2 = null;
            i_2 = term;
            f_2 = localvardebug.const0;
            j_2 = i_2;
            g_2 = localvardebug.const1;
            k_2 = j_2;
            term = s_exit_0_3.instance.invoke(context, k_2, f_2, g_2, localvardebug.constLocationInfo0);
            if(term == null)
              break Fail0;
            if(true)
              break Success0;
          }
        }
        term = term0;
        IStrategoTerm l_2 = null;
        IStrategoTerm m_2 = null;
        IStrategoTerm o_2 = null;
        IStrategoTerm p_2 = null;
        IStrategoTerm q_2 = null;
        o_2 = term;
        l_2 = localvardebug.const0;
        p_2 = o_2;
        m_2 = localvardebug.const1;
        q_2 = p_2;
        term = s_exit_0_3.instance.invoke(context, q_2, l_2, m_2, localvardebug.constLocationInfo0);
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