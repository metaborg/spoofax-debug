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

@SuppressWarnings("all") final class execute_0_0_fragment_0 extends Strategy 
{ 
  TermReference h_387;

  TermReference i_387;

  TermReference j_387;

  TermReference k_387;

  TermReference l_387;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail637:
    { 
      IStrategoTerm term132 = term;
      Success304:
      { 
        Fail638:
        { 
          IStrategoTerm term133 = term;
          Success305:
          { 
            Fail639:
            { 
              IStrategoTerm u_387 = null;
              IStrategoTerm v_387 = null;
              IStrategoTerm x_387 = null;
              IStrategoTerm y_387 = null;
              IStrategoTerm z_387 = null;
              IStrategoTerm d_388 = null;
              IStrategoTerm e_388 = null;
              IStrategoTerm h_388 = null;
              IStrategoTerm i_388 = null;
              IStrategoTerm j_388 = null;
              IStrategoTerm k_388 = null;
              IStrategoTerm l_388 = null;
              IStrategoTerm m_388 = null;
              IStrategoTerm o_388 = null;
              IStrategoTerm p_388 = null;
              IStrategoTerm q_388 = null;
              IStrategoTerm r_388 = null;
              IStrategoTerm s_388 = null;
              IStrategoTerm t_388 = null;
              IStrategoTerm v_388 = null;
              IStrategoTerm w_388 = null;
              IStrategoTerm x_388 = null;
              IStrategoTerm y_388 = null;
              IStrategoTerm z_388 = null;
              IStrategoTerm b_389 = null;
              IStrategoTerm c_389 = null;
              IStrategoTerm d_389 = null;
              IStrategoTerm e_389 = null;
              IStrategoTerm f_389 = null;
              IStrategoTerm g_389 = null;
              IStrategoTerm i_389 = null;
              IStrategoTerm j_389 = null;
              IStrategoTerm k_389 = null;
              IStrategoTerm l_389 = null;
              IStrategoTerm m_389 = null;
              IStrategoTerm n_389 = null;
              IStrategoTerm p_389 = null;
              IStrategoTerm q_389 = null;
              IStrategoTerm r_389 = null;
              IStrategoTerm s_389 = null;
              IStrategoTerm t_389 = null;
              IStrategoTerm v_389 = null;
              IStrategoTerm w_389 = null;
              IStrategoTerm x_389 = null;
              IStrategoTerm y_389 = null;
              IStrategoTerm z_389 = null;
              IStrategoTerm a_390 = null;
              IStrategoTerm c_390 = null;
              IStrategoTerm d_390 = null;
              IStrategoTerm e_390 = null;
              IStrategoTerm f_390 = null;
              IStrategoTerm g_390 = null;
              IStrategoTerm h_390 = null;
              IStrategoTerm j_390 = null;
              IStrategoTerm k_390 = null;
              IStrategoTerm l_390 = null;
              IStrategoTerm m_390 = null;
              IStrategoTerm n_390 = null;
              IStrategoTerm p_390 = null;
              IStrategoTerm q_390 = null;
              IStrategoTerm r_390 = null;
              IStrategoTerm s_390 = null;
              IStrategoTerm t_390 = null;
              IStrategoTerm u_390 = null;
              IStrategoTerm w_390 = null;
              IStrategoTerm x_390 = null;
              IStrategoTerm y_390 = null;
              IStrategoTerm z_390 = null;
              IStrategoTerm a_391 = null;
              IStrategoTerm b_391 = null;
              IStrategoTerm d_391 = null;
              IStrategoTerm e_391 = null;
              IStrategoTerm f_391 = null;
              IStrategoTerm g_391 = null;
              IStrategoTerm h_391 = null;
              IStrategoTerm j_391 = null;
              IStrategoTerm k_391 = null;
              IStrategoTerm l_391 = null;
              IStrategoTerm m_391 = null;
              IStrategoTerm n_391 = null;
              IStrategoTerm o_391 = null;
              IStrategoTerm q_391 = null;
              IStrategoTerm r_391 = null;
              IStrategoTerm s_391 = null;
              IStrategoTerm t_391 = null;
              IStrategoTerm u_391 = null;
              IStrategoTerm v_391 = null;
              IStrategoTerm x_391 = null;
              IStrategoTerm y_391 = null;
              IStrategoTerm z_391 = null;
              x_387 = term;
              u_387 = transformer_debug.const67;
              y_387 = x_387;
              v_387 = transformer_debug.const81;
              z_387 = y_387;
              term = s_step_0_3.instance.invoke(context, z_387, u_387, v_387, transformer_debug.constLocationInfo6);
              if(term == null)
                break Fail639;
              h_388 = term;
              d_388 = transformer_debug.const67;
              i_388 = h_388;
              e_388 = transformer_debug.const81;
              j_388 = i_388;
              term = s_step_0_3.instance.invoke(context, j_388, d_388, e_388, transformer_debug.constLocationInfo7);
              if(term == null)
                break Fail639;
              term = get_config_$I_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail639;
              if(l_387.value == null)
                l_387.value = term;
              else
                if(l_387.value != term && !l_387.value.match(term))
                  break Fail639;
              if(l_387.value == null)
                break Fail639;
              o_388 = l_387.value;
              k_388 = transformer_debug.const67;
              p_388 = o_388;
              l_388 = transformer_debug.const81;
              q_388 = p_388;
              m_388 = transformer_debug.const86;
              r_388 = q_388;
              term = s_var_0_4.instance.invoke(context, r_388, k_388, l_388, m_388, transformer_debug.constLocationInfo8);
              if(term == null)
                break Fail639;
              v_388 = term;
              s_388 = transformer_debug.const67;
              w_388 = v_388;
              t_388 = transformer_debug.const81;
              x_388 = w_388;
              term = s_step_0_3.instance.invoke(context, x_388, s_388, t_388, transformer_debug.constLocationInfo9);
              if(term == null)
                break Fail639;
              b_389 = transformer_debug.const91;
              y_388 = transformer_debug.const67;
              c_389 = b_389;
              z_388 = transformer_debug.const81;
              d_389 = c_389;
              term = s_step_0_3.instance.invoke(context, d_389, y_388, z_388, transformer_debug.constLocationInfo10);
              if(term == null)
                break Fail639;
              term = get_config_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail639;
              if(h_387.value == null)
                h_387.value = term;
              else
                if(h_387.value != term && !h_387.value.match(term))
                  break Fail639;
              if(h_387.value == null)
                break Fail639;
              i_389 = h_387.value;
              e_389 = transformer_debug.const67;
              j_389 = i_389;
              f_389 = transformer_debug.const81;
              k_389 = j_389;
              g_389 = transformer_debug.const93;
              l_389 = k_389;
              term = s_var_0_4.instance.invoke(context, l_389, e_389, f_389, g_389, transformer_debug.constLocationInfo11);
              if(term == null)
                break Fail639;
              p_389 = term;
              m_389 = transformer_debug.const67;
              q_389 = p_389;
              n_389 = transformer_debug.const81;
              r_389 = q_389;
              term = s_step_0_3.instance.invoke(context, r_389, m_389, n_389, transformer_debug.constLocationInfo12);
              if(term == null)
                break Fail639;
              v_389 = transformer_debug.const96;
              s_389 = transformer_debug.const67;
              w_389 = v_389;
              t_389 = transformer_debug.const81;
              x_389 = w_389;
              term = s_step_0_3.instance.invoke(context, x_389, s_389, t_389, transformer_debug.constLocationInfo13);
              if(term == null)
                break Fail639;
              term = get_config_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail639;
              if(j_387.value == null)
                j_387.value = term;
              else
                if(j_387.value != term && !j_387.value.match(term))
                  break Fail639;
              if(j_387.value == null)
                break Fail639;
              c_390 = j_387.value;
              y_389 = transformer_debug.const67;
              d_390 = c_390;
              z_389 = transformer_debug.const81;
              e_390 = d_390;
              a_390 = transformer_debug.const99;
              f_390 = e_390;
              term = s_var_0_4.instance.invoke(context, f_390, y_389, z_389, a_390, transformer_debug.constLocationInfo14);
              if(term == null)
                break Fail639;
              j_390 = term;
              g_390 = transformer_debug.const67;
              k_390 = j_390;
              h_390 = transformer_debug.const81;
              l_390 = k_390;
              term = s_step_0_3.instance.invoke(context, l_390, g_390, h_390, transformer_debug.constLocationInfo15);
              if(term == null)
                break Fail639;
              if(h_387.value == null)
                break Fail639;
              p_390 = h_387.value;
              m_390 = transformer_debug.const67;
              q_390 = p_390;
              n_390 = transformer_debug.const81;
              r_390 = q_390;
              term = s_step_0_3.instance.invoke(context, r_390, m_390, n_390, transformer_debug.constLocationInfo16);
              if(term == null)
                break Fail639;
              term = dirname_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail639;
              if(i_387.value == null)
                i_387.value = term;
              else
                if(i_387.value != term && !i_387.value.match(term))
                  break Fail639;
              if(i_387.value == null)
                break Fail639;
              w_390 = i_387.value;
              s_390 = transformer_debug.const67;
              x_390 = w_390;
              t_390 = transformer_debug.const81;
              y_390 = x_390;
              u_390 = transformer_debug.const103;
              z_390 = y_390;
              term = s_var_0_4.instance.invoke(context, z_390, s_390, t_390, u_390, transformer_debug.constLocationInfo17);
              if(term == null)
                break Fail639;
              d_391 = term;
              a_391 = transformer_debug.const67;
              e_391 = d_391;
              b_391 = transformer_debug.const81;
              f_391 = e_391;
              term = s_step_0_3.instance.invoke(context, f_391, a_391, b_391, transformer_debug.constLocationInfo18);
              if(term == null)
                break Fail639;
              if(h_387.value == null)
                break Fail639;
              j_391 = h_387.value;
              g_391 = transformer_debug.const67;
              k_391 = j_391;
              h_391 = transformer_debug.const81;
              l_391 = k_391;
              term = s_step_0_3.instance.invoke(context, l_391, g_391, h_391, transformer_debug.constLocationInfo19);
              if(term == null)
                break Fail639;
              term = base_filename_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail639;
              if(k_387.value == null)
                k_387.value = term;
              else
                if(k_387.value != term && !k_387.value.match(term))
                  break Fail639;
              if(k_387.value == null)
                break Fail639;
              q_391 = k_387.value;
              m_391 = transformer_debug.const67;
              r_391 = q_391;
              n_391 = transformer_debug.const81;
              s_391 = r_391;
              o_391 = transformer_debug.const108;
              t_391 = s_391;
              term = s_var_0_4.instance.invoke(context, t_391, m_391, n_391, o_391, transformer_debug.constLocationInfo20);
              if(term == null)
                break Fail639;
              if(h_387.value == null)
                break Fail639;
              x_391 = h_387.value;
              u_391 = transformer_debug.const67;
              y_391 = x_391;
              v_391 = transformer_debug.const81;
              z_391 = y_391;
              term = s_step_0_3.instance.invoke(context, z_391, u_391, v_391, transformer_debug.constLocationInfo21);
              if(term == null)
                break Fail639;
              term = check_input_file_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail639;
              { 
                IStrategoTerm a_392 = null;
                IStrategoTerm b_392 = null;
                IStrategoTerm d_392 = null;
                IStrategoTerm e_392 = null;
                IStrategoTerm f_392 = null;
                IStrategoTerm g_392 = null;
                IStrategoTerm h_392 = null;
                IStrategoTerm j_392 = null;
                IStrategoTerm k_392 = null;
                IStrategoTerm l_392 = null;
                d_392 = term;
                a_392 = transformer_debug.const67;
                e_392 = d_392;
                b_392 = transformer_debug.const81;
                f_392 = e_392;
                term = s_step_0_3.instance.invoke(context, f_392, a_392, b_392, transformer_debug.constLocationInfo22);
                if(term == null)
                  break Fail638;
                if(i_387.value == null || (j_387.value == null || k_387.value == null))
                  break Fail638;
                term = termFactory.makeTuple(i_387.value, j_387.value, k_387.value);
                j_392 = term;
                g_392 = transformer_debug.const67;
                k_392 = j_392;
                h_392 = transformer_debug.const81;
                l_392 = k_392;
                term = s_step_0_3.instance.invoke(context, l_392, g_392, h_392, transformer_debug.constLocationInfo23);
                if(term == null)
                  break Fail638;
                term = apply_debug_project_0_1.instance.invoke(context, term, l_387.value);
                if(term == null)
                  break Fail638;
                if(true)
                  break Success305;
              }
            }
            term = term133;
            IStrategoTerm m_392 = null;
            IStrategoTerm n_392 = null;
            IStrategoTerm p_392 = null;
            IStrategoTerm q_392 = null;
            IStrategoTerm r_392 = null;
            p_392 = term;
            m_392 = transformer_debug.const67;
            q_392 = p_392;
            n_392 = transformer_debug.const81;
            r_392 = q_392;
            term = s_step_0_3.instance.invoke(context, r_392, m_392, n_392, transformer_debug.constLocationInfo25);
            if(term == null)
              break Fail638;
            term = debug_1_0.instance.invoke(context, term, lifted83.instance);
            if(term == null)
              break Fail638;
          }
          { 
            IStrategoTerm y_392 = null;
            IStrategoTerm z_392 = null;
            IStrategoTerm b_393 = null;
            IStrategoTerm c_393 = null;
            IStrategoTerm d_393 = null;
            b_393 = term;
            y_392 = transformer_debug.const67;
            c_393 = b_393;
            z_392 = transformer_debug.const81;
            d_393 = c_393;
            term = s_exit_0_3.instance.invoke(context, d_393, y_392, z_392, transformer_debug.constLocationInfo26);
            if(term == null)
              break Fail637;
            if(true)
              break Success304;
          }
        }
        term = term132;
        IStrategoTerm e_393 = null;
        IStrategoTerm f_393 = null;
        IStrategoTerm h_393 = null;
        IStrategoTerm i_393 = null;
        IStrategoTerm j_393 = null;
        h_393 = term;
        e_393 = transformer_debug.const67;
        i_393 = h_393;
        f_393 = transformer_debug.const81;
        j_393 = i_393;
        term = s_exit_0_3.instance.invoke(context, j_393, e_393, f_393, transformer_debug.constLocationInfo26);
        if(term == null)
          break Fail637;
        if(true)
          break Fail637;
      }
      if(true)
        return term;
    }
    return null;
  }
}