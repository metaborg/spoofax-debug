package dynamic;

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
      IStrategoTerm v_30 = null;
      IStrategoTerm w_30 = null;
      IStrategoTerm y_30 = null;
      IStrategoTerm z_30 = null;
      IStrategoTerm a_31 = null;
      y_30 = term;
      v_30 = dynamic.const0;
      z_30 = y_30;
      w_30 = dynamic.const115;
      a_31 = z_30;
      term = s_enter_0_3.instance.invoke(context, a_31, v_30, w_30, dynamic.constLocationInfo75);
      if(term == null)
        break Fail19;
      IStrategoTerm term9 = term;
      Success8:
      { 
        Fail20:
        { 
          IStrategoTerm b_31 = null;
          IStrategoTerm c_31 = null;
          IStrategoTerm e_31 = null;
          IStrategoTerm f_31 = null;
          IStrategoTerm g_31 = null;
          e_31 = term;
          b_31 = dynamic.const0;
          f_31 = e_31;
          c_31 = dynamic.const115;
          g_31 = f_31;
          term = s_step_0_3.instance.invoke(context, g_31, b_31, c_31, dynamic.constLocationInfo76);
          if(term == null)
            break Fail20;
          term = debug_1_0.instance.invoke(context, term, lifted8.instance);
          if(term == null)
            break Fail20;
          IStrategoTerm term10 = term;
          Success9:
          { 
            Fail21:
            { 
              IStrategoTerm n_31 = null;
              IStrategoTerm o_31 = null;
              IStrategoTerm q_31 = null;
              IStrategoTerm r_31 = null;
              IStrategoTerm s_31 = null;
              q_31 = term;
              n_31 = dynamic.const0;
              r_31 = q_31;
              o_31 = dynamic.const115;
              s_31 = r_31;
              term = s_step_0_3.instance.invoke(context, s_31, n_31, o_31, dynamic.constLocationInfo78);
              if(term == null)
                break Fail21;
              term = is_empty_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21;
              { 
                IStrategoTerm t_31 = null;
                IStrategoTerm u_31 = null;
                IStrategoTerm w_31 = null;
                IStrategoTerm x_31 = null;
                IStrategoTerm y_31 = null;
                w_31 = term;
                t_31 = dynamic.const0;
                x_31 = w_31;
                u_31 = dynamic.const115;
                y_31 = x_31;
                term = s_step_0_3.instance.invoke(context, y_31, t_31, u_31, dynamic.constLocationInfo79);
                if(term == null)
                  break Fail20;
                term = build_c_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail20;
                if(true)
                  break Success9;
              }
            }
            term = term10;
            IStrategoTerm z_31 = null;
            IStrategoTerm a_32 = null;
            IStrategoTerm c_32 = null;
            IStrategoTerm d_32 = null;
            IStrategoTerm e_32 = null;
            c_32 = term;
            z_31 = dynamic.const0;
            d_32 = c_32;
            a_32 = dynamic.const115;
            e_32 = d_32;
            term = s_step_0_3.instance.invoke(context, e_32, z_31, a_32, dynamic.constLocationInfo80);
            if(term == null)
              break Fail20;
            term = last_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail20;
          }
          { 
            IStrategoTerm f_32 = null;
            IStrategoTerm g_32 = null;
            IStrategoTerm i_32 = null;
            IStrategoTerm j_32 = null;
            IStrategoTerm k_32 = null;
            i_32 = term;
            f_32 = dynamic.const0;
            j_32 = i_32;
            g_32 = dynamic.const115;
            k_32 = j_32;
            term = s_exit_0_3.instance.invoke(context, k_32, f_32, g_32, dynamic.constLocationInfo75);
            if(term == null)
              break Fail19;
            if(true)
              break Success8;
          }
        }
        term = term9;
        IStrategoTerm l_32 = null;
        IStrategoTerm m_32 = null;
        IStrategoTerm o_32 = null;
        IStrategoTerm p_32 = null;
        IStrategoTerm q_32 = null;
        o_32 = term;
        l_32 = dynamic.const0;
        p_32 = o_32;
        m_32 = dynamic.const115;
        q_32 = p_32;
        term = s_exit_0_3.instance.invoke(context, q_32, l_32, m_32, dynamic.constLocationInfo75);
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