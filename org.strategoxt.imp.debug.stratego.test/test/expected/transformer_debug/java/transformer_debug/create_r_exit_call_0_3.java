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

@SuppressWarnings("all") public class create_r_exit_call_0_3 extends Strategy 
{ 
  public static create_r_exit_call_0_3 instance = new create_r_exit_call_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_1030, IStrategoTerm y_1030, IStrategoTerm z_1030)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_r_exit_call_0_3");
    Fail396:
    { 
      IStrategoTerm b_1031 = null;
      IStrategoTerm c_1031 = null;
      IStrategoTerm e_1031 = null;
      IStrategoTerm f_1031 = null;
      IStrategoTerm g_1031 = null;
      e_1031 = term;
      b_1031 = transformer_debug.const513;
      f_1031 = e_1031;
      c_1031 = transformer_debug.const558;
      g_1031 = f_1031;
      term = s_enter_0_3.instance.invoke(context, g_1031, b_1031, c_1031, transformer_debug.constLocationInfo1056);
      if(term == null)
        break Fail396;
      IStrategoTerm term282 = term;
      Success193:
      { 
        Fail397:
        { 
          IStrategoTerm a_1031 = null;
          IStrategoTerm h_1031 = null;
          IStrategoTerm i_1031 = null;
          IStrategoTerm j_1031 = null;
          IStrategoTerm l_1031 = null;
          IStrategoTerm m_1031 = null;
          IStrategoTerm n_1031 = null;
          IStrategoTerm o_1031 = null;
          IStrategoTerm p_1031 = null;
          IStrategoTerm q_1031 = null;
          IStrategoTerm r_1031 = null;
          IStrategoTerm t_1031 = null;
          IStrategoTerm u_1031 = null;
          IStrategoTerm v_1031 = null;
          IStrategoTerm w_1031 = null;
          IStrategoTerm x_1031 = null;
          IStrategoTerm y_1031 = null;
          IStrategoTerm z_1031 = null;
          IStrategoTerm b_1032 = null;
          IStrategoTerm c_1032 = null;
          IStrategoTerm d_1032 = null;
          IStrategoTerm e_1032 = null;
          IStrategoTerm f_1032 = null;
          IStrategoTerm g_1032 = null;
          IStrategoTerm i_1032 = null;
          IStrategoTerm j_1032 = null;
          IStrategoTerm k_1032 = null;
          IStrategoTerm n_1032 = null;
          IStrategoTerm o_1032 = null;
          IStrategoTerm q_1032 = null;
          IStrategoTerm r_1032 = null;
          IStrategoTerm s_1032 = null;
          a_1031 = term;
          l_1031 = x_1030;
          h_1031 = transformer_debug.const513;
          m_1031 = l_1031;
          i_1031 = transformer_debug.const558;
          n_1031 = m_1031;
          j_1031 = transformer_debug.const238;
          o_1031 = n_1031;
          term = s_var_0_4.instance.invoke(context, o_1031, h_1031, i_1031, j_1031, transformer_debug.constLocationInfo1057);
          if(term == null)
            break Fail397;
          t_1031 = y_1030;
          p_1031 = transformer_debug.const513;
          u_1031 = t_1031;
          q_1031 = transformer_debug.const558;
          v_1031 = u_1031;
          r_1031 = transformer_debug.const287;
          w_1031 = v_1031;
          term = s_var_0_4.instance.invoke(context, w_1031, p_1031, q_1031, r_1031, transformer_debug.constLocationInfo1058);
          if(term == null)
            break Fail397;
          b_1032 = z_1030;
          x_1031 = transformer_debug.const513;
          c_1032 = b_1032;
          y_1031 = transformer_debug.const558;
          d_1032 = c_1032;
          z_1031 = transformer_debug.const235;
          e_1032 = d_1032;
          term = s_var_0_4.instance.invoke(context, e_1032, x_1031, y_1031, z_1031, transformer_debug.constLocationInfo1059);
          if(term == null)
            break Fail397;
          i_1032 = a_1031;
          f_1032 = transformer_debug.const513;
          j_1032 = i_1032;
          g_1032 = transformer_debug.const558;
          k_1032 = j_1032;
          term = s_step_0_3.instance.invoke(context, k_1032, f_1032, g_1032, transformer_debug.constLocationInfo1060);
          if(term == null)
            break Fail397;
          q_1032 = z_1030;
          n_1032 = transformer_debug.const513;
          r_1032 = q_1032;
          o_1032 = transformer_debug.const558;
          s_1032 = r_1032;
          term = s_step_0_3.instance.invoke(context, s_1032, n_1032, o_1032, transformer_debug.constLocationInfo1061);
          if(term == null)
            break Fail397;
          term = location_to_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail397;
          term = termFactory.makeAppl(transformer_debug._consCallT_3, new IStrategoTerm[]{transformer_debug.constSVar2, transformer_debug.constNil1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{x_1030})}), termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{y_1030})}), termFactory.makeListCons(term, (IStrategoList)transformer_debug.constNil1)))});
          { 
            IStrategoTerm t_1032 = null;
            IStrategoTerm u_1032 = null;
            IStrategoTerm w_1032 = null;
            IStrategoTerm x_1032 = null;
            IStrategoTerm y_1032 = null;
            w_1032 = term;
            t_1032 = transformer_debug.const513;
            x_1032 = w_1032;
            u_1032 = transformer_debug.const558;
            y_1032 = x_1032;
            term = s_exit_0_3.instance.invoke(context, y_1032, t_1032, u_1032, transformer_debug.constLocationInfo1056);
            if(term == null)
              break Fail396;
            if(true)
              break Success193;
          }
        }
        term = term282;
        IStrategoTerm z_1032 = null;
        IStrategoTerm a_1033 = null;
        IStrategoTerm c_1033 = null;
        IStrategoTerm d_1033 = null;
        IStrategoTerm e_1033 = null;
        c_1033 = term;
        z_1032 = transformer_debug.const513;
        d_1033 = c_1033;
        a_1033 = transformer_debug.const558;
        e_1033 = d_1033;
        term = s_exit_0_3.instance.invoke(context, e_1033, z_1032, a_1033, transformer_debug.constLocationInfo1056);
        if(term == null)
          break Fail396;
        if(true)
          break Fail396;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}