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

@SuppressWarnings("all") public class create_dir_0_0 extends Strategy 
{ 
  public static create_dir_0_0 instance = new create_dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_dir_0_0");
    Fail417:
    { 
      IStrategoTerm j_1066 = null;
      TermReference k_1066 = new TermReference();
      IStrategoTerm l_1066 = null;
      IStrategoTerm m_1066 = null;
      IStrategoTerm o_1066 = null;
      IStrategoTerm p_1066 = null;
      IStrategoTerm q_1066 = null;
      o_1066 = term;
      l_1066 = transformer_debug.const571;
      p_1066 = o_1066;
      m_1066 = transformer_debug.const589;
      q_1066 = p_1066;
      term = s_enter_0_3.instance.invoke(context, q_1066, l_1066, m_1066, transformer_debug.constLocationInfo1129);
      if(term == null)
        break Fail417;
      IStrategoTerm term293 = term;
      Success204:
      { 
        Fail418:
        { 
          IStrategoTerm r_1066 = null;
          IStrategoTerm s_1066 = null;
          IStrategoTerm u_1066 = null;
          IStrategoTerm v_1066 = null;
          IStrategoTerm w_1066 = null;
          IStrategoTerm x_1066 = null;
          IStrategoTerm y_1066 = null;
          IStrategoTerm a_1067 = null;
          IStrategoTerm b_1067 = null;
          IStrategoTerm c_1067 = null;
          IStrategoTerm d_1067 = null;
          IStrategoTerm e_1067 = null;
          IStrategoTerm g_1067 = null;
          IStrategoTerm h_1067 = null;
          IStrategoTerm i_1067 = null;
          IStrategoTerm j_1067 = null;
          IStrategoTerm k_1067 = null;
          IStrategoTerm l_1067 = null;
          IStrategoTerm n_1067 = null;
          IStrategoTerm o_1067 = null;
          IStrategoTerm p_1067 = null;
          IStrategoTerm q_1067 = null;
          IStrategoTerm r_1067 = null;
          IStrategoTerm s_1067 = null;
          IStrategoTerm u_1067 = null;
          IStrategoTerm v_1067 = null;
          IStrategoTerm w_1067 = null;
          IStrategoTerm x_1067 = null;
          IStrategoTerm y_1067 = null;
          IStrategoTerm a_1068 = null;
          IStrategoTerm b_1068 = null;
          IStrategoTerm c_1068 = null;
          u_1066 = term;
          r_1066 = transformer_debug.const571;
          v_1066 = u_1066;
          s_1066 = transformer_debug.const589;
          w_1066 = v_1066;
          term = s_step_0_3.instance.invoke(context, w_1066, r_1066, s_1066, transformer_debug.constLocationInfo1130);
          if(term == null)
            break Fail418;
          if(k_1066.value == null)
            k_1066.value = term;
          else
            if(k_1066.value != term && !k_1066.value.match(term))
              break Fail418;
          a_1067 = term;
          x_1066 = transformer_debug.const571;
          b_1067 = a_1067;
          y_1066 = transformer_debug.const589;
          c_1067 = b_1067;
          term = s_step_0_3.instance.invoke(context, c_1067, x_1066, y_1066, transformer_debug.constLocationInfo1131);
          if(term == null)
            break Fail418;
          if(k_1066.value == null)
            break Fail418;
          g_1067 = k_1066.value;
          d_1067 = transformer_debug.const571;
          h_1067 = g_1067;
          e_1067 = transformer_debug.const589;
          i_1067 = h_1067;
          term = s_step_0_3.instance.invoke(context, i_1067, d_1067, e_1067, transformer_debug.constLocationInfo1132);
          if(term == null)
            break Fail418;
          term = dirname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail418;
          j_1066 = term;
          n_1067 = term;
          j_1067 = transformer_debug.const571;
          o_1067 = n_1067;
          k_1067 = transformer_debug.const589;
          p_1067 = o_1067;
          l_1067 = transformer_debug.const587;
          q_1067 = p_1067;
          term = s_var_0_4.instance.invoke(context, q_1067, j_1067, k_1067, l_1067, transformer_debug.constLocationInfo1133);
          if(term == null)
            break Fail418;
          u_1067 = j_1066;
          r_1067 = transformer_debug.const571;
          v_1067 = u_1067;
          s_1067 = transformer_debug.const589;
          w_1067 = v_1067;
          term = s_step_0_3.instance.invoke(context, w_1067, r_1067, s_1067, transformer_debug.constLocationInfo1136);
          if(term == null)
            break Fail418;
          term = check_dir_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail418;
          a_1068 = term;
          x_1067 = transformer_debug.const571;
          b_1068 = a_1068;
          y_1067 = transformer_debug.const589;
          c_1068 = b_1068;
          term = s_step_0_3.instance.invoke(context, c_1068, x_1067, y_1067, transformer_debug.constLocationInfo1137);
          if(term == null)
            break Fail418;
          lifted153 lifted1530 = new lifted153();
          lifted1530.k_1066 = k_1066;
          term = try_1_0.instance.invoke(context, term, lifted1530);
          if(term == null)
            break Fail418;
          { 
            IStrategoTerm p_1068 = null;
            IStrategoTerm q_1068 = null;
            IStrategoTerm s_1068 = null;
            IStrategoTerm t_1068 = null;
            IStrategoTerm u_1068 = null;
            s_1068 = term;
            p_1068 = transformer_debug.const571;
            t_1068 = s_1068;
            q_1068 = transformer_debug.const589;
            u_1068 = t_1068;
            term = s_exit_0_3.instance.invoke(context, u_1068, p_1068, q_1068, transformer_debug.constLocationInfo1129);
            if(term == null)
              break Fail417;
            if(true)
              break Success204;
          }
        }
        term = term293;
        IStrategoTerm v_1068 = null;
        IStrategoTerm w_1068 = null;
        IStrategoTerm y_1068 = null;
        IStrategoTerm z_1068 = null;
        IStrategoTerm a_1069 = null;
        y_1068 = term;
        v_1068 = transformer_debug.const571;
        z_1068 = y_1068;
        w_1068 = transformer_debug.const589;
        a_1069 = z_1068;
        term = s_exit_0_3.instance.invoke(context, a_1069, v_1068, w_1068, transformer_debug.constLocationInfo1129);
        if(term == null)
          break Fail417;
        if(true)
          break Fail417;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}