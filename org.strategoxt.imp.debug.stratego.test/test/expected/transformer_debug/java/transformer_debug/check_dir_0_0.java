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

@SuppressWarnings("all") public class check_dir_0_0 extends Strategy 
{ 
  public static check_dir_0_0 instance = new check_dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("check_dir_0_0");
    Fail414:
    { 
      IStrategoTerm m_1063 = null;
      IStrategoTerm n_1063 = null;
      IStrategoTerm o_1063 = null;
      IStrategoTerm q_1063 = null;
      IStrategoTerm r_1063 = null;
      IStrategoTerm s_1063 = null;
      q_1063 = term;
      n_1063 = transformer_debug.const571;
      r_1063 = q_1063;
      o_1063 = transformer_debug.const585;
      s_1063 = r_1063;
      term = s_enter_0_3.instance.invoke(context, s_1063, n_1063, o_1063, transformer_debug.constLocationInfo1119);
      if(term == null)
        break Fail414;
      IStrategoTerm term291 = term;
      Success202:
      { 
        Fail415:
        { 
          IStrategoTerm term292 = term;
          Success203:
          { 
            Fail416:
            { 
              IStrategoTerm t_1063 = null;
              IStrategoTerm u_1063 = null;
              IStrategoTerm w_1063 = null;
              IStrategoTerm x_1063 = null;
              IStrategoTerm y_1063 = null;
              IStrategoTerm z_1063 = null;
              IStrategoTerm a_1064 = null;
              IStrategoTerm c_1064 = null;
              IStrategoTerm d_1064 = null;
              IStrategoTerm e_1064 = null;
              IStrategoTerm f_1064 = null;
              IStrategoTerm g_1064 = null;
              IStrategoTerm i_1064 = null;
              IStrategoTerm j_1064 = null;
              IStrategoTerm k_1064 = null;
              IStrategoTerm l_1064 = null;
              IStrategoTerm m_1064 = null;
              IStrategoTerm n_1064 = null;
              IStrategoTerm p_1064 = null;
              IStrategoTerm q_1064 = null;
              IStrategoTerm r_1064 = null;
              IStrategoTerm s_1064 = null;
              IStrategoTerm t_1064 = null;
              IStrategoTerm u_1064 = null;
              IStrategoTerm w_1064 = null;
              IStrategoTerm x_1064 = null;
              IStrategoTerm y_1064 = null;
              IStrategoTerm z_1064 = null;
              IStrategoTerm a_1065 = null;
              IStrategoTerm c_1065 = null;
              IStrategoTerm d_1065 = null;
              IStrategoTerm e_1065 = null;
              IStrategoTerm f_1065 = null;
              IStrategoTerm g_1065 = null;
              IStrategoTerm i_1065 = null;
              IStrategoTerm j_1065 = null;
              IStrategoTerm k_1065 = null;
              IStrategoTerm l_1065 = null;
              IStrategoTerm m_1065 = null;
              IStrategoTerm o_1065 = null;
              IStrategoTerm p_1065 = null;
              IStrategoTerm q_1065 = null;
              w_1063 = term;
              t_1063 = transformer_debug.const571;
              x_1063 = w_1063;
              u_1063 = transformer_debug.const585;
              y_1063 = x_1063;
              term = s_step_0_3.instance.invoke(context, y_1063, t_1063, u_1063, transformer_debug.constLocationInfo1120);
              if(term == null)
                break Fail416;
              m_1063 = term;
              c_1064 = term;
              z_1063 = transformer_debug.const571;
              d_1064 = c_1064;
              a_1064 = transformer_debug.const585;
              e_1064 = d_1064;
              term = s_step_0_3.instance.invoke(context, e_1064, z_1063, a_1064, transformer_debug.constLocationInfo1121);
              if(term == null)
                break Fail416;
              i_1064 = m_1063;
              f_1064 = transformer_debug.const571;
              j_1064 = i_1064;
              g_1064 = transformer_debug.const585;
              k_1064 = j_1064;
              term = s_step_0_3.instance.invoke(context, k_1064, f_1064, g_1064, transformer_debug.constLocationInfo1122);
              if(term == null)
                break Fail416;
              term = dirname_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail416;
              p_1064 = term;
              l_1064 = transformer_debug.const571;
              q_1064 = p_1064;
              m_1064 = transformer_debug.const585;
              r_1064 = q_1064;
              n_1064 = transformer_debug.const587;
              s_1064 = r_1064;
              term = s_var_0_4.instance.invoke(context, s_1064, l_1064, m_1064, n_1064, transformer_debug.constLocationInfo1123);
              if(term == null)
                break Fail416;
              w_1064 = term;
              t_1064 = transformer_debug.const571;
              x_1064 = w_1064;
              u_1064 = transformer_debug.const585;
              y_1064 = x_1064;
              term = s_step_0_3.instance.invoke(context, y_1064, t_1064, u_1064, transformer_debug.constLocationInfo1124);
              if(term == null)
                break Fail416;
              c_1065 = m_1063;
              z_1064 = transformer_debug.const571;
              d_1065 = c_1065;
              a_1065 = transformer_debug.const585;
              e_1065 = d_1065;
              term = s_step_0_3.instance.invoke(context, e_1065, z_1064, a_1065, transformer_debug.constLocationInfo1125);
              if(term == null)
                break Fail416;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail416;
              i_1065 = term;
              f_1065 = transformer_debug.const571;
              j_1065 = i_1065;
              g_1065 = transformer_debug.const585;
              k_1065 = j_1065;
              term = s_step_0_3.instance.invoke(context, k_1065, f_1065, g_1065, transformer_debug.constLocationInfo1126);
              if(term == null)
                break Fail416;
              term = filemode_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail416;
              o_1065 = term;
              l_1065 = transformer_debug.const571;
              p_1065 = o_1065;
              m_1065 = transformer_debug.const585;
              q_1065 = p_1065;
              term = s_step_0_3.instance.invoke(context, q_1065, l_1065, m_1065, transformer_debug.constLocationInfo1127);
              if(term == null)
                break Fail416;
              term = isdir_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail416;
              if(true)
                break Success203;
            }
            term = term292;
            IStrategoTerm r_1065 = null;
            IStrategoTerm s_1065 = null;
            IStrategoTerm u_1065 = null;
            IStrategoTerm v_1065 = null;
            IStrategoTerm w_1065 = null;
            u_1065 = term;
            r_1065 = transformer_debug.const571;
            v_1065 = u_1065;
            s_1065 = transformer_debug.const585;
            w_1065 = v_1065;
            term = s_step_0_3.instance.invoke(context, w_1065, r_1065, s_1065, transformer_debug.constLocationInfo1128);
            if(term == null)
              break Fail415;
            term = create_dir_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail415;
          }
          { 
            IStrategoTerm x_1065 = null;
            IStrategoTerm y_1065 = null;
            IStrategoTerm a_1066 = null;
            IStrategoTerm b_1066 = null;
            IStrategoTerm c_1066 = null;
            a_1066 = term;
            x_1065 = transformer_debug.const571;
            b_1066 = a_1066;
            y_1065 = transformer_debug.const585;
            c_1066 = b_1066;
            term = s_exit_0_3.instance.invoke(context, c_1066, x_1065, y_1065, transformer_debug.constLocationInfo1119);
            if(term == null)
              break Fail414;
            if(true)
              break Success202;
          }
        }
        term = term291;
        IStrategoTerm d_1066 = null;
        IStrategoTerm e_1066 = null;
        IStrategoTerm g_1066 = null;
        IStrategoTerm h_1066 = null;
        IStrategoTerm i_1066 = null;
        g_1066 = term;
        d_1066 = transformer_debug.const571;
        h_1066 = g_1066;
        e_1066 = transformer_debug.const585;
        i_1066 = h_1066;
        term = s_exit_0_3.instance.invoke(context, i_1066, d_1066, e_1066, transformer_debug.constLocationInfo1119);
        if(term == null)
          break Fail414;
        if(true)
          break Fail414;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}