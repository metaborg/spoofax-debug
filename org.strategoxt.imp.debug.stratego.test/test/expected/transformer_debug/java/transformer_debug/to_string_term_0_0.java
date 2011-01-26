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

@SuppressWarnings("all") public class to_string_term_0_0 extends Strategy 
{ 
  public static to_string_term_0_0 instance = new to_string_term_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("to_string_term_0_0");
    Fail363:
    { 
      IStrategoTerm e_816 = null;
      IStrategoTerm g_816 = null;
      IStrategoTerm h_816 = null;
      IStrategoTerm k_816 = null;
      IStrategoTerm l_816 = null;
      IStrategoTerm m_816 = null;
      IStrategoTerm o_816 = null;
      IStrategoTerm p_816 = null;
      IStrategoTerm q_816 = null;
      IStrategoTerm s_816 = null;
      IStrategoTerm t_816 = null;
      IStrategoTerm u_816 = null;
      IStrategoTerm v_816 = null;
      IStrategoTerm w_816 = null;
      IStrategoTerm x_816 = null;
      IStrategoTerm z_816 = null;
      IStrategoTerm a_817 = null;
      IStrategoTerm c_817 = null;
      e_816 = term;
      k_816 = term;
      g_816 = transformer_debug.const284;
      l_816 = k_816;
      h_816 = transformer_debug.const366;
      m_816 = l_816;
      term = r_enter_0_3.instance.invoke(context, m_816, g_816, h_816, transformer_debug.constLocationInfo505);
      if(term == null)
        break Fail363;
      s_816 = e_816;
      o_816 = transformer_debug.const284;
      t_816 = s_816;
      p_816 = transformer_debug.const366;
      u_816 = t_816;
      q_816 = transformer_debug.const369;
      v_816 = u_816;
      term = s_var_0_4.instance.invoke(context, v_816, o_816, p_816, q_816, transformer_debug.constLocationInfo506);
      if(term == null)
        break Fail363;
      term = termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{e_816})});
      z_816 = term;
      w_816 = transformer_debug.const284;
      a_817 = z_816;
      x_816 = transformer_debug.const366;
      c_817 = a_817;
      term = r_exit_0_3.instance.invoke(context, c_817, w_816, x_816, transformer_debug.constLocationInfo505);
      if(term == null)
        break Fail363;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}