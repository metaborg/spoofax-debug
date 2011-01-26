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

@SuppressWarnings("all") final class add_rule_cond_0_3_fragment_0 extends Strategy 
{ 
  TermReference r_1145;

  TermReference s_1145;

  TermReference t_1145;

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail452:
    { 
      IStrategoTerm term278 = term;
      Success217:
      { 
        Fail453:
        { 
          IStrategoTerm b_1023 = null;
          IStrategoTerm c_1023 = null;
          IStrategoTerm d_1023 = null;
          IStrategoTerm e_1023 = null;
          IStrategoTerm f_1023 = null;
          IStrategoTerm h_1023 = null;
          IStrategoTerm i_1023 = null;
          IStrategoTerm j_1023 = null;
          IStrategoTerm l_1023 = null;
          IStrategoTerm m_1023 = null;
          IStrategoTerm n_1023 = null;
          IStrategoTerm p_1023 = null;
          IStrategoTerm q_1023 = null;
          IStrategoTerm r_1023 = null;
          IStrategoTerm s_1023 = null;
          IStrategoTerm t_1023 = null;
          IStrategoTerm u_1023 = null;
          IStrategoTerm v_1023 = null;
          IStrategoTerm x_1023 = null;
          IStrategoTerm y_1023 = null;
          IStrategoTerm z_1023 = null;
          IStrategoTerm a_1024 = null;
          IStrategoTerm b_1024 = null;
          IStrategoTerm c_1024 = null;
          IStrategoTerm d_1024 = null;
          IStrategoTerm f_1024 = null;
          IStrategoTerm g_1024 = null;
          IStrategoTerm h_1024 = null;
          IStrategoTerm i_1024 = null;
          IStrategoTerm k_1024 = null;
          IStrategoTerm l_1024 = null;
          IStrategoTerm m_1024 = null;
          IStrategoTerm o_1024 = null;
          IStrategoTerm p_1024 = null;
          IStrategoTerm q_1024 = null;
          IStrategoTerm r_1024 = null;
          IStrategoTerm t_1024 = null;
          IStrategoTerm u_1024 = null;
          IStrategoTerm w_1024 = null;
          IStrategoTerm x_1024 = null;
          IStrategoTerm y_1024 = null;
          IStrategoTerm z_1024 = null;
          IStrategoTerm a_1025 = null;
          IStrategoTerm c_1025 = null;
          IStrategoTerm d_1025 = null;
          IStrategoTerm e_1025 = null;
          IStrategoTerm h_1025 = null;
          IStrategoTerm i_1025 = null;
          IStrategoTerm k_1025 = null;
          IStrategoTerm l_1025 = null;
          IStrategoTerm m_1025 = null;
          IStrategoTerm n_1025 = null;
          IStrategoTerm o_1025 = null;
          IStrategoTerm q_1025 = null;
          IStrategoTerm r_1025 = null;
          IStrategoTerm s_1025 = null;
          IStrategoTerm t_1025 = null;
          IStrategoTerm u_1025 = null;
          IStrategoTerm v_1025 = null;
          IStrategoTerm x_1025 = null;
          IStrategoTerm y_1025 = null;
          IStrategoTerm z_1025 = null;
          IStrategoTerm a_1026 = null;
          b_1023 = term;
          d_1023 = term;
          h_1023 = term;
          e_1023 = transformer_debug.const513;
          i_1023 = h_1023;
          f_1023 = transformer_debug.const537;
          j_1023 = i_1023;
          term = r_enter_0_3.instance.invoke(context, j_1023, e_1023, f_1023, transformer_debug.constLocationInfo1024);
          if(term == null)
            break Fail453;
          term = d_1023;
          if(r_1145.value == null)
            break Fail453;
          p_1023 = r_1145.value;
          l_1023 = transformer_debug.const513;
          q_1023 = p_1023;
          m_1023 = transformer_debug.const537;
          r_1023 = q_1023;
          n_1023 = transformer_debug.const238;
          s_1023 = r_1023;
          term = s_var_0_4.instance.invoke(context, s_1023, l_1023, m_1023, n_1023, transformer_debug.constLocationInfo1025);
          if(term == null)
            break Fail453;
          if(s_1145.value == null)
            break Fail453;
          x_1023 = s_1145.value;
          t_1023 = transformer_debug.const513;
          y_1023 = x_1023;
          u_1023 = transformer_debug.const537;
          z_1023 = y_1023;
          v_1023 = transformer_debug.const287;
          a_1024 = z_1023;
          term = s_var_0_4.instance.invoke(context, a_1024, t_1023, u_1023, v_1023, transformer_debug.constLocationInfo1026);
          if(term == null)
            break Fail453;
          if(t_1145.value == null)
            break Fail453;
          f_1024 = t_1145.value;
          b_1024 = transformer_debug.const513;
          g_1024 = f_1024;
          c_1024 = transformer_debug.const537;
          h_1024 = g_1024;
          d_1024 = transformer_debug.const235;
          i_1024 = h_1024;
          term = s_var_0_4.instance.invoke(context, i_1024, b_1024, c_1024, d_1024, transformer_debug.constLocationInfo1027);
          if(term == null)
            break Fail453;
          o_1024 = b_1023;
          k_1024 = transformer_debug.const513;
          p_1024 = o_1024;
          l_1024 = transformer_debug.const537;
          q_1024 = p_1024;
          m_1024 = transformer_debug.const323;
          r_1024 = q_1024;
          term = s_var_0_4.instance.invoke(context, r_1024, k_1024, l_1024, m_1024, transformer_debug.constLocationInfo1028);
          if(term == null)
            break Fail453;
          w_1024 = b_1023;
          t_1024 = transformer_debug.const513;
          x_1024 = w_1024;
          u_1024 = transformer_debug.const537;
          y_1024 = x_1024;
          term = s_step_0_3.instance.invoke(context, y_1024, t_1024, u_1024, transformer_debug.constLocationInfo1029);
          if(term == null)
            break Fail453;
          term = is_list_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail453;
          c_1025 = term;
          z_1024 = transformer_debug.const513;
          d_1025 = c_1025;
          a_1025 = transformer_debug.const537;
          e_1025 = d_1025;
          term = s_step_0_3.instance.invoke(context, e_1025, z_1024, a_1025, transformer_debug.constLocationInfo1030);
          if(term == null)
            break Fail453;
          k_1025 = term;
          h_1025 = transformer_debug.const513;
          l_1025 = k_1025;
          i_1025 = transformer_debug.const537;
          m_1025 = l_1025;
          term = s_step_0_3.instance.invoke(context, m_1025, h_1025, i_1025, transformer_debug.constLocationInfo1031);
          if(term == null)
            break Fail453;
          term = create_r_enter_whereclause_0_3.instance.invoke(context, term, r_1145.value, s_1145.value, t_1145.value);
          if(term == null)
            break Fail453;
          term = termFactory.makeTuple(transformer_debug.const281, term, b_1023);
          q_1025 = term;
          n_1025 = transformer_debug.const513;
          r_1025 = q_1025;
          o_1025 = transformer_debug.const537;
          s_1025 = r_1025;
          term = s_step_0_3.instance.invoke(context, s_1025, n_1025, o_1025, transformer_debug.constLocationInfo1032);
          if(term == null)
            break Fail453;
          term = insert_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail453;
          c_1023 = term;
          x_1025 = term;
          t_1025 = transformer_debug.const513;
          y_1025 = x_1025;
          u_1025 = transformer_debug.const537;
          z_1025 = y_1025;
          v_1025 = transformer_debug.const326;
          a_1026 = z_1025;
          term = s_var_0_4.instance.invoke(context, a_1026, t_1025, u_1025, v_1025, transformer_debug.constLocationInfo1033);
          if(term == null)
            break Fail453;
          IStrategoTerm b_1026 = null;
          IStrategoTerm c_1026 = null;
          IStrategoTerm e_1026 = null;
          IStrategoTerm f_1026 = null;
          IStrategoTerm g_1026 = null;
          e_1026 = c_1023;
          b_1026 = transformer_debug.const513;
          f_1026 = e_1026;
          c_1026 = transformer_debug.const537;
          g_1026 = f_1026;
          term = r_exit_0_3.instance.invoke(context, g_1026, b_1026, c_1026, transformer_debug.constLocationInfo1024);
          if(term == null)
            break Fail453;
          if(true)
            break Success217;
        }
        term = term278;
        IStrategoTerm r_1019 = null;
        IStrategoTerm s_1019 = null;
        IStrategoTerm t_1019 = null;
        IStrategoTerm u_1019 = null;
        IStrategoTerm v_1019 = null;
        IStrategoTerm x_1019 = null;
        IStrategoTerm y_1019 = null;
        IStrategoTerm z_1019 = null;
        IStrategoTerm a_1020 = null;
        IStrategoTerm b_1020 = null;
        IStrategoTerm c_1020 = null;
        IStrategoTerm d_1020 = null;
        IStrategoTerm f_1020 = null;
        IStrategoTerm g_1020 = null;
        IStrategoTerm h_1020 = null;
        IStrategoTerm i_1020 = null;
        IStrategoTerm j_1020 = null;
        IStrategoTerm k_1020 = null;
        IStrategoTerm l_1020 = null;
        IStrategoTerm n_1020 = null;
        IStrategoTerm o_1020 = null;
        IStrategoTerm p_1020 = null;
        IStrategoTerm q_1020 = null;
        IStrategoTerm r_1020 = null;
        IStrategoTerm s_1020 = null;
        IStrategoTerm t_1020 = null;
        IStrategoTerm v_1020 = null;
        IStrategoTerm w_1020 = null;
        IStrategoTerm x_1020 = null;
        IStrategoTerm y_1020 = null;
        IStrategoTerm z_1020 = null;
        IStrategoTerm a_1021 = null;
        IStrategoTerm b_1021 = null;
        IStrategoTerm c_1021 = null;
        IStrategoTerm e_1021 = null;
        IStrategoTerm f_1021 = null;
        IStrategoTerm g_1021 = null;
        IStrategoTerm h_1021 = null;
        IStrategoTerm i_1021 = null;
        IStrategoTerm j_1021 = null;
        IStrategoTerm k_1021 = null;
        IStrategoTerm m_1021 = null;
        IStrategoTerm n_1021 = null;
        IStrategoTerm o_1021 = null;
        IStrategoTerm w_1021 = null;
        IStrategoTerm x_1021 = null;
        IStrategoTerm z_1021 = null;
        IStrategoTerm a_1022 = null;
        IStrategoTerm b_1022 = null;
        IStrategoTerm e_1022 = null;
        IStrategoTerm f_1022 = null;
        IStrategoTerm h_1022 = null;
        IStrategoTerm i_1022 = null;
        IStrategoTerm j_1022 = null;
        IStrategoTerm k_1022 = null;
        IStrategoTerm l_1022 = null;
        IStrategoTerm m_1022 = null;
        IStrategoTerm o_1022 = null;
        IStrategoTerm p_1022 = null;
        IStrategoTerm q_1022 = null;
        IStrategoTerm r_1022 = null;
        r_1019 = term;
        t_1019 = term;
        x_1019 = term;
        u_1019 = transformer_debug.const513;
        y_1019 = x_1019;
        v_1019 = transformer_debug.const537;
        z_1019 = y_1019;
        term = r_enter_0_3.instance.invoke(context, z_1019, u_1019, v_1019, transformer_debug.constLocationInfo1034);
        if(term == null)
          break Fail452;
        term = t_1019;
        a_1020 = t_1019;
        if(r_1145.value == null)
          break Fail452;
        f_1020 = r_1145.value;
        b_1020 = transformer_debug.const513;
        g_1020 = f_1020;
        c_1020 = transformer_debug.const537;
        h_1020 = g_1020;
        d_1020 = transformer_debug.const238;
        i_1020 = h_1020;
        term = s_var_0_4.instance.invoke(context, i_1020, b_1020, c_1020, d_1020, transformer_debug.constLocationInfo1035);
        if(term == null)
          break Fail452;
        if(s_1145.value == null)
          break Fail452;
        n_1020 = s_1145.value;
        j_1020 = transformer_debug.const513;
        o_1020 = n_1020;
        k_1020 = transformer_debug.const537;
        p_1020 = o_1020;
        l_1020 = transformer_debug.const287;
        q_1020 = p_1020;
        term = s_var_0_4.instance.invoke(context, q_1020, j_1020, k_1020, l_1020, transformer_debug.constLocationInfo1036);
        if(term == null)
          break Fail452;
        if(t_1145.value == null)
          break Fail452;
        v_1020 = t_1145.value;
        r_1020 = transformer_debug.const513;
        w_1020 = v_1020;
        s_1020 = transformer_debug.const537;
        x_1020 = w_1020;
        t_1020 = transformer_debug.const235;
        y_1020 = x_1020;
        term = s_var_0_4.instance.invoke(context, y_1020, r_1020, s_1020, t_1020, transformer_debug.constLocationInfo1037);
        if(term == null)
          break Fail452;
        z_1020 = a_1020;
        e_1021 = r_1019;
        a_1021 = transformer_debug.const513;
        f_1021 = e_1021;
        b_1021 = transformer_debug.const537;
        g_1021 = f_1021;
        c_1021 = transformer_debug.const277;
        h_1021 = g_1021;
        term = s_var_0_4.instance.invoke(context, h_1021, a_1021, b_1021, c_1021, transformer_debug.constLocationInfo1038);
        if(term == null)
          break Fail452;
        term = z_1020;
        i_1021 = z_1020;
        m_1021 = term;
        j_1021 = transformer_debug.const513;
        n_1021 = m_1021;
        k_1021 = transformer_debug.const537;
        o_1021 = n_1021;
        term = s_step_0_3.instance.invoke(context, o_1021, j_1021, k_1021, transformer_debug.constLocationInfo1039);
        if(term == null)
          break Fail452;
        IStrategoTerm term279 = term;
        Success218:
        { 
          Fail454:
          { 
            IStrategoTerm p_1021 = null;
            IStrategoTerm q_1021 = null;
            IStrategoTerm s_1021 = null;
            IStrategoTerm t_1021 = null;
            IStrategoTerm u_1021 = null;
            s_1021 = r_1019;
            p_1021 = transformer_debug.const513;
            t_1021 = s_1021;
            q_1021 = transformer_debug.const537;
            u_1021 = t_1021;
            term = s_step_0_3.instance.invoke(context, u_1021, p_1021, q_1021, transformer_debug.constLocationInfo1040);
            if(term == null)
              break Fail454;
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail454;
            { 
              if(true)
                break Fail452;
              if(true)
                break Success218;
            }
          }
          term = term279;
        }
        term = i_1021;
        z_1021 = term;
        w_1021 = transformer_debug.const513;
        a_1022 = z_1021;
        x_1021 = transformer_debug.const537;
        b_1022 = a_1022;
        term = s_step_0_3.instance.invoke(context, b_1022, w_1021, x_1021, transformer_debug.constLocationInfo1041);
        if(term == null)
          break Fail452;
        h_1022 = term;
        e_1022 = transformer_debug.const513;
        i_1022 = h_1022;
        f_1022 = transformer_debug.const537;
        j_1022 = i_1022;
        term = s_step_0_3.instance.invoke(context, j_1022, e_1022, f_1022, transformer_debug.constLocationInfo1042);
        if(term == null)
          break Fail452;
        term = create_r_enter_whereclause_0_3.instance.invoke(context, term, r_1145.value, s_1145.value, t_1145.value);
        if(term == null)
          break Fail452;
        term = (IStrategoTerm)termFactory.makeListCons(term, termFactory.makeListCons(termFactory.makeAppl(transformer_debug._consWhereClause_1, new IStrategoTerm[]{r_1019}), (IStrategoList)transformer_debug.constNil1));
        s_1019 = term;
        o_1022 = term;
        k_1022 = transformer_debug.const513;
        p_1022 = o_1022;
        l_1022 = transformer_debug.const537;
        q_1022 = p_1022;
        m_1022 = transformer_debug.const323;
        r_1022 = q_1022;
        term = s_var_0_4.instance.invoke(context, r_1022, k_1022, l_1022, m_1022, transformer_debug.constLocationInfo1043);
        if(term == null)
          break Fail452;
        IStrategoTerm s_1022 = null;
        IStrategoTerm t_1022 = null;
        IStrategoTerm v_1022 = null;
        IStrategoTerm w_1022 = null;
        IStrategoTerm x_1022 = null;
        v_1022 = s_1019;
        s_1022 = transformer_debug.const513;
        w_1022 = v_1022;
        t_1022 = transformer_debug.const537;
        x_1022 = w_1022;
        term = r_exit_0_3.instance.invoke(context, x_1022, s_1022, t_1022, transformer_debug.constLocationInfo1034);
        if(term == null)
          break Fail452;
      }
      if(true)
        return term;
    }
    return null;
  }
}