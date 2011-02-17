package localvar_rtree;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.imp.debug.stratego.runtime.trans.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class try_find_comment_by_name_0_1 extends Strategy 
{ 
  public static try_find_comment_by_name_0_1 instance = new try_find_comment_by_name_0_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm c_140)
  { 
    context.push("try_find_comment_by_name_0_1");
    Fail50:
    { 
      IStrategoTerm h_140 = null;
      IStrategoTerm i_140 = null;
      IStrategoTerm n_140 = null;
      IStrategoTerm r_140 = null;
      IStrategoTerm s_140 = null;
      n_140 = term;
      h_140 = localvar_rtree.const125;
      r_140 = n_140;
      i_140 = localvar_rtree.const191;
      s_140 = r_140;
      term = s_enter_0_3.instance.invoke(context, s_140, h_140, i_140, localvar_rtree.constLocationInfo121);
      if(term == null)
        break Fail50;
      IStrategoTerm term18 = term;
      Success18:
      { 
        Fail51:
        { 
          IStrategoTerm g_140 = null;
          IStrategoTerm t_140 = null;
          IStrategoTerm u_140 = null;
          IStrategoTerm v_140 = null;
          IStrategoTerm a_141 = null;
          IStrategoTerm b_141 = null;
          IStrategoTerm c_141 = null;
          IStrategoTerm d_141 = null;
          IStrategoTerm h_141 = null;
          IStrategoTerm i_141 = null;
          IStrategoTerm u_141 = null;
          IStrategoTerm v_141 = null;
          IStrategoTerm h_142 = null;
          g_140 = term;
          a_141 = c_140;
          t_140 = localvar_rtree.const125;
          b_141 = a_141;
          u_140 = localvar_rtree.const191;
          c_141 = b_141;
          v_140 = localvar_rtree.const160;
          d_141 = c_141;
          term = s_var_0_4.instance.invoke(context, d_141, t_140, u_140, v_140, localvar_rtree.constLocationInfo122);
          if(term == null)
            break Fail51;
          u_141 = g_140;
          h_141 = localvar_rtree.const125;
          v_141 = u_141;
          i_141 = localvar_rtree.const191;
          h_142 = v_141;
          term = s_step_0_3.instance.invoke(context, h_142, h_141, i_141, localvar_rtree.constLocationInfo123);
          if(term == null)
            break Fail51;
          term = find_comment_match_0_1.instance.invoke(context, term, c_140);
          if(term == null)
            break Fail51;
          { 
            IStrategoTerm j_142 = null;
            IStrategoTerm k_142 = null;
            IStrategoTerm m_142 = null;
            IStrategoTerm n_142 = null;
            IStrategoTerm o_142 = null;
            m_142 = term;
            j_142 = localvar_rtree.const125;
            n_142 = m_142;
            k_142 = localvar_rtree.const191;
            o_142 = n_142;
            term = s_exit_0_3.instance.invoke(context, o_142, j_142, k_142, localvar_rtree.constLocationInfo121);
            if(term == null)
              break Fail50;
            if(true)
              break Success18;
          }
        }
        term = term18;
        IStrategoTerm p_142 = null;
        IStrategoTerm q_142 = null;
        IStrategoTerm s_142 = null;
        IStrategoTerm t_142 = null;
        IStrategoTerm u_142 = null;
        s_142 = term;
        p_142 = localvar_rtree.const125;
        t_142 = s_142;
        q_142 = localvar_rtree.const191;
        u_142 = t_142;
        term = s_exit_0_3.instance.invoke(context, u_142, p_142, q_142, localvar_rtree.constLocationInfo121);
        if(term == null)
          break Fail50;
        if(true)
          break Fail50;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}