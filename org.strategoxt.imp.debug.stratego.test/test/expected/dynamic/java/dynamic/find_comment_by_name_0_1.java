package dynamic;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class find_comment_by_name_0_1 extends Strategy 
{ 
  public static find_comment_by_name_0_1 instance = new find_comment_by_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_t_21)
  { 
    TermReference t_21 = new TermReference(ref_t_21);
    context.push("find_comment_by_name_0_1");
    Fail16:
    { 
      TermReference u_21 = new TermReference();
      TermReference v_21 = new TermReference();
      TermReference w_21 = new TermReference();
      TermReference x_21 = new TermReference();
      TermReference b_22 = new TermReference();
      IStrategoTerm c_22 = null;
      IStrategoTerm d_22 = null;
      IStrategoTerm f_22 = null;
      IStrategoTerm g_22 = null;
      IStrategoTerm h_22 = null;
      TermReference i_22 = new TermReference();
      TermReference j_22 = new TermReference();
      TermReference k_22 = new TermReference();
      TermReference l_22 = new TermReference();
      TermReference m_22 = new TermReference();
      TermReference n_22 = new TermReference();
      TermReference o_22 = new TermReference();
      TermReference p_22 = new TermReference();
      TermReference q_22 = new TermReference();
      TermReference r_22 = new TermReference();
      TermReference s_22 = new TermReference();
      TermReference t_22 = new TermReference();
      TermReference u_22 = new TermReference();
      TermReference v_22 = new TermReference();
      TermReference w_22 = new TermReference();
      TermReference x_22 = new TermReference();
      TermReference y_22 = new TermReference();
      TermReference z_22 = new TermReference();
      TermReference a_23 = new TermReference();
      TermReference b_23 = new TermReference();
      TermReference c_23 = new TermReference();
      TermReference d_23 = new TermReference();
      TermReference e_23 = new TermReference();
      TermReference f_23 = new TermReference();
      TermReference g_23 = new TermReference();
      TermReference n_23 = new TermReference();
      TermReference o_23 = new TermReference();
      TermReference p_23 = new TermReference();
      TermReference q_23 = new TermReference();
      TermReference r_23 = new TermReference();
      TermReference s_23 = new TermReference();
      TermReference t_23 = new TermReference();
      TermReference u_23 = new TermReference();
      TermReference v_23 = new TermReference();
      TermReference w_23 = new TermReference();
      TermReference x_23 = new TermReference();
      TermReference y_23 = new TermReference();
      TermReference z_23 = new TermReference();
      TermReference a_24 = new TermReference();
      TermReference b_24 = new TermReference();
      TermReference c_24 = new TermReference();
      TermReference d_24 = new TermReference();
      TermReference e_24 = new TermReference();
      TermReference f_24 = new TermReference();
      TermReference g_24 = new TermReference();
      TermReference h_24 = new TermReference();
      TermReference i_24 = new TermReference();
      TermReference j_24 = new TermReference();
      if(v_21.value == null)
        v_21.value = term;
      else
        if(v_21.value != term && !v_21.value.match(term))
          break Fail16;
      if(b_22.value == null)
        b_22.value = term;
      else
        if(b_22.value != term && !b_22.value.match(term))
          break Fail16;
      f_22 = term;
      c_22 = dynamic.const0;
      g_22 = f_22;
      d_22 = dynamic.const91;
      h_22 = g_22;
      term = r_enter_0_3.instance.invoke(context, h_22, c_22, d_22, dynamic.constLocationInfo72);
      if(term == null)
        break Fail16;
      find_comment_by_name_0_1_fragment_0 find_comment_by_name_0_1_fragment_00 = new find_comment_by_name_0_1_fragment_0();
      find_comment_by_name_0_1_fragment_00.b_22 = b_22;
      find_comment_by_name_0_1_fragment_00.n_22 = n_22;
      find_comment_by_name_0_1_fragment_00.o_22 = o_22;
      find_comment_by_name_0_1_fragment_00.p_22 = p_22;
      find_comment_by_name_0_1_fragment_00.q_22 = q_22;
      find_comment_by_name_0_1_fragment_00.j_22 = j_22;
      find_comment_by_name_0_1_fragment_00.k_22 = k_22;
      find_comment_by_name_0_1_fragment_00.l_22 = l_22;
      find_comment_by_name_0_1_fragment_00.m_22 = m_22;
      find_comment_by_name_0_1_fragment_00.i_22 = i_22;
      find_comment_by_name_0_1_fragment_00.w_22 = w_22;
      find_comment_by_name_0_1_fragment_00.x_22 = x_22;
      find_comment_by_name_0_1_fragment_00.y_22 = y_22;
      find_comment_by_name_0_1_fragment_00.z_22 = z_22;
      find_comment_by_name_0_1_fragment_00.s_22 = s_22;
      find_comment_by_name_0_1_fragment_00.t_22 = t_22;
      find_comment_by_name_0_1_fragment_00.u_22 = u_22;
      find_comment_by_name_0_1_fragment_00.v_22 = v_22;
      find_comment_by_name_0_1_fragment_00.r_22 = r_22;
      find_comment_by_name_0_1_fragment_00.e_23 = e_23;
      find_comment_by_name_0_1_fragment_00.f_23 = f_23;
      find_comment_by_name_0_1_fragment_00.g_23 = g_23;
      find_comment_by_name_0_1_fragment_00.b_23 = b_23;
      find_comment_by_name_0_1_fragment_00.c_23 = c_23;
      find_comment_by_name_0_1_fragment_00.d_23 = d_23;
      find_comment_by_name_0_1_fragment_00.a_23 = a_23;
      find_comment_by_name_0_1_fragment_00.r_23 = r_23;
      find_comment_by_name_0_1_fragment_00.s_23 = s_23;
      find_comment_by_name_0_1_fragment_00.t_23 = t_23;
      find_comment_by_name_0_1_fragment_00.o_23 = o_23;
      find_comment_by_name_0_1_fragment_00.p_23 = p_23;
      find_comment_by_name_0_1_fragment_00.q_23 = q_23;
      find_comment_by_name_0_1_fragment_00.z_23 = z_23;
      find_comment_by_name_0_1_fragment_00.a_24 = a_24;
      find_comment_by_name_0_1_fragment_00.b_24 = b_24;
      find_comment_by_name_0_1_fragment_00.w_23 = w_23;
      find_comment_by_name_0_1_fragment_00.x_23 = x_23;
      find_comment_by_name_0_1_fragment_00.y_23 = y_23;
      find_comment_by_name_0_1_fragment_00.v_23 = v_23;
      find_comment_by_name_0_1_fragment_00.u_23 = u_23;
      find_comment_by_name_0_1_fragment_00.g_24 = g_24;
      find_comment_by_name_0_1_fragment_00.h_24 = h_24;
      find_comment_by_name_0_1_fragment_00.i_24 = i_24;
      find_comment_by_name_0_1_fragment_00.j_24 = j_24;
      find_comment_by_name_0_1_fragment_00.c_24 = c_24;
      find_comment_by_name_0_1_fragment_00.d_24 = d_24;
      find_comment_by_name_0_1_fragment_00.e_24 = e_24;
      find_comment_by_name_0_1_fragment_00.f_24 = f_24;
      find_comment_by_name_0_1_fragment_00.u_21 = u_21;
      find_comment_by_name_0_1_fragment_00.n_23 = n_23;
      find_comment_by_name_0_1_fragment_00.v_21 = v_21;
      find_comment_by_name_0_1_fragment_00.t_21 = t_21;
      find_comment_by_name_0_1_fragment_00.w_21 = w_21;
      find_comment_by_name_0_1_fragment_00.x_21 = x_21;
      term = find_comment_by_name_0_1_fragment_00.invoke(context, term);
      if(term == null)
        break Fail16;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}