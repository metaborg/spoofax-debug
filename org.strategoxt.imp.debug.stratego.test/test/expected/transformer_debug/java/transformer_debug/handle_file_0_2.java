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

@SuppressWarnings("all") public class handle_file_0_2 extends Strategy 
{ 
  public static handle_file_0_2 instance = new handle_file_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm y_636, IStrategoTerm z_636)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("handle_file_0_2");
    Fail302:
    { 
      IStrategoTerm b_637 = null;
      IStrategoTerm d_637 = null;
      IStrategoTerm e_637 = null;
      IStrategoTerm f_637 = null;
      IStrategoTerm g_637 = null;
      IStrategoTerm i_637 = null;
      IStrategoTerm l_637 = null;
      IStrategoTerm m_637 = null;
      IStrategoTerm o_637 = null;
      IStrategoTerm p_637 = null;
      IStrategoTerm q_637 = null;
      o_637 = term;
      l_637 = transformer_debug.const181;
      p_637 = o_637;
      m_637 = transformer_debug.const204;
      q_637 = p_637;
      term = s_enter_0_3.instance.invoke(context, q_637, l_637, m_637, transformer_debug.constLocationInfo114);
      if(term == null)
        break Fail302;
      IStrategoTerm term151 = term;
      Success145:
      { 
        Fail303:
        { 
          IStrategoTerm j_637 = null;
          IStrategoTerm r_637 = null;
          IStrategoTerm t_637 = null;
          IStrategoTerm u_637 = null;
          IStrategoTerm w_637 = null;
          IStrategoTerm x_637 = null;
          IStrategoTerm y_637 = null;
          IStrategoTerm z_637 = null;
          IStrategoTerm a_638 = null;
          IStrategoTerm b_638 = null;
          IStrategoTerm c_638 = null;
          IStrategoTerm f_638 = null;
          IStrategoTerm g_638 = null;
          IStrategoTerm h_638 = null;
          IStrategoTerm i_638 = null;
          IStrategoTerm j_638 = null;
          IStrategoTerm k_638 = null;
          IStrategoTerm m_638 = null;
          IStrategoTerm n_638 = null;
          IStrategoTerm o_638 = null;
          IStrategoTerm p_638 = null;
          IStrategoTerm q_638 = null;
          IStrategoTerm s_638 = null;
          IStrategoTerm t_638 = null;
          IStrategoTerm u_638 = null;
          IStrategoTerm k_637 = null;
          IStrategoTerm v_638 = null;
          IStrategoTerm w_638 = null;
          IStrategoTerm y_638 = null;
          IStrategoTerm z_638 = null;
          IStrategoTerm a_639 = null;
          IStrategoTerm h_639 = null;
          IStrategoTerm i_639 = null;
          IStrategoTerm k_639 = null;
          IStrategoTerm l_639 = null;
          IStrategoTerm m_639 = null;
          IStrategoTerm n_639 = null;
          IStrategoTerm o_639 = null;
          IStrategoTerm q_639 = null;
          IStrategoTerm r_639 = null;
          IStrategoTerm s_639 = null;
          IStrategoTerm t_639 = null;
          IStrategoTerm u_639 = null;
          IStrategoTerm w_639 = null;
          IStrategoTerm x_639 = null;
          IStrategoTerm y_639 = null;
          IStrategoTerm z_639 = null;
          IStrategoTerm a_640 = null;
          IStrategoTerm c_640 = null;
          IStrategoTerm e_640 = null;
          IStrategoTerm f_640 = null;
          IStrategoTerm g_640 = null;
          IStrategoTerm h_640 = null;
          IStrategoTerm i_640 = null;
          IStrategoTerm j_640 = null;
          IStrategoTerm l_640 = null;
          IStrategoTerm m_640 = null;
          IStrategoTerm n_640 = null;
          IStrategoTerm o_640 = null;
          IStrategoTerm p_640 = null;
          IStrategoTerm q_640 = null;
          IStrategoTerm v_640 = null;
          IStrategoTerm y_640 = null;
          IStrategoTerm z_640 = null;
          IStrategoTerm a_641 = null;
          IStrategoTerm b_641 = null;
          IStrategoTerm c_641 = null;
          IStrategoTerm e_641 = null;
          IStrategoTerm f_641 = null;
          IStrategoTerm g_641 = null;
          IStrategoTerm h_641 = null;
          IStrategoTerm i_641 = null;
          IStrategoTerm l_641 = null;
          IStrategoTerm m_641 = null;
          IStrategoTerm n_641 = null;
          IStrategoTerm o_641 = null;
          IStrategoTerm p_641 = null;
          IStrategoTerm q_641 = null;
          IStrategoTerm s_641 = null;
          IStrategoTerm t_641 = null;
          IStrategoTerm u_641 = null;
          IStrategoTerm v_641 = null;
          IStrategoTerm w_641 = null;
          IStrategoTerm x_641 = null;
          IStrategoTerm z_641 = null;
          IStrategoTerm a_642 = null;
          IStrategoTerm b_642 = null;
          IStrategoTerm c_642 = null;
          IStrategoTerm d_642 = null;
          IStrategoTerm e_642 = null;
          IStrategoTerm g_642 = null;
          IStrategoTerm h_642 = null;
          IStrategoTerm i_642 = null;
          IStrategoTerm j_642 = null;
          IStrategoTerm k_642 = null;
          IStrategoTerm l_642 = null;
          IStrategoTerm n_642 = null;
          IStrategoTerm o_642 = null;
          IStrategoTerm p_642 = null;
          j_637 = term;
          w_637 = y_636;
          r_637 = transformer_debug.const181;
          x_637 = w_637;
          t_637 = transformer_debug.const204;
          y_637 = x_637;
          u_637 = transformer_debug.const103;
          z_637 = y_637;
          term = s_var_0_4.instance.invoke(context, z_637, r_637, t_637, u_637, transformer_debug.constLocationInfo115);
          if(term == null)
            break Fail303;
          f_638 = z_636;
          a_638 = transformer_debug.const181;
          g_638 = f_638;
          b_638 = transformer_debug.const204;
          h_638 = g_638;
          c_638 = transformer_debug.const99;
          i_638 = h_638;
          term = s_var_0_4.instance.invoke(context, i_638, a_638, b_638, c_638, transformer_debug.constLocationInfo116);
          if(term == null)
            break Fail303;
          m_638 = j_637;
          j_638 = transformer_debug.const181;
          n_638 = m_638;
          k_638 = transformer_debug.const204;
          o_638 = n_638;
          term = s_step_0_3.instance.invoke(context, o_638, j_638, k_638, transformer_debug.constLocationInfo117);
          if(term == null)
            break Fail303;
          b_637 = term;
          s_638 = term;
          p_638 = transformer_debug.const181;
          t_638 = s_638;
          q_638 = transformer_debug.const204;
          u_638 = t_638;
          term = s_step_0_3.instance.invoke(context, u_638, p_638, q_638, transformer_debug.constLocationInfo118);
          if(term == null)
            break Fail303;
          k_637 = term;
          y_638 = b_637;
          v_638 = transformer_debug.const181;
          z_638 = y_638;
          w_638 = transformer_debug.const204;
          a_639 = z_638;
          term = s_step_0_3.instance.invoke(context, a_639, v_638, w_638, transformer_debug.constLocationInfo119);
          if(term == null)
            break Fail303;
          term = debug_1_0.instance.invoke(context, term, lifted113.instance);
          if(term == null)
            break Fail303;
          k_639 = k_637;
          h_639 = transformer_debug.const181;
          l_639 = k_639;
          i_639 = transformer_debug.const204;
          m_639 = l_639;
          term = s_step_0_3.instance.invoke(context, m_639, h_639, i_639, transformer_debug.constLocationInfo121);
          if(term == null)
            break Fail303;
          q_639 = term;
          n_639 = transformer_debug.const181;
          r_639 = q_639;
          o_639 = transformer_debug.const204;
          s_639 = r_639;
          term = s_step_0_3.instance.invoke(context, s_639, n_639, o_639, transformer_debug.constLocationInfo122);
          if(term == null)
            break Fail303;
          term = split_path_0_1.instance.invoke(context, term, y_636);
          if(term == null)
            break Fail303;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail303;
          d_637 = term.getSubterm(1);
          w_639 = term;
          t_639 = transformer_debug.const181;
          x_639 = w_639;
          u_639 = transformer_debug.const204;
          y_639 = x_639;
          term = s_step_0_3.instance.invoke(context, y_639, t_639, u_639, transformer_debug.constLocationInfo123);
          if(term == null)
            break Fail303;
          e_637 = y_636;
          e_640 = y_636;
          z_639 = transformer_debug.const181;
          f_640 = e_640;
          a_640 = transformer_debug.const204;
          g_640 = f_640;
          c_640 = transformer_debug.const208;
          h_640 = g_640;
          term = s_var_0_4.instance.invoke(context, h_640, z_639, a_640, c_640, transformer_debug.constLocationInfo124);
          if(term == null)
            break Fail303;
          l_640 = term;
          i_640 = transformer_debug.const181;
          m_640 = l_640;
          j_640 = transformer_debug.const204;
          n_640 = m_640;
          term = s_step_0_3.instance.invoke(context, n_640, i_640, j_640, transformer_debug.constLocationInfo125);
          if(term == null)
            break Fail303;
          f_637 = d_637;
          v_640 = d_637;
          o_640 = transformer_debug.const181;
          y_640 = v_640;
          p_640 = transformer_debug.const204;
          z_640 = y_640;
          q_640 = transformer_debug.const209;
          a_641 = z_640;
          term = s_var_0_4.instance.invoke(context, a_641, o_640, p_640, q_640, transformer_debug.constLocationInfo126);
          if(term == null)
            break Fail303;
          e_641 = term;
          b_641 = transformer_debug.const181;
          f_641 = e_641;
          c_641 = transformer_debug.const204;
          g_641 = f_641;
          term = s_step_0_3.instance.invoke(context, g_641, b_641, c_641, transformer_debug.constLocationInfo127);
          if(term == null)
            break Fail303;
          term = (IStrategoTerm)termFactory.makeListCons(z_636, termFactory.makeListCons(transformer_debug.const210, termFactory.makeListCons(d_637, (IStrategoList)transformer_debug.constNil1)));
          l_641 = term;
          h_641 = transformer_debug.const181;
          m_641 = l_641;
          i_641 = transformer_debug.const204;
          n_641 = m_641;
          term = s_step_0_3.instance.invoke(context, n_641, h_641, i_641, transformer_debug.constLocationInfo128);
          if(term == null)
            break Fail303;
          term = concat_strings_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail303;
          g_637 = term;
          s_641 = term;
          o_641 = transformer_debug.const181;
          t_641 = s_641;
          p_641 = transformer_debug.const204;
          u_641 = t_641;
          q_641 = transformer_debug.const211;
          v_641 = u_641;
          term = s_var_0_4.instance.invoke(context, v_641, o_641, p_641, q_641, transformer_debug.constLocationInfo129);
          if(term == null)
            break Fail303;
          z_641 = term;
          w_641 = transformer_debug.const181;
          a_642 = z_641;
          x_641 = transformer_debug.const204;
          b_642 = a_642;
          term = s_step_0_3.instance.invoke(context, b_642, w_641, x_641, transformer_debug.constLocationInfo130);
          if(term == null)
            break Fail303;
          term = termFactory.makeTuple(e_637, f_637, g_637);
          i_637 = term;
          g_642 = term;
          c_642 = transformer_debug.const181;
          h_642 = g_642;
          d_642 = transformer_debug.const204;
          i_642 = h_642;
          e_642 = transformer_debug.const191;
          j_642 = i_642;
          term = s_var_0_4.instance.invoke(context, j_642, c_642, d_642, e_642, transformer_debug.constLocationInfo131);
          if(term == null)
            break Fail303;
          n_642 = i_637;
          k_642 = transformer_debug.const181;
          o_642 = n_642;
          l_642 = transformer_debug.const204;
          p_642 = o_642;
          term = s_step_0_3.instance.invoke(context, p_642, k_642, l_642, transformer_debug.constLocationInfo132);
          if(term == null)
            break Fail303;
          term = apply_debug_trans_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail303;
          { 
            IStrategoTerm q_642 = null;
            IStrategoTerm r_642 = null;
            IStrategoTerm t_642 = null;
            IStrategoTerm u_642 = null;
            IStrategoTerm v_642 = null;
            t_642 = term;
            q_642 = transformer_debug.const181;
            u_642 = t_642;
            r_642 = transformer_debug.const204;
            v_642 = u_642;
            term = s_exit_0_3.instance.invoke(context, v_642, q_642, r_642, transformer_debug.constLocationInfo114);
            if(term == null)
              break Fail302;
            if(true)
              break Success145;
          }
        }
        term = term151;
        IStrategoTerm w_642 = null;
        IStrategoTerm x_642 = null;
        IStrategoTerm z_642 = null;
        IStrategoTerm a_643 = null;
        IStrategoTerm b_643 = null;
        z_642 = term;
        w_642 = transformer_debug.const181;
        a_643 = z_642;
        x_642 = transformer_debug.const204;
        b_643 = a_643;
        term = s_exit_0_3.instance.invoke(context, b_643, w_642, x_642, transformer_debug.constLocationInfo114);
        if(term == null)
          break Fail302;
        if(true)
          break Fail302;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}