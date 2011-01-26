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

@SuppressWarnings("all") public class apply_debug_project_0_1 extends Strategy 
{ 
  public static apply_debug_project_0_1 instance = new apply_debug_project_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_1111)
  { 
    TermReference z_1111 = new TermReference(ref_z_1111);
    context.push("apply_debug_project_0_1");
    Fail443:
    { 
      TermReference a_1112 = new TermReference();
      TermReference b_1112 = new TermReference();
      TermReference c_1112 = new TermReference();
      TermReference d_1112 = new TermReference();
      TermReference e_1112 = new TermReference();
      TermReference f_1112 = new TermReference();
      TermReference g_1112 = new TermReference();
      IStrategoTerm h_1112 = null;
      IStrategoTerm i_1112 = null;
      IStrategoTerm j_1112 = null;
      IStrategoTerm l_1112 = null;
      IStrategoTerm m_1112 = null;
      IStrategoTerm n_1112 = null;
      TermReference o_1112 = new TermReference();
      TermReference p_1112 = new TermReference();
      TermReference q_1112 = new TermReference();
      TermReference r_1112 = new TermReference();
      TermReference s_1112 = new TermReference();
      TermReference t_1112 = new TermReference();
      TermReference u_1112 = new TermReference();
      TermReference v_1112 = new TermReference();
      TermReference w_1112 = new TermReference();
      TermReference x_1112 = new TermReference();
      TermReference y_1112 = new TermReference();
      TermReference z_1112 = new TermReference();
      TermReference a_1113 = new TermReference();
      TermReference b_1113 = new TermReference();
      TermReference c_1113 = new TermReference();
      TermReference d_1113 = new TermReference();
      TermReference e_1113 = new TermReference();
      TermReference f_1113 = new TermReference();
      TermReference g_1113 = new TermReference();
      TermReference h_1113 = new TermReference();
      TermReference i_1113 = new TermReference();
      TermReference j_1113 = new TermReference();
      TermReference k_1113 = new TermReference();
      TermReference l_1113 = new TermReference();
      TermReference m_1113 = new TermReference();
      TermReference n_1113 = new TermReference();
      TermReference o_1113 = new TermReference();
      TermReference p_1113 = new TermReference();
      TermReference q_1113 = new TermReference();
      TermReference r_1113 = new TermReference();
      TermReference s_1113 = new TermReference();
      TermReference t_1113 = new TermReference();
      TermReference u_1113 = new TermReference();
      TermReference v_1113 = new TermReference();
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 3)
        break Fail443;
      if(d_1112.value == null)
        d_1112.value = term.getSubterm(0);
      else
        if(d_1112.value != term.getSubterm(0) && !d_1112.value.match(term.getSubterm(0)))
          break Fail443;
      if(e_1112.value == null)
        e_1112.value = term.getSubterm(1);
      else
        if(e_1112.value != term.getSubterm(1) && !e_1112.value.match(term.getSubterm(1)))
          break Fail443;
      if(a_1112.value == null)
        a_1112.value = term.getSubterm(2);
      else
        if(a_1112.value != term.getSubterm(2) && !a_1112.value.match(term.getSubterm(2)))
          break Fail443;
      h_1112 = term;
      l_1112 = term;
      i_1112 = transformer_debug.const618;
      m_1112 = l_1112;
      j_1112 = transformer_debug.const629;
      n_1112 = m_1112;
      term = r_enter_0_3.instance.invoke(context, n_1112, i_1112, j_1112, transformer_debug.constLocationInfo1212);
      if(term == null)
        break Fail443;
      term = h_1112;
      apply_debug_project_0_1_fragment_0 apply_debug_project_0_1_fragment_00 = new apply_debug_project_0_1_fragment_0();
      apply_debug_project_0_1_fragment_00.t_1112 = t_1112;
      apply_debug_project_0_1_fragment_00.u_1112 = u_1112;
      apply_debug_project_0_1_fragment_00.v_1112 = v_1112;
      apply_debug_project_0_1_fragment_00.w_1112 = w_1112;
      apply_debug_project_0_1_fragment_00.p_1112 = p_1112;
      apply_debug_project_0_1_fragment_00.q_1112 = q_1112;
      apply_debug_project_0_1_fragment_00.r_1112 = r_1112;
      apply_debug_project_0_1_fragment_00.s_1112 = s_1112;
      apply_debug_project_0_1_fragment_00.o_1112 = o_1112;
      apply_debug_project_0_1_fragment_00.c_1113 = c_1113;
      apply_debug_project_0_1_fragment_00.d_1113 = d_1113;
      apply_debug_project_0_1_fragment_00.e_1113 = e_1113;
      apply_debug_project_0_1_fragment_00.f_1113 = f_1113;
      apply_debug_project_0_1_fragment_00.y_1112 = y_1112;
      apply_debug_project_0_1_fragment_00.z_1112 = z_1112;
      apply_debug_project_0_1_fragment_00.a_1113 = a_1113;
      apply_debug_project_0_1_fragment_00.b_1113 = b_1113;
      apply_debug_project_0_1_fragment_00.k_1113 = k_1113;
      apply_debug_project_0_1_fragment_00.l_1113 = l_1113;
      apply_debug_project_0_1_fragment_00.m_1113 = m_1113;
      apply_debug_project_0_1_fragment_00.n_1113 = n_1113;
      apply_debug_project_0_1_fragment_00.g_1113 = g_1113;
      apply_debug_project_0_1_fragment_00.h_1113 = h_1113;
      apply_debug_project_0_1_fragment_00.i_1113 = i_1113;
      apply_debug_project_0_1_fragment_00.j_1113 = j_1113;
      apply_debug_project_0_1_fragment_00.s_1113 = s_1113;
      apply_debug_project_0_1_fragment_00.t_1113 = t_1113;
      apply_debug_project_0_1_fragment_00.u_1113 = u_1113;
      apply_debug_project_0_1_fragment_00.v_1113 = v_1113;
      apply_debug_project_0_1_fragment_00.o_1113 = o_1113;
      apply_debug_project_0_1_fragment_00.p_1113 = p_1113;
      apply_debug_project_0_1_fragment_00.q_1113 = q_1113;
      apply_debug_project_0_1_fragment_00.r_1113 = r_1113;
      apply_debug_project_0_1_fragment_00.x_1112 = x_1112;
      apply_debug_project_0_1_fragment_00.a_1112 = a_1112;
      apply_debug_project_0_1_fragment_00.z_1111 = z_1111;
      apply_debug_project_0_1_fragment_00.b_1112 = b_1112;
      apply_debug_project_0_1_fragment_00.c_1112 = c_1112;
      apply_debug_project_0_1_fragment_00.f_1112 = f_1112;
      apply_debug_project_0_1_fragment_00.d_1112 = d_1112;
      apply_debug_project_0_1_fragment_00.e_1112 = e_1112;
      apply_debug_project_0_1_fragment_00.g_1112 = g_1112;
      term = apply_debug_project_0_1_fragment_00.invoke(context, term);
      if(term == null)
        break Fail443;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}