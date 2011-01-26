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

@SuppressWarnings("all") public class create_s_var_call_0_4 extends Strategy 
{ 
  public static create_s_var_call_0_4 instance = new create_s_var_call_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm w_805, IStrategoTerm x_805, IStrategoTerm y_805, IStrategoTerm z_805)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_s_var_call_0_4");
    Fail356:
    { 
      IStrategoTerm a_806 = null;
      IStrategoTerm d_806 = null;
      IStrategoTerm e_806 = null;
      IStrategoTerm g_806 = null;
      IStrategoTerm h_806 = null;
      IStrategoTerm j_806 = null;
      g_806 = term;
      d_806 = transformer_debug.const284;
      h_806 = g_806;
      e_806 = transformer_debug.const351;
      j_806 = h_806;
      term = s_enter_0_3.instance.invoke(context, j_806, d_806, e_806, transformer_debug.constLocationInfo479);
      if(term == null)
        break Fail356;
      IStrategoTerm term183 = term;
      Success173:
      { 
        Fail357:
        { 
          IStrategoTerm b_806 = null;
          IStrategoTerm k_806 = null;
          IStrategoTerm l_806 = null;
          IStrategoTerm m_806 = null;
          IStrategoTerm o_806 = null;
          IStrategoTerm p_806 = null;
          IStrategoTerm q_806 = null;
          IStrategoTerm r_806 = null;
          IStrategoTerm s_806 = null;
          IStrategoTerm t_806 = null;
          IStrategoTerm u_806 = null;
          IStrategoTerm w_806 = null;
          IStrategoTerm x_806 = null;
          IStrategoTerm y_806 = null;
          IStrategoTerm z_806 = null;
          IStrategoTerm b_807 = null;
          IStrategoTerm c_807 = null;
          IStrategoTerm d_807 = null;
          IStrategoTerm f_807 = null;
          IStrategoTerm g_807 = null;
          IStrategoTerm h_807 = null;
          IStrategoTerm i_807 = null;
          IStrategoTerm j_807 = null;
          IStrategoTerm k_807 = null;
          IStrategoTerm l_807 = null;
          IStrategoTerm n_807 = null;
          IStrategoTerm o_807 = null;
          IStrategoTerm p_807 = null;
          IStrategoTerm q_807 = null;
          IStrategoTerm r_807 = null;
          IStrategoTerm s_807 = null;
          IStrategoTerm u_807 = null;
          IStrategoTerm v_807 = null;
          IStrategoTerm w_807 = null;
          IStrategoTerm c_806 = null;
          IStrategoTerm x_807 = null;
          IStrategoTerm y_807 = null;
          IStrategoTerm a_808 = null;
          IStrategoTerm b_808 = null;
          IStrategoTerm c_808 = null;
          IStrategoTerm d_808 = null;
          IStrategoTerm f_808 = null;
          IStrategoTerm g_808 = null;
          IStrategoTerm i_808 = null;
          IStrategoTerm j_808 = null;
          IStrategoTerm k_808 = null;
          IStrategoTerm l_808 = null;
          IStrategoTerm m_808 = null;
          IStrategoTerm n_808 = null;
          IStrategoTerm p_808 = null;
          IStrategoTerm q_808 = null;
          IStrategoTerm r_808 = null;
          IStrategoTerm s_808 = null;
          IStrategoTerm t_808 = null;
          IStrategoTerm u_808 = null;
          IStrategoTerm w_808 = null;
          IStrategoTerm x_808 = null;
          IStrategoTerm y_808 = null;
          b_806 = term;
          o_806 = w_805;
          k_806 = transformer_debug.const284;
          p_806 = o_806;
          l_806 = transformer_debug.const351;
          q_806 = p_806;
          m_806 = transformer_debug.const238;
          r_806 = q_806;
          term = s_var_0_4.instance.invoke(context, r_806, k_806, l_806, m_806, transformer_debug.constLocationInfo480);
          if(term == null)
            break Fail357;
          w_806 = x_805;
          s_806 = transformer_debug.const284;
          x_806 = w_806;
          t_806 = transformer_debug.const351;
          y_806 = x_806;
          u_806 = transformer_debug.const239;
          z_806 = y_806;
          term = s_var_0_4.instance.invoke(context, z_806, s_806, t_806, u_806, transformer_debug.constLocationInfo481);
          if(term == null)
            break Fail357;
          f_807 = y_805;
          b_807 = transformer_debug.const284;
          g_807 = f_807;
          c_807 = transformer_debug.const351;
          h_807 = g_807;
          d_807 = transformer_debug.const257;
          i_807 = h_807;
          term = s_var_0_4.instance.invoke(context, i_807, b_807, c_807, d_807, transformer_debug.constLocationInfo482);
          if(term == null)
            break Fail357;
          n_807 = z_805;
          j_807 = transformer_debug.const284;
          o_807 = n_807;
          k_807 = transformer_debug.const351;
          p_807 = o_807;
          l_807 = transformer_debug.const235;
          q_807 = p_807;
          term = s_var_0_4.instance.invoke(context, q_807, j_807, k_807, l_807, transformer_debug.constLocationInfo483);
          if(term == null)
            break Fail357;
          u_807 = b_806;
          r_807 = transformer_debug.const284;
          v_807 = u_807;
          s_807 = transformer_debug.const351;
          w_807 = v_807;
          term = s_step_0_3.instance.invoke(context, w_807, r_807, s_807, transformer_debug.constLocationInfo484);
          if(term == null)
            break Fail357;
          c_806 = term;
          a_808 = term;
          x_807 = transformer_debug.const284;
          b_808 = a_808;
          y_807 = transformer_debug.const351;
          c_808 = b_808;
          term = s_step_0_3.instance.invoke(context, c_808, x_807, y_807, transformer_debug.constLocationInfo485);
          if(term == null)
            break Fail357;
          i_808 = term;
          f_808 = transformer_debug.const284;
          j_808 = i_808;
          g_808 = transformer_debug.const351;
          k_808 = j_808;
          term = s_step_0_3.instance.invoke(context, k_808, f_808, g_808, transformer_debug.constLocationInfo486);
          if(term == null)
            break Fail357;
          term = create_args_array_0_4.instance.invoke(context, term, w_805, x_805, y_805, z_805);
          if(term == null)
            break Fail357;
          d_808 = term;
          a_806 = term;
          p_808 = d_808;
          l_808 = transformer_debug.const284;
          q_808 = p_808;
          m_808 = transformer_debug.const351;
          r_808 = q_808;
          n_808 = transformer_debug.const248;
          s_808 = r_808;
          term = s_var_0_4.instance.invoke(context, s_808, l_808, m_808, n_808, transformer_debug.constLocationInfo487);
          if(term == null)
            break Fail357;
          w_808 = c_806;
          t_808 = transformer_debug.const284;
          x_808 = w_808;
          u_808 = transformer_debug.const351;
          y_808 = x_808;
          term = s_step_0_3.instance.invoke(context, y_808, t_808, u_808, transformer_debug.constLocationInfo488);
          if(term == null)
            break Fail357;
          term = termFactory.makeAppl(transformer_debug._consCallT_3, new IStrategoTerm[]{transformer_debug.constSVar0, transformer_debug.constNil1, a_806});
          { 
            IStrategoTerm z_808 = null;
            IStrategoTerm a_809 = null;
            IStrategoTerm c_809 = null;
            IStrategoTerm d_809 = null;
            IStrategoTerm e_809 = null;
            c_809 = term;
            z_808 = transformer_debug.const284;
            d_809 = c_809;
            a_809 = transformer_debug.const351;
            e_809 = d_809;
            term = s_exit_0_3.instance.invoke(context, e_809, z_808, a_809, transformer_debug.constLocationInfo479);
            if(term == null)
              break Fail356;
            if(true)
              break Success173;
          }
        }
        term = term183;
        IStrategoTerm f_809 = null;
        IStrategoTerm g_809 = null;
        IStrategoTerm i_809 = null;
        IStrategoTerm j_809 = null;
        IStrategoTerm k_809 = null;
        i_809 = term;
        f_809 = transformer_debug.const284;
        j_809 = i_809;
        g_809 = transformer_debug.const351;
        k_809 = j_809;
        term = s_exit_0_3.instance.invoke(context, k_809, f_809, g_809, transformer_debug.constLocationInfo479);
        if(term == null)
          break Fail356;
        if(true)
          break Fail356;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}