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

@SuppressWarnings("all") public class try_s_var_for_t_args_0_3 extends Strategy 
{ 
  public static try_s_var_for_t_args_0_3 instance = new try_s_var_for_t_args_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm o_783, IStrategoTerm p_783, IStrategoTerm q_783)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("try_s_var_for_t_args_0_3");
    Fail345:
    { 
      IStrategoTerm r_783 = null;
      IStrategoTerm t_783 = null;
      IStrategoTerm u_783 = null;
      IStrategoTerm w_783 = null;
      IStrategoTerm x_783 = null;
      IStrategoTerm y_783 = null;
      w_783 = term;
      t_783 = transformer_debug.const284;
      x_783 = w_783;
      u_783 = transformer_debug.const314;
      y_783 = x_783;
      term = s_enter_0_3.instance.invoke(context, y_783, t_783, u_783, transformer_debug.constLocationInfo421);
      if(term == null)
        break Fail345;
      IStrategoTerm term174 = term;
      Success166:
      { 
        Fail346:
        { 
          IStrategoTerm s_783 = null;
          IStrategoTerm z_783 = null;
          IStrategoTerm a_784 = null;
          IStrategoTerm b_784 = null;
          IStrategoTerm d_784 = null;
          IStrategoTerm e_784 = null;
          IStrategoTerm f_784 = null;
          IStrategoTerm g_784 = null;
          IStrategoTerm h_784 = null;
          IStrategoTerm i_784 = null;
          IStrategoTerm j_784 = null;
          IStrategoTerm l_784 = null;
          IStrategoTerm m_784 = null;
          IStrategoTerm n_784 = null;
          IStrategoTerm o_784 = null;
          IStrategoTerm p_784 = null;
          IStrategoTerm q_784 = null;
          IStrategoTerm r_784 = null;
          IStrategoTerm t_784 = null;
          IStrategoTerm u_784 = null;
          IStrategoTerm v_784 = null;
          IStrategoTerm x_784 = null;
          s_783 = term;
          d_784 = o_783;
          z_783 = transformer_debug.const284;
          e_784 = d_784;
          a_784 = transformer_debug.const314;
          f_784 = e_784;
          b_784 = transformer_debug.const238;
          g_784 = f_784;
          term = s_var_0_4.instance.invoke(context, g_784, z_783, a_784, b_784, transformer_debug.constLocationInfo422);
          if(term == null)
            break Fail346;
          l_784 = p_783;
          h_784 = transformer_debug.const284;
          m_784 = l_784;
          i_784 = transformer_debug.const314;
          n_784 = m_784;
          j_784 = transformer_debug.const287;
          o_784 = n_784;
          term = s_var_0_4.instance.invoke(context, o_784, h_784, i_784, j_784, transformer_debug.constLocationInfo423);
          if(term == null)
            break Fail346;
          t_784 = q_783;
          p_784 = transformer_debug.const284;
          u_784 = t_784;
          q_784 = transformer_debug.const314;
          v_784 = u_784;
          r_784 = transformer_debug.const300;
          x_784 = v_784;
          term = s_var_0_4.instance.invoke(context, x_784, p_784, q_784, r_784, transformer_debug.constLocationInfo424);
          if(term == null)
            break Fail346;
          term = s_783;
          IStrategoTerm term175 = term;
          Success167:
          { 
            Fail347:
            { 
              IStrategoTerm y_784 = null;
              IStrategoTerm z_784 = null;
              IStrategoTerm b_785 = null;
              IStrategoTerm c_785 = null;
              IStrategoTerm d_785 = null;
              IStrategoTerm e_785 = null;
              IStrategoTerm g_785 = null;
              IStrategoTerm h_785 = null;
              IStrategoTerm j_785 = null;
              IStrategoTerm k_785 = null;
              IStrategoTerm l_785 = null;
              IStrategoTerm m_785 = null;
              IStrategoTerm n_785 = null;
              IStrategoTerm o_785 = null;
              IStrategoTerm q_785 = null;
              IStrategoTerm r_785 = null;
              IStrategoTerm s_785 = null;
              IStrategoTerm t_785 = null;
              b_785 = term;
              y_784 = transformer_debug.const284;
              c_785 = b_785;
              z_784 = transformer_debug.const314;
              d_785 = c_785;
              term = s_step_0_3.instance.invoke(context, d_785, y_784, z_784, transformer_debug.constLocationInfo425);
              if(term == null)
                break Fail347;
              j_785 = term;
              g_785 = transformer_debug.const284;
              k_785 = j_785;
              h_785 = transformer_debug.const314;
              l_785 = k_785;
              term = s_step_0_3.instance.invoke(context, l_785, g_785, h_785, transformer_debug.constLocationInfo426);
              if(term == null)
                break Fail347;
              term = t_args_to_s_var_where_clause_0_2.instance.invoke(context, term, o_783, p_783);
              if(term == null)
                break Fail347;
              e_785 = term;
              r_783 = term;
              q_785 = e_785;
              m_785 = transformer_debug.const284;
              r_785 = q_785;
              n_785 = transformer_debug.const314;
              s_785 = r_785;
              o_785 = transformer_debug.const318;
              t_785 = s_785;
              term = s_var_0_4.instance.invoke(context, t_785, m_785, n_785, o_785, transformer_debug.constLocationInfo427);
              if(term == null)
                break Fail347;
              { 
                IStrategoTerm u_785 = null;
                IStrategoTerm v_785 = null;
                IStrategoTerm x_785 = null;
                IStrategoTerm y_785 = null;
                IStrategoTerm z_785 = null;
                term = termFactory.makeTuple(transformer_debug.const281, r_783, q_783);
                x_785 = term;
                u_785 = transformer_debug.const284;
                y_785 = x_785;
                v_785 = transformer_debug.const314;
                z_785 = y_785;
                term = s_step_0_3.instance.invoke(context, z_785, u_785, v_785, transformer_debug.constLocationInfo428);
                if(term == null)
                  break Fail346;
                term = insert_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail346;
                if(true)
                  break Success167;
              }
            }
            term = term175;
            IStrategoTerm a_786 = null;
            IStrategoTerm b_786 = null;
            IStrategoTerm d_786 = null;
            IStrategoTerm f_786 = null;
            IStrategoTerm g_786 = null;
            d_786 = term;
            a_786 = transformer_debug.const284;
            f_786 = d_786;
            b_786 = transformer_debug.const314;
            g_786 = f_786;
            term = s_step_0_3.instance.invoke(context, g_786, a_786, b_786, transformer_debug.constLocationInfo429);
            if(term == null)
              break Fail346;
            term = q_783;
          }
          { 
            IStrategoTerm k_786 = null;
            IStrategoTerm l_786 = null;
            IStrategoTerm o_786 = null;
            IStrategoTerm p_786 = null;
            IStrategoTerm q_786 = null;
            o_786 = term;
            k_786 = transformer_debug.const284;
            p_786 = o_786;
            l_786 = transformer_debug.const314;
            q_786 = p_786;
            term = s_exit_0_3.instance.invoke(context, q_786, k_786, l_786, transformer_debug.constLocationInfo421);
            if(term == null)
              break Fail345;
            if(true)
              break Success166;
          }
        }
        term = term174;
        IStrategoTerm r_786 = null;
        IStrategoTerm s_786 = null;
        IStrategoTerm v_786 = null;
        IStrategoTerm w_786 = null;
        IStrategoTerm x_786 = null;
        v_786 = term;
        r_786 = transformer_debug.const284;
        w_786 = v_786;
        s_786 = transformer_debug.const314;
        x_786 = w_786;
        term = s_exit_0_3.instance.invoke(context, x_786, r_786, s_786, transformer_debug.constLocationInfo421);
        if(term == null)
          break Fail345;
        if(true)
          break Fail345;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}