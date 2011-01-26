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

@SuppressWarnings("all") public class create_arg_0_0 extends Strategy 
{ 
  public static create_arg_0_0 instance = new create_arg_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_arg_0_0");
    Fail310:
    { 
      IStrategoTerm w_694 = null;
      IStrategoTerm y_694 = null;
      IStrategoTerm z_694 = null;
      IStrategoTerm b_695 = null;
      IStrategoTerm c_695 = null;
      IStrategoTerm d_695 = null;
      IStrategoTerm f_695 = null;
      IStrategoTerm g_695 = null;
      IStrategoTerm h_695 = null;
      IStrategoTerm j_695 = null;
      IStrategoTerm k_695 = null;
      IStrategoTerm l_695 = null;
      IStrategoTerm m_695 = null;
      IStrategoTerm n_695 = null;
      IStrategoTerm o_695 = null;
      IStrategoTerm q_695 = null;
      IStrategoTerm r_695 = null;
      IStrategoTerm s_695 = null;
      w_694 = term;
      b_695 = term;
      y_694 = transformer_debug.const227;
      c_695 = b_695;
      z_694 = transformer_debug.const234;
      d_695 = c_695;
      term = r_enter_0_3.instance.invoke(context, d_695, y_694, z_694, transformer_debug.constLocationInfo172);
      if(term == null)
        break Fail310;
      j_695 = w_694;
      f_695 = transformer_debug.const227;
      k_695 = j_695;
      g_695 = transformer_debug.const234;
      l_695 = k_695;
      h_695 = transformer_debug.const235;
      m_695 = l_695;
      term = s_var_0_4.instance.invoke(context, m_695, f_695, g_695, h_695, transformer_debug.constLocationInfo173);
      if(term == null)
        break Fail310;
      term = termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{w_694})});
      q_695 = term;
      n_695 = transformer_debug.const227;
      r_695 = q_695;
      o_695 = transformer_debug.const234;
      s_695 = r_695;
      term = r_exit_0_3.instance.invoke(context, s_695, n_695, o_695, transformer_debug.constLocationInfo172);
      if(term == null)
        break Fail310;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}