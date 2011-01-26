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

@SuppressWarnings("all") public class var_wrap_s_0_3 extends Strategy 
{ 
  public static var_wrap_s_0_3 instance = new var_wrap_s_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_760, IStrategoTerm ref_p_760, IStrategoTerm q_760)
  { 
    TermReference o_760 = new TermReference(ref_o_760);
    TermReference p_760 = new TermReference(ref_p_760);
    context.push("var_wrap_s_0_3");
    Fail333:
    { 
      IStrategoTerm r_760 = null;
      IStrategoTerm t_760 = null;
      IStrategoTerm u_760 = null;
      IStrategoTerm w_760 = null;
      IStrategoTerm x_760 = null;
      IStrategoTerm y_760 = null;
      w_760 = term;
      t_760 = transformer_debug.const284;
      x_760 = w_760;
      u_760 = transformer_debug.const295;
      y_760 = x_760;
      term = s_enter_0_3.instance.invoke(context, y_760, t_760, u_760, transformer_debug.constLocationInfo357);
      if(term == null)
        break Fail333;
      IStrategoTerm term167 = term;
      Success159:
      { 
        Fail334:
        { 
          IStrategoTerm s_760 = null;
          IStrategoTerm z_760 = null;
          IStrategoTerm b_761 = null;
          IStrategoTerm c_761 = null;
          IStrategoTerm f_761 = null;
          IStrategoTerm j_761 = null;
          IStrategoTerm k_761 = null;
          IStrategoTerm m_761 = null;
          IStrategoTerm n_761 = null;
          IStrategoTerm o_761 = null;
          IStrategoTerm p_761 = null;
          IStrategoTerm r_761 = null;
          IStrategoTerm t_761 = null;
          IStrategoTerm u_761 = null;
          IStrategoTerm v_761 = null;
          IStrategoTerm w_761 = null;
          IStrategoTerm x_761 = null;
          IStrategoTerm y_761 = null;
          IStrategoTerm a_762 = null;
          IStrategoTerm b_762 = null;
          IStrategoTerm c_762 = null;
          IStrategoTerm e_762 = null;
          IStrategoTerm f_762 = null;
          IStrategoTerm g_762 = null;
          IStrategoTerm i_762 = null;
          IStrategoTerm j_762 = null;
          IStrategoTerm k_762 = null;
          IStrategoTerm l_762 = null;
          IStrategoTerm n_762 = null;
          IStrategoTerm o_762 = null;
          IStrategoTerm q_762 = null;
          IStrategoTerm s_762 = null;
          IStrategoTerm t_762 = null;
          IStrategoTerm g_763 = null;
          IStrategoTerm h_763 = null;
          IStrategoTerm i_763 = null;
          IStrategoTerm k_763 = null;
          IStrategoTerm l_763 = null;
          IStrategoTerm m_763 = null;
          IStrategoTerm n_763 = null;
          s_760 = term;
          if(o_760.value == null)
            break Fail334;
          f_761 = o_760.value;
          z_760 = transformer_debug.const284;
          j_761 = f_761;
          b_761 = transformer_debug.const295;
          k_761 = j_761;
          c_761 = transformer_debug.const238;
          m_761 = k_761;
          term = s_var_0_4.instance.invoke(context, m_761, z_760, b_761, c_761, transformer_debug.constLocationInfo358);
          if(term == null)
            break Fail334;
          if(p_760.value == null)
            break Fail334;
          r_761 = p_760.value;
          n_761 = transformer_debug.const284;
          t_761 = r_761;
          o_761 = transformer_debug.const295;
          u_761 = t_761;
          p_761 = transformer_debug.const239;
          v_761 = u_761;
          term = s_var_0_4.instance.invoke(context, v_761, n_761, o_761, p_761, transformer_debug.constLocationInfo359);
          if(term == null)
            break Fail334;
          a_762 = q_760;
          w_761 = transformer_debug.const284;
          b_762 = a_762;
          x_761 = transformer_debug.const295;
          c_762 = b_762;
          y_761 = transformer_debug.const248;
          e_762 = c_762;
          term = s_var_0_4.instance.invoke(context, e_762, w_761, x_761, y_761, transformer_debug.constLocationInfo360);
          if(term == null)
            break Fail334;
          i_762 = s_760;
          f_762 = transformer_debug.const284;
          j_762 = i_762;
          g_762 = transformer_debug.const295;
          k_762 = j_762;
          term = s_step_0_3.instance.invoke(context, k_762, f_762, g_762, transformer_debug.constLocationInfo361);
          if(term == null)
            break Fail334;
          q_762 = term;
          n_762 = transformer_debug.const284;
          s_762 = q_762;
          o_762 = transformer_debug.const295;
          t_762 = s_762;
          term = s_step_0_3.instance.invoke(context, t_762, n_762, o_762, transformer_debug.constLocationInfo362);
          if(term == null)
            break Fail334;
          lifted127 lifted1270 = new lifted127();
          lifted1270.o_760 = o_760;
          lifted1270.p_760 = p_760;
          term = bottomup_1_0.instance.invoke(context, term, lifted1270);
          if(term == null)
            break Fail334;
          l_762 = term;
          r_760 = term;
          k_763 = l_762;
          g_763 = transformer_debug.const284;
          l_763 = k_763;
          h_763 = transformer_debug.const295;
          m_763 = l_763;
          i_763 = transformer_debug.const277;
          n_763 = m_763;
          term = s_var_0_4.instance.invoke(context, n_763, g_763, h_763, i_763, transformer_debug.constLocationInfo365);
          if(term == null)
            break Fail334;
          IStrategoTerm term168 = term;
          Success160:
          { 
            Fail335:
            { 
              IStrategoTerm o_763 = null;
              IStrategoTerm p_763 = null;
              IStrategoTerm r_763 = null;
              IStrategoTerm s_763 = null;
              IStrategoTerm t_763 = null;
              r_763 = q_760;
              o_763 = transformer_debug.const284;
              s_763 = r_763;
              p_763 = transformer_debug.const295;
              t_763 = s_763;
              term = s_step_0_3.instance.invoke(context, t_763, o_763, p_763, transformer_debug.constLocationInfo366);
              if(term == null)
                break Fail335;
              term = t_args_to_s_var_where_strategy_0_2.instance.invoke(context, term, o_760.value, p_760.value);
              if(term == null)
                break Fail335;
              { 
                IStrategoTerm u_763 = null;
                IStrategoTerm v_763 = null;
                IStrategoTerm x_763 = null;
                IStrategoTerm y_763 = null;
                IStrategoTerm z_763 = null;
                x_763 = term;
                u_763 = transformer_debug.const284;
                y_763 = x_763;
                v_763 = transformer_debug.const295;
                z_763 = y_763;
                term = s_step_0_3.instance.invoke(context, z_763, u_763, v_763, transformer_debug.constLocationInfo367);
                if(term == null)
                  break Fail334;
                term = combine_s_and_clause_0_1.instance.invoke(context, term, r_760);
                if(term == null)
                  break Fail334;
                if(true)
                  break Success160;
              }
            }
            term = term168;
            IStrategoTerm a_764 = null;
            IStrategoTerm b_764 = null;
            IStrategoTerm d_764 = null;
            IStrategoTerm e_764 = null;
            IStrategoTerm f_764 = null;
            d_764 = term;
            a_764 = transformer_debug.const284;
            e_764 = d_764;
            b_764 = transformer_debug.const295;
            f_764 = e_764;
            term = s_step_0_3.instance.invoke(context, f_764, a_764, b_764, transformer_debug.constLocationInfo368);
            if(term == null)
              break Fail334;
            term = r_760;
          }
          { 
            IStrategoTerm g_764 = null;
            IStrategoTerm h_764 = null;
            IStrategoTerm j_764 = null;
            IStrategoTerm k_764 = null;
            IStrategoTerm l_764 = null;
            j_764 = term;
            g_764 = transformer_debug.const284;
            k_764 = j_764;
            h_764 = transformer_debug.const295;
            l_764 = k_764;
            term = s_exit_0_3.instance.invoke(context, l_764, g_764, h_764, transformer_debug.constLocationInfo357);
            if(term == null)
              break Fail333;
            if(true)
              break Success159;
          }
        }
        term = term167;
        IStrategoTerm m_764 = null;
        IStrategoTerm n_764 = null;
        IStrategoTerm p_764 = null;
        IStrategoTerm q_764 = null;
        IStrategoTerm r_764 = null;
        p_764 = term;
        m_764 = transformer_debug.const284;
        q_764 = p_764;
        n_764 = transformer_debug.const295;
        r_764 = q_764;
        term = s_exit_0_3.instance.invoke(context, r_764, m_764, n_764, transformer_debug.constLocationInfo357);
        if(term == null)
          break Fail333;
        if(true)
          break Fail333;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}