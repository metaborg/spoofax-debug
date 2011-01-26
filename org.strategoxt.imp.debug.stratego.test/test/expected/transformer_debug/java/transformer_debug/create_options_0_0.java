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

@SuppressWarnings("all") public class create_options_0_0 extends Strategy 
{ 
  public static create_options_0_0 instance = new create_options_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("create_options_0_0");
    Fail287:
    { 
      IStrategoTerm l_393 = null;
      IStrategoTerm m_393 = null;
      IStrategoTerm o_393 = null;
      IStrategoTerm p_393 = null;
      IStrategoTerm q_393 = null;
      o_393 = term;
      l_393 = transformer_debug.const67;
      p_393 = o_393;
      m_393 = transformer_debug.const122;
      q_393 = p_393;
      term = s_enter_0_3.instance.invoke(context, q_393, l_393, m_393, transformer_debug.constLocationInfo49);
      if(term == null)
        break Fail287;
      IStrategoTerm term139 = term;
      Success137:
      { 
        Fail288:
        { 
          IStrategoTerm term140 = term;
          Success138:
          { 
            Fail289:
            { 
              IStrategoTerm r_393 = null;
              IStrategoTerm s_393 = null;
              IStrategoTerm u_393 = null;
              IStrategoTerm v_393 = null;
              IStrategoTerm w_393 = null;
              u_393 = term;
              r_393 = transformer_debug.const67;
              v_393 = u_393;
              s_393 = transformer_debug.const122;
              w_393 = v_393;
              term = s_step_0_3.instance.invoke(context, w_393, r_393, s_393, transformer_debug.constLocationInfo52);
              if(term == null)
                break Fail289;
              term = $Option_3_0.instance.invoke(context, term, lifted102.instance, lifted103.instance, lifted104.instance);
              if(term == null)
                break Fail289;
              if(true)
                break Success138;
            }
            term = term140;
            term = create_options_0_0_fragment_0.instance.invoke(context, term);
            if(term == null)
              break Fail288;
          }
          { 
            IStrategoTerm n_404 = null;
            IStrategoTerm o_404 = null;
            IStrategoTerm q_404 = null;
            IStrategoTerm r_404 = null;
            IStrategoTerm s_404 = null;
            q_404 = term;
            n_404 = transformer_debug.const67;
            r_404 = q_404;
            o_404 = transformer_debug.const122;
            s_404 = r_404;
            term = s_exit_0_3.instance.invoke(context, s_404, n_404, o_404, transformer_debug.constLocationInfo49);
            if(term == null)
              break Fail287;
            if(true)
              break Success137;
          }
        }
        term = term139;
        IStrategoTerm t_404 = null;
        IStrategoTerm u_404 = null;
        IStrategoTerm w_404 = null;
        IStrategoTerm x_404 = null;
        IStrategoTerm y_404 = null;
        w_404 = term;
        t_404 = transformer_debug.const67;
        x_404 = w_404;
        u_404 = transformer_debug.const122;
        y_404 = x_404;
        term = s_exit_0_3.instance.invoke(context, y_404, t_404, u_404, transformer_debug.constLocationInfo49);
        if(term == null)
          break Fail287;
        if(true)
          break Fail287;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}