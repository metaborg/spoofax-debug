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

@SuppressWarnings("all") public class execute_0_0 extends Strategy 
{ 
  public static execute_0_0 instance = new execute_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("execute_0_0");
    Fail280:
    { 
      TermReference h_387 = new TermReference();
      TermReference i_387 = new TermReference();
      TermReference j_387 = new TermReference();
      TermReference k_387 = new TermReference();
      TermReference l_387 = new TermReference();
      IStrategoTerm m_387 = null;
      IStrategoTerm n_387 = null;
      IStrategoTerm p_387 = null;
      IStrategoTerm s_387 = null;
      IStrategoTerm t_387 = null;
      p_387 = term;
      m_387 = transformer_debug.const67;
      s_387 = p_387;
      n_387 = transformer_debug.const81;
      t_387 = s_387;
      term = s_enter_0_3.instance.invoke(context, t_387, m_387, n_387, transformer_debug.constLocationInfo26);
      if(term == null)
        break Fail280;
      execute_0_0_fragment_0 execute_0_0_fragment_00 = new execute_0_0_fragment_0();
      execute_0_0_fragment_00.h_387 = h_387;
      execute_0_0_fragment_00.i_387 = i_387;
      execute_0_0_fragment_00.j_387 = j_387;
      execute_0_0_fragment_00.k_387 = k_387;
      execute_0_0_fragment_00.l_387 = l_387;
      term = execute_0_0_fragment_00.invoke(context, term);
      if(term == null)
        break Fail280;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}