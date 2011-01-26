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

@SuppressWarnings("all") public class get_var_name_0_0 extends Strategy 
{ 
  public static get_var_name_0_0 instance = new get_var_name_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_var_name_0_0");
    Fail360:
    { 
      IStrategoTerm term185 = term;
      IStrategoConstructor cons16 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success175:
      { 
        if(cons16 == transformer_debug._consVar_1)
        { 
          Fail361:
          { 
            IStrategoTerm l_814 = null;
            IStrategoTerm n_814 = null;
            IStrategoTerm o_814 = null;
            IStrategoTerm p_814 = null;
            IStrategoTerm r_814 = null;
            IStrategoTerm s_814 = null;
            IStrategoTerm t_814 = null;
            IStrategoTerm u_814 = null;
            IStrategoTerm v_814 = null;
            IStrategoTerm w_814 = null;
            IStrategoTerm x_814 = null;
            IStrategoTerm z_814 = null;
            IStrategoTerm c_815 = null;
            IStrategoTerm d_815 = null;
            IStrategoTerm e_815 = null;
            IStrategoTerm h_815 = null;
            IStrategoTerm l_815 = null;
            IStrategoTerm o_815 = null;
            IStrategoTerm p_815 = null;
            IStrategoTerm q_815 = null;
            IStrategoTerm y_815 = null;
            IStrategoTerm z_815 = null;
            IStrategoTerm b_816 = null;
            IStrategoTerm c_816 = null;
            IStrategoTerm d_816 = null;
            l_814 = term.getSubterm(0);
            n_814 = term;
            r_814 = term;
            o_814 = transformer_debug.const284;
            s_814 = r_814;
            p_814 = transformer_debug.const360;
            t_814 = s_814;
            term = r_enter_0_3.instance.invoke(context, t_814, o_814, p_814, transformer_debug.constLocationInfo499);
            if(term == null)
              break Fail361;
            u_814 = n_814;
            z_814 = l_814;
            v_814 = transformer_debug.const284;
            c_815 = z_814;
            w_814 = transformer_debug.const360;
            d_815 = c_815;
            x_814 = transformer_debug.const239;
            e_815 = d_815;
            term = s_var_0_4.instance.invoke(context, e_815, v_814, w_814, x_814, transformer_debug.constLocationInfo500);
            if(term == null)
              break Fail361;
            term = u_814;
            o_815 = term;
            h_815 = transformer_debug.const284;
            p_815 = o_815;
            l_815 = transformer_debug.const360;
            q_815 = p_815;
            term = s_step_0_3.instance.invoke(context, q_815, h_815, l_815, transformer_debug.constLocationInfo501);
            if(term == null)
              break Fail361;
            IStrategoTerm term186 = term;
            Success176:
            { 
              Fail362:
              { 
                IStrategoTerm r_815 = null;
                IStrategoTerm s_815 = null;
                IStrategoTerm v_815 = null;
                IStrategoTerm w_815 = null;
                IStrategoTerm x_815 = null;
                v_815 = term;
                r_815 = transformer_debug.const284;
                w_815 = v_815;
                s_815 = transformer_debug.const360;
                x_815 = w_815;
                term = s_step_0_3.instance.invoke(context, x_815, r_815, s_815, transformer_debug.constLocationInfo502);
                if(term == null)
                  break Fail362;
                if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consVar_1 != ((IStrategoAppl)term).getConstructor())
                  break Fail362;
                IStrategoTerm arg124 = term.getSubterm(0);
                if(arg124.getTermType() != IStrategoTerm.APPL || transformer_debug._consListVar_1 != ((IStrategoAppl)arg124).getConstructor())
                  break Fail362;
                { 
                  if(true)
                    break Fail361;
                  if(true)
                    break Success176;
                }
              }
              term = term186;
            }
            b_816 = l_814;
            y_815 = transformer_debug.const284;
            c_816 = b_816;
            z_815 = transformer_debug.const360;
            d_816 = c_816;
            term = r_exit_0_3.instance.invoke(context, d_816, y_815, z_815, transformer_debug.constLocationInfo499);
            if(term == null)
              break Fail361;
            if(true)
              break Success175;
          }
          term = term185;
        }
        if(cons16 == transformer_debug._consVar_1)
        { 
          IStrategoTerm n_813 = null;
          IStrategoTerm p_813 = null;
          IStrategoTerm q_813 = null;
          IStrategoTerm s_813 = null;
          IStrategoTerm t_813 = null;
          IStrategoTerm u_813 = null;
          IStrategoTerm w_813 = null;
          IStrategoTerm x_813 = null;
          IStrategoTerm y_813 = null;
          IStrategoTerm a_814 = null;
          IStrategoTerm b_814 = null;
          IStrategoTerm c_814 = null;
          IStrategoTerm d_814 = null;
          IStrategoTerm e_814 = null;
          IStrategoTerm f_814 = null;
          IStrategoTerm h_814 = null;
          IStrategoTerm i_814 = null;
          IStrategoTerm j_814 = null;
          IStrategoTerm arg125 = term.getSubterm(0);
          if(arg125.getTermType() != IStrategoTerm.APPL || transformer_debug._consListVar_1 != ((IStrategoAppl)arg125).getConstructor())
            break Fail360;
          n_813 = arg125.getSubterm(0);
          s_813 = term;
          p_813 = transformer_debug.const284;
          t_813 = s_813;
          q_813 = transformer_debug.const360;
          u_813 = t_813;
          term = r_enter_0_3.instance.invoke(context, u_813, p_813, q_813, transformer_debug.constLocationInfo503);
          if(term == null)
            break Fail360;
          a_814 = n_813;
          w_813 = transformer_debug.const284;
          b_814 = a_814;
          x_813 = transformer_debug.const360;
          c_814 = b_814;
          y_813 = transformer_debug.const239;
          d_814 = c_814;
          term = s_var_0_4.instance.invoke(context, d_814, w_813, x_813, y_813, transformer_debug.constLocationInfo504);
          if(term == null)
            break Fail360;
          h_814 = n_813;
          e_814 = transformer_debug.const284;
          i_814 = h_814;
          f_814 = transformer_debug.const360;
          j_814 = i_814;
          term = r_exit_0_3.instance.invoke(context, j_814, e_814, f_814, transformer_debug.constLocationInfo503);
          if(term == null)
            break Fail360;
        }
        else
        { 
          break Fail360;
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}