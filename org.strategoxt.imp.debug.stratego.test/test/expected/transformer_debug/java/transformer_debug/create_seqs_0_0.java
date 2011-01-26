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

@SuppressWarnings("all") public class create_seqs_0_0 extends Strategy 
{ 
  public static create_seqs_0_0 instance = new create_seqs_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("create_seqs_0_0");
    Fail322:
    { 
      IStrategoTerm term159 = term;
      Success153:
      { 
        Fail323:
        { 
          TermReference z_727 = new TermReference();
          TermReference a_728 = new TermReference();
          TermReference b_728 = new TermReference();
          TermReference c_728 = new TermReference();
          TermReference e_728 = new TermReference();
          TermReference f_728 = new TermReference();
          IStrategoTerm g_728 = null;
          IStrategoTerm h_728 = null;
          IStrategoTerm i_728 = null;
          IStrategoTerm k_728 = null;
          IStrategoTerm l_728 = null;
          IStrategoTerm m_728 = null;
          TermReference n_728 = new TermReference();
          TermReference p_728 = new TermReference();
          TermReference q_728 = new TermReference();
          TermReference r_728 = new TermReference();
          TermReference s_728 = new TermReference();
          TermReference t_728 = new TermReference();
          TermReference u_728 = new TermReference();
          TermReference v_728 = new TermReference();
          TermReference w_728 = new TermReference();
          TermReference x_728 = new TermReference();
          TermReference y_728 = new TermReference();
          TermReference z_728 = new TermReference();
          TermReference b_729 = new TermReference();
          TermReference c_729 = new TermReference();
          TermReference d_729 = new TermReference();
          TermReference e_729 = new TermReference();
          TermReference f_729 = new TermReference();
          TermReference g_729 = new TermReference();
          TermReference h_729 = new TermReference();
          TermReference i_729 = new TermReference();
          TermReference j_729 = new TermReference();
          TermReference k_729 = new TermReference();
          TermReference l_729 = new TermReference();
          TermReference m_729 = new TermReference();
          IStrategoTerm p_734 = null;
          IStrategoTerm q_734 = null;
          IStrategoTerm s_734 = null;
          IStrategoTerm t_734 = null;
          IStrategoTerm u_734 = null;
          if(b_728.value == null)
            b_728.value = term;
          else
            if(b_728.value != term && !b_728.value.match(term))
              break Fail323;
          g_728 = term;
          k_728 = term;
          h_728 = transformer_debug.const236;
          l_728 = k_728;
          i_728 = transformer_debug.const260;
          m_728 = l_728;
          term = r_enter_0_3.instance.invoke(context, m_728, h_728, i_728, transformer_debug.constLocationInfo257);
          if(term == null)
            break Fail323;
          term = g_728;
          if(n_728.value == null)
            n_728.value = term;
          else
            if(n_728.value != term && !n_728.value.match(term))
              break Fail323;
          if(b_728.value == null)
            break Fail323;
          term = b_728.value;
          if(t_728.value == null)
            t_728.value = term;
          else
            if(t_728.value != term && !t_728.value.match(term))
              break Fail323;
          term = transformer_debug.const236;
          if(p_728.value == null)
            p_728.value = term;
          else
            if(p_728.value != term && !p_728.value.match(term))
              break Fail323;
          create_seqs_0_0_fragment_0 create_seqs_0_0_fragment_00 = new create_seqs_0_0_fragment_0();
          create_seqs_0_0_fragment_00.t_728 = t_728;
          create_seqs_0_0_fragment_00.u_728 = u_728;
          create_seqs_0_0_fragment_00.v_728 = v_728;
          create_seqs_0_0_fragment_00.w_728 = w_728;
          create_seqs_0_0_fragment_00.p_728 = p_728;
          create_seqs_0_0_fragment_00.q_728 = q_728;
          create_seqs_0_0_fragment_00.r_728 = r_728;
          create_seqs_0_0_fragment_00.s_728 = s_728;
          create_seqs_0_0_fragment_00.n_728 = n_728;
          create_seqs_0_0_fragment_00.e_729 = e_729;
          create_seqs_0_0_fragment_00.f_729 = f_729;
          create_seqs_0_0_fragment_00.g_729 = g_729;
          create_seqs_0_0_fragment_00.b_729 = b_729;
          create_seqs_0_0_fragment_00.c_729 = c_729;
          create_seqs_0_0_fragment_00.d_729 = d_729;
          create_seqs_0_0_fragment_00.z_728 = z_728;
          create_seqs_0_0_fragment_00.y_728 = y_728;
          create_seqs_0_0_fragment_00.k_729 = k_729;
          create_seqs_0_0_fragment_00.l_729 = l_729;
          create_seqs_0_0_fragment_00.m_729 = m_729;
          create_seqs_0_0_fragment_00.h_729 = h_729;
          create_seqs_0_0_fragment_00.i_729 = i_729;
          create_seqs_0_0_fragment_00.j_729 = j_729;
          create_seqs_0_0_fragment_00.x_728 = x_728;
          create_seqs_0_0_fragment_00.z_727 = z_727;
          create_seqs_0_0_fragment_00.a_728 = a_728;
          create_seqs_0_0_fragment_00.b_728 = b_728;
          create_seqs_0_0_fragment_00.e_728 = e_728;
          create_seqs_0_0_fragment_00.c_728 = c_728;
          create_seqs_0_0_fragment_00.f_728 = f_728;
          term = create_seqs_0_0_fragment_00.invoke(context, term);
          if(term == null)
            break Fail323;
          if(f_728.value == null)
            break Fail323;
          s_734 = f_728.value;
          p_734 = transformer_debug.const236;
          t_734 = s_734;
          q_734 = transformer_debug.const260;
          u_734 = t_734;
          term = r_exit_0_3.instance.invoke(context, u_734, p_734, q_734, transformer_debug.constLocationInfo257);
          if(term == null)
            break Fail323;
          if(true)
            break Success153;
        }
        term = term159;
        IStrategoTerm term160 = term;
        Success154:
        { 
          Fail324:
          { 
            IStrategoTerm j_725 = null;
            IStrategoTerm k_725 = null;
            IStrategoTerm l_725 = null;
            IStrategoTerm m_725 = null;
            IStrategoTerm n_725 = null;
            IStrategoTerm p_725 = null;
            IStrategoTerm q_725 = null;
            IStrategoTerm r_725 = null;
            IStrategoTerm s_725 = null;
            IStrategoTerm t_725 = null;
            IStrategoTerm u_725 = null;
            IStrategoTerm v_725 = null;
            IStrategoTerm x_725 = null;
            IStrategoTerm y_725 = null;
            IStrategoTerm z_725 = null;
            IStrategoTerm a_726 = null;
            IStrategoTerm b_726 = null;
            IStrategoTerm e_726 = null;
            IStrategoTerm f_726 = null;
            IStrategoTerm h_726 = null;
            IStrategoTerm i_726 = null;
            IStrategoTerm j_726 = null;
            IStrategoTerm k_726 = null;
            IStrategoTerm l_726 = null;
            IStrategoTerm n_726 = null;
            IStrategoTerm o_726 = null;
            IStrategoTerm p_726 = null;
            IStrategoTerm r_726 = null;
            IStrategoTerm s_726 = null;
            IStrategoTerm v_726 = null;
            IStrategoTerm w_726 = null;
            IStrategoTerm x_726 = null;
            IStrategoTerm y_726 = null;
            IStrategoTerm z_726 = null;
            IStrategoTerm b_727 = null;
            IStrategoTerm c_727 = null;
            IStrategoTerm d_727 = null;
            IStrategoTerm e_727 = null;
            IStrategoTerm f_727 = null;
            IStrategoTerm g_727 = null;
            IStrategoTerm i_727 = null;
            IStrategoTerm j_727 = null;
            IStrategoTerm m_727 = null;
            IStrategoTerm n_727 = null;
            j_725 = term;
            l_725 = term;
            p_725 = term;
            m_725 = transformer_debug.const236;
            q_725 = p_725;
            n_725 = transformer_debug.const260;
            r_725 = q_725;
            term = r_enter_0_3.instance.invoke(context, r_725, m_725, n_725, transformer_debug.constLocationInfo279);
            if(term == null)
              break Fail324;
            s_725 = l_725;
            x_725 = j_725;
            t_725 = transformer_debug.const236;
            y_725 = x_725;
            u_725 = transformer_debug.const260;
            z_725 = y_725;
            v_725 = transformer_debug.const262;
            a_726 = z_725;
            term = s_var_0_4.instance.invoke(context, a_726, t_725, u_725, v_725, transformer_debug.constLocationInfo280);
            if(term == null)
              break Fail324;
            b_726 = s_725;
            h_726 = j_725;
            e_726 = transformer_debug.const236;
            i_726 = h_726;
            f_726 = transformer_debug.const260;
            j_726 = i_726;
            term = s_step_0_3.instance.invoke(context, j_726, e_726, f_726, transformer_debug.constLocationInfo281);
            if(term == null)
              break Fail324;
            term = length_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail324;
            term = termFactory.makeTuple(term, transformer_debug.const268);
            n_726 = term;
            k_726 = transformer_debug.const236;
            o_726 = n_726;
            l_726 = transformer_debug.const260;
            p_726 = o_726;
            term = s_step_0_3.instance.invoke(context, p_726, k_726, l_726, transformer_debug.constLocationInfo282);
            if(term == null)
              break Fail324;
            term = eq_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail324;
            term = b_726;
            v_726 = term;
            r_726 = transformer_debug.const236;
            w_726 = v_726;
            s_726 = transformer_debug.const260;
            x_726 = w_726;
            term = s_step_0_3.instance.invoke(context, x_726, r_726, s_726, transformer_debug.constLocationInfo283);
            if(term == null)
              break Fail324;
            b_727 = j_725;
            y_726 = transformer_debug.const236;
            c_727 = b_727;
            z_726 = transformer_debug.const260;
            d_727 = c_727;
            term = s_step_0_3.instance.invoke(context, d_727, y_726, z_726, transformer_debug.constLocationInfo284);
            if(term == null)
              break Fail324;
            term = last_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail324;
            k_725 = term;
            i_727 = term;
            e_727 = transformer_debug.const236;
            j_727 = i_727;
            f_727 = transformer_debug.const260;
            m_727 = j_727;
            g_727 = transformer_debug.const277;
            n_727 = m_727;
            term = s_var_0_4.instance.invoke(context, n_727, e_727, f_727, g_727, transformer_debug.constLocationInfo285);
            if(term == null)
              break Fail324;
            IStrategoTerm p_727 = null;
            IStrategoTerm q_727 = null;
            IStrategoTerm v_727 = null;
            IStrategoTerm x_727 = null;
            IStrategoTerm y_727 = null;
            v_727 = k_725;
            p_727 = transformer_debug.const236;
            x_727 = v_727;
            q_727 = transformer_debug.const260;
            y_727 = x_727;
            term = r_exit_0_3.instance.invoke(context, y_727, p_727, q_727, transformer_debug.constLocationInfo279);
            if(term == null)
              break Fail324;
            if(true)
              break Success154;
          }
          term = term160;
          IStrategoTerm u_723 = null;
          IStrategoTerm w_723 = null;
          IStrategoTerm x_723 = null;
          IStrategoTerm z_723 = null;
          IStrategoTerm b_724 = null;
          IStrategoTerm c_724 = null;
          IStrategoTerm e_724 = null;
          IStrategoTerm f_724 = null;
          IStrategoTerm g_724 = null;
          IStrategoTerm i_724 = null;
          IStrategoTerm j_724 = null;
          IStrategoTerm k_724 = null;
          IStrategoTerm m_724 = null;
          IStrategoTerm q_724 = null;
          IStrategoTerm r_724 = null;
          IStrategoTerm t_724 = null;
          IStrategoTerm u_724 = null;
          IStrategoTerm v_724 = null;
          IStrategoTerm w_724 = null;
          IStrategoTerm y_724 = null;
          IStrategoTerm a_725 = null;
          IStrategoTerm b_725 = null;
          IStrategoTerm c_725 = null;
          IStrategoTerm d_725 = null;
          IStrategoTerm e_725 = null;
          IStrategoTerm g_725 = null;
          IStrategoTerm h_725 = null;
          IStrategoTerm i_725 = null;
          u_723 = term;
          z_723 = term;
          w_723 = transformer_debug.const236;
          b_724 = z_723;
          x_723 = transformer_debug.const260;
          c_724 = b_724;
          term = r_enter_0_3.instance.invoke(context, c_724, w_723, x_723, transformer_debug.constLocationInfo286);
          if(term == null)
            break Fail322;
          i_724 = u_723;
          e_724 = transformer_debug.const236;
          j_724 = i_724;
          f_724 = transformer_debug.const260;
          k_724 = j_724;
          g_724 = transformer_debug.const262;
          m_724 = k_724;
          term = s_var_0_4.instance.invoke(context, m_724, e_724, f_724, g_724, transformer_debug.constLocationInfo287);
          if(term == null)
            break Fail322;
          t_724 = u_723;
          q_724 = transformer_debug.const236;
          u_724 = t_724;
          r_724 = transformer_debug.const260;
          v_724 = u_724;
          term = s_step_0_3.instance.invoke(context, v_724, q_724, r_724, transformer_debug.constLocationInfo288);
          if(term == null)
            break Fail322;
          term = length_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail322;
          term = termFactory.makeTuple(term, transformer_debug.const281);
          a_725 = term;
          w_724 = transformer_debug.const236;
          b_725 = a_725;
          y_724 = transformer_debug.const260;
          c_725 = b_725;
          term = s_step_0_3.instance.invoke(context, c_725, w_724, y_724, transformer_debug.constLocationInfo289);
          if(term == null)
            break Fail322;
          term = eq_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail322;
          g_725 = u_723;
          d_725 = transformer_debug.const236;
          h_725 = g_725;
          e_725 = transformer_debug.const260;
          i_725 = h_725;
          term = r_exit_0_3.instance.invoke(context, i_725, d_725, e_725, transformer_debug.constLocationInfo286);
          if(term == null)
            break Fail322;
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