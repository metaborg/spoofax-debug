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

@SuppressWarnings("all") public class location_to_term_0_0 extends Strategy 
{ 
  public static location_to_term_0_0 instance = new location_to_term_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("location_to_term_0_0");
    Fail308:
    { 
      IStrategoTerm g_691 = null;
      IStrategoTerm h_691 = null;
      IStrategoTerm i_691 = null;
      IStrategoTerm j_691 = null;
      IStrategoTerm m_691 = null;
      IStrategoTerm n_691 = null;
      IStrategoTerm o_691 = null;
      IStrategoTerm q_691 = null;
      IStrategoTerm r_691 = null;
      IStrategoTerm s_691 = null;
      IStrategoTerm t_691 = null;
      IStrategoTerm u_691 = null;
      IStrategoTerm v_691 = null;
      IStrategoTerm w_691 = null;
      IStrategoTerm y_691 = null;
      IStrategoTerm z_691 = null;
      IStrategoTerm d_692 = null;
      IStrategoTerm e_692 = null;
      IStrategoTerm f_692 = null;
      IStrategoTerm q_694 = null;
      IStrategoTerm r_694 = null;
      IStrategoTerm t_694 = null;
      IStrategoTerm u_694 = null;
      IStrategoTerm v_694 = null;
      g_691 = term;
      m_691 = term;
      q_691 = term;
      n_691 = transformer_debug.const227;
      r_691 = q_691;
      o_691 = transformer_debug.const228;
      s_691 = r_691;
      term = r_enter_0_3.instance.invoke(context, s_691, n_691, o_691, transformer_debug.constLocationInfo161);
      if(term == null)
        break Fail308;
      t_691 = m_691;
      y_691 = g_691;
      u_691 = transformer_debug.const227;
      z_691 = y_691;
      v_691 = transformer_debug.const228;
      d_692 = z_691;
      w_691 = transformer_debug.const229;
      e_692 = d_692;
      term = s_var_0_4.instance.invoke(context, e_692, u_691, v_691, w_691, transformer_debug.constLocationInfo162);
      if(term == null)
        break Fail308;
      term = t_691;
      f_692 = t_691;
      IStrategoTerm term154 = term;
      Success148:
      { 
        Fail309:
        { 
          IStrategoTerm g_692 = null;
          IStrategoTerm h_692 = null;
          IStrategoTerm j_692 = null;
          IStrategoTerm k_692 = null;
          IStrategoTerm l_692 = null;
          IStrategoTerm m_692 = null;
          IStrategoTerm n_692 = null;
          IStrategoTerm p_692 = null;
          IStrategoTerm q_692 = null;
          IStrategoTerm r_692 = null;
          IStrategoTerm s_692 = null;
          IStrategoTerm t_692 = null;
          IStrategoTerm u_692 = null;
          IStrategoTerm w_692 = null;
          IStrategoTerm x_692 = null;
          IStrategoTerm y_692 = null;
          IStrategoTerm z_692 = null;
          IStrategoTerm a_693 = null;
          IStrategoTerm b_693 = null;
          IStrategoTerm d_693 = null;
          IStrategoTerm e_693 = null;
          IStrategoTerm f_693 = null;
          IStrategoTerm g_693 = null;
          IStrategoTerm h_693 = null;
          IStrategoTerm j_693 = null;
          IStrategoTerm k_693 = null;
          IStrategoTerm l_693 = null;
          IStrategoTerm s_693 = null;
          IStrategoTerm t_693 = null;
          IStrategoTerm u_693 = null;
          IStrategoTerm w_693 = null;
          IStrategoTerm x_693 = null;
          IStrategoTerm y_693 = null;
          IStrategoTerm z_693 = null;
          IStrategoTerm a_694 = null;
          IStrategoTerm b_694 = null;
          IStrategoTerm d_694 = null;
          IStrategoTerm e_694 = null;
          IStrategoTerm f_694 = null;
          IStrategoTerm g_694 = null;
          IStrategoTerm h_694 = null;
          IStrategoTerm i_694 = null;
          IStrategoTerm k_694 = null;
          IStrategoTerm l_694 = null;
          IStrategoTerm m_694 = null;
          IStrategoTerm n_694 = null;
          j_692 = term;
          g_692 = transformer_debug.const227;
          k_692 = j_692;
          h_692 = transformer_debug.const228;
          l_692 = k_692;
          term = s_step_0_3.instance.invoke(context, l_692, g_692, h_692, transformer_debug.constLocationInfo163);
          if(term == null)
            break Fail309;
          p_692 = g_691;
          m_692 = transformer_debug.const227;
          q_692 = p_692;
          n_692 = transformer_debug.const228;
          r_692 = q_692;
          term = s_step_0_3.instance.invoke(context, r_692, m_692, n_692, transformer_debug.constLocationInfo164);
          if(term == null)
            break Fail309;
          term = get_arguments_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail309;
          h_691 = term;
          w_692 = term;
          s_692 = transformer_debug.const227;
          x_692 = w_692;
          t_692 = transformer_debug.const228;
          y_692 = x_692;
          u_692 = transformer_debug.const230;
          z_692 = y_692;
          term = s_var_0_4.instance.invoke(context, z_692, s_692, t_692, u_692, transformer_debug.constLocationInfo165);
          if(term == null)
            break Fail309;
          d_693 = term;
          a_693 = transformer_debug.const227;
          e_693 = d_693;
          b_693 = transformer_debug.const228;
          f_693 = e_693;
          term = s_step_0_3.instance.invoke(context, f_693, a_693, b_693, transformer_debug.constLocationInfo166);
          if(term == null)
            break Fail309;
          j_693 = h_691;
          g_693 = transformer_debug.const227;
          k_693 = j_693;
          h_693 = transformer_debug.const228;
          l_693 = k_693;
          term = s_step_0_3.instance.invoke(context, l_693, g_693, h_693, transformer_debug.constLocationInfo167);
          if(term == null)
            break Fail309;
          term = map_1_0.instance.invoke(context, term, lifted116.instance);
          if(term == null)
            break Fail309;
          i_691 = term;
          w_693 = term;
          s_693 = transformer_debug.const227;
          x_693 = w_693;
          t_693 = transformer_debug.const228;
          y_693 = x_693;
          u_693 = transformer_debug.const191;
          z_693 = y_693;
          term = s_var_0_4.instance.invoke(context, z_693, s_693, t_693, u_693, transformer_debug.constLocationInfo169);
          if(term == null)
            break Fail309;
          d_694 = term;
          a_694 = transformer_debug.const227;
          e_694 = d_694;
          b_694 = transformer_debug.const228;
          f_694 = e_694;
          term = s_step_0_3.instance.invoke(context, f_694, a_694, b_694, transformer_debug.constLocationInfo170);
          if(term == null)
            break Fail309;
          term = termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consOp_2, new IStrategoTerm[]{transformer_debug.const231, i_691})});
          j_691 = term;
          k_694 = term;
          g_694 = transformer_debug.const227;
          l_694 = k_694;
          h_694 = transformer_debug.const228;
          m_694 = l_694;
          i_694 = transformer_debug.const232;
          n_694 = m_694;
          term = s_var_0_4.instance.invoke(context, n_694, g_694, h_694, i_694, transformer_debug.constLocationInfo171);
          if(term == null)
            break Fail309;
          if(true)
            break Success148;
        }
        term = term154;
        IStrategoTerm k_691 = null;
        IStrategoTerm l_691 = null;
        IStrategoTerm p_694 = null;
        k_691 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail308;
        l_691 = term;
        p_694 = k_691;
        term = report_with_failure_0_2.instance.invoke(context, p_694, transformer_debug.const233, l_691);
        if(term == null)
          break Fail308;
      }
      term = f_692;
      if(j_691 == null)
        break Fail308;
      t_694 = j_691;
      q_694 = transformer_debug.const227;
      u_694 = t_694;
      r_694 = transformer_debug.const228;
      v_694 = u_694;
      term = r_exit_0_3.instance.invoke(context, v_694, q_694, r_694, transformer_debug.constLocationInfo161);
      if(term == null)
        break Fail308;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}