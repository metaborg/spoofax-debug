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

@SuppressWarnings("all") final class add_var_to_rule_cond_0_2_fragment_0 extends Strategy 
{ 
  TermReference e_1145;

  TermReference f_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail575:
    { 
      IStrategoTerm term176 = term;
      Success296:
      { 
        Fail576:
        { 
          IStrategoTerm y_790 = null;
          IStrategoTerm z_790 = null;
          IStrategoTerm a_791 = null;
          IStrategoTerm b_791 = null;
          IStrategoTerm c_791 = null;
          IStrategoTerm e_791 = null;
          IStrategoTerm f_791 = null;
          IStrategoTerm g_791 = null;
          IStrategoTerm j_791 = null;
          IStrategoTerm k_791 = null;
          IStrategoTerm l_791 = null;
          IStrategoTerm n_791 = null;
          IStrategoTerm o_791 = null;
          IStrategoTerm p_791 = null;
          IStrategoTerm q_791 = null;
          IStrategoTerm r_791 = null;
          IStrategoTerm s_791 = null;
          IStrategoTerm u_791 = null;
          IStrategoTerm w_791 = null;
          IStrategoTerm x_791 = null;
          IStrategoTerm y_791 = null;
          IStrategoTerm z_791 = null;
          IStrategoTerm b_792 = null;
          IStrategoTerm c_792 = null;
          IStrategoTerm d_792 = null;
          IStrategoTerm f_792 = null;
          IStrategoTerm g_792 = null;
          IStrategoTerm h_792 = null;
          IStrategoTerm i_792 = null;
          IStrategoTerm k_792 = null;
          IStrategoTerm l_792 = null;
          IStrategoTerm n_792 = null;
          IStrategoTerm o_792 = null;
          IStrategoTerm p_792 = null;
          IStrategoTerm q_792 = null;
          IStrategoTerm r_792 = null;
          IStrategoTerm t_792 = null;
          IStrategoTerm u_792 = null;
          IStrategoTerm v_792 = null;
          IStrategoTerm w_792 = null;
          IStrategoTerm y_792 = null;
          IStrategoTerm z_792 = null;
          IStrategoTerm b_793 = null;
          IStrategoTerm c_793 = null;
          IStrategoTerm d_793 = null;
          IStrategoTerm k_793 = null;
          IStrategoTerm l_793 = null;
          IStrategoTerm m_793 = null;
          IStrategoTerm o_793 = null;
          IStrategoTerm p_793 = null;
          IStrategoTerm r_793 = null;
          IStrategoTerm s_793 = null;
          y_790 = term;
          a_791 = term;
          e_791 = term;
          b_791 = transformer_debug.const284;
          f_791 = e_791;
          c_791 = transformer_debug.const320;
          g_791 = f_791;
          term = r_enter_0_3.instance.invoke(context, g_791, b_791, c_791, transformer_debug.constLocationInfo430);
          if(term == null)
            break Fail576;
          term = a_791;
          if(e_1145.value == null)
            break Fail576;
          n_791 = e_1145.value;
          j_791 = transformer_debug.const284;
          o_791 = n_791;
          k_791 = transformer_debug.const320;
          p_791 = o_791;
          l_791 = transformer_debug.const238;
          q_791 = p_791;
          term = s_var_0_4.instance.invoke(context, q_791, j_791, k_791, l_791, transformer_debug.constLocationInfo431);
          if(term == null)
            break Fail576;
          if(f_1145.value == null)
            break Fail576;
          w_791 = f_1145.value;
          r_791 = transformer_debug.const284;
          x_791 = w_791;
          s_791 = transformer_debug.const320;
          y_791 = x_791;
          u_791 = transformer_debug.const287;
          z_791 = y_791;
          term = s_var_0_4.instance.invoke(context, z_791, r_791, s_791, u_791, transformer_debug.constLocationInfo432);
          if(term == null)
            break Fail576;
          f_792 = y_790;
          b_792 = transformer_debug.const284;
          g_792 = f_792;
          c_792 = transformer_debug.const320;
          h_792 = g_792;
          d_792 = transformer_debug.const323;
          i_792 = h_792;
          term = s_var_0_4.instance.invoke(context, i_792, b_792, c_792, d_792, transformer_debug.constLocationInfo433);
          if(term == null)
            break Fail576;
          n_792 = y_790;
          k_792 = transformer_debug.const284;
          o_792 = n_792;
          l_792 = transformer_debug.const320;
          p_792 = o_792;
          term = s_step_0_3.instance.invoke(context, p_792, k_792, l_792, transformer_debug.constLocationInfo434);
          if(term == null)
            break Fail576;
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail576;
          t_792 = term;
          q_792 = transformer_debug.const284;
          u_792 = t_792;
          r_792 = transformer_debug.const320;
          v_792 = u_792;
          term = s_step_0_3.instance.invoke(context, v_792, q_792, r_792, transformer_debug.constLocationInfo435);
          if(term == null)
            break Fail576;
          b_793 = term;
          y_792 = transformer_debug.const284;
          c_793 = b_793;
          z_792 = transformer_debug.const320;
          d_793 = c_793;
          term = s_step_0_3.instance.invoke(context, d_793, y_792, z_792, transformer_debug.constLocationInfo436);
          if(term == null)
            break Fail576;
          lifted129 lifted1290 = new lifted129();
          lifted1290.e_1145 = e_1145;
          lifted1290.f_1145 = f_1145;
          term = map_1_0.instance.invoke(context, term, lifted1290);
          if(term == null)
            break Fail576;
          w_792 = term;
          z_790 = term;
          o_793 = w_792;
          k_793 = transformer_debug.const284;
          p_793 = o_793;
          l_793 = transformer_debug.const320;
          r_793 = p_793;
          m_793 = transformer_debug.const326;
          s_793 = r_793;
          term = s_var_0_4.instance.invoke(context, s_793, k_793, l_793, m_793, transformer_debug.constLocationInfo438);
          if(term == null)
            break Fail576;
          IStrategoTerm t_793 = null;
          IStrategoTerm u_793 = null;
          IStrategoTerm w_793 = null;
          IStrategoTerm x_793 = null;
          IStrategoTerm y_793 = null;
          w_793 = z_790;
          t_793 = transformer_debug.const284;
          x_793 = w_793;
          u_793 = transformer_debug.const320;
          y_793 = x_793;
          term = r_exit_0_3.instance.invoke(context, y_793, t_793, u_793, transformer_debug.constLocationInfo430);
          if(term == null)
            break Fail576;
          if(true)
            break Success296;
        }
        term = term176;
        IStrategoTerm a_787 = null;
        IStrategoTerm b_787 = null;
        IStrategoTerm d_787 = null;
        IStrategoTerm e_787 = null;
        IStrategoTerm f_787 = null;
        IStrategoTerm g_787 = null;
        IStrategoTerm i_787 = null;
        IStrategoTerm j_787 = null;
        IStrategoTerm k_787 = null;
        IStrategoTerm l_787 = null;
        IStrategoTerm m_787 = null;
        IStrategoTerm n_787 = null;
        IStrategoTerm p_787 = null;
        IStrategoTerm r_787 = null;
        IStrategoTerm s_787 = null;
        IStrategoTerm t_787 = null;
        IStrategoTerm u_787 = null;
        IStrategoTerm v_787 = null;
        IStrategoTerm w_787 = null;
        IStrategoTerm x_787 = null;
        IStrategoTerm z_787 = null;
        IStrategoTerm a_788 = null;
        IStrategoTerm b_788 = null;
        IStrategoTerm c_788 = null;
        IStrategoTerm d_788 = null;
        IStrategoTerm e_788 = null;
        IStrategoTerm f_788 = null;
        IStrategoTerm g_788 = null;
        IStrategoTerm i_788 = null;
        IStrategoTerm j_788 = null;
        IStrategoTerm k_788 = null;
        IStrategoTerm l_788 = null;
        IStrategoTerm m_788 = null;
        IStrategoTerm n_788 = null;
        IStrategoTerm o_788 = null;
        IStrategoTerm q_788 = null;
        IStrategoTerm r_788 = null;
        IStrategoTerm s_788 = null;
        IStrategoTerm a_789 = null;
        IStrategoTerm b_789 = null;
        IStrategoTerm d_789 = null;
        IStrategoTerm e_789 = null;
        IStrategoTerm f_789 = null;
        IStrategoTerm g_789 = null;
        IStrategoTerm i_789 = null;
        IStrategoTerm j_789 = null;
        IStrategoTerm l_789 = null;
        IStrategoTerm m_789 = null;
        IStrategoTerm n_789 = null;
        IStrategoTerm p_789 = null;
        IStrategoTerm q_789 = null;
        IStrategoTerm r_789 = null;
        IStrategoTerm t_789 = null;
        IStrategoTerm u_789 = null;
        IStrategoTerm v_789 = null;
        IStrategoTerm w_789 = null;
        IStrategoTerm x_789 = null;
        IStrategoTerm y_789 = null;
        IStrategoTerm a_790 = null;
        IStrategoTerm b_790 = null;
        IStrategoTerm c_790 = null;
        IStrategoTerm d_790 = null;
        IStrategoTerm e_790 = null;
        IStrategoTerm f_790 = null;
        IStrategoTerm h_790 = null;
        IStrategoTerm j_790 = null;
        IStrategoTerm k_790 = null;
        IStrategoTerm n_790 = null;
        a_787 = term;
        e_787 = term;
        i_787 = term;
        f_787 = transformer_debug.const284;
        j_787 = i_787;
        g_787 = transformer_debug.const320;
        k_787 = j_787;
        term = r_enter_0_3.instance.invoke(context, k_787, f_787, g_787, transformer_debug.constLocationInfo439);
        if(term == null)
          break Fail575;
        term = e_787;
        l_787 = e_787;
        if(e_1145.value == null)
          break Fail575;
        r_787 = e_1145.value;
        m_787 = transformer_debug.const284;
        s_787 = r_787;
        n_787 = transformer_debug.const320;
        t_787 = s_787;
        p_787 = transformer_debug.const238;
        u_787 = t_787;
        term = s_var_0_4.instance.invoke(context, u_787, m_787, n_787, p_787, transformer_debug.constLocationInfo440);
        if(term == null)
          break Fail575;
        if(f_1145.value == null)
          break Fail575;
        z_787 = f_1145.value;
        v_787 = transformer_debug.const284;
        a_788 = z_787;
        w_787 = transformer_debug.const320;
        b_788 = a_788;
        x_787 = transformer_debug.const287;
        c_788 = b_788;
        term = s_var_0_4.instance.invoke(context, c_788, v_787, w_787, x_787, transformer_debug.constLocationInfo441);
        if(term == null)
          break Fail575;
        d_788 = l_787;
        i_788 = a_787;
        e_788 = transformer_debug.const284;
        j_788 = i_788;
        f_788 = transformer_debug.const320;
        k_788 = j_788;
        g_788 = transformer_debug.const277;
        l_788 = k_788;
        term = s_var_0_4.instance.invoke(context, l_788, e_788, f_788, g_788, transformer_debug.constLocationInfo442);
        if(term == null)
          break Fail575;
        term = d_788;
        m_788 = d_788;
        q_788 = term;
        n_788 = transformer_debug.const284;
        r_788 = q_788;
        o_788 = transformer_debug.const320;
        s_788 = r_788;
        term = s_step_0_3.instance.invoke(context, s_788, n_788, o_788, transformer_debug.constLocationInfo443);
        if(term == null)
          break Fail575;
        IStrategoTerm term177 = term;
        Success297:
        { 
          Fail577:
          { 
            IStrategoTerm t_788 = null;
            IStrategoTerm u_788 = null;
            IStrategoTerm w_788 = null;
            IStrategoTerm x_788 = null;
            IStrategoTerm y_788 = null;
            w_788 = a_787;
            t_788 = transformer_debug.const284;
            x_788 = w_788;
            u_788 = transformer_debug.const320;
            y_788 = x_788;
            term = s_step_0_3.instance.invoke(context, y_788, t_788, u_788, transformer_debug.constLocationInfo444);
            if(term == null)
              break Fail577;
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail577;
            { 
              if(true)
                break Fail575;
              if(true)
                break Success297;
            }
          }
          term = term177;
        }
        term = m_788;
        d_789 = term;
        a_789 = transformer_debug.const284;
        e_789 = d_789;
        b_789 = transformer_debug.const320;
        f_789 = e_789;
        term = s_step_0_3.instance.invoke(context, f_789, a_789, b_789, transformer_debug.constLocationInfo445);
        if(term == null)
          break Fail575;
        l_789 = term;
        i_789 = transformer_debug.const284;
        m_789 = l_789;
        j_789 = transformer_debug.const320;
        n_789 = m_789;
        term = s_step_0_3.instance.invoke(context, n_789, i_789, j_789, transformer_debug.constLocationInfo446);
        if(term == null)
          break Fail575;
        term = var_wrap_s_0_2.instance.invoke(context, term, e_1145.value, f_1145.value);
        if(term == null)
          break Fail575;
        g_789 = term;
        b_787 = term;
        t_789 = g_789;
        p_789 = transformer_debug.const284;
        u_789 = t_789;
        q_789 = transformer_debug.const320;
        v_789 = u_789;
        r_789 = transformer_debug.const294;
        w_789 = v_789;
        term = s_var_0_4.instance.invoke(context, w_789, p_789, q_789, r_789, transformer_debug.constLocationInfo447);
        if(term == null)
          break Fail575;
        a_790 = term;
        x_789 = transformer_debug.const284;
        b_790 = a_790;
        y_789 = transformer_debug.const320;
        c_790 = b_790;
        term = s_step_0_3.instance.invoke(context, c_790, x_789, y_789, transformer_debug.constLocationInfo448);
        if(term == null)
          break Fail575;
        term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consWhereClause_1, new IStrategoTerm[]{b_787}), (IStrategoList)transformer_debug.constNil1);
        d_787 = term;
        h_790 = term;
        d_790 = transformer_debug.const284;
        j_790 = h_790;
        e_790 = transformer_debug.const320;
        k_790 = j_790;
        f_790 = transformer_debug.const323;
        n_790 = k_790;
        term = s_var_0_4.instance.invoke(context, n_790, d_790, e_790, f_790, transformer_debug.constLocationInfo449);
        if(term == null)
          break Fail575;
        IStrategoTerm o_790 = null;
        IStrategoTerm q_790 = null;
        IStrategoTerm s_790 = null;
        IStrategoTerm t_790 = null;
        IStrategoTerm u_790 = null;
        s_790 = d_787;
        o_790 = transformer_debug.const284;
        t_790 = s_790;
        q_790 = transformer_debug.const320;
        u_790 = t_790;
        term = r_exit_0_3.instance.invoke(context, u_790, o_790, q_790, transformer_debug.constLocationInfo439);
        if(term == null)
          break Fail575;
      }
      if(true)
        return term;
    }
    return null;
  }
}