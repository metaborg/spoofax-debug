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

@SuppressWarnings("all") public class var_wrap_s_0_2 extends Strategy 
{ 
  public static var_wrap_s_0_2 instance = new var_wrap_s_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_766, IStrategoTerm d_766)
  { 
    context.push("var_wrap_s_0_2");
    Fail337:
    { 
      IStrategoTerm f_766 = null;
      IStrategoTerm g_766 = null;
      IStrategoTerm i_766 = null;
      IStrategoTerm j_766 = null;
      IStrategoTerm k_766 = null;
      i_766 = term;
      f_766 = transformer_debug.const284;
      j_766 = i_766;
      g_766 = transformer_debug.const295;
      k_766 = j_766;
      term = s_enter_0_3.instance.invoke(context, k_766, f_766, g_766, transformer_debug.constLocationInfo372);
      if(term == null)
        break Fail337;
      IStrategoTerm term169 = term;
      Success161:
      { 
        Fail338:
        { 
          IStrategoTerm e_766 = null;
          IStrategoTerm l_766 = null;
          IStrategoTerm m_766 = null;
          IStrategoTerm n_766 = null;
          IStrategoTerm p_766 = null;
          IStrategoTerm q_766 = null;
          IStrategoTerm r_766 = null;
          IStrategoTerm s_766 = null;
          IStrategoTerm t_766 = null;
          IStrategoTerm u_766 = null;
          IStrategoTerm v_766 = null;
          IStrategoTerm x_766 = null;
          IStrategoTerm y_766 = null;
          IStrategoTerm z_766 = null;
          IStrategoTerm a_767 = null;
          IStrategoTerm b_767 = null;
          IStrategoTerm c_767 = null;
          IStrategoTerm e_767 = null;
          IStrategoTerm f_767 = null;
          IStrategoTerm g_767 = null;
          IStrategoTerm i_767 = null;
          e_766 = term;
          p_766 = c_766;
          l_766 = transformer_debug.const284;
          q_766 = p_766;
          m_766 = transformer_debug.const295;
          r_766 = q_766;
          n_766 = transformer_debug.const238;
          s_766 = r_766;
          term = s_var_0_4.instance.invoke(context, s_766, l_766, m_766, n_766, transformer_debug.constLocationInfo373);
          if(term == null)
            break Fail338;
          x_766 = d_766;
          t_766 = transformer_debug.const284;
          y_766 = x_766;
          u_766 = transformer_debug.const295;
          z_766 = y_766;
          v_766 = transformer_debug.const239;
          a_767 = z_766;
          term = s_var_0_4.instance.invoke(context, a_767, t_766, u_766, v_766, transformer_debug.constLocationInfo374);
          if(term == null)
            break Fail338;
          e_767 = e_766;
          b_767 = transformer_debug.const284;
          f_767 = e_767;
          c_767 = transformer_debug.const295;
          g_767 = f_767;
          term = s_step_0_3.instance.invoke(context, g_767, b_767, c_767, transformer_debug.constLocationInfo375);
          if(term == null)
            break Fail338;
          i_767 = term;
          term = var_wrap_s_0_3.instance.invoke(context, i_767, c_766, d_766, transformer_debug.constNil1);
          if(term == null)
            break Fail338;
          { 
            IStrategoTerm j_767 = null;
            IStrategoTerm k_767 = null;
            IStrategoTerm m_767 = null;
            IStrategoTerm n_767 = null;
            IStrategoTerm o_767 = null;
            m_767 = term;
            j_767 = transformer_debug.const284;
            n_767 = m_767;
            k_767 = transformer_debug.const295;
            o_767 = n_767;
            term = s_exit_0_3.instance.invoke(context, o_767, j_767, k_767, transformer_debug.constLocationInfo372);
            if(term == null)
              break Fail337;
            if(true)
              break Success161;
          }
        }
        term = term169;
        IStrategoTerm p_767 = null;
        IStrategoTerm q_767 = null;
        IStrategoTerm s_767 = null;
        IStrategoTerm t_767 = null;
        IStrategoTerm u_767 = null;
        s_767 = term;
        p_767 = transformer_debug.const284;
        t_767 = s_767;
        q_767 = transformer_debug.const295;
        u_767 = t_767;
        term = s_exit_0_3.instance.invoke(context, u_767, p_767, q_767, transformer_debug.constLocationInfo372);
        if(term == null)
          break Fail337;
        if(true)
          break Fail337;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}