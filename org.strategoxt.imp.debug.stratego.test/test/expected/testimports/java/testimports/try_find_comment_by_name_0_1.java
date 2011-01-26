package testimports;

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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_18)
  { 
    context.push("try_find_comment_by_name_0_1");
    Fail19:
    { 
      IStrategoTerm x_18 = null;
      IStrategoTerm y_18 = null;
      IStrategoTerm a_19 = null;
      IStrategoTerm b_19 = null;
      IStrategoTerm c_19 = null;
      a_19 = term;
      x_18 = testimports.const24;
      b_19 = a_19;
      y_18 = testimports.const71;
      c_19 = b_19;
      term = s_enter_0_3.instance.invoke(context, c_19, x_18, y_18, testimports.constLocationInfo48);
      if(term == null)
        break Fail19;
      IStrategoTerm term10 = term;
      Success10:
      { 
        Fail20:
        { 
          IStrategoTerm w_18 = null;
          IStrategoTerm d_19 = null;
          IStrategoTerm e_19 = null;
          IStrategoTerm f_19 = null;
          IStrategoTerm h_19 = null;
          IStrategoTerm i_19 = null;
          IStrategoTerm j_19 = null;
          IStrategoTerm k_19 = null;
          IStrategoTerm l_19 = null;
          IStrategoTerm m_19 = null;
          IStrategoTerm o_19 = null;
          IStrategoTerm p_19 = null;
          IStrategoTerm q_19 = null;
          w_18 = term;
          h_19 = v_18;
          d_19 = testimports.const24;
          i_19 = h_19;
          e_19 = testimports.const71;
          j_19 = i_19;
          f_19 = testimports.const44;
          k_19 = j_19;
          term = s_var_0_4.instance.invoke(context, k_19, d_19, e_19, f_19, testimports.constLocationInfo49);
          if(term == null)
            break Fail20;
          o_19 = w_18;
          l_19 = testimports.const24;
          p_19 = o_19;
          m_19 = testimports.const71;
          q_19 = p_19;
          term = s_step_0_3.instance.invoke(context, q_19, l_19, m_19, testimports.constLocationInfo50);
          if(term == null)
            break Fail20;
          term = find_comment_match_0_1.instance.invoke(context, term, v_18);
          if(term == null)
            break Fail20;
          { 
            IStrategoTerm r_19 = null;
            IStrategoTerm s_19 = null;
            IStrategoTerm u_19 = null;
            IStrategoTerm v_19 = null;
            IStrategoTerm w_19 = null;
            u_19 = term;
            r_19 = testimports.const24;
            v_19 = u_19;
            s_19 = testimports.const71;
            w_19 = v_19;
            term = s_exit_0_3.instance.invoke(context, w_19, r_19, s_19, testimports.constLocationInfo48);
            if(term == null)
              break Fail19;
            if(true)
              break Success10;
          }
        }
        term = term10;
        IStrategoTerm x_19 = null;
        IStrategoTerm y_19 = null;
        IStrategoTerm a_20 = null;
        IStrategoTerm b_20 = null;
        IStrategoTerm c_20 = null;
        a_20 = term;
        x_19 = testimports.const24;
        b_20 = a_20;
        y_19 = testimports.const71;
        c_20 = b_20;
        term = s_exit_0_3.instance.invoke(context, c_20, x_19, y_19, testimports.constLocationInfo48);
        if(term == null)
          break Fail19;
        if(true)
          break Fail19;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}