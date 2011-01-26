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

@SuppressWarnings("all") public class create_r_enter_whereclause_0_3 extends Strategy 
{ 
  public static create_r_enter_whereclause_0_3 instance = new create_r_enter_whereclause_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm h_1026, IStrategoTerm i_1026, IStrategoTerm j_1026)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_r_enter_whereclause_0_3");
    Fail392:
    { 
      IStrategoTerm l_1026 = null;
      IStrategoTerm m_1026 = null;
      IStrategoTerm o_1026 = null;
      IStrategoTerm p_1026 = null;
      IStrategoTerm q_1026 = null;
      o_1026 = term;
      l_1026 = transformer_debug.const513;
      p_1026 = o_1026;
      m_1026 = transformer_debug.const545;
      q_1026 = p_1026;
      term = s_enter_0_3.instance.invoke(context, q_1026, l_1026, m_1026, transformer_debug.constLocationInfo1044);
      if(term == null)
        break Fail392;
      IStrategoTerm term280 = term;
      Success191:
      { 
        Fail393:
        { 
          IStrategoTerm k_1026 = null;
          IStrategoTerm r_1026 = null;
          IStrategoTerm s_1026 = null;
          IStrategoTerm t_1026 = null;
          IStrategoTerm v_1026 = null;
          IStrategoTerm w_1026 = null;
          IStrategoTerm x_1026 = null;
          IStrategoTerm y_1026 = null;
          IStrategoTerm z_1026 = null;
          IStrategoTerm a_1027 = null;
          IStrategoTerm b_1027 = null;
          IStrategoTerm d_1027 = null;
          IStrategoTerm e_1027 = null;
          IStrategoTerm f_1027 = null;
          IStrategoTerm g_1027 = null;
          IStrategoTerm h_1027 = null;
          IStrategoTerm i_1027 = null;
          IStrategoTerm j_1027 = null;
          IStrategoTerm l_1027 = null;
          IStrategoTerm m_1027 = null;
          IStrategoTerm n_1027 = null;
          IStrategoTerm o_1027 = null;
          IStrategoTerm p_1027 = null;
          IStrategoTerm q_1027 = null;
          IStrategoTerm s_1027 = null;
          IStrategoTerm t_1027 = null;
          IStrategoTerm u_1027 = null;
          IStrategoTerm x_1027 = null;
          IStrategoTerm y_1027 = null;
          IStrategoTerm a_1028 = null;
          IStrategoTerm b_1028 = null;
          IStrategoTerm c_1028 = null;
          k_1026 = term;
          v_1026 = h_1026;
          r_1026 = transformer_debug.const513;
          w_1026 = v_1026;
          s_1026 = transformer_debug.const545;
          x_1026 = w_1026;
          t_1026 = transformer_debug.const238;
          y_1026 = x_1026;
          term = s_var_0_4.instance.invoke(context, y_1026, r_1026, s_1026, t_1026, transformer_debug.constLocationInfo1045);
          if(term == null)
            break Fail393;
          d_1027 = i_1026;
          z_1026 = transformer_debug.const513;
          e_1027 = d_1027;
          a_1027 = transformer_debug.const545;
          f_1027 = e_1027;
          b_1027 = transformer_debug.const287;
          g_1027 = f_1027;
          term = s_var_0_4.instance.invoke(context, g_1027, z_1026, a_1027, b_1027, transformer_debug.constLocationInfo1046);
          if(term == null)
            break Fail393;
          l_1027 = j_1026;
          h_1027 = transformer_debug.const513;
          m_1027 = l_1027;
          i_1027 = transformer_debug.const545;
          n_1027 = m_1027;
          j_1027 = transformer_debug.const235;
          o_1027 = n_1027;
          term = s_var_0_4.instance.invoke(context, o_1027, h_1027, i_1027, j_1027, transformer_debug.constLocationInfo1047);
          if(term == null)
            break Fail393;
          s_1027 = k_1026;
          p_1027 = transformer_debug.const513;
          t_1027 = s_1027;
          q_1027 = transformer_debug.const545;
          u_1027 = t_1027;
          term = s_step_0_3.instance.invoke(context, u_1027, p_1027, q_1027, transformer_debug.constLocationInfo1048);
          if(term == null)
            break Fail393;
          a_1028 = term;
          x_1027 = transformer_debug.const513;
          b_1028 = a_1028;
          y_1027 = transformer_debug.const545;
          c_1028 = b_1028;
          term = s_step_0_3.instance.invoke(context, c_1028, x_1027, y_1027, transformer_debug.constLocationInfo1049);
          if(term == null)
            break Fail393;
          term = create_r_enter_call_0_3.instance.invoke(context, term, h_1026, i_1026, j_1026);
          if(term == null)
            break Fail393;
          term = termFactory.makeAppl(transformer_debug._consWhereClause_1, new IStrategoTerm[]{term});
          { 
            IStrategoTerm d_1028 = null;
            IStrategoTerm e_1028 = null;
            IStrategoTerm g_1028 = null;
            IStrategoTerm h_1028 = null;
            IStrategoTerm i_1028 = null;
            g_1028 = term;
            d_1028 = transformer_debug.const513;
            h_1028 = g_1028;
            e_1028 = transformer_debug.const545;
            i_1028 = h_1028;
            term = s_exit_0_3.instance.invoke(context, i_1028, d_1028, e_1028, transformer_debug.constLocationInfo1044);
            if(term == null)
              break Fail392;
            if(true)
              break Success191;
          }
        }
        term = term280;
        IStrategoTerm j_1028 = null;
        IStrategoTerm k_1028 = null;
        IStrategoTerm m_1028 = null;
        IStrategoTerm n_1028 = null;
        IStrategoTerm o_1028 = null;
        m_1028 = term;
        j_1028 = transformer_debug.const513;
        n_1028 = m_1028;
        k_1028 = transformer_debug.const545;
        o_1028 = n_1028;
        term = s_exit_0_3.instance.invoke(context, o_1028, j_1028, k_1028, transformer_debug.constLocationInfo1044);
        if(term == null)
          break Fail392;
        if(true)
          break Fail392;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}