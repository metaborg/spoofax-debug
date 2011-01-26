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

@SuppressWarnings("all") public class parse_stratego_with_locations_0_1 extends Strategy 
{ 
  public static parse_stratego_with_locations_0_1 instance = new parse_stratego_with_locations_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm z_1069)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("parse_stratego_with_locations_0_1");
    Fail421:
    { 
      IStrategoTerm b_1070 = null;
      IStrategoTerm c_1070 = null;
      IStrategoTerm e_1070 = null;
      IStrategoTerm f_1070 = null;
      IStrategoTerm g_1070 = null;
      e_1070 = term;
      b_1070 = transformer_debug.const571;
      f_1070 = e_1070;
      c_1070 = transformer_debug.const594;
      g_1070 = f_1070;
      term = s_enter_0_3.instance.invoke(context, g_1070, b_1070, c_1070, transformer_debug.constLocationInfo1140);
      if(term == null)
        break Fail421;
      IStrategoTerm term295 = term;
      Success206:
      { 
        Fail422:
        { 
          IStrategoTerm a_1070 = null;
          IStrategoTerm h_1070 = null;
          IStrategoTerm i_1070 = null;
          IStrategoTerm j_1070 = null;
          IStrategoTerm l_1070 = null;
          IStrategoTerm m_1070 = null;
          IStrategoTerm n_1070 = null;
          IStrategoTerm o_1070 = null;
          IStrategoTerm p_1070 = null;
          IStrategoTerm q_1070 = null;
          IStrategoTerm s_1070 = null;
          IStrategoTerm t_1070 = null;
          IStrategoTerm u_1070 = null;
          IStrategoTerm v_1070 = null;
          IStrategoTerm w_1070 = null;
          IStrategoTerm y_1070 = null;
          IStrategoTerm z_1070 = null;
          IStrategoTerm a_1071 = null;
          IStrategoTerm c_1071 = null;
          IStrategoTerm d_1071 = null;
          IStrategoTerm k_1071 = null;
          IStrategoTerm l_1071 = null;
          IStrategoTerm m_1071 = null;
          IStrategoTerm o_1071 = null;
          IStrategoTerm p_1071 = null;
          IStrategoTerm q_1071 = null;
          IStrategoTerm e_1071 = null;
          IStrategoTerm r_1071 = null;
          IStrategoTerm s_1071 = null;
          IStrategoTerm t_1071 = null;
          IStrategoTerm v_1071 = null;
          IStrategoTerm w_1071 = null;
          IStrategoTerm x_1071 = null;
          IStrategoTerm f_1071 = null;
          IStrategoTerm y_1071 = null;
          IStrategoTerm z_1071 = null;
          IStrategoTerm a_1072 = null;
          IStrategoTerm c_1072 = null;
          IStrategoTerm d_1072 = null;
          IStrategoTerm e_1072 = null;
          IStrategoTerm g_1071 = null;
          IStrategoTerm f_1072 = null;
          IStrategoTerm g_1072 = null;
          IStrategoTerm h_1072 = null;
          IStrategoTerm j_1072 = null;
          IStrategoTerm k_1072 = null;
          IStrategoTerm l_1072 = null;
          IStrategoTerm h_1071 = null;
          IStrategoTerm m_1072 = null;
          IStrategoTerm n_1072 = null;
          IStrategoTerm o_1072 = null;
          IStrategoTerm q_1072 = null;
          IStrategoTerm r_1072 = null;
          IStrategoTerm s_1072 = null;
          IStrategoTerm i_1071 = null;
          IStrategoTerm t_1072 = null;
          IStrategoTerm u_1072 = null;
          IStrategoTerm v_1072 = null;
          IStrategoTerm x_1072 = null;
          IStrategoTerm y_1072 = null;
          IStrategoTerm z_1072 = null;
          IStrategoTerm b_1073 = null;
          IStrategoTerm c_1073 = null;
          IStrategoTerm e_1073 = null;
          IStrategoTerm f_1073 = null;
          IStrategoTerm g_1073 = null;
          a_1070 = term;
          l_1070 = z_1069;
          h_1070 = transformer_debug.const571;
          m_1070 = l_1070;
          i_1070 = transformer_debug.const594;
          n_1070 = m_1070;
          j_1070 = transformer_debug.const595;
          o_1070 = n_1070;
          term = s_var_0_4.instance.invoke(context, o_1070, h_1070, i_1070, j_1070, transformer_debug.constLocationInfo1141);
          if(term == null)
            break Fail422;
          s_1070 = a_1070;
          p_1070 = transformer_debug.const571;
          t_1070 = s_1070;
          q_1070 = transformer_debug.const594;
          u_1070 = t_1070;
          term = s_step_0_3.instance.invoke(context, u_1070, p_1070, q_1070, transformer_debug.constLocationInfo1142);
          if(term == null)
            break Fail422;
          term = termFactory.makeAppl(transformer_debug._consFILE_1, new IStrategoTerm[]{z_1069});
          y_1070 = term;
          v_1070 = transformer_debug.const571;
          z_1070 = y_1070;
          w_1070 = transformer_debug.const594;
          a_1071 = z_1070;
          term = s_step_0_3.instance.invoke(context, a_1071, v_1070, w_1070, transformer_debug.constLocationInfo1143);
          if(term == null)
            break Fail422;
          c_1071 = term;
          k_1071 = term;
          o_1071 = term;
          l_1071 = transformer_debug.const571;
          p_1071 = o_1071;
          m_1071 = transformer_debug.const594;
          q_1071 = p_1071;
          term = s_step_0_3.instance.invoke(context, q_1071, l_1071, m_1071, transformer_debug.constLocationInfo1144);
          if(term == null)
            break Fail422;
          term = stratego_box_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail422;
          d_1071 = term;
          term = k_1071;
          r_1071 = k_1071;
          v_1071 = term;
          s_1071 = transformer_debug.const571;
          w_1071 = v_1071;
          t_1071 = transformer_debug.const594;
          x_1071 = w_1071;
          term = s_step_0_3.instance.invoke(context, x_1071, s_1071, t_1071, transformer_debug.constLocationInfo1145);
          if(term == null)
            break Fail422;
          term = stratego_sdf2_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail422;
          e_1071 = term;
          term = r_1071;
          y_1071 = r_1071;
          c_1072 = term;
          z_1071 = transformer_debug.const571;
          d_1072 = c_1072;
          a_1072 = transformer_debug.const594;
          e_1072 = d_1072;
          term = s_step_0_3.instance.invoke(context, e_1072, z_1071, a_1072, transformer_debug.constLocationInfo1146);
          if(term == null)
            break Fail422;
          term = stratego_stratego_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail422;
          f_1071 = term;
          term = y_1071;
          f_1072 = y_1071;
          j_1072 = term;
          g_1072 = transformer_debug.const571;
          k_1072 = j_1072;
          h_1072 = transformer_debug.const594;
          l_1072 = k_1072;
          term = s_step_0_3.instance.invoke(context, l_1072, g_1072, h_1072, transformer_debug.constLocationInfo1147);
          if(term == null)
            break Fail422;
          term = stratego_c_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail422;
          g_1071 = term;
          term = f_1072;
          m_1072 = f_1072;
          q_1072 = term;
          n_1072 = transformer_debug.const571;
          r_1072 = q_1072;
          o_1072 = transformer_debug.const594;
          s_1072 = r_1072;
          term = s_step_0_3.instance.invoke(context, s_1072, n_1072, o_1072, transformer_debug.constLocationInfo1148);
          if(term == null)
            break Fail422;
          term = stratego_xml_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail422;
          h_1071 = term;
          term = m_1072;
          t_1072 = m_1072;
          x_1072 = term;
          u_1072 = transformer_debug.const571;
          y_1072 = x_1072;
          v_1072 = transformer_debug.const594;
          z_1072 = y_1072;
          term = s_step_0_3.instance.invoke(context, z_1072, u_1072, v_1072, transformer_debug.constLocationInfo1149);
          if(term == null)
            break Fail422;
          term = stratego_rtg_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail422;
          i_1071 = term;
          term = t_1072;
          e_1073 = term;
          b_1073 = transformer_debug.const571;
          f_1073 = e_1073;
          c_1073 = transformer_debug.const594;
          g_1073 = f_1073;
          term = s_step_0_3.instance.invoke(context, g_1073, b_1073, c_1073, transformer_debug.constLocationInfo1150);
          if(term == null)
            break Fail422;
          term = stratego_propstratego_path_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail422;
          term = (IStrategoTerm)termFactory.makeListCons(transformer_debug.const91, termFactory.makeListCons(z_1069, termFactory.makeListCons(transformer_debug.const598, termFactory.makeListCons(transformer_debug.const149, termFactory.makeListCons(d_1071, termFactory.makeListCons(transformer_debug.const149, termFactory.makeListCons(e_1071, termFactory.makeListCons(transformer_debug.const149, termFactory.makeListCons(f_1071, termFactory.makeListCons(transformer_debug.const149, termFactory.makeListCons(g_1071, termFactory.makeListCons(transformer_debug.const149, termFactory.makeListCons(h_1071, termFactory.makeListCons(transformer_debug.const149, termFactory.makeListCons(i_1071, termFactory.makeListCons(transformer_debug.const149, termFactory.makeListCons(term, (IStrategoList)transformer_debug.constNil1)))))))))))))))));
          term = parse_stratego_trm_0_1.instance.invoke(context, c_1071, term);
          if(term == null)
            break Fail422;
          { 
            IStrategoTerm h_1073 = null;
            IStrategoTerm i_1073 = null;
            IStrategoTerm k_1073 = null;
            IStrategoTerm l_1073 = null;
            IStrategoTerm m_1073 = null;
            k_1073 = term;
            h_1073 = transformer_debug.const571;
            l_1073 = k_1073;
            i_1073 = transformer_debug.const594;
            m_1073 = l_1073;
            term = s_exit_0_3.instance.invoke(context, m_1073, h_1073, i_1073, transformer_debug.constLocationInfo1140);
            if(term == null)
              break Fail421;
            if(true)
              break Success206;
          }
        }
        term = term295;
        IStrategoTerm n_1073 = null;
        IStrategoTerm o_1073 = null;
        IStrategoTerm q_1073 = null;
        IStrategoTerm r_1073 = null;
        IStrategoTerm s_1073 = null;
        q_1073 = term;
        n_1073 = transformer_debug.const571;
        r_1073 = q_1073;
        o_1073 = transformer_debug.const594;
        s_1073 = r_1073;
        term = s_exit_0_3.instance.invoke(context, s_1073, n_1073, o_1073, transformer_debug.constLocationInfo1140);
        if(term == null)
          break Fail421;
        if(true)
          break Fail421;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}