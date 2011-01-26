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

@SuppressWarnings("all") public class create_args_array_0_4 extends Strategy 
{ 
  public static create_args_array_0_4 instance = new create_args_array_0_4();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm l_809, IStrategoTerm m_809, IStrategoTerm n_809, IStrategoTerm o_809)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_args_array_0_4");
    Fail358:
    { 
      IStrategoTerm q_809 = null;
      IStrategoTerm r_809 = null;
      IStrategoTerm t_809 = null;
      IStrategoTerm u_809 = null;
      IStrategoTerm w_809 = null;
      t_809 = term;
      q_809 = transformer_debug.const284;
      u_809 = t_809;
      r_809 = transformer_debug.const357;
      w_809 = u_809;
      term = s_enter_0_3.instance.invoke(context, w_809, q_809, r_809, transformer_debug.constLocationInfo489);
      if(term == null)
        break Fail358;
      IStrategoTerm term184 = term;
      Success174:
      { 
        Fail359:
        { 
          IStrategoTerm p_809 = null;
          IStrategoTerm x_809 = null;
          IStrategoTerm y_809 = null;
          IStrategoTerm z_809 = null;
          IStrategoTerm b_810 = null;
          IStrategoTerm c_810 = null;
          IStrategoTerm d_810 = null;
          IStrategoTerm e_810 = null;
          IStrategoTerm f_810 = null;
          IStrategoTerm g_810 = null;
          IStrategoTerm h_810 = null;
          IStrategoTerm j_810 = null;
          IStrategoTerm k_810 = null;
          IStrategoTerm l_810 = null;
          IStrategoTerm m_810 = null;
          IStrategoTerm n_810 = null;
          IStrategoTerm o_810 = null;
          IStrategoTerm p_810 = null;
          IStrategoTerm r_810 = null;
          IStrategoTerm s_810 = null;
          IStrategoTerm t_810 = null;
          IStrategoTerm u_810 = null;
          IStrategoTerm z_810 = null;
          IStrategoTerm a_811 = null;
          IStrategoTerm c_811 = null;
          IStrategoTerm h_811 = null;
          IStrategoTerm i_811 = null;
          IStrategoTerm k_811 = null;
          IStrategoTerm l_811 = null;
          IStrategoTerm m_811 = null;
          IStrategoTerm n_811 = null;
          IStrategoTerm p_811 = null;
          IStrategoTerm r_811 = null;
          IStrategoTerm s_811 = null;
          IStrategoTerm t_811 = null;
          IStrategoTerm y_811 = null;
          IStrategoTerm z_811 = null;
          IStrategoTerm c_812 = null;
          IStrategoTerm d_812 = null;
          IStrategoTerm e_812 = null;
          IStrategoTerm u_811 = null;
          IStrategoTerm g_812 = null;
          IStrategoTerm h_812 = null;
          IStrategoTerm j_812 = null;
          IStrategoTerm k_812 = null;
          IStrategoTerm l_812 = null;
          IStrategoTerm v_811 = null;
          IStrategoTerm o_812 = null;
          IStrategoTerm p_812 = null;
          IStrategoTerm r_812 = null;
          IStrategoTerm s_812 = null;
          IStrategoTerm t_812 = null;
          IStrategoTerm v_812 = null;
          IStrategoTerm w_812 = null;
          IStrategoTerm y_812 = null;
          IStrategoTerm z_812 = null;
          IStrategoTerm a_813 = null;
          p_809 = term;
          b_810 = l_809;
          x_809 = transformer_debug.const284;
          c_810 = b_810;
          y_809 = transformer_debug.const357;
          d_810 = c_810;
          z_809 = transformer_debug.const238;
          e_810 = d_810;
          term = s_var_0_4.instance.invoke(context, e_810, x_809, y_809, z_809, transformer_debug.constLocationInfo490);
          if(term == null)
            break Fail359;
          j_810 = m_809;
          f_810 = transformer_debug.const284;
          k_810 = j_810;
          g_810 = transformer_debug.const357;
          l_810 = k_810;
          h_810 = transformer_debug.const239;
          m_810 = l_810;
          term = s_var_0_4.instance.invoke(context, m_810, f_810, g_810, h_810, transformer_debug.constLocationInfo491);
          if(term == null)
            break Fail359;
          r_810 = n_809;
          n_810 = transformer_debug.const284;
          s_810 = r_810;
          o_810 = transformer_debug.const357;
          t_810 = s_810;
          p_810 = transformer_debug.const257;
          u_810 = t_810;
          term = s_var_0_4.instance.invoke(context, u_810, n_810, o_810, p_810, transformer_debug.constLocationInfo492);
          if(term == null)
            break Fail359;
          h_811 = o_809;
          z_810 = transformer_debug.const284;
          i_811 = h_811;
          a_811 = transformer_debug.const357;
          k_811 = i_811;
          c_811 = transformer_debug.const235;
          l_811 = k_811;
          term = s_var_0_4.instance.invoke(context, l_811, z_810, a_811, c_811, transformer_debug.constLocationInfo493);
          if(term == null)
            break Fail359;
          p_811 = p_809;
          m_811 = transformer_debug.const284;
          r_811 = p_811;
          n_811 = transformer_debug.const357;
          s_811 = r_811;
          term = s_step_0_3.instance.invoke(context, s_811, m_811, n_811, transformer_debug.constLocationInfo494);
          if(term == null)
            break Fail359;
          c_812 = l_809;
          y_811 = transformer_debug.const284;
          d_812 = c_812;
          z_811 = transformer_debug.const357;
          e_812 = d_812;
          term = s_step_0_3.instance.invoke(context, e_812, y_811, z_811, transformer_debug.constLocationInfo495);
          if(term == null)
            break Fail359;
          term = to_string_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail359;
          t_811 = term;
          j_812 = m_809;
          g_812 = transformer_debug.const284;
          k_812 = j_812;
          h_812 = transformer_debug.const357;
          l_812 = k_812;
          term = s_step_0_3.instance.invoke(context, l_812, g_812, h_812, transformer_debug.constLocationInfo496);
          if(term == null)
            break Fail359;
          term = to_string_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail359;
          u_811 = term;
          r_812 = n_809;
          o_812 = transformer_debug.const284;
          s_812 = r_812;
          p_812 = transformer_debug.const357;
          t_812 = s_812;
          term = s_step_0_3.instance.invoke(context, t_812, o_812, p_812, transformer_debug.constLocationInfo497);
          if(term == null)
            break Fail359;
          term = to_string_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail359;
          v_811 = term;
          y_812 = o_809;
          v_812 = transformer_debug.const284;
          z_812 = y_812;
          w_812 = transformer_debug.const357;
          a_813 = z_812;
          term = s_step_0_3.instance.invoke(context, a_813, v_812, w_812, transformer_debug.constLocationInfo498);
          if(term == null)
            break Fail359;
          term = location_to_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail359;
          term = (IStrategoTerm)termFactory.makeListCons(t_811, termFactory.makeListCons(u_811, termFactory.makeListCons(v_811, termFactory.makeListCons(term, (IStrategoList)transformer_debug.constNil1))));
          { 
            IStrategoTerm b_813 = null;
            IStrategoTerm c_813 = null;
            IStrategoTerm e_813 = null;
            IStrategoTerm f_813 = null;
            IStrategoTerm g_813 = null;
            e_813 = term;
            b_813 = transformer_debug.const284;
            f_813 = e_813;
            c_813 = transformer_debug.const357;
            g_813 = f_813;
            term = s_exit_0_3.instance.invoke(context, g_813, b_813, c_813, transformer_debug.constLocationInfo489);
            if(term == null)
              break Fail358;
            if(true)
              break Success174;
          }
        }
        term = term184;
        IStrategoTerm h_813 = null;
        IStrategoTerm i_813 = null;
        IStrategoTerm k_813 = null;
        IStrategoTerm l_813 = null;
        IStrategoTerm m_813 = null;
        k_813 = term;
        h_813 = transformer_debug.const284;
        l_813 = k_813;
        i_813 = transformer_debug.const357;
        m_813 = l_813;
        term = s_exit_0_3.instance.invoke(context, m_813, h_813, i_813, transformer_debug.constLocationInfo489);
        if(term == null)
          break Fail358;
        if(true)
          break Fail358;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}