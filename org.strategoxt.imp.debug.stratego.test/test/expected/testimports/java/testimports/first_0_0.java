package testimports;

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
    Fail2:
    { 
      IStrategoTerm l_2 = null;
      IStrategoTerm m_2 = null;
      IStrategoTerm o_2 = null;
      IStrategoTerm p_2 = null;
      IStrategoTerm q_2 = null;
      o_2 = term;
      l_2 = testimports.const0;
      p_2 = o_2;
      m_2 = testimports.const6;
      q_2 = p_2;
      term = s_enter_0_3.instance.invoke(context, q_2, l_2, m_2, testimports.constLocationInfo2);
      if(term == null)
        break Fail2;
      IStrategoTerm term1 = term;
      Success1:
      { 
        Fail3:
        { 
          IStrategoTerm r_2 = null;
          IStrategoTerm s_2 = null;
          IStrategoTerm u_2 = null;
          IStrategoTerm v_2 = null;
          IStrategoTerm w_2 = null;
          u_2 = term;
          r_2 = testimports.const0;
          v_2 = u_2;
          s_2 = testimports.const6;
          w_2 = v_2;
          term = s_step_0_3.instance.invoke(context, w_2, r_2, s_2, testimports.constLocationInfo3);
          if(term == null)
            break Fail3;
          term = debug_1_0.instance.invoke(context, term, lifted0.instance);
          if(term == null)
            break Fail3;
          IStrategoTerm term2 = term;
          Success2:
          { 
            Fail4:
            { 
              IStrategoTerm d_3 = null;
              IStrategoTerm e_3 = null;
              IStrategoTerm g_3 = null;
              IStrategoTerm h_3 = null;
              IStrategoTerm i_3 = null;
              g_3 = term;
              d_3 = testimports.const0;
              h_3 = g_3;
              e_3 = testimports.const6;
              i_3 = h_3;
              term = s_step_0_3.instance.invoke(context, i_3, d_3, e_3, testimports.constLocationInfo5);
              if(term == null)
                break Fail4;
              term = is_empty_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail4;
              { 
                IStrategoTerm j_3 = null;
                IStrategoTerm k_3 = null;
                IStrategoTerm m_3 = null;
                IStrategoTerm n_3 = null;
                IStrategoTerm o_3 = null;
                m_3 = term;
                j_3 = testimports.const0;
                n_3 = m_3;
                k_3 = testimports.const6;
                o_3 = n_3;
                term = s_step_0_3.instance.invoke(context, o_3, j_3, k_3, testimports.constLocationInfo6);
                if(term == null)
                  break Fail3;
                term = build_c_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail3;
                if(true)
                  break Success2;
              }
            }
            term = term2;
            IStrategoTerm p_3 = null;
            IStrategoTerm q_3 = null;
            IStrategoTerm s_3 = null;
            IStrategoTerm t_3 = null;
            IStrategoTerm u_3 = null;
            s_3 = term;
            p_3 = testimports.const0;
            t_3 = s_3;
            q_3 = testimports.const6;
            u_3 = t_3;
            term = s_step_0_3.instance.invoke(context, u_3, p_3, q_3, testimports.constLocationInfo7);
            if(term == null)
              break Fail3;
            term = last_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail3;
          }
          { 
            IStrategoTerm v_3 = null;
            IStrategoTerm w_3 = null;
            IStrategoTerm y_3 = null;
            IStrategoTerm z_3 = null;
            IStrategoTerm a_4 = null;
            y_3 = term;
            v_3 = testimports.const0;
            z_3 = y_3;
            w_3 = testimports.const6;
            a_4 = z_3;
            term = s_exit_0_3.instance.invoke(context, a_4, v_3, w_3, testimports.constLocationInfo2);
            if(term == null)
              break Fail2;
            if(true)
              break Success1;
          }
        }
        term = term1;
        IStrategoTerm b_4 = null;
        IStrategoTerm c_4 = null;
        IStrategoTerm e_4 = null;
        IStrategoTerm f_4 = null;
        IStrategoTerm g_4 = null;
        e_4 = term;
        b_4 = testimports.const0;
        f_4 = e_4;
        c_4 = testimports.const6;
        g_4 = f_4;
        term = s_exit_0_3.instance.invoke(context, g_4, b_4, c_4, testimports.constLocationInfo2);
        if(term == null)
          break Fail2;
        if(true)
          break Fail2;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}