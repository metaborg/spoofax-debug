package testimports;

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
    Fail5:
    { 
      IStrategoTerm h_4 = null;
      IStrategoTerm i_4 = null;
      IStrategoTerm k_4 = null;
      IStrategoTerm l_4 = null;
      IStrategoTerm m_4 = null;
      k_4 = term;
      h_4 = testimports.const0;
      l_4 = k_4;
      i_4 = testimports.const20;
      m_4 = l_4;
      term = s_enter_0_3.instance.invoke(context, m_4, h_4, i_4, testimports.constLocationInfo8);
      if(term == null)
        break Fail5;
      IStrategoTerm term3 = term;
      Success3:
      { 
        Fail6:
        { 
          IStrategoTerm n_4 = null;
          IStrategoTerm o_4 = null;
          IStrategoTerm q_4 = null;
          IStrategoTerm r_4 = null;
          IStrategoTerm s_4 = null;
          q_4 = term;
          n_4 = testimports.const0;
          r_4 = q_4;
          o_4 = testimports.const20;
          s_4 = r_4;
          term = s_step_0_3.instance.invoke(context, s_4, n_4, o_4, testimports.constLocationInfo9);
          if(term == null)
            break Fail6;
          term = testimports.constComment0;
          { 
            IStrategoTerm t_4 = null;
            IStrategoTerm u_4 = null;
            IStrategoTerm w_4 = null;
            IStrategoTerm x_4 = null;
            IStrategoTerm y_4 = null;
            w_4 = term;
            t_4 = testimports.const0;
            x_4 = w_4;
            u_4 = testimports.const20;
            y_4 = x_4;
            term = s_exit_0_3.instance.invoke(context, y_4, t_4, u_4, testimports.constLocationInfo8);
            if(term == null)
              break Fail5;
            if(true)
              break Success3;
          }
        }
        term = term3;
        IStrategoTerm z_4 = null;
        IStrategoTerm a_5 = null;
        IStrategoTerm c_5 = null;
        IStrategoTerm d_5 = null;
        IStrategoTerm e_5 = null;
        c_5 = term;
        z_4 = testimports.const0;
        d_5 = c_5;
        a_5 = testimports.const20;
        e_5 = d_5;
        term = s_exit_0_3.instance.invoke(context, e_5, z_4, a_5, testimports.constLocationInfo8);
        if(term == null)
          break Fail5;
        if(true)
          break Fail5;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}