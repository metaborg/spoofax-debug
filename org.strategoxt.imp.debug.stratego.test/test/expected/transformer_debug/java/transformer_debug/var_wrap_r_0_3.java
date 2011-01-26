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

@SuppressWarnings("all") public class var_wrap_r_0_3 extends Strategy 
{ 
  public static var_wrap_r_0_3 instance = new var_wrap_r_0_3();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm ref_b_1145, IStrategoTerm ref_c_1145, IStrategoTerm ref_d_1145)
  { 
    ITermFactory termFactory = context.getFactory();
    TermReference b_1145 = new TermReference(ref_b_1145);
    TermReference c_1145 = new TermReference(ref_c_1145);
    TermReference d_1145 = new TermReference(ref_d_1145);
    context.push("var_wrap_r_0_3");
    Fail339:
    { 
      IStrategoTerm term170 = term;
      Success162:
      { 
        Fail340:
        { 
          IStrategoTerm h_774 = null;
          IStrategoTerm i_774 = null;
          IStrategoTerm j_774 = null;
          IStrategoTerm k_774 = null;
          IStrategoTerm l_774 = null;
          IStrategoTerm m_774 = null;
          IStrategoTerm p_774 = null;
          IStrategoTerm q_774 = null;
          IStrategoTerm r_774 = null;
          IStrategoTerm t_774 = null;
          IStrategoTerm u_774 = null;
          IStrategoTerm v_774 = null;
          IStrategoTerm w_774 = null;
          IStrategoTerm x_774 = null;
          IStrategoTerm y_774 = null;
          IStrategoTerm z_774 = null;
          IStrategoTerm b_775 = null;
          IStrategoTerm c_775 = null;
          IStrategoTerm d_775 = null;
          IStrategoTerm e_775 = null;
          IStrategoTerm f_775 = null;
          IStrategoTerm g_775 = null;
          IStrategoTerm h_775 = null;
          IStrategoTerm j_775 = null;
          IStrategoTerm k_775 = null;
          IStrategoTerm o_775 = null;
          IStrategoTerm p_775 = null;
          IStrategoTerm r_775 = null;
          IStrategoTerm s_775 = null;
          IStrategoTerm w_775 = null;
          IStrategoTerm z_775 = null;
          IStrategoTerm a_776 = null;
          IStrategoTerm e_776 = null;
          IStrategoTerm f_776 = null;
          IStrategoTerm h_776 = null;
          IStrategoTerm i_776 = null;
          IStrategoTerm j_776 = null;
          IStrategoTerm k_776 = null;
          IStrategoTerm m_776 = null;
          IStrategoTerm o_776 = null;
          IStrategoTerm p_776 = null;
          IStrategoTerm q_776 = null;
          IStrategoTerm r_776 = null;
          IStrategoTerm s_776 = null;
          IStrategoTerm t_776 = null;
          IStrategoTerm v_776 = null;
          IStrategoTerm w_776 = null;
          IStrategoTerm x_776 = null;
          IStrategoTerm z_776 = null;
          IStrategoTerm a_777 = null;
          IStrategoTerm b_777 = null;
          IStrategoTerm c_777 = null;
          IStrategoTerm e_777 = null;
          IStrategoTerm f_777 = null;
          IStrategoTerm g_777 = null;
          IStrategoTerm h_777 = null;
          IStrategoTerm i_777 = null;
          if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consRuleNoCond_2 != ((IStrategoAppl)term).getConstructor())
            break Fail340;
          k_774 = term.getSubterm(0);
          i_774 = term.getSubterm(1);
          IStrategoList annos67 = term.getAnnotations();
          if(annos67.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos67).isEmpty())
            break Fail340;
          h_774 = ((IStrategoList)annos67).head();
          IStrategoTerm arg119 = ((IStrategoList)annos67).tail();
          if(arg119.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg119).isEmpty())
            break Fail340;
          p_774 = term;
          t_774 = term;
          q_774 = transformer_debug.const284;
          u_774 = t_774;
          r_774 = transformer_debug.const297;
          v_774 = u_774;
          term = r_enter_0_3.instance.invoke(context, v_774, q_774, r_774, transformer_debug.constLocationInfo376);
          if(term == null)
            break Fail340;
          term = p_774;
          w_774 = p_774;
          if(b_1145.value == null)
            break Fail340;
          b_775 = b_1145.value;
          x_774 = transformer_debug.const284;
          c_775 = b_775;
          y_774 = transformer_debug.const297;
          d_775 = c_775;
          z_774 = transformer_debug.const238;
          e_775 = d_775;
          term = s_var_0_4.instance.invoke(context, e_775, x_774, y_774, z_774, transformer_debug.constLocationInfo377);
          if(term == null)
            break Fail340;
          if(c_1145.value == null)
            break Fail340;
          j_775 = c_1145.value;
          f_775 = transformer_debug.const284;
          k_775 = j_775;
          g_775 = transformer_debug.const297;
          o_775 = k_775;
          h_775 = transformer_debug.const287;
          p_775 = o_775;
          term = s_var_0_4.instance.invoke(context, p_775, f_775, g_775, h_775, transformer_debug.constLocationInfo378);
          if(term == null)
            break Fail340;
          if(d_1145.value == null)
            break Fail340;
          z_775 = d_1145.value;
          r_775 = transformer_debug.const284;
          a_776 = z_775;
          s_775 = transformer_debug.const297;
          e_776 = a_776;
          w_775 = transformer_debug.const248;
          f_776 = e_776;
          term = s_var_0_4.instance.invoke(context, f_776, r_775, s_775, w_775, transformer_debug.constLocationInfo379);
          if(term == null)
            break Fail340;
          h_776 = w_774;
          m_776 = k_774;
          i_776 = transformer_debug.const284;
          o_776 = m_776;
          j_776 = transformer_debug.const297;
          p_776 = o_776;
          k_776 = transformer_debug.const240;
          q_776 = p_776;
          term = s_var_0_4.instance.invoke(context, q_776, i_776, j_776, k_776, transformer_debug.constLocationInfo380);
          if(term == null)
            break Fail340;
          v_776 = i_774;
          r_776 = transformer_debug.const284;
          w_776 = v_776;
          s_776 = transformer_debug.const297;
          x_776 = w_776;
          t_776 = transformer_debug.const298;
          z_776 = x_776;
          term = s_var_0_4.instance.invoke(context, z_776, r_776, s_776, t_776, transformer_debug.constLocationInfo381);
          if(term == null)
            break Fail340;
          e_777 = h_774;
          a_777 = transformer_debug.const284;
          f_777 = e_777;
          b_777 = transformer_debug.const297;
          g_777 = f_777;
          c_777 = transformer_debug.const235;
          h_777 = g_777;
          term = s_var_0_4.instance.invoke(context, h_777, a_777, b_777, c_777, transformer_debug.constLocationInfo382);
          if(term == null)
            break Fail340;
          term = h_776;
          i_777 = h_776;
          IStrategoTerm term171 = term;
          Success163:
          { 
            Fail341:
            { 
              IStrategoTerm j_777 = null;
              IStrategoTerm k_777 = null;
              IStrategoTerm n_777 = null;
              IStrategoTerm o_777 = null;
              IStrategoTerm p_777 = null;
              IStrategoTerm q_777 = null;
              IStrategoTerm r_777 = null;
              IStrategoTerm t_777 = null;
              IStrategoTerm u_777 = null;
              IStrategoTerm v_777 = null;
              IStrategoTerm w_777 = null;
              IStrategoTerm x_777 = null;
              IStrategoTerm y_777 = null;
              IStrategoTerm a_778 = null;
              IStrategoTerm b_778 = null;
              IStrategoTerm c_778 = null;
              IStrategoTerm d_778 = null;
              IStrategoTerm e_778 = null;
              IStrategoTerm f_778 = null;
              IStrategoTerm h_778 = null;
              IStrategoTerm i_778 = null;
              IStrategoTerm j_778 = null;
              IStrategoTerm k_778 = null;
              IStrategoTerm l_778 = null;
              IStrategoTerm n_778 = null;
              IStrategoTerm o_778 = null;
              IStrategoTerm p_778 = null;
              IStrategoTerm r_778 = null;
              IStrategoTerm s_778 = null;
              IStrategoTerm t_778 = null;
              IStrategoTerm u_778 = null;
              IStrategoTerm w_778 = null;
              IStrategoTerm x_778 = null;
              IStrategoTerm y_778 = null;
              IStrategoTerm z_778 = null;
              IStrategoTerm a_779 = null;
              IStrategoTerm b_779 = null;
              IStrategoTerm d_779 = null;
              IStrategoTerm e_779 = null;
              IStrategoTerm f_779 = null;
              IStrategoTerm g_779 = null;
              IStrategoTerm h_779 = null;
              IStrategoTerm j_779 = null;
              IStrategoTerm k_779 = null;
              IStrategoTerm l_779 = null;
              IStrategoTerm m_779 = null;
              IStrategoTerm n_779 = null;
              IStrategoTerm o_779 = null;
              IStrategoTerm q_779 = null;
              IStrategoTerm r_779 = null;
              IStrategoTerm s_779 = null;
              IStrategoTerm u_779 = null;
              n_777 = term;
              j_777 = transformer_debug.const284;
              o_777 = n_777;
              k_777 = transformer_debug.const297;
              p_777 = o_777;
              term = s_step_0_3.instance.invoke(context, p_777, j_777, k_777, transformer_debug.constLocationInfo383);
              if(term == null)
                break Fail341;
              t_777 = i_774;
              q_777 = transformer_debug.const284;
              u_777 = t_777;
              r_777 = transformer_debug.const297;
              v_777 = u_777;
              term = s_step_0_3.instance.invoke(context, v_777, q_777, r_777, transformer_debug.constLocationInfo384);
              if(term == null)
                break Fail341;
              term = var_wrap_s_0_2.instance.invoke(context, term, b_1145.value, c_1145.value);
              if(term == null)
                break Fail341;
              j_774 = term;
              a_778 = term;
              w_777 = transformer_debug.const284;
              b_778 = a_778;
              x_777 = transformer_debug.const297;
              c_778 = b_778;
              y_777 = transformer_debug.const299;
              d_778 = c_778;
              term = s_var_0_4.instance.invoke(context, d_778, w_777, x_777, y_777, transformer_debug.constLocationInfo385);
              if(term == null)
                break Fail341;
              h_778 = term;
              e_778 = transformer_debug.const284;
              i_778 = h_778;
              f_778 = transformer_debug.const297;
              j_778 = i_778;
              term = s_step_0_3.instance.invoke(context, j_778, e_778, f_778, transformer_debug.constLocationInfo386);
              if(term == null)
                break Fail341;
              n_778 = k_774;
              k_778 = transformer_debug.const284;
              o_778 = n_778;
              l_778 = transformer_debug.const297;
              p_778 = o_778;
              term = s_step_0_3.instance.invoke(context, p_778, k_778, l_778, transformer_debug.constLocationInfo387);
              if(term == null)
                break Fail341;
              r_778 = term;
              term = try_s_var_for_match_0_3.instance.invoke(context, r_778, b_1145.value, c_1145.value, transformer_debug.constNil1);
              if(term == null)
                break Fail341;
              l_774 = term;
              w_778 = term;
              s_778 = transformer_debug.const284;
              x_778 = w_778;
              t_778 = transformer_debug.const297;
              y_778 = x_778;
              u_778 = transformer_debug.const300;
              z_778 = y_778;
              term = s_var_0_4.instance.invoke(context, z_778, s_778, t_778, u_778, transformer_debug.constLocationInfo388);
              if(term == null)
                break Fail341;
              d_779 = term;
              a_779 = transformer_debug.const284;
              e_779 = d_779;
              b_779 = transformer_debug.const297;
              f_779 = e_779;
              term = s_step_0_3.instance.invoke(context, f_779, a_779, b_779, transformer_debug.constLocationInfo389);
              if(term == null)
                break Fail341;
              if(d_1145.value == null)
                break Fail341;
              j_779 = d_1145.value;
              g_779 = transformer_debug.const284;
              k_779 = j_779;
              h_779 = transformer_debug.const297;
              l_779 = k_779;
              term = s_step_0_3.instance.invoke(context, l_779, g_779, h_779, transformer_debug.constLocationInfo390);
              if(term == null)
                break Fail341;
              term = try_s_var_for_t_args_0_3.instance.invoke(context, term, b_1145.value, c_1145.value, l_774);
              if(term == null)
                break Fail341;
              m_774 = term;
              q_779 = term;
              m_779 = transformer_debug.const284;
              r_779 = q_779;
              n_779 = transformer_debug.const297;
              s_779 = r_779;
              o_779 = transformer_debug.const301;
              u_779 = s_779;
              term = s_var_0_4.instance.invoke(context, u_779, m_779, n_779, o_779, transformer_debug.constLocationInfo391);
              if(term == null)
                break Fail341;
              if(true)
                break Success163;
            }
            term = term171;
            IStrategoTerm n_774 = null;
            IStrategoTerm o_774 = null;
            IStrategoTerm w_779 = null;
            n_774 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail340;
            o_774 = term;
            w_779 = n_774;
            term = report_with_failure_0_2.instance.invoke(context, w_779, transformer_debug.const302, o_774);
            if(term == null)
              break Fail340;
          }
          term = i_777;
          IStrategoTerm x_779 = null;
          IStrategoTerm y_779 = null;
          IStrategoTerm a_780 = null;
          IStrategoTerm b_780 = null;
          IStrategoTerm c_780 = null;
          if(j_774 == null || m_774 == null)
            break Fail340;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consRule_3, new IStrategoTerm[]{k_774, j_774, m_774}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(h_774, (IStrategoList)transformer_debug.constNil1)));
          a_780 = term;
          x_779 = transformer_debug.const284;
          b_780 = a_780;
          y_779 = transformer_debug.const297;
          c_780 = b_780;
          term = r_exit_0_3.instance.invoke(context, c_780, x_779, y_779, transformer_debug.constLocationInfo376);
          if(term == null)
            break Fail340;
          if(true)
            break Success162;
        }
        term = term170;
        TermReference y_767 = new TermReference();
        TermReference z_767 = new TermReference();
        TermReference a_768 = new TermReference();
        TermReference b_768 = new TermReference();
        TermReference c_768 = new TermReference();
        TermReference d_768 = new TermReference();
        TermReference e_768 = new TermReference();
        TermReference f_768 = new TermReference();
        TermReference g_768 = new TermReference();
        TermReference h_768 = new TermReference();
        TermReference i_768 = new TermReference();
        TermReference j_768 = new TermReference();
        IStrategoTerm k_768 = null;
        IStrategoTerm l_768 = null;
        TermReference m_768 = new TermReference();
        TermReference n_768 = new TermReference();
        TermReference o_768 = new TermReference();
        TermReference p_768 = new TermReference();
        TermReference q_768 = new TermReference();
        TermReference r_768 = new TermReference();
        TermReference s_768 = new TermReference();
        TermReference t_768 = new TermReference();
        TermReference u_768 = new TermReference();
        TermReference v_768 = new TermReference();
        TermReference w_768 = new TermReference();
        TermReference x_768 = new TermReference();
        TermReference y_768 = new TermReference();
        TermReference z_768 = new TermReference();
        TermReference a_769 = new TermReference();
        TermReference b_769 = new TermReference();
        TermReference c_769 = new TermReference();
        TermReference d_769 = new TermReference();
        TermReference e_769 = new TermReference();
        TermReference f_769 = new TermReference();
        TermReference g_769 = new TermReference();
        TermReference h_769 = new TermReference();
        TermReference i_769 = new TermReference();
        TermReference j_769 = new TermReference();
        TermReference k_769 = new TermReference();
        TermReference l_769 = new TermReference();
        if(term.getTermType() != IStrategoTerm.APPL || transformer_debug._consRule_3 != ((IStrategoAppl)term).getConstructor())
          break Fail339;
        if(b_768.value == null)
          b_768.value = term.getSubterm(0);
        else
          if(b_768.value != term.getSubterm(0) && !b_768.value.match(term.getSubterm(0)))
            break Fail339;
        if(e_768.value == null)
          e_768.value = term.getSubterm(1);
        else
          if(e_768.value != term.getSubterm(1) && !e_768.value.match(term.getSubterm(1)))
            break Fail339;
        if(z_767.value == null)
          z_767.value = term.getSubterm(2);
        else
          if(z_767.value != term.getSubterm(2) && !z_767.value.match(term.getSubterm(2)))
            break Fail339;
        IStrategoList annos68 = term.getAnnotations();
        if(annos68.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos68).isEmpty())
          break Fail339;
        if(y_767.value == null)
          y_767.value = ((IStrategoList)annos68).head();
        else
          if(y_767.value != ((IStrategoList)annos68).head() && !y_767.value.match(((IStrategoList)annos68).head()))
            break Fail339;
        IStrategoTerm arg120 = ((IStrategoList)annos68).tail();
        if(arg120.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg120).isEmpty())
          break Fail339;
        if(g_768.value == null)
          g_768.value = term;
        else
          if(g_768.value != term && !g_768.value.match(term))
            break Fail339;
        k_768 = term;
        term = transformer_debug.const284;
        if(h_768.value == null)
          h_768.value = term;
        else
          if(h_768.value != term && !h_768.value.match(term))
            break Fail339;
        l_768 = k_768;
        term = transformer_debug.const297;
        if(i_768.value == null)
          i_768.value = term;
        else
          if(i_768.value != term && !i_768.value.match(term))
            break Fail339;
        term = l_768;
        if(m_768.value == null)
          m_768.value = term;
        else
          if(m_768.value != term && !m_768.value.match(term))
            break Fail339;
        term = transformer_debug.constLocationInfo411;
        if(j_768.value == null)
          j_768.value = term;
        else
          if(j_768.value != term && !j_768.value.match(term))
            break Fail339;
        var_wrap_r_0_3_fragment_0 var_wrap_r_0_3_fragment_00 = new var_wrap_r_0_3_fragment_0();
        var_wrap_r_0_3_fragment_00.m_768 = m_768;
        var_wrap_r_0_3_fragment_00.h_768 = h_768;
        var_wrap_r_0_3_fragment_00.i_768 = i_768;
        var_wrap_r_0_3_fragment_00.j_768 = j_768;
        var_wrap_r_0_3_fragment_00.g_768 = g_768;
        var_wrap_r_0_3_fragment_00.s_768 = s_768;
        var_wrap_r_0_3_fragment_00.t_768 = t_768;
        var_wrap_r_0_3_fragment_00.u_768 = u_768;
        var_wrap_r_0_3_fragment_00.v_768 = v_768;
        var_wrap_r_0_3_fragment_00.o_768 = o_768;
        var_wrap_r_0_3_fragment_00.p_768 = p_768;
        var_wrap_r_0_3_fragment_00.q_768 = q_768;
        var_wrap_r_0_3_fragment_00.r_768 = r_768;
        var_wrap_r_0_3_fragment_00.a_769 = a_769;
        var_wrap_r_0_3_fragment_00.b_769 = b_769;
        var_wrap_r_0_3_fragment_00.c_769 = c_769;
        var_wrap_r_0_3_fragment_00.d_769 = d_769;
        var_wrap_r_0_3_fragment_00.w_768 = w_768;
        var_wrap_r_0_3_fragment_00.x_768 = x_768;
        var_wrap_r_0_3_fragment_00.y_768 = y_768;
        var_wrap_r_0_3_fragment_00.z_768 = z_768;
        var_wrap_r_0_3_fragment_00.i_769 = i_769;
        var_wrap_r_0_3_fragment_00.j_769 = j_769;
        var_wrap_r_0_3_fragment_00.k_769 = k_769;
        var_wrap_r_0_3_fragment_00.l_769 = l_769;
        var_wrap_r_0_3_fragment_00.e_769 = e_769;
        var_wrap_r_0_3_fragment_00.f_769 = f_769;
        var_wrap_r_0_3_fragment_00.g_769 = g_769;
        var_wrap_r_0_3_fragment_00.h_769 = h_769;
        var_wrap_r_0_3_fragment_00.n_768 = n_768;
        var_wrap_r_0_3_fragment_00.z_767 = z_767;
        var_wrap_r_0_3_fragment_00.a_768 = a_768;
        var_wrap_r_0_3_fragment_00.d_1145 = d_1145;
        var_wrap_r_0_3_fragment_00.c_768 = c_768;
        var_wrap_r_0_3_fragment_00.e_768 = e_768;
        var_wrap_r_0_3_fragment_00.b_1145 = b_1145;
        var_wrap_r_0_3_fragment_00.c_1145 = c_1145;
        var_wrap_r_0_3_fragment_00.b_768 = b_768;
        var_wrap_r_0_3_fragment_00.f_768 = f_768;
        var_wrap_r_0_3_fragment_00.d_768 = d_768;
        var_wrap_r_0_3_fragment_00.y_767 = y_767;
        term = var_wrap_r_0_3_fragment_00.invoke(context, term);
        if(term == null)
          break Fail339;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}