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

@SuppressWarnings("all") public class add_s_var_to_clause_0_2 extends Strategy 
{ 
  public static add_s_var_to_clause_0_2 instance = new add_s_var_to_clause_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm g_1145, IStrategoTerm h_1145)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("add_s_var_to_clause_0_2");
    Fail349:
    { 
      IStrategoTerm term178 = term;
      IStrategoConstructor cons15 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success168:
      { 
        if(cons15 == transformer_debug._consWithClause_1)
        { 
          Fail350:
          { 
            IStrategoTerm s_797 = null;
            IStrategoTerm t_797 = null;
            IStrategoTerm u_797 = null;
            IStrategoTerm x_797 = null;
            IStrategoTerm y_797 = null;
            IStrategoTerm z_797 = null;
            IStrategoTerm b_798 = null;
            IStrategoTerm c_798 = null;
            IStrategoTerm d_798 = null;
            IStrategoTerm e_798 = null;
            IStrategoTerm f_798 = null;
            IStrategoTerm g_798 = null;
            IStrategoTerm h_798 = null;
            IStrategoTerm j_798 = null;
            IStrategoTerm k_798 = null;
            IStrategoTerm m_798 = null;
            IStrategoTerm n_798 = null;
            IStrategoTerm o_798 = null;
            IStrategoTerm p_798 = null;
            IStrategoTerm q_798 = null;
            IStrategoTerm s_798 = null;
            IStrategoTerm t_798 = null;
            IStrategoTerm u_798 = null;
            IStrategoTerm v_798 = null;
            IStrategoTerm w_798 = null;
            IStrategoTerm x_798 = null;
            IStrategoTerm y_798 = null;
            IStrategoTerm z_798 = null;
            IStrategoTerm d_799 = null;
            IStrategoTerm e_799 = null;
            IStrategoTerm f_799 = null;
            IStrategoTerm g_799 = null;
            IStrategoTerm i_799 = null;
            IStrategoTerm j_799 = null;
            IStrategoTerm n_799 = null;
            IStrategoTerm q_799 = null;
            IStrategoTerm r_799 = null;
            IStrategoTerm s_799 = null;
            IStrategoTerm t_799 = null;
            IStrategoTerm u_799 = null;
            t_797 = term.getSubterm(0);
            IStrategoList annos69 = term.getAnnotations();
            if(annos69.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos69).isEmpty())
              break Fail350;
            s_797 = ((IStrategoList)annos69).head();
            IStrategoTerm arg121 = ((IStrategoList)annos69).tail();
            if(arg121.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg121).isEmpty())
              break Fail350;
            x_797 = term;
            b_798 = term;
            y_797 = transformer_debug.const284;
            c_798 = b_798;
            z_797 = transformer_debug.const332;
            d_798 = c_798;
            term = r_enter_0_3.instance.invoke(context, d_798, y_797, z_797, transformer_debug.constLocationInfo450);
            if(term == null)
              break Fail350;
            e_798 = x_797;
            j_798 = g_1145;
            f_798 = transformer_debug.const284;
            k_798 = j_798;
            g_798 = transformer_debug.const332;
            m_798 = k_798;
            h_798 = transformer_debug.const238;
            n_798 = m_798;
            term = s_var_0_4.instance.invoke(context, n_798, f_798, g_798, h_798, transformer_debug.constLocationInfo451);
            if(term == null)
              break Fail350;
            s_798 = h_1145;
            o_798 = transformer_debug.const284;
            t_798 = s_798;
            p_798 = transformer_debug.const332;
            u_798 = t_798;
            q_798 = transformer_debug.const287;
            v_798 = u_798;
            term = s_var_0_4.instance.invoke(context, v_798, o_798, p_798, q_798, transformer_debug.constLocationInfo452);
            if(term == null)
              break Fail350;
            w_798 = e_798;
            d_799 = t_797;
            x_798 = transformer_debug.const284;
            e_799 = d_799;
            y_798 = transformer_debug.const332;
            f_799 = e_799;
            z_798 = transformer_debug.const277;
            g_799 = f_799;
            term = s_var_0_4.instance.invoke(context, g_799, x_798, y_798, z_798, transformer_debug.constLocationInfo453);
            if(term == null)
              break Fail350;
            q_799 = s_797;
            i_799 = transformer_debug.const284;
            r_799 = q_799;
            j_799 = transformer_debug.const332;
            s_799 = r_799;
            n_799 = transformer_debug.const235;
            t_799 = s_799;
            term = s_var_0_4.instance.invoke(context, t_799, i_799, j_799, n_799, transformer_debug.constLocationInfo454);
            if(term == null)
              break Fail350;
            term = w_798;
            u_799 = w_798;
            IStrategoTerm term179 = term;
            Success169:
            { 
              Fail351:
              { 
                IStrategoTerm v_799 = null;
                IStrategoTerm x_799 = null;
                IStrategoTerm z_799 = null;
                IStrategoTerm a_800 = null;
                IStrategoTerm b_800 = null;
                IStrategoTerm c_800 = null;
                IStrategoTerm d_800 = null;
                IStrategoTerm f_800 = null;
                IStrategoTerm g_800 = null;
                IStrategoTerm h_800 = null;
                IStrategoTerm i_800 = null;
                IStrategoTerm j_800 = null;
                IStrategoTerm k_800 = null;
                IStrategoTerm n_800 = null;
                IStrategoTerm o_800 = null;
                IStrategoTerm p_800 = null;
                IStrategoTerm q_800 = null;
                z_799 = term;
                v_799 = transformer_debug.const284;
                a_800 = z_799;
                x_799 = transformer_debug.const332;
                b_800 = a_800;
                term = s_step_0_3.instance.invoke(context, b_800, v_799, x_799, transformer_debug.constLocationInfo455);
                if(term == null)
                  break Fail351;
                f_800 = t_797;
                c_800 = transformer_debug.const284;
                g_800 = f_800;
                d_800 = transformer_debug.const332;
                h_800 = g_800;
                term = s_step_0_3.instance.invoke(context, h_800, c_800, d_800, transformer_debug.constLocationInfo456);
                if(term == null)
                  break Fail351;
                term = var_wrap_s_0_2.instance.invoke(context, term, g_1145, h_1145);
                if(term == null)
                  break Fail351;
                u_797 = term;
                n_800 = term;
                i_800 = transformer_debug.const284;
                o_800 = n_800;
                j_800 = transformer_debug.const332;
                p_800 = o_800;
                k_800 = transformer_debug.const294;
                q_800 = p_800;
                term = s_var_0_4.instance.invoke(context, q_800, i_800, j_800, k_800, transformer_debug.constLocationInfo457);
                if(term == null)
                  break Fail351;
                if(true)
                  break Success169;
              }
              term = term179;
              IStrategoTerm v_797 = null;
              IStrategoTerm w_797 = null;
              IStrategoTerm s_800 = null;
              v_797 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail350;
              w_797 = term;
              s_800 = v_797;
              term = report_with_failure_0_2.instance.invoke(context, s_800, transformer_debug.const335, w_797);
              if(term == null)
                break Fail350;
            }
            term = u_799;
            IStrategoTerm t_800 = null;
            IStrategoTerm u_800 = null;
            IStrategoTerm w_800 = null;
            IStrategoTerm x_800 = null;
            IStrategoTerm y_800 = null;
            if(u_797 == null)
              break Fail350;
            term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consWithClause_1, new IStrategoTerm[]{u_797}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(s_797, (IStrategoList)transformer_debug.constNil1)));
            w_800 = term;
            t_800 = transformer_debug.const284;
            x_800 = w_800;
            u_800 = transformer_debug.const332;
            y_800 = x_800;
            term = r_exit_0_3.instance.invoke(context, y_800, t_800, u_800, transformer_debug.constLocationInfo450);
            if(term == null)
              break Fail350;
            if(true)
              break Success168;
          }
          term = term178;
        }
        if(cons15 == transformer_debug._consWhereClause_1)
        { 
          IStrategoTerm d_794 = null;
          IStrategoTerm e_794 = null;
          IStrategoTerm f_794 = null;
          IStrategoTerm l_794 = null;
          IStrategoTerm o_794 = null;
          IStrategoTerm p_794 = null;
          IStrategoTerm r_794 = null;
          IStrategoTerm s_794 = null;
          IStrategoTerm t_794 = null;
          IStrategoTerm u_794 = null;
          IStrategoTerm v_794 = null;
          IStrategoTerm w_794 = null;
          IStrategoTerm x_794 = null;
          IStrategoTerm a_795 = null;
          IStrategoTerm b_795 = null;
          IStrategoTerm d_795 = null;
          IStrategoTerm e_795 = null;
          IStrategoTerm i_795 = null;
          IStrategoTerm j_795 = null;
          IStrategoTerm l_795 = null;
          IStrategoTerm n_795 = null;
          IStrategoTerm o_795 = null;
          IStrategoTerm p_795 = null;
          IStrategoTerm q_795 = null;
          IStrategoTerm s_795 = null;
          IStrategoTerm t_795 = null;
          IStrategoTerm u_795 = null;
          IStrategoTerm v_795 = null;
          IStrategoTerm x_795 = null;
          IStrategoTerm y_795 = null;
          IStrategoTerm z_795 = null;
          IStrategoTerm a_796 = null;
          IStrategoTerm b_796 = null;
          IStrategoTerm d_796 = null;
          IStrategoTerm e_796 = null;
          IStrategoTerm g_796 = null;
          IStrategoTerm h_796 = null;
          IStrategoTerm i_796 = null;
          IStrategoTerm j_796 = null;
          IStrategoTerm k_796 = null;
          e_794 = term.getSubterm(0);
          IStrategoList annos70 = term.getAnnotations();
          if(annos70.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos70).isEmpty())
            break Fail349;
          d_794 = ((IStrategoList)annos70).head();
          IStrategoTerm arg122 = ((IStrategoList)annos70).tail();
          if(arg122.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg122).isEmpty())
            break Fail349;
          l_794 = term;
          r_794 = term;
          o_794 = transformer_debug.const284;
          s_794 = r_794;
          p_794 = transformer_debug.const332;
          t_794 = s_794;
          term = r_enter_0_3.instance.invoke(context, t_794, o_794, p_794, transformer_debug.constLocationInfo458);
          if(term == null)
            break Fail349;
          u_794 = l_794;
          a_795 = g_1145;
          v_794 = transformer_debug.const284;
          b_795 = a_795;
          w_794 = transformer_debug.const332;
          d_795 = b_795;
          x_794 = transformer_debug.const238;
          e_795 = d_795;
          term = s_var_0_4.instance.invoke(context, e_795, v_794, w_794, x_794, transformer_debug.constLocationInfo459);
          if(term == null)
            break Fail349;
          n_795 = h_1145;
          i_795 = transformer_debug.const284;
          o_795 = n_795;
          j_795 = transformer_debug.const332;
          p_795 = o_795;
          l_795 = transformer_debug.const287;
          q_795 = p_795;
          term = s_var_0_4.instance.invoke(context, q_795, i_795, j_795, l_795, transformer_debug.constLocationInfo460);
          if(term == null)
            break Fail349;
          s_795 = u_794;
          x_795 = e_794;
          t_795 = transformer_debug.const284;
          y_795 = x_795;
          u_795 = transformer_debug.const332;
          z_795 = y_795;
          v_795 = transformer_debug.const277;
          a_796 = z_795;
          term = s_var_0_4.instance.invoke(context, a_796, t_795, u_795, v_795, transformer_debug.constLocationInfo461);
          if(term == null)
            break Fail349;
          g_796 = d_794;
          b_796 = transformer_debug.const284;
          h_796 = g_796;
          d_796 = transformer_debug.const332;
          i_796 = h_796;
          e_796 = transformer_debug.const235;
          j_796 = i_796;
          term = s_var_0_4.instance.invoke(context, j_796, b_796, d_796, e_796, transformer_debug.constLocationInfo462);
          if(term == null)
            break Fail349;
          term = s_795;
          k_796 = s_795;
          IStrategoTerm term180 = term;
          Success170:
          { 
            Fail352:
            { 
              IStrategoTerm l_796 = null;
              IStrategoTerm m_796 = null;
              IStrategoTerm p_796 = null;
              IStrategoTerm q_796 = null;
              IStrategoTerm r_796 = null;
              IStrategoTerm s_796 = null;
              IStrategoTerm t_796 = null;
              IStrategoTerm v_796 = null;
              IStrategoTerm w_796 = null;
              IStrategoTerm x_796 = null;
              IStrategoTerm y_796 = null;
              IStrategoTerm z_796 = null;
              IStrategoTerm a_797 = null;
              IStrategoTerm c_797 = null;
              IStrategoTerm d_797 = null;
              IStrategoTerm e_797 = null;
              IStrategoTerm f_797 = null;
              p_796 = term;
              l_796 = transformer_debug.const284;
              q_796 = p_796;
              m_796 = transformer_debug.const332;
              r_796 = q_796;
              term = s_step_0_3.instance.invoke(context, r_796, l_796, m_796, transformer_debug.constLocationInfo463);
              if(term == null)
                break Fail352;
              v_796 = e_794;
              s_796 = transformer_debug.const284;
              w_796 = v_796;
              t_796 = transformer_debug.const332;
              x_796 = w_796;
              term = s_step_0_3.instance.invoke(context, x_796, s_796, t_796, transformer_debug.constLocationInfo464);
              if(term == null)
                break Fail352;
              term = var_wrap_s_0_2.instance.invoke(context, term, g_1145, h_1145);
              if(term == null)
                break Fail352;
              f_794 = term;
              c_797 = term;
              y_796 = transformer_debug.const284;
              d_797 = c_797;
              z_796 = transformer_debug.const332;
              e_797 = d_797;
              a_797 = transformer_debug.const294;
              f_797 = e_797;
              term = s_var_0_4.instance.invoke(context, f_797, y_796, z_796, a_797, transformer_debug.constLocationInfo465);
              if(term == null)
                break Fail352;
              if(true)
                break Success170;
            }
            term = term180;
            IStrategoTerm i_794 = null;
            IStrategoTerm j_794 = null;
            IStrategoTerm h_797 = null;
            i_794 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail349;
            j_794 = term;
            h_797 = i_794;
            term = report_with_failure_0_2.instance.invoke(context, h_797, transformer_debug.const335, j_794);
            if(term == null)
              break Fail349;
          }
          term = k_796;
          IStrategoTerm i_797 = null;
          IStrategoTerm j_797 = null;
          IStrategoTerm l_797 = null;
          IStrategoTerm m_797 = null;
          IStrategoTerm n_797 = null;
          if(f_794 == null)
            break Fail349;
          term = termFactory.annotateTerm(termFactory.makeAppl(transformer_debug._consWhereClause_1, new IStrategoTerm[]{f_794}), checkListAnnos(termFactory, (IStrategoTerm)termFactory.makeListCons(d_794, (IStrategoList)transformer_debug.constNil1)));
          l_797 = term;
          i_797 = transformer_debug.const284;
          m_797 = l_797;
          j_797 = transformer_debug.const332;
          n_797 = m_797;
          term = r_exit_0_3.instance.invoke(context, n_797, i_797, j_797, transformer_debug.constLocationInfo458);
          if(term == null)
            break Fail349;
        }
        else
        { 
          break Fail349;
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