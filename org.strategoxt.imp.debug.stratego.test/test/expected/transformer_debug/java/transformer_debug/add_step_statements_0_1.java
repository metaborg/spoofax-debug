package transformer_debug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.strc.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class add_step_statements_0_1 extends Strategy 
{ 
  public static add_step_statements_0_1 instance = new add_step_statements_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_d_817)
  { 
    TermReference d_817 = new TermReference(ref_d_817);
    context.push("add_step_statements_0_1");
    Fail364:
    { 
      IStrategoTerm f_817 = null;
      IStrategoTerm g_817 = null;
      IStrategoTerm i_817 = null;
      IStrategoTerm j_817 = null;
      IStrategoTerm k_817 = null;
      i_817 = term;
      f_817 = transformer_debug.const370;
      j_817 = i_817;
      g_817 = transformer_debug.const371;
      k_817 = j_817;
      term = s_enter_0_3.instance.invoke(context, k_817, f_817, g_817, transformer_debug.constLocationInfo507);
      if(term == null)
        break Fail364;
      IStrategoTerm term187 = term;
      Success177:
      { 
        Fail365:
        { 
          IStrategoTerm e_817 = null;
          IStrategoTerm l_817 = null;
          IStrategoTerm m_817 = null;
          IStrategoTerm n_817 = null;
          IStrategoTerm p_817 = null;
          IStrategoTerm q_817 = null;
          IStrategoTerm r_817 = null;
          IStrategoTerm s_817 = null;
          IStrategoTerm t_817 = null;
          IStrategoTerm u_817 = null;
          IStrategoTerm w_817 = null;
          IStrategoTerm x_817 = null;
          IStrategoTerm y_817 = null;
          IStrategoTerm l_818 = null;
          IStrategoTerm m_818 = null;
          IStrategoTerm o_818 = null;
          IStrategoTerm p_818 = null;
          IStrategoTerm q_818 = null;
          e_817 = term;
          if(d_817.value == null)
            break Fail365;
          p_817 = d_817.value;
          l_817 = transformer_debug.const370;
          q_817 = p_817;
          m_817 = transformer_debug.const371;
          r_817 = q_817;
          n_817 = transformer_debug.const238;
          s_817 = r_817;
          term = s_var_0_4.instance.invoke(context, s_817, l_817, m_817, n_817, transformer_debug.constLocationInfo510);
          if(term == null)
            break Fail365;
          w_817 = e_817;
          t_817 = transformer_debug.const370;
          x_817 = w_817;
          u_817 = transformer_debug.const371;
          y_817 = x_817;
          term = s_step_0_3.instance.invoke(context, y_817, t_817, u_817, transformer_debug.constLocationInfo511);
          if(term == null)
            break Fail365;
          lifted131 lifted1310 = new lifted131();
          lifted1310.d_817 = d_817;
          term = bottomup_1_0.instance.invoke(context, term, lifted1310);
          if(term == null)
            break Fail365;
          o_818 = term;
          l_818 = transformer_debug.const370;
          p_818 = o_818;
          m_818 = transformer_debug.const371;
          q_818 = p_818;
          term = s_step_0_3.instance.invoke(context, q_818, l_818, m_818, transformer_debug.constLocationInfo514);
          if(term == null)
            break Fail365;
          lifted133 lifted1330 = new lifted133();
          lifted1330.d_817 = d_817;
          term = bottomup_1_0.instance.invoke(context, term, lifted1330);
          if(term == null)
            break Fail365;
          { 
            IStrategoTerm d_819 = null;
            IStrategoTerm e_819 = null;
            IStrategoTerm g_819 = null;
            IStrategoTerm h_819 = null;
            IStrategoTerm i_819 = null;
            g_819 = term;
            d_819 = transformer_debug.const370;
            h_819 = g_819;
            e_819 = transformer_debug.const371;
            i_819 = h_819;
            term = s_exit_0_3.instance.invoke(context, i_819, d_819, e_819, transformer_debug.constLocationInfo507);
            if(term == null)
              break Fail364;
            if(true)
              break Success177;
          }
        }
        term = term187;
        IStrategoTerm j_819 = null;
        IStrategoTerm k_819 = null;
        IStrategoTerm m_819 = null;
        IStrategoTerm n_819 = null;
        IStrategoTerm o_819 = null;
        m_819 = term;
        j_819 = transformer_debug.const370;
        n_819 = m_819;
        k_819 = transformer_debug.const371;
        o_819 = n_819;
        term = s_exit_0_3.instance.invoke(context, o_819, j_819, k_819, transformer_debug.constLocationInfo507);
        if(term == null)
          break Fail364;
        if(true)
          break Fail364;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}