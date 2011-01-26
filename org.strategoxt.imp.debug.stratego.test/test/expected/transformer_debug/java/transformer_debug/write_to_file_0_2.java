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

@SuppressWarnings("all") public class write_to_file_0_2 extends Strategy 
{ 
  public static write_to_file_0_2 instance = new write_to_file_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm x_1055, IStrategoTerm y_1055)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("write_to_file_0_2");
    Fail412:
    { 
      IStrategoTerm z_1055 = null;
      IStrategoTerm b_1056 = null;
      IStrategoTerm c_1056 = null;
      IStrategoTerm e_1056 = null;
      IStrategoTerm f_1056 = null;
      IStrategoTerm g_1056 = null;
      e_1056 = term;
      b_1056 = transformer_debug.const571;
      f_1056 = e_1056;
      c_1056 = transformer_debug.const581;
      g_1056 = f_1056;
      term = s_enter_0_3.instance.invoke(context, g_1056, b_1056, c_1056, transformer_debug.constLocationInfo1111);
      if(term == null)
        break Fail412;
      IStrategoTerm term290 = term;
      Success201:
      { 
        Fail413:
        { 
          IStrategoTerm a_1056 = null;
          IStrategoTerm h_1056 = null;
          IStrategoTerm i_1056 = null;
          IStrategoTerm j_1056 = null;
          IStrategoTerm l_1056 = null;
          IStrategoTerm m_1056 = null;
          IStrategoTerm n_1056 = null;
          IStrategoTerm o_1056 = null;
          IStrategoTerm p_1056 = null;
          IStrategoTerm q_1056 = null;
          IStrategoTerm r_1056 = null;
          IStrategoTerm t_1056 = null;
          IStrategoTerm u_1056 = null;
          IStrategoTerm v_1056 = null;
          IStrategoTerm w_1056 = null;
          IStrategoTerm x_1056 = null;
          IStrategoTerm y_1056 = null;
          IStrategoTerm a_1057 = null;
          IStrategoTerm b_1057 = null;
          IStrategoTerm c_1057 = null;
          IStrategoTerm d_1057 = null;
          IStrategoTerm e_1057 = null;
          IStrategoTerm g_1057 = null;
          IStrategoTerm h_1057 = null;
          IStrategoTerm i_1057 = null;
          IStrategoTerm j_1057 = null;
          IStrategoTerm k_1057 = null;
          IStrategoTerm l_1057 = null;
          IStrategoTerm n_1057 = null;
          IStrategoTerm o_1057 = null;
          IStrategoTerm p_1057 = null;
          IStrategoTerm q_1057 = null;
          IStrategoTerm r_1057 = null;
          IStrategoTerm s_1057 = null;
          IStrategoTerm u_1057 = null;
          IStrategoTerm v_1057 = null;
          IStrategoTerm w_1057 = null;
          IStrategoTerm x_1057 = null;
          IStrategoTerm y_1057 = null;
          IStrategoTerm a_1058 = null;
          IStrategoTerm b_1058 = null;
          IStrategoTerm c_1058 = null;
          a_1056 = term;
          l_1056 = x_1055;
          h_1056 = transformer_debug.const571;
          m_1056 = l_1056;
          i_1056 = transformer_debug.const581;
          n_1056 = m_1056;
          j_1056 = transformer_debug.const238;
          o_1056 = n_1056;
          term = s_var_0_4.instance.invoke(context, o_1056, h_1056, i_1056, j_1056, transformer_debug.constLocationInfo1112);
          if(term == null)
            break Fail413;
          t_1056 = y_1055;
          p_1056 = transformer_debug.const571;
          u_1056 = t_1056;
          q_1056 = transformer_debug.const581;
          v_1056 = u_1056;
          r_1056 = transformer_debug.const582;
          w_1056 = v_1056;
          term = s_var_0_4.instance.invoke(context, w_1056, p_1056, q_1056, r_1056, transformer_debug.constLocationInfo1113);
          if(term == null)
            break Fail413;
          a_1057 = a_1056;
          x_1056 = transformer_debug.const571;
          b_1057 = a_1057;
          y_1056 = transformer_debug.const581;
          c_1057 = b_1057;
          term = s_step_0_3.instance.invoke(context, c_1057, x_1056, y_1056, transformer_debug.constLocationInfo1114);
          if(term == null)
            break Fail413;
          term = termFactory.makeTuple(x_1055, transformer_debug.const583);
          g_1057 = term;
          d_1057 = transformer_debug.const571;
          h_1057 = g_1057;
          e_1057 = transformer_debug.const581;
          i_1057 = h_1057;
          term = s_step_0_3.instance.invoke(context, i_1057, d_1057, e_1057, transformer_debug.constLocationInfo1115);
          if(term == null)
            break Fail413;
          term = fopen_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail413;
          z_1055 = term;
          n_1057 = term;
          j_1057 = transformer_debug.const571;
          o_1057 = n_1057;
          k_1057 = transformer_debug.const581;
          p_1057 = o_1057;
          l_1057 = transformer_debug.const584;
          q_1057 = p_1057;
          term = s_var_0_4.instance.invoke(context, q_1057, j_1057, k_1057, l_1057, transformer_debug.constLocationInfo1116);
          if(term == null)
            break Fail413;
          term = termFactory.makeTuple(y_1055, z_1055);
          u_1057 = term;
          r_1057 = transformer_debug.const571;
          v_1057 = u_1057;
          s_1057 = transformer_debug.const581;
          w_1057 = v_1057;
          term = s_step_0_3.instance.invoke(context, w_1057, r_1057, s_1057, transformer_debug.constLocationInfo1117);
          if(term == null)
            break Fail413;
          term = fputs_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail413;
          a_1058 = term;
          x_1057 = transformer_debug.const571;
          b_1058 = a_1058;
          y_1057 = transformer_debug.const581;
          c_1058 = b_1058;
          term = s_step_0_3.instance.invoke(context, c_1058, x_1057, y_1057, transformer_debug.constLocationInfo1118);
          if(term == null)
            break Fail413;
          term = fclose_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail413;
          { 
            IStrategoTerm d_1058 = null;
            IStrategoTerm e_1058 = null;
            IStrategoTerm g_1058 = null;
            IStrategoTerm h_1058 = null;
            IStrategoTerm i_1058 = null;
            g_1058 = term;
            d_1058 = transformer_debug.const571;
            h_1058 = g_1058;
            e_1058 = transformer_debug.const581;
            i_1058 = h_1058;
            term = s_exit_0_3.instance.invoke(context, i_1058, d_1058, e_1058, transformer_debug.constLocationInfo1111);
            if(term == null)
              break Fail412;
            if(true)
              break Success201;
          }
        }
        term = term290;
        IStrategoTerm j_1058 = null;
        IStrategoTerm k_1058 = null;
        IStrategoTerm m_1058 = null;
        IStrategoTerm n_1058 = null;
        IStrategoTerm o_1058 = null;
        m_1058 = term;
        j_1058 = transformer_debug.const571;
        n_1058 = m_1058;
        k_1058 = transformer_debug.const581;
        o_1058 = n_1058;
        term = s_exit_0_3.instance.invoke(context, o_1058, j_1058, k_1058, transformer_debug.constLocationInfo1111);
        if(term == null)
          break Fail412;
        if(true)
          break Fail412;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}