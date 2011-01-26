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

@SuppressWarnings("all") public class create_s_exit_call_0_3 extends Strategy 
{ 
  public static create_s_exit_call_0_3 instance = new create_s_exit_call_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm v_1037, IStrategoTerm w_1037, IStrategoTerm x_1037)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_s_exit_call_0_3");
    Fail402:
    { 
      IStrategoTerm z_1037 = null;
      IStrategoTerm a_1038 = null;
      IStrategoTerm c_1038 = null;
      IStrategoTerm d_1038 = null;
      IStrategoTerm e_1038 = null;
      c_1038 = term;
      z_1037 = transformer_debug.const513;
      d_1038 = c_1038;
      a_1038 = transformer_debug.const567;
      e_1038 = d_1038;
      term = s_enter_0_3.instance.invoke(context, e_1038, z_1037, a_1038, transformer_debug.constLocationInfo1074);
      if(term == null)
        break Fail402;
      IStrategoTerm term285 = term;
      Success196:
      { 
        Fail403:
        { 
          IStrategoTerm y_1037 = null;
          IStrategoTerm f_1038 = null;
          IStrategoTerm g_1038 = null;
          IStrategoTerm h_1038 = null;
          IStrategoTerm j_1038 = null;
          IStrategoTerm k_1038 = null;
          IStrategoTerm l_1038 = null;
          IStrategoTerm m_1038 = null;
          IStrategoTerm n_1038 = null;
          IStrategoTerm o_1038 = null;
          IStrategoTerm p_1038 = null;
          IStrategoTerm r_1038 = null;
          IStrategoTerm s_1038 = null;
          IStrategoTerm t_1038 = null;
          IStrategoTerm u_1038 = null;
          IStrategoTerm v_1038 = null;
          IStrategoTerm w_1038 = null;
          IStrategoTerm x_1038 = null;
          IStrategoTerm z_1038 = null;
          IStrategoTerm a_1039 = null;
          IStrategoTerm b_1039 = null;
          IStrategoTerm c_1039 = null;
          IStrategoTerm d_1039 = null;
          IStrategoTerm e_1039 = null;
          IStrategoTerm g_1039 = null;
          IStrategoTerm h_1039 = null;
          IStrategoTerm i_1039 = null;
          IStrategoTerm l_1039 = null;
          IStrategoTerm m_1039 = null;
          IStrategoTerm o_1039 = null;
          IStrategoTerm p_1039 = null;
          IStrategoTerm q_1039 = null;
          y_1037 = term;
          j_1038 = v_1037;
          f_1038 = transformer_debug.const513;
          k_1038 = j_1038;
          g_1038 = transformer_debug.const567;
          l_1038 = k_1038;
          h_1038 = transformer_debug.const238;
          m_1038 = l_1038;
          term = s_var_0_4.instance.invoke(context, m_1038, f_1038, g_1038, h_1038, transformer_debug.constLocationInfo1075);
          if(term == null)
            break Fail403;
          r_1038 = w_1037;
          n_1038 = transformer_debug.const513;
          s_1038 = r_1038;
          o_1038 = transformer_debug.const567;
          t_1038 = s_1038;
          p_1038 = transformer_debug.const293;
          u_1038 = t_1038;
          term = s_var_0_4.instance.invoke(context, u_1038, n_1038, o_1038, p_1038, transformer_debug.constLocationInfo1076);
          if(term == null)
            break Fail403;
          z_1038 = x_1037;
          v_1038 = transformer_debug.const513;
          a_1039 = z_1038;
          w_1038 = transformer_debug.const567;
          b_1039 = a_1039;
          x_1038 = transformer_debug.const235;
          c_1039 = b_1039;
          term = s_var_0_4.instance.invoke(context, c_1039, v_1038, w_1038, x_1038, transformer_debug.constLocationInfo1077);
          if(term == null)
            break Fail403;
          g_1039 = y_1037;
          d_1039 = transformer_debug.const513;
          h_1039 = g_1039;
          e_1039 = transformer_debug.const567;
          i_1039 = h_1039;
          term = s_step_0_3.instance.invoke(context, i_1039, d_1039, e_1039, transformer_debug.constLocationInfo1078);
          if(term == null)
            break Fail403;
          o_1039 = x_1037;
          l_1039 = transformer_debug.const513;
          p_1039 = o_1039;
          m_1039 = transformer_debug.const567;
          q_1039 = p_1039;
          term = s_step_0_3.instance.invoke(context, q_1039, l_1039, m_1039, transformer_debug.constLocationInfo1079);
          if(term == null)
            break Fail403;
          term = location_to_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail403;
          term = termFactory.makeAppl(transformer_debug._consCallT_3, new IStrategoTerm[]{transformer_debug.constSVar5, transformer_debug.constNil1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{v_1037})}), termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{w_1037})}), termFactory.makeListCons(term, (IStrategoList)transformer_debug.constNil1)))});
          { 
            IStrategoTerm r_1039 = null;
            IStrategoTerm s_1039 = null;
            IStrategoTerm u_1039 = null;
            IStrategoTerm v_1039 = null;
            IStrategoTerm w_1039 = null;
            u_1039 = term;
            r_1039 = transformer_debug.const513;
            v_1039 = u_1039;
            s_1039 = transformer_debug.const567;
            w_1039 = v_1039;
            term = s_exit_0_3.instance.invoke(context, w_1039, r_1039, s_1039, transformer_debug.constLocationInfo1074);
            if(term == null)
              break Fail402;
            if(true)
              break Success196;
          }
        }
        term = term285;
        IStrategoTerm x_1039 = null;
        IStrategoTerm y_1039 = null;
        IStrategoTerm a_1040 = null;
        IStrategoTerm b_1040 = null;
        IStrategoTerm c_1040 = null;
        a_1040 = term;
        x_1039 = transformer_debug.const513;
        b_1040 = a_1040;
        y_1039 = transformer_debug.const567;
        c_1040 = b_1040;
        term = s_exit_0_3.instance.invoke(context, c_1040, x_1039, y_1039, transformer_debug.constLocationInfo1074);
        if(term == null)
          break Fail402;
        if(true)
          break Fail402;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}