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

@SuppressWarnings("all") public class wrap_s_0_3 extends Strategy 
{ 
  public static wrap_s_0_3 instance = new wrap_s_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_j_994, IStrategoTerm ref_k_994, IStrategoTerm ref_l_994)
  { 
    TermReference j_994 = new TermReference(ref_j_994);
    TermReference k_994 = new TermReference(ref_k_994);
    TermReference l_994 = new TermReference(ref_l_994);
    context.push("wrap_s_0_3");
    Fail386:
    { 
      TermReference m_994 = new TermReference();
      TermReference n_994 = new TermReference();
      TermReference o_994 = new TermReference();
      TermReference p_994 = new TermReference();
      TermReference q_994 = new TermReference();
      TermReference r_994 = new TermReference();
      TermReference s_994 = new TermReference();
      IStrategoTerm v_994 = null;
      IStrategoTerm w_994 = null;
      IStrategoTerm x_994 = null;
      IStrategoTerm z_994 = null;
      IStrategoTerm a_995 = null;
      IStrategoTerm b_995 = null;
      TermReference c_995 = new TermReference();
      TermReference d_995 = new TermReference();
      TermReference e_995 = new TermReference();
      TermReference f_995 = new TermReference();
      TermReference g_995 = new TermReference();
      TermReference h_995 = new TermReference();
      TermReference i_995 = new TermReference();
      TermReference j_995 = new TermReference();
      TermReference k_995 = new TermReference();
      TermReference l_995 = new TermReference();
      TermReference m_995 = new TermReference();
      TermReference n_995 = new TermReference();
      TermReference o_995 = new TermReference();
      TermReference p_995 = new TermReference();
      TermReference q_995 = new TermReference();
      TermReference r_995 = new TermReference();
      TermReference s_995 = new TermReference();
      TermReference t_995 = new TermReference();
      TermReference u_995 = new TermReference();
      TermReference v_995 = new TermReference();
      TermReference w_995 = new TermReference();
      TermReference x_995 = new TermReference();
      TermReference y_995 = new TermReference();
      TermReference z_995 = new TermReference();
      TermReference a_996 = new TermReference();
      if(n_994.value == null)
        n_994.value = term;
      else
        if(n_994.value != term && !n_994.value.match(term))
          break Fail386;
      v_994 = term;
      z_994 = term;
      w_994 = transformer_debug.const513;
      a_995 = z_994;
      x_994 = transformer_debug.const521;
      b_995 = a_995;
      term = r_enter_0_3.instance.invoke(context, b_995, w_994, x_994, transformer_debug.constLocationInfo971);
      if(term == null)
        break Fail386;
      term = v_994;
      wrap_s_0_3_fragment_0 wrap_s_0_3_fragment_00 = new wrap_s_0_3_fragment_0();
      wrap_s_0_3_fragment_00.h_995 = h_995;
      wrap_s_0_3_fragment_00.i_995 = i_995;
      wrap_s_0_3_fragment_00.j_995 = j_995;
      wrap_s_0_3_fragment_00.k_995 = k_995;
      wrap_s_0_3_fragment_00.d_995 = d_995;
      wrap_s_0_3_fragment_00.e_995 = e_995;
      wrap_s_0_3_fragment_00.f_995 = f_995;
      wrap_s_0_3_fragment_00.g_995 = g_995;
      wrap_s_0_3_fragment_00.p_995 = p_995;
      wrap_s_0_3_fragment_00.q_995 = q_995;
      wrap_s_0_3_fragment_00.r_995 = r_995;
      wrap_s_0_3_fragment_00.s_995 = s_995;
      wrap_s_0_3_fragment_00.l_995 = l_995;
      wrap_s_0_3_fragment_00.m_995 = m_995;
      wrap_s_0_3_fragment_00.n_995 = n_995;
      wrap_s_0_3_fragment_00.o_995 = o_995;
      wrap_s_0_3_fragment_00.x_995 = x_995;
      wrap_s_0_3_fragment_00.y_995 = y_995;
      wrap_s_0_3_fragment_00.z_995 = z_995;
      wrap_s_0_3_fragment_00.a_996 = a_996;
      wrap_s_0_3_fragment_00.t_995 = t_995;
      wrap_s_0_3_fragment_00.u_995 = u_995;
      wrap_s_0_3_fragment_00.v_995 = v_995;
      wrap_s_0_3_fragment_00.w_995 = w_995;
      wrap_s_0_3_fragment_00.c_995 = c_995;
      wrap_s_0_3_fragment_00.j_994 = j_994;
      wrap_s_0_3_fragment_00.k_994 = k_994;
      wrap_s_0_3_fragment_00.l_994 = l_994;
      wrap_s_0_3_fragment_00.m_994 = m_994;
      wrap_s_0_3_fragment_00.n_994 = n_994;
      wrap_s_0_3_fragment_00.o_994 = o_994;
      wrap_s_0_3_fragment_00.p_994 = p_994;
      wrap_s_0_3_fragment_00.q_994 = q_994;
      wrap_s_0_3_fragment_00.r_994 = r_994;
      wrap_s_0_3_fragment_00.s_994 = s_994;
      term = wrap_s_0_3_fragment_00.invoke(context, term);
      if(term == null)
        break Fail386;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}