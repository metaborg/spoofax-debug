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

@SuppressWarnings("all") public class write_stratego_rtree_0_1 extends Strategy 
{ 
  public static write_stratego_rtree_0_1 instance = new write_stratego_rtree_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm p_1043)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("write_stratego_rtree_0_1");
    Fail409:
    { 
      IStrategoTerm r_1043 = null;
      IStrategoTerm u_1043 = null;
      IStrategoTerm v_1043 = null;
      IStrategoTerm x_1043 = null;
      IStrategoTerm y_1043 = null;
      IStrategoTerm z_1043 = null;
      x_1043 = term;
      u_1043 = transformer_debug.const571;
      y_1043 = x_1043;
      v_1043 = transformer_debug.const575;
      z_1043 = y_1043;
      term = s_enter_0_3.instance.invoke(context, z_1043, u_1043, v_1043, transformer_debug.constLocationInfo1089);
      if(term == null)
        break Fail409;
      IStrategoTerm term289 = term;
      Success200:
      { 
        Fail410:
        { 
          IStrategoTerm s_1043 = null;
          IStrategoTerm a_1044 = null;
          IStrategoTerm b_1044 = null;
          IStrategoTerm c_1044 = null;
          IStrategoTerm e_1044 = null;
          IStrategoTerm f_1044 = null;
          IStrategoTerm g_1044 = null;
          IStrategoTerm h_1044 = null;
          IStrategoTerm i_1044 = null;
          IStrategoTerm j_1044 = null;
          IStrategoTerm l_1044 = null;
          IStrategoTerm m_1044 = null;
          IStrategoTerm n_1044 = null;
          IStrategoTerm t_1043 = null;
          IStrategoTerm o_1044 = null;
          IStrategoTerm p_1044 = null;
          IStrategoTerm r_1044 = null;
          IStrategoTerm s_1044 = null;
          IStrategoTerm t_1044 = null;
          IStrategoTerm a_1045 = null;
          IStrategoTerm b_1045 = null;
          IStrategoTerm d_1045 = null;
          IStrategoTerm e_1045 = null;
          IStrategoTerm f_1045 = null;
          IStrategoTerm g_1045 = null;
          IStrategoTerm h_1045 = null;
          IStrategoTerm j_1045 = null;
          IStrategoTerm k_1045 = null;
          IStrategoTerm l_1045 = null;
          IStrategoTerm m_1045 = null;
          IStrategoTerm n_1045 = null;
          IStrategoTerm p_1045 = null;
          IStrategoTerm q_1045 = null;
          IStrategoTerm r_1045 = null;
          IStrategoTerm s_1045 = null;
          IStrategoTerm t_1045 = null;
          IStrategoTerm v_1045 = null;
          IStrategoTerm w_1045 = null;
          IStrategoTerm x_1045 = null;
          IStrategoTerm y_1045 = null;
          IStrategoTerm z_1045 = null;
          IStrategoTerm b_1046 = null;
          IStrategoTerm c_1046 = null;
          IStrategoTerm d_1046 = null;
          s_1043 = term;
          e_1044 = p_1043;
          a_1044 = transformer_debug.const571;
          f_1044 = e_1044;
          b_1044 = transformer_debug.const575;
          g_1044 = f_1044;
          c_1044 = transformer_debug.const194;
          h_1044 = g_1044;
          term = s_var_0_4.instance.invoke(context, h_1044, a_1044, b_1044, c_1044, transformer_debug.constLocationInfo1090);
          if(term == null)
            break Fail410;
          l_1044 = s_1043;
          i_1044 = transformer_debug.const571;
          m_1044 = l_1044;
          j_1044 = transformer_debug.const575;
          n_1044 = m_1044;
          term = s_step_0_3.instance.invoke(context, n_1044, i_1044, j_1044, transformer_debug.constLocationInfo1091);
          if(term == null)
            break Fail410;
          t_1043 = term;
          r_1044 = p_1043;
          o_1044 = transformer_debug.const571;
          s_1044 = r_1044;
          p_1044 = transformer_debug.const575;
          t_1044 = s_1044;
          term = s_step_0_3.instance.invoke(context, t_1044, o_1044, p_1044, transformer_debug.constLocationInfo1092);
          if(term == null)
            break Fail410;
          term = debug_1_0.instance.invoke(context, term, lifted151.instance);
          if(term == null)
            break Fail410;
          d_1045 = t_1043;
          a_1045 = transformer_debug.const571;
          e_1045 = d_1045;
          b_1045 = transformer_debug.const575;
          f_1045 = e_1045;
          term = s_step_0_3.instance.invoke(context, f_1045, a_1045, b_1045, transformer_debug.constLocationInfo1094);
          if(term == null)
            break Fail410;
          r_1043 = term;
          j_1045 = term;
          g_1045 = transformer_debug.const571;
          k_1045 = j_1045;
          h_1045 = transformer_debug.const575;
          l_1045 = k_1045;
          term = s_step_0_3.instance.invoke(context, l_1045, g_1045, h_1045, transformer_debug.constLocationInfo1095);
          if(term == null)
            break Fail410;
          p_1045 = p_1043;
          m_1045 = transformer_debug.const571;
          q_1045 = p_1045;
          n_1045 = transformer_debug.const575;
          r_1045 = q_1045;
          term = s_step_0_3.instance.invoke(context, r_1045, m_1045, n_1045, transformer_debug.constLocationInfo1096);
          if(term == null)
            break Fail410;
          term = dirname_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail410;
          v_1045 = term;
          s_1045 = transformer_debug.const571;
          w_1045 = v_1045;
          t_1045 = transformer_debug.const575;
          x_1045 = w_1045;
          term = s_step_0_3.instance.invoke(context, x_1045, s_1045, t_1045, transformer_debug.constLocationInfo1097);
          if(term == null)
            break Fail410;
          term = check_dir_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail410;
          term = termFactory.makeTuple(p_1043, r_1043);
          b_1046 = term;
          y_1045 = transformer_debug.const571;
          c_1046 = b_1046;
          z_1045 = transformer_debug.const575;
          d_1046 = c_1046;
          term = s_step_0_3.instance.invoke(context, d_1046, y_1045, z_1045, transformer_debug.constLocationInfo1098);
          if(term == null)
            break Fail410;
          term = $Write$To$Binary$File_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail410;
          { 
            IStrategoTerm e_1046 = null;
            IStrategoTerm f_1046 = null;
            IStrategoTerm h_1046 = null;
            IStrategoTerm i_1046 = null;
            IStrategoTerm j_1046 = null;
            h_1046 = term;
            e_1046 = transformer_debug.const571;
            i_1046 = h_1046;
            f_1046 = transformer_debug.const575;
            j_1046 = i_1046;
            term = s_exit_0_3.instance.invoke(context, j_1046, e_1046, f_1046, transformer_debug.constLocationInfo1089);
            if(term == null)
              break Fail409;
            if(true)
              break Success200;
          }
        }
        term = term289;
        IStrategoTerm k_1046 = null;
        IStrategoTerm l_1046 = null;
        IStrategoTerm n_1046 = null;
        IStrategoTerm o_1046 = null;
        IStrategoTerm p_1046 = null;
        n_1046 = term;
        k_1046 = transformer_debug.const571;
        o_1046 = n_1046;
        l_1046 = transformer_debug.const575;
        p_1046 = o_1046;
        term = s_exit_0_3.instance.invoke(context, p_1046, k_1046, l_1046, transformer_debug.constLocationInfo1089);
        if(term == null)
          break Fail409;
        if(true)
          break Fail409;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}