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

@SuppressWarnings("all") public class add_var_statements_0_1 extends Strategy 
{ 
  public static add_var_statements_0_1 instance = new add_var_statements_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_736)
  { 
    TermReference b_736 = new TermReference(ref_b_736);
    context.push("add_var_statements_0_1");
    Fail327:
    { 
      IStrategoTerm d_736 = null;
      IStrategoTerm e_736 = null;
      IStrategoTerm g_736 = null;
      IStrategoTerm h_736 = null;
      IStrategoTerm i_736 = null;
      g_736 = term;
      d_736 = transformer_debug.const284;
      h_736 = g_736;
      e_736 = transformer_debug.const285;
      i_736 = h_736;
      term = s_enter_0_3.instance.invoke(context, i_736, d_736, e_736, transformer_debug.constLocationInfo293);
      if(term == null)
        break Fail327;
      IStrategoTerm term162 = term;
      Success156:
      { 
        Fail328:
        { 
          IStrategoTerm c_736 = null;
          IStrategoTerm j_736 = null;
          IStrategoTerm k_736 = null;
          IStrategoTerm l_736 = null;
          IStrategoTerm n_736 = null;
          IStrategoTerm o_736 = null;
          IStrategoTerm p_736 = null;
          IStrategoTerm q_736 = null;
          IStrategoTerm r_736 = null;
          IStrategoTerm s_736 = null;
          IStrategoTerm v_736 = null;
          IStrategoTerm w_736 = null;
          IStrategoTerm x_736 = null;
          IStrategoTerm k_737 = null;
          IStrategoTerm l_737 = null;
          IStrategoTerm n_737 = null;
          IStrategoTerm o_737 = null;
          IStrategoTerm p_737 = null;
          c_736 = term;
          if(b_736.value == null)
            break Fail328;
          n_736 = b_736.value;
          j_736 = transformer_debug.const284;
          o_736 = n_736;
          k_736 = transformer_debug.const285;
          p_736 = o_736;
          l_736 = transformer_debug.const238;
          q_736 = p_736;
          term = s_var_0_4.instance.invoke(context, q_736, j_736, k_736, l_736, transformer_debug.constLocationInfo296);
          if(term == null)
            break Fail328;
          v_736 = c_736;
          r_736 = transformer_debug.const284;
          w_736 = v_736;
          s_736 = transformer_debug.const285;
          x_736 = w_736;
          term = s_step_0_3.instance.invoke(context, x_736, r_736, s_736, transformer_debug.constLocationInfo297);
          if(term == null)
            break Fail328;
          lifted123 lifted1230 = new lifted123();
          lifted1230.b_736 = b_736;
          term = bottomup_1_0.instance.invoke(context, term, lifted1230);
          if(term == null)
            break Fail328;
          n_737 = term;
          k_737 = transformer_debug.const284;
          o_737 = n_737;
          l_737 = transformer_debug.const285;
          p_737 = o_737;
          term = s_step_0_3.instance.invoke(context, p_737, k_737, l_737, transformer_debug.constLocationInfo300);
          if(term == null)
            break Fail328;
          lifted125 lifted1250 = new lifted125();
          lifted1250.b_736 = b_736;
          term = bottomup_1_0.instance.invoke(context, term, lifted1250);
          if(term == null)
            break Fail328;
          { 
            IStrategoTerm c_738 = null;
            IStrategoTerm d_738 = null;
            IStrategoTerm f_738 = null;
            IStrategoTerm g_738 = null;
            IStrategoTerm i_738 = null;
            f_738 = term;
            c_738 = transformer_debug.const284;
            g_738 = f_738;
            d_738 = transformer_debug.const285;
            i_738 = g_738;
            term = s_exit_0_3.instance.invoke(context, i_738, c_738, d_738, transformer_debug.constLocationInfo293);
            if(term == null)
              break Fail327;
            if(true)
              break Success156;
          }
        }
        term = term162;
        IStrategoTerm l_738 = null;
        IStrategoTerm m_738 = null;
        IStrategoTerm o_738 = null;
        IStrategoTerm p_738 = null;
        IStrategoTerm q_738 = null;
        o_738 = term;
        l_738 = transformer_debug.const284;
        p_738 = o_738;
        m_738 = transformer_debug.const285;
        q_738 = p_738;
        term = s_exit_0_3.instance.invoke(context, q_738, l_738, m_738, transformer_debug.constLocationInfo293);
        if(term == null)
          break Fail327;
        if(true)
          break Fail327;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}