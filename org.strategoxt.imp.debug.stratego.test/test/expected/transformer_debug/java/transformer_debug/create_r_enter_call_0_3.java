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

@SuppressWarnings("all") public class create_r_enter_call_0_3 extends Strategy 
{ 
  public static create_r_enter_call_0_3 instance = new create_r_enter_call_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm f_1033, IStrategoTerm g_1033, IStrategoTerm h_1033)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_r_enter_call_0_3");
    Fail398:
    { 
      IStrategoTerm j_1033 = null;
      IStrategoTerm k_1033 = null;
      IStrategoTerm m_1033 = null;
      IStrategoTerm n_1033 = null;
      IStrategoTerm o_1033 = null;
      m_1033 = term;
      j_1033 = transformer_debug.const513;
      n_1033 = m_1033;
      k_1033 = transformer_debug.const562;
      o_1033 = n_1033;
      term = s_enter_0_3.instance.invoke(context, o_1033, j_1033, k_1033, transformer_debug.constLocationInfo1062);
      if(term == null)
        break Fail398;
      IStrategoTerm term283 = term;
      Success194:
      { 
        Fail399:
        { 
          IStrategoTerm i_1033 = null;
          IStrategoTerm p_1033 = null;
          IStrategoTerm q_1033 = null;
          IStrategoTerm r_1033 = null;
          IStrategoTerm t_1033 = null;
          IStrategoTerm u_1033 = null;
          IStrategoTerm v_1033 = null;
          IStrategoTerm w_1033 = null;
          IStrategoTerm x_1033 = null;
          IStrategoTerm y_1033 = null;
          IStrategoTerm z_1033 = null;
          IStrategoTerm b_1034 = null;
          IStrategoTerm c_1034 = null;
          IStrategoTerm d_1034 = null;
          IStrategoTerm e_1034 = null;
          IStrategoTerm f_1034 = null;
          IStrategoTerm g_1034 = null;
          IStrategoTerm h_1034 = null;
          IStrategoTerm j_1034 = null;
          IStrategoTerm k_1034 = null;
          IStrategoTerm l_1034 = null;
          IStrategoTerm m_1034 = null;
          IStrategoTerm n_1034 = null;
          IStrategoTerm o_1034 = null;
          IStrategoTerm q_1034 = null;
          IStrategoTerm r_1034 = null;
          IStrategoTerm s_1034 = null;
          IStrategoTerm v_1034 = null;
          IStrategoTerm w_1034 = null;
          IStrategoTerm y_1034 = null;
          IStrategoTerm z_1034 = null;
          IStrategoTerm a_1035 = null;
          i_1033 = term;
          t_1033 = f_1033;
          p_1033 = transformer_debug.const513;
          u_1033 = t_1033;
          q_1033 = transformer_debug.const562;
          v_1033 = u_1033;
          r_1033 = transformer_debug.const238;
          w_1033 = v_1033;
          term = s_var_0_4.instance.invoke(context, w_1033, p_1033, q_1033, r_1033, transformer_debug.constLocationInfo1063);
          if(term == null)
            break Fail399;
          b_1034 = g_1033;
          x_1033 = transformer_debug.const513;
          c_1034 = b_1034;
          y_1033 = transformer_debug.const562;
          d_1034 = c_1034;
          z_1033 = transformer_debug.const287;
          e_1034 = d_1034;
          term = s_var_0_4.instance.invoke(context, e_1034, x_1033, y_1033, z_1033, transformer_debug.constLocationInfo1064);
          if(term == null)
            break Fail399;
          j_1034 = h_1033;
          f_1034 = transformer_debug.const513;
          k_1034 = j_1034;
          g_1034 = transformer_debug.const562;
          l_1034 = k_1034;
          h_1034 = transformer_debug.const235;
          m_1034 = l_1034;
          term = s_var_0_4.instance.invoke(context, m_1034, f_1034, g_1034, h_1034, transformer_debug.constLocationInfo1065);
          if(term == null)
            break Fail399;
          q_1034 = i_1033;
          n_1034 = transformer_debug.const513;
          r_1034 = q_1034;
          o_1034 = transformer_debug.const562;
          s_1034 = r_1034;
          term = s_step_0_3.instance.invoke(context, s_1034, n_1034, o_1034, transformer_debug.constLocationInfo1066);
          if(term == null)
            break Fail399;
          y_1034 = h_1033;
          v_1034 = transformer_debug.const513;
          z_1034 = y_1034;
          w_1034 = transformer_debug.const562;
          a_1035 = z_1034;
          term = s_step_0_3.instance.invoke(context, a_1035, v_1034, w_1034, transformer_debug.constLocationInfo1067);
          if(term == null)
            break Fail399;
          term = location_to_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail399;
          term = termFactory.makeAppl(transformer_debug._consCallT_3, new IStrategoTerm[]{transformer_debug.constSVar3, transformer_debug.constNil1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{f_1033})}), termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{g_1033})}), termFactory.makeListCons(term, (IStrategoList)transformer_debug.constNil1)))});
          { 
            IStrategoTerm b_1035 = null;
            IStrategoTerm c_1035 = null;
            IStrategoTerm e_1035 = null;
            IStrategoTerm f_1035 = null;
            IStrategoTerm g_1035 = null;
            e_1035 = term;
            b_1035 = transformer_debug.const513;
            f_1035 = e_1035;
            c_1035 = transformer_debug.const562;
            g_1035 = f_1035;
            term = s_exit_0_3.instance.invoke(context, g_1035, b_1035, c_1035, transformer_debug.constLocationInfo1062);
            if(term == null)
              break Fail398;
            if(true)
              break Success194;
          }
        }
        term = term283;
        IStrategoTerm h_1035 = null;
        IStrategoTerm i_1035 = null;
        IStrategoTerm k_1035 = null;
        IStrategoTerm l_1035 = null;
        IStrategoTerm m_1035 = null;
        k_1035 = term;
        h_1035 = transformer_debug.const513;
        l_1035 = k_1035;
        i_1035 = transformer_debug.const562;
        m_1035 = l_1035;
        term = s_exit_0_3.instance.invoke(context, m_1035, h_1035, i_1035, transformer_debug.constLocationInfo1062);
        if(term == null)
          break Fail398;
        if(true)
          break Fail398;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}