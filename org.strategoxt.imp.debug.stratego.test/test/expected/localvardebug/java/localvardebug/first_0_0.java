package localvardebug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
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
    Fail19:
    { 
      IStrategoTerm r_29 = null;
      IStrategoTerm s_29 = null;
      IStrategoTerm u_29 = null;
      IStrategoTerm v_29 = null;
      IStrategoTerm w_29 = null;
      u_29 = term;
      r_29 = localvardebug.const0;
      v_29 = u_29;
      s_29 = localvardebug.const114;
      w_29 = v_29;
      term = s_enter_0_3.instance.invoke(context, w_29, r_29, s_29, localvardebug.constLocationInfo78);
      if(term == null)
        break Fail19;
      IStrategoTerm term8 = term;
      Success8:
      { 
        Fail20:
        { 
          IStrategoTerm x_29 = null;
          IStrategoTerm y_29 = null;
          IStrategoTerm a_30 = null;
          IStrategoTerm b_30 = null;
          IStrategoTerm c_30 = null;
          IStrategoTerm b_31 = null;
          IStrategoTerm c_31 = null;
          IStrategoTerm e_31 = null;
          IStrategoTerm f_31 = null;
          IStrategoTerm g_31 = null;
          a_30 = term;
          x_29 = localvardebug.const0;
          b_30 = a_30;
          y_29 = localvardebug.const114;
          c_30 = b_30;
          term = s_step_0_3.instance.invoke(context, c_30, x_29, y_29, localvardebug.constLocationInfo80);
          if(term == null)
            break Fail20;
          term = debug_1_0.instance.invoke(context, term, lifted12.instance);
          if(term == null)
            break Fail20;
          IStrategoTerm term9 = term;
          Success9:
          { 
            Fail21:
            { 
              IStrategoTerm j_30 = null;
              IStrategoTerm k_30 = null;
              IStrategoTerm m_30 = null;
              IStrategoTerm n_30 = null;
              IStrategoTerm o_30 = null;
              m_30 = term;
              j_30 = localvardebug.const0;
              n_30 = m_30;
              k_30 = localvardebug.const114;
              o_30 = n_30;
              term = s_step_0_3.instance.invoke(context, o_30, j_30, k_30, localvardebug.constLocationInfo82);
              if(term == null)
                break Fail21;
              term = is_empty_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21;
              { 
                IStrategoTerm p_30 = null;
                IStrategoTerm q_30 = null;
                IStrategoTerm s_30 = null;
                IStrategoTerm t_30 = null;
                IStrategoTerm u_30 = null;
                s_30 = term;
                p_30 = localvardebug.const0;
                t_30 = s_30;
                q_30 = localvardebug.const114;
                u_30 = t_30;
                term = s_step_0_3.instance.invoke(context, u_30, p_30, q_30, localvardebug.constLocationInfo83);
                if(term == null)
                  break Fail20;
                term = build_c_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail20;
                if(true)
                  break Success9;
              }
            }
            term = term9;
            IStrategoTerm v_30 = null;
            IStrategoTerm w_30 = null;
            IStrategoTerm y_30 = null;
            IStrategoTerm z_30 = null;
            IStrategoTerm a_31 = null;
            y_30 = term;
            v_30 = localvardebug.const0;
            z_30 = y_30;
            w_30 = localvardebug.const114;
            a_31 = z_30;
            term = s_step_0_3.instance.invoke(context, a_31, v_30, w_30, localvardebug.constLocationInfo84);
            if(term == null)
              break Fail20;
            term = last_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail20;
          }
          e_31 = term;
          b_31 = localvardebug.const0;
          f_31 = e_31;
          c_31 = localvardebug.const114;
          g_31 = f_31;
          term = s_step_0_3.instance.invoke(context, g_31, b_31, c_31, localvardebug.constLocationInfo85);
          if(term == null)
            break Fail20;
          term = debug_1_0.instance.invoke(context, term, lifted13.instance);
          if(term == null)
            break Fail20;
          { 
            IStrategoTerm n_31 = null;
            IStrategoTerm o_31 = null;
            IStrategoTerm q_31 = null;
            IStrategoTerm r_31 = null;
            IStrategoTerm s_31 = null;
            q_31 = term;
            n_31 = localvardebug.const0;
            r_31 = q_31;
            o_31 = localvardebug.const114;
            s_31 = r_31;
            term = s_exit_0_3.instance.invoke(context, s_31, n_31, o_31, localvardebug.constLocationInfo78);
            if(term == null)
              break Fail19;
            if(true)
              break Success8;
          }
        }
        term = term8;
        IStrategoTerm t_31 = null;
        IStrategoTerm u_31 = null;
        IStrategoTerm w_31 = null;
        IStrategoTerm x_31 = null;
        IStrategoTerm y_31 = null;
        w_31 = term;
        t_31 = localvardebug.const0;
        x_31 = w_31;
        u_31 = localvardebug.const114;
        y_31 = x_31;
        term = s_exit_0_3.instance.invoke(context, y_31, t_31, u_31, localvardebug.constLocationInfo78);
        if(term == null)
          break Fail19;
        if(true)
          break Fail19;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}