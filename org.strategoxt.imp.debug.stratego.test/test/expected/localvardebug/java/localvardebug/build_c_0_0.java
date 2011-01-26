package localvardebug;

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
      IStrategoTerm z_31 = null;
      IStrategoTerm a_32 = null;
      IStrategoTerm c_32 = null;
      IStrategoTerm d_32 = null;
      IStrategoTerm e_32 = null;
      c_32 = term;
      z_31 = localvardebug.const0;
      d_32 = c_32;
      a_32 = localvardebug.const122;
      e_32 = d_32;
      term = s_enter_0_3.instance.invoke(context, e_32, z_31, a_32, localvardebug.constLocationInfo86);
      if(term == null)
        break Fail22;
      IStrategoTerm term10 = term;
      Success10:
      { 
        Fail23:
        { 
          IStrategoTerm f_32 = null;
          IStrategoTerm g_32 = null;
          IStrategoTerm i_32 = null;
          IStrategoTerm j_32 = null;
          IStrategoTerm k_32 = null;
          i_32 = term;
          f_32 = localvardebug.const0;
          j_32 = i_32;
          g_32 = localvardebug.const122;
          k_32 = j_32;
          term = s_step_0_3.instance.invoke(context, k_32, f_32, g_32, localvardebug.constLocationInfo87);
          if(term == null)
            break Fail23;
          term = localvardebug.constComment0;
          { 
            IStrategoTerm l_32 = null;
            IStrategoTerm m_32 = null;
            IStrategoTerm o_32 = null;
            IStrategoTerm p_32 = null;
            IStrategoTerm q_32 = null;
            o_32 = term;
            l_32 = localvardebug.const0;
            p_32 = o_32;
            m_32 = localvardebug.const122;
            q_32 = p_32;
            term = s_exit_0_3.instance.invoke(context, q_32, l_32, m_32, localvardebug.constLocationInfo86);
            if(term == null)
              break Fail22;
            if(true)
              break Success10;
          }
        }
        term = term10;
        IStrategoTerm r_32 = null;
        IStrategoTerm s_32 = null;
        IStrategoTerm u_32 = null;
        IStrategoTerm v_32 = null;
        IStrategoTerm w_32 = null;
        u_32 = term;
        r_32 = localvardebug.const0;
        v_32 = u_32;
        s_32 = localvardebug.const122;
        w_32 = v_32;
        term = s_exit_0_3.instance.invoke(context, w_32, r_32, s_32, localvardebug.constLocationInfo86);
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