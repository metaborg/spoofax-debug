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

@SuppressWarnings("all") public class t_args_to_s_var_where_clause_0_2 extends Strategy 
{ 
  public static t_args_to_s_var_where_clause_0_2 instance = new t_args_to_s_var_where_clause_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_703, IStrategoTerm ref_a_704)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_703 = new TermReference(ref_z_703);
    TermReference a_704 = new TermReference(ref_a_704);
    context.push("t_args_to_s_var_where_clause_0_2");
    Fail314:
    { 
      IStrategoTerm b_704 = null;
      IStrategoTerm c_704 = null;
      IStrategoTerm d_704 = null;
      IStrategoTerm e_704 = null;
      IStrategoTerm f_704 = null;
      IStrategoTerm g_704 = null;
      IStrategoTerm h_704 = null;
      IStrategoTerm j_704 = null;
      IStrategoTerm k_704 = null;
      IStrategoTerm l_704 = null;
      IStrategoTerm m_704 = null;
      IStrategoTerm n_704 = null;
      IStrategoTerm o_704 = null;
      IStrategoTerm p_704 = null;
      IStrategoTerm r_704 = null;
      IStrategoTerm s_704 = null;
      IStrategoTerm t_704 = null;
      IStrategoTerm u_704 = null;
      IStrategoTerm v_704 = null;
      IStrategoTerm w_704 = null;
      IStrategoTerm x_704 = null;
      IStrategoTerm z_704 = null;
      IStrategoTerm a_705 = null;
      IStrategoTerm b_705 = null;
      IStrategoTerm c_705 = null;
      IStrategoTerm d_705 = null;
      IStrategoTerm e_705 = null;
      IStrategoTerm f_705 = null;
      IStrategoTerm g_705 = null;
      IStrategoTerm i_705 = null;
      IStrategoTerm j_705 = null;
      IStrategoTerm k_705 = null;
      IStrategoTerm l_705 = null;
      IStrategoTerm n_705 = null;
      IStrategoTerm o_705 = null;
      IStrategoTerm q_705 = null;
      IStrategoTerm r_705 = null;
      IStrategoTerm s_705 = null;
      IStrategoTerm t_705 = null;
      IStrategoTerm u_705 = null;
      IStrategoTerm w_705 = null;
      IStrategoTerm x_705 = null;
      IStrategoTerm y_705 = null;
      IStrategoTerm f_706 = null;
      IStrategoTerm g_706 = null;
      IStrategoTerm h_706 = null;
      IStrategoTerm j_706 = null;
      IStrategoTerm k_706 = null;
      IStrategoTerm l_706 = null;
      IStrategoTerm m_706 = null;
      IStrategoTerm n_706 = null;
      IStrategoTerm o_706 = null;
      IStrategoTerm q_706 = null;
      IStrategoTerm r_706 = null;
      IStrategoTerm s_706 = null;
      IStrategoTerm z_706 = null;
      IStrategoTerm a_707 = null;
      IStrategoTerm c_707 = null;
      IStrategoTerm d_707 = null;
      IStrategoTerm e_707 = null;
      IStrategoTerm f_707 = null;
      IStrategoTerm g_707 = null;
      IStrategoTerm i_707 = null;
      IStrategoTerm j_707 = null;
      IStrategoTerm k_707 = null;
      IStrategoTerm l_707 = null;
      IStrategoTerm m_707 = null;
      IStrategoTerm n_707 = null;
      IStrategoTerm p_707 = null;
      IStrategoTerm q_707 = null;
      IStrategoTerm r_707 = null;
      IStrategoTerm s_707 = null;
      IStrategoTerm t_707 = null;
      IStrategoTerm u_707 = null;
      IStrategoTerm w_707 = null;
      IStrategoTerm x_707 = null;
      IStrategoTerm y_707 = null;
      IStrategoTerm z_707 = null;
      IStrategoTerm a_708 = null;
      IStrategoTerm b_708 = null;
      IStrategoTerm d_708 = null;
      IStrategoTerm e_708 = null;
      IStrategoTerm f_708 = null;
      IStrategoTerm g_708 = null;
      b_704 = term;
      f_704 = term;
      j_704 = term;
      g_704 = transformer_debug.const236;
      k_704 = j_704;
      h_704 = transformer_debug.const247;
      l_704 = k_704;
      term = r_enter_0_3.instance.invoke(context, l_704, g_704, h_704, transformer_debug.constLocationInfo200);
      if(term == null)
        break Fail314;
      term = f_704;
      m_704 = f_704;
      if(z_703.value == null)
        break Fail314;
      r_704 = z_703.value;
      n_704 = transformer_debug.const236;
      s_704 = r_704;
      o_704 = transformer_debug.const247;
      t_704 = s_704;
      p_704 = transformer_debug.const238;
      u_704 = t_704;
      term = s_var_0_4.instance.invoke(context, u_704, n_704, o_704, p_704, transformer_debug.constLocationInfo201);
      if(term == null)
        break Fail314;
      if(a_704.value == null)
        break Fail314;
      z_704 = a_704.value;
      v_704 = transformer_debug.const236;
      a_705 = z_704;
      w_704 = transformer_debug.const247;
      b_705 = a_705;
      x_704 = transformer_debug.const239;
      c_705 = b_705;
      term = s_var_0_4.instance.invoke(context, c_705, v_704, w_704, x_704, transformer_debug.constLocationInfo202);
      if(term == null)
        break Fail314;
      d_705 = m_704;
      i_705 = b_704;
      e_705 = transformer_debug.const236;
      j_705 = i_705;
      f_705 = transformer_debug.const247;
      k_705 = j_705;
      g_705 = transformer_debug.const248;
      l_705 = k_705;
      term = s_var_0_4.instance.invoke(context, l_705, e_705, f_705, g_705, transformer_debug.constLocationInfo203);
      if(term == null)
        break Fail314;
      term = d_705;
      q_705 = term;
      n_705 = transformer_debug.const236;
      r_705 = q_705;
      o_705 = transformer_debug.const247;
      s_705 = r_705;
      term = s_step_0_3.instance.invoke(context, s_705, n_705, o_705, transformer_debug.constLocationInfo204);
      if(term == null)
        break Fail314;
      w_705 = b_704;
      t_705 = transformer_debug.const236;
      x_705 = w_705;
      u_705 = transformer_debug.const247;
      y_705 = x_705;
      term = s_step_0_3.instance.invoke(context, y_705, t_705, u_705, transformer_debug.constLocationInfo205);
      if(term == null)
        break Fail314;
      lifted119 lifted1190 = new lifted119();
      lifted1190.z_703 = z_703;
      lifted1190.a_704 = a_704;
      term = map_1_0.instance.invoke(context, term, lifted1190);
      if(term == null)
        break Fail314;
      c_704 = term;
      j_706 = term;
      f_706 = transformer_debug.const236;
      k_706 = j_706;
      g_706 = transformer_debug.const247;
      l_706 = k_706;
      h_706 = transformer_debug.const246;
      m_706 = l_706;
      term = s_var_0_4.instance.invoke(context, m_706, f_706, g_706, h_706, transformer_debug.constLocationInfo207);
      if(term == null)
        break Fail314;
      q_706 = term;
      n_706 = transformer_debug.const236;
      r_706 = q_706;
      o_706 = transformer_debug.const247;
      s_706 = r_706;
      term = s_step_0_3.instance.invoke(context, s_706, n_706, o_706, transformer_debug.constLocationInfo208);
      if(term == null)
        break Fail314;
      IStrategoTerm term156 = term;
      Success150:
      { 
        Fail315:
        { 
          IStrategoTerm t_706 = null;
          IStrategoTerm u_706 = null;
          IStrategoTerm w_706 = null;
          IStrategoTerm x_706 = null;
          IStrategoTerm y_706 = null;
          w_706 = term;
          t_706 = transformer_debug.const236;
          x_706 = w_706;
          u_706 = transformer_debug.const247;
          y_706 = x_706;
          term = s_step_0_3.instance.invoke(context, y_706, t_706, u_706, transformer_debug.constLocationInfo209);
          if(term == null)
            break Fail315;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail315;
          { 
            if(true)
              break Fail314;
            if(true)
              break Success150;
          }
        }
        term = term156;
      }
      c_707 = term;
      z_706 = transformer_debug.const236;
      d_707 = c_707;
      a_707 = transformer_debug.const247;
      e_707 = d_707;
      term = s_step_0_3.instance.invoke(context, e_707, z_706, a_707, transformer_debug.constLocationInfo210);
      if(term == null)
        break Fail314;
      i_707 = c_704;
      f_707 = transformer_debug.const236;
      j_707 = i_707;
      g_707 = transformer_debug.const247;
      k_707 = j_707;
      term = s_step_0_3.instance.invoke(context, k_707, f_707, g_707, transformer_debug.constLocationInfo211);
      if(term == null)
        break Fail314;
      term = create_seqs_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail314;
      d_704 = term;
      p_707 = term;
      l_707 = transformer_debug.const236;
      q_707 = p_707;
      m_707 = transformer_debug.const247;
      r_707 = q_707;
      n_707 = transformer_debug.const241;
      s_707 = r_707;
      term = s_var_0_4.instance.invoke(context, s_707, l_707, m_707, n_707, transformer_debug.constLocationInfo212);
      if(term == null)
        break Fail314;
      w_707 = term;
      t_707 = transformer_debug.const236;
      x_707 = w_707;
      u_707 = transformer_debug.const247;
      y_707 = x_707;
      term = s_step_0_3.instance.invoke(context, y_707, t_707, u_707, transformer_debug.constLocationInfo213);
      if(term == null)
        break Fail314;
      term = termFactory.makeAppl(transformer_debug._consWhereClause_1, new IStrategoTerm[]{d_704});
      e_704 = term;
      d_708 = term;
      z_707 = transformer_debug.const236;
      e_708 = d_708;
      a_708 = transformer_debug.const247;
      f_708 = e_708;
      b_708 = transformer_debug.const242;
      g_708 = f_708;
      term = s_var_0_4.instance.invoke(context, g_708, z_707, a_708, b_708, transformer_debug.constLocationInfo214);
      if(term == null)
        break Fail314;
      IStrategoTerm h_708 = null;
      IStrategoTerm i_708 = null;
      IStrategoTerm k_708 = null;
      IStrategoTerm l_708 = null;
      IStrategoTerm m_708 = null;
      k_708 = e_704;
      h_708 = transformer_debug.const236;
      l_708 = k_708;
      i_708 = transformer_debug.const247;
      m_708 = l_708;
      term = r_exit_0_3.instance.invoke(context, m_708, h_708, i_708, transformer_debug.constLocationInfo200);
      if(term == null)
        break Fail314;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}