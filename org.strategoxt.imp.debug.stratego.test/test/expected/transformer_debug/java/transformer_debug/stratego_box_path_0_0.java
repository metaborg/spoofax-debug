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

@SuppressWarnings("all") public class stratego_box_path_0_0 extends Strategy 
{ 
  public static stratego_box_path_0_0 instance = new stratego_box_path_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("stratego_box_path_0_0");
    Fail423:
    { 
      IStrategoTerm t_1073 = null;
      IStrategoTerm u_1073 = null;
      IStrategoTerm w_1073 = null;
      IStrategoTerm x_1073 = null;
      IStrategoTerm y_1073 = null;
      w_1073 = term;
      t_1073 = transformer_debug.const571;
      x_1073 = w_1073;
      u_1073 = transformer_debug.const599;
      y_1073 = x_1073;
      term = s_enter_0_3.instance.invoke(context, y_1073, t_1073, u_1073, transformer_debug.constLocationInfo1151);
      if(term == null)
        break Fail423;
      IStrategoTerm term296 = term;
      Success207:
      { 
        Fail424:
        { 
          IStrategoTerm z_1073 = null;
          IStrategoTerm a_1074 = null;
          IStrategoTerm c_1074 = null;
          IStrategoTerm d_1074 = null;
          IStrategoTerm e_1074 = null;
          c_1074 = term;
          z_1073 = transformer_debug.const571;
          d_1074 = c_1074;
          a_1074 = transformer_debug.const599;
          e_1074 = d_1074;
          term = s_step_0_3.instance.invoke(context, e_1074, z_1073, a_1074, transformer_debug.constLocationInfo1152);
          if(term == null)
            break Fail424;
          term = transformer_debug.const601;
          { 
            IStrategoTerm f_1074 = null;
            IStrategoTerm g_1074 = null;
            IStrategoTerm i_1074 = null;
            IStrategoTerm j_1074 = null;
            IStrategoTerm k_1074 = null;
            i_1074 = term;
            f_1074 = transformer_debug.const571;
            j_1074 = i_1074;
            g_1074 = transformer_debug.const599;
            k_1074 = j_1074;
            term = s_exit_0_3.instance.invoke(context, k_1074, f_1074, g_1074, transformer_debug.constLocationInfo1151);
            if(term == null)
              break Fail423;
            if(true)
              break Success207;
          }
        }
        term = term296;
        IStrategoTerm l_1074 = null;
        IStrategoTerm m_1074 = null;
        IStrategoTerm o_1074 = null;
        IStrategoTerm p_1074 = null;
        IStrategoTerm q_1074 = null;
        o_1074 = term;
        l_1074 = transformer_debug.const571;
        p_1074 = o_1074;
        m_1074 = transformer_debug.const599;
        q_1074 = p_1074;
        term = s_exit_0_3.instance.invoke(context, q_1074, l_1074, m_1074, transformer_debug.constLocationInfo1151);
        if(term == null)
          break Fail423;
        if(true)
          break Fail423;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}