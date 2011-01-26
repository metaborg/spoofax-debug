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

@SuppressWarnings("all") public class add_s_debug_import_0_0 extends Strategy 
{ 
  public static add_s_debug_import_0_0 instance = new add_s_debug_import_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("add_s_debug_import_0_0");
    Fail394:
    { 
      IStrategoTerm r_1028 = null;
      IStrategoTerm s_1028 = null;
      IStrategoTerm t_1028 = null;
      IStrategoTerm w_1028 = null;
      IStrategoTerm x_1028 = null;
      IStrategoTerm y_1028 = null;
      IStrategoTerm a_1029 = null;
      IStrategoTerm b_1029 = null;
      IStrategoTerm c_1029 = null;
      IStrategoTerm d_1029 = null;
      IStrategoTerm e_1029 = null;
      IStrategoTerm f_1029 = null;
      IStrategoTerm g_1029 = null;
      IStrategoTerm i_1029 = null;
      IStrategoTerm j_1029 = null;
      IStrategoTerm k_1029 = null;
      IStrategoTerm l_1029 = null;
      IStrategoTerm m_1029 = null;
      IStrategoTerm n_1029 = null;
      IStrategoTerm o_1029 = null;
      IStrategoTerm q_1029 = null;
      IStrategoTerm r_1029 = null;
      IStrategoTerm s_1029 = null;
      IStrategoTerm t_1029 = null;
      IStrategoTerm u_1029 = null;
      if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consModule_2 != ((IStrategoAppl)term).getConstructor())
        break Fail394;
      r_1028 = term.getSubterm(0);
      s_1028 = term.getSubterm(1);
      w_1028 = term;
      a_1029 = term;
      x_1028 = transformer_debug.const513;
      b_1029 = a_1029;
      y_1028 = transformer_debug.const549;
      c_1029 = b_1029;
      term = r_enter_0_3.instance.invoke(context, c_1029, x_1028, y_1028, transformer_debug.constLocationInfo1050);
      if(term == null)
        break Fail394;
      d_1029 = w_1028;
      i_1029 = r_1028;
      e_1029 = transformer_debug.const513;
      j_1029 = i_1029;
      f_1029 = transformer_debug.const549;
      k_1029 = j_1029;
      g_1029 = transformer_debug.const552;
      l_1029 = k_1029;
      term = s_var_0_4.instance.invoke(context, l_1029, e_1029, f_1029, g_1029, transformer_debug.constLocationInfo1051);
      if(term == null)
        break Fail394;
      q_1029 = s_1028;
      m_1029 = transformer_debug.const513;
      r_1029 = q_1029;
      n_1029 = transformer_debug.const549;
      s_1029 = r_1029;
      o_1029 = transformer_debug.const554;
      t_1029 = s_1029;
      term = s_var_0_4.instance.invoke(context, t_1029, m_1029, n_1029, o_1029, transformer_debug.constLocationInfo1052);
      if(term == null)
        break Fail394;
      term = d_1029;
      u_1029 = d_1029;
      IStrategoTerm term281 = term;
      Success192:
      { 
        Fail395:
        { 
          IStrategoTerm v_1029 = null;
          IStrategoTerm w_1029 = null;
          IStrategoTerm y_1029 = null;
          IStrategoTerm z_1029 = null;
          IStrategoTerm a_1030 = null;
          IStrategoTerm b_1030 = null;
          IStrategoTerm c_1030 = null;
          IStrategoTerm e_1030 = null;
          IStrategoTerm f_1030 = null;
          IStrategoTerm g_1030 = null;
          IStrategoTerm h_1030 = null;
          IStrategoTerm i_1030 = null;
          IStrategoTerm j_1030 = null;
          IStrategoTerm l_1030 = null;
          IStrategoTerm m_1030 = null;
          IStrategoTerm n_1030 = null;
          IStrategoTerm o_1030 = null;
          y_1029 = term;
          v_1029 = transformer_debug.const513;
          z_1029 = y_1029;
          w_1029 = transformer_debug.const549;
          a_1030 = z_1029;
          term = s_step_0_3.instance.invoke(context, a_1030, v_1029, w_1029, transformer_debug.constLocationInfo1053);
          if(term == null)
            break Fail395;
          term = termFactory.makeTuple(transformer_debug.const281, transformer_debug.constImports0, s_1028);
          e_1030 = term;
          b_1030 = transformer_debug.const513;
          f_1030 = e_1030;
          c_1030 = transformer_debug.const549;
          g_1030 = f_1030;
          term = s_step_0_3.instance.invoke(context, g_1030, b_1030, c_1030, transformer_debug.constLocationInfo1054);
          if(term == null)
            break Fail395;
          term = insert_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail395;
          t_1028 = term;
          l_1030 = term;
          h_1030 = transformer_debug.const513;
          m_1030 = l_1030;
          i_1030 = transformer_debug.const549;
          n_1030 = m_1030;
          j_1030 = transformer_debug.const556;
          o_1030 = n_1030;
          term = s_var_0_4.instance.invoke(context, o_1030, h_1030, i_1030, j_1030, transformer_debug.constLocationInfo1055);
          if(term == null)
            break Fail395;
          if(true)
            break Success192;
        }
        term = term281;
        IStrategoTerm u_1028 = null;
        IStrategoTerm v_1028 = null;
        IStrategoTerm q_1030 = null;
        u_1028 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail394;
        v_1028 = term;
        q_1030 = u_1028;
        term = report_with_failure_0_2.instance.invoke(context, q_1030, transformer_debug.const557, v_1028);
        if(term == null)
          break Fail394;
      }
      term = u_1029;
      IStrategoTerm r_1030 = null;
      IStrategoTerm s_1030 = null;
      IStrategoTerm u_1030 = null;
      IStrategoTerm v_1030 = null;
      IStrategoTerm w_1030 = null;
      if(t_1028 == null)
        break Fail394;
      term = termFactory.makeAppl(transformer_debug._consModule_2, new IStrategoTerm[]{r_1028, t_1028});
      u_1030 = term;
      r_1030 = transformer_debug.const513;
      v_1030 = u_1030;
      s_1030 = transformer_debug.const549;
      w_1030 = v_1030;
      term = r_exit_0_3.instance.invoke(context, w_1030, r_1030, s_1030, transformer_debug.constLocationInfo1050);
      if(term == null)
        break Fail394;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}