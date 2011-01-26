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

@SuppressWarnings("all") public class create_seq_0_0 extends Strategy 
{ 
  public static create_seq_0_0 instance = new create_seq_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_seq_0_0");
    Fail325:
    { 
      IStrategoTerm v_734 = null;
      IStrategoTerm w_734 = null;
      IStrategoTerm x_734 = null;
      IStrategoTerm y_734 = null;
      IStrategoTerm a_735 = null;
      IStrategoTerm b_735 = null;
      IStrategoTerm c_735 = null;
      a_735 = term;
      x_734 = transformer_debug.const236;
      b_735 = a_735;
      y_734 = transformer_debug.const282;
      c_735 = b_735;
      term = s_enter_0_3.instance.invoke(context, c_735, x_734, y_734, transformer_debug.constLocationInfo290);
      if(term == null)
        break Fail325;
      IStrategoTerm term161 = term;
      Success155:
      { 
        Fail326:
        { 
          IStrategoTerm d_735 = null;
          IStrategoTerm e_735 = null;
          IStrategoTerm g_735 = null;
          IStrategoTerm h_735 = null;
          IStrategoTerm i_735 = null;
          IStrategoTerm j_735 = null;
          IStrategoTerm k_735 = null;
          IStrategoTerm m_735 = null;
          IStrategoTerm n_735 = null;
          IStrategoTerm o_735 = null;
          g_735 = term;
          d_735 = transformer_debug.const236;
          h_735 = g_735;
          e_735 = transformer_debug.const282;
          i_735 = h_735;
          term = s_step_0_3.instance.invoke(context, i_735, d_735, e_735, transformer_debug.constLocationInfo291);
          if(term == null)
            break Fail326;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail326;
          v_734 = term.getSubterm(0);
          w_734 = term.getSubterm(1);
          m_735 = term;
          j_735 = transformer_debug.const236;
          n_735 = m_735;
          k_735 = transformer_debug.const282;
          o_735 = n_735;
          term = s_step_0_3.instance.invoke(context, o_735, j_735, k_735, transformer_debug.constLocationInfo292);
          if(term == null)
            break Fail326;
          term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{v_734, w_734});
          { 
            IStrategoTerm p_735 = null;
            IStrategoTerm q_735 = null;
            IStrategoTerm s_735 = null;
            IStrategoTerm t_735 = null;
            IStrategoTerm u_735 = null;
            s_735 = term;
            p_735 = transformer_debug.const236;
            t_735 = s_735;
            q_735 = transformer_debug.const282;
            u_735 = t_735;
            term = s_exit_0_3.instance.invoke(context, u_735, p_735, q_735, transformer_debug.constLocationInfo290);
            if(term == null)
              break Fail325;
            if(true)
              break Success155;
          }
        }
        term = term161;
        IStrategoTerm v_735 = null;
        IStrategoTerm w_735 = null;
        IStrategoTerm y_735 = null;
        IStrategoTerm z_735 = null;
        IStrategoTerm a_736 = null;
        y_735 = term;
        v_735 = transformer_debug.const236;
        z_735 = y_735;
        w_735 = transformer_debug.const282;
        a_736 = z_735;
        term = s_exit_0_3.instance.invoke(context, a_736, v_735, w_735, transformer_debug.constLocationInfo290);
        if(term == null)
          break Fail325;
        if(true)
          break Fail325;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}