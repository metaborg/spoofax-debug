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

@SuppressWarnings("all") public class get_internal_files_0_1 extends Strategy 
{ 
  public static get_internal_files_0_1 instance = new get_internal_files_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_k_629)
  { 
    TermReference k_629 = new TermReference(ref_k_629);
    context.push("get_internal_files_0_1");
    Fail300:
    { 
      TermReference l_629 = new TermReference();
      TermReference m_629 = new TermReference();
      TermReference n_629 = new TermReference();
      TermReference o_629 = new TermReference();
      TermReference p_629 = new TermReference();
      TermReference q_629 = new TermReference();
      IStrategoTerm r_629 = null;
      IStrategoTerm s_629 = null;
      IStrategoTerm t_629 = null;
      IStrategoTerm v_629 = null;
      IStrategoTerm w_629 = null;
      IStrategoTerm x_629 = null;
      TermReference y_629 = new TermReference();
      TermReference z_629 = new TermReference();
      TermReference a_630 = new TermReference();
      TermReference b_630 = new TermReference();
      TermReference c_630 = new TermReference();
      TermReference d_630 = new TermReference();
      TermReference e_630 = new TermReference();
      TermReference f_630 = new TermReference();
      TermReference g_630 = new TermReference();
      TermReference h_630 = new TermReference();
      TermReference i_630 = new TermReference();
      TermReference j_630 = new TermReference();
      TermReference k_630 = new TermReference();
      TermReference l_630 = new TermReference();
      TermReference m_630 = new TermReference();
      TermReference n_630 = new TermReference();
      TermReference o_630 = new TermReference();
      TermReference p_630 = new TermReference();
      TermReference q_630 = new TermReference();
      TermReference r_630 = new TermReference();
      TermReference s_630 = new TermReference();
      TermReference t_630 = new TermReference();
      TermReference u_630 = new TermReference();
      TermReference v_630 = new TermReference();
      TermReference w_630 = new TermReference();
      TermReference x_630 = new TermReference();
      TermReference y_630 = new TermReference();
      TermReference z_630 = new TermReference();
      TermReference a_631 = new TermReference();
      TermReference b_631 = new TermReference();
      TermReference c_631 = new TermReference();
      TermReference e_631 = new TermReference();
      TermReference f_631 = new TermReference();
      if(n_629.value == null)
        n_629.value = term;
      else
        if(n_629.value != term && !n_629.value.match(term))
          break Fail300;
      r_629 = term;
      v_629 = term;
      s_629 = transformer_debug.const181;
      w_629 = v_629;
      t_629 = transformer_debug.const192;
      x_629 = w_629;
      term = r_enter_0_3.instance.invoke(context, x_629, s_629, t_629, transformer_debug.constLocationInfo111);
      if(term == null)
        break Fail300;
      term = r_629;
      get_internal_files_0_1_fragment_0 get_internal_files_0_1_fragment_00 = new get_internal_files_0_1_fragment_0();
      get_internal_files_0_1_fragment_00.d_630 = d_630;
      get_internal_files_0_1_fragment_00.e_630 = e_630;
      get_internal_files_0_1_fragment_00.f_630 = f_630;
      get_internal_files_0_1_fragment_00.g_630 = g_630;
      get_internal_files_0_1_fragment_00.z_629 = z_629;
      get_internal_files_0_1_fragment_00.a_630 = a_630;
      get_internal_files_0_1_fragment_00.b_630 = b_630;
      get_internal_files_0_1_fragment_00.c_630 = c_630;
      get_internal_files_0_1_fragment_00.y_629 = y_629;
      get_internal_files_0_1_fragment_00.m_630 = m_630;
      get_internal_files_0_1_fragment_00.n_630 = n_630;
      get_internal_files_0_1_fragment_00.o_630 = o_630;
      get_internal_files_0_1_fragment_00.p_630 = p_630;
      get_internal_files_0_1_fragment_00.i_630 = i_630;
      get_internal_files_0_1_fragment_00.j_630 = j_630;
      get_internal_files_0_1_fragment_00.k_630 = k_630;
      get_internal_files_0_1_fragment_00.l_630 = l_630;
      get_internal_files_0_1_fragment_00.h_630 = h_630;
      get_internal_files_0_1_fragment_00.u_630 = u_630;
      get_internal_files_0_1_fragment_00.v_630 = v_630;
      get_internal_files_0_1_fragment_00.w_630 = w_630;
      get_internal_files_0_1_fragment_00.r_630 = r_630;
      get_internal_files_0_1_fragment_00.s_630 = s_630;
      get_internal_files_0_1_fragment_00.t_630 = t_630;
      get_internal_files_0_1_fragment_00.b_631 = b_631;
      get_internal_files_0_1_fragment_00.c_631 = c_631;
      get_internal_files_0_1_fragment_00.e_631 = e_631;
      get_internal_files_0_1_fragment_00.f_631 = f_631;
      get_internal_files_0_1_fragment_00.x_630 = x_630;
      get_internal_files_0_1_fragment_00.y_630 = y_630;
      get_internal_files_0_1_fragment_00.z_630 = z_630;
      get_internal_files_0_1_fragment_00.a_631 = a_631;
      get_internal_files_0_1_fragment_00.k_629 = k_629;
      get_internal_files_0_1_fragment_00.l_629 = l_629;
      get_internal_files_0_1_fragment_00.m_629 = m_629;
      get_internal_files_0_1_fragment_00.n_629 = n_629;
      get_internal_files_0_1_fragment_00.o_629 = o_629;
      get_internal_files_0_1_fragment_00.p_629 = p_629;
      get_internal_files_0_1_fragment_00.q_630 = q_630;
      get_internal_files_0_1_fragment_00.q_629 = q_629;
      term = get_internal_files_0_1_fragment_00.invoke(context, term);
      if(term == null)
        break Fail300;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}