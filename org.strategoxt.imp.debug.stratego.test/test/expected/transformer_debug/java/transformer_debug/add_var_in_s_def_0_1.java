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

@SuppressWarnings("all") public class add_var_in_s_def_0_1 extends Strategy 
{ 
  public static add_var_in_s_def_0_1 instance = new add_var_in_s_def_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_a_1145)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference a_1145 = new TermReference(ref_a_1145);
    context.push("add_var_in_s_def_0_1");
    Fail331:
    { 
      IStrategoTerm term165 = term;
      Success158:
      { 
        Fail332:
        { 
          IStrategoTerm p_757 = null;
          IStrategoTerm q_757 = null;
          IStrategoTerm r_757 = null;
          IStrategoTerm s_757 = null;
          IStrategoTerm t_757 = null;
          IStrategoTerm v_757 = null;
          IStrategoTerm w_757 = null;
          IStrategoTerm y_757 = null;
          IStrategoTerm z_757 = null;
          IStrategoTerm a_758 = null;
          IStrategoTerm b_758 = null;
          IStrategoTerm c_758 = null;
          IStrategoTerm d_758 = null;
          IStrategoTerm e_758 = null;
          IStrategoTerm h_758 = null;
          IStrategoTerm i_758 = null;
          IStrategoTerm j_758 = null;
          IStrategoTerm k_758 = null;
          IStrategoTerm l_758 = null;
          IStrategoTerm m_758 = null;
          IStrategoTerm n_758 = null;
          IStrategoTerm o_758 = null;
          IStrategoTerm q_758 = null;
          IStrategoTerm r_758 = null;
          IStrategoTerm s_758 = null;
          IStrategoTerm t_758 = null;
          IStrategoTerm u_758 = null;
          IStrategoTerm v_758 = null;
          IStrategoTerm w_758 = null;
          IStrategoTerm y_758 = null;
          IStrategoTerm z_758 = null;
          IStrategoTerm a_759 = null;
          IStrategoTerm b_759 = null;
          IStrategoTerm c_759 = null;
          IStrategoTerm d_759 = null;
          IStrategoTerm e_759 = null;
          IStrategoTerm g_759 = null;
          IStrategoTerm h_759 = null;
          IStrategoTerm i_759 = null;
          IStrategoTerm j_759 = null;
          IStrategoTerm l_759 = null;
          IStrategoTerm m_759 = null;
          IStrategoTerm o_759 = null;
          IStrategoTerm p_759 = null;
          IStrategoTerm q_759 = null;
          IStrategoTerm r_759 = null;
          IStrategoTerm s_759 = null;
          IStrategoTerm u_759 = null;
          IStrategoTerm v_759 = null;
          IStrategoTerm w_759 = null;
          IStrategoTerm y_759 = null;
          IStrategoTerm z_759 = null;
          IStrategoTerm a_760 = null;
          IStrategoTerm b_760 = null;
          IStrategoTerm d_760 = null;
          IStrategoTerm e_760 = null;
          IStrategoTerm f_760 = null;
          IStrategoTerm h_760 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consSDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
            break Fail332;
          q_757 = term.getSubterm(0);
          r_757 = term.getSubterm(1);
          IStrategoList annos64 = term.getAnnotations();
          if(annos64.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos64).isEmpty())
            break Fail332;
          p_757 = ((IStrategoList)annos64).head();
          IStrategoTerm arg116 = ((IStrategoList)annos64).tail();
          if(arg116.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg116).isEmpty())
            break Fail332;
          t_757 = term;
          y_757 = term;
          v_757 = transformer_debug.const284;
          z_757 = y_757;
          w_757 = transformer_debug.const292;
          a_758 = z_757;
          term = r_enter_0_3.instance.invoke(context, a_758, v_757, w_757, transformer_debug.constLocationInfo330);
          if(term == null)
            break Fail332;
          term = t_757;
          b_758 = t_757;
          if(a_1145.value == null)
            break Fail332;
          h_758 = a_1145.value;
          c_758 = transformer_debug.const284;
          i_758 = h_758;
          d_758 = transformer_debug.const292;
          j_758 = i_758;
          e_758 = transformer_debug.const238;
          k_758 = j_758;
          term = s_var_0_4.instance.invoke(context, k_758, c_758, d_758, e_758, transformer_debug.constLocationInfo331);
          if(term == null)
            break Fail332;
          l_758 = b_758;
          q_758 = q_757;
          m_758 = transformer_debug.const284;
          r_758 = q_758;
          n_758 = transformer_debug.const292;
          s_758 = r_758;
          o_758 = transformer_debug.const293;
          t_758 = s_758;
          term = s_var_0_4.instance.invoke(context, t_758, m_758, n_758, o_758, transformer_debug.constLocationInfo332);
          if(term == null)
            break Fail332;
          y_758 = r_757;
          u_758 = transformer_debug.const284;
          z_758 = y_758;
          v_758 = transformer_debug.const292;
          a_759 = z_758;
          w_758 = transformer_debug.const277;
          b_759 = a_759;
          term = s_var_0_4.instance.invoke(context, b_759, u_758, v_758, w_758, transformer_debug.constLocationInfo333);
          if(term == null)
            break Fail332;
          g_759 = p_757;
          c_759 = transformer_debug.const284;
          h_759 = g_759;
          d_759 = transformer_debug.const292;
          i_759 = h_759;
          e_759 = transformer_debug.const235;
          j_759 = i_759;
          term = s_var_0_4.instance.invoke(context, j_759, c_759, d_759, e_759, transformer_debug.constLocationInfo334);
          if(term == null)
            break Fail332;
          term = l_758;
          o_759 = term;
          l_759 = transformer_debug.const284;
          p_759 = o_759;
          m_759 = transformer_debug.const292;
          q_759 = p_759;
          term = s_step_0_3.instance.invoke(context, q_759, l_759, m_759, transformer_debug.constLocationInfo335);
          if(term == null)
            break Fail332;
          u_759 = r_757;
          r_759 = transformer_debug.const284;
          v_759 = u_759;
          s_759 = transformer_debug.const292;
          w_759 = v_759;
          term = s_step_0_3.instance.invoke(context, w_759, r_759, s_759, transformer_debug.constLocationInfo336);
          if(term == null)
            break Fail332;
          y_759 = term;
          term = var_wrap_s_0_3.instance.invoke(context, y_759, a_1145.value, q_757, transformer_debug.constNil1);
          if(term == null)
            break Fail332;
          s_757 = term;
          d_760 = term;
          z_759 = transformer_debug.const284;
          e_760 = d_760;
          a_760 = transformer_debug.const292;
          f_760 = e_760;
          b_760 = transformer_debug.const294;
          h_760 = f_760;
          term = s_var_0_4.instance.invoke(context, h_760, z_759, a_760, b_760, transformer_debug.constLocationInfo337);
          if(term == null)
            break Fail332;
          IStrategoTerm i_760 = null;
          IStrategoTerm j_760 = null;
          IStrategoTerm l_760 = null;
          IStrategoTerm m_760 = null;
          IStrategoTerm n_760 = null;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consSDefNoArgs_2, new IStrategoTerm[]{q_757, s_757}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(p_757, (IStrategoList)transformer_debug.constNil1)));
          l_760 = term;
          i_760 = transformer_debug.const284;
          m_760 = l_760;
          j_760 = transformer_debug.const292;
          n_760 = m_760;
          term = r_exit_0_3.instance.invoke(context, n_760, i_760, j_760, transformer_debug.constLocationInfo330);
          if(term == null)
            break Fail332;
          if(true)
            break Success158;
        }
        term = term165;
        add_var_in_s_def_0_1_fragment_0 add_var_in_s_def_0_1_fragment_00 = new add_var_in_s_def_0_1_fragment_0();
        add_var_in_s_def_0_1_fragment_00.a_1145 = a_1145;
        term = add_var_in_s_def_0_1_fragment_00.invoke(context, term);
        if(term == null)
          break Fail331;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}