package localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class try_find_comment_by_name_0_1 extends Strategy 
{ 
  public static try_find_comment_by_name_0_1 instance = new try_find_comment_by_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_15)
  { 
    context.push("try_find_comment_by_name_0_1");
    Fail12:
    { 
      IStrategoTerm f_15 = null;
      IStrategoTerm g_15 = null;
      IStrategoTerm i_15 = null;
      IStrategoTerm j_15 = null;
      IStrategoTerm k_15 = null;
      i_15 = term;
      f_15 = localvar.const0;
      j_15 = i_15;
      g_15 = localvar.const66;
      k_15 = j_15;
      term = s_enter_0_3.instance.invoke(context, k_15, f_15, g_15, localvar.constLocationInfo38);
      if(term == null)
        break Fail12;
      IStrategoTerm term6 = term;
      Success6:
      { 
        Fail13:
        { 
          IStrategoTerm e_15 = null;
          IStrategoTerm l_15 = null;
          IStrategoTerm m_15 = null;
          IStrategoTerm n_15 = null;
          IStrategoTerm p_15 = null;
          IStrategoTerm q_15 = null;
          IStrategoTerm r_15 = null;
          IStrategoTerm s_15 = null;
          IStrategoTerm t_15 = null;
          IStrategoTerm u_15 = null;
          IStrategoTerm w_15 = null;
          IStrategoTerm x_15 = null;
          IStrategoTerm y_15 = null;
          e_15 = term;
          p_15 = d_15;
          l_15 = localvar.const0;
          q_15 = p_15;
          m_15 = localvar.const66;
          r_15 = q_15;
          n_15 = localvar.const35;
          s_15 = r_15;
          term = s_var_0_4.instance.invoke(context, s_15, l_15, m_15, n_15, localvar.constLocationInfo39);
          if(term == null)
            break Fail13;
          w_15 = e_15;
          t_15 = localvar.const0;
          x_15 = w_15;
          u_15 = localvar.const66;
          y_15 = x_15;
          term = s_step_0_3.instance.invoke(context, y_15, t_15, u_15, localvar.constLocationInfo40);
          if(term == null)
            break Fail13;
          term = find_comment_match_0_1.instance.invoke(context, term, d_15);
          if(term == null)
            break Fail13;
          { 
            IStrategoTerm z_15 = null;
            IStrategoTerm a_16 = null;
            IStrategoTerm c_16 = null;
            IStrategoTerm d_16 = null;
            IStrategoTerm e_16 = null;
            c_16 = term;
            z_15 = localvar.const0;
            d_16 = c_16;
            a_16 = localvar.const66;
            e_16 = d_16;
            term = s_exit_0_3.instance.invoke(context, e_16, z_15, a_16, localvar.constLocationInfo38);
            if(term == null)
              break Fail12;
            if(true)
              break Success6;
          }
        }
        term = term6;
        IStrategoTerm f_16 = null;
        IStrategoTerm g_16 = null;
        IStrategoTerm i_16 = null;
        IStrategoTerm j_16 = null;
        IStrategoTerm k_16 = null;
        i_16 = term;
        f_16 = localvar.const0;
        j_16 = i_16;
        g_16 = localvar.const66;
        k_16 = j_16;
        term = s_exit_0_3.instance.invoke(context, k_16, f_16, g_16, localvar.constLocationInfo38);
        if(term == null)
          break Fail12;
        if(true)
          break Fail12;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}