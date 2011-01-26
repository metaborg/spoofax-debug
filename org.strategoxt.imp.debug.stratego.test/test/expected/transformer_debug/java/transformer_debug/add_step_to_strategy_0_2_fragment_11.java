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

@SuppressWarnings("all") final class add_step_to_strategy_0_2_fragment_11 extends Strategy 
{ 
  TermReference k_1145;

  TermReference l_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail491:
    { 
      IStrategoTerm term214 = term;
      IStrategoConstructor cons26 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success243:
      { 
        if(cons26 == transformer_debug._consPrimNoArgs_1)
        { 
          Fail492:
          { 
            IStrategoTerm v_937 = null;
            IStrategoTerm x_937 = null;
            IStrategoTerm y_937 = null;
            IStrategoTerm z_937 = null;
            IStrategoTerm c_938 = null;
            IStrategoTerm d_938 = null;
            IStrategoTerm e_938 = null;
            IStrategoTerm g_938 = null;
            IStrategoTerm h_938 = null;
            IStrategoTerm i_938 = null;
            IStrategoTerm j_938 = null;
            IStrategoTerm k_938 = null;
            IStrategoTerm l_938 = null;
            IStrategoTerm m_938 = null;
            IStrategoTerm o_938 = null;
            IStrategoTerm p_938 = null;
            IStrategoTerm q_938 = null;
            IStrategoTerm r_938 = null;
            IStrategoTerm s_938 = null;
            IStrategoTerm t_938 = null;
            IStrategoTerm u_938 = null;
            IStrategoTerm w_938 = null;
            IStrategoTerm x_938 = null;
            IStrategoTerm y_938 = null;
            IStrategoTerm z_938 = null;
            IStrategoTerm a_939 = null;
            IStrategoTerm b_939 = null;
            IStrategoTerm c_939 = null;
            IStrategoTerm d_939 = null;
            IStrategoTerm f_939 = null;
            IStrategoTerm g_939 = null;
            IStrategoTerm h_939 = null;
            IStrategoTerm i_939 = null;
            IStrategoTerm j_939 = null;
            IStrategoTerm k_939 = null;
            IStrategoTerm l_939 = null;
            IStrategoTerm n_939 = null;
            IStrategoTerm o_939 = null;
            IStrategoTerm p_939 = null;
            IStrategoTerm q_939 = null;
            IStrategoTerm r_939 = null;
            y_937 = term;
            IStrategoList annos86 = term.getAnnotations();
            if(annos86.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos86).isEmpty())
              break Fail492;
            v_937 = ((IStrategoList)annos86).head();
            IStrategoTerm arg151 = ((IStrategoList)annos86).tail();
            if(arg151.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg151).isEmpty())
              break Fail492;
            c_938 = term;
            g_938 = term;
            d_938 = transformer_debug.const370;
            h_938 = g_938;
            e_938 = transformer_debug.const377;
            i_938 = h_938;
            term = r_enter_0_3.instance.invoke(context, i_938, d_938, e_938, transformer_debug.constLocationInfo660);
            if(term == null)
              break Fail492;
            term = c_938;
            j_938 = c_938;
            if(k_1145.value == null)
              break Fail492;
            o_938 = k_1145.value;
            k_938 = transformer_debug.const370;
            p_938 = o_938;
            l_938 = transformer_debug.const377;
            q_938 = p_938;
            m_938 = transformer_debug.const238;
            r_938 = q_938;
            term = s_var_0_4.instance.invoke(context, r_938, k_938, l_938, m_938, transformer_debug.constLocationInfo661);
            if(term == null)
              break Fail492;
            if(l_1145.value == null)
              break Fail492;
            w_938 = l_1145.value;
            s_938 = transformer_debug.const370;
            x_938 = w_938;
            t_938 = transformer_debug.const377;
            y_938 = x_938;
            u_938 = transformer_debug.const239;
            z_938 = y_938;
            term = s_var_0_4.instance.invoke(context, z_938, s_938, t_938, u_938, transformer_debug.constLocationInfo662);
            if(term == null)
              break Fail492;
            a_939 = j_938;
            f_939 = y_937;
            b_939 = transformer_debug.const370;
            g_939 = f_939;
            c_939 = transformer_debug.const377;
            h_939 = g_939;
            d_939 = transformer_debug.const277;
            i_939 = h_939;
            term = s_var_0_4.instance.invoke(context, i_939, b_939, c_939, d_939, transformer_debug.constLocationInfo663);
            if(term == null)
              break Fail492;
            n_939 = v_937;
            j_939 = transformer_debug.const370;
            o_939 = n_939;
            k_939 = transformer_debug.const377;
            p_939 = o_939;
            l_939 = transformer_debug.const381;
            q_939 = p_939;
            term = s_var_0_4.instance.invoke(context, q_939, j_939, k_939, l_939, transformer_debug.constLocationInfo664);
            if(term == null)
              break Fail492;
            term = a_939;
            r_939 = a_939;
            IStrategoTerm term215 = term;
            Success244:
            { 
              Fail493:
              { 
                IStrategoTerm s_939 = null;
                IStrategoTerm u_939 = null;
                IStrategoTerm w_939 = null;
                IStrategoTerm x_939 = null;
                IStrategoTerm y_939 = null;
                IStrategoTerm z_939 = null;
                IStrategoTerm b_940 = null;
                IStrategoTerm c_940 = null;
                IStrategoTerm e_940 = null;
                IStrategoTerm f_940 = null;
                IStrategoTerm g_940 = null;
                IStrategoTerm h_940 = null;
                IStrategoTerm i_940 = null;
                IStrategoTerm l_940 = null;
                IStrategoTerm n_940 = null;
                IStrategoTerm q_940 = null;
                IStrategoTerm r_940 = null;
                IStrategoTerm s_940 = null;
                IStrategoTerm t_940 = null;
                IStrategoTerm u_940 = null;
                IStrategoTerm w_940 = null;
                IStrategoTerm x_940 = null;
                IStrategoTerm y_940 = null;
                IStrategoTerm z_940 = null;
                IStrategoTerm a_941 = null;
                IStrategoTerm c_941 = null;
                IStrategoTerm h_941 = null;
                IStrategoTerm i_941 = null;
                IStrategoTerm k_941 = null;
                IStrategoTerm l_941 = null;
                w_939 = term;
                s_939 = transformer_debug.const370;
                x_939 = w_939;
                u_939 = transformer_debug.const377;
                y_939 = x_939;
                term = s_step_0_3.instance.invoke(context, y_939, s_939, u_939, transformer_debug.constLocationInfo665);
                if(term == null)
                  break Fail493;
                e_940 = term;
                b_940 = transformer_debug.const370;
                f_940 = e_940;
                c_940 = transformer_debug.const377;
                g_940 = f_940;
                term = s_step_0_3.instance.invoke(context, g_940, b_940, c_940, transformer_debug.constLocationInfo666);
                if(term == null)
                  break Fail493;
                term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, v_937);
                if(term == null)
                  break Fail493;
                z_939 = term;
                x_937 = term;
                n_940 = z_939;
                h_940 = transformer_debug.const370;
                q_940 = n_940;
                i_940 = transformer_debug.const377;
                r_940 = q_940;
                l_940 = transformer_debug.const383;
                s_940 = r_940;
                term = s_var_0_4.instance.invoke(context, s_940, h_940, i_940, l_940, transformer_debug.constLocationInfo667);
                if(term == null)
                  break Fail493;
                w_940 = term;
                t_940 = transformer_debug.const370;
                x_940 = w_940;
                u_940 = transformer_debug.const377;
                y_940 = x_940;
                term = s_step_0_3.instance.invoke(context, y_940, t_940, u_940, transformer_debug.constLocationInfo668);
                if(term == null)
                  break Fail493;
                term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{x_937, y_937});
                z_937 = term;
                h_941 = term;
                z_940 = transformer_debug.const370;
                i_941 = h_941;
                a_941 = transformer_debug.const377;
                k_941 = i_941;
                c_941 = transformer_debug.const294;
                l_941 = k_941;
                term = s_var_0_4.instance.invoke(context, l_941, z_940, a_941, c_941, transformer_debug.constLocationInfo669);
                if(term == null)
                  break Fail493;
                if(true)
                  break Success244;
              }
              term = term215;
              IStrategoTerm a_938 = null;
              IStrategoTerm b_938 = null;
              IStrategoTerm n_941 = null;
              a_938 = term;
              term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
              if(term == null)
                break Fail492;
              b_938 = term;
              n_941 = a_938;
              term = report_with_failure_0_2.instance.invoke(context, n_941, transformer_debug.const384, b_938);
              if(term == null)
                break Fail492;
            }
            term = r_939;
            IStrategoTerm o_941 = null;
            IStrategoTerm p_941 = null;
            IStrategoTerm s_941 = null;
            IStrategoTerm t_941 = null;
            IStrategoTerm u_941 = null;
            if(z_937 == null)
              break Fail492;
            s_941 = z_937;
            o_941 = transformer_debug.const370;
            t_941 = s_941;
            p_941 = transformer_debug.const377;
            u_941 = t_941;
            term = r_exit_0_3.instance.invoke(context, u_941, o_941, p_941, transformer_debug.constLocationInfo660);
            if(term == null)
              break Fail492;
            if(true)
              break Success243;
          }
          term = term214;
        }
        Success245:
        { 
          if(cons26 == transformer_debug._consPrim_2)
          { 
            Fail494:
            { 
              IStrategoTerm n_933 = null;
              IStrategoTerm o_933 = null;
              IStrategoTerm p_933 = null;
              IStrategoTerm q_933 = null;
              IStrategoTerm t_933 = null;
              IStrategoTerm u_933 = null;
              IStrategoTerm v_933 = null;
              IStrategoTerm x_933 = null;
              IStrategoTerm y_933 = null;
              IStrategoTerm z_933 = null;
              IStrategoTerm b_934 = null;
              IStrategoTerm c_934 = null;
              IStrategoTerm d_934 = null;
              IStrategoTerm e_934 = null;
              IStrategoTerm g_934 = null;
              IStrategoTerm h_934 = null;
              IStrategoTerm i_934 = null;
              IStrategoTerm j_934 = null;
              IStrategoTerm k_934 = null;
              IStrategoTerm l_934 = null;
              IStrategoTerm m_934 = null;
              IStrategoTerm o_934 = null;
              IStrategoTerm p_934 = null;
              IStrategoTerm s_934 = null;
              IStrategoTerm t_934 = null;
              IStrategoTerm u_934 = null;
              IStrategoTerm x_934 = null;
              IStrategoTerm y_934 = null;
              IStrategoTerm z_934 = null;
              IStrategoTerm b_935 = null;
              IStrategoTerm c_935 = null;
              IStrategoTerm d_935 = null;
              IStrategoTerm e_935 = null;
              IStrategoTerm f_935 = null;
              IStrategoTerm g_935 = null;
              IStrategoTerm h_935 = null;
              IStrategoTerm l_935 = null;
              IStrategoTerm m_935 = null;
              IStrategoTerm n_935 = null;
              IStrategoTerm o_935 = null;
              IStrategoTerm p_935 = null;
              p_933 = term;
              IStrategoList annos87 = term.getAnnotations();
              if(annos87.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos87).isEmpty())
                break Fail494;
              n_933 = ((IStrategoList)annos87).head();
              IStrategoTerm arg154 = ((IStrategoList)annos87).tail();
              if(arg154.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg154).isEmpty())
                break Fail494;
              t_933 = term;
              x_933 = term;
              u_933 = transformer_debug.const370;
              y_933 = x_933;
              v_933 = transformer_debug.const377;
              z_933 = y_933;
              term = r_enter_0_3.instance.invoke(context, z_933, u_933, v_933, transformer_debug.constLocationInfo670);
              if(term == null)
                break Fail494;
              term = t_933;
              b_934 = t_933;
              if(k_1145.value == null)
                break Fail494;
              g_934 = k_1145.value;
              c_934 = transformer_debug.const370;
              h_934 = g_934;
              d_934 = transformer_debug.const377;
              i_934 = h_934;
              e_934 = transformer_debug.const238;
              j_934 = i_934;
              term = s_var_0_4.instance.invoke(context, j_934, c_934, d_934, e_934, transformer_debug.constLocationInfo671);
              if(term == null)
                break Fail494;
              if(l_1145.value == null)
                break Fail494;
              o_934 = l_1145.value;
              k_934 = transformer_debug.const370;
              p_934 = o_934;
              l_934 = transformer_debug.const377;
              s_934 = p_934;
              m_934 = transformer_debug.const239;
              t_934 = s_934;
              term = s_var_0_4.instance.invoke(context, t_934, k_934, l_934, m_934, transformer_debug.constLocationInfo672);
              if(term == null)
                break Fail494;
              u_934 = b_934;
              b_935 = p_933;
              x_934 = transformer_debug.const370;
              c_935 = b_935;
              y_934 = transformer_debug.const377;
              d_935 = c_935;
              z_934 = transformer_debug.const277;
              e_935 = d_935;
              term = s_var_0_4.instance.invoke(context, e_935, x_934, y_934, z_934, transformer_debug.constLocationInfo673);
              if(term == null)
                break Fail494;
              l_935 = n_933;
              f_935 = transformer_debug.const370;
              m_935 = l_935;
              g_935 = transformer_debug.const377;
              n_935 = m_935;
              h_935 = transformer_debug.const381;
              o_935 = n_935;
              term = s_var_0_4.instance.invoke(context, o_935, f_935, g_935, h_935, transformer_debug.constLocationInfo674);
              if(term == null)
                break Fail494;
              term = u_934;
              p_935 = u_934;
              IStrategoTerm term217 = term;
              Success246:
              { 
                Fail495:
                { 
                  IStrategoTerm q_935 = null;
                  IStrategoTerm r_935 = null;
                  IStrategoTerm t_935 = null;
                  IStrategoTerm u_935 = null;
                  IStrategoTerm v_935 = null;
                  IStrategoTerm w_935 = null;
                  IStrategoTerm a_936 = null;
                  IStrategoTerm b_936 = null;
                  IStrategoTerm d_936 = null;
                  IStrategoTerm e_936 = null;
                  IStrategoTerm f_936 = null;
                  IStrategoTerm g_936 = null;
                  IStrategoTerm h_936 = null;
                  IStrategoTerm i_936 = null;
                  IStrategoTerm l_936 = null;
                  IStrategoTerm m_936 = null;
                  IStrategoTerm q_936 = null;
                  IStrategoTerm r_936 = null;
                  IStrategoTerm t_936 = null;
                  IStrategoTerm u_936 = null;
                  IStrategoTerm w_936 = null;
                  IStrategoTerm x_936 = null;
                  IStrategoTerm y_936 = null;
                  IStrategoTerm a_937 = null;
                  IStrategoTerm b_937 = null;
                  IStrategoTerm c_937 = null;
                  IStrategoTerm e_937 = null;
                  IStrategoTerm f_937 = null;
                  IStrategoTerm g_937 = null;
                  IStrategoTerm h_937 = null;
                  t_935 = term;
                  q_935 = transformer_debug.const370;
                  u_935 = t_935;
                  r_935 = transformer_debug.const377;
                  v_935 = u_935;
                  term = s_step_0_3.instance.invoke(context, v_935, q_935, r_935, transformer_debug.constLocationInfo675);
                  if(term == null)
                    break Fail495;
                  d_936 = term;
                  a_936 = transformer_debug.const370;
                  e_936 = d_936;
                  b_936 = transformer_debug.const377;
                  f_936 = e_936;
                  term = s_step_0_3.instance.invoke(context, f_936, a_936, b_936, transformer_debug.constLocationInfo676);
                  if(term == null)
                    break Fail495;
                  term = create_step_call_0_3.instance.invoke(context, term, k_1145.value, l_1145.value, n_933);
                  if(term == null)
                    break Fail495;
                  w_935 = term;
                  o_933 = term;
                  l_936 = w_935;
                  g_936 = transformer_debug.const370;
                  m_936 = l_936;
                  h_936 = transformer_debug.const377;
                  q_936 = m_936;
                  i_936 = transformer_debug.const383;
                  r_936 = q_936;
                  term = s_var_0_4.instance.invoke(context, r_936, g_936, h_936, i_936, transformer_debug.constLocationInfo677);
                  if(term == null)
                    break Fail495;
                  w_936 = term;
                  t_936 = transformer_debug.const370;
                  x_936 = w_936;
                  u_936 = transformer_debug.const377;
                  y_936 = x_936;
                  term = s_step_0_3.instance.invoke(context, y_936, t_936, u_936, transformer_debug.constLocationInfo678);
                  if(term == null)
                    break Fail495;
                  term = termFactory.makeAppl(transformer_debug._consSeq_2, new IStrategoTerm[]{o_933, p_933});
                  q_933 = term;
                  e_937 = term;
                  a_937 = transformer_debug.const370;
                  f_937 = e_937;
                  b_937 = transformer_debug.const377;
                  g_937 = f_937;
                  c_937 = transformer_debug.const294;
                  h_937 = g_937;
                  term = s_var_0_4.instance.invoke(context, h_937, a_937, b_937, c_937, transformer_debug.constLocationInfo679);
                  if(term == null)
                    break Fail495;
                  if(true)
                    break Success246;
                }
                term = term217;
                IStrategoTerm r_933 = null;
                IStrategoTerm s_933 = null;
                IStrategoTerm j_937 = null;
                r_933 = term;
                term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
                if(term == null)
                  break Fail494;
                s_933 = term;
                j_937 = r_933;
                term = report_with_failure_0_2.instance.invoke(context, j_937, transformer_debug.const384, s_933);
                if(term == null)
                  break Fail494;
              }
              term = p_935;
              IStrategoTerm l_937 = null;
              IStrategoTerm m_937 = null;
              IStrategoTerm o_937 = null;
              IStrategoTerm p_937 = null;
              IStrategoTerm q_937 = null;
              if(q_933 == null)
                break Fail494;
              o_937 = q_933;
              l_937 = transformer_debug.const370;
              p_937 = o_937;
              m_937 = transformer_debug.const377;
              q_937 = p_937;
              term = r_exit_0_3.instance.invoke(context, q_937, l_937, m_937, transformer_debug.constLocationInfo670);
              if(term == null)
                break Fail494;
              if(true)
                break Success245;
            }
            term = term214;
          }
          add_step_to_strategy_0_2_fragment_10 add_step_to_strategy_0_2_fragment_100 = new add_step_to_strategy_0_2_fragment_10();
          add_step_to_strategy_0_2_fragment_100.k_1145 = k_1145;
          add_step_to_strategy_0_2_fragment_100.l_1145 = l_1145;
          term = add_step_to_strategy_0_2_fragment_100.invoke(context, term);
          if(term == null)
            break Fail491;
        }
      }
      if(true)
        return term;
    }
    return null;
  }
}