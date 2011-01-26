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

@SuppressWarnings("all") final class add_s_entry_and_exit_call_0_1_fragment_0 extends Strategy 
{ 
  TermReference m_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail463:
    { 
      IStrategoTerm term268 = term;
      IStrategoConstructor cons21 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success224:
      { 
        if(cons21 == transformer_debug._consSDef_3)
        { 
          Fail464:
          { 
            IStrategoTerm z_987 = null;
            IStrategoTerm a_988 = null;
            IStrategoTerm b_988 = null;
            IStrategoTerm c_988 = null;
            IStrategoTerm d_988 = null;
            IStrategoTerm g_988 = null;
            IStrategoTerm h_988 = null;
            IStrategoTerm i_988 = null;
            IStrategoTerm k_988 = null;
            IStrategoTerm l_988 = null;
            IStrategoTerm m_988 = null;
            IStrategoTerm n_988 = null;
            IStrategoTerm o_988 = null;
            IStrategoTerm p_988 = null;
            IStrategoTerm q_988 = null;
            IStrategoTerm s_988 = null;
            IStrategoTerm t_988 = null;
            IStrategoTerm u_988 = null;
            IStrategoTerm v_988 = null;
            IStrategoTerm w_988 = null;
            IStrategoTerm x_988 = null;
            IStrategoTerm y_988 = null;
            IStrategoTerm z_988 = null;
            IStrategoTerm b_989 = null;
            IStrategoTerm c_989 = null;
            IStrategoTerm d_989 = null;
            IStrategoTerm e_989 = null;
            IStrategoTerm f_989 = null;
            IStrategoTerm g_989 = null;
            IStrategoTerm h_989 = null;
            IStrategoTerm j_989 = null;
            IStrategoTerm k_989 = null;
            IStrategoTerm l_989 = null;
            IStrategoTerm m_989 = null;
            IStrategoTerm n_989 = null;
            IStrategoTerm o_989 = null;
            IStrategoTerm p_989 = null;
            IStrategoTerm r_989 = null;
            IStrategoTerm s_989 = null;
            IStrategoTerm t_989 = null;
            IStrategoTerm u_989 = null;
            IStrategoTerm v_989 = null;
            IStrategoTerm w_989 = null;
            IStrategoTerm x_989 = null;
            IStrategoTerm z_989 = null;
            IStrategoTerm a_990 = null;
            IStrategoTerm b_990 = null;
            IStrategoTerm c_990 = null;
            IStrategoTerm d_990 = null;
            a_988 = term.getSubterm(0);
            z_987 = term.getSubterm(1);
            c_988 = term.getSubterm(2);
            IStrategoList annos111 = term.getAnnotations();
            if(annos111.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos111).isEmpty())
              break Fail464;
            b_988 = ((IStrategoList)annos111).head();
            IStrategoTerm arg207 = ((IStrategoList)annos111).tail();
            if(arg207.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg207).isEmpty())
              break Fail464;
            g_988 = term;
            k_988 = term;
            h_988 = transformer_debug.const513;
            l_988 = k_988;
            i_988 = transformer_debug.const518;
            m_988 = l_988;
            term = r_enter_0_3.instance.invoke(context, m_988, h_988, i_988, transformer_debug.constLocationInfo933);
            if(term == null)
              break Fail464;
            term = g_988;
            n_988 = g_988;
            if(m_1145.value == null)
              break Fail464;
            s_988 = m_1145.value;
            o_988 = transformer_debug.const513;
            t_988 = s_988;
            p_988 = transformer_debug.const518;
            u_988 = t_988;
            q_988 = transformer_debug.const238;
            v_988 = u_988;
            term = s_var_0_4.instance.invoke(context, v_988, o_988, p_988, q_988, transformer_debug.constLocationInfo934);
            if(term == null)
              break Fail464;
            w_988 = n_988;
            b_989 = a_988;
            x_988 = transformer_debug.const513;
            c_989 = b_989;
            y_988 = transformer_debug.const518;
            d_989 = c_989;
            z_988 = transformer_debug.const293;
            e_989 = d_989;
            term = s_var_0_4.instance.invoke(context, e_989, x_988, y_988, z_988, transformer_debug.constLocationInfo935);
            if(term == null)
              break Fail464;
            j_989 = z_987;
            f_989 = transformer_debug.const513;
            k_989 = j_989;
            g_989 = transformer_debug.const518;
            l_989 = k_989;
            h_989 = transformer_debug.const291;
            m_989 = l_989;
            term = s_var_0_4.instance.invoke(context, m_989, f_989, g_989, h_989, transformer_debug.constLocationInfo936);
            if(term == null)
              break Fail464;
            r_989 = c_988;
            n_989 = transformer_debug.const513;
            s_989 = r_989;
            o_989 = transformer_debug.const518;
            t_989 = s_989;
            p_989 = transformer_debug.const277;
            u_989 = t_989;
            term = s_var_0_4.instance.invoke(context, u_989, n_989, o_989, p_989, transformer_debug.constLocationInfo937);
            if(term == null)
              break Fail464;
            z_989 = b_988;
            v_989 = transformer_debug.const513;
            a_990 = z_989;
            w_989 = transformer_debug.const518;
            b_990 = a_990;
            x_989 = transformer_debug.const235;
            c_990 = b_990;
            term = s_var_0_4.instance.invoke(context, c_990, v_989, w_989, x_989, transformer_debug.constLocationInfo938);
            if(term == null)
              break Fail464;
            term = w_988;
            d_990 = w_988;
            IStrategoTerm term269 = term;
            Success225:
            { 
              Fail465:
              { 
                IStrategoTerm e_990 = null;
                IStrategoTerm f_990 = null;
                IStrategoTerm h_990 = null;
                IStrategoTerm i_990 = null;
                IStrategoTerm j_990 = null;
                IStrategoTerm k_990 = null;
                IStrategoTerm l_990 = null;
                IStrategoTerm n_990 = null;
                IStrategoTerm o_990 = null;
                IStrategoTerm p_990 = null;
                IStrategoTerm q_990 = null;
                IStrategoTerm r_990 = null;
                IStrategoTerm s_990 = null;
                IStrategoTerm u_990 = null;
                IStrategoTerm v_990 = null;
                IStrategoTerm w_990 = null;
                IStrategoTerm x_990 = null;
                h_990 = term;
                e_990 = transformer_debug.const513;
                i_990 = h_990;
                f_990 = transformer_debug.const518;
                j_990 = i_990;
                term = s_step_0_3.instance.invoke(context, j_990, e_990, f_990, transformer_debug.constLocationInfo939);
                if(term == null)
                  break Fail465;
                n_990 = c_988;
                k_990 = transformer_debug.const513;
                o_990 = n_990;
                l_990 = transformer_debug.const518;
                p_990 = o_990;
                term = s_step_0_3.instance.invoke(context, p_990, k_990, l_990, transformer_debug.constLocationInfo940);
                if(term == null)
                  break Fail465;
                term = wrap_s_0_3.instance.invoke(context, term, m_1145.value, a_988, b_988);
                if(term == null)
                  break Fail465;
                d_988 = term;
                u_990 = term;
                q_990 = transformer_debug.const513;
                v_990 = u_990;
                r_990 = transformer_debug.const518;
                w_990 = v_990;
                s_990 = transformer_debug.const294;
                x_990 = w_990;
                term = s_var_0_4.instance.invoke(context, x_990, q_990, r_990, s_990, transformer_debug.constLocationInfo941);
                if(term == null)
                  break Fail465;
                if(true)
                  break Success225;
              }
              term = term269;
              IStrategoTerm e_988 = null;
              IStrategoTerm f_988 = null;
              IStrategoTerm z_990 = null;
              e_988 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail464;
              f_988 = term;
              z_990 = e_988;
              term = report_with_failure_0_2.instance.invoke(context, z_990, transformer_debug.const519, f_988);
              if(term == null)
                break Fail464;
            }
            term = d_990;
            IStrategoTerm a_991 = null;
            IStrategoTerm b_991 = null;
            IStrategoTerm d_991 = null;
            IStrategoTerm e_991 = null;
            IStrategoTerm f_991 = null;
            if(d_988 == null)
              break Fail464;
            term = termFactory.makeAppl(transformer_debug._consSDef_3, new IStrategoTerm[]{a_988, z_987, d_988});
            d_991 = term;
            a_991 = transformer_debug.const513;
            e_991 = d_991;
            b_991 = transformer_debug.const518;
            f_991 = e_991;
            term = r_exit_0_3.instance.invoke(context, f_991, a_991, b_991, transformer_debug.constLocationInfo933);
            if(term == null)
              break Fail464;
            if(true)
              break Success224;
          }
          term = term268;
        }
        if(cons21 == transformer_debug._consSDefT_4)
        { 
          IStrategoTerm g_984 = null;
          IStrategoTerm h_984 = null;
          IStrategoTerm i_984 = null;
          IStrategoTerm j_984 = null;
          IStrategoTerm k_984 = null;
          IStrategoTerm l_984 = null;
          IStrategoTerm o_984 = null;
          IStrategoTerm p_984 = null;
          IStrategoTerm q_984 = null;
          IStrategoTerm s_984 = null;
          IStrategoTerm t_984 = null;
          IStrategoTerm u_984 = null;
          IStrategoTerm v_984 = null;
          IStrategoTerm w_984 = null;
          IStrategoTerm x_984 = null;
          IStrategoTerm y_984 = null;
          IStrategoTerm a_985 = null;
          IStrategoTerm b_985 = null;
          IStrategoTerm c_985 = null;
          IStrategoTerm d_985 = null;
          IStrategoTerm e_985 = null;
          IStrategoTerm f_985 = null;
          IStrategoTerm g_985 = null;
          IStrategoTerm h_985 = null;
          IStrategoTerm j_985 = null;
          IStrategoTerm k_985 = null;
          IStrategoTerm l_985 = null;
          IStrategoTerm m_985 = null;
          IStrategoTerm n_985 = null;
          IStrategoTerm o_985 = null;
          IStrategoTerm p_985 = null;
          IStrategoTerm r_985 = null;
          IStrategoTerm s_985 = null;
          IStrategoTerm t_985 = null;
          IStrategoTerm u_985 = null;
          IStrategoTerm v_985 = null;
          IStrategoTerm w_985 = null;
          IStrategoTerm x_985 = null;
          IStrategoTerm z_985 = null;
          IStrategoTerm a_986 = null;
          IStrategoTerm b_986 = null;
          IStrategoTerm c_986 = null;
          IStrategoTerm d_986 = null;
          IStrategoTerm e_986 = null;
          IStrategoTerm f_986 = null;
          IStrategoTerm h_986 = null;
          IStrategoTerm i_986 = null;
          IStrategoTerm j_986 = null;
          IStrategoTerm k_986 = null;
          IStrategoTerm l_986 = null;
          IStrategoTerm m_986 = null;
          IStrategoTerm n_986 = null;
          IStrategoTerm p_986 = null;
          IStrategoTerm q_986 = null;
          IStrategoTerm r_986 = null;
          IStrategoTerm s_986 = null;
          IStrategoTerm t_986 = null;
          i_984 = term.getSubterm(0);
          g_984 = term.getSubterm(1);
          h_984 = term.getSubterm(2);
          k_984 = term.getSubterm(3);
          IStrategoList annos112 = term.getAnnotations();
          if(annos112.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos112).isEmpty())
            break Fail463;
          j_984 = ((IStrategoList)annos112).head();
          IStrategoTerm arg208 = ((IStrategoList)annos112).tail();
          if(arg208.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg208).isEmpty())
            break Fail463;
          o_984 = term;
          s_984 = term;
          p_984 = transformer_debug.const513;
          t_984 = s_984;
          q_984 = transformer_debug.const518;
          u_984 = t_984;
          term = r_enter_0_3.instance.invoke(context, u_984, p_984, q_984, transformer_debug.constLocationInfo942);
          if(term == null)
            break Fail463;
          term = o_984;
          v_984 = o_984;
          if(m_1145.value == null)
            break Fail463;
          a_985 = m_1145.value;
          w_984 = transformer_debug.const513;
          b_985 = a_985;
          x_984 = transformer_debug.const518;
          c_985 = b_985;
          y_984 = transformer_debug.const238;
          d_985 = c_985;
          term = s_var_0_4.instance.invoke(context, d_985, w_984, x_984, y_984, transformer_debug.constLocationInfo943);
          if(term == null)
            break Fail463;
          e_985 = v_984;
          j_985 = i_984;
          f_985 = transformer_debug.const513;
          k_985 = j_985;
          g_985 = transformer_debug.const518;
          l_985 = k_985;
          h_985 = transformer_debug.const293;
          m_985 = l_985;
          term = s_var_0_4.instance.invoke(context, m_985, f_985, g_985, h_985, transformer_debug.constLocationInfo944);
          if(term == null)
            break Fail463;
          r_985 = g_984;
          n_985 = transformer_debug.const513;
          s_985 = r_985;
          o_985 = transformer_debug.const518;
          t_985 = s_985;
          p_985 = transformer_debug.const291;
          u_985 = t_985;
          term = s_var_0_4.instance.invoke(context, u_985, n_985, o_985, p_985, transformer_debug.constLocationInfo945);
          if(term == null)
            break Fail463;
          z_985 = h_984;
          v_985 = transformer_debug.const513;
          a_986 = z_985;
          w_985 = transformer_debug.const518;
          b_986 = a_986;
          x_985 = transformer_debug.const374;
          c_986 = b_986;
          term = s_var_0_4.instance.invoke(context, c_986, v_985, w_985, x_985, transformer_debug.constLocationInfo946);
          if(term == null)
            break Fail463;
          h_986 = k_984;
          d_986 = transformer_debug.const513;
          i_986 = h_986;
          e_986 = transformer_debug.const518;
          j_986 = i_986;
          f_986 = transformer_debug.const277;
          k_986 = j_986;
          term = s_var_0_4.instance.invoke(context, k_986, d_986, e_986, f_986, transformer_debug.constLocationInfo947);
          if(term == null)
            break Fail463;
          p_986 = j_984;
          l_986 = transformer_debug.const513;
          q_986 = p_986;
          m_986 = transformer_debug.const518;
          r_986 = q_986;
          n_986 = transformer_debug.const235;
          s_986 = r_986;
          term = s_var_0_4.instance.invoke(context, s_986, l_986, m_986, n_986, transformer_debug.constLocationInfo948);
          if(term == null)
            break Fail463;
          term = e_985;
          t_986 = e_985;
          IStrategoTerm term270 = term;
          Success226:
          { 
            Fail466:
            { 
              IStrategoTerm u_986 = null;
              IStrategoTerm v_986 = null;
              IStrategoTerm x_986 = null;
              IStrategoTerm y_986 = null;
              IStrategoTerm z_986 = null;
              IStrategoTerm a_987 = null;
              IStrategoTerm b_987 = null;
              IStrategoTerm d_987 = null;
              IStrategoTerm e_987 = null;
              IStrategoTerm f_987 = null;
              IStrategoTerm g_987 = null;
              IStrategoTerm h_987 = null;
              IStrategoTerm i_987 = null;
              IStrategoTerm k_987 = null;
              IStrategoTerm l_987 = null;
              IStrategoTerm m_987 = null;
              IStrategoTerm n_987 = null;
              x_986 = term;
              u_986 = transformer_debug.const513;
              y_986 = x_986;
              v_986 = transformer_debug.const518;
              z_986 = y_986;
              term = s_step_0_3.instance.invoke(context, z_986, u_986, v_986, transformer_debug.constLocationInfo949);
              if(term == null)
                break Fail466;
              d_987 = k_984;
              a_987 = transformer_debug.const513;
              e_987 = d_987;
              b_987 = transformer_debug.const518;
              f_987 = e_987;
              term = s_step_0_3.instance.invoke(context, f_987, a_987, b_987, transformer_debug.constLocationInfo950);
              if(term == null)
                break Fail466;
              term = wrap_s_0_3.instance.invoke(context, term, m_1145.value, i_984, j_984);
              if(term == null)
                break Fail466;
              l_984 = term;
              k_987 = term;
              g_987 = transformer_debug.const513;
              l_987 = k_987;
              h_987 = transformer_debug.const518;
              m_987 = l_987;
              i_987 = transformer_debug.const294;
              n_987 = m_987;
              term = s_var_0_4.instance.invoke(context, n_987, g_987, h_987, i_987, transformer_debug.constLocationInfo951);
              if(term == null)
                break Fail466;
              if(true)
                break Success226;
            }
            term = term270;
            IStrategoTerm m_984 = null;
            IStrategoTerm n_984 = null;
            IStrategoTerm p_987 = null;
            m_984 = term;
            term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
            if(term == null)
              break Fail463;
            n_984 = term;
            p_987 = m_984;
            term = report_with_failure_0_2.instance.invoke(context, p_987, transformer_debug.const519, n_984);
            if(term == null)
              break Fail463;
          }
          term = t_986;
          IStrategoTerm q_987 = null;
          IStrategoTerm r_987 = null;
          IStrategoTerm t_987 = null;
          IStrategoTerm u_987 = null;
          IStrategoTerm v_987 = null;
          if(l_984 == null)
            break Fail463;
          term = termFactory.makeAppl(transformer_debug._consSDefT_4, new IStrategoTerm[]{i_984, g_984, h_984, l_984});
          t_987 = term;
          q_987 = transformer_debug.const513;
          u_987 = t_987;
          r_987 = transformer_debug.const518;
          v_987 = u_987;
          term = r_exit_0_3.instance.invoke(context, v_987, q_987, r_987, transformer_debug.constLocationInfo942);
          if(term == null)
            break Fail463;
        }
        else
        { 
          break Fail463;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}