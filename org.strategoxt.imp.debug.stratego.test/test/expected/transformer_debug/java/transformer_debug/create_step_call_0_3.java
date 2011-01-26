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

@SuppressWarnings("all") public class create_step_call_0_3 extends Strategy 
{ 
  public static create_step_call_0_3 instance = new create_step_call_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm d_975, IStrategoTerm e_975, IStrategoTerm f_975)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_step_call_0_3");
    Fail373:
    { 
      IStrategoTerm h_975 = null;
      IStrategoTerm i_975 = null;
      IStrategoTerm k_975 = null;
      IStrategoTerm l_975 = null;
      IStrategoTerm m_975 = null;
      k_975 = term;
      h_975 = transformer_debug.const370;
      l_975 = k_975;
      i_975 = transformer_debug.const509;
      m_975 = l_975;
      term = s_enter_0_3.instance.invoke(context, m_975, h_975, i_975, transformer_debug.constLocationInfo900);
      if(term == null)
        break Fail373;
      IStrategoTerm term261 = term;
      Success182:
      { 
        Fail374:
        { 
          IStrategoTerm g_975 = null;
          IStrategoTerm n_975 = null;
          IStrategoTerm o_975 = null;
          IStrategoTerm p_975 = null;
          IStrategoTerm r_975 = null;
          IStrategoTerm s_975 = null;
          IStrategoTerm t_975 = null;
          IStrategoTerm u_975 = null;
          IStrategoTerm v_975 = null;
          IStrategoTerm w_975 = null;
          IStrategoTerm x_975 = null;
          IStrategoTerm z_975 = null;
          IStrategoTerm a_976 = null;
          IStrategoTerm b_976 = null;
          IStrategoTerm c_976 = null;
          IStrategoTerm d_976 = null;
          IStrategoTerm e_976 = null;
          IStrategoTerm f_976 = null;
          IStrategoTerm h_976 = null;
          IStrategoTerm i_976 = null;
          IStrategoTerm j_976 = null;
          IStrategoTerm k_976 = null;
          IStrategoTerm l_976 = null;
          IStrategoTerm m_976 = null;
          IStrategoTerm o_976 = null;
          IStrategoTerm p_976 = null;
          IStrategoTerm q_976 = null;
          IStrategoTerm t_976 = null;
          IStrategoTerm u_976 = null;
          IStrategoTerm w_976 = null;
          IStrategoTerm x_976 = null;
          IStrategoTerm y_976 = null;
          g_975 = term;
          r_975 = d_975;
          n_975 = transformer_debug.const370;
          s_975 = r_975;
          o_975 = transformer_debug.const509;
          t_975 = s_975;
          p_975 = transformer_debug.const238;
          u_975 = t_975;
          term = s_var_0_4.instance.invoke(context, u_975, n_975, o_975, p_975, transformer_debug.constLocationInfo901);
          if(term == null)
            break Fail374;
          z_975 = e_975;
          v_975 = transformer_debug.const370;
          a_976 = z_975;
          w_975 = transformer_debug.const509;
          b_976 = a_976;
          x_975 = transformer_debug.const239;
          c_976 = b_976;
          term = s_var_0_4.instance.invoke(context, c_976, v_975, w_975, x_975, transformer_debug.constLocationInfo902);
          if(term == null)
            break Fail374;
          h_976 = f_975;
          d_976 = transformer_debug.const370;
          i_976 = h_976;
          e_976 = transformer_debug.const509;
          j_976 = i_976;
          f_976 = transformer_debug.const235;
          k_976 = j_976;
          term = s_var_0_4.instance.invoke(context, k_976, d_976, e_976, f_976, transformer_debug.constLocationInfo903);
          if(term == null)
            break Fail374;
          o_976 = g_975;
          l_976 = transformer_debug.const370;
          p_976 = o_976;
          m_976 = transformer_debug.const509;
          q_976 = p_976;
          term = s_step_0_3.instance.invoke(context, q_976, l_976, m_976, transformer_debug.constLocationInfo904);
          if(term == null)
            break Fail374;
          w_976 = f_975;
          t_976 = transformer_debug.const370;
          x_976 = w_976;
          u_976 = transformer_debug.const509;
          y_976 = x_976;
          term = s_step_0_3.instance.invoke(context, y_976, t_976, u_976, transformer_debug.constLocationInfo905);
          if(term == null)
            break Fail374;
          term = location_to_term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail374;
          term = termFactory.makeAppl(transformer_debug._consCallT_3, new IStrategoTerm[]{transformer_debug.constSVar1, transformer_debug.constNil1, (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{d_975})}), termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consNoAnnoList_1, new IStrategoTerm[]{termFactory.makeAppl(transformer_debug._consStr_1, new IStrategoTerm[]{e_975})}), termFactory.makeListCons(term, (IStrategoList)transformer_debug.constNil1)))});
          { 
            IStrategoTerm z_976 = null;
            IStrategoTerm a_977 = null;
            IStrategoTerm c_977 = null;
            IStrategoTerm d_977 = null;
            IStrategoTerm e_977 = null;
            c_977 = term;
            z_976 = transformer_debug.const370;
            d_977 = c_977;
            a_977 = transformer_debug.const509;
            e_977 = d_977;
            term = s_exit_0_3.instance.invoke(context, e_977, z_976, a_977, transformer_debug.constLocationInfo900);
            if(term == null)
              break Fail373;
            if(true)
              break Success182;
          }
        }
        term = term261;
        IStrategoTerm f_977 = null;
        IStrategoTerm g_977 = null;
        IStrategoTerm i_977 = null;
        IStrategoTerm j_977 = null;
        IStrategoTerm k_977 = null;
        i_977 = term;
        f_977 = transformer_debug.const370;
        j_977 = i_977;
        g_977 = transformer_debug.const509;
        k_977 = j_977;
        term = s_exit_0_3.instance.invoke(context, k_977, f_977, g_977, transformer_debug.constLocationInfo900);
        if(term == null)
          break Fail373;
        if(true)
          break Fail373;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}