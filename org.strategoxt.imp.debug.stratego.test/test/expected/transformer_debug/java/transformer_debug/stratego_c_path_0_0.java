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

@SuppressWarnings("all") public class stratego_c_path_0_0 extends Strategy 
{ 
  public static stratego_c_path_0_0 instance = new stratego_c_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("stratego_c_path_0_0");
    Fail429:
    { 
      IStrategoTerm n_1076 = null;
      IStrategoTerm o_1076 = null;
      IStrategoTerm q_1076 = null;
      IStrategoTerm r_1076 = null;
      IStrategoTerm s_1076 = null;
      q_1076 = term;
      n_1076 = transformer_debug.const571;
      r_1076 = q_1076;
      o_1076 = transformer_debug.const607;
      s_1076 = r_1076;
      term = s_enter_0_3.instance.invoke(context, s_1076, n_1076, o_1076, transformer_debug.constLocationInfo1157);
      if(term == null)
        break Fail429;
      IStrategoTerm term299 = term;
      Success210:
      { 
        Fail430:
        { 
          IStrategoTerm t_1076 = null;
          IStrategoTerm u_1076 = null;
          IStrategoTerm w_1076 = null;
          IStrategoTerm x_1076 = null;
          IStrategoTerm y_1076 = null;
          w_1076 = term;
          t_1076 = transformer_debug.const571;
          x_1076 = w_1076;
          u_1076 = transformer_debug.const607;
          y_1076 = x_1076;
          term = s_step_0_3.instance.invoke(context, y_1076, t_1076, u_1076, transformer_debug.constLocationInfo1158);
          if(term == null)
            break Fail430;
          term = transformer_debug.const608;
          { 
            IStrategoTerm z_1076 = null;
            IStrategoTerm a_1077 = null;
            IStrategoTerm c_1077 = null;
            IStrategoTerm d_1077 = null;
            IStrategoTerm e_1077 = null;
            c_1077 = term;
            z_1076 = transformer_debug.const571;
            d_1077 = c_1077;
            a_1077 = transformer_debug.const607;
            e_1077 = d_1077;
            term = s_exit_0_3.instance.invoke(context, e_1077, z_1076, a_1077, transformer_debug.constLocationInfo1157);
            if(term == null)
              break Fail429;
            if(true)
              break Success210;
          }
        }
        term = term299;
        IStrategoTerm f_1077 = null;
        IStrategoTerm g_1077 = null;
        IStrategoTerm i_1077 = null;
        IStrategoTerm j_1077 = null;
        IStrategoTerm k_1077 = null;
        i_1077 = term;
        f_1077 = transformer_debug.const571;
        j_1077 = i_1077;
        g_1077 = transformer_debug.const607;
        k_1077 = j_1077;
        term = s_exit_0_3.instance.invoke(context, k_1077, f_1077, g_1077, transformer_debug.constLocationInfo1157);
        if(term == null)
          break Fail429;
        if(true)
          break Fail429;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}