package localvar;

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
    Fail20:
    { 
      IStrategoTerm z_26 = null;
      IStrategoTerm a_27 = null;
      IStrategoTerm c_27 = null;
      IStrategoTerm d_27 = null;
      IStrategoTerm e_27 = null;
      c_27 = term;
      z_26 = localvar.const0;
      d_27 = c_27;
      a_27 = localvar.const100;
      e_27 = d_27;
      term = s_enter_0_3.instance.invoke(context, e_27, z_26, a_27, localvar.constLocationInfo66);
      if(term == null)
        break Fail20;
      IStrategoTerm term9 = term;
      Success9:
      { 
        Fail21:
        { 
          IStrategoTerm f_27 = null;
          IStrategoTerm g_27 = null;
          IStrategoTerm i_27 = null;
          IStrategoTerm j_27 = null;
          IStrategoTerm k_27 = null;
          i_27 = term;
          f_27 = localvar.const0;
          j_27 = i_27;
          g_27 = localvar.const100;
          k_27 = j_27;
          term = s_step_0_3.instance.invoke(context, k_27, f_27, g_27, localvar.constLocationInfo67);
          if(term == null)
            break Fail21;
          term = debug_1_0.instance.invoke(context, term, lifted6.instance);
          if(term == null)
            break Fail21;
          IStrategoTerm term10 = term;
          Success10:
          { 
            Fail22:
            { 
              IStrategoTerm r_27 = null;
              IStrategoTerm s_27 = null;
              IStrategoTerm u_27 = null;
              IStrategoTerm v_27 = null;
              IStrategoTerm w_27 = null;
              u_27 = term;
              r_27 = localvar.const0;
              v_27 = u_27;
              s_27 = localvar.const100;
              w_27 = v_27;
              term = s_step_0_3.instance.invoke(context, w_27, r_27, s_27, localvar.constLocationInfo69);
              if(term == null)
                break Fail22;
              term = is_empty_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail22;
              { 
                IStrategoTerm x_27 = null;
                IStrategoTerm y_27 = null;
                IStrategoTerm a_28 = null;
                IStrategoTerm b_28 = null;
                IStrategoTerm c_28 = null;
                a_28 = term;
                x_27 = localvar.const0;
                b_28 = a_28;
                y_27 = localvar.const100;
                c_28 = b_28;
                term = s_step_0_3.instance.invoke(context, c_28, x_27, y_27, localvar.constLocationInfo70);
                if(term == null)
                  break Fail21;
                term = build_c_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail21;
                if(true)
                  break Success10;
              }
            }
            term = term10;
            IStrategoTerm d_28 = null;
            IStrategoTerm e_28 = null;
            IStrategoTerm g_28 = null;
            IStrategoTerm h_28 = null;
            IStrategoTerm i_28 = null;
            g_28 = term;
            d_28 = localvar.const0;
            h_28 = g_28;
            e_28 = localvar.const100;
            i_28 = h_28;
            term = s_step_0_3.instance.invoke(context, i_28, d_28, e_28, localvar.constLocationInfo71);
            if(term == null)
              break Fail21;
            term = last_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21;
          }
          { 
            IStrategoTerm j_28 = null;
            IStrategoTerm k_28 = null;
            IStrategoTerm m_28 = null;
            IStrategoTerm n_28 = null;
            IStrategoTerm o_28 = null;
            m_28 = term;
            j_28 = localvar.const0;
            n_28 = m_28;
            k_28 = localvar.const100;
            o_28 = n_28;
            term = s_exit_0_3.instance.invoke(context, o_28, j_28, k_28, localvar.constLocationInfo66);
            if(term == null)
              break Fail20;
            if(true)
              break Success9;
          }
        }
        term = term9;
        IStrategoTerm p_28 = null;
        IStrategoTerm q_28 = null;
        IStrategoTerm s_28 = null;
        IStrategoTerm t_28 = null;
        IStrategoTerm u_28 = null;
        s_28 = term;
        p_28 = localvar.const0;
        t_28 = s_28;
        q_28 = localvar.const100;
        u_28 = t_28;
        term = s_exit_0_3.instance.invoke(context, u_28, p_28, q_28, localvar.constLocationInfo66);
        if(term == null)
          break Fail20;
        if(true)
          break Fail20;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}