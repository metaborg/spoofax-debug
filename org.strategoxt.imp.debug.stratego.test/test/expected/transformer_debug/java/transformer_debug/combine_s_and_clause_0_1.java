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

@SuppressWarnings("all") public class combine_s_and_clause_0_1 extends Strategy 
{ 
  public static combine_s_and_clause_0_1 instance = new combine_s_and_clause_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm s_764)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("combine_s_and_clause_0_1");
    Fail336:
    { 
      IStrategoTerm t_764 = null;
      IStrategoTerm v_764 = null;
      IStrategoTerm w_764 = null;
      IStrategoTerm z_764 = null;
      IStrategoTerm a_765 = null;
      IStrategoTerm b_765 = null;
      IStrategoTerm d_765 = null;
      IStrategoTerm e_765 = null;
      IStrategoTerm f_765 = null;
      IStrategoTerm h_765 = null;
      IStrategoTerm i_765 = null;
      IStrategoTerm j_765 = null;
      IStrategoTerm k_765 = null;
      IStrategoTerm m_765 = null;
      IStrategoTerm n_765 = null;
      IStrategoTerm o_765 = null;
      IStrategoTerm q_765 = null;
      IStrategoTerm r_765 = null;
      IStrategoTerm s_765 = null;
      IStrategoTerm t_765 = null;
      IStrategoTerm w_765 = null;
      IStrategoTerm x_765 = null;
      IStrategoTerm z_765 = null;
      IStrategoTerm a_766 = null;
      IStrategoTerm b_766 = null;
      t_764 = term;
      z_764 = term;
      v_764 = transformer_debug.const284;
      a_765 = z_764;
      w_764 = transformer_debug.const296;
      b_765 = a_765;
      term = r_enter_0_3.instance.invoke(context, b_765, v_764, w_764, transformer_debug.constLocationInfo369);
      if(term == null)
        break Fail336;
      h_765 = s_764;
      d_765 = transformer_debug.const284;
      i_765 = h_765;
      e_765 = transformer_debug.const296;
      j_765 = i_765;
      f_765 = transformer_debug.const277;
      k_765 = j_765;
      term = s_var_0_4.instance.invoke(context, k_765, d_765, e_765, f_765, transformer_debug.constLocationInfo370);
      if(term == null)
        break Fail336;
      q_765 = t_764;
      m_765 = transformer_debug.const284;
      r_765 = q_765;
      n_765 = transformer_debug.const296;
      s_765 = r_765;
      o_765 = transformer_debug.const242;
      t_765 = s_765;
      term = s_var_0_4.instance.invoke(context, t_765, m_765, n_765, o_765, transformer_debug.constLocationInfo371);
      if(term == null)
        break Fail336;
      term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{t_764, s_764});
      z_765 = term;
      w_765 = transformer_debug.const284;
      a_766 = z_765;
      x_765 = transformer_debug.const296;
      b_766 = a_766;
      term = r_exit_0_3.instance.invoke(context, b_766, w_765, x_765, transformer_debug.constLocationInfo369);
      if(term == null)
        break Fail336;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}