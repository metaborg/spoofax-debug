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

@SuppressWarnings("all") public class write_stratego_0_1 extends Strategy 
{ 
  public static write_stratego_0_1 instance = new write_stratego_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_1041)
  { 
    context.push("write_stratego_0_1");
    Fail406:
    { 
      IStrategoTerm d_1041 = null;
      IStrategoTerm e_1041 = null;
      IStrategoTerm g_1041 = null;
      IStrategoTerm h_1041 = null;
      IStrategoTerm i_1041 = null;
      g_1041 = term;
      d_1041 = transformer_debug.const571;
      h_1041 = g_1041;
      e_1041 = transformer_debug.const572;
      i_1041 = h_1041;
      term = s_enter_0_3.instance.invoke(context, i_1041, d_1041, e_1041, transformer_debug.constLocationInfo1082);
      if(term == null)
        break Fail406;
      IStrategoTerm term287 = term;
      Success198:
      { 
        Fail407:
        { 
          IStrategoTerm c_1041 = null;
          IStrategoTerm j_1041 = null;
          IStrategoTerm k_1041 = null;
          IStrategoTerm l_1041 = null;
          IStrategoTerm n_1041 = null;
          IStrategoTerm o_1041 = null;
          IStrategoTerm p_1041 = null;
          IStrategoTerm q_1041 = null;
          c_1041 = term;
          n_1041 = b_1041;
          j_1041 = transformer_debug.const571;
          o_1041 = n_1041;
          k_1041 = transformer_debug.const572;
          p_1041 = o_1041;
          l_1041 = transformer_debug.const194;
          q_1041 = p_1041;
          term = s_var_0_4.instance.invoke(context, q_1041, j_1041, k_1041, l_1041, transformer_debug.constLocationInfo1083);
          if(term == null)
            break Fail407;
          term = c_1041;
          IStrategoTerm term288 = term;
          Success199:
          { 
            Fail408:
            { 
              IStrategoTerm r_1041 = null;
              IStrategoTerm s_1041 = null;
              IStrategoTerm u_1041 = null;
              IStrategoTerm v_1041 = null;
              IStrategoTerm w_1041 = null;
              u_1041 = transformer_debug.const119;
              r_1041 = transformer_debug.const571;
              v_1041 = u_1041;
              s_1041 = transformer_debug.const572;
              w_1041 = v_1041;
              term = s_step_0_3.instance.invoke(context, w_1041, r_1041, s_1041, transformer_debug.constLocationInfo1084);
              if(term == null)
                break Fail408;
              term = get_config_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail408;
              { 
                IStrategoTerm x_1041 = null;
                IStrategoTerm y_1041 = null;
                IStrategoTerm a_1042 = null;
                IStrategoTerm b_1042 = null;
                IStrategoTerm c_1042 = null;
                IStrategoTerm e_1042 = null;
                IStrategoTerm f_1042 = null;
                IStrategoTerm g_1042 = null;
                IStrategoTerm i_1042 = null;
                IStrategoTerm j_1042 = null;
                IStrategoTerm k_1042 = null;
                IStrategoTerm m_1042 = null;
                a_1042 = term;
                x_1041 = transformer_debug.const571;
                b_1042 = a_1042;
                y_1041 = transformer_debug.const572;
                c_1042 = b_1042;
                term = s_step_0_3.instance.invoke(context, c_1042, x_1041, y_1041, transformer_debug.constLocationInfo1085);
                if(term == null)
                  break Fail407;
                e_1042 = term;
                i_1042 = b_1041;
                f_1042 = transformer_debug.const571;
                j_1042 = i_1042;
                g_1042 = transformer_debug.const572;
                k_1042 = j_1042;
                term = s_step_0_3.instance.invoke(context, k_1042, f_1042, g_1042, transformer_debug.constLocationInfo1086);
                if(term == null)
                  break Fail407;
                m_1042 = term;
                term = guarantee_extension_0_1.instance.invoke(context, m_1042, transformer_debug.const573);
                if(term == null)
                  break Fail407;
                term = write_stratego_rtree_0_1.instance.invoke(context, e_1042, term);
                if(term == null)
                  break Fail407;
                if(true)
                  break Success199;
              }
            }
            term = term288;
            IStrategoTerm n_1042 = null;
            IStrategoTerm o_1042 = null;
            IStrategoTerm q_1042 = null;
            IStrategoTerm r_1042 = null;
            IStrategoTerm s_1042 = null;
            IStrategoTerm u_1042 = null;
            IStrategoTerm v_1042 = null;
            IStrategoTerm w_1042 = null;
            IStrategoTerm y_1042 = null;
            IStrategoTerm z_1042 = null;
            IStrategoTerm a_1043 = null;
            IStrategoTerm c_1043 = null;
            q_1042 = term;
            n_1042 = transformer_debug.const571;
            r_1042 = q_1042;
            o_1042 = transformer_debug.const572;
            s_1042 = r_1042;
            term = s_step_0_3.instance.invoke(context, s_1042, n_1042, o_1042, transformer_debug.constLocationInfo1087);
            if(term == null)
              break Fail407;
            u_1042 = term;
            y_1042 = b_1041;
            v_1042 = transformer_debug.const571;
            z_1042 = y_1042;
            w_1042 = transformer_debug.const572;
            a_1043 = z_1042;
            term = s_step_0_3.instance.invoke(context, a_1043, v_1042, w_1042, transformer_debug.constLocationInfo1088);
            if(term == null)
              break Fail407;
            c_1043 = term;
            term = guarantee_extension_0_1.instance.invoke(context, c_1043, transformer_debug.const574);
            if(term == null)
              break Fail407;
            term = write_stratego_str_0_1.instance.invoke(context, u_1042, term);
            if(term == null)
              break Fail407;
          }
          { 
            IStrategoTerm d_1043 = null;
            IStrategoTerm e_1043 = null;
            IStrategoTerm g_1043 = null;
            IStrategoTerm h_1043 = null;
            IStrategoTerm i_1043 = null;
            g_1043 = term;
            d_1043 = transformer_debug.const571;
            h_1043 = g_1043;
            e_1043 = transformer_debug.const572;
            i_1043 = h_1043;
            term = s_exit_0_3.instance.invoke(context, i_1043, d_1043, e_1043, transformer_debug.constLocationInfo1082);
            if(term == null)
              break Fail406;
            if(true)
              break Success198;
          }
        }
        term = term287;
        IStrategoTerm j_1043 = null;
        IStrategoTerm k_1043 = null;
        IStrategoTerm m_1043 = null;
        IStrategoTerm n_1043 = null;
        IStrategoTerm o_1043 = null;
        m_1043 = term;
        j_1043 = transformer_debug.const571;
        n_1043 = m_1043;
        k_1043 = transformer_debug.const572;
        o_1043 = n_1043;
        term = s_exit_0_3.instance.invoke(context, o_1043, j_1043, k_1043, transformer_debug.constLocationInfo1082);
        if(term == null)
          break Fail406;
        if(true)
          break Fail406;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}