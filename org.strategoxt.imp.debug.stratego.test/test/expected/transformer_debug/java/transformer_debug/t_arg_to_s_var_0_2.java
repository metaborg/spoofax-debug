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

@SuppressWarnings("all") public class t_arg_to_s_var_0_2 extends Strategy 
{ 
  public static t_arg_to_s_var_0_2 instance = new t_arg_to_s_var_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm m_713, IStrategoTerm n_713)
  { 
    context.push("t_arg_to_s_var_0_2");
    Fail318:
    { 
      IStrategoTerm o_713 = null;
      IStrategoTerm p_713 = null;
      IStrategoTerm q_713 = null;
      IStrategoTerm r_713 = null;
      IStrategoTerm u_713 = null;
      IStrategoTerm v_713 = null;
      IStrategoTerm w_713 = null;
      IStrategoTerm z_713 = null;
      IStrategoTerm a_714 = null;
      IStrategoTerm b_714 = null;
      IStrategoTerm c_714 = null;
      IStrategoTerm d_714 = null;
      IStrategoTerm e_714 = null;
      IStrategoTerm f_714 = null;
      IStrategoTerm h_714 = null;
      IStrategoTerm i_714 = null;
      IStrategoTerm j_714 = null;
      IStrategoTerm k_714 = null;
      IStrategoTerm l_714 = null;
      IStrategoTerm m_714 = null;
      IStrategoTerm n_714 = null;
      IStrategoTerm p_714 = null;
      IStrategoTerm q_714 = null;
      IStrategoTerm r_714 = null;
      IStrategoTerm s_714 = null;
      IStrategoTerm t_714 = null;
      IStrategoTerm u_714 = null;
      IStrategoTerm v_714 = null;
      IStrategoTerm w_714 = null;
      IStrategoTerm y_714 = null;
      IStrategoTerm z_714 = null;
      IStrategoTerm a_715 = null;
      IStrategoTerm b_715 = null;
      IStrategoTerm c_715 = null;
      IStrategoTerm d_715 = null;
      IStrategoTerm e_715 = null;
      IStrategoTerm g_715 = null;
      IStrategoTerm h_715 = null;
      IStrategoTerm i_715 = null;
      IStrategoTerm j_715 = null;
      IStrategoTerm k_715 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consDefaultVarDec_1 != ((IStrategoAppl)term).getConstructor())
        break Fail318;
      p_713 = term.getSubterm(0);
      IStrategoList annos58 = term.getAnnotations();
      if(annos58.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos58).isEmpty())
        break Fail318;
      o_713 = ((IStrategoList)annos58).head();
      IStrategoTerm arg110 = ((IStrategoList)annos58).tail();
      if(arg110.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg110).isEmpty())
        break Fail318;
      u_713 = term;
      z_713 = term;
      v_713 = transformer_debug.const236;
      a_714 = z_713;
      w_713 = transformer_debug.const251;
      b_714 = a_714;
      term = r_enter_0_3.instance.invoke(context, b_714, v_713, w_713, transformer_debug.constLocationInfo230);
      if(term == null)
        break Fail318;
      c_714 = u_713;
      h_714 = m_713;
      d_714 = transformer_debug.const236;
      i_714 = h_714;
      e_714 = transformer_debug.const251;
      j_714 = i_714;
      f_714 = transformer_debug.const238;
      k_714 = j_714;
      term = s_var_0_4.instance.invoke(context, k_714, d_714, e_714, f_714, transformer_debug.constLocationInfo231);
      if(term == null)
        break Fail318;
      p_714 = n_713;
      l_714 = transformer_debug.const236;
      q_714 = p_714;
      m_714 = transformer_debug.const251;
      r_714 = q_714;
      n_714 = transformer_debug.const239;
      s_714 = r_714;
      term = s_var_0_4.instance.invoke(context, s_714, l_714, m_714, n_714, transformer_debug.constLocationInfo232);
      if(term == null)
        break Fail318;
      t_714 = c_714;
      y_714 = p_713;
      u_714 = transformer_debug.const236;
      z_714 = y_714;
      v_714 = transformer_debug.const251;
      a_715 = z_714;
      w_714 = transformer_debug.const252;
      b_715 = a_715;
      term = s_var_0_4.instance.invoke(context, b_715, u_714, v_714, w_714, transformer_debug.constLocationInfo233);
      if(term == null)
        break Fail318;
      g_715 = o_713;
      c_715 = transformer_debug.const236;
      h_715 = g_715;
      d_715 = transformer_debug.const251;
      i_715 = h_715;
      e_715 = transformer_debug.const235;
      j_715 = i_715;
      term = s_var_0_4.instance.invoke(context, j_715, c_715, d_715, e_715, transformer_debug.constLocationInfo234);
      if(term == null)
        break Fail318;
      term = t_714;
      k_715 = t_714;
      IStrategoTerm term158 = term;
      Success152:
      { 
        Fail319:
        { 
          IStrategoTerm l_715 = null;
          IStrategoTerm m_715 = null;
          IStrategoTerm o_715 = null;
          IStrategoTerm p_715 = null;
          IStrategoTerm q_715 = null;
          IStrategoTerm r_715 = null;
          IStrategoTerm s_715 = null;
          IStrategoTerm u_715 = null;
          IStrategoTerm v_715 = null;
          IStrategoTerm w_715 = null;
          IStrategoTerm x_715 = null;
          IStrategoTerm y_715 = null;
          IStrategoTerm z_715 = null;
          IStrategoTerm b_716 = null;
          IStrategoTerm c_716 = null;
          IStrategoTerm d_716 = null;
          IStrategoTerm e_716 = null;
          IStrategoTerm f_716 = null;
          IStrategoTerm g_716 = null;
          IStrategoTerm i_716 = null;
          IStrategoTerm j_716 = null;
          IStrategoTerm k_716 = null;
          IStrategoTerm l_716 = null;
          IStrategoTerm m_716 = null;
          IStrategoTerm o_716 = null;
          IStrategoTerm p_716 = null;
          IStrategoTerm q_716 = null;
          IStrategoTerm r_716 = null;
          IStrategoTerm t_716 = null;
          IStrategoTerm u_716 = null;
          IStrategoTerm w_716 = null;
          IStrategoTerm x_716 = null;
          IStrategoTerm y_716 = null;
          IStrategoTerm z_716 = null;
          o_715 = term;
          l_715 = transformer_debug.const236;
          p_715 = o_715;
          m_715 = transformer_debug.const251;
          q_715 = p_715;
          term = s_step_0_3.instance.invoke(context, q_715, l_715, m_715, transformer_debug.constLocationInfo235);
          if(term == null)
            break Fail319;
          u_715 = p_713;
          r_715 = transformer_debug.const236;
          v_715 = u_715;
          s_715 = transformer_debug.const251;
          w_715 = v_715;
          term = s_step_0_3.instance.invoke(context, w_715, r_715, s_715, transformer_debug.constLocationInfo236);
          if(term == null)
            break Fail319;
          term = create_var_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail319;
          q_713 = term;
          b_716 = term;
          x_715 = transformer_debug.const236;
          c_716 = b_716;
          y_715 = transformer_debug.const251;
          d_716 = c_716;
          z_715 = transformer_debug.const253;
          e_716 = d_716;
          term = s_var_0_4.instance.invoke(context, e_716, x_715, y_715, z_715, transformer_debug.constLocationInfo237);
          if(term == null)
            break Fail319;
          i_716 = term;
          f_716 = transformer_debug.const236;
          j_716 = i_716;
          g_716 = transformer_debug.const251;
          k_716 = j_716;
          term = s_step_0_3.instance.invoke(context, k_716, f_716, g_716, transformer_debug.constLocationInfo238);
          if(term == null)
            break Fail319;
          o_716 = q_713;
          l_716 = transformer_debug.const236;
          p_716 = o_716;
          m_716 = transformer_debug.const251;
          q_716 = p_716;
          term = s_step_0_3.instance.invoke(context, q_716, l_716, m_716, transformer_debug.constLocationInfo239);
          if(term == null)
            break Fail319;
          term = create_s_var_call_with_term_0_2.instance.invoke(context, term, m_713, n_713);
          if(term == null)
            break Fail319;
          r_713 = term;
          w_716 = term;
          r_716 = transformer_debug.const236;
          x_716 = w_716;
          t_716 = transformer_debug.const251;
          y_716 = x_716;
          u_716 = transformer_debug.const254;
          z_716 = y_716;
          term = s_var_0_4.instance.invoke(context, z_716, r_716, t_716, u_716, transformer_debug.constLocationInfo240);
          if(term == null)
            break Fail319;
          if(true)
            break Success152;
        }
        term = term158;
        IStrategoTerm s_713 = null;
        IStrategoTerm t_713 = null;
        IStrategoTerm b_717 = null;
        s_713 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail318;
        t_713 = term;
        b_717 = s_713;
        term = report_with_failure_0_2.instance.invoke(context, b_717, transformer_debug.const255, t_713);
        if(term == null)
          break Fail318;
      }
      term = k_715;
      IStrategoTerm c_717 = null;
      IStrategoTerm d_717 = null;
      IStrategoTerm f_717 = null;
      IStrategoTerm g_717 = null;
      IStrategoTerm h_717 = null;
      if(r_713 == null)
        break Fail318;
      f_717 = r_713;
      c_717 = transformer_debug.const236;
      g_717 = f_717;
      d_717 = transformer_debug.const251;
      h_717 = g_717;
      term = r_exit_0_3.instance.invoke(context, h_717, c_717, d_717, transformer_debug.constLocationInfo230);
      if(term == null)
        break Fail318;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}