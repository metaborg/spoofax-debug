package transformer_debug;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.strc.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_config_$I_0_0 extends Strategy 
{ 
  public static get_config_$I_0_0 instance = new get_config_$I_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_config_I_0_0");
    Fail290:
    { 
      IStrategoTerm z_404 = null;
      IStrategoTerm a_405 = null;
      IStrategoTerm c_405 = null;
      IStrategoTerm d_405 = null;
      IStrategoTerm e_405 = null;
      c_405 = term;
      z_404 = transformer_debug.const67;
      d_405 = c_405;
      a_405 = transformer_debug.const161;
      e_405 = d_405;
      term = s_enter_0_3.instance.invoke(context, e_405, z_404, a_405, transformer_debug.constLocationInfo53);
      if(term == null)
        break Fail290;
      IStrategoTerm term141 = term;
      Success139:
      { 
        Fail291:
        { 
          IStrategoTerm term142 = term;
          Success140:
          { 
            Fail292:
            { 
              IStrategoTerm f_405 = null;
              IStrategoTerm g_405 = null;
              IStrategoTerm i_405 = null;
              IStrategoTerm j_405 = null;
              IStrategoTerm k_405 = null;
              i_405 = transformer_debug.const149;
              f_405 = transformer_debug.const67;
              j_405 = i_405;
              g_405 = transformer_debug.const161;
              k_405 = j_405;
              term = s_step_0_3.instance.invoke(context, k_405, f_405, g_405, transformer_debug.constLocationInfo54);
              if(term == null)
                break Fail292;
              term = get_config_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail292;
              if(true)
                break Success140;
            }
            term = term142;
            IStrategoTerm l_405 = null;
            IStrategoTerm m_405 = null;
            IStrategoTerm o_405 = null;
            IStrategoTerm p_405 = null;
            IStrategoTerm q_405 = null;
            o_405 = term;
            l_405 = transformer_debug.const67;
            p_405 = o_405;
            m_405 = transformer_debug.const161;
            q_405 = p_405;
            term = s_step_0_3.instance.invoke(context, q_405, l_405, m_405, transformer_debug.constLocationInfo55);
            if(term == null)
              break Fail291;
            term = transformer_debug.constNil1;
          }
          { 
            IStrategoTerm r_405 = null;
            IStrategoTerm s_405 = null;
            IStrategoTerm u_405 = null;
            IStrategoTerm v_405 = null;
            IStrategoTerm w_405 = null;
            u_405 = term;
            r_405 = transformer_debug.const67;
            v_405 = u_405;
            s_405 = transformer_debug.const161;
            w_405 = v_405;
            term = s_exit_0_3.instance.invoke(context, w_405, r_405, s_405, transformer_debug.constLocationInfo53);
            if(term == null)
              break Fail290;
            if(true)
              break Success139;
          }
        }
        term = term141;
        IStrategoTerm x_405 = null;
        IStrategoTerm y_405 = null;
        IStrategoTerm a_406 = null;
        IStrategoTerm b_406 = null;
        IStrategoTerm c_406 = null;
        a_406 = term;
        x_405 = transformer_debug.const67;
        b_406 = a_406;
        y_405 = transformer_debug.const161;
        c_406 = b_406;
        term = s_exit_0_3.instance.invoke(context, c_406, x_405, y_405, transformer_debug.constLocationInfo53);
        if(term == null)
          break Fail290;
        if(true)
          break Fail290;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}