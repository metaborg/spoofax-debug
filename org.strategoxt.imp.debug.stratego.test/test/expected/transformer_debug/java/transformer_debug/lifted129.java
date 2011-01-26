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

@SuppressWarnings("all") final class lifted129 extends Strategy 
{ 
  TermReference e_1145;

  TermReference f_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail578:
    { 
      IStrategoTerm e_793 = null;
      IStrategoTerm f_793 = null;
      IStrategoTerm h_793 = null;
      IStrategoTerm i_793 = null;
      IStrategoTerm j_793 = null;
      h_793 = term;
      e_793 = transformer_debug.const284;
      i_793 = h_793;
      f_793 = transformer_debug.const320;
      j_793 = i_793;
      term = s_step_0_3.instance.invoke(context, j_793, e_793, f_793, transformer_debug.constLocationInfo437);
      if(term == null)
        break Fail578;
      term = add_s_var_to_clause_0_2.instance.invoke(context, term, e_1145.value, f_1145.value);
      if(term == null)
        break Fail578;
      if(true)
        return term;
    }
    return null;
  }
}