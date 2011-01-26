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

@SuppressWarnings("all") public class list_imports_0_1 extends Strategy 
{ 
  public static list_imports_0_1 instance = new list_imports_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_v_621)
  { 
    TermReference v_621 = new TermReference(ref_v_621);
    context.push("list_imports_0_1");
    Fail298:
    { 
      TermReference w_621 = new TermReference();
      TermReference x_621 = new TermReference();
      TermReference y_621 = new TermReference();
      TermReference a_622 = new TermReference();
      IStrategoTerm e_622 = null;
      IStrategoTerm f_622 = null;
      IStrategoTerm h_622 = null;
      IStrategoTerm i_622 = null;
      IStrategoTerm j_622 = null;
      h_622 = term;
      e_622 = transformer_debug.const181;
      i_622 = h_622;
      f_622 = transformer_debug.const182;
      j_622 = i_622;
      term = s_enter_0_3.instance.invoke(context, j_622, e_622, f_622, transformer_debug.constLocationInfo67);
      if(term == null)
        break Fail298;
      IStrategoTerm term146 = term;
      Success144:
      { 
        Fail299:
        { 
          TermReference b_622 = new TermReference();
          TermReference k_622 = new TermReference();
          TermReference l_622 = new TermReference();
          TermReference m_622 = new TermReference();
          TermReference n_622 = new TermReference();
          IStrategoTerm o_622 = null;
          IStrategoTerm p_622 = null;
          IStrategoTerm q_622 = null;
          TermReference r_622 = new TermReference();
          TermReference s_622 = new TermReference();
          TermReference t_622 = new TermReference();
          TermReference u_622 = new TermReference();
          TermReference v_622 = new TermReference();
          TermReference w_622 = new TermReference();
          TermReference x_622 = new TermReference();
          TermReference y_622 = new TermReference();
          TermReference z_622 = new TermReference();
          TermReference a_623 = new TermReference();
          TermReference b_623 = new TermReference();
          TermReference c_623 = new TermReference();
          TermReference d_623 = new TermReference();
          TermReference e_623 = new TermReference();
          TermReference f_623 = new TermReference();
          TermReference g_623 = new TermReference();
          TermReference h_623 = new TermReference();
          TermReference i_623 = new TermReference();
          TermReference j_623 = new TermReference();
          TermReference c_622 = new TermReference();
          TermReference k_623 = new TermReference();
          TermReference l_623 = new TermReference();
          TermReference m_623 = new TermReference();
          TermReference n_623 = new TermReference();
          TermReference o_623 = new TermReference();
          TermReference p_623 = new TermReference();
          TermReference q_623 = new TermReference();
          TermReference s_623 = new TermReference();
          TermReference t_623 = new TermReference();
          TermReference u_623 = new TermReference();
          TermReference v_623 = new TermReference();
          TermReference w_623 = new TermReference();
          TermReference q_624 = new TermReference();
          TermReference r_624 = new TermReference();
          TermReference s_624 = new TermReference();
          TermReference t_624 = new TermReference();
          TermReference u_624 = new TermReference();
          TermReference v_624 = new TermReference();
          TermReference w_624 = new TermReference();
          TermReference x_624 = new TermReference();
          if(b_622.value == null)
            b_622.value = term;
          else
            if(b_622.value != term && !b_622.value.match(term))
              break Fail299;
          if(v_621.value == null)
            break Fail299;
          o_622 = v_621.value;
          term = transformer_debug.const181;
          if(k_622.value == null)
            k_622.value = term;
          else
            if(k_622.value != term && !k_622.value.match(term))
              break Fail299;
          p_622 = o_622;
          term = transformer_debug.const182;
          if(l_622.value == null)
            l_622.value = term;
          else
            if(l_622.value != term && !l_622.value.match(term))
              break Fail299;
          q_622 = p_622;
          term = transformer_debug.const191;
          if(m_622.value == null)
            m_622.value = term;
          else
            if(m_622.value != term && !m_622.value.match(term))
              break Fail299;
          term = q_622;
          if(r_622.value == null)
            r_622.value = term;
          else
            if(r_622.value != term && !r_622.value.match(term))
              break Fail299;
          term = transformer_debug.constLocationInfo90;
          list_imports_0_1_fragment_0 list_imports_0_1_fragment_00 = new list_imports_0_1_fragment_0();
          list_imports_0_1_fragment_00.r_622 = r_622;
          list_imports_0_1_fragment_00.k_622 = k_622;
          list_imports_0_1_fragment_00.l_622 = l_622;
          list_imports_0_1_fragment_00.m_622 = m_622;
          list_imports_0_1_fragment_00.n_622 = n_622;
          list_imports_0_1_fragment_00.b_622 = b_622;
          list_imports_0_1_fragment_00.v_622 = v_622;
          list_imports_0_1_fragment_00.w_622 = w_622;
          list_imports_0_1_fragment_00.x_622 = x_622;
          list_imports_0_1_fragment_00.s_622 = s_622;
          list_imports_0_1_fragment_00.t_622 = t_622;
          list_imports_0_1_fragment_00.u_622 = u_622;
          list_imports_0_1_fragment_00.b_623 = b_623;
          list_imports_0_1_fragment_00.c_623 = c_623;
          list_imports_0_1_fragment_00.d_623 = d_623;
          list_imports_0_1_fragment_00.y_622 = y_622;
          list_imports_0_1_fragment_00.z_622 = z_622;
          list_imports_0_1_fragment_00.a_623 = a_623;
          list_imports_0_1_fragment_00.w_621 = w_621;
          list_imports_0_1_fragment_00.h_623 = h_623;
          list_imports_0_1_fragment_00.i_623 = i_623;
          list_imports_0_1_fragment_00.j_623 = j_623;
          list_imports_0_1_fragment_00.e_623 = e_623;
          list_imports_0_1_fragment_00.f_623 = f_623;
          list_imports_0_1_fragment_00.g_623 = g_623;
          list_imports_0_1_fragment_00.n_623 = n_623;
          list_imports_0_1_fragment_00.o_623 = o_623;
          list_imports_0_1_fragment_00.p_623 = p_623;
          list_imports_0_1_fragment_00.k_623 = k_623;
          list_imports_0_1_fragment_00.l_623 = l_623;
          list_imports_0_1_fragment_00.m_623 = m_623;
          list_imports_0_1_fragment_00.u_623 = u_623;
          list_imports_0_1_fragment_00.v_623 = v_623;
          list_imports_0_1_fragment_00.w_623 = w_623;
          list_imports_0_1_fragment_00.q_623 = q_623;
          list_imports_0_1_fragment_00.s_623 = s_623;
          list_imports_0_1_fragment_00.t_623 = t_623;
          list_imports_0_1_fragment_00.x_621 = x_621;
          list_imports_0_1_fragment_00.u_624 = u_624;
          list_imports_0_1_fragment_00.v_624 = v_624;
          list_imports_0_1_fragment_00.w_624 = w_624;
          list_imports_0_1_fragment_00.x_624 = x_624;
          list_imports_0_1_fragment_00.q_624 = q_624;
          list_imports_0_1_fragment_00.r_624 = r_624;
          list_imports_0_1_fragment_00.s_624 = s_624;
          list_imports_0_1_fragment_00.t_624 = t_624;
          list_imports_0_1_fragment_00.v_621 = v_621;
          list_imports_0_1_fragment_00.c_622 = c_622;
          list_imports_0_1_fragment_00.y_621 = y_621;
          list_imports_0_1_fragment_00.a_622 = a_622;
          term = list_imports_0_1_fragment_00.invoke(context, term);
          if(term == null)
            break Fail299;
          { 
            IStrategoTerm x_628 = null;
            IStrategoTerm y_628 = null;
            IStrategoTerm a_629 = null;
            IStrategoTerm b_629 = null;
            IStrategoTerm c_629 = null;
            a_629 = term;
            x_628 = transformer_debug.const181;
            b_629 = a_629;
            y_628 = transformer_debug.const182;
            c_629 = b_629;
            term = s_exit_0_3.instance.invoke(context, c_629, x_628, y_628, transformer_debug.constLocationInfo67);
            if(term == null)
              break Fail298;
            if(true)
              break Success144;
          }
        }
        term = term146;
        IStrategoTerm d_629 = null;
        IStrategoTerm e_629 = null;
        IStrategoTerm h_629 = null;
        IStrategoTerm i_629 = null;
        IStrategoTerm j_629 = null;
        h_629 = term;
        d_629 = transformer_debug.const181;
        i_629 = h_629;
        e_629 = transformer_debug.const182;
        j_629 = i_629;
        term = s_exit_0_3.instance.invoke(context, j_629, d_629, e_629, transformer_debug.constLocationInfo67);
        if(term == null)
          break Fail298;
        if(true)
          break Fail298;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}