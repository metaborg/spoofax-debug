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

@SuppressWarnings("all") public class assert_module_0_0 extends Strategy 
{ 
  public static assert_module_0_0 instance = new assert_module_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("assert_module_0_0");
    Fail305:
    { 
      IStrategoTerm x_687 = null;
      IStrategoTerm z_687 = null;
      IStrategoTerm b_688 = null;
      IStrategoTerm c_688 = null;
      IStrategoTerm d_688 = null;
      b_688 = term;
      x_687 = transformer_debug.const223;
      c_688 = b_688;
      z_687 = transformer_debug.const224;
      d_688 = c_688;
      term = s_enter_0_3.instance.invoke(context, d_688, x_687, z_687, transformer_debug.constLocationInfo156);
      if(term == null)
        break Fail305;
      IStrategoTerm term152 = term;
      Success146:
      { 
        Fail306:
        { 
          IStrategoTerm term153 = term;
          Success147:
          { 
            Fail307:
            { 
              IStrategoTerm e_688 = null;
              IStrategoTerm f_688 = null;
              IStrategoTerm h_688 = null;
              IStrategoTerm i_688 = null;
              IStrategoTerm j_688 = null;
              h_688 = term;
              e_688 = transformer_debug.const223;
              i_688 = h_688;
              f_688 = transformer_debug.const224;
              j_688 = i_688;
              term = s_step_0_3.instance.invoke(context, j_688, e_688, f_688, transformer_debug.constLocationInfo157);
              if(term == null)
                break Fail307;
              if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consModule_2 != ((IStrategoAppl)term).getConstructor())
                break Fail307;
              if(true)
                break Success147;
            }
            term = term153;
            IStrategoTerm k_688 = null;
            IStrategoTerm l_688 = null;
            IStrategoTerm n_688 = null;
            IStrategoTerm p_688 = null;
            IStrategoTerm q_688 = null;
            IStrategoTerm x_688 = null;
            IStrategoTerm y_688 = null;
            IStrategoTerm a_689 = null;
            IStrategoTerm b_689 = null;
            IStrategoTerm c_689 = null;
            n_688 = term;
            k_688 = transformer_debug.const223;
            p_688 = n_688;
            l_688 = transformer_debug.const224;
            q_688 = p_688;
            term = s_step_0_3.instance.invoke(context, q_688, k_688, l_688, transformer_debug.constLocationInfo158);
            if(term == null)
              break Fail306;
            term = debug_1_0.instance.invoke(context, term, lifted115.instance);
            if(term == null)
              break Fail306;
            a_689 = term;
            x_688 = transformer_debug.const223;
            b_689 = a_689;
            y_688 = transformer_debug.const224;
            c_689 = b_689;
            term = s_step_0_3.instance.invoke(context, c_689, x_688, y_688, transformer_debug.constLocationInfo160);
            if(term == null)
              break Fail306;
            if(true)
              break Fail306;
          }
          { 
            IStrategoTerm d_689 = null;
            IStrategoTerm e_689 = null;
            IStrategoTerm g_689 = null;
            IStrategoTerm h_689 = null;
            IStrategoTerm i_689 = null;
            g_689 = term;
            d_689 = transformer_debug.const223;
            h_689 = g_689;
            e_689 = transformer_debug.const224;
            i_689 = h_689;
            term = s_exit_0_3.instance.invoke(context, i_689, d_689, e_689, transformer_debug.constLocationInfo156);
            if(term == null)
              break Fail305;
            if(true)
              break Success146;
          }
        }
        term = term152;
        IStrategoTerm j_689 = null;
        IStrategoTerm k_689 = null;
        IStrategoTerm m_689 = null;
        IStrategoTerm n_689 = null;
        IStrategoTerm o_689 = null;
        m_689 = term;
        j_689 = transformer_debug.const223;
        n_689 = m_689;
        k_689 = transformer_debug.const224;
        o_689 = n_689;
        term = s_exit_0_3.instance.invoke(context, o_689, j_689, k_689, transformer_debug.constLocationInfo156);
        if(term == null)
          break Fail305;
        if(true)
          break Fail305;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}