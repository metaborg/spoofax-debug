package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class build_c_0_0 extends Strategy 
{ 
  public static build_c_0_0 instance = new build_c_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("build_c_0_0");
    Fail22:
    { 
      IStrategoTerm r_32 = null;
      IStrategoTerm s_32 = null;
      IStrategoTerm u_32 = null;
      IStrategoTerm v_32 = null;
      IStrategoTerm w_32 = null;
      u_32 = term;
      r_32 = dynamic.const0;
      v_32 = u_32;
      s_32 = dynamic.const121;
      w_32 = v_32;
      term = s_enter_0_3.instance.invoke(context, w_32, r_32, s_32, dynamic.constLocationInfo81);
      if(term == null)
        break Fail22;
      IStrategoTerm term11 = term;
      Success10:
      { 
        Fail23:
        { 
          IStrategoTerm x_32 = null;
          IStrategoTerm y_32 = null;
          IStrategoTerm a_33 = null;
          IStrategoTerm b_33 = null;
          IStrategoTerm c_33 = null;
          a_33 = term;
          x_32 = dynamic.const0;
          b_33 = a_33;
          y_32 = dynamic.const121;
          c_33 = b_33;
          term = s_step_0_3.instance.invoke(context, c_33, x_32, y_32, dynamic.constLocationInfo82);
          if(term == null)
            break Fail23;
          term = dynamic.constComment0;
          { 
            IStrategoTerm d_33 = null;
            IStrategoTerm e_33 = null;
            IStrategoTerm g_33 = null;
            IStrategoTerm h_33 = null;
            IStrategoTerm i_33 = null;
            g_33 = term;
            d_33 = dynamic.const0;
            h_33 = g_33;
            e_33 = dynamic.const121;
            i_33 = h_33;
            term = s_exit_0_3.instance.invoke(context, i_33, d_33, e_33, dynamic.constLocationInfo81);
            if(term == null)
              break Fail22;
            if(true)
              break Success10;
          }
        }
        term = term11;
        IStrategoTerm j_33 = null;
        IStrategoTerm k_33 = null;
        IStrategoTerm m_33 = null;
        IStrategoTerm n_33 = null;
        IStrategoTerm o_33 = null;
        m_33 = term;
        j_33 = dynamic.const0;
        n_33 = m_33;
        k_33 = dynamic.const121;
        o_33 = n_33;
        term = s_exit_0_3.instance.invoke(context, o_33, j_33, k_33, dynamic.constLocationInfo81);
        if(term == null)
          break Fail22;
        if(true)
          break Fail22;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}