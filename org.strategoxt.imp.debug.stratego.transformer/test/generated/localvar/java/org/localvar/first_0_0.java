package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class first_0_0 extends Strategy 
{ 
  public static first_0_0 instance = new first_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("first_0_0");
    Fail16:
    { 
      IStrategoTerm w_6 = null;
      IStrategoTerm y_6 = null;
      IStrategoTerm a_7 = null;
      IStrategoTerm b_7 = null;
      IStrategoTerm c_7 = null;
      IStrategoTerm e_7 = null;
      IStrategoTerm f_7 = null;
      w_6 = term;
      a_7 = term;
      y_6 = localvar.const41;
      b_7 = a_7;
      term = r_enter_0_2.instance.invoke(context, b_7, y_6, localvar.constLocationInfo9);
      if(term == null)
        break Fail16;
      term = last_0_0.instance.invoke(context, w_6);
      if(term == null)
        break Fail16;
      e_7 = term;
      c_7 = localvar.const41;
      f_7 = e_7;
      term = r_exit_0_2.instance.invoke(context, f_7, c_7, localvar.constLocationInfo9);
      if(term == null)
        break Fail16;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}