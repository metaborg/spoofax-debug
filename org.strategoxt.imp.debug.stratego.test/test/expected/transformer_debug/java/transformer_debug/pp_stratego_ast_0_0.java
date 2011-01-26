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

@SuppressWarnings("all") public class pp_stratego_ast_0_0 extends Strategy 
{ 
  public static pp_stratego_ast_0_0 instance = new pp_stratego_ast_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("pp_stratego_ast_0_0");
    Fail419:
    { 
      IStrategoTerm b_1069 = null;
      IStrategoTerm c_1069 = null;
      IStrategoTerm e_1069 = null;
      IStrategoTerm f_1069 = null;
      IStrategoTerm g_1069 = null;
      e_1069 = term;
      b_1069 = transformer_debug.const571;
      f_1069 = e_1069;
      c_1069 = transformer_debug.const592;
      g_1069 = f_1069;
      term = s_enter_0_3.instance.invoke(context, g_1069, b_1069, c_1069, transformer_debug.constLocationInfo1138);
      if(term == null)
        break Fail419;
      IStrategoTerm term294 = term;
      Success205:
      { 
        Fail420:
        { 
          IStrategoTerm h_1069 = null;
          IStrategoTerm i_1069 = null;
          IStrategoTerm k_1069 = null;
          IStrategoTerm l_1069 = null;
          IStrategoTerm m_1069 = null;
          k_1069 = term;
          h_1069 = transformer_debug.const571;
          l_1069 = k_1069;
          i_1069 = transformer_debug.const592;
          m_1069 = l_1069;
          term = s_step_0_3.instance.invoke(context, m_1069, h_1069, i_1069, transformer_debug.constLocationInfo1139);
          if(term == null)
            break Fail420;
          term = pp_stratego_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail420;
          { 
            IStrategoTerm n_1069 = null;
            IStrategoTerm o_1069 = null;
            IStrategoTerm q_1069 = null;
            IStrategoTerm r_1069 = null;
            IStrategoTerm s_1069 = null;
            q_1069 = term;
            n_1069 = transformer_debug.const571;
            r_1069 = q_1069;
            o_1069 = transformer_debug.const592;
            s_1069 = r_1069;
            term = s_exit_0_3.instance.invoke(context, s_1069, n_1069, o_1069, transformer_debug.constLocationInfo1138);
            if(term == null)
              break Fail419;
            if(true)
              break Success205;
          }
        }
        term = term294;
        IStrategoTerm t_1069 = null;
        IStrategoTerm u_1069 = null;
        IStrategoTerm w_1069 = null;
        IStrategoTerm x_1069 = null;
        IStrategoTerm y_1069 = null;
        w_1069 = term;
        t_1069 = transformer_debug.const571;
        x_1069 = w_1069;
        u_1069 = transformer_debug.const592;
        y_1069 = x_1069;
        term = s_exit_0_3.instance.invoke(context, y_1069, t_1069, u_1069, transformer_debug.constLocationInfo1138);
        if(term == null)
          break Fail419;
        if(true)
          break Fail419;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}