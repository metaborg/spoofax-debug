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

@SuppressWarnings("all") public class match_assign_build_s_var_0_2 extends Strategy 
{ 
  public static match_assign_build_s_var_0_2 instance = new match_assign_build_s_var_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm b_801, IStrategoTerm c_801)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("match_assign_build_s_var_0_2");
    Fail353:
    { 
      IStrategoTerm e_801 = null;
      IStrategoTerm f_801 = null;
      IStrategoTerm g_801 = null;
      IStrategoTerm h_801 = null;
      IStrategoTerm i_801 = null;
      IStrategoTerm l_801 = null;
      IStrategoTerm m_801 = null;
      IStrategoTerm n_801 = null;
      IStrategoTerm p_801 = null;
      IStrategoTerm q_801 = null;
      IStrategoTerm r_801 = null;
      IStrategoTerm s_801 = null;
      IStrategoTerm t_801 = null;
      IStrategoTerm u_801 = null;
      IStrategoTerm v_801 = null;
      IStrategoTerm x_801 = null;
      IStrategoTerm y_801 = null;
      IStrategoTerm z_801 = null;
      IStrategoTerm a_802 = null;
      IStrategoTerm b_802 = null;
      IStrategoTerm c_802 = null;
      IStrategoTerm d_802 = null;
      IStrategoTerm f_802 = null;
      IStrategoTerm g_802 = null;
      IStrategoTerm h_802 = null;
      IStrategoTerm i_802 = null;
      IStrategoTerm j_802 = null;
      IStrategoTerm k_802 = null;
      IStrategoTerm l_802 = null;
      IStrategoTerm m_802 = null;
      IStrategoTerm o_802 = null;
      IStrategoTerm p_802 = null;
      IStrategoTerm q_802 = null;
      IStrategoTerm r_802 = null;
      IStrategoTerm s_802 = null;
      IStrategoTerm t_802 = null;
      IStrategoTerm u_802 = null;
      IStrategoTerm w_802 = null;
      IStrategoTerm x_802 = null;
      IStrategoTerm y_802 = null;
      IStrategoTerm z_802 = null;
      IStrategoTerm a_803 = null;
      IStrategoTerm b_803 = null;
      IStrategoTerm c_803 = null;
      IStrategoTerm e_803 = null;
      IStrategoTerm f_803 = null;
      IStrategoTerm g_803 = null;
      IStrategoTerm h_803 = null;
      IStrategoTerm i_803 = null;
      IStrategoTerm j_803 = null;
      IStrategoTerm k_803 = null;
      IStrategoTerm m_803 = null;
      IStrategoTerm n_803 = null;
      IStrategoTerm o_803 = null;
      IStrategoTerm p_803 = null;
      IStrategoTerm q_803 = null;
      e_801 = term;
      if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consAssign_2 != ((IStrategoAppl)term).getConstructor())
        break Fail353;
      h_801 = term.getSubterm(0);
      f_801 = term.getSubterm(1);
      IStrategoList annos71 = term.getAnnotations();
      if(annos71.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos71).isEmpty())
        break Fail353;
      g_801 = ((IStrategoList)annos71).head();
      IStrategoTerm arg123 = ((IStrategoList)annos71).tail();
      if(arg123.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg123).isEmpty())
        break Fail353;
      l_801 = term;
      p_801 = term;
      m_801 = transformer_debug.const284;
      q_801 = p_801;
      n_801 = transformer_debug.const339;
      r_801 = q_801;
      term = r_enter_0_3.instance.invoke(context, r_801, m_801, n_801, transformer_debug.constLocationInfo466);
      if(term == null)
        break Fail353;
      s_801 = l_801;
      x_801 = b_801;
      t_801 = transformer_debug.const284;
      y_801 = x_801;
      u_801 = transformer_debug.const339;
      z_801 = y_801;
      v_801 = transformer_debug.const238;
      a_802 = z_801;
      term = s_var_0_4.instance.invoke(context, a_802, t_801, u_801, v_801, transformer_debug.constLocationInfo467);
      if(term == null)
        break Fail353;
      f_802 = c_801;
      b_802 = transformer_debug.const284;
      g_802 = f_802;
      c_802 = transformer_debug.const339;
      h_802 = g_802;
      d_802 = transformer_debug.const239;
      i_802 = h_802;
      term = s_var_0_4.instance.invoke(context, i_802, b_802, c_802, d_802, transformer_debug.constLocationInfo468);
      if(term == null)
        break Fail353;
      j_802 = s_801;
      o_802 = e_801;
      k_802 = transformer_debug.const284;
      p_802 = o_802;
      l_802 = transformer_debug.const339;
      q_802 = p_802;
      m_802 = transformer_debug.const290;
      r_802 = q_802;
      term = s_var_0_4.instance.invoke(context, r_802, k_802, l_802, m_802, transformer_debug.constLocationInfo469);
      if(term == null)
        break Fail353;
      w_802 = h_801;
      s_802 = transformer_debug.const284;
      x_802 = w_802;
      t_802 = transformer_debug.const339;
      y_802 = x_802;
      u_802 = transformer_debug.const343;
      z_802 = y_802;
      term = s_var_0_4.instance.invoke(context, z_802, s_802, t_802, u_802, transformer_debug.constLocationInfo470);
      if(term == null)
        break Fail353;
      e_803 = f_801;
      a_803 = transformer_debug.const284;
      f_803 = e_803;
      b_803 = transformer_debug.const339;
      g_803 = f_803;
      c_803 = transformer_debug.const344;
      h_803 = g_803;
      term = s_var_0_4.instance.invoke(context, h_803, a_803, b_803, c_803, transformer_debug.constLocationInfo471);
      if(term == null)
        break Fail353;
      m_803 = g_801;
      i_803 = transformer_debug.const284;
      n_803 = m_803;
      j_803 = transformer_debug.const339;
      o_803 = n_803;
      k_803 = transformer_debug.const235;
      p_803 = o_803;
      term = s_var_0_4.instance.invoke(context, p_803, i_803, j_803, k_803, transformer_debug.constLocationInfo472);
      if(term == null)
        break Fail353;
      term = j_802;
      q_803 = j_802;
      IStrategoTerm term181 = term;
      Success171:
      { 
        Fail354:
        { 
          IStrategoTerm term182 = term;
          Success172:
          { 
            Fail355:
            { 
              IStrategoTerm r_803 = null;
              IStrategoTerm s_803 = null;
              IStrategoTerm u_803 = null;
              IStrategoTerm v_803 = null;
              IStrategoTerm w_803 = null;
              IStrategoTerm x_803 = null;
              IStrategoTerm z_803 = null;
              IStrategoTerm b_804 = null;
              IStrategoTerm c_804 = null;
              IStrategoTerm d_804 = null;
              IStrategoTerm e_804 = null;
              IStrategoTerm f_804 = null;
              IStrategoTerm g_804 = null;
              IStrategoTerm i_804 = null;
              IStrategoTerm j_804 = null;
              IStrategoTerm k_804 = null;
              IStrategoTerm l_804 = null;
              u_803 = term;
              r_803 = transformer_debug.const284;
              v_803 = u_803;
              s_803 = transformer_debug.const339;
              w_803 = v_803;
              term = s_step_0_3.instance.invoke(context, w_803, r_803, s_803, transformer_debug.constLocationInfo473);
              if(term == null)
                break Fail355;
              b_804 = h_801;
              x_803 = transformer_debug.const284;
              c_804 = b_804;
              z_803 = transformer_debug.const339;
              d_804 = c_804;
              term = s_step_0_3.instance.invoke(context, d_804, x_803, z_803, transformer_debug.constLocationInfo474);
              if(term == null)
                break Fail355;
              term = create_s_var_calls_for_$Term_0_2.instance.invoke(context, term, b_801, c_801);
              if(term == null)
                break Fail355;
              i_801 = term;
              i_804 = term;
              e_804 = transformer_debug.const284;
              j_804 = i_804;
              f_804 = transformer_debug.const339;
              k_804 = j_804;
              g_804 = transformer_debug.const346;
              l_804 = k_804;
              term = s_var_0_4.instance.invoke(context, l_804, e_804, f_804, g_804, transformer_debug.constLocationInfo475);
              if(term == null)
                break Fail355;
              if(true)
                break Success172;
            }
            term = term182;
            IStrategoTerm m_804 = null;
            IStrategoTerm n_804 = null;
            IStrategoTerm p_804 = null;
            IStrategoTerm q_804 = null;
            IStrategoTerm r_804 = null;
            IStrategoTerm s_804 = null;
            IStrategoTerm t_804 = null;
            IStrategoTerm v_804 = null;
            IStrategoTerm w_804 = null;
            IStrategoTerm x_804 = null;
            p_804 = term;
            m_804 = transformer_debug.const284;
            q_804 = p_804;
            n_804 = transformer_debug.const339;
            r_804 = q_804;
            term = s_step_0_3.instance.invoke(context, r_804, m_804, n_804, transformer_debug.constLocationInfo477);
            if(term == null)
              break Fail354;
            term = pp_stratego_ast_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail354;
            v_804 = term;
            s_804 = transformer_debug.const284;
            w_804 = v_804;
            t_804 = transformer_debug.const339;
            x_804 = w_804;
            term = s_step_0_3.instance.invoke(context, x_804, s_804, t_804, transformer_debug.constLocationInfo478);
            if(term == null)
              break Fail354;
            term = debug_1_0.instance.invoke(context, term, lifted130.instance);
            if(term == null)
              break Fail354;
          }
          if(true)
            break Success171;
        }
        term = term181;
        IStrategoTerm j_801 = null;
        IStrategoTerm k_801 = null;
        IStrategoTerm o_805 = null;
        j_801 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail353;
        k_801 = term;
        o_805 = j_801;
        term = report_with_failure_0_2.instance.invoke(context, o_805, transformer_debug.const350, k_801);
        if(term == null)
          break Fail353;
      }
      term = q_803;
      IStrategoTerm p_805 = null;
      IStrategoTerm q_805 = null;
      IStrategoTerm s_805 = null;
      IStrategoTerm u_805 = null;
      IStrategoTerm v_805 = null;
      if(i_801 == null)
        break Fail353;
      term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{e_801, i_801});
      s_805 = term;
      p_805 = transformer_debug.const284;
      u_805 = s_805;
      q_805 = transformer_debug.const339;
      v_805 = u_805;
      term = r_exit_0_3.instance.invoke(context, v_805, p_805, q_805, transformer_debug.constLocationInfo466);
      if(term == null)
        break Fail353;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}