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

@SuppressWarnings("all") public class apply_debug_trans_error_0_0 extends Strategy 
{ 
  public static apply_debug_trans_error_0_0 instance = new apply_debug_trans_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("apply_debug_trans_error_0_0");
    Fail441:
    { 
      IStrategoTerm w_1107 = null;
      IStrategoTerm a_1108 = null;
      IStrategoTerm b_1108 = null;
      IStrategoTerm c_1108 = null;
      IStrategoTerm d_1108 = null;
      IStrategoTerm e_1108 = null;
      IStrategoTerm g_1108 = null;
      IStrategoTerm h_1108 = null;
      IStrategoTerm i_1108 = null;
      IStrategoTerm j_1108 = null;
      IStrategoTerm k_1108 = null;
      IStrategoTerm l_1108 = null;
      IStrategoTerm m_1108 = null;
      IStrategoTerm o_1108 = null;
      IStrategoTerm p_1108 = null;
      IStrategoTerm q_1108 = null;
      IStrategoTerm r_1108 = null;
      IStrategoTerm t_1108 = null;
      IStrategoTerm u_1108 = null;
      IStrategoTerm w_1108 = null;
      IStrategoTerm x_1108 = null;
      IStrategoTerm y_1108 = null;
      IStrategoTerm f_1109 = null;
      IStrategoTerm g_1109 = null;
      IStrategoTerm i_1109 = null;
      IStrategoTerm j_1109 = null;
      IStrategoTerm k_1109 = null;
      IStrategoTerm r_1109 = null;
      IStrategoTerm s_1109 = null;
      IStrategoTerm u_1109 = null;
      IStrategoTerm v_1109 = null;
      IStrategoTerm w_1109 = null;
      IStrategoTerm x_1109 = null;
      IStrategoTerm y_1109 = null;
      IStrategoTerm z_1109 = null;
      IStrategoTerm b_1110 = null;
      IStrategoTerm c_1110 = null;
      IStrategoTerm d_1110 = null;
      IStrategoTerm e_1110 = null;
      IStrategoTerm f_1110 = null;
      IStrategoTerm g_1110 = null;
      IStrategoTerm i_1110 = null;
      IStrategoTerm j_1110 = null;
      IStrategoTerm k_1110 = null;
      IStrategoTerm l_1110 = null;
      IStrategoTerm m_1110 = null;
      IStrategoTerm n_1110 = null;
      IStrategoTerm p_1110 = null;
      IStrategoTerm q_1110 = null;
      IStrategoTerm r_1110 = null;
      IStrategoTerm s_1110 = null;
      w_1107 = term;
      c_1108 = term;
      g_1108 = term;
      d_1108 = transformer_debug.const618;
      h_1108 = g_1108;
      e_1108 = transformer_debug.const624;
      i_1108 = h_1108;
      term = r_enter_0_3.instance.invoke(context, i_1108, d_1108, e_1108, transformer_debug.constLocationInfo1182);
      if(term == null)
        break Fail441;
      j_1108 = c_1108;
      o_1108 = w_1107;
      k_1108 = transformer_debug.const618;
      p_1108 = o_1108;
      l_1108 = transformer_debug.const624;
      q_1108 = p_1108;
      m_1108 = transformer_debug.const625;
      r_1108 = q_1108;
      term = s_var_0_4.instance.invoke(context, r_1108, k_1108, l_1108, m_1108, transformer_debug.constLocationInfo1183);
      if(term == null)
        break Fail441;
      term = j_1108;
      w_1108 = term;
      t_1108 = transformer_debug.const618;
      x_1108 = w_1108;
      u_1108 = transformer_debug.const624;
      y_1108 = x_1108;
      term = s_step_0_3.instance.invoke(context, y_1108, t_1108, u_1108, transformer_debug.constLocationInfo1184);
      if(term == null)
        break Fail441;
      IStrategoTerm term305 = term;
      Success216:
      { 
        Fail442:
        { 
          IStrategoTerm z_1108 = null;
          IStrategoTerm a_1109 = null;
          IStrategoTerm c_1109 = null;
          IStrategoTerm d_1109 = null;
          IStrategoTerm e_1109 = null;
          c_1109 = term;
          z_1108 = transformer_debug.const618;
          d_1109 = c_1109;
          a_1109 = transformer_debug.const624;
          e_1109 = d_1109;
          term = s_step_0_3.instance.invoke(context, e_1109, z_1108, a_1109, transformer_debug.constLocationInfo1185);
          if(term == null)
            break Fail442;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
            break Fail442;
          { 
            if(true)
              break Fail441;
            if(true)
              break Success216;
          }
        }
        term = term305;
      }
      i_1109 = term;
      f_1109 = transformer_debug.const618;
      j_1109 = i_1109;
      g_1109 = transformer_debug.const624;
      k_1109 = j_1109;
      term = s_step_0_3.instance.invoke(context, k_1109, f_1109, g_1109, transformer_debug.constLocationInfo1186);
      if(term == null)
        break Fail441;
      term = echo_1_0.instance.invoke(context, term, lifted154.instance);
      if(term == null)
        break Fail441;
      u_1109 = term;
      r_1109 = transformer_debug.const618;
      v_1109 = u_1109;
      s_1109 = transformer_debug.const624;
      w_1109 = v_1109;
      term = s_step_0_3.instance.invoke(context, w_1109, r_1109, s_1109, transformer_debug.constLocationInfo1188);
      if(term == null)
        break Fail441;
      a_1108 = transformer_debug.const627;
      b_1110 = transformer_debug.const627;
      x_1109 = transformer_debug.const618;
      c_1110 = b_1110;
      y_1109 = transformer_debug.const624;
      d_1110 = c_1110;
      z_1109 = transformer_debug.const211;
      e_1110 = d_1110;
      term = s_var_0_4.instance.invoke(context, e_1110, x_1109, y_1109, z_1109, transformer_debug.constLocationInfo1189);
      if(term == null)
        break Fail441;
      i_1110 = term;
      f_1110 = transformer_debug.const618;
      j_1110 = i_1110;
      g_1110 = transformer_debug.const624;
      k_1110 = j_1110;
      term = s_step_0_3.instance.invoke(context, k_1110, f_1110, g_1110, transformer_debug.constLocationInfo1190);
      if(term == null)
        break Fail441;
      b_1108 = transformer_debug.const628;
      p_1110 = transformer_debug.const628;
      l_1110 = transformer_debug.const618;
      q_1110 = p_1110;
      m_1110 = transformer_debug.const624;
      r_1110 = q_1110;
      n_1110 = transformer_debug.const623;
      s_1110 = r_1110;
      term = s_var_0_4.instance.invoke(context, s_1110, l_1110, m_1110, n_1110, transformer_debug.constLocationInfo1191);
      if(term == null)
        break Fail441;
      IStrategoTerm t_1110 = null;
      IStrategoTerm u_1110 = null;
      IStrategoTerm w_1110 = null;
      IStrategoTerm x_1110 = null;
      IStrategoTerm y_1110 = null;
      term = termFactory.makeTuple(b_1108, a_1108);
      w_1110 = term;
      t_1110 = transformer_debug.const618;
      x_1110 = w_1110;
      u_1110 = transformer_debug.const624;
      y_1110 = x_1110;
      term = r_exit_0_3.instance.invoke(context, y_1110, t_1110, u_1110, transformer_debug.constLocationInfo1182);
      if(term == null)
        break Fail441;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}