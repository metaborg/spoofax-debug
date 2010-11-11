package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_function_name_0_0 extends Strategy 
{ 
  public static get_function_name_0_0 instance = new get_function_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_function_name_0_0");
    Fail13:
    { 
      IStrategoTerm s_5 = null;
      IStrategoTerm u_5 = null;
      IStrategoTerm w_5 = null;
      IStrategoTerm x_5 = null;
      IStrategoTerm y_5 = null;
      IStrategoTerm a_6 = null;
      IStrategoTerm b_6 = null;
      if(term.getTermType() != IStrategoTerm.APPL || localvar._consFunction_2 != ((IStrategoAppl)term).getConstructor())
        break Fail13;
      s_5 = term.getSubterm(0);
      w_5 = term;
      u_5 = localvar.const32;
      x_5 = w_5;
      term = r_enter_0_2.instance.invoke(context, x_5, u_5, localvar.constLocationInfo7);
      if(term == null)
        break Fail13;
      a_6 = s_5;
      y_5 = localvar.const32;
      b_6 = a_6;
      term = r_exit_0_2.instance.invoke(context, b_6, y_5, localvar.constLocationInfo7);
      if(term == null)
        break Fail13;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}