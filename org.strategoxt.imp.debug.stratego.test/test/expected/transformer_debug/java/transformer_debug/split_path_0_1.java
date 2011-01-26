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

@SuppressWarnings("all") public class split_path_0_1 extends Strategy 
{ 
  public static split_path_0_1 instance = new split_path_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_c_643)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference c_643 = new TermReference(ref_c_643);
    context.push("split_path_0_1");
    Fail304:
    { 
      TermReference d_643 = new TermReference();
      TermReference g_643 = new TermReference();
      TermReference h_643 = new TermReference();
      TermReference j_643 = new TermReference();
      TermReference k_643 = new TermReference();
      TermReference l_643 = new TermReference();
      TermReference m_643 = new TermReference();
      TermReference n_643 = new TermReference();
      IStrategoTerm o_643 = null;
      IStrategoTerm q_643 = null;
      IStrategoTerm r_643 = null;
      IStrategoTerm t_643 = null;
      IStrategoTerm u_643 = null;
      IStrategoTerm v_643 = null;
      TermReference w_643 = new TermReference();
      TermReference x_643 = new TermReference();
      TermReference y_643 = new TermReference();
      TermReference z_643 = new TermReference();
      TermReference a_644 = new TermReference();
      IStrategoTerm b_644 = null;
      IStrategoTerm c_644 = null;
      IStrategoTerm d_644 = null;
      TermReference f_644 = new TermReference();
      TermReference g_644 = new TermReference();
      TermReference h_644 = new TermReference();
      TermReference i_644 = new TermReference();
      TermReference j_644 = new TermReference();
      TermReference k_644 = new TermReference();
      TermReference l_644 = new TermReference();
      TermReference m_644 = new TermReference();
      TermReference n_644 = new TermReference();
      TermReference o_644 = new TermReference();
      TermReference p_644 = new TermReference();
      TermReference q_644 = new TermReference();
      TermReference r_644 = new TermReference();
      TermReference s_644 = new TermReference();
      TermReference t_644 = new TermReference();
      TermReference u_644 = new TermReference();
      TermReference v_644 = new TermReference();
      TermReference x_644 = new TermReference();
      TermReference y_644 = new TermReference();
      TermReference z_644 = new TermReference();
      TermReference a_645 = new TermReference();
      TermReference b_645 = new TermReference();
      TermReference c_645 = new TermReference();
      TermReference d_645 = new TermReference();
      TermReference e_645 = new TermReference();
      TermReference f_645 = new TermReference();
      TermReference g_645 = new TermReference();
      TermReference h_645 = new TermReference();
      TermReference i_645 = new TermReference();
      TermReference j_645 = new TermReference();
      TermReference k_645 = new TermReference();
      TermReference l_645 = new TermReference();
      TermReference m_645 = new TermReference();
      TermReference n_645 = new TermReference();
      TermReference o_645 = new TermReference();
      TermReference p_645 = new TermReference();
      TermReference q_645 = new TermReference();
      TermReference r_645 = new TermReference();
      IStrategoTerm f_650 = null;
      IStrategoTerm g_650 = null;
      IStrategoTerm i_650 = null;
      IStrategoTerm j_650 = null;
      IStrategoTerm k_650 = null;
      if(g_643.value == null)
        g_643.value = term;
      else
        if(g_643.value != term && !g_643.value.match(term))
          break Fail304;
      o_643 = term;
      t_643 = term;
      q_643 = transformer_debug.const181;
      u_643 = t_643;
      r_643 = transformer_debug.const213;
      v_643 = u_643;
      term = r_enter_0_3.instance.invoke(context, v_643, q_643, r_643, transformer_debug.constLocationInfo133);
      if(term == null)
        break Fail304;
      term = o_643;
      if(w_643.value == null)
        w_643.value = term;
      else
        if(w_643.value != term && !w_643.value.match(term))
          break Fail304;
      if(c_643.value == null)
        break Fail304;
      b_644 = c_643.value;
      term = transformer_debug.const181;
      if(x_643.value == null)
        x_643.value = term;
      else
        if(x_643.value != term && !x_643.value.match(term))
          break Fail304;
      c_644 = b_644;
      term = transformer_debug.const213;
      if(y_643.value == null)
        y_643.value = term;
      else
        if(y_643.value != term && !y_643.value.match(term))
          break Fail304;
      d_644 = c_644;
      term = transformer_debug.const103;
      if(z_643.value == null)
        z_643.value = term;
      else
        if(z_643.value != term && !z_643.value.match(term))
          break Fail304;
      term = d_644;
      if(f_644.value == null)
        f_644.value = term;
      else
        if(f_644.value != term && !f_644.value.match(term))
          break Fail304;
      split_path_0_1_fragment_0 split_path_0_1_fragment_00 = new split_path_0_1_fragment_0();
      split_path_0_1_fragment_00.f_644 = f_644;
      split_path_0_1_fragment_00.x_643 = x_643;
      split_path_0_1_fragment_00.y_643 = y_643;
      split_path_0_1_fragment_00.z_643 = z_643;
      split_path_0_1_fragment_00.a_644 = a_644;
      split_path_0_1_fragment_00.w_643 = w_643;
      split_path_0_1_fragment_00.l_644 = l_644;
      split_path_0_1_fragment_00.m_644 = m_644;
      split_path_0_1_fragment_00.n_644 = n_644;
      split_path_0_1_fragment_00.o_644 = o_644;
      split_path_0_1_fragment_00.h_644 = h_644;
      split_path_0_1_fragment_00.i_644 = i_644;
      split_path_0_1_fragment_00.j_644 = j_644;
      split_path_0_1_fragment_00.k_644 = k_644;
      split_path_0_1_fragment_00.g_644 = g_644;
      split_path_0_1_fragment_00.t_644 = t_644;
      split_path_0_1_fragment_00.u_644 = u_644;
      split_path_0_1_fragment_00.v_644 = v_644;
      split_path_0_1_fragment_00.q_644 = q_644;
      split_path_0_1_fragment_00.r_644 = r_644;
      split_path_0_1_fragment_00.s_644 = s_644;
      split_path_0_1_fragment_00.p_644 = p_644;
      split_path_0_1_fragment_00.b_645 = b_645;
      split_path_0_1_fragment_00.c_645 = c_645;
      split_path_0_1_fragment_00.d_645 = d_645;
      split_path_0_1_fragment_00.y_644 = y_644;
      split_path_0_1_fragment_00.z_644 = z_644;
      split_path_0_1_fragment_00.a_645 = a_645;
      split_path_0_1_fragment_00.c_643 = c_643;
      split_path_0_1_fragment_00.h_645 = h_645;
      split_path_0_1_fragment_00.i_645 = i_645;
      split_path_0_1_fragment_00.j_645 = j_645;
      split_path_0_1_fragment_00.e_645 = e_645;
      split_path_0_1_fragment_00.f_645 = f_645;
      split_path_0_1_fragment_00.g_645 = g_645;
      split_path_0_1_fragment_00.o_645 = o_645;
      split_path_0_1_fragment_00.p_645 = p_645;
      split_path_0_1_fragment_00.q_645 = q_645;
      split_path_0_1_fragment_00.r_645 = r_645;
      split_path_0_1_fragment_00.k_645 = k_645;
      split_path_0_1_fragment_00.l_645 = l_645;
      split_path_0_1_fragment_00.m_645 = m_645;
      split_path_0_1_fragment_00.n_645 = n_645;
      split_path_0_1_fragment_00.d_643 = d_643;
      split_path_0_1_fragment_00.g_643 = g_643;
      split_path_0_1_fragment_00.h_643 = h_643;
      split_path_0_1_fragment_00.j_643 = j_643;
      split_path_0_1_fragment_00.k_643 = k_643;
      split_path_0_1_fragment_00.l_643 = l_643;
      split_path_0_1_fragment_00.m_643 = m_643;
      split_path_0_1_fragment_00.n_643 = n_643;
      split_path_0_1_fragment_00.x_644 = x_644;
      term = split_path_0_1_fragment_00.invoke(context, term);
      if(term == null)
        break Fail304;
      if(l_643.value == null || n_643.value == null)
        break Fail304;
      term = termFactory.makeTuple(l_643.value, n_643.value);
      i_650 = term;
      f_650 = transformer_debug.const181;
      j_650 = i_650;
      g_650 = transformer_debug.const213;
      k_650 = j_650;
      term = r_exit_0_3.instance.invoke(context, k_650, f_650, g_650, transformer_debug.constLocationInfo133);
      if(term == null)
        break Fail304;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}