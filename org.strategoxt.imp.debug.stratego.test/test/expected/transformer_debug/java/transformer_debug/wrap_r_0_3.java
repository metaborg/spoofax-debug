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

@SuppressWarnings("all") public class wrap_r_0_3 extends Strategy 
{ 
  public static wrap_r_0_3 instance = new wrap_r_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_o_1145, IStrategoTerm ref_p_1145, IStrategoTerm ref_q_1145)
  { 
    TermReference o_1145 = new TermReference(ref_o_1145);
    TermReference p_1145 = new TermReference(ref_p_1145);
    TermReference q_1145 = new TermReference(ref_q_1145);
    context.push("wrap_r_0_3");
    Fail390:
    { 
      wrap_r_0_3_fragment_0 wrap_r_0_3_fragment_00 = new wrap_r_0_3_fragment_0();
      wrap_r_0_3_fragment_00.o_1145 = o_1145;
      wrap_r_0_3_fragment_00.p_1145 = p_1145;
      wrap_r_0_3_fragment_00.q_1145 = q_1145;
      term = wrap_r_0_3_fragment_00.invoke(context, term);
      if(term == null)
        break Fail390;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}