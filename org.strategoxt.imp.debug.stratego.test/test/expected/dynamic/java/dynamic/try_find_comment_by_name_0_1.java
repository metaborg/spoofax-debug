package dynamic;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_15)
  { 
    context.push("try_find_comment_by_name_0_1");
    Fail12:
    { 
      IStrategoTerm b_16 = null;
      IStrategoTerm c_16 = null;
      IStrategoTerm e_16 = null;
      IStrategoTerm f_16 = null;
      IStrategoTerm g_16 = null;
      e_16 = term;
      b_16 = dynamic.const0;
      f_16 = e_16;
      c_16 = dynamic.const66;
      g_16 = f_16;
      term = s_enter_0_3.instance.invoke(context, g_16, b_16, c_16, dynamic.constLocationInfo38);
      if(term == null)
        break Fail12;
      IStrategoTerm term6 = term;
      Success6:
      { 
        Fail13:
        { 
          IStrategoTerm a_16 = null;
          IStrategoTerm h_16 = null;
          IStrategoTerm i_16 = null;
          IStrategoTerm j_16 = null;
          IStrategoTerm l_16 = null;
          IStrategoTerm m_16 = null;
          IStrategoTerm n_16 = null;
          IStrategoTerm o_16 = null;
          IStrategoTerm p_16 = null;
          IStrategoTerm q_16 = null;
          IStrategoTerm s_16 = null;
          IStrategoTerm t_16 = null;
          IStrategoTerm u_16 = null;
          a_16 = term;
          l_16 = z_15;
          h_16 = dynamic.const0;
          m_16 = l_16;
          i_16 = dynamic.const66;
          n_16 = m_16;
          j_16 = dynamic.const35;
          o_16 = n_16;
          term = s_var_0_4.instance.invoke(context, o_16, h_16, i_16, j_16, dynamic.constLocationInfo39);
          if(term == null)
            break Fail13;
          s_16 = a_16;
          p_16 = dynamic.const0;
          t_16 = s_16;
          q_16 = dynamic.const66;
          u_16 = t_16;
          term = s_step_0_3.instance.invoke(context, u_16, p_16, q_16, dynamic.constLocationInfo40);
          if(term == null)
            break Fail13;
          term = find_comment_match_0_1.instance.invoke(context, term, z_15);
          if(term == null)
            break Fail13;
          { 
            IStrategoTerm v_16 = null;
            IStrategoTerm w_16 = null;
            IStrategoTerm y_16 = null;
            IStrategoTerm z_16 = null;
            IStrategoTerm a_17 = null;
            y_16 = term;
            v_16 = dynamic.const0;
            z_16 = y_16;
            w_16 = dynamic.const66;
            a_17 = z_16;
            term = s_exit_0_3.instance.invoke(context, a_17, v_16, w_16, dynamic.constLocationInfo38);
            if(term == null)
              break Fail12;
            if(true)
              break Success6;
          }
        }
        term = term6;
        IStrategoTerm b_17 = null;
        IStrategoTerm c_17 = null;
        IStrategoTerm e_17 = null;
        IStrategoTerm f_17 = null;
        IStrategoTerm g_17 = null;
        e_17 = term;
        b_17 = dynamic.const0;
        f_17 = e_17;
        c_17 = dynamic.const66;
        g_17 = f_17;
        term = s_exit_0_3.instance.invoke(context, g_17, b_17, c_17, dynamic.constLocationInfo38);
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