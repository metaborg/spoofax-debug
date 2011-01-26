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

@SuppressWarnings("all") public class add_var_in_r_def_0_1 extends Strategy 
{ 
  public static add_var_in_r_def_0_1 instance = new add_var_in_r_def_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_z_1144)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference z_1144 = new TermReference(ref_z_1144);
    context.push("add_var_in_r_def_0_1");
    Fail329:
    { 
      IStrategoTerm term163 = term;
      Success157:
      { 
        Fail330:
        { 
          IStrategoTerm u_746 = null;
          IStrategoTerm v_746 = null;
          IStrategoTerm w_746 = null;
          IStrategoTerm x_746 = null;
          IStrategoTerm y_746 = null;
          IStrategoTerm z_746 = null;
          IStrategoTerm a_747 = null;
          IStrategoTerm c_747 = null;
          IStrategoTerm d_747 = null;
          IStrategoTerm e_747 = null;
          IStrategoTerm f_747 = null;
          IStrategoTerm g_747 = null;
          IStrategoTerm h_747 = null;
          IStrategoTerm i_747 = null;
          IStrategoTerm k_747 = null;
          IStrategoTerm l_747 = null;
          IStrategoTerm m_747 = null;
          IStrategoTerm o_747 = null;
          IStrategoTerm p_747 = null;
          IStrategoTerm q_747 = null;
          IStrategoTerm r_747 = null;
          IStrategoTerm s_747 = null;
          IStrategoTerm w_747 = null;
          IStrategoTerm y_747 = null;
          IStrategoTerm z_747 = null;
          IStrategoTerm d_748 = null;
          IStrategoTerm e_748 = null;
          IStrategoTerm g_748 = null;
          IStrategoTerm h_748 = null;
          IStrategoTerm j_748 = null;
          IStrategoTerm k_748 = null;
          IStrategoTerm l_748 = null;
          IStrategoTerm n_748 = null;
          IStrategoTerm o_748 = null;
          IStrategoTerm p_748 = null;
          IStrategoTerm q_748 = null;
          IStrategoTerm s_748 = null;
          IStrategoTerm t_748 = null;
          IStrategoTerm u_748 = null;
          IStrategoTerm v_748 = null;
          IStrategoTerm y_748 = null;
          IStrategoTerm z_748 = null;
          IStrategoTerm b_749 = null;
          IStrategoTerm c_749 = null;
          IStrategoTerm d_749 = null;
          IStrategoTerm e_749 = null;
          IStrategoTerm f_749 = null;
          IStrategoTerm h_749 = null;
          IStrategoTerm i_749 = null;
          IStrategoTerm k_749 = null;
          IStrategoTerm m_749 = null;
          IStrategoTerm n_749 = null;
          IStrategoTerm o_749 = null;
          IStrategoTerm p_749 = null;
          IStrategoTerm r_749 = null;
          IStrategoTerm s_749 = null;
          IStrategoTerm t_749 = null;
          IStrategoTerm u_749 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consRDefNoArgs_2 != ((IStrategoAppl)term).getConstructor())
            break Fail330;
          v_746 = term.getSubterm(0);
          w_746 = term.getSubterm(1);
          IStrategoList annos61 = term.getAnnotations();
          if(annos61.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos61).isEmpty())
            break Fail330;
          u_746 = ((IStrategoList)annos61).head();
          IStrategoTerm arg113 = ((IStrategoList)annos61).tail();
          if(arg113.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg113).isEmpty())
            break Fail330;
          y_746 = term;
          c_747 = term;
          z_746 = transformer_debug.const284;
          d_747 = c_747;
          a_747 = transformer_debug.const286;
          e_747 = d_747;
          term = r_enter_0_3.instance.invoke(context, e_747, z_746, a_747, transformer_debug.constLocationInfo301);
          if(term == null)
            break Fail330;
          term = y_746;
          f_747 = y_746;
          if(z_1144.value == null)
            break Fail330;
          k_747 = z_1144.value;
          g_747 = transformer_debug.const284;
          l_747 = k_747;
          h_747 = transformer_debug.const286;
          m_747 = l_747;
          i_747 = transformer_debug.const238;
          o_747 = m_747;
          term = s_var_0_4.instance.invoke(context, o_747, g_747, h_747, i_747, transformer_debug.constLocationInfo302);
          if(term == null)
            break Fail330;
          p_747 = f_747;
          w_747 = v_746;
          q_747 = transformer_debug.const284;
          y_747 = w_747;
          r_747 = transformer_debug.const286;
          z_747 = y_747;
          s_747 = transformer_debug.const287;
          d_748 = z_747;
          term = s_var_0_4.instance.invoke(context, d_748, q_747, r_747, s_747, transformer_debug.constLocationInfo303);
          if(term == null)
            break Fail330;
          j_748 = w_746;
          e_748 = transformer_debug.const284;
          k_748 = j_748;
          g_748 = transformer_debug.const286;
          l_748 = k_748;
          h_748 = transformer_debug.const288;
          n_748 = l_748;
          term = s_var_0_4.instance.invoke(context, n_748, e_748, g_748, h_748, transformer_debug.constLocationInfo304);
          if(term == null)
            break Fail330;
          s_748 = u_746;
          o_748 = transformer_debug.const284;
          t_748 = s_748;
          p_748 = transformer_debug.const286;
          u_748 = t_748;
          q_748 = transformer_debug.const235;
          v_748 = u_748;
          term = s_var_0_4.instance.invoke(context, v_748, o_748, p_748, q_748, transformer_debug.constLocationInfo305);
          if(term == null)
            break Fail330;
          term = p_747;
          b_749 = term;
          y_748 = transformer_debug.const284;
          c_749 = b_749;
          z_748 = transformer_debug.const286;
          d_749 = c_749;
          term = s_step_0_3.instance.invoke(context, d_749, y_748, z_748, transformer_debug.constLocationInfo306);
          if(term == null)
            break Fail330;
          h_749 = w_746;
          e_749 = transformer_debug.const284;
          i_749 = h_749;
          f_749 = transformer_debug.const286;
          k_749 = i_749;
          term = s_step_0_3.instance.invoke(context, k_749, e_749, f_749, transformer_debug.constLocationInfo307);
          if(term == null)
            break Fail330;
          m_749 = term;
          term = var_wrap_r_0_3.instance.invoke(context, m_749, z_1144.value, v_746, transformer_debug.constNil1);
          if(term == null)
            break Fail330;
          x_746 = term;
          r_749 = term;
          n_749 = transformer_debug.const284;
          s_749 = r_749;
          o_749 = transformer_debug.const286;
          t_749 = s_749;
          p_749 = transformer_debug.const289;
          u_749 = t_749;
          term = s_var_0_4.instance.invoke(context, u_749, n_749, o_749, p_749, transformer_debug.constLocationInfo308);
          if(term == null)
            break Fail330;
          IStrategoTerm v_749 = null;
          IStrategoTerm w_749 = null;
          IStrategoTerm y_749 = null;
          IStrategoTerm z_749 = null;
          IStrategoTerm a_750 = null;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consRDefNoArgs_2, new IStrategoTerm[]{v_746, x_746}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(u_746, (IStrategoList)transformer_debug.constNil1)));
          y_749 = term;
          v_749 = transformer_debug.const284;
          z_749 = y_749;
          w_749 = transformer_debug.const286;
          a_750 = z_749;
          term = r_exit_0_3.instance.invoke(context, a_750, v_749, w_749, transformer_debug.constLocationInfo301);
          if(term == null)
            break Fail330;
          if(true)
            break Success157;
        }
        term = term163;
        add_var_in_r_def_0_1_fragment_0 add_var_in_r_def_0_1_fragment_00 = new add_var_in_r_def_0_1_fragment_0();
        add_var_in_r_def_0_1_fragment_00.z_1144 = z_1144;
        term = add_var_in_r_def_0_1_fragment_00.invoke(context, term);
        if(term == null)
          break Fail329;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}