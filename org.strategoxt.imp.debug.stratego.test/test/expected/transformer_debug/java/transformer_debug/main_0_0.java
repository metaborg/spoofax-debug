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

@SuppressWarnings("all") public class main_0_0 extends Strategy 
{ 
  public static main_0_0 instance = new main_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("main_0_0");
    Fail278:
    { 
      IStrategoTerm k_385 = null;
      IStrategoTerm l_385 = null;
      IStrategoTerm n_385 = null;
      IStrategoTerm o_385 = null;
      IStrategoTerm p_385 = null;
      n_385 = term;
      k_385 = transformer_debug.const67;
      o_385 = n_385;
      l_385 = transformer_debug.const68;
      p_385 = o_385;
      term = s_enter_0_3.instance.invoke(context, p_385, k_385, l_385, transformer_debug.constLocationInfo0);
      if(term == null)
        break Fail278;
      IStrategoTerm term131 = term;
      Success131:
      { 
        Fail279:
        { 
          IStrategoTerm q_385 = null;
          IStrategoTerm r_385 = null;
          IStrategoTerm t_385 = null;
          IStrategoTerm u_385 = null;
          IStrategoTerm v_385 = null;
          t_385 = term;
          q_385 = transformer_debug.const67;
          u_385 = t_385;
          r_385 = transformer_debug.const68;
          v_385 = u_385;
          term = s_step_0_3.instance.invoke(context, v_385, q_385, r_385, transformer_debug.constLocationInfo5);
          if(term == null)
            break Fail279;
          term = option_wrap_4_0.instance.invoke(context, term, lifted79.instance, lifted80.instance, lifted81.instance, lifted82.instance);
          if(term == null)
            break Fail279;
          { 
            IStrategoTerm u_386 = null;
            IStrategoTerm v_386 = null;
            IStrategoTerm x_386 = null;
            IStrategoTerm y_386 = null;
            IStrategoTerm z_386 = null;
            x_386 = term;
            u_386 = transformer_debug.const67;
            y_386 = x_386;
            v_386 = transformer_debug.const68;
            z_386 = y_386;
            term = s_exit_0_3.instance.invoke(context, z_386, u_386, v_386, transformer_debug.constLocationInfo0);
            if(term == null)
              break Fail278;
            if(true)
              break Success131;
          }
        }
        term = term131;
        IStrategoTerm b_387 = null;
        IStrategoTerm c_387 = null;
        IStrategoTerm e_387 = null;
        IStrategoTerm f_387 = null;
        IStrategoTerm g_387 = null;
        e_387 = term;
        b_387 = transformer_debug.const67;
        f_387 = e_387;
        c_387 = transformer_debug.const68;
        g_387 = f_387;
        term = s_exit_0_3.instance.invoke(context, g_387, b_387, c_387, transformer_debug.constLocationInfo0);
        if(term == null)
          break Fail278;
        if(true)
          break Fail278;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}