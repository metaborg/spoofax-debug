package org.localvar;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.libstrategodebuglib.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class main_0_0 extends Strategy 
{ 
  public static main_0_0 instance = new main_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("main_0_0");
    Fail0:
    { 
      IStrategoTerm t_0 = null;
      IStrategoTerm v_0 = null;
      IStrategoTerm y_0 = null;
      IStrategoTerm z_0 = null;
      IStrategoTerm d_1 = null;
      IStrategoTerm e_1 = null;
      v_0 = term;
      t_0 = localvar.const0;
      y_0 = v_0;
      term = s_enter_0_2.instance.invoke(context, y_0, t_0, localvar.constLocationInfo0);
      if(term == null)
        break Fail0;
      term = io_wrap_1_0.instance.invoke(context, term, execute_0_0.instance);
      if(term == null)
        break Fail0;
      d_1 = term;
      z_0 = localvar.const0;
      e_1 = d_1;
      term = s_exit_0_2.instance.invoke(context, e_1, z_0, localvar.constLocationInfo0);
      if(term == null)
        break Fail0;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}