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

@SuppressWarnings("all") public class create_var_0_0 extends Strategy 
{ 
  public static create_var_0_0 instance = new create_var_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_var_0_0");
    Fail321:
    { 
      IStrategoTerm c_722 = null;
      IStrategoTerm d_722 = null;
      IStrategoTerm f_722 = null;
      IStrategoTerm g_722 = null;
      IStrategoTerm i_722 = null;
      IStrategoTerm j_722 = null;
      IStrategoTerm k_722 = null;
      IStrategoTerm m_722 = null;
      IStrategoTerm n_722 = null;
      IStrategoTerm o_722 = null;
      IStrategoTerm v_722 = null;
      IStrategoTerm w_722 = null;
      IStrategoTerm x_722 = null;
      IStrategoTerm a_723 = null;
      IStrategoTerm b_723 = null;
      IStrategoTerm c_723 = null;
      IStrategoTerm d_723 = null;
      IStrategoTerm f_723 = null;
      IStrategoTerm g_723 = null;
      IStrategoTerm h_723 = null;
      IStrategoTerm i_723 = null;
      IStrategoTerm j_723 = null;
      IStrategoTerm k_723 = null;
      IStrategoTerm n_723 = null;
      IStrategoTerm r_723 = null;
      IStrategoTerm s_723 = null;
      c_722 = term;
      IStrategoList annos60 = term.getAnnotations();
      if(annos60.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos60).isEmpty())
        break Fail321;
      d_722 = ((IStrategoList)annos60).head();
      IStrategoTerm arg112 = ((IStrategoList)annos60).tail();
      if(arg112.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg112).isEmpty())
        break Fail321;
      i_722 = term;
      f_722 = transformer_debug.const236;
      j_722 = i_722;
      g_722 = transformer_debug.const259;
      k_722 = j_722;
      term = r_enter_0_3.instance.invoke(context, k_722, f_722, g_722, transformer_debug.constLocationInfo254);
      if(term == null)
        break Fail321;
      v_722 = c_722;
      m_722 = transformer_debug.const236;
      w_722 = v_722;
      n_722 = transformer_debug.const259;
      x_722 = w_722;
      o_722 = transformer_debug.const252;
      a_723 = x_722;
      term = s_var_0_4.instance.invoke(context, a_723, m_722, n_722, o_722, transformer_debug.constLocationInfo255);
      if(term == null)
        break Fail321;
      f_723 = d_722;
      b_723 = transformer_debug.const236;
      g_723 = f_723;
      c_723 = transformer_debug.const259;
      h_723 = g_723;
      d_723 = transformer_debug.const235;
      i_723 = h_723;
      term = s_var_0_4.instance.invoke(context, i_723, b_723, c_723, d_723, transformer_debug.constLocationInfo256);
      if(term == null)
        break Fail321;
      term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consVar_1, new IStrategoTerm[]{c_722}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(d_722, (IStrategoList)transformer_debug.constNil1)));
      n_723 = term;
      j_723 = transformer_debug.const236;
      r_723 = n_723;
      k_723 = transformer_debug.const259;
      s_723 = r_723;
      term = r_exit_0_3.instance.invoke(context, s_723, j_723, k_723, transformer_debug.constLocationInfo254);
      if(term == null)
        break Fail321;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}