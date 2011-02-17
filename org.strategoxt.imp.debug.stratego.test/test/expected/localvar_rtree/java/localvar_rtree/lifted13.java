package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") final class lifted13 extends Strategy 
{ 
  TermReference s_136;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    Fail66:
    { 
      IStrategoTerm o_138 = null;
      IStrategoTerm p_138 = null;
      IStrategoTerm u_138 = null;
      IStrategoTerm v_138 = null;
      IStrategoTerm w_138 = null;
      u_138 = term;
      o_138 = localvar_rtree.const125;
      v_138 = u_138;
      p_138 = localvar_rtree.const182;
      w_138 = v_138;
      term = s_step_0_3.instance.invoke(context, w_138, o_138, p_138, localvar_rtree.constLocationInfo119);
      if(term == null)
        break Fail66;
      term = try_find_comment_by_name_0_1.instance.invoke(context, term, s_136.value);
      if(term == null)
        break Fail66;
      if(true)
        return term;
    }
    return null;
  }
}