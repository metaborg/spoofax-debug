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

@SuppressWarnings("all") public class check_input_file_0_0 extends Strategy 
{ 
  public static check_input_file_0_0 instance = new check_input_file_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("check_input_file_0_0");
    Fail293:
    { 
      IStrategoTerm d_406 = null;
      IStrategoTerm e_406 = null;
      IStrategoTerm f_406 = null;
      IStrategoTerm h_406 = null;
      IStrategoTerm i_406 = null;
      IStrategoTerm j_406 = null;
      h_406 = term;
      e_406 = transformer_debug.const67;
      i_406 = h_406;
      f_406 = transformer_debug.const163;
      j_406 = i_406;
      term = s_enter_0_3.instance.invoke(context, j_406, e_406, f_406, transformer_debug.constLocationInfo56);
      if(term == null)
        break Fail293;
      IStrategoTerm term143 = term;
      Success141:
      { 
        Fail294:
        { 
          IStrategoTerm k_406 = null;
          IStrategoTerm l_406 = null;
          IStrategoTerm n_406 = null;
          IStrategoTerm o_406 = null;
          IStrategoTerm p_406 = null;
          n_406 = term;
          k_406 = transformer_debug.const67;
          o_406 = n_406;
          l_406 = transformer_debug.const163;
          p_406 = o_406;
          term = s_step_0_3.instance.invoke(context, p_406, k_406, l_406, transformer_debug.constLocationInfo57);
          if(term == null)
            break Fail294;
          d_406 = term;
          IStrategoTerm term144 = term;
          Success142:
          { 
            Fail295:
            { 
              IStrategoTerm q_406 = null;
              IStrategoTerm r_406 = null;
              IStrategoTerm t_406 = null;
              IStrategoTerm u_406 = null;
              IStrategoTerm v_406 = null;
              t_406 = term;
              q_406 = transformer_debug.const67;
              u_406 = t_406;
              r_406 = transformer_debug.const163;
              v_406 = u_406;
              term = s_step_0_3.instance.invoke(context, v_406, q_406, r_406, transformer_debug.constLocationInfo58);
              if(term == null)
                break Fail295;
              term = file_exists_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail295;
              if(true)
                break Success142;
            }
            term = term144;
            IStrategoTerm w_406 = null;
            IStrategoTerm x_406 = null;
            IStrategoTerm z_406 = null;
            IStrategoTerm a_407 = null;
            IStrategoTerm b_407 = null;
            IStrategoTerm c_407 = null;
            IStrategoTerm d_407 = null;
            IStrategoTerm f_407 = null;
            IStrategoTerm g_407 = null;
            IStrategoTerm h_407 = null;
            IStrategoTerm o_407 = null;
            IStrategoTerm p_407 = null;
            IStrategoTerm r_407 = null;
            IStrategoTerm s_407 = null;
            IStrategoTerm t_407 = null;
            z_406 = term;
            w_406 = transformer_debug.const67;
            a_407 = z_406;
            x_406 = transformer_debug.const163;
            b_407 = a_407;
            term = s_step_0_3.instance.invoke(context, b_407, w_406, x_406, transformer_debug.constLocationInfo59);
            if(term == null)
              break Fail294;
            f_407 = d_406;
            c_407 = transformer_debug.const67;
            g_407 = f_407;
            d_407 = transformer_debug.const163;
            h_407 = g_407;
            term = s_step_0_3.instance.invoke(context, h_407, c_407, d_407, transformer_debug.constLocationInfo60);
            if(term == null)
              break Fail294;
            term = debug_1_0.instance.invoke(context, term, lifted105.instance);
            if(term == null)
              break Fail294;
            r_407 = term;
            o_407 = transformer_debug.const67;
            s_407 = r_407;
            p_407 = transformer_debug.const163;
            t_407 = s_407;
            term = s_step_0_3.instance.invoke(context, t_407, o_407, p_407, transformer_debug.constLocationInfo62);
            if(term == null)
              break Fail294;
            if(true)
              break Fail294;
          }
          { 
            IStrategoTerm u_407 = null;
            IStrategoTerm v_407 = null;
            IStrategoTerm x_407 = null;
            IStrategoTerm y_407 = null;
            IStrategoTerm z_407 = null;
            x_407 = term;
            u_407 = transformer_debug.const67;
            y_407 = x_407;
            v_407 = transformer_debug.const163;
            z_407 = y_407;
            term = s_exit_0_3.instance.invoke(context, z_407, u_407, v_407, transformer_debug.constLocationInfo56);
            if(term == null)
              break Fail293;
            if(true)
              break Success141;
          }
        }
        term = term143;
        IStrategoTerm a_408 = null;
        IStrategoTerm b_408 = null;
        IStrategoTerm f_408 = null;
        IStrategoTerm g_408 = null;
        IStrategoTerm h_408 = null;
        f_408 = term;
        a_408 = transformer_debug.const67;
        g_408 = f_408;
        b_408 = transformer_debug.const163;
        h_408 = g_408;
        term = s_exit_0_3.instance.invoke(context, h_408, a_408, b_408, transformer_debug.constLocationInfo56);
        if(term == null)
          break Fail293;
        if(true)
          break Fail293;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}