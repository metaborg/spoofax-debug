package strategies.debuggable_lib;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;

@SuppressWarnings("all") public class main_0_0 extends Strategy 
{ 
  public static main_0_0 instance = new main_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("main_0_0");
    Fail0:
    { 
      IStrategoTerm g_0 = null;
      IStrategoTerm h_0 = null;
      IStrategoTerm i_0 = null;
      IStrategoTerm j_0 = null;
      IStrategoTerm l_66 = null;
      IStrategoTerm o_66 = null;
      IStrategoTerm m_66 = null;
      IStrategoTerm p_66 = null;
      IStrategoTerm s_66 = null;
      IStrategoTerm q_66 = null;
      h_0 = term;
      g_0 = debuggable_lib.const0;
      o_66 = h_0;
      l_66 = g_0;
      m_66 = o_66;
      term = debug_1_0.instance.invoke(context, l_66, lifted6.instance);
      if(term == null)
        break Fail0;
      j_0 = m_66;
      i_0 = debuggable_lib.const0;
      s_66 = j_0;
      p_66 = i_0;
      q_66 = s_66;
      term = debug_1_0.instance.invoke(context, p_66, lifted9.instance);
      if(term == null)
        break Fail0;
      term = q_66;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}