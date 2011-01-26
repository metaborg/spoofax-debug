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

@SuppressWarnings("all") public class create_s_enter_call_0_3 extends Strategy 
{ 
  public static create_s_enter_call_0_3 instance = new create_s_enter_call_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm n_1035, IStrategoTerm o_1035, IStrategoTerm p_1035)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_s_enter_call_0_3");
    Fail400:
    { 
      IStrategoTerm r_1035 = null;
      IStrategoTerm s_1035 = null;
      IStrategoTerm u_1035 = null;
      IStrategoTerm v_1035 = null;
      IStrategoTerm w_1035 = null;
      u_1035 = term;
      r_1035 = transformer_debug.const513;
      v_1035 = u_1035;
      s_1035 = transformer_debug.const565;
      w_1035 = v_1035;
      term = s_enter_0_3.instance.invoke(context, w_1035, r_1035, s_1035, transformer_debug.constLocationInfo1068);
      if(term == null)
        break Fail400;
      IStrategoTerm term284 = term;
      Success195:
      { 
        Fail401:
        { 
          IStrategoTerm q_1035 = null;
          IStrategoTerm x_1035 = null;
          IStrategoTerm y_1035 = null;
          IStrategoTerm z_1035 = null;
          IStrategoTerm b_1036 = null;
          IStrategoTerm c_1036 = null;
          IStrategoTerm d_1036 = null;
          IStrategoTerm e_1036 = null;
          IStrategoTerm f_1036 = null;
          IStrategoTerm g_1036 = null;
          IStrategoTerm h_1036 = null;
          IStrategoTerm j_1036 = null;
          IStrategoTerm k_1036 = null;
          IStrategoTerm l_1036 = null;
          IStrategoTerm m_1036 = null;
          IStrategoTerm n_1036 = null;
          IStrategoTerm o_1036 = null;
          IStrategoTerm p_1036 = null;
          IStrategoTerm r_1036 = null;
          IStrategoTerm s_1036 = null;
          IStrategoTerm t_1036 = null;
          IStrategoTerm u_1036 = null;
          IStrategoTerm v_1036 = null;
          IStrategoTerm w_1036 = null;
          IStrategoTerm y_1036 = null;
          IStrategoTerm z_1036 = null;
          IStrategoTerm a_1037 = null;
          IStrategoTerm d_1037 = null;
          IStrategoTerm e_1037 = null;
          IStrategoTerm g_1037 = null;
          IStrategoTerm h_1037 = null;
          IStrategoTerm i_1037 = null;
          q_1035 = term;
          b_1036 = n_1035;
          x_1035 = transformer_debug.const513;
          c_1036 = b_1036;
          y_1035 = transformer_debug.const565;
          d_1036 = c_1036;
          z_1035 = transformer_debug.const238;
          e_1036 = d_1036;
          term = s_var_0_4.instance.invoke(context, e_1036, x_1035, y_1035, z_1035, transformer_debug.constLocationInfo1069);
          if(term == null)
            break Fail401;
          j_1036 = o_1035;
          f_1036 = transformer_debug.const513;
          k_1036 = j_1036;
          g_1036 = transformer_debug.const565;
          l_1036 = k_1036;
          h_1036 = transformer_debug.const293;
          m_1036 = l_1036;
          term = s_var_0_4.instance.invoke(context, m_1036, f_1036, g_1036, h_1036, transformer_debug.constLocationInfo1070);
          if(term == null)
            break Fail401;
          r_1036 = p_1035;
          n_1036 = transformer_debug.const513;
          s_1036 = r_1036;
          o_1036 = transformer_debug.const565;
          t_1036 = s_1036;
          p_1036 = transformer_debug.const235;
          u_1036 = t_1036;
          term = s_var_0_4.instance.invoke(context, u_1036, n_1036, o_1036, p_1036, transformer_debug.constLocationInfo1071);
          if(term == null)
            break Fail401;
          y_1036 = q_1035;
          v_1036 = transformer_debug.const513;
          z_1036 = y_1036;
          w_1036 = transformer_debug.const565;
          a_1037 = z_1036;
          term = s_step_0_3.instance.invoke(context, a_1037, v_1036, w_1036, transformer_debug.constLocationInfo1072);
          if(term == null)
            break Fail401;
          g_1037 = p_1035;
          d_1037 = transformer_debug.const513;
          h_1037 = g_1037;
          e_1037 = transformer_debug.const565;
          i_1037 = h_1037;
          term = s_step_0_3.instance.invoke(context, i_1037, d_1037, e_1037, transformer_debug.constLocationInfo1073);
          if(term == null)
            break Fail401;
          term = location_to_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail401;
          term = termFactory.makeAppl(transformer_debug._consCallT_3, new IStrategoTerm[]{transformer_debug.constSVar4, transformer_debug.constNil1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{n_1035})}), termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{o_1035})}), termFactory.makeListCons(term, (IStrategoList)transformer_debug.constNil1)))});
          { 
            IStrategoTerm j_1037 = null;
            IStrategoTerm k_1037 = null;
            IStrategoTerm m_1037 = null;
            IStrategoTerm n_1037 = null;
            IStrategoTerm o_1037 = null;
            m_1037 = term;
            j_1037 = transformer_debug.const513;
            n_1037 = m_1037;
            k_1037 = transformer_debug.const565;
            o_1037 = n_1037;
            term = s_exit_0_3.instance.invoke(context, o_1037, j_1037, k_1037, transformer_debug.constLocationInfo1068);
            if(term == null)
              break Fail400;
            if(true)
              break Success195;
          }
        }
        term = term284;
        IStrategoTerm p_1037 = null;
        IStrategoTerm q_1037 = null;
        IStrategoTerm s_1037 = null;
        IStrategoTerm t_1037 = null;
        IStrategoTerm u_1037 = null;
        s_1037 = term;
        p_1037 = transformer_debug.const513;
        t_1037 = s_1037;
        q_1037 = transformer_debug.const565;
        u_1037 = t_1037;
        term = s_exit_0_3.instance.invoke(context, u_1037, p_1037, q_1037, transformer_debug.constLocationInfo1068);
        if(term == null)
          break Fail400;
        if(true)
          break Fail400;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}