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

@SuppressWarnings("all") public class try_s_var_for_match_0_3 extends Strategy 
{ 
  public static try_s_var_for_match_0_3 instance = new try_s_var_for_match_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_780, IStrategoTerm e_780, IStrategoTerm f_780)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("try_s_var_for_match_0_3");
    Fail342:
    { 
      IStrategoTerm g_780 = null;
      IStrategoTerm i_780 = null;
      IStrategoTerm j_780 = null;
      IStrategoTerm l_780 = null;
      IStrategoTerm m_780 = null;
      IStrategoTerm n_780 = null;
      l_780 = term;
      i_780 = transformer_debug.const284;
      m_780 = l_780;
      j_780 = transformer_debug.const308;
      n_780 = m_780;
      term = s_enter_0_3.instance.invoke(context, n_780, i_780, j_780, transformer_debug.constLocationInfo412);
      if(term == null)
        break Fail342;
      IStrategoTerm term172 = term;
      Success164:
      { 
        Fail343:
        { 
          IStrategoTerm h_780 = null;
          IStrategoTerm o_780 = null;
          IStrategoTerm p_780 = null;
          IStrategoTerm q_780 = null;
          IStrategoTerm s_780 = null;
          IStrategoTerm t_780 = null;
          IStrategoTerm u_780 = null;
          IStrategoTerm v_780 = null;
          IStrategoTerm w_780 = null;
          IStrategoTerm x_780 = null;
          IStrategoTerm y_780 = null;
          IStrategoTerm a_781 = null;
          IStrategoTerm c_781 = null;
          IStrategoTerm d_781 = null;
          IStrategoTerm h_781 = null;
          IStrategoTerm i_781 = null;
          IStrategoTerm k_781 = null;
          IStrategoTerm l_781 = null;
          IStrategoTerm n_781 = null;
          IStrategoTerm o_781 = null;
          IStrategoTerm p_781 = null;
          IStrategoTerm r_781 = null;
          h_780 = term;
          s_780 = d_780;
          o_780 = transformer_debug.const284;
          t_780 = s_780;
          p_780 = transformer_debug.const308;
          u_780 = t_780;
          q_780 = transformer_debug.const238;
          v_780 = u_780;
          term = s_var_0_4.instance.invoke(context, v_780, o_780, p_780, q_780, transformer_debug.constLocationInfo413);
          if(term == null)
            break Fail343;
          a_781 = e_780;
          w_780 = transformer_debug.const284;
          c_781 = a_781;
          x_780 = transformer_debug.const308;
          d_781 = c_781;
          y_780 = transformer_debug.const287;
          h_781 = d_781;
          term = s_var_0_4.instance.invoke(context, h_781, w_780, x_780, y_780, transformer_debug.constLocationInfo414);
          if(term == null)
            break Fail343;
          n_781 = f_780;
          i_781 = transformer_debug.const284;
          o_781 = n_781;
          k_781 = transformer_debug.const308;
          p_781 = o_781;
          l_781 = transformer_debug.const300;
          r_781 = p_781;
          term = s_var_0_4.instance.invoke(context, r_781, i_781, k_781, l_781, transformer_debug.constLocationInfo415);
          if(term == null)
            break Fail343;
          term = h_780;
          IStrategoTerm term173 = term;
          Success165:
          { 
            Fail344:
            { 
              IStrategoTerm s_781 = null;
              IStrategoTerm t_781 = null;
              IStrategoTerm v_781 = null;
              IStrategoTerm w_781 = null;
              IStrategoTerm x_781 = null;
              IStrategoTerm y_781 = null;
              IStrategoTerm a_782 = null;
              IStrategoTerm c_782 = null;
              IStrategoTerm e_782 = null;
              IStrategoTerm f_782 = null;
              IStrategoTerm g_782 = null;
              IStrategoTerm h_782 = null;
              IStrategoTerm i_782 = null;
              IStrategoTerm j_782 = null;
              IStrategoTerm l_782 = null;
              IStrategoTerm m_782 = null;
              IStrategoTerm n_782 = null;
              IStrategoTerm o_782 = null;
              v_781 = term;
              s_781 = transformer_debug.const284;
              w_781 = v_781;
              t_781 = transformer_debug.const308;
              x_781 = w_781;
              term = s_step_0_3.instance.invoke(context, x_781, s_781, t_781, transformer_debug.constLocationInfo416);
              if(term == null)
                break Fail344;
              e_782 = term;
              a_782 = transformer_debug.const284;
              f_782 = e_782;
              c_782 = transformer_debug.const308;
              g_782 = f_782;
              term = s_step_0_3.instance.invoke(context, g_782, a_782, c_782, transformer_debug.constLocationInfo417);
              if(term == null)
                break Fail344;
              term = match_term_to_s_var_clause_0_2.instance.invoke(context, term, d_780, e_780);
              if(term == null)
                break Fail344;
              y_781 = term;
              g_780 = term;
              l_782 = y_781;
              h_782 = transformer_debug.const284;
              m_782 = l_782;
              i_782 = transformer_debug.const308;
              n_782 = m_782;
              j_782 = transformer_debug.const312;
              o_782 = n_782;
              term = s_var_0_4.instance.invoke(context, o_782, h_782, i_782, j_782, transformer_debug.constLocationInfo418);
              if(term == null)
                break Fail344;
              { 
                IStrategoTerm q_782 = null;
                IStrategoTerm r_782 = null;
                IStrategoTerm t_782 = null;
                IStrategoTerm u_782 = null;
                IStrategoTerm v_782 = null;
                term = termFactory.makeTuple(transformer_debug.const281, g_780, f_780);
                t_782 = term;
                q_782 = transformer_debug.const284;
                u_782 = t_782;
                r_782 = transformer_debug.const308;
                v_782 = u_782;
                term = s_step_0_3.instance.invoke(context, v_782, q_782, r_782, transformer_debug.constLocationInfo419);
                if(term == null)
                  break Fail343;
                term = insert_0_0.instance.invoke(context, term);
                if(term == null)
                  break Fail343;
                if(true)
                  break Success165;
              }
            }
            term = term173;
            IStrategoTerm w_782 = null;
            IStrategoTerm x_782 = null;
            IStrategoTerm z_782 = null;
            IStrategoTerm a_783 = null;
            IStrategoTerm b_783 = null;
            z_782 = term;
            w_782 = transformer_debug.const284;
            a_783 = z_782;
            x_782 = transformer_debug.const308;
            b_783 = a_783;
            term = s_step_0_3.instance.invoke(context, b_783, w_782, x_782, transformer_debug.constLocationInfo420);
            if(term == null)
              break Fail343;
            term = f_780;
          }
          { 
            IStrategoTerm c_783 = null;
            IStrategoTerm d_783 = null;
            IStrategoTerm f_783 = null;
            IStrategoTerm g_783 = null;
            IStrategoTerm h_783 = null;
            f_783 = term;
            c_783 = transformer_debug.const284;
            g_783 = f_783;
            d_783 = transformer_debug.const308;
            h_783 = g_783;
            term = s_exit_0_3.instance.invoke(context, h_783, c_783, d_783, transformer_debug.constLocationInfo412);
            if(term == null)
              break Fail342;
            if(true)
              break Success164;
          }
        }
        term = term172;
        IStrategoTerm i_783 = null;
        IStrategoTerm j_783 = null;
        IStrategoTerm l_783 = null;
        IStrategoTerm m_783 = null;
        IStrategoTerm n_783 = null;
        l_783 = term;
        i_783 = transformer_debug.const284;
        m_783 = l_783;
        j_783 = transformer_debug.const308;
        n_783 = m_783;
        term = s_exit_0_3.instance.invoke(context, n_783, i_783, j_783, transformer_debug.constLocationInfo412);
        if(term == null)
          break Fail342;
        if(true)
          break Fail342;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}