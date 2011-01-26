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

@SuppressWarnings("all") final class add_r_entry_and_exit_call_0_1_fragment_0 extends Strategy 
{ 
  TermReference n_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail457:
    { 
      IStrategoTerm term274 = term;
      IStrategoConstructor cons20 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success220:
      { 
        if(cons20 == transformer_debug._consRDef_3)
        { 
          Fail458:
          { 
            IStrategoTerm t_1004 = null;
            IStrategoTerm u_1004 = null;
            IStrategoTerm v_1004 = null;
            IStrategoTerm w_1004 = null;
            IStrategoTerm x_1004 = null;
            IStrategoTerm a_1005 = null;
            IStrategoTerm b_1005 = null;
            IStrategoTerm c_1005 = null;
            IStrategoTerm e_1005 = null;
            IStrategoTerm f_1005 = null;
            IStrategoTerm g_1005 = null;
            IStrategoTerm h_1005 = null;
            IStrategoTerm i_1005 = null;
            IStrategoTerm j_1005 = null;
            IStrategoTerm k_1005 = null;
            IStrategoTerm m_1005 = null;
            IStrategoTerm n_1005 = null;
            IStrategoTerm o_1005 = null;
            IStrategoTerm p_1005 = null;
            IStrategoTerm q_1005 = null;
            IStrategoTerm r_1005 = null;
            IStrategoTerm s_1005 = null;
            IStrategoTerm t_1005 = null;
            IStrategoTerm v_1005 = null;
            IStrategoTerm w_1005 = null;
            IStrategoTerm x_1005 = null;
            IStrategoTerm y_1005 = null;
            IStrategoTerm z_1005 = null;
            IStrategoTerm a_1006 = null;
            IStrategoTerm b_1006 = null;
            IStrategoTerm d_1006 = null;
            IStrategoTerm e_1006 = null;
            IStrategoTerm f_1006 = null;
            IStrategoTerm g_1006 = null;
            IStrategoTerm h_1006 = null;
            IStrategoTerm i_1006 = null;
            IStrategoTerm j_1006 = null;
            IStrategoTerm l_1006 = null;
            IStrategoTerm m_1006 = null;
            IStrategoTerm n_1006 = null;
            IStrategoTerm o_1006 = null;
            IStrategoTerm p_1006 = null;
            IStrategoTerm q_1006 = null;
            IStrategoTerm r_1006 = null;
            IStrategoTerm t_1006 = null;
            IStrategoTerm u_1006 = null;
            IStrategoTerm v_1006 = null;
            IStrategoTerm w_1006 = null;
            IStrategoTerm x_1006 = null;
            u_1004 = term.getSubterm(0);
            t_1004 = term.getSubterm(1);
            w_1004 = term.getSubterm(2);
            IStrategoList annos114 = term.getAnnotations();
            if(annos114.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos114).isEmpty())
              break Fail458;
            v_1004 = ((IStrategoList)annos114).head();
            IStrategoTerm arg210 = ((IStrategoList)annos114).tail();
            if(arg210.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg210).isEmpty())
              break Fail458;
            a_1005 = term;
            e_1005 = term;
            b_1005 = transformer_debug.const513;
            f_1005 = e_1005;
            c_1005 = transformer_debug.const530;
            g_1005 = f_1005;
            term = r_enter_0_3.instance.invoke(context, g_1005, b_1005, c_1005, transformer_debug.constLocationInfo980);
            if(term == null)
              break Fail458;
            term = a_1005;
            h_1005 = a_1005;
            if(n_1145.value == null)
              break Fail458;
            m_1005 = n_1145.value;
            i_1005 = transformer_debug.const513;
            n_1005 = m_1005;
            j_1005 = transformer_debug.const530;
            o_1005 = n_1005;
            k_1005 = transformer_debug.const238;
            p_1005 = o_1005;
            term = s_var_0_4.instance.invoke(context, p_1005, i_1005, j_1005, k_1005, transformer_debug.constLocationInfo981);
            if(term == null)
              break Fail458;
            q_1005 = h_1005;
            v_1005 = u_1004;
            r_1005 = transformer_debug.const513;
            w_1005 = v_1005;
            s_1005 = transformer_debug.const530;
            x_1005 = w_1005;
            t_1005 = transformer_debug.const287;
            y_1005 = x_1005;
            term = s_var_0_4.instance.invoke(context, y_1005, r_1005, s_1005, t_1005, transformer_debug.constLocationInfo982);
            if(term == null)
              break Fail458;
            d_1006 = t_1004;
            z_1005 = transformer_debug.const513;
            e_1006 = d_1006;
            a_1006 = transformer_debug.const530;
            f_1006 = e_1006;
            b_1006 = transformer_debug.const291;
            g_1006 = f_1006;
            term = s_var_0_4.instance.invoke(context, g_1006, z_1005, a_1006, b_1006, transformer_debug.constLocationInfo983);
            if(term == null)
              break Fail458;
            l_1006 = w_1004;
            h_1006 = transformer_debug.const513;
            m_1006 = l_1006;
            i_1006 = transformer_debug.const530;
            n_1006 = m_1006;
            j_1006 = transformer_debug.const288;
            o_1006 = n_1006;
            term = s_var_0_4.instance.invoke(context, o_1006, h_1006, i_1006, j_1006, transformer_debug.constLocationInfo984);
            if(term == null)
              break Fail458;
            t_1006 = v_1004;
            p_1006 = transformer_debug.const513;
            u_1006 = t_1006;
            q_1006 = transformer_debug.const530;
            v_1006 = u_1006;
            r_1006 = transformer_debug.const235;
            w_1006 = v_1006;
            term = s_var_0_4.instance.invoke(context, w_1006, p_1006, q_1006, r_1006, transformer_debug.constLocationInfo985);
            if(term == null)
              break Fail458;
            term = q_1005;
            x_1006 = q_1005;
            IStrategoTerm term275 = term;
            Success221:
            { 
              Fail459:
              { 
                IStrategoTerm y_1006 = null;
                IStrategoTerm z_1006 = null;
                IStrategoTerm b_1007 = null;
                IStrategoTerm c_1007 = null;
                IStrategoTerm d_1007 = null;
                IStrategoTerm e_1007 = null;
                IStrategoTerm f_1007 = null;
                IStrategoTerm h_1007 = null;
                IStrategoTerm i_1007 = null;
                IStrategoTerm j_1007 = null;
                IStrategoTerm k_1007 = null;
                IStrategoTerm l_1007 = null;
                IStrategoTerm m_1007 = null;
                IStrategoTerm o_1007 = null;
                IStrategoTerm p_1007 = null;
                IStrategoTerm q_1007 = null;
                IStrategoTerm r_1007 = null;
                b_1007 = term;
                y_1006 = transformer_debug.const513;
                c_1007 = b_1007;
                z_1006 = transformer_debug.const530;
                d_1007 = c_1007;
                term = s_step_0_3.instance.invoke(context, d_1007, y_1006, z_1006, transformer_debug.constLocationInfo986);
                if(term == null)
                  break Fail459;
                h_1007 = w_1004;
                e_1007 = transformer_debug.const513;
                i_1007 = h_1007;
                f_1007 = transformer_debug.const530;
                j_1007 = i_1007;
                term = s_step_0_3.instance.invoke(context, j_1007, e_1007, f_1007, transformer_debug.constLocationInfo987);
                if(term == null)
                  break Fail459;
                term = wrap_r_0_3.instance.invoke(context, term, n_1145.value, u_1004, v_1004);
                if(term == null)
                  break Fail459;
                x_1004 = term;
                o_1007 = term;
                k_1007 = transformer_debug.const513;
                p_1007 = o_1007;
                l_1007 = transformer_debug.const530;
                q_1007 = p_1007;
                m_1007 = transformer_debug.const289;
                r_1007 = q_1007;
                term = s_var_0_4.instance.invoke(context, r_1007, k_1007, l_1007, m_1007, transformer_debug.constLocationInfo988);
                if(term == null)
                  break Fail459;
                if(true)
                  break Success221;
              }
              term = term275;
              IStrategoTerm y_1004 = null;
              IStrategoTerm z_1004 = null;
              IStrategoTerm t_1007 = null;
              y_1004 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail458;
              z_1004 = term;
              t_1007 = y_1004;
              term = report_with_failure_0_2.instance.invoke(context, t_1007, transformer_debug.const531, z_1004);
              if(term == null)
                break Fail458;
            }
            term = x_1006;
            IStrategoTerm u_1007 = null;
            IStrategoTerm v_1007 = null;
            IStrategoTerm x_1007 = null;
            IStrategoTerm y_1007 = null;
            IStrategoTerm z_1007 = null;
            if(x_1004 == null)
              break Fail458;
            term = termFactory.makeAppl(transformer_debug._consRDef_3, new IStrategoTerm[]{u_1004, t_1004, x_1004});
            x_1007 = term;
            u_1007 = transformer_debug.const513;
            y_1007 = x_1007;
            v_1007 = transformer_debug.const530;
            z_1007 = y_1007;
            term = r_exit_0_3.instance.invoke(context, z_1007, u_1007, v_1007, transformer_debug.constLocationInfo980);
            if(term == null)
              break Fail458;
            if(true)
              break Success220;
          }
          term = term274;
        }
        if(cons20 == transformer_debug._consRDefT_4)
        { 
          IStrategoTerm a_1001 = null;
          IStrategoTerm b_1001 = null;
          IStrategoTerm c_1001 = null;
          IStrategoTerm d_1001 = null;
          IStrategoTerm e_1001 = null;
          IStrategoTerm f_1001 = null;
          IStrategoTerm i_1001 = null;
          IStrategoTerm j_1001 = null;
          IStrategoTerm k_1001 = null;
          IStrategoTerm m_1001 = null;
          IStrategoTerm n_1001 = null;
          IStrategoTerm o_1001 = null;
          IStrategoTerm p_1001 = null;
          IStrategoTerm q_1001 = null;
          IStrategoTerm r_1001 = null;
          IStrategoTerm s_1001 = null;
          IStrategoTerm u_1001 = null;
          IStrategoTerm v_1001 = null;
          IStrategoTerm w_1001 = null;
          IStrategoTerm x_1001 = null;
          IStrategoTerm y_1001 = null;
          IStrategoTerm z_1001 = null;
          IStrategoTerm a_1002 = null;
          IStrategoTerm b_1002 = null;
          IStrategoTerm d_1002 = null;
          IStrategoTerm e_1002 = null;
          IStrategoTerm f_1002 = null;
          IStrategoTerm g_1002 = null;
          IStrategoTerm h_1002 = null;
          IStrategoTerm i_1002 = null;
          IStrategoTerm j_1002 = null;
          IStrategoTerm l_1002 = null;
          IStrategoTerm m_1002 = null;
          IStrategoTerm n_1002 = null;
          IStrategoTerm o_1002 = null;
          IStrategoTerm p_1002 = null;
          IStrategoTerm q_1002 = null;
          IStrategoTerm r_1002 = null;
          IStrategoTerm t_1002 = null;
          IStrategoTerm u_1002 = null;
          IStrategoTerm v_1002 = null;
          IStrategoTerm w_1002 = null;
          IStrategoTerm x_1002 = null;
          IStrategoTerm y_1002 = null;
          IStrategoTerm z_1002 = null;
          IStrategoTerm b_1003 = null;
          IStrategoTerm c_1003 = null;
          IStrategoTerm d_1003 = null;
          IStrategoTerm e_1003 = null;
          IStrategoTerm f_1003 = null;
          IStrategoTerm g_1003 = null;
          IStrategoTerm h_1003 = null;
          IStrategoTerm j_1003 = null;
          IStrategoTerm k_1003 = null;
          IStrategoTerm l_1003 = null;
          IStrategoTerm m_1003 = null;
          IStrategoTerm n_1003 = null;
          c_1001 = term.getSubterm(0);
          a_1001 = term.getSubterm(1);
          b_1001 = term.getSubterm(2);
          e_1001 = term.getSubterm(3);
          IStrategoList annos115 = term.getAnnotations();
          if(annos115.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos115).isEmpty())
            break Fail457;
          d_1001 = ((IStrategoList)annos115).head();
          IStrategoTerm arg211 = ((IStrategoList)annos115).tail();
          if(arg211.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg211).isEmpty())
            break Fail457;
          i_1001 = term;
          m_1001 = term;
          j_1001 = transformer_debug.const513;
          n_1001 = m_1001;
          k_1001 = transformer_debug.const530;
          o_1001 = n_1001;
          term = r_enter_0_3.instance.invoke(context, o_1001, j_1001, k_1001, transformer_debug.constLocationInfo989);
          if(term == null)
            break Fail457;
          term = i_1001;
          p_1001 = i_1001;
          if(n_1145.value == null)
            break Fail457;
          u_1001 = n_1145.value;
          q_1001 = transformer_debug.const513;
          v_1001 = u_1001;
          r_1001 = transformer_debug.const530;
          w_1001 = v_1001;
          s_1001 = transformer_debug.const238;
          x_1001 = w_1001;
          term = s_var_0_4.instance.invoke(context, x_1001, q_1001, r_1001, s_1001, transformer_debug.constLocationInfo990);
          if(term == null)
            break Fail457;
          y_1001 = p_1001;
          d_1002 = c_1001;
          z_1001 = transformer_debug.const513;
          e_1002 = d_1002;
          a_1002 = transformer_debug.const530;
          f_1002 = e_1002;
          b_1002 = transformer_debug.const287;
          g_1002 = f_1002;
          term = s_var_0_4.instance.invoke(context, g_1002, z_1001, a_1002, b_1002, transformer_debug.constLocationInfo991);
          if(term == null)
            break Fail457;
          l_1002 = a_1001;
          h_1002 = transformer_debug.const513;
          m_1002 = l_1002;
          i_1002 = transformer_debug.const530;
          n_1002 = m_1002;
          j_1002 = transformer_debug.const291;
          o_1002 = n_1002;
          term = s_var_0_4.instance.invoke(context, o_1002, h_1002, i_1002, j_1002, transformer_debug.constLocationInfo992);
          if(term == null)
            break Fail457;
          t_1002 = b_1001;
          p_1002 = transformer_debug.const513;
          u_1002 = t_1002;
          q_1002 = transformer_debug.const530;
          v_1002 = u_1002;
          r_1002 = transformer_debug.const374;
          w_1002 = v_1002;
          term = s_var_0_4.instance.invoke(context, w_1002, p_1002, q_1002, r_1002, transformer_debug.constLocationInfo993);
          if(term == null)
            break Fail457;
          b_1003 = e_1001;
          x_1002 = transformer_debug.const513;
          c_1003 = b_1003;
          y_1002 = transformer_debug.const530;
          d_1003 = c_1003;
          z_1002 = transformer_debug.const288;
          e_1003 = d_1003;
          term = s_var_0_4.instance.invoke(context, e_1003, x_1002, y_1002, z_1002, transformer_debug.constLocationInfo994);
          if(term == null)
            break Fail457;
          j_1003 = d_1001;
          f_1003 = transformer_debug.const513;
          k_1003 = j_1003;
          g_1003 = transformer_debug.const530;
          l_1003 = k_1003;
          h_1003 = transformer_debug.const235;
          m_1003 = l_1003;
          term = s_var_0_4.instance.invoke(context, m_1003, f_1003, g_1003, h_1003, transformer_debug.constLocationInfo995);
          if(term == null)
            break Fail457;
          term = y_1001;
          n_1003 = y_1001;
          IStrategoTerm term276 = term;
          Success222:
          { 
            Fail460:
            { 
              IStrategoTerm o_1003 = null;
              IStrategoTerm p_1003 = null;
              IStrategoTerm r_1003 = null;
              IStrategoTerm s_1003 = null;
              IStrategoTerm t_1003 = null;
              IStrategoTerm u_1003 = null;
              IStrategoTerm v_1003 = null;
              IStrategoTerm x_1003 = null;
              IStrategoTerm y_1003 = null;
              IStrategoTerm z_1003 = null;
              IStrategoTerm a_1004 = null;
              IStrategoTerm b_1004 = null;
              IStrategoTerm c_1004 = null;
              IStrategoTerm e_1004 = null;
              IStrategoTerm f_1004 = null;
              IStrategoTerm g_1004 = null;
              IStrategoTerm h_1004 = null;
              r_1003 = term;
              o_1003 = transformer_debug.const513;
              s_1003 = r_1003;
              p_1003 = transformer_debug.const530;
              t_1003 = s_1003;
              term = s_step_0_3.instance.invoke(context, t_1003, o_1003, p_1003, transformer_debug.constLocationInfo996);
              if(term == null)
                break Fail460;
              x_1003 = e_1001;
              u_1003 = transformer_debug.const513;
              y_1003 = x_1003;
              v_1003 = transformer_debug.const530;
              z_1003 = y_1003;
              term = s_step_0_3.instance.invoke(context, z_1003, u_1003, v_1003, transformer_debug.constLocationInfo997);
              if(term == null)
                break Fail460;
              term = wrap_r_0_3.instance.invoke(context, term, n_1145.value, c_1001, d_1001);
              if(term == null)
                break Fail460;
              f_1001 = term;
              e_1004 = term;
              a_1004 = transformer_debug.const513;
              f_1004 = e_1004;
              b_1004 = transformer_debug.const530;
              g_1004 = f_1004;
              c_1004 = transformer_debug.const289;
              h_1004 = g_1004;
              term = s_var_0_4.instance.invoke(context, h_1004, a_1004, b_1004, c_1004, transformer_debug.constLocationInfo998);
              if(term == null)
                break Fail460;
              if(true)
                break Success222;
            }
            term = term276;
            IStrategoTerm g_1001 = null;
            IStrategoTerm h_1001 = null;
            IStrategoTerm j_1004 = null;
            g_1001 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail457;
            h_1001 = term;
            j_1004 = g_1001;
            term = report_with_failure_0_2.instance.invoke(context, j_1004, transformer_debug.const531, h_1001);
            if(term == null)
              break Fail457;
          }
          term = n_1003;
          IStrategoTerm k_1004 = null;
          IStrategoTerm l_1004 = null;
          IStrategoTerm n_1004 = null;
          IStrategoTerm o_1004 = null;
          IStrategoTerm p_1004 = null;
          if(f_1001 == null)
            break Fail457;
          term = termFactory.makeAppl(transformer_debug._consRDefT_4, new IStrategoTerm[]{c_1001, a_1001, b_1001, f_1001});
          n_1004 = term;
          k_1004 = transformer_debug.const513;
          o_1004 = n_1004;
          l_1004 = transformer_debug.const530;
          p_1004 = o_1004;
          term = r_exit_0_3.instance.invoke(context, p_1004, k_1004, l_1004, transformer_debug.constLocationInfo989);
          if(term == null)
            break Fail457;
        }
        else
        { 
          break Fail457;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}