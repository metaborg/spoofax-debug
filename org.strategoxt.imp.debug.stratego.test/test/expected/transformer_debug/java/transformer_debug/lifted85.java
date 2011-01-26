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

@SuppressWarnings("all") final class lifted85 extends Strategy 
{ 
  public static final lifted85 instance = new lifted85();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail635:
    { 
      IStrategoTerm p_394 = null;
      IStrategoTerm q_394 = null;
      IStrategoTerm t_394 = null;
      IStrategoTerm u_394 = null;
      IStrategoTerm v_394 = null;
      t_394 = transformer_debug.const121;
      p_394 = transformer_debug.const67;
      u_394 = t_394;
      q_394 = transformer_debug.const122;
      v_394 = u_394;
      term = s_step_0_3.instance.invoke(context, v_394, p_394, q_394, transformer_debug.constLocationInfo27);
      if(term == null)
        break Fail635;
      term = set_config_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail635;
      if(true)
        return term;
    }
    return null;
  }
}